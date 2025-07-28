// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.errors

import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.http.Headers

abstract class NextbillionSdkServiceException
protected constructor(message: String, cause: Throwable? = null) :
    NextbillionSdkException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
