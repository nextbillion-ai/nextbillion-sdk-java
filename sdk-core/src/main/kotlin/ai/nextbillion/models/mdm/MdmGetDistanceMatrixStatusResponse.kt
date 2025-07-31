// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.mdm

import ai.nextbillion.core.Enum
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

class MdmGetDistanceMatrixStatusResponse
private constructor(
    private val code: JsonField<Code>,
    private val outputAddr: JsonField<String>,
    private val resultLink: JsonField<String>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing code: JsonField<Code> = JsonMissing.of(),
        @JsonProperty("output_addr")
        @ExcludeMissing
        outputAddr: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result_link")
        @ExcludeMissing
        resultLink: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(code, outputAddr, resultLink, status, mutableMapOf())

    /**
     * A code representing the status of the request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun code(): Optional<Code> = code.getOptional("code")

    /**
     * Returns the GCS result of a successful task. Please note that this is an internal field.
     *
     * _internal field, the gcs result of specific task if task is success._
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun outputAddr(): Optional<String> = outputAddr.getOptional("output_addr")

    /**
     * Returns the link for the result file (csv format) once the task is completed successfully.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun resultLink(): Optional<String> = resultLink.getOptional("result_link")

    /**
     * Returns the status detail of the result. Indicative error messages/codes are returned in case
     * of errors. See the [API Error Codes](#api-error-codes) section below for more information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Code> = code

    /**
     * Returns the raw JSON value of [outputAddr].
     *
     * Unlike [outputAddr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("output_addr") @ExcludeMissing fun _outputAddr(): JsonField<String> = outputAddr

    /**
     * Returns the raw JSON value of [resultLink].
     *
     * Unlike [resultLink], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result_link") @ExcludeMissing fun _resultLink(): JsonField<String> = resultLink

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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
         * [MdmGetDistanceMatrixStatusResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MdmGetDistanceMatrixStatusResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<Code> = JsonMissing.of()
        private var outputAddr: JsonField<String> = JsonMissing.of()
        private var resultLink: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mdmGetDistanceMatrixStatusResponse: MdmGetDistanceMatrixStatusResponse) =
            apply {
                code = mdmGetDistanceMatrixStatusResponse.code
                outputAddr = mdmGetDistanceMatrixStatusResponse.outputAddr
                resultLink = mdmGetDistanceMatrixStatusResponse.resultLink
                status = mdmGetDistanceMatrixStatusResponse.status
                additionalProperties =
                    mdmGetDistanceMatrixStatusResponse.additionalProperties.toMutableMap()
            }

        /** A code representing the status of the request. */
        fun code(code: Code) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [Code] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<Code>) = apply { this.code = code }

        /**
         * Returns the GCS result of a successful task. Please note that this is an internal field.
         *
         * _internal field, the gcs result of specific task if task is success._
         */
        fun outputAddr(outputAddr: String) = outputAddr(JsonField.of(outputAddr))

        /**
         * Sets [Builder.outputAddr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputAddr] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outputAddr(outputAddr: JsonField<String>) = apply { this.outputAddr = outputAddr }

        /**
         * Returns the link for the result file (csv format) once the task is completed
         * successfully.
         */
        fun resultLink(resultLink: String) = resultLink(JsonField.of(resultLink))

        /**
         * Sets [Builder.resultLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resultLink] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resultLink(resultLink: JsonField<String>) = apply { this.resultLink = resultLink }

        /**
         * Returns the status detail of the result. Indicative error messages/codes are returned in
         * case of errors. See the [API Error Codes](#api-error-codes) section below for more
         * information.
         */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

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
         * Returns an immutable instance of [MdmGetDistanceMatrixStatusResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MdmGetDistanceMatrixStatusResponse =
            MdmGetDistanceMatrixStatusResponse(
                code,
                outputAddr,
                resultLink,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MdmGetDistanceMatrixStatusResponse = apply {
        if (validated) {
            return@apply
        }

        code().ifPresent { it.validate() }
        outputAddr()
        resultLink()
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
        (code.asKnown().getOrNull()?.validity() ?: 0) +
            (if (outputAddr.asKnown().isPresent) 1 else 0) +
            (if (resultLink.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    /** A code representing the status of the request. */
    class Code @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val OK = of("Ok")

            @JvmField val PROCESSING = of("Processing")

            @JvmField val FAILED = of("Failed")

            @JvmStatic fun of(value: String) = Code(JsonField.of(value))
        }

        /** An enum containing [Code]'s known values. */
        enum class Known {
            OK,
            PROCESSING,
            FAILED,
        }

        /**
         * An enum containing [Code]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Code] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OK,
            PROCESSING,
            FAILED,
            /** An enum member indicating that [Code] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                OK -> Value.OK
                PROCESSING -> Value.PROCESSING
                FAILED -> Value.FAILED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws NextbillionSdkInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                OK -> Known.OK
                PROCESSING -> Known.PROCESSING
                FAILED -> Known.FAILED
                else -> throw NextbillionSdkInvalidDataException("Unknown Code: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws NextbillionSdkInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                NextbillionSdkInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Code = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Code && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MdmGetDistanceMatrixStatusResponse && code == other.code && outputAddr == other.outputAddr && resultLink == other.resultLink && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, outputAddr, resultLink, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MdmGetDistanceMatrixStatusResponse{code=$code, outputAddr=$outputAddr, resultLink=$resultLink, status=$status, additionalProperties=$additionalProperties}"
}
