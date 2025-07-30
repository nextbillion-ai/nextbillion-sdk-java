// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.optimization.driverassignment

import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.checkKnown
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.toImmutable
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Vehicle
private constructor(
    private val id: JsonField<String>,
    private val location: JsonField<Location>,
    private val attributes: JsonValue,
    private val priority: JsonField<Long>,
    private val remainingWaypoints: JsonField<List<Location>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing location: JsonField<Location> = JsonMissing.of(),
        @JsonProperty("attributes") @ExcludeMissing attributes: JsonValue = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("remaining_waypoints")
        @ExcludeMissing
        remainingWaypoints: JsonField<List<Location>> = JsonMissing.of(),
    ) : this(id, location, attributes, priority, remainingWaypoints, mutableMapOf())

    /**
     * Specify a unique ID for the vehicle.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Specify the location coordinates where the vehicle is currently located. This input is
     * mandatory for each vehicle.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun location(): Location = location.getRequired("location")

    /**
     * Specify custom attributes for the vehicle. Each attribute should be created as a key:value
     * pair. These attributes can be used in the orders.vehicle_preferences input to refine the
     * search of vehicles for each order.
     *
     * The maximum number of key:value pairs that can be specified under attributes for a given
     * vehicle, is limited to 30.
     */
    @JsonProperty("attributes") @ExcludeMissing fun _attributes(): JsonValue = attributes

    /**
     * Specify the priority for this vehicle. A higher value indicates a higher priority. When
     * specified, it will override any priority score deduced from
     * vehicle_attribute_priority_mappings for this vehicle. Valid values are \[1, 10\] and default
     * is 0.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun priority(): Optional<Long> = priority.getOptional("priority")

    /**
     * An array of objects to collect the location coordinates of the stops remaining on an ongoing
     * trip of the vehicle. The service can assign new orders to the vehicle if they are
     * cost-effective. Once a new order is assigned, the vehicle must complete all the steps in the
     * ongoing trip before proceeding to pickup the newly assigned order.
     *
     * Please note that a maximum of 10 waypoints can be specified for a given vehicle.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun remainingWaypoints(): Optional<List<Location>> =
        remainingWaypoints.getOptional("remaining_waypoints")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<Location> = location

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Long> = priority

    /**
     * Returns the raw JSON value of [remainingWaypoints].
     *
     * Unlike [remainingWaypoints], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("remaining_waypoints")
    @ExcludeMissing
    fun _remainingWaypoints(): JsonField<List<Location>> = remainingWaypoints

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
         * Returns a mutable builder for constructing an instance of [Vehicle].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .location()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Vehicle]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var location: JsonField<Location>? = null
        private var attributes: JsonValue = JsonMissing.of()
        private var priority: JsonField<Long> = JsonMissing.of()
        private var remainingWaypoints: JsonField<MutableList<Location>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(vehicle: Vehicle) = apply {
            id = vehicle.id
            location = vehicle.location
            attributes = vehicle.attributes
            priority = vehicle.priority
            remainingWaypoints = vehicle.remainingWaypoints.map { it.toMutableList() }
            additionalProperties = vehicle.additionalProperties.toMutableMap()
        }

        /** Specify a unique ID for the vehicle. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Specify the location coordinates where the vehicle is currently located. This input is
         * mandatory for each vehicle.
         */
        fun location(location: Location) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [Location] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun location(location: JsonField<Location>) = apply { this.location = location }

        /**
         * Specify custom attributes for the vehicle. Each attribute should be created as a
         * key:value pair. These attributes can be used in the orders.vehicle_preferences input to
         * refine the search of vehicles for each order.
         *
         * The maximum number of key:value pairs that can be specified under attributes for a given
         * vehicle, is limited to 30.
         */
        fun attributes(attributes: JsonValue) = apply { this.attributes = attributes }

        /**
         * Specify the priority for this vehicle. A higher value indicates a higher priority. When
         * specified, it will override any priority score deduced from
         * vehicle_attribute_priority_mappings for this vehicle. Valid values are \[1, 10\] and
         * default is 0.
         */
        fun priority(priority: Long) = priority(JsonField.of(priority))

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<Long>) = apply { this.priority = priority }

        /**
         * An array of objects to collect the location coordinates of the stops remaining on an
         * ongoing trip of the vehicle. The service can assign new orders to the vehicle if they are
         * cost-effective. Once a new order is assigned, the vehicle must complete all the steps in
         * the ongoing trip before proceeding to pickup the newly assigned order.
         *
         * Please note that a maximum of 10 waypoints can be specified for a given vehicle.
         */
        fun remainingWaypoints(remainingWaypoints: List<Location>) =
            remainingWaypoints(JsonField.of(remainingWaypoints))

        /**
         * Sets [Builder.remainingWaypoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remainingWaypoints] with a well-typed `List<Location>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun remainingWaypoints(remainingWaypoints: JsonField<List<Location>>) = apply {
            this.remainingWaypoints = remainingWaypoints.map { it.toMutableList() }
        }

        /**
         * Adds a single [Location] to [remainingWaypoints].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemainingWaypoint(remainingWaypoint: Location) = apply {
            remainingWaypoints =
                (remainingWaypoints ?: JsonField.of(mutableListOf())).also {
                    checkKnown("remainingWaypoints", it).add(remainingWaypoint)
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
         * Returns an immutable instance of [Vehicle].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .location()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Vehicle =
            Vehicle(
                checkRequired("id", id),
                checkRequired("location", location),
                attributes,
                priority,
                (remainingWaypoints ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Vehicle = apply {
        if (validated) {
            return@apply
        }

        id()
        location().validate()
        priority()
        remainingWaypoints().ifPresent { it.forEach { it.validate() } }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (location.asKnown().getOrNull()?.validity() ?: 0) +
            (if (priority.asKnown().isPresent) 1 else 0) +
            (remainingWaypoints.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * Specify the location coordinates where the vehicle is currently located. This input is
     * mandatory for each vehicle.
     */
    class Location
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
         * Latitude of the vehicle's current location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lat(): Optional<Double> = lat.getOptional("lat")

        /**
         * Longitude of the vehicle's current location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
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

            /** Returns a mutable builder for constructing an instance of [Location]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Location]. */
        class Builder internal constructor() {

            private var lat: JsonField<Double> = JsonMissing.of()
            private var lng: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(location: Location) = apply {
                lat = location.lat
                lng = location.lng
                additionalProperties = location.additionalProperties.toMutableMap()
            }

            /** Latitude of the vehicle's current location. */
            fun lat(lat: Double) = lat(JsonField.of(lat))

            /**
             * Sets [Builder.lat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

            /** Longitude of the vehicle's current location. */
            fun lng(lng: Double) = lng(JsonField.of(lng))

            /**
             * Sets [Builder.lng] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lng] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lng(lng: JsonField<Double>) = apply { this.lng = lng }

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
             * Returns an immutable instance of [Location].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Location = Location(lat, lng, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Location = apply {
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

            return /* spotless:off */ other is Location && lat == other.lat && lng == other.lng && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(lat, lng, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Location{lat=$lat, lng=$lng, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Vehicle && id == other.id && location == other.location && attributes == other.attributes && priority == other.priority && remainingWaypoints == other.remainingWaypoints && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, location, attributes, priority, remainingWaypoints, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Vehicle{id=$id, location=$location, attributes=$attributes, priority=$priority, remainingWaypoints=$remainingWaypoints, additionalProperties=$additionalProperties}"
}
