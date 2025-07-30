// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.navigation

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

class NavigationRetrieveRouteResponse
private constructor(
    private val msg: JsonField<String>,
    private val routes: JsonField<List<Route>>,
    private val status: JsonField<String>,
    private val warning: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("msg") @ExcludeMissing msg: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routes") @ExcludeMissing routes: JsonField<List<Route>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("warning") @ExcludeMissing warning: JsonField<List<String>> = JsonMissing.of(),
    ) : this(msg, routes, status, warning, mutableMapOf())

    /**
     * Displays the error message in case of a failed request or operation. Please note that this
     * parameter is not returned in the response in case of a successful request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun msg(): Optional<String> = msg.getOptional("msg")

    /**
     * An array of objects describing different possible routes from the starting location to the
     * destination. Each object represents one route.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun routes(): Optional<List<Route>> = routes.getOptional("routes")

    /**
     * A string indicating the state of the response. On normal responses, the value will be `Ok`.
     * Indicative HTTP error codes are returned for different errors. See the
     * [API Errors Codes](#api-error-codes) section below for more information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * warning when facing unexpected behaviour
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun warning(): Optional<List<String>> = warning.getOptional("warning")

    /**
     * Returns the raw JSON value of [msg].
     *
     * Unlike [msg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msg") @ExcludeMissing fun _msg(): JsonField<String> = msg

    /**
     * Returns the raw JSON value of [routes].
     *
     * Unlike [routes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routes") @ExcludeMissing fun _routes(): JsonField<List<Route>> = routes

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [warning].
     *
     * Unlike [warning], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("warning") @ExcludeMissing fun _warning(): JsonField<List<String>> = warning

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
         * [NavigationRetrieveRouteResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NavigationRetrieveRouteResponse]. */
    class Builder internal constructor() {

        private var msg: JsonField<String> = JsonMissing.of()
        private var routes: JsonField<MutableList<Route>>? = null
        private var status: JsonField<String> = JsonMissing.of()
        private var warning: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(navigationRetrieveRouteResponse: NavigationRetrieveRouteResponse) =
            apply {
                msg = navigationRetrieveRouteResponse.msg
                routes = navigationRetrieveRouteResponse.routes.map { it.toMutableList() }
                status = navigationRetrieveRouteResponse.status
                warning = navigationRetrieveRouteResponse.warning.map { it.toMutableList() }
                additionalProperties =
                    navigationRetrieveRouteResponse.additionalProperties.toMutableMap()
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
         * An array of objects describing different possible routes from the starting location to
         * the destination. Each object represents one route.
         */
        fun routes(routes: List<Route>) = routes(JsonField.of(routes))

        /**
         * Sets [Builder.routes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routes] with a well-typed `List<Route>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routes(routes: JsonField<List<Route>>) = apply {
            this.routes = routes.map { it.toMutableList() }
        }

        /**
         * Adds a single [Route] to [routes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRoute(route: Route) = apply {
            routes =
                (routes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("routes", it).add(route)
                }
        }

        /**
         * A string indicating the state of the response. On normal responses, the value will be
         * `Ok`. Indicative HTTP error codes are returned for different errors. See the
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

        /** warning when facing unexpected behaviour */
        fun warning(warning: List<String>) = warning(JsonField.of(warning))

        /**
         * Sets [Builder.warning] to an arbitrary JSON value.
         *
         * You should usually call [Builder.warning] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun warning(warning: JsonField<List<String>>) = apply {
            this.warning = warning.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.warning].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWarning(warning: String) = apply {
            this.warning =
                (this.warning ?: JsonField.of(mutableListOf())).also {
                    checkKnown("warning", it).add(warning)
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
         * Returns an immutable instance of [NavigationRetrieveRouteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NavigationRetrieveRouteResponse =
            NavigationRetrieveRouteResponse(
                msg,
                (routes ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                (warning ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NavigationRetrieveRouteResponse = apply {
        if (validated) {
            return@apply
        }

        msg()
        routes().ifPresent { it.forEach { it.validate() } }
        status()
        warning()
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
            (routes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (warning.asKnown().getOrNull()?.size ?: 0)

    class Route
    private constructor(
        private val distance: JsonField<Double>,
        private val distanceFull: JsonField<Double>,
        private val duration: JsonField<Long>,
        private val endLocation: JsonField<EndLocation>,
        private val geojson: JsonField<Geojson>,
        private val geometry: JsonField<String>,
        private val legs: JsonField<List<Leg>>,
        private val predictedDuration: JsonField<Double>,
        private val rawDuration: JsonField<Double>,
        private val specialObjects: JsonValue,
        private val startLocation: JsonField<StartLocation>,
        private val weight: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("distance")
            @ExcludeMissing
            distance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("distance_full")
            @ExcludeMissing
            distanceFull: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("duration") @ExcludeMissing duration: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("end_location")
            @ExcludeMissing
            endLocation: JsonField<EndLocation> = JsonMissing.of(),
            @JsonProperty("geojson") @ExcludeMissing geojson: JsonField<Geojson> = JsonMissing.of(),
            @JsonProperty("geometry")
            @ExcludeMissing
            geometry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("legs") @ExcludeMissing legs: JsonField<List<Leg>> = JsonMissing.of(),
            @JsonProperty("predicted_duration")
            @ExcludeMissing
            predictedDuration: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("raw_duration")
            @ExcludeMissing
            rawDuration: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("special_objects")
            @ExcludeMissing
            specialObjects: JsonValue = JsonMissing.of(),
            @JsonProperty("start_location")
            @ExcludeMissing
            startLocation: JsonField<StartLocation> = JsonMissing.of(),
            @JsonProperty("weight") @ExcludeMissing weight: JsonField<Double> = JsonMissing.of(),
        ) : this(
            distance,
            distanceFull,
            duration,
            endLocation,
            geojson,
            geometry,
            legs,
            predictedDuration,
            rawDuration,
            specialObjects,
            startLocation,
            weight,
            mutableMapOf(),
        )

        /**
         * The distance, in meters, of the complete trip.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun distance(): Optional<Double> = distance.getOptional("distance")

        /**
         * The total distance of the route, including additional details such as extra maneuvers or
         * loops, in meters.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun distanceFull(): Optional<Double> = distanceFull.getOptional("distance_full")

        /**
         * The duration, in seconds, of the complete trip.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun duration(): Optional<Long> = duration.getOptional("duration")

        /**
         * Location coordinates of the point where the route ends.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun endLocation(): Optional<EndLocation> = endLocation.getOptional("end_location")

        /**
         * The GeoJSON representation of the route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geojson(): Optional<Geojson> = geojson.getOptional("geojson")

        /**
         * Encoded geometry of the returned route as per the selected format in `geometry` and
         * specified `overview` verbosity. Please note the `overview` will always be `full` when
         * `original_shape` parameter is used in the input request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geometry(): Optional<String> = geometry.getOptional("geometry")

        /**
         * An array of objects returning the details about each `leg` of the route. `waypoints`
         * split the route into legs.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun legs(): Optional<List<Leg>> = legs.getOptional("legs")

        /**
         * The predicted duration of the route based on real-time traffic conditions.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun predictedDuration(): Optional<Double> =
            predictedDuration.getOptional("predicted_duration")

        /**
         * The raw estimated duration of the route in seconds.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rawDuration(): Optional<Double> = rawDuration.getOptional("raw_duration")

        /** Special geospatial objects or landmarks crossed along the route. */
        @JsonProperty("special_objects")
        @ExcludeMissing
        fun _specialObjects(): JsonValue = specialObjects

        /**
         * Location coordinates of the point where the route starts.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun startLocation(): Optional<StartLocation> = startLocation.getOptional("start_location")

        /**
         * A weight value associated with the route or leg.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun weight(): Optional<Double> = weight.getOptional("weight")

        /**
         * Returns the raw JSON value of [distance].
         *
         * Unlike [distance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Double> = distance

        /**
         * Returns the raw JSON value of [distanceFull].
         *
         * Unlike [distanceFull], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("distance_full")
        @ExcludeMissing
        fun _distanceFull(): JsonField<Double> = distanceFull

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

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
         * Returns the raw JSON value of [predictedDuration].
         *
         * Unlike [predictedDuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("predicted_duration")
        @ExcludeMissing
        fun _predictedDuration(): JsonField<Double> = predictedDuration

        /**
         * Returns the raw JSON value of [rawDuration].
         *
         * Unlike [rawDuration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("raw_duration")
        @ExcludeMissing
        fun _rawDuration(): JsonField<Double> = rawDuration

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
         * Returns the raw JSON value of [weight].
         *
         * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Double> = weight

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
            private var distanceFull: JsonField<Double> = JsonMissing.of()
            private var duration: JsonField<Long> = JsonMissing.of()
            private var endLocation: JsonField<EndLocation> = JsonMissing.of()
            private var geojson: JsonField<Geojson> = JsonMissing.of()
            private var geometry: JsonField<String> = JsonMissing.of()
            private var legs: JsonField<MutableList<Leg>>? = null
            private var predictedDuration: JsonField<Double> = JsonMissing.of()
            private var rawDuration: JsonField<Double> = JsonMissing.of()
            private var specialObjects: JsonValue = JsonMissing.of()
            private var startLocation: JsonField<StartLocation> = JsonMissing.of()
            private var weight: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(route: Route) = apply {
                distance = route.distance
                distanceFull = route.distanceFull
                duration = route.duration
                endLocation = route.endLocation
                geojson = route.geojson
                geometry = route.geometry
                legs = route.legs.map { it.toMutableList() }
                predictedDuration = route.predictedDuration
                rawDuration = route.rawDuration
                specialObjects = route.specialObjects
                startLocation = route.startLocation
                weight = route.weight
                additionalProperties = route.additionalProperties.toMutableMap()
            }

            /** The distance, in meters, of the complete trip. */
            fun distance(distance: Double) = distance(JsonField.of(distance))

            /**
             * Sets [Builder.distance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distance] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

            /**
             * The total distance of the route, including additional details such as extra maneuvers
             * or loops, in meters.
             */
            fun distanceFull(distanceFull: Double) = distanceFull(JsonField.of(distanceFull))

            /**
             * Sets [Builder.distanceFull] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distanceFull] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distanceFull(distanceFull: JsonField<Double>) = apply {
                this.distanceFull = distanceFull
            }

            /** The duration, in seconds, of the complete trip. */
            fun duration(duration: Long) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

            /** Location coordinates of the point where the route ends. */
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

            /**
             * Encoded geometry of the returned route as per the selected format in `geometry` and
             * specified `overview` verbosity. Please note the `overview` will always be `full` when
             * `original_shape` parameter is used in the input request.
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
             * An array of objects returning the details about each `leg` of the route. `waypoints`
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

            /** The predicted duration of the route based on real-time traffic conditions. */
            fun predictedDuration(predictedDuration: Double) =
                predictedDuration(JsonField.of(predictedDuration))

            /**
             * Sets [Builder.predictedDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.predictedDuration] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun predictedDuration(predictedDuration: JsonField<Double>) = apply {
                this.predictedDuration = predictedDuration
            }

            /** The raw estimated duration of the route in seconds. */
            fun rawDuration(rawDuration: Double) = rawDuration(JsonField.of(rawDuration))

            /**
             * Sets [Builder.rawDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rawDuration] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rawDuration(rawDuration: JsonField<Double>) = apply {
                this.rawDuration = rawDuration
            }

            /** Special geospatial objects or landmarks crossed along the route. */
            fun specialObjects(specialObjects: JsonValue) = apply {
                this.specialObjects = specialObjects
            }

            /** Location coordinates of the point where the route starts. */
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

            /** A weight value associated with the route or leg. */
            fun weight(weight: Double) = weight(JsonField.of(weight))

            /**
             * Sets [Builder.weight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.weight] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun weight(weight: JsonField<Double>) = apply { this.weight = weight }

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
                    distanceFull,
                    duration,
                    endLocation,
                    geojson,
                    geometry,
                    (legs ?: JsonMissing.of()).map { it.toImmutable() },
                    predictedDuration,
                    rawDuration,
                    specialObjects,
                    startLocation,
                    weight,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Route = apply {
            if (validated) {
                return@apply
            }

            distance()
            distanceFull()
            duration()
            endLocation().ifPresent { it.validate() }
            geojson().ifPresent { it.validate() }
            geometry()
            legs().ifPresent { it.forEach { it.validate() } }
            predictedDuration()
            rawDuration()
            startLocation().ifPresent { it.validate() }
            weight()
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
                (if (distanceFull.asKnown().isPresent) 1 else 0) +
                (if (duration.asKnown().isPresent) 1 else 0) +
                (endLocation.asKnown().getOrNull()?.validity() ?: 0) +
                (geojson.asKnown().getOrNull()?.validity() ?: 0) +
                (if (geometry.asKnown().isPresent) 1 else 0) +
                (legs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (predictedDuration.asKnown().isPresent) 1 else 0) +
                (if (rawDuration.asKnown().isPresent) 1 else 0) +
                (startLocation.asKnown().getOrNull()?.validity() ?: 0) +
                (if (weight.asKnown().isPresent) 1 else 0)

        /** Location coordinates of the point where the route ends. */
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
             * Latitude of the `end_location`.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun latitude(): Optional<Double> = latitude.getOptional("latitude")

            /**
             * Longitude of the `end_location`.
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

                /** Latitude of the `end_location`. */
                fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                /**
                 * Sets [Builder.latitude] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latitude] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

                /** Longitude of the `end_location`. */
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
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun geometry(): Optional<String> = geometry.getOptional("geometry")

            /**
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun properties(): Optional<String> = properties.getOptional("properties")

            /**
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

                fun geometry(geometry: String) = geometry(JsonField.of(geometry))

                /**
                 * Sets [Builder.geometry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.geometry] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun geometry(geometry: JsonField<String>) = apply { this.geometry = geometry }

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
            private val distance: JsonField<Distance>,
            private val duration: JsonField<Duration>,
            private val endLocation: JsonField<EndLocation>,
            private val rawDuration: JsonValue,
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
                @JsonProperty("raw_duration")
                @ExcludeMissing
                rawDuration: JsonValue = JsonMissing.of(),
                @JsonProperty("start_location")
                @ExcludeMissing
                startLocation: JsonField<StartLocation> = JsonMissing.of(),
                @JsonProperty("steps")
                @ExcludeMissing
                steps: JsonField<List<Step>> = JsonMissing.of(),
            ) : this(
                distance,
                duration,
                endLocation,
                rawDuration,
                startLocation,
                steps,
                mutableMapOf(),
            )

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
             * Location coordinates of the point where the leg ends.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun endLocation(): Optional<EndLocation> = endLocation.getOptional("end_location")

            /** The raw estimated duration of the `leg` in seconds. */
            @JsonProperty("raw_duration")
            @ExcludeMissing
            fun _rawDuration(): JsonValue = rawDuration

            /**
             * Location coordinates of the point where the leg starts.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun startLocation(): Optional<StartLocation> =
                startLocation.getOptional("start_location")

            /**
             * An array of step objects containing turn-by-turn guidance for easy navigation.
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
                private var rawDuration: JsonValue = JsonMissing.of()
                private var startLocation: JsonField<StartLocation> = JsonMissing.of()
                private var steps: JsonField<MutableList<Step>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(leg: Leg) = apply {
                    distance = leg.distance
                    duration = leg.duration
                    endLocation = leg.endLocation
                    rawDuration = leg.rawDuration
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

                /** Location coordinates of the point where the leg ends. */
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

                /** The raw estimated duration of the `leg` in seconds. */
                fun rawDuration(rawDuration: JsonValue) = apply { this.rawDuration = rawDuration }

                /** Location coordinates of the point where the leg starts. */
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
                 * An array of step objects containing turn-by-turn guidance for easy navigation.
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
                        rawDuration,
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
                private val value: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of()
                ) : this(value, mutableMapOf())

                /**
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun value(): Optional<Long> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

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

                    private var value: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(distance: Distance) = apply {
                        value = distance.value
                        additionalProperties = distance.additionalProperties.toMutableMap()
                    }

                    fun value(value: Long) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Long>) = apply { this.value = value }

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
                private val value: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of()
                ) : this(value, mutableMapOf())

                /**
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun value(): Optional<Long> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

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

                    private var value: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(duration: Duration) = apply {
                        value = duration.value
                        additionalProperties = duration.additionalProperties.toMutableMap()
                    }

                    fun value(value: Long) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Long>) = apply { this.value = value }

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

            /** Location coordinates of the point where the leg ends. */
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
                 * Latitude of `end_location` of the `leg`.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun latitude(): Optional<Double> = latitude.getOptional("latitude")

                /**
                 * Longitude of `end_location` of the `leg`.
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

                    /** Latitude of `end_location` of the `leg`. */
                    fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                    /**
                     * Sets [Builder.latitude] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.latitude] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

                    /** Longitude of `end_location` of the `leg`. */
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

            /** Location coordinates of the point where the leg starts. */
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
                 * Latitude of `start_location` of the `leg`.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun latitude(): Optional<Double> = latitude.getOptional("latitude")

                /**
                 * Longitude of `start_location` of the `leg`.
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

                    /** Latitude of `start_location` of the `leg`. */
                    fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                    /**
                     * Sets [Builder.latitude] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.latitude] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

                    /** Longitude of `start_location` of the `leg`. */
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
                private val drivingSide: JsonField<String>,
                private val duration: JsonField<Duration>,
                private val endLocation: JsonField<EndLocation>,
                private val geojson: JsonField<Geojson>,
                private val geometry: JsonField<String>,
                private val intersections: JsonField<List<Intersection>>,
                private val maneuver: JsonField<Maneuver>,
                private val name: JsonField<String>,
                private val reference: JsonField<String>,
                private val roadShieldType: JsonField<RoadShieldType>,
                private val startLocation: JsonField<StartLocation>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("distance")
                    @ExcludeMissing
                    distance: JsonField<Distance> = JsonMissing.of(),
                    @JsonProperty("driving_side")
                    @ExcludeMissing
                    drivingSide: JsonField<String> = JsonMissing.of(),
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
                    @JsonProperty("intersections")
                    @ExcludeMissing
                    intersections: JsonField<List<Intersection>> = JsonMissing.of(),
                    @JsonProperty("maneuver")
                    @ExcludeMissing
                    maneuver: JsonField<Maneuver> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("reference")
                    @ExcludeMissing
                    reference: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("road_shield_type")
                    @ExcludeMissing
                    roadShieldType: JsonField<RoadShieldType> = JsonMissing.of(),
                    @JsonProperty("start_location")
                    @ExcludeMissing
                    startLocation: JsonField<StartLocation> = JsonMissing.of(),
                ) : this(
                    distance,
                    drivingSide,
                    duration,
                    endLocation,
                    geojson,
                    geometry,
                    intersections,
                    maneuver,
                    name,
                    reference,
                    roadShieldType,
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
                 * Indicates the driving side of the road in case bidirectional traffic is allowed
                 * on the given segment. It can have two values: "left" & "right".
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun drivingSide(): Optional<String> = drivingSide.getOptional("driving_side")

                /**
                 * An object containing step duration value, in seconds.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun duration(): Optional<Duration> = duration.getOptional("duration")

                /**
                 * Location coordinates of the point where the `step` ends.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun endLocation(): Optional<EndLocation> = endLocation.getOptional("end_location")

                /**
                 * The GeoJSON representation of the `step`.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun geojson(): Optional<Geojson> = geojson.getOptional("geojson")

                /**
                 * Encoded geometry of the `step` in the selected format.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun geometry(): Optional<String> = geometry.getOptional("geometry")

                /**
                 * An array of objects representing intersections (or cross-way) that the route
                 * passes by along the `step`. For every `step`, the very first `intersection`
                 * corresponds to the location of the `maneuver`. All intersections until the next
                 * `maneuver` are listed in this object.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun intersections(): Optional<List<Intersection>> =
                    intersections.getOptional("intersections")

                /**
                 * An object with maneuver details for the `step`.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun maneuver(): Optional<Maneuver> = maneuver.getOptional("maneuver")

                /**
                 * The name of the `step`.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun name(): Optional<String> = name.getOptional("name")

                /**
                 * A reference for the `step`.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun reference(): Optional<String> = reference.getOptional("reference")

                /**
                 * An object containing road shield information.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun roadShieldType(): Optional<RoadShieldType> =
                    roadShieldType.getOptional("road_shield_type")

                /**
                 * Location coordinates of the point where the `step` starts.
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
                 * Returns the raw JSON value of [drivingSide].
                 *
                 * Unlike [drivingSide], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("driving_side")
                @ExcludeMissing
                fun _drivingSide(): JsonField<String> = drivingSide

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
                 * Returns the raw JSON value of [intersections].
                 *
                 * Unlike [intersections], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("intersections")
                @ExcludeMissing
                fun _intersections(): JsonField<List<Intersection>> = intersections

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
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [reference].
                 *
                 * Unlike [reference], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reference")
                @ExcludeMissing
                fun _reference(): JsonField<String> = reference

                /**
                 * Returns the raw JSON value of [roadShieldType].
                 *
                 * Unlike [roadShieldType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("road_shield_type")
                @ExcludeMissing
                fun _roadShieldType(): JsonField<RoadShieldType> = roadShieldType

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
                    private var drivingSide: JsonField<String> = JsonMissing.of()
                    private var duration: JsonField<Duration> = JsonMissing.of()
                    private var endLocation: JsonField<EndLocation> = JsonMissing.of()
                    private var geojson: JsonField<Geojson> = JsonMissing.of()
                    private var geometry: JsonField<String> = JsonMissing.of()
                    private var intersections: JsonField<MutableList<Intersection>>? = null
                    private var maneuver: JsonField<Maneuver> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var reference: JsonField<String> = JsonMissing.of()
                    private var roadShieldType: JsonField<RoadShieldType> = JsonMissing.of()
                    private var startLocation: JsonField<StartLocation> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(step: Step) = apply {
                        distance = step.distance
                        drivingSide = step.drivingSide
                        duration = step.duration
                        endLocation = step.endLocation
                        geojson = step.geojson
                        geometry = step.geometry
                        intersections = step.intersections.map { it.toMutableList() }
                        maneuver = step.maneuver
                        name = step.name
                        reference = step.reference
                        roadShieldType = step.roadShieldType
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

                    /**
                     * Indicates the driving side of the road in case bidirectional traffic is
                     * allowed on the given segment. It can have two values: "left" & "right".
                     */
                    fun drivingSide(drivingSide: String) = drivingSide(JsonField.of(drivingSide))

                    /**
                     * Sets [Builder.drivingSide] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.drivingSide] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun drivingSide(drivingSide: JsonField<String>) = apply {
                        this.drivingSide = drivingSide
                    }

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

                    /** Location coordinates of the point where the `step` ends. */
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

                    /** The GeoJSON representation of the `step`. */
                    fun geojson(geojson: Geojson) = geojson(JsonField.of(geojson))

                    /**
                     * Sets [Builder.geojson] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.geojson] with a well-typed [Geojson] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun geojson(geojson: JsonField<Geojson>) = apply { this.geojson = geojson }

                    /** Encoded geometry of the `step` in the selected format. */
                    fun geometry(geometry: String) = geometry(JsonField.of(geometry))

                    /**
                     * Sets [Builder.geometry] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.geometry] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun geometry(geometry: JsonField<String>) = apply { this.geometry = geometry }

                    /**
                     * An array of objects representing intersections (or cross-way) that the route
                     * passes by along the `step`. For every `step`, the very first `intersection`
                     * corresponds to the location of the `maneuver`. All intersections until the
                     * next `maneuver` are listed in this object.
                     */
                    fun intersections(intersections: List<Intersection>) =
                        intersections(JsonField.of(intersections))

                    /**
                     * Sets [Builder.intersections] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.intersections] with a well-typed
                     * `List<Intersection>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun intersections(intersections: JsonField<List<Intersection>>) = apply {
                        this.intersections = intersections.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Intersection] to [intersections].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addIntersection(intersection: Intersection) = apply {
                        intersections =
                            (intersections ?: JsonField.of(mutableListOf())).also {
                                checkKnown("intersections", it).add(intersection)
                            }
                    }

                    /** An object with maneuver details for the `step`. */
                    fun maneuver(maneuver: Maneuver) = maneuver(JsonField.of(maneuver))

                    /**
                     * Sets [Builder.maneuver] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maneuver] with a well-typed [Maneuver] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun maneuver(maneuver: JsonField<Maneuver>) = apply { this.maneuver = maneuver }

                    /** The name of the `step`. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** A reference for the `step`. */
                    fun reference(reference: String) = reference(JsonField.of(reference))

                    /**
                     * Sets [Builder.reference] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reference] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun reference(reference: JsonField<String>) = apply {
                        this.reference = reference
                    }

                    /** An object containing road shield information. */
                    fun roadShieldType(roadShieldType: RoadShieldType) =
                        roadShieldType(JsonField.of(roadShieldType))

                    /**
                     * Sets [Builder.roadShieldType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.roadShieldType] with a well-typed
                     * [RoadShieldType] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun roadShieldType(roadShieldType: JsonField<RoadShieldType>) = apply {
                        this.roadShieldType = roadShieldType
                    }

                    /** Location coordinates of the point where the `step` starts. */
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
                            drivingSide,
                            duration,
                            endLocation,
                            geojson,
                            geometry,
                            (intersections ?: JsonMissing.of()).map { it.toImmutable() },
                            maneuver,
                            name,
                            reference,
                            roadShieldType,
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
                    drivingSide()
                    duration().ifPresent { it.validate() }
                    endLocation().ifPresent { it.validate() }
                    geojson().ifPresent { it.validate() }
                    geometry()
                    intersections().ifPresent { it.forEach { it.validate() } }
                    maneuver().ifPresent { it.validate() }
                    name()
                    reference()
                    roadShieldType().ifPresent { it.validate() }
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
                        (if (drivingSide.asKnown().isPresent) 1 else 0) +
                        (duration.asKnown().getOrNull()?.validity() ?: 0) +
                        (endLocation.asKnown().getOrNull()?.validity() ?: 0) +
                        (geojson.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (geometry.asKnown().isPresent) 1 else 0) +
                        (intersections.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                            ?: 0) +
                        (maneuver.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (if (reference.asKnown().isPresent) 1 else 0) +
                        (roadShieldType.asKnown().getOrNull()?.validity() ?: 0) +
                        (startLocation.asKnown().getOrNull()?.validity() ?: 0)

                /** An object containing step distance value, in meters. */
                class Distance
                private constructor(
                    private val value: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Long> = JsonMissing.of()
                    ) : this(value, mutableMapOf())

                    /**
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<Long> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

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

                        private var value: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(distance: Distance) = apply {
                            value = distance.value
                            additionalProperties = distance.additionalProperties.toMutableMap()
                        }

                        fun value(value: Long) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Long>) = apply { this.value = value }

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
                    private val value: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Long> = JsonMissing.of()
                    ) : this(value, mutableMapOf())

                    /**
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<Long> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

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

                        private var value: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(duration: Duration) = apply {
                            value = duration.value
                            additionalProperties = duration.additionalProperties.toMutableMap()
                        }

                        fun value(value: Long) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Long>) = apply { this.value = value }

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

                /** Location coordinates of the point where the `step` ends. */
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
                     * Latitude of the `end_location` of the `step`.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun latitude(): Optional<Double> = latitude.getOptional("latitude")

                    /**
                     * Longitude of the `end_location` of the `step`.
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

                        /** Latitude of the `end_location` of the `step`. */
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

                        /** Longitude of the `end_location` of the `step`. */
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

                /** The GeoJSON representation of the `step`. */
                class Geojson
                private constructor(
                    private val geometry: JsonField<String>,
                    private val type: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("geometry")
                        @ExcludeMissing
                        geometry: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<String> = JsonMissing.of(),
                    ) : this(geometry, type, mutableMapOf())

                    /**
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun geometry(): Optional<String> = geometry.getOptional("geometry")

                    /**
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
                    fun _geometry(): JsonField<String> = geometry

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

                        private var geometry: JsonField<String> = JsonMissing.of()
                        private var type: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(geojson: Geojson) = apply {
                            geometry = geojson.geometry
                            type = geojson.type
                            additionalProperties = geojson.additionalProperties.toMutableMap()
                        }

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
                            Geojson(geometry, type, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): Geojson = apply {
                        if (validated) {
                            return@apply
                        }

                        geometry()
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
                        (if (geometry.asKnown().isPresent) 1 else 0) +
                            (if (type.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Geojson && geometry == other.geometry && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(geometry, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Geojson{geometry=$geometry, type=$type, additionalProperties=$additionalProperties}"
                }

                class Intersection
                private constructor(
                    private val bearings: JsonField<List<Long>>,
                    private val classes: JsonField<List<String>>,
                    private val entry: JsonField<List<Boolean>>,
                    private val intersectionIn: JsonField<Long>,
                    private val intersectionOut: JsonField<Long>,
                    private val lanes: JsonField<List<Lane>>,
                    private val location: JsonField<Location>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bearings")
                        @ExcludeMissing
                        bearings: JsonField<List<Long>> = JsonMissing.of(),
                        @JsonProperty("classes")
                        @ExcludeMissing
                        classes: JsonField<List<String>> = JsonMissing.of(),
                        @JsonProperty("entry")
                        @ExcludeMissing
                        entry: JsonField<List<Boolean>> = JsonMissing.of(),
                        @JsonProperty("intersection_in")
                        @ExcludeMissing
                        intersectionIn: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("intersection_out")
                        @ExcludeMissing
                        intersectionOut: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("lanes")
                        @ExcludeMissing
                        lanes: JsonField<List<Lane>> = JsonMissing.of(),
                        @JsonProperty("location")
                        @ExcludeMissing
                        location: JsonField<Location> = JsonMissing.of(),
                    ) : this(
                        bearings,
                        classes,
                        entry,
                        intersectionIn,
                        intersectionOut,
                        lanes,
                        location,
                        mutableMapOf(),
                    )

                    /**
                     * A list of bearing values (e.g. [0,90,180,270]) that are available at the
                     * intersection. The `bearings` describe all available roads at the
                     * intersection.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun bearings(): Optional<List<Long>> = bearings.getOptional("bearings")

                    /**
                     * An array of strings representing the classes or types of roads or paths at
                     * the intersection. The classes can indicate the road hierarchy, such as a
                     * motorway, primary road, secondary road, etc.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun classes(): Optional<List<String>> = classes.getOptional("classes")

                    /**
                     * A value of `true` indicates that the respective road could be entered on a
                     * valid route. `false` indicates that the turn onto the respective road would
                     * violate a restriction. Each entry value corresponds to the bearing angle at
                     * the same index.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun entry(): Optional<List<Boolean>> = entry.getOptional("entry")

                    /**
                     * The number of incoming roads or paths at the `intersection`.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun intersectionIn(): Optional<Long> =
                        intersectionIn.getOptional("intersection_in")

                    /**
                     * The number of outgoing roads or paths from the `intersection`.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun intersectionOut(): Optional<Long> =
                        intersectionOut.getOptional("intersection_out")

                    /**
                     * An array of lane objects representing the lanes available at the
                     * intersection. If no lane information is available for an `intersection`, the
                     * `lanes` property will not be present.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun lanes(): Optional<List<Lane>> = lanes.getOptional("lanes")

                    /**
                     * A [longitude, latitude] pair describing the location of the intersection.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun location(): Optional<Location> = location.getOptional("location")

                    /**
                     * Returns the raw JSON value of [bearings].
                     *
                     * Unlike [bearings], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("bearings")
                    @ExcludeMissing
                    fun _bearings(): JsonField<List<Long>> = bearings

                    /**
                     * Returns the raw JSON value of [classes].
                     *
                     * Unlike [classes], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("classes")
                    @ExcludeMissing
                    fun _classes(): JsonField<List<String>> = classes

                    /**
                     * Returns the raw JSON value of [entry].
                     *
                     * Unlike [entry], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("entry")
                    @ExcludeMissing
                    fun _entry(): JsonField<List<Boolean>> = entry

                    /**
                     * Returns the raw JSON value of [intersectionIn].
                     *
                     * Unlike [intersectionIn], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("intersection_in")
                    @ExcludeMissing
                    fun _intersectionIn(): JsonField<Long> = intersectionIn

                    /**
                     * Returns the raw JSON value of [intersectionOut].
                     *
                     * Unlike [intersectionOut], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("intersection_out")
                    @ExcludeMissing
                    fun _intersectionOut(): JsonField<Long> = intersectionOut

                    /**
                     * Returns the raw JSON value of [lanes].
                     *
                     * Unlike [lanes], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("lanes")
                    @ExcludeMissing
                    fun _lanes(): JsonField<List<Lane>> = lanes

                    /**
                     * Returns the raw JSON value of [location].
                     *
                     * Unlike [location], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("location")
                    @ExcludeMissing
                    fun _location(): JsonField<Location> = location

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
                         * Returns a mutable builder for constructing an instance of [Intersection].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Intersection]. */
                    class Builder internal constructor() {

                        private var bearings: JsonField<MutableList<Long>>? = null
                        private var classes: JsonField<MutableList<String>>? = null
                        private var entry: JsonField<MutableList<Boolean>>? = null
                        private var intersectionIn: JsonField<Long> = JsonMissing.of()
                        private var intersectionOut: JsonField<Long> = JsonMissing.of()
                        private var lanes: JsonField<MutableList<Lane>>? = null
                        private var location: JsonField<Location> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(intersection: Intersection) = apply {
                            bearings = intersection.bearings.map { it.toMutableList() }
                            classes = intersection.classes.map { it.toMutableList() }
                            entry = intersection.entry.map { it.toMutableList() }
                            intersectionIn = intersection.intersectionIn
                            intersectionOut = intersection.intersectionOut
                            lanes = intersection.lanes.map { it.toMutableList() }
                            location = intersection.location
                            additionalProperties = intersection.additionalProperties.toMutableMap()
                        }

                        /**
                         * A list of bearing values (e.g. [0,90,180,270]) that are available at the
                         * intersection. The `bearings` describe all available roads at the
                         * intersection.
                         */
                        fun bearings(bearings: List<Long>) = bearings(JsonField.of(bearings))

                        /**
                         * Sets [Builder.bearings] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bearings] with a well-typed `List<Long>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bearings(bearings: JsonField<List<Long>>) = apply {
                            this.bearings = bearings.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Long] to [bearings].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addBearing(bearing: Long) = apply {
                            bearings =
                                (bearings ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("bearings", it).add(bearing)
                                }
                        }

                        /**
                         * An array of strings representing the classes or types of roads or paths
                         * at the intersection. The classes can indicate the road hierarchy, such as
                         * a motorway, primary road, secondary road, etc.
                         */
                        fun classes(classes: List<String>) = classes(JsonField.of(classes))

                        /**
                         * Sets [Builder.classes] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.classes] with a well-typed
                         * `List<String>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun classes(classes: JsonField<List<String>>) = apply {
                            this.classes = classes.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [classes].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addClass(class_: String) = apply {
                            classes =
                                (classes ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("classes", it).add(class_)
                                }
                        }

                        /**
                         * A value of `true` indicates that the respective road could be entered on
                         * a valid route. `false` indicates that the turn onto the respective road
                         * would violate a restriction. Each entry value corresponds to the bearing
                         * angle at the same index.
                         */
                        fun entry(entry: List<Boolean>) = entry(JsonField.of(entry))

                        /**
                         * Sets [Builder.entry] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.entry] with a well-typed `List<Boolean>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun entry(entry: JsonField<List<Boolean>>) = apply {
                            this.entry = entry.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Boolean] to [Builder.entry].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addEntry(entry: Boolean) = apply {
                            this.entry =
                                (this.entry ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("entry", it).add(entry)
                                }
                        }

                        /** The number of incoming roads or paths at the `intersection`. */
                        fun intersectionIn(intersectionIn: Long) =
                            intersectionIn(JsonField.of(intersectionIn))

                        /**
                         * Sets [Builder.intersectionIn] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.intersectionIn] with a well-typed [Long]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun intersectionIn(intersectionIn: JsonField<Long>) = apply {
                            this.intersectionIn = intersectionIn
                        }

                        /** The number of outgoing roads or paths from the `intersection`. */
                        fun intersectionOut(intersectionOut: Long) =
                            intersectionOut(JsonField.of(intersectionOut))

                        /**
                         * Sets [Builder.intersectionOut] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.intersectionOut] with a well-typed
                         * [Long] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun intersectionOut(intersectionOut: JsonField<Long>) = apply {
                            this.intersectionOut = intersectionOut
                        }

                        /**
                         * An array of lane objects representing the lanes available at the
                         * intersection. If no lane information is available for an `intersection`,
                         * the `lanes` property will not be present.
                         */
                        fun lanes(lanes: List<Lane>) = lanes(JsonField.of(lanes))

                        /**
                         * Sets [Builder.lanes] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lanes] with a well-typed `List<Lane>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lanes(lanes: JsonField<List<Lane>>) = apply {
                            this.lanes = lanes.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Lane] to [lanes].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addLane(lane: Lane) = apply {
                            lanes =
                                (lanes ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("lanes", it).add(lane)
                                }
                        }

                        /**
                         * A [longitude, latitude] pair describing the location of the intersection.
                         */
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
                         * Returns an immutable instance of [Intersection].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Intersection =
                            Intersection(
                                (bearings ?: JsonMissing.of()).map { it.toImmutable() },
                                (classes ?: JsonMissing.of()).map { it.toImmutable() },
                                (entry ?: JsonMissing.of()).map { it.toImmutable() },
                                intersectionIn,
                                intersectionOut,
                                (lanes ?: JsonMissing.of()).map { it.toImmutable() },
                                location,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Intersection = apply {
                        if (validated) {
                            return@apply
                        }

                        bearings()
                        classes()
                        entry()
                        intersectionIn()
                        intersectionOut()
                        lanes().ifPresent { it.forEach { it.validate() } }
                        location().ifPresent { it.validate() }
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
                        (bearings.asKnown().getOrNull()?.size ?: 0) +
                            (classes.asKnown().getOrNull()?.size ?: 0) +
                            (entry.asKnown().getOrNull()?.size ?: 0) +
                            (if (intersectionIn.asKnown().isPresent) 1 else 0) +
                            (if (intersectionOut.asKnown().isPresent) 1 else 0) +
                            (lanes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                            (location.asKnown().getOrNull()?.validity() ?: 0)

                    class Lane
                    private constructor(
                        private val indications: JsonField<List<String>>,
                        private val valid: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("indications")
                            @ExcludeMissing
                            indications: JsonField<List<String>> = JsonMissing.of(),
                            @JsonProperty("valid")
                            @ExcludeMissing
                            valid: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(indications, valid, mutableMapOf())

                        /**
                         * It represents actions associated with the lane. These indications
                         * describe the permitted maneuvers or directions that can be taken from the
                         * lane. Common indications include "turn left," "turn right," "go
                         * straight," "merge," "exit," etc.
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun indications(): Optional<List<String>> =
                            indications.getOptional("indications")

                        /**
                         * This indicates the validity of the lane. It specifies whether the lane is
                         * considered valid for making the indicated maneuver or if there are any
                         * restrictions or limitations associated with it.
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun valid(): Optional<Boolean> = valid.getOptional("valid")

                        /**
                         * Returns the raw JSON value of [indications].
                         *
                         * Unlike [indications], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("indications")
                        @ExcludeMissing
                        fun _indications(): JsonField<List<String>> = indications

                        /**
                         * Returns the raw JSON value of [valid].
                         *
                         * Unlike [valid], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("valid")
                        @ExcludeMissing
                        fun _valid(): JsonField<Boolean> = valid

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

                            /** Returns a mutable builder for constructing an instance of [Lane]. */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Lane]. */
                        class Builder internal constructor() {

                            private var indications: JsonField<MutableList<String>>? = null
                            private var valid: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(lane: Lane) = apply {
                                indications = lane.indications.map { it.toMutableList() }
                                valid = lane.valid
                                additionalProperties = lane.additionalProperties.toMutableMap()
                            }

                            /**
                             * It represents actions associated with the lane. These indications
                             * describe the permitted maneuvers or directions that can be taken from
                             * the lane. Common indications include "turn left," "turn right," "go
                             * straight," "merge," "exit," etc.
                             */
                            fun indications(indications: List<String>) =
                                indications(JsonField.of(indications))

                            /**
                             * Sets [Builder.indications] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.indications] with a well-typed
                             * `List<String>` value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun indications(indications: JsonField<List<String>>) = apply {
                                this.indications = indications.map { it.toMutableList() }
                            }

                            /**
                             * Adds a single [String] to [indications].
                             *
                             * @throws IllegalStateException if the field was previously set to a
                             *   non-list.
                             */
                            fun addIndication(indication: String) = apply {
                                indications =
                                    (indications ?: JsonField.of(mutableListOf())).also {
                                        checkKnown("indications", it).add(indication)
                                    }
                            }

                            /**
                             * This indicates the validity of the lane. It specifies whether the
                             * lane is considered valid for making the indicated maneuver or if
                             * there are any restrictions or limitations associated with it.
                             */
                            fun valid(valid: Boolean) = valid(JsonField.of(valid))

                            /**
                             * Sets [Builder.valid] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.valid] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun valid(valid: JsonField<Boolean>) = apply { this.valid = valid }

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
                             * Returns an immutable instance of [Lane].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Lane =
                                Lane(
                                    (indications ?: JsonMissing.of()).map { it.toImmutable() },
                                    valid,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Lane = apply {
                            if (validated) {
                                return@apply
                            }

                            indications()
                            valid()
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
                            (indications.asKnown().getOrNull()?.size ?: 0) +
                                (if (valid.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Lane && indications == other.indications && valid == other.valid && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(indications, valid, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Lane{indications=$indications, valid=$valid, additionalProperties=$additionalProperties}"
                    }

                    /** A [longitude, latitude] pair describing the location of the intersection. */
                    class Location
                    private constructor(
                        private val latitude: JsonField<Double>,
                        private val longitude: JsonField<Double>,
                        private val name: JsonField<String>,
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
                            @JsonProperty("name")
                            @ExcludeMissing
                            name: JsonField<String> = JsonMissing.of(),
                        ) : this(latitude, longitude, name, mutableMapOf())

                        /**
                         * The latitude coordinate of the `intersection`.
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun latitude(): Optional<Double> = latitude.getOptional("latitude")

                        /**
                         * The longitude coordinate of the `intersection`.
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun longitude(): Optional<Double> = longitude.getOptional("longitude")

                        /**
                         * The name or description of the `intersection`.
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun name(): Optional<String> = name.getOptional("name")

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

                        /**
                         * Returns the raw JSON value of [name].
                         *
                         * Unlike [name], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                             * Returns a mutable builder for constructing an instance of [Location].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Location]. */
                        class Builder internal constructor() {

                            private var latitude: JsonField<Double> = JsonMissing.of()
                            private var longitude: JsonField<Double> = JsonMissing.of()
                            private var name: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(location: Location) = apply {
                                latitude = location.latitude
                                longitude = location.longitude
                                name = location.name
                                additionalProperties = location.additionalProperties.toMutableMap()
                            }

                            /** The latitude coordinate of the `intersection`. */
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

                            /** The longitude coordinate of the `intersection`. */
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

                            /** The name or description of the `intersection`. */
                            fun name(name: String) = name(JsonField.of(name))

                            /**
                             * Sets [Builder.name] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.name] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun name(name: JsonField<String>) = apply { this.name = name }

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
                             * Returns an immutable instance of [Location].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Location =
                                Location(
                                    latitude,
                                    longitude,
                                    name,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Location = apply {
                            if (validated) {
                                return@apply
                            }

                            latitude()
                            longitude()
                            name()
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
                                (if (longitude.asKnown().isPresent) 1 else 0) +
                                (if (name.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Location && latitude == other.latitude && longitude == other.longitude && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(latitude, longitude, name, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Location{latitude=$latitude, longitude=$longitude, name=$name, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Intersection && bearings == other.bearings && classes == other.classes && entry == other.entry && intersectionIn == other.intersectionIn && intersectionOut == other.intersectionOut && lanes == other.lanes && location == other.location && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(bearings, classes, entry, intersectionIn, intersectionOut, lanes, location, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Intersection{bearings=$bearings, classes=$classes, entry=$entry, intersectionIn=$intersectionIn, intersectionOut=$intersectionOut, lanes=$lanes, location=$location, additionalProperties=$additionalProperties}"
                }

                /** An object with maneuver details for the `step`. */
                class Maneuver
                private constructor(
                    private val bearingAfter: JsonField<Double>,
                    private val bearingBefore: JsonField<Double>,
                    private val coordinate: JsonField<Coordinate>,
                    private val instruction: JsonField<String>,
                    private val maneuverType: JsonField<String>,
                    private val muted: JsonField<Boolean>,
                    private val roundaboutCount: JsonField<Long>,
                    private val voiceInstruction: JsonField<List<VoiceInstruction>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bearing_after")
                        @ExcludeMissing
                        bearingAfter: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("bearing_before")
                        @ExcludeMissing
                        bearingBefore: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("coordinate")
                        @ExcludeMissing
                        coordinate: JsonField<Coordinate> = JsonMissing.of(),
                        @JsonProperty("instruction")
                        @ExcludeMissing
                        instruction: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("maneuver_type")
                        @ExcludeMissing
                        maneuverType: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("muted")
                        @ExcludeMissing
                        muted: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("roundabout_count")
                        @ExcludeMissing
                        roundaboutCount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("voice_instruction")
                        @ExcludeMissing
                        voiceInstruction: JsonField<List<VoiceInstruction>> = JsonMissing.of(),
                    ) : this(
                        bearingAfter,
                        bearingBefore,
                        coordinate,
                        instruction,
                        maneuverType,
                        muted,
                        roundaboutCount,
                        voiceInstruction,
                        mutableMapOf(),
                    )

                    /**
                     * The clockwise angle from true north to the direction of travel immediately
                     * after the `maneuver`. Range of values is between 0-359.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun bearingAfter(): Optional<Double> = bearingAfter.getOptional("bearing_after")

                    /**
                     * The clockwise angle from true north to the direction of travel immediately
                     * before the `maneuver`. Range of values is between 0-359.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun bearingBefore(): Optional<Double> =
                        bearingBefore.getOptional("bearing_before")

                    /**
                     * A coordinate pair describing the location of the `maneuver`.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun coordinate(): Optional<Coordinate> = coordinate.getOptional("coordinate")

                    /**
                     * A text instruction describing the maneuver to be performed. It provides
                     * guidance on the action to take at the maneuver location, such as "Turn left,"
                     * "Go straight," "Exit the roundabout," etc.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun instruction(): Optional<String> = instruction.getOptional("instruction")

                    /**
                     * A string indicating the type of `maneuver`.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun maneuverType(): Optional<String> = maneuverType.getOptional("maneuver_type")

                    /**
                     * A boolean value indicating whether the voice instruction for the maneuver
                     * should be muted or not.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun muted(): Optional<Boolean> = muted.getOptional("muted")

                    /**
                     * The number of roundabouts encountered so far during the route. This parameter
                     * is specific to roundabout maneuvers and indicates the count of roundabouts
                     * before the current one.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun roundaboutCount(): Optional<Long> =
                        roundaboutCount.getOptional("roundabout_count")

                    /**
                     * An array of voice instruction objects associated with the `maneuver`. Each
                     * object provides additional details about the voice instruction, including the
                     * distance along the geometry where the instruction applies, the instruction
                     * text, and the unit of measurement.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun voiceInstruction(): Optional<List<VoiceInstruction>> =
                        voiceInstruction.getOptional("voice_instruction")

                    /**
                     * Returns the raw JSON value of [bearingAfter].
                     *
                     * Unlike [bearingAfter], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("bearing_after")
                    @ExcludeMissing
                    fun _bearingAfter(): JsonField<Double> = bearingAfter

                    /**
                     * Returns the raw JSON value of [bearingBefore].
                     *
                     * Unlike [bearingBefore], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("bearing_before")
                    @ExcludeMissing
                    fun _bearingBefore(): JsonField<Double> = bearingBefore

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
                     * Returns the raw JSON value of [instruction].
                     *
                     * Unlike [instruction], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("instruction")
                    @ExcludeMissing
                    fun _instruction(): JsonField<String> = instruction

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
                     * Returns the raw JSON value of [muted].
                     *
                     * Unlike [muted], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("muted") @ExcludeMissing fun _muted(): JsonField<Boolean> = muted

                    /**
                     * Returns the raw JSON value of [roundaboutCount].
                     *
                     * Unlike [roundaboutCount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("roundabout_count")
                    @ExcludeMissing
                    fun _roundaboutCount(): JsonField<Long> = roundaboutCount

                    /**
                     * Returns the raw JSON value of [voiceInstruction].
                     *
                     * Unlike [voiceInstruction], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("voice_instruction")
                    @ExcludeMissing
                    fun _voiceInstruction(): JsonField<List<VoiceInstruction>> = voiceInstruction

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

                        private var bearingAfter: JsonField<Double> = JsonMissing.of()
                        private var bearingBefore: JsonField<Double> = JsonMissing.of()
                        private var coordinate: JsonField<Coordinate> = JsonMissing.of()
                        private var instruction: JsonField<String> = JsonMissing.of()
                        private var maneuverType: JsonField<String> = JsonMissing.of()
                        private var muted: JsonField<Boolean> = JsonMissing.of()
                        private var roundaboutCount: JsonField<Long> = JsonMissing.of()
                        private var voiceInstruction: JsonField<MutableList<VoiceInstruction>>? =
                            null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(maneuver: Maneuver) = apply {
                            bearingAfter = maneuver.bearingAfter
                            bearingBefore = maneuver.bearingBefore
                            coordinate = maneuver.coordinate
                            instruction = maneuver.instruction
                            maneuverType = maneuver.maneuverType
                            muted = maneuver.muted
                            roundaboutCount = maneuver.roundaboutCount
                            voiceInstruction = maneuver.voiceInstruction.map { it.toMutableList() }
                            additionalProperties = maneuver.additionalProperties.toMutableMap()
                        }

                        /**
                         * The clockwise angle from true north to the direction of travel
                         * immediately after the `maneuver`. Range of values is between 0-359.
                         */
                        fun bearingAfter(bearingAfter: Double) =
                            bearingAfter(JsonField.of(bearingAfter))

                        /**
                         * Sets [Builder.bearingAfter] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bearingAfter] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bearingAfter(bearingAfter: JsonField<Double>) = apply {
                            this.bearingAfter = bearingAfter
                        }

                        /**
                         * The clockwise angle from true north to the direction of travel
                         * immediately before the `maneuver`. Range of values is between 0-359.
                         */
                        fun bearingBefore(bearingBefore: Double) =
                            bearingBefore(JsonField.of(bearingBefore))

                        /**
                         * Sets [Builder.bearingBefore] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bearingBefore] with a well-typed
                         * [Double] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun bearingBefore(bearingBefore: JsonField<Double>) = apply {
                            this.bearingBefore = bearingBefore
                        }

                        /** A coordinate pair describing the location of the `maneuver`. */
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

                        /**
                         * A text instruction describing the maneuver to be performed. It provides
                         * guidance on the action to take at the maneuver location, such as "Turn
                         * left," "Go straight," "Exit the roundabout," etc.
                         */
                        fun instruction(instruction: String) =
                            instruction(JsonField.of(instruction))

                        /**
                         * Sets [Builder.instruction] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.instruction] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun instruction(instruction: JsonField<String>) = apply {
                            this.instruction = instruction
                        }

                        /** A string indicating the type of `maneuver`. */
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

                        /**
                         * A boolean value indicating whether the voice instruction for the maneuver
                         * should be muted or not.
                         */
                        fun muted(muted: Boolean) = muted(JsonField.of(muted))

                        /**
                         * Sets [Builder.muted] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.muted] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun muted(muted: JsonField<Boolean>) = apply { this.muted = muted }

                        /**
                         * The number of roundabouts encountered so far during the route. This
                         * parameter is specific to roundabout maneuvers and indicates the count of
                         * roundabouts before the current one.
                         */
                        fun roundaboutCount(roundaboutCount: Long) =
                            roundaboutCount(JsonField.of(roundaboutCount))

                        /**
                         * Sets [Builder.roundaboutCount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.roundaboutCount] with a well-typed
                         * [Long] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun roundaboutCount(roundaboutCount: JsonField<Long>) = apply {
                            this.roundaboutCount = roundaboutCount
                        }

                        /**
                         * An array of voice instruction objects associated with the `maneuver`.
                         * Each object provides additional details about the voice instruction,
                         * including the distance along the geometry where the instruction applies,
                         * the instruction text, and the unit of measurement.
                         */
                        fun voiceInstruction(voiceInstruction: List<VoiceInstruction>) =
                            voiceInstruction(JsonField.of(voiceInstruction))

                        /**
                         * Sets [Builder.voiceInstruction] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.voiceInstruction] with a well-typed
                         * `List<VoiceInstruction>` value instead. This method is primarily for
                         * setting the field to an undocumented or not yet supported value.
                         */
                        fun voiceInstruction(voiceInstruction: JsonField<List<VoiceInstruction>>) =
                            apply {
                                this.voiceInstruction = voiceInstruction.map { it.toMutableList() }
                            }

                        /**
                         * Adds a single [VoiceInstruction] to [Builder.voiceInstruction].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addVoiceInstruction(voiceInstruction: VoiceInstruction) = apply {
                            this.voiceInstruction =
                                (this.voiceInstruction ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("voiceInstruction", it).add(voiceInstruction)
                                }
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
                                instruction,
                                maneuverType,
                                muted,
                                roundaboutCount,
                                (voiceInstruction ?: JsonMissing.of()).map { it.toImmutable() },
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
                        instruction()
                        maneuverType()
                        muted()
                        roundaboutCount()
                        voiceInstruction().ifPresent { it.forEach { it.validate() } }
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
                            (if (instruction.asKnown().isPresent) 1 else 0) +
                            (if (maneuverType.asKnown().isPresent) 1 else 0) +
                            (if (muted.asKnown().isPresent) 1 else 0) +
                            (if (roundaboutCount.asKnown().isPresent) 1 else 0) +
                            (voiceInstruction.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                                ?: 0)

                    /** A coordinate pair describing the location of the `maneuver`. */
                    class Coordinate
                    private constructor(
                        private val latitude: JsonField<Double>,
                        private val longitude: JsonField<Double>,
                        private val name: JsonField<String>,
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
                            @JsonProperty("name")
                            @ExcludeMissing
                            name: JsonField<String> = JsonMissing.of(),
                        ) : this(latitude, longitude, name, mutableMapOf())

                        /**
                         * The latitude coordinate of the `maneuver`.
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun latitude(): Optional<Double> = latitude.getOptional("latitude")

                        /**
                         * The longitude coordinate of the `maneuver`.
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun longitude(): Optional<Double> = longitude.getOptional("longitude")

                        /**
                         * The name or description of the maneuver location.
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun name(): Optional<String> = name.getOptional("name")

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

                        /**
                         * Returns the raw JSON value of [name].
                         *
                         * Unlike [name], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                            private var name: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(coordinate: Coordinate) = apply {
                                latitude = coordinate.latitude
                                longitude = coordinate.longitude
                                name = coordinate.name
                                additionalProperties =
                                    coordinate.additionalProperties.toMutableMap()
                            }

                            /** The latitude coordinate of the `maneuver`. */
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

                            /** The longitude coordinate of the `maneuver`. */
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

                            /** The name or description of the maneuver location. */
                            fun name(name: String) = name(JsonField.of(name))

                            /**
                             * Sets [Builder.name] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.name] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun name(name: JsonField<String>) = apply { this.name = name }

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
                                Coordinate(
                                    latitude,
                                    longitude,
                                    name,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Coordinate = apply {
                            if (validated) {
                                return@apply
                            }

                            latitude()
                            longitude()
                            name()
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
                                (if (longitude.asKnown().isPresent) 1 else 0) +
                                (if (name.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Coordinate && latitude == other.latitude && longitude == other.longitude && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(latitude, longitude, name, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Coordinate{latitude=$latitude, longitude=$longitude, name=$name, additionalProperties=$additionalProperties}"
                    }

                    class VoiceInstruction
                    private constructor(
                        private val distanceAlongGeometry: JsonField<Long>,
                        private val instruction: JsonField<String>,
                        private val unit: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("distance_along_geometry")
                            @ExcludeMissing
                            distanceAlongGeometry: JsonField<Long> = JsonMissing.of(),
                            @JsonProperty("instruction")
                            @ExcludeMissing
                            instruction: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("unit")
                            @ExcludeMissing
                            unit: JsonField<String> = JsonMissing.of(),
                        ) : this(distanceAlongGeometry, instruction, unit, mutableMapOf())

                        /**
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun distanceAlongGeometry(): Optional<Long> =
                            distanceAlongGeometry.getOptional("distance_along_geometry")

                        /**
                         * The guidance instructions for the upcoming `maneuver`
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun instruction(): Optional<String> = instruction.getOptional("instruction")

                        /**
                         * Unit of the `distance_along_geometry` metric
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun unit(): Optional<String> = unit.getOptional("unit")

                        /**
                         * Returns the raw JSON value of [distanceAlongGeometry].
                         *
                         * Unlike [distanceAlongGeometry], this method doesn't throw if the JSON
                         * field has an unexpected type.
                         */
                        @JsonProperty("distance_along_geometry")
                        @ExcludeMissing
                        fun _distanceAlongGeometry(): JsonField<Long> = distanceAlongGeometry

                        /**
                         * Returns the raw JSON value of [instruction].
                         *
                         * Unlike [instruction], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("instruction")
                        @ExcludeMissing
                        fun _instruction(): JsonField<String> = instruction

                        /**
                         * Returns the raw JSON value of [unit].
                         *
                         * Unlike [unit], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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
                             * [VoiceInstruction].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [VoiceInstruction]. */
                        class Builder internal constructor() {

                            private var distanceAlongGeometry: JsonField<Long> = JsonMissing.of()
                            private var instruction: JsonField<String> = JsonMissing.of()
                            private var unit: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(voiceInstruction: VoiceInstruction) = apply {
                                distanceAlongGeometry = voiceInstruction.distanceAlongGeometry
                                instruction = voiceInstruction.instruction
                                unit = voiceInstruction.unit
                                additionalProperties =
                                    voiceInstruction.additionalProperties.toMutableMap()
                            }

                            fun distanceAlongGeometry(distanceAlongGeometry: Long) =
                                distanceAlongGeometry(JsonField.of(distanceAlongGeometry))

                            /**
                             * Sets [Builder.distanceAlongGeometry] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.distanceAlongGeometry] with a
                             * well-typed [Long] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun distanceAlongGeometry(distanceAlongGeometry: JsonField<Long>) =
                                apply {
                                    this.distanceAlongGeometry = distanceAlongGeometry
                                }

                            /** The guidance instructions for the upcoming `maneuver` */
                            fun instruction(instruction: String) =
                                instruction(JsonField.of(instruction))

                            /**
                             * Sets [Builder.instruction] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.instruction] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun instruction(instruction: JsonField<String>) = apply {
                                this.instruction = instruction
                            }

                            /** Unit of the `distance_along_geometry` metric */
                            fun unit(unit: String) = unit(JsonField.of(unit))

                            /**
                             * Sets [Builder.unit] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.unit] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
                             * Returns an immutable instance of [VoiceInstruction].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): VoiceInstruction =
                                VoiceInstruction(
                                    distanceAlongGeometry,
                                    instruction,
                                    unit,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): VoiceInstruction = apply {
                            if (validated) {
                                return@apply
                            }

                            distanceAlongGeometry()
                            instruction()
                            unit()
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
                            (if (distanceAlongGeometry.asKnown().isPresent) 1 else 0) +
                                (if (instruction.asKnown().isPresent) 1 else 0) +
                                (if (unit.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is VoiceInstruction && distanceAlongGeometry == other.distanceAlongGeometry && instruction == other.instruction && unit == other.unit && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(distanceAlongGeometry, instruction, unit, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "VoiceInstruction{distanceAlongGeometry=$distanceAlongGeometry, instruction=$instruction, unit=$unit, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Maneuver && bearingAfter == other.bearingAfter && bearingBefore == other.bearingBefore && coordinate == other.coordinate && instruction == other.instruction && maneuverType == other.maneuverType && muted == other.muted && roundaboutCount == other.roundaboutCount && voiceInstruction == other.voiceInstruction && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(bearingAfter, bearingBefore, coordinate, instruction, maneuverType, muted, roundaboutCount, voiceInstruction, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Maneuver{bearingAfter=$bearingAfter, bearingBefore=$bearingBefore, coordinate=$coordinate, instruction=$instruction, maneuverType=$maneuverType, muted=$muted, roundaboutCount=$roundaboutCount, voiceInstruction=$voiceInstruction, additionalProperties=$additionalProperties}"
                }

                /** An object containing road shield information. */
                class RoadShieldType
                private constructor(
                    private val imageUrl: JsonField<String>,
                    private val label: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("image_url")
                        @ExcludeMissing
                        imageUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("label")
                        @ExcludeMissing
                        label: JsonField<String> = JsonMissing.of(),
                    ) : this(imageUrl, label, mutableMapOf())

                    /**
                     * The URL to fetch the road shield image.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun imageUrl(): Optional<String> = imageUrl.getOptional("image_url")

                    /**
                     * A label identifying the inscription on the road shield, such as containing
                     * the road number.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun label(): Optional<String> = label.getOptional("label")

                    /**
                     * Returns the raw JSON value of [imageUrl].
                     *
                     * Unlike [imageUrl], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("image_url")
                    @ExcludeMissing
                    fun _imageUrl(): JsonField<String> = imageUrl

                    /**
                     * Returns the raw JSON value of [label].
                     *
                     * Unlike [label], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

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
                         * [RoadShieldType].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [RoadShieldType]. */
                    class Builder internal constructor() {

                        private var imageUrl: JsonField<String> = JsonMissing.of()
                        private var label: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(roadShieldType: RoadShieldType) = apply {
                            imageUrl = roadShieldType.imageUrl
                            label = roadShieldType.label
                            additionalProperties =
                                roadShieldType.additionalProperties.toMutableMap()
                        }

                        /** The URL to fetch the road shield image. */
                        fun imageUrl(imageUrl: String) = imageUrl(JsonField.of(imageUrl))

                        /**
                         * Sets [Builder.imageUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.imageUrl] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun imageUrl(imageUrl: JsonField<String>) = apply {
                            this.imageUrl = imageUrl
                        }

                        /**
                         * A label identifying the inscription on the road shield, such as
                         * containing the road number.
                         */
                        fun label(label: String) = label(JsonField.of(label))

                        /**
                         * Sets [Builder.label] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.label] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun label(label: JsonField<String>) = apply { this.label = label }

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
                         * Returns an immutable instance of [RoadShieldType].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): RoadShieldType =
                            RoadShieldType(imageUrl, label, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): RoadShieldType = apply {
                        if (validated) {
                            return@apply
                        }

                        imageUrl()
                        label()
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
                        (if (imageUrl.asKnown().isPresent) 1 else 0) +
                            (if (label.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is RoadShieldType && imageUrl == other.imageUrl && label == other.label && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(imageUrl, label, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "RoadShieldType{imageUrl=$imageUrl, label=$label, additionalProperties=$additionalProperties}"
                }

                /** Location coordinates of the point where the `step` starts. */
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
                     * Latitude of `start_location` of the `step`.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun latitude(): Optional<Double> = latitude.getOptional("latitude")

                    /**
                     * Longitude of `start_location` of the `step`.
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

                        /** Latitude of `start_location` of the `step`. */
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

                        /** Longitude of `start_location` of the `step`. */
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

                    return /* spotless:off */ other is Step && distance == other.distance && drivingSide == other.drivingSide && duration == other.duration && endLocation == other.endLocation && geojson == other.geojson && geometry == other.geometry && intersections == other.intersections && maneuver == other.maneuver && name == other.name && reference == other.reference && roadShieldType == other.roadShieldType && startLocation == other.startLocation && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(distance, drivingSide, duration, endLocation, geojson, geometry, intersections, maneuver, name, reference, roadShieldType, startLocation, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Step{distance=$distance, drivingSide=$drivingSide, duration=$duration, endLocation=$endLocation, geojson=$geojson, geometry=$geometry, intersections=$intersections, maneuver=$maneuver, name=$name, reference=$reference, roadShieldType=$roadShieldType, startLocation=$startLocation, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Leg && distance == other.distance && duration == other.duration && endLocation == other.endLocation && rawDuration == other.rawDuration && startLocation == other.startLocation && steps == other.steps && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(distance, duration, endLocation, rawDuration, startLocation, steps, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Leg{distance=$distance, duration=$duration, endLocation=$endLocation, rawDuration=$rawDuration, startLocation=$startLocation, steps=$steps, additionalProperties=$additionalProperties}"
        }

        /** Location coordinates of the point where the route starts. */
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
             * Latitude of the`start_location`.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun latitude(): Optional<Double> = latitude.getOptional("latitude")

            /**
             * Longitude of the `start_location`.
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

                /** Latitude of the`start_location`. */
                fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                /**
                 * Sets [Builder.latitude] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latitude] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

                /** Longitude of the `start_location`. */
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

            return /* spotless:off */ other is Route && distance == other.distance && distanceFull == other.distanceFull && duration == other.duration && endLocation == other.endLocation && geojson == other.geojson && geometry == other.geometry && legs == other.legs && predictedDuration == other.predictedDuration && rawDuration == other.rawDuration && specialObjects == other.specialObjects && startLocation == other.startLocation && weight == other.weight && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(distance, distanceFull, duration, endLocation, geojson, geometry, legs, predictedDuration, rawDuration, specialObjects, startLocation, weight, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Route{distance=$distance, distanceFull=$distanceFull, duration=$duration, endLocation=$endLocation, geojson=$geojson, geometry=$geometry, legs=$legs, predictedDuration=$predictedDuration, rawDuration=$rawDuration, specialObjects=$specialObjects, startLocation=$startLocation, weight=$weight, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NavigationRetrieveRouteResponse && msg == other.msg && routes == other.routes && status == other.status && warning == other.warning && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(msg, routes, status, warning, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NavigationRetrieveRouteResponse{msg=$msg, routes=$routes, status=$status, warning=$warning, additionalProperties=$additionalProperties}"
}
