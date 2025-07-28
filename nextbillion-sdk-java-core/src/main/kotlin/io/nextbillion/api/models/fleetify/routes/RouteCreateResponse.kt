// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.fleetify.routes

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
import io.nextbillion.api.models.fleetify.routes.steps.RouteStepsResponse
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RouteCreateResponse
private constructor(
    private val data: JsonField<Data>,
    private val status: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Long> = JsonMissing.of(),
    ) : this(data, status, mutableMapOf())

    /**
     * An array of objects containing the details of each step in the dispatched route. Each object
     * represents a single step.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

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

        /** Returns a mutable builder for constructing an instance of [RouteCreateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RouteCreateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var status: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(routeCreateResponse: RouteCreateResponse) = apply {
            data = routeCreateResponse.data
            status = routeCreateResponse.status
            additionalProperties = routeCreateResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [RouteCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RouteCreateResponse =
            RouteCreateResponse(data, status, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): RouteCreateResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
        (data.asKnown().getOrNull()?.validity() ?: 0) + (if (status.asKnown().isPresent) 1 else 0)

    /**
     * An array of objects containing the details of each step in the dispatched route. Each object
     * represents a single step.
     */
    class Data
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<Long>,
        private val distance: JsonField<Long>,
        private val documentSnapshot: JsonField<List<JsonValue>>,
        private val driver: JsonField<Driver>,
        private val roRequestId: JsonField<String>,
        private val routing: JsonField<RoutingResponse>,
        private val shortId: JsonField<String>,
        private val steps: JsonField<List<RouteStepsResponse>>,
        private val totalSteps: JsonField<Long>,
        private val updatedAt: JsonField<Long>,
        private val vehicleId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("steps")
            @ExcludeMissing
            steps: JsonField<List<RouteStepsResponse>> = JsonMissing.of(),
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
         * Returns the unique ID of the dispatched route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

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
         * Returns a shorter unique ID of the dispatched route for easier referencing and displaying
         * purposes.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun shortId(): Optional<String> = shortId.getOptional("short_id")

        /**
         * An array of objects containing the details of all steps to be performed as part of the
         * dispatched route. Each object represents a single step during the route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun steps(): Optional<List<RouteStepsResponse>> = steps.getOptional("steps")

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
        @JsonProperty("steps")
        @ExcludeMissing
        fun _steps(): JsonField<List<RouteStepsResponse>> = steps

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
            private var createdAt: JsonField<Long> = JsonMissing.of()
            private var distance: JsonField<Long> = JsonMissing.of()
            private var documentSnapshot: JsonField<MutableList<JsonValue>>? = null
            private var driver: JsonField<Driver> = JsonMissing.of()
            private var roRequestId: JsonField<String> = JsonMissing.of()
            private var routing: JsonField<RoutingResponse> = JsonMissing.of()
            private var shortId: JsonField<String> = JsonMissing.of()
            private var steps: JsonField<MutableList<RouteStepsResponse>>? = null
            private var totalSteps: JsonField<Long> = JsonMissing.of()
            private var updatedAt: JsonField<Long> = JsonMissing.of()
            private var vehicleId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                createdAt = data.createdAt
                distance = data.distance
                documentSnapshot = data.documentSnapshot.map { it.toMutableList() }
                driver = data.driver
                roRequestId = data.roRequestId
                routing = data.routing
                shortId = data.shortId
                steps = data.steps.map { it.toMutableList() }
                totalSteps = data.totalSteps
                updatedAt = data.updatedAt
                vehicleId = data.vehicleId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Returns the unique ID of the dispatched route. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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
             * Returns a shorter unique ID of the dispatched route for easier referencing and
             * displaying purposes.
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

            /**
             * An array of objects containing the details of all steps to be performed as part of
             * the dispatched route. Each object represents a single step during the route.
             */
            fun steps(steps: List<RouteStepsResponse>) = steps(JsonField.of(steps))

            /**
             * Sets [Builder.steps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.steps] with a well-typed `List<RouteStepsResponse>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun steps(steps: JsonField<List<RouteStepsResponse>>) = apply {
                this.steps = steps.map { it.toMutableList() }
            }

            /**
             * Adds a single [RouteStepsResponse] to [steps].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStep(step: RouteStepsResponse) = apply {
                steps =
                    (steps ?: JsonField.of(mutableListOf())).also {
                        checkKnown("steps", it).add(step)
                    }
            }

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
                    createdAt,
                    distance,
                    (documentSnapshot ?: JsonMissing.of()).map { it.toImmutable() },
                    driver,
                    roRequestId,
                    routing,
                    shortId,
                    (steps ?: JsonMissing.of()).map { it.toImmutable() },
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
            createdAt()
            distance()
            documentSnapshot()
            driver().ifPresent { it.validate() }
            roRequestId()
            routing().ifPresent { it.validate() }
            shortId()
            steps().ifPresent { it.forEach { it.validate() } }
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (distance.asKnown().isPresent) 1 else 0) +
                (documentSnapshot.asKnown().getOrNull()?.size ?: 0) +
                (driver.asKnown().getOrNull()?.validity() ?: 0) +
                (if (roRequestId.asKnown().isPresent) 1 else 0) +
                (routing.asKnown().getOrNull()?.validity() ?: 0) +
                (if (shortId.asKnown().isPresent) 1 else 0) +
                (steps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (totalSteps.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (vehicleId.asKnown().isPresent) 1 else 0)

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && id == other.id && createdAt == other.createdAt && distance == other.distance && documentSnapshot == other.documentSnapshot && driver == other.driver && roRequestId == other.roRequestId && routing == other.routing && shortId == other.shortId && steps == other.steps && totalSteps == other.totalSteps && updatedAt == other.updatedAt && vehicleId == other.vehicleId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, createdAt, distance, documentSnapshot, driver, roRequestId, routing, shortId, steps, totalSteps, updatedAt, vehicleId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, createdAt=$createdAt, distance=$distance, documentSnapshot=$documentSnapshot, driver=$driver, roRequestId=$roRequestId, routing=$routing, shortId=$shortId, steps=$steps, totalSteps=$totalSteps, updatedAt=$updatedAt, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RouteCreateResponse && data == other.data && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RouteCreateResponse{data=$data, status=$status, additionalProperties=$additionalProperties}"
}
