// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.skynet

import ai.nextbillion.core.ClientOptions
import ai.nextbillion.core.RequestOptions
import ai.nextbillion.core.http.HttpResponseFor
import ai.nextbillion.models.skynet.asset.SimpleResp
import ai.nextbillion.models.skynet.config.ConfigRetrieveParams
import ai.nextbillion.models.skynet.config.ConfigRetrieveResponse
import ai.nextbillion.models.skynet.config.ConfigTestWebhookParams
import ai.nextbillion.models.skynet.config.ConfigTestWebhookResponse
import ai.nextbillion.models.skynet.config.ConfigUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigServiceAsync

    /** Get webhook configuration */
    fun retrieve(params: ConfigRetrieveParams): CompletableFuture<ConfigRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigRetrieveResponse>

    /** Update webhook configuration */
    fun update(params: ConfigUpdateParams): CompletableFuture<SimpleResp> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimpleResp>

    /** Test webhook configurations */
    fun testWebhook(params: ConfigTestWebhookParams): CompletableFuture<ConfigTestWebhookResponse> =
        testWebhook(params, RequestOptions.none())

    /** @see testWebhook */
    fun testWebhook(
        params: ConfigTestWebhookParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigTestWebhookResponse>

    /**
     * A view of [ConfigServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /skynet/config`, but is otherwise the same as
         * [ConfigServiceAsync.retrieve].
         */
        fun retrieve(
            params: ConfigRetrieveParams
        ): CompletableFuture<HttpResponseFor<ConfigRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ConfigRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /skynet/config`, but is otherwise the same as
         * [ConfigServiceAsync.update].
         */
        fun update(params: ConfigUpdateParams): CompletableFuture<HttpResponseFor<SimpleResp>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimpleResp>>

        /**
         * Returns a raw HTTP response for `post /skynet/config/testwebhook`, but is otherwise the
         * same as [ConfigServiceAsync.testWebhook].
         */
        fun testWebhook(
            params: ConfigTestWebhookParams
        ): CompletableFuture<HttpResponseFor<ConfigTestWebhookResponse>> =
            testWebhook(params, RequestOptions.none())

        /** @see testWebhook */
        fun testWebhook(
            params: ConfigTestWebhookParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigTestWebhookResponse>>
    }
}
