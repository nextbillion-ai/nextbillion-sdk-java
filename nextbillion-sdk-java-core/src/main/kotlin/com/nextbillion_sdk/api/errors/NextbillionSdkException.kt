package com.nextbillion_sdk.api.errors

open class NextbillionSdkException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
