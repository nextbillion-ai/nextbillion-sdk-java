// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async.distancematrix

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponse
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.distancematrix.json.JsonCreateParams
import com.nextbillion_sdk.api.models.distancematrix.json.JsonRetrieveParams
import com.nextbillion_sdk.api.models.distancematrix.json.JsonRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JsonServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JsonServiceAsync

    /** asfd */
    fun create(): CompletableFuture<Void?> = create(JsonCreateParams.none())

    /** @see create */
    fun create(
        params: JsonCreateParams = JsonCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see create */
    fun create(params: JsonCreateParams = JsonCreateParams.none()): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<Void?> =
        create(JsonCreateParams.none(), requestOptions)

    /**
     * Nextbillion.ai Distance Matrix API computes distances and ETAs between a set of origins and
     * destinations — could be for one-to-many or many-to-many scenarios. The API call returns a
     * matrix of ETAs and distances for each origin and destination pair. For example, If the set is
     * Origins {A,B} and Destinations {C,D,E} we can get the following set of results with distance
     * (meters) and time (seconds) for each. The GET method can only handle up to 100 locations (1
     * location is either 1 origin or 1 destination).
     */
    fun retrieve(params: JsonRetrieveParams): CompletableFuture<JsonRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JsonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JsonRetrieveResponse>

    /** A view of [JsonServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JsonServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /distancematrix/json`, but is otherwise the same as
         * [JsonServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponse> = create(JsonCreateParams.none())

        /** @see create */
        fun create(
            params: JsonCreateParams = JsonCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            params: JsonCreateParams = JsonCreateParams.none()
        ): CompletableFuture<HttpResponse> = create(params, RequestOptions.none())

        /** @see create */
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            create(JsonCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /distancematrix/json`, but is otherwise the same as
         * [JsonServiceAsync.retrieve].
         */
        fun retrieve(
            params: JsonRetrieveParams
        ): CompletableFuture<HttpResponseFor<JsonRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: JsonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JsonRetrieveResponse>>
    }
}
