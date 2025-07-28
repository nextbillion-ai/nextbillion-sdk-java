// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.mdm

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.nextbillion_sdk.api.core.ExcludeMissing
import com.nextbillion_sdk.api.core.JsonField
import com.nextbillion_sdk.api.core.JsonMissing
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.checkKnown
import com.nextbillion_sdk.api.core.toImmutable
import com.nextbillion_sdk.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MdmCreateDistanceMatrixResponse
private constructor(
    private val code: JsonField<String>,
    private val message: JsonField<String>,
    private val taskId: JsonField<String>,
    private val warning: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("task_id") @ExcludeMissing taskId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("warning") @ExcludeMissing warning: JsonField<List<String>> = JsonMissing.of(),
    ) : this(code, message, taskId, warning, mutableMapOf())

    /**
     * A string indicating the state of the response. On successful responses, the value will be
     * `Ok`. Indicative error messages/codes are returned in case of errors. See the
     * [API Error Codes](#api-error-codes) section below for more information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun code(): Optional<String> = code.getOptional("code")

    /**
     * Returns the error message in case a request fails. This field will not be present in the
     * response, if a request is successfully submitted.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * A unique ID which can be used in the Asynchronous Distance Matrix GET method to retrieve the
     * final result.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taskId(): Optional<String> = taskId.getOptional("task_id")

    /**
     * Display the warnings, if any, for the given input parameters and values. In case there are no
     * warnings then this field would not be present in the response.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun warning(): Optional<List<String>> = warning.getOptional("warning")

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [taskId].
     *
     * Unlike [taskId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("task_id") @ExcludeMissing fun _taskId(): JsonField<String> = taskId

    /**
     * Returns the raw JSON value of [warning].
     *
     * Unlike [warning], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("warning") @ExcludeMissing fun _warning(): JsonField<List<String>> = warning

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
         * [MdmCreateDistanceMatrixResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MdmCreateDistanceMatrixResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<String> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var taskId: JsonField<String> = JsonMissing.of()
        private var warning: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mdmCreateDistanceMatrixResponse: MdmCreateDistanceMatrixResponse) =
            apply {
                code = mdmCreateDistanceMatrixResponse.code
                message = mdmCreateDistanceMatrixResponse.message
                taskId = mdmCreateDistanceMatrixResponse.taskId
                warning = mdmCreateDistanceMatrixResponse.warning.map { it.toMutableList() }
                additionalProperties =
                    mdmCreateDistanceMatrixResponse.additionalProperties.toMutableMap()
            }

        /**
         * A string indicating the state of the response. On successful responses, the value will be
         * `Ok`. Indicative error messages/codes are returned in case of errors. See the
         * [API Error Codes](#api-error-codes) section below for more information.
         */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /**
         * Returns the error message in case a request fails. This field will not be present in the
         * response, if a request is successfully submitted.
         */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /**
         * A unique ID which can be used in the Asynchronous Distance Matrix GET method to retrieve
         * the final result.
         */
        fun taskId(taskId: String) = taskId(JsonField.of(taskId))

        /**
         * Sets [Builder.taskId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taskId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taskId(taskId: JsonField<String>) = apply { this.taskId = taskId }

        /**
         * Display the warnings, if any, for the given input parameters and values. In case there
         * are no warnings then this field would not be present in the response.
         */
        fun warning(warning: List<String>) = warning(JsonField.of(warning))

        /**
         * Sets [Builder.warning] to an arbitrary JSON value.
         *
         * You should usually call [Builder.warning] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun warning(warning: JsonField<List<String>>) = apply {
            this.warning = warning.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.warning].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWarning(warning: String) = apply {
            this.warning =
                (this.warning ?: JsonField.of(mutableListOf())).also {
                    checkKnown("warning", it).add(warning)
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
         * Returns an immutable instance of [MdmCreateDistanceMatrixResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MdmCreateDistanceMatrixResponse =
            MdmCreateDistanceMatrixResponse(
                code,
                message,
                taskId,
                (warning ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MdmCreateDistanceMatrixResponse = apply {
        if (validated) {
            return@apply
        }

        code()
        message()
        taskId()
        warning()
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
        (if (code.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (taskId.asKnown().isPresent) 1 else 0) +
            (warning.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MdmCreateDistanceMatrixResponse && code == other.code && message == other.message && taskId == other.taskId && warning == other.warning && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, message, taskId, warning, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MdmCreateDistanceMatrixResponse{code=$code, message=$message, taskId=$taskId, warning=$warning, additionalProperties=$additionalProperties}"
}
