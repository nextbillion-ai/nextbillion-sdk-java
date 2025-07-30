// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes.steps

import ai.nextbillion.core.Enum
import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.Params
import ai.nextbillion.core.checkKnown
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.http.Headers
import ai.nextbillion.core.http.QueryParams
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

/** Update a step */
class StepUpdateParams
private constructor(
    private val routeId: String,
    private val stepId: String?,
    private val key: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun routeId(): String = routeId

    fun stepId(): Optional<String> = Optional.ofNullable(stepId)

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * Specify the scheduled arrival time of the driver, as an UNIX timestamp in seconds, at the
     * step. Please note that:
     * - Arrival time for each step should be equal to or greater than the previous step.
     * - Past times can not be provided.
     * - The time provided is used only for informative display on the driver app and it does not
     *   impact or get affected by the route generated.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun arrival(): Long = body.arrival()

    /**
     * Specify the new position of the step. Provide a position different from the current position
     * of the step to update sequence in which the step get completed.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun position(): Long = body.position()

    /**
     * Specify the postal address for the step.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun address(): Optional<String> = body.address()

    /**
     * Specify the mode of completion to be used for the step. Currently, following values are
     * allowed:
     * - manual: Steps must be marked as completed manually through the Driver App.
     * - geofence: Steps are marked as completed automatically based on the entry conditions and
     *   geofence specified.
     * - geofence_manual_fallback: Steps will be marked as completed automatically based on geofence
     *   and entry condition configurations but there will also be a provision for manually updating
     *   the status in case, geofence detection fails.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun completionMode(): Optional<RouteStepCompletionMode> = body.completionMode()

    /**
     * Update the ID of the document template to be used for collecting proof of completion for the
     * step. If an empty string "" is provided, the current document template associated to the step
     * will be removed.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documentTemplateId(): Optional<String> = body.documentTemplateId()

    /**
     * Specify the duration of the layover or break type steps, in seconds. Please note it is
     * mandatory when step type is either "layover" or "break".
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun duration(): Optional<Long> = body.duration()

    /**
     * Specify the configurations of the geofence which will be used to detect presence of the
     * driver and complete the tasks automatically. Please note that this attribute is required when
     * completion_mode is either "geofence" or "geofence_manual_fallback".
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun geofenceConfig(): Optional<RouteStepGeofenceConfig> = body.geofenceConfig()

    /**
     * Specify the location coordinates where the steps should be performed in
     * [latitude, longitude].
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun location(): Optional<List<Double>> = body.location()

    /**
     * An object to specify any additional details about the task to be associated with the step in
     * the response. The information provided here will be available on the Driver's app under step
     * details. This attribute can be used to provide context about or instructions to the driver
     * for performing the task
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun meta(): Optional<Meta> = body.meta()

    /**
     * Specify the step type. It can belong to one of the following: start, job , pickup, delivery,
     * end. A duration is mandatory when the step type is either layover or a break.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): Optional<Type> = body.type()

    /**
     * Returns the raw JSON value of [arrival].
     *
     * Unlike [arrival], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _arrival(): JsonField<Long> = body._arrival()

    /**
     * Returns the raw JSON value of [position].
     *
     * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _position(): JsonField<Long> = body._position()

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _address(): JsonField<String> = body._address()

    /**
     * Returns the raw JSON value of [completionMode].
     *
     * Unlike [completionMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _completionMode(): JsonField<RouteStepCompletionMode> = body._completionMode()

    /**
     * Returns the raw JSON value of [documentTemplateId].
     *
     * Unlike [documentTemplateId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _documentTemplateId(): JsonField<String> = body._documentTemplateId()

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _duration(): JsonField<Long> = body._duration()

    /**
     * Returns the raw JSON value of [geofenceConfig].
     *
     * Unlike [geofenceConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _geofenceConfig(): JsonField<RouteStepGeofenceConfig> = body._geofenceConfig()

    /**
     * Returns the raw JSON value of [location].
     *
     * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _location(): JsonField<List<Double>> = body._location()

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _meta(): JsonField<Meta> = body._meta()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StepUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .routeId()
         * .key()
         * .arrival()
         * .position()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StepUpdateParams]. */
    class Builder internal constructor() {

        private var routeId: String? = null
        private var stepId: String? = null
        private var key: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(stepUpdateParams: StepUpdateParams) = apply {
            routeId = stepUpdateParams.routeId
            stepId = stepUpdateParams.stepId
            key = stepUpdateParams.key
            body = stepUpdateParams.body.toBuilder()
            additionalHeaders = stepUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = stepUpdateParams.additionalQueryParams.toBuilder()
        }

        fun routeId(routeId: String) = apply { this.routeId = routeId }

        fun stepId(stepId: String?) = apply { this.stepId = stepId }

        /** Alias for calling [Builder.stepId] with `stepId.orElse(null)`. */
        fun stepId(stepId: Optional<String>) = stepId(stepId.getOrNull())

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [arrival]
         * - [position]
         * - [address]
         * - [completionMode]
         * - [documentTemplateId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Specify the scheduled arrival time of the driver, as an UNIX timestamp in seconds, at the
         * step. Please note that:
         * - Arrival time for each step should be equal to or greater than the previous step.
         * - Past times can not be provided.
         * - The time provided is used only for informative display on the driver app and it does
         *   not impact or get affected by the route generated.
         */
        fun arrival(arrival: Long) = apply { body.arrival(arrival) }

        /**
         * Sets [Builder.arrival] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arrival] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun arrival(arrival: JsonField<Long>) = apply { body.arrival(arrival) }

        /**
         * Specify the new position of the step. Provide a position different from the current
         * position of the step to update sequence in which the step get completed.
         */
        fun position(position: Long) = apply { body.position(position) }

        /**
         * Sets [Builder.position] to an arbitrary JSON value.
         *
         * You should usually call [Builder.position] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun position(position: JsonField<Long>) = apply { body.position(position) }

        /** Specify the postal address for the step. */
        fun address(address: String) = apply { body.address(address) }

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<String>) = apply { body.address(address) }

        /**
         * Specify the mode of completion to be used for the step. Currently, following values are
         * allowed:
         * - manual: Steps must be marked as completed manually through the Driver App.
         * - geofence: Steps are marked as completed automatically based on the entry conditions and
         *   geofence specified.
         * - geofence_manual_fallback: Steps will be marked as completed automatically based on
         *   geofence and entry condition configurations but there will also be a provision for
         *   manually updating the status in case, geofence detection fails.
         */
        fun completionMode(completionMode: RouteStepCompletionMode) = apply {
            body.completionMode(completionMode)
        }

        /**
         * Sets [Builder.completionMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionMode] with a well-typed
         * [RouteStepCompletionMode] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun completionMode(completionMode: JsonField<RouteStepCompletionMode>) = apply {
            body.completionMode(completionMode)
        }

        /**
         * Update the ID of the document template to be used for collecting proof of completion for
         * the step. If an empty string "" is provided, the current document template associated to
         * the step will be removed.
         */
        fun documentTemplateId(documentTemplateId: String) = apply {
            body.documentTemplateId(documentTemplateId)
        }

        /**
         * Sets [Builder.documentTemplateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentTemplateId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentTemplateId(documentTemplateId: JsonField<String>) = apply {
            body.documentTemplateId(documentTemplateId)
        }

        /**
         * Specify the duration of the layover or break type steps, in seconds. Please note it is
         * mandatory when step type is either "layover" or "break".
         */
        fun duration(duration: Long) = apply { body.duration(duration) }

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<Long>) = apply { body.duration(duration) }

        /**
         * Specify the configurations of the geofence which will be used to detect presence of the
         * driver and complete the tasks automatically. Please note that this attribute is required
         * when completion_mode is either "geofence" or "geofence_manual_fallback".
         */
        fun geofenceConfig(geofenceConfig: RouteStepGeofenceConfig) = apply {
            body.geofenceConfig(geofenceConfig)
        }

        /**
         * Sets [Builder.geofenceConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geofenceConfig] with a well-typed
         * [RouteStepGeofenceConfig] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun geofenceConfig(geofenceConfig: JsonField<RouteStepGeofenceConfig>) = apply {
            body.geofenceConfig(geofenceConfig)
        }

        /**
         * Specify the location coordinates where the steps should be performed in
         * [latitude, longitude].
         */
        fun location(location: List<Double>) = apply { body.location(location) }

        /**
         * Sets [Builder.location] to an arbitrary JSON value.
         *
         * You should usually call [Builder.location] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun location(location: JsonField<List<Double>>) = apply { body.location(location) }

        /**
         * Adds a single [Double] to [Builder.location].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLocation(location: Double) = apply { body.addLocation(location) }

        /**
         * An object to specify any additional details about the task to be associated with the step
         * in the response. The information provided here will be available on the Driver's app
         * under step details. This attribute can be used to provide context about or instructions
         * to the driver for performing the task
         */
        fun meta(meta: Meta) = apply { body.meta(meta) }

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { body.meta(meta) }

        /**
         * Specify the step type. It can belong to one of the following: start, job , pickup,
         * delivery, end. A duration is mandatory when the step type is either layover or a break.
         */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

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
         * Returns an immutable instance of [StepUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .routeId()
         * .key()
         * .arrival()
         * .position()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StepUpdateParams =
            StepUpdateParams(
                checkRequired("routeId", routeId),
                stepId,
                checkRequired("key", key),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> routeId
            1 -> stepId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    private constructor(
        private val arrival: JsonField<Long>,
        private val position: JsonField<Long>,
        private val address: JsonField<String>,
        private val completionMode: JsonField<RouteStepCompletionMode>,
        private val documentTemplateId: JsonField<String>,
        private val duration: JsonField<Long>,
        private val geofenceConfig: JsonField<RouteStepGeofenceConfig>,
        private val location: JsonField<List<Double>>,
        private val meta: JsonField<Meta>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("arrival") @ExcludeMissing arrival: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("position") @ExcludeMissing position: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
            @JsonProperty("completion_mode")
            @ExcludeMissing
            completionMode: JsonField<RouteStepCompletionMode> = JsonMissing.of(),
            @JsonProperty("document_template_id")
            @ExcludeMissing
            documentTemplateId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("duration") @ExcludeMissing duration: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("geofence_config")
            @ExcludeMissing
            geofenceConfig: JsonField<RouteStepGeofenceConfig> = JsonMissing.of(),
            @JsonProperty("location")
            @ExcludeMissing
            location: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(
            arrival,
            position,
            address,
            completionMode,
            documentTemplateId,
            duration,
            geofenceConfig,
            location,
            meta,
            type,
            mutableMapOf(),
        )

        /**
         * Specify the scheduled arrival time of the driver, as an UNIX timestamp in seconds, at the
         * step. Please note that:
         * - Arrival time for each step should be equal to or greater than the previous step.
         * - Past times can not be provided.
         * - The time provided is used only for informative display on the driver app and it does
         *   not impact or get affected by the route generated.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun arrival(): Long = arrival.getRequired("arrival")

        /**
         * Specify the new position of the step. Provide a position different from the current
         * position of the step to update sequence in which the step get completed.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun position(): Long = position.getRequired("position")

        /**
         * Specify the postal address for the step.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun address(): Optional<String> = address.getOptional("address")

        /**
         * Specify the mode of completion to be used for the step. Currently, following values are
         * allowed:
         * - manual: Steps must be marked as completed manually through the Driver App.
         * - geofence: Steps are marked as completed automatically based on the entry conditions and
         *   geofence specified.
         * - geofence_manual_fallback: Steps will be marked as completed automatically based on
         *   geofence and entry condition configurations but there will also be a provision for
         *   manually updating the status in case, geofence detection fails.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun completionMode(): Optional<RouteStepCompletionMode> =
            completionMode.getOptional("completion_mode")

        /**
         * Update the ID of the document template to be used for collecting proof of completion for
         * the step. If an empty string "" is provided, the current document template associated to
         * the step will be removed.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun documentTemplateId(): Optional<String> =
            documentTemplateId.getOptional("document_template_id")

        /**
         * Specify the duration of the layover or break type steps, in seconds. Please note it is
         * mandatory when step type is either "layover" or "break".
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun duration(): Optional<Long> = duration.getOptional("duration")

        /**
         * Specify the configurations of the geofence which will be used to detect presence of the
         * driver and complete the tasks automatically. Please note that this attribute is required
         * when completion_mode is either "geofence" or "geofence_manual_fallback".
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geofenceConfig(): Optional<RouteStepGeofenceConfig> =
            geofenceConfig.getOptional("geofence_config")

        /**
         * Specify the location coordinates where the steps should be performed in
         * [latitude, longitude].
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun location(): Optional<List<Double>> = location.getOptional("location")

        /**
         * An object to specify any additional details about the task to be associated with the step
         * in the response. The information provided here will be available on the Driver's app
         * under step details. This attribute can be used to provide context about or instructions
         * to the driver for performing the task
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun meta(): Optional<Meta> = meta.getOptional("meta")

        /**
         * Specify the step type. It can belong to one of the following: start, job , pickup,
         * delivery, end. A duration is mandatory when the step type is either layover or a break.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [arrival].
         *
         * Unlike [arrival], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("arrival") @ExcludeMissing fun _arrival(): JsonField<Long> = arrival

        /**
         * Returns the raw JSON value of [position].
         *
         * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("position") @ExcludeMissing fun _position(): JsonField<Long> = position

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

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
         * Returns the raw JSON value of [documentTemplateId].
         *
         * Unlike [documentTemplateId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("document_template_id")
        @ExcludeMissing
        fun _documentTemplateId(): JsonField<String> = documentTemplateId

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

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
         * Returns the raw JSON value of [location].
         *
         * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location")
        @ExcludeMissing
        fun _location(): JsonField<List<Double>> = location

        /**
         * Returns the raw JSON value of [meta].
         *
         * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * .arrival()
             * .position()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var arrival: JsonField<Long>? = null
            private var position: JsonField<Long>? = null
            private var address: JsonField<String> = JsonMissing.of()
            private var completionMode: JsonField<RouteStepCompletionMode> = JsonMissing.of()
            private var documentTemplateId: JsonField<String> = JsonMissing.of()
            private var duration: JsonField<Long> = JsonMissing.of()
            private var geofenceConfig: JsonField<RouteStepGeofenceConfig> = JsonMissing.of()
            private var location: JsonField<MutableList<Double>>? = null
            private var meta: JsonField<Meta> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                arrival = body.arrival
                position = body.position
                address = body.address
                completionMode = body.completionMode
                documentTemplateId = body.documentTemplateId
                duration = body.duration
                geofenceConfig = body.geofenceConfig
                location = body.location.map { it.toMutableList() }
                meta = body.meta
                type = body.type
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Specify the scheduled arrival time of the driver, as an UNIX timestamp in seconds, at
             * the step. Please note that:
             * - Arrival time for each step should be equal to or greater than the previous step.
             * - Past times can not be provided.
             * - The time provided is used only for informative display on the driver app and it
             *   does not impact or get affected by the route generated.
             */
            fun arrival(arrival: Long) = arrival(JsonField.of(arrival))

            /**
             * Sets [Builder.arrival] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arrival] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun arrival(arrival: JsonField<Long>) = apply { this.arrival = arrival }

            /**
             * Specify the new position of the step. Provide a position different from the current
             * position of the step to update sequence in which the step get completed.
             */
            fun position(position: Long) = position(JsonField.of(position))

            /**
             * Sets [Builder.position] to an arbitrary JSON value.
             *
             * You should usually call [Builder.position] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun position(position: JsonField<Long>) = apply { this.position = position }

            /** Specify the postal address for the step. */
            fun address(address: String) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            /**
             * Specify the mode of completion to be used for the step. Currently, following values
             * are allowed:
             * - manual: Steps must be marked as completed manually through the Driver App.
             * - geofence: Steps are marked as completed automatically based on the entry conditions
             *   and geofence specified.
             * - geofence_manual_fallback: Steps will be marked as completed automatically based on
             *   geofence and entry condition configurations but there will also be a provision for
             *   manually updating the status in case, geofence detection fails.
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
             * Update the ID of the document template to be used for collecting proof of completion
             * for the step. If an empty string "" is provided, the current document template
             * associated to the step will be removed.
             */
            fun documentTemplateId(documentTemplateId: String) =
                documentTemplateId(JsonField.of(documentTemplateId))

            /**
             * Sets [Builder.documentTemplateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentTemplateId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentTemplateId(documentTemplateId: JsonField<String>) = apply {
                this.documentTemplateId = documentTemplateId
            }

            /**
             * Specify the duration of the layover or break type steps, in seconds. Please note it
             * is mandatory when step type is either "layover" or "break".
             */
            fun duration(duration: Long) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

            /**
             * Specify the configurations of the geofence which will be used to detect presence of
             * the driver and complete the tasks automatically. Please note that this attribute is
             * required when completion_mode is either "geofence" or "geofence_manual_fallback".
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

            /**
             * Specify the location coordinates where the steps should be performed in
             * [latitude, longitude].
             */
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
             * An object to specify any additional details about the task to be associated with the
             * step in the response. The information provided here will be available on the Driver's
             * app under step details. This attribute can be used to provide context about or
             * instructions to the driver for performing the task
             */
            fun meta(meta: Meta) = meta(JsonField.of(meta))

            /**
             * Sets [Builder.meta] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

            /**
             * Specify the step type. It can belong to one of the following: start, job , pickup,
             * delivery, end. A duration is mandatory when the step type is either layover or a
             * break.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * .arrival()
             * .position()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("arrival", arrival),
                    checkRequired("position", position),
                    address,
                    completionMode,
                    documentTemplateId,
                    duration,
                    geofenceConfig,
                    (location ?: JsonMissing.of()).map { it.toImmutable() },
                    meta,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            arrival()
            position()
            address()
            completionMode().ifPresent { it.validate() }
            documentTemplateId()
            duration()
            geofenceConfig().ifPresent { it.validate() }
            location()
            meta().ifPresent { it.validate() }
            type().ifPresent { it.validate() }
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
            (if (arrival.asKnown().isPresent) 1 else 0) +
                (if (position.asKnown().isPresent) 1 else 0) +
                (if (address.asKnown().isPresent) 1 else 0) +
                (completionMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (documentTemplateId.asKnown().isPresent) 1 else 0) +
                (if (duration.asKnown().isPresent) 1 else 0) +
                (geofenceConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (location.asKnown().getOrNull()?.size ?: 0) +
                (meta.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && arrival == other.arrival && position == other.position && address == other.address && completionMode == other.completionMode && documentTemplateId == other.documentTemplateId && duration == other.duration && geofenceConfig == other.geofenceConfig && location == other.location && meta == other.meta && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(arrival, position, address, completionMode, documentTemplateId, duration, geofenceConfig, location, meta, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{arrival=$arrival, position=$position, address=$address, completionMode=$completionMode, documentTemplateId=$documentTemplateId, duration=$duration, geofenceConfig=$geofenceConfig, location=$location, meta=$meta, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * An object to specify any additional details about the task to be associated with the step in
     * the response. The information provided here will be available on the Driver's app under step
     * details. This attribute can be used to provide context about or instructions to the driver
     * for performing the task
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
         * Specify the name of the customer for which the step has to be performed.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerName(): Optional<String> = customerName.getOptional("customer_name")

        /**
         * Specify the phone number of the person to be contacted when at step location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerPhoneNumber(): Optional<String> =
            customerPhoneNumber.getOptional("customer_phone_number")

        /**
         * Specify custom instructions to be carried out while performing the step.
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

            /** Specify the name of the customer for which the step has to be performed. */
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

            /** Specify the phone number of the person to be contacted when at step location. */
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

            /** Specify custom instructions to be carried out while performing the step. */
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

    /**
     * Specify the step type. It can belong to one of the following: start, job , pickup, delivery,
     * end. A duration is mandatory when the step type is either layover or a break.
     */
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

            @JvmField val START = of("start")

            @JvmField val JOB = of("job")

            @JvmField val PICKUP = of("pickup")

            @JvmField val DELIVERY = of("delivery")

            @JvmField val BREAK = of("break")

            @JvmField val LAYOVER = of("layover")

            @JvmField val END = of("end")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            START,
            JOB,
            PICKUP,
            DELIVERY,
            BREAK,
            LAYOVER,
            END,
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
            START,
            JOB,
            PICKUP,
            DELIVERY,
            BREAK,
            LAYOVER,
            END,
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
                START -> Value.START
                JOB -> Value.JOB
                PICKUP -> Value.PICKUP
                DELIVERY -> Value.DELIVERY
                BREAK -> Value.BREAK
                LAYOVER -> Value.LAYOVER
                END -> Value.END
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
                START -> Known.START
                JOB -> Known.JOB
                PICKUP -> Known.PICKUP
                DELIVERY -> Known.DELIVERY
                BREAK -> Known.BREAK
                LAYOVER -> Known.LAYOVER
                END -> Known.END
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

        return /* spotless:off */ other is StepUpdateParams && routeId == other.routeId && stepId == other.stepId && key == other.key && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(routeId, stepId, key, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "StepUpdateParams{routeId=$routeId, stepId=$stepId, key=$key, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
