// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async.skynet

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.skynet.namespacedapikeys.NamespacedApikeyCreateParams
import com.nextbillion_sdk.api.models.skynet.namespacedapikeys.NamespacedApikeyCreateResponse
import com.nextbillion_sdk.api.models.skynet.namespacedapikeys.NamespacedApikeyDeleteParams
import com.nextbillion_sdk.api.models.skynet.namespacedapikeys.NamespacedApikeyDeleteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NamespacedApikeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamespacedApikeyServiceAsync

    /** Create namespace under a parent key */
    fun create(
        params: NamespacedApikeyCreateParams
    ): CompletableFuture<NamespacedApikeyCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NamespacedApikeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NamespacedApikeyCreateResponse>

    /** Delete namespace under a parent key */
    fun delete(
        params: NamespacedApikeyDeleteParams
    ): CompletableFuture<NamespacedApikeyDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NamespacedApikeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NamespacedApikeyDeleteResponse>

    /**
     * A view of [NamespacedApikeyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NamespacedApikeyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /skynet/namespaced-apikeys`, but is otherwise the
         * same as [NamespacedApikeyServiceAsync.create].
         */
        fun create(
            params: NamespacedApikeyCreateParams
        ): CompletableFuture<HttpResponseFor<NamespacedApikeyCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: NamespacedApikeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NamespacedApikeyCreateResponse>>

        /**
         * Returns a raw HTTP response for `delete /skynet/namespaced-apikeys`, but is otherwise the
         * same as [NamespacedApikeyServiceAsync.delete].
         */
        fun delete(
            params: NamespacedApikeyDeleteParams
        ): CompletableFuture<HttpResponseFor<NamespacedApikeyDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: NamespacedApikeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NamespacedApikeyDeleteResponse>>
    }
}
