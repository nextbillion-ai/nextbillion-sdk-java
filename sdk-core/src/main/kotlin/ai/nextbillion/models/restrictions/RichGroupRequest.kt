// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.restrictions

import ai.nextbillion.core.Enum
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

class RichGroupRequest
private constructor(
    private val area: JsonField<String>,
    private val name: JsonField<String>,
    private val comment: JsonField<String>,
    private val direction: JsonField<Direction>,
    private val endTime: JsonField<Double>,
    private val geofence: JsonField<List<List<Double>>>,
    private val height: JsonField<Long>,
    private val length: JsonField<Long>,
    private val mode: JsonField<List<Mode>>,
    private val repeatOn: JsonField<String>,
    private val segments: JsonField<List<Segment>>,
    private val speed: JsonField<Double>,
    private val speedLimit: JsonField<Double>,
    private val startTime: JsonField<Double>,
    private val tracks: JsonField<List<List<Double>>>,
    private val turns: JsonField<List<Turn>>,
    private val weight: JsonField<Long>,
    private val width: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("area") @ExcludeMissing area: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("end_time") @ExcludeMissing endTime: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("geofence")
        @ExcludeMissing
        geofence: JsonField<List<List<Double>>> = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("length") @ExcludeMissing length: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<List<Mode>> = JsonMissing.of(),
        @JsonProperty("repeat_on") @ExcludeMissing repeatOn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("segments")
        @ExcludeMissing
        segments: JsonField<List<Segment>> = JsonMissing.of(),
        @JsonProperty("speed") @ExcludeMissing speed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("speed_limit")
        @ExcludeMissing
        speedLimit: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("start_time") @ExcludeMissing startTime: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tracks")
        @ExcludeMissing
        tracks: JsonField<List<List<Double>>> = JsonMissing.of(),
        @JsonProperty("turns") @ExcludeMissing turns: JsonField<List<Turn>> = JsonMissing.of(),
        @JsonProperty("weight") @ExcludeMissing weight: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Long> = JsonMissing.of(),
    ) : this(
        area,
        name,
        comment,
        direction,
        endTime,
        geofence,
        height,
        length,
        mode,
        repeatOn,
        segments,
        speed,
        speedLimit,
        startTime,
        tracks,
        turns,
        weight,
        width,
        mutableMapOf(),
    )

    /**
     * Specify the area name. It represents a region where restrictions can be applied. This is a
     * custom field and it is recommended for the users to check with
     * [NextBillion.ai](www.nextbillion.ai) support for the right value. Alternatively, users can
     * invoke the _[Areas](#supported-areas)_ method to get a list of available areas for them.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun area(): String = area.getRequired("area")

    /**
     * Specify a custom, descriptive name for the restriction.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Use this parameter to add any custom information about the restriction being created.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun comment(): Optional<String> = comment.getOptional("comment")

    /**
     * Represents the traffic direction on the segments to which the restriction will be applied.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun direction(): Optional<Direction> = direction.getOptional("direction")

    /**
     * Provide a UNIX epoch timestamp in seconds, representing the time when the restriction should
     * cease to be in-effect.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun endTime(): Optional<Double> = endTime.getOptional("end_time")

    /**
     * An array of coordinates denoting the boundary of an area in which the restrictions are to be
     * applied. The format in which coordinates should be listed is defined by the latlon field.
     *
     * Geofences can be used to create all restriction types, except for a turn type restriction.
     * Please note that segments is not required when using geofence to create restrictions.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun geofence(): Optional<List<List<Double>>> = geofence.getOptional("geofence")

    /**
     * Specify the maximum truck height, in centimeter, that will be allowed under the restriction.
     * A value of 0 indicates no limit.
     *
     * Please note this parameter is effective only when restriction_type is truck. At least one of
     * truck parameters - weight, height, width and truck - needs to be provided when restriction
     * type is truck.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun height(): Optional<Long> = height.getOptional("height")

    /**
     * Specify the maximum truck length, in centimeter, that will be allowed under the restriction.
     * A value of 0 indicates no limit.
     *
     * Please note this parameter is effective only when restriction_type is truck. At least one of
     * truck parameters - weight, height, width and truck - needs to be provided when restriction
     * type is truck.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun length(): Optional<Long> = length.getOptional("length")

    /**
     * Provide the driving modes for which the restriction should be effective. If the value is an
     * empty array or if it is not provided then the restriction would be applied for all modes.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun mode(): Optional<List<Mode>> = mode.getOptional("mode")

    /**
     * It represents the days and times when the restriction is in effect. Users can use this
     * property to set recurring or one-time restrictions as per the
     * [given format](https://wiki.openstreetmap.org/wiki/Key:opening_hours) for specifying the
     * recurring schedule of the restriction.
     *
     * Please provided values as per the local time of the region where the restriction is being
     * applied.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun repeatOn(): Optional<String> = repeatOn.getOptional("repeat_on")

    /**
     * An array of objects to collect the details of the segments of a road on which the restriction
     * has to be applied. Each object corresponds to a new segment.
     *
     * Please note that segments is mandatory for all restrtiction_type except turn.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun segments(): Optional<List<Segment>> = segments.getOptional("segments")

    /**
     * Provide the the fixed speed of the segment where the restriction needs to be applied. Please
     * note that this parameter is mandatory when the restrictionType is fixedspeed.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun speed(): Optional<Double> = speed.getOptional("speed")

    /**
     * Provide the the maximum speed of the segment where the restriction needs to be applied.
     * Please note that this parameter is mandatory when the restrictionType is maxspeed.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun speedLimit(): Optional<Double> = speedLimit.getOptional("speed_limit")

    /**
     * Provide a UNIX epoch timestamp in seconds, representing the start time for the restriction to
     * be in-effect.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun startTime(): Optional<Double> = startTime.getOptional("start_time")

    /**
     * Specify a sequence of coordinates (track) where the restriction is to be applied. The
     * coordinates will be snapped to nearest road. Please note when using tracks, segments and
     * turns are not required.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tracks(): Optional<List<List<Double>>> = tracks.getOptional("tracks")

    /**
     * An array of objects to collect the details of the turns of a road on which the restriction
     * has to be applied. Each object corresponds to a new turn.
     *
     * Please note that turns is mandatory for when restrtiction_type=turn.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun turns(): Optional<List<Turn>> = turns.getOptional("turns")

    /**
     * Specify the maximum truck weight, in kilograms, that the restriction will allow. A value of 0
     * indicates no limit.
     *
     * Please note this parameter is effective only when restriction_type is truck. At least one of
     * truck parameters - weight, height, width and truck - needs to be provided for is truck
     * restriction type.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun weight(): Optional<Long> = weight.getOptional("weight")

    /**
     * Specify the maximum truck width, in centimeter, that will be allowed under the restriction. A
     * value of 0 indicates no limit.
     *
     * Please note this parameter is effective only when restriction_type is truck. At least one of
     * truck parameters - weight, height, width and truck - needs to be provided when restriction
     * type is truck.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun width(): Optional<Long> = width.getOptional("width")

    /**
     * Returns the raw JSON value of [area].
     *
     * Unlike [area], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("area") @ExcludeMissing fun _area(): JsonField<String> = area

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [comment].
     *
     * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<Double> = endTime

    /**
     * Returns the raw JSON value of [geofence].
     *
     * Unlike [geofence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geofence")
    @ExcludeMissing
    fun _geofence(): JsonField<List<List<Double>>> = geofence

    /**
     * Returns the raw JSON value of [height].
     *
     * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Long> = height

    /**
     * Returns the raw JSON value of [length].
     *
     * Unlike [length], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Long> = length

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<List<Mode>> = mode

    /**
     * Returns the raw JSON value of [repeatOn].
     *
     * Unlike [repeatOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("repeat_on") @ExcludeMissing fun _repeatOn(): JsonField<String> = repeatOn

    /**
     * Returns the raw JSON value of [segments].
     *
     * Unlike [segments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("segments") @ExcludeMissing fun _segments(): JsonField<List<Segment>> = segments

    /**
     * Returns the raw JSON value of [speed].
     *
     * Unlike [speed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speed") @ExcludeMissing fun _speed(): JsonField<Double> = speed

    /**
     * Returns the raw JSON value of [speedLimit].
     *
     * Unlike [speedLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speed_limit") @ExcludeMissing fun _speedLimit(): JsonField<Double> = speedLimit

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time") @ExcludeMissing fun _startTime(): JsonField<Double> = startTime

    /**
     * Returns the raw JSON value of [tracks].
     *
     * Unlike [tracks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tracks") @ExcludeMissing fun _tracks(): JsonField<List<List<Double>>> = tracks

    /**
     * Returns the raw JSON value of [turns].
     *
     * Unlike [turns], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("turns") @ExcludeMissing fun _turns(): JsonField<List<Turn>> = turns

    /**
     * Returns the raw JSON value of [weight].
     *
     * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Long> = weight

    /**
     * Returns the raw JSON value of [width].
     *
     * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Long> = width

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
         * Returns a mutable builder for constructing an instance of [RichGroupRequest].
         *
         * The following fields are required:
         * ```java
         * .area()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RichGroupRequest]. */
    class Builder internal constructor() {

        private var area: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var comment: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var endTime: JsonField<Double> = JsonMissing.of()
        private var geofence: JsonField<MutableList<List<Double>>>? = null
        private var height: JsonField<Long> = JsonMissing.of()
        private var length: JsonField<Long> = JsonMissing.of()
        private var mode: JsonField<MutableList<Mode>>? = null
        private var repeatOn: JsonField<String> = JsonMissing.of()
        private var segments: JsonField<MutableList<Segment>>? = null
        private var speed: JsonField<Double> = JsonMissing.of()
        private var speedLimit: JsonField<Double> = JsonMissing.of()
        private var startTime: JsonField<Double> = JsonMissing.of()
        private var tracks: JsonField<MutableList<List<Double>>>? = null
        private var turns: JsonField<MutableList<Turn>>? = null
        private var weight: JsonField<Long> = JsonMissing.of()
        private var width: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(richGroupRequest: RichGroupRequest) = apply {
            area = richGroupRequest.area
            name = richGroupRequest.name
            comment = richGroupRequest.comment
            direction = richGroupRequest.direction
            endTime = richGroupRequest.endTime
            geofence = richGroupRequest.geofence.map { it.toMutableList() }
            height = richGroupRequest.height
            length = richGroupRequest.length
            mode = richGroupRequest.mode.map { it.toMutableList() }
            repeatOn = richGroupRequest.repeatOn
            segments = richGroupRequest.segments.map { it.toMutableList() }
            speed = richGroupRequest.speed
            speedLimit = richGroupRequest.speedLimit
            startTime = richGroupRequest.startTime
            tracks = richGroupRequest.tracks.map { it.toMutableList() }
            turns = richGroupRequest.turns.map { it.toMutableList() }
            weight = richGroupRequest.weight
            width = richGroupRequest.width
            additionalProperties = richGroupRequest.additionalProperties.toMutableMap()
        }

        /**
         * Specify the area name. It represents a region where restrictions can be applied. This is
         * a custom field and it is recommended for the users to check with
         * [NextBillion.ai](www.nextbillion.ai) support for the right value. Alternatively, users
         * can invoke the _[Areas](#supported-areas)_ method to get a list of available areas for
         * them.
         */
        fun area(area: String) = area(JsonField.of(area))

        /**
         * Sets [Builder.area] to an arbitrary JSON value.
         *
         * You should usually call [Builder.area] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun area(area: JsonField<String>) = apply { this.area = area }

        /** Specify a custom, descriptive name for the restriction. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Use this parameter to add any custom information about the restriction being created. */
        fun comment(comment: String) = comment(JsonField.of(comment))

        /**
         * Sets [Builder.comment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comment] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comment(comment: JsonField<String>) = apply { this.comment = comment }

        /**
         * Represents the traffic direction on the segments to which the restriction will be
         * applied.
         */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /**
         * Provide a UNIX epoch timestamp in seconds, representing the time when the restriction
         * should cease to be in-effect.
         */
        fun endTime(endTime: Double) = endTime(JsonField.of(endTime))

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endTime(endTime: JsonField<Double>) = apply { this.endTime = endTime }

        /**
         * An array of coordinates denoting the boundary of an area in which the restrictions are to
         * be applied. The format in which coordinates should be listed is defined by the latlon
         * field.
         *
         * Geofences can be used to create all restriction types, except for a turn type
         * restriction. Please note that segments is not required when using geofence to create
         * restrictions.
         */
        fun geofence(geofence: List<List<Double>>) = geofence(JsonField.of(geofence))

        /**
         * Sets [Builder.geofence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geofence] with a well-typed `List<List<Double>>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geofence(geofence: JsonField<List<List<Double>>>) = apply {
            this.geofence = geofence.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<Double>] to [Builder.geofence].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGeofence(geofence: List<Double>) = apply {
            this.geofence =
                (this.geofence ?: JsonField.of(mutableListOf())).also {
                    checkKnown("geofence", it).add(geofence)
                }
        }

        /**
         * Specify the maximum truck height, in centimeter, that will be allowed under the
         * restriction. A value of 0 indicates no limit.
         *
         * Please note this parameter is effective only when restriction_type is truck. At least one
         * of truck parameters - weight, height, width and truck - needs to be provided when
         * restriction type is truck.
         */
        fun height(height: Long) = height(JsonField.of(height))

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Long>) = apply { this.height = height }

        /**
         * Specify the maximum truck length, in centimeter, that will be allowed under the
         * restriction. A value of 0 indicates no limit.
         *
         * Please note this parameter is effective only when restriction_type is truck. At least one
         * of truck parameters - weight, height, width and truck - needs to be provided when
         * restriction type is truck.
         */
        fun length(length: Long) = length(JsonField.of(length))

        /**
         * Sets [Builder.length] to an arbitrary JSON value.
         *
         * You should usually call [Builder.length] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun length(length: JsonField<Long>) = apply { this.length = length }

        /**
         * Provide the driving modes for which the restriction should be effective. If the value is
         * an empty array or if it is not provided then the restriction would be applied for all
         * modes.
         */
        fun mode(mode: List<Mode>) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed `List<Mode>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<List<Mode>>) = apply {
            this.mode = mode.map { it.toMutableList() }
        }

        /**
         * Adds a single [Mode] to [Builder.mode].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMode(mode: Mode) = apply {
            this.mode =
                (this.mode ?: JsonField.of(mutableListOf())).also {
                    checkKnown("mode", it).add(mode)
                }
        }

        /**
         * It represents the days and times when the restriction is in effect. Users can use this
         * property to set recurring or one-time restrictions as per the
         * [given format](https://wiki.openstreetmap.org/wiki/Key:opening_hours) for specifying the
         * recurring schedule of the restriction.
         *
         * Please provided values as per the local time of the region where the restriction is being
         * applied.
         */
        fun repeatOn(repeatOn: String) = repeatOn(JsonField.of(repeatOn))

        /**
         * Sets [Builder.repeatOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repeatOn] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun repeatOn(repeatOn: JsonField<String>) = apply { this.repeatOn = repeatOn }

        /**
         * An array of objects to collect the details of the segments of a road on which the
         * restriction has to be applied. Each object corresponds to a new segment.
         *
         * Please note that segments is mandatory for all restrtiction_type except turn.
         */
        fun segments(segments: List<Segment>) = segments(JsonField.of(segments))

        /**
         * Sets [Builder.segments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segments] with a well-typed `List<Segment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun segments(segments: JsonField<List<Segment>>) = apply {
            this.segments = segments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Segment] to [segments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSegment(segment: Segment) = apply {
            segments =
                (segments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("segments", it).add(segment)
                }
        }

        /**
         * Provide the the fixed speed of the segment where the restriction needs to be applied.
         * Please note that this parameter is mandatory when the restrictionType is fixedspeed.
         */
        fun speed(speed: Double) = speed(JsonField.of(speed))

        /**
         * Sets [Builder.speed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speed] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun speed(speed: JsonField<Double>) = apply { this.speed = speed }

        /**
         * Provide the the maximum speed of the segment where the restriction needs to be applied.
         * Please note that this parameter is mandatory when the restrictionType is maxspeed.
         */
        fun speedLimit(speedLimit: Double) = speedLimit(JsonField.of(speedLimit))

        /**
         * Sets [Builder.speedLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speedLimit] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun speedLimit(speedLimit: JsonField<Double>) = apply { this.speedLimit = speedLimit }

        /**
         * Provide a UNIX epoch timestamp in seconds, representing the start time for the
         * restriction to be in-effect.
         */
        fun startTime(startTime: Double) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startTime(startTime: JsonField<Double>) = apply { this.startTime = startTime }

        /**
         * Specify a sequence of coordinates (track) where the restriction is to be applied. The
         * coordinates will be snapped to nearest road. Please note when using tracks, segments and
         * turns are not required.
         */
        fun tracks(tracks: List<List<Double>>) = tracks(JsonField.of(tracks))

        /**
         * Sets [Builder.tracks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tracks] with a well-typed `List<List<Double>>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tracks(tracks: JsonField<List<List<Double>>>) = apply {
            this.tracks = tracks.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<Double>] to [tracks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTrack(track: List<Double>) = apply {
            tracks =
                (tracks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tracks", it).add(track)
                }
        }

        /**
         * An array of objects to collect the details of the turns of a road on which the
         * restriction has to be applied. Each object corresponds to a new turn.
         *
         * Please note that turns is mandatory for when restrtiction_type=turn.
         */
        fun turns(turns: List<Turn>) = turns(JsonField.of(turns))

        /**
         * Sets [Builder.turns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.turns] with a well-typed `List<Turn>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun turns(turns: JsonField<List<Turn>>) = apply {
            this.turns = turns.map { it.toMutableList() }
        }

        /**
         * Adds a single [Turn] to [turns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTurn(turn: Turn) = apply {
            turns =
                (turns ?: JsonField.of(mutableListOf())).also { checkKnown("turns", it).add(turn) }
        }

        /**
         * Specify the maximum truck weight, in kilograms, that the restriction will allow. A value
         * of 0 indicates no limit.
         *
         * Please note this parameter is effective only when restriction_type is truck. At least one
         * of truck parameters - weight, height, width and truck - needs to be provided for is truck
         * restriction type.
         */
        fun weight(weight: Long) = weight(JsonField.of(weight))

        /**
         * Sets [Builder.weight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weight] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun weight(weight: JsonField<Long>) = apply { this.weight = weight }

        /**
         * Specify the maximum truck width, in centimeter, that will be allowed under the
         * restriction. A value of 0 indicates no limit.
         *
         * Please note this parameter is effective only when restriction_type is truck. At least one
         * of truck parameters - weight, height, width and truck - needs to be provided when
         * restriction type is truck.
         */
        fun width(width: Long) = width(JsonField.of(width))

        /**
         * Sets [Builder.width] to an arbitrary JSON value.
         *
         * You should usually call [Builder.width] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun width(width: JsonField<Long>) = apply { this.width = width }

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
         * Returns an immutable instance of [RichGroupRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .area()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RichGroupRequest =
            RichGroupRequest(
                checkRequired("area", area),
                checkRequired("name", name),
                comment,
                direction,
                endTime,
                (geofence ?: JsonMissing.of()).map { it.toImmutable() },
                height,
                length,
                (mode ?: JsonMissing.of()).map { it.toImmutable() },
                repeatOn,
                (segments ?: JsonMissing.of()).map { it.toImmutable() },
                speed,
                speedLimit,
                startTime,
                (tracks ?: JsonMissing.of()).map { it.toImmutable() },
                (turns ?: JsonMissing.of()).map { it.toImmutable() },
                weight,
                width,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RichGroupRequest = apply {
        if (validated) {
            return@apply
        }

        area()
        name()
        comment()
        direction().ifPresent { it.validate() }
        endTime()
        geofence()
        height()
        length()
        mode().ifPresent { it.forEach { it.validate() } }
        repeatOn()
        segments().ifPresent { it.forEach { it.validate() } }
        speed()
        speedLimit()
        startTime()
        tracks()
        turns().ifPresent { it.forEach { it.validate() } }
        weight()
        width()
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
        (if (area.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (comment.asKnown().isPresent) 1 else 0) +
            (direction.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (geofence.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
            (if (height.asKnown().isPresent) 1 else 0) +
            (if (length.asKnown().isPresent) 1 else 0) +
            (mode.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (repeatOn.asKnown().isPresent) 1 else 0) +
            (segments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (speed.asKnown().isPresent) 1 else 0) +
            (if (speedLimit.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (tracks.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
            (turns.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (weight.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0)

    /**
     * Represents the traffic direction on the segments to which the restriction will be applied.
     */
    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FORWARD = of("forward")

            @JvmField val BACKWARD = of("backward")

            @JvmField val BOTH = of("both")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            FORWARD,
            BACKWARD,
            BOTH,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FORWARD,
            BACKWARD,
            BOTH,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
             */
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
                FORWARD -> Value.FORWARD
                BACKWARD -> Value.BACKWARD
                BOTH -> Value.BOTH
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
                FORWARD -> Known.FORWARD
                BACKWARD -> Known.BACKWARD
                BOTH -> Known.BOTH
                else -> throw NextbillionSdkInvalidDataException("Unknown Direction: $value")
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

        fun validate(): Direction = apply {
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

            return other is Direction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val _0W = of("0w")

            @JvmField val _2W = of("2w")

            @JvmField val _3W = of("3w")

            @JvmField val _4W = of("4w")

            @JvmField val _6W = of("6w")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            _0W,
            _2W,
            _3W,
            _4W,
            _6W,
        }

        /**
         * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _0W,
            _2W,
            _3W,
            _4W,
            _6W,
            /** An enum member indicating that [Mode] was instantiated with an unknown value. */
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
                _0W -> Value._0W
                _2W -> Value._2W
                _3W -> Value._3W
                _4W -> Value._4W
                _6W -> Value._6W
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
                _0W -> Known._0W
                _2W -> Known._2W
                _3W -> Known._3W
                _4W -> Known._4W
                _6W -> Known._6W
                else -> throw NextbillionSdkInvalidDataException("Unknown Mode: $value")
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

        fun validate(): Mode = apply {
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

            return other is Mode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Segment
    private constructor(
        private val from: JsonField<Double>,
        private val to: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("from") @ExcludeMissing from: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<Double> = JsonMissing.of(),
        ) : this(from, to, mutableMapOf())

        /**
         * An integer value representing the ID of the starting node of the segment.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun from(): Optional<Double> = from.getOptional("from")

        /**
         * An integer value representing the ID of the ending node of the segment.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun to(): Optional<Double> = to.getOptional("to")

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<Double> = from

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<Double> = to

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

            /** Returns a mutable builder for constructing an instance of [Segment]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Segment]. */
        class Builder internal constructor() {

            private var from: JsonField<Double> = JsonMissing.of()
            private var to: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(segment: Segment) = apply {
                from = segment.from
                to = segment.to
                additionalProperties = segment.additionalProperties.toMutableMap()
            }

            /** An integer value representing the ID of the starting node of the segment. */
            fun from(from: Double) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<Double>) = apply { this.from = from }

            /** An integer value representing the ID of the ending node of the segment. */
            fun to(to: Double) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<Double>) = apply { this.to = to }

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
             * Returns an immutable instance of [Segment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Segment = Segment(from, to, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Segment = apply {
            if (validated) {
                return@apply
            }

            from()
            to()
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
            (if (from.asKnown().isPresent) 1 else 0) + (if (to.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Segment &&
                from == other.from &&
                to == other.to &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(from, to, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Segment{from=$from, to=$to, additionalProperties=$additionalProperties}"
    }

    class Turn
    private constructor(
        private val from: JsonField<Long>,
        private val to: JsonField<Long>,
        private val via: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("from") @ExcludeMissing from: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("via") @ExcludeMissing via: JsonField<Long> = JsonMissing.of(),
        ) : this(from, to, via, mutableMapOf())

        /**
         * An integer value that represents the ID of the starting node of the turn.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun from(): Optional<Long> = from.getOptional("from")

        /**
         * An integer value that represents the ID of the ending node of the turn.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun to(): Optional<Long> = to.getOptional("to")

        /**
         * An integer value that represents the ID of a node connecting from and to nodes of the
         * turn.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun via(): Optional<Long> = via.getOptional("via")

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<Long> = from

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<Long> = to

        /**
         * Returns the raw JSON value of [via].
         *
         * Unlike [via], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("via") @ExcludeMissing fun _via(): JsonField<Long> = via

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

            /** Returns a mutable builder for constructing an instance of [Turn]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Turn]. */
        class Builder internal constructor() {

            private var from: JsonField<Long> = JsonMissing.of()
            private var to: JsonField<Long> = JsonMissing.of()
            private var via: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(turn: Turn) = apply {
                from = turn.from
                to = turn.to
                via = turn.via
                additionalProperties = turn.additionalProperties.toMutableMap()
            }

            /** An integer value that represents the ID of the starting node of the turn. */
            fun from(from: Long) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<Long>) = apply { this.from = from }

            /** An integer value that represents the ID of the ending node of the turn. */
            fun to(to: Long) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<Long>) = apply { this.to = to }

            /**
             * An integer value that represents the ID of a node connecting from and to nodes of the
             * turn.
             */
            fun via(via: Long) = via(JsonField.of(via))

            /**
             * Sets [Builder.via] to an arbitrary JSON value.
             *
             * You should usually call [Builder.via] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun via(via: JsonField<Long>) = apply { this.via = via }

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
             * Returns an immutable instance of [Turn].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Turn = Turn(from, to, via, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Turn = apply {
            if (validated) {
                return@apply
            }

            from()
            to()
            via()
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
            (if (from.asKnown().isPresent) 1 else 0) +
                (if (to.asKnown().isPresent) 1 else 0) +
                (if (via.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Turn &&
                from == other.from &&
                to == other.to &&
                via == other.via &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(from, to, via, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Turn{from=$from, to=$to, via=$via, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RichGroupRequest &&
            area == other.area &&
            name == other.name &&
            comment == other.comment &&
            direction == other.direction &&
            endTime == other.endTime &&
            geofence == other.geofence &&
            height == other.height &&
            length == other.length &&
            mode == other.mode &&
            repeatOn == other.repeatOn &&
            segments == other.segments &&
            speed == other.speed &&
            speedLimit == other.speedLimit &&
            startTime == other.startTime &&
            tracks == other.tracks &&
            turns == other.turns &&
            weight == other.weight &&
            width == other.width &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            area,
            name,
            comment,
            direction,
            endTime,
            geofence,
            height,
            length,
            mode,
            repeatOn,
            segments,
            speed,
            speedLimit,
            startTime,
            tracks,
            turns,
            weight,
            width,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RichGroupRequest{area=$area, name=$name, comment=$comment, direction=$direction, endTime=$endTime, geofence=$geofence, height=$height, length=$length, mode=$mode, repeatOn=$repeatOn, segments=$segments, speed=$speed, speedLimit=$speedLimit, startTime=$startTime, tracks=$tracks, turns=$turns, weight=$weight, width=$width, additionalProperties=$additionalProperties}"
}
