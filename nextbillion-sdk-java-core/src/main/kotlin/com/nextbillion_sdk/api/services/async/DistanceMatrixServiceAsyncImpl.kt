// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async

import com.nextbillion_sdk.api.core.ClientOptions
import com.nextbillion_sdk.api.services.async.distancematrix.JsonServiceAsync
import com.nextbillion_sdk.api.services.async.distancematrix.JsonServiceAsyncImpl
import java.util.function.Consumer

class DistanceMatrixServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : DistanceMatrixServiceAsync {

    private val withRawResponse: DistanceMatrixServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val json: JsonServiceAsync by lazy { JsonServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): DistanceMatrixServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DistanceMatrixServiceAsync =
        DistanceMatrixServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun json(): JsonServiceAsync = json

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DistanceMatrixServiceAsync.WithRawResponse {

        private val json: JsonServiceAsync.WithRawResponse by lazy {
            JsonServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DistanceMatrixServiceAsync.WithRawResponse =
            DistanceMatrixServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun json(): JsonServiceAsync.WithRawResponse = json
    }
}
