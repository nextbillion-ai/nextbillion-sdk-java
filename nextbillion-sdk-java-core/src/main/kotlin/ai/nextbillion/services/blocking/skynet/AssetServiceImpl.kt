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
import ai.nextbillion.models.skynet.asset.AssetBindParams
import ai.nextbillion.models.skynet.asset.AssetCreateParams
import ai.nextbillion.models.skynet.asset.AssetCreateResponse
import ai.nextbillion.models.skynet.asset.AssetDeleteParams
import ai.nextbillion.models.skynet.asset.AssetListParams
import ai.nextbillion.models.skynet.asset.AssetListResponse
import ai.nextbillion.models.skynet.asset.AssetRetrieveParams
import ai.nextbillion.models.skynet.asset.AssetRetrieveResponse
import ai.nextbillion.models.skynet.asset.AssetTrackParams
import ai.nextbillion.models.skynet.asset.AssetUpdateAttributesParams
import ai.nextbillion.models.skynet.asset.AssetUpdateParams
import ai.nextbillion.models.skynet.asset.SimpleResp
import ai.nextbillion.services.blocking.skynet.asset.EventService
import ai.nextbillion.services.blocking.skynet.asset.EventServiceImpl
import ai.nextbillion.services.blocking.skynet.asset.LocationService
import ai.nextbillion.services.blocking.skynet.asset.LocationServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AssetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AssetService {

    private val withRawResponse: AssetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val event: EventService by lazy { EventServiceImpl(clientOptions) }

    private val location: LocationService by lazy { LocationServiceImpl(clientOptions) }

    override fun withRawResponse(): AssetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssetService =
        AssetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun event(): EventService = event

    override fun location(): LocationService = location

    override fun create(
        params: AssetCreateParams,
        requestOptions: RequestOptions,
    ): AssetCreateResponse =
        // post /skynet/asset
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AssetRetrieveParams,
        requestOptions: RequestOptions,
    ): AssetRetrieveResponse =
        // get /skynet/asset/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: AssetUpdateParams, requestOptions: RequestOptions): SimpleResp =
        // put /skynet/asset/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: AssetListParams, requestOptions: RequestOptions): AssetListResponse =
        // get /skynet/asset/list
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AssetDeleteParams, requestOptions: RequestOptions): SimpleResp =
        // delete /skynet/asset/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun bind(params: AssetBindParams, requestOptions: RequestOptions): SimpleResp =
        // post /skynet/asset/{id}/bind
        withRawResponse().bind(params, requestOptions).parse()

    override fun track(params: AssetTrackParams, requestOptions: RequestOptions): SimpleResp =
        // post /skynet/asset/{id}/track
        withRawResponse().track(params, requestOptions).parse()

    override fun updateAttributes(
        params: AssetUpdateAttributesParams,
        requestOptions: RequestOptions,
    ): SimpleResp =
        // put /skynet/asset/{id}/attributes
        withRawResponse().updateAttributes(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val event: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val location: LocationService.WithRawResponse by lazy {
            LocationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssetService.WithRawResponse =
            AssetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun event(): EventService.WithRawResponse = event

        override fun location(): LocationService.WithRawResponse = location

        private val createHandler: Handler<AssetCreateResponse> =
            jsonHandler<AssetCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AssetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssetCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset")
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

        private val retrieveHandler: Handler<AssetRetrieveResponse> =
            jsonHandler<AssetRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AssetRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssetRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0))
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
            params: AssetUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimpleResp> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0))
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

        private val listHandler: Handler<AssetListResponse> =
            jsonHandler<AssetListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AssetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssetListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", "list")
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
            params: AssetDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimpleResp> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0))
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

        private val bindHandler: Handler<SimpleResp> =
            jsonHandler<SimpleResp>(clientOptions.jsonMapper)

        override fun bind(
            params: AssetBindParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimpleResp> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0), "bind")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { bindHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val trackHandler: Handler<SimpleResp> =
            jsonHandler<SimpleResp>(clientOptions.jsonMapper)

        override fun track(
            params: AssetTrackParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimpleResp> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0), "track")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { trackHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateAttributesHandler: Handler<SimpleResp> =
            jsonHandler<SimpleResp>(clientOptions.jsonMapper)

        override fun updateAttributes(
            params: AssetUpdateAttributesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimpleResp> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "asset", params._pathParam(0), "attributes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateAttributesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
