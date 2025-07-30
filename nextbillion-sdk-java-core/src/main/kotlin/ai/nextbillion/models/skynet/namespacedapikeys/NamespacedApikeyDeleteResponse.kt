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

class NamespacedApikeyDeleteResponse
private constructor(
    private val msg: JsonField<String>,
    private val status: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("msg") @ExcludeMissing msg: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Long> = JsonMissing.of(),
    ) : this(msg, status, mutableMapOf())

    /**
     * Its value is OK in case of a successful delete operation. Indicative error messages are
     * returned otherwise, for different errors.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun msg(): Optional<String> = msg.getOptional("msg")

    /**
     * A string indicating the state of the response. A successful delete operation ins indicated by
     * an HTTP code of200. See the
     * [API Error Codes](https://docs.nextbillion.ai/docs/tracking/api/live-tracking-api#api-error-codes)
     * section below for possible values in case of errors.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<Long> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [msg].
     *
     * Unlike [msg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msg") @ExcludeMissing fun _msg(): JsonField<String> = msg

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
         * [NamespacedApikeyDeleteResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NamespacedApikeyDeleteResponse]. */
    class Builder internal constructor() {

        private var msg: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(namespacedApikeyDeleteResponse: NamespacedApikeyDeleteResponse) = apply {
            msg = namespacedApikeyDeleteResponse.msg
            status = namespacedApikeyDeleteResponse.status
            additionalProperties =
                namespacedApikeyDeleteResponse.additionalProperties.toMutableMap()
        }

        /**
         * Its value is OK in case of a successful delete operation. Indicative error messages are
         * returned otherwise, for different errors.
         */
        fun msg(msg: String) = msg(JsonField.of(msg))

        /**
         * Sets [Builder.msg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msg] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun msg(msg: JsonField<String>) = apply { this.msg = msg }

        /**
         * A string indicating the state of the response. A successful delete operation ins
         * indicated by an HTTP code of200. See the
         * [API Error Codes](https://docs.nextbillion.ai/docs/tracking/api/live-tracking-api#api-error-codes)
         * section below for possible values in case of errors.
         */
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
         * Returns an immutable instance of [NamespacedApikeyDeleteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NamespacedApikeyDeleteResponse =
            NamespacedApikeyDeleteResponse(msg, status, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): NamespacedApikeyDeleteResponse = apply {
        if (validated) {
            return@apply
        }

        msg()
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
        (if (msg.asKnown().isPresent) 1 else 0) + (if (status.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NamespacedApikeyDeleteResponse && msg == other.msg && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(msg, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NamespacedApikeyDeleteResponse{msg=$msg, status=$status, additionalProperties=$additionalProperties}"
}
