// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.fleetify.routes.steps

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.nextbillion_sdk.api.core.ExcludeMissing
import com.nextbillion_sdk.api.core.JsonField
import com.nextbillion_sdk.api.core.JsonMissing
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.Params
import com.nextbillion_sdk.api.core.checkRequired
import com.nextbillion_sdk.api.core.http.Headers
import com.nextbillion_sdk.api.core.http.QueryParams
import com.nextbillion_sdk.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Complete a route step with document submission, or update the document of a completed route step.
 *
 * When all steps are completed, the encapsulating route’s status will change to `completed`
 * automatically.
 *
 * Either `Session Token` must be provided to authenticate the request.
 */
class StepCompleteParams
private constructor(
    private val routeId: String,
    private val stepId: String?,
    private val key: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun routeId(): String = routeId

    fun stepId(): Optional<String> = Optional.ofNullable(stepId)

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * A key-value map storing form submission data, where keys correspond to field labels and
     * values can be of any type depend on the type of according document item.
     */
    fun _document(): JsonValue = body._document()

    /**
     * Sets the status of the route step. Currently only `completed` is supported.
     *
     * Note: once marked `completed`, a step cannot transition to other statuses. You can only
     * update the document afterwards.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun mode(): Optional<String> = body.mode()

    /**
     * Sets the status of the route step. Currently only `completed` is supported.
     *
     * Note: once marked `completed`, a step cannot transition to other statuses. You can only
     * update the document afterwards.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = body.status()

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mode(): JsonField<String> = body._mode()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<String> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StepCompleteParams].
         *
         * The following fields are required:
         * ```java
         * .routeId()
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StepCompleteParams]. */
    class Builder internal constructor() {

        private var routeId: String? = null
        private var stepId: String? = null
        private var key: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(stepCompleteParams: StepCompleteParams) = apply {
            routeId = stepCompleteParams.routeId
            stepId = stepCompleteParams.stepId
            key = stepCompleteParams.key
            body = stepCompleteParams.body.toBuilder()
            additionalHeaders = stepCompleteParams.additionalHeaders.toBuilder()
            additionalQueryParams = stepCompleteParams.additionalQueryParams.toBuilder()
        }

        fun routeId(routeId: String) = apply { this.routeId = routeId }

        fun stepId(stepId: String?) = apply { this.stepId = stepId }

        /** Alias for calling [Builder.stepId] with `stepId.orElse(null)`. */
        fun stepId(stepId: Optional<String>) = stepId(stepId.getOrNull())

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [document]
         * - [mode]
         * - [status]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * A key-value map storing form submission data, where keys correspond to field labels and
         * values can be of any type depend on the type of according document item.
         */
        fun document(document: JsonValue) = apply { body.document(document) }

        /**
         * Sets the status of the route step. Currently only `completed` is supported.
         *
         * Note: once marked `completed`, a step cannot transition to other statuses. You can only
         * update the document afterwards.
         */
        fun mode(mode: String) = apply { body.mode(mode) }

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<String>) = apply { body.mode(mode) }

        /**
         * Sets the status of the route step. Currently only `completed` is supported.
         *
         * Note: once marked `completed`, a step cannot transition to other statuses. You can only
         * update the document afterwards.
         */
        fun status(status: String) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { body.status(status) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [StepCompleteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .routeId()
         * .key()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StepCompleteParams =
            StepCompleteParams(
                checkRequired("routeId", routeId),
                stepId,
                checkRequired("key", key),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> routeId
            1 -> stepId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    private constructor(
        private val document: JsonValue,
        private val mode: JsonField<String>,
        private val status: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("document") @ExcludeMissing document: JsonValue = JsonMissing.of(),
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        ) : this(document, mode, status, mutableMapOf())

        /**
         * A key-value map storing form submission data, where keys correspond to field labels and
         * values can be of any type depend on the type of according document item.
         */
        @JsonProperty("document") @ExcludeMissing fun _document(): JsonValue = document

        /**
         * Sets the status of the route step. Currently only `completed` is supported.
         *
         * Note: once marked `completed`, a step cannot transition to other statuses. You can only
         * update the document afterwards.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun mode(): Optional<String> = mode.getOptional("mode")

        /**
         * Sets the status of the route step. Currently only `completed` is supported.
         *
         * Note: once marked `completed`, a step cannot transition to other statuses. You can only
         * update the document afterwards.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [mode].
         *
         * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<String> = mode

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var document: JsonValue = JsonMissing.of()
            private var mode: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                document = body.document
                mode = body.mode
                status = body.status
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * A key-value map storing form submission data, where keys correspond to field labels
             * and values can be of any type depend on the type of according document item.
             */
            fun document(document: JsonValue) = apply { this.document = document }

            /**
             * Sets the status of the route step. Currently only `completed` is supported.
             *
             * Note: once marked `completed`, a step cannot transition to other statuses. You can
             * only update the document afterwards.
             */
            fun mode(mode: String) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<String>) = apply { this.mode = mode }

            /**
             * Sets the status of the route step. Currently only `completed` is supported.
             *
             * Note: once marked `completed`, a step cannot transition to other statuses. You can
             * only update the document afterwards.
             */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(document, mode, status, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            mode()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (mode.asKnown().isPresent) 1 else 0) + (if (status.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && document == other.document && mode == other.mode && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(document, mode, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{document=$document, mode=$mode, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StepCompleteParams && routeId == other.routeId && stepId == other.stepId && key == other.key && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(routeId, stepId, key, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "StepCompleteParams{routeId=$routeId, stepId=$stepId, key=$key, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
