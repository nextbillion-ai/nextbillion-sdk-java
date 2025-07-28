// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking.distancematrix

import com.google.errorprone.annotations.MustBeClosed
import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.core.RequestOptions
import com.nextbillion_sdk.api.core.http.HttpResponse
import com.nextbillion_sdk.api.core.http.HttpResponseFor
import com.nextbillion_sdk.api.models.distancematrix.json.JsonCreateParams
import com.nextbillion_sdk.api.models.distancematrix.json.JsonRetrieveParams
import com.nextbillion_sdk.api.models.distancematrix.json.JsonRetrieveResponse
import java.util.function.Consumer

interface JsonService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JsonService

    /** asfd */
    fun create() = create(JsonCreateParams.none())

    /** @see create */
    fun create(
        params: JsonCreateParams = JsonCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see create */
    fun create(params: JsonCreateParams = JsonCreateParams.none()) =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions) = create(JsonCreateParams.none(), requestOptions)

    /**
     * Nextbillion.ai Distance Matrix API computes distances and ETAs between a set of origins and
     * destinations — could be for one-to-many or many-to-many scenarios. The API call returns a
     * matrix of ETAs and distances for each origin and destination pair. For example, If the set is
     * Origins {A,B} and Destinations {C,D,E} we can get the following set of results with distance
     * (meters) and time (seconds) for each. The GET method can only handle up to 100 locations (1
     * location is either 1 origin or 1 destination).
     */
    fun retrieve(params: JsonRetrieveParams): JsonRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JsonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JsonRetrieveResponse

    /** A view of [JsonService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JsonService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /distancematrix/json`, but is otherwise the same as
         * [JsonService.create].
         */
        @MustBeClosed fun create(): HttpResponse = create(JsonCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: JsonCreateParams = JsonCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(params: JsonCreateParams = JsonCreateParams.none()): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponse =
            create(JsonCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /distancematrix/json`, but is otherwise the same as
         * [JsonService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: JsonRetrieveParams): HttpResponseFor<JsonRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: JsonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JsonRetrieveResponse>
    }
}
