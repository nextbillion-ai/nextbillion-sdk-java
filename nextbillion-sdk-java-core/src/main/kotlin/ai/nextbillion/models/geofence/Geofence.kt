// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence

import ai.nextbillion.core.Enum
import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.checkKnown
import ai.nextbillion.core.toImmutable
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import ai.nextbillion.models.geofence.console.PolygonGeojson
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** An object with details of the geofence. */
class Geofence
private constructor(
    private val id: JsonField<String>,
    private val circleCenter: JsonField<CircleCenter>,
    private val circleRadius: JsonField<Double>,
    private val createdAt: JsonField<Long>,
    private val geojson: JsonField<PolygonGeojson>,
    private val icContoursMeter: JsonField<Long>,
    private val icContoursMinute: JsonField<Long>,
    private val icCoordinates: JsonField<String>,
    private val icDenoise: JsonField<Double>,
    private val icDepartureTime: JsonField<Long>,
    private val icMode: JsonField<Double>,
    private val metaData: JsonValue,
    private val name: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("circle_center")
        @ExcludeMissing
        circleCenter: JsonField<CircleCenter> = JsonMissing.of(),
        @JsonProperty("circle_radius")
        @ExcludeMissing
        circleRadius: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("geojson")
        @ExcludeMissing
        geojson: JsonField<PolygonGeojson> = JsonMissing.of(),
        @JsonProperty("ic_contours_meter")
        @ExcludeMissing
        icContoursMeter: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ic_contours_minute")
        @ExcludeMissing
        icContoursMinute: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ic_coordinates")
        @ExcludeMissing
        icCoordinates: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ic_denoise") @ExcludeMissing icDenoise: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ic_departure_time")
        @ExcludeMissing
        icDepartureTime: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("ic_mode") @ExcludeMissing icMode: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("meta_data") @ExcludeMissing metaData: JsonValue = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        circleCenter,
        circleRadius,
        createdAt,
        geojson,
        icContoursMeter,
        icContoursMinute,
        icCoordinates,
        icDenoise,
        icDepartureTime,
        icMode,
        metaData,
        name,
        tags,
        type,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * ID of the geofence provided/generated at the time of creating the geofence.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun circleCenter(): Optional<CircleCenter> = circleCenter.getOptional("circle_center")

    /**
     * When the type of the geofence is circle, this property returns the radius of the geofence in
     * meters (m).
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun circleRadius(): Optional<Double> = circleRadius.getOptional("circle_radius")

    /**
     * Time at which the geofence was created, expressed as a UNIX timestamp in seconds.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun createdAt(): Optional<Long> = createdAt.getOptional("created_at")

    /**
     * An object with geoJSON details of the geofence. The contents of this object follow the
     * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun geojson(): Optional<PolygonGeojson> = geojson.getOptional("geojson")

    /**
     * For a geofence based on isochrone contour determined using a specific driving distance, this
     * property returns the duration value, in meters.
     *
     * The value would be the same as that provided for the contours_meter parameter at the time of
     * creating or updating the geofence.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun icContoursMeter(): Optional<Long> = icContoursMeter.getOptional("ic_contours_meter")

    /**
     * For a geofence based on isochrone contour determined using a specific driving duration, this
     * property returns the duration value, in minutes. The value would be the same as the value
     * provided for the contours_minute parameter at the time of creating or updating the geofence.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun icContoursMinute(): Optional<Long> = icContoursMinute.getOptional("ic_contours_minute")

    /**
     * For a geofence based on isochrone contour, this property returns the coordinates of the
     * location, in [latitude,longitude] format, which was used as the starting point to identify
     * the geofence boundary.
     *
     * The value would be the same as that provided for the coordinates parameter at the time of
     * creating or updating the geofence.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun icCoordinates(): Optional<String> = icCoordinates.getOptional("ic_coordinates")

    /**
     * For a geofence based on isochrone contour, this property returns the denoise value which
     * would be the same as that provided for the denoise parameter at the time of creating or
     * updating the geofence.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun icDenoise(): Optional<Double> = icDenoise.getOptional("ic_denoise")

    /**
     * For a geofence based on isochrone contour, this property returns the departure time, as a
     * UNIX epoch timestamp in seconds, which was used to determine the geofence boundary after
     * taking into account the traffic conditions at the time.
     *
     * The value would be the same as that provided for the departure_time parameter at the time of
     * creating or updating the geofence.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun icDepartureTime(): Optional<Long> = icDepartureTime.getOptional("ic_departure_time")

    /**
     * For a geofence based on isochrone contour, this property returns the driving mode used to
     * determine the geofence boundary.
     *
     * The value would be the same as that provided for the mode parameter at the time of creating
     * or updating the geofence.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun icMode(): Optional<Double> = icMode.getOptional("ic_mode")

    /** Metadata of the geofence added at the time of creating or updating it. */
    @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonValue = metaData

    /**
     * Name of the geofence added at the time of creating or updating it.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * An array of strings representing the tags associated with the geofence added at the time of
     * creating or updating it.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Type of the geofence.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Time at which the geofence was last updated, expressed as a UNIX timestamp in seconds.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<Long> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [circleCenter].
     *
     * Unlike [circleCenter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("circle_center")
    @ExcludeMissing
    fun _circleCenter(): JsonField<CircleCenter> = circleCenter

    /**
     * Returns the raw JSON value of [circleRadius].
     *
     * Unlike [circleRadius], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("circle_radius")
    @ExcludeMissing
    fun _circleRadius(): JsonField<Double> = circleRadius

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [geojson].
     *
     * Unlike [geojson], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geojson") @ExcludeMissing fun _geojson(): JsonField<PolygonGeojson> = geojson

    /**
     * Returns the raw JSON value of [icContoursMeter].
     *
     * Unlike [icContoursMeter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ic_contours_meter")
    @ExcludeMissing
    fun _icContoursMeter(): JsonField<Long> = icContoursMeter

    /**
     * Returns the raw JSON value of [icContoursMinute].
     *
     * Unlike [icContoursMinute], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ic_contours_minute")
    @ExcludeMissing
    fun _icContoursMinute(): JsonField<Long> = icContoursMinute

    /**
     * Returns the raw JSON value of [icCoordinates].
     *
     * Unlike [icCoordinates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ic_coordinates")
    @ExcludeMissing
    fun _icCoordinates(): JsonField<String> = icCoordinates

    /**
     * Returns the raw JSON value of [icDenoise].
     *
     * Unlike [icDenoise], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ic_denoise") @ExcludeMissing fun _icDenoise(): JsonField<Double> = icDenoise

    /**
     * Returns the raw JSON value of [icDepartureTime].
     *
     * Unlike [icDepartureTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ic_departure_time")
    @ExcludeMissing
    fun _icDepartureTime(): JsonField<Long> = icDepartureTime

    /**
     * Returns the raw JSON value of [icMode].
     *
     * Unlike [icMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ic_mode") @ExcludeMissing fun _icMode(): JsonField<Double> = icMode

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<Long> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [Geofence]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Geofence]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var circleCenter: JsonField<CircleCenter> = JsonMissing.of()
        private var circleRadius: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<Long> = JsonMissing.of()
        private var geojson: JsonField<PolygonGeojson> = JsonMissing.of()
        private var icContoursMeter: JsonField<Long> = JsonMissing.of()
        private var icContoursMinute: JsonField<Long> = JsonMissing.of()
        private var icCoordinates: JsonField<String> = JsonMissing.of()
        private var icDenoise: JsonField<Double> = JsonMissing.of()
        private var icDepartureTime: JsonField<Long> = JsonMissing.of()
        private var icMode: JsonField<Double> = JsonMissing.of()
        private var metaData: JsonValue = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var type: JsonField<Type> = JsonMissing.of()
        private var updatedAt: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(geofence: Geofence) = apply {
            id = geofence.id
            circleCenter = geofence.circleCenter
            circleRadius = geofence.circleRadius
            createdAt = geofence.createdAt
            geojson = geofence.geojson
            icContoursMeter = geofence.icContoursMeter
            icContoursMinute = geofence.icContoursMinute
            icCoordinates = geofence.icCoordinates
            icDenoise = geofence.icDenoise
            icDepartureTime = geofence.icDepartureTime
            icMode = geofence.icMode
            metaData = geofence.metaData
            name = geofence.name
            tags = geofence.tags.map { it.toMutableList() }
            type = geofence.type
            updatedAt = geofence.updatedAt
            additionalProperties = geofence.additionalProperties.toMutableMap()
        }

        /** ID of the geofence provided/generated at the time of creating the geofence. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun circleCenter(circleCenter: CircleCenter) = circleCenter(JsonField.of(circleCenter))

        /**
         * Sets [Builder.circleCenter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.circleCenter] with a well-typed [CircleCenter] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun circleCenter(circleCenter: JsonField<CircleCenter>) = apply {
            this.circleCenter = circleCenter
        }

        /**
         * When the type of the geofence is circle, this property returns the radius of the geofence
         * in meters (m).
         */
        fun circleRadius(circleRadius: Double) = circleRadius(JsonField.of(circleRadius))

        /**
         * Sets [Builder.circleRadius] to an arbitrary JSON value.
         *
         * You should usually call [Builder.circleRadius] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun circleRadius(circleRadius: JsonField<Double>) = apply {
            this.circleRadius = circleRadius
        }

        /** Time at which the geofence was created, expressed as a UNIX timestamp in seconds. */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /**
         * An object with geoJSON details of the geofence. The contents of this object follow the
         * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
         */
        fun geojson(geojson: PolygonGeojson) = geojson(JsonField.of(geojson))

        /**
         * Sets [Builder.geojson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geojson] with a well-typed [PolygonGeojson] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geojson(geojson: JsonField<PolygonGeojson>) = apply { this.geojson = geojson }

        /**
         * For a geofence based on isochrone contour determined using a specific driving distance,
         * this property returns the duration value, in meters.
         *
         * The value would be the same as that provided for the contours_meter parameter at the time
         * of creating or updating the geofence.
         */
        fun icContoursMeter(icContoursMeter: Long) = icContoursMeter(JsonField.of(icContoursMeter))

        /**
         * Sets [Builder.icContoursMeter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.icContoursMeter] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun icContoursMeter(icContoursMeter: JsonField<Long>) = apply {
            this.icContoursMeter = icContoursMeter
        }

        /**
         * For a geofence based on isochrone contour determined using a specific driving duration,
         * this property returns the duration value, in minutes. The value would be the same as the
         * value provided for the contours_minute parameter at the time of creating or updating the
         * geofence.
         */
        fun icContoursMinute(icContoursMinute: Long) =
            icContoursMinute(JsonField.of(icContoursMinute))

        /**
         * Sets [Builder.icContoursMinute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.icContoursMinute] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun icContoursMinute(icContoursMinute: JsonField<Long>) = apply {
            this.icContoursMinute = icContoursMinute
        }

        /**
         * For a geofence based on isochrone contour, this property returns the coordinates of the
         * location, in [latitude,longitude] format, which was used as the starting point to
         * identify the geofence boundary.
         *
         * The value would be the same as that provided for the coordinates parameter at the time of
         * creating or updating the geofence.
         */
        fun icCoordinates(icCoordinates: String) = icCoordinates(JsonField.of(icCoordinates))

        /**
         * Sets [Builder.icCoordinates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.icCoordinates] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun icCoordinates(icCoordinates: JsonField<String>) = apply {
            this.icCoordinates = icCoordinates
        }

        /**
         * For a geofence based on isochrone contour, this property returns the denoise value which
         * would be the same as that provided for the denoise parameter at the time of creating or
         * updating the geofence.
         */
        fun icDenoise(icDenoise: Double) = icDenoise(JsonField.of(icDenoise))

        /**
         * Sets [Builder.icDenoise] to an arbitrary JSON value.
         *
         * You should usually call [Builder.icDenoise] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun icDenoise(icDenoise: JsonField<Double>) = apply { this.icDenoise = icDenoise }

        /**
         * For a geofence based on isochrone contour, this property returns the departure time, as a
         * UNIX epoch timestamp in seconds, which was used to determine the geofence boundary after
         * taking into account the traffic conditions at the time.
         *
         * The value would be the same as that provided for the departure_time parameter at the time
         * of creating or updating the geofence.
         */
        fun icDepartureTime(icDepartureTime: Long) = icDepartureTime(JsonField.of(icDepartureTime))

        /**
         * Sets [Builder.icDepartureTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.icDepartureTime] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun icDepartureTime(icDepartureTime: JsonField<Long>) = apply {
            this.icDepartureTime = icDepartureTime
        }

        /**
         * For a geofence based on isochrone contour, this property returns the driving mode used to
         * determine the geofence boundary.
         *
         * The value would be the same as that provided for the mode parameter at the time of
         * creating or updating the geofence.
         */
        fun icMode(icMode: Double) = icMode(JsonField.of(icMode))

        /**
         * Sets [Builder.icMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.icMode] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun icMode(icMode: JsonField<Double>) = apply { this.icMode = icMode }

        /** Metadata of the geofence added at the time of creating or updating it. */
        fun metaData(metaData: JsonValue) = apply { this.metaData = metaData }

        /** Name of the geofence added at the time of creating or updating it. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * An array of strings representing the tags associated with the geofence added at the time
         * of creating or updating it.
         */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        /** Type of the geofence. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * Time at which the geofence was last updated, expressed as a UNIX timestamp in seconds.
         */
        fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [Geofence].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Geofence =
            Geofence(
                id,
                circleCenter,
                circleRadius,
                createdAt,
                geojson,
                icContoursMeter,
                icContoursMinute,
                icCoordinates,
                icDenoise,
                icDepartureTime,
                icMode,
                metaData,
                name,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                type,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Geofence = apply {
        if (validated) {
            return@apply
        }

        id()
        circleCenter().ifPresent { it.validate() }
        circleRadius()
        createdAt()
        geojson().ifPresent { it.validate() }
        icContoursMeter()
        icContoursMinute()
        icCoordinates()
        icDenoise()
        icDepartureTime()
        icMode()
        name()
        tags()
        type().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (circleCenter.asKnown().getOrNull()?.validity() ?: 0) +
            (if (circleRadius.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (geojson.asKnown().getOrNull()?.validity() ?: 0) +
            (if (icContoursMeter.asKnown().isPresent) 1 else 0) +
            (if (icContoursMinute.asKnown().isPresent) 1 else 0) +
            (if (icCoordinates.asKnown().isPresent) 1 else 0) +
            (if (icDenoise.asKnown().isPresent) 1 else 0) +
            (if (icDepartureTime.asKnown().isPresent) 1 else 0) +
            (if (icMode.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class CircleCenter
    private constructor(
        private val lat: JsonField<Double>,
        private val lon: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
        ) : this(lat, lon, mutableMapOf())

        /**
         * Latitude of the location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lat(): Optional<Double> = lat.getOptional("lat")

        /**
         * Longitude of the location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lon(): Optional<Double> = lon.getOptional("lon")

        /**
         * Returns the raw JSON value of [lat].
         *
         * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

        /**
         * Returns the raw JSON value of [lon].
         *
         * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

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

            /** Returns a mutable builder for constructing an instance of [CircleCenter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CircleCenter]. */
        class Builder internal constructor() {

            private var lat: JsonField<Double> = JsonMissing.of()
            private var lon: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(circleCenter: CircleCenter) = apply {
                lat = circleCenter.lat
                lon = circleCenter.lon
                additionalProperties = circleCenter.additionalProperties.toMutableMap()
            }

            /** Latitude of the location. */
            fun lat(lat: Double) = lat(JsonField.of(lat))

            /**
             * Sets [Builder.lat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

            /** Longitude of the location. */
            fun lon(lon: Double) = lon(JsonField.of(lon))

            /**
             * Sets [Builder.lon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lon] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

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
             * Returns an immutable instance of [CircleCenter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CircleCenter = CircleCenter(lat, lon, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): CircleCenter = apply {
            if (validated) {
                return@apply
            }

            lat()
            lon()
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
            (if (lat.asKnown().isPresent) 1 else 0) + (if (lon.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CircleCenter && lat == other.lat && lon == other.lon && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(lat, lon, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CircleCenter{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
    }

    /** Type of the geofence. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CIRCLE = of("circle")

            @JvmField val POLYGON = of("polygon")

            @JvmField val ISOCHRONE = of("isochrone")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CIRCLE,
            POLYGON,
            ISOCHRONE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CIRCLE,
            POLYGON,
            ISOCHRONE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CIRCLE -> Value.CIRCLE
                POLYGON -> Value.POLYGON
                ISOCHRONE -> Value.ISOCHRONE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws NextbillionSdkInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                CIRCLE -> Known.CIRCLE
                POLYGON -> Known.POLYGON
                ISOCHRONE -> Known.ISOCHRONE
                else -> throw NextbillionSdkInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws NextbillionSdkInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
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

        return /* spotless:off */ other is Geofence && id == other.id && circleCenter == other.circleCenter && circleRadius == other.circleRadius && createdAt == other.createdAt && geojson == other.geojson && icContoursMeter == other.icContoursMeter && icContoursMinute == other.icContoursMinute && icCoordinates == other.icCoordinates && icDenoise == other.icDenoise && icDepartureTime == other.icDepartureTime && icMode == other.icMode && metaData == other.metaData && name == other.name && tags == other.tags && type == other.type && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, circleCenter, circleRadius, createdAt, geojson, icContoursMeter, icContoursMinute, icCoordinates, icDenoise, icDepartureTime, icMode, metaData, name, tags, type, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Geofence{id=$id, circleCenter=$circleCenter, circleRadius=$circleRadius, createdAt=$createdAt, geojson=$geojson, icContoursMeter=$icContoursMeter, icContoursMinute=$icContoursMinute, icCoordinates=$icCoordinates, icDenoise=$icDenoise, icDepartureTime=$icDepartureTime, icMode=$icMode, metaData=$metaData, name=$name, tags=$tags, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
