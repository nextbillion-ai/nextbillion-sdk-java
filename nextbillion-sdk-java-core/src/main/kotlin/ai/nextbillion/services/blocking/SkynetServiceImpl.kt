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
import ai.nextbillion.core.http.json
import ai.nextbillion.core.http.parseable
import ai.nextbillion.core.prepare
import ai.nextbillion.models.skynet.SkynetSubscribeParams
import ai.nextbillion.models.skynet.SkynetSubscribeResponse
import ai.nextbillion.services.blocking.skynet.AssetService
import ai.nextbillion.services.blocking.skynet.AssetServiceImpl
import ai.nextbillion.services.blocking.skynet.ConfigService
import ai.nextbillion.services.blocking.skynet.ConfigServiceImpl
import ai.nextbillion.services.blocking.skynet.MonitorService
import ai.nextbillion.services.blocking.skynet.MonitorServiceImpl
import ai.nextbillion.services.blocking.skynet.NamespacedApikeyService
import ai.nextbillion.services.blocking.skynet.NamespacedApikeyServiceImpl
import ai.nextbillion.services.blocking.skynet.SearchService
import ai.nextbillion.services.blocking.skynet.SearchServiceImpl
import ai.nextbillion.services.blocking.skynet.TripService
import ai.nextbillion.services.blocking.skynet.TripServiceImpl
import java.util.function.Consumer

class SkynetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SkynetService {

    private val withRawResponse: SkynetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val asset: AssetService by lazy { AssetServiceImpl(clientOptions) }

    private val monitor: MonitorService by lazy { MonitorServiceImpl(clientOptions) }

    private val trip: TripService by lazy { TripServiceImpl(clientOptions) }

    private val namespacedApikeys: NamespacedApikeyService by lazy {
        NamespacedApikeyServiceImpl(clientOptions)
    }

    private val config: ConfigService by lazy { ConfigServiceImpl(clientOptions) }

    private val search: SearchService by lazy { SearchServiceImpl(clientOptions) }

    override fun withRawResponse(): SkynetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkynetService =
        SkynetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun asset(): AssetService = asset

    override fun monitor(): MonitorService = monitor

    override fun trip(): TripService = trip

    override fun namespacedApikeys(): NamespacedApikeyService = namespacedApikeys

    override fun config(): ConfigService = config

    override fun search(): SearchService = search

    override fun subscribe(
        params: SkynetSubscribeParams,
        requestOptions: RequestOptions,
    ): SkynetSubscribeResponse =
        // post /skynet/subscribe
        withRawResponse().subscribe(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SkynetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val asset: AssetService.WithRawResponse by lazy {
            AssetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val monitor: MonitorService.WithRawResponse by lazy {
            MonitorServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val trip: TripService.WithRawResponse by lazy {
            TripServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val namespacedApikeys: NamespacedApikeyService.WithRawResponse by lazy {
            NamespacedApikeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val config: ConfigService.WithRawResponse by lazy {
            ConfigServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val search: SearchService.WithRawResponse by lazy {
            SearchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SkynetService.WithRawResponse =
            SkynetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun asset(): AssetService.WithRawResponse = asset

        override fun monitor(): MonitorService.WithRawResponse = monitor

        override fun trip(): TripService.WithRawResponse = trip

        override fun namespacedApikeys(): NamespacedApikeyService.WithRawResponse =
            namespacedApikeys

        override fun config(): ConfigService.WithRawResponse = config

        override fun search(): SearchService.WithRawResponse = search

        private val subscribeHandler: Handler<SkynetSubscribeResponse> =
            jsonHandler<SkynetSubscribeResponse>(clientOptions.jsonMapper)

        override fun subscribe(
            params: SkynetSubscribeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SkynetSubscribeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skynet", "subscribe")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { subscribeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
