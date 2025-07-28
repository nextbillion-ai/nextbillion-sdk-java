// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking.skynet

import com.google.errorprone.annotations.MustBeClosed
import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.core.RequestOptions
import io.nextbillion.api.core.http.HttpResponseFor
import io.nextbillion.api.models.skynet.namespacedapikeys.NamespacedApikeyCreateParams
import io.nextbillion.api.models.skynet.namespacedapikeys.NamespacedApikeyCreateResponse
import io.nextbillion.api.models.skynet.namespacedapikeys.NamespacedApikeyDeleteParams
import io.nextbillion.api.models.skynet.namespacedapikeys.NamespacedApikeyDeleteResponse
import java.util.function.Consumer

interface NamespacedApikeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamespacedApikeyService

    /** Create namespace under a parent key */
    fun create(params: NamespacedApikeyCreateParams): NamespacedApikeyCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NamespacedApikeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NamespacedApikeyCreateResponse

    /** Delete namespace under a parent key */
    fun delete(params: NamespacedApikeyDeleteParams): NamespacedApikeyDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NamespacedApikeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NamespacedApikeyDeleteResponse

    /**
     * A view of [NamespacedApikeyService] that provides access to raw HTTP responses for each
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
        ): NamespacedApikeyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /skynet/namespaced-apikeys`, but is otherwise the
         * same as [NamespacedApikeyService.create].
         */
        @MustBeClosed
        fun create(
            params: NamespacedApikeyCreateParams
        ): HttpResponseFor<NamespacedApikeyCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NamespacedApikeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NamespacedApikeyCreateResponse>

        /**
         * Returns a raw HTTP response for `delete /skynet/namespaced-apikeys`, but is otherwise the
         * same as [NamespacedApikeyService.delete].
         */
        @MustBeClosed
        fun delete(
            params: NamespacedApikeyDeleteParams
        ): HttpResponseFor<NamespacedApikeyDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NamespacedApikeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NamespacedApikeyDeleteResponse>
    }
}
