// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes

import ai.nextbillion.core.Enum
import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.Params
import ai.nextbillion.core.checkKnown
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.http.Headers
import ai.nextbillion.core.http.QueryParams
import ai.nextbillion.core.toImmutable
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import ai.nextbillion.models.fleetify.routes.steps.RouteStepCompletionMode
import ai.nextbillion.models.fleetify.routes.steps.RouteStepsRequest
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Re-dispatch route */
class RouteRedispatchParams
private constructor(
    private val routeId: String?,
    private val key: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun routeId(): Optional<String> = Optional.ofNullable(routeId)

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * A collection of objects with details of the steps to be modified. Each object corresponds to
     * a single step.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operations(): List<Operation> = body.operations()

    /**
     * Specify the distance of the route.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun distance(): Optional<Double> = body.distance()

    /**
     * Returns the raw JSON value of [operations].
     *
     * Unlike [operations], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _operations(): JsonField<List<Operation>> = body._operations()

    /**
     * Returns the raw JSON value of [distance].
     *
     * Unlike [distance], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _distance(): JsonField<Double> = body._distance()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RouteRedispatchParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .operations()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RouteRedispatchParams]. */
    class Builder internal constructor() {

        private var routeId: String? = null
        private var key: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(routeRedispatchParams: RouteRedispatchParams) = apply {
            routeId = routeRedispatchParams.routeId
            key = routeRedispatchParams.key
            body = routeRedispatchParams.body.toBuilder()
            additionalHeaders = routeRedispatchParams.additionalHeaders.toBuilder()
            additionalQueryParams = routeRedispatchParams.additionalQueryParams.toBuilder()
        }

        fun routeId(routeId: String?) = apply { this.routeId = routeId }

        /** Alias for calling [Builder.routeId] with `routeId.orElse(null)`. */
        fun routeId(routeId: Optional<String>) = routeId(routeId.getOrNull())

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [operations]
         * - [distance]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * A collection of objects with details of the steps to be modified. Each object corresponds
         * to a single step.
         */
        fun operations(operations: List<Operation>) = apply { body.operations(operations) }

        /**
         * Sets [Builder.operations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operations] with a well-typed `List<Operation>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun operations(operations: JsonField<List<Operation>>) = apply {
            body.operations(operations)
        }

        /**
         * Adds a single [Operation] to [operations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOperation(operation: Operation) = apply { body.addOperation(operation) }

        /** Specify the distance of the route. */
        fun distance(distance: Double) = apply { body.distance(distance) }

        /**
         * Sets [Builder.distance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.distance] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun distance(distance: JsonField<Double>) = apply { body.distance(distance) }

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
         * Returns an immutable instance of [RouteRedispatchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .operations()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RouteRedispatchParams =
            RouteRedispatchParams(
                routeId,
                checkRequired("key", key),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> routeId ?: ""
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
        private val operations: JsonField<List<Operation>>,
        private val distance: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("operations")
            @ExcludeMissing
            operations: JsonField<List<Operation>> = JsonMissing.of(),
            @JsonProperty("distance") @ExcludeMissing distance: JsonField<Double> = JsonMissing.of(),
        ) : this(operations, distance, mutableMapOf())

        /**
         * A collection of objects with details of the steps to be modified. Each object corresponds
         * to a single step.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun operations(): List<Operation> = operations.getRequired("operations")

        /**
         * Specify the distance of the route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun distance(): Optional<Double> = distance.getOptional("distance")

        /**
         * Returns the raw JSON value of [operations].
         *
         * Unlike [operations], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operations")
        @ExcludeMissing
        fun _operations(): JsonField<List<Operation>> = operations

        /**
         * Returns the raw JSON value of [distance].
         *
         * Unlike [distance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Double> = distance

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .operations()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var operations: JsonField<MutableList<Operation>>? = null
            private var distance: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                operations = body.operations.map { it.toMutableList() }
                distance = body.distance
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * A collection of objects with details of the steps to be modified. Each object
             * corresponds to a single step.
             */
            fun operations(operations: List<Operation>) = operations(JsonField.of(operations))

            /**
             * Sets [Builder.operations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operations] with a well-typed `List<Operation>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun operations(operations: JsonField<List<Operation>>) = apply {
                this.operations = operations.map { it.toMutableList() }
            }

            /**
             * Adds a single [Operation] to [operations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOperation(operation: Operation) = apply {
                operations =
                    (operations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("operations", it).add(operation)
                    }
            }

            /** Specify the distance of the route. */
            fun distance(distance: Double) = distance(JsonField.of(distance))

            /**
             * Sets [Builder.distance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distance] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

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
             *
             * The following fields are required:
             * ```java
             * .operations()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("operations", operations).map { it.toImmutable() },
                    distance,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            operations().forEach { it.validate() }
            distance()
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
            (operations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (distance.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && operations == other.operations && distance == other.distance && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(operations, distance, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{operations=$operations, distance=$distance, additionalProperties=$additionalProperties}"
    }

    class Operation
    private constructor(
        private val data: JsonField<Data>,
        private val operation: JsonField<InnerOperation>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
            @JsonProperty("operation")
            @ExcludeMissing
            operation: JsonField<InnerOperation> = JsonMissing.of(),
        ) : this(data, operation, mutableMapOf())

        /**
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun data(): Data = data.getRequired("data")

        /**
         * Specify the type of operation to be performed for the step.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun operation(): InnerOperation = operation.getRequired("operation")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

        /**
         * Returns the raw JSON value of [operation].
         *
         * Unlike [operation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operation")
        @ExcludeMissing
        fun _operation(): JsonField<InnerOperation> = operation

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
             * Returns a mutable builder for constructing an instance of [Operation].
             *
             * The following fields are required:
             * ```java
             * .data()
             * .operation()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Operation]. */
        class Builder internal constructor() {

            private var data: JsonField<Data>? = null
            private var operation: JsonField<InnerOperation>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(operation: Operation) = apply {
                data = operation.data
                this.operation = operation.operation
                additionalProperties = operation.additionalProperties.toMutableMap()
            }

            fun data(data: Data) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [Data] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun data(data: JsonField<Data>) = apply { this.data = data }

            /** Specify the type of operation to be performed for the step. */
            fun operation(operation: InnerOperation) = operation(JsonField.of(operation))

            /**
             * Sets [Builder.operation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operation] with a well-typed [InnerOperation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operation(operation: JsonField<InnerOperation>) = apply {
                this.operation = operation
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
             * Returns an immutable instance of [Operation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .data()
             * .operation()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Operation =
                Operation(
                    checkRequired("data", data),
                    checkRequired("operation", operation),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Operation = apply {
            if (validated) {
                return@apply
            }

            data().validate()
            operation().validate()
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
            (data.asKnown().getOrNull()?.validity() ?: 0) +
                (operation.asKnown().getOrNull()?.validity() ?: 0)

        class Data
        private constructor(
            private val completionMode: JsonField<RouteStepCompletionMode>,
            private val documentTemplateId: JsonField<String>,
            private val step: JsonField<RouteStepsRequest>,
            private val stepId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("completion_mode")
                @ExcludeMissing
                completionMode: JsonField<RouteStepCompletionMode> = JsonMissing.of(),
                @JsonProperty("document_template_id")
                @ExcludeMissing
                documentTemplateId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("step")
                @ExcludeMissing
                step: JsonField<RouteStepsRequest> = JsonMissing.of(),
                @JsonProperty("step_id")
                @ExcludeMissing
                stepId: JsonField<String> = JsonMissing.of(),
            ) : this(completionMode, documentTemplateId, step, stepId, mutableMapOf())

            /**
             * Specify the mode of completion to be used for the step. Currently, following values
             * are allowed:
             * - manual: Steps must be marked as completed manually through the Driver App.
             * - geofence: Steps are marked as completed automatically based on the entry conditions
             *   and geofence specified.
             * - geofence_manual_fallback: Steps will be marked as completed automatically based on
             *   geofence and entry condition configurations but there will also be a provision for
             *   manually updating the status in case, geofence detection fails.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun completionMode(): Optional<RouteStepCompletionMode> =
                completionMode.getOptional("completion_mode")

            /**
             * Specify the ID of the document template to be used for collecting proof of completion
             * for the step. It would be applied to step which not be bind to document template. Use
             * the [Documents API](https://docs.nextbillion.ai/docs/dispatches/documents-api) to
             * create, read and manage the document templates.
             *
             * Please note that the document template ID can not be assigned to following step
             * types - start, end, break, layover.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun documentTemplateId(): Optional<String> =
                documentTemplateId.getOptional("document_template_id")

            /**
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun step(): Optional<RouteStepsRequest> = step.getOptional("step")

            /**
             * Specify the ID of the step to be updated or deleted. Either one of id or short_id of
             * the step can be provided. This input will be ignored when operation: create .
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun stepId(): Optional<String> = stepId.getOptional("step_id")

            /**
             * Returns the raw JSON value of [completionMode].
             *
             * Unlike [completionMode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("completion_mode")
            @ExcludeMissing
            fun _completionMode(): JsonField<RouteStepCompletionMode> = completionMode

            /**
             * Returns the raw JSON value of [documentTemplateId].
             *
             * Unlike [documentTemplateId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("document_template_id")
            @ExcludeMissing
            fun _documentTemplateId(): JsonField<String> = documentTemplateId

            /**
             * Returns the raw JSON value of [step].
             *
             * Unlike [step], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("step") @ExcludeMissing fun _step(): JsonField<RouteStepsRequest> = step

            /**
             * Returns the raw JSON value of [stepId].
             *
             * Unlike [stepId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

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

                /** Returns a mutable builder for constructing an instance of [Data]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Data]. */
            class Builder internal constructor() {

                private var completionMode: JsonField<RouteStepCompletionMode> = JsonMissing.of()
                private var documentTemplateId: JsonField<String> = JsonMissing.of()
                private var step: JsonField<RouteStepsRequest> = JsonMissing.of()
                private var stepId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(data: Data) = apply {
                    completionMode = data.completionMode
                    documentTemplateId = data.documentTemplateId
                    step = data.step
                    stepId = data.stepId
                    additionalProperties = data.additionalProperties.toMutableMap()
                }

                /**
                 * Specify the mode of completion to be used for the step. Currently, following
                 * values are allowed:
                 * - manual: Steps must be marked as completed manually through the Driver App.
                 * - geofence: Steps are marked as completed automatically based on the entry
                 *   conditions and geofence specified.
                 * - geofence_manual_fallback: Steps will be marked as completed automatically based
                 *   on geofence and entry condition configurations but there will also be a
                 *   provision for manually updating the status in case, geofence detection fails.
                 */
                fun completionMode(completionMode: RouteStepCompletionMode) =
                    completionMode(JsonField.of(completionMode))

                /**
                 * Sets [Builder.completionMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.completionMode] with a well-typed
                 * [RouteStepCompletionMode] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun completionMode(completionMode: JsonField<RouteStepCompletionMode>) = apply {
                    this.completionMode = completionMode
                }

                /**
                 * Specify the ID of the document template to be used for collecting proof of
                 * completion for the step. It would be applied to step which not be bind to
                 * document template. Use the
                 * [Documents API](https://docs.nextbillion.ai/docs/dispatches/documents-api) to
                 * create, read and manage the document templates.
                 *
                 * Please note that the document template ID can not be assigned to following step
                 * types - start, end, break, layover.
                 */
                fun documentTemplateId(documentTemplateId: String) =
                    documentTemplateId(JsonField.of(documentTemplateId))

                /**
                 * Sets [Builder.documentTemplateId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.documentTemplateId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun documentTemplateId(documentTemplateId: JsonField<String>) = apply {
                    this.documentTemplateId = documentTemplateId
                }

                fun step(step: RouteStepsRequest) = step(JsonField.of(step))

                /**
                 * Sets [Builder.step] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.step] with a well-typed [RouteStepsRequest]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun step(step: JsonField<RouteStepsRequest>) = apply { this.step = step }

                /**
                 * Specify the ID of the step to be updated or deleted. Either one of id or short_id
                 * of the step can be provided. This input will be ignored when operation: create .
                 */
                fun stepId(stepId: String) = stepId(JsonField.of(stepId))

                /**
                 * Sets [Builder.stepId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stepId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Data].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Data =
                    Data(
                        completionMode,
                        documentTemplateId,
                        step,
                        stepId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Data = apply {
                if (validated) {
                    return@apply
                }

                completionMode().ifPresent { it.validate() }
                documentTemplateId()
                step().ifPresent { it.validate() }
                stepId()
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
                (completionMode.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (documentTemplateId.asKnown().isPresent) 1 else 0) +
                    (step.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (stepId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Data && completionMode == other.completionMode && documentTemplateId == other.documentTemplateId && step == other.step && stepId == other.stepId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(completionMode, documentTemplateId, step, stepId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Data{completionMode=$completionMode, documentTemplateId=$documentTemplateId, step=$step, stepId=$stepId, additionalProperties=$additionalProperties}"
        }

        /** Specify the type of operation to be performed for the step. */
        class InnerOperation
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CREATE = of("create")

                @JvmField val UPDATE = of("update")

                @JvmField val DELETE = of("delete")

                @JvmStatic fun of(value: String) = InnerOperation(JsonField.of(value))
            }

            /** An enum containing [InnerOperation]'s known values. */
            enum class Known {
                CREATE,
                UPDATE,
                DELETE,
            }

            /**
             * An enum containing [InnerOperation]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [InnerOperation] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CREATE,
                UPDATE,
                DELETE,
                /**
                 * An enum member indicating that [InnerOperation] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CREATE -> Value.CREATE
                    UPDATE -> Value.UPDATE
                    DELETE -> Value.DELETE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws NextbillionSdkInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    CREATE -> Known.CREATE
                    UPDATE -> Known.UPDATE
                    DELETE -> Known.DELETE
                    else ->
                        throw NextbillionSdkInvalidDataException("Unknown InnerOperation: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws NextbillionSdkInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    NextbillionSdkInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): InnerOperation = apply {
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

                return /* spotless:off */ other is InnerOperation && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Operation && data == other.data && operation == other.operation && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(data, operation, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Operation{data=$data, operation=$operation, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RouteRedispatchParams && routeId == other.routeId && key == other.key && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(routeId, key, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "RouteRedispatchParams{routeId=$routeId, key=$key, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
