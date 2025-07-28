// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.optimization.driverassignment

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.nextbillion.api.core.Enum
import io.nextbillion.api.core.ExcludeMissing
import io.nextbillion.api.core.JsonField
import io.nextbillion.api.core.JsonMissing
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.Params
import io.nextbillion.api.core.checkKnown
import io.nextbillion.api.core.checkRequired
import io.nextbillion.api.core.http.Headers
import io.nextbillion.api.core.http.QueryParams
import io.nextbillion.api.core.toImmutable
import io.nextbillion.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Assigns available drivers (vehicles) to open orders based on specified criteria and constraints.
 */
class DriverAssignmentAssignParams
private constructor(
    private val key: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * Specify the filtering criterion for the vehicles with respect to each order's location.
     * `filter` is a mandatory input for all requests.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filter(): Filter = body.filter()

    /**
     * Collects the details of open orders to be fulfilled. Each object represents one order. All
     * requests must include `orders` as a mandatory input. A maximum of 200 orders is allowed per
     * request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun orders(): List<Order> = body.orders()

    /**
     * Collects the details of vehicles available to fulfill the orders. Each object represents one
     * vehicle. All requests must include `vehicles` as a mandatory input. A maximum of 100 vehicles
     * is allowed per request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vehicles(): List<Vehicle> = body.vehicles()

    /**
     * Configure the assignment constraints and response settings.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun options(): Optional<Options> = body.options()

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filter(): JsonField<Filter> = body._filter()

    /**
     * Returns the raw JSON value of [orders].
     *
     * Unlike [orders], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _orders(): JsonField<List<Order>> = body._orders()

    /**
     * Returns the raw JSON value of [vehicles].
     *
     * Unlike [vehicles], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vehicles(): JsonField<List<Vehicle>> = body._vehicles()

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _options(): JsonField<Options> = body._options()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DriverAssignmentAssignParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .filter()
         * .orders()
         * .vehicles()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DriverAssignmentAssignParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(driverAssignmentAssignParams: DriverAssignmentAssignParams) = apply {
            key = driverAssignmentAssignParams.key
            body = driverAssignmentAssignParams.body.toBuilder()
            additionalHeaders = driverAssignmentAssignParams.additionalHeaders.toBuilder()
            additionalQueryParams = driverAssignmentAssignParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [filter]
         * - [orders]
         * - [vehicles]
         * - [options]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Specify the filtering criterion for the vehicles with respect to each order's location.
         * `filter` is a mandatory input for all requests.
         */
        fun filter(filter: Filter) = apply { body.filter(filter) }

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [Filter] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<Filter>) = apply { body.filter(filter) }

        /**
         * Collects the details of open orders to be fulfilled. Each object represents one order.
         * All requests must include `orders` as a mandatory input. A maximum of 200 orders is
         * allowed per request.
         */
        fun orders(orders: List<Order>) = apply { body.orders(orders) }

        /**
         * Sets [Builder.orders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orders] with a well-typed `List<Order>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun orders(orders: JsonField<List<Order>>) = apply { body.orders(orders) }

        /**
         * Adds a single [Order] to [orders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOrder(order: Order) = apply { body.addOrder(order) }

        /**
         * Collects the details of vehicles available to fulfill the orders. Each object represents
         * one vehicle. All requests must include `vehicles` as a mandatory input. A maximum of 100
         * vehicles is allowed per request.
         */
        fun vehicles(vehicles: List<Vehicle>) = apply { body.vehicles(vehicles) }

        /**
         * Sets [Builder.vehicles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vehicles] with a well-typed `List<Vehicle>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vehicles(vehicles: JsonField<List<Vehicle>>) = apply { body.vehicles(vehicles) }

        /**
         * Adds a single [Vehicle] to [vehicles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVehicle(vehicle: Vehicle) = apply { body.addVehicle(vehicle) }

        /** Configure the assignment constraints and response settings. */
        fun options(options: Options) = apply { body.options(options) }

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed [Options] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun options(options: JsonField<Options>) = apply { body.options(options) }

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
         * Returns an immutable instance of [DriverAssignmentAssignParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .filter()
         * .orders()
         * .vehicles()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DriverAssignmentAssignParams =
            DriverAssignmentAssignParams(
                checkRequired("key", key),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

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
        private val filter: JsonField<Filter>,
        private val orders: JsonField<List<Order>>,
        private val vehicles: JsonField<List<Vehicle>>,
        private val options: JsonField<Options>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<Filter> = JsonMissing.of(),
            @JsonProperty("orders")
            @ExcludeMissing
            orders: JsonField<List<Order>> = JsonMissing.of(),
            @JsonProperty("vehicles")
            @ExcludeMissing
            vehicles: JsonField<List<Vehicle>> = JsonMissing.of(),
            @JsonProperty("options") @ExcludeMissing options: JsonField<Options> = JsonMissing.of(),
        ) : this(filter, orders, vehicles, options, mutableMapOf())

        /**
         * Specify the filtering criterion for the vehicles with respect to each order's location.
         * `filter` is a mandatory input for all requests.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filter(): Filter = filter.getRequired("filter")

        /**
         * Collects the details of open orders to be fulfilled. Each object represents one order.
         * All requests must include `orders` as a mandatory input. A maximum of 200 orders is
         * allowed per request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun orders(): List<Order> = orders.getRequired("orders")

        /**
         * Collects the details of vehicles available to fulfill the orders. Each object represents
         * one vehicle. All requests must include `vehicles` as a mandatory input. A maximum of 100
         * vehicles is allowed per request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun vehicles(): List<Vehicle> = vehicles.getRequired("vehicles")

        /**
         * Configure the assignment constraints and response settings.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun options(): Optional<Options> = options.getOptional("options")

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<Filter> = filter

        /**
         * Returns the raw JSON value of [orders].
         *
         * Unlike [orders], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("orders") @ExcludeMissing fun _orders(): JsonField<List<Order>> = orders

        /**
         * Returns the raw JSON value of [vehicles].
         *
         * Unlike [vehicles], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vehicles")
        @ExcludeMissing
        fun _vehicles(): JsonField<List<Vehicle>> = vehicles

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<Options> = options

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
             * .filter()
             * .orders()
             * .vehicles()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var filter: JsonField<Filter>? = null
            private var orders: JsonField<MutableList<Order>>? = null
            private var vehicles: JsonField<MutableList<Vehicle>>? = null
            private var options: JsonField<Options> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                filter = body.filter
                orders = body.orders.map { it.toMutableList() }
                vehicles = body.vehicles.map { it.toMutableList() }
                options = body.options
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Specify the filtering criterion for the vehicles with respect to each order's
             * location. `filter` is a mandatory input for all requests.
             */
            fun filter(filter: Filter) = filter(JsonField.of(filter))

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [Filter] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<Filter>) = apply { this.filter = filter }

            /**
             * Collects the details of open orders to be fulfilled. Each object represents one
             * order. All requests must include `orders` as a mandatory input. A maximum of 200
             * orders is allowed per request.
             */
            fun orders(orders: List<Order>) = orders(JsonField.of(orders))

            /**
             * Sets [Builder.orders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orders] with a well-typed `List<Order>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orders(orders: JsonField<List<Order>>) = apply {
                this.orders = orders.map { it.toMutableList() }
            }

            /**
             * Adds a single [Order] to [orders].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOrder(order: Order) = apply {
                orders =
                    (orders ?: JsonField.of(mutableListOf())).also {
                        checkKnown("orders", it).add(order)
                    }
            }

            /**
             * Collects the details of vehicles available to fulfill the orders. Each object
             * represents one vehicle. All requests must include `vehicles` as a mandatory input. A
             * maximum of 100 vehicles is allowed per request.
             */
            fun vehicles(vehicles: List<Vehicle>) = vehicles(JsonField.of(vehicles))

            /**
             * Sets [Builder.vehicles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vehicles] with a well-typed `List<Vehicle>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vehicles(vehicles: JsonField<List<Vehicle>>) = apply {
                this.vehicles = vehicles.map { it.toMutableList() }
            }

            /**
             * Adds a single [Vehicle] to [vehicles].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVehicle(vehicle: Vehicle) = apply {
                vehicles =
                    (vehicles ?: JsonField.of(mutableListOf())).also {
                        checkKnown("vehicles", it).add(vehicle)
                    }
            }

            /** Configure the assignment constraints and response settings. */
            fun options(options: Options) = options(JsonField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed [Options] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<Options>) = apply { this.options = options }

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
             * .filter()
             * .orders()
             * .vehicles()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("filter", filter),
                    checkRequired("orders", orders).map { it.toImmutable() },
                    checkRequired("vehicles", vehicles).map { it.toImmutable() },
                    options,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            filter().validate()
            orders().forEach { it.validate() }
            vehicles().forEach { it.validate() }
            options().ifPresent { it.validate() }
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
            (filter.asKnown().getOrNull()?.validity() ?: 0) +
                (orders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (vehicles.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (options.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && filter == other.filter && orders == other.orders && vehicles == other.vehicles && options == other.options && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(filter, orders, vehicles, options, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{filter=$filter, orders=$orders, vehicles=$vehicles, options=$options, additionalProperties=$additionalProperties}"
    }

    /**
     * Specify the filtering criterion for the vehicles with respect to each order's location.
     * `filter` is a mandatory input for all requests.
     */
    class Filter
    private constructor(
        private val drivingDistance: JsonField<Double>,
        private val pickupEta: JsonField<Long>,
        private val radius: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("driving_distance")
            @ExcludeMissing
            drivingDistance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("pickup_eta")
            @ExcludeMissing
            pickupEta: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("radius") @ExcludeMissing radius: JsonField<Double> = JsonMissing.of(),
        ) : this(drivingDistance, pickupEta, radius, mutableMapOf())

        /**
         * Defines a `driving_distance` filter, in meters. If a vehicle needs to drive further than
         * this distance to reach a pickup location, it will not be assigned to that order. Valid
         * range of values for this filter is \[1, 10000\].
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun drivingDistance(): Optional<Double> = drivingDistance.getOptional("driving_distance")

        /**
         * Specify a duration, in seconds, which will be used to filter out ineligible vehicles for
         * each order. Any vehicle which would take more time than specified here, to reach the
         * pickup location of a given order, will be ruled out for assignment for that particular
         * order. Valid values for `pickup_eta` are \[1, 3600\].
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun pickupEta(): Optional<Long> = pickupEta.getOptional("pickup_eta")

        /**
         * Specify a radius, in meters, which will be used to filter out ineligible vehicles for
         * each order. The pickup location of an order will act as the center of the circle when
         * identifying eligible vehicles. Valid values for `radius` are \[1, 10000\].
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun radius(): Optional<Double> = radius.getOptional("radius")

        /**
         * Returns the raw JSON value of [drivingDistance].
         *
         * Unlike [drivingDistance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("driving_distance")
        @ExcludeMissing
        fun _drivingDistance(): JsonField<Double> = drivingDistance

        /**
         * Returns the raw JSON value of [pickupEta].
         *
         * Unlike [pickupEta], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pickup_eta") @ExcludeMissing fun _pickupEta(): JsonField<Long> = pickupEta

        /**
         * Returns the raw JSON value of [radius].
         *
         * Unlike [radius], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("radius") @ExcludeMissing fun _radius(): JsonField<Double> = radius

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

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var drivingDistance: JsonField<Double> = JsonMissing.of()
            private var pickupEta: JsonField<Long> = JsonMissing.of()
            private var radius: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                drivingDistance = filter.drivingDistance
                pickupEta = filter.pickupEta
                radius = filter.radius
                additionalProperties = filter.additionalProperties.toMutableMap()
            }

            /**
             * Defines a `driving_distance` filter, in meters. If a vehicle needs to drive further
             * than this distance to reach a pickup location, it will not be assigned to that order.
             * Valid range of values for this filter is \[1, 10000\].
             */
            fun drivingDistance(drivingDistance: Double) =
                drivingDistance(JsonField.of(drivingDistance))

            /**
             * Sets [Builder.drivingDistance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.drivingDistance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun drivingDistance(drivingDistance: JsonField<Double>) = apply {
                this.drivingDistance = drivingDistance
            }

            /**
             * Specify a duration, in seconds, which will be used to filter out ineligible vehicles
             * for each order. Any vehicle which would take more time than specified here, to reach
             * the pickup location of a given order, will be ruled out for assignment for that
             * particular order. Valid values for `pickup_eta` are \[1, 3600\].
             */
            fun pickupEta(pickupEta: Long) = pickupEta(JsonField.of(pickupEta))

            /**
             * Sets [Builder.pickupEta] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pickupEta] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pickupEta(pickupEta: JsonField<Long>) = apply { this.pickupEta = pickupEta }

            /**
             * Specify a radius, in meters, which will be used to filter out ineligible vehicles for
             * each order. The pickup location of an order will act as the center of the circle when
             * identifying eligible vehicles. Valid values for `radius` are \[1, 10000\].
             */
            fun radius(radius: Double) = radius(JsonField.of(radius))

            /**
             * Sets [Builder.radius] to an arbitrary JSON value.
             *
             * You should usually call [Builder.radius] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun radius(radius: JsonField<Double>) = apply { this.radius = radius }

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
             * Returns an immutable instance of [Filter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filter =
                Filter(drivingDistance, pickupEta, radius, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Filter = apply {
            if (validated) {
                return@apply
            }

            drivingDistance()
            pickupEta()
            radius()
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
            (if (drivingDistance.asKnown().isPresent) 1 else 0) +
                (if (pickupEta.asKnown().isPresent) 1 else 0) +
                (if (radius.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Filter && drivingDistance == other.drivingDistance && pickupEta == other.pickupEta && radius == other.radius && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(drivingDistance, pickupEta, radius, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{drivingDistance=$drivingDistance, pickupEta=$pickupEta, radius=$radius, additionalProperties=$additionalProperties}"
    }

    class Order
    private constructor(
        private val id: JsonField<String>,
        private val pickup: JsonField<Pickup>,
        private val attributes: JsonValue,
        private val dropoffs: JsonField<List<Dropoff>>,
        private val priority: JsonField<Long>,
        private val serviceTime: JsonField<Long>,
        private val vehiclePreferences: JsonField<VehiclePreferences>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pickup") @ExcludeMissing pickup: JsonField<Pickup> = JsonMissing.of(),
            @JsonProperty("attributes") @ExcludeMissing attributes: JsonValue = JsonMissing.of(),
            @JsonProperty("dropoffs")
            @ExcludeMissing
            dropoffs: JsonField<List<Dropoff>> = JsonMissing.of(),
            @JsonProperty("priority") @ExcludeMissing priority: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("service_time")
            @ExcludeMissing
            serviceTime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("vehicle_preferences")
            @ExcludeMissing
            vehiclePreferences: JsonField<VehiclePreferences> = JsonMissing.of(),
        ) : this(
            id,
            pickup,
            attributes,
            dropoffs,
            priority,
            serviceTime,
            vehiclePreferences,
            mutableMapOf(),
        )

        /**
         * Specify a unique ID for the order.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Specify the location coordinates of the pickup location of the order. This input is
         * mandatory for each order.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pickup(): Pickup = pickup.getRequired("pickup")

        /**
         * Specify custom attributes for the orders. Each attribute should be created as a
         * `key:value` pair. The **keys** provided can be used in
         * `options.order_attribute_priority_mappings` to assign a custom priority for this order
         * based on its attributes.
         *
         * The maximum number of key:value pairs that can be specified under `attributes` for a
         * given order, is limited to 30.
         */
        @JsonProperty("attributes") @ExcludeMissing fun _attributes(): JsonValue = attributes

        /**
         * Use this parameter to specify the location coordinates of the destination of the trip or
         * the intermediate stops to be completed before it.
         *
         * Please note
         * - The last location provided is treated as the destination of the trip.
         * - `dropoffs` is mandatory when `dropoff_details` is set to **true**.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dropoffs(): Optional<List<Dropoff>> = dropoffs.getOptional("dropoffs")

        /**
         * Specify the priority for this order. A higher value indicates a higher priority. When
         * specified, it will override any priority score deduced from
         * `order_attribute_priority_mappings` for this order. Valid values are \[1, 10\] and
         * default is 0.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun priority(): Optional<Long> = priority.getOptional("priority")

        /**
         * Specify the service time, in seconds, for the order. Service time is the duration that
         * the driver is likely to wait at the pickup location after arriving. The impact of the
         * service time is realized in the ETA for the "dropoff" type step.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun serviceTime(): Optional<Long> = serviceTime.getOptional("service_time")

        /**
         * Define custom preferences for task assignment based on vehicle's attributes. If multiple
         * criteria are provided, they are evaluated using an AND condition—meaning all specified
         * criteria must be met individually for a vehicle to be considered.
         *
         * For example, if `required_all_of_attributes`, `required_any_of_attributes`, and
         * `exclude_all_of_attributes` are all provided, an eligible vehicle must satisfy the
         * following to be considered for assignments:
         * 1. Meet all conditions specified in `required_all_of_attributes`.
         * 2. Meet at least one of the conditions listed in `required_any_of_attributes`.
         * 3. Not meet any conditions mentioned in `exclude_all_of_attributes`.
         *
         * Consequently, a vehicle which does not have any `attributes` defined can't be assigned to
         * an order which has `vehicle_preferences` configured.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun vehiclePreferences(): Optional<VehiclePreferences> =
            vehiclePreferences.getOptional("vehicle_preferences")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [pickup].
         *
         * Unlike [pickup], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pickup") @ExcludeMissing fun _pickup(): JsonField<Pickup> = pickup

        /**
         * Returns the raw JSON value of [dropoffs].
         *
         * Unlike [dropoffs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dropoffs")
        @ExcludeMissing
        fun _dropoffs(): JsonField<List<Dropoff>> = dropoffs

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Long> = priority

        /**
         * Returns the raw JSON value of [serviceTime].
         *
         * Unlike [serviceTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("service_time")
        @ExcludeMissing
        fun _serviceTime(): JsonField<Long> = serviceTime

        /**
         * Returns the raw JSON value of [vehiclePreferences].
         *
         * Unlike [vehiclePreferences], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("vehicle_preferences")
        @ExcludeMissing
        fun _vehiclePreferences(): JsonField<VehiclePreferences> = vehiclePreferences

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
             * Returns a mutable builder for constructing an instance of [Order].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .pickup()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Order]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var pickup: JsonField<Pickup>? = null
            private var attributes: JsonValue = JsonMissing.of()
            private var dropoffs: JsonField<MutableList<Dropoff>>? = null
            private var priority: JsonField<Long> = JsonMissing.of()
            private var serviceTime: JsonField<Long> = JsonMissing.of()
            private var vehiclePreferences: JsonField<VehiclePreferences> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(order: Order) = apply {
                id = order.id
                pickup = order.pickup
                attributes = order.attributes
                dropoffs = order.dropoffs.map { it.toMutableList() }
                priority = order.priority
                serviceTime = order.serviceTime
                vehiclePreferences = order.vehiclePreferences
                additionalProperties = order.additionalProperties.toMutableMap()
            }

            /** Specify a unique ID for the order. */
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
             * Specify the location coordinates of the pickup location of the order. This input is
             * mandatory for each order.
             */
            fun pickup(pickup: Pickup) = pickup(JsonField.of(pickup))

            /**
             * Sets [Builder.pickup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pickup] with a well-typed [Pickup] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pickup(pickup: JsonField<Pickup>) = apply { this.pickup = pickup }

            /**
             * Specify custom attributes for the orders. Each attribute should be created as a
             * `key:value` pair. The **keys** provided can be used in
             * `options.order_attribute_priority_mappings` to assign a custom priority for this
             * order based on its attributes.
             *
             * The maximum number of key:value pairs that can be specified under `attributes` for a
             * given order, is limited to 30.
             */
            fun attributes(attributes: JsonValue) = apply { this.attributes = attributes }

            /**
             * Use this parameter to specify the location coordinates of the destination of the trip
             * or the intermediate stops to be completed before it.
             *
             * Please note
             * - The last location provided is treated as the destination of the trip.
             * - `dropoffs` is mandatory when `dropoff_details` is set to **true**.
             */
            fun dropoffs(dropoffs: List<Dropoff>) = dropoffs(JsonField.of(dropoffs))

            /**
             * Sets [Builder.dropoffs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dropoffs] with a well-typed `List<Dropoff>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dropoffs(dropoffs: JsonField<List<Dropoff>>) = apply {
                this.dropoffs = dropoffs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Dropoff] to [dropoffs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDropoff(dropoff: Dropoff) = apply {
                dropoffs =
                    (dropoffs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dropoffs", it).add(dropoff)
                    }
            }

            /**
             * Specify the priority for this order. A higher value indicates a higher priority. When
             * specified, it will override any priority score deduced from
             * `order_attribute_priority_mappings` for this order. Valid values are \[1, 10\] and
             * default is 0.
             */
            fun priority(priority: Long) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Long>) = apply { this.priority = priority }

            /**
             * Specify the service time, in seconds, for the order. Service time is the duration
             * that the driver is likely to wait at the pickup location after arriving. The impact
             * of the service time is realized in the ETA for the "dropoff" type step.
             */
            fun serviceTime(serviceTime: Long) = serviceTime(JsonField.of(serviceTime))

            /**
             * Sets [Builder.serviceTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serviceTime] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun serviceTime(serviceTime: JsonField<Long>) = apply { this.serviceTime = serviceTime }

            /**
             * Define custom preferences for task assignment based on vehicle's attributes. If
             * multiple criteria are provided, they are evaluated using an AND condition—meaning all
             * specified criteria must be met individually for a vehicle to be considered.
             *
             * For example, if `required_all_of_attributes`, `required_any_of_attributes`, and
             * `exclude_all_of_attributes` are all provided, an eligible vehicle must satisfy the
             * following to be considered for assignments:
             * 1. Meet all conditions specified in `required_all_of_attributes`.
             * 2. Meet at least one of the conditions listed in `required_any_of_attributes`.
             * 3. Not meet any conditions mentioned in `exclude_all_of_attributes`.
             *
             * Consequently, a vehicle which does not have any `attributes` defined can't be
             * assigned to an order which has `vehicle_preferences` configured.
             */
            fun vehiclePreferences(vehiclePreferences: VehiclePreferences) =
                vehiclePreferences(JsonField.of(vehiclePreferences))

            /**
             * Sets [Builder.vehiclePreferences] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vehiclePreferences] with a well-typed
             * [VehiclePreferences] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun vehiclePreferences(vehiclePreferences: JsonField<VehiclePreferences>) = apply {
                this.vehiclePreferences = vehiclePreferences
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
             * Returns an immutable instance of [Order].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .pickup()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Order =
                Order(
                    checkRequired("id", id),
                    checkRequired("pickup", pickup),
                    attributes,
                    (dropoffs ?: JsonMissing.of()).map { it.toImmutable() },
                    priority,
                    serviceTime,
                    vehiclePreferences,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Order = apply {
            if (validated) {
                return@apply
            }

            id()
            pickup().validate()
            dropoffs().ifPresent { it.forEach { it.validate() } }
            priority()
            serviceTime()
            vehiclePreferences().ifPresent { it.validate() }
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
                (pickup.asKnown().getOrNull()?.validity() ?: 0) +
                (dropoffs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (if (serviceTime.asKnown().isPresent) 1 else 0) +
                (vehiclePreferences.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Specify the location coordinates of the pickup location of the order. This input is
         * mandatory for each order.
         */
        class Pickup
        private constructor(
            private val lat: JsonField<Double>,
            private val lng: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("lng") @ExcludeMissing lng: JsonField<Double> = JsonMissing.of(),
            ) : this(lat, lng, mutableMapOf())

            /**
             * Latitude of the pickup location.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lat(): Optional<Double> = lat.getOptional("lat")

            /**
             * Longitude of the pickup location.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lng(): Optional<Double> = lng.getOptional("lng")

            /**
             * Returns the raw JSON value of [lat].
             *
             * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

            /**
             * Returns the raw JSON value of [lng].
             *
             * Unlike [lng], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lng") @ExcludeMissing fun _lng(): JsonField<Double> = lng

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

                /** Returns a mutable builder for constructing an instance of [Pickup]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Pickup]. */
            class Builder internal constructor() {

                private var lat: JsonField<Double> = JsonMissing.of()
                private var lng: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pickup: Pickup) = apply {
                    lat = pickup.lat
                    lng = pickup.lng
                    additionalProperties = pickup.additionalProperties.toMutableMap()
                }

                /** Latitude of the pickup location. */
                fun lat(lat: Double) = lat(JsonField.of(lat))

                /**
                 * Sets [Builder.lat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lat] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                /** Longitude of the pickup location. */
                fun lng(lng: Double) = lng(JsonField.of(lng))

                /**
                 * Sets [Builder.lng] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lng] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lng(lng: JsonField<Double>) = apply { this.lng = lng }

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
                 * Returns an immutable instance of [Pickup].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Pickup = Pickup(lat, lng, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Pickup = apply {
                if (validated) {
                    return@apply
                }

                lat()
                lng()
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
                (if (lat.asKnown().isPresent) 1 else 0) + (if (lng.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Pickup && lat == other.lat && lng == other.lng && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(lat, lng, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Pickup{lat=$lat, lng=$lng, additionalProperties=$additionalProperties}"
        }

        class Dropoff
        private constructor(
            private val lat: JsonField<Double>,
            private val lng: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("lng") @ExcludeMissing lng: JsonField<Double> = JsonMissing.of(),
            ) : this(lat, lng, mutableMapOf())

            /**
             * Latitude of the stop location.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lat(): Optional<Double> = lat.getOptional("lat")

            /**
             * Longitude of the stop location.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lng(): Optional<Double> = lng.getOptional("lng")

            /**
             * Returns the raw JSON value of [lat].
             *
             * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

            /**
             * Returns the raw JSON value of [lng].
             *
             * Unlike [lng], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lng") @ExcludeMissing fun _lng(): JsonField<Double> = lng

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

                /** Returns a mutable builder for constructing an instance of [Dropoff]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Dropoff]. */
            class Builder internal constructor() {

                private var lat: JsonField<Double> = JsonMissing.of()
                private var lng: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dropoff: Dropoff) = apply {
                    lat = dropoff.lat
                    lng = dropoff.lng
                    additionalProperties = dropoff.additionalProperties.toMutableMap()
                }

                /** Latitude of the stop location. */
                fun lat(lat: Double) = lat(JsonField.of(lat))

                /**
                 * Sets [Builder.lat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lat] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                /** Longitude of the stop location. */
                fun lng(lng: Double) = lng(JsonField.of(lng))

                /**
                 * Sets [Builder.lng] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lng] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lng(lng: JsonField<Double>) = apply { this.lng = lng }

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
                 * Returns an immutable instance of [Dropoff].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Dropoff = Dropoff(lat, lng, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Dropoff = apply {
                if (validated) {
                    return@apply
                }

                lat()
                lng()
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
                (if (lat.asKnown().isPresent) 1 else 0) + (if (lng.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Dropoff && lat == other.lat && lng == other.lng && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(lat, lng, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Dropoff{lat=$lat, lng=$lng, additionalProperties=$additionalProperties}"
        }

        /**
         * Define custom preferences for task assignment based on vehicle's attributes. If multiple
         * criteria are provided, they are evaluated using an AND condition—meaning all specified
         * criteria must be met individually for a vehicle to be considered.
         *
         * For example, if `required_all_of_attributes`, `required_any_of_attributes`, and
         * `exclude_all_of_attributes` are all provided, an eligible vehicle must satisfy the
         * following to be considered for assignments:
         * 1. Meet all conditions specified in `required_all_of_attributes`.
         * 2. Meet at least one of the conditions listed in `required_any_of_attributes`.
         * 3. Not meet any conditions mentioned in `exclude_all_of_attributes`.
         *
         * Consequently, a vehicle which does not have any `attributes` defined can't be assigned to
         * an order which has `vehicle_preferences` configured.
         */
        class VehiclePreferences
        private constructor(
            private val excludeAllOfAttributes: JsonField<List<ExcludeAllOfAttribute>>,
            private val requiredAllOfAttributes: JsonField<List<RequiredAllOfAttribute>>,
            private val requiredAnyOfAttributes: JsonField<List<RequiredAnyOfAttribute>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("exclude_all_of_attributes")
                @ExcludeMissing
                excludeAllOfAttributes: JsonField<List<ExcludeAllOfAttribute>> = JsonMissing.of(),
                @JsonProperty("required_all_of_attributes")
                @ExcludeMissing
                requiredAllOfAttributes: JsonField<List<RequiredAllOfAttribute>> = JsonMissing.of(),
                @JsonProperty("required_any_of_attributes")
                @ExcludeMissing
                requiredAnyOfAttributes: JsonField<List<RequiredAnyOfAttribute>> = JsonMissing.of(),
            ) : this(
                excludeAllOfAttributes,
                requiredAllOfAttributes,
                requiredAnyOfAttributes,
                mutableMapOf(),
            )

            /**
             * An array of objects to add exclusion requirements for the order. A vehicle must **not
             * meet any of the conditions** specified here to be considered for assignment. Each
             * object represents a single condition. Please note that a maximum of 10 conditions can
             * be added here for a given order.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun excludeAllOfAttributes(): Optional<List<ExcludeAllOfAttribute>> =
                excludeAllOfAttributes.getOptional("exclude_all_of_attributes")

            /**
             * An array of objects to add mandatory requirements for the order. A vehicle must
             * **meet** **all conditions** specified here to be considered for assignment. Each
             * object represents a single condition. Please note that a maximum of 10 conditions can
             * be added here for a given order.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun requiredAllOfAttributes(): Optional<List<RequiredAllOfAttribute>> =
                requiredAllOfAttributes.getOptional("required_all_of_attributes")

            /**
             * An array of objects to add optional requirements for the order. A vehicle must
             * **meet** **at least one of the conditions** specified here to be considered for
             * assignment. Each object represents a single condition. Please note that a maximum of
             * 10 conditions can be added here for a given order.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun requiredAnyOfAttributes(): Optional<List<RequiredAnyOfAttribute>> =
                requiredAnyOfAttributes.getOptional("required_any_of_attributes")

            /**
             * Returns the raw JSON value of [excludeAllOfAttributes].
             *
             * Unlike [excludeAllOfAttributes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("exclude_all_of_attributes")
            @ExcludeMissing
            fun _excludeAllOfAttributes(): JsonField<List<ExcludeAllOfAttribute>> =
                excludeAllOfAttributes

            /**
             * Returns the raw JSON value of [requiredAllOfAttributes].
             *
             * Unlike [requiredAllOfAttributes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("required_all_of_attributes")
            @ExcludeMissing
            fun _requiredAllOfAttributes(): JsonField<List<RequiredAllOfAttribute>> =
                requiredAllOfAttributes

            /**
             * Returns the raw JSON value of [requiredAnyOfAttributes].
             *
             * Unlike [requiredAnyOfAttributes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("required_any_of_attributes")
            @ExcludeMissing
            fun _requiredAnyOfAttributes(): JsonField<List<RequiredAnyOfAttribute>> =
                requiredAnyOfAttributes

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
                 * Returns a mutable builder for constructing an instance of [VehiclePreferences].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [VehiclePreferences]. */
            class Builder internal constructor() {

                private var excludeAllOfAttributes: JsonField<MutableList<ExcludeAllOfAttribute>>? =
                    null
                private var requiredAllOfAttributes:
                    JsonField<MutableList<RequiredAllOfAttribute>>? =
                    null
                private var requiredAnyOfAttributes:
                    JsonField<MutableList<RequiredAnyOfAttribute>>? =
                    null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(vehiclePreferences: VehiclePreferences) = apply {
                    excludeAllOfAttributes =
                        vehiclePreferences.excludeAllOfAttributes.map { it.toMutableList() }
                    requiredAllOfAttributes =
                        vehiclePreferences.requiredAllOfAttributes.map { it.toMutableList() }
                    requiredAnyOfAttributes =
                        vehiclePreferences.requiredAnyOfAttributes.map { it.toMutableList() }
                    additionalProperties = vehiclePreferences.additionalProperties.toMutableMap()
                }

                /**
                 * An array of objects to add exclusion requirements for the order. A vehicle must
                 * **not meet any of the conditions** specified here to be considered for
                 * assignment. Each object represents a single condition. Please note that a maximum
                 * of 10 conditions can be added here for a given order.
                 */
                fun excludeAllOfAttributes(excludeAllOfAttributes: List<ExcludeAllOfAttribute>) =
                    excludeAllOfAttributes(JsonField.of(excludeAllOfAttributes))

                /**
                 * Sets [Builder.excludeAllOfAttributes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.excludeAllOfAttributes] with a well-typed
                 * `List<ExcludeAllOfAttribute>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun excludeAllOfAttributes(
                    excludeAllOfAttributes: JsonField<List<ExcludeAllOfAttribute>>
                ) = apply {
                    this.excludeAllOfAttributes = excludeAllOfAttributes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ExcludeAllOfAttribute] to [excludeAllOfAttributes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addExcludeAllOfAttribute(excludeAllOfAttribute: ExcludeAllOfAttribute) = apply {
                    excludeAllOfAttributes =
                        (excludeAllOfAttributes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("excludeAllOfAttributes", it).add(excludeAllOfAttribute)
                        }
                }

                /**
                 * An array of objects to add mandatory requirements for the order. A vehicle must
                 * **meet** **all conditions** specified here to be considered for assignment. Each
                 * object represents a single condition. Please note that a maximum of 10 conditions
                 * can be added here for a given order.
                 */
                fun requiredAllOfAttributes(requiredAllOfAttributes: List<RequiredAllOfAttribute>) =
                    requiredAllOfAttributes(JsonField.of(requiredAllOfAttributes))

                /**
                 * Sets [Builder.requiredAllOfAttributes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requiredAllOfAttributes] with a well-typed
                 * `List<RequiredAllOfAttribute>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun requiredAllOfAttributes(
                    requiredAllOfAttributes: JsonField<List<RequiredAllOfAttribute>>
                ) = apply {
                    this.requiredAllOfAttributes =
                        requiredAllOfAttributes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [RequiredAllOfAttribute] to [requiredAllOfAttributes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRequiredAllOfAttribute(requiredAllOfAttribute: RequiredAllOfAttribute) =
                    apply {
                        requiredAllOfAttributes =
                            (requiredAllOfAttributes ?: JsonField.of(mutableListOf())).also {
                                checkKnown("requiredAllOfAttributes", it)
                                    .add(requiredAllOfAttribute)
                            }
                    }

                /**
                 * An array of objects to add optional requirements for the order. A vehicle must
                 * **meet** **at least one of the conditions** specified here to be considered for
                 * assignment. Each object represents a single condition. Please note that a maximum
                 * of 10 conditions can be added here for a given order.
                 */
                fun requiredAnyOfAttributes(requiredAnyOfAttributes: List<RequiredAnyOfAttribute>) =
                    requiredAnyOfAttributes(JsonField.of(requiredAnyOfAttributes))

                /**
                 * Sets [Builder.requiredAnyOfAttributes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requiredAnyOfAttributes] with a well-typed
                 * `List<RequiredAnyOfAttribute>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun requiredAnyOfAttributes(
                    requiredAnyOfAttributes: JsonField<List<RequiredAnyOfAttribute>>
                ) = apply {
                    this.requiredAnyOfAttributes =
                        requiredAnyOfAttributes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [RequiredAnyOfAttribute] to [requiredAnyOfAttributes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRequiredAnyOfAttribute(requiredAnyOfAttribute: RequiredAnyOfAttribute) =
                    apply {
                        requiredAnyOfAttributes =
                            (requiredAnyOfAttributes ?: JsonField.of(mutableListOf())).also {
                                checkKnown("requiredAnyOfAttributes", it)
                                    .add(requiredAnyOfAttribute)
                            }
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
                 * Returns an immutable instance of [VehiclePreferences].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): VehiclePreferences =
                    VehiclePreferences(
                        (excludeAllOfAttributes ?: JsonMissing.of()).map { it.toImmutable() },
                        (requiredAllOfAttributes ?: JsonMissing.of()).map { it.toImmutable() },
                        (requiredAnyOfAttributes ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): VehiclePreferences = apply {
                if (validated) {
                    return@apply
                }

                excludeAllOfAttributes().ifPresent { it.forEach { it.validate() } }
                requiredAllOfAttributes().ifPresent { it.forEach { it.validate() } }
                requiredAnyOfAttributes().ifPresent { it.forEach { it.validate() } }
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
                (excludeAllOfAttributes.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                    (requiredAllOfAttributes.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (requiredAnyOfAttributes.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0)

            class ExcludeAllOfAttribute
            private constructor(
                private val attribute: JsonField<String>,
                private val operator: JsonField<String>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("attribute")
                    @ExcludeMissing
                    attribute: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("operator")
                    @ExcludeMissing
                    operator: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(attribute, operator, value, mutableMapOf())

                /**
                 * Specify the name of the attribute. The `attribute` is compared to the keys (of
                 * each `key:value` pair) in `vehicles.attributes` during evaluation.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun attribute(): String = attribute.getRequired("attribute")

                /**
                 * Specify the operator to denote the relation between `attribute` and the `value`
                 * specified above. The `attribute` , `operator` and `value` together constitute the
                 * condition that a vehicle must meet to be eligible for assignment. Currently, we
                 * support following operators currently:
                 * - Equal to (==)
                 * - Less than (<)
                 * - Less tha equal to (<=)
                 * - Greater than (>)
                 * - Greater than equal to (>=)
                 * - Contains (contains)
                 *
                 * Please note that when using "contains" operator only one `value` can be specified
                 * and the corresponding `attribute` must contain multiple values when defined for a
                 * vehicle.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun operator(): String = operator.getRequired("operator")

                /**
                 * Specify the desired value of the attribute to be applied for this order. `value`
                 * provided here is compared to the values (of each `key:value` pair) in
                 * `vehicles.attributes` during evaluation.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun value(): String = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [attribute].
                 *
                 * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("attribute")
                @ExcludeMissing
                fun _attribute(): JsonField<String> = attribute

                /**
                 * Returns the raw JSON value of [operator].
                 *
                 * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operator")
                @ExcludeMissing
                fun _operator(): JsonField<String> = operator

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                     * [ExcludeAllOfAttribute].
                     *
                     * The following fields are required:
                     * ```java
                     * .attribute()
                     * .operator()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ExcludeAllOfAttribute]. */
                class Builder internal constructor() {

                    private var attribute: JsonField<String>? = null
                    private var operator: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(excludeAllOfAttribute: ExcludeAllOfAttribute) = apply {
                        attribute = excludeAllOfAttribute.attribute
                        operator = excludeAllOfAttribute.operator
                        value = excludeAllOfAttribute.value
                        additionalProperties =
                            excludeAllOfAttribute.additionalProperties.toMutableMap()
                    }

                    /**
                     * Specify the name of the attribute. The `attribute` is compared to the keys
                     * (of each `key:value` pair) in `vehicles.attributes` during evaluation.
                     */
                    fun attribute(attribute: String) = attribute(JsonField.of(attribute))

                    /**
                     * Sets [Builder.attribute] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attribute] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun attribute(attribute: JsonField<String>) = apply {
                        this.attribute = attribute
                    }

                    /**
                     * Specify the operator to denote the relation between `attribute` and the
                     * `value` specified above. The `attribute` , `operator` and `value` together
                     * constitute the condition that a vehicle must meet to be eligible for
                     * assignment. Currently, we support following operators currently:
                     * - Equal to (==)
                     * - Less than (<)
                     * - Less tha equal to (<=)
                     * - Greater than (>)
                     * - Greater than equal to (>=)
                     * - Contains (contains)
                     *
                     * Please note that when using "contains" operator only one `value` can be
                     * specified and the corresponding `attribute` must contain multiple values when
                     * defined for a vehicle.
                     */
                    fun operator(operator: String) = operator(JsonField.of(operator))

                    /**
                     * Sets [Builder.operator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operator] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun operator(operator: JsonField<String>) = apply { this.operator = operator }

                    /**
                     * Specify the desired value of the attribute to be applied for this order.
                     * `value` provided here is compared to the values (of each `key:value` pair) in
                     * `vehicles.attributes` during evaluation.
                     */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [ExcludeAllOfAttribute].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .attribute()
                     * .operator()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ExcludeAllOfAttribute =
                        ExcludeAllOfAttribute(
                            checkRequired("attribute", attribute),
                            checkRequired("operator", operator),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ExcludeAllOfAttribute = apply {
                    if (validated) {
                        return@apply
                    }

                    attribute()
                    operator()
                    value()
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
                    (if (attribute.asKnown().isPresent) 1 else 0) +
                        (if (operator.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ExcludeAllOfAttribute && attribute == other.attribute && operator == other.operator && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(attribute, operator, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ExcludeAllOfAttribute{attribute=$attribute, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
            }

            class RequiredAllOfAttribute
            private constructor(
                private val attribute: JsonField<String>,
                private val operator: JsonField<String>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("attribute")
                    @ExcludeMissing
                    attribute: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("operator")
                    @ExcludeMissing
                    operator: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(attribute, operator, value, mutableMapOf())

                /**
                 * Specify the name of the attribute. The `attribute` is compared to the keys (of
                 * each `key:value` pair) in `vehicles.attributes` during evaluation.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun attribute(): String = attribute.getRequired("attribute")

                /**
                 * Specify the operator to denote the relation between `attribute` and the `value`
                 * specified above. The `attribute` , `operator` and `value` together constitute the
                 * condition that a vehicle must meet to be eligible for assignment. Currently, we
                 * support following operators currently:
                 * - Equal to (==)
                 * - Less than (<)
                 * - Less tha equal to (<=)
                 * - Greater than (>)
                 * - Greater than equal to (>=)
                 * - Contains (contains)
                 *
                 * Please note that when using "contains" operator only one `value` can be specified
                 * and the corresponding `attribute` must contain multiple values when defined for a
                 * vehicle.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun operator(): String = operator.getRequired("operator")

                /**
                 * Specify the desired value of the attribute to be applied for this order. `value`
                 * provided here is compared to the values (of each `key:value` pair) in
                 * `vehicles.attributes` during evaluation.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun value(): String = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [attribute].
                 *
                 * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("attribute")
                @ExcludeMissing
                fun _attribute(): JsonField<String> = attribute

                /**
                 * Returns the raw JSON value of [operator].
                 *
                 * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operator")
                @ExcludeMissing
                fun _operator(): JsonField<String> = operator

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                     * [RequiredAllOfAttribute].
                     *
                     * The following fields are required:
                     * ```java
                     * .attribute()
                     * .operator()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RequiredAllOfAttribute]. */
                class Builder internal constructor() {

                    private var attribute: JsonField<String>? = null
                    private var operator: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(requiredAllOfAttribute: RequiredAllOfAttribute) = apply {
                        attribute = requiredAllOfAttribute.attribute
                        operator = requiredAllOfAttribute.operator
                        value = requiredAllOfAttribute.value
                        additionalProperties =
                            requiredAllOfAttribute.additionalProperties.toMutableMap()
                    }

                    /**
                     * Specify the name of the attribute. The `attribute` is compared to the keys
                     * (of each `key:value` pair) in `vehicles.attributes` during evaluation.
                     */
                    fun attribute(attribute: String) = attribute(JsonField.of(attribute))

                    /**
                     * Sets [Builder.attribute] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attribute] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun attribute(attribute: JsonField<String>) = apply {
                        this.attribute = attribute
                    }

                    /**
                     * Specify the operator to denote the relation between `attribute` and the
                     * `value` specified above. The `attribute` , `operator` and `value` together
                     * constitute the condition that a vehicle must meet to be eligible for
                     * assignment. Currently, we support following operators currently:
                     * - Equal to (==)
                     * - Less than (<)
                     * - Less tha equal to (<=)
                     * - Greater than (>)
                     * - Greater than equal to (>=)
                     * - Contains (contains)
                     *
                     * Please note that when using "contains" operator only one `value` can be
                     * specified and the corresponding `attribute` must contain multiple values when
                     * defined for a vehicle.
                     */
                    fun operator(operator: String) = operator(JsonField.of(operator))

                    /**
                     * Sets [Builder.operator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operator] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun operator(operator: JsonField<String>) = apply { this.operator = operator }

                    /**
                     * Specify the desired value of the attribute to be applied for this order.
                     * `value` provided here is compared to the values (of each `key:value` pair) in
                     * `vehicles.attributes` during evaluation.
                     */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [RequiredAllOfAttribute].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .attribute()
                     * .operator()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): RequiredAllOfAttribute =
                        RequiredAllOfAttribute(
                            checkRequired("attribute", attribute),
                            checkRequired("operator", operator),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): RequiredAllOfAttribute = apply {
                    if (validated) {
                        return@apply
                    }

                    attribute()
                    operator()
                    value()
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
                    (if (attribute.asKnown().isPresent) 1 else 0) +
                        (if (operator.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RequiredAllOfAttribute && attribute == other.attribute && operator == other.operator && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(attribute, operator, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RequiredAllOfAttribute{attribute=$attribute, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
            }

            class RequiredAnyOfAttribute
            private constructor(
                private val attribute: JsonField<String>,
                private val operator: JsonField<String>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("attribute")
                    @ExcludeMissing
                    attribute: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("operator")
                    @ExcludeMissing
                    operator: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(attribute, operator, value, mutableMapOf())

                /**
                 * Specify the name of the attribute. The `attribute` is compared to the keys (of
                 * each `key:value` pair) in `vehicles.attributes` during evaluation.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun attribute(): String = attribute.getRequired("attribute")

                /**
                 * Specify the operator to denote the relation between `attribute` and the `value`
                 * specified above. The `attribute` , `operator` and `value` together constitute the
                 * condition that a vehicle must meet to be eligible for assignment. Currently, we
                 * support following operators currently:
                 * - Equal to (==)
                 * - Less than (<)
                 * - Less tha equal to (<=)
                 * - Greater than (>)
                 * - Greater than equal to (>=)
                 * - Contains (contains)
                 *
                 * Please note that when using "contains" operator only one `value` can be specified
                 * and the corresponding `attribute` must contain multiple values when defined for a
                 * vehicle.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun operator(): String = operator.getRequired("operator")

                /**
                 * Specify the desired value of the attribute to be applied for this order. `value`
                 * provided here is compared to the values (of each `key:value` pair) in
                 * `vehicles.attributes` during evaluation.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun value(): String = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [attribute].
                 *
                 * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("attribute")
                @ExcludeMissing
                fun _attribute(): JsonField<String> = attribute

                /**
                 * Returns the raw JSON value of [operator].
                 *
                 * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operator")
                @ExcludeMissing
                fun _operator(): JsonField<String> = operator

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                     * [RequiredAnyOfAttribute].
                     *
                     * The following fields are required:
                     * ```java
                     * .attribute()
                     * .operator()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RequiredAnyOfAttribute]. */
                class Builder internal constructor() {

                    private var attribute: JsonField<String>? = null
                    private var operator: JsonField<String>? = null
                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(requiredAnyOfAttribute: RequiredAnyOfAttribute) = apply {
                        attribute = requiredAnyOfAttribute.attribute
                        operator = requiredAnyOfAttribute.operator
                        value = requiredAnyOfAttribute.value
                        additionalProperties =
                            requiredAnyOfAttribute.additionalProperties.toMutableMap()
                    }

                    /**
                     * Specify the name of the attribute. The `attribute` is compared to the keys
                     * (of each `key:value` pair) in `vehicles.attributes` during evaluation.
                     */
                    fun attribute(attribute: String) = attribute(JsonField.of(attribute))

                    /**
                     * Sets [Builder.attribute] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attribute] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun attribute(attribute: JsonField<String>) = apply {
                        this.attribute = attribute
                    }

                    /**
                     * Specify the operator to denote the relation between `attribute` and the
                     * `value` specified above. The `attribute` , `operator` and `value` together
                     * constitute the condition that a vehicle must meet to be eligible for
                     * assignment. Currently, we support following operators currently:
                     * - Equal to (==)
                     * - Less than (<)
                     * - Less tha equal to (<=)
                     * - Greater than (>)
                     * - Greater than equal to (>=)
                     * - Contains (contains)
                     *
                     * Please note that when using "contains" operator only one `value` can be
                     * specified and the corresponding `attribute` must contain multiple values when
                     * defined for a vehicle.
                     */
                    fun operator(operator: String) = operator(JsonField.of(operator))

                    /**
                     * Sets [Builder.operator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operator] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun operator(operator: JsonField<String>) = apply { this.operator = operator }

                    /**
                     * Specify the desired value of the attribute to be applied for this order.
                     * `value` provided here is compared to the values (of each `key:value` pair) in
                     * `vehicles.attributes` during evaluation.
                     */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [RequiredAnyOfAttribute].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .attribute()
                     * .operator()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): RequiredAnyOfAttribute =
                        RequiredAnyOfAttribute(
                            checkRequired("attribute", attribute),
                            checkRequired("operator", operator),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): RequiredAnyOfAttribute = apply {
                    if (validated) {
                        return@apply
                    }

                    attribute()
                    operator()
                    value()
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
                    (if (attribute.asKnown().isPresent) 1 else 0) +
                        (if (operator.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RequiredAnyOfAttribute && attribute == other.attribute && operator == other.operator && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(attribute, operator, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RequiredAnyOfAttribute{attribute=$attribute, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is VehiclePreferences && excludeAllOfAttributes == other.excludeAllOfAttributes && requiredAllOfAttributes == other.requiredAllOfAttributes && requiredAnyOfAttributes == other.requiredAnyOfAttributes && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(excludeAllOfAttributes, requiredAllOfAttributes, requiredAnyOfAttributes, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VehiclePreferences{excludeAllOfAttributes=$excludeAllOfAttributes, requiredAllOfAttributes=$requiredAllOfAttributes, requiredAnyOfAttributes=$requiredAnyOfAttributes, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Order && id == other.id && pickup == other.pickup && attributes == other.attributes && dropoffs == other.dropoffs && priority == other.priority && serviceTime == other.serviceTime && vehiclePreferences == other.vehiclePreferences && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, pickup, attributes, dropoffs, priority, serviceTime, vehiclePreferences, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Order{id=$id, pickup=$pickup, attributes=$attributes, dropoffs=$dropoffs, priority=$priority, serviceTime=$serviceTime, vehiclePreferences=$vehiclePreferences, additionalProperties=$additionalProperties}"
    }

    /** Configure the assignment constraints and response settings. */
    class Options
    private constructor(
        private val alternateAssignments: JsonField<Long>,
        private val dropoffDetails: JsonField<Boolean>,
        private val orderAttributePriorityMappings: JsonField<List<OrderAttributePriorityMapping>>,
        private val travelCost: JsonField<TravelCost>,
        private val vehicleAttributePriorityMappings:
            JsonField<List<VehicleAttributePriorityMapping>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("alternate_assignments")
            @ExcludeMissing
            alternateAssignments: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("dropoff_details")
            @ExcludeMissing
            dropoffDetails: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("order_attribute_priority_mappings")
            @ExcludeMissing
            orderAttributePriorityMappings: JsonField<List<OrderAttributePriorityMapping>> =
                JsonMissing.of(),
            @JsonProperty("travel_cost")
            @ExcludeMissing
            travelCost: JsonField<TravelCost> = JsonMissing.of(),
            @JsonProperty("vehicle_attribute_priority_mappings")
            @ExcludeMissing
            vehicleAttributePriorityMappings: JsonField<List<VehicleAttributePriorityMapping>> =
                JsonMissing.of(),
        ) : this(
            alternateAssignments,
            dropoffDetails,
            orderAttributePriorityMappings,
            travelCost,
            vehicleAttributePriorityMappings,
            mutableMapOf(),
        )

        /**
         * Specify the maximum number of potential, alternate vehicle assignments to be returned for
         * each order, apart from the vehicle which was assigned as recommended. Please note that:
         * - The maximum number of alternate assignments that can be requested are 3.
         * - It is not necessary that the service will return the specified number of alternate
         *   assignments for each order. The number of alternate assignments returned will depend on
         *   the number of vehicles provided in the input.
         * - Order which could not be assigned to any vehicles due to their `filter` or attribute
         *   matching criteria will not be eligible for alternate assignments as well.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun alternateAssignments(): Optional<Long> =
            alternateAssignments.getOptional("alternate_assignments")

        /**
         * When **true**, the service returns the drop-off steps for each trip and related details
         * in the response. Defaults to **false**.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dropoffDetails(): Optional<Boolean> = dropoffDetails.getOptional("dropoff_details")

        /**
         * Collection of rules for assigning custom priority to orders based on their attributes. In
         * case an order satisfies more than one rule, the highest priority score from all the rules
         * satisfied, would be the effective priority score for such an order.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun orderAttributePriorityMappings(): Optional<List<OrderAttributePriorityMapping>> =
            orderAttributePriorityMappings.getOptional("order_attribute_priority_mappings")

        /**
         * Choose a travel cost that will be used by the service for assigning vehicles efficiently
         * from a set of qualifying ones.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun travelCost(): Optional<TravelCost> = travelCost.getOptional("travel_cost")

        /**
         * Collection of rules for assigning custom priority to vehicles based on their attributes.
         * In case a vehicle satisfies more than one rule, the highest priority score from all the
         * rules satisfied, would be the effective priority score for such a vehicle.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun vehicleAttributePriorityMappings(): Optional<List<VehicleAttributePriorityMapping>> =
            vehicleAttributePriorityMappings.getOptional("vehicle_attribute_priority_mappings")

        /**
         * Returns the raw JSON value of [alternateAssignments].
         *
         * Unlike [alternateAssignments], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("alternate_assignments")
        @ExcludeMissing
        fun _alternateAssignments(): JsonField<Long> = alternateAssignments

        /**
         * Returns the raw JSON value of [dropoffDetails].
         *
         * Unlike [dropoffDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dropoff_details")
        @ExcludeMissing
        fun _dropoffDetails(): JsonField<Boolean> = dropoffDetails

        /**
         * Returns the raw JSON value of [orderAttributePriorityMappings].
         *
         * Unlike [orderAttributePriorityMappings], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("order_attribute_priority_mappings")
        @ExcludeMissing
        fun _orderAttributePriorityMappings(): JsonField<List<OrderAttributePriorityMapping>> =
            orderAttributePriorityMappings

        /**
         * Returns the raw JSON value of [travelCost].
         *
         * Unlike [travelCost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("travel_cost")
        @ExcludeMissing
        fun _travelCost(): JsonField<TravelCost> = travelCost

        /**
         * Returns the raw JSON value of [vehicleAttributePriorityMappings].
         *
         * Unlike [vehicleAttributePriorityMappings], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("vehicle_attribute_priority_mappings")
        @ExcludeMissing
        fun _vehicleAttributePriorityMappings(): JsonField<List<VehicleAttributePriorityMapping>> =
            vehicleAttributePriorityMappings

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

            /** Returns a mutable builder for constructing an instance of [Options]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Options]. */
        class Builder internal constructor() {

            private var alternateAssignments: JsonField<Long> = JsonMissing.of()
            private var dropoffDetails: JsonField<Boolean> = JsonMissing.of()
            private var orderAttributePriorityMappings:
                JsonField<MutableList<OrderAttributePriorityMapping>>? =
                null
            private var travelCost: JsonField<TravelCost> = JsonMissing.of()
            private var vehicleAttributePriorityMappings:
                JsonField<MutableList<VehicleAttributePriorityMapping>>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(options: Options) = apply {
                alternateAssignments = options.alternateAssignments
                dropoffDetails = options.dropoffDetails
                orderAttributePriorityMappings =
                    options.orderAttributePriorityMappings.map { it.toMutableList() }
                travelCost = options.travelCost
                vehicleAttributePriorityMappings =
                    options.vehicleAttributePriorityMappings.map { it.toMutableList() }
                additionalProperties = options.additionalProperties.toMutableMap()
            }

            /**
             * Specify the maximum number of potential, alternate vehicle assignments to be returned
             * for each order, apart from the vehicle which was assigned as recommended. Please note
             * that:
             * - The maximum number of alternate assignments that can be requested are 3.
             * - It is not necessary that the service will return the specified number of alternate
             *   assignments for each order. The number of alternate assignments returned will
             *   depend on the number of vehicles provided in the input.
             * - Order which could not be assigned to any vehicles due to their `filter` or
             *   attribute matching criteria will not be eligible for alternate assignments as well.
             */
            fun alternateAssignments(alternateAssignments: Long) =
                alternateAssignments(JsonField.of(alternateAssignments))

            /**
             * Sets [Builder.alternateAssignments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alternateAssignments] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alternateAssignments(alternateAssignments: JsonField<Long>) = apply {
                this.alternateAssignments = alternateAssignments
            }

            /**
             * When **true**, the service returns the drop-off steps for each trip and related
             * details in the response. Defaults to **false**.
             */
            fun dropoffDetails(dropoffDetails: Boolean) =
                dropoffDetails(JsonField.of(dropoffDetails))

            /**
             * Sets [Builder.dropoffDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dropoffDetails] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dropoffDetails(dropoffDetails: JsonField<Boolean>) = apply {
                this.dropoffDetails = dropoffDetails
            }

            /**
             * Collection of rules for assigning custom priority to orders based on their
             * attributes. In case an order satisfies more than one rule, the highest priority score
             * from all the rules satisfied, would be the effective priority score for such an
             * order.
             */
            fun orderAttributePriorityMappings(
                orderAttributePriorityMappings: List<OrderAttributePriorityMapping>
            ) = orderAttributePriorityMappings(JsonField.of(orderAttributePriorityMappings))

            /**
             * Sets [Builder.orderAttributePriorityMappings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orderAttributePriorityMappings] with a well-typed
             * `List<OrderAttributePriorityMapping>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun orderAttributePriorityMappings(
                orderAttributePriorityMappings: JsonField<List<OrderAttributePriorityMapping>>
            ) = apply {
                this.orderAttributePriorityMappings =
                    orderAttributePriorityMappings.map { it.toMutableList() }
            }

            /**
             * Adds a single [OrderAttributePriorityMapping] to [orderAttributePriorityMappings].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOrderAttributePriorityMapping(
                orderAttributePriorityMapping: OrderAttributePriorityMapping
            ) = apply {
                orderAttributePriorityMappings =
                    (orderAttributePriorityMappings ?: JsonField.of(mutableListOf())).also {
                        checkKnown("orderAttributePriorityMappings", it)
                            .add(orderAttributePriorityMapping)
                    }
            }

            /**
             * Choose a travel cost that will be used by the service for assigning vehicles
             * efficiently from a set of qualifying ones.
             */
            fun travelCost(travelCost: TravelCost) = travelCost(JsonField.of(travelCost))

            /**
             * Sets [Builder.travelCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.travelCost] with a well-typed [TravelCost] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun travelCost(travelCost: JsonField<TravelCost>) = apply {
                this.travelCost = travelCost
            }

            /**
             * Collection of rules for assigning custom priority to vehicles based on their
             * attributes. In case a vehicle satisfies more than one rule, the highest priority
             * score from all the rules satisfied, would be the effective priority score for such a
             * vehicle.
             */
            fun vehicleAttributePriorityMappings(
                vehicleAttributePriorityMappings: List<VehicleAttributePriorityMapping>
            ) = vehicleAttributePriorityMappings(JsonField.of(vehicleAttributePriorityMappings))

            /**
             * Sets [Builder.vehicleAttributePriorityMappings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vehicleAttributePriorityMappings] with a well-typed
             * `List<VehicleAttributePriorityMapping>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun vehicleAttributePriorityMappings(
                vehicleAttributePriorityMappings: JsonField<List<VehicleAttributePriorityMapping>>
            ) = apply {
                this.vehicleAttributePriorityMappings =
                    vehicleAttributePriorityMappings.map { it.toMutableList() }
            }

            /**
             * Adds a single [VehicleAttributePriorityMapping] to
             * [vehicleAttributePriorityMappings].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVehicleAttributePriorityMapping(
                vehicleAttributePriorityMapping: VehicleAttributePriorityMapping
            ) = apply {
                vehicleAttributePriorityMappings =
                    (vehicleAttributePriorityMappings ?: JsonField.of(mutableListOf())).also {
                        checkKnown("vehicleAttributePriorityMappings", it)
                            .add(vehicleAttributePriorityMapping)
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
             * Returns an immutable instance of [Options].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Options =
                Options(
                    alternateAssignments,
                    dropoffDetails,
                    (orderAttributePriorityMappings ?: JsonMissing.of()).map { it.toImmutable() },
                    travelCost,
                    (vehicleAttributePriorityMappings ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Options = apply {
            if (validated) {
                return@apply
            }

            alternateAssignments()
            dropoffDetails()
            orderAttributePriorityMappings().ifPresent { it.forEach { it.validate() } }
            travelCost().ifPresent { it.validate() }
            vehicleAttributePriorityMappings().ifPresent { it.forEach { it.validate() } }
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
            (if (alternateAssignments.asKnown().isPresent) 1 else 0) +
                (if (dropoffDetails.asKnown().isPresent) 1 else 0) +
                (orderAttributePriorityMappings.asKnown().getOrNull()?.sumOf {
                    it.validity().toInt()
                } ?: 0) +
                (travelCost.asKnown().getOrNull()?.validity() ?: 0) +
                (vehicleAttributePriorityMappings.asKnown().getOrNull()?.sumOf {
                    it.validity().toInt()
                } ?: 0)

        class OrderAttributePriorityMapping
        private constructor(
            private val attribute: JsonField<String>,
            private val operator: JsonField<String>,
            private val priority: JsonField<String>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("attribute")
                @ExcludeMissing
                attribute: JsonField<String> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<String> = JsonMissing.of(),
                @JsonProperty("priority")
                @ExcludeMissing
                priority: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(attribute, operator, priority, value, mutableMapOf())

            /**
             * Specify the name of the attribute. The `attribute` is compared to the keys (of each
             * `key:value` pair) in `orders.attributes` during evaluation.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun attribute(): String = attribute.getRequired("attribute")

            /**
             * Specify the operator to denote the relation between `attribute` and the `value`
             * specified above. The `attribute` , `operator` and `value` together constitute the
             * condition that an order must meet to assume the specified priority. We support the
             * following operators currently:
             * - Equal to (==)
             * - Less than (<)
             * - Less tha equal to (<=)
             * - Greater than (>)
             * - Greater than equal to (>=)
             * - Contains (contains)
             *
             * Please note that when using "contains" operator only one `value` can be specified and
             * the corresponding `attribute` must contain multiple values when defined for an order.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): String = operator.getRequired("operator")

            /**
             * Specify the priority score that should be assigned when an order qualifies the
             * criteria specified above. A higher value indicates a higher priority. Valid values
             * are \[1,10\].
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun priority(): String = priority.getRequired("priority")

            /**
             * Specify the desired value of the attribute to be applied for this order. `value`
             * provided here is compared to the values (of each `key:value` pair) in
             * `orders.attributes` during evaluation.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): String = value.getRequired("value")

            /**
             * Returns the raw JSON value of [attribute].
             *
             * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attribute")
            @ExcludeMissing
            fun _attribute(): JsonField<String> = attribute

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

            /**
             * Returns the raw JSON value of [priority].
             *
             * Unlike [priority], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<String> = priority

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                 * [OrderAttributePriorityMapping].
                 *
                 * The following fields are required:
                 * ```java
                 * .attribute()
                 * .operator()
                 * .priority()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OrderAttributePriorityMapping]. */
            class Builder internal constructor() {

                private var attribute: JsonField<String>? = null
                private var operator: JsonField<String>? = null
                private var priority: JsonField<String>? = null
                private var value: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(orderAttributePriorityMapping: OrderAttributePriorityMapping) =
                    apply {
                        attribute = orderAttributePriorityMapping.attribute
                        operator = orderAttributePriorityMapping.operator
                        priority = orderAttributePriorityMapping.priority
                        value = orderAttributePriorityMapping.value
                        additionalProperties =
                            orderAttributePriorityMapping.additionalProperties.toMutableMap()
                    }

                /**
                 * Specify the name of the attribute. The `attribute` is compared to the keys (of
                 * each `key:value` pair) in `orders.attributes` during evaluation.
                 */
                fun attribute(attribute: String) = attribute(JsonField.of(attribute))

                /**
                 * Sets [Builder.attribute] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attribute] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun attribute(attribute: JsonField<String>) = apply { this.attribute = attribute }

                /**
                 * Specify the operator to denote the relation between `attribute` and the `value`
                 * specified above. The `attribute` , `operator` and `value` together constitute the
                 * condition that an order must meet to assume the specified priority. We support
                 * the following operators currently:
                 * - Equal to (==)
                 * - Less than (<)
                 * - Less tha equal to (<=)
                 * - Greater than (>)
                 * - Greater than equal to (>=)
                 * - Contains (contains)
                 *
                 * Please note that when using "contains" operator only one `value` can be specified
                 * and the corresponding `attribute` must contain multiple values when defined for
                 * an order.
                 */
                fun operator(operator: String) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<String>) = apply { this.operator = operator }

                /**
                 * Specify the priority score that should be assigned when an order qualifies the
                 * criteria specified above. A higher value indicates a higher priority. Valid
                 * values are \[1,10\].
                 */
                fun priority(priority: String) = priority(JsonField.of(priority))

                /**
                 * Sets [Builder.priority] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.priority] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun priority(priority: JsonField<String>) = apply { this.priority = priority }

                /**
                 * Specify the desired value of the attribute to be applied for this order. `value`
                 * provided here is compared to the values (of each `key:value` pair) in
                 * `orders.attributes` during evaluation.
                 */
                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

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
                 * Returns an immutable instance of [OrderAttributePriorityMapping].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .attribute()
                 * .operator()
                 * .priority()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): OrderAttributePriorityMapping =
                    OrderAttributePriorityMapping(
                        checkRequired("attribute", attribute),
                        checkRequired("operator", operator),
                        checkRequired("priority", priority),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OrderAttributePriorityMapping = apply {
                if (validated) {
                    return@apply
                }

                attribute()
                operator()
                priority()
                value()
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
                (if (attribute.asKnown().isPresent) 1 else 0) +
                    (if (operator.asKnown().isPresent) 1 else 0) +
                    (if (priority.asKnown().isPresent) 1 else 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OrderAttributePriorityMapping && attribute == other.attribute && operator == other.operator && priority == other.priority && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(attribute, operator, priority, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OrderAttributePriorityMapping{attribute=$attribute, operator=$operator, priority=$priority, value=$value, additionalProperties=$additionalProperties}"
        }

        /**
         * Choose a travel cost that will be used by the service for assigning vehicles efficiently
         * from a set of qualifying ones.
         */
        class TravelCost @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val DRIVING_ETA = of("driving_eta")

                @JvmField val DRIVING_DISTANCE = of("driving_distance")

                @JvmField val STRAIGHT_LINE_DISTANCE = of("straight_line_distance")

                @JvmStatic fun of(value: String) = TravelCost(JsonField.of(value))
            }

            /** An enum containing [TravelCost]'s known values. */
            enum class Known {
                DRIVING_ETA,
                DRIVING_DISTANCE,
                STRAIGHT_LINE_DISTANCE,
            }

            /**
             * An enum containing [TravelCost]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [TravelCost] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DRIVING_ETA,
                DRIVING_DISTANCE,
                STRAIGHT_LINE_DISTANCE,
                /**
                 * An enum member indicating that [TravelCost] was instantiated with an unknown
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
                    DRIVING_ETA -> Value.DRIVING_ETA
                    DRIVING_DISTANCE -> Value.DRIVING_DISTANCE
                    STRAIGHT_LINE_DISTANCE -> Value.STRAIGHT_LINE_DISTANCE
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
                    DRIVING_ETA -> Known.DRIVING_ETA
                    DRIVING_DISTANCE -> Known.DRIVING_DISTANCE
                    STRAIGHT_LINE_DISTANCE -> Known.STRAIGHT_LINE_DISTANCE
                    else -> throw NextbillionSdkInvalidDataException("Unknown TravelCost: $value")
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

            fun validate(): TravelCost = apply {
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

                return /* spotless:off */ other is TravelCost && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class VehicleAttributePriorityMapping
        private constructor(
            private val attribute: JsonField<String>,
            private val operator: JsonField<String>,
            private val priority: JsonField<String>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("attribute")
                @ExcludeMissing
                attribute: JsonField<String> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<String> = JsonMissing.of(),
                @JsonProperty("priority")
                @ExcludeMissing
                priority: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(attribute, operator, priority, value, mutableMapOf())

            /**
             * Specify the name of the attribute. The `attribute` is compared to the keys (of each
             * `key:value` pair) in `vehicles.attributes` during evaluation.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun attribute(): String = attribute.getRequired("attribute")

            /**
             * Specify the operator to denote the relation between `attribute` and the `value`
             * specified above. The `attribute` , `operator` and `value` together constitute the
             * condition that a vehicle must meet to assume the specified priority. We support the
             * following operators currently:
             * - Equal to (==)
             * - Less than (<)
             * - Less tha equal to (<=)
             * - Greater than (>)
             * - Greater than equal to (>=)
             * - Contains (contains)
             *
             * Please note that when using "contains" operator only one `value` can be specified and
             * the corresponding `attribute` must contain multiple values when defined for a
             * vehicle.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): String = operator.getRequired("operator")

            /**
             * Specify the priority score that should be assigned when a vehicle qualifies the
             * criteria specified above. A higher value indicates a higher priority. Valid values
             * are \[1,10\].
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun priority(): String = priority.getRequired("priority")

            /**
             * Specify the desired value of the attribute to be applied for this vehicle. `value`
             * provided here is compared to the values (of each `key:value` pair) in
             * `vehicles.attributes` during evaluation.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): String = value.getRequired("value")

            /**
             * Returns the raw JSON value of [attribute].
             *
             * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attribute")
            @ExcludeMissing
            fun _attribute(): JsonField<String> = attribute

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

            /**
             * Returns the raw JSON value of [priority].
             *
             * Unlike [priority], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<String> = priority

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                 * [VehicleAttributePriorityMapping].
                 *
                 * The following fields are required:
                 * ```java
                 * .attribute()
                 * .operator()
                 * .priority()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [VehicleAttributePriorityMapping]. */
            class Builder internal constructor() {

                private var attribute: JsonField<String>? = null
                private var operator: JsonField<String>? = null
                private var priority: JsonField<String>? = null
                private var value: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    vehicleAttributePriorityMapping: VehicleAttributePriorityMapping
                ) = apply {
                    attribute = vehicleAttributePriorityMapping.attribute
                    operator = vehicleAttributePriorityMapping.operator
                    priority = vehicleAttributePriorityMapping.priority
                    value = vehicleAttributePriorityMapping.value
                    additionalProperties =
                        vehicleAttributePriorityMapping.additionalProperties.toMutableMap()
                }

                /**
                 * Specify the name of the attribute. The `attribute` is compared to the keys (of
                 * each `key:value` pair) in `vehicles.attributes` during evaluation.
                 */
                fun attribute(attribute: String) = attribute(JsonField.of(attribute))

                /**
                 * Sets [Builder.attribute] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attribute] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun attribute(attribute: JsonField<String>) = apply { this.attribute = attribute }

                /**
                 * Specify the operator to denote the relation between `attribute` and the `value`
                 * specified above. The `attribute` , `operator` and `value` together constitute the
                 * condition that a vehicle must meet to assume the specified priority. We support
                 * the following operators currently:
                 * - Equal to (==)
                 * - Less than (<)
                 * - Less tha equal to (<=)
                 * - Greater than (>)
                 * - Greater than equal to (>=)
                 * - Contains (contains)
                 *
                 * Please note that when using "contains" operator only one `value` can be specified
                 * and the corresponding `attribute` must contain multiple values when defined for a
                 * vehicle.
                 */
                fun operator(operator: String) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<String>) = apply { this.operator = operator }

                /**
                 * Specify the priority score that should be assigned when a vehicle qualifies the
                 * criteria specified above. A higher value indicates a higher priority. Valid
                 * values are \[1,10\].
                 */
                fun priority(priority: String) = priority(JsonField.of(priority))

                /**
                 * Sets [Builder.priority] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.priority] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun priority(priority: JsonField<String>) = apply { this.priority = priority }

                /**
                 * Specify the desired value of the attribute to be applied for this vehicle.
                 * `value` provided here is compared to the values (of each `key:value` pair) in
                 * `vehicles.attributes` during evaluation.
                 */
                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

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
                 * Returns an immutable instance of [VehicleAttributePriorityMapping].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .attribute()
                 * .operator()
                 * .priority()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): VehicleAttributePriorityMapping =
                    VehicleAttributePriorityMapping(
                        checkRequired("attribute", attribute),
                        checkRequired("operator", operator),
                        checkRequired("priority", priority),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): VehicleAttributePriorityMapping = apply {
                if (validated) {
                    return@apply
                }

                attribute()
                operator()
                priority()
                value()
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
                (if (attribute.asKnown().isPresent) 1 else 0) +
                    (if (operator.asKnown().isPresent) 1 else 0) +
                    (if (priority.asKnown().isPresent) 1 else 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is VehicleAttributePriorityMapping && attribute == other.attribute && operator == other.operator && priority == other.priority && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(attribute, operator, priority, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VehicleAttributePriorityMapping{attribute=$attribute, operator=$operator, priority=$priority, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Options && alternateAssignments == other.alternateAssignments && dropoffDetails == other.dropoffDetails && orderAttributePriorityMappings == other.orderAttributePriorityMappings && travelCost == other.travelCost && vehicleAttributePriorityMappings == other.vehicleAttributePriorityMappings && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(alternateAssignments, dropoffDetails, orderAttributePriorityMappings, travelCost, vehicleAttributePriorityMappings, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Options{alternateAssignments=$alternateAssignments, dropoffDetails=$dropoffDetails, orderAttributePriorityMappings=$orderAttributePriorityMappings, travelCost=$travelCost, vehicleAttributePriorityMappings=$vehicleAttributePriorityMappings, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DriverAssignmentAssignParams && key == other.key && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DriverAssignmentAssignParams{key=$key, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
