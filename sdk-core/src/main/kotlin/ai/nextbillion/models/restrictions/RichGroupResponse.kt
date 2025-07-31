// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.restrictions

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RichGroupResponse
private constructor(
    private val id: JsonField<Long>,
    private val area: JsonField<String>,
    private val bbox: JsonValue,
    private val comment: JsonField<String>,
    private val createAt: JsonField<OffsetDateTime>,
    private val direction: JsonField<Direction>,
    private val endTime: JsonField<Double>,
    private val geofence: JsonValue,
    private val highway: JsonField<String>,
    private val mode: JsonField<List<String>>,
    private val name: JsonField<String>,
    private val repeatOn: JsonField<String>,
    private val restrictionType: JsonField<RestrictionType>,
    private val speed: JsonField<Double>,
    private val speedLimit: JsonField<Double>,
    private val startTime: JsonField<Double>,
    private val state: JsonField<State>,
    private val status: JsonField<Status>,
    private val updateAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("area") @ExcludeMissing area: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bbox") @ExcludeMissing bbox: JsonValue = JsonMissing.of(),
        @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("create_at")
        @ExcludeMissing
        createAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("end_time") @ExcludeMissing endTime: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("geofence") @ExcludeMissing geofence: JsonValue = JsonMissing.of(),
        @JsonProperty("highway") @ExcludeMissing highway: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("repeat_on") @ExcludeMissing repeatOn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("restriction_type")
        @ExcludeMissing
        restrictionType: JsonField<RestrictionType> = JsonMissing.of(),
        @JsonProperty("speed") @ExcludeMissing speed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("speed_limit")
        @ExcludeMissing
        speedLimit: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("start_time") @ExcludeMissing startTime: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("update_at")
        @ExcludeMissing
        updateAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        area,
        bbox,
        comment,
        createAt,
        direction,
        endTime,
        geofence,
        highway,
        mode,
        name,
        repeatOn,
        restrictionType,
        speed,
        speedLimit,
        startTime,
        state,
        status,
        updateAt,
        mutableMapOf(),
    )

    /**
     * Returns the unique ID of the restriction. This ID can be used for update, delete, get
     * operations on the restriction using the available API methods.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): Optional<Long> = id.getOptional("id")

    /**
     * Returns the area to which the restriction belongs to.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun area(): Optional<String> = area.getOptional("area")

    /** Returns the details of the bounding box containing the restriction. */
    @JsonProperty("bbox") @ExcludeMissing fun _bbox(): JsonValue = bbox

    /**
     * Returns the comments that were provided for the restriction at the time of creating or
     * updating the request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun comment(): Optional<String> = comment.getOptional("comment")

    /**
     * The timestamp at which the restriction was created.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun createAt(): Optional<OffsetDateTime> = createAt.getOptional("create_at")

    /**
     * Returns the direction of travel on the segments to which the restriction applies.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun direction(): Optional<Direction> = direction.getOptional("direction")

    /**
     * The time when the restriction ceases to be in-effect. It is a UNIX timestamp.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun endTime(): Optional<Double> = endTime.getOptional("end_time")

    /**
     * Returns the list of coordinates representing the area that was used to apply the given
     * restriction. The geofence returned is same as that provided while creating or updating the
     * restriction.
     */
    @JsonProperty("geofence") @ExcludeMissing fun _geofence(): JsonValue = geofence

    /**
     * Returns the highway information on which the restriction applies to. If no highway is
     * impacted by the restriction, then this field is not present in the response.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun highway(): Optional<String> = highway.getOptional("highway")

    /**
     * Returns an array denoting all the traveling modes the restriction applies on.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun mode(): Optional<List<String>> = mode.getOptional("mode")

    /**
     * Returns the name of the restriction. This value is same as that provided at the time of
     * creating or updating the restriction.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Returns the time periods during which this restriction active or repeats on. The time values
     * follow a [given format](https://wiki.openstreetmap.org/wiki/Key:opening_hours).
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun repeatOn(): Optional<String> = repeatOn.getOptional("repeat_on")

    /**
     * Returns the type of restriction. This is the same value as provided when creating or updating
     * the restriction.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun restrictionType(): Optional<RestrictionType> =
        restrictionType.getOptional("restriction_type")

    /**
     * Returns the fixed speed of segments. This field is not present in the response if the
     * restriction type is not fixedspeed
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun speed(): Optional<Double> = speed.getOptional("speed")

    /**
     * Returns the maximum speed of segments. This field is not present in the response if the
     * restriction type is not maxspeed
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun speedLimit(): Optional<Double> = speedLimit.getOptional("speed_limit")

    /**
     * The time when the restriction starts to be in-effect. It is a UNIX timestamp.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun startTime(): Optional<Double> = startTime.getOptional("start_time")

    /**
     * Returns the state of the "restriction" itself - enabled, disabled or deleted. It does not
     * denote if the restriction is actually in effect or not.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun state(): Optional<State> = state.getOptional("state")

    /**
     * Returns the status of the restriction at the time of making the request i.e. whether the
     * restriction is in force or not. It will have one of the following values: active or inactive.
     *
     * Please note that this field can not be directly influenced by the users. It will always be
     * calculated using the start_time, end_time and repeat_on parameters.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * The timestamp at which the restriction was updated.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun updateAt(): Optional<OffsetDateTime> = updateAt.getOptional("update_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [area].
     *
     * Unlike [area], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("area") @ExcludeMissing fun _area(): JsonField<String> = area

    /**
     * Returns the raw JSON value of [comment].
     *
     * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

    /**
     * Returns the raw JSON value of [createAt].
     *
     * Unlike [createAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("create_at") @ExcludeMissing fun _createAt(): JsonField<OffsetDateTime> = createAt

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
     * Returns the raw JSON value of [highway].
     *
     * Unlike [highway], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("highway") @ExcludeMissing fun _highway(): JsonField<String> = highway

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<List<String>> = mode

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [repeatOn].
     *
     * Unlike [repeatOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("repeat_on") @ExcludeMissing fun _repeatOn(): JsonField<String> = repeatOn

    /**
     * Returns the raw JSON value of [restrictionType].
     *
     * Unlike [restrictionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("restriction_type")
    @ExcludeMissing
    fun _restrictionType(): JsonField<RestrictionType> = restrictionType

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
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updateAt].
     *
     * Unlike [updateAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("update_at") @ExcludeMissing fun _updateAt(): JsonField<OffsetDateTime> = updateAt

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

        /** Returns a mutable builder for constructing an instance of [RichGroupResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RichGroupResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<Long> = JsonMissing.of()
        private var area: JsonField<String> = JsonMissing.of()
        private var bbox: JsonValue = JsonMissing.of()
        private var comment: JsonField<String> = JsonMissing.of()
        private var createAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var direction: JsonField<Direction> = JsonMissing.of()
        private var endTime: JsonField<Double> = JsonMissing.of()
        private var geofence: JsonValue = JsonMissing.of()
        private var highway: JsonField<String> = JsonMissing.of()
        private var mode: JsonField<MutableList<String>>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var repeatOn: JsonField<String> = JsonMissing.of()
        private var restrictionType: JsonField<RestrictionType> = JsonMissing.of()
        private var speed: JsonField<Double> = JsonMissing.of()
        private var speedLimit: JsonField<Double> = JsonMissing.of()
        private var startTime: JsonField<Double> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var updateAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(richGroupResponse: RichGroupResponse) = apply {
            id = richGroupResponse.id
            area = richGroupResponse.area
            bbox = richGroupResponse.bbox
            comment = richGroupResponse.comment
            createAt = richGroupResponse.createAt
            direction = richGroupResponse.direction
            endTime = richGroupResponse.endTime
            geofence = richGroupResponse.geofence
            highway = richGroupResponse.highway
            mode = richGroupResponse.mode.map { it.toMutableList() }
            name = richGroupResponse.name
            repeatOn = richGroupResponse.repeatOn
            restrictionType = richGroupResponse.restrictionType
            speed = richGroupResponse.speed
            speedLimit = richGroupResponse.speedLimit
            startTime = richGroupResponse.startTime
            state = richGroupResponse.state
            status = richGroupResponse.status
            updateAt = richGroupResponse.updateAt
            additionalProperties = richGroupResponse.additionalProperties.toMutableMap()
        }

        /**
         * Returns the unique ID of the restriction. This ID can be used for update, delete, get
         * operations on the restriction using the available API methods.
         */
        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        /** Returns the area to which the restriction belongs to. */
        fun area(area: String) = area(JsonField.of(area))

        /**
         * Sets [Builder.area] to an arbitrary JSON value.
         *
         * You should usually call [Builder.area] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun area(area: JsonField<String>) = apply { this.area = area }

        /** Returns the details of the bounding box containing the restriction. */
        fun bbox(bbox: JsonValue) = apply { this.bbox = bbox }

        /**
         * Returns the comments that were provided for the restriction at the time of creating or
         * updating the request.
         */
        fun comment(comment: String) = comment(JsonField.of(comment))

        /**
         * Sets [Builder.comment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comment] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comment(comment: JsonField<String>) = apply { this.comment = comment }

        /** The timestamp at which the restriction was created. */
        fun createAt(createAt: OffsetDateTime) = createAt(JsonField.of(createAt))

        /**
         * Sets [Builder.createAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createAt(createAt: JsonField<OffsetDateTime>) = apply { this.createAt = createAt }

        /** Returns the direction of travel on the segments to which the restriction applies. */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /** The time when the restriction ceases to be in-effect. It is a UNIX timestamp. */
        fun endTime(endTime: Double) = endTime(JsonField.of(endTime))

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endTime(endTime: JsonField<Double>) = apply { this.endTime = endTime }

        /**
         * Returns the list of coordinates representing the area that was used to apply the given
         * restriction. The geofence returned is same as that provided while creating or updating
         * the restriction.
         */
        fun geofence(geofence: JsonValue) = apply { this.geofence = geofence }

        /**
         * Returns the highway information on which the restriction applies to. If no highway is
         * impacted by the restriction, then this field is not present in the response.
         */
        fun highway(highway: String) = highway(JsonField.of(highway))

        /**
         * Sets [Builder.highway] to an arbitrary JSON value.
         *
         * You should usually call [Builder.highway] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun highway(highway: JsonField<String>) = apply { this.highway = highway }

        /** Returns an array denoting all the traveling modes the restriction applies on. */
        fun mode(mode: List<String>) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mode(mode: JsonField<List<String>>) = apply {
            this.mode = mode.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.mode].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMode(mode: String) = apply {
            this.mode =
                (this.mode ?: JsonField.of(mutableListOf())).also {
                    checkKnown("mode", it).add(mode)
                }
        }

        /**
         * Returns the name of the restriction. This value is same as that provided at the time of
         * creating or updating the restriction.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Returns the time periods during which this restriction active or repeats on. The time
         * values follow a [given format](https://wiki.openstreetmap.org/wiki/Key:opening_hours).
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
         * Returns the type of restriction. This is the same value as provided when creating or
         * updating the restriction.
         */
        fun restrictionType(restrictionType: RestrictionType) =
            restrictionType(JsonField.of(restrictionType))

        /**
         * Sets [Builder.restrictionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restrictionType] with a well-typed [RestrictionType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun restrictionType(restrictionType: JsonField<RestrictionType>) = apply {
            this.restrictionType = restrictionType
        }

        /**
         * Returns the fixed speed of segments. This field is not present in the response if the
         * restriction type is not fixedspeed
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
         * Returns the maximum speed of segments. This field is not present in the response if the
         * restriction type is not maxspeed
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

        /** The time when the restriction starts to be in-effect. It is a UNIX timestamp. */
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
         * Returns the state of the "restriction" itself - enabled, disabled or deleted. It does not
         * denote if the restriction is actually in effect or not.
         */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { this.state = state }

        /**
         * Returns the status of the restriction at the time of making the request i.e. whether the
         * restriction is in force or not. It will have one of the following values: active or
         * inactive.
         *
         * Please note that this field can not be directly influenced by the users. It will always
         * be calculated using the start_time, end_time and repeat_on parameters.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The timestamp at which the restriction was updated. */
        fun updateAt(updateAt: OffsetDateTime) = updateAt(JsonField.of(updateAt))

        /**
         * Sets [Builder.updateAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updateAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updateAt(updateAt: JsonField<OffsetDateTime>) = apply { this.updateAt = updateAt }

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
         * Returns an immutable instance of [RichGroupResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RichGroupResponse =
            RichGroupResponse(
                id,
                area,
                bbox,
                comment,
                createAt,
                direction,
                endTime,
                geofence,
                highway,
                (mode ?: JsonMissing.of()).map { it.toImmutable() },
                name,
                repeatOn,
                restrictionType,
                speed,
                speedLimit,
                startTime,
                state,
                status,
                updateAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RichGroupResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        area()
        comment()
        createAt()
        direction().ifPresent { it.validate() }
        endTime()
        highway()
        mode()
        name()
        repeatOn()
        restrictionType().ifPresent { it.validate() }
        speed()
        speedLimit()
        startTime()
        state().ifPresent { it.validate() }
        status().ifPresent { it.validate() }
        updateAt()
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
            (if (area.asKnown().isPresent) 1 else 0) +
            (if (comment.asKnown().isPresent) 1 else 0) +
            (if (createAt.asKnown().isPresent) 1 else 0) +
            (direction.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (highway.asKnown().isPresent) 1 else 0) +
            (mode.asKnown().getOrNull()?.size ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (repeatOn.asKnown().isPresent) 1 else 0) +
            (restrictionType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (speed.asKnown().isPresent) 1 else 0) +
            (if (speedLimit.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updateAt.asKnown().isPresent) 1 else 0)

    /** Returns the direction of travel on the segments to which the restriction applies. */
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

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Returns the type of restriction. This is the same value as provided when creating or updating
     * the restriction.
     */
    class RestrictionType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val CLOSURE = of("closure")

            @JvmField val MAXSPEED = of("maxspeed")

            @JvmField val FIXEDSPEED = of("fixedspeed")

            @JvmField val PARKING = of("parking")

            @JvmField val TURN = of("turn")

            @JvmField val TRUCK = of("truck")

            @JvmStatic fun of(value: String) = RestrictionType(JsonField.of(value))
        }

        /** An enum containing [RestrictionType]'s known values. */
        enum class Known {
            CLOSURE,
            MAXSPEED,
            FIXEDSPEED,
            PARKING,
            TURN,
            TRUCK,
        }

        /**
         * An enum containing [RestrictionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RestrictionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CLOSURE,
            MAXSPEED,
            FIXEDSPEED,
            PARKING,
            TURN,
            TRUCK,
            /**
             * An enum member indicating that [RestrictionType] was instantiated with an unknown
             * value.
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
                CLOSURE -> Value.CLOSURE
                MAXSPEED -> Value.MAXSPEED
                FIXEDSPEED -> Value.FIXEDSPEED
                PARKING -> Value.PARKING
                TURN -> Value.TURN
                TRUCK -> Value.TRUCK
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
                CLOSURE -> Known.CLOSURE
                MAXSPEED -> Known.MAXSPEED
                FIXEDSPEED -> Known.FIXEDSPEED
                PARKING -> Known.PARKING
                TURN -> Known.TURN
                TRUCK -> Known.TRUCK
                else -> throw NextbillionSdkInvalidDataException("Unknown RestrictionType: $value")
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

        fun validate(): RestrictionType = apply {
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

            return /* spotless:off */ other is RestrictionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Returns the state of the "restriction" itself - enabled, disabled or deleted. It does not
     * denote if the restriction is actually in effect or not.
     */
    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ENABLED = of("enabled")

            @JvmField val DISABLED = of("disabled")

            @JvmField val DELETED = of("deleted")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            ENABLED,
            DISABLED,
            DELETED,
        }

        /**
         * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [State] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENABLED,
            DISABLED,
            DELETED,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
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
                ENABLED -> Value.ENABLED
                DISABLED -> Value.DISABLED
                DELETED -> Value.DELETED
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
                ENABLED -> Known.ENABLED
                DISABLED -> Known.DISABLED
                DELETED -> Known.DELETED
                else -> throw NextbillionSdkInvalidDataException("Unknown State: $value")
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

        fun validate(): State = apply {
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

            return /* spotless:off */ other is State && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Returns the status of the restriction at the time of making the request i.e. whether the
     * restriction is in force or not. It will have one of the following values: active or inactive.
     *
     * Please note that this field can not be directly influenced by the users. It will always be
     * calculated using the start_time, end_time and repeat_on parameters.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACTIVE = of("active")

            @JvmField val INACTIVE = of("inactive")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            INACTIVE,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            INACTIVE,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ACTIVE -> Value.ACTIVE
                INACTIVE -> Value.INACTIVE
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
                ACTIVE -> Known.ACTIVE
                INACTIVE -> Known.INACTIVE
                else -> throw NextbillionSdkInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RichGroupResponse && id == other.id && area == other.area && bbox == other.bbox && comment == other.comment && createAt == other.createAt && direction == other.direction && endTime == other.endTime && geofence == other.geofence && highway == other.highway && mode == other.mode && name == other.name && repeatOn == other.repeatOn && restrictionType == other.restrictionType && speed == other.speed && speedLimit == other.speedLimit && startTime == other.startTime && state == other.state && status == other.status && updateAt == other.updateAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, area, bbox, comment, createAt, direction, endTime, geofence, highway, mode, name, repeatOn, restrictionType, speed, speedLimit, startTime, state, status, updateAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RichGroupResponse{id=$id, area=$area, bbox=$bbox, comment=$comment, createAt=$createAt, direction=$direction, endTime=$endTime, geofence=$geofence, highway=$highway, mode=$mode, name=$name, repeatOn=$repeatOn, restrictionType=$restrictionType, speed=$speed, speedLimit=$speedLimit, startTime=$startTime, state=$state, status=$status, updateAt=$updateAt, additionalProperties=$additionalProperties}"
}
