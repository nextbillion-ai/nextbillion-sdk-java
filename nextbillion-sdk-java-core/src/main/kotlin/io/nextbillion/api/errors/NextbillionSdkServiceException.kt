// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.errors

import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.http.Headers

abstract class NextbillionSdkServiceException
protected constructor(message: String, cause: Throwable? = null) :
    NextbillionSdkException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
