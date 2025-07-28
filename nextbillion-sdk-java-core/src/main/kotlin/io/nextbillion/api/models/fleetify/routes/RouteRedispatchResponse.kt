// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.fleetify.routes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.nextbillion.api.core.Enum
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

class RouteRedispatchResponse
private constructor(
    private val data: JsonField<Data>,
    private val message: JsonField<String>,
    private val status: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Long> = JsonMissing.of(),
    ) : this(data, message, status, mutableMapOf())

    /**
     * An array of objects containing the details of each step in the dispatched route. Each object
     * represents a single step.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the error message in case of a failed request. If the request is successful, this
     * field is not present in the response.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * Returns the status code of the response.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<Long> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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

        /** Returns a mutable builder for constructing an instance of [RouteRedispatchResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RouteRedispatchResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(routeRedispatchResponse: RouteRedispatchResponse) = apply {
            data = routeRedispatchResponse.data
            message = routeRedispatchResponse.message
            status = routeRedispatchResponse.status
            additionalProperties = routeRedispatchResponse.additionalProperties.toMutableMap()
        }

        /**
         * An array of objects containing the details of each step in the dispatched route. Each
         * object represents a single step.
         */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /**
         * Returns the error message in case of a failed request. If the request is successful, this
         * field is not present in the response.
         */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Returns the status code of the response. */
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
         * Returns an immutable instance of [RouteRedispatchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RouteRedispatchResponse =
            RouteRedispatchResponse(data, message, status, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): RouteRedispatchResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
        message()
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
        (data.asKnown().getOrNull()?.validity() ?: 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    /**
     * An array of objects containing the details of each step in the dispatched route. Each object
     * represents a single step.
     */
    class Data
    private constructor(
        private val id: JsonField<String>,
        private val completedSteps: JsonField<Long>,
        private val completion: JsonField<Completion>,
        private val createdAt: JsonField<Long>,
        private val distance: JsonField<Long>,
        private val documentSnapshot: JsonField<List<JsonValue>>,
        private val driver: JsonField<Driver>,
        private val roRequestId: JsonField<String>,
        private val routing: JsonField<RoutingResponse>,
        private val shortId: JsonField<String>,
        private val steps: JsonField<Steps>,
        private val totalSteps: JsonField<Long>,
        private val updatedAt: JsonField<Long>,
        private val vehicleId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("completed_steps")
            @ExcludeMissing
            completedSteps: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("completion")
            @ExcludeMissing
            completion: JsonField<Completion> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("distance") @ExcludeMissing distance: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("document_snapshot")
            @ExcludeMissing
            documentSnapshot: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("driver") @ExcludeMissing driver: JsonField<Driver> = JsonMissing.of(),
            @JsonProperty("ro_request_id")
            @ExcludeMissing
            roRequestId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routing")
            @ExcludeMissing
            routing: JsonField<RoutingResponse> = JsonMissing.of(),
            @JsonProperty("short_id") @ExcludeMissing shortId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("steps") @ExcludeMissing steps: JsonField<Steps> = JsonMissing.of(),
            @JsonProperty("total_steps")
            @ExcludeMissing
            totalSteps: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("vehicle_id")
            @ExcludeMissing
            vehicleId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            completedSteps,
            completion,
            createdAt,
            distance,
            documentSnapshot,
            driver,
            roRequestId,
            routing,
            shortId,
            steps,
            totalSteps,
            updatedAt,
            vehicleId,
            mutableMapOf(),
        )

        /**
         * Returns the unique ID of the route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Returns the number of steps already completed in the route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun completedSteps(): Optional<Long> = completedSteps.getOptional("completed_steps")

        /**
         * Returns the completion status of the route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun completion(): Optional<Completion> = completion.getOptional("completion")

        /**
         * Returns the UNIX timestamp, in seconds precision, at which this route dispatch request
         * was created.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<Long> = createdAt.getOptional("created_at")

        /**
         * Returns the total route distance, in meters, for informative display in the driver app.
         * It is the same as the value provided for `distance` field in the input request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun distance(): Optional<Long> = distance.getOptional("distance")

        /**
         * Returns the details of the document that was specified in the input for collecting the
         * proof-of-completion for all steps in the dispatched routes. Each object represents a new
         * field in the document.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun documentSnapshot(): Optional<List<JsonValue>> =
            documentSnapshot.getOptional("document_snapshot")

        /**
         * An object returning the details of the driver to whom the route was dispatched.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun driver(): Optional<Driver> = driver.getOptional("driver")

        /**
         * Returns the route optimization request ID which was used to dispatch the route. An empty
         * string is returned if the corresponding input was not provided.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun roRequestId(): Optional<String> = roRequestId.getOptional("ro_request_id")

        /**
         * An object returning the routing characteristics that are used to generate the route and
         * turn-by-turn navigation steps for the dispatched route. The route and navigation steps
         * are available when driver uses the in-app navigation.
         *
         * Please note the routing characteristics returned here are the same as those configured in
         * the input request. The fields which were not specified in the input will be returned as
         * blanks.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun routing(): Optional<RoutingResponse> = routing.getOptional("routing")

        /**
         * Returns a shorter unique ID of the route for easier referencing and displaying purposes.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun shortId(): Optional<String> = shortId.getOptional("short_id")

        /**
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun steps(): Optional<Steps> = steps.getOptional("steps")

        /**
         * Returns the total number of steps in the dispatched route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun totalSteps(): Optional<Long> = totalSteps.getOptional("total_steps")

        /**
         * Returns the UNIX timestamp, in seconds precision, at which this route dispatch request
         * was updated.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<Long> = updatedAt.getOptional("updated_at")

        /**
         * Returns the ID of the vehicle to which the route was dispatched. The vehicle ID returned
         * here is the same as the one used in the route optimization request for the given vehicle.
         * An empty string is returned if the `ro_request_id` was not provided in the input.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun vehicleId(): Optional<String> = vehicleId.getOptional("vehicle_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [completedSteps].
         *
         * Unlike [completedSteps], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("completed_steps")
        @ExcludeMissing
        fun _completedSteps(): JsonField<Long> = completedSteps

        /**
         * Returns the raw JSON value of [completion].
         *
         * Unlike [completion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("completion")
        @ExcludeMissing
        fun _completion(): JsonField<Completion> = completion

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

        /**
         * Returns the raw JSON value of [distance].
         *
         * Unlike [distance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Long> = distance

        /**
         * Returns the raw JSON value of [documentSnapshot].
         *
         * Unlike [documentSnapshot], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("document_snapshot")
        @ExcludeMissing
        fun _documentSnapshot(): JsonField<List<JsonValue>> = documentSnapshot

        /**
         * Returns the raw JSON value of [driver].
         *
         * Unlike [driver], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("driver") @ExcludeMissing fun _driver(): JsonField<Driver> = driver

        /**
         * Returns the raw JSON value of [roRequestId].
         *
         * Unlike [roRequestId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ro_request_id")
        @ExcludeMissing
        fun _roRequestId(): JsonField<String> = roRequestId

        /**
         * Returns the raw JSON value of [routing].
         *
         * Unlike [routing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("routing")
        @ExcludeMissing
        fun _routing(): JsonField<RoutingResponse> = routing

        /**
         * Returns the raw JSON value of [shortId].
         *
         * Unlike [shortId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("short_id") @ExcludeMissing fun _shortId(): JsonField<String> = shortId

        /**
         * Returns the raw JSON value of [steps].
         *
         * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("steps") @ExcludeMissing fun _steps(): JsonField<Steps> = steps

        /**
         * Returns the raw JSON value of [totalSteps].
         *
         * Unlike [totalSteps], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_steps") @ExcludeMissing fun _totalSteps(): JsonField<Long> = totalSteps

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<Long> = updatedAt

        /**
         * Returns the raw JSON value of [vehicleId].
         *
         * Unlike [vehicleId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vehicle_id") @ExcludeMissing fun _vehicleId(): JsonField<String> = vehicleId

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

            private var id: JsonField<String> = JsonMissing.of()
            private var completedSteps: JsonField<Long> = JsonMissing.of()
            private var completion: JsonField<Completion> = JsonMissing.of()
            private var createdAt: JsonField<Long> = JsonMissing.of()
            private var distance: JsonField<Long> = JsonMissing.of()
            private var documentSnapshot: JsonField<MutableList<JsonValue>>? = null
            private var driver: JsonField<Driver> = JsonMissing.of()
            private var roRequestId: JsonField<String> = JsonMissing.of()
            private var routing: JsonField<RoutingResponse> = JsonMissing.of()
            private var shortId: JsonField<String> = JsonMissing.of()
            private var steps: JsonField<Steps> = JsonMissing.of()
            private var totalSteps: JsonField<Long> = JsonMissing.of()
            private var updatedAt: JsonField<Long> = JsonMissing.of()
            private var vehicleId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                completedSteps = data.completedSteps
                completion = data.completion
                createdAt = data.createdAt
                distance = data.distance
                documentSnapshot = data.documentSnapshot.map { it.toMutableList() }
                driver = data.driver
                roRequestId = data.roRequestId
                routing = data.routing
                shortId = data.shortId
                steps = data.steps
                totalSteps = data.totalSteps
                updatedAt = data.updatedAt
                vehicleId = data.vehicleId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Returns the unique ID of the route. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Returns the number of steps already completed in the route. */
            fun completedSteps(completedSteps: Long) = completedSteps(JsonField.of(completedSteps))

            /**
             * Sets [Builder.completedSteps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completedSteps] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun completedSteps(completedSteps: JsonField<Long>) = apply {
                this.completedSteps = completedSteps
            }

            /** Returns the completion status of the route. */
            fun completion(completion: Completion) = completion(JsonField.of(completion))

            /**
             * Sets [Builder.completion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completion] with a well-typed [Completion] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun completion(completion: JsonField<Completion>) = apply {
                this.completion = completion
            }

            /**
             * Returns the UNIX timestamp, in seconds precision, at which this route dispatch
             * request was created.
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
             * Returns the total route distance, in meters, for informative display in the driver
             * app. It is the same as the value provided for `distance` field in the input request.
             */
            fun distance(distance: Long) = distance(JsonField.of(distance))

            /**
             * Sets [Builder.distance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distance] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distance(distance: JsonField<Long>) = apply { this.distance = distance }

            /**
             * Returns the details of the document that was specified in the input for collecting
             * the proof-of-completion for all steps in the dispatched routes. Each object
             * represents a new field in the document.
             */
            fun documentSnapshot(documentSnapshot: List<JsonValue>) =
                documentSnapshot(JsonField.of(documentSnapshot))

            /**
             * Sets [Builder.documentSnapshot] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentSnapshot] with a well-typed
             * `List<JsonValue>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun documentSnapshot(documentSnapshot: JsonField<List<JsonValue>>) = apply {
                this.documentSnapshot = documentSnapshot.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [Builder.documentSnapshot].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDocumentSnapshot(documentSnapshot: JsonValue) = apply {
                this.documentSnapshot =
                    (this.documentSnapshot ?: JsonField.of(mutableListOf())).also {
                        checkKnown("documentSnapshot", it).add(documentSnapshot)
                    }
            }

            /** An object returning the details of the driver to whom the route was dispatched. */
            fun driver(driver: Driver) = driver(JsonField.of(driver))

            /**
             * Sets [Builder.driver] to an arbitrary JSON value.
             *
             * You should usually call [Builder.driver] with a well-typed [Driver] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun driver(driver: JsonField<Driver>) = apply { this.driver = driver }

            /**
             * Returns the route optimization request ID which was used to dispatch the route. An
             * empty string is returned if the corresponding input was not provided.
             */
            fun roRequestId(roRequestId: String) = roRequestId(JsonField.of(roRequestId))

            /**
             * Sets [Builder.roRequestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roRequestId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roRequestId(roRequestId: JsonField<String>) = apply {
                this.roRequestId = roRequestId
            }

            /**
             * An object returning the routing characteristics that are used to generate the route
             * and turn-by-turn navigation steps for the dispatched route. The route and navigation
             * steps are available when driver uses the in-app navigation.
             *
             * Please note the routing characteristics returned here are the same as those
             * configured in the input request. The fields which were not specified in the input
             * will be returned as blanks.
             */
            fun routing(routing: RoutingResponse) = routing(JsonField.of(routing))

            /**
             * Sets [Builder.routing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routing] with a well-typed [RoutingResponse] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routing(routing: JsonField<RoutingResponse>) = apply { this.routing = routing }

            /**
             * Returns a shorter unique ID of the route for easier referencing and displaying
             * purposes.
             */
            fun shortId(shortId: String) = shortId(JsonField.of(shortId))

            /**
             * Sets [Builder.shortId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shortId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shortId(shortId: JsonField<String>) = apply { this.shortId = shortId }

            fun steps(steps: Steps) = steps(JsonField.of(steps))

            /**
             * Sets [Builder.steps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.steps] with a well-typed [Steps] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun steps(steps: JsonField<Steps>) = apply { this.steps = steps }

            /** Returns the total number of steps in the dispatched route. */
            fun totalSteps(totalSteps: Long) = totalSteps(JsonField.of(totalSteps))

            /**
             * Sets [Builder.totalSteps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalSteps] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalSteps(totalSteps: JsonField<Long>) = apply { this.totalSteps = totalSteps }

            /**
             * Returns the UNIX timestamp, in seconds precision, at which this route dispatch
             * request was updated.
             */
            fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

            /**
             * Returns the ID of the vehicle to which the route was dispatched. The vehicle ID
             * returned here is the same as the one used in the route optimization request for the
             * given vehicle. An empty string is returned if the `ro_request_id` was not provided in
             * the input.
             */
            fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

            /**
             * Sets [Builder.vehicleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vehicleId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vehicleId(vehicleId: JsonField<String>) = apply { this.vehicleId = vehicleId }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    id,
                    completedSteps,
                    completion,
                    createdAt,
                    distance,
                    (documentSnapshot ?: JsonMissing.of()).map { it.toImmutable() },
                    driver,
                    roRequestId,
                    routing,
                    shortId,
                    steps,
                    totalSteps,
                    updatedAt,
                    vehicleId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            completedSteps()
            completion().ifPresent { it.validate() }
            createdAt()
            distance()
            documentSnapshot()
            driver().ifPresent { it.validate() }
            roRequestId()
            routing().ifPresent { it.validate() }
            shortId()
            steps().ifPresent { it.validate() }
            totalSteps()
            updatedAt()
            vehicleId()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (completedSteps.asKnown().isPresent) 1 else 0) +
                (completion.asKnown().getOrNull()?.validity() ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (distance.asKnown().isPresent) 1 else 0) +
                (documentSnapshot.asKnown().getOrNull()?.size ?: 0) +
                (driver.asKnown().getOrNull()?.validity() ?: 0) +
                (if (roRequestId.asKnown().isPresent) 1 else 0) +
                (routing.asKnown().getOrNull()?.validity() ?: 0) +
                (if (shortId.asKnown().isPresent) 1 else 0) +
                (steps.asKnown().getOrNull()?.validity() ?: 0) +
                (if (totalSteps.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (vehicleId.asKnown().isPresent) 1 else 0)

        /** Returns the completion status of the route. */
        class Completion
        private constructor(
            private val status: JsonField<Status>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of()
            ) : this(status, mutableMapOf())

            /**
             * Returns the status of the route. It can take one of the following values -
             * "scheduled", "completed".
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun status(): Optional<Status> = status.getOptional("status")

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

                /** Returns a mutable builder for constructing an instance of [Completion]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Completion]. */
            class Builder internal constructor() {

                private var status: JsonField<Status> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(completion: Completion) = apply {
                    status = completion.status
                    additionalProperties = completion.additionalProperties.toMutableMap()
                }

                /**
                 * Returns the status of the route. It can take one of the following values -
                 * "scheduled", "completed".
                 */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

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
                 * Returns an immutable instance of [Completion].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Completion = Completion(status, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Completion = apply {
                if (validated) {
                    return@apply
                }

                status().ifPresent { it.validate() }
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
            internal fun validity(): Int = (status.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Returns the status of the route. It can take one of the following values -
             * "scheduled", "completed".
             */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SCHEDULED = of("`scheduled`")

                    @JvmField val COMPLETED = of("`completed`")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    SCHEDULED,
                    COMPLETED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SCHEDULED,
                    COMPLETED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SCHEDULED -> Value.SCHEDULED
                        COMPLETED -> Value.COMPLETED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws NextbillionSdkInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        SCHEDULED -> Known.SCHEDULED
                        COMPLETED -> Known.COMPLETED
                        else -> throw NextbillionSdkInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws NextbillionSdkInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        NextbillionSdkInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Status = apply {
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

                    return /* spotless:off */ other is Status && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Completion && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(status, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Completion{status=$status, additionalProperties=$additionalProperties}"
        }

        /** An object returning the details of the driver to whom the route was dispatched. */
        class Driver
        private constructor(
            private val id: JsonField<String>,
            private val email: JsonField<String>,
            private val fullname: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fullname")
                @ExcludeMissing
                fullname: JsonField<String> = JsonMissing.of(),
            ) : this(id, email, fullname, mutableMapOf())

            /**
             * Returns the ID of the driver as specified in the
             * [NextBillion.ai](http://NextBillion.ai) Cloud Console.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Returns the email of the driver as specified in the
             * [NextBillion.ai](http://NextBillion.ai) Cloud Console.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun email(): Optional<String> = email.getOptional("email")

            /**
             * Returns the full name of the driver as specified in
             * [NextBillion.ai](http://NextBillion.ai) Cloud Console.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun fullname(): Optional<String> = fullname.getOptional("fullname")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * Returns the raw JSON value of [fullname].
             *
             * Unlike [fullname], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fullname") @ExcludeMissing fun _fullname(): JsonField<String> = fullname

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

                /** Returns a mutable builder for constructing an instance of [Driver]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Driver]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var email: JsonField<String> = JsonMissing.of()
                private var fullname: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(driver: Driver) = apply {
                    id = driver.id
                    email = driver.email
                    fullname = driver.fullname
                    additionalProperties = driver.additionalProperties.toMutableMap()
                }

                /**
                 * Returns the ID of the driver as specified in the
                 * [NextBillion.ai](http://NextBillion.ai) Cloud Console.
                 */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Returns the email of the driver as specified in the
                 * [NextBillion.ai](http://NextBillion.ai) Cloud Console.
                 */
                fun email(email: String) = email(JsonField.of(email))

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                /**
                 * Returns the full name of the driver as specified in
                 * [NextBillion.ai](http://NextBillion.ai) Cloud Console.
                 */
                fun fullname(fullname: String) = fullname(JsonField.of(fullname))

                /**
                 * Sets [Builder.fullname] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fullname] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fullname(fullname: JsonField<String>) = apply { this.fullname = fullname }

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
                 * Returns an immutable instance of [Driver].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Driver =
                    Driver(id, email, fullname, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Driver = apply {
                if (validated) {
                    return@apply
                }

                id()
                email()
                fullname()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (email.asKnown().isPresent) 1 else 0) +
                    (if (fullname.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Driver && id == other.id && email == other.email && fullname == other.fullname && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, email, fullname, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Driver{id=$id, email=$email, fullname=$fullname, additionalProperties=$additionalProperties}"
        }

        class Steps
        private constructor(
            private val id: JsonField<String>,
            private val address: JsonField<String>,
            private val arrival: JsonField<Long>,
            private val completion: JsonField<Completion>,
            private val createdAt: JsonField<Long>,
            private val documentSnapshot: JsonField<List<JsonValue>>,
            private val duration: JsonField<Long>,
            private val location: JsonField<List<Double>>,
            private val meta: JsonField<Meta>,
            private val shortId: JsonField<String>,
            private val type: JsonField<String>,
            private val updatedAt: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<String> = JsonMissing.of(),
                @JsonProperty("arrival")
                @ExcludeMissing
                arrival: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("completion")
                @ExcludeMissing
                completion: JsonField<Completion> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("document_snapshot")
                @ExcludeMissing
                documentSnapshot: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("duration")
                @ExcludeMissing
                duration: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("location")
                @ExcludeMissing
                location: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
                @JsonProperty("short_id")
                @ExcludeMissing
                shortId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<Long> = JsonMissing.of(),
            ) : this(
                id,
                address,
                arrival,
                completion,
                createdAt,
                documentSnapshot,
                duration,
                location,
                meta,
                shortId,
                type,
                updatedAt,
                mutableMapOf(),
            )

            /**
             * Returns the unique ID of the step.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Returns the postal address where the step is executed. Its value is the same as that
             * specified in the input request when configuring the step details.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun address(): Optional<String> = address.getOptional("address")

            /**
             * Returns the scheduled arrival time of the driver at the step as an UNIX timestamp, in
             * seconds precision. It is the same as that specified in the input request while
             * configuring the step details.
             *
             * The timestamp returned here is only for informative display on the driver's app and
             * it does not impact or get affected by the route generated.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun arrival(): Optional<Long> = arrival.getOptional("arrival")

            /**
             * Returns the completion status of the step.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun completion(): Optional<Completion> = completion.getOptional("completion")

            /**
             * Returns the UNIX timestamp, in seconds precision, at which this step was created.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun createdAt(): Optional<Long> = createdAt.getOptional("created_at")

            /**
             * Returns the details of the document that was used for collecting the proof of
             * completion for the step. In case no document template ID was provided for the given
             * step, then a `null` value is returned. Each object represents a new field in the
             * document.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun documentSnapshot(): Optional<List<JsonValue>> =
                documentSnapshot.getOptional("document_snapshot")

            /**
             * Returns the duration for `layover` or `break` type steps.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun duration(): Optional<Long> = duration.getOptional("duration")

            /**
             * Returns the location coordinates where the step is executed.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun location(): Optional<List<Double>> = location.getOptional("location")

            /**
             * An object returning custom details about the step that were configured in the input
             * request while configuring the step details. The information returned here will be
             * available for display on the Driver's app under step details.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun meta(): Optional<Meta> = meta.getOptional("meta")

            /**
             * Returns a unique short ID of the step for easier referencing and displaying purposes.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun shortId(): Optional<String> = shortId.getOptional("short_id")

            /**
             * Returns the step type. It can belong to one of the following: `start`, `job` ,
             * `pickup`, `delivery`, `break`, `layover` , and `end`. For any given step, it would be
             * the same as that specified in the input request while configuring the step details.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the UNIX timestamp, in seconds precision, at which this step was last
             * updated.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun updatedAt(): Optional<Long> = updatedAt.getOptional("updated_at")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

            /**
             * Returns the raw JSON value of [arrival].
             *
             * Unlike [arrival], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("arrival") @ExcludeMissing fun _arrival(): JsonField<Long> = arrival

            /**
             * Returns the raw JSON value of [completion].
             *
             * Unlike [completion], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("completion")
            @ExcludeMissing
            fun _completion(): JsonField<Completion> = completion

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<Long> = createdAt

            /**
             * Returns the raw JSON value of [documentSnapshot].
             *
             * Unlike [documentSnapshot], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("document_snapshot")
            @ExcludeMissing
            fun _documentSnapshot(): JsonField<List<JsonValue>> = documentSnapshot

            /**
             * Returns the raw JSON value of [duration].
             *
             * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

            /**
             * Returns the raw JSON value of [location].
             *
             * Unlike [location], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("location")
            @ExcludeMissing
            fun _location(): JsonField<List<Double>> = location

            /**
             * Returns the raw JSON value of [meta].
             *
             * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

            /**
             * Returns the raw JSON value of [shortId].
             *
             * Unlike [shortId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("short_id") @ExcludeMissing fun _shortId(): JsonField<String> = shortId

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<Long> = updatedAt

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

                /** Returns a mutable builder for constructing an instance of [Steps]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Steps]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var address: JsonField<String> = JsonMissing.of()
                private var arrival: JsonField<Long> = JsonMissing.of()
                private var completion: JsonField<Completion> = JsonMissing.of()
                private var createdAt: JsonField<Long> = JsonMissing.of()
                private var documentSnapshot: JsonField<MutableList<JsonValue>>? = null
                private var duration: JsonField<Long> = JsonMissing.of()
                private var location: JsonField<MutableList<Double>>? = null
                private var meta: JsonField<Meta> = JsonMissing.of()
                private var shortId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var updatedAt: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(steps: Steps) = apply {
                    id = steps.id
                    address = steps.address
                    arrival = steps.arrival
                    completion = steps.completion
                    createdAt = steps.createdAt
                    documentSnapshot = steps.documentSnapshot.map { it.toMutableList() }
                    duration = steps.duration
                    location = steps.location.map { it.toMutableList() }
                    meta = steps.meta
                    shortId = steps.shortId
                    type = steps.type
                    updatedAt = steps.updatedAt
                    additionalProperties = steps.additionalProperties.toMutableMap()
                }

                /** Returns the unique ID of the step. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Returns the postal address where the step is executed. Its value is the same as
                 * that specified in the input request when configuring the step details.
                 */
                fun address(address: String) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<String>) = apply { this.address = address }

                /**
                 * Returns the scheduled arrival time of the driver at the step as an UNIX
                 * timestamp, in seconds precision. It is the same as that specified in the input
                 * request while configuring the step details.
                 *
                 * The timestamp returned here is only for informative display on the driver's app
                 * and it does not impact or get affected by the route generated.
                 */
                fun arrival(arrival: Long) = arrival(JsonField.of(arrival))

                /**
                 * Sets [Builder.arrival] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.arrival] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun arrival(arrival: JsonField<Long>) = apply { this.arrival = arrival }

                /** Returns the completion status of the step. */
                fun completion(completion: Completion) = completion(JsonField.of(completion))

                /**
                 * Sets [Builder.completion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.completion] with a well-typed [Completion] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun completion(completion: JsonField<Completion>) = apply {
                    this.completion = completion
                }

                /**
                 * Returns the UNIX timestamp, in seconds precision, at which this step was created.
                 */
                fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

                /**
                 * Returns the details of the document that was used for collecting the proof of
                 * completion for the step. In case no document template ID was provided for the
                 * given step, then a `null` value is returned. Each object represents a new field
                 * in the document.
                 */
                fun documentSnapshot(documentSnapshot: List<JsonValue>) =
                    documentSnapshot(JsonField.of(documentSnapshot))

                /**
                 * Sets [Builder.documentSnapshot] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.documentSnapshot] with a well-typed
                 * `List<JsonValue>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun documentSnapshot(documentSnapshot: JsonField<List<JsonValue>>) = apply {
                    this.documentSnapshot = documentSnapshot.map { it.toMutableList() }
                }

                /**
                 * Adds a single [JsonValue] to [Builder.documentSnapshot].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDocumentSnapshot(documentSnapshot: JsonValue) = apply {
                    this.documentSnapshot =
                        (this.documentSnapshot ?: JsonField.of(mutableListOf())).also {
                            checkKnown("documentSnapshot", it).add(documentSnapshot)
                        }
                }

                /** Returns the duration for `layover` or `break` type steps. */
                fun duration(duration: Long) = duration(JsonField.of(duration))

                /**
                 * Sets [Builder.duration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.duration] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

                /** Returns the location coordinates where the step is executed. */
                fun location(location: List<Double>) = location(JsonField.of(location))

                /**
                 * Sets [Builder.location] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.location] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun location(location: JsonField<List<Double>>) = apply {
                    this.location = location.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.location].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLocation(location: Double) = apply {
                    this.location =
                        (this.location ?: JsonField.of(mutableListOf())).also {
                            checkKnown("location", it).add(location)
                        }
                }

                /**
                 * An object returning custom details about the step that were configured in the
                 * input request while configuring the step details. The information returned here
                 * will be available for display on the Driver's app under step details.
                 */
                fun meta(meta: Meta) = meta(JsonField.of(meta))

                /**
                 * Sets [Builder.meta] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.meta] with a well-typed [Meta] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

                /**
                 * Returns a unique short ID of the step for easier referencing and displaying
                 * purposes.
                 */
                fun shortId(shortId: String) = shortId(JsonField.of(shortId))

                /**
                 * Sets [Builder.shortId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shortId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun shortId(shortId: JsonField<String>) = apply { this.shortId = shortId }

                /**
                 * Returns the step type. It can belong to one of the following: `start`, `job` ,
                 * `pickup`, `delivery`, `break`, `layover` , and `end`. For any given step, it
                 * would be the same as that specified in the input request while configuring the
                 * step details.
                 */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

                /**
                 * Returns the UNIX timestamp, in seconds precision, at which this step was last
                 * updated.
                 */
                fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

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
                 * Returns an immutable instance of [Steps].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Steps =
                    Steps(
                        id,
                        address,
                        arrival,
                        completion,
                        createdAt,
                        (documentSnapshot ?: JsonMissing.of()).map { it.toImmutable() },
                        duration,
                        (location ?: JsonMissing.of()).map { it.toImmutable() },
                        meta,
                        shortId,
                        type,
                        updatedAt,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Steps = apply {
                if (validated) {
                    return@apply
                }

                id()
                address()
                arrival()
                completion().ifPresent { it.validate() }
                createdAt()
                documentSnapshot()
                duration()
                location()
                meta().ifPresent { it.validate() }
                shortId()
                type()
                updatedAt()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (address.asKnown().isPresent) 1 else 0) +
                    (if (arrival.asKnown().isPresent) 1 else 0) +
                    (completion.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (documentSnapshot.asKnown().getOrNull()?.size ?: 0) +
                    (if (duration.asKnown().isPresent) 1 else 0) +
                    (location.asKnown().getOrNull()?.size ?: 0) +
                    (meta.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (shortId.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0)

            /** Returns the completion status of the step. */
            class Completion
            private constructor(
                private val status: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<String> = JsonMissing.of()
                ) : this(status, mutableMapOf())

                /**
                 * Returns the status of the step. It can take one of the following values -
                 * "scheduled", "completed".
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun status(): Optional<String> = status.getOptional("status")

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
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

                    /** Returns a mutable builder for constructing an instance of [Completion]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Completion]. */
                class Builder internal constructor() {

                    private var status: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(completion: Completion) = apply {
                        status = completion.status
                        additionalProperties = completion.additionalProperties.toMutableMap()
                    }

                    /**
                     * Returns the status of the step. It can take one of the following values -
                     * "scheduled", "completed".
                     */
                    fun status(status: String) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<String>) = apply { this.status = status }

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
                     * Returns an immutable instance of [Completion].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Completion =
                        Completion(status, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Completion = apply {
                    if (validated) {
                        return@apply
                    }

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
                internal fun validity(): Int = (if (status.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Completion && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(status, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Completion{status=$status, additionalProperties=$additionalProperties}"
            }

            /**
             * An object returning custom details about the step that were configured in the input
             * request while configuring the step details. The information returned here will be
             * available for display on the Driver's app under step details.
             */
            class Meta
            private constructor(
                private val customerName: JsonField<String>,
                private val customerPhoneNumber: JsonField<String>,
                private val instructions: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("customer_name")
                    @ExcludeMissing
                    customerName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("customer_phone_number")
                    @ExcludeMissing
                    customerPhoneNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("instructions")
                    @ExcludeMissing
                    instructions: JsonField<String> = JsonMissing.of(),
                ) : this(customerName, customerPhoneNumber, instructions, mutableMapOf())

                /**
                 * Returns the customer name associated with the step. It can configured in the
                 * input request using the `metadata` attribute of the step.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun customerName(): Optional<String> = customerName.getOptional("customer_name")

                /**
                 * Returns the customer's phone number associated with the step. It can configured
                 * in the input request using the `metadata` attribute of the step.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun customerPhoneNumber(): Optional<String> =
                    customerPhoneNumber.getOptional("customer_phone_number")

                /**
                 * Returns the custom instructions to carry out while performing the task. These
                 * instructions can be provided at the time of configuring the step details in the
                 * input request.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun instructions(): Optional<String> = instructions.getOptional("instructions")

                /**
                 * Returns the raw JSON value of [customerName].
                 *
                 * Unlike [customerName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("customer_name")
                @ExcludeMissing
                fun _customerName(): JsonField<String> = customerName

                /**
                 * Returns the raw JSON value of [customerPhoneNumber].
                 *
                 * Unlike [customerPhoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("customer_phone_number")
                @ExcludeMissing
                fun _customerPhoneNumber(): JsonField<String> = customerPhoneNumber

                /**
                 * Returns the raw JSON value of [instructions].
                 *
                 * Unlike [instructions], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("instructions")
                @ExcludeMissing
                fun _instructions(): JsonField<String> = instructions

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

                    /** Returns a mutable builder for constructing an instance of [Meta]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Meta]. */
                class Builder internal constructor() {

                    private var customerName: JsonField<String> = JsonMissing.of()
                    private var customerPhoneNumber: JsonField<String> = JsonMissing.of()
                    private var instructions: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(meta: Meta) = apply {
                        customerName = meta.customerName
                        customerPhoneNumber = meta.customerPhoneNumber
                        instructions = meta.instructions
                        additionalProperties = meta.additionalProperties.toMutableMap()
                    }

                    /**
                     * Returns the customer name associated with the step. It can configured in the
                     * input request using the `metadata` attribute of the step.
                     */
                    fun customerName(customerName: String) =
                        customerName(JsonField.of(customerName))

                    /**
                     * Sets [Builder.customerName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.customerName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun customerName(customerName: JsonField<String>) = apply {
                        this.customerName = customerName
                    }

                    /**
                     * Returns the customer's phone number associated with the step. It can
                     * configured in the input request using the `metadata` attribute of the step.
                     */
                    fun customerPhoneNumber(customerPhoneNumber: String) =
                        customerPhoneNumber(JsonField.of(customerPhoneNumber))

                    /**
                     * Sets [Builder.customerPhoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.customerPhoneNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun customerPhoneNumber(customerPhoneNumber: JsonField<String>) = apply {
                        this.customerPhoneNumber = customerPhoneNumber
                    }

                    /**
                     * Returns the custom instructions to carry out while performing the task. These
                     * instructions can be provided at the time of configuring the step details in
                     * the input request.
                     */
                    fun instructions(instructions: String) =
                        instructions(JsonField.of(instructions))

                    /**
                     * Sets [Builder.instructions] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.instructions] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun instructions(instructions: JsonField<String>) = apply {
                        this.instructions = instructions
                    }

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
                     * Returns an immutable instance of [Meta].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Meta =
                        Meta(
                            customerName,
                            customerPhoneNumber,
                            instructions,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Meta = apply {
                    if (validated) {
                        return@apply
                    }

                    customerName()
                    customerPhoneNumber()
                    instructions()
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
                    (if (customerName.asKnown().isPresent) 1 else 0) +
                        (if (customerPhoneNumber.asKnown().isPresent) 1 else 0) +
                        (if (instructions.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Meta && customerName == other.customerName && customerPhoneNumber == other.customerPhoneNumber && instructions == other.instructions && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(customerName, customerPhoneNumber, instructions, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Meta{customerName=$customerName, customerPhoneNumber=$customerPhoneNumber, instructions=$instructions, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Steps && id == other.id && address == other.address && arrival == other.arrival && completion == other.completion && createdAt == other.createdAt && documentSnapshot == other.documentSnapshot && duration == other.duration && location == other.location && meta == other.meta && shortId == other.shortId && type == other.type && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, address, arrival, completion, createdAt, documentSnapshot, duration, location, meta, shortId, type, updatedAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Steps{id=$id, address=$address, arrival=$arrival, completion=$completion, createdAt=$createdAt, documentSnapshot=$documentSnapshot, duration=$duration, location=$location, meta=$meta, shortId=$shortId, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && id == other.id && completedSteps == other.completedSteps && completion == other.completion && createdAt == other.createdAt && distance == other.distance && documentSnapshot == other.documentSnapshot && driver == other.driver && roRequestId == other.roRequestId && routing == other.routing && shortId == other.shortId && steps == other.steps && totalSteps == other.totalSteps && updatedAt == other.updatedAt && vehicleId == other.vehicleId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, completedSteps, completion, createdAt, distance, documentSnapshot, driver, roRequestId, routing, shortId, steps, totalSteps, updatedAt, vehicleId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, completedSteps=$completedSteps, completion=$completion, createdAt=$createdAt, distance=$distance, documentSnapshot=$documentSnapshot, driver=$driver, roRequestId=$roRequestId, routing=$routing, shortId=$shortId, steps=$steps, totalSteps=$totalSteps, updatedAt=$updatedAt, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RouteRedispatchResponse && data == other.data && message == other.message && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, message, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RouteRedispatchResponse{data=$data, message=$message, status=$status, additionalProperties=$additionalProperties}"
}
