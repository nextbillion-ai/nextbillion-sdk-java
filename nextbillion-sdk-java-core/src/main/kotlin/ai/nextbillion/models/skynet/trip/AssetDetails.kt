// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.trip

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

/** An object with details of the `asset` properties. */
class AssetDetails
private constructor(
    private val id: JsonField<String>,
    private val attributes: JsonValue,
    private val createdAt: JsonField<Long>,
    private val description: JsonField<String>,
    private val deviceId: JsonField<String>,
    private val latestLocation: JsonField<LatestLocation>,
    private val metaData: JsonValue,
    private val name: JsonField<String>,
    private val state: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val trackedAt: JsonField<Long>,
    private val updatedAt: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attributes") @ExcludeMissing attributes: JsonValue = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_id") @ExcludeMissing deviceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("latest_location")
        @ExcludeMissing
        latestLocation: JsonField<LatestLocation> = JsonMissing.of(),
        @JsonProperty("meta_data") @ExcludeMissing metaData: JsonValue = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tracked_at") @ExcludeMissing trackedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        attributes,
        createdAt,
        description,
        deviceId,
        latestLocation,
        metaData,
        name,
        state,
        tags,
        trackedAt,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * ID of the `asset`. This is the same ID that was generated/provided at the time of creating
     * the `asset`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * A string dictionary object containing `attributes` of the `asset`. These `attributes` were
     * associated with the `asset` at the time of creating or updating it.
     *
     * `attributes` can be added to an `asset` using the _Update Asset Attributes_ method.
     */
    @JsonProperty("attributes") @ExcludeMissing fun _attributes(): JsonValue = attributes

    /**
     * A UNIX epoch timestamp in seconds representing the time at which the `asset` was created.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun createdAt(): Optional<Long> = createdAt.getOptional("created_at")

    /**
     * Description of the `asset`. The value would be the same as that provided for the
     * `description` parameter at the time of creating or updating the `asset`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * ID of the `device` that is linked to this asset. Please note that there can be multiple
     * `device_id` linked to a single `asset`. An empty response is returned if no devices are
     * linked to the `asset`.
     *
     * User can link a device to an `asset` using the _Bind Asset to Device_ method.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun deviceId(): Optional<String> = deviceId.getOptional("device_id")

    /**
     * An object with details of the last tracked location of the asset.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun latestLocation(): Optional<LatestLocation> = latestLocation.getOptional("latest_location")

    /** Any valid json object data. Can be used to save customized data. Max size is 65kb. */
    @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonValue = metaData

    /**
     * Name of the `asset`. The value would be the same as that provided for the `name` parameter at
     * the time of creating or updating the `asset`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * State of the asset. It will be "active" when the asset is in use or available for use, and it
     * will be "deleted" in case the asset has been deleted.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * **This parameter will be deprecated soon! Please move existing `tags` to `attributes`
     * parameter.**
     *
     * Tags of the asset. These were associated with the `asset` when it was created or updated.
     * `tags` can be used for filtering assets in operations like _Get Asset List_ and asset
     * **Search** methods. They can also be used for monitoring of assets using **Monitor** methods
     * after linking `tags` and `asset`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * A UNIX epoch timestamp in seconds representing the last time when the `asset` was tracked.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun trackedAt(): Optional<Long> = trackedAt.getOptional("tracked_at")

    /**
     * A UNIX epoch timestamp in seconds representing the time at which the `asset` was last
     * updated.
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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [deviceId].
     *
     * Unlike [deviceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device_id") @ExcludeMissing fun _deviceId(): JsonField<String> = deviceId

    /**
     * Returns the raw JSON value of [latestLocation].
     *
     * Unlike [latestLocation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latest_location")
    @ExcludeMissing
    fun _latestLocation(): JsonField<LatestLocation> = latestLocation

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [trackedAt].
     *
     * Unlike [trackedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tracked_at") @ExcludeMissing fun _trackedAt(): JsonField<Long> = trackedAt

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

        /** Returns a mutable builder for constructing an instance of [AssetDetails]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssetDetails]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var attributes: JsonValue = JsonMissing.of()
        private var createdAt: JsonField<Long> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var deviceId: JsonField<String> = JsonMissing.of()
        private var latestLocation: JsonField<LatestLocation> = JsonMissing.of()
        private var metaData: JsonValue = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var trackedAt: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(assetDetails: AssetDetails) = apply {
            id = assetDetails.id
            attributes = assetDetails.attributes
            createdAt = assetDetails.createdAt
            description = assetDetails.description
            deviceId = assetDetails.deviceId
            latestLocation = assetDetails.latestLocation
            metaData = assetDetails.metaData
            name = assetDetails.name
            state = assetDetails.state
            tags = assetDetails.tags.map { it.toMutableList() }
            trackedAt = assetDetails.trackedAt
            updatedAt = assetDetails.updatedAt
            additionalProperties = assetDetails.additionalProperties.toMutableMap()
        }

        /**
         * ID of the `asset`. This is the same ID that was generated/provided at the time of
         * creating the `asset`.
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * A string dictionary object containing `attributes` of the `asset`. These `attributes`
         * were associated with the `asset` at the time of creating or updating it.
         *
         * `attributes` can be added to an `asset` using the _Update Asset Attributes_ method.
         */
        fun attributes(attributes: JsonValue) = apply { this.attributes = attributes }

        /**
         * A UNIX epoch timestamp in seconds representing the time at which the `asset` was created.
         */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /**
         * Description of the `asset`. The value would be the same as that provided for the
         * `description` parameter at the time of creating or updating the `asset`.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * ID of the `device` that is linked to this asset. Please note that there can be multiple
         * `device_id` linked to a single `asset`. An empty response is returned if no devices are
         * linked to the `asset`.
         *
         * User can link a device to an `asset` using the _Bind Asset to Device_ method.
         */
        fun deviceId(deviceId: String) = deviceId(JsonField.of(deviceId))

        /**
         * Sets [Builder.deviceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deviceId(deviceId: JsonField<String>) = apply { this.deviceId = deviceId }

        /** An object with details of the last tracked location of the asset. */
        fun latestLocation(latestLocation: LatestLocation) =
            latestLocation(JsonField.of(latestLocation))

        /**
         * Sets [Builder.latestLocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestLocation] with a well-typed [LatestLocation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun latestLocation(latestLocation: JsonField<LatestLocation>) = apply {
            this.latestLocation = latestLocation
        }

        /** Any valid json object data. Can be used to save customized data. Max size is 65kb. */
        fun metaData(metaData: JsonValue) = apply { this.metaData = metaData }

        /**
         * Name of the `asset`. The value would be the same as that provided for the `name`
         * parameter at the time of creating or updating the `asset`.
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
         * State of the asset. It will be "active" when the asset is in use or available for use,
         * and it will be "deleted" in case the asset has been deleted.
         */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /**
         * **This parameter will be deprecated soon! Please move existing `tags` to `attributes`
         * parameter.**
         *
         * Tags of the asset. These were associated with the `asset` when it was created or updated.
         * `tags` can be used for filtering assets in operations like _Get Asset List_ and asset
         * **Search** methods. They can also be used for monitoring of assets using **Monitor**
         * methods after linking `tags` and `asset`.
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

        /**
         * A UNIX epoch timestamp in seconds representing the last time when the `asset` was
         * tracked.
         */
        fun trackedAt(trackedAt: Long) = trackedAt(JsonField.of(trackedAt))

        /**
         * Sets [Builder.trackedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trackedAt(trackedAt: JsonField<Long>) = apply { this.trackedAt = trackedAt }

        /**
         * A UNIX epoch timestamp in seconds representing the time at which the `asset` was last
         * updated.
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
         * Returns an immutable instance of [AssetDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AssetDetails =
            AssetDetails(
                id,
                attributes,
                createdAt,
                description,
                deviceId,
                latestLocation,
                metaData,
                name,
                state,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                trackedAt,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AssetDetails = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        description()
        deviceId()
        latestLocation().ifPresent { it.validate() }
        name()
        state()
        tags()
        trackedAt()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (deviceId.asKnown().isPresent) 1 else 0) +
            (latestLocation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (trackedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** An object with details of the last tracked location of the asset. */
    class LatestLocation
    private constructor(
        private val accuracy: JsonField<Double>,
        private val altitude: JsonField<Double>,
        private val bearing: JsonField<Double>,
        private val location: JsonField<Location>,
        private val speed: JsonField<Double>,
        private val timestamp: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accuracy")
            @ExcludeMissing
            accuracy: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("altitude")
            @ExcludeMissing
            altitude: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("bearing") @ExcludeMissing bearing: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("location")
            @ExcludeMissing
            location: JsonField<Location> = JsonMissing.of(),
            @JsonProperty("speed") @ExcludeMissing speed: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<Long> = JsonMissing.of(),
        ) : this(accuracy, altitude, bearing, location, speed, timestamp, mutableMapOf())

        /**
         * If available, this property returns the accuracy of the GPS information received at the
         * last tracked location. It is represented as an estimated horizontal accuracy radius, in
         * meters, at the 68th percentile confidence level.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accuracy(): Optional<Double> = accuracy.getOptional("accuracy")

        /**
         * If available in the GPS information, this property returns the altitude of the `asset` at
         * the last tracked location. It is represented as height, in meters, above the WGS84
         * reference ellipsoid.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun altitude(): Optional<Double> = altitude.getOptional("altitude")

        /**
         * If available in the GPS information, this property returns the heading of the `asset`
         * calculated from true north in clockwise direction at the last tracked location. Please
         * note that the bearing is not affected by the device orientation.
         *
         * The bearing will always be in the range of [0, 360).
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun bearing(): Optional<Double> = bearing.getOptional("bearing")

        /**
         * An object with the coordinates of the last tracked location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun location(): Optional<Location> = location.getOptional("location")

        /**
         * If available in the GPS information, this property returns the speed of the `asset`, in
         * meters per second, at the last tracked location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun speed(): Optional<Double> = speed.getOptional("speed")

        /**
         * A UNIX epoch timestamp in milliseconds, representing the time at which the location was
         * tracked.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun timestamp(): Optional<Long> = timestamp.getOptional("timestamp")

        /**
         * Returns the raw JSON value of [accuracy].
         *
         * Unlike [accuracy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accuracy") @ExcludeMissing fun _accuracy(): JsonField<Double> = accuracy

        /**
         * Returns the raw JSON value of [altitude].
         *
         * Unlike [altitude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("altitude") @ExcludeMissing fun _altitude(): JsonField<Double> = altitude

        /**
         * Returns the raw JSON value of [bearing].
         *
         * Unlike [bearing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bearing") @ExcludeMissing fun _bearing(): JsonField<Double> = bearing

        /**
         * Returns the raw JSON value of [location].
         *
         * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<Location> = location

        /**
         * Returns the raw JSON value of [speed].
         *
         * Unlike [speed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("speed") @ExcludeMissing fun _speed(): JsonField<Double> = speed

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<Long> = timestamp

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

            /** Returns a mutable builder for constructing an instance of [LatestLocation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LatestLocation]. */
        class Builder internal constructor() {

            private var accuracy: JsonField<Double> = JsonMissing.of()
            private var altitude: JsonField<Double> = JsonMissing.of()
            private var bearing: JsonField<Double> = JsonMissing.of()
            private var location: JsonField<Location> = JsonMissing.of()
            private var speed: JsonField<Double> = JsonMissing.of()
            private var timestamp: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(latestLocation: LatestLocation) = apply {
                accuracy = latestLocation.accuracy
                altitude = latestLocation.altitude
                bearing = latestLocation.bearing
                location = latestLocation.location
                speed = latestLocation.speed
                timestamp = latestLocation.timestamp
                additionalProperties = latestLocation.additionalProperties.toMutableMap()
            }

            /**
             * If available, this property returns the accuracy of the GPS information received at
             * the last tracked location. It is represented as an estimated horizontal accuracy
             * radius, in meters, at the 68th percentile confidence level.
             */
            fun accuracy(accuracy: Double) = accuracy(JsonField.of(accuracy))

            /**
             * Sets [Builder.accuracy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accuracy] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accuracy(accuracy: JsonField<Double>) = apply { this.accuracy = accuracy }

            /**
             * If available in the GPS information, this property returns the altitude of the
             * `asset` at the last tracked location. It is represented as height, in meters, above
             * the WGS84 reference ellipsoid.
             */
            fun altitude(altitude: Double) = altitude(JsonField.of(altitude))

            /**
             * Sets [Builder.altitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altitude] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun altitude(altitude: JsonField<Double>) = apply { this.altitude = altitude }

            /**
             * If available in the GPS information, this property returns the heading of the `asset`
             * calculated from true north in clockwise direction at the last tracked location.
             * Please note that the bearing is not affected by the device orientation.
             *
             * The bearing will always be in the range of [0, 360).
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

            /** An object with the coordinates of the last tracked location. */
            fun location(location: Location) = location(JsonField.of(location))

            /**
             * Sets [Builder.location] to an arbitrary JSON value.
             *
             * You should usually call [Builder.location] with a well-typed [Location] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun location(location: JsonField<Location>) = apply { this.location = location }

            /**
             * If available in the GPS information, this property returns the speed of the `asset`,
             * in meters per second, at the last tracked location.
             */
            fun speed(speed: Double) = speed(JsonField.of(speed))

            /**
             * Sets [Builder.speed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.speed] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun speed(speed: JsonField<Double>) = apply { this.speed = speed }

            /**
             * A UNIX epoch timestamp in milliseconds, representing the time at which the location
             * was tracked.
             */
            fun timestamp(timestamp: Long) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<Long>) = apply { this.timestamp = timestamp }

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
             * Returns an immutable instance of [LatestLocation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LatestLocation =
                LatestLocation(
                    accuracy,
                    altitude,
                    bearing,
                    location,
                    speed,
                    timestamp,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LatestLocation = apply {
            if (validated) {
                return@apply
            }

            accuracy()
            altitude()
            bearing()
            location().ifPresent { it.validate() }
            speed()
            timestamp()
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
            (if (accuracy.asKnown().isPresent) 1 else 0) +
                (if (altitude.asKnown().isPresent) 1 else 0) +
                (if (bearing.asKnown().isPresent) 1 else 0) +
                (location.asKnown().getOrNull()?.validity() ?: 0) +
                (if (speed.asKnown().isPresent) 1 else 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0)

        /** An object with the coordinates of the last tracked location. */
        class Location
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
             * Latitude of the tracked location of the `asset`.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lat(): Optional<Double> = lat.getOptional("lat")

            /**
             * Longitude of the tracked location of the `asset`.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
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

                /** Returns a mutable builder for constructing an instance of [Location]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Location]. */
            class Builder internal constructor() {

                private var lat: JsonField<Double> = JsonMissing.of()
                private var lon: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(location: Location) = apply {
                    lat = location.lat
                    lon = location.lon
                    additionalProperties = location.additionalProperties.toMutableMap()
                }

                /** Latitude of the tracked location of the `asset`. */
                fun lat(lat: Double) = lat(JsonField.of(lat))

                /**
                 * Sets [Builder.lat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lat] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                /** Longitude of the tracked location of the `asset`. */
                fun lon(lon: Double) = lon(JsonField.of(lon))

                /**
                 * Sets [Builder.lon] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lon] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

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
                fun build(): Location = Location(lat, lon, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Location = apply {
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

                return /* spotless:off */ other is Location && lat == other.lat && lon == other.lon && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(lat, lon, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Location{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LatestLocation && accuracy == other.accuracy && altitude == other.altitude && bearing == other.bearing && location == other.location && speed == other.speed && timestamp == other.timestamp && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accuracy, altitude, bearing, location, speed, timestamp, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LatestLocation{accuracy=$accuracy, altitude=$altitude, bearing=$bearing, location=$location, speed=$speed, timestamp=$timestamp, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AssetDetails && id == other.id && attributes == other.attributes && createdAt == other.createdAt && description == other.description && deviceId == other.deviceId && latestLocation == other.latestLocation && metaData == other.metaData && name == other.name && state == other.state && tags == other.tags && trackedAt == other.trackedAt && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, attributes, createdAt, description, deviceId, latestLocation, metaData, name, state, tags, trackedAt, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AssetDetails{id=$id, attributes=$attributes, createdAt=$createdAt, description=$description, deviceId=$deviceId, latestLocation=$latestLocation, metaData=$metaData, name=$name, state=$state, tags=$tags, trackedAt=$trackedAt, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
