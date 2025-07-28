// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.asset

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.nextbillion.api.core.Enum
import io.nextbillion.api.core.ExcludeMissing
import io.nextbillion.api.core.JsonField
import io.nextbillion.api.core.JsonMissing
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.Params
import io.nextbillion.api.core.checkRequired
import io.nextbillion.api.core.http.Headers
import io.nextbillion.api.core.http.QueryParams
import io.nextbillion.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Upload track info */
class AssetTrackParams
private constructor(
    private val id: String?,
    private val key: String,
    private val cluster: Cluster?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /** the cluster of the region you want to use */
    fun cluster(): Optional<Cluster> = Optional.ofNullable(cluster)

    /**
     * ID of the device used to upload the tracking information of the `asset`.
     *
     * Please note that the `device_id` used here must already be linked to the `asset`. Use the
     * _Bind Device to Asset_ method to link a device with your `asset`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deviceId(): String = body.deviceId()

    /**
     * An array of objects to collect the location tracking information for an `asset`. Each object
     * must correspond to details of only one location.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun locations(): Locations = body.locations()

    /**
     * Returns the raw JSON value of [deviceId].
     *
     * Unlike [deviceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _deviceId(): JsonField<String> = body._deviceId()

    /**
     * Returns the raw JSON value of [locations].
     *
     * Unlike [locations], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _locations(): JsonField<Locations> = body._locations()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AssetTrackParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .deviceId()
         * .locations()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssetTrackParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var key: String? = null
        private var cluster: Cluster? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(assetTrackParams: AssetTrackParams) = apply {
            id = assetTrackParams.id
            key = assetTrackParams.key
            cluster = assetTrackParams.cluster
            body = assetTrackParams.body.toBuilder()
            additionalHeaders = assetTrackParams.additionalHeaders.toBuilder()
            additionalQueryParams = assetTrackParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /** the cluster of the region you want to use */
        fun cluster(cluster: Cluster?) = apply { this.cluster = cluster }

        /** Alias for calling [Builder.cluster] with `cluster.orElse(null)`. */
        fun cluster(cluster: Optional<Cluster>) = cluster(cluster.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [deviceId]
         * - [locations]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * ID of the device used to upload the tracking information of the `asset`.
         *
         * Please note that the `device_id` used here must already be linked to the `asset`. Use the
         * _Bind Device to Asset_ method to link a device with your `asset`.
         */
        fun deviceId(deviceId: String) = apply { body.deviceId(deviceId) }

        /**
         * Sets [Builder.deviceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deviceId(deviceId: JsonField<String>) = apply { body.deviceId(deviceId) }

        /**
         * An array of objects to collect the location tracking information for an `asset`. Each
         * object must correspond to details of only one location.
         */
        fun locations(locations: Locations) = apply { body.locations(locations) }

        /**
         * Sets [Builder.locations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locations] with a well-typed [Locations] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun locations(locations: JsonField<Locations>) = apply { body.locations(locations) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [AssetTrackParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .deviceId()
         * .locations()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AssetTrackParams =
            AssetTrackParams(
                id,
                checkRequired("key", key),
                cluster,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                cluster?.let { put("cluster", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    private constructor(
        private val deviceId: JsonField<String>,
        private val locations: JsonField<Locations>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("device_id")
            @ExcludeMissing
            deviceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locations")
            @ExcludeMissing
            locations: JsonField<Locations> = JsonMissing.of(),
        ) : this(deviceId, locations, mutableMapOf())

        /**
         * ID of the device used to upload the tracking information of the `asset`.
         *
         * Please note that the `device_id` used here must already be linked to the `asset`. Use the
         * _Bind Device to Asset_ method to link a device with your `asset`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deviceId(): String = deviceId.getRequired("device_id")

        /**
         * An array of objects to collect the location tracking information for an `asset`. Each
         * object must correspond to details of only one location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun locations(): Locations = locations.getRequired("locations")

        /**
         * Returns the raw JSON value of [deviceId].
         *
         * Unlike [deviceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device_id") @ExcludeMissing fun _deviceId(): JsonField<String> = deviceId

        /**
         * Returns the raw JSON value of [locations].
         *
         * Unlike [locations], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locations")
        @ExcludeMissing
        fun _locations(): JsonField<Locations> = locations

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .deviceId()
             * .locations()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var deviceId: JsonField<String>? = null
            private var locations: JsonField<Locations>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                deviceId = body.deviceId
                locations = body.locations
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * ID of the device used to upload the tracking information of the `asset`.
             *
             * Please note that the `device_id` used here must already be linked to the `asset`. Use
             * the _Bind Device to Asset_ method to link a device with your `asset`.
             */
            fun deviceId(deviceId: String) = deviceId(JsonField.of(deviceId))

            /**
             * Sets [Builder.deviceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deviceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deviceId(deviceId: JsonField<String>) = apply { this.deviceId = deviceId }

            /**
             * An array of objects to collect the location tracking information for an `asset`. Each
             * object must correspond to details of only one location.
             */
            fun locations(locations: Locations) = locations(JsonField.of(locations))

            /**
             * Sets [Builder.locations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locations] with a well-typed [Locations] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locations(locations: JsonField<Locations>) = apply { this.locations = locations }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .deviceId()
             * .locations()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("deviceId", deviceId),
                    checkRequired("locations", locations),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            deviceId()
            locations().validate()
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
            (if (deviceId.asKnown().isPresent) 1 else 0) +
                (locations.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && deviceId == other.deviceId && locations == other.locations && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(deviceId, locations, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{deviceId=$deviceId, locations=$locations, additionalProperties=$additionalProperties}"
    }

    /**
     * An array of objects to collect the location tracking information for an `asset`. Each object
     * must correspond to details of only one location.
     */
    class Locations
    private constructor(
        private val location: JsonField<Location>,
        private val timestamp: JsonField<Long>,
        private val accuracy: JsonField<Double>,
        private val altitude: JsonField<Double>,
        private val batteryLevel: JsonField<Long>,
        private val bearing: JsonField<Double>,
        private val metaData: JsonValue,
        private val speed: JsonField<Double>,
        private val trackingMode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("location")
            @ExcludeMissing
            location: JsonField<Location> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("accuracy")
            @ExcludeMissing
            accuracy: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("altitude")
            @ExcludeMissing
            altitude: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("battery_level")
            @ExcludeMissing
            batteryLevel: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("bearing") @ExcludeMissing bearing: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("meta_data") @ExcludeMissing metaData: JsonValue = JsonMissing.of(),
            @JsonProperty("speed") @ExcludeMissing speed: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tracking_mode")
            @ExcludeMissing
            trackingMode: JsonField<String> = JsonMissing.of(),
        ) : this(
            location,
            timestamp,
            accuracy,
            altitude,
            batteryLevel,
            bearing,
            metaData,
            speed,
            trackingMode,
            mutableMapOf(),
        )

        /**
         * An object to collect the coordinate details of the tracked location. Please note this
         * field is mandatory when uploading locations for an asset.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun location(): Location = location.getRequired("location")

        /**
         * Use this parameter to provide the time, expressed as UNIX epoch timestamp in
         * milliseconds, when the location was tracked. Please note this field is mandatory when
         * uploading locations for an asset.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timestamp(): Long = timestamp.getRequired("timestamp")

        /**
         * Use this parameter to provide the accuracy of the GPS information at the tracked
         * location. It is the estimated horizontal accuracy radius, in meters.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accuracy(): Optional<Double> = accuracy.getOptional("accuracy")

        /**
         * Use this parameter to provide the altitude, in meters, of the `asset` at the tracked
         * location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun altitude(): Optional<Double> = altitude.getOptional("altitude")

        /**
         * Use this parameter to provide the battery level of the GPS device, as a percentage, when
         * the location is tracked. It should have a minimum value of 0 and a maximum value of 100.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun batteryLevel(): Optional<Long> = batteryLevel.getOptional("battery_level")

        /**
         * Use this parameter to provide the heading of the `asset`, in radians, calculated from
         * true north in clockwise direction. This should always be in the range of [0, 360).
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun bearing(): Optional<Double> = bearing.getOptional("bearing")

        /**
         * Use this object to add any custom data about the location that is being uploaded.
         * Recommended to use the `key`:`value` format for adding the desired information.
         *
         * Please note that the maximum size of `meta_data` object should not exceed 65Kb.
         */
        @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonValue = metaData

        /**
         * Use this parameter to provide the speed of the `asset`, in meters per second, at the
         * tracked location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun speed(): Optional<Double> = speed.getOptional("speed")

        /**
         * NB tracking mode.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun trackingMode(): Optional<String> = trackingMode.getOptional("tracking_mode")

        /**
         * Returns the raw JSON value of [location].
         *
         * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<Location> = location

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<Long> = timestamp

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
         * Unlike [batteryLevel], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [speed].
         *
         * Unlike [speed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("speed") @ExcludeMissing fun _speed(): JsonField<Double> = speed

        /**
         * Returns the raw JSON value of [trackingMode].
         *
         * Unlike [trackingMode], this method doesn't throw if the JSON field has an unexpected
         * type.
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

            /**
             * Returns a mutable builder for constructing an instance of [Locations].
             *
             * The following fields are required:
             * ```java
             * .location()
             * .timestamp()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Locations]. */
        class Builder internal constructor() {

            private var location: JsonField<Location>? = null
            private var timestamp: JsonField<Long>? = null
            private var accuracy: JsonField<Double> = JsonMissing.of()
            private var altitude: JsonField<Double> = JsonMissing.of()
            private var batteryLevel: JsonField<Long> = JsonMissing.of()
            private var bearing: JsonField<Double> = JsonMissing.of()
            private var metaData: JsonValue = JsonMissing.of()
            private var speed: JsonField<Double> = JsonMissing.of()
            private var trackingMode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(locations: Locations) = apply {
                location = locations.location
                timestamp = locations.timestamp
                accuracy = locations.accuracy
                altitude = locations.altitude
                batteryLevel = locations.batteryLevel
                bearing = locations.bearing
                metaData = locations.metaData
                speed = locations.speed
                trackingMode = locations.trackingMode
                additionalProperties = locations.additionalProperties.toMutableMap()
            }

            /**
             * An object to collect the coordinate details of the tracked location. Please note this
             * field is mandatory when uploading locations for an asset.
             */
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
             * Use this parameter to provide the time, expressed as UNIX epoch timestamp in
             * milliseconds, when the location was tracked. Please note this field is mandatory when
             * uploading locations for an asset.
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

            /**
             * Use this parameter to provide the accuracy of the GPS information at the tracked
             * location. It is the estimated horizontal accuracy radius, in meters.
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
             * Use this parameter to provide the altitude, in meters, of the `asset` at the tracked
             * location.
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
             * Use this parameter to provide the battery level of the GPS device, as a percentage,
             * when the location is tracked. It should have a minimum value of 0 and a maximum value
             * of 100.
             */
            fun batteryLevel(batteryLevel: Long) = batteryLevel(JsonField.of(batteryLevel))

            /**
             * Sets [Builder.batteryLevel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.batteryLevel] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun batteryLevel(batteryLevel: JsonField<Long>) = apply {
                this.batteryLevel = batteryLevel
            }

            /**
             * Use this parameter to provide the heading of the `asset`, in radians, calculated from
             * true north in clockwise direction. This should always be in the range of [0, 360).
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

            /**
             * Use this object to add any custom data about the location that is being uploaded.
             * Recommended to use the `key`:`value` format for adding the desired information.
             *
             * Please note that the maximum size of `meta_data` object should not exceed 65Kb.
             */
            fun metaData(metaData: JsonValue) = apply { this.metaData = metaData }

            /**
             * Use this parameter to provide the speed of the `asset`, in meters per second, at the
             * tracked location.
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

            /** NB tracking mode. */
            fun trackingMode(trackingMode: String) = trackingMode(JsonField.of(trackingMode))

            /**
             * Sets [Builder.trackingMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trackingMode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Locations].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .location()
             * .timestamp()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Locations =
                Locations(
                    checkRequired("location", location),
                    checkRequired("timestamp", timestamp),
                    accuracy,
                    altitude,
                    batteryLevel,
                    bearing,
                    metaData,
                    speed,
                    trackingMode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Locations = apply {
            if (validated) {
                return@apply
            }

            location().validate()
            timestamp()
            accuracy()
            altitude()
            batteryLevel()
            bearing()
            speed()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (location.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0) +
                (if (accuracy.asKnown().isPresent) 1 else 0) +
                (if (altitude.asKnown().isPresent) 1 else 0) +
                (if (batteryLevel.asKnown().isPresent) 1 else 0) +
                (if (bearing.asKnown().isPresent) 1 else 0) +
                (if (speed.asKnown().isPresent) 1 else 0) +
                (if (trackingMode.asKnown().isPresent) 1 else 0)

        /**
         * An object to collect the coordinate details of the tracked location. Please note this
         * field is mandatory when uploading locations for an asset.
         */
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
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lat(): Double = lat.getRequired("lat")

            /**
             * Longitude of the tracked location of the `asset`.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lon(): Double = lon.getRequired("lon")

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

                /**
                 * Returns a mutable builder for constructing an instance of [Location].
                 *
                 * The following fields are required:
                 * ```java
                 * .lat()
                 * .lon()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Location]. */
            class Builder internal constructor() {

                private var lat: JsonField<Double>? = null
                private var lon: JsonField<Double>? = null
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
                 *
                 * The following fields are required:
                 * ```java
                 * .lat()
                 * .lon()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Location =
                    Location(
                        checkRequired("lat", lat),
                        checkRequired("lon", lon),
                        additionalProperties.toMutableMap(),
                    )
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

            return /* spotless:off */ other is Locations && location == other.location && timestamp == other.timestamp && accuracy == other.accuracy && altitude == other.altitude && batteryLevel == other.batteryLevel && bearing == other.bearing && metaData == other.metaData && speed == other.speed && trackingMode == other.trackingMode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(location, timestamp, accuracy, altitude, batteryLevel, bearing, metaData, speed, trackingMode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Locations{location=$location, timestamp=$timestamp, accuracy=$accuracy, altitude=$altitude, batteryLevel=$batteryLevel, bearing=$bearing, metaData=$metaData, speed=$speed, trackingMode=$trackingMode, additionalProperties=$additionalProperties}"
    }

    /** the cluster of the region you want to use */
    class Cluster @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AMERICA = of("america")

            @JvmStatic fun of(value: String) = Cluster(JsonField.of(value))
        }

        /** An enum containing [Cluster]'s known values. */
        enum class Known {
            AMERICA
        }

        /**
         * An enum containing [Cluster]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Cluster] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AMERICA,
            /** An enum member indicating that [Cluster] was instantiated with an unknown value. */
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
                AMERICA -> Value.AMERICA
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
                AMERICA -> Known.AMERICA
                else -> throw NextbillionSdkInvalidDataException("Unknown Cluster: $value")
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

        fun validate(): Cluster = apply {
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

            return /* spotless:off */ other is Cluster && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AssetTrackParams && id == other.id && key == other.key && cluster == other.cluster && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, key, cluster, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AssetTrackParams{id=$id, key=$key, cluster=$cluster, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
