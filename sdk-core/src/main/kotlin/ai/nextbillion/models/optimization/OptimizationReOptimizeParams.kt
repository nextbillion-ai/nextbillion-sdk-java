// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.optimization

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
import ai.nextbillion.models.optimization.driverassignment.Vehicle
import ai.nextbillion.models.optimization.v2.Job
import ai.nextbillion.models.optimization.v2.Shipment
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Re-optimization */
class OptimizationReOptimizeParams
private constructor(
    private val key: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * Specify the unique request ID that needs to be re-optimized.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun existingRequestId(): String = body.existingRequestId()

    /**
     * This section gathers information on modifications to the number of jobs or their individual
     * requirements for re-optimization. Any job from the original solution not specified here will
     * be re-planned without alteration during the re-optimization process.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun jobChanges(): Optional<JobChanges> = body.jobChanges()

    /**
     * Provide the list of locations to be used during re-optimization process. Please note that
     * - Providing the location input overwrites the list of locations used in the original request.
     * - The location_indexes associated with all tasks and vehicles (both from the original and new
     *   re-optimization input requests) will follow the updated list of locations.
     *
     * As a best practice:
     * 1. Don't provide the locations input when re-optimizing, if the original set contains all the
     *    required location coordinates.
     * 2. If any new location coordinates are required for re-optimization, copy the full, original
     *    location list and update it in the following manner before adding it to the
     *    re-optimization input:
     *
     *     1.  Ensure to not update the indexes of locations which just need to be "modified".
     *     2.  Add new location coordinates towards the end of the list.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun locations(): Optional<List<String>> = body.locations()

    /**
     * This section gathers information on modifications to the number of shipments or their
     * individual requirements for re-optimization. Any shipment from the original solution not
     * specified here will be re-planned without alteration during the re-optimization process.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun shipmentChanges(): Optional<ShipmentChanges> = body.shipmentChanges()

    /**
     * This section gathers information on modifications to the number of vehicles or individual
     * vehicle configurations for re-optimizing an existing solution. Any vehicle from the original
     * solution not specified here will be reused without alteration during the re-optimization
     * process.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun vehicleChanges(): Optional<VehicleChanges> = body.vehicleChanges()

    /**
     * Returns the raw JSON value of [existingRequestId].
     *
     * Unlike [existingRequestId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _existingRequestId(): JsonField<String> = body._existingRequestId()

    /**
     * Returns the raw JSON value of [jobChanges].
     *
     * Unlike [jobChanges], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _jobChanges(): JsonField<JobChanges> = body._jobChanges()

    /**
     * Returns the raw JSON value of [locations].
     *
     * Unlike [locations], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _locations(): JsonField<List<String>> = body._locations()

    /**
     * Returns the raw JSON value of [shipmentChanges].
     *
     * Unlike [shipmentChanges], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _shipmentChanges(): JsonField<ShipmentChanges> = body._shipmentChanges()

    /**
     * Returns the raw JSON value of [vehicleChanges].
     *
     * Unlike [vehicleChanges], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vehicleChanges(): JsonField<VehicleChanges> = body._vehicleChanges()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OptimizationReOptimizeParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .existingRequestId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OptimizationReOptimizeParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(optimizationReOptimizeParams: OptimizationReOptimizeParams) = apply {
            key = optimizationReOptimizeParams.key
            body = optimizationReOptimizeParams.body.toBuilder()
            additionalHeaders = optimizationReOptimizeParams.additionalHeaders.toBuilder()
            additionalQueryParams = optimizationReOptimizeParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [existingRequestId]
         * - [jobChanges]
         * - [locations]
         * - [shipmentChanges]
         * - [vehicleChanges]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Specify the unique request ID that needs to be re-optimized. */
        fun existingRequestId(existingRequestId: String) = apply {
            body.existingRequestId(existingRequestId)
        }

        /**
         * Sets [Builder.existingRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.existingRequestId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun existingRequestId(existingRequestId: JsonField<String>) = apply {
            body.existingRequestId(existingRequestId)
        }

        /**
         * This section gathers information on modifications to the number of jobs or their
         * individual requirements for re-optimization. Any job from the original solution not
         * specified here will be re-planned without alteration during the re-optimization process.
         */
        fun jobChanges(jobChanges: JobChanges) = apply { body.jobChanges(jobChanges) }

        /**
         * Sets [Builder.jobChanges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobChanges] with a well-typed [JobChanges] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun jobChanges(jobChanges: JsonField<JobChanges>) = apply { body.jobChanges(jobChanges) }

        /**
         * Provide the list of locations to be used during re-optimization process. Please note that
         * - Providing the location input overwrites the list of locations used in the original
         *   request.
         * - The location_indexes associated with all tasks and vehicles (both from the original and
         *   new re-optimization input requests) will follow the updated list of locations.
         *
         * As a best practice:
         * 1. Don't provide the locations input when re-optimizing, if the original set contains all
         *    the required location coordinates.
         * 2. If any new location coordinates are required for re-optimization, copy the full,
         *    original location list and update it in the following manner before adding it to the
         *    re-optimization input:
         *
         *     1.  Ensure to not update the indexes of locations which just need to be "modified".
         *     2.  Add new location coordinates towards the end of the list.
         */
        fun locations(locations: List<String>) = apply { body.locations(locations) }

        /**
         * Sets [Builder.locations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locations] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun locations(locations: JsonField<List<String>>) = apply { body.locations(locations) }

        /**
         * Adds a single [String] to [locations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLocation(location: String) = apply { body.addLocation(location) }

        /**
         * This section gathers information on modifications to the number of shipments or their
         * individual requirements for re-optimization. Any shipment from the original solution not
         * specified here will be re-planned without alteration during the re-optimization process.
         */
        fun shipmentChanges(shipmentChanges: ShipmentChanges) = apply {
            body.shipmentChanges(shipmentChanges)
        }

        /**
         * Sets [Builder.shipmentChanges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shipmentChanges] with a well-typed [ShipmentChanges]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun shipmentChanges(shipmentChanges: JsonField<ShipmentChanges>) = apply {
            body.shipmentChanges(shipmentChanges)
        }

        /**
         * This section gathers information on modifications to the number of vehicles or individual
         * vehicle configurations for re-optimizing an existing solution. Any vehicle from the
         * original solution not specified here will be reused without alteration during the
         * re-optimization process.
         */
        fun vehicleChanges(vehicleChanges: VehicleChanges) = apply {
            body.vehicleChanges(vehicleChanges)
        }

        /**
         * Sets [Builder.vehicleChanges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vehicleChanges] with a well-typed [VehicleChanges] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vehicleChanges(vehicleChanges: JsonField<VehicleChanges>) = apply {
            body.vehicleChanges(vehicleChanges)
        }

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
         * Returns an immutable instance of [OptimizationReOptimizeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .existingRequestId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OptimizationReOptimizeParams =
            OptimizationReOptimizeParams(
                checkRequired("key", key),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

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
        private val existingRequestId: JsonField<String>,
        private val jobChanges: JsonField<JobChanges>,
        private val locations: JsonField<List<String>>,
        private val shipmentChanges: JsonField<ShipmentChanges>,
        private val vehicleChanges: JsonField<VehicleChanges>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("existing_request_id")
            @ExcludeMissing
            existingRequestId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("job_changes")
            @ExcludeMissing
            jobChanges: JsonField<JobChanges> = JsonMissing.of(),
            @JsonProperty("locations")
            @ExcludeMissing
            locations: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("shipment_changes")
            @ExcludeMissing
            shipmentChanges: JsonField<ShipmentChanges> = JsonMissing.of(),
            @JsonProperty("vehicle_changes")
            @ExcludeMissing
            vehicleChanges: JsonField<VehicleChanges> = JsonMissing.of(),
        ) : this(
            existingRequestId,
            jobChanges,
            locations,
            shipmentChanges,
            vehicleChanges,
            mutableMapOf(),
        )

        /**
         * Specify the unique request ID that needs to be re-optimized.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun existingRequestId(): String = existingRequestId.getRequired("existing_request_id")

        /**
         * This section gathers information on modifications to the number of jobs or their
         * individual requirements for re-optimization. Any job from the original solution not
         * specified here will be re-planned without alteration during the re-optimization process.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun jobChanges(): Optional<JobChanges> = jobChanges.getOptional("job_changes")

        /**
         * Provide the list of locations to be used during re-optimization process. Please note that
         * - Providing the location input overwrites the list of locations used in the original
         *   request.
         * - The location_indexes associated with all tasks and vehicles (both from the original and
         *   new re-optimization input requests) will follow the updated list of locations.
         *
         * As a best practice:
         * 1. Don't provide the locations input when re-optimizing, if the original set contains all
         *    the required location coordinates.
         * 2. If any new location coordinates are required for re-optimization, copy the full,
         *    original location list and update it in the following manner before adding it to the
         *    re-optimization input:
         *
         *     1.  Ensure to not update the indexes of locations which just need to be "modified".
         *     2.  Add new location coordinates towards the end of the list.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun locations(): Optional<List<String>> = locations.getOptional("locations")

        /**
         * This section gathers information on modifications to the number of shipments or their
         * individual requirements for re-optimization. Any shipment from the original solution not
         * specified here will be re-planned without alteration during the re-optimization process.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun shipmentChanges(): Optional<ShipmentChanges> =
            shipmentChanges.getOptional("shipment_changes")

        /**
         * This section gathers information on modifications to the number of vehicles or individual
         * vehicle configurations for re-optimizing an existing solution. Any vehicle from the
         * original solution not specified here will be reused without alteration during the
         * re-optimization process.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun vehicleChanges(): Optional<VehicleChanges> =
            vehicleChanges.getOptional("vehicle_changes")

        /**
         * Returns the raw JSON value of [existingRequestId].
         *
         * Unlike [existingRequestId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("existing_request_id")
        @ExcludeMissing
        fun _existingRequestId(): JsonField<String> = existingRequestId

        /**
         * Returns the raw JSON value of [jobChanges].
         *
         * Unlike [jobChanges], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("job_changes")
        @ExcludeMissing
        fun _jobChanges(): JsonField<JobChanges> = jobChanges

        /**
         * Returns the raw JSON value of [locations].
         *
         * Unlike [locations], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locations")
        @ExcludeMissing
        fun _locations(): JsonField<List<String>> = locations

        /**
         * Returns the raw JSON value of [shipmentChanges].
         *
         * Unlike [shipmentChanges], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shipment_changes")
        @ExcludeMissing
        fun _shipmentChanges(): JsonField<ShipmentChanges> = shipmentChanges

        /**
         * Returns the raw JSON value of [vehicleChanges].
         *
         * Unlike [vehicleChanges], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vehicle_changes")
        @ExcludeMissing
        fun _vehicleChanges(): JsonField<VehicleChanges> = vehicleChanges

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
             * .existingRequestId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var existingRequestId: JsonField<String>? = null
            private var jobChanges: JsonField<JobChanges> = JsonMissing.of()
            private var locations: JsonField<MutableList<String>>? = null
            private var shipmentChanges: JsonField<ShipmentChanges> = JsonMissing.of()
            private var vehicleChanges: JsonField<VehicleChanges> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                existingRequestId = body.existingRequestId
                jobChanges = body.jobChanges
                locations = body.locations.map { it.toMutableList() }
                shipmentChanges = body.shipmentChanges
                vehicleChanges = body.vehicleChanges
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Specify the unique request ID that needs to be re-optimized. */
            fun existingRequestId(existingRequestId: String) =
                existingRequestId(JsonField.of(existingRequestId))

            /**
             * Sets [Builder.existingRequestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.existingRequestId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun existingRequestId(existingRequestId: JsonField<String>) = apply {
                this.existingRequestId = existingRequestId
            }

            /**
             * This section gathers information on modifications to the number of jobs or their
             * individual requirements for re-optimization. Any job from the original solution not
             * specified here will be re-planned without alteration during the re-optimization
             * process.
             */
            fun jobChanges(jobChanges: JobChanges) = jobChanges(JsonField.of(jobChanges))

            /**
             * Sets [Builder.jobChanges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jobChanges] with a well-typed [JobChanges] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jobChanges(jobChanges: JsonField<JobChanges>) = apply {
                this.jobChanges = jobChanges
            }

            /**
             * Provide the list of locations to be used during re-optimization process. Please note
             * that
             * - Providing the location input overwrites the list of locations used in the original
             *   request.
             * - The location_indexes associated with all tasks and vehicles (both from the original
             *   and new re-optimization input requests) will follow the updated list of locations.
             *
             * As a best practice:
             * 1. Don't provide the locations input when re-optimizing, if the original set contains
             *    all the required location coordinates.
             * 2. If any new location coordinates are required for re-optimization, copy the full,
             *    original location list and update it in the following manner before adding it to
             *    the re-optimization input:
             *
             *     1.  Ensure to not update the indexes of locations which just need to be "modified".
             *     2.  Add new location coordinates towards the end of the list.
             */
            fun locations(locations: List<String>) = locations(JsonField.of(locations))

            /**
             * Sets [Builder.locations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locations] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locations(locations: JsonField<List<String>>) = apply {
                this.locations = locations.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [locations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLocation(location: String) = apply {
                locations =
                    (locations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("locations", it).add(location)
                    }
            }

            /**
             * This section gathers information on modifications to the number of shipments or their
             * individual requirements for re-optimization. Any shipment from the original solution
             * not specified here will be re-planned without alteration during the re-optimization
             * process.
             */
            fun shipmentChanges(shipmentChanges: ShipmentChanges) =
                shipmentChanges(JsonField.of(shipmentChanges))

            /**
             * Sets [Builder.shipmentChanges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shipmentChanges] with a well-typed [ShipmentChanges]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun shipmentChanges(shipmentChanges: JsonField<ShipmentChanges>) = apply {
                this.shipmentChanges = shipmentChanges
            }

            /**
             * This section gathers information on modifications to the number of vehicles or
             * individual vehicle configurations for re-optimizing an existing solution. Any vehicle
             * from the original solution not specified here will be reused without alteration
             * during the re-optimization process.
             */
            fun vehicleChanges(vehicleChanges: VehicleChanges) =
                vehicleChanges(JsonField.of(vehicleChanges))

            /**
             * Sets [Builder.vehicleChanges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vehicleChanges] with a well-typed [VehicleChanges]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun vehicleChanges(vehicleChanges: JsonField<VehicleChanges>) = apply {
                this.vehicleChanges = vehicleChanges
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .existingRequestId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("existingRequestId", existingRequestId),
                    jobChanges,
                    (locations ?: JsonMissing.of()).map { it.toImmutable() },
                    shipmentChanges,
                    vehicleChanges,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            existingRequestId()
            jobChanges().ifPresent { it.validate() }
            locations()
            shipmentChanges().ifPresent { it.validate() }
            vehicleChanges().ifPresent { it.validate() }
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
            (if (existingRequestId.asKnown().isPresent) 1 else 0) +
                (jobChanges.asKnown().getOrNull()?.validity() ?: 0) +
                (locations.asKnown().getOrNull()?.size ?: 0) +
                (shipmentChanges.asKnown().getOrNull()?.validity() ?: 0) +
                (vehicleChanges.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                existingRequestId == other.existingRequestId &&
                jobChanges == other.jobChanges &&
                locations == other.locations &&
                shipmentChanges == other.shipmentChanges &&
                vehicleChanges == other.vehicleChanges &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                existingRequestId,
                jobChanges,
                locations,
                shipmentChanges,
                vehicleChanges,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{existingRequestId=$existingRequestId, jobChanges=$jobChanges, locations=$locations, shipmentChanges=$shipmentChanges, vehicleChanges=$vehicleChanges, additionalProperties=$additionalProperties}"
    }

    /**
     * This section gathers information on modifications to the number of jobs or their individual
     * requirements for re-optimization. Any job from the original solution not specified here will
     * be re-planned without alteration during the re-optimization process.
     */
    class JobChanges
    private constructor(
        private val add: JsonField<List<Job>>,
        private val modify: JsonField<List<Job>>,
        private val remove: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("add") @ExcludeMissing add: JsonField<List<Job>> = JsonMissing.of(),
            @JsonProperty("modify") @ExcludeMissing modify: JsonField<List<Job>> = JsonMissing.of(),
            @JsonProperty("remove")
            @ExcludeMissing
            remove: JsonField<List<String>> = JsonMissing.of(),
        ) : this(add, modify, remove, mutableMapOf())

        /**
         * An array of objects to collect the details of the new jobs to be added during
         * re-optimization. Each object represents one job. Please make sure the IDs provided for
         * new jobs are unique with respect to the IDs of the jobs in the original request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun add(): Optional<List<Job>> = add.getOptional("add")

        /**
         * An array of objects to collect the modified details of existing jobs used in the original
         * request. Each object represents one job. Please make sure all the job IDs provided here
         * are same as the ones in the original request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun modify(): Optional<List<Job>> = modify.getOptional("modify")

        /**
         * An array of job IDs to be removed when during re-optimization. All job IDs provided must
         * have been part of the original request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun remove(): Optional<List<String>> = remove.getOptional("remove")

        /**
         * Returns the raw JSON value of [add].
         *
         * Unlike [add], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("add") @ExcludeMissing fun _add(): JsonField<List<Job>> = add

        /**
         * Returns the raw JSON value of [modify].
         *
         * Unlike [modify], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modify") @ExcludeMissing fun _modify(): JsonField<List<Job>> = modify

        /**
         * Returns the raw JSON value of [remove].
         *
         * Unlike [remove], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("remove") @ExcludeMissing fun _remove(): JsonField<List<String>> = remove

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

            /** Returns a mutable builder for constructing an instance of [JobChanges]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [JobChanges]. */
        class Builder internal constructor() {

            private var add: JsonField<MutableList<Job>>? = null
            private var modify: JsonField<MutableList<Job>>? = null
            private var remove: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(jobChanges: JobChanges) = apply {
                add = jobChanges.add.map { it.toMutableList() }
                modify = jobChanges.modify.map { it.toMutableList() }
                remove = jobChanges.remove.map { it.toMutableList() }
                additionalProperties = jobChanges.additionalProperties.toMutableMap()
            }

            /**
             * An array of objects to collect the details of the new jobs to be added during
             * re-optimization. Each object represents one job. Please make sure the IDs provided
             * for new jobs are unique with respect to the IDs of the jobs in the original request.
             */
            fun add(add: List<Job>) = add(JsonField.of(add))

            /**
             * Sets [Builder.add] to an arbitrary JSON value.
             *
             * You should usually call [Builder.add] with a well-typed `List<Job>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun add(add: JsonField<List<Job>>) = apply { this.add = add.map { it.toMutableList() } }

            /**
             * Adds a single [Job] to [Builder.add].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAdd(add: Job) = apply {
                this.add =
                    (this.add ?: JsonField.of(mutableListOf())).also {
                        checkKnown("add", it).add(add)
                    }
            }

            /**
             * An array of objects to collect the modified details of existing jobs used in the
             * original request. Each object represents one job. Please make sure all the job IDs
             * provided here are same as the ones in the original request.
             */
            fun modify(modify: List<Job>) = modify(JsonField.of(modify))

            /**
             * Sets [Builder.modify] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modify] with a well-typed `List<Job>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modify(modify: JsonField<List<Job>>) = apply {
                this.modify = modify.map { it.toMutableList() }
            }

            /**
             * Adds a single [Job] to [Builder.modify].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addModify(modify: Job) = apply {
                this.modify =
                    (this.modify ?: JsonField.of(mutableListOf())).also {
                        checkKnown("modify", it).add(modify)
                    }
            }

            /**
             * An array of job IDs to be removed when during re-optimization. All job IDs provided
             * must have been part of the original request.
             */
            fun remove(remove: List<String>) = remove(JsonField.of(remove))

            /**
             * Sets [Builder.remove] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remove] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun remove(remove: JsonField<List<String>>) = apply {
                this.remove = remove.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.remove].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemove(remove: String) = apply {
                this.remove =
                    (this.remove ?: JsonField.of(mutableListOf())).also {
                        checkKnown("remove", it).add(remove)
                    }
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
             * Returns an immutable instance of [JobChanges].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): JobChanges =
                JobChanges(
                    (add ?: JsonMissing.of()).map { it.toImmutable() },
                    (modify ?: JsonMissing.of()).map { it.toImmutable() },
                    (remove ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): JobChanges = apply {
            if (validated) {
                return@apply
            }

            add().ifPresent { it.forEach { it.validate() } }
            modify().ifPresent { it.forEach { it.validate() } }
            remove()
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
            (add.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (modify.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (remove.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is JobChanges &&
                add == other.add &&
                modify == other.modify &&
                remove == other.remove &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(add, modify, remove, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "JobChanges{add=$add, modify=$modify, remove=$remove, additionalProperties=$additionalProperties}"
    }

    /**
     * This section gathers information on modifications to the number of shipments or their
     * individual requirements for re-optimization. Any shipment from the original solution not
     * specified here will be re-planned without alteration during the re-optimization process.
     */
    class ShipmentChanges
    private constructor(
        private val add: JsonField<List<Shipment>>,
        private val modify: JsonField<List<Shipment>>,
        private val remove: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("add") @ExcludeMissing add: JsonField<List<Shipment>> = JsonMissing.of(),
            @JsonProperty("modify")
            @ExcludeMissing
            modify: JsonField<List<Shipment>> = JsonMissing.of(),
            @JsonProperty("remove")
            @ExcludeMissing
            remove: JsonField<List<String>> = JsonMissing.of(),
        ) : this(add, modify, remove, mutableMapOf())

        /**
         * An array of objects to collect the details of the new shipments to be added during
         * re-optimization. Each object represents one shipment. Please make sure the IDs provided
         * for new shipments are unique with respect to the IDs of the shipments in the original
         * request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun add(): Optional<List<Shipment>> = add.getOptional("add")

        /**
         * An array of objects to collect the modified details of existing shipments used in the
         * original request. Each object represents one shipment. Please make sure all the shipment
         * IDs provided here are same as the ones in the original request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun modify(): Optional<List<Shipment>> = modify.getOptional("modify")

        /**
         * An array of shipment IDs to be removed when during re-optimization. All shipment IDs
         * provided must have been part of the original request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun remove(): Optional<List<String>> = remove.getOptional("remove")

        /**
         * Returns the raw JSON value of [add].
         *
         * Unlike [add], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("add") @ExcludeMissing fun _add(): JsonField<List<Shipment>> = add

        /**
         * Returns the raw JSON value of [modify].
         *
         * Unlike [modify], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modify") @ExcludeMissing fun _modify(): JsonField<List<Shipment>> = modify

        /**
         * Returns the raw JSON value of [remove].
         *
         * Unlike [remove], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("remove") @ExcludeMissing fun _remove(): JsonField<List<String>> = remove

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

            /** Returns a mutable builder for constructing an instance of [ShipmentChanges]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ShipmentChanges]. */
        class Builder internal constructor() {

            private var add: JsonField<MutableList<Shipment>>? = null
            private var modify: JsonField<MutableList<Shipment>>? = null
            private var remove: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(shipmentChanges: ShipmentChanges) = apply {
                add = shipmentChanges.add.map { it.toMutableList() }
                modify = shipmentChanges.modify.map { it.toMutableList() }
                remove = shipmentChanges.remove.map { it.toMutableList() }
                additionalProperties = shipmentChanges.additionalProperties.toMutableMap()
            }

            /**
             * An array of objects to collect the details of the new shipments to be added during
             * re-optimization. Each object represents one shipment. Please make sure the IDs
             * provided for new shipments are unique with respect to the IDs of the shipments in the
             * original request.
             */
            fun add(add: List<Shipment>) = add(JsonField.of(add))

            /**
             * Sets [Builder.add] to an arbitrary JSON value.
             *
             * You should usually call [Builder.add] with a well-typed `List<Shipment>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun add(add: JsonField<List<Shipment>>) = apply {
                this.add = add.map { it.toMutableList() }
            }

            /**
             * Adds a single [Shipment] to [Builder.add].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAdd(add: Shipment) = apply {
                this.add =
                    (this.add ?: JsonField.of(mutableListOf())).also {
                        checkKnown("add", it).add(add)
                    }
            }

            /**
             * An array of objects to collect the modified details of existing shipments used in the
             * original request. Each object represents one shipment. Please make sure all the
             * shipment IDs provided here are same as the ones in the original request.
             */
            fun modify(modify: List<Shipment>) = modify(JsonField.of(modify))

            /**
             * Sets [Builder.modify] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modify] with a well-typed `List<Shipment>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modify(modify: JsonField<List<Shipment>>) = apply {
                this.modify = modify.map { it.toMutableList() }
            }

            /**
             * Adds a single [Shipment] to [Builder.modify].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addModify(modify: Shipment) = apply {
                this.modify =
                    (this.modify ?: JsonField.of(mutableListOf())).also {
                        checkKnown("modify", it).add(modify)
                    }
            }

            /**
             * An array of shipment IDs to be removed when during re-optimization. All shipment IDs
             * provided must have been part of the original request.
             */
            fun remove(remove: List<String>) = remove(JsonField.of(remove))

            /**
             * Sets [Builder.remove] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remove] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun remove(remove: JsonField<List<String>>) = apply {
                this.remove = remove.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.remove].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemove(remove: String) = apply {
                this.remove =
                    (this.remove ?: JsonField.of(mutableListOf())).also {
                        checkKnown("remove", it).add(remove)
                    }
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
             * Returns an immutable instance of [ShipmentChanges].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ShipmentChanges =
                ShipmentChanges(
                    (add ?: JsonMissing.of()).map { it.toImmutable() },
                    (modify ?: JsonMissing.of()).map { it.toImmutable() },
                    (remove ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ShipmentChanges = apply {
            if (validated) {
                return@apply
            }

            add().ifPresent { it.forEach { it.validate() } }
            modify().ifPresent { it.forEach { it.validate() } }
            remove()
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
            (add.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (modify.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (remove.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ShipmentChanges &&
                add == other.add &&
                modify == other.modify &&
                remove == other.remove &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(add, modify, remove, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ShipmentChanges{add=$add, modify=$modify, remove=$remove, additionalProperties=$additionalProperties}"
    }

    /**
     * This section gathers information on modifications to the number of vehicles or individual
     * vehicle configurations for re-optimizing an existing solution. Any vehicle from the original
     * solution not specified here will be reused without alteration during the re-optimization
     * process.
     */
    class VehicleChanges
    private constructor(
        private val add: JsonField<List<Vehicle>>,
        private val modify: JsonField<Vehicle>,
        private val remove: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("add") @ExcludeMissing add: JsonField<List<Vehicle>> = JsonMissing.of(),
            @JsonProperty("modify") @ExcludeMissing modify: JsonField<Vehicle> = JsonMissing.of(),
            @JsonProperty("remove")
            @ExcludeMissing
            remove: JsonField<List<String>> = JsonMissing.of(),
        ) : this(add, modify, remove, mutableMapOf())

        /**
         * An array of objects to collect the details of the new vehicles to be added for
         * re-optimization. Each object represents one vehicle. Please make sure the IDs provided
         * for new vehicles are unique with respect to the IDs of the vehicles in the original
         * request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun add(): Optional<List<Vehicle>> = add.getOptional("add")

        /**
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun modify(): Optional<Vehicle> = modify.getOptional("modify")

        /**
         * An array of vehicle IDs to be removed when during re-optimization. All vehicle IDs
         * provided must have been part of the original request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun remove(): Optional<List<String>> = remove.getOptional("remove")

        /**
         * Returns the raw JSON value of [add].
         *
         * Unlike [add], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("add") @ExcludeMissing fun _add(): JsonField<List<Vehicle>> = add

        /**
         * Returns the raw JSON value of [modify].
         *
         * Unlike [modify], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modify") @ExcludeMissing fun _modify(): JsonField<Vehicle> = modify

        /**
         * Returns the raw JSON value of [remove].
         *
         * Unlike [remove], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("remove") @ExcludeMissing fun _remove(): JsonField<List<String>> = remove

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

            /** Returns a mutable builder for constructing an instance of [VehicleChanges]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VehicleChanges]. */
        class Builder internal constructor() {

            private var add: JsonField<MutableList<Vehicle>>? = null
            private var modify: JsonField<Vehicle> = JsonMissing.of()
            private var remove: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(vehicleChanges: VehicleChanges) = apply {
                add = vehicleChanges.add.map { it.toMutableList() }
                modify = vehicleChanges.modify
                remove = vehicleChanges.remove.map { it.toMutableList() }
                additionalProperties = vehicleChanges.additionalProperties.toMutableMap()
            }

            /**
             * An array of objects to collect the details of the new vehicles to be added for
             * re-optimization. Each object represents one vehicle. Please make sure the IDs
             * provided for new vehicles are unique with respect to the IDs of the vehicles in the
             * original request.
             */
            fun add(add: List<Vehicle>) = add(JsonField.of(add))

            /**
             * Sets [Builder.add] to an arbitrary JSON value.
             *
             * You should usually call [Builder.add] with a well-typed `List<Vehicle>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun add(add: JsonField<List<Vehicle>>) = apply {
                this.add = add.map { it.toMutableList() }
            }

            /**
             * Adds a single [Vehicle] to [Builder.add].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAdd(add: Vehicle) = apply {
                this.add =
                    (this.add ?: JsonField.of(mutableListOf())).also {
                        checkKnown("add", it).add(add)
                    }
            }

            fun modify(modify: Vehicle) = modify(JsonField.of(modify))

            /**
             * Sets [Builder.modify] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modify] with a well-typed [Vehicle] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modify(modify: JsonField<Vehicle>) = apply { this.modify = modify }

            /**
             * An array of vehicle IDs to be removed when during re-optimization. All vehicle IDs
             * provided must have been part of the original request.
             */
            fun remove(remove: List<String>) = remove(JsonField.of(remove))

            /**
             * Sets [Builder.remove] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remove] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun remove(remove: JsonField<List<String>>) = apply {
                this.remove = remove.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.remove].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemove(remove: String) = apply {
                this.remove =
                    (this.remove ?: JsonField.of(mutableListOf())).also {
                        checkKnown("remove", it).add(remove)
                    }
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
             * Returns an immutable instance of [VehicleChanges].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): VehicleChanges =
                VehicleChanges(
                    (add ?: JsonMissing.of()).map { it.toImmutable() },
                    modify,
                    (remove ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): VehicleChanges = apply {
            if (validated) {
                return@apply
            }

            add().ifPresent { it.forEach { it.validate() } }
            modify().ifPresent { it.validate() }
            remove()
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
            (add.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (modify.asKnown().getOrNull()?.validity() ?: 0) +
                (remove.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VehicleChanges &&
                add == other.add &&
                modify == other.modify &&
                remove == other.remove &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(add, modify, remove, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VehicleChanges{add=$add, modify=$modify, remove=$remove, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OptimizationReOptimizeParams &&
            key == other.key &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(key, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OptimizationReOptimizeParams{key=$key, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
