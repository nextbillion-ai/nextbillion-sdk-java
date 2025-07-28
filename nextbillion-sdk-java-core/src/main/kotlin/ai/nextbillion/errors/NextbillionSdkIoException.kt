package ai.nextbillion.errors

class NextbillionSdkIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    NextbillionSdkException(message, cause)
