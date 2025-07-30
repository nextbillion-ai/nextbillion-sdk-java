// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.asset.location

import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * An object with details of the tracked location. Please note that if there are no tracking records
 * for an asset, no location data will be returned.
 */
class TrackLocation
private constructor(
    private val accuracy: JsonField<Double>,
    private val altitude: JsonField<Double>,
    private val batteryLevel: JsonField<Long>,
    private val bearing: JsonField<Double>,
    private val location: JsonField<Location>,
    private val metaData: JsonValue,
    private val speed: JsonField<Double>,
    private val timestamp: JsonField<Long>,
    private val trackingMode: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accuracy") @ExcludeMissing accuracy: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("altitude") @ExcludeMissing altitude: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("battery_level")
        @ExcludeMissing
        batteryLevel: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("bearing") @ExcludeMissing bearing: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("location") @ExcludeMissing location: JsonField<Location> = JsonMissing.of(),
        @JsonProperty("meta_data") @ExcludeMissing metaData: JsonValue = JsonMissing.of(),
        @JsonProperty("speed") @ExcludeMissing speed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("tracking_mode")
        @ExcludeMissing
        trackingMode: JsonField<String> = JsonMissing.of(),
    ) : this(
        accuracy,
        altitude,
        batteryLevel,
        bearing,
        location,
        metaData,
        speed,
        timestamp,
        trackingMode,
        mutableMapOf(),
    )

    /**
     * If available, this property returns the accuracy of the GPS information received at the
     * tracked location. It is represented as an estimated horizontal accuracy radius, in meters, at
     * the 68th percentile confidence level.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accuracy(): Optional<Double> = accuracy.getOptional("accuracy")

    /**
     * If available in the GPS information, this property returns the altitude of the asset at the
     * tracked location. It is represented as height, in meters, above the WGS84 reference
     * ellipsoid.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun altitude(): Optional<Double> = altitude.getOptional("altitude")

    /**
     * Returns the battery level of the GPS device, as a percentage, when the location was tracked.
     * It has a minimum value of 0 and a maximum value of 100.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun batteryLevel(): Optional<Long> = batteryLevel.getOptional("battery_level")

    /**
     * If available in the GPS information, this property returns the heading of the asset
     * calculated from true north in clockwise direction at the tracked location. Please note that
     * the bearing is not affected by the device orientation.
     *
     * The bearing will always be in the range of [0, 360).
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun bearing(): Optional<Double> = bearing.getOptional("bearing")

    /**
     * An object with the coordinates of the last tracked location.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun location(): Optional<Location> = location.getOptional("location")

    /**
     * Specifies the custom data about the location that was added when the location was uploaded.
     */
    @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonValue = metaData

    /**
     * If available in the GPS information, this property returns the speed of the asset, in meters
     * per second, at the tracked location.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun speed(): Optional<Double> = speed.getOptional("speed")

    /**
     * A UNIX epoch timestamp in milliseconds, representing the time at which the location was
     * tracked.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun timestamp(): Optional<Long> = timestamp.getOptional("timestamp")

    /**
     * Internal parameter for tracking mode.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun trackingMode(): Optional<String> = trackingMode.getOptional("tracking_mode")

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
     * Returns the raw JSON value of [batteryLevel].
     *
     * Unlike [batteryLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("battery_level")
    @ExcludeMissing
    fun _batteryLevel(): JsonField<Long> = batteryLevel

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

    /**
     * Returns the raw JSON value of [trackingMode].
     *
     * Unlike [trackingMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tracking_mode")
    @ExcludeMissing
    fun _trackingMode(): JsonField<String> = trackingMode

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

        /** Returns a mutable builder for constructing an instance of [TrackLocation]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TrackLocation]. */
    class Builder internal constructor() {

        private var accuracy: JsonField<Double> = JsonMissing.of()
        private var altitude: JsonField<Double> = JsonMissing.of()
        private var batteryLevel: JsonField<Long> = JsonMissing.of()
        private var bearing: JsonField<Double> = JsonMissing.of()
        private var location: JsonField<Location> = JsonMissing.of()
        private var metaData: JsonValue = JsonMissing.of()
        private var speed: JsonField<Double> = JsonMissing.of()
        private var timestamp: JsonField<Long> = JsonMissing.of()
        private var trackingMode: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(trackLocation: TrackLocation) = apply {
            accuracy = trackLocation.accuracy
            altitude = trackLocation.altitude
            batteryLevel = trackLocation.batteryLevel
            bearing = trackLocation.bearing
            location = trackLocation.location
            metaData = trackLocation.metaData
            speed = trackLocation.speed
            timestamp = trackLocation.timestamp
            trackingMode = trackLocation.trackingMode
            additionalProperties = trackLocation.additionalProperties.toMutableMap()
        }

        /**
         * If available, this property returns the accuracy of the GPS information received at the
         * tracked location. It is represented as an estimated horizontal accuracy radius, in
         * meters, at the 68th percentile confidence level.
         */
        fun accuracy(accuracy: Double) = accuracy(JsonField.of(accuracy))

        /**
         * Sets [Builder.accuracy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accuracy] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun accuracy(accuracy: JsonField<Double>) = apply { this.accuracy = accuracy }

        /**
         * If available in the GPS information, this property returns the altitude of the asset at
         * the tracked location. It is represented as height, in meters, above the WGS84 reference
         * ellipsoid.
         */
        fun altitude(altitude: Double) = altitude(JsonField.of(altitude))

        /**
         * Sets [Builder.altitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altitude] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun altitude(altitude: JsonField<Double>) = apply { this.altitude = altitude }

        /**
         * Returns the battery level of the GPS device, as a percentage, when the location was
         * tracked. It has a minimum value of 0 and a maximum value of 100.
         */
        fun batteryLevel(batteryLevel: Long) = batteryLevel(JsonField.of(batteryLevel))

        /**
         * Sets [Builder.batteryLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.batteryLevel] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun batteryLevel(batteryLevel: JsonField<Long>) = apply { this.batteryLevel = batteryLevel }

        /**
         * If available in the GPS information, this property returns the heading of the asset
         * calculated from true north in clockwise direction at the tracked location. Please note
         * that the bearing is not affected by the device orientation.
         *
         * The bearing will always be in the range of [0, 360).
         */
        fun bearing(bearing: Double) = bearing(JsonField.of(bearing))

        /**
         * Sets [Builder.bearing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bearing] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bearing(bearing: JsonField<Double>) = apply { this.bearing = bearing }

        /** An object with the coordinates of the last tracked location. */
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
         * Specifies the custom data about the location that was added when the location was
         * uploaded.
         */
        fun metaData(metaData: JsonValue) = apply { this.metaData = metaData }

        /**
         * If available in the GPS information, this property returns the speed of the asset, in
         * meters per second, at the tracked location.
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
         * A UNIX epoch timestamp in milliseconds, representing the time at which the location was
         * tracked.
         */
        fun timestamp(timestamp: Long) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timestamp(timestamp: JsonField<Long>) = apply { this.timestamp = timestamp }

        /** Internal parameter for tracking mode. */
        fun trackingMode(trackingMode: String) = trackingMode(JsonField.of(trackingMode))

        /**
         * Sets [Builder.trackingMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackingMode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trackingMode(trackingMode: JsonField<String>) = apply {
            this.trackingMode = trackingMode
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
         * Returns an immutable instance of [TrackLocation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TrackLocation =
            TrackLocation(
                accuracy,
                altitude,
                batteryLevel,
                bearing,
                location,
                metaData,
                speed,
                timestamp,
                trackingMode,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TrackLocation = apply {
        if (validated) {
            return@apply
        }

        accuracy()
        altitude()
        batteryLevel()
        bearing()
        location().ifPresent { it.validate() }
        speed()
        timestamp()
        trackingMode()
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
        (if (accuracy.asKnown().isPresent) 1 else 0) +
            (if (altitude.asKnown().isPresent) 1 else 0) +
            (if (batteryLevel.asKnown().isPresent) 1 else 0) +
            (if (bearing.asKnown().isPresent) 1 else 0) +
            (location.asKnown().getOrNull()?.validity() ?: 0) +
            (if (speed.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (trackingMode.asKnown().isPresent) 1 else 0)

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
         * Latitude of the tracked location of the asset.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lat(): Optional<Double> = lat.getOptional("lat")

        /**
         * Longitude of the tracked location of the asset.
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

            /** Latitude of the tracked location of the asset. */
            fun lat(lat: Double) = lat(JsonField.of(lat))

            /**
             * Sets [Builder.lat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

            /** Longitude of the tracked location of the asset. */
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

        return /* spotless:off */ other is TrackLocation && accuracy == other.accuracy && altitude == other.altitude && batteryLevel == other.batteryLevel && bearing == other.bearing && location == other.location && metaData == other.metaData && speed == other.speed && timestamp == other.timestamp && trackingMode == other.trackingMode && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accuracy, altitude, batteryLevel, bearing, location, metaData, speed, timestamp, trackingMode, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TrackLocation{accuracy=$accuracy, altitude=$altitude, batteryLevel=$batteryLevel, bearing=$bearing, location=$location, metaData=$metaData, speed=$speed, timestamp=$timestamp, trackingMode=$trackingMode, additionalProperties=$additionalProperties}"
}
