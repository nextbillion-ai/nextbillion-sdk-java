// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.handlers.errorBodyHandler
import ai.nextbillion.core.handlers.errorHandler
import ai.nextbillion.core.handlers.jsonHandler
import ai.nextbillion.core.http.HttpMethod
import ai.nextbillion.core.http.HttpRequest
import ai.nextbillion.core.http.HttpResponse
import ai.nextbillion.core.http.HttpResponse.Handler
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.core.http.parseable
import ai.nextbillion.core.prepare
import ai.nextbillion.models.isochrone.IsochroneComputeParams
import ai.nextbillion.models.isochrone.IsochroneComputeResponse
import java.util.function.Consumer

class IsochroneServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IsochroneService {

    private val withRawResponse: IsochroneService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IsochroneService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IsochroneService =
        IsochroneServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun compute(
        params: IsochroneComputeParams,
        requestOptions: RequestOptions,
    ): IsochroneComputeResponse =
        // get /isochrone/json
        withRawResponse().compute(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IsochroneService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IsochroneService.WithRawResponse =
            IsochroneServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val computeHandler: Handler<IsochroneComputeResponse> =
            jsonHandler<IsochroneComputeResponse>(clientOptions.jsonMapper)

        override fun compute(
            params: IsochroneComputeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IsochroneComputeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("isochrone", "json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { computeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
