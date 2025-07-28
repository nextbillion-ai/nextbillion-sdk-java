package io.nextbillion.api.errors

class NextbillionSdkInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    NextbillionSdkException(message, cause)
