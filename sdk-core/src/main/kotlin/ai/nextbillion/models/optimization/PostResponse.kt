// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.optimization

import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.checkKnown
import ai.nextbillion.core.toImmutable
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PostResponse
private constructor(
    private val id: JsonField<String>,
    private val message: JsonField<String>,
    private val status: JsonField<String>,
    private val warnings: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("warnings")
        @ExcludeMissing
        warnings: JsonField<List<String>> = JsonMissing.of(),
    ) : this(id, message, status, warnings, mutableMapOf())

    /**
     * A unique ID which can be used in the Optimization GET method to retrieve the result of
     * optimization.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Displays an acknowledgement message once the job is submitted.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * A string indicating the state of the response. On successful responses, the value will be Ok.
     * Indicative error messages/codes are returned in case of errors. See the
     * [API Error Codes](#api-error-codes) section below for more information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Display the warnings for the given input parameters, values and constraints.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun warnings(): Optional<List<String>> = warnings.getOptional("warnings")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [warnings].
     *
     * Unlike [warnings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("warnings") @ExcludeMissing fun _warnings(): JsonField<List<String>> = warnings

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

        /** Returns a mutable builder for constructing an instance of [PostResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PostResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var warnings: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(postResponse: PostResponse) = apply {
            id = postResponse.id
            message = postResponse.message
            status = postResponse.status
            warnings = postResponse.warnings.map { it.toMutableList() }
            additionalProperties = postResponse.additionalProperties.toMutableMap()
        }

        /**
         * A unique ID which can be used in the Optimization GET method to retrieve the result of
         * optimization.
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Displays an acknowledgement message once the job is submitted. */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /**
         * A string indicating the state of the response. On successful responses, the value will be
         * Ok. Indicative error messages/codes are returned in case of errors. See the
         * [API Error Codes](#api-error-codes) section below for more information.
         */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** Display the warnings for the given input parameters, values and constraints. */
        fun warnings(warnings: List<String>) = warnings(JsonField.of(warnings))

        /**
         * Sets [Builder.warnings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.warnings] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun warnings(warnings: JsonField<List<String>>) = apply {
            this.warnings = warnings.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [warnings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWarning(warning: String) = apply {
            warnings =
                (warnings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("warnings", it).add(warning)
                }
        }

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
         * Returns an immutable instance of [PostResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PostResponse =
            PostResponse(
                id,
                message,
                status,
                (warnings ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PostResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        message()
        status()
        warnings()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (warnings.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PostResponse &&
            id == other.id &&
            message == other.message &&
            status == other.status &&
            warnings == other.warnings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, message, status, warnings, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PostResponse{id=$id, message=$message, status=$status, warnings=$warnings, additionalProperties=$additionalProperties}"
}
