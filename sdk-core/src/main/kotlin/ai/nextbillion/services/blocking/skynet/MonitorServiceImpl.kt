// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.skynet

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.handlers.errorBodyHandler
import ai.nextbillion.core.handlers.errorHandler
import ai.nextbillion.core.handlers.jsonHandler
import ai.nextbillion.core.http.HttpMethod
import ai.nextbillion.core.http.HttpRequest
import ai.nextbillion.core.http.HttpResponse
import ai.nextbillion.core.http.HttpResponse.Handler
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.core.http.json
import ai.nextbillion.core.http.parseable
import ai.nextbillion.core.prepare
import ai.nextbillion.models.skynet.asset.SimpleResp
import ai.nextbillion.models.skynet.monitor.MonitorCreateParams
import ai.nextbillion.models.skynet.monitor.MonitorCreateResponse
import ai.nextbillion.models.skynet.monitor.MonitorDeleteParams
import ai.nextbillion.models.skynet.monitor.MonitorListParams
import ai.nextbillion.models.skynet.monitor.MonitorListResponse
import ai.nextbillion.models.skynet.monitor.MonitorRetrieveParams
import ai.nextbillion.models.skynet.monitor.MonitorRetrieveResponse
import ai.nextbillion.models.skynet.monitor.MonitorUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MonitorServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MonitorService {

    private val withRawResponse: MonitorService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MonitorService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MonitorService =
        MonitorServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: MonitorCreateParams,
        requestOptions: RequestOptions,
    ): MonitorCreateResponse =
        // post /skynet/monitor
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: MonitorRetrieveParams,
        requestOptions: RequestOptions,
    ): MonitorRetrieveResponse =
        // get /skynet/monitor/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: MonitorUpdateParams, requestOptions: RequestOptions): SimpleResp =
        // put /skynet/monitor/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: MonitorListParams,
        requestOptions: RequestOptions,
    ): MonitorListResponse =
        // get /skynet/monitor/list
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: MonitorDeleteParams, requestOptions: RequestOptions): SimpleResp =
        // delete /skynet/monitor/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MonitorService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MonitorService.WithRawResponse =
            MonitorServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<MonitorCreateResponse> =
            jsonHandler<MonitorCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MonitorCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MonitorCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "monitor")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<MonitorRetrieveResponse> =
            jsonHandler<MonitorRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MonitorRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MonitorRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "monitor", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<SimpleResp> =
            jsonHandler<SimpleResp>(clientOptions.jsonMapper)

        override fun update(
            params: MonitorUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimpleResp> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "monitor", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<MonitorListResponse> =
            jsonHandler<MonitorListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MonitorListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MonitorListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "monitor", "list")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<SimpleResp> =
            jsonHandler<SimpleResp>(clientOptions.jsonMapper)

        override fun delete(
            params: MonitorDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimpleResp> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "monitor", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
