// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.optimization.driverassignment

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.nextbillion_sdk.api.core.Enum
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

class DriverAssignmentAssignResponse
private constructor(
    private val message: JsonField<String>,
    private val result: JsonField<Result>,
    private val status: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Long> = JsonMissing.of(),
    ) : this(message, result, status, mutableMapOf())

    /**
     * Displays indicative error message in case of a failed request or operation. Please note that
     * this parameter is not returned in the response in case of a successful request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * An object containing the details of the assignments.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun result(): Optional<Result> = result.getOptional("result")

    /**
     * An integer indicating the HTTP response code. See the
     * [API Error Handling](https://docs.nextbillion.ai/optimization/driver-assignment-api#api-error-handling)
     * section below for more information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<Long> = status.getOptional("status")

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
         * [DriverAssignmentAssignResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DriverAssignmentAssignResponse]. */
    class Builder internal constructor() {

        private var message: JsonField<String> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var status: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(driverAssignmentAssignResponse: DriverAssignmentAssignResponse) = apply {
            message = driverAssignmentAssignResponse.message
            result = driverAssignmentAssignResponse.result
            status = driverAssignmentAssignResponse.status
            additionalProperties =
                driverAssignmentAssignResponse.additionalProperties.toMutableMap()
        }

        /**
         * Displays indicative error message in case of a failed request or operation. Please note
         * that this parameter is not returned in the response in case of a successful request.
         */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** An object containing the details of the assignments. */
        fun result(result: Result) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [Result] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

        /**
         * An integer indicating the HTTP response code. See the
         * [API Error Handling](https://docs.nextbillion.ai/optimization/driver-assignment-api#api-error-handling)
         * section below for more information.
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
         * Returns an immutable instance of [DriverAssignmentAssignResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DriverAssignmentAssignResponse =
            DriverAssignmentAssignResponse(
                message,
                result,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DriverAssignmentAssignResponse = apply {
        if (validated) {
            return@apply
        }

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
        (if (message.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    /** An object containing the details of the assignments. */
    class Result
    private constructor(
        private val alternateAssignments: JsonField<List<AlternateAssignment>>,
        private val availableVehicles: JsonField<List<String>>,
        private val trips: JsonField<List<Trip>>,
        private val unassignedOrders: JsonField<List<UnassignedOrder>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("alternate_assignments")
            @ExcludeMissing
            alternateAssignments: JsonField<List<AlternateAssignment>> = JsonMissing.of(),
            @JsonProperty("available_vehicles")
            @ExcludeMissing
            availableVehicles: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("trips") @ExcludeMissing trips: JsonField<List<Trip>> = JsonMissing.of(),
            @JsonProperty("unassigned_orders")
            @ExcludeMissing
            unassignedOrders: JsonField<List<UnassignedOrder>> = JsonMissing.of(),
        ) : this(alternateAssignments, availableVehicles, trips, unassignedOrders, mutableMapOf())

        /**
         * An array of objects containing the details of the potential, alternate vehicle
         * assignments for the orders in the input. This attribute will not be returned in the
         * response if the `alternate_assignments` was not provided in the input. Each object
         * represents alternate assignments for a single order.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun alternateAssignments(): Optional<List<AlternateAssignment>> =
            alternateAssignments.getOptional("alternate_assignments")

        /**
         * A collection of vehicles IDs that were not assigned to any orders. A `null` value is
         * returned if there are no vehicles without an order assignment.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun availableVehicles(): Optional<List<String>> =
            availableVehicles.getOptional("available_vehicles")

        /**
         * An collection of objects returning the trip details for each vehicle which was assigned
         * to an order. Each object corresponds to one vehicle.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun trips(): Optional<List<Trip>> = trips.getOptional("trips")

        /**
         * A collection of objects listing the details of orders which remained unassigned. Each
         * object represents a single order. A `null` value is returned if there are no unassigned
         * orders.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun unassignedOrders(): Optional<List<UnassignedOrder>> =
            unassignedOrders.getOptional("unassigned_orders")

        /**
         * Returns the raw JSON value of [alternateAssignments].
         *
         * Unlike [alternateAssignments], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("alternate_assignments")
        @ExcludeMissing
        fun _alternateAssignments(): JsonField<List<AlternateAssignment>> = alternateAssignments

        /**
         * Returns the raw JSON value of [availableVehicles].
         *
         * Unlike [availableVehicles], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("available_vehicles")
        @ExcludeMissing
        fun _availableVehicles(): JsonField<List<String>> = availableVehicles

        /**
         * Returns the raw JSON value of [trips].
         *
         * Unlike [trips], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trips") @ExcludeMissing fun _trips(): JsonField<List<Trip>> = trips

        /**
         * Returns the raw JSON value of [unassignedOrders].
         *
         * Unlike [unassignedOrders], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("unassigned_orders")
        @ExcludeMissing
        fun _unassignedOrders(): JsonField<List<UnassignedOrder>> = unassignedOrders

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

            private var alternateAssignments: JsonField<MutableList<AlternateAssignment>>? = null
            private var availableVehicles: JsonField<MutableList<String>>? = null
            private var trips: JsonField<MutableList<Trip>>? = null
            private var unassignedOrders: JsonField<MutableList<UnassignedOrder>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                alternateAssignments = result.alternateAssignments.map { it.toMutableList() }
                availableVehicles = result.availableVehicles.map { it.toMutableList() }
                trips = result.trips.map { it.toMutableList() }
                unassignedOrders = result.unassignedOrders.map { it.toMutableList() }
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /**
             * An array of objects containing the details of the potential, alternate vehicle
             * assignments for the orders in the input. This attribute will not be returned in the
             * response if the `alternate_assignments` was not provided in the input. Each object
             * represents alternate assignments for a single order.
             */
            fun alternateAssignments(alternateAssignments: List<AlternateAssignment>) =
                alternateAssignments(JsonField.of(alternateAssignments))

            /**
             * Sets [Builder.alternateAssignments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alternateAssignments] with a well-typed
             * `List<AlternateAssignment>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun alternateAssignments(alternateAssignments: JsonField<List<AlternateAssignment>>) =
                apply {
                    this.alternateAssignments = alternateAssignments.map { it.toMutableList() }
                }

            /**
             * Adds a single [AlternateAssignment] to [alternateAssignments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAlternateAssignment(alternateAssignment: AlternateAssignment) = apply {
                alternateAssignments =
                    (alternateAssignments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("alternateAssignments", it).add(alternateAssignment)
                    }
            }

            /**
             * A collection of vehicles IDs that were not assigned to any orders. A `null` value is
             * returned if there are no vehicles without an order assignment.
             */
            fun availableVehicles(availableVehicles: List<String>) =
                availableVehicles(JsonField.of(availableVehicles))

            /**
             * Sets [Builder.availableVehicles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.availableVehicles] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun availableVehicles(availableVehicles: JsonField<List<String>>) = apply {
                this.availableVehicles = availableVehicles.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [availableVehicles].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAvailableVehicle(availableVehicle: String) = apply {
                availableVehicles =
                    (availableVehicles ?: JsonField.of(mutableListOf())).also {
                        checkKnown("availableVehicles", it).add(availableVehicle)
                    }
            }

            /**
             * An collection of objects returning the trip details for each vehicle which was
             * assigned to an order. Each object corresponds to one vehicle.
             */
            fun trips(trips: List<Trip>) = trips(JsonField.of(trips))

            /**
             * Sets [Builder.trips] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trips] with a well-typed `List<Trip>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trips(trips: JsonField<List<Trip>>) = apply {
                this.trips = trips.map { it.toMutableList() }
            }

            /**
             * Adds a single [Trip] to [trips].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTrip(trip: Trip) = apply {
                trips =
                    (trips ?: JsonField.of(mutableListOf())).also {
                        checkKnown("trips", it).add(trip)
                    }
            }

            /**
             * A collection of objects listing the details of orders which remained unassigned. Each
             * object represents a single order. A `null` value is returned if there are no
             * unassigned orders.
             */
            fun unassignedOrders(unassignedOrders: List<UnassignedOrder>) =
                unassignedOrders(JsonField.of(unassignedOrders))

            /**
             * Sets [Builder.unassignedOrders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unassignedOrders] with a well-typed
             * `List<UnassignedOrder>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun unassignedOrders(unassignedOrders: JsonField<List<UnassignedOrder>>) = apply {
                this.unassignedOrders = unassignedOrders.map { it.toMutableList() }
            }

            /**
             * Adds a single [UnassignedOrder] to [unassignedOrders].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUnassignedOrder(unassignedOrder: UnassignedOrder) = apply {
                unassignedOrders =
                    (unassignedOrders ?: JsonField.of(mutableListOf())).also {
                        checkKnown("unassignedOrders", it).add(unassignedOrder)
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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Result =
                Result(
                    (alternateAssignments ?: JsonMissing.of()).map { it.toImmutable() },
                    (availableVehicles ?: JsonMissing.of()).map { it.toImmutable() },
                    (trips ?: JsonMissing.of()).map { it.toImmutable() },
                    (unassignedOrders ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            alternateAssignments().ifPresent { it.forEach { it.validate() } }
            availableVehicles()
            trips().ifPresent { it.forEach { it.validate() } }
            unassignedOrders().ifPresent { it.forEach { it.validate() } }
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
            (alternateAssignments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (availableVehicles.asKnown().getOrNull()?.size ?: 0) +
                (trips.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (unassignedOrders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class AlternateAssignment
        private constructor(
            private val assignments: JsonField<List<Assignment>>,
            private val orderId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("assignments")
                @ExcludeMissing
                assignments: JsonField<List<Assignment>> = JsonMissing.of(),
                @JsonProperty("order_id")
                @ExcludeMissing
                orderId: JsonField<String> = JsonMissing.of(),
            ) : this(assignments, orderId, mutableMapOf())

            /**
             * An array of objects containing the details of the alternate vehicle assignments. Each
             * object represents an alternate vehicle assignment.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun assignments(): Optional<List<Assignment>> = assignments.getOptional("assignments")

            /**
             * Returns the order ID associated with the alternate assignments.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun orderId(): Optional<String> = orderId.getOptional("order_id")

            /**
             * Returns the raw JSON value of [assignments].
             *
             * Unlike [assignments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("assignments")
            @ExcludeMissing
            fun _assignments(): JsonField<List<Assignment>> = assignments

            /**
             * Returns the raw JSON value of [orderId].
             *
             * Unlike [orderId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("order_id") @ExcludeMissing fun _orderId(): JsonField<String> = orderId

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
                 * Returns a mutable builder for constructing an instance of [AlternateAssignment].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AlternateAssignment]. */
            class Builder internal constructor() {

                private var assignments: JsonField<MutableList<Assignment>>? = null
                private var orderId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(alternateAssignment: AlternateAssignment) = apply {
                    assignments = alternateAssignment.assignments.map { it.toMutableList() }
                    orderId = alternateAssignment.orderId
                    additionalProperties = alternateAssignment.additionalProperties.toMutableMap()
                }

                /**
                 * An array of objects containing the details of the alternate vehicle assignments.
                 * Each object represents an alternate vehicle assignment.
                 */
                fun assignments(assignments: List<Assignment>) =
                    assignments(JsonField.of(assignments))

                /**
                 * Sets [Builder.assignments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assignments] with a well-typed
                 * `List<Assignment>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun assignments(assignments: JsonField<List<Assignment>>) = apply {
                    this.assignments = assignments.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Assignment] to [assignments].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAssignment(assignment: Assignment) = apply {
                    assignments =
                        (assignments ?: JsonField.of(mutableListOf())).also {
                            checkKnown("assignments", it).add(assignment)
                        }
                }

                /** Returns the order ID associated with the alternate assignments. */
                fun orderId(orderId: String) = orderId(JsonField.of(orderId))

                /**
                 * Sets [Builder.orderId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.orderId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun orderId(orderId: JsonField<String>) = apply { this.orderId = orderId }

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
                 * Returns an immutable instance of [AlternateAssignment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AlternateAssignment =
                    AlternateAssignment(
                        (assignments ?: JsonMissing.of()).map { it.toImmutable() },
                        orderId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AlternateAssignment = apply {
                if (validated) {
                    return@apply
                }

                assignments().ifPresent { it.forEach { it.validate() } }
                orderId()
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
                (assignments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (orderId.asKnown().isPresent) 1 else 0)

            class Assignment
            private constructor(
                private val pickupEta: JsonField<Long>,
                private val vehicleId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("pickup_eta")
                    @ExcludeMissing
                    pickupEta: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("vehicle_id")
                    @ExcludeMissing
                    vehicleId: JsonField<String> = JsonMissing.of(),
                ) : this(pickupEta, vehicleId, mutableMapOf())

                /**
                 * Returns the ETA to the order's pickup location for the given vehicle.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun pickupEta(): Optional<Long> = pickupEta.getOptional("pickup_eta")

                /**
                 * Returns the vehicle ID which could potentially be assigned to the given order.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun vehicleId(): Optional<String> = vehicleId.getOptional("vehicle_id")

                /**
                 * Returns the raw JSON value of [pickupEta].
                 *
                 * Unlike [pickupEta], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("pickup_eta")
                @ExcludeMissing
                fun _pickupEta(): JsonField<Long> = pickupEta

                /**
                 * Returns the raw JSON value of [vehicleId].
                 *
                 * Unlike [vehicleId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("vehicle_id")
                @ExcludeMissing
                fun _vehicleId(): JsonField<String> = vehicleId

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

                    /** Returns a mutable builder for constructing an instance of [Assignment]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Assignment]. */
                class Builder internal constructor() {

                    private var pickupEta: JsonField<Long> = JsonMissing.of()
                    private var vehicleId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(assignment: Assignment) = apply {
                        pickupEta = assignment.pickupEta
                        vehicleId = assignment.vehicleId
                        additionalProperties = assignment.additionalProperties.toMutableMap()
                    }

                    /** Returns the ETA to the order's pickup location for the given vehicle. */
                    fun pickupEta(pickupEta: Long) = pickupEta(JsonField.of(pickupEta))

                    /**
                     * Sets [Builder.pickupEta] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pickupEta] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pickupEta(pickupEta: JsonField<Long>) = apply { this.pickupEta = pickupEta }

                    /**
                     * Returns the vehicle ID which could potentially be assigned to the given
                     * order.
                     */
                    fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

                    /**
                     * Sets [Builder.vehicleId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.vehicleId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun vehicleId(vehicleId: JsonField<String>) = apply {
                        this.vehicleId = vehicleId
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
                     * Returns an immutable instance of [Assignment].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Assignment =
                        Assignment(pickupEta, vehicleId, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Assignment = apply {
                    if (validated) {
                        return@apply
                    }

                    pickupEta()
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
                    (if (pickupEta.asKnown().isPresent) 1 else 0) +
                        (if (vehicleId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Assignment && pickupEta == other.pickupEta && vehicleId == other.vehicleId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(pickupEta, vehicleId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Assignment{pickupEta=$pickupEta, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AlternateAssignment && assignments == other.assignments && orderId == other.orderId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(assignments, orderId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AlternateAssignment{assignments=$assignments, orderId=$orderId, additionalProperties=$additionalProperties}"
        }

        class Trip
        private constructor(
            private val tripId: JsonField<String>,
            private val vehicle: JsonField<Vehicle>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("trip_id")
                @ExcludeMissing
                tripId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("vehicle")
                @ExcludeMissing
                vehicle: JsonField<Vehicle> = JsonMissing.of(),
            ) : this(tripId, vehicle, mutableMapOf())

            /**
             * Returns a unique trip ID.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun tripId(): Optional<String> = tripId.getOptional("trip_id")

            /**
             * Returns the details of the vehicle, assigned order and the trip steps.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun vehicle(): Optional<Vehicle> = vehicle.getOptional("vehicle")

            /**
             * Returns the raw JSON value of [tripId].
             *
             * Unlike [tripId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("trip_id") @ExcludeMissing fun _tripId(): JsonField<String> = tripId

            /**
             * Returns the raw JSON value of [vehicle].
             *
             * Unlike [vehicle], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("vehicle") @ExcludeMissing fun _vehicle(): JsonField<Vehicle> = vehicle

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

                /** Returns a mutable builder for constructing an instance of [Trip]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Trip]. */
            class Builder internal constructor() {

                private var tripId: JsonField<String> = JsonMissing.of()
                private var vehicle: JsonField<Vehicle> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(trip: Trip) = apply {
                    tripId = trip.tripId
                    vehicle = trip.vehicle
                    additionalProperties = trip.additionalProperties.toMutableMap()
                }

                /** Returns a unique trip ID. */
                fun tripId(tripId: String) = tripId(JsonField.of(tripId))

                /**
                 * Sets [Builder.tripId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tripId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tripId(tripId: JsonField<String>) = apply { this.tripId = tripId }

                /** Returns the details of the vehicle, assigned order and the trip steps. */
                fun vehicle(vehicle: Vehicle) = vehicle(JsonField.of(vehicle))

                /**
                 * Sets [Builder.vehicle] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vehicle] with a well-typed [Vehicle] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun vehicle(vehicle: JsonField<Vehicle>) = apply { this.vehicle = vehicle }

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
                 * Returns an immutable instance of [Trip].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Trip = Trip(tripId, vehicle, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Trip = apply {
                if (validated) {
                    return@apply
                }

                tripId()
                vehicle().ifPresent { it.validate() }
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
                (if (tripId.asKnown().isPresent) 1 else 0) +
                    (vehicle.asKnown().getOrNull()?.validity() ?: 0)

            /** Returns the details of the vehicle, assigned order and the trip steps. */
            class Vehicle
            private constructor(
                private val id: JsonField<String>,
                private val steps: JsonField<Steps>,
                private val vehicleCurrentLocation: JsonField<Location>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("steps")
                    @ExcludeMissing
                    steps: JsonField<Steps> = JsonMissing.of(),
                    @JsonProperty("vehicle_current_location")
                    @ExcludeMissing
                    vehicleCurrentLocation: JsonField<Location> = JsonMissing.of(),
                ) : this(id, steps, vehicleCurrentLocation, mutableMapOf())

                /**
                 * Returns the ID of the vehicle.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * A collection of objects returning the sequence of steps that the vehicle needs to
                 * perform for a trip.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun steps(): Optional<Steps> = steps.getOptional("steps")

                /**
                 * Location info.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun vehicleCurrentLocation(): Optional<Location> =
                    vehicleCurrentLocation.getOptional("vehicle_current_location")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [steps].
                 *
                 * Unlike [steps], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("steps") @ExcludeMissing fun _steps(): JsonField<Steps> = steps

                /**
                 * Returns the raw JSON value of [vehicleCurrentLocation].
                 *
                 * Unlike [vehicleCurrentLocation], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("vehicle_current_location")
                @ExcludeMissing
                fun _vehicleCurrentLocation(): JsonField<Location> = vehicleCurrentLocation

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

                    /** Returns a mutable builder for constructing an instance of [Vehicle]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Vehicle]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var steps: JsonField<Steps> = JsonMissing.of()
                    private var vehicleCurrentLocation: JsonField<Location> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(vehicle: Vehicle) = apply {
                        id = vehicle.id
                        steps = vehicle.steps
                        vehicleCurrentLocation = vehicle.vehicleCurrentLocation
                        additionalProperties = vehicle.additionalProperties.toMutableMap()
                    }

                    /** Returns the ID of the vehicle. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * A collection of objects returning the sequence of steps that the vehicle
                     * needs to perform for a trip.
                     */
                    fun steps(steps: Steps) = steps(JsonField.of(steps))

                    /**
                     * Sets [Builder.steps] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.steps] with a well-typed [Steps] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun steps(steps: JsonField<Steps>) = apply { this.steps = steps }

                    /** Location info. */
                    fun vehicleCurrentLocation(vehicleCurrentLocation: Location) =
                        vehicleCurrentLocation(JsonField.of(vehicleCurrentLocation))

                    /**
                     * Sets [Builder.vehicleCurrentLocation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.vehicleCurrentLocation] with a well-typed
                     * [Location] value instead. This method is primarily for setting the field to
                     * an undocumented or not yet supported value.
                     */
                    fun vehicleCurrentLocation(vehicleCurrentLocation: JsonField<Location>) =
                        apply {
                            this.vehicleCurrentLocation = vehicleCurrentLocation
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
                     * Returns an immutable instance of [Vehicle].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Vehicle =
                        Vehicle(
                            id,
                            steps,
                            vehicleCurrentLocation,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Vehicle = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    steps().ifPresent { it.validate() }
                    vehicleCurrentLocation().ifPresent { it.validate() }
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
                        (steps.asKnown().getOrNull()?.validity() ?: 0) +
                        (vehicleCurrentLocation.asKnown().getOrNull()?.validity() ?: 0)

                /**
                 * A collection of objects returning the sequence of steps that the vehicle needs to
                 * perform for a trip.
                 */
                class Steps
                private constructor(
                    private val distance: JsonField<Long>,
                    private val eta: JsonField<Long>,
                    private val location: JsonField<Location>,
                    private val orderId: JsonField<String>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("distance")
                        @ExcludeMissing
                        distance: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("eta")
                        @ExcludeMissing
                        eta: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("location")
                        @ExcludeMissing
                        location: JsonField<Location> = JsonMissing.of(),
                        @JsonProperty("order_id")
                        @ExcludeMissing
                        orderId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(distance, eta, location, orderId, type, mutableMapOf())

                    /**
                     * Returns the driving distance, in meters, to the step's location from previous
                     * step's location. For the first step of a trip, `distance` indicates the
                     * driving distance from `vehicle_current_location` to the step's location.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun distance(): Optional<Long> = distance.getOptional("distance")

                    /**
                     * Returns the driving duration, in seconds, to the step's location from
                     * previous step's location. For the first step of a trip, `eta` indicates the
                     * driving duration from `vehicle_current_location` to the step's location.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun eta(): Optional<Long> = eta.getOptional("eta")

                    /**
                     * Location info.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun location(): Optional<Location> = location.getOptional("location")

                    /**
                     * Returns the ID of the order. In case the step type is **ongoing**, an empty
                     * string is returned.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun orderId(): Optional<String> = orderId.getOptional("order_id")

                    /**
                     * Returns the type of the step. Currently, it can take following values:
                     * - **pickup:** Indicates the pickup step for an order
                     * - **dropoff:** Indicates the dropoff step for an order. It is returned only
                     *   if `dropoff_details` was **true** in the input request.
                     * - **ongoing:** Indicates a step that the vehicle needs to complete on its
                     *   current trip. This is returned in the response only when
                     *   `remaining_waypoints` input was provided for the given vehicle.
                     * - **intermediate_waypoint:** Indicates an intermediate stop that the vehicle
                     *   needs to complete in case multiple dropoffs are provided in the input.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun type(): Optional<Type> = type.getOptional("type")

                    /**
                     * Returns the raw JSON value of [distance].
                     *
                     * Unlike [distance], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("distance")
                    @ExcludeMissing
                    fun _distance(): JsonField<Long> = distance

                    /**
                     * Returns the raw JSON value of [eta].
                     *
                     * Unlike [eta], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("eta") @ExcludeMissing fun _eta(): JsonField<Long> = eta

                    /**
                     * Returns the raw JSON value of [location].
                     *
                     * Unlike [location], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("location")
                    @ExcludeMissing
                    fun _location(): JsonField<Location> = location

                    /**
                     * Returns the raw JSON value of [orderId].
                     *
                     * Unlike [orderId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("order_id")
                    @ExcludeMissing
                    fun _orderId(): JsonField<String> = orderId

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

                        private var distance: JsonField<Long> = JsonMissing.of()
                        private var eta: JsonField<Long> = JsonMissing.of()
                        private var location: JsonField<Location> = JsonMissing.of()
                        private var orderId: JsonField<String> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(steps: Steps) = apply {
                            distance = steps.distance
                            eta = steps.eta
                            location = steps.location
                            orderId = steps.orderId
                            type = steps.type
                            additionalProperties = steps.additionalProperties.toMutableMap()
                        }

                        /**
                         * Returns the driving distance, in meters, to the step's location from
                         * previous step's location. For the first step of a trip, `distance`
                         * indicates the driving distance from `vehicle_current_location` to the
                         * step's location.
                         */
                        fun distance(distance: Long) = distance(JsonField.of(distance))

                        /**
                         * Sets [Builder.distance] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.distance] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun distance(distance: JsonField<Long>) = apply { this.distance = distance }

                        /**
                         * Returns the driving duration, in seconds, to the step's location from
                         * previous step's location. For the first step of a trip, `eta` indicates
                         * the driving duration from `vehicle_current_location` to the step's
                         * location.
                         */
                        fun eta(eta: Long) = eta(JsonField.of(eta))

                        /**
                         * Sets [Builder.eta] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.eta] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun eta(eta: JsonField<Long>) = apply { this.eta = eta }

                        /** Location info. */
                        fun location(location: Location) = location(JsonField.of(location))

                        /**
                         * Sets [Builder.location] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.location] with a well-typed [Location]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun location(location: JsonField<Location>) = apply {
                            this.location = location
                        }

                        /**
                         * Returns the ID of the order. In case the step type is **ongoing**, an
                         * empty string is returned.
                         */
                        fun orderId(orderId: String) = orderId(JsonField.of(orderId))

                        /**
                         * Sets [Builder.orderId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.orderId] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun orderId(orderId: JsonField<String>) = apply { this.orderId = orderId }

                        /**
                         * Returns the type of the step. Currently, it can take following values:
                         * - **pickup:** Indicates the pickup step for an order
                         * - **dropoff:** Indicates the dropoff step for an order. It is returned
                         *   only if `dropoff_details` was **true** in the input request.
                         * - **ongoing:** Indicates a step that the vehicle needs to complete on its
                         *   current trip. This is returned in the response only when
                         *   `remaining_waypoints` input was provided for the given vehicle.
                         * - **intermediate_waypoint:** Indicates an intermediate stop that the
                         *   vehicle needs to complete in case multiple dropoffs are provided in the
                         *   input.
                         */
                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                                distance,
                                eta,
                                location,
                                orderId,
                                type,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Steps = apply {
                        if (validated) {
                            return@apply
                        }

                        distance()
                        eta()
                        location().ifPresent { it.validate() }
                        orderId()
                        type().ifPresent { it.validate() }
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
                        (if (distance.asKnown().isPresent) 1 else 0) +
                            (if (eta.asKnown().isPresent) 1 else 0) +
                            (location.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (orderId.asKnown().isPresent) 1 else 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    /**
                     * Returns the type of the step. Currently, it can take following values:
                     * - **pickup:** Indicates the pickup step for an order
                     * - **dropoff:** Indicates the dropoff step for an order. It is returned only
                     *   if `dropoff_details` was **true** in the input request.
                     * - **ongoing:** Indicates a step that the vehicle needs to complete on its
                     *   current trip. This is returned in the response only when
                     *   `remaining_waypoints` input was provided for the given vehicle.
                     * - **intermediate_waypoint:** Indicates an intermediate stop that the vehicle
                     *   needs to complete in case multiple dropoffs are provided in the input.
                     */
                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PICKUP = of("pickup")

                            @JvmField val DROPOFF = of("dropoff")

                            @JvmField val ONGOING = of("ongoing")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PICKUP,
                            DROPOFF,
                            ONGOING,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PICKUP,
                            DROPOFF,
                            ONGOING,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PICKUP -> Value.PICKUP
                                DROPOFF -> Value.DROPOFF
                                ONGOING -> Value.ONGOING
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws NextbillionSdkInvalidDataException if this class instance's value
                         *   is a not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PICKUP -> Known.PICKUP
                                DROPOFF -> Known.DROPOFF
                                ONGOING -> Known.ONGOING
                                else ->
                                    throw NextbillionSdkInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws NextbillionSdkInvalidDataException if this class instance's value
                         *   does not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                NextbillionSdkInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Type = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Steps && distance == other.distance && eta == other.eta && location == other.location && orderId == other.orderId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(distance, eta, location, orderId, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Steps{distance=$distance, eta=$eta, location=$location, orderId=$orderId, type=$type, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Vehicle && id == other.id && steps == other.steps && vehicleCurrentLocation == other.vehicleCurrentLocation && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, steps, vehicleCurrentLocation, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Vehicle{id=$id, steps=$steps, vehicleCurrentLocation=$vehicleCurrentLocation, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Trip && tripId == other.tripId && vehicle == other.vehicle && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(tripId, vehicle, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Trip{tripId=$tripId, vehicle=$vehicle, additionalProperties=$additionalProperties}"
        }

        class UnassignedOrder
        private constructor(
            private val orderId: JsonField<String>,
            private val unassignedReason: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("order_id")
                @ExcludeMissing
                orderId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("unassigned_reason")
                @ExcludeMissing
                unassignedReason: JsonField<String> = JsonMissing.of(),
            ) : this(orderId, unassignedReason, mutableMapOf())

            /**
             * Returns the ID of the order which remained unassigned.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun orderId(): Optional<String> = orderId.getOptional("order_id")

            /**
             * Returns the most probable reason due to which the order remained unassigned.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun unassignedReason(): Optional<String> =
                unassignedReason.getOptional("unassigned_reason")

            /**
             * Returns the raw JSON value of [orderId].
             *
             * Unlike [orderId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("order_id") @ExcludeMissing fun _orderId(): JsonField<String> = orderId

            /**
             * Returns the raw JSON value of [unassignedReason].
             *
             * Unlike [unassignedReason], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("unassigned_reason")
            @ExcludeMissing
            fun _unassignedReason(): JsonField<String> = unassignedReason

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

                /** Returns a mutable builder for constructing an instance of [UnassignedOrder]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnassignedOrder]. */
            class Builder internal constructor() {

                private var orderId: JsonField<String> = JsonMissing.of()
                private var unassignedReason: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unassignedOrder: UnassignedOrder) = apply {
                    orderId = unassignedOrder.orderId
                    unassignedReason = unassignedOrder.unassignedReason
                    additionalProperties = unassignedOrder.additionalProperties.toMutableMap()
                }

                /** Returns the ID of the order which remained unassigned. */
                fun orderId(orderId: String) = orderId(JsonField.of(orderId))

                /**
                 * Sets [Builder.orderId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.orderId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun orderId(orderId: JsonField<String>) = apply { this.orderId = orderId }

                /** Returns the most probable reason due to which the order remained unassigned. */
                fun unassignedReason(unassignedReason: String) =
                    unassignedReason(JsonField.of(unassignedReason))

                /**
                 * Sets [Builder.unassignedReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unassignedReason] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun unassignedReason(unassignedReason: JsonField<String>) = apply {
                    this.unassignedReason = unassignedReason
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
                 * Returns an immutable instance of [UnassignedOrder].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnassignedOrder =
                    UnassignedOrder(orderId, unassignedReason, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): UnassignedOrder = apply {
                if (validated) {
                    return@apply
                }

                orderId()
                unassignedReason()
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
                (if (orderId.asKnown().isPresent) 1 else 0) +
                    (if (unassignedReason.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnassignedOrder && orderId == other.orderId && unassignedReason == other.unassignedReason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(orderId, unassignedReason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnassignedOrder{orderId=$orderId, unassignedReason=$unassignedReason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Result && alternateAssignments == other.alternateAssignments && availableVehicles == other.availableVehicles && trips == other.trips && unassignedOrders == other.unassignedOrders && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(alternateAssignments, availableVehicles, trips, unassignedOrders, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{alternateAssignments=$alternateAssignments, availableVehicles=$availableVehicles, trips=$trips, unassignedOrders=$unassignedOrders, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DriverAssignmentAssignResponse && message == other.message && result == other.result && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(message, result, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DriverAssignmentAssignResponse{message=$message, result=$result, status=$status, additionalProperties=$additionalProperties}"
}
