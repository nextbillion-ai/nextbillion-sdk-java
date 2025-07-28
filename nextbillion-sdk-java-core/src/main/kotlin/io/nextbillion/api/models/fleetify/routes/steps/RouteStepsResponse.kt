// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.fleetify.routes.steps

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.nextbillion.api.core.Enum
import io.nextbillion.api.core.ExcludeMissing
import io.nextbillion.api.core.JsonField
import io.nextbillion.api.core.JsonMissing
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.checkKnown
import io.nextbillion.api.core.toImmutable
import io.nextbillion.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RouteStepsResponse
private constructor(
    private val id: JsonField<String>,
    private val address: JsonField<String>,
    private val arrival: JsonField<Long>,
    private val completion: JsonField<Completion>,
    private val createdAt: JsonField<Long>,
    private val documentSnapshot: JsonField<List<JsonValue>>,
    private val duration: JsonField<Long>,
    private val location: JsonField<List<Double>>,
    private val meta: JsonField<Meta>,
    private val shortId: JsonField<String>,
    private val type: JsonField<String>,
    private val updatedAt: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
        @JsonProperty("arrival") @ExcludeMissing arrival: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("completion")
        @ExcludeMissing
        completion: JsonField<Completion> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("document_snapshot")
        @ExcludeMissing
        documentSnapshot: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("location")
        @ExcludeMissing
        location: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
        @JsonProperty("short_id") @ExcludeMissing shortId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        address,
        arrival,
        completion,
        createdAt,
        documentSnapshot,
        duration,
        location,
        meta,
        shortId,
        type,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Returns the unique ID of the step.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Returns the postal address where the step is executed. Its value is the same as that
     * specified in the input request when configuring the step details.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun address(): Optional<String> = address.getOptional("address")

    /**
     * Returns the scheduled arrival time of the driver at the step as an UNIX timestamp, in seconds
     * precision. It is the same as that specified in the input request while configuring the step
     * details.
     *
     * The timestamp returned here is only for informative display on the driver's app and it does
     * not impact or get affected by the route generated.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun arrival(): Optional<Long> = arrival.getOptional("arrival")

    /**
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun completion(): Optional<Completion> = completion.getOptional("completion")

    /**
     * Represents the timestamp of the creation in seconds since the Unix epoch. Example:
     * `1738743999`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun createdAt(): Optional<Long> = createdAt.getOptional("created_at")

    /**
     * Returns the details of the document that was used for collecting the proof of completion for
     * the step. In case no document template ID was provided for the given step, then a `null`
     * value is returned. Each object represents a new field in the document.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documentSnapshot(): Optional<List<JsonValue>> =
        documentSnapshot.getOptional("document_snapshot")

    /**
     * Returns the duration for `layover` or `break` type steps.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun duration(): Optional<Long> = duration.getOptional("duration")

    /**
     * Returns the location coordinates where the step is executed.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun location(): Optional<List<Double>> = location.getOptional("location")

    /**
     * An object returning custom details about the step that were configured in the input request
     * while configuring the step details. The information returned here will be available for
     * display on the Driver's app under step details.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun meta(): Optional<Meta> = meta.getOptional("meta")

    /**
     * Returns a unique short ID of the step for easier referencing and displaying purposes.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun shortId(): Optional<String> = shortId.getOptional("short_id")

    /**
     * Returns the step type. It can belong to one of the following: `start`, `job` , `pickup`,
     * `delivery`, `break`, `layover` , and `end`. For any given step, it would be the same as that
     * specified in the input request while configuring the step details.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * Represents the timestamp of the last update in seconds since the Unix epoch. Example:
     * `1738743999`.
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
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

    /**
     * Returns the raw JSON value of [arrival].
     *
     * Unlike [arrival], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arrival") @ExcludeMissing fun _arrival(): JsonField<Long> = arrival

    /**
     * Returns the raw JSON value of [completion].
     *
     * Unlike [completion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completion")
    @ExcludeMissing
    fun _completion(): JsonField<Completion> = completion

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [documentSnapshot].
     *
     * Unlike [documentSnapshot], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("document_snapshot")
    @ExcludeMissing
    fun _documentSnapshot(): JsonField<List<JsonValue>> = documentSnapshot

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<List<Double>> = location

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

    /**
     * Returns the raw JSON value of [shortId].
     *
     * Unlike [shortId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("short_id") @ExcludeMissing fun _shortId(): JsonField<String> = shortId

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

        /** Returns a mutable builder for constructing an instance of [RouteStepsResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RouteStepsResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var address: JsonField<String> = JsonMissing.of()
        private var arrival: JsonField<Long> = JsonMissing.of()
        private var completion: JsonField<Completion> = JsonMissing.of()
        private var createdAt: JsonField<Long> = JsonMissing.of()
        private var documentSnapshot: JsonField<MutableList<JsonValue>>? = null
        private var duration: JsonField<Long> = JsonMissing.of()
        private var location: JsonField<MutableList<Double>>? = null
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var shortId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(routeStepsResponse: RouteStepsResponse) = apply {
            id = routeStepsResponse.id
            address = routeStepsResponse.address
            arrival = routeStepsResponse.arrival
            completion = routeStepsResponse.completion
            createdAt = routeStepsResponse.createdAt
            documentSnapshot = routeStepsResponse.documentSnapshot.map { it.toMutableList() }
            duration = routeStepsResponse.duration
            location = routeStepsResponse.location.map { it.toMutableList() }
            meta = routeStepsResponse.meta
            shortId = routeStepsResponse.shortId
            type = routeStepsResponse.type
            updatedAt = routeStepsResponse.updatedAt
            additionalProperties = routeStepsResponse.additionalProperties.toMutableMap()
        }

        /** Returns the unique ID of the step. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Returns the postal address where the step is executed. Its value is the same as that
         * specified in the input request when configuring the step details.
         */
        fun address(address: String) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<String>) = apply { this.address = address }

        /**
         * Returns the scheduled arrival time of the driver at the step as an UNIX timestamp, in
         * seconds precision. It is the same as that specified in the input request while
         * configuring the step details.
         *
         * The timestamp returned here is only for informative display on the driver's app and it
         * does not impact or get affected by the route generated.
         */
        fun arrival(arrival: Long) = arrival(JsonField.of(arrival))

        /**
         * Sets [Builder.arrival] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arrival] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun arrival(arrival: JsonField<Long>) = apply { this.arrival = arrival }

        fun completion(completion: Completion) = completion(JsonField.of(completion))

        /**
         * Sets [Builder.completion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completion] with a well-typed [Completion] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completion(completion: JsonField<Completion>) = apply { this.completion = completion }

        /**
         * Represents the timestamp of the creation in seconds since the Unix epoch. Example:
         * `1738743999`.
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
         * Returns the details of the document that was used for collecting the proof of completion
         * for the step. In case no document template ID was provided for the given step, then a
         * `null` value is returned. Each object represents a new field in the document.
         */
        fun documentSnapshot(documentSnapshot: List<JsonValue>) =
            documentSnapshot(JsonField.of(documentSnapshot))

        /**
         * Sets [Builder.documentSnapshot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentSnapshot] with a well-typed `List<JsonValue>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documentSnapshot(documentSnapshot: JsonField<List<JsonValue>>) = apply {
            this.documentSnapshot = documentSnapshot.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [Builder.documentSnapshot].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocumentSnapshot(documentSnapshot: JsonValue) = apply {
            this.documentSnapshot =
                (this.documentSnapshot ?: JsonField.of(mutableListOf())).also {
                    checkKnown("documentSnapshot", it).add(documentSnapshot)
                }
        }

        /** Returns the duration for `layover` or `break` type steps. */
        fun duration(duration: Long) = duration(JsonField.of(duration))

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

        /** Returns the location coordinates where the step is executed. */
        fun location(location: List<Double>) = location(JsonField.of(location))

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun location(location: JsonField<List<Double>>) = apply {
            this.location = location.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.location].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLocation(location: Double) = apply {
            this.location =
                (this.location ?: JsonField.of(mutableListOf())).also {
                    checkKnown("location", it).add(location)
                }
        }

        /**
         * An object returning custom details about the step that were configured in the input
         * request while configuring the step details. The information returned here will be
         * available for display on the Driver's app under step details.
         */
        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

        /** Returns a unique short ID of the step for easier referencing and displaying purposes. */
        fun shortId(shortId: String) = shortId(JsonField.of(shortId))

        /**
         * Sets [Builder.shortId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun shortId(shortId: JsonField<String>) = apply { this.shortId = shortId }

        /**
         * Returns the step type. It can belong to one of the following: `start`, `job` , `pickup`,
         * `delivery`, `break`, `layover` , and `end`. For any given step, it would be the same as
         * that specified in the input request while configuring the step details.
         */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /**
         * Represents the timestamp of the last update in seconds since the Unix epoch. Example:
         * `1738743999`.
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
         * Returns an immutable instance of [RouteStepsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RouteStepsResponse =
            RouteStepsResponse(
                id,
                address,
                arrival,
                completion,
                createdAt,
                (documentSnapshot ?: JsonMissing.of()).map { it.toImmutable() },
                duration,
                (location ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
                shortId,
                type,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RouteStepsResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        address()
        arrival()
        completion().ifPresent { it.validate() }
        createdAt()
        documentSnapshot()
        duration()
        location()
        meta().ifPresent { it.validate() }
        shortId()
        type()
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
            (if (address.asKnown().isPresent) 1 else 0) +
            (if (arrival.asKnown().isPresent) 1 else 0) +
            (completion.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (documentSnapshot.asKnown().getOrNull()?.size ?: 0) +
            (if (duration.asKnown().isPresent) 1 else 0) +
            (location.asKnown().getOrNull()?.size ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0) +
            (if (shortId.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class Completion
    private constructor(
        private val completedAt: JsonField<Long>,
        private val completedByMode: JsonField<RouteStepCompletionMode>,
        private val completionMode: JsonField<RouteStepCompletionMode>,
        private val document: JsonValue,
        private val documentModifiedAt: JsonField<Long>,
        private val geofenceConfig: JsonField<RouteStepGeofenceConfig>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("completed_at")
            @ExcludeMissing
            completedAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("completed_by_mode")
            @ExcludeMissing
            completedByMode: JsonField<RouteStepCompletionMode> = JsonMissing.of(),
            @JsonProperty("completion_mode")
            @ExcludeMissing
            completionMode: JsonField<RouteStepCompletionMode> = JsonMissing.of(),
            @JsonProperty("document") @ExcludeMissing document: JsonValue = JsonMissing.of(),
            @JsonProperty("document_modified_at")
            @ExcludeMissing
            documentModifiedAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("geofence_config")
            @ExcludeMissing
            geofenceConfig: JsonField<RouteStepGeofenceConfig> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(
            completedAt,
            completedByMode,
            completionMode,
            document,
            documentModifiedAt,
            geofenceConfig,
            status,
            mutableMapOf(),
        )

        /**
         * Represents the timestamp of the completion in seconds since the Unix epoch. Example:
         * `1738743999`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun completedAt(): Optional<Long> = completedAt.getOptional("completed_at")

        /**
         * Specify the mode of completion to be used for the step. Currently, following values are
         * allowed:
         * - `manual`: Steps must be marked as completed manually through the Driver App.
         * - `geofence`: Steps are marked as completed automatically based on the entry conditions
         *   and geofence specified.
         * - `geofence_manual_fallback`: Steps will be marked as completed automatically based on
         *   geofence and entry condition configurations but there will also be a provision for
         *   manually updating the status in case, geofence detection fails.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun completedByMode(): Optional<RouteStepCompletionMode> =
            completedByMode.getOptional("completed_by_mode")

        /**
         * Specify the mode of completion to be used for the step. Currently, following values are
         * allowed:
         * - `manual`: Steps must be marked as completed manually through the Driver App.
         * - `geofence`: Steps are marked as completed automatically based on the entry conditions
         *   and geofence specified.
         * - `geofence_manual_fallback`: Steps will be marked as completed automatically based on
         *   geofence and entry condition configurations but there will also be a provision for
         *   manually updating the status in case, geofence detection fails.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun completionMode(): Optional<RouteStepCompletionMode> =
            completionMode.getOptional("completion_mode")

        /**
         * A key-value map storing form submission data, where keys correspond to field labels and
         * values can be of any type depend on the type of according document item.
         */
        @JsonProperty("document") @ExcludeMissing fun _document(): JsonValue = document

        /**
         * Represents the timestamp of the last doc modification in seconds since the Unix epoch.
         * Example: `1738743999`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun documentModifiedAt(): Optional<Long> =
            documentModifiedAt.getOptional("document_modified_at")

        /**
         * Specify the configurations of the geofence which will be used to detect presence of the
         * driver and complete the tasks automatically. Please note that this attribute is required
         * when `completion_mode` is either "geofence" or "geofence_manual_fallback".
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geofenceConfig(): Optional<RouteStepGeofenceConfig> =
            geofenceConfig.getOptional("geofence_config")

        /**
         * Status of the step.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [completedAt].
         *
         * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("completed_at")
        @ExcludeMissing
        fun _completedAt(): JsonField<Long> = completedAt

        /**
         * Returns the raw JSON value of [completedByMode].
         *
         * Unlike [completedByMode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("completed_by_mode")
        @ExcludeMissing
        fun _completedByMode(): JsonField<RouteStepCompletionMode> = completedByMode

        /**
         * Returns the raw JSON value of [completionMode].
         *
         * Unlike [completionMode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("completion_mode")
        @ExcludeMissing
        fun _completionMode(): JsonField<RouteStepCompletionMode> = completionMode

        /**
         * Returns the raw JSON value of [documentModifiedAt].
         *
         * Unlike [documentModifiedAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("document_modified_at")
        @ExcludeMissing
        fun _documentModifiedAt(): JsonField<Long> = documentModifiedAt

        /**
         * Returns the raw JSON value of [geofenceConfig].
         *
         * Unlike [geofenceConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("geofence_config")
        @ExcludeMissing
        fun _geofenceConfig(): JsonField<RouteStepGeofenceConfig> = geofenceConfig

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

            /** Returns a mutable builder for constructing an instance of [Completion]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Completion]. */
        class Builder internal constructor() {

            private var completedAt: JsonField<Long> = JsonMissing.of()
            private var completedByMode: JsonField<RouteStepCompletionMode> = JsonMissing.of()
            private var completionMode: JsonField<RouteStepCompletionMode> = JsonMissing.of()
            private var document: JsonValue = JsonMissing.of()
            private var documentModifiedAt: JsonField<Long> = JsonMissing.of()
            private var geofenceConfig: JsonField<RouteStepGeofenceConfig> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(completion: Completion) = apply {
                completedAt = completion.completedAt
                completedByMode = completion.completedByMode
                completionMode = completion.completionMode
                document = completion.document
                documentModifiedAt = completion.documentModifiedAt
                geofenceConfig = completion.geofenceConfig
                status = completion.status
                additionalProperties = completion.additionalProperties.toMutableMap()
            }

            /**
             * Represents the timestamp of the completion in seconds since the Unix epoch. Example:
             * `1738743999`.
             */
            fun completedAt(completedAt: Long) = completedAt(JsonField.of(completedAt))

            /**
             * Sets [Builder.completedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completedAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun completedAt(completedAt: JsonField<Long>) = apply { this.completedAt = completedAt }

            /**
             * Specify the mode of completion to be used for the step. Currently, following values
             * are allowed:
             * - `manual`: Steps must be marked as completed manually through the Driver App.
             * - `geofence`: Steps are marked as completed automatically based on the entry
             *   conditions and geofence specified.
             * - `geofence_manual_fallback`: Steps will be marked as completed automatically based
             *   on geofence and entry condition configurations but there will also be a provision
             *   for manually updating the status in case, geofence detection fails.
             */
            fun completedByMode(completedByMode: RouteStepCompletionMode) =
                completedByMode(JsonField.of(completedByMode))

            /**
             * Sets [Builder.completedByMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completedByMode] with a well-typed
             * [RouteStepCompletionMode] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun completedByMode(completedByMode: JsonField<RouteStepCompletionMode>) = apply {
                this.completedByMode = completedByMode
            }

            /**
             * Specify the mode of completion to be used for the step. Currently, following values
             * are allowed:
             * - `manual`: Steps must be marked as completed manually through the Driver App.
             * - `geofence`: Steps are marked as completed automatically based on the entry
             *   conditions and geofence specified.
             * - `geofence_manual_fallback`: Steps will be marked as completed automatically based
             *   on geofence and entry condition configurations but there will also be a provision
             *   for manually updating the status in case, geofence detection fails.
             */
            fun completionMode(completionMode: RouteStepCompletionMode) =
                completionMode(JsonField.of(completionMode))

            /**
             * Sets [Builder.completionMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completionMode] with a well-typed
             * [RouteStepCompletionMode] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun completionMode(completionMode: JsonField<RouteStepCompletionMode>) = apply {
                this.completionMode = completionMode
            }

            /**
             * A key-value map storing form submission data, where keys correspond to field labels
             * and values can be of any type depend on the type of according document item.
             */
            fun document(document: JsonValue) = apply { this.document = document }

            /**
             * Represents the timestamp of the last doc modification in seconds since the Unix
             * epoch. Example: `1738743999`.
             */
            fun documentModifiedAt(documentModifiedAt: Long) =
                documentModifiedAt(JsonField.of(documentModifiedAt))

            /**
             * Sets [Builder.documentModifiedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentModifiedAt] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentModifiedAt(documentModifiedAt: JsonField<Long>) = apply {
                this.documentModifiedAt = documentModifiedAt
            }

            /**
             * Specify the configurations of the geofence which will be used to detect presence of
             * the driver and complete the tasks automatically. Please note that this attribute is
             * required when `completion_mode` is either "geofence" or "geofence_manual_fallback".
             */
            fun geofenceConfig(geofenceConfig: RouteStepGeofenceConfig) =
                geofenceConfig(JsonField.of(geofenceConfig))

            /**
             * Sets [Builder.geofenceConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geofenceConfig] with a well-typed
             * [RouteStepGeofenceConfig] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun geofenceConfig(geofenceConfig: JsonField<RouteStepGeofenceConfig>) = apply {
                this.geofenceConfig = geofenceConfig
            }

            /** Status of the step. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [Completion].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Completion =
                Completion(
                    completedAt,
                    completedByMode,
                    completionMode,
                    document,
                    documentModifiedAt,
                    geofenceConfig,
                    status,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Completion = apply {
            if (validated) {
                return@apply
            }

            completedAt()
            completedByMode().ifPresent { it.validate() }
            completionMode().ifPresent { it.validate() }
            documentModifiedAt()
            geofenceConfig().ifPresent { it.validate() }
            status().ifPresent { it.validate() }
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
            (if (completedAt.asKnown().isPresent) 1 else 0) +
                (completedByMode.asKnown().getOrNull()?.validity() ?: 0) +
                (completionMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (documentModifiedAt.asKnown().isPresent) 1 else 0) +
                (geofenceConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        /** Status of the step. */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SCHEDULED = of("scheduled")

                @JvmField val COMPLETED = of("completed")

                @JvmField val CANCELED = of("canceled")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                SCHEDULED,
                COMPLETED,
                CANCELED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SCHEDULED,
                COMPLETED,
                CANCELED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SCHEDULED -> Value.SCHEDULED
                    COMPLETED -> Value.COMPLETED
                    CANCELED -> Value.CANCELED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws NextbillionSdkInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    SCHEDULED -> Known.SCHEDULED
                    COMPLETED -> Known.COMPLETED
                    CANCELED -> Known.CANCELED
                    else -> throw NextbillionSdkInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws NextbillionSdkInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
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

            return /* spotless:off */ other is Completion && completedAt == other.completedAt && completedByMode == other.completedByMode && completionMode == other.completionMode && document == other.document && documentModifiedAt == other.documentModifiedAt && geofenceConfig == other.geofenceConfig && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(completedAt, completedByMode, completionMode, document, documentModifiedAt, geofenceConfig, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Completion{completedAt=$completedAt, completedByMode=$completedByMode, completionMode=$completionMode, document=$document, documentModifiedAt=$documentModifiedAt, geofenceConfig=$geofenceConfig, status=$status, additionalProperties=$additionalProperties}"
    }

    /**
     * An object returning custom details about the step that were configured in the input request
     * while configuring the step details. The information returned here will be available for
     * display on the Driver's app under step details.
     */
    class Meta
    private constructor(
        private val customerName: JsonField<String>,
        private val customerPhoneNumber: JsonField<String>,
        private val instructions: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_name")
            @ExcludeMissing
            customerName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_phone_number")
            @ExcludeMissing
            customerPhoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("instructions")
            @ExcludeMissing
            instructions: JsonField<String> = JsonMissing.of(),
        ) : this(customerName, customerPhoneNumber, instructions, mutableMapOf())

        /**
         * Returns the customer name associated with the step. It can configured in the input
         * request using the `metadata` attribute of the step.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerName(): Optional<String> = customerName.getOptional("customer_name")

        /**
         * Returns the customer's phone number associated with the step. It can configured in the
         * input request using the `metadata` attribute of the step.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerPhoneNumber(): Optional<String> =
            customerPhoneNumber.getOptional("customer_phone_number")

        /**
         * Returns the custom instructions to carry out while performing the task. These
         * instructions can be provided at the time of configuring the step details in the input
         * request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun instructions(): Optional<String> = instructions.getOptional("instructions")

        /**
         * Returns the raw JSON value of [customerName].
         *
         * Unlike [customerName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_name")
        @ExcludeMissing
        fun _customerName(): JsonField<String> = customerName

        /**
         * Returns the raw JSON value of [customerPhoneNumber].
         *
         * Unlike [customerPhoneNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("customer_phone_number")
        @ExcludeMissing
        fun _customerPhoneNumber(): JsonField<String> = customerPhoneNumber

        /**
         * Returns the raw JSON value of [instructions].
         *
         * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instructions")
        @ExcludeMissing
        fun _instructions(): JsonField<String> = instructions

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

            /** Returns a mutable builder for constructing an instance of [Meta]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var customerName: JsonField<String> = JsonMissing.of()
            private var customerPhoneNumber: JsonField<String> = JsonMissing.of()
            private var instructions: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                customerName = meta.customerName
                customerPhoneNumber = meta.customerPhoneNumber
                instructions = meta.instructions
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            /**
             * Returns the customer name associated with the step. It can configured in the input
             * request using the `metadata` attribute of the step.
             */
            fun customerName(customerName: String) = customerName(JsonField.of(customerName))

            /**
             * Sets [Builder.customerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerName(customerName: JsonField<String>) = apply {
                this.customerName = customerName
            }

            /**
             * Returns the customer's phone number associated with the step. It can configured in
             * the input request using the `metadata` attribute of the step.
             */
            fun customerPhoneNumber(customerPhoneNumber: String) =
                customerPhoneNumber(JsonField.of(customerPhoneNumber))

            /**
             * Sets [Builder.customerPhoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerPhoneNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun customerPhoneNumber(customerPhoneNumber: JsonField<String>) = apply {
                this.customerPhoneNumber = customerPhoneNumber
            }

            /**
             * Returns the custom instructions to carry out while performing the task. These
             * instructions can be provided at the time of configuring the step details in the input
             * request.
             */
            fun instructions(instructions: String) = instructions(JsonField.of(instructions))

            /**
             * Sets [Builder.instructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructions] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instructions(instructions: JsonField<String>) = apply {
                this.instructions = instructions
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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Meta =
                Meta(
                    customerName,
                    customerPhoneNumber,
                    instructions,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            customerName()
            customerPhoneNumber()
            instructions()
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
            (if (customerName.asKnown().isPresent) 1 else 0) +
                (if (customerPhoneNumber.asKnown().isPresent) 1 else 0) +
                (if (instructions.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Meta && customerName == other.customerName && customerPhoneNumber == other.customerPhoneNumber && instructions == other.instructions && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerName, customerPhoneNumber, instructions, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{customerName=$customerName, customerPhoneNumber=$customerPhoneNumber, instructions=$instructions, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RouteStepsResponse && id == other.id && address == other.address && arrival == other.arrival && completion == other.completion && createdAt == other.createdAt && documentSnapshot == other.documentSnapshot && duration == other.duration && location == other.location && meta == other.meta && shortId == other.shortId && type == other.type && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, address, arrival, completion, createdAt, documentSnapshot, duration, location, meta, shortId, type, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RouteStepsResponse{id=$id, address=$address, arrival=$arrival, completion=$completion, createdAt=$createdAt, documentSnapshot=$documentSnapshot, duration=$duration, location=$location, meta=$meta, shortId=$shortId, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
