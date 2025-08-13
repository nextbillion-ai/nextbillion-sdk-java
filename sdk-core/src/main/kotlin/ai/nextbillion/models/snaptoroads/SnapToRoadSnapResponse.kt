// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.snaptoroads

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

/** Response Body */
class SnapToRoadSnapResponse
private constructor(
    private val distance: JsonField<Long>,
    private val geojson: JsonField<Geojson>,
    private val geometry: JsonField<List<String>>,
    private val msg: JsonField<String>,
    private val roadInfo: JsonField<RoadInfo>,
    private val snappedPoints: JsonField<List<SnappedPoint>>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("distance") @ExcludeMissing distance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("geojson") @ExcludeMissing geojson: JsonField<Geojson> = JsonMissing.of(),
        @JsonProperty("geometry")
        @ExcludeMissing
        geometry: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("msg") @ExcludeMissing msg: JsonField<String> = JsonMissing.of(),
        @JsonProperty("road_info") @ExcludeMissing roadInfo: JsonField<RoadInfo> = JsonMissing.of(),
        @JsonProperty("snappedPoints")
        @ExcludeMissing
        snappedPoints: JsonField<List<SnappedPoint>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(distance, geojson, geometry, msg, roadInfo, snappedPoints, status, mutableMapOf())

    /**
     * The total distance of the snapped path in meters.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun distance(): Optional<Long> = distance.getOptional("distance")

    /**
     * A GeoJSON object with details of the snapped path. This object is returned when the geometry
     * field is set to geojson in the input request, otherwise it is not present in the response.
     * The contents of this object follow the
     * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun geojson(): Optional<Geojson> = geojson.getOptional("geojson")

    /**
     * An array of strings containing the encoded geometries of snapped paths in polyline or
     * polyline6 format.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun geometry(): Optional<List<String>> = geometry.getOptional("geometry")

    /**
     * Displays the error message in case of a failed request or operation. Please note that this
     * parameter is not returned in the response in case of a successful request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun msg(): Optional<String> = msg.getOptional("msg")

    /**
     * An object containing the maximum speed information for each road segment present in the
     * route.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun roadInfo(): Optional<RoadInfo> = roadInfo.getOptional("road_info")

    /**
     * An array of objects. Each object provides the details of a path coordinate point snapped to
     * the nearest road.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun snappedPoints(): Optional<List<SnappedPoint>> = snappedPoints.getOptional("snappedPoints")

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
     * Returns the raw JSON value of [distance].
     *
     * Unlike [distance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Long> = distance

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
    @JsonProperty("geometry") @ExcludeMissing fun _geometry(): JsonField<List<String>> = geometry

    /**
     * Returns the raw JSON value of [msg].
     *
     * Unlike [msg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msg") @ExcludeMissing fun _msg(): JsonField<String> = msg

    /**
     * Returns the raw JSON value of [roadInfo].
     *
     * Unlike [roadInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("road_info") @ExcludeMissing fun _roadInfo(): JsonField<RoadInfo> = roadInfo

    /**
     * Returns the raw JSON value of [snappedPoints].
     *
     * Unlike [snappedPoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("snappedPoints")
    @ExcludeMissing
    fun _snappedPoints(): JsonField<List<SnappedPoint>> = snappedPoints

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

        /** Returns a mutable builder for constructing an instance of [SnapToRoadSnapResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SnapToRoadSnapResponse]. */
    class Builder internal constructor() {

        private var distance: JsonField<Long> = JsonMissing.of()
        private var geojson: JsonField<Geojson> = JsonMissing.of()
        private var geometry: JsonField<MutableList<String>>? = null
        private var msg: JsonField<String> = JsonMissing.of()
        private var roadInfo: JsonField<RoadInfo> = JsonMissing.of()
        private var snappedPoints: JsonField<MutableList<SnappedPoint>>? = null
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(snapToRoadSnapResponse: SnapToRoadSnapResponse) = apply {
            distance = snapToRoadSnapResponse.distance
            geojson = snapToRoadSnapResponse.geojson
            geometry = snapToRoadSnapResponse.geometry.map { it.toMutableList() }
            msg = snapToRoadSnapResponse.msg
            roadInfo = snapToRoadSnapResponse.roadInfo
            snappedPoints = snapToRoadSnapResponse.snappedPoints.map { it.toMutableList() }
            status = snapToRoadSnapResponse.status
            additionalProperties = snapToRoadSnapResponse.additionalProperties.toMutableMap()
        }

        /** The total distance of the snapped path in meters. */
        fun distance(distance: Long) = distance(JsonField.of(distance))

        /**
         * Sets [Builder.distance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.distance] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun distance(distance: JsonField<Long>) = apply { this.distance = distance }

        /**
         * A GeoJSON object with details of the snapped path. This object is returned when the
         * geometry field is set to geojson in the input request, otherwise it is not present in the
         * response. The contents of this object follow the
         * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
         */
        fun geojson(geojson: Geojson) = geojson(JsonField.of(geojson))

        /**
         * Sets [Builder.geojson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geojson] with a well-typed [Geojson] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun geojson(geojson: JsonField<Geojson>) = apply { this.geojson = geojson }

        /**
         * An array of strings containing the encoded geometries of snapped paths in polyline or
         * polyline6 format.
         */
        fun geometry(geometry: List<String>) = geometry(JsonField.of(geometry))

        /**
         * Sets [Builder.geometry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geometry] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geometry(geometry: JsonField<List<String>>) = apply {
            this.geometry = geometry.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.geometry].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGeometry(geometry: String) = apply {
            this.geometry =
                (this.geometry ?: JsonField.of(mutableListOf())).also {
                    checkKnown("geometry", it).add(geometry)
                }
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
         * An object containing the maximum speed information for each road segment present in the
         * route.
         */
        fun roadInfo(roadInfo: RoadInfo) = roadInfo(JsonField.of(roadInfo))

        /**
         * Sets [Builder.roadInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roadInfo] with a well-typed [RoadInfo] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun roadInfo(roadInfo: JsonField<RoadInfo>) = apply { this.roadInfo = roadInfo }

        /**
         * An array of objects. Each object provides the details of a path coordinate point snapped
         * to the nearest road.
         */
        fun snappedPoints(snappedPoints: List<SnappedPoint>) =
            snappedPoints(JsonField.of(snappedPoints))

        /**
         * Sets [Builder.snappedPoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snappedPoints] with a well-typed `List<SnappedPoint>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun snappedPoints(snappedPoints: JsonField<List<SnappedPoint>>) = apply {
            this.snappedPoints = snappedPoints.map { it.toMutableList() }
        }

        /**
         * Adds a single [SnappedPoint] to [snappedPoints].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSnappedPoint(snappedPoint: SnappedPoint) = apply {
            snappedPoints =
                (snappedPoints ?: JsonField.of(mutableListOf())).also {
                    checkKnown("snappedPoints", it).add(snappedPoint)
                }
        }

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
         * Returns an immutable instance of [SnapToRoadSnapResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SnapToRoadSnapResponse =
            SnapToRoadSnapResponse(
                distance,
                geojson,
                (geometry ?: JsonMissing.of()).map { it.toImmutable() },
                msg,
                roadInfo,
                (snappedPoints ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SnapToRoadSnapResponse = apply {
        if (validated) {
            return@apply
        }

        distance()
        geojson().ifPresent { it.validate() }
        geometry()
        msg()
        roadInfo().ifPresent { it.validate() }
        snappedPoints().ifPresent { it.forEach { it.validate() } }
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
        (if (distance.asKnown().isPresent) 1 else 0) +
            (geojson.asKnown().getOrNull()?.validity() ?: 0) +
            (geometry.asKnown().getOrNull()?.size ?: 0) +
            (if (msg.asKnown().isPresent) 1 else 0) +
            (roadInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (snappedPoints.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    /**
     * A GeoJSON object with details of the snapped path. This object is returned when the geometry
     * field is set to geojson in the input request, otherwise it is not present in the response.
     * The contents of this object follow the
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
         * An object with details of the geoJSON geometry of the snapped path.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geometry(): Optional<Geometry> = geometry.getOptional("geometry")

        /**
         * Properties associated with the geoJSON shape of the snapped path.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun properties(): Optional<String> = properties.getOptional("properties")

        /**
         * Type of the GeoJSON object.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [geometry].
         *
         * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("geometry") @ExcludeMissing fun _geometry(): JsonField<Geometry> = geometry

        /**
         * Returns the raw JSON value of [properties].
         *
         * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
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

            /** An object with details of the geoJSON geometry of the snapped path. */
            fun geometry(geometry: Geometry) = geometry(JsonField.of(geometry))

            /**
             * Sets [Builder.geometry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geometry] with a well-typed [Geometry] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geometry(geometry: JsonField<Geometry>) = apply { this.geometry = geometry }

            /** Properties associated with the geoJSON shape of the snapped path. */
            fun properties(properties: String) = properties(JsonField.of(properties))

            /**
             * Sets [Builder.properties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.properties] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun properties(properties: JsonField<String>) = apply { this.properties = properties }

            /** Type of the GeoJSON object. */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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

        /** An object with details of the geoJSON geometry of the snapped path. */
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
             * An array of coordinates in the [longitude, latitude] format, representing the snapped
             * path geometry.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun coordinates(): Optional<List<Double>> = coordinates.getOptional("coordinates")

            /**
             * Type of the geoJSON geometry
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [coordinates].
             *
             * Unlike [coordinates], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("coordinates")
            @ExcludeMissing
            fun _coordinates(): JsonField<List<Double>> = coordinates

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
                 * snapped path geometry.
                 */
                fun coordinates(coordinates: List<Double>) = coordinates(JsonField.of(coordinates))

                /**
                 * Sets [Builder.coordinates] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.coordinates] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                /** Type of the geoJSON geometry */
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

                return other is Geometry &&
                    coordinates == other.coordinates &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(coordinates, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Geometry{coordinates=$coordinates, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Geojson &&
                geometry == other.geometry &&
                properties == other.properties &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(geometry, properties, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Geojson{geometry=$geometry, properties=$properties, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * An object containing the maximum speed information for each road segment present in the
     * route.
     */
    class RoadInfo
    private constructor(
        private val maxSpeed: JsonField<List<MaxSpeed>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("max_speed")
            @ExcludeMissing
            maxSpeed: JsonField<List<MaxSpeed>> = JsonMissing.of()
        ) : this(maxSpeed, mutableMapOf())

        /**
         * An array of objects containing maximum speed, in kilometers per hour, for each segment of
         * the route. Each object represents one road segment.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxSpeed(): Optional<List<MaxSpeed>> = maxSpeed.getOptional("max_speed")

        /**
         * Returns the raw JSON value of [maxSpeed].
         *
         * Unlike [maxSpeed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_speed")
        @ExcludeMissing
        fun _maxSpeed(): JsonField<List<MaxSpeed>> = maxSpeed

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

            /** Returns a mutable builder for constructing an instance of [RoadInfo]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RoadInfo]. */
        class Builder internal constructor() {

            private var maxSpeed: JsonField<MutableList<MaxSpeed>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(roadInfo: RoadInfo) = apply {
                maxSpeed = roadInfo.maxSpeed.map { it.toMutableList() }
                additionalProperties = roadInfo.additionalProperties.toMutableMap()
            }

            /**
             * An array of objects containing maximum speed, in kilometers per hour, for each
             * segment of the route. Each object represents one road segment.
             */
            fun maxSpeed(maxSpeed: List<MaxSpeed>) = maxSpeed(JsonField.of(maxSpeed))

            /**
             * Sets [Builder.maxSpeed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxSpeed] with a well-typed `List<MaxSpeed>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxSpeed(maxSpeed: JsonField<List<MaxSpeed>>) = apply {
                this.maxSpeed = maxSpeed.map { it.toMutableList() }
            }

            /**
             * Adds a single [MaxSpeed] to [Builder.maxSpeed].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMaxSpeed(maxSpeed: MaxSpeed) = apply {
                this.maxSpeed =
                    (this.maxSpeed ?: JsonField.of(mutableListOf())).also {
                        checkKnown("maxSpeed", it).add(maxSpeed)
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
             * Returns an immutable instance of [RoadInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RoadInfo =
                RoadInfo(
                    (maxSpeed ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RoadInfo = apply {
            if (validated) {
                return@apply
            }

            maxSpeed().ifPresent { it.forEach { it.validate() } }
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
            (maxSpeed.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class MaxSpeed
        private constructor(
            private val length: JsonField<Long>,
            private val offset: JsonField<Long>,
            private val value: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("length") @ExcludeMissing length: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
            ) : this(length, offset, value, mutableMapOf())

            /**
             * length refers to a sequence of 'n' consecutive vertices in the route geometry
             * starting from the offset, forming a continuous section of route where the maximum
             * speed is the same and is indicated in value.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun length(): Optional<Long> = length.getOptional("length")

            /**
             * offset is the index value of the vertex of route geometry, which is the starting
             * point of the segment.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun offset(): Optional<Long> = offset.getOptional("offset")

            /**
             * value denotes the maximum speed of this segment, in kilometers per hour.
             * - A value of "-1" indicates that the speed is unlimited for this road segment.
             * - A value of "0" indicates that there is no information about the maximum speed for
             *   this road segment.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun value(): Optional<Double> = value.getOptional("value")

            /**
             * Returns the raw JSON value of [length].
             *
             * Unlike [length], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Long> = length

            /**
             * Returns the raw JSON value of [offset].
             *
             * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
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

                /** Returns a mutable builder for constructing an instance of [MaxSpeed]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MaxSpeed]. */
            class Builder internal constructor() {

                private var length: JsonField<Long> = JsonMissing.of()
                private var offset: JsonField<Long> = JsonMissing.of()
                private var value: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(maxSpeed: MaxSpeed) = apply {
                    length = maxSpeed.length
                    offset = maxSpeed.offset
                    value = maxSpeed.value
                    additionalProperties = maxSpeed.additionalProperties.toMutableMap()
                }

                /**
                 * length refers to a sequence of 'n' consecutive vertices in the route geometry
                 * starting from the offset, forming a continuous section of route where the maximum
                 * speed is the same and is indicated in value.
                 */
                fun length(length: Long) = length(JsonField.of(length))

                /**
                 * Sets [Builder.length] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.length] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun length(length: JsonField<Long>) = apply { this.length = length }

                /**
                 * offset is the index value of the vertex of route geometry, which is the starting
                 * point of the segment.
                 */
                fun offset(offset: Long) = offset(JsonField.of(offset))

                /**
                 * Sets [Builder.offset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.offset] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

                /**
                 * value denotes the maximum speed of this segment, in kilometers per hour.
                 * - A value of "-1" indicates that the speed is unlimited for this road segment.
                 * - A value of "0" indicates that there is no information about the maximum speed
                 *   for this road segment.
                 */
                fun value(value: Double) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * Returns an immutable instance of [MaxSpeed].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): MaxSpeed =
                    MaxSpeed(length, offset, value, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): MaxSpeed = apply {
                if (validated) {
                    return@apply
                }

                length()
                offset()
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
                (if (length.asKnown().isPresent) 1 else 0) +
                    (if (offset.asKnown().isPresent) 1 else 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MaxSpeed &&
                    length == other.length &&
                    offset == other.offset &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(length, offset, value, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MaxSpeed{length=$length, offset=$offset, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RoadInfo &&
                maxSpeed == other.maxSpeed &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(maxSpeed, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RoadInfo{maxSpeed=$maxSpeed, additionalProperties=$additionalProperties}"
    }

    class SnappedPoint
    private constructor(
        private val bearing: JsonField<Double>,
        private val distance: JsonField<Double>,
        private val location: JsonField<Location>,
        private val name: JsonField<String>,
        private val originalIndex: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bearing") @ExcludeMissing bearing: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("distance")
            @ExcludeMissing
            distance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("location")
            @ExcludeMissing
            location: JsonField<Location> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originalIndex")
            @ExcludeMissing
            originalIndex: JsonField<Long> = JsonMissing.of(),
        ) : this(bearing, distance, location, name, originalIndex, mutableMapOf())

        /**
         * The bearing, calculated as the angle from true north in clockwise direction, of the route
         * leading to the next snapped point from the current snapped_point, in radians. In case of
         * the last snapped_point of the route, the bearing indicates the direction of the route to
         * the previous snapped_location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bearing(): Double = bearing.getRequired("bearing")

        /**
         * The distance of the snapped point from the original input coordinate in meters.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun distance(): Double = distance.getRequired("distance")

        /**
         * The latitude and longitude coordinates of the snapped point.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun location(): Location = location.getRequired("location")

        /**
         * The name of the street or road that the input coordinate snapped to.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The index of the input path coordinate point to which this snapped point corresponds to.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originalIndex(): Long = originalIndex.getRequired("originalIndex")

        /**
         * Returns the raw JSON value of [bearing].
         *
         * Unlike [bearing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bearing") @ExcludeMissing fun _bearing(): JsonField<Double> = bearing

        /**
         * Returns the raw JSON value of [distance].
         *
         * Unlike [distance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Double> = distance

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
         * Returns the raw JSON value of [originalIndex].
         *
         * Unlike [originalIndex], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("originalIndex")
        @ExcludeMissing
        fun _originalIndex(): JsonField<Long> = originalIndex

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
             * Returns a mutable builder for constructing an instance of [SnappedPoint].
             *
             * The following fields are required:
             * ```java
             * .bearing()
             * .distance()
             * .location()
             * .name()
             * .originalIndex()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SnappedPoint]. */
        class Builder internal constructor() {

            private var bearing: JsonField<Double>? = null
            private var distance: JsonField<Double>? = null
            private var location: JsonField<Location>? = null
            private var name: JsonField<String>? = null
            private var originalIndex: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(snappedPoint: SnappedPoint) = apply {
                bearing = snappedPoint.bearing
                distance = snappedPoint.distance
                location = snappedPoint.location
                name = snappedPoint.name
                originalIndex = snappedPoint.originalIndex
                additionalProperties = snappedPoint.additionalProperties.toMutableMap()
            }

            /**
             * The bearing, calculated as the angle from true north in clockwise direction, of the
             * route leading to the next snapped point from the current snapped_point, in radians.
             * In case of the last snapped_point of the route, the bearing indicates the direction
             * of the route to the previous snapped_location.
             */
            fun bearing(bearing: Double) = bearing(JsonField.of(bearing))

            /**
             * Sets [Builder.bearing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bearing] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bearing(bearing: JsonField<Double>) = apply { this.bearing = bearing }

            /** The distance of the snapped point from the original input coordinate in meters. */
            fun distance(distance: Double) = distance(JsonField.of(distance))

            /**
             * Sets [Builder.distance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distance] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

            /** The latitude and longitude coordinates of the snapped point. */
            fun location(location: Location) = location(JsonField.of(location))

            /**
             * Sets [Builder.location] to an arbitrary JSON value.
             *
             * You should usually call [Builder.location] with a well-typed [Location] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun location(location: JsonField<Location>) = apply { this.location = location }

            /** The name of the street or road that the input coordinate snapped to. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The index of the input path coordinate point to which this snapped point corresponds
             * to.
             */
            fun originalIndex(originalIndex: Long) = originalIndex(JsonField.of(originalIndex))

            /**
             * Sets [Builder.originalIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originalIndex] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun originalIndex(originalIndex: JsonField<Long>) = apply {
                this.originalIndex = originalIndex
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
             * Returns an immutable instance of [SnappedPoint].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .bearing()
             * .distance()
             * .location()
             * .name()
             * .originalIndex()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SnappedPoint =
                SnappedPoint(
                    checkRequired("bearing", bearing),
                    checkRequired("distance", distance),
                    checkRequired("location", location),
                    checkRequired("name", name),
                    checkRequired("originalIndex", originalIndex),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SnappedPoint = apply {
            if (validated) {
                return@apply
            }

            bearing()
            distance()
            location().validate()
            name()
            originalIndex()
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
            (if (bearing.asKnown().isPresent) 1 else 0) +
                (if (distance.asKnown().isPresent) 1 else 0) +
                (location.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (originalIndex.asKnown().isPresent) 1 else 0)

        /** The latitude and longitude coordinates of the snapped point. */
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
             * Latitude of the snapped point.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun latitude(): Double = latitude.getRequired("latitude")

            /**
             * Longitude of the snapped point.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun longitude(): Double = longitude.getRequired("longitude")

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

                /**
                 * Returns a mutable builder for constructing an instance of [Location].
                 *
                 * The following fields are required:
                 * ```java
                 * .latitude()
                 * .longitude()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Location]. */
            class Builder internal constructor() {

                private var latitude: JsonField<Double>? = null
                private var longitude: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(location: Location) = apply {
                    latitude = location.latitude
                    longitude = location.longitude
                    additionalProperties = location.additionalProperties.toMutableMap()
                }

                /** Latitude of the snapped point. */
                fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                /**
                 * Sets [Builder.latitude] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latitude] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

                /** Longitude of the snapped point. */
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
                 *
                 * The following fields are required:
                 * ```java
                 * .latitude()
                 * .longitude()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Location =
                    Location(
                        checkRequired("latitude", latitude),
                        checkRequired("longitude", longitude),
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

                return other is Location &&
                    latitude == other.latitude &&
                    longitude == other.longitude &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(latitude, longitude, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Location{latitude=$latitude, longitude=$longitude, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SnappedPoint &&
                bearing == other.bearing &&
                distance == other.distance &&
                location == other.location &&
                name == other.name &&
                originalIndex == other.originalIndex &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(bearing, distance, location, name, originalIndex, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SnappedPoint{bearing=$bearing, distance=$distance, location=$location, name=$name, originalIndex=$originalIndex, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SnapToRoadSnapResponse &&
            distance == other.distance &&
            geojson == other.geojson &&
            geometry == other.geometry &&
            msg == other.msg &&
            roadInfo == other.roadInfo &&
            snappedPoints == other.snappedPoints &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            distance,
            geojson,
            geometry,
            msg,
            roadInfo,
            snappedPoints,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SnapToRoadSnapResponse{distance=$distance, geojson=$geojson, geometry=$geometry, msg=$msg, roadInfo=$roadInfo, snappedPoints=$snappedPoints, status=$status, additionalProperties=$additionalProperties}"
}
