// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.asset.event

import ai.nextbillion.core.Enum
import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.checkKnown
import ai.nextbillion.core.toImmutable
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import ai.nextbillion.models.skynet.monitor.Pagination
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EventListResponse
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
     * An object containing the information about the event history for the requested asset.
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
     * A string indicating the state of the response. On successful responses, the value will be Ok.
     * Indicative error messages are returned for different errors. See the
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

        /** Returns a mutable builder for constructing an instance of [EventListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventListResponse: EventListResponse) = apply {
            data = eventListResponse.data
            message = eventListResponse.message
            status = eventListResponse.status
            additionalProperties = eventListResponse.additionalProperties.toMutableMap()
        }

        /** An object containing the information about the event history for the requested asset. */
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
         * Ok. Indicative error messages are returned for different errors. See the
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
         * Returns an immutable instance of [EventListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EventListResponse =
            EventListResponse(data, message, status, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): EventListResponse = apply {
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

    /** An object containing the information about the event history for the requested asset. */
    class Data
    private constructor(
        private val list: JsonField<List<AssetEvent>>,
        private val page: JsonField<Pagination>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("list")
            @ExcludeMissing
            list: JsonField<List<AssetEvent>> = JsonMissing.of(),
            @JsonProperty("page") @ExcludeMissing page: JsonField<Pagination> = JsonMissing.of(),
        ) : this(list, page, mutableMapOf())

        /**
         * An array of objects with each object on the list representing one event.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun list(): Optional<List<AssetEvent>> = list.getOptional("list")

        /**
         * An object with pagination details of the search results. Use this object to implement
         * pagination in your application.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun page(): Optional<Pagination> = page.getOptional("page")

        /**
         * Returns the raw JSON value of [list].
         *
         * Unlike [list], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("list") @ExcludeMissing fun _list(): JsonField<List<AssetEvent>> = list

        /**
         * Returns the raw JSON value of [page].
         *
         * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Pagination> = page

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

            private var list: JsonField<MutableList<AssetEvent>>? = null
            private var page: JsonField<Pagination> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                list = data.list.map { it.toMutableList() }
                page = data.page
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** An array of objects with each object on the list representing one event. */
            fun list(list: List<AssetEvent>) = list(JsonField.of(list))

            /**
             * Sets [Builder.list] to an arbitrary JSON value.
             *
             * You should usually call [Builder.list] with a well-typed `List<AssetEvent>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun list(list: JsonField<List<AssetEvent>>) = apply {
                this.list = list.map { it.toMutableList() }
            }

            /**
             * Adds a single [AssetEvent] to [Builder.list].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addList(list: AssetEvent) = apply {
                this.list =
                    (this.list ?: JsonField.of(mutableListOf())).also {
                        checkKnown("list", it).add(list)
                    }
            }

            /**
             * An object with pagination details of the search results. Use this object to implement
             * pagination in your application.
             */
            fun page(page: Pagination) = page(JsonField.of(page))

            /**
             * Sets [Builder.page] to an arbitrary JSON value.
             *
             * You should usually call [Builder.page] with a well-typed [Pagination] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun page(page: JsonField<Pagination>) = apply { this.page = page }

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
            fun build(): Data =
                Data(
                    (list ?: JsonMissing.of()).map { it.toImmutable() },
                    page,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            list().ifPresent { it.forEach { it.validate() } }
            page().ifPresent { it.validate() }
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
            (list.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (page.asKnown().getOrNull()?.validity() ?: 0)

        class AssetEvent
        private constructor(
            private val assetId: JsonField<String>,
            private val eventType: JsonField<EventType>,
            private val extra: JsonValue,
            private val geofenceId: JsonField<String>,
            private val monitorId: JsonField<String>,
            private val monitorTags: JsonField<List<String>>,
            private val prevLocation: JsonField<PrevLocation>,
            private val timestamp: JsonField<Long>,
            private val triggeredLocation: JsonField<TriggeredLocation>,
            private val triggeredTimestamp: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("asset_id")
                @ExcludeMissing
                assetId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("event_type")
                @ExcludeMissing
                eventType: JsonField<EventType> = JsonMissing.of(),
                @JsonProperty("extra") @ExcludeMissing extra: JsonValue = JsonMissing.of(),
                @JsonProperty("geofence_id")
                @ExcludeMissing
                geofenceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("monitor_id")
                @ExcludeMissing
                monitorId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("monitor_tags")
                @ExcludeMissing
                monitorTags: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("prev_location")
                @ExcludeMissing
                prevLocation: JsonField<PrevLocation> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("triggered_location")
                @ExcludeMissing
                triggeredLocation: JsonField<TriggeredLocation> = JsonMissing.of(),
                @JsonProperty("triggered_timestamp")
                @ExcludeMissing
                triggeredTimestamp: JsonField<Long> = JsonMissing.of(),
            ) : this(
                assetId,
                eventType,
                extra,
                geofenceId,
                monitorId,
                monitorTags,
                prevLocation,
                timestamp,
                triggeredLocation,
                triggeredTimestamp,
                mutableMapOf(),
            )

            /**
             * ID of the asset. This is the same ID that was generated/provided at the time of
             * creating the asset.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun assetId(): Optional<String> = assetId.getOptional("asset_id")

            /**
             * Nature of the event triggered by the asset. It can have following values:
             * - enter: When the asset enters a specific geofence
             * - exit: When the asset moves out of a specific geofence.
             * - speeding: When the asset exceeds the certain speed limit.
             * - idle: When the asset exhibits idle or no activity.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun eventType(): Optional<EventType> = eventType.getOptional("event_type")

            /**
             * Additional information about the event. Currently, this object returns the speed
             * limit that was used to generate the over-speeding events, for a speeding type event.
             *
             * It is worth highlighting that, when the use_admin_speed_limit is true, the speed
             * limit value will be obtained from the underlying road information. Whereas, if the
             * use_admin_speed_limit is false, the speed limit will be equal to the
             * customer_speed_limit value provided by the user when creating or updating the
             * monitor.
             */
            @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonValue = extra

            /**
             * ID of the geofence associated with the event.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun geofenceId(): Optional<String> = geofenceId.getOptional("geofence_id")

            /**
             * ID of the monitor associated with the event.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun monitorId(): Optional<String> = monitorId.getOptional("monitor_id")

            /**
             * Tags associated with the monitor.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun monitorTags(): Optional<List<String>> = monitorTags.getOptional("monitor_tags")

            /**
             * An object with details of the asset at the last tracked location before the event was
             * triggered.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun prevLocation(): Optional<PrevLocation> = prevLocation.getOptional("prev_location")

            /**
             * A UNIX epoch timestamp in milliseconds representing the time at which the event was
             * added/created.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun timestamp(): Optional<Long> = timestamp.getOptional("timestamp")

            /**
             * An object with details of the asset at the location where the event was triggered.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun triggeredLocation(): Optional<TriggeredLocation> =
                triggeredLocation.getOptional("triggered_location")

            /**
             * A UNIX epoch timestamp in milliseconds representing the time at which the event was
             * triggered.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun triggeredTimestamp(): Optional<Long> =
                triggeredTimestamp.getOptional("triggered_timestamp")

            /**
             * Returns the raw JSON value of [assetId].
             *
             * Unlike [assetId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("asset_id") @ExcludeMissing fun _assetId(): JsonField<String> = assetId

            /**
             * Returns the raw JSON value of [eventType].
             *
             * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("event_type")
            @ExcludeMissing
            fun _eventType(): JsonField<EventType> = eventType

            /**
             * Returns the raw JSON value of [geofenceId].
             *
             * Unlike [geofenceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("geofence_id")
            @ExcludeMissing
            fun _geofenceId(): JsonField<String> = geofenceId

            /**
             * Returns the raw JSON value of [monitorId].
             *
             * Unlike [monitorId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("monitor_id")
            @ExcludeMissing
            fun _monitorId(): JsonField<String> = monitorId

            /**
             * Returns the raw JSON value of [monitorTags].
             *
             * Unlike [monitorTags], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("monitor_tags")
            @ExcludeMissing
            fun _monitorTags(): JsonField<List<String>> = monitorTags

            /**
             * Returns the raw JSON value of [prevLocation].
             *
             * Unlike [prevLocation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("prev_location")
            @ExcludeMissing
            fun _prevLocation(): JsonField<PrevLocation> = prevLocation

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<Long> = timestamp

            /**
             * Returns the raw JSON value of [triggeredLocation].
             *
             * Unlike [triggeredLocation], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("triggered_location")
            @ExcludeMissing
            fun _triggeredLocation(): JsonField<TriggeredLocation> = triggeredLocation

            /**
             * Returns the raw JSON value of [triggeredTimestamp].
             *
             * Unlike [triggeredTimestamp], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("triggered_timestamp")
            @ExcludeMissing
            fun _triggeredTimestamp(): JsonField<Long> = triggeredTimestamp

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

                /** Returns a mutable builder for constructing an instance of [AssetEvent]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AssetEvent]. */
            class Builder internal constructor() {

                private var assetId: JsonField<String> = JsonMissing.of()
                private var eventType: JsonField<EventType> = JsonMissing.of()
                private var extra: JsonValue = JsonMissing.of()
                private var geofenceId: JsonField<String> = JsonMissing.of()
                private var monitorId: JsonField<String> = JsonMissing.of()
                private var monitorTags: JsonField<MutableList<String>>? = null
                private var prevLocation: JsonField<PrevLocation> = JsonMissing.of()
                private var timestamp: JsonField<Long> = JsonMissing.of()
                private var triggeredLocation: JsonField<TriggeredLocation> = JsonMissing.of()
                private var triggeredTimestamp: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(assetEvent: AssetEvent) = apply {
                    assetId = assetEvent.assetId
                    eventType = assetEvent.eventType
                    extra = assetEvent.extra
                    geofenceId = assetEvent.geofenceId
                    monitorId = assetEvent.monitorId
                    monitorTags = assetEvent.monitorTags.map { it.toMutableList() }
                    prevLocation = assetEvent.prevLocation
                    timestamp = assetEvent.timestamp
                    triggeredLocation = assetEvent.triggeredLocation
                    triggeredTimestamp = assetEvent.triggeredTimestamp
                    additionalProperties = assetEvent.additionalProperties.toMutableMap()
                }

                /**
                 * ID of the asset. This is the same ID that was generated/provided at the time of
                 * creating the asset.
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
                 * Nature of the event triggered by the asset. It can have following values:
                 * - enter: When the asset enters a specific geofence
                 * - exit: When the asset moves out of a specific geofence.
                 * - speeding: When the asset exceeds the certain speed limit.
                 * - idle: When the asset exhibits idle or no activity.
                 */
                fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                /**
                 * Sets [Builder.eventType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventType] with a well-typed [EventType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventType(eventType: JsonField<EventType>) = apply {
                    this.eventType = eventType
                }

                /**
                 * Additional information about the event. Currently, this object returns the speed
                 * limit that was used to generate the over-speeding events, for a speeding type
                 * event.
                 *
                 * It is worth highlighting that, when the use_admin_speed_limit is true, the speed
                 * limit value will be obtained from the underlying road information. Whereas, if
                 * the use_admin_speed_limit is false, the speed limit will be equal to the
                 * customer_speed_limit value provided by the user when creating or updating the
                 * monitor.
                 */
                fun extra(extra: JsonValue) = apply { this.extra = extra }

                /** ID of the geofence associated with the event. */
                fun geofenceId(geofenceId: String) = geofenceId(JsonField.of(geofenceId))

                /**
                 * Sets [Builder.geofenceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.geofenceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun geofenceId(geofenceId: JsonField<String>) = apply {
                    this.geofenceId = geofenceId
                }

                /** ID of the monitor associated with the event. */
                fun monitorId(monitorId: String) = monitorId(JsonField.of(monitorId))

                /**
                 * Sets [Builder.monitorId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.monitorId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun monitorId(monitorId: JsonField<String>) = apply { this.monitorId = monitorId }

                /** Tags associated with the monitor. */
                fun monitorTags(monitorTags: List<String>) = monitorTags(JsonField.of(monitorTags))

                /**
                 * Sets [Builder.monitorTags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.monitorTags] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun monitorTags(monitorTags: JsonField<List<String>>) = apply {
                    this.monitorTags = monitorTags.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [monitorTags].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMonitorTag(monitorTag: String) = apply {
                    monitorTags =
                        (monitorTags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("monitorTags", it).add(monitorTag)
                        }
                }

                /**
                 * An object with details of the asset at the last tracked location before the event
                 * was triggered.
                 */
                fun prevLocation(prevLocation: PrevLocation) =
                    prevLocation(JsonField.of(prevLocation))

                /**
                 * Sets [Builder.prevLocation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.prevLocation] with a well-typed [PrevLocation]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun prevLocation(prevLocation: JsonField<PrevLocation>) = apply {
                    this.prevLocation = prevLocation
                }

                /**
                 * A UNIX epoch timestamp in milliseconds representing the time at which the event
                 * was added/created.
                 */
                fun timestamp(timestamp: Long) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun timestamp(timestamp: JsonField<Long>) = apply { this.timestamp = timestamp }

                /**
                 * An object with details of the asset at the location where the event was
                 * triggered.
                 */
                fun triggeredLocation(triggeredLocation: TriggeredLocation) =
                    triggeredLocation(JsonField.of(triggeredLocation))

                /**
                 * Sets [Builder.triggeredLocation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.triggeredLocation] with a well-typed
                 * [TriggeredLocation] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun triggeredLocation(triggeredLocation: JsonField<TriggeredLocation>) = apply {
                    this.triggeredLocation = triggeredLocation
                }

                /**
                 * A UNIX epoch timestamp in milliseconds representing the time at which the event
                 * was triggered.
                 */
                fun triggeredTimestamp(triggeredTimestamp: Long) =
                    triggeredTimestamp(JsonField.of(triggeredTimestamp))

                /**
                 * Sets [Builder.triggeredTimestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.triggeredTimestamp] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun triggeredTimestamp(triggeredTimestamp: JsonField<Long>) = apply {
                    this.triggeredTimestamp = triggeredTimestamp
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
                 * Returns an immutable instance of [AssetEvent].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AssetEvent =
                    AssetEvent(
                        assetId,
                        eventType,
                        extra,
                        geofenceId,
                        monitorId,
                        (monitorTags ?: JsonMissing.of()).map { it.toImmutable() },
                        prevLocation,
                        timestamp,
                        triggeredLocation,
                        triggeredTimestamp,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AssetEvent = apply {
                if (validated) {
                    return@apply
                }

                assetId()
                eventType().ifPresent { it.validate() }
                geofenceId()
                monitorId()
                monitorTags()
                prevLocation().ifPresent { it.validate() }
                timestamp()
                triggeredLocation().ifPresent { it.validate() }
                triggeredTimestamp()
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
                (if (assetId.asKnown().isPresent) 1 else 0) +
                    (eventType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (geofenceId.asKnown().isPresent) 1 else 0) +
                    (if (monitorId.asKnown().isPresent) 1 else 0) +
                    (monitorTags.asKnown().getOrNull()?.size ?: 0) +
                    (prevLocation.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (triggeredLocation.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (triggeredTimestamp.asKnown().isPresent) 1 else 0)

            /**
             * Nature of the event triggered by the asset. It can have following values:
             * - enter: When the asset enters a specific geofence
             * - exit: When the asset moves out of a specific geofence.
             * - speeding: When the asset exceeds the certain speed limit.
             * - idle: When the asset exhibits idle or no activity.
             */
            class EventType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val ENTER = of("enter")

                    @JvmField val EXIT = of("exit")

                    @JvmField val SPEEDING = of("speeding")

                    @JvmField val IDLE = of("idle")

                    @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
                }

                /** An enum containing [EventType]'s known values. */
                enum class Known {
                    ENTER,
                    EXIT,
                    SPEEDING,
                    IDLE,
                }

                /**
                 * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [EventType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ENTER,
                    EXIT,
                    SPEEDING,
                    IDLE,
                    /**
                     * An enum member indicating that [EventType] was instantiated with an unknown
                     * value.
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
                        ENTER -> Value.ENTER
                        EXIT -> Value.EXIT
                        SPEEDING -> Value.SPEEDING
                        IDLE -> Value.IDLE
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
                        ENTER -> Known.ENTER
                        EXIT -> Known.EXIT
                        SPEEDING -> Known.SPEEDING
                        IDLE -> Known.IDLE
                        else ->
                            throw NextbillionSdkInvalidDataException("Unknown EventType: $value")
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

                fun validate(): EventType = apply {
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

                    return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * An object with details of the asset at the last tracked location before the event was
             * triggered.
             */
            class PrevLocation
            private constructor(
                private val bearing: JsonField<Double>,
                private val location: JsonField<Location>,
                private val metaData: JsonValue,
                private val speed: JsonField<Double>,
                private val timestamp: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bearing")
                    @ExcludeMissing
                    bearing: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("location")
                    @ExcludeMissing
                    location: JsonField<Location> = JsonMissing.of(),
                    @JsonProperty("meta_data")
                    @ExcludeMissing
                    metaData: JsonValue = JsonMissing.of(),
                    @JsonProperty("speed")
                    @ExcludeMissing
                    speed: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<Long> = JsonMissing.of(),
                ) : this(bearing, location, metaData, speed, timestamp, mutableMapOf())

                /**
                 * If available, this property returns the heading of the asset from true north in
                 * clockwise direction, at the prev_location tracked for the asset.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun bearing(): Optional<Double> = bearing.getOptional("bearing")

                /**
                 * prev_location information of the asset.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun location(): Optional<Location> = location.getOptional("location")

                /** Returns the custom data added during the location information upload. */
                @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonValue = metaData

                /**
                 * If available, this property returns the speed of the asset, in meters per second,
                 * at the prev_location of the asset.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun speed(): Optional<Double> = speed.getOptional("speed")

                /**
                 * A UNIX epoch timestamp in milliseconds representing the time at which the asset
                 * was at the prev_location.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun timestamp(): Optional<Long> = timestamp.getOptional("timestamp")

                /**
                 * Returns the raw JSON value of [bearing].
                 *
                 * Unlike [bearing], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bearing") @ExcludeMissing fun _bearing(): JsonField<Double> = bearing

                /**
                 * Returns the raw JSON value of [location].
                 *
                 * Unlike [location], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("location")
                @ExcludeMissing
                fun _location(): JsonField<Location> = location

                /**
                 * Returns the raw JSON value of [speed].
                 *
                 * Unlike [speed], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("speed") @ExcludeMissing fun _speed(): JsonField<Double> = speed

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<Long> = timestamp

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

                    /** Returns a mutable builder for constructing an instance of [PrevLocation]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PrevLocation]. */
                class Builder internal constructor() {

                    private var bearing: JsonField<Double> = JsonMissing.of()
                    private var location: JsonField<Location> = JsonMissing.of()
                    private var metaData: JsonValue = JsonMissing.of()
                    private var speed: JsonField<Double> = JsonMissing.of()
                    private var timestamp: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(prevLocation: PrevLocation) = apply {
                        bearing = prevLocation.bearing
                        location = prevLocation.location
                        metaData = prevLocation.metaData
                        speed = prevLocation.speed
                        timestamp = prevLocation.timestamp
                        additionalProperties = prevLocation.additionalProperties.toMutableMap()
                    }

                    /**
                     * If available, this property returns the heading of the asset from true north
                     * in clockwise direction, at the prev_location tracked for the asset.
                     */
                    fun bearing(bearing: Double) = bearing(JsonField.of(bearing))

                    /**
                     * Sets [Builder.bearing] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bearing] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bearing(bearing: JsonField<Double>) = apply { this.bearing = bearing }

                    /** prev_location information of the asset. */
                    fun location(location: Location) = location(JsonField.of(location))

                    /**
                     * Sets [Builder.location] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.location] with a well-typed [Location] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun location(location: JsonField<Location>) = apply { this.location = location }

                    /** Returns the custom data added during the location information upload. */
                    fun metaData(metaData: JsonValue) = apply { this.metaData = metaData }

                    /**
                     * If available, this property returns the speed of the asset, in meters per
                     * second, at the prev_location of the asset.
                     */
                    fun speed(speed: Double) = speed(JsonField.of(speed))

                    /**
                     * Sets [Builder.speed] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.speed] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun speed(speed: JsonField<Double>) = apply { this.speed = speed }

                    /**
                     * A UNIX epoch timestamp in milliseconds representing the time at which the
                     * asset was at the prev_location.
                     */
                    fun timestamp(timestamp: Long) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<Long>) = apply { this.timestamp = timestamp }

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
                     * Returns an immutable instance of [PrevLocation].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): PrevLocation =
                        PrevLocation(
                            bearing,
                            location,
                            metaData,
                            speed,
                            timestamp,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): PrevLocation = apply {
                    if (validated) {
                        return@apply
                    }

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
                    (if (bearing.asKnown().isPresent) 1 else 0) +
                        (location.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (speed.asKnown().isPresent) 1 else 0) +
                        (if (timestamp.asKnown().isPresent) 1 else 0)

                /** prev_location information of the asset. */
                class Location
                private constructor(
                    private val lat: JsonField<Double>,
                    private val lon: JsonField<Double>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("lat")
                        @ExcludeMissing
                        lat: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("lon")
                        @ExcludeMissing
                        lon: JsonField<Double> = JsonMissing.of(),
                    ) : this(lat, lon, mutableMapOf())

                    /**
                     * Latitude of the prev_location tracked for the asset.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun lat(): Optional<Double> = lat.getOptional("lat")

                    /**
                     * Longitude of the prev_location tracked for the asset.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun lon(): Optional<Double> = lon.getOptional("lon")

                    /**
                     * Returns the raw JSON value of [lat].
                     *
                     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

                    /**
                     * Returns the raw JSON value of [lon].
                     *
                     * Unlike [lon], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(location: Location) = apply {
                            lat = location.lat
                            lon = location.lon
                            additionalProperties = location.additionalProperties.toMutableMap()
                        }

                        /** Latitude of the prev_location tracked for the asset. */
                        fun lat(lat: Double) = lat(JsonField.of(lat))

                        /**
                         * Sets [Builder.lat] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lat] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                        /** Longitude of the prev_location tracked for the asset. */
                        fun lon(lon: Double) = lon(JsonField.of(lon))

                        /**
                         * Sets [Builder.lon] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lon] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

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
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Location =
                            Location(lat, lon, additionalProperties.toMutableMap())
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
                        (if (lat.asKnown().isPresent) 1 else 0) +
                            (if (lon.asKnown().isPresent) 1 else 0)

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

                    return /* spotless:off */ other is PrevLocation && bearing == other.bearing && location == other.location && metaData == other.metaData && speed == other.speed && timestamp == other.timestamp && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(bearing, location, metaData, speed, timestamp, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PrevLocation{bearing=$bearing, location=$location, metaData=$metaData, speed=$speed, timestamp=$timestamp, additionalProperties=$additionalProperties}"
            }

            /**
             * An object with details of the asset at the location where the event was triggered.
             */
            class TriggeredLocation
            private constructor(
                private val bearing: JsonField<Double>,
                private val location: JsonField<Location>,
                private val metaData: JsonValue,
                private val speed: JsonField<Double>,
                private val timestamp: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bearing")
                    @ExcludeMissing
                    bearing: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("location")
                    @ExcludeMissing
                    location: JsonField<Location> = JsonMissing.of(),
                    @JsonProperty("meta_data")
                    @ExcludeMissing
                    metaData: JsonValue = JsonMissing.of(),
                    @JsonProperty("speed")
                    @ExcludeMissing
                    speed: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<Long> = JsonMissing.of(),
                ) : this(bearing, location, metaData, speed, timestamp, mutableMapOf())

                /**
                 * If available, this property returns the heading of the asset from true north in
                 * clockwise direction, when the event was triggered.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun bearing(): Optional<Double> = bearing.getOptional("bearing")

                /**
                 * An object with information about the location at which the event was triggered.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun location(): Optional<Location> = location.getOptional("location")

                /** Returns the custom data added during the location information upload. */
                @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonValue = metaData

                /**
                 * If available, this property returns the speed of the asset, in meters per second,
                 * when the event was triggered.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun speed(): Optional<Double> = speed.getOptional("speed")

                /**
                 * A UNIX epoch timestamp in milliseconds representing the time at which the asset
                 * was at the triggered_location.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun timestamp(): Optional<Long> = timestamp.getOptional("timestamp")

                /**
                 * Returns the raw JSON value of [bearing].
                 *
                 * Unlike [bearing], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bearing") @ExcludeMissing fun _bearing(): JsonField<Double> = bearing

                /**
                 * Returns the raw JSON value of [location].
                 *
                 * Unlike [location], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("location")
                @ExcludeMissing
                fun _location(): JsonField<Location> = location

                /**
                 * Returns the raw JSON value of [speed].
                 *
                 * Unlike [speed], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("speed") @ExcludeMissing fun _speed(): JsonField<Double> = speed

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<Long> = timestamp

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
                     * [TriggeredLocation].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TriggeredLocation]. */
                class Builder internal constructor() {

                    private var bearing: JsonField<Double> = JsonMissing.of()
                    private var location: JsonField<Location> = JsonMissing.of()
                    private var metaData: JsonValue = JsonMissing.of()
                    private var speed: JsonField<Double> = JsonMissing.of()
                    private var timestamp: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(triggeredLocation: TriggeredLocation) = apply {
                        bearing = triggeredLocation.bearing
                        location = triggeredLocation.location
                        metaData = triggeredLocation.metaData
                        speed = triggeredLocation.speed
                        timestamp = triggeredLocation.timestamp
                        additionalProperties = triggeredLocation.additionalProperties.toMutableMap()
                    }

                    /**
                     * If available, this property returns the heading of the asset from true north
                     * in clockwise direction, when the event was triggered.
                     */
                    fun bearing(bearing: Double) = bearing(JsonField.of(bearing))

                    /**
                     * Sets [Builder.bearing] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bearing] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bearing(bearing: JsonField<Double>) = apply { this.bearing = bearing }

                    /**
                     * An object with information about the location at which the event was
                     * triggered.
                     */
                    fun location(location: Location) = location(JsonField.of(location))

                    /**
                     * Sets [Builder.location] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.location] with a well-typed [Location] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun location(location: JsonField<Location>) = apply { this.location = location }

                    /** Returns the custom data added during the location information upload. */
                    fun metaData(metaData: JsonValue) = apply { this.metaData = metaData }

                    /**
                     * If available, this property returns the speed of the asset, in meters per
                     * second, when the event was triggered.
                     */
                    fun speed(speed: Double) = speed(JsonField.of(speed))

                    /**
                     * Sets [Builder.speed] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.speed] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun speed(speed: JsonField<Double>) = apply { this.speed = speed }

                    /**
                     * A UNIX epoch timestamp in milliseconds representing the time at which the
                     * asset was at the triggered_location.
                     */
                    fun timestamp(timestamp: Long) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<Long>) = apply { this.timestamp = timestamp }

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
                     * Returns an immutable instance of [TriggeredLocation].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): TriggeredLocation =
                        TriggeredLocation(
                            bearing,
                            location,
                            metaData,
                            speed,
                            timestamp,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): TriggeredLocation = apply {
                    if (validated) {
                        return@apply
                    }

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
                    (if (bearing.asKnown().isPresent) 1 else 0) +
                        (location.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (speed.asKnown().isPresent) 1 else 0) +
                        (if (timestamp.asKnown().isPresent) 1 else 0)

                /**
                 * An object with information about the location at which the event was triggered.
                 */
                class Location
                private constructor(
                    private val lat: JsonField<Double>,
                    private val lon: JsonField<Double>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("lat")
                        @ExcludeMissing
                        lat: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("lon")
                        @ExcludeMissing
                        lon: JsonField<Double> = JsonMissing.of(),
                    ) : this(lat, lon, mutableMapOf())

                    /**
                     * Latitude of the triggered_location of the event.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun lat(): Optional<Double> = lat.getOptional("lat")

                    /**
                     * Longitude of the triggered_location of the event.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun lon(): Optional<Double> = lon.getOptional("lon")

                    /**
                     * Returns the raw JSON value of [lat].
                     *
                     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

                    /**
                     * Returns the raw JSON value of [lon].
                     *
                     * Unlike [lon], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(location: Location) = apply {
                            lat = location.lat
                            lon = location.lon
                            additionalProperties = location.additionalProperties.toMutableMap()
                        }

                        /** Latitude of the triggered_location of the event. */
                        fun lat(lat: Double) = lat(JsonField.of(lat))

                        /**
                         * Sets [Builder.lat] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lat] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                        /** Longitude of the triggered_location of the event. */
                        fun lon(lon: Double) = lon(JsonField.of(lon))

                        /**
                         * Sets [Builder.lon] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.lon] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

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
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Location =
                            Location(lat, lon, additionalProperties.toMutableMap())
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
                        (if (lat.asKnown().isPresent) 1 else 0) +
                            (if (lon.asKnown().isPresent) 1 else 0)

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

                    return /* spotless:off */ other is TriggeredLocation && bearing == other.bearing && location == other.location && metaData == other.metaData && speed == other.speed && timestamp == other.timestamp && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(bearing, location, metaData, speed, timestamp, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TriggeredLocation{bearing=$bearing, location=$location, metaData=$metaData, speed=$speed, timestamp=$timestamp, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AssetEvent && assetId == other.assetId && eventType == other.eventType && extra == other.extra && geofenceId == other.geofenceId && monitorId == other.monitorId && monitorTags == other.monitorTags && prevLocation == other.prevLocation && timestamp == other.timestamp && triggeredLocation == other.triggeredLocation && triggeredTimestamp == other.triggeredTimestamp && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(assetId, eventType, extra, geofenceId, monitorId, monitorTags, prevLocation, timestamp, triggeredLocation, triggeredTimestamp, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AssetEvent{assetId=$assetId, eventType=$eventType, extra=$extra, geofenceId=$geofenceId, monitorId=$monitorId, monitorTags=$monitorTags, prevLocation=$prevLocation, timestamp=$timestamp, triggeredLocation=$triggeredLocation, triggeredTimestamp=$triggeredTimestamp, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && list == other.list && page == other.page && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(list, page, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{list=$list, page=$page, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListResponse && data == other.data && message == other.message && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, message, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventListResponse{data=$data, message=$message, status=$status, additionalProperties=$additionalProperties}"
}
