package io.nextbillion.api.errors

class NextbillionSdkIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    NextbillionSdkException(message, cause)
