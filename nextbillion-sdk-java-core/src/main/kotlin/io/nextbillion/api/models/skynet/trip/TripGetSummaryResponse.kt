// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.trip

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.nextbillion.api.core.ExcludeMissing
import io.nextbillion.api.core.JsonField
import io.nextbillion.api.core.JsonMissing
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.checkKnown
import io.nextbillion.api.core.toImmutable
import io.nextbillion.api.errors.NextbillionSdkInvalidDataException
import io.nextbillion.api.models.skynet.asset.location.TrackLocation
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TripGetSummaryResponse
private constructor(
    private val data: JsonField<Data>,
    private val message: JsonField<String>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(data, message, status, mutableMapOf())

    /**
     * An container for the trip returned by the service.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Displays the error message in case of a failed request. If the request is successful, this
     * field is not present in the response.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * A string indicating the state of the response. On successful responses, the value will be
     * `Ok`. Indicative error messages are returned for different errors. See the
     * [API Error Codes](#api-error-codes) section below for more information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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

        /** Returns a mutable builder for constructing an instance of [TripGetSummaryResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TripGetSummaryResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tripGetSummaryResponse: TripGetSummaryResponse) = apply {
            data = tripGetSummaryResponse.data
            message = tripGetSummaryResponse.message
            status = tripGetSummaryResponse.status
            additionalProperties = tripGetSummaryResponse.additionalProperties.toMutableMap()
        }

        /** An container for the trip returned by the service. */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /**
         * Displays the error message in case of a failed request. If the request is successful,
         * this field is not present in the response.
         */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /**
         * A string indicating the state of the response. On successful responses, the value will be
         * `Ok`. Indicative error messages are returned for different errors. See the
         * [API Error Codes](#api-error-codes) section below for more information.
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
         * Returns an immutable instance of [TripGetSummaryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TripGetSummaryResponse =
            TripGetSummaryResponse(data, message, status, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): TripGetSummaryResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
        message()
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
        (data.asKnown().getOrNull()?.validity() ?: 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    /** An container for the trip returned by the service. */
    class Data
    private constructor(
        private val trip: JsonField<Trip>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("trip") @ExcludeMissing trip: JsonField<Trip> = JsonMissing.of()
        ) : this(trip, mutableMapOf())

        /**
         * An object containing the returned trip summary.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun trip(): Optional<Trip> = trip.getOptional("trip")

        /**
         * Returns the raw JSON value of [trip].
         *
         * Unlike [trip], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trip") @ExcludeMissing fun _trip(): JsonField<Trip> = trip

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var trip: JsonField<Trip> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                trip = data.trip
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** An object containing the returned trip summary. */
            fun trip(trip: Trip) = trip(JsonField.of(trip))

            /**
             * Sets [Builder.trip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trip] with a well-typed [Trip] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun trip(trip: JsonField<Trip>) = apply { this.trip = trip }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data = Data(trip, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            trip().ifPresent { it.validate() }
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
        @JvmSynthetic internal fun validity(): Int = (trip.asKnown().getOrNull()?.validity() ?: 0)

        /** An object containing the returned trip summary. */
        class Trip
        private constructor(
            private val id: JsonField<String>,
            private val asset: JsonField<AssetDetails>,
            private val assetId: JsonField<String>,
            private val attributes: JsonValue,
            private val createdAt: JsonField<Long>,
            private val description: JsonField<String>,
            private val distance: JsonField<Double>,
            private val duration: JsonField<Double>,
            private val endedAt: JsonField<Long>,
            private val geometry: JsonField<List<String>>,
            private val metaData: JsonValue,
            private val name: JsonField<String>,
            private val route: JsonField<List<TrackLocation>>,
            private val startedAt: JsonField<Long>,
            private val state: JsonField<String>,
            private val stops: JsonField<List<TripStop>>,
            private val updatedAt: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("asset")
                @ExcludeMissing
                asset: JsonField<AssetDetails> = JsonMissing.of(),
                @JsonProperty("asset_id")
                @ExcludeMissing
                assetId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("attributes")
                @ExcludeMissing
                attributes: JsonValue = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("distance")
                @ExcludeMissing
                distance: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("duration")
                @ExcludeMissing
                duration: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("ended_at")
                @ExcludeMissing
                endedAt: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("geometry")
                @ExcludeMissing
                geometry: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("meta_data") @ExcludeMissing metaData: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("route")
                @ExcludeMissing
                route: JsonField<List<TrackLocation>> = JsonMissing.of(),
                @JsonProperty("started_at")
                @ExcludeMissing
                startedAt: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("stops")
                @ExcludeMissing
                stops: JsonField<List<TripStop>> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<Long> = JsonMissing.of(),
            ) : this(
                id,
                asset,
                assetId,
                attributes,
                createdAt,
                description,
                distance,
                duration,
                endedAt,
                geometry,
                metaData,
                name,
                route,
                startedAt,
                state,
                stops,
                updatedAt,
                mutableMapOf(),
            )

            /**
             * Returns the unique identifier of the trip.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * An object with details of the `asset` properties.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun asset(): Optional<AssetDetails> = asset.getOptional("asset")

            /**
             * Returns the ID of the asset linked to the trip when the trip was started or updated.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun assetId(): Optional<String> = assetId.getOptional("asset_id")

            /**
             * Returns the `attributes` provided for the trip at the time of starting or updating
             * it.
             */
            @JsonProperty("attributes") @ExcludeMissing fun _attributes(): JsonValue = attributes

            /**
             * Returns the time, expressed as UNIX epoch timestamp in milliseconds, when the trip
             * was created.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun createdAt(): Optional<Long> = createdAt.getOptional("created_at")

            /**
             * Returns the custom description for the trip as provided at the time of starting or
             * updating the trip.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Returns the total distance covered during the trip, in meters. Please note that this
             * field will be available in the response only if a minimum of 3 locations were tracked
             * during the trip.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun distance(): Optional<Double> = distance.getOptional("distance")

            /**
             * Returns the total duration elapsed during the trip, in seconds. Please note that this
             * field will be available in the response only if a minimum of 3 locations were tracked
             * during the trip.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun duration(): Optional<Double> = duration.getOptional("duration")

            /**
             * Returns the time, expressed as UNIX epoch timestamp in milliseconds, when the trip
             * ended.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun endedAt(): Optional<Long> = endedAt.getOptional("ended_at")

            /**
             * Returns the geometry of the route that was taken during the trip, encoded in polyline
             * format. Please note that this field will be available in the response only if a
             * minimum of 3 locations were tracked during the trip.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun geometry(): Optional<List<String>> = geometry.getOptional("geometry")

            /**
             * Returns the metadata containing additional information about the trip as provided at
             * the time of starting or updating the trip.
             */
            @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonValue = metaData

            /**
             * Returns the name for the trip as provided at the time of starting or updating the
             * trip.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * An array of object returning the details of the locations tracked for the asset
             * during the trip which has ended. Each object represents a single location that was
             * tracked.
             *
             * Please note that this attribute will not be present in the response if no locations
             * were tracked/uploaded during the trip.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun route(): Optional<List<TrackLocation>> = route.getOptional("route")

            /**
             * Returns the time, expressed as UNIX epoch timestamp in milliseconds, when the trip
             * started.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun startedAt(): Optional<Long> = startedAt.getOptional("started_at")

            /**
             * Returns the current state of the trip. The value will be "active" if the trip is
             * still going on, otherwise the value returned would be "ended".
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun state(): Optional<String> = state.getOptional("state")

            /**
             * An array of objects returning the details of the stops made during the trip. Each
             * object represents a single stop.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun stops(): Optional<List<TripStop>> = stops.getOptional("stops")

            /**
             * Returns the timeme, expressed as UNIX epoch timestamp in milliseconds, when the trip
             * was last updated.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun updatedAt(): Optional<Long> = updatedAt.getOptional("updated_at")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [asset].
             *
             * Unlike [asset], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("asset") @ExcludeMissing fun _asset(): JsonField<AssetDetails> = asset

            /**
             * Returns the raw JSON value of [assetId].
             *
             * Unlike [assetId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("asset_id") @ExcludeMissing fun _assetId(): JsonField<String> = assetId

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<Long> = createdAt

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

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
             * Returns the raw JSON value of [endedAt].
             *
             * Unlike [endedAt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ended_at") @ExcludeMissing fun _endedAt(): JsonField<Long> = endedAt

            /**
             * Returns the raw JSON value of [geometry].
             *
             * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("geometry")
            @ExcludeMissing
            fun _geometry(): JsonField<List<String>> = geometry

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [route].
             *
             * Unlike [route], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("route")
            @ExcludeMissing
            fun _route(): JsonField<List<TrackLocation>> = route

            /**
             * Returns the raw JSON value of [startedAt].
             *
             * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("started_at")
            @ExcludeMissing
            fun _startedAt(): JsonField<Long> = startedAt

            /**
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /**
             * Returns the raw JSON value of [stops].
             *
             * Unlike [stops], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("stops") @ExcludeMissing fun _stops(): JsonField<List<TripStop>> = stops

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<Long> = updatedAt

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

                private var id: JsonField<String> = JsonMissing.of()
                private var asset: JsonField<AssetDetails> = JsonMissing.of()
                private var assetId: JsonField<String> = JsonMissing.of()
                private var attributes: JsonValue = JsonMissing.of()
                private var createdAt: JsonField<Long> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var distance: JsonField<Double> = JsonMissing.of()
                private var duration: JsonField<Double> = JsonMissing.of()
                private var endedAt: JsonField<Long> = JsonMissing.of()
                private var geometry: JsonField<MutableList<String>>? = null
                private var metaData: JsonValue = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var route: JsonField<MutableList<TrackLocation>>? = null
                private var startedAt: JsonField<Long> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var stops: JsonField<MutableList<TripStop>>? = null
                private var updatedAt: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(trip: Trip) = apply {
                    id = trip.id
                    asset = trip.asset
                    assetId = trip.assetId
                    attributes = trip.attributes
                    createdAt = trip.createdAt
                    description = trip.description
                    distance = trip.distance
                    duration = trip.duration
                    endedAt = trip.endedAt
                    geometry = trip.geometry.map { it.toMutableList() }
                    metaData = trip.metaData
                    name = trip.name
                    route = trip.route.map { it.toMutableList() }
                    startedAt = trip.startedAt
                    state = trip.state
                    stops = trip.stops.map { it.toMutableList() }
                    updatedAt = trip.updatedAt
                    additionalProperties = trip.additionalProperties.toMutableMap()
                }

                /** Returns the unique identifier of the trip. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** An object with details of the `asset` properties. */
                fun asset(asset: AssetDetails) = asset(JsonField.of(asset))

                /**
                 * Sets [Builder.asset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.asset] with a well-typed [AssetDetails] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun asset(asset: JsonField<AssetDetails>) = apply { this.asset = asset }

                /**
                 * Returns the ID of the asset linked to the trip when the trip was started or
                 * updated.
                 */
                fun assetId(assetId: String) = assetId(JsonField.of(assetId))

                /**
                 * Sets [Builder.assetId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assetId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun assetId(assetId: JsonField<String>) = apply { this.assetId = assetId }

                /**
                 * Returns the `attributes` provided for the trip at the time of starting or
                 * updating it.
                 */
                fun attributes(attributes: JsonValue) = apply { this.attributes = attributes }

                /**
                 * Returns the time, expressed as UNIX epoch timestamp in milliseconds, when the
                 * trip was created.
                 */
                fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

                /**
                 * Returns the custom description for the trip as provided at the time of starting
                 * or updating the trip.
                 */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * Returns the total distance covered during the trip, in meters. Please note that
                 * this field will be available in the response only if a minimum of 3 locations
                 * were tracked during the trip.
                 */
                fun distance(distance: Double) = distance(JsonField.of(distance))

                /**
                 * Sets [Builder.distance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.distance] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

                /**
                 * Returns the total duration elapsed during the trip, in seconds. Please note that
                 * this field will be available in the response only if a minimum of 3 locations
                 * were tracked during the trip.
                 */
                fun duration(duration: Double) = duration(JsonField.of(duration))

                /**
                 * Sets [Builder.duration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.duration] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

                /**
                 * Returns the time, expressed as UNIX epoch timestamp in milliseconds, when the
                 * trip ended.
                 */
                fun endedAt(endedAt: Long) = endedAt(JsonField.of(endedAt))

                /**
                 * Sets [Builder.endedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endedAt] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun endedAt(endedAt: JsonField<Long>) = apply { this.endedAt = endedAt }

                /**
                 * Returns the geometry of the route that was taken during the trip, encoded in
                 * polyline format. Please note that this field will be available in the response
                 * only if a minimum of 3 locations were tracked during the trip.
                 */
                fun geometry(geometry: List<String>) = geometry(JsonField.of(geometry))

                /**
                 * Sets [Builder.geometry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.geometry] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns the metadata containing additional information about the trip as provided
                 * at the time of starting or updating the trip.
                 */
                fun metaData(metaData: JsonValue) = apply { this.metaData = metaData }

                /**
                 * Returns the name for the trip as provided at the time of starting or updating the
                 * trip.
                 */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * An array of object returning the details of the locations tracked for the asset
                 * during the trip which has ended. Each object represents a single location that
                 * was tracked.
                 *
                 * Please note that this attribute will not be present in the response if no
                 * locations were tracked/uploaded during the trip.
                 */
                fun route(route: List<TrackLocation>) = route(JsonField.of(route))

                /**
                 * Sets [Builder.route] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.route] with a well-typed `List<TrackLocation>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun route(route: JsonField<List<TrackLocation>>) = apply {
                    this.route = route.map { it.toMutableList() }
                }

                /**
                 * Adds a single [TrackLocation] to [Builder.route].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRoute(route: TrackLocation) = apply {
                    this.route =
                        (this.route ?: JsonField.of(mutableListOf())).also {
                            checkKnown("route", it).add(route)
                        }
                }

                /**
                 * Returns the time, expressed as UNIX epoch timestamp in milliseconds, when the
                 * trip started.
                 */
                fun startedAt(startedAt: Long) = startedAt(JsonField.of(startedAt))

                /**
                 * Sets [Builder.startedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startedAt] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun startedAt(startedAt: JsonField<Long>) = apply { this.startedAt = startedAt }

                /**
                 * Returns the current state of the trip. The value will be "active" if the trip is
                 * still going on, otherwise the value returned would be "ended".
                 */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

                /**
                 * An array of objects returning the details of the stops made during the trip. Each
                 * object represents a single stop.
                 */
                fun stops(stops: List<TripStop>) = stops(JsonField.of(stops))

                /**
                 * Sets [Builder.stops] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stops] with a well-typed `List<TripStop>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stops(stops: JsonField<List<TripStop>>) = apply {
                    this.stops = stops.map { it.toMutableList() }
                }

                /**
                 * Adds a single [TripStop] to [stops].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addStop(stop: TripStop) = apply {
                    stops =
                        (stops ?: JsonField.of(mutableListOf())).also {
                            checkKnown("stops", it).add(stop)
                        }
                }

                /**
                 * Returns the timeme, expressed as UNIX epoch timestamp in milliseconds, when the
                 * trip was last updated.
                 */
                fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

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
                 * Returns an immutable instance of [Trip].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Trip =
                    Trip(
                        id,
                        asset,
                        assetId,
                        attributes,
                        createdAt,
                        description,
                        distance,
                        duration,
                        endedAt,
                        (geometry ?: JsonMissing.of()).map { it.toImmutable() },
                        metaData,
                        name,
                        (route ?: JsonMissing.of()).map { it.toImmutable() },
                        startedAt,
                        state,
                        (stops ?: JsonMissing.of()).map { it.toImmutable() },
                        updatedAt,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Trip = apply {
                if (validated) {
                    return@apply
                }

                id()
                asset().ifPresent { it.validate() }
                assetId()
                createdAt()
                description()
                distance()
                duration()
                endedAt()
                geometry()
                name()
                route().ifPresent { it.forEach { it.validate() } }
                startedAt()
                state()
                stops().ifPresent { it.forEach { it.validate() } }
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (asset.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (assetId.asKnown().isPresent) 1 else 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (distance.asKnown().isPresent) 1 else 0) +
                    (if (duration.asKnown().isPresent) 1 else 0) +
                    (if (endedAt.asKnown().isPresent) 1 else 0) +
                    (geometry.asKnown().getOrNull()?.size ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (route.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (startedAt.asKnown().isPresent) 1 else 0) +
                    (if (state.asKnown().isPresent) 1 else 0) +
                    (stops.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Trip && id == other.id && asset == other.asset && assetId == other.assetId && attributes == other.attributes && createdAt == other.createdAt && description == other.description && distance == other.distance && duration == other.duration && endedAt == other.endedAt && geometry == other.geometry && metaData == other.metaData && name == other.name && route == other.route && startedAt == other.startedAt && state == other.state && stops == other.stops && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, asset, assetId, attributes, createdAt, description, distance, duration, endedAt, geometry, metaData, name, route, startedAt, state, stops, updatedAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Trip{id=$id, asset=$asset, assetId=$assetId, attributes=$attributes, createdAt=$createdAt, description=$description, distance=$distance, duration=$duration, endedAt=$endedAt, geometry=$geometry, metaData=$metaData, name=$name, route=$route, startedAt=$startedAt, state=$state, stops=$stops, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && trip == other.trip && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(trip, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{trip=$trip, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TripGetSummaryResponse && data == other.data && message == other.message && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, message, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TripGetSummaryResponse{data=$data, message=$message, status=$status, additionalProperties=$additionalProperties}"
}
