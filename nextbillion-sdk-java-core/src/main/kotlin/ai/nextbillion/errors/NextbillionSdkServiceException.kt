// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.errors

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.http.Headers

abstract class NextbillionSdkServiceException
protected constructor(message: String, cause: Throwable? = null) :
    NextbillionSdkException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
