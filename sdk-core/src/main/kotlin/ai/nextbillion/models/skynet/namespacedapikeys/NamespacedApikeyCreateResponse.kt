// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.namespacedapikeys

import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NamespacedApikeyCreateResponse
private constructor(
    private val error: JsonField<String>,
    private val message: JsonField<String>,
    private val result: JsonField<Result>,
    private val status: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Long> = JsonMissing.of(),
    ) : this(error, message, result, status, mutableMapOf())

    /**
     * Returns the error type in case of any error. If there is no error, then this field is absent
     * in the response.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * Returns the error message in case of any error. If there is no error, then this field is
     * absent in the response.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * An object to return the details about the namespace key created.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun result(): Optional<Result> = result.getOptional("result")

    /**
     * Returns the API response code.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<Long> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Long> = status

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NamespacedApikeyCreateResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NamespacedApikeyCreateResponse]. */
    class Builder internal constructor() {

        private var error: JsonField<String> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var status: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(namespacedApikeyCreateResponse: NamespacedApikeyCreateResponse) = apply {
            error = namespacedApikeyCreateResponse.error
            message = namespacedApikeyCreateResponse.message
            result = namespacedApikeyCreateResponse.result
            status = namespacedApikeyCreateResponse.status
            additionalProperties =
                namespacedApikeyCreateResponse.additionalProperties.toMutableMap()
        }

        /**
         * Returns the error type in case of any error. If there is no error, then this field is
         * absent in the response.
         */
        fun error(error: String) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        /**
         * Returns the error message in case of any error. If there is no error, then this field is
         * absent in the response.
         */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** An object to return the details about the namespace key created. */
        fun result(result: Result) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [Result] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

        /** Returns the API response code. */
        fun status(status: Long) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Long>) = apply { this.status = status }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [NamespacedApikeyCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NamespacedApikeyCreateResponse =
            NamespacedApikeyCreateResponse(
                error,
                message,
                result,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NamespacedApikeyCreateResponse = apply {
        if (validated) {
            return@apply
        }

        error()
        message()
        result().ifPresent { it.validate() }
        status()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: NextbillionSdkInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (error.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    /** An object to return the details about the namespace key created. */
    class Result
    private constructor(
        private val apikey: JsonField<String>,
        private val createdAt: JsonField<Long>,
        private val expiresAt: JsonField<Long>,
        private val namespace: JsonField<String>,
        private val subId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("apikey") @ExcludeMissing apikey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("namespace")
            @ExcludeMissing
            namespace: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sub_id") @ExcludeMissing subId: JsonField<String> = JsonMissing.of(),
        ) : this(apikey, createdAt, expiresAt, namespace, subId, mutableMapOf())

        /**
         * Returns the unique key created for the specified namespace.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun apikey(): Optional<String> = apikey.getOptional("apikey")

        /**
         * Returns the time, expressed as UNIX epoch timestamp in seconds, when the namespace key
         * was created.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<Long> = createdAt.getOptional("created_at")

        /**
         * Returns the time, expressed as UNIX epoch timestamp in seconds, when the namespace key
         * will expire.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expiresAt(): Optional<Long> = expiresAt.getOptional("expires_at")

        /**
         * Returns the name of the namespace for which the key is created.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun namespace(): Optional<String> = namespace.getOptional("namespace")

        /**
         * An internal subscription ID.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun subId(): Optional<String> = subId.getOptional("sub_id")

        /**
         * Returns the raw JSON value of [apikey].
         *
         * Unlike [apikey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("apikey") @ExcludeMissing fun _apikey(): JsonField<String> = apikey

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt(): JsonField<Long> = expiresAt

        /**
         * Returns the raw JSON value of [namespace].
         *
         * Unlike [namespace], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("namespace") @ExcludeMissing fun _namespace(): JsonField<String> = namespace

        /**
         * Returns the raw JSON value of [subId].
         *
         * Unlike [subId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sub_id") @ExcludeMissing fun _subId(): JsonField<String> = subId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Result]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var apikey: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<Long> = JsonMissing.of()
            private var expiresAt: JsonField<Long> = JsonMissing.of()
            private var namespace: JsonField<String> = JsonMissing.of()
            private var subId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                apikey = result.apikey
                createdAt = result.createdAt
                expiresAt = result.expiresAt
                namespace = result.namespace
                subId = result.subId
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /** Returns the unique key created for the specified namespace. */
            fun apikey(apikey: String) = apikey(JsonField.of(apikey))

            /**
             * Sets [Builder.apikey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apikey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apikey(apikey: JsonField<String>) = apply { this.apikey = apikey }

            /**
             * Returns the time, expressed as UNIX epoch timestamp in seconds, when the namespace
             * key was created.
             */
            fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

            /**
             * Returns the time, expressed as UNIX epoch timestamp in seconds, when the namespace
             * key will expire.
             */
            fun expiresAt(expiresAt: Long) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<Long>) = apply { this.expiresAt = expiresAt }

            /** Returns the name of the namespace for which the key is created. */
            fun namespace(namespace: String) = namespace(JsonField.of(namespace))

            /**
             * Sets [Builder.namespace] to an arbitrary JSON value.
             *
             * You should usually call [Builder.namespace] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun namespace(namespace: JsonField<String>) = apply { this.namespace = namespace }

            /** An internal subscription ID. */
            fun subId(subId: String) = subId(JsonField.of(subId))

            /**
             * Sets [Builder.subId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subId(subId: JsonField<String>) = apply { this.subId = subId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Result =
                Result(
                    apikey,
                    createdAt,
                    expiresAt,
                    namespace,
                    subId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            apikey()
            createdAt()
            expiresAt()
            namespace()
            subId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: NextbillionSdkInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (apikey.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (expiresAt.asKnown().isPresent) 1 else 0) +
                (if (namespace.asKnown().isPresent) 1 else 0) +
                (if (subId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                apikey == other.apikey &&
                createdAt == other.createdAt &&
                expiresAt == other.expiresAt &&
                namespace == other.namespace &&
                subId == other.subId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(apikey, createdAt, expiresAt, namespace, subId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{apikey=$apikey, createdAt=$createdAt, expiresAt=$expiresAt, namespace=$namespace, subId=$subId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NamespacedApikeyCreateResponse &&
            error == other.error &&
            message == other.message &&
            result == other.result &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(error, message, result, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NamespacedApikeyCreateResponse{error=$error, message=$message, result=$result, status=$status, additionalProperties=$additionalProperties}"
}
