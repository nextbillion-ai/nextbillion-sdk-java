// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking.skynet

import com.google.errorprone.annotations.MustBeClosed
import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.skynet.asset.SimpleResp
import com.nextbillion_sdk.api.models.skynet.config.ConfigRetrieveParams
import com.nextbillion_sdk.api.models.skynet.config.ConfigRetrieveResponse
import com.nextbillion_sdk.api.models.skynet.config.ConfigTestWebhookParams
import com.nextbillion_sdk.api.models.skynet.config.ConfigTestWebhookResponse
import com.nextbillion_sdk.api.models.skynet.config.ConfigUpdateParams
import java.util.function.Consumer

interface ConfigService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigService

    /** Get webhook configuration */
    fun retrieve(params: ConfigRetrieveParams): ConfigRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigRetrieveResponse

    /** Update webhook configuration */
    fun update(params: ConfigUpdateParams): SimpleResp = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimpleResp

    /** Test webhook configurations */
    fun testWebhook(params: ConfigTestWebhookParams): ConfigTestWebhookResponse =
        testWebhook(params, RequestOptions.none())

    /** @see testWebhook */
    fun testWebhook(
        params: ConfigTestWebhookParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigTestWebhookResponse

    /** A view of [ConfigService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /skynet/config`, but is otherwise the same as
         * [ConfigService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ConfigRetrieveParams): HttpResponseFor<ConfigRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ConfigRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /skynet/config`, but is otherwise the same as
         * [ConfigService.update].
         */
        @MustBeClosed
        fun update(params: ConfigUpdateParams): HttpResponseFor<SimpleResp> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimpleResp>

        /**
         * Returns a raw HTTP response for `post /skynet/config/testwebhook`, but is otherwise the
         * same as [ConfigService.testWebhook].
         */
        @MustBeClosed
        fun testWebhook(
            params: ConfigTestWebhookParams
        ): HttpResponseFor<ConfigTestWebhookResponse> = testWebhook(params, RequestOptions.none())

        /** @see testWebhook */
        @MustBeClosed
        fun testWebhook(
            params: ConfigTestWebhookParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigTestWebhookResponse>
    }
}
