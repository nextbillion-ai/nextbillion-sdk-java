// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.batch

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.nextbillion.api.core.ExcludeMissing
import io.nextbillion.api.core.JsonField
import io.nextbillion.api.core.JsonMissing
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.checkKnown
import io.nextbillion.api.core.toImmutable
import io.nextbillion.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BatchRetrieveResponse
private constructor(
    private val msg: JsonField<String>,
    private val responses: JsonField<List<Response>>,
    private val status: JsonField<String>,
    private val trackId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("msg") @ExcludeMissing msg: JsonField<String> = JsonMissing.of(),
        @JsonProperty("responses")
        @ExcludeMissing
        responses: JsonField<List<Response>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("track_id") @ExcludeMissing trackId: JsonField<String> = JsonMissing.of(),
    ) : this(msg, responses, status, trackId, mutableMapOf())

    /**
     * Displays the error message in case of a failed request or operation. Please note that this
     * parameter is not returned in the response in case of a successful request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun msg(): Optional<String> = msg.getOptional("msg")

    /**
     * An array of objects returning the results of all the individual routing queries specified in
     * the input. Each object represents the solution to an individual query in the input.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun responses(): Optional<List<Response>> = responses.getOptional("responses")

    /**
     * Returns the overall status of the API request. Its value will always be one of `success`,
     * `failed`, and `pending`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Returns the unique ID of the batch processing task.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun trackId(): Optional<String> = trackId.getOptional("track_id")

    /**
     * Returns the raw JSON value of [msg].
     *
     * Unlike [msg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msg") @ExcludeMissing fun _msg(): JsonField<String> = msg

    /**
     * Returns the raw JSON value of [responses].
     *
     * Unlike [responses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("responses")
    @ExcludeMissing
    fun _responses(): JsonField<List<Response>> = responses

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [trackId].
     *
     * Unlike [trackId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("track_id") @ExcludeMissing fun _trackId(): JsonField<String> = trackId

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

        /** Returns a mutable builder for constructing an instance of [BatchRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchRetrieveResponse]. */
    class Builder internal constructor() {

        private var msg: JsonField<String> = JsonMissing.of()
        private var responses: JsonField<MutableList<Response>>? = null
        private var status: JsonField<String> = JsonMissing.of()
        private var trackId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(batchRetrieveResponse: BatchRetrieveResponse) = apply {
            msg = batchRetrieveResponse.msg
            responses = batchRetrieveResponse.responses.map { it.toMutableList() }
            status = batchRetrieveResponse.status
            trackId = batchRetrieveResponse.trackId
            additionalProperties = batchRetrieveResponse.additionalProperties.toMutableMap()
        }

        /**
         * Displays the error message in case of a failed request or operation. Please note that
         * this parameter is not returned in the response in case of a successful request.
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
         * An array of objects returning the results of all the individual routing queries specified
         * in the input. Each object represents the solution to an individual query in the input.
         */
        fun responses(responses: List<Response>) = responses(JsonField.of(responses))

        /**
         * Sets [Builder.responses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responses] with a well-typed `List<Response>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responses(responses: JsonField<List<Response>>) = apply {
            this.responses = responses.map { it.toMutableList() }
        }

        /**
         * Adds a single [Response] to [responses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResponse(response: Response) = apply {
            responses =
                (responses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("responses", it).add(response)
                }
        }

        /**
         * Returns the overall status of the API request. Its value will always be one of `success`,
         * `failed`, and `pending`.
         */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** Returns the unique ID of the batch processing task. */
        fun trackId(trackId: String) = trackId(JsonField.of(trackId))

        /**
         * Sets [Builder.trackId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trackId(trackId: JsonField<String>) = apply { this.trackId = trackId }

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
         * Returns an immutable instance of [BatchRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BatchRetrieveResponse =
            BatchRetrieveResponse(
                msg,
                (responses ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                trackId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BatchRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        msg()
        responses().ifPresent { it.forEach { it.validate() } }
        status()
        trackId()
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
        (if (msg.asKnown().isPresent) 1 else 0) +
            (responses.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (trackId.asKnown().isPresent) 1 else 0)

    class Response
    private constructor(
        private val response: JsonValue,
        private val statusCode: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("response") @ExcludeMissing response: JsonValue = JsonMissing.of(),
            @JsonProperty("status_code")
            @ExcludeMissing
            statusCode: JsonField<Long> = JsonMissing.of(),
        ) : this(response, statusCode, mutableMapOf())

        /**
         * An object returning the routing solution of an individual query. The JSON format and
         * structure of the `response` would vary depending on the routing endpoint used in each
         * individual query. However, it will be consistent with standard response for a given
         * routing endpoint.
         */
        @JsonProperty("response") @ExcludeMissing fun _response(): JsonValue = response

        /**
         * Returns the HTTP status code for the individual routing request. See the
         * [API Errors Codes](#api-error-codes) section below for more information.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun statusCode(): Optional<Long> = statusCode.getOptional("status_code")

        /**
         * Returns the raw JSON value of [statusCode].
         *
         * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status_code") @ExcludeMissing fun _statusCode(): JsonField<Long> = statusCode

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

            /** Returns a mutable builder for constructing an instance of [Response]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Response]. */
        class Builder internal constructor() {

            private var response: JsonValue = JsonMissing.of()
            private var statusCode: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(response: Response) = apply {
                this.response = response.response
                statusCode = response.statusCode
                additionalProperties = response.additionalProperties.toMutableMap()
            }

            /**
             * An object returning the routing solution of an individual query. The JSON format and
             * structure of the `response` would vary depending on the routing endpoint used in each
             * individual query. However, it will be consistent with standard response for a given
             * routing endpoint.
             */
            fun response(response: JsonValue) = apply { this.response = response }

            /**
             * Returns the HTTP status code for the individual routing request. See the
             * [API Errors Codes](#api-error-codes) section below for more information.
             */
            fun statusCode(statusCode: Long) = statusCode(JsonField.of(statusCode))

            /**
             * Sets [Builder.statusCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCode] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

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
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response =
                Response(response, statusCode, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            statusCode()
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
        @JvmSynthetic internal fun validity(): Int = (if (statusCode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && response == other.response && statusCode == other.statusCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(response, statusCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Response{response=$response, statusCode=$statusCode, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BatchRetrieveResponse && msg == other.msg && responses == other.responses && status == other.status && trackId == other.trackId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(msg, responses, status, trackId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BatchRetrieveResponse{msg=$msg, responses=$responses, status=$status, trackId=$trackId, additionalProperties=$additionalProperties}"
}
