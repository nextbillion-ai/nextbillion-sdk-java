// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.optimization

import ai.nextbillion.core.Enum
import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.checkKnown
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

class OptimizationComputeResponse
private constructor(
    private val code: JsonField<String>,
    private val location: JsonField<Location>,
    private val trips: JsonField<List<Trip>>,
    private val waypoints: JsonField<List<Waypoint>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing location: JsonField<Location> = JsonMissing.of(),
        @JsonProperty("trips") @ExcludeMissing trips: JsonField<List<Trip>> = JsonMissing.of(),
        @JsonProperty("waypoints")
        @ExcludeMissing
        waypoints: JsonField<List<Waypoint>> = JsonMissing.of(),
    ) : this(code, location, trips, waypoints, mutableMapOf())

    /**
     * A string indicating the state of the response. This is a separate code than the HTTP status
     * code. On normal valid responses, the value will be Ok.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun code(): Optional<String> = code.getOptional("code")

    /**
     * Contains the latitude and longitude of a location
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun location(): Optional<Location> = location.getOptional("location")

    /**
     * An array of 0 or 1 trip objects. Each object has the following schema.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun trips(): Optional<List<Trip>> = trips.getOptional("trips")

    /**
     * Each waypoint is an input coordinate snapped to the road and path network.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun waypoints(): Optional<List<Waypoint>> = waypoints.getOptional("waypoints")

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<Location> = location

    /**
     * Returns the raw JSON value of [trips].
     *
     * Unlike [trips], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trips") @ExcludeMissing fun _trips(): JsonField<List<Trip>> = trips

    /**
     * Returns the raw JSON value of [waypoints].
     *
     * Unlike [waypoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("waypoints")
    @ExcludeMissing
    fun _waypoints(): JsonField<List<Waypoint>> = waypoints

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
         * Returns a mutable builder for constructing an instance of [OptimizationComputeResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OptimizationComputeResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<String> = JsonMissing.of()
        private var location: JsonField<Location> = JsonMissing.of()
        private var trips: JsonField<MutableList<Trip>>? = null
        private var waypoints: JsonField<MutableList<Waypoint>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(optimizationComputeResponse: OptimizationComputeResponse) = apply {
            code = optimizationComputeResponse.code
            location = optimizationComputeResponse.location
            trips = optimizationComputeResponse.trips.map { it.toMutableList() }
            waypoints = optimizationComputeResponse.waypoints.map { it.toMutableList() }
            additionalProperties = optimizationComputeResponse.additionalProperties.toMutableMap()
        }

        /**
         * A string indicating the state of the response. This is a separate code than the HTTP
         * status code. On normal valid responses, the value will be Ok.
         */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** Contains the latitude and longitude of a location */
        fun location(location: Location) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed [Location] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun location(location: JsonField<Location>) = apply { this.location = location }

        /** An array of 0 or 1 trip objects. Each object has the following schema. */
        fun trips(trips: List<Trip>) = trips(JsonField.of(trips))

        /**
         * Sets [Builder.trips] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trips] with a well-typed `List<Trip>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
                (trips ?: JsonField.of(mutableListOf())).also { checkKnown("trips", it).add(trip) }
        }

        /** Each waypoint is an input coordinate snapped to the road and path network. */
        fun waypoints(waypoints: List<Waypoint>) = waypoints(JsonField.of(waypoints))

        /**
         * Sets [Builder.waypoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.waypoints] with a well-typed `List<Waypoint>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun waypoints(waypoints: JsonField<List<Waypoint>>) = apply {
            this.waypoints = waypoints.map { it.toMutableList() }
        }

        /**
         * Adds a single [Waypoint] to [waypoints].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWaypoint(waypoint: Waypoint) = apply {
            waypoints =
                (waypoints ?: JsonField.of(mutableListOf())).also {
                    checkKnown("waypoints", it).add(waypoint)
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
         * Returns an immutable instance of [OptimizationComputeResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OptimizationComputeResponse =
            OptimizationComputeResponse(
                code,
                location,
                (trips ?: JsonMissing.of()).map { it.toImmutable() },
                (waypoints ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OptimizationComputeResponse = apply {
        if (validated) {
            return@apply
        }

        code()
        location().ifPresent { it.validate() }
        trips().ifPresent { it.forEach { it.validate() } }
        waypoints().ifPresent { it.forEach { it.validate() } }
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
            (location.asKnown().getOrNull()?.validity() ?: 0) +
            (trips.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (waypoints.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** Contains the latitude and longitude of a location */
    class Location
    private constructor(
        private val latitude: JsonField<Double>,
        private val longitude: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("latitude")
            @ExcludeMissing
            latitude: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("longitude")
            @ExcludeMissing
            longitude: JsonField<Double> = JsonMissing.of(),
        ) : this(latitude, longitude, mutableMapOf())

        /**
         * Latitude coordinate of the location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun latitude(): Optional<Double> = latitude.getOptional("latitude")

        /**
         * Longitude coordinate of the location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun longitude(): Optional<Double> = longitude.getOptional("longitude")

        /**
         * Returns the raw JSON value of [latitude].
         *
         * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("latitude") @ExcludeMissing fun _latitude(): JsonField<Double> = latitude

        /**
         * Returns the raw JSON value of [longitude].
         *
         * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("longitude") @ExcludeMissing fun _longitude(): JsonField<Double> = longitude

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

            private var latitude: JsonField<Double> = JsonMissing.of()
            private var longitude: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(location: Location) = apply {
                latitude = location.latitude
                longitude = location.longitude
                additionalProperties = location.additionalProperties.toMutableMap()
            }

            /** Latitude coordinate of the location. */
            fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

            /**
             * Sets [Builder.latitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latitude] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

            /** Longitude coordinate of the location. */
            fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

            /**
             * Sets [Builder.longitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.longitude] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun longitude(longitude: JsonField<Double>) = apply { this.longitude = longitude }

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
            fun build(): Location =
                Location(latitude, longitude, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Location = apply {
            if (validated) {
                return@apply
            }

            latitude()
            longitude()
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
            (if (latitude.asKnown().isPresent) 1 else 0) +
                (if (longitude.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Location && latitude == other.latitude && longitude == other.longitude && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(latitude, longitude, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Location{latitude=$latitude, longitude=$longitude, additionalProperties=$additionalProperties}"
    }

    class Trip
    private constructor(
        private val distance: JsonField<Double>,
        private val duration: JsonField<Double>,
        private val geojson: JsonField<Geojson>,
        private val geometry: JsonField<String>,
        private val legs: JsonField<List<Leg>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("distance")
            @ExcludeMissing
            distance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("duration")
            @ExcludeMissing
            duration: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("geojson") @ExcludeMissing geojson: JsonField<Geojson> = JsonMissing.of(),
            @JsonProperty("geometry")
            @ExcludeMissing
            geometry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("legs") @ExcludeMissing legs: JsonField<List<Leg>> = JsonMissing.of(),
        ) : this(distance, duration, geojson, geometry, legs, mutableMapOf())

        /**
         * Distance of the trip in meters.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun distance(): Optional<Double> = distance.getOptional("distance")

        /**
         * Duration of the trip in seconds
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun duration(): Optional<Double> = duration.getOptional("duration")

        /**
         * The GeoJSON representation of the route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geojson(): Optional<Geojson> = geojson.getOptional("geojson")

        /**
         * polyline or polyline6 format of route geometry.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geometry(): Optional<String> = geometry.getOptional("geometry")

        /**
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun legs(): Optional<List<Leg>> = legs.getOptional("legs")

        /**
         * Returns the raw JSON value of [distance].
         *
         * Unlike [distance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Double> = distance

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

        /**
         * Returns the raw JSON value of [geojson].
         *
         * Unlike [geojson], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("geojson") @ExcludeMissing fun _geojson(): JsonField<Geojson> = geojson

        /**
         * Returns the raw JSON value of [geometry].
         *
         * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("geometry") @ExcludeMissing fun _geometry(): JsonField<String> = geometry

        /**
         * Returns the raw JSON value of [legs].
         *
         * Unlike [legs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("legs") @ExcludeMissing fun _legs(): JsonField<List<Leg>> = legs

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

            private var distance: JsonField<Double> = JsonMissing.of()
            private var duration: JsonField<Double> = JsonMissing.of()
            private var geojson: JsonField<Geojson> = JsonMissing.of()
            private var geometry: JsonField<String> = JsonMissing.of()
            private var legs: JsonField<MutableList<Leg>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trip: Trip) = apply {
                distance = trip.distance
                duration = trip.duration
                geojson = trip.geojson
                geometry = trip.geometry
                legs = trip.legs.map { it.toMutableList() }
                additionalProperties = trip.additionalProperties.toMutableMap()
            }

            /** Distance of the trip in meters. */
            fun distance(distance: Double) = distance(JsonField.of(distance))

            /**
             * Sets [Builder.distance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distance] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

            /** Duration of the trip in seconds */
            fun duration(duration: Double) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

            /** The GeoJSON representation of the route. */
            fun geojson(geojson: Geojson) = geojson(JsonField.of(geojson))

            /**
             * Sets [Builder.geojson] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geojson] with a well-typed [Geojson] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geojson(geojson: JsonField<Geojson>) = apply { this.geojson = geojson }

            /** polyline or polyline6 format of route geometry. */
            fun geometry(geometry: String) = geometry(JsonField.of(geometry))

            /**
             * Sets [Builder.geometry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geometry] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geometry(geometry: JsonField<String>) = apply { this.geometry = geometry }

            fun legs(legs: List<Leg>) = legs(JsonField.of(legs))

            /**
             * Sets [Builder.legs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legs] with a well-typed `List<Leg>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legs(legs: JsonField<List<Leg>>) = apply {
                this.legs = legs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Leg] to [legs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLeg(leg: Leg) = apply {
                legs =
                    (legs ?: JsonField.of(mutableListOf())).also { checkKnown("legs", it).add(leg) }
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
             * Returns an immutable instance of [Trip].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Trip =
                Trip(
                    distance,
                    duration,
                    geojson,
                    geometry,
                    (legs ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Trip = apply {
            if (validated) {
                return@apply
            }

            distance()
            duration()
            geojson().ifPresent { it.validate() }
            geometry()
            legs().ifPresent { it.forEach { it.validate() } }
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
                (if (duration.asKnown().isPresent) 1 else 0) +
                (geojson.asKnown().getOrNull()?.validity() ?: 0) +
                (if (geometry.asKnown().isPresent) 1 else 0) +
                (legs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** The GeoJSON representation of the route. */
        class Geojson
        private constructor(
            private val geometry: JsonField<String>,
            private val properties: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("geometry")
                @ExcludeMissing
                geometry: JsonField<String> = JsonMissing.of(),
                @JsonProperty("properties")
                @ExcludeMissing
                properties: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(geometry, properties, type, mutableMapOf())

            /**
             * The encoded geometry of the geojson in the trip.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun geometry(): Optional<String> = geometry.getOptional("geometry")

            /**
             * Additional properties associated with the trip.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun properties(): Optional<String> = properties.getOptional("properties")

            /**
             * The type of the GeoJSON object.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [geometry].
             *
             * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("geometry") @ExcludeMissing fun _geometry(): JsonField<String> = geometry

            /**
             * Returns the raw JSON value of [properties].
             *
             * Unlike [properties], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("properties")
            @ExcludeMissing
            fun _properties(): JsonField<String> = properties

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
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

                /** Returns a mutable builder for constructing an instance of [Geojson]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Geojson]. */
            class Builder internal constructor() {

                private var geometry: JsonField<String> = JsonMissing.of()
                private var properties: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(geojson: Geojson) = apply {
                    geometry = geojson.geometry
                    properties = geojson.properties
                    type = geojson.type
                    additionalProperties = geojson.additionalProperties.toMutableMap()
                }

                /** The encoded geometry of the geojson in the trip. */
                fun geometry(geometry: String) = geometry(JsonField.of(geometry))

                /**
                 * Sets [Builder.geometry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.geometry] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun geometry(geometry: JsonField<String>) = apply { this.geometry = geometry }

                /** Additional properties associated with the trip. */
                fun properties(properties: String) = properties(JsonField.of(properties))

                /**
                 * Sets [Builder.properties] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.properties] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun properties(properties: JsonField<String>) = apply {
                    this.properties = properties
                }

                /** The type of the GeoJSON object. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Geojson].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Geojson =
                    Geojson(geometry, properties, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Geojson = apply {
                if (validated) {
                    return@apply
                }

                geometry()
                properties()
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
                (if (geometry.asKnown().isPresent) 1 else 0) +
                    (if (properties.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /** The type of the GeoJSON object. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val POINT = of("Point")

                    @JvmField val MULTI_POINT = of("MultiPoint")

                    @JvmField val LINE_STRING = of("LineString")

                    @JvmField val MULTI_LINE_STRING = of("MultiLineString")

                    @JvmField val POLYGON = of("Polygon")

                    @JvmField val MULTI_POLYGON = of("MultiPolygon")

                    @JvmField val GEOMETRY_COLLECTION = of("GeometryCollection")

                    @JvmField val FEATURE = of("Feature")

                    @JvmField val FEATURE_COLLECTION = of("FeatureCollection")

                    @JvmField val LINK = of("Link")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    POINT,
                    MULTI_POINT,
                    LINE_STRING,
                    MULTI_LINE_STRING,
                    POLYGON,
                    MULTI_POLYGON,
                    GEOMETRY_COLLECTION,
                    FEATURE,
                    FEATURE_COLLECTION,
                    LINK,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    POINT,
                    MULTI_POINT,
                    LINE_STRING,
                    MULTI_LINE_STRING,
                    POLYGON,
                    MULTI_POLYGON,
                    GEOMETRY_COLLECTION,
                    FEATURE,
                    FEATURE_COLLECTION,
                    LINK,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        POINT -> Value.POINT
                        MULTI_POINT -> Value.MULTI_POINT
                        LINE_STRING -> Value.LINE_STRING
                        MULTI_LINE_STRING -> Value.MULTI_LINE_STRING
                        POLYGON -> Value.POLYGON
                        MULTI_POLYGON -> Value.MULTI_POLYGON
                        GEOMETRY_COLLECTION -> Value.GEOMETRY_COLLECTION
                        FEATURE -> Value.FEATURE
                        FEATURE_COLLECTION -> Value.FEATURE_COLLECTION
                        LINK -> Value.LINK
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
                        POINT -> Known.POINT
                        MULTI_POINT -> Known.MULTI_POINT
                        LINE_STRING -> Known.LINE_STRING
                        MULTI_LINE_STRING -> Known.MULTI_LINE_STRING
                        POLYGON -> Known.POLYGON
                        MULTI_POLYGON -> Known.MULTI_POLYGON
                        GEOMETRY_COLLECTION -> Known.GEOMETRY_COLLECTION
                        FEATURE -> Known.FEATURE
                        FEATURE_COLLECTION -> Known.FEATURE_COLLECTION
                        LINK -> Known.LINK
                        else -> throw NextbillionSdkInvalidDataException("Unknown Type: $value")
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

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Geojson && geometry == other.geometry && properties == other.properties && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(geometry, properties, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Geojson{geometry=$geometry, properties=$properties, type=$type, additionalProperties=$additionalProperties}"
        }

        class Leg
        private constructor(
            private val distance: JsonField<Double>,
            private val duration: JsonField<Double>,
            private val steps: JsonField<List<Step>>,
            private val summary: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("distance")
                @ExcludeMissing
                distance: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("duration")
                @ExcludeMissing
                duration: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("steps")
                @ExcludeMissing
                steps: JsonField<List<Step>> = JsonMissing.of(),
                @JsonProperty("summary")
                @ExcludeMissing
                summary: JsonField<String> = JsonMissing.of(),
            ) : this(distance, duration, steps, summary, mutableMapOf())

            /**
             * Distance of leg in metres.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun distance(): Optional<Double> = distance.getOptional("distance")

            /**
             * Duration of leg in seconds.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun duration(): Optional<Double> = duration.getOptional("duration")

            /**
             * An array of step objects.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun steps(): Optional<List<Step>> = steps.getOptional("steps")

            /**
             * Summary of the leg object.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun summary(): Optional<String> = summary.getOptional("summary")

            /**
             * Returns the raw JSON value of [distance].
             *
             * Unlike [distance], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Double> = distance

            /**
             * Returns the raw JSON value of [duration].
             *
             * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

            /**
             * Returns the raw JSON value of [steps].
             *
             * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("steps") @ExcludeMissing fun _steps(): JsonField<List<Step>> = steps

            /**
             * Returns the raw JSON value of [summary].
             *
             * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<String> = summary

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

                /** Returns a mutable builder for constructing an instance of [Leg]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Leg]. */
            class Builder internal constructor() {

                private var distance: JsonField<Double> = JsonMissing.of()
                private var duration: JsonField<Double> = JsonMissing.of()
                private var steps: JsonField<MutableList<Step>>? = null
                private var summary: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(leg: Leg) = apply {
                    distance = leg.distance
                    duration = leg.duration
                    steps = leg.steps.map { it.toMutableList() }
                    summary = leg.summary
                    additionalProperties = leg.additionalProperties.toMutableMap()
                }

                /** Distance of leg in metres. */
                fun distance(distance: Double) = distance(JsonField.of(distance))

                /**
                 * Sets [Builder.distance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.distance] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

                /** Duration of leg in seconds. */
                fun duration(duration: Double) = duration(JsonField.of(duration))

                /**
                 * Sets [Builder.duration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.duration] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

                /** An array of step objects. */
                fun steps(steps: List<Step>) = steps(JsonField.of(steps))

                /**
                 * Sets [Builder.steps] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.steps] with a well-typed `List<Step>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun steps(steps: JsonField<List<Step>>) = apply {
                    this.steps = steps.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Step] to [steps].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addStep(step: Step) = apply {
                    steps =
                        (steps ?: JsonField.of(mutableListOf())).also {
                            checkKnown("steps", it).add(step)
                        }
                }

                /** Summary of the leg object. */
                fun summary(summary: String) = summary(JsonField.of(summary))

                /**
                 * Sets [Builder.summary] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.summary] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun summary(summary: JsonField<String>) = apply { this.summary = summary }

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
                 * Returns an immutable instance of [Leg].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Leg =
                    Leg(
                        distance,
                        duration,
                        (steps ?: JsonMissing.of()).map { it.toImmutable() },
                        summary,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Leg = apply {
                if (validated) {
                    return@apply
                }

                distance()
                duration()
                steps().ifPresent { it.forEach { it.validate() } }
                summary()
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
                    (if (duration.asKnown().isPresent) 1 else 0) +
                    (steps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (summary.asKnown().isPresent) 1 else 0)

            class Step
            private constructor(
                private val distance: JsonField<Double>,
                private val duration: JsonField<Double>,
                private val geojson: JsonField<Geojson>,
                private val geometry: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("distance")
                    @ExcludeMissing
                    distance: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("duration")
                    @ExcludeMissing
                    duration: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("geojson")
                    @ExcludeMissing
                    geojson: JsonField<Geojson> = JsonMissing.of(),
                    @JsonProperty("geometry")
                    @ExcludeMissing
                    geometry: JsonField<String> = JsonMissing.of(),
                ) : this(distance, duration, geojson, geometry, mutableMapOf())

                /**
                 * Distance of the step object in meters.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun distance(): Optional<Double> = distance.getOptional("distance")

                /**
                 * Duration of the step object in seconds.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun duration(): Optional<Double> = duration.getOptional("duration")

                /**
                 * The GeoJSON representation of the step.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun geojson(): Optional<Geojson> = geojson.getOptional("geojson")

                /**
                 * Encoded geometry of the step in the selected format.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun geometry(): Optional<String> = geometry.getOptional("geometry")

                /**
                 * Returns the raw JSON value of [distance].
                 *
                 * Unlike [distance], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("distance")
                @ExcludeMissing
                fun _distance(): JsonField<Double> = distance

                /**
                 * Returns the raw JSON value of [duration].
                 *
                 * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("duration")
                @ExcludeMissing
                fun _duration(): JsonField<Double> = duration

                /**
                 * Returns the raw JSON value of [geojson].
                 *
                 * Unlike [geojson], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("geojson")
                @ExcludeMissing
                fun _geojson(): JsonField<Geojson> = geojson

                /**
                 * Returns the raw JSON value of [geometry].
                 *
                 * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("geometry")
                @ExcludeMissing
                fun _geometry(): JsonField<String> = geometry

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

                    /** Returns a mutable builder for constructing an instance of [Step]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Step]. */
                class Builder internal constructor() {

                    private var distance: JsonField<Double> = JsonMissing.of()
                    private var duration: JsonField<Double> = JsonMissing.of()
                    private var geojson: JsonField<Geojson> = JsonMissing.of()
                    private var geometry: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(step: Step) = apply {
                        distance = step.distance
                        duration = step.duration
                        geojson = step.geojson
                        geometry = step.geometry
                        additionalProperties = step.additionalProperties.toMutableMap()
                    }

                    /** Distance of the step object in meters. */
                    fun distance(distance: Double) = distance(JsonField.of(distance))

                    /**
                     * Sets [Builder.distance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.distance] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

                    /** Duration of the step object in seconds. */
                    fun duration(duration: Double) = duration(JsonField.of(duration))

                    /**
                     * Sets [Builder.duration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.duration] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

                    /** The GeoJSON representation of the step. */
                    fun geojson(geojson: Geojson) = geojson(JsonField.of(geojson))

                    /**
                     * Sets [Builder.geojson] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.geojson] with a well-typed [Geojson] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun geojson(geojson: JsonField<Geojson>) = apply { this.geojson = geojson }

                    /** Encoded geometry of the step in the selected format. */
                    fun geometry(geometry: String) = geometry(JsonField.of(geometry))

                    /**
                     * Sets [Builder.geometry] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.geometry] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun geometry(geometry: JsonField<String>) = apply { this.geometry = geometry }

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
                     * Returns an immutable instance of [Step].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Step =
                        Step(
                            distance,
                            duration,
                            geojson,
                            geometry,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Step = apply {
                    if (validated) {
                        return@apply
                    }

                    distance()
                    duration()
                    geojson().ifPresent { it.validate() }
                    geometry()
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
                        (if (duration.asKnown().isPresent) 1 else 0) +
                        (geojson.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (geometry.asKnown().isPresent) 1 else 0)

                /** The GeoJSON representation of the step. */
                class Geojson
                private constructor(
                    private val geometry: JsonField<String>,
                    private val properties: JsonField<String>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("geometry")
                        @ExcludeMissing
                        geometry: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("properties")
                        @ExcludeMissing
                        properties: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(geometry, properties, type, mutableMapOf())

                    /**
                     * The encoded geometry of the geojson in the step.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun geometry(): Optional<String> = geometry.getOptional("geometry")

                    /**
                     * Additional properties associated with the step.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun properties(): Optional<String> = properties.getOptional("properties")

                    /**
                     * The type of the GeoJSON object.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun type(): Optional<Type> = type.getOptional("type")

                    /**
                     * Returns the raw JSON value of [geometry].
                     *
                     * Unlike [geometry], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("geometry")
                    @ExcludeMissing
                    fun _geometry(): JsonField<String> = geometry

                    /**
                     * Returns the raw JSON value of [properties].
                     *
                     * Unlike [properties], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("properties")
                    @ExcludeMissing
                    fun _properties(): JsonField<String> = properties

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

                        /** Returns a mutable builder for constructing an instance of [Geojson]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Geojson]. */
                    class Builder internal constructor() {

                        private var geometry: JsonField<String> = JsonMissing.of()
                        private var properties: JsonField<String> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(geojson: Geojson) = apply {
                            geometry = geojson.geometry
                            properties = geojson.properties
                            type = geojson.type
                            additionalProperties = geojson.additionalProperties.toMutableMap()
                        }

                        /** The encoded geometry of the geojson in the step. */
                        fun geometry(geometry: String) = geometry(JsonField.of(geometry))

                        /**
                         * Sets [Builder.geometry] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.geometry] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun geometry(geometry: JsonField<String>) = apply {
                            this.geometry = geometry
                        }

                        /** Additional properties associated with the step. */
                        fun properties(properties: String) = properties(JsonField.of(properties))

                        /**
                         * Sets [Builder.properties] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.properties] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun properties(properties: JsonField<String>) = apply {
                            this.properties = properties
                        }

                        /** The type of the GeoJSON object. */
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
                         * Returns an immutable instance of [Geojson].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Geojson =
                            Geojson(geometry, properties, type, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): Geojson = apply {
                        if (validated) {
                            return@apply
                        }

                        geometry()
                        properties()
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
                        (if (geometry.asKnown().isPresent) 1 else 0) +
                            (if (properties.asKnown().isPresent) 1 else 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    /** The type of the GeoJSON object. */
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

                            @JvmField val POINT = of("Point")

                            @JvmField val MULTI_POINT = of("MultiPoint")

                            @JvmField val LINE_STRING = of("LineString")

                            @JvmField val MULTI_LINE_STRING = of("MultiLineString")

                            @JvmField val POLYGON = of("Polygon")

                            @JvmField val MULTI_POLYGON = of("MultiPolygon")

                            @JvmField val GEOMETRY_COLLECTION = of("GeometryCollection")

                            @JvmField val FEATURE = of("Feature")

                            @JvmField val FEATURE_COLLECTION = of("FeatureCollection")

                            @JvmField val LINK = of("Link")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            POINT,
                            MULTI_POINT,
                            LINE_STRING,
                            MULTI_LINE_STRING,
                            POLYGON,
                            MULTI_POLYGON,
                            GEOMETRY_COLLECTION,
                            FEATURE,
                            FEATURE_COLLECTION,
                            LINK,
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
                            POINT,
                            MULTI_POINT,
                            LINE_STRING,
                            MULTI_LINE_STRING,
                            POLYGON,
                            MULTI_POLYGON,
                            GEOMETRY_COLLECTION,
                            FEATURE,
                            FEATURE_COLLECTION,
                            LINK,
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
                                POINT -> Value.POINT
                                MULTI_POINT -> Value.MULTI_POINT
                                LINE_STRING -> Value.LINE_STRING
                                MULTI_LINE_STRING -> Value.MULTI_LINE_STRING
                                POLYGON -> Value.POLYGON
                                MULTI_POLYGON -> Value.MULTI_POLYGON
                                GEOMETRY_COLLECTION -> Value.GEOMETRY_COLLECTION
                                FEATURE -> Value.FEATURE
                                FEATURE_COLLECTION -> Value.FEATURE_COLLECTION
                                LINK -> Value.LINK
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
                                POINT -> Known.POINT
                                MULTI_POINT -> Known.MULTI_POINT
                                LINE_STRING -> Known.LINE_STRING
                                MULTI_LINE_STRING -> Known.MULTI_LINE_STRING
                                POLYGON -> Known.POLYGON
                                MULTI_POLYGON -> Known.MULTI_POLYGON
                                GEOMETRY_COLLECTION -> Known.GEOMETRY_COLLECTION
                                FEATURE -> Known.FEATURE
                                FEATURE_COLLECTION -> Known.FEATURE_COLLECTION
                                LINK -> Known.LINK
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

                        return /* spotless:off */ other is Geojson && geometry == other.geometry && properties == other.properties && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(geometry, properties, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Geojson{geometry=$geometry, properties=$properties, type=$type, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Step && distance == other.distance && duration == other.duration && geojson == other.geojson && geometry == other.geometry && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(distance, duration, geojson, geometry, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Step{distance=$distance, duration=$duration, geojson=$geojson, geometry=$geometry, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Leg && distance == other.distance && duration == other.duration && steps == other.steps && summary == other.summary && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(distance, duration, steps, summary, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Leg{distance=$distance, duration=$duration, steps=$steps, summary=$summary, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Trip && distance == other.distance && duration == other.duration && geojson == other.geojson && geometry == other.geometry && legs == other.legs && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(distance, duration, geojson, geometry, legs, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Trip{distance=$distance, duration=$duration, geojson=$geojson, geometry=$geometry, legs=$legs, additionalProperties=$additionalProperties}"
    }

    class Waypoint
    private constructor(
        private val location: JsonField<Location>,
        private val name: JsonField<String>,
        private val tripsIndex: JsonField<Long>,
        private val waypointIndex: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("location")
            @ExcludeMissing
            location: JsonField<Location> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trips_index")
            @ExcludeMissing
            tripsIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("waypoint_index")
            @ExcludeMissing
            waypointIndex: JsonField<Long> = JsonMissing.of(),
        ) : this(location, name, tripsIndex, waypointIndex, mutableMapOf())

        /**
         * Describes the location of the waypoint.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun location(): Optional<Location> = location.getOptional("location")

        /**
         * Name of the waypoint.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Denotes the ID of a trip. Starts with 0.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tripsIndex(): Optional<Long> = tripsIndex.getOptional("trips_index")

        /**
         * Denotes the id of a waypoint. The first waypoint is denoted with 0. And onwards with 1, 2
         * etc.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun waypointIndex(): Optional<Long> = waypointIndex.getOptional("waypoint_index")

        /**
         * Returns the raw JSON value of [location].
         *
         * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<Location> = location

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [tripsIndex].
         *
         * Unlike [tripsIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trips_index") @ExcludeMissing fun _tripsIndex(): JsonField<Long> = tripsIndex

        /**
         * Returns the raw JSON value of [waypointIndex].
         *
         * Unlike [waypointIndex], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("waypoint_index")
        @ExcludeMissing
        fun _waypointIndex(): JsonField<Long> = waypointIndex

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

            /** Returns a mutable builder for constructing an instance of [Waypoint]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Waypoint]. */
        class Builder internal constructor() {

            private var location: JsonField<Location> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var tripsIndex: JsonField<Long> = JsonMissing.of()
            private var waypointIndex: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(waypoint: Waypoint) = apply {
                location = waypoint.location
                name = waypoint.name
                tripsIndex = waypoint.tripsIndex
                waypointIndex = waypoint.waypointIndex
                additionalProperties = waypoint.additionalProperties.toMutableMap()
            }

            /** Describes the location of the waypoint. */
            fun location(location: Location) = location(JsonField.of(location))

            /**
             * Sets [Builder.location] to an arbitrary JSON value.
             *
             * You should usually call [Builder.location] with a well-typed [Location] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun location(location: JsonField<Location>) = apply { this.location = location }

            /** Name of the waypoint. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Denotes the ID of a trip. Starts with 0. */
            fun tripsIndex(tripsIndex: Long) = tripsIndex(JsonField.of(tripsIndex))

            /**
             * Sets [Builder.tripsIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tripsIndex] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tripsIndex(tripsIndex: JsonField<Long>) = apply { this.tripsIndex = tripsIndex }

            /**
             * Denotes the id of a waypoint. The first waypoint is denoted with 0. And onwards with
             * 1, 2 etc.
             */
            fun waypointIndex(waypointIndex: Long) = waypointIndex(JsonField.of(waypointIndex))

            /**
             * Sets [Builder.waypointIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waypointIndex] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun waypointIndex(waypointIndex: JsonField<Long>) = apply {
                this.waypointIndex = waypointIndex
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
             * Returns an immutable instance of [Waypoint].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Waypoint =
                Waypoint(
                    location,
                    name,
                    tripsIndex,
                    waypointIndex,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Waypoint = apply {
            if (validated) {
                return@apply
            }

            location().ifPresent { it.validate() }
            name()
            tripsIndex()
            waypointIndex()
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
            (location.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (tripsIndex.asKnown().isPresent) 1 else 0) +
                (if (waypointIndex.asKnown().isPresent) 1 else 0)

        /** Describes the location of the waypoint. */
        class Location
        private constructor(
            private val latitude: JsonField<Double>,
            private val longitude: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("latitude")
                @ExcludeMissing
                latitude: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("longitude")
                @ExcludeMissing
                longitude: JsonField<Double> = JsonMissing.of(),
            ) : this(latitude, longitude, mutableMapOf())

            /**
             * Latitude coordinate of the waypoint.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun latitude(): Optional<Double> = latitude.getOptional("latitude")

            /**
             * Longitude coordinate of the waypoint.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun longitude(): Optional<Double> = longitude.getOptional("longitude")

            /**
             * Returns the raw JSON value of [latitude].
             *
             * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("latitude") @ExcludeMissing fun _latitude(): JsonField<Double> = latitude

            /**
             * Returns the raw JSON value of [longitude].
             *
             * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("longitude")
            @ExcludeMissing
            fun _longitude(): JsonField<Double> = longitude

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

                private var latitude: JsonField<Double> = JsonMissing.of()
                private var longitude: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(location: Location) = apply {
                    latitude = location.latitude
                    longitude = location.longitude
                    additionalProperties = location.additionalProperties.toMutableMap()
                }

                /** Latitude coordinate of the waypoint. */
                fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                /**
                 * Sets [Builder.latitude] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latitude] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

                /** Longitude coordinate of the waypoint. */
                fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

                /**
                 * Sets [Builder.longitude] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.longitude] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun longitude(longitude: JsonField<Double>) = apply { this.longitude = longitude }

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
                 * Returns an immutable instance of [Location].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Location =
                    Location(latitude, longitude, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Location = apply {
                if (validated) {
                    return@apply
                }

                latitude()
                longitude()
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
                (if (latitude.asKnown().isPresent) 1 else 0) +
                    (if (longitude.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Location && latitude == other.latitude && longitude == other.longitude && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(latitude, longitude, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Location{latitude=$latitude, longitude=$longitude, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Waypoint && location == other.location && name == other.name && tripsIndex == other.tripsIndex && waypointIndex == other.waypointIndex && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(location, name, tripsIndex, waypointIndex, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Waypoint{location=$location, name=$name, tripsIndex=$tripsIndex, waypointIndex=$waypointIndex, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OptimizationComputeResponse && code == other.code && location == other.location && trips == other.trips && waypoints == other.waypoints && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, location, trips, waypoints, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OptimizationComputeResponse{code=$code, location=$location, trips=$trips, waypoints=$waypoints, additionalProperties=$additionalProperties}"
}
