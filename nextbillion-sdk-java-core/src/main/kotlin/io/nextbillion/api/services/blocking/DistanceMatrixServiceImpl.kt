// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import io.nextbillion.api.core.ClientOptions
import io.nextbillion.api.services.blocking.distancematrix.JsonService
import io.nextbillion.api.services.blocking.distancematrix.JsonServiceImpl
import java.util.function.Consumer

class DistanceMatrixServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DistanceMatrixService {

    private val withRawResponse: DistanceMatrixService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val json: JsonService by lazy { JsonServiceImpl(clientOptions) }

    override fun withRawResponse(): DistanceMatrixService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DistanceMatrixService =
        DistanceMatrixServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun json(): JsonService = json

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DistanceMatrixService.WithRawResponse {

        private val json: JsonService.WithRawResponse by lazy {
            JsonServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DistanceMatrixService.WithRawResponse =
            DistanceMatrixServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun json(): JsonService.WithRawResponse = json
    }
}
