package io.nextbillion.api.errors

open class NextbillionSdkException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
