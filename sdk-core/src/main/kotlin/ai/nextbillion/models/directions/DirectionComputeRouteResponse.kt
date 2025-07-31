// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.directions

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

class DirectionComputeRouteResponse
private constructor(
    private val msg: JsonField<String>,
    private val route: JsonField<Route>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("msg") @ExcludeMissing msg: JsonField<String> = JsonMissing.of(),
        @JsonProperty("route") @ExcludeMissing route: JsonField<Route> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(msg, route, status, mutableMapOf())

    /**
     * Displays the error message in case of a failed request or operation. Please note that this
     * parameter is not returned in the response in case of a successful request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun msg(): Optional<String> = msg.getOptional("msg")

    /**
     * An object containing details about the returned route. Will contain multiple objects if more
     * than one routes are present in the response.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun route(): Optional<Route> = route.getOptional("route")

    /**
     * A string indicating the state of the response. On normal responses, the value will be Ok.
     * Indicative HTTP error codes are returned for different errors. See the
     * [API Errors Codes](#api-error-codes) section below for more information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [msg].
     *
     * Unlike [msg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msg") @ExcludeMissing fun _msg(): JsonField<String> = msg

    /**
     * Returns the raw JSON value of [route].
     *
     * Unlike [route], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("route") @ExcludeMissing fun _route(): JsonField<Route> = route

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [DirectionComputeRouteResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DirectionComputeRouteResponse]. */
    class Builder internal constructor() {

        private var msg: JsonField<String> = JsonMissing.of()
        private var route: JsonField<Route> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(directionComputeRouteResponse: DirectionComputeRouteResponse) = apply {
            msg = directionComputeRouteResponse.msg
            route = directionComputeRouteResponse.route
            status = directionComputeRouteResponse.status
            additionalProperties = directionComputeRouteResponse.additionalProperties.toMutableMap()
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
         * An object containing details about the returned route. Will contain multiple objects if
         * more than one routes are present in the response.
         */
        fun route(route: Route) = route(JsonField.of(route))

        /**
         * Sets [Builder.route] to an arbitrary JSON value.
         *
         * You should usually call [Builder.route] with a well-typed [Route] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun route(route: JsonField<Route>) = apply { this.route = route }

        /**
         * A string indicating the state of the response. On normal responses, the value will be Ok.
         * Indicative HTTP error codes are returned for different errors. See the
         * [API Errors Codes](#api-error-codes) section below for more information.
         */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [DirectionComputeRouteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DirectionComputeRouteResponse =
            DirectionComputeRouteResponse(msg, route, status, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): DirectionComputeRouteResponse = apply {
        if (validated) {
            return@apply
        }

        msg()
        route().ifPresent { it.validate() }
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
        (if (msg.asKnown().isPresent) 1 else 0) +
            (route.asKnown().getOrNull()?.validity() ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    /**
     * An object containing details about the returned route. Will contain multiple objects if more
     * than one routes are present in the response.
     */
    class Route
    private constructor(
        private val distance: JsonField<Double>,
        private val duration: JsonField<Double>,
        private val endLocation: JsonField<EndLocation>,
        private val geojson: JsonField<Geojson>,
        private val geometry: JsonField<String>,
        private val legs: JsonField<List<Leg>>,
        private val startLocation: JsonField<StartLocation>,
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
            @JsonProperty("end_location")
            @ExcludeMissing
            endLocation: JsonField<EndLocation> = JsonMissing.of(),
            @JsonProperty("geojson") @ExcludeMissing geojson: JsonField<Geojson> = JsonMissing.of(),
            @JsonProperty("geometry")
            @ExcludeMissing
            geometry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("legs") @ExcludeMissing legs: JsonField<List<Leg>> = JsonMissing.of(),
            @JsonProperty("start_location")
            @ExcludeMissing
            startLocation: JsonField<StartLocation> = JsonMissing.of(),
        ) : this(
            distance,
            duration,
            endLocation,
            geojson,
            geometry,
            legs,
            startLocation,
            mutableMapOf(),
        )

        /**
         * The distance, in meters, for the complete trip.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun distance(): Optional<Double> = distance.getOptional("distance")

        /**
         * The duration, in seconds, of the complete trip.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun duration(): Optional<Double> = duration.getOptional("duration")

        /**
         * Location coordinates of the point where the route ends. It is the same as the destination
         * in the input request. Returned only when steps is true in the input request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun endLocation(): Optional<EndLocation> = endLocation.getOptional("end_location")

        /**
         * An object with geoJSON details of the route. This object is returned when the geometry
         * field is set to geojson in the input request, otherwise it is not present in the
         * response. The contents of this object follow the
         * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geojson(): Optional<Geojson> = geojson.getOptional("geojson")

        /**
         * Encoded geometry of the returned route in the selected format and specified overview
         * verbosity. This parameter is configured in the input request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geometry(): Optional<String> = geometry.getOptional("geometry")

        /**
         * An array of objects returning the details about each leg of the route. waypoints split
         * the route into legs.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun legs(): Optional<List<Leg>> = legs.getOptional("legs")

        /**
         * Location coordinates of the point where the route starts. It is the same as the origin in
         * the input request. Returned only when steps is true in the input request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun startLocation(): Optional<StartLocation> = startLocation.getOptional("start_location")

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
         * Returns the raw JSON value of [endLocation].
         *
         * Unlike [endLocation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_location")
        @ExcludeMissing
        fun _endLocation(): JsonField<EndLocation> = endLocation

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

        /**
         * Returns the raw JSON value of [startLocation].
         *
         * Unlike [startLocation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("start_location")
        @ExcludeMissing
        fun _startLocation(): JsonField<StartLocation> = startLocation

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

            /** Returns a mutable builder for constructing an instance of [Route]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Route]. */
        class Builder internal constructor() {

            private var distance: JsonField<Double> = JsonMissing.of()
            private var duration: JsonField<Double> = JsonMissing.of()
            private var endLocation: JsonField<EndLocation> = JsonMissing.of()
            private var geojson: JsonField<Geojson> = JsonMissing.of()
            private var geometry: JsonField<String> = JsonMissing.of()
            private var legs: JsonField<MutableList<Leg>>? = null
            private var startLocation: JsonField<StartLocation> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(route: Route) = apply {
                distance = route.distance
                duration = route.duration
                endLocation = route.endLocation
                geojson = route.geojson
                geometry = route.geometry
                legs = route.legs.map { it.toMutableList() }
                startLocation = route.startLocation
                additionalProperties = route.additionalProperties.toMutableMap()
            }

            /** The distance, in meters, for the complete trip. */
            fun distance(distance: Double) = distance(JsonField.of(distance))

            /**
             * Sets [Builder.distance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distance] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

            /** The duration, in seconds, of the complete trip. */
            fun duration(duration: Double) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

            /**
             * Location coordinates of the point where the route ends. It is the same as the
             * destination in the input request. Returned only when steps is true in the input
             * request.
             */
            fun endLocation(endLocation: EndLocation) = endLocation(JsonField.of(endLocation))

            /**
             * Sets [Builder.endLocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endLocation] with a well-typed [EndLocation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endLocation(endLocation: JsonField<EndLocation>) = apply {
                this.endLocation = endLocation
            }

            /**
             * An object with geoJSON details of the route. This object is returned when the
             * geometry field is set to geojson in the input request, otherwise it is not present in
             * the response. The contents of this object follow the
             * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
             */
            fun geojson(geojson: Geojson) = geojson(JsonField.of(geojson))

            /**
             * Sets [Builder.geojson] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geojson] with a well-typed [Geojson] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geojson(geojson: JsonField<Geojson>) = apply { this.geojson = geojson }

            /**
             * Encoded geometry of the returned route in the selected format and specified overview
             * verbosity. This parameter is configured in the input request.
             */
            fun geometry(geometry: String) = geometry(JsonField.of(geometry))

            /**
             * Sets [Builder.geometry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geometry] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geometry(geometry: JsonField<String>) = apply { this.geometry = geometry }

            /**
             * An array of objects returning the details about each leg of the route. waypoints
             * split the route into legs.
             */
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

            /**
             * Location coordinates of the point where the route starts. It is the same as the
             * origin in the input request. Returned only when steps is true in the input request.
             */
            fun startLocation(startLocation: StartLocation) =
                startLocation(JsonField.of(startLocation))

            /**
             * Sets [Builder.startLocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startLocation] with a well-typed [StartLocation]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun startLocation(startLocation: JsonField<StartLocation>) = apply {
                this.startLocation = startLocation
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
             * Returns an immutable instance of [Route].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Route =
                Route(
                    distance,
                    duration,
                    endLocation,
                    geojson,
                    geometry,
                    (legs ?: JsonMissing.of()).map { it.toImmutable() },
                    startLocation,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Route = apply {
            if (validated) {
                return@apply
            }

            distance()
            duration()
            endLocation().ifPresent { it.validate() }
            geojson().ifPresent { it.validate() }
            geometry()
            legs().ifPresent { it.forEach { it.validate() } }
            startLocation().ifPresent { it.validate() }
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
                (endLocation.asKnown().getOrNull()?.validity() ?: 0) +
                (geojson.asKnown().getOrNull()?.validity() ?: 0) +
                (if (geometry.asKnown().isPresent) 1 else 0) +
                (legs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (startLocation.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Location coordinates of the point where the route ends. It is the same as the destination
         * in the input request. Returned only when steps is true in the input request.
         */
        class EndLocation
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
             * latitude of the start_location.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun latitude(): Optional<Double> = latitude.getOptional("latitude")

            /**
             * longitude of the start_location.
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

                /** Returns a mutable builder for constructing an instance of [EndLocation]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [EndLocation]. */
            class Builder internal constructor() {

                private var latitude: JsonField<Double> = JsonMissing.of()
                private var longitude: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(endLocation: EndLocation) = apply {
                    latitude = endLocation.latitude
                    longitude = endLocation.longitude
                    additionalProperties = endLocation.additionalProperties.toMutableMap()
                }

                /** latitude of the start_location. */
                fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                /**
                 * Sets [Builder.latitude] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latitude] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

                /** longitude of the start_location. */
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
                 * Returns an immutable instance of [EndLocation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): EndLocation =
                    EndLocation(latitude, longitude, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): EndLocation = apply {
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

                return /* spotless:off */ other is EndLocation && latitude == other.latitude && longitude == other.longitude && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(latitude, longitude, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EndLocation{latitude=$latitude, longitude=$longitude, additionalProperties=$additionalProperties}"
        }

        /**
         * An object with geoJSON details of the route. This object is returned when the geometry
         * field is set to geojson in the input request, otherwise it is not present in the
         * response. The contents of this object follow the
         * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
         */
        class Geojson
        private constructor(
            private val geometry: JsonField<Geometry>,
            private val properties: JsonField<String>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("geometry")
                @ExcludeMissing
                geometry: JsonField<Geometry> = JsonMissing.of(),
                @JsonProperty("properties")
                @ExcludeMissing
                properties: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(geometry, properties, type, mutableMapOf())

            /**
             * An object with details of the geoJSON geometry of the route.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun geometry(): Optional<Geometry> = geometry.getOptional("geometry")

            /**
             * Property associated with the geoJSON shape.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun properties(): Optional<String> = properties.getOptional("properties")

            /**
             * Type of the geoJSON object.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [geometry].
             *
             * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("geometry")
            @ExcludeMissing
            fun _geometry(): JsonField<Geometry> = geometry

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
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                private var geometry: JsonField<Geometry> = JsonMissing.of()
                private var properties: JsonField<String> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(geojson: Geojson) = apply {
                    geometry = geojson.geometry
                    properties = geojson.properties
                    type = geojson.type
                    additionalProperties = geojson.additionalProperties.toMutableMap()
                }

                /** An object with details of the geoJSON geometry of the route. */
                fun geometry(geometry: Geometry) = geometry(JsonField.of(geometry))

                /**
                 * Sets [Builder.geometry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.geometry] with a well-typed [Geometry] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun geometry(geometry: JsonField<Geometry>) = apply { this.geometry = geometry }

                /** Property associated with the geoJSON shape. */
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

                /** Type of the geoJSON object. */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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

                geometry().ifPresent { it.validate() }
                properties()
                type()
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
                (geometry.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (properties.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            /** An object with details of the geoJSON geometry of the route. */
            class Geometry
            private constructor(
                private val coordinates: JsonField<List<Double>>,
                private val type: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("coordinates")
                    @ExcludeMissing
                    coordinates: JsonField<List<Double>> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                ) : this(coordinates, type, mutableMapOf())

                /**
                 * An array of coordinates in the [longitude, latitude] format, representing the
                 * route geometry.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun coordinates(): Optional<List<Double>> = coordinates.getOptional("coordinates")

                /**
                 * Type of the geoJSON geometry.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun type(): Optional<String> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [coordinates].
                 *
                 * Unlike [coordinates], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("coordinates")
                @ExcludeMissing
                fun _coordinates(): JsonField<List<Double>> = coordinates

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                    /** Returns a mutable builder for constructing an instance of [Geometry]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Geometry]. */
                class Builder internal constructor() {

                    private var coordinates: JsonField<MutableList<Double>>? = null
                    private var type: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(geometry: Geometry) = apply {
                        coordinates = geometry.coordinates.map { it.toMutableList() }
                        type = geometry.type
                        additionalProperties = geometry.additionalProperties.toMutableMap()
                    }

                    /**
                     * An array of coordinates in the [longitude, latitude] format, representing the
                     * route geometry.
                     */
                    fun coordinates(coordinates: List<Double>) =
                        coordinates(JsonField.of(coordinates))

                    /**
                     * Sets [Builder.coordinates] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.coordinates] with a well-typed
                     * `List<Double>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun coordinates(coordinates: JsonField<List<Double>>) = apply {
                        this.coordinates = coordinates.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Double] to [coordinates].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addCoordinate(coordinate: Double) = apply {
                        coordinates =
                            (coordinates ?: JsonField.of(mutableListOf())).also {
                                checkKnown("coordinates", it).add(coordinate)
                            }
                    }

                    /** Type of the geoJSON geometry. */
                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

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
                     * Returns an immutable instance of [Geometry].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Geometry =
                        Geometry(
                            (coordinates ?: JsonMissing.of()).map { it.toImmutable() },
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Geometry = apply {
                    if (validated) {
                        return@apply
                    }

                    coordinates()
                    type()
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
                    (coordinates.asKnown().getOrNull()?.size ?: 0) +
                        (if (type.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Geometry && coordinates == other.coordinates && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(coordinates, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Geometry{coordinates=$coordinates, type=$type, additionalProperties=$additionalProperties}"
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
            private val distance: JsonField<Distance>,
            private val duration: JsonField<Duration>,
            private val endLocation: JsonField<EndLocation>,
            private val startLocation: JsonField<StartLocation>,
            private val steps: JsonField<List<Step>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("distance")
                @ExcludeMissing
                distance: JsonField<Distance> = JsonMissing.of(),
                @JsonProperty("duration")
                @ExcludeMissing
                duration: JsonField<Duration> = JsonMissing.of(),
                @JsonProperty("end_location")
                @ExcludeMissing
                endLocation: JsonField<EndLocation> = JsonMissing.of(),
                @JsonProperty("start_location")
                @ExcludeMissing
                startLocation: JsonField<StartLocation> = JsonMissing.of(),
                @JsonProperty("steps")
                @ExcludeMissing
                steps: JsonField<List<Step>> = JsonMissing.of(),
            ) : this(distance, duration, endLocation, startLocation, steps, mutableMapOf())

            /**
             * An object containing leg distance value, in meters.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun distance(): Optional<Distance> = distance.getOptional("distance")

            /**
             * An object containing leg duration value, in seconds.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun duration(): Optional<Duration> = duration.getOptional("duration")

            /**
             * Location coordinates of the point where the leg ends. Returned only when steps is
             * true in the input request.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun endLocation(): Optional<EndLocation> = endLocation.getOptional("end_location")

            /**
             * Location coordinates of the point where the leg starts. Returned only when steps is
             * true in the input request.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun startLocation(): Optional<StartLocation> =
                startLocation.getOptional("start_location")

            /**
             * An array of objects with details of each step of the legs. Returned only when steps
             * is true in the input request. An empty array is returned when steps is false in the
             * input request.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun steps(): Optional<List<Step>> = steps.getOptional("steps")

            /**
             * Returns the raw JSON value of [distance].
             *
             * Unlike [distance], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("distance")
            @ExcludeMissing
            fun _distance(): JsonField<Distance> = distance

            /**
             * Returns the raw JSON value of [duration].
             *
             * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration")
            @ExcludeMissing
            fun _duration(): JsonField<Duration> = duration

            /**
             * Returns the raw JSON value of [endLocation].
             *
             * Unlike [endLocation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("end_location")
            @ExcludeMissing
            fun _endLocation(): JsonField<EndLocation> = endLocation

            /**
             * Returns the raw JSON value of [startLocation].
             *
             * Unlike [startLocation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_location")
            @ExcludeMissing
            fun _startLocation(): JsonField<StartLocation> = startLocation

            /**
             * Returns the raw JSON value of [steps].
             *
             * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("steps") @ExcludeMissing fun _steps(): JsonField<List<Step>> = steps

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

                private var distance: JsonField<Distance> = JsonMissing.of()
                private var duration: JsonField<Duration> = JsonMissing.of()
                private var endLocation: JsonField<EndLocation> = JsonMissing.of()
                private var startLocation: JsonField<StartLocation> = JsonMissing.of()
                private var steps: JsonField<MutableList<Step>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(leg: Leg) = apply {
                    distance = leg.distance
                    duration = leg.duration
                    endLocation = leg.endLocation
                    startLocation = leg.startLocation
                    steps = leg.steps.map { it.toMutableList() }
                    additionalProperties = leg.additionalProperties.toMutableMap()
                }

                /** An object containing leg distance value, in meters. */
                fun distance(distance: Distance) = distance(JsonField.of(distance))

                /**
                 * Sets [Builder.distance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.distance] with a well-typed [Distance] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun distance(distance: JsonField<Distance>) = apply { this.distance = distance }

                /** An object containing leg duration value, in seconds. */
                fun duration(duration: Duration) = duration(JsonField.of(duration))

                /**
                 * Sets [Builder.duration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.duration] with a well-typed [Duration] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun duration(duration: JsonField<Duration>) = apply { this.duration = duration }

                /**
                 * Location coordinates of the point where the leg ends. Returned only when steps is
                 * true in the input request.
                 */
                fun endLocation(endLocation: EndLocation) = endLocation(JsonField.of(endLocation))

                /**
                 * Sets [Builder.endLocation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endLocation] with a well-typed [EndLocation]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endLocation(endLocation: JsonField<EndLocation>) = apply {
                    this.endLocation = endLocation
                }

                /**
                 * Location coordinates of the point where the leg starts. Returned only when steps
                 * is true in the input request.
                 */
                fun startLocation(startLocation: StartLocation) =
                    startLocation(JsonField.of(startLocation))

                /**
                 * Sets [Builder.startLocation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startLocation] with a well-typed [StartLocation]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startLocation(startLocation: JsonField<StartLocation>) = apply {
                    this.startLocation = startLocation
                }

                /**
                 * An array of objects with details of each step of the legs. Returned only when
                 * steps is true in the input request. An empty array is returned when steps is
                 * false in the input request.
                 */
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
                        endLocation,
                        startLocation,
                        (steps ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Leg = apply {
                if (validated) {
                    return@apply
                }

                distance().ifPresent { it.validate() }
                duration().ifPresent { it.validate() }
                endLocation().ifPresent { it.validate() }
                startLocation().ifPresent { it.validate() }
                steps().ifPresent { it.forEach { it.validate() } }
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
                (distance.asKnown().getOrNull()?.validity() ?: 0) +
                    (duration.asKnown().getOrNull()?.validity() ?: 0) +
                    (endLocation.asKnown().getOrNull()?.validity() ?: 0) +
                    (startLocation.asKnown().getOrNull()?.validity() ?: 0) +
                    (steps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** An object containing leg distance value, in meters. */
            class Distance
            private constructor(
                private val value: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<Double> = JsonMissing.of()
                ) : this(value, mutableMapOf())

                /**
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun value(): Optional<Double> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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

                    /** Returns a mutable builder for constructing an instance of [Distance]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Distance]. */
                class Builder internal constructor() {

                    private var value: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(distance: Distance) = apply {
                        value = distance.value
                        additionalProperties = distance.additionalProperties.toMutableMap()
                    }

                    fun value(value: Double) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Double>) = apply { this.value = value }

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
                     * Returns an immutable instance of [Distance].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Distance = Distance(value, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Distance = apply {
                    if (validated) {
                        return@apply
                    }

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
                internal fun validity(): Int = (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Distance && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Distance{value=$value, additionalProperties=$additionalProperties}"
            }

            /** An object containing leg duration value, in seconds. */
            class Duration
            private constructor(
                private val value: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<Double> = JsonMissing.of()
                ) : this(value, mutableMapOf())

                /**
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun value(): Optional<Double> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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

                    /** Returns a mutable builder for constructing an instance of [Duration]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Duration]. */
                class Builder internal constructor() {

                    private var value: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(duration: Duration) = apply {
                        value = duration.value
                        additionalProperties = duration.additionalProperties.toMutableMap()
                    }

                    fun value(value: Double) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Double>) = apply { this.value = value }

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
                     * Returns an immutable instance of [Duration].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Duration = Duration(value, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Duration = apply {
                    if (validated) {
                        return@apply
                    }

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
                internal fun validity(): Int = (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Duration && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Duration{value=$value, additionalProperties=$additionalProperties}"
            }

            /**
             * Location coordinates of the point where the leg ends. Returned only when steps is
             * true in the input request.
             */
            class EndLocation
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
                 * Latitude of the end_location of the leg.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun latitude(): Optional<Double> = latitude.getOptional("latitude")

                /**
                 * Longitude of the end_location of the leg.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun longitude(): Optional<Double> = longitude.getOptional("longitude")

                /**
                 * Returns the raw JSON value of [latitude].
                 *
                 * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("latitude")
                @ExcludeMissing
                fun _latitude(): JsonField<Double> = latitude

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

                    /** Returns a mutable builder for constructing an instance of [EndLocation]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [EndLocation]. */
                class Builder internal constructor() {

                    private var latitude: JsonField<Double> = JsonMissing.of()
                    private var longitude: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(endLocation: EndLocation) = apply {
                        latitude = endLocation.latitude
                        longitude = endLocation.longitude
                        additionalProperties = endLocation.additionalProperties.toMutableMap()
                    }

                    /** Latitude of the end_location of the leg. */
                    fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                    /**
                     * Sets [Builder.latitude] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.latitude] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

                    /** Longitude of the end_location of the leg. */
                    fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

                    /**
                     * Sets [Builder.longitude] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.longitude] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun longitude(longitude: JsonField<Double>) = apply {
                        this.longitude = longitude
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
                     * Returns an immutable instance of [EndLocation].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): EndLocation =
                        EndLocation(latitude, longitude, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): EndLocation = apply {
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

                    return /* spotless:off */ other is EndLocation && latitude == other.latitude && longitude == other.longitude && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(latitude, longitude, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "EndLocation{latitude=$latitude, longitude=$longitude, additionalProperties=$additionalProperties}"
            }

            /**
             * Location coordinates of the point where the leg starts. Returned only when steps is
             * true in the input request.
             */
            class StartLocation
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
                 * Latitude of the start_location of the leg.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun latitude(): Optional<Double> = latitude.getOptional("latitude")

                /**
                 * Longitude of the start_location of the leg.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun longitude(): Optional<Double> = longitude.getOptional("longitude")

                /**
                 * Returns the raw JSON value of [latitude].
                 *
                 * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("latitude")
                @ExcludeMissing
                fun _latitude(): JsonField<Double> = latitude

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

                    /**
                     * Returns a mutable builder for constructing an instance of [StartLocation].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [StartLocation]. */
                class Builder internal constructor() {

                    private var latitude: JsonField<Double> = JsonMissing.of()
                    private var longitude: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(startLocation: StartLocation) = apply {
                        latitude = startLocation.latitude
                        longitude = startLocation.longitude
                        additionalProperties = startLocation.additionalProperties.toMutableMap()
                    }

                    /** Latitude of the start_location of the leg. */
                    fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                    /**
                     * Sets [Builder.latitude] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.latitude] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

                    /** Longitude of the start_location of the leg. */
                    fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

                    /**
                     * Sets [Builder.longitude] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.longitude] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun longitude(longitude: JsonField<Double>) = apply {
                        this.longitude = longitude
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
                     * Returns an immutable instance of [StartLocation].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): StartLocation =
                        StartLocation(latitude, longitude, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): StartLocation = apply {
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

                    return /* spotless:off */ other is StartLocation && latitude == other.latitude && longitude == other.longitude && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(latitude, longitude, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "StartLocation{latitude=$latitude, longitude=$longitude, additionalProperties=$additionalProperties}"
            }

            class Step
            private constructor(
                private val distance: JsonField<Distance>,
                private val duration: JsonField<Duration>,
                private val endLocation: JsonField<EndLocation>,
                private val geojson: JsonField<Geojson>,
                private val geometry: JsonField<String>,
                private val maneuver: JsonField<Maneuver>,
                private val startLocation: JsonField<StartLocation>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("distance")
                    @ExcludeMissing
                    distance: JsonField<Distance> = JsonMissing.of(),
                    @JsonProperty("duration")
                    @ExcludeMissing
                    duration: JsonField<Duration> = JsonMissing.of(),
                    @JsonProperty("end_location")
                    @ExcludeMissing
                    endLocation: JsonField<EndLocation> = JsonMissing.of(),
                    @JsonProperty("geojson")
                    @ExcludeMissing
                    geojson: JsonField<Geojson> = JsonMissing.of(),
                    @JsonProperty("geometry")
                    @ExcludeMissing
                    geometry: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("maneuver")
                    @ExcludeMissing
                    maneuver: JsonField<Maneuver> = JsonMissing.of(),
                    @JsonProperty("start_location")
                    @ExcludeMissing
                    startLocation: JsonField<StartLocation> = JsonMissing.of(),
                ) : this(
                    distance,
                    duration,
                    endLocation,
                    geojson,
                    geometry,
                    maneuver,
                    startLocation,
                    mutableMapOf(),
                )

                /**
                 * An object containing step distance value, in meters.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun distance(): Optional<Distance> = distance.getOptional("distance")

                /**
                 * An object containing step duration value, in seconds.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun duration(): Optional<Duration> = duration.getOptional("duration")

                /**
                 * Location coordinates of the point where the step ends.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun endLocation(): Optional<EndLocation> = endLocation.getOptional("end_location")

                /**
                 * An object with geoJSON details of the step.This object is returned when the
                 * geometry field is set to geojson in the input request, otherwise it is not
                 * present in the response. The contents of this object follow the
                 * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
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
                 * An object with maneuver details for the step.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun maneuver(): Optional<Maneuver> = maneuver.getOptional("maneuver")

                /**
                 * Location coordinates of the point where the step starts.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun startLocation(): Optional<StartLocation> =
                    startLocation.getOptional("start_location")

                /**
                 * Returns the raw JSON value of [distance].
                 *
                 * Unlike [distance], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("distance")
                @ExcludeMissing
                fun _distance(): JsonField<Distance> = distance

                /**
                 * Returns the raw JSON value of [duration].
                 *
                 * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("duration")
                @ExcludeMissing
                fun _duration(): JsonField<Duration> = duration

                /**
                 * Returns the raw JSON value of [endLocation].
                 *
                 * Unlike [endLocation], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("end_location")
                @ExcludeMissing
                fun _endLocation(): JsonField<EndLocation> = endLocation

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

                /**
                 * Returns the raw JSON value of [maneuver].
                 *
                 * Unlike [maneuver], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("maneuver")
                @ExcludeMissing
                fun _maneuver(): JsonField<Maneuver> = maneuver

                /**
                 * Returns the raw JSON value of [startLocation].
                 *
                 * Unlike [startLocation], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("start_location")
                @ExcludeMissing
                fun _startLocation(): JsonField<StartLocation> = startLocation

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

                    private var distance: JsonField<Distance> = JsonMissing.of()
                    private var duration: JsonField<Duration> = JsonMissing.of()
                    private var endLocation: JsonField<EndLocation> = JsonMissing.of()
                    private var geojson: JsonField<Geojson> = JsonMissing.of()
                    private var geometry: JsonField<String> = JsonMissing.of()
                    private var maneuver: JsonField<Maneuver> = JsonMissing.of()
                    private var startLocation: JsonField<StartLocation> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(step: Step) = apply {
                        distance = step.distance
                        duration = step.duration
                        endLocation = step.endLocation
                        geojson = step.geojson
                        geometry = step.geometry
                        maneuver = step.maneuver
                        startLocation = step.startLocation
                        additionalProperties = step.additionalProperties.toMutableMap()
                    }

                    /** An object containing step distance value, in meters. */
                    fun distance(distance: Distance) = distance(JsonField.of(distance))

                    /**
                     * Sets [Builder.distance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.distance] with a well-typed [Distance] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun distance(distance: JsonField<Distance>) = apply { this.distance = distance }

                    /** An object containing step duration value, in seconds. */
                    fun duration(duration: Duration) = duration(JsonField.of(duration))

                    /**
                     * Sets [Builder.duration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.duration] with a well-typed [Duration] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun duration(duration: JsonField<Duration>) = apply { this.duration = duration }

                    /** Location coordinates of the point where the step ends. */
                    fun endLocation(endLocation: EndLocation) =
                        endLocation(JsonField.of(endLocation))

                    /**
                     * Sets [Builder.endLocation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endLocation] with a well-typed [EndLocation]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun endLocation(endLocation: JsonField<EndLocation>) = apply {
                        this.endLocation = endLocation
                    }

                    /**
                     * An object with geoJSON details of the step.This object is returned when the
                     * geometry field is set to geojson in the input request, otherwise it is not
                     * present in the response. The contents of this object follow the
                     * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
                     */
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

                    /** An object with maneuver details for the step. */
                    fun maneuver(maneuver: Maneuver) = maneuver(JsonField.of(maneuver))

                    /**
                     * Sets [Builder.maneuver] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maneuver] with a well-typed [Maneuver] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun maneuver(maneuver: JsonField<Maneuver>) = apply { this.maneuver = maneuver }

                    /** Location coordinates of the point where the step starts. */
                    fun startLocation(startLocation: StartLocation) =
                        startLocation(JsonField.of(startLocation))

                    /**
                     * Sets [Builder.startLocation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startLocation] with a well-typed
                     * [StartLocation] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun startLocation(startLocation: JsonField<StartLocation>) = apply {
                        this.startLocation = startLocation
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
                     * Returns an immutable instance of [Step].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Step =
                        Step(
                            distance,
                            duration,
                            endLocation,
                            geojson,
                            geometry,
                            maneuver,
                            startLocation,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Step = apply {
                    if (validated) {
                        return@apply
                    }

                    distance().ifPresent { it.validate() }
                    duration().ifPresent { it.validate() }
                    endLocation().ifPresent { it.validate() }
                    geojson().ifPresent { it.validate() }
                    geometry()
                    maneuver().ifPresent { it.validate() }
                    startLocation().ifPresent { it.validate() }
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
                    (distance.asKnown().getOrNull()?.validity() ?: 0) +
                        (duration.asKnown().getOrNull()?.validity() ?: 0) +
                        (endLocation.asKnown().getOrNull()?.validity() ?: 0) +
                        (geojson.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (geometry.asKnown().isPresent) 1 else 0) +
                        (maneuver.asKnown().getOrNull()?.validity() ?: 0) +
                        (startLocation.asKnown().getOrNull()?.validity() ?: 0)

                /** An object containing step distance value, in meters. */
                class Distance
                private constructor(
                    private val value: JsonField<Double>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Double> = JsonMissing.of()
                    ) : this(value, mutableMapOf())

                    /**
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<Double> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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

                        /** Returns a mutable builder for constructing an instance of [Distance]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Distance]. */
                    class Builder internal constructor() {

                        private var value: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(distance: Distance) = apply {
                            value = distance.value
                            additionalProperties = distance.additionalProperties.toMutableMap()
                        }

                        fun value(value: Double) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Double>) = apply { this.value = value }

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
                         * Returns an immutable instance of [Distance].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Distance = Distance(value, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): Distance = apply {
                        if (validated) {
                            return@apply
                        }

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
                    internal fun validity(): Int = (if (value.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Distance && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(value, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Distance{value=$value, additionalProperties=$additionalProperties}"
                }

                /** An object containing step duration value, in seconds. */
                class Duration
                private constructor(
                    private val value: JsonField<Double>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Double> = JsonMissing.of()
                    ) : this(value, mutableMapOf())

                    /**
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<Double> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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

                        /** Returns a mutable builder for constructing an instance of [Duration]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Duration]. */
                    class Builder internal constructor() {

                        private var value: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(duration: Duration) = apply {
                            value = duration.value
                            additionalProperties = duration.additionalProperties.toMutableMap()
                        }

                        fun value(value: Double) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Double>) = apply { this.value = value }

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
                         * Returns an immutable instance of [Duration].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Duration = Duration(value, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): Duration = apply {
                        if (validated) {
                            return@apply
                        }

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
                    internal fun validity(): Int = (if (value.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Duration && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(value, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Duration{value=$value, additionalProperties=$additionalProperties}"
                }

                /** Location coordinates of the point where the step ends. */
                class EndLocation
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
                     * Latitude of the end_location of the step.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun latitude(): Optional<Double> = latitude.getOptional("latitude")

                    /**
                     * Longitude of the end_location of the step.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun longitude(): Optional<Double> = longitude.getOptional("longitude")

                    /**
                     * Returns the raw JSON value of [latitude].
                     *
                     * Unlike [latitude], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("latitude")
                    @ExcludeMissing
                    fun _latitude(): JsonField<Double> = latitude

                    /**
                     * Returns the raw JSON value of [longitude].
                     *
                     * Unlike [longitude], this method doesn't throw if the JSON field has an
                     * unexpected type.
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

                        /**
                         * Returns a mutable builder for constructing an instance of [EndLocation].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [EndLocation]. */
                    class Builder internal constructor() {

                        private var latitude: JsonField<Double> = JsonMissing.of()
                        private var longitude: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(endLocation: EndLocation) = apply {
                            latitude = endLocation.latitude
                            longitude = endLocation.longitude
                            additionalProperties = endLocation.additionalProperties.toMutableMap()
                        }

                        /** Latitude of the end_location of the step. */
                        fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                        /**
                         * Sets [Builder.latitude] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.latitude] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun latitude(latitude: JsonField<Double>) = apply {
                            this.latitude = latitude
                        }

                        /** Longitude of the end_location of the step. */
                        fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

                        /**
                         * Sets [Builder.longitude] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.longitude] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun longitude(longitude: JsonField<Double>) = apply {
                            this.longitude = longitude
                        }

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
                         * Returns an immutable instance of [EndLocation].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): EndLocation =
                            EndLocation(latitude, longitude, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): EndLocation = apply {
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

                        return /* spotless:off */ other is EndLocation && latitude == other.latitude && longitude == other.longitude && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(latitude, longitude, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "EndLocation{latitude=$latitude, longitude=$longitude, additionalProperties=$additionalProperties}"
                }

                /**
                 * An object with geoJSON details of the step.This object is returned when the
                 * geometry field is set to geojson in the input request, otherwise it is not
                 * present in the response. The contents of this object follow the
                 * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
                 */
                class Geojson
                private constructor(
                    private val geometry: JsonField<Geometry>,
                    private val properties: JsonField<String>,
                    private val type: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("geometry")
                        @ExcludeMissing
                        geometry: JsonField<Geometry> = JsonMissing.of(),
                        @JsonProperty("properties")
                        @ExcludeMissing
                        properties: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<String> = JsonMissing.of(),
                    ) : this(geometry, properties, type, mutableMapOf())

                    /**
                     * An object with details of the geoJSON geometry of the step.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun geometry(): Optional<Geometry> = geometry.getOptional("geometry")

                    /**
                     * Property associated with the geoJSON shape.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun properties(): Optional<String> = properties.getOptional("properties")

                    /**
                     * Type of the geoJSON object.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun type(): Optional<String> = type.getOptional("type")

                    /**
                     * Returns the raw JSON value of [geometry].
                     *
                     * Unlike [geometry], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("geometry")
                    @ExcludeMissing
                    fun _geometry(): JsonField<Geometry> = geometry

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
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                        private var geometry: JsonField<Geometry> = JsonMissing.of()
                        private var properties: JsonField<String> = JsonMissing.of()
                        private var type: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(geojson: Geojson) = apply {
                            geometry = geojson.geometry
                            properties = geojson.properties
                            type = geojson.type
                            additionalProperties = geojson.additionalProperties.toMutableMap()
                        }

                        /** An object with details of the geoJSON geometry of the step. */
                        fun geometry(geometry: Geometry) = geometry(JsonField.of(geometry))

                        /**
                         * Sets [Builder.geometry] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.geometry] with a well-typed [Geometry]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun geometry(geometry: JsonField<Geometry>) = apply {
                            this.geometry = geometry
                        }

                        /** Property associated with the geoJSON shape. */
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

                        /** Type of the geoJSON object. */
                        fun type(type: String) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<String>) = apply { this.type = type }

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

                        geometry().ifPresent { it.validate() }
                        properties()
                        type()
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
                        (geometry.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (properties.asKnown().isPresent) 1 else 0) +
                            (if (type.asKnown().isPresent) 1 else 0)

                    /** An object with details of the geoJSON geometry of the step. */
                    class Geometry
                    private constructor(
                        private val coordinates: JsonField<List<Double>>,
                        private val type: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("coordinates")
                            @ExcludeMissing
                            coordinates: JsonField<List<Double>> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<String> = JsonMissing.of(),
                        ) : this(coordinates, type, mutableMapOf())

                        /**
                         * An array of coordinates in the [longitude, latitude] format, representing
                         * the step geometry.
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun coordinates(): Optional<List<Double>> =
                            coordinates.getOptional("coordinates")

                        /**
                         * Type of the geoJSON geometry.
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun type(): Optional<String> = type.getOptional("type")

                        /**
                         * Returns the raw JSON value of [coordinates].
                         *
                         * Unlike [coordinates], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("coordinates")
                        @ExcludeMissing
                        fun _coordinates(): JsonField<List<Double>> = coordinates

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
                             * Returns a mutable builder for constructing an instance of [Geometry].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Geometry]. */
                        class Builder internal constructor() {

                            private var coordinates: JsonField<MutableList<Double>>? = null
                            private var type: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(geometry: Geometry) = apply {
                                coordinates = geometry.coordinates.map { it.toMutableList() }
                                type = geometry.type
                                additionalProperties = geometry.additionalProperties.toMutableMap()
                            }

                            /**
                             * An array of coordinates in the [longitude, latitude] format,
                             * representing the step geometry.
                             */
                            fun coordinates(coordinates: List<Double>) =
                                coordinates(JsonField.of(coordinates))

                            /**
                             * Sets [Builder.coordinates] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.coordinates] with a well-typed
                             * `List<Double>` value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun coordinates(coordinates: JsonField<List<Double>>) = apply {
                                this.coordinates = coordinates.map { it.toMutableList() }
                            }

                            /**
                             * Adds a single [Double] to [coordinates].
                             *
                             * @throws IllegalStateException if the field was previously set to a
                             *   non-list.
                             */
                            fun addCoordinate(coordinate: Double) = apply {
                                coordinates =
                                    (coordinates ?: JsonField.of(mutableListOf())).also {
                                        checkKnown("coordinates", it).add(coordinate)
                                    }
                            }

                            /** Type of the geoJSON geometry. */
                            fun type(type: String) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<String>) = apply { this.type = type }

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
                             * Returns an immutable instance of [Geometry].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Geometry =
                                Geometry(
                                    (coordinates ?: JsonMissing.of()).map { it.toImmutable() },
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Geometry = apply {
                            if (validated) {
                                return@apply
                            }

                            coordinates()
                            type()
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
                        internal fun validity(): Int =
                            (coordinates.asKnown().getOrNull()?.size ?: 0) +
                                (if (type.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Geometry && coordinates == other.coordinates && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(coordinates, type, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Geometry{coordinates=$coordinates, type=$type, additionalProperties=$additionalProperties}"
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

                /** An object with maneuver details for the step. */
                class Maneuver
                private constructor(
                    private val bearingAfter: JsonField<Long>,
                    private val bearingBefore: JsonField<Long>,
                    private val coordinate: JsonField<Coordinate>,
                    private val maneuverType: JsonField<String>,
                    private val modifier: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bearing_after")
                        @ExcludeMissing
                        bearingAfter: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("bearing_before")
                        @ExcludeMissing
                        bearingBefore: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("coordinate")
                        @ExcludeMissing
                        coordinate: JsonField<Coordinate> = JsonMissing.of(),
                        @JsonProperty("maneuver_type")
                        @ExcludeMissing
                        maneuverType: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("modifier")
                        @ExcludeMissing
                        modifier: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        bearingAfter,
                        bearingBefore,
                        coordinate,
                        maneuverType,
                        modifier,
                        mutableMapOf(),
                    )

                    /**
                     * The clockwise angle from true north to the direction of travel immediately
                     * after the maneuver. Range of values is between 0-359.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun bearingAfter(): Optional<Long> = bearingAfter.getOptional("bearing_after")

                    /**
                     * The clockwise angle from true north to the direction of travel immediately
                     * before the maneuver. Range of values is between 0-359.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun bearingBefore(): Optional<Long> =
                        bearingBefore.getOptional("bearing_before")

                    /**
                     * A coordinate pair describing the location of the maneuver.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun coordinate(): Optional<Coordinate> = coordinate.getOptional("coordinate")

                    /**
                     * A string indicating the type of maneuver.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun maneuverType(): Optional<String> = maneuverType.getOptional("maneuver_type")

                    /**
                     * Modifier associated with maneuver_type.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun modifier(): Optional<String> = modifier.getOptional("modifier")

                    /**
                     * Returns the raw JSON value of [bearingAfter].
                     *
                     * Unlike [bearingAfter], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("bearing_after")
                    @ExcludeMissing
                    fun _bearingAfter(): JsonField<Long> = bearingAfter

                    /**
                     * Returns the raw JSON value of [bearingBefore].
                     *
                     * Unlike [bearingBefore], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("bearing_before")
                    @ExcludeMissing
                    fun _bearingBefore(): JsonField<Long> = bearingBefore

                    /**
                     * Returns the raw JSON value of [coordinate].
                     *
                     * Unlike [coordinate], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("coordinate")
                    @ExcludeMissing
                    fun _coordinate(): JsonField<Coordinate> = coordinate

                    /**
                     * Returns the raw JSON value of [maneuverType].
                     *
                     * Unlike [maneuverType], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("maneuver_type")
                    @ExcludeMissing
                    fun _maneuverType(): JsonField<String> = maneuverType

                    /**
                     * Returns the raw JSON value of [modifier].
                     *
                     * Unlike [modifier], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("modifier")
                    @ExcludeMissing
                    fun _modifier(): JsonField<String> = modifier

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

                        /** Returns a mutable builder for constructing an instance of [Maneuver]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Maneuver]. */
                    class Builder internal constructor() {

                        private var bearingAfter: JsonField<Long> = JsonMissing.of()
                        private var bearingBefore: JsonField<Long> = JsonMissing.of()
                        private var coordinate: JsonField<Coordinate> = JsonMissing.of()
                        private var maneuverType: JsonField<String> = JsonMissing.of()
                        private var modifier: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(maneuver: Maneuver) = apply {
                            bearingAfter = maneuver.bearingAfter
                            bearingBefore = maneuver.bearingBefore
                            coordinate = maneuver.coordinate
                            maneuverType = maneuver.maneuverType
                            modifier = maneuver.modifier
                            additionalProperties = maneuver.additionalProperties.toMutableMap()
                        }

                        /**
                         * The clockwise angle from true north to the direction of travel
                         * immediately after the maneuver. Range of values is between 0-359.
                         */
                        fun bearingAfter(bearingAfter: Long) =
                            bearingAfter(JsonField.of(bearingAfter))

                        /**
                         * Sets [Builder.bearingAfter] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bearingAfter] with a well-typed [Long]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bearingAfter(bearingAfter: JsonField<Long>) = apply {
                            this.bearingAfter = bearingAfter
                        }

                        /**
                         * The clockwise angle from true north to the direction of travel
                         * immediately before the maneuver. Range of values is between 0-359.
                         */
                        fun bearingBefore(bearingBefore: Long) =
                            bearingBefore(JsonField.of(bearingBefore))

                        /**
                         * Sets [Builder.bearingBefore] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bearingBefore] with a well-typed [Long]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bearingBefore(bearingBefore: JsonField<Long>) = apply {
                            this.bearingBefore = bearingBefore
                        }

                        /** A coordinate pair describing the location of the maneuver. */
                        fun coordinate(coordinate: Coordinate) =
                            coordinate(JsonField.of(coordinate))

                        /**
                         * Sets [Builder.coordinate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.coordinate] with a well-typed
                         * [Coordinate] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun coordinate(coordinate: JsonField<Coordinate>) = apply {
                            this.coordinate = coordinate
                        }

                        /** A string indicating the type of maneuver. */
                        fun maneuverType(maneuverType: String) =
                            maneuverType(JsonField.of(maneuverType))

                        /**
                         * Sets [Builder.maneuverType] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.maneuverType] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun maneuverType(maneuverType: JsonField<String>) = apply {
                            this.maneuverType = maneuverType
                        }

                        /** Modifier associated with maneuver_type. */
                        fun modifier(modifier: String) = modifier(JsonField.of(modifier))

                        /**
                         * Sets [Builder.modifier] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.modifier] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun modifier(modifier: JsonField<String>) = apply {
                            this.modifier = modifier
                        }

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
                         * Returns an immutable instance of [Maneuver].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Maneuver =
                            Maneuver(
                                bearingAfter,
                                bearingBefore,
                                coordinate,
                                maneuverType,
                                modifier,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Maneuver = apply {
                        if (validated) {
                            return@apply
                        }

                        bearingAfter()
                        bearingBefore()
                        coordinate().ifPresent { it.validate() }
                        maneuverType()
                        modifier()
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
                        (if (bearingAfter.asKnown().isPresent) 1 else 0) +
                            (if (bearingBefore.asKnown().isPresent) 1 else 0) +
                            (coordinate.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (maneuverType.asKnown().isPresent) 1 else 0) +
                            (if (modifier.asKnown().isPresent) 1 else 0)

                    /** A coordinate pair describing the location of the maneuver. */
                    class Coordinate
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
                         * Latitude of the maneuver location.
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun latitude(): Optional<Double> = latitude.getOptional("latitude")

                        /**
                         * Longitude of the maneuver location.
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun longitude(): Optional<Double> = longitude.getOptional("longitude")

                        /**
                         * Returns the raw JSON value of [latitude].
                         *
                         * Unlike [latitude], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("latitude")
                        @ExcludeMissing
                        fun _latitude(): JsonField<Double> = latitude

                        /**
                         * Returns the raw JSON value of [longitude].
                         *
                         * Unlike [longitude], this method doesn't throw if the JSON field has an
                         * unexpected type.
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

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [Coordinate].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Coordinate]. */
                        class Builder internal constructor() {

                            private var latitude: JsonField<Double> = JsonMissing.of()
                            private var longitude: JsonField<Double> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(coordinate: Coordinate) = apply {
                                latitude = coordinate.latitude
                                longitude = coordinate.longitude
                                additionalProperties =
                                    coordinate.additionalProperties.toMutableMap()
                            }

                            /** Latitude of the maneuver location. */
                            fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                            /**
                             * Sets [Builder.latitude] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.latitude] with a well-typed [Double]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun latitude(latitude: JsonField<Double>) = apply {
                                this.latitude = latitude
                            }

                            /** Longitude of the maneuver location. */
                            fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

                            /**
                             * Sets [Builder.longitude] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.longitude] with a well-typed
                             * [Double] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun longitude(longitude: JsonField<Double>) = apply {
                                this.longitude = longitude
                            }

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
                             * Returns an immutable instance of [Coordinate].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Coordinate =
                                Coordinate(latitude, longitude, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        fun validate(): Coordinate = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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

                            return /* spotless:off */ other is Coordinate && latitude == other.latitude && longitude == other.longitude && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(latitude, longitude, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Coordinate{latitude=$latitude, longitude=$longitude, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Maneuver && bearingAfter == other.bearingAfter && bearingBefore == other.bearingBefore && coordinate == other.coordinate && maneuverType == other.maneuverType && modifier == other.modifier && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(bearingAfter, bearingBefore, coordinate, maneuverType, modifier, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Maneuver{bearingAfter=$bearingAfter, bearingBefore=$bearingBefore, coordinate=$coordinate, maneuverType=$maneuverType, modifier=$modifier, additionalProperties=$additionalProperties}"
                }

                /** Location coordinates of the point where the step starts. */
                class StartLocation
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
                     * Latitude of the start_location of the step.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun latitude(): Optional<Double> = latitude.getOptional("latitude")

                    /**
                     * Longitude of the start_location of the step.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun longitude(): Optional<Double> = longitude.getOptional("longitude")

                    /**
                     * Returns the raw JSON value of [latitude].
                     *
                     * Unlike [latitude], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("latitude")
                    @ExcludeMissing
                    fun _latitude(): JsonField<Double> = latitude

                    /**
                     * Returns the raw JSON value of [longitude].
                     *
                     * Unlike [longitude], this method doesn't throw if the JSON field has an
                     * unexpected type.
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

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [StartLocation].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [StartLocation]. */
                    class Builder internal constructor() {

                        private var latitude: JsonField<Double> = JsonMissing.of()
                        private var longitude: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(startLocation: StartLocation) = apply {
                            latitude = startLocation.latitude
                            longitude = startLocation.longitude
                            additionalProperties = startLocation.additionalProperties.toMutableMap()
                        }

                        /** Latitude of the start_location of the step. */
                        fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                        /**
                         * Sets [Builder.latitude] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.latitude] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun latitude(latitude: JsonField<Double>) = apply {
                            this.latitude = latitude
                        }

                        /** Longitude of the start_location of the step. */
                        fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

                        /**
                         * Sets [Builder.longitude] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.longitude] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun longitude(longitude: JsonField<Double>) = apply {
                            this.longitude = longitude
                        }

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
                         * Returns an immutable instance of [StartLocation].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): StartLocation =
                            StartLocation(latitude, longitude, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): StartLocation = apply {
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

                        return /* spotless:off */ other is StartLocation && latitude == other.latitude && longitude == other.longitude && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(latitude, longitude, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "StartLocation{latitude=$latitude, longitude=$longitude, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Step && distance == other.distance && duration == other.duration && endLocation == other.endLocation && geojson == other.geojson && geometry == other.geometry && maneuver == other.maneuver && startLocation == other.startLocation && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(distance, duration, endLocation, geojson, geometry, maneuver, startLocation, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Step{distance=$distance, duration=$duration, endLocation=$endLocation, geojson=$geojson, geometry=$geometry, maneuver=$maneuver, startLocation=$startLocation, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Leg && distance == other.distance && duration == other.duration && endLocation == other.endLocation && startLocation == other.startLocation && steps == other.steps && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(distance, duration, endLocation, startLocation, steps, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Leg{distance=$distance, duration=$duration, endLocation=$endLocation, startLocation=$startLocation, steps=$steps, additionalProperties=$additionalProperties}"
        }

        /**
         * Location coordinates of the point where the route starts. It is the same as the origin in
         * the input request. Returned only when steps is true in the input request.
         */
        class StartLocation
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
             * Latitude of the start_location.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun latitude(): Optional<Double> = latitude.getOptional("latitude")

            /**
             * Longitude of the start_location.
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

                /** Returns a mutable builder for constructing an instance of [StartLocation]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [StartLocation]. */
            class Builder internal constructor() {

                private var latitude: JsonField<Double> = JsonMissing.of()
                private var longitude: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(startLocation: StartLocation) = apply {
                    latitude = startLocation.latitude
                    longitude = startLocation.longitude
                    additionalProperties = startLocation.additionalProperties.toMutableMap()
                }

                /** Latitude of the start_location. */
                fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                /**
                 * Sets [Builder.latitude] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latitude] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

                /** Longitude of the start_location. */
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
                 * Returns an immutable instance of [StartLocation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): StartLocation =
                    StartLocation(latitude, longitude, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): StartLocation = apply {
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

                return /* spotless:off */ other is StartLocation && latitude == other.latitude && longitude == other.longitude && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(latitude, longitude, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StartLocation{latitude=$latitude, longitude=$longitude, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Route && distance == other.distance && duration == other.duration && endLocation == other.endLocation && geojson == other.geojson && geometry == other.geometry && legs == other.legs && startLocation == other.startLocation && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(distance, duration, endLocation, geojson, geometry, legs, startLocation, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Route{distance=$distance, duration=$duration, endLocation=$endLocation, geojson=$geojson, geometry=$geometry, legs=$legs, startLocation=$startLocation, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DirectionComputeRouteResponse && msg == other.msg && route == other.route && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(msg, route, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DirectionComputeRouteResponse{msg=$msg, route=$route, status=$status, additionalProperties=$additionalProperties}"
}
