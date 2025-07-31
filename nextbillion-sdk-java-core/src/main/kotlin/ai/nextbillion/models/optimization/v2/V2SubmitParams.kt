// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.optimization.v2

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
import ai.nextbillion.models.optimization.driverassignment.Vehicle
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Flexible POST */
class V2SubmitParams
private constructor(
    private val key: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * The `locations` object is used to define all the locations that will be used during the
     * optimization process. Read more about this attribute in the
     * [Location Object](#location-object) section.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun locations(): Locations = body.locations()

    /**
     * The `vehicles` attribute describes the characteristics and constraints of the vehicles that
     * will be used for fulfilling the tasks. Read more about this attribute in the
     * [Vehicle Object](#vehicle-object) section.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vehicles(): List<Vehicle> = body.vehicles()

    /**
     * An array of arrays to denote the user-defined costs of traveling between each pair of
     * geographic coordinates mentioned in the `location` array. The number of arrays should be
     * equal to the number of coordinate points mentioned in the `location` array and each array
     * should contain the same number of elements as well. Please note that `cost_matrix` is
     * effective only when `travel_cost=customized`. Read more about this attribute in the
     * [Custom Cost Matrix](#custom-cost-matrix) section.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun costMatrix(): Optional<List<List<Long>>> = body.costMatrix()

    /**
     * `depots` object is used to collect the details of a depot. Depots can be used as a starting
     * point and/or ending point for the routes and vehicles. They also can be used to fulfil pickup
     * and delivery type`jobs` . The loads which are to be delivered at task locations will be
     * picked from depots and loads picked-up from task locations will be delivered back to the
     * depots. A depot can be configured using the following fields:
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun depots(): Optional<List<Depot>> = body.depots()

    /**
     * Define the optimization job using any custom message. This description is returned as is in
     * the response.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * An array of arrays to denote the user-defined distances, in meters, for travelling between
     * each pair of geographic coordinates mentioned in the `location` array. When this input is
     * provided, actual distances between the locations will be ignored in favor of the values
     * provided in this input for any distance calculations during the optimization process. The
     * values provided here will also be used for cost calculations when `travel_cost` is
     * “distance”.
     *
     * The number of arrays in the input should be equal to the number of coordinate points
     * mentioned in the `location` array and each array, in turn, should contain the same number of
     * elements as well.
     *
     * **Note:**
     * - `duration_matrix` is mandatory when using`distance_matrix`.
     * - When using `distance_matrix` route geometry will not be available in the optimized
     *   solution.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun distanceMatrix(): Optional<List<List<Long>>> = body.distanceMatrix()

    /**
     * An array of arrays to denote the user-defined durations, in seconds, for travelling between
     * each pair of geographic coordinates mentioned in the `location` array. When this input is
     * provided, actual durations between the locations will be ignored in favor of the values
     * provided in the matrix for any ETA calculations during the optimization process. The values
     * provided in the matrix will also be used for cost calculations when `travel_cost` is
     * “duration”.
     *
     * The number of arrays in the input should be equal to the number of coordinate points
     * mentioned in the `location` array and each array, in turn, should contain the same number of
     * elements as well.
     *
     * Please note that, unlike `distance_matrix`, `duration_matrix` can be used independently in
     * following cases:
     * - when `travel_cost` is “duration”
     * - when `travel_cost` is “customized” and a `cost_matrix` is provided
     *
     * Also, the route geometry will not be available in the optimized solution when using
     * `duration_matrix`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun durationMatrix(): Optional<List<List<Long>>> = body.durationMatrix()

    /**
     * The previous optimization request id used to retrieve solution for reoptimization
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun existingSolutionId(): Optional<String> = body.existingSolutionId()

    /**
     * `jobs` object is used to collect the details of a particular job or task that needs to be
     * completed as part of the optimization process. Each job can have either a `pickup` or
     * `delivery` step, but not both. Read more about this attribute in the
     * [Job Object](#job-object) section.
     *
     * Please note that either the `jobs` or the `shipments` attribute should be specified to build
     * a valid request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun jobs(): Optional<List<Job>> = body.jobs()

    /**
     * It represents the set of options that can be used to configure optimization algorithms so
     * that the solver provides a solution that meets the desired business objectives.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun options(): Optional<Options> = body.options()

    /**
     * `relations` attribute is an array of individual relation objects. `type` parameter and
     * `steps` object are mandatory when using this attribute.
     *
     * Please note:
     * - The soft constraints are **not** effective when using the `relations` attribute.
     * - In case a given relation can't be satisfied, the optimizer will flag all the tasks involved
     *   in that "relation" as unassigned.
     *
     * Read more about this attribute in the [Relations Object](#relations-object) section.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun relations(): Optional<List<Relation>> = body.relations()

    /**
     * The `shipments` object is used to collect the details of shipments that need to be completed
     * as part of the optimization process.
     *
     * Each shipment should have a pickup and the corresponding delivery step.
     *
     * Please note that either the `jobs` or the `shipments` attribute should be specified to build
     * a valid request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun shipments(): Optional<List<Shipment>> = body.shipments()

    /**
     * This attribute is related to the re-optimization feature. It allows for the previous
     * optimization result to be provided in case new orders are received and the solution needs to
     * be re-planned. The `solution` attribute should contain the same routes as the previous
     * optimization result. `solution` attribute is an array of objects with each object
     * corresponding to one route.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun solution(): Optional<List<Solution>> = body.solution()

    /**
     * `unassigned` attribute is related to the re-optimization feature. This attribute should
     * contain the tasks that were not assigned during an earlier optimization process. Please note
     * that the `unassigned` part in request should be consistent with the `unassigned` part in the
     * previous optimization result.
     *
     * Users can reduce the number of unassigned tasks in the re-optimized solution, by following
     * strategies such as:
     * - Extending the time windows for vehicles or tasks to give more flexibility
     * - Adding more vehicles to the optimization problem
     * - Adjusting the priority of different tasks to balance the workload more evenly
     * - Modifying other constraints or parameters to make the problem more solvable
     *
     * Ultimately, the goal is to minimize the number of unassigned tasks while still meeting all
     * the necessary constraints and objectives.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun unassigned(): Optional<Unassigned> = body.unassigned()

    /**
     * An array of objects to specify geometry of all the zones involved. Each object corresponds to
     * a single zone. A valid zone can be a
     * [geoJSON](https://datatracker.ietf.org/doc/html/rfc7946#page-9) polygon, multi-polygon or a
     * geofence created using [NextBillion.ai](http://NextBillion.ai)’s [Geofence
     * API](https://docs.nextbillion.ai/docs/tracking/api/geofence).
     *
     * Please note that
     * - Each zone should have a geometry specified either through`geometry` or through the
     *   `geofence_id` parameter.
     * - When zone IDs are not provided for individual tasks (jobs or shipments) then the API will
     *   automatically allocate zones based on the task’s geolocation and the geometries of the
     *   zones provided here. Otherwise, if the zone IDs are provided while configuring individual
     *   tasks, the zone IDs will override the geometries provided here.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun zones(): Optional<List<Zone>> = body.zones()

    /**
     * Returns the raw JSON value of [locations].
     *
     * Unlike [locations], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _locations(): JsonField<Locations> = body._locations()

    /**
     * Returns the raw JSON value of [vehicles].
     *
     * Unlike [vehicles], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vehicles(): JsonField<List<Vehicle>> = body._vehicles()

    /**
     * Returns the raw JSON value of [costMatrix].
     *
     * Unlike [costMatrix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _costMatrix(): JsonField<List<List<Long>>> = body._costMatrix()

    /**
     * Returns the raw JSON value of [depots].
     *
     * Unlike [depots], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _depots(): JsonField<List<Depot>> = body._depots()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [distanceMatrix].
     *
     * Unlike [distanceMatrix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _distanceMatrix(): JsonField<List<List<Long>>> = body._distanceMatrix()

    /**
     * Returns the raw JSON value of [durationMatrix].
     *
     * Unlike [durationMatrix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _durationMatrix(): JsonField<List<List<Long>>> = body._durationMatrix()

    /**
     * Returns the raw JSON value of [existingSolutionId].
     *
     * Unlike [existingSolutionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _existingSolutionId(): JsonField<String> = body._existingSolutionId()

    /**
     * Returns the raw JSON value of [jobs].
     *
     * Unlike [jobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _jobs(): JsonField<List<Job>> = body._jobs()

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _options(): JsonField<Options> = body._options()

    /**
     * Returns the raw JSON value of [relations].
     *
     * Unlike [relations], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _relations(): JsonField<List<Relation>> = body._relations()

    /**
     * Returns the raw JSON value of [shipments].
     *
     * Unlike [shipments], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _shipments(): JsonField<List<Shipment>> = body._shipments()

    /**
     * Returns the raw JSON value of [solution].
     *
     * Unlike [solution], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _solution(): JsonField<List<Solution>> = body._solution()

    /**
     * Returns the raw JSON value of [unassigned].
     *
     * Unlike [unassigned], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _unassigned(): JsonField<Unassigned> = body._unassigned()

    /**
     * Returns the raw JSON value of [zones].
     *
     * Unlike [zones], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _zones(): JsonField<List<Zone>> = body._zones()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V2SubmitParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .locations()
         * .vehicles()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V2SubmitParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v2SubmitParams: V2SubmitParams) = apply {
            key = v2SubmitParams.key
            body = v2SubmitParams.body.toBuilder()
            additionalHeaders = v2SubmitParams.additionalHeaders.toBuilder()
            additionalQueryParams = v2SubmitParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [locations]
         * - [vehicles]
         * - [costMatrix]
         * - [depots]
         * - [description]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The `locations` object is used to define all the locations that will be used during the
         * optimization process. Read more about this attribute in the
         * [Location Object](#location-object) section.
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

        /**
         * The `vehicles` attribute describes the characteristics and constraints of the vehicles
         * that will be used for fulfilling the tasks. Read more about this attribute in the
         * [Vehicle Object](#vehicle-object) section.
         */
        fun vehicles(vehicles: List<Vehicle>) = apply { body.vehicles(vehicles) }

        /**
         * Sets [Builder.vehicles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vehicles] with a well-typed `List<Vehicle>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vehicles(vehicles: JsonField<List<Vehicle>>) = apply { body.vehicles(vehicles) }

        /**
         * Adds a single [Vehicle] to [vehicles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVehicle(vehicle: Vehicle) = apply { body.addVehicle(vehicle) }

        /**
         * An array of arrays to denote the user-defined costs of traveling between each pair of
         * geographic coordinates mentioned in the `location` array. The number of arrays should be
         * equal to the number of coordinate points mentioned in the `location` array and each array
         * should contain the same number of elements as well. Please note that `cost_matrix` is
         * effective only when `travel_cost=customized`. Read more about this attribute in the
         * [Custom Cost Matrix](#custom-cost-matrix) section.
         */
        fun costMatrix(costMatrix: List<List<Long>>) = apply { body.costMatrix(costMatrix) }

        /**
         * Sets [Builder.costMatrix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.costMatrix] with a well-typed `List<List<Long>>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun costMatrix(costMatrix: JsonField<List<List<Long>>>) = apply {
            body.costMatrix(costMatrix)
        }

        /**
         * Adds a single [List<Long>] to [Builder.costMatrix].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCostMatrix(costMatrix: List<Long>) = apply { body.addCostMatrix(costMatrix) }

        /**
         * `depots` object is used to collect the details of a depot. Depots can be used as a
         * starting point and/or ending point for the routes and vehicles. They also can be used to
         * fulfil pickup and delivery type`jobs` . The loads which are to be delivered at task
         * locations will be picked from depots and loads picked-up from task locations will be
         * delivered back to the depots. A depot can be configured using the following fields:
         */
        fun depots(depots: List<Depot>) = apply { body.depots(depots) }

        /**
         * Sets [Builder.depots] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depots] with a well-typed `List<Depot>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun depots(depots: JsonField<List<Depot>>) = apply { body.depots(depots) }

        /**
         * Adds a single [Depot] to [depots].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDepot(depot: Depot) = apply { body.addDepot(depot) }

        /**
         * Define the optimization job using any custom message. This description is returned as is
         * in the response.
         */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * An array of arrays to denote the user-defined distances, in meters, for travelling
         * between each pair of geographic coordinates mentioned in the `location` array. When this
         * input is provided, actual distances between the locations will be ignored in favor of the
         * values provided in this input for any distance calculations during the optimization
         * process. The values provided here will also be used for cost calculations when
         * `travel_cost` is “distance”.
         *
         * The number of arrays in the input should be equal to the number of coordinate points
         * mentioned in the `location` array and each array, in turn, should contain the same number
         * of elements as well.
         *
         * **Note:**
         * - `duration_matrix` is mandatory when using`distance_matrix`.
         * - When using `distance_matrix` route geometry will not be available in the optimized
         *   solution.
         */
        fun distanceMatrix(distanceMatrix: List<List<Long>>) = apply {
            body.distanceMatrix(distanceMatrix)
        }

        /**
         * Sets [Builder.distanceMatrix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.distanceMatrix] with a well-typed `List<List<Long>>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun distanceMatrix(distanceMatrix: JsonField<List<List<Long>>>) = apply {
            body.distanceMatrix(distanceMatrix)
        }

        /**
         * Adds a single [List<Long>] to [Builder.distanceMatrix].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDistanceMatrix(distanceMatrix: List<Long>) = apply {
            body.addDistanceMatrix(distanceMatrix)
        }

        /**
         * An array of arrays to denote the user-defined durations, in seconds, for travelling
         * between each pair of geographic coordinates mentioned in the `location` array. When this
         * input is provided, actual durations between the locations will be ignored in favor of the
         * values provided in the matrix for any ETA calculations during the optimization process.
         * The values provided in the matrix will also be used for cost calculations when
         * `travel_cost` is “duration”.
         *
         * The number of arrays in the input should be equal to the number of coordinate points
         * mentioned in the `location` array and each array, in turn, should contain the same number
         * of elements as well.
         *
         * Please note that, unlike `distance_matrix`, `duration_matrix` can be used independently
         * in following cases:
         * - when `travel_cost` is “duration”
         * - when `travel_cost` is “customized” and a `cost_matrix` is provided
         *
         * Also, the route geometry will not be available in the optimized solution when using
         * `duration_matrix`.
         */
        fun durationMatrix(durationMatrix: List<List<Long>>) = apply {
            body.durationMatrix(durationMatrix)
        }

        /**
         * Sets [Builder.durationMatrix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationMatrix] with a well-typed `List<List<Long>>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun durationMatrix(durationMatrix: JsonField<List<List<Long>>>) = apply {
            body.durationMatrix(durationMatrix)
        }

        /**
         * Adds a single [List<Long>] to [Builder.durationMatrix].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDurationMatrix(durationMatrix: List<Long>) = apply {
            body.addDurationMatrix(durationMatrix)
        }

        /** The previous optimization request id used to retrieve solution for reoptimization */
        fun existingSolutionId(existingSolutionId: String) = apply {
            body.existingSolutionId(existingSolutionId)
        }

        /**
         * Sets [Builder.existingSolutionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.existingSolutionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun existingSolutionId(existingSolutionId: JsonField<String>) = apply {
            body.existingSolutionId(existingSolutionId)
        }

        /**
         * `jobs` object is used to collect the details of a particular job or task that needs to be
         * completed as part of the optimization process. Each job can have either a `pickup` or
         * `delivery` step, but not both. Read more about this attribute in the
         * [Job Object](#job-object) section.
         *
         * Please note that either the `jobs` or the `shipments` attribute should be specified to
         * build a valid request.
         */
        fun jobs(jobs: List<Job>) = apply { body.jobs(jobs) }

        /**
         * Sets [Builder.jobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobs] with a well-typed `List<Job>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobs(jobs: JsonField<List<Job>>) = apply { body.jobs(jobs) }

        /**
         * Adds a single [Job] to [jobs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addJob(job: Job) = apply { body.addJob(job) }

        /**
         * It represents the set of options that can be used to configure optimization algorithms so
         * that the solver provides a solution that meets the desired business objectives.
         */
        fun options(options: Options) = apply { body.options(options) }

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed [Options] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun options(options: JsonField<Options>) = apply { body.options(options) }

        /**
         * `relations` attribute is an array of individual relation objects. `type` parameter and
         * `steps` object are mandatory when using this attribute.
         *
         * Please note:
         * - The soft constraints are **not** effective when using the `relations` attribute.
         * - In case a given relation can't be satisfied, the optimizer will flag all the tasks
         *   involved in that "relation" as unassigned.
         *
         * Read more about this attribute in the [Relations Object](#relations-object) section.
         */
        fun relations(relations: List<Relation>) = apply { body.relations(relations) }

        /**
         * Sets [Builder.relations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relations] with a well-typed `List<Relation>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun relations(relations: JsonField<List<Relation>>) = apply { body.relations(relations) }

        /**
         * Adds a single [Relation] to [relations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRelation(relation: Relation) = apply { body.addRelation(relation) }

        /**
         * The `shipments` object is used to collect the details of shipments that need to be
         * completed as part of the optimization process.
         *
         * Each shipment should have a pickup and the corresponding delivery step.
         *
         * Please note that either the `jobs` or the `shipments` attribute should be specified to
         * build a valid request.
         */
        fun shipments(shipments: List<Shipment>) = apply { body.shipments(shipments) }

        /**
         * Sets [Builder.shipments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shipments] with a well-typed `List<Shipment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shipments(shipments: JsonField<List<Shipment>>) = apply { body.shipments(shipments) }

        /**
         * Adds a single [Shipment] to [shipments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addShipment(shipment: Shipment) = apply { body.addShipment(shipment) }

        /**
         * This attribute is related to the re-optimization feature. It allows for the previous
         * optimization result to be provided in case new orders are received and the solution needs
         * to be re-planned. The `solution` attribute should contain the same routes as the previous
         * optimization result. `solution` attribute is an array of objects with each object
         * corresponding to one route.
         */
        fun solution(solution: List<Solution>) = apply { body.solution(solution) }

        /**
         * Sets [Builder.solution] to an arbitrary JSON value.
         *
         * You should usually call [Builder.solution] with a well-typed `List<Solution>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun solution(solution: JsonField<List<Solution>>) = apply { body.solution(solution) }

        /**
         * Adds a single [Solution] to [Builder.solution].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSolution(solution: Solution) = apply { body.addSolution(solution) }

        /**
         * `unassigned` attribute is related to the re-optimization feature. This attribute should
         * contain the tasks that were not assigned during an earlier optimization process. Please
         * note that the `unassigned` part in request should be consistent with the `unassigned`
         * part in the previous optimization result.
         *
         * Users can reduce the number of unassigned tasks in the re-optimized solution, by
         * following strategies such as:
         * - Extending the time windows for vehicles or tasks to give more flexibility
         * - Adding more vehicles to the optimization problem
         * - Adjusting the priority of different tasks to balance the workload more evenly
         * - Modifying other constraints or parameters to make the problem more solvable
         *
         * Ultimately, the goal is to minimize the number of unassigned tasks while still meeting
         * all the necessary constraints and objectives.
         */
        fun unassigned(unassigned: Unassigned) = apply { body.unassigned(unassigned) }

        /**
         * Sets [Builder.unassigned] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unassigned] with a well-typed [Unassigned] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun unassigned(unassigned: JsonField<Unassigned>) = apply { body.unassigned(unassigned) }

        /**
         * An array of objects to specify geometry of all the zones involved. Each object
         * corresponds to a single zone. A valid zone can be a
         * [geoJSON](https://datatracker.ietf.org/doc/html/rfc7946#page-9) polygon, multi-polygon or
         * a geofence created using [NextBillion.ai](http://NextBillion.ai)’s [Geofence
         * API](https://docs.nextbillion.ai/docs/tracking/api/geofence).
         *
         * Please note that
         * - Each zone should have a geometry specified either through`geometry` or through the
         *   `geofence_id` parameter.
         * - When zone IDs are not provided for individual tasks (jobs or shipments) then the API
         *   will automatically allocate zones based on the task’s geolocation and the geometries of
         *   the zones provided here. Otherwise, if the zone IDs are provided while configuring
         *   individual tasks, the zone IDs will override the geometries provided here.
         */
        fun zones(zones: List<Zone>) = apply { body.zones(zones) }

        /**
         * Sets [Builder.zones] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zones] with a well-typed `List<Zone>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun zones(zones: JsonField<List<Zone>>) = apply { body.zones(zones) }

        /**
         * Adds a single [Zone] to [zones].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addZone(zone: Zone) = apply { body.addZone(zone) }

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
         * Returns an immutable instance of [V2SubmitParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .locations()
         * .vehicles()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V2SubmitParams =
            V2SubmitParams(
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
        private val locations: JsonField<Locations>,
        private val vehicles: JsonField<List<Vehicle>>,
        private val costMatrix: JsonField<List<List<Long>>>,
        private val depots: JsonField<List<Depot>>,
        private val description: JsonField<String>,
        private val distanceMatrix: JsonField<List<List<Long>>>,
        private val durationMatrix: JsonField<List<List<Long>>>,
        private val existingSolutionId: JsonField<String>,
        private val jobs: JsonField<List<Job>>,
        private val options: JsonField<Options>,
        private val relations: JsonField<List<Relation>>,
        private val shipments: JsonField<List<Shipment>>,
        private val solution: JsonField<List<Solution>>,
        private val unassigned: JsonField<Unassigned>,
        private val zones: JsonField<List<Zone>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("locations")
            @ExcludeMissing
            locations: JsonField<Locations> = JsonMissing.of(),
            @JsonProperty("vehicles")
            @ExcludeMissing
            vehicles: JsonField<List<Vehicle>> = JsonMissing.of(),
            @JsonProperty("cost_matrix")
            @ExcludeMissing
            costMatrix: JsonField<List<List<Long>>> = JsonMissing.of(),
            @JsonProperty("depots")
            @ExcludeMissing
            depots: JsonField<List<Depot>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("distance_matrix")
            @ExcludeMissing
            distanceMatrix: JsonField<List<List<Long>>> = JsonMissing.of(),
            @JsonProperty("duration_matrix")
            @ExcludeMissing
            durationMatrix: JsonField<List<List<Long>>> = JsonMissing.of(),
            @JsonProperty("existing_solution_id")
            @ExcludeMissing
            existingSolutionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("jobs") @ExcludeMissing jobs: JsonField<List<Job>> = JsonMissing.of(),
            @JsonProperty("options") @ExcludeMissing options: JsonField<Options> = JsonMissing.of(),
            @JsonProperty("relations")
            @ExcludeMissing
            relations: JsonField<List<Relation>> = JsonMissing.of(),
            @JsonProperty("shipments")
            @ExcludeMissing
            shipments: JsonField<List<Shipment>> = JsonMissing.of(),
            @JsonProperty("solution")
            @ExcludeMissing
            solution: JsonField<List<Solution>> = JsonMissing.of(),
            @JsonProperty("unassigned")
            @ExcludeMissing
            unassigned: JsonField<Unassigned> = JsonMissing.of(),
            @JsonProperty("zones") @ExcludeMissing zones: JsonField<List<Zone>> = JsonMissing.of(),
        ) : this(
            locations,
            vehicles,
            costMatrix,
            depots,
            description,
            distanceMatrix,
            durationMatrix,
            existingSolutionId,
            jobs,
            options,
            relations,
            shipments,
            solution,
            unassigned,
            zones,
            mutableMapOf(),
        )

        /**
         * The `locations` object is used to define all the locations that will be used during the
         * optimization process. Read more about this attribute in the
         * [Location Object](#location-object) section.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun locations(): Locations = locations.getRequired("locations")

        /**
         * The `vehicles` attribute describes the characteristics and constraints of the vehicles
         * that will be used for fulfilling the tasks. Read more about this attribute in the
         * [Vehicle Object](#vehicle-object) section.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun vehicles(): List<Vehicle> = vehicles.getRequired("vehicles")

        /**
         * An array of arrays to denote the user-defined costs of traveling between each pair of
         * geographic coordinates mentioned in the `location` array. The number of arrays should be
         * equal to the number of coordinate points mentioned in the `location` array and each array
         * should contain the same number of elements as well. Please note that `cost_matrix` is
         * effective only when `travel_cost=customized`. Read more about this attribute in the
         * [Custom Cost Matrix](#custom-cost-matrix) section.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun costMatrix(): Optional<List<List<Long>>> = costMatrix.getOptional("cost_matrix")

        /**
         * `depots` object is used to collect the details of a depot. Depots can be used as a
         * starting point and/or ending point for the routes and vehicles. They also can be used to
         * fulfil pickup and delivery type`jobs` . The loads which are to be delivered at task
         * locations will be picked from depots and loads picked-up from task locations will be
         * delivered back to the depots. A depot can be configured using the following fields:
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun depots(): Optional<List<Depot>> = depots.getOptional("depots")

        /**
         * Define the optimization job using any custom message. This description is returned as is
         * in the response.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * An array of arrays to denote the user-defined distances, in meters, for travelling
         * between each pair of geographic coordinates mentioned in the `location` array. When this
         * input is provided, actual distances between the locations will be ignored in favor of the
         * values provided in this input for any distance calculations during the optimization
         * process. The values provided here will also be used for cost calculations when
         * `travel_cost` is “distance”.
         *
         * The number of arrays in the input should be equal to the number of coordinate points
         * mentioned in the `location` array and each array, in turn, should contain the same number
         * of elements as well.
         *
         * **Note:**
         * - `duration_matrix` is mandatory when using`distance_matrix`.
         * - When using `distance_matrix` route geometry will not be available in the optimized
         *   solution.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun distanceMatrix(): Optional<List<List<Long>>> =
            distanceMatrix.getOptional("distance_matrix")

        /**
         * An array of arrays to denote the user-defined durations, in seconds, for travelling
         * between each pair of geographic coordinates mentioned in the `location` array. When this
         * input is provided, actual durations between the locations will be ignored in favor of the
         * values provided in the matrix for any ETA calculations during the optimization process.
         * The values provided in the matrix will also be used for cost calculations when
         * `travel_cost` is “duration”.
         *
         * The number of arrays in the input should be equal to the number of coordinate points
         * mentioned in the `location` array and each array, in turn, should contain the same number
         * of elements as well.
         *
         * Please note that, unlike `distance_matrix`, `duration_matrix` can be used independently
         * in following cases:
         * - when `travel_cost` is “duration”
         * - when `travel_cost` is “customized” and a `cost_matrix` is provided
         *
         * Also, the route geometry will not be available in the optimized solution when using
         * `duration_matrix`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun durationMatrix(): Optional<List<List<Long>>> =
            durationMatrix.getOptional("duration_matrix")

        /**
         * The previous optimization request id used to retrieve solution for reoptimization
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun existingSolutionId(): Optional<String> =
            existingSolutionId.getOptional("existing_solution_id")

        /**
         * `jobs` object is used to collect the details of a particular job or task that needs to be
         * completed as part of the optimization process. Each job can have either a `pickup` or
         * `delivery` step, but not both. Read more about this attribute in the
         * [Job Object](#job-object) section.
         *
         * Please note that either the `jobs` or the `shipments` attribute should be specified to
         * build a valid request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun jobs(): Optional<List<Job>> = jobs.getOptional("jobs")

        /**
         * It represents the set of options that can be used to configure optimization algorithms so
         * that the solver provides a solution that meets the desired business objectives.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun options(): Optional<Options> = options.getOptional("options")

        /**
         * `relations` attribute is an array of individual relation objects. `type` parameter and
         * `steps` object are mandatory when using this attribute.
         *
         * Please note:
         * - The soft constraints are **not** effective when using the `relations` attribute.
         * - In case a given relation can't be satisfied, the optimizer will flag all the tasks
         *   involved in that "relation" as unassigned.
         *
         * Read more about this attribute in the [Relations Object](#relations-object) section.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun relations(): Optional<List<Relation>> = relations.getOptional("relations")

        /**
         * The `shipments` object is used to collect the details of shipments that need to be
         * completed as part of the optimization process.
         *
         * Each shipment should have a pickup and the corresponding delivery step.
         *
         * Please note that either the `jobs` or the `shipments` attribute should be specified to
         * build a valid request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun shipments(): Optional<List<Shipment>> = shipments.getOptional("shipments")

        /**
         * This attribute is related to the re-optimization feature. It allows for the previous
         * optimization result to be provided in case new orders are received and the solution needs
         * to be re-planned. The `solution` attribute should contain the same routes as the previous
         * optimization result. `solution` attribute is an array of objects with each object
         * corresponding to one route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun solution(): Optional<List<Solution>> = solution.getOptional("solution")

        /**
         * `unassigned` attribute is related to the re-optimization feature. This attribute should
         * contain the tasks that were not assigned during an earlier optimization process. Please
         * note that the `unassigned` part in request should be consistent with the `unassigned`
         * part in the previous optimization result.
         *
         * Users can reduce the number of unassigned tasks in the re-optimized solution, by
         * following strategies such as:
         * - Extending the time windows for vehicles or tasks to give more flexibility
         * - Adding more vehicles to the optimization problem
         * - Adjusting the priority of different tasks to balance the workload more evenly
         * - Modifying other constraints or parameters to make the problem more solvable
         *
         * Ultimately, the goal is to minimize the number of unassigned tasks while still meeting
         * all the necessary constraints and objectives.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun unassigned(): Optional<Unassigned> = unassigned.getOptional("unassigned")

        /**
         * An array of objects to specify geometry of all the zones involved. Each object
         * corresponds to a single zone. A valid zone can be a
         * [geoJSON](https://datatracker.ietf.org/doc/html/rfc7946#page-9) polygon, multi-polygon or
         * a geofence created using [NextBillion.ai](http://NextBillion.ai)’s [Geofence
         * API](https://docs.nextbillion.ai/docs/tracking/api/geofence).
         *
         * Please note that
         * - Each zone should have a geometry specified either through`geometry` or through the
         *   `geofence_id` parameter.
         * - When zone IDs are not provided for individual tasks (jobs or shipments) then the API
         *   will automatically allocate zones based on the task’s geolocation and the geometries of
         *   the zones provided here. Otherwise, if the zone IDs are provided while configuring
         *   individual tasks, the zone IDs will override the geometries provided here.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun zones(): Optional<List<Zone>> = zones.getOptional("zones")

        /**
         * Returns the raw JSON value of [locations].
         *
         * Unlike [locations], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locations")
        @ExcludeMissing
        fun _locations(): JsonField<Locations> = locations

        /**
         * Returns the raw JSON value of [vehicles].
         *
         * Unlike [vehicles], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vehicles")
        @ExcludeMissing
        fun _vehicles(): JsonField<List<Vehicle>> = vehicles

        /**
         * Returns the raw JSON value of [costMatrix].
         *
         * Unlike [costMatrix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cost_matrix")
        @ExcludeMissing
        fun _costMatrix(): JsonField<List<List<Long>>> = costMatrix

        /**
         * Returns the raw JSON value of [depots].
         *
         * Unlike [depots], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("depots") @ExcludeMissing fun _depots(): JsonField<List<Depot>> = depots

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [distanceMatrix].
         *
         * Unlike [distanceMatrix], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("distance_matrix")
        @ExcludeMissing
        fun _distanceMatrix(): JsonField<List<List<Long>>> = distanceMatrix

        /**
         * Returns the raw JSON value of [durationMatrix].
         *
         * Unlike [durationMatrix], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("duration_matrix")
        @ExcludeMissing
        fun _durationMatrix(): JsonField<List<List<Long>>> = durationMatrix

        /**
         * Returns the raw JSON value of [existingSolutionId].
         *
         * Unlike [existingSolutionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("existing_solution_id")
        @ExcludeMissing
        fun _existingSolutionId(): JsonField<String> = existingSolutionId

        /**
         * Returns the raw JSON value of [jobs].
         *
         * Unlike [jobs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("jobs") @ExcludeMissing fun _jobs(): JsonField<List<Job>> = jobs

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<Options> = options

        /**
         * Returns the raw JSON value of [relations].
         *
         * Unlike [relations], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("relations")
        @ExcludeMissing
        fun _relations(): JsonField<List<Relation>> = relations

        /**
         * Returns the raw JSON value of [shipments].
         *
         * Unlike [shipments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shipments")
        @ExcludeMissing
        fun _shipments(): JsonField<List<Shipment>> = shipments

        /**
         * Returns the raw JSON value of [solution].
         *
         * Unlike [solution], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("solution")
        @ExcludeMissing
        fun _solution(): JsonField<List<Solution>> = solution

        /**
         * Returns the raw JSON value of [unassigned].
         *
         * Unlike [unassigned], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unassigned")
        @ExcludeMissing
        fun _unassigned(): JsonField<Unassigned> = unassigned

        /**
         * Returns the raw JSON value of [zones].
         *
         * Unlike [zones], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zones") @ExcludeMissing fun _zones(): JsonField<List<Zone>> = zones

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
             * .locations()
             * .vehicles()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var locations: JsonField<Locations>? = null
            private var vehicles: JsonField<MutableList<Vehicle>>? = null
            private var costMatrix: JsonField<MutableList<List<Long>>>? = null
            private var depots: JsonField<MutableList<Depot>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var distanceMatrix: JsonField<MutableList<List<Long>>>? = null
            private var durationMatrix: JsonField<MutableList<List<Long>>>? = null
            private var existingSolutionId: JsonField<String> = JsonMissing.of()
            private var jobs: JsonField<MutableList<Job>>? = null
            private var options: JsonField<Options> = JsonMissing.of()
            private var relations: JsonField<MutableList<Relation>>? = null
            private var shipments: JsonField<MutableList<Shipment>>? = null
            private var solution: JsonField<MutableList<Solution>>? = null
            private var unassigned: JsonField<Unassigned> = JsonMissing.of()
            private var zones: JsonField<MutableList<Zone>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                locations = body.locations
                vehicles = body.vehicles.map { it.toMutableList() }
                costMatrix = body.costMatrix.map { it.toMutableList() }
                depots = body.depots.map { it.toMutableList() }
                description = body.description
                distanceMatrix = body.distanceMatrix.map { it.toMutableList() }
                durationMatrix = body.durationMatrix.map { it.toMutableList() }
                existingSolutionId = body.existingSolutionId
                jobs = body.jobs.map { it.toMutableList() }
                options = body.options
                relations = body.relations.map { it.toMutableList() }
                shipments = body.shipments.map { it.toMutableList() }
                solution = body.solution.map { it.toMutableList() }
                unassigned = body.unassigned
                zones = body.zones.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The `locations` object is used to define all the locations that will be used during
             * the optimization process. Read more about this attribute in the
             * [Location Object](#location-object) section.
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

            /**
             * The `vehicles` attribute describes the characteristics and constraints of the
             * vehicles that will be used for fulfilling the tasks. Read more about this attribute
             * in the [Vehicle Object](#vehicle-object) section.
             */
            fun vehicles(vehicles: List<Vehicle>) = vehicles(JsonField.of(vehicles))

            /**
             * Sets [Builder.vehicles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vehicles] with a well-typed `List<Vehicle>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vehicles(vehicles: JsonField<List<Vehicle>>) = apply {
                this.vehicles = vehicles.map { it.toMutableList() }
            }

            /**
             * Adds a single [Vehicle] to [vehicles].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVehicle(vehicle: Vehicle) = apply {
                vehicles =
                    (vehicles ?: JsonField.of(mutableListOf())).also {
                        checkKnown("vehicles", it).add(vehicle)
                    }
            }

            /**
             * An array of arrays to denote the user-defined costs of traveling between each pair of
             * geographic coordinates mentioned in the `location` array. The number of arrays should
             * be equal to the number of coordinate points mentioned in the `location` array and
             * each array should contain the same number of elements as well. Please note that
             * `cost_matrix` is effective only when `travel_cost=customized`. Read more about this
             * attribute in the [Custom Cost Matrix](#custom-cost-matrix) section.
             */
            fun costMatrix(costMatrix: List<List<Long>>) = costMatrix(JsonField.of(costMatrix))

            /**
             * Sets [Builder.costMatrix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.costMatrix] with a well-typed `List<List<Long>>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun costMatrix(costMatrix: JsonField<List<List<Long>>>) = apply {
                this.costMatrix = costMatrix.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<Long>] to [Builder.costMatrix].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCostMatrix(costMatrix: List<Long>) = apply {
                this.costMatrix =
                    (this.costMatrix ?: JsonField.of(mutableListOf())).also {
                        checkKnown("costMatrix", it).add(costMatrix)
                    }
            }

            /**
             * `depots` object is used to collect the details of a depot. Depots can be used as a
             * starting point and/or ending point for the routes and vehicles. They also can be used
             * to fulfil pickup and delivery type`jobs` . The loads which are to be delivered at
             * task locations will be picked from depots and loads picked-up from task locations
             * will be delivered back to the depots. A depot can be configured using the following
             * fields:
             */
            fun depots(depots: List<Depot>) = depots(JsonField.of(depots))

            /**
             * Sets [Builder.depots] to an arbitrary JSON value.
             *
             * You should usually call [Builder.depots] with a well-typed `List<Depot>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun depots(depots: JsonField<List<Depot>>) = apply {
                this.depots = depots.map { it.toMutableList() }
            }

            /**
             * Adds a single [Depot] to [depots].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDepot(depot: Depot) = apply {
                depots =
                    (depots ?: JsonField.of(mutableListOf())).also {
                        checkKnown("depots", it).add(depot)
                    }
            }

            /**
             * Define the optimization job using any custom message. This description is returned as
             * is in the response.
             */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * An array of arrays to denote the user-defined distances, in meters, for travelling
             * between each pair of geographic coordinates mentioned in the `location` array. When
             * this input is provided, actual distances between the locations will be ignored in
             * favor of the values provided in this input for any distance calculations during the
             * optimization process. The values provided here will also be used for cost
             * calculations when `travel_cost` is “distance”.
             *
             * The number of arrays in the input should be equal to the number of coordinate points
             * mentioned in the `location` array and each array, in turn, should contain the same
             * number of elements as well.
             *
             * **Note:**
             * - `duration_matrix` is mandatory when using`distance_matrix`.
             * - When using `distance_matrix` route geometry will not be available in the optimized
             *   solution.
             */
            fun distanceMatrix(distanceMatrix: List<List<Long>>) =
                distanceMatrix(JsonField.of(distanceMatrix))

            /**
             * Sets [Builder.distanceMatrix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distanceMatrix] with a well-typed `List<List<Long>>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun distanceMatrix(distanceMatrix: JsonField<List<List<Long>>>) = apply {
                this.distanceMatrix = distanceMatrix.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<Long>] to [Builder.distanceMatrix].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDistanceMatrix(distanceMatrix: List<Long>) = apply {
                this.distanceMatrix =
                    (this.distanceMatrix ?: JsonField.of(mutableListOf())).also {
                        checkKnown("distanceMatrix", it).add(distanceMatrix)
                    }
            }

            /**
             * An array of arrays to denote the user-defined durations, in seconds, for travelling
             * between each pair of geographic coordinates mentioned in the `location` array. When
             * this input is provided, actual durations between the locations will be ignored in
             * favor of the values provided in the matrix for any ETA calculations during the
             * optimization process. The values provided in the matrix will also be used for cost
             * calculations when `travel_cost` is “duration”.
             *
             * The number of arrays in the input should be equal to the number of coordinate points
             * mentioned in the `location` array and each array, in turn, should contain the same
             * number of elements as well.
             *
             * Please note that, unlike `distance_matrix`, `duration_matrix` can be used
             * independently in following cases:
             * - when `travel_cost` is “duration”
             * - when `travel_cost` is “customized” and a `cost_matrix` is provided
             *
             * Also, the route geometry will not be available in the optimized solution when using
             * `duration_matrix`.
             */
            fun durationMatrix(durationMatrix: List<List<Long>>) =
                durationMatrix(JsonField.of(durationMatrix))

            /**
             * Sets [Builder.durationMatrix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.durationMatrix] with a well-typed `List<List<Long>>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun durationMatrix(durationMatrix: JsonField<List<List<Long>>>) = apply {
                this.durationMatrix = durationMatrix.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<Long>] to [Builder.durationMatrix].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDurationMatrix(durationMatrix: List<Long>) = apply {
                this.durationMatrix =
                    (this.durationMatrix ?: JsonField.of(mutableListOf())).also {
                        checkKnown("durationMatrix", it).add(durationMatrix)
                    }
            }

            /** The previous optimization request id used to retrieve solution for reoptimization */
            fun existingSolutionId(existingSolutionId: String) =
                existingSolutionId(JsonField.of(existingSolutionId))

            /**
             * Sets [Builder.existingSolutionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.existingSolutionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun existingSolutionId(existingSolutionId: JsonField<String>) = apply {
                this.existingSolutionId = existingSolutionId
            }

            /**
             * `jobs` object is used to collect the details of a particular job or task that needs
             * to be completed as part of the optimization process. Each job can have either a
             * `pickup` or `delivery` step, but not both. Read more about this attribute in the
             * [Job Object](#job-object) section.
             *
             * Please note that either the `jobs` or the `shipments` attribute should be specified
             * to build a valid request.
             */
            fun jobs(jobs: List<Job>) = jobs(JsonField.of(jobs))

            /**
             * Sets [Builder.jobs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jobs] with a well-typed `List<Job>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jobs(jobs: JsonField<List<Job>>) = apply {
                this.jobs = jobs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Job] to [jobs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addJob(job: Job) = apply {
                jobs =
                    (jobs ?: JsonField.of(mutableListOf())).also { checkKnown("jobs", it).add(job) }
            }

            /**
             * It represents the set of options that can be used to configure optimization
             * algorithms so that the solver provides a solution that meets the desired business
             * objectives.
             */
            fun options(options: Options) = options(JsonField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed [Options] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<Options>) = apply { this.options = options }

            /**
             * `relations` attribute is an array of individual relation objects. `type` parameter
             * and `steps` object are mandatory when using this attribute.
             *
             * Please note:
             * - The soft constraints are **not** effective when using the `relations` attribute.
             * - In case a given relation can't be satisfied, the optimizer will flag all the tasks
             *   involved in that "relation" as unassigned.
             *
             * Read more about this attribute in the [Relations Object](#relations-object) section.
             */
            fun relations(relations: List<Relation>) = relations(JsonField.of(relations))

            /**
             * Sets [Builder.relations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.relations] with a well-typed `List<Relation>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun relations(relations: JsonField<List<Relation>>) = apply {
                this.relations = relations.map { it.toMutableList() }
            }

            /**
             * Adds a single [Relation] to [relations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRelation(relation: Relation) = apply {
                relations =
                    (relations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("relations", it).add(relation)
                    }
            }

            /**
             * The `shipments` object is used to collect the details of shipments that need to be
             * completed as part of the optimization process.
             *
             * Each shipment should have a pickup and the corresponding delivery step.
             *
             * Please note that either the `jobs` or the `shipments` attribute should be specified
             * to build a valid request.
             */
            fun shipments(shipments: List<Shipment>) = shipments(JsonField.of(shipments))

            /**
             * Sets [Builder.shipments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shipments] with a well-typed `List<Shipment>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shipments(shipments: JsonField<List<Shipment>>) = apply {
                this.shipments = shipments.map { it.toMutableList() }
            }

            /**
             * Adds a single [Shipment] to [shipments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addShipment(shipment: Shipment) = apply {
                shipments =
                    (shipments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("shipments", it).add(shipment)
                    }
            }

            /**
             * This attribute is related to the re-optimization feature. It allows for the previous
             * optimization result to be provided in case new orders are received and the solution
             * needs to be re-planned. The `solution` attribute should contain the same routes as
             * the previous optimization result. `solution` attribute is an array of objects with
             * each object corresponding to one route.
             */
            fun solution(solution: List<Solution>) = solution(JsonField.of(solution))

            /**
             * Sets [Builder.solution] to an arbitrary JSON value.
             *
             * You should usually call [Builder.solution] with a well-typed `List<Solution>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun solution(solution: JsonField<List<Solution>>) = apply {
                this.solution = solution.map { it.toMutableList() }
            }

            /**
             * Adds a single [Solution] to [Builder.solution].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSolution(solution: Solution) = apply {
                this.solution =
                    (this.solution ?: JsonField.of(mutableListOf())).also {
                        checkKnown("solution", it).add(solution)
                    }
            }

            /**
             * `unassigned` attribute is related to the re-optimization feature. This attribute
             * should contain the tasks that were not assigned during an earlier optimization
             * process. Please note that the `unassigned` part in request should be consistent with
             * the `unassigned` part in the previous optimization result.
             *
             * Users can reduce the number of unassigned tasks in the re-optimized solution, by
             * following strategies such as:
             * - Extending the time windows for vehicles or tasks to give more flexibility
             * - Adding more vehicles to the optimization problem
             * - Adjusting the priority of different tasks to balance the workload more evenly
             * - Modifying other constraints or parameters to make the problem more solvable
             *
             * Ultimately, the goal is to minimize the number of unassigned tasks while still
             * meeting all the necessary constraints and objectives.
             */
            fun unassigned(unassigned: Unassigned) = unassigned(JsonField.of(unassigned))

            /**
             * Sets [Builder.unassigned] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unassigned] with a well-typed [Unassigned] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unassigned(unassigned: JsonField<Unassigned>) = apply {
                this.unassigned = unassigned
            }

            /**
             * An array of objects to specify geometry of all the zones involved. Each object
             * corresponds to a single zone. A valid zone can be a
             * [geoJSON](https://datatracker.ietf.org/doc/html/rfc7946#page-9) polygon,
             * multi-polygon or a geofence created using [NextBillion.ai](http://NextBillion.ai)’s
             * [Geofence API](https://docs.nextbillion.ai/docs/tracking/api/geofence).
             *
             * Please note that
             * - Each zone should have a geometry specified either through`geometry` or through the
             *   `geofence_id` parameter.
             * - When zone IDs are not provided for individual tasks (jobs or shipments) then the
             *   API will automatically allocate zones based on the task’s geolocation and the
             *   geometries of the zones provided here. Otherwise, if the zone IDs are provided
             *   while configuring individual tasks, the zone IDs will override the geometries
             *   provided here.
             */
            fun zones(zones: List<Zone>) = zones(JsonField.of(zones))

            /**
             * Sets [Builder.zones] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zones] with a well-typed `List<Zone>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun zones(zones: JsonField<List<Zone>>) = apply {
                this.zones = zones.map { it.toMutableList() }
            }

            /**
             * Adds a single [Zone] to [zones].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addZone(zone: Zone) = apply {
                zones =
                    (zones ?: JsonField.of(mutableListOf())).also {
                        checkKnown("zones", it).add(zone)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .locations()
             * .vehicles()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("locations", locations),
                    checkRequired("vehicles", vehicles).map { it.toImmutable() },
                    (costMatrix ?: JsonMissing.of()).map { it.toImmutable() },
                    (depots ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    (distanceMatrix ?: JsonMissing.of()).map { it.toImmutable() },
                    (durationMatrix ?: JsonMissing.of()).map { it.toImmutable() },
                    existingSolutionId,
                    (jobs ?: JsonMissing.of()).map { it.toImmutable() },
                    options,
                    (relations ?: JsonMissing.of()).map { it.toImmutable() },
                    (shipments ?: JsonMissing.of()).map { it.toImmutable() },
                    (solution ?: JsonMissing.of()).map { it.toImmutable() },
                    unassigned,
                    (zones ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            locations().validate()
            vehicles().forEach { it.validate() }
            costMatrix()
            depots().ifPresent { it.forEach { it.validate() } }
            description()
            distanceMatrix()
            durationMatrix()
            existingSolutionId()
            jobs().ifPresent { it.forEach { it.validate() } }
            options().ifPresent { it.validate() }
            relations().ifPresent { it.forEach { it.validate() } }
            shipments().ifPresent { it.forEach { it.validate() } }
            solution().ifPresent { it.forEach { it.validate() } }
            unassigned().ifPresent { it.validate() }
            zones().ifPresent { it.forEach { it.validate() } }
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
            (locations.asKnown().getOrNull()?.validity() ?: 0) +
                (vehicles.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (costMatrix.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                (depots.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (distanceMatrix.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                (durationMatrix.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                (if (existingSolutionId.asKnown().isPresent) 1 else 0) +
                (jobs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (options.asKnown().getOrNull()?.validity() ?: 0) +
                (relations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (shipments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (solution.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (unassigned.asKnown().getOrNull()?.validity() ?: 0) +
                (zones.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && locations == other.locations && vehicles == other.vehicles && costMatrix == other.costMatrix && depots == other.depots && description == other.description && distanceMatrix == other.distanceMatrix && durationMatrix == other.durationMatrix && existingSolutionId == other.existingSolutionId && jobs == other.jobs && options == other.options && relations == other.relations && shipments == other.shipments && solution == other.solution && unassigned == other.unassigned && zones == other.zones && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(locations, vehicles, costMatrix, depots, description, distanceMatrix, durationMatrix, existingSolutionId, jobs, options, relations, shipments, solution, unassigned, zones, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{locations=$locations, vehicles=$vehicles, costMatrix=$costMatrix, depots=$depots, description=$description, distanceMatrix=$distanceMatrix, durationMatrix=$durationMatrix, existingSolutionId=$existingSolutionId, jobs=$jobs, options=$options, relations=$relations, shipments=$shipments, solution=$solution, unassigned=$unassigned, zones=$zones, additionalProperties=$additionalProperties}"
    }

    /**
     * The `locations` object is used to define all the locations that will be used during the
     * optimization process. Read more about this attribute in the
     * [Location Object](#location-object) section.
     */
    class Locations
    private constructor(
        private val location: JsonField<List<String>>,
        private val id: JsonField<Long>,
        private val approaches: JsonField<List<Approach>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("location")
            @ExcludeMissing
            location: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("approaches")
            @ExcludeMissing
            approaches: JsonField<List<Approach>> = JsonMissing.of(),
        ) : this(location, id, approaches, mutableMapOf())

        /**
         * Indicate all the location coordinates that will be used during optimization. The
         * coordinates should be specified in the format “latitude, longitude”. It is recommended to
         * avoid adding duplicate location coordinates to this array. In case there are multiple
         * tasks at the same location, users can repeat the index of the location while configuring
         * all such tasks.
         *
         * Please use this array to determine the index of a location when setting the
         * `location_index` parameter in `jobs`, `shipments`, `vehicles` or other parts of the
         * request. The length of this array determines the valid values for `location_index`
         * parameter.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun location(): List<String> = location.getRequired("location")

        /**
         * A unique ID for the set of locations. It should be a positive integer.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun id(): Optional<Long> = id.getOptional("id")

        /**
         * Describe if the location is curbside. An array of strings indicates the side of the road
         * from which to approach the location in the calculated route. If provided, the number of
         * approaches must be equal to the number of locations. However, you can skip a coordinate
         * and show its position in the list using “” (empty string). Please note these values are
         * case-sensitive.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun approaches(): Optional<List<Approach>> = approaches.getOptional("approaches")

        /**
         * Returns the raw JSON value of [location].
         *
         * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location")
        @ExcludeMissing
        fun _location(): JsonField<List<String>> = location

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [approaches].
         *
         * Unlike [approaches], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("approaches")
        @ExcludeMissing
        fun _approaches(): JsonField<List<Approach>> = approaches

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
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Locations]. */
        class Builder internal constructor() {

            private var location: JsonField<MutableList<String>>? = null
            private var id: JsonField<Long> = JsonMissing.of()
            private var approaches: JsonField<MutableList<Approach>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(locations: Locations) = apply {
                location = locations.location.map { it.toMutableList() }
                id = locations.id
                approaches = locations.approaches.map { it.toMutableList() }
                additionalProperties = locations.additionalProperties.toMutableMap()
            }

            /**
             * Indicate all the location coordinates that will be used during optimization. The
             * coordinates should be specified in the format “latitude, longitude”. It is
             * recommended to avoid adding duplicate location coordinates to this array. In case
             * there are multiple tasks at the same location, users can repeat the index of the
             * location while configuring all such tasks.
             *
             * Please use this array to determine the index of a location when setting the
             * `location_index` parameter in `jobs`, `shipments`, `vehicles` or other parts of the
             * request. The length of this array determines the valid values for `location_index`
             * parameter.
             */
            fun location(location: List<String>) = location(JsonField.of(location))

            /**
             * Sets [Builder.location] to an arbitrary JSON value.
             *
             * You should usually call [Builder.location] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun location(location: JsonField<List<String>>) = apply {
                this.location = location.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.location].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLocation(location: String) = apply {
                this.location =
                    (this.location ?: JsonField.of(mutableListOf())).also {
                        checkKnown("location", it).add(location)
                    }
            }

            /** A unique ID for the set of locations. It should be a positive integer. */
            fun id(id: Long) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Long>) = apply { this.id = id }

            /**
             * Describe if the location is curbside. An array of strings indicates the side of the
             * road from which to approach the location in the calculated route. If provided, the
             * number of approaches must be equal to the number of locations. However, you can skip
             * a coordinate and show its position in the list using “” (empty string). Please note
             * these values are case-sensitive.
             */
            fun approaches(approaches: List<Approach>) = approaches(JsonField.of(approaches))

            /**
             * Sets [Builder.approaches] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approaches] with a well-typed `List<Approach>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun approaches(approaches: JsonField<List<Approach>>) = apply {
                this.approaches = approaches.map { it.toMutableList() }
            }

            /**
             * Adds a single [Approach] to [approaches].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApproach(approach: Approach) = apply {
                approaches =
                    (approaches ?: JsonField.of(mutableListOf())).also {
                        checkKnown("approaches", it).add(approach)
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
             * Returns an immutable instance of [Locations].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .location()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Locations =
                Locations(
                    checkRequired("location", location).map { it.toImmutable() },
                    id,
                    (approaches ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Locations = apply {
            if (validated) {
                return@apply
            }

            location()
            id()
            approaches().ifPresent { it.forEach { it.validate() } }
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
            (location.asKnown().getOrNull()?.size ?: 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (approaches.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Approach @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val UNRESTRICTED = of("`unrestricted`")

                @JvmField val CURB = of("`curb`")

                @JvmField val EMPTY_STRING = of("\"\"(empty string)")

                @JvmStatic fun of(value: String) = Approach(JsonField.of(value))
            }

            /** An enum containing [Approach]'s known values. */
            enum class Known {
                UNRESTRICTED,
                CURB,
                EMPTY_STRING,
            }

            /**
             * An enum containing [Approach]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Approach] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                UNRESTRICTED,
                CURB,
                EMPTY_STRING,
                /**
                 * An enum member indicating that [Approach] was instantiated with an unknown value.
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
                    UNRESTRICTED -> Value.UNRESTRICTED
                    CURB -> Value.CURB
                    EMPTY_STRING -> Value.EMPTY_STRING
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
                    UNRESTRICTED -> Known.UNRESTRICTED
                    CURB -> Known.CURB
                    EMPTY_STRING -> Known.EMPTY_STRING
                    else -> throw NextbillionSdkInvalidDataException("Unknown Approach: $value")
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

            fun validate(): Approach = apply {
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

                return /* spotless:off */ other is Approach && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Locations && location == other.location && id == other.id && approaches == other.approaches && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(location, id, approaches, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Locations{location=$location, id=$id, approaches=$approaches, additionalProperties=$additionalProperties}"
    }

    class Depot
    private constructor(
        private val id: JsonField<String>,
        private val locationIndex: JsonField<Long>,
        private val description: JsonField<String>,
        private val service: JsonField<Long>,
        private val timeWindows: JsonField<List<List<Long>>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("location_index")
            @ExcludeMissing
            locationIndex: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("service") @ExcludeMissing service: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("time_windows")
            @ExcludeMissing
            timeWindows: JsonField<List<List<Long>>> = JsonMissing.of(),
        ) : this(id, locationIndex, description, service, timeWindows, mutableMapOf())

        /**
         * Provide an unique ID for the depot. The IDs are case sensitive.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Specify the index of coordinates (in the `location` array) denoting the depot’s location.
         * The valid range of values is \[0, length of `location` array). If the location index
         * exceeds the count of input locations in the `location` array, the API will report an
         * error.
         *
         * Please note the `location_index` is mandatory when using the `depots` object.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun locationIndex(): Long = locationIndex.getRequired("location_index")

        /**
         * Add a custom description for the depot.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Specify the time duration, in seconds, needed to load or unload the vehicle each time it
         * starts or arrives at a depot, respectively. Default value is 0.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun service(): Optional<Long> = service.getOptional("service")

        /**
         * Specify the time-windows during which the depot is operational and allows vehicles to be
         * loaded / unloaded. The time periods should be expressed as a UNIX timestamp in seconds.
         *
         * Please note that:
         * - Multiple time-windows can be provided but those time windows should not overlap with
         *   each other.
         * - Time windows should always be specified in the format of \[start_timestamp,
         *   end_timestamp\].
         * - Depot's time-windows are ineffective used when `max_activity_waiting_time` is specified
         *   in the input.
         * - Using `relations` along with depot time-window is not allowed and the service will
         *   return an error.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun timeWindows(): Optional<List<List<Long>>> = timeWindows.getOptional("time_windows")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [locationIndex].
         *
         * Unlike [locationIndex], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("location_index")
        @ExcludeMissing
        fun _locationIndex(): JsonField<Long> = locationIndex

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [service].
         *
         * Unlike [service], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("service") @ExcludeMissing fun _service(): JsonField<Long> = service

        /**
         * Returns the raw JSON value of [timeWindows].
         *
         * Unlike [timeWindows], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("time_windows")
        @ExcludeMissing
        fun _timeWindows(): JsonField<List<List<Long>>> = timeWindows

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
             * Returns a mutable builder for constructing an instance of [Depot].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .locationIndex()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Depot]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var locationIndex: JsonField<Long>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var service: JsonField<Long> = JsonMissing.of()
            private var timeWindows: JsonField<MutableList<List<Long>>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(depot: Depot) = apply {
                id = depot.id
                locationIndex = depot.locationIndex
                description = depot.description
                service = depot.service
                timeWindows = depot.timeWindows.map { it.toMutableList() }
                additionalProperties = depot.additionalProperties.toMutableMap()
            }

            /** Provide an unique ID for the depot. The IDs are case sensitive. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Specify the index of coordinates (in the `location` array) denoting the depot’s
             * location. The valid range of values is \[0, length of `location` array). If the
             * location index exceeds the count of input locations in the `location` array, the API
             * will report an error.
             *
             * Please note the `location_index` is mandatory when using the `depots` object.
             */
            fun locationIndex(locationIndex: Long) = locationIndex(JsonField.of(locationIndex))

            /**
             * Sets [Builder.locationIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locationIndex] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locationIndex(locationIndex: JsonField<Long>) = apply {
                this.locationIndex = locationIndex
            }

            /** Add a custom description for the depot. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Specify the time duration, in seconds, needed to load or unload the vehicle each time
             * it starts or arrives at a depot, respectively. Default value is 0.
             */
            fun service(service: Long) = service(JsonField.of(service))

            /**
             * Sets [Builder.service] to an arbitrary JSON value.
             *
             * You should usually call [Builder.service] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun service(service: JsonField<Long>) = apply { this.service = service }

            /**
             * Specify the time-windows during which the depot is operational and allows vehicles to
             * be loaded / unloaded. The time periods should be expressed as a UNIX timestamp in
             * seconds.
             *
             * Please note that:
             * - Multiple time-windows can be provided but those time windows should not overlap
             *   with each other.
             * - Time windows should always be specified in the format of \[start_timestamp,
             *   end_timestamp\].
             * - Depot's time-windows are ineffective used when `max_activity_waiting_time` is
             *   specified in the input.
             * - Using `relations` along with depot time-window is not allowed and the service will
             *   return an error.
             */
            fun timeWindows(timeWindows: List<List<Long>>) = timeWindows(JsonField.of(timeWindows))

            /**
             * Sets [Builder.timeWindows] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeWindows] with a well-typed `List<List<Long>>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timeWindows(timeWindows: JsonField<List<List<Long>>>) = apply {
                this.timeWindows = timeWindows.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<Long>] to [timeWindows].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTimeWindow(timeWindow: List<Long>) = apply {
                timeWindows =
                    (timeWindows ?: JsonField.of(mutableListOf())).also {
                        checkKnown("timeWindows", it).add(timeWindow)
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
             * Returns an immutable instance of [Depot].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .locationIndex()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Depot =
                Depot(
                    checkRequired("id", id),
                    checkRequired("locationIndex", locationIndex),
                    description,
                    service,
                    (timeWindows ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Depot = apply {
            if (validated) {
                return@apply
            }

            id()
            locationIndex()
            description()
            service()
            timeWindows()
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
                (if (locationIndex.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (service.asKnown().isPresent) 1 else 0) +
                (timeWindows.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Depot && id == other.id && locationIndex == other.locationIndex && description == other.description && service == other.service && timeWindows == other.timeWindows && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, locationIndex, description, service, timeWindows, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Depot{id=$id, locationIndex=$locationIndex, description=$description, service=$service, timeWindows=$timeWindows, additionalProperties=$additionalProperties}"
    }

    /**
     * It represents the set of options that can be used to configure optimization algorithms so
     * that the solver provides a solution that meets the desired business objectives.
     */
    class Options
    private constructor(
        private val constraint: JsonField<Constraint>,
        private val grouping: JsonField<Grouping>,
        private val objective: JsonField<Objective>,
        private val routing: JsonField<Routing>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("constraint")
            @ExcludeMissing
            constraint: JsonField<Constraint> = JsonMissing.of(),
            @JsonProperty("grouping")
            @ExcludeMissing
            grouping: JsonField<Grouping> = JsonMissing.of(),
            @JsonProperty("objective")
            @ExcludeMissing
            objective: JsonField<Objective> = JsonMissing.of(),
            @JsonProperty("routing") @ExcludeMissing routing: JsonField<Routing> = JsonMissing.of(),
        ) : this(constraint, grouping, objective, routing, mutableMapOf())

        /**
         * This attribute defines both the soft and hard constraints for an optimization job.
         *
         * Soft constraints are constraints that do not necessarily have to be satisfied, but the
         * optimization algorithm will try to satisfy them as much as possible. Whereas the hard
         * constraints are the constraints that will not be violated by the solver. Users can use
         * multiple constraints together.
         *
         * Please note that soft constraints are ineffective when using `relations` attribute in a
         * request. The hard constraint, `max_activity_waiting_time`, is effective only when
         * relation type is `in_same_route` and ineffective for all other types.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun constraint(): Optional<Constraint> = constraint.getOptional("constraint")

        /**
         * Set grouping rules for the tasks and routes.
         * - Use `order_grouping` to group nearby tasks
         * - Use `route_grouping` to control route sequencing.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun grouping(): Optional<Grouping> = grouping.getOptional("grouping")

        /**
         * This attribute is used to configure the objective of the optimization job.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun objective(): Optional<Objective> = objective.getOptional("objective")

        /**
         * This attribute is used to define the routing configurations for the optimization job.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun routing(): Optional<Routing> = routing.getOptional("routing")

        /**
         * Returns the raw JSON value of [constraint].
         *
         * Unlike [constraint], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("constraint")
        @ExcludeMissing
        fun _constraint(): JsonField<Constraint> = constraint

        /**
         * Returns the raw JSON value of [grouping].
         *
         * Unlike [grouping], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("grouping") @ExcludeMissing fun _grouping(): JsonField<Grouping> = grouping

        /**
         * Returns the raw JSON value of [objective].
         *
         * Unlike [objective], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("objective")
        @ExcludeMissing
        fun _objective(): JsonField<Objective> = objective

        /**
         * Returns the raw JSON value of [routing].
         *
         * Unlike [routing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("routing") @ExcludeMissing fun _routing(): JsonField<Routing> = routing

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

            /** Returns a mutable builder for constructing an instance of [Options]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Options]. */
        class Builder internal constructor() {

            private var constraint: JsonField<Constraint> = JsonMissing.of()
            private var grouping: JsonField<Grouping> = JsonMissing.of()
            private var objective: JsonField<Objective> = JsonMissing.of()
            private var routing: JsonField<Routing> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(options: Options) = apply {
                constraint = options.constraint
                grouping = options.grouping
                objective = options.objective
                routing = options.routing
                additionalProperties = options.additionalProperties.toMutableMap()
            }

            /**
             * This attribute defines both the soft and hard constraints for an optimization job.
             *
             * Soft constraints are constraints that do not necessarily have to be satisfied, but
             * the optimization algorithm will try to satisfy them as much as possible. Whereas the
             * hard constraints are the constraints that will not be violated by the solver. Users
             * can use multiple constraints together.
             *
             * Please note that soft constraints are ineffective when using `relations` attribute in
             * a request. The hard constraint, `max_activity_waiting_time`, is effective only when
             * relation type is `in_same_route` and ineffective for all other types.
             */
            fun constraint(constraint: Constraint) = constraint(JsonField.of(constraint))

            /**
             * Sets [Builder.constraint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.constraint] with a well-typed [Constraint] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun constraint(constraint: JsonField<Constraint>) = apply {
                this.constraint = constraint
            }

            /**
             * Set grouping rules for the tasks and routes.
             * - Use `order_grouping` to group nearby tasks
             * - Use `route_grouping` to control route sequencing.
             */
            fun grouping(grouping: Grouping) = grouping(JsonField.of(grouping))

            /**
             * Sets [Builder.grouping] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grouping] with a well-typed [Grouping] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

            /** This attribute is used to configure the objective of the optimization job. */
            fun objective(objective: Objective) = objective(JsonField.of(objective))

            /**
             * Sets [Builder.objective] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objective] with a well-typed [Objective] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objective(objective: JsonField<Objective>) = apply { this.objective = objective }

            /**
             * This attribute is used to define the routing configurations for the optimization job.
             */
            fun routing(routing: Routing) = routing(JsonField.of(routing))

            /**
             * Sets [Builder.routing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routing] with a well-typed [Routing] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routing(routing: JsonField<Routing>) = apply { this.routing = routing }

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
             * Returns an immutable instance of [Options].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Options =
                Options(
                    constraint,
                    grouping,
                    objective,
                    routing,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Options = apply {
            if (validated) {
                return@apply
            }

            constraint().ifPresent { it.validate() }
            grouping().ifPresent { it.validate() }
            objective().ifPresent { it.validate() }
            routing().ifPresent { it.validate() }
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
            (constraint.asKnown().getOrNull()?.validity() ?: 0) +
                (grouping.asKnown().getOrNull()?.validity() ?: 0) +
                (objective.asKnown().getOrNull()?.validity() ?: 0) +
                (routing.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * This attribute defines both the soft and hard constraints for an optimization job.
         *
         * Soft constraints are constraints that do not necessarily have to be satisfied, but the
         * optimization algorithm will try to satisfy them as much as possible. Whereas the hard
         * constraints are the constraints that will not be violated by the solver. Users can use
         * multiple constraints together.
         *
         * Please note that soft constraints are ineffective when using `relations` attribute in a
         * request. The hard constraint, `max_activity_waiting_time`, is effective only when
         * relation type is `in_same_route` and ineffective for all other types.
         */
        class Constraint
        private constructor(
            private val maxActivityWaitingTime: JsonField<Long>,
            private val maxVehicleOvertime: JsonField<Long>,
            private val maxVisitLateness: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_activity_waiting_time")
                @ExcludeMissing
                maxActivityWaitingTime: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_vehicle_overtime")
                @ExcludeMissing
                maxVehicleOvertime: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("max_visit_lateness")
                @ExcludeMissing
                maxVisitLateness: JsonField<Long> = JsonMissing.of(),
            ) : this(maxActivityWaitingTime, maxVehicleOvertime, maxVisitLateness, mutableMapOf())

            /**
             * This is a hard constraint which specifies the maximum waiting time, in seconds, for
             * each `step`. It ensures that the vehicles do not have unreasonable wait times between
             * jobs or shipments. This feature is useful for use cases where avoiding long wait
             * times between jobs or shipments is a primary concern.
             *
             * Please note that the waiting time constraint applies to all tasks in the optimization
             * request, ensuring that no single task exceeds the specified maximum waiting time.
             * When being used together with `relations` attribute, this parameter is effective only
             * for `in_same_route` relation type.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxActivityWaitingTime(): Optional<Long> =
                maxActivityWaitingTime.getOptional("max_activity_waiting_time")

            /**
             * This is a soft constraint for vehicle overtime. Overtime is defined as the time that
             * a vehicle spends to complete a set of jobs after its time window has ended.
             * `max_vehicle_overtime` attribute specifies the maximum amount of overtime a vehicle
             * can have, in seconds. If a vehicle’s overtime exceeds this value, it will be
             * considered a violation of this constraint.
             *
             * Please note that this constraint applies to all vehicles in the optimization request.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxVehicleOvertime(): Optional<Long> =
                maxVehicleOvertime.getOptional("max_vehicle_overtime")

            /**
             * This is a soft constraint for permissible delay, in seconds, to complete a job or
             * shipment after its time window is over. If a job or shipment’s lateness exceeds this
             * value, it will be considered a violation of this constraint.
             *
             * Please note that this constraint applies to all tasks in the optimization request. In
             * case lateness duration needs to be applied for individual tasks, please use the
             * `max_visit_lateness` parameter under `jobs` and `shipments`
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxVisitLateness(): Optional<Long> =
                maxVisitLateness.getOptional("max_visit_lateness")

            /**
             * Returns the raw JSON value of [maxActivityWaitingTime].
             *
             * Unlike [maxActivityWaitingTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_activity_waiting_time")
            @ExcludeMissing
            fun _maxActivityWaitingTime(): JsonField<Long> = maxActivityWaitingTime

            /**
             * Returns the raw JSON value of [maxVehicleOvertime].
             *
             * Unlike [maxVehicleOvertime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_vehicle_overtime")
            @ExcludeMissing
            fun _maxVehicleOvertime(): JsonField<Long> = maxVehicleOvertime

            /**
             * Returns the raw JSON value of [maxVisitLateness].
             *
             * Unlike [maxVisitLateness], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_visit_lateness")
            @ExcludeMissing
            fun _maxVisitLateness(): JsonField<Long> = maxVisitLateness

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

                /** Returns a mutable builder for constructing an instance of [Constraint]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Constraint]. */
            class Builder internal constructor() {

                private var maxActivityWaitingTime: JsonField<Long> = JsonMissing.of()
                private var maxVehicleOvertime: JsonField<Long> = JsonMissing.of()
                private var maxVisitLateness: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(constraint: Constraint) = apply {
                    maxActivityWaitingTime = constraint.maxActivityWaitingTime
                    maxVehicleOvertime = constraint.maxVehicleOvertime
                    maxVisitLateness = constraint.maxVisitLateness
                    additionalProperties = constraint.additionalProperties.toMutableMap()
                }

                /**
                 * This is a hard constraint which specifies the maximum waiting time, in seconds,
                 * for each `step`. It ensures that the vehicles do not have unreasonable wait times
                 * between jobs or shipments. This feature is useful for use cases where avoiding
                 * long wait times between jobs or shipments is a primary concern.
                 *
                 * Please note that the waiting time constraint applies to all tasks in the
                 * optimization request, ensuring that no single task exceeds the specified maximum
                 * waiting time. When being used together with `relations` attribute, this parameter
                 * is effective only for `in_same_route` relation type.
                 */
                fun maxActivityWaitingTime(maxActivityWaitingTime: Long) =
                    maxActivityWaitingTime(JsonField.of(maxActivityWaitingTime))

                /**
                 * Sets [Builder.maxActivityWaitingTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxActivityWaitingTime] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxActivityWaitingTime(maxActivityWaitingTime: JsonField<Long>) = apply {
                    this.maxActivityWaitingTime = maxActivityWaitingTime
                }

                /**
                 * This is a soft constraint for vehicle overtime. Overtime is defined as the time
                 * that a vehicle spends to complete a set of jobs after its time window has ended.
                 * `max_vehicle_overtime` attribute specifies the maximum amount of overtime a
                 * vehicle can have, in seconds. If a vehicle’s overtime exceeds this value, it will
                 * be considered a violation of this constraint.
                 *
                 * Please note that this constraint applies to all vehicles in the optimization
                 * request.
                 */
                fun maxVehicleOvertime(maxVehicleOvertime: Long) =
                    maxVehicleOvertime(JsonField.of(maxVehicleOvertime))

                /**
                 * Sets [Builder.maxVehicleOvertime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxVehicleOvertime] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxVehicleOvertime(maxVehicleOvertime: JsonField<Long>) = apply {
                    this.maxVehicleOvertime = maxVehicleOvertime
                }

                /**
                 * This is a soft constraint for permissible delay, in seconds, to complete a job or
                 * shipment after its time window is over. If a job or shipment’s lateness exceeds
                 * this value, it will be considered a violation of this constraint.
                 *
                 * Please note that this constraint applies to all tasks in the optimization
                 * request. In case lateness duration needs to be applied for individual tasks,
                 * please use the `max_visit_lateness` parameter under `jobs` and `shipments`
                 */
                fun maxVisitLateness(maxVisitLateness: Long) =
                    maxVisitLateness(JsonField.of(maxVisitLateness))

                /**
                 * Sets [Builder.maxVisitLateness] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxVisitLateness] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxVisitLateness(maxVisitLateness: JsonField<Long>) = apply {
                    this.maxVisitLateness = maxVisitLateness
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
                 * Returns an immutable instance of [Constraint].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Constraint =
                    Constraint(
                        maxActivityWaitingTime,
                        maxVehicleOvertime,
                        maxVisitLateness,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Constraint = apply {
                if (validated) {
                    return@apply
                }

                maxActivityWaitingTime()
                maxVehicleOvertime()
                maxVisitLateness()
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
                (if (maxActivityWaitingTime.asKnown().isPresent) 1 else 0) +
                    (if (maxVehicleOvertime.asKnown().isPresent) 1 else 0) +
                    (if (maxVisitLateness.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Constraint && maxActivityWaitingTime == other.maxActivityWaitingTime && maxVehicleOvertime == other.maxVehicleOvertime && maxVisitLateness == other.maxVisitLateness && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(maxActivityWaitingTime, maxVehicleOvertime, maxVisitLateness, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Constraint{maxActivityWaitingTime=$maxActivityWaitingTime, maxVehicleOvertime=$maxVehicleOvertime, maxVisitLateness=$maxVisitLateness, additionalProperties=$additionalProperties}"
        }

        /**
         * Set grouping rules for the tasks and routes.
         * - Use `order_grouping` to group nearby tasks
         * - Use `route_grouping` to control route sequencing.
         */
        class Grouping
        private constructor(
            private val orderGrouping: JsonField<OrderGrouping>,
            private val proximityFactor: JsonField<Double>,
            private val routeGrouping: JsonField<RouteGrouping>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("order_grouping")
                @ExcludeMissing
                orderGrouping: JsonField<OrderGrouping> = JsonMissing.of(),
                @JsonProperty("proximity_factor")
                @ExcludeMissing
                proximityFactor: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("route_grouping")
                @ExcludeMissing
                routeGrouping: JsonField<RouteGrouping> = JsonMissing.of(),
            ) : this(orderGrouping, proximityFactor, routeGrouping, mutableMapOf())

            /**
             * Specify the criteria for grouping nearby tasks. The grouped tasks will be treated as
             * one stop by the optimizer and no cost would be incurred when driver travels to
             * different tasks within a group. Users can use this feature to model use cases like
             * multiple deliveries in a building complex or a condo.
             *
             * Please note that when the multiple tasks are grouped together, only one setup time is
             * considered for all such tasks. The durations of this setup time is equal to maximum
             * setup time among all grouped tasks, if provided. On the other hand, the service time
             * is applied to each task individually, as per the input provided when configuring
             * those tasks.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun orderGrouping(): Optional<OrderGrouping> =
                orderGrouping.getOptional("order_grouping")

            /**
             * When specified, routes are built taking into account the distance to the nearest
             * tasks. A higher proximity factor helps build routes with closer distances between
             * neighboring tasks, whereas a lower proximity factor helps build routes with farther
             * distances between neighboring tasks. As a result, the total number of routes in the
             * solution can vary based on the configured proximity factor - more routes for higher
             * factor and less routes with lower factor.
             *
             * In practice, such routes are more resistant to changes in task time windows: when the
             * time window is postponed, the driver can drive to the next task and then return to
             * the previous one.
             *
             * Please note that:
             * - Valid values are \[0,10\]
             * - Default value is 0.0.
             * - It is recommended to use values lower values, in the range of \[0, 1\]. Higher
             *   values may adversely impact the solution metrics due to higher number of resulting
             *   routes: costs, mileage etc.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun proximityFactor(): Optional<Double> =
                proximityFactor.getOptional("proximity_factor")

            /**
             * Specify the criteria for prioritising routes in a zone over routes that are part of
             * another zone. As a result, all the tasks falling in a zone will be fulfilled before
             * any tasks that are part of a different zone.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun routeGrouping(): Optional<RouteGrouping> =
                routeGrouping.getOptional("route_grouping")

            /**
             * Returns the raw JSON value of [orderGrouping].
             *
             * Unlike [orderGrouping], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("order_grouping")
            @ExcludeMissing
            fun _orderGrouping(): JsonField<OrderGrouping> = orderGrouping

            /**
             * Returns the raw JSON value of [proximityFactor].
             *
             * Unlike [proximityFactor], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("proximity_factor")
            @ExcludeMissing
            fun _proximityFactor(): JsonField<Double> = proximityFactor

            /**
             * Returns the raw JSON value of [routeGrouping].
             *
             * Unlike [routeGrouping], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("route_grouping")
            @ExcludeMissing
            fun _routeGrouping(): JsonField<RouteGrouping> = routeGrouping

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

                /** Returns a mutable builder for constructing an instance of [Grouping]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Grouping]. */
            class Builder internal constructor() {

                private var orderGrouping: JsonField<OrderGrouping> = JsonMissing.of()
                private var proximityFactor: JsonField<Double> = JsonMissing.of()
                private var routeGrouping: JsonField<RouteGrouping> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(grouping: Grouping) = apply {
                    orderGrouping = grouping.orderGrouping
                    proximityFactor = grouping.proximityFactor
                    routeGrouping = grouping.routeGrouping
                    additionalProperties = grouping.additionalProperties.toMutableMap()
                }

                /**
                 * Specify the criteria for grouping nearby tasks. The grouped tasks will be treated
                 * as one stop by the optimizer and no cost would be incurred when driver travels to
                 * different tasks within a group. Users can use this feature to model use cases
                 * like multiple deliveries in a building complex or a condo.
                 *
                 * Please note that when the multiple tasks are grouped together, only one setup
                 * time is considered for all such tasks. The durations of this setup time is equal
                 * to maximum setup time among all grouped tasks, if provided. On the other hand,
                 * the service time is applied to each task individually, as per the input provided
                 * when configuring those tasks.
                 */
                fun orderGrouping(orderGrouping: OrderGrouping) =
                    orderGrouping(JsonField.of(orderGrouping))

                /**
                 * Sets [Builder.orderGrouping] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.orderGrouping] with a well-typed [OrderGrouping]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun orderGrouping(orderGrouping: JsonField<OrderGrouping>) = apply {
                    this.orderGrouping = orderGrouping
                }

                /**
                 * When specified, routes are built taking into account the distance to the nearest
                 * tasks. A higher proximity factor helps build routes with closer distances between
                 * neighboring tasks, whereas a lower proximity factor helps build routes with
                 * farther distances between neighboring tasks. As a result, the total number of
                 * routes in the solution can vary based on the configured proximity factor - more
                 * routes for higher factor and less routes with lower factor.
                 *
                 * In practice, such routes are more resistant to changes in task time windows: when
                 * the time window is postponed, the driver can drive to the next task and then
                 * return to the previous one.
                 *
                 * Please note that:
                 * - Valid values are \[0,10\]
                 * - Default value is 0.0.
                 * - It is recommended to use values lower values, in the range of \[0, 1\]. Higher
                 *   values may adversely impact the solution metrics due to higher number of
                 *   resulting routes: costs, mileage etc.
                 */
                fun proximityFactor(proximityFactor: Double) =
                    proximityFactor(JsonField.of(proximityFactor))

                /**
                 * Sets [Builder.proximityFactor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.proximityFactor] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun proximityFactor(proximityFactor: JsonField<Double>) = apply {
                    this.proximityFactor = proximityFactor
                }

                /**
                 * Specify the criteria for prioritising routes in a zone over routes that are part
                 * of another zone. As a result, all the tasks falling in a zone will be fulfilled
                 * before any tasks that are part of a different zone.
                 */
                fun routeGrouping(routeGrouping: RouteGrouping) =
                    routeGrouping(JsonField.of(routeGrouping))

                /**
                 * Sets [Builder.routeGrouping] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routeGrouping] with a well-typed [RouteGrouping]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun routeGrouping(routeGrouping: JsonField<RouteGrouping>) = apply {
                    this.routeGrouping = routeGrouping
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
                 * Returns an immutable instance of [Grouping].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Grouping =
                    Grouping(
                        orderGrouping,
                        proximityFactor,
                        routeGrouping,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Grouping = apply {
                if (validated) {
                    return@apply
                }

                orderGrouping().ifPresent { it.validate() }
                proximityFactor()
                routeGrouping().ifPresent { it.validate() }
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
                (orderGrouping.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (proximityFactor.asKnown().isPresent) 1 else 0) +
                    (routeGrouping.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Specify the criteria for grouping nearby tasks. The grouped tasks will be treated as
             * one stop by the optimizer and no cost would be incurred when driver travels to
             * different tasks within a group. Users can use this feature to model use cases like
             * multiple deliveries in a building complex or a condo.
             *
             * Please note that when the multiple tasks are grouped together, only one setup time is
             * considered for all such tasks. The durations of this setup time is equal to maximum
             * setup time among all grouped tasks, if provided. On the other hand, the service time
             * is applied to each task individually, as per the input provided when configuring
             * those tasks.
             */
            class OrderGrouping
            private constructor(
                private val groupingDiameter: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("grouping_diameter")
                    @ExcludeMissing
                    groupingDiameter: JsonField<Double> = JsonMissing.of()
                ) : this(groupingDiameter, mutableMapOf())

                /**
                 * Specify the straight line distance, in meters, which will be used to identify the
                 * tasks that should be grouped together. The default value is `null`.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun groupingDiameter(): Optional<Double> =
                    groupingDiameter.getOptional("grouping_diameter")

                /**
                 * Returns the raw JSON value of [groupingDiameter].
                 *
                 * Unlike [groupingDiameter], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("grouping_diameter")
                @ExcludeMissing
                fun _groupingDiameter(): JsonField<Double> = groupingDiameter

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
                     * Returns a mutable builder for constructing an instance of [OrderGrouping].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [OrderGrouping]. */
                class Builder internal constructor() {

                    private var groupingDiameter: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(orderGrouping: OrderGrouping) = apply {
                        groupingDiameter = orderGrouping.groupingDiameter
                        additionalProperties = orderGrouping.additionalProperties.toMutableMap()
                    }

                    /**
                     * Specify the straight line distance, in meters, which will be used to identify
                     * the tasks that should be grouped together. The default value is `null`.
                     */
                    fun groupingDiameter(groupingDiameter: Double) =
                        groupingDiameter(JsonField.of(groupingDiameter))

                    /**
                     * Sets [Builder.groupingDiameter] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groupingDiameter] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun groupingDiameter(groupingDiameter: JsonField<Double>) = apply {
                        this.groupingDiameter = groupingDiameter
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
                     * Returns an immutable instance of [OrderGrouping].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): OrderGrouping =
                        OrderGrouping(groupingDiameter, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): OrderGrouping = apply {
                    if (validated) {
                        return@apply
                    }

                    groupingDiameter()
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
                internal fun validity(): Int = (if (groupingDiameter.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is OrderGrouping && groupingDiameter == other.groupingDiameter && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(groupingDiameter, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "OrderGrouping{groupingDiameter=$groupingDiameter, additionalProperties=$additionalProperties}"
            }

            /**
             * Specify the criteria for prioritising routes in a zone over routes that are part of
             * another zone. As a result, all the tasks falling in a zone will be fulfilled before
             * any tasks that are part of a different zone.
             */
            class RouteGrouping
            private constructor(
                private val penaltyFactor: JsonField<Double>,
                private val zoneDiameter: JsonField<Double>,
                private val zoneSource: JsonField<ZoneSource>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("penalty_factor")
                    @ExcludeMissing
                    penaltyFactor: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("zone_diameter")
                    @ExcludeMissing
                    zoneDiameter: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("zone_source")
                    @ExcludeMissing
                    zoneSource: JsonField<ZoneSource> = JsonMissing.of(),
                ) : this(penaltyFactor, zoneDiameter, zoneSource, mutableMapOf())

                /**
                 * Specify a non-negative value which indicates the penalty of crossing zones on the
                 * same route. Default penalty value is 0.
                 *
                 * A higher value, for example 30.0, will place a higher penalty on zone violations
                 * and hence push the optimizer to prefer a solution without any zone violations,
                 * where all tasks in a single region are fulfilled before any tasks in other
                 * regions or outside the current region. Whereas a lower value, say 5.0, will place
                 * a lower penalty allowing the optimizer to return solutions which may have few
                 * violations, say a couple of routing zone violations in our example. A still lower
                 * penalty factor, like 1.0, may have several zone violations.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun penaltyFactor(): Optional<Double> = penaltyFactor.getOptional("penalty_factor")

                /**
                 * Specify the diameter of the zone, routes within which will be prioritised before
                 * routes falling in other zones. Please note that `zone_diameter` is the straight
                 * line distance, in meters.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun zoneDiameter(): Optional<Double> = zoneDiameter.getOptional("zone_diameter")

                /**
                 * Specify the source for creating boundaries of the routing zones. The default
                 * value is “system_generated”.
                 * - system_generated - Routing zone boundaries are created automatically by the
                 *   optimizer based on the `zone_diameter` provided.
                 * - custom_definition - Custom routing zone boundaries should be provided by the
                 *   user in input using the `zones` attribute. An error would be returned if the
                 *   `zones` attribute is null or missing in the input request.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun zoneSource(): Optional<ZoneSource> = zoneSource.getOptional("zone_source")

                /**
                 * Returns the raw JSON value of [penaltyFactor].
                 *
                 * Unlike [penaltyFactor], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("penalty_factor")
                @ExcludeMissing
                fun _penaltyFactor(): JsonField<Double> = penaltyFactor

                /**
                 * Returns the raw JSON value of [zoneDiameter].
                 *
                 * Unlike [zoneDiameter], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("zone_diameter")
                @ExcludeMissing
                fun _zoneDiameter(): JsonField<Double> = zoneDiameter

                /**
                 * Returns the raw JSON value of [zoneSource].
                 *
                 * Unlike [zoneSource], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("zone_source")
                @ExcludeMissing
                fun _zoneSource(): JsonField<ZoneSource> = zoneSource

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
                     * Returns a mutable builder for constructing an instance of [RouteGrouping].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RouteGrouping]. */
                class Builder internal constructor() {

                    private var penaltyFactor: JsonField<Double> = JsonMissing.of()
                    private var zoneDiameter: JsonField<Double> = JsonMissing.of()
                    private var zoneSource: JsonField<ZoneSource> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(routeGrouping: RouteGrouping) = apply {
                        penaltyFactor = routeGrouping.penaltyFactor
                        zoneDiameter = routeGrouping.zoneDiameter
                        zoneSource = routeGrouping.zoneSource
                        additionalProperties = routeGrouping.additionalProperties.toMutableMap()
                    }

                    /**
                     * Specify a non-negative value which indicates the penalty of crossing zones on
                     * the same route. Default penalty value is 0.
                     *
                     * A higher value, for example 30.0, will place a higher penalty on zone
                     * violations and hence push the optimizer to prefer a solution without any zone
                     * violations, where all tasks in a single region are fulfilled before any tasks
                     * in other regions or outside the current region. Whereas a lower value, say
                     * 5.0, will place a lower penalty allowing the optimizer to return solutions
                     * which may have few violations, say a couple of routing zone violations in our
                     * example. A still lower penalty factor, like 1.0, may have several zone
                     * violations.
                     */
                    fun penaltyFactor(penaltyFactor: Double) =
                        penaltyFactor(JsonField.of(penaltyFactor))

                    /**
                     * Sets [Builder.penaltyFactor] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.penaltyFactor] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun penaltyFactor(penaltyFactor: JsonField<Double>) = apply {
                        this.penaltyFactor = penaltyFactor
                    }

                    /**
                     * Specify the diameter of the zone, routes within which will be prioritised
                     * before routes falling in other zones. Please note that `zone_diameter` is the
                     * straight line distance, in meters.
                     */
                    fun zoneDiameter(zoneDiameter: Double) =
                        zoneDiameter(JsonField.of(zoneDiameter))

                    /**
                     * Sets [Builder.zoneDiameter] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.zoneDiameter] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun zoneDiameter(zoneDiameter: JsonField<Double>) = apply {
                        this.zoneDiameter = zoneDiameter
                    }

                    /**
                     * Specify the source for creating boundaries of the routing zones. The default
                     * value is “system_generated”.
                     * - system_generated - Routing zone boundaries are created automatically by the
                     *   optimizer based on the `zone_diameter` provided.
                     * - custom_definition - Custom routing zone boundaries should be provided by
                     *   the user in input using the `zones` attribute. An error would be returned
                     *   if the `zones` attribute is null or missing in the input request.
                     */
                    fun zoneSource(zoneSource: ZoneSource) = zoneSource(JsonField.of(zoneSource))

                    /**
                     * Sets [Builder.zoneSource] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.zoneSource] with a well-typed [ZoneSource]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun zoneSource(zoneSource: JsonField<ZoneSource>) = apply {
                        this.zoneSource = zoneSource
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
                     * Returns an immutable instance of [RouteGrouping].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): RouteGrouping =
                        RouteGrouping(
                            penaltyFactor,
                            zoneDiameter,
                            zoneSource,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): RouteGrouping = apply {
                    if (validated) {
                        return@apply
                    }

                    penaltyFactor()
                    zoneDiameter()
                    zoneSource().ifPresent { it.validate() }
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
                    (if (penaltyFactor.asKnown().isPresent) 1 else 0) +
                        (if (zoneDiameter.asKnown().isPresent) 1 else 0) +
                        (zoneSource.asKnown().getOrNull()?.validity() ?: 0)

                /**
                 * Specify the source for creating boundaries of the routing zones. The default
                 * value is “system_generated”.
                 * - system_generated - Routing zone boundaries are created automatically by the
                 *   optimizer based on the `zone_diameter` provided.
                 * - custom_definition - Custom routing zone boundaries should be provided by the
                 *   user in input using the `zones` attribute. An error would be returned if the
                 *   `zones` attribute is null or missing in the input request.
                 */
                class ZoneSource
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SYSTEM_GENERATED = of("`system_generated`")

                        @JvmField val CUSTOM_DEFINITION = of("`custom_definition`")

                        @JvmStatic fun of(value: String) = ZoneSource(JsonField.of(value))
                    }

                    /** An enum containing [ZoneSource]'s known values. */
                    enum class Known {
                        SYSTEM_GENERATED,
                        CUSTOM_DEFINITION,
                    }

                    /**
                     * An enum containing [ZoneSource]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [ZoneSource] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SYSTEM_GENERATED,
                        CUSTOM_DEFINITION,
                        /**
                         * An enum member indicating that [ZoneSource] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SYSTEM_GENERATED -> Value.SYSTEM_GENERATED
                            CUSTOM_DEFINITION -> Value.CUSTOM_DEFINITION
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws NextbillionSdkInvalidDataException if this class instance's value is
                     *   a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SYSTEM_GENERATED -> Known.SYSTEM_GENERATED
                            CUSTOM_DEFINITION -> Known.CUSTOM_DEFINITION
                            else ->
                                throw NextbillionSdkInvalidDataException(
                                    "Unknown ZoneSource: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws NextbillionSdkInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            NextbillionSdkInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): ZoneSource = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ZoneSource && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RouteGrouping && penaltyFactor == other.penaltyFactor && zoneDiameter == other.zoneDiameter && zoneSource == other.zoneSource && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(penaltyFactor, zoneDiameter, zoneSource, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RouteGrouping{penaltyFactor=$penaltyFactor, zoneDiameter=$zoneDiameter, zoneSource=$zoneSource, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Grouping && orderGrouping == other.orderGrouping && proximityFactor == other.proximityFactor && routeGrouping == other.routeGrouping && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(orderGrouping, proximityFactor, routeGrouping, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Grouping{orderGrouping=$orderGrouping, proximityFactor=$proximityFactor, routeGrouping=$routeGrouping, additionalProperties=$additionalProperties}"
        }

        /** This attribute is used to configure the objective of the optimization job. */
        class Objective
        private constructor(
            private val allowEarlyArrival: JsonField<Boolean>,
            private val custom: JsonField<Custom>,
            private val minimiseNumDepots: JsonField<Boolean>,
            private val solverMode: JsonField<SolverMode>,
            private val solvingTimeLimit: JsonField<Long>,
            private val travelCost: JsonField<TravelCost>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("allow_early_arrival")
                @ExcludeMissing
                allowEarlyArrival: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("custom")
                @ExcludeMissing
                custom: JsonField<Custom> = JsonMissing.of(),
                @JsonProperty("minimise_num_depots")
                @ExcludeMissing
                minimiseNumDepots: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("solver_mode")
                @ExcludeMissing
                solverMode: JsonField<SolverMode> = JsonMissing.of(),
                @JsonProperty("solving_time_limit")
                @ExcludeMissing
                solvingTimeLimit: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("travel_cost")
                @ExcludeMissing
                travelCost: JsonField<TravelCost> = JsonMissing.of(),
            ) : this(
                allowEarlyArrival,
                custom,
                minimiseNumDepots,
                solverMode,
                solvingTimeLimit,
                travelCost,
                mutableMapOf(),
            )

            /**
             * Choose where the optimizer should schedule the driver’s wait time. When set to `true`
             * the driver waits at the location of the task until its time window allows him to
             * start the task. When set to `false` the driver waits at the location of the previous
             * task and starts driving only at such a time that makes him arrive at the next task
             * location in time to start the task as soon as he reaches.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun allowEarlyArrival(): Optional<Boolean> =
                allowEarlyArrival.getOptional("allow_early_arrival")

            /**
             * The `custom` parameter is used to define special objectives apart from the simpler
             * travel cost minimization objectives.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun custom(): Optional<Custom> = custom.getOptional("custom")

            /**
             * Specify whether to minimize the number of depots used in optimization routes.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun minimiseNumDepots(): Optional<Boolean> =
                minimiseNumDepots.getOptional("minimise_num_depots")

            /**
             * If the input doesn’t include features of soft constraints, customized objectives,
             * re-optimization, relations, max travel cost or automatic fixed cost, then user can
             * select “optimal” to achieve a higher-speed and higher-quality optimization.
             *
             * If “optimal” mode is unable to process some features in the input, then it will still
             * goes to “flexible” mode.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun solverMode(): Optional<SolverMode> = solverMode.getOptional("solver_mode")

            /**
             * Specify the number of seconds within which the optimizer should ideally solve the
             * optimization request.
             *
             * Please note that:
             * - In case the specified time limit is not enough to generate a solution for a given
             *   problem set, the optimizer will continue processing until it arrives at a solution.
             * - It is recommended to specify a duration of at least 5-7 minutes in case the input
             *   problem contains a large set of tasks or vehicles.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun solvingTimeLimit(): Optional<Long> =
                solvingTimeLimit.getOptional("solving_time_limit")

            /**
             * The `travel_cost` parameter specifies the type of cost used by the solver to
             * determine the routes.
             *
             * If the `travel_cost` parameter is set to `distance`, the solver will minimize the
             * total distance traveled by vehicles while determining a solution. This objective
             * would be useful in cases where the primary objective is to reduce fuel consumption or
             * travel expenses.
             *
             * If the `travel_cost` parameter is set to `duration`, the solver will minimize the
             * total time taken by the vehicles to complete all tasks while determining a solution.
             * This objective would be useful in cases where the primary objective is to minimize
             * completion time or maximize the number of orders fulfilled within a given time
             * window.
             *
             * If the `travel_cost` parameter is set to `air_distance`, the solver will try to
             * calculate the distance,in meters, between two points using the great-circle distance
             * formula (i.e., the shortest distance between two points on a sphere) instead of the
             * actual road distance. This would be useful in cases where the delivery locations are
             * far apart and the road distance between them is significantly longer than the actual
             * straight-line distance. For example, in Drone Delivery services.
             *
             * If the `travel_cost` is set to `customized` the solver would use the custom cost
             * values provided by the user (in `cost_matrix` attribute) and prefer a solution with
             * lower overall cost. This enables the user to have greater control over the routes
             * preferred by the solver and hence the sequence in which the jobs are completed.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun travelCost(): Optional<TravelCost> = travelCost.getOptional("travel_cost")

            /**
             * Returns the raw JSON value of [allowEarlyArrival].
             *
             * Unlike [allowEarlyArrival], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("allow_early_arrival")
            @ExcludeMissing
            fun _allowEarlyArrival(): JsonField<Boolean> = allowEarlyArrival

            /**
             * Returns the raw JSON value of [custom].
             *
             * Unlike [custom], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("custom") @ExcludeMissing fun _custom(): JsonField<Custom> = custom

            /**
             * Returns the raw JSON value of [minimiseNumDepots].
             *
             * Unlike [minimiseNumDepots], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("minimise_num_depots")
            @ExcludeMissing
            fun _minimiseNumDepots(): JsonField<Boolean> = minimiseNumDepots

            /**
             * Returns the raw JSON value of [solverMode].
             *
             * Unlike [solverMode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("solver_mode")
            @ExcludeMissing
            fun _solverMode(): JsonField<SolverMode> = solverMode

            /**
             * Returns the raw JSON value of [solvingTimeLimit].
             *
             * Unlike [solvingTimeLimit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("solving_time_limit")
            @ExcludeMissing
            fun _solvingTimeLimit(): JsonField<Long> = solvingTimeLimit

            /**
             * Returns the raw JSON value of [travelCost].
             *
             * Unlike [travelCost], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("travel_cost")
            @ExcludeMissing
            fun _travelCost(): JsonField<TravelCost> = travelCost

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

                /** Returns a mutable builder for constructing an instance of [Objective]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Objective]. */
            class Builder internal constructor() {

                private var allowEarlyArrival: JsonField<Boolean> = JsonMissing.of()
                private var custom: JsonField<Custom> = JsonMissing.of()
                private var minimiseNumDepots: JsonField<Boolean> = JsonMissing.of()
                private var solverMode: JsonField<SolverMode> = JsonMissing.of()
                private var solvingTimeLimit: JsonField<Long> = JsonMissing.of()
                private var travelCost: JsonField<TravelCost> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(objective: Objective) = apply {
                    allowEarlyArrival = objective.allowEarlyArrival
                    custom = objective.custom
                    minimiseNumDepots = objective.minimiseNumDepots
                    solverMode = objective.solverMode
                    solvingTimeLimit = objective.solvingTimeLimit
                    travelCost = objective.travelCost
                    additionalProperties = objective.additionalProperties.toMutableMap()
                }

                /**
                 * Choose where the optimizer should schedule the driver’s wait time. When set to
                 * `true` the driver waits at the location of the task until its time window allows
                 * him to start the task. When set to `false` the driver waits at the location of
                 * the previous task and starts driving only at such a time that makes him arrive at
                 * the next task location in time to start the task as soon as he reaches.
                 */
                fun allowEarlyArrival(allowEarlyArrival: Boolean) =
                    allowEarlyArrival(JsonField.of(allowEarlyArrival))

                /**
                 * Sets [Builder.allowEarlyArrival] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowEarlyArrival] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun allowEarlyArrival(allowEarlyArrival: JsonField<Boolean>) = apply {
                    this.allowEarlyArrival = allowEarlyArrival
                }

                /**
                 * The `custom` parameter is used to define special objectives apart from the
                 * simpler travel cost minimization objectives.
                 */
                fun custom(custom: Custom) = custom(JsonField.of(custom))

                /**
                 * Sets [Builder.custom] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.custom] with a well-typed [Custom] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun custom(custom: JsonField<Custom>) = apply { this.custom = custom }

                /** Specify whether to minimize the number of depots used in optimization routes. */
                fun minimiseNumDepots(minimiseNumDepots: Boolean) =
                    minimiseNumDepots(JsonField.of(minimiseNumDepots))

                /**
                 * Sets [Builder.minimiseNumDepots] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.minimiseNumDepots] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun minimiseNumDepots(minimiseNumDepots: JsonField<Boolean>) = apply {
                    this.minimiseNumDepots = minimiseNumDepots
                }

                /**
                 * If the input doesn’t include features of soft constraints, customized objectives,
                 * re-optimization, relations, max travel cost or automatic fixed cost, then user
                 * can select “optimal” to achieve a higher-speed and higher-quality optimization.
                 *
                 * If “optimal” mode is unable to process some features in the input, then it will
                 * still goes to “flexible” mode.
                 */
                fun solverMode(solverMode: SolverMode) = solverMode(JsonField.of(solverMode))

                /**
                 * Sets [Builder.solverMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.solverMode] with a well-typed [SolverMode] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun solverMode(solverMode: JsonField<SolverMode>) = apply {
                    this.solverMode = solverMode
                }

                /**
                 * Specify the number of seconds within which the optimizer should ideally solve the
                 * optimization request.
                 *
                 * Please note that:
                 * - In case the specified time limit is not enough to generate a solution for a
                 *   given problem set, the optimizer will continue processing until it arrives at a
                 *   solution.
                 * - It is recommended to specify a duration of at least 5-7 minutes in case the
                 *   input problem contains a large set of tasks or vehicles.
                 */
                fun solvingTimeLimit(solvingTimeLimit: Long) =
                    solvingTimeLimit(JsonField.of(solvingTimeLimit))

                /**
                 * Sets [Builder.solvingTimeLimit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.solvingTimeLimit] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun solvingTimeLimit(solvingTimeLimit: JsonField<Long>) = apply {
                    this.solvingTimeLimit = solvingTimeLimit
                }

                /**
                 * The `travel_cost` parameter specifies the type of cost used by the solver to
                 * determine the routes.
                 *
                 * If the `travel_cost` parameter is set to `distance`, the solver will minimize the
                 * total distance traveled by vehicles while determining a solution. This objective
                 * would be useful in cases where the primary objective is to reduce fuel
                 * consumption or travel expenses.
                 *
                 * If the `travel_cost` parameter is set to `duration`, the solver will minimize the
                 * total time taken by the vehicles to complete all tasks while determining a
                 * solution. This objective would be useful in cases where the primary objective is
                 * to minimize completion time or maximize the number of orders fulfilled within a
                 * given time window.
                 *
                 * If the `travel_cost` parameter is set to `air_distance`, the solver will try to
                 * calculate the distance,in meters, between two points using the great-circle
                 * distance formula (i.e., the shortest distance between two points on a sphere)
                 * instead of the actual road distance. This would be useful in cases where the
                 * delivery locations are far apart and the road distance between them is
                 * significantly longer than the actual straight-line distance. For example, in
                 * Drone Delivery services.
                 *
                 * If the `travel_cost` is set to `customized` the solver would use the custom cost
                 * values provided by the user (in `cost_matrix` attribute) and prefer a solution
                 * with lower overall cost. This enables the user to have greater control over the
                 * routes preferred by the solver and hence the sequence in which the jobs are
                 * completed.
                 */
                fun travelCost(travelCost: TravelCost) = travelCost(JsonField.of(travelCost))

                /**
                 * Sets [Builder.travelCost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.travelCost] with a well-typed [TravelCost] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun travelCost(travelCost: JsonField<TravelCost>) = apply {
                    this.travelCost = travelCost
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
                 * Returns an immutable instance of [Objective].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Objective =
                    Objective(
                        allowEarlyArrival,
                        custom,
                        minimiseNumDepots,
                        solverMode,
                        solvingTimeLimit,
                        travelCost,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Objective = apply {
                if (validated) {
                    return@apply
                }

                allowEarlyArrival()
                custom().ifPresent { it.validate() }
                minimiseNumDepots()
                solverMode().ifPresent { it.validate() }
                solvingTimeLimit()
                travelCost().ifPresent { it.validate() }
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
                (if (allowEarlyArrival.asKnown().isPresent) 1 else 0) +
                    (custom.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (minimiseNumDepots.asKnown().isPresent) 1 else 0) +
                    (solverMode.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (solvingTimeLimit.asKnown().isPresent) 1 else 0) +
                    (travelCost.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * The `custom` parameter is used to define special objectives apart from the simpler
             * travel cost minimization objectives.
             */
            class Custom
            private constructor(
                private val type: JsonField<Type>,
                private val value: JsonField<Value>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<Value> = JsonMissing.of(),
                ) : this(type, value, mutableMapOf())

                /**
                 * The `type` parameter accepts two inputs:
                 * - `min`: This type of customized objective will minimize the metric provided in
                 *   the `value` parameter.
                 * - `min-max`: This type of customized objective will approximate an even
                 *   distribution of the metric provided in the `value` parameter, among all the
                 *   routes in solution.
                 *
                 * Please note that `type` is mandatory only when using `custom` attribute.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * The `value` parameter accepts four inputs, two of them are valid for `min` type
                 * and other two are valid for `min-max` type custom objective. Let’s look at the
                 * values for `min` type objective:
                 * - `vehicles`: Solver will minimize the number of vehicles used in the solution.
                 * - `completion_time`: Solver will minimize the total time taken to complete all
                 *   tasks.
                 *
                 * The next set of values are acceptable when `type` is set to `min-max`.
                 * - `tasks`: Solver will evenly distribute the tasks on each route.
                 * - `travel_cost`: Solver will assign tasks such that the traveling cost of each
                 *   route is within a close range of other routes. The travel cost metric
                 *   considered here is the one set using `objective.travel_cost` .
                 *
                 * Please note that `value` is mandatory only when using `custom` attribute. The
                 * above values provide flexibility to tune the optimization algorithm to fulfill
                 * practical objectives beyond the relatively simpler time or distance minimization
                 * approaches.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun value(): Value = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

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
                     * Returns a mutable builder for constructing an instance of [Custom].
                     *
                     * The following fields are required:
                     * ```java
                     * .type()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Custom]. */
                class Builder internal constructor() {

                    private var type: JsonField<Type>? = null
                    private var value: JsonField<Value>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(custom: Custom) = apply {
                        type = custom.type
                        value = custom.value
                        additionalProperties = custom.additionalProperties.toMutableMap()
                    }

                    /**
                     * The `type` parameter accepts two inputs:
                     * - `min`: This type of customized objective will minimize the metric provided
                     *   in the `value` parameter.
                     * - `min-max`: This type of customized objective will approximate an even
                     *   distribution of the metric provided in the `value` parameter, among all the
                     *   routes in solution.
                     *
                     * Please note that `type` is mandatory only when using `custom` attribute.
                     */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    /**
                     * The `value` parameter accepts four inputs, two of them are valid for `min`
                     * type and other two are valid for `min-max` type custom objective. Let’s look
                     * at the values for `min` type objective:
                     * - `vehicles`: Solver will minimize the number of vehicles used in the
                     *   solution.
                     * - `completion_time`: Solver will minimize the total time taken to complete
                     *   all tasks.
                     *
                     * The next set of values are acceptable when `type` is set to `min-max`.
                     * - `tasks`: Solver will evenly distribute the tasks on each route.
                     * - `travel_cost`: Solver will assign tasks such that the traveling cost of
                     *   each route is within a close range of other routes. The travel cost metric
                     *   considered here is the one set using `objective.travel_cost` .
                     *
                     * Please note that `value` is mandatory only when using `custom` attribute. The
                     * above values provide flexibility to tune the optimization algorithm to
                     * fulfill practical objectives beyond the relatively simpler time or distance
                     * minimization approaches.
                     */
                    fun value(value: Value) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Value] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Value>) = apply { this.value = value }

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
                     * Returns an immutable instance of [Custom].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .type()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Custom =
                        Custom(
                            checkRequired("type", type),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Custom = apply {
                    if (validated) {
                        return@apply
                    }

                    type().validate()
                    value().validate()
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
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (value.asKnown().getOrNull()?.validity() ?: 0)

                /**
                 * The `type` parameter accepts two inputs:
                 * - `min`: This type of customized objective will minimize the metric provided in
                 *   the `value` parameter.
                 * - `min-max`: This type of customized objective will approximate an even
                 *   distribution of the metric provided in the `value` parameter, among all the
                 *   routes in solution.
                 *
                 * Please note that `type` is mandatory only when using `custom` attribute.
                 */
                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val MIN = of("`min`")

                        @JvmField val MIN_MAX = of("`min-max`")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        MIN,
                        MIN_MAX,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MIN,
                        MIN_MAX,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            MIN -> Value.MIN
                            MIN_MAX -> Value.MIN_MAX
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws NextbillionSdkInvalidDataException if this class instance's value is
                     *   a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            MIN -> Known.MIN
                            MIN_MAX -> Known.MIN_MAX
                            else -> throw NextbillionSdkInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws NextbillionSdkInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * The `value` parameter accepts four inputs, two of them are valid for `min` type
                 * and other two are valid for `min-max` type custom objective. Let’s look at the
                 * values for `min` type objective:
                 * - `vehicles`: Solver will minimize the number of vehicles used in the solution.
                 * - `completion_time`: Solver will minimize the total time taken to complete all
                 *   tasks.
                 *
                 * The next set of values are acceptable when `type` is set to `min-max`.
                 * - `tasks`: Solver will evenly distribute the tasks on each route.
                 * - `travel_cost`: Solver will assign tasks such that the traveling cost of each
                 *   route is within a close range of other routes. The travel cost metric
                 *   considered here is the one set using `objective.travel_cost` .
                 *
                 * Please note that `value` is mandatory only when using `custom` attribute. The
                 * above values provide flexibility to tune the optimization algorithm to fulfill
                 * practical objectives beyond the relatively simpler time or distance minimization
                 * approaches.
                 */
                class Value @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val VEHICLES = of("`vehicles`")

                        @JvmField val COMPLETION_TIME = of("`completion_time`")

                        @JvmField val TRAVEL_COST = of("`travel_cost`")

                        @JvmField val TASKS = of("`tasks`")

                        @JvmStatic fun of(value: String) = Value(JsonField.of(value))
                    }

                    /** An enum containing [Value]'s known values. */
                    enum class Known {
                        VEHICLES,
                        COMPLETION_TIME,
                        TRAVEL_COST,
                        TASKS,
                    }

                    /**
                     * An enum containing [Value]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Value] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        VEHICLES,
                        COMPLETION_TIME,
                        TRAVEL_COST,
                        TASKS,
                        /**
                         * An enum member indicating that [Value] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            VEHICLES -> Value.VEHICLES
                            COMPLETION_TIME -> Value.COMPLETION_TIME
                            TRAVEL_COST -> Value.TRAVEL_COST
                            TASKS -> Value.TASKS
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws NextbillionSdkInvalidDataException if this class instance's value is
                     *   a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            VEHICLES -> Known.VEHICLES
                            COMPLETION_TIME -> Known.COMPLETION_TIME
                            TRAVEL_COST -> Known.TRAVEL_COST
                            TASKS -> Known.TASKS
                            else ->
                                throw NextbillionSdkInvalidDataException("Unknown Value: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws NextbillionSdkInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            NextbillionSdkInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Value = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Value && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Custom && type == other.type && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Custom{type=$type, value=$value, additionalProperties=$additionalProperties}"
            }

            /**
             * If the input doesn’t include features of soft constraints, customized objectives,
             * re-optimization, relations, max travel cost or automatic fixed cost, then user can
             * select “optimal” to achieve a higher-speed and higher-quality optimization.
             *
             * If “optimal” mode is unable to process some features in the input, then it will still
             * goes to “flexible” mode.
             */
            class SolverMode
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val FLEXIBLE = of("`flexible`")

                    @JvmField val FAST = of("`fast`")

                    @JvmField val INTERNAL = of("`internal`")

                    @JvmStatic fun of(value: String) = SolverMode(JsonField.of(value))
                }

                /** An enum containing [SolverMode]'s known values. */
                enum class Known {
                    FLEXIBLE,
                    FAST,
                    INTERNAL,
                }

                /**
                 * An enum containing [SolverMode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [SolverMode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FLEXIBLE,
                    FAST,
                    INTERNAL,
                    /**
                     * An enum member indicating that [SolverMode] was instantiated with an unknown
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
                        FLEXIBLE -> Value.FLEXIBLE
                        FAST -> Value.FAST
                        INTERNAL -> Value.INTERNAL
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
                        FLEXIBLE -> Known.FLEXIBLE
                        FAST -> Known.FAST
                        INTERNAL -> Known.INTERNAL
                        else ->
                            throw NextbillionSdkInvalidDataException("Unknown SolverMode: $value")
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

                fun validate(): SolverMode = apply {
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

                    return /* spotless:off */ other is SolverMode && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The `travel_cost` parameter specifies the type of cost used by the solver to
             * determine the routes.
             *
             * If the `travel_cost` parameter is set to `distance`, the solver will minimize the
             * total distance traveled by vehicles while determining a solution. This objective
             * would be useful in cases where the primary objective is to reduce fuel consumption or
             * travel expenses.
             *
             * If the `travel_cost` parameter is set to `duration`, the solver will minimize the
             * total time taken by the vehicles to complete all tasks while determining a solution.
             * This objective would be useful in cases where the primary objective is to minimize
             * completion time or maximize the number of orders fulfilled within a given time
             * window.
             *
             * If the `travel_cost` parameter is set to `air_distance`, the solver will try to
             * calculate the distance,in meters, between two points using the great-circle distance
             * formula (i.e., the shortest distance between two points on a sphere) instead of the
             * actual road distance. This would be useful in cases where the delivery locations are
             * far apart and the road distance between them is significantly longer than the actual
             * straight-line distance. For example, in Drone Delivery services.
             *
             * If the `travel_cost` is set to `customized` the solver would use the custom cost
             * values provided by the user (in `cost_matrix` attribute) and prefer a solution with
             * lower overall cost. This enables the user to have greater control over the routes
             * preferred by the solver and hence the sequence in which the jobs are completed.
             */
            class TravelCost
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val DURATION = of("`duration`")

                    @JvmField val DISTANCE = of("`distance`")

                    @JvmField val AIR_DISTANCE = of("`air_distance`")

                    @JvmField val CUSTOMIZED = of("`customized`")

                    @JvmStatic fun of(value: String) = TravelCost(JsonField.of(value))
                }

                /** An enum containing [TravelCost]'s known values. */
                enum class Known {
                    DURATION,
                    DISTANCE,
                    AIR_DISTANCE,
                    CUSTOMIZED,
                }

                /**
                 * An enum containing [TravelCost]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [TravelCost] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DURATION,
                    DISTANCE,
                    AIR_DISTANCE,
                    CUSTOMIZED,
                    /**
                     * An enum member indicating that [TravelCost] was instantiated with an unknown
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
                        DURATION -> Value.DURATION
                        DISTANCE -> Value.DISTANCE
                        AIR_DISTANCE -> Value.AIR_DISTANCE
                        CUSTOMIZED -> Value.CUSTOMIZED
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
                        DURATION -> Known.DURATION
                        DISTANCE -> Known.DISTANCE
                        AIR_DISTANCE -> Known.AIR_DISTANCE
                        CUSTOMIZED -> Known.CUSTOMIZED
                        else ->
                            throw NextbillionSdkInvalidDataException("Unknown TravelCost: $value")
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

                fun validate(): TravelCost = apply {
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

                    return /* spotless:off */ other is TravelCost && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Objective && allowEarlyArrival == other.allowEarlyArrival && custom == other.custom && minimiseNumDepots == other.minimiseNumDepots && solverMode == other.solverMode && solvingTimeLimit == other.solvingTimeLimit && travelCost == other.travelCost && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(allowEarlyArrival, custom, minimiseNumDepots, solverMode, solvingTimeLimit, travelCost, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Objective{allowEarlyArrival=$allowEarlyArrival, custom=$custom, minimiseNumDepots=$minimiseNumDepots, solverMode=$solverMode, solvingTimeLimit=$solvingTimeLimit, travelCost=$travelCost, additionalProperties=$additionalProperties}"
        }

        /** This attribute is used to define the routing configurations for the optimization job. */
        class Routing
        private constructor(
            private val allow: JsonField<List<Allow>>,
            private val avoid: JsonField<List<Avoid>>,
            private val context: JsonField<Context>,
            private val crossBorder: JsonField<Boolean>,
            private val disableCache: JsonField<Boolean>,
            private val hazmatType: JsonField<List<HazmatType>>,
            private val mode: JsonField<Mode>,
            private val profiles: JsonValue,
            private val trafficTimestamp: JsonField<Long>,
            private val truckAxleLoad: JsonField<Double>,
            private val truckSize: JsonField<String>,
            private val truckWeight: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("allow")
                @ExcludeMissing
                allow: JsonField<List<Allow>> = JsonMissing.of(),
                @JsonProperty("avoid")
                @ExcludeMissing
                avoid: JsonField<List<Avoid>> = JsonMissing.of(),
                @JsonProperty("context")
                @ExcludeMissing
                context: JsonField<Context> = JsonMissing.of(),
                @JsonProperty("cross_border")
                @ExcludeMissing
                crossBorder: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("disable_cache")
                @ExcludeMissing
                disableCache: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("hazmat_type")
                @ExcludeMissing
                hazmatType: JsonField<List<HazmatType>> = JsonMissing.of(),
                @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
                @JsonProperty("profiles") @ExcludeMissing profiles: JsonValue = JsonMissing.of(),
                @JsonProperty("traffic_timestamp")
                @ExcludeMissing
                trafficTimestamp: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("truck_axle_load")
                @ExcludeMissing
                truckAxleLoad: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("truck_size")
                @ExcludeMissing
                truckSize: JsonField<String> = JsonMissing.of(),
                @JsonProperty("truck_weight")
                @ExcludeMissing
                truckWeight: JsonField<Long> = JsonMissing.of(),
            ) : this(
                allow,
                avoid,
                context,
                crossBorder,
                disableCache,
                hazmatType,
                mode,
                profiles,
                trafficTimestamp,
                truckAxleLoad,
                truckSize,
                truckWeight,
                mutableMapOf(),
            )

            /**
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun allow(): Optional<List<Allow>> = allow.getOptional("allow")

            /**
             * Specify the type of objects/maneuvers that the route should avoid.
             *
             * Please note that:
             * - The values are case-sensitive.
             * - When using `avoid:bbox` feature, users need to specify the boundaries of the
             *   bounding box to be avoided. Multiple bounding boxes can be provided simultaneously.
             *   Please note that bounding box is a hard filter and if it blocks all possible routes
             *   between given locations, a 4xx error is returned. Mention the bounding box
             *   boundaries in the following format: bbox:
             *   min_latitude,min_longitude,max_latitude,max_longitude.
             * - When using `avoid=sharp_turn`, the range of allowed turn angles is \[120,240\] in
             *   the clockwise direction from the current road. Any roads with turn angles outside
             *   the range will be avoided.
             * - If `none` is provided along with other values, an error is returned as a valid
             *   route is not feasible.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun avoid(): Optional<List<Avoid>> = avoid.getOptional("avoid")

            /**
             * Use this parameter to apply a single speed value for all ETA and drive time
             * calculations. In case, the `travel_cost` is set to duration then setting this
             * parameter also impacts the cost of the solution.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun context(): Optional<Context> = context.getOptional("context")

            /**
             * Specify if crossing an international border is allowed for operations near border
             * areas. When set to false, the API will prohibit any routes crossing international
             * borders. When set to true, the service will return routes which cross the borders
             * between countries, if required for the given set `locations`
             *
             * This feature is available in North America region only. Please get in touch with
             * [support@nextbillion.ai](mailto:support@nextbillion.ai) to enquire/enable other
             * areas.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun crossBorder(): Optional<Boolean> = crossBorder.getOptional("cross_border")

            /**
             * Specify if the optimizer should cache the matrix result set (containing ETAs and
             * distances) for the given set of locations in the request. Once the results are
             * cached, the optimizer can use it during the next 60 mins if exactly the same set of
             * locations are provided again. Please note that if a cached result is retrieved, the
             * timer is reset and that result will be available for another 60 mins.
             *
             * If the users want to regenerate the result set, they can set this parameter to `true`
             * and optimizer will not use the cached results.
             *
             * This feature is helpful in expediting the optimization process and generate results
             * quickly. It also helps users to quickly simulate route plans for different
             * combinations of constraints for a given set of locations.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun disableCache(): Optional<Boolean> = disableCache.getOptional("disable_cache")

            /**
             * Specify the type of hazardous material being carried and the service will avoid roads
             * which are not suitable for the type of goods specified. Provide multiple values
             * separated by a comma `,` .
             *
             * Please note that this parameter is effective only when `mode=truck`.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun hazmatType(): Optional<List<HazmatType>> = hazmatType.getOptional("hazmat_type")

            /**
             * Define the traveling mode to be used for determining the optimized routes.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun mode(): Optional<Mode> = mode.getOptional("mode")

            /**
             * Defines all the vehicle profiles. `profiles` is implemented as a dictionary of
             * objects where each profile name is the unique key and the associated value is an
             * object describing the routing properties of that profile. All routing properties
             * available in `options.routing` can be added as values for a given profile.
             *
             * Please note:
             * - The routing properties configured using `options.routing` (and not part of any
             *   \`profiles\`) are considered as default route settings i.e. they are applied to
             *   vehicles which are not associated with any profile.
             * - The default route settings are independent from those defined for any `profiles` .
             *   Consequently, for vehicles which are tagged to a given profile, only the routing
             *   properties configured for the given profile will apply.
             * - If the "mode" is not specified for any profile, by default it is considered to be
             *   `car` .
             * - "default" is a reserved keyword and can not be used as the name for any custom
             *   profile.
             * - `profiles` can't be nested in other profiles.
             * - The number of profiles, including default route settings, are limited to
             *     - 15, if 0 < number of location <= 100
             *     - 6, if 100 < number of location <= 600，
             *     - 2, if 600 < number of location <= 1200,
             *     - 1, if number of location > 1200
             *
             * Routing profiles attribute is useful for configuring fleets containing multiple
             * vehicles types. Check
             * [Routing Profiles](https://docs.nextbillion.ai/docs/optimization/api/route-optimization-flexible/tutorials/routing-profiles)
             * tutorial to learn more.
             */
            @JsonProperty("profiles") @ExcludeMissing fun _profiles(): JsonValue = profiles

            /**
             * Specify the general time when the job needs to be carried out. The time should be
             * expressed as an UNIX timestamp in seconds format. The solver will take into account
             * the general traffic conditions at the given time to determine the routes and their
             * ETAs.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun trafficTimestamp(): Optional<Long> =
                trafficTimestamp.getOptional("traffic_timestamp")

            /**
             * Specify the total load per axle (including the weight of trailers and shipped goods)
             * of the truck, in tonnes. When used, the optimizer will use only those routes which
             * are legally allowed to carry the load specified per axle.
             *
             * Please note this parameter is effective only when `mode=truck`.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun truckAxleLoad(): Optional<Double> = truckAxleLoad.getOptional("truck_axle_load")

            /**
             * Specify the truck dimensions, in centimeters, in the format of “height,width,length”.
             * Please note that this parameter is effective only when `mode=truck`.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun truckSize(): Optional<String> = truckSize.getOptional("truck_size")

            /**
             * Specify the truck weight including the trailers and shipped goods, in kilograms.
             * Please note that this parameter is effective only when `mode=truck`.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun truckWeight(): Optional<Long> = truckWeight.getOptional("truck_weight")

            /**
             * Returns the raw JSON value of [allow].
             *
             * Unlike [allow], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("allow") @ExcludeMissing fun _allow(): JsonField<List<Allow>> = allow

            /**
             * Returns the raw JSON value of [avoid].
             *
             * Unlike [avoid], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("avoid") @ExcludeMissing fun _avoid(): JsonField<List<Avoid>> = avoid

            /**
             * Returns the raw JSON value of [context].
             *
             * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<Context> = context

            /**
             * Returns the raw JSON value of [crossBorder].
             *
             * Unlike [crossBorder], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cross_border")
            @ExcludeMissing
            fun _crossBorder(): JsonField<Boolean> = crossBorder

            /**
             * Returns the raw JSON value of [disableCache].
             *
             * Unlike [disableCache], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("disable_cache")
            @ExcludeMissing
            fun _disableCache(): JsonField<Boolean> = disableCache

            /**
             * Returns the raw JSON value of [hazmatType].
             *
             * Unlike [hazmatType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("hazmat_type")
            @ExcludeMissing
            fun _hazmatType(): JsonField<List<HazmatType>> = hazmatType

            /**
             * Returns the raw JSON value of [mode].
             *
             * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

            /**
             * Returns the raw JSON value of [trafficTimestamp].
             *
             * Unlike [trafficTimestamp], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("traffic_timestamp")
            @ExcludeMissing
            fun _trafficTimestamp(): JsonField<Long> = trafficTimestamp

            /**
             * Returns the raw JSON value of [truckAxleLoad].
             *
             * Unlike [truckAxleLoad], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("truck_axle_load")
            @ExcludeMissing
            fun _truckAxleLoad(): JsonField<Double> = truckAxleLoad

            /**
             * Returns the raw JSON value of [truckSize].
             *
             * Unlike [truckSize], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("truck_size")
            @ExcludeMissing
            fun _truckSize(): JsonField<String> = truckSize

            /**
             * Returns the raw JSON value of [truckWeight].
             *
             * Unlike [truckWeight], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("truck_weight")
            @ExcludeMissing
            fun _truckWeight(): JsonField<Long> = truckWeight

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

                /** Returns a mutable builder for constructing an instance of [Routing]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Routing]. */
            class Builder internal constructor() {

                private var allow: JsonField<MutableList<Allow>>? = null
                private var avoid: JsonField<MutableList<Avoid>>? = null
                private var context: JsonField<Context> = JsonMissing.of()
                private var crossBorder: JsonField<Boolean> = JsonMissing.of()
                private var disableCache: JsonField<Boolean> = JsonMissing.of()
                private var hazmatType: JsonField<MutableList<HazmatType>>? = null
                private var mode: JsonField<Mode> = JsonMissing.of()
                private var profiles: JsonValue = JsonMissing.of()
                private var trafficTimestamp: JsonField<Long> = JsonMissing.of()
                private var truckAxleLoad: JsonField<Double> = JsonMissing.of()
                private var truckSize: JsonField<String> = JsonMissing.of()
                private var truckWeight: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(routing: Routing) = apply {
                    allow = routing.allow.map { it.toMutableList() }
                    avoid = routing.avoid.map { it.toMutableList() }
                    context = routing.context
                    crossBorder = routing.crossBorder
                    disableCache = routing.disableCache
                    hazmatType = routing.hazmatType.map { it.toMutableList() }
                    mode = routing.mode
                    profiles = routing.profiles
                    trafficTimestamp = routing.trafficTimestamp
                    truckAxleLoad = routing.truckAxleLoad
                    truckSize = routing.truckSize
                    truckWeight = routing.truckWeight
                    additionalProperties = routing.additionalProperties.toMutableMap()
                }

                fun allow(allow: List<Allow>) = allow(JsonField.of(allow))

                /**
                 * Sets [Builder.allow] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allow] with a well-typed `List<Allow>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun allow(allow: JsonField<List<Allow>>) = apply {
                    this.allow = allow.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Allow] to [Builder.allow].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAllow(allow: Allow) = apply {
                    this.allow =
                        (this.allow ?: JsonField.of(mutableListOf())).also {
                            checkKnown("allow", it).add(allow)
                        }
                }

                /**
                 * Specify the type of objects/maneuvers that the route should avoid.
                 *
                 * Please note that:
                 * - The values are case-sensitive.
                 * - When using `avoid:bbox` feature, users need to specify the boundaries of the
                 *   bounding box to be avoided. Multiple bounding boxes can be provided
                 *   simultaneously. Please note that bounding box is a hard filter and if it blocks
                 *   all possible routes between given locations, a 4xx error is returned. Mention
                 *   the bounding box boundaries in the following format: bbox:
                 *   min_latitude,min_longitude,max_latitude,max_longitude.
                 * - When using `avoid=sharp_turn`, the range of allowed turn angles is \[120,240\]
                 *   in the clockwise direction from the current road. Any roads with turn angles
                 *   outside the range will be avoided.
                 * - If `none` is provided along with other values, an error is returned as a valid
                 *   route is not feasible.
                 */
                fun avoid(avoid: List<Avoid>) = avoid(JsonField.of(avoid))

                /**
                 * Sets [Builder.avoid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.avoid] with a well-typed `List<Avoid>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun avoid(avoid: JsonField<List<Avoid>>) = apply {
                    this.avoid = avoid.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Avoid] to [Builder.avoid].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAvoid(avoid: Avoid) = apply {
                    this.avoid =
                        (this.avoid ?: JsonField.of(mutableListOf())).also {
                            checkKnown("avoid", it).add(avoid)
                        }
                }

                /**
                 * Use this parameter to apply a single speed value for all ETA and drive time
                 * calculations. In case, the `travel_cost` is set to duration then setting this
                 * parameter also impacts the cost of the solution.
                 */
                fun context(context: Context) = context(JsonField.of(context))

                /**
                 * Sets [Builder.context] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.context] with a well-typed [Context] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun context(context: JsonField<Context>) = apply { this.context = context }

                /**
                 * Specify if crossing an international border is allowed for operations near border
                 * areas. When set to false, the API will prohibit any routes crossing international
                 * borders. When set to true, the service will return routes which cross the borders
                 * between countries, if required for the given set `locations`
                 *
                 * This feature is available in North America region only. Please get in touch with
                 * [support@nextbillion.ai](mailto:support@nextbillion.ai) to enquire/enable other
                 * areas.
                 */
                fun crossBorder(crossBorder: Boolean) = crossBorder(JsonField.of(crossBorder))

                /**
                 * Sets [Builder.crossBorder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.crossBorder] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun crossBorder(crossBorder: JsonField<Boolean>) = apply {
                    this.crossBorder = crossBorder
                }

                /**
                 * Specify if the optimizer should cache the matrix result set (containing ETAs and
                 * distances) for the given set of locations in the request. Once the results are
                 * cached, the optimizer can use it during the next 60 mins if exactly the same set
                 * of locations are provided again. Please note that if a cached result is
                 * retrieved, the timer is reset and that result will be available for another 60
                 * mins.
                 *
                 * If the users want to regenerate the result set, they can set this parameter to
                 * `true` and optimizer will not use the cached results.
                 *
                 * This feature is helpful in expediting the optimization process and generate
                 * results quickly. It also helps users to quickly simulate route plans for
                 * different combinations of constraints for a given set of locations.
                 */
                fun disableCache(disableCache: Boolean) = disableCache(JsonField.of(disableCache))

                /**
                 * Sets [Builder.disableCache] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.disableCache] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun disableCache(disableCache: JsonField<Boolean>) = apply {
                    this.disableCache = disableCache
                }

                /**
                 * Specify the type of hazardous material being carried and the service will avoid
                 * roads which are not suitable for the type of goods specified. Provide multiple
                 * values separated by a comma `,` .
                 *
                 * Please note that this parameter is effective only when `mode=truck`.
                 */
                fun hazmatType(hazmatType: List<HazmatType>) = hazmatType(JsonField.of(hazmatType))

                /**
                 * Sets [Builder.hazmatType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hazmatType] with a well-typed `List<HazmatType>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun hazmatType(hazmatType: JsonField<List<HazmatType>>) = apply {
                    this.hazmatType = hazmatType.map { it.toMutableList() }
                }

                /**
                 * Adds a single [HazmatType] to [Builder.hazmatType].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addHazmatType(hazmatType: HazmatType) = apply {
                    this.hazmatType =
                        (this.hazmatType ?: JsonField.of(mutableListOf())).also {
                            checkKnown("hazmatType", it).add(hazmatType)
                        }
                }

                /** Define the traveling mode to be used for determining the optimized routes. */
                fun mode(mode: Mode) = mode(JsonField.of(mode))

                /**
                 * Sets [Builder.mode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mode] with a well-typed [Mode] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

                /**
                 * Defines all the vehicle profiles. `profiles` is implemented as a dictionary of
                 * objects where each profile name is the unique key and the associated value is an
                 * object describing the routing properties of that profile. All routing properties
                 * available in `options.routing` can be added as values for a given profile.
                 *
                 * Please note:
                 * - The routing properties configured using `options.routing` (and not part of any
                 *   \`profiles\`) are considered as default route settings i.e. they are applied to
                 *   vehicles which are not associated with any profile.
                 * - The default route settings are independent from those defined for any
                 *   `profiles` . Consequently, for vehicles which are tagged to a given profile,
                 *   only the routing properties configured for the given profile will apply.
                 * - If the "mode" is not specified for any profile, by default it is considered to
                 *   be `car` .
                 * - "default" is a reserved keyword and can not be used as the name for any custom
                 *   profile.
                 * - `profiles` can't be nested in other profiles.
                 * - The number of profiles, including default route settings, are limited to
                 *     - 15, if 0 < number of location <= 100
                 *     - 6, if 100 < number of location <= 600，
                 *     - 2, if 600 < number of location <= 1200,
                 *     - 1, if number of location > 1200
                 *
                 * Routing profiles attribute is useful for configuring fleets containing multiple
                 * vehicles types. Check
                 * [Routing Profiles](https://docs.nextbillion.ai/docs/optimization/api/route-optimization-flexible/tutorials/routing-profiles)
                 * tutorial to learn more.
                 */
                fun profiles(profiles: JsonValue) = apply { this.profiles = profiles }

                /**
                 * Specify the general time when the job needs to be carried out. The time should be
                 * expressed as an UNIX timestamp in seconds format. The solver will take into
                 * account the general traffic conditions at the given time to determine the routes
                 * and their ETAs.
                 */
                fun trafficTimestamp(trafficTimestamp: Long) =
                    trafficTimestamp(JsonField.of(trafficTimestamp))

                /**
                 * Sets [Builder.trafficTimestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.trafficTimestamp] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun trafficTimestamp(trafficTimestamp: JsonField<Long>) = apply {
                    this.trafficTimestamp = trafficTimestamp
                }

                /**
                 * Specify the total load per axle (including the weight of trailers and shipped
                 * goods) of the truck, in tonnes. When used, the optimizer will use only those
                 * routes which are legally allowed to carry the load specified per axle.
                 *
                 * Please note this parameter is effective only when `mode=truck`.
                 */
                fun truckAxleLoad(truckAxleLoad: Double) =
                    truckAxleLoad(JsonField.of(truckAxleLoad))

                /**
                 * Sets [Builder.truckAxleLoad] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.truckAxleLoad] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun truckAxleLoad(truckAxleLoad: JsonField<Double>) = apply {
                    this.truckAxleLoad = truckAxleLoad
                }

                /**
                 * Specify the truck dimensions, in centimeters, in the format of
                 * “height,width,length”. Please note that this parameter is effective only when
                 * `mode=truck`.
                 */
                fun truckSize(truckSize: String) = truckSize(JsonField.of(truckSize))

                /**
                 * Sets [Builder.truckSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.truckSize] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun truckSize(truckSize: JsonField<String>) = apply { this.truckSize = truckSize }

                /**
                 * Specify the truck weight including the trailers and shipped goods, in kilograms.
                 * Please note that this parameter is effective only when `mode=truck`.
                 */
                fun truckWeight(truckWeight: Long) = truckWeight(JsonField.of(truckWeight))

                /**
                 * Sets [Builder.truckWeight] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.truckWeight] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun truckWeight(truckWeight: JsonField<Long>) = apply {
                    this.truckWeight = truckWeight
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
                 * Returns an immutable instance of [Routing].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Routing =
                    Routing(
                        (allow ?: JsonMissing.of()).map { it.toImmutable() },
                        (avoid ?: JsonMissing.of()).map { it.toImmutable() },
                        context,
                        crossBorder,
                        disableCache,
                        (hazmatType ?: JsonMissing.of()).map { it.toImmutable() },
                        mode,
                        profiles,
                        trafficTimestamp,
                        truckAxleLoad,
                        truckSize,
                        truckWeight,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Routing = apply {
                if (validated) {
                    return@apply
                }

                allow().ifPresent { it.forEach { it.validate() } }
                avoid().ifPresent { it.forEach { it.validate() } }
                context().ifPresent { it.validate() }
                crossBorder()
                disableCache()
                hazmatType().ifPresent { it.forEach { it.validate() } }
                mode().ifPresent { it.validate() }
                trafficTimestamp()
                truckAxleLoad()
                truckSize()
                truckWeight()
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
                (allow.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (avoid.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (context.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (crossBorder.asKnown().isPresent) 1 else 0) +
                    (if (disableCache.asKnown().isPresent) 1 else 0) +
                    (hazmatType.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (mode.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (trafficTimestamp.asKnown().isPresent) 1 else 0) +
                    (if (truckAxleLoad.asKnown().isPresent) 1 else 0) +
                    (if (truckSize.asKnown().isPresent) 1 else 0) +
                    (if (truckWeight.asKnown().isPresent) 1 else 0)

            class Allow @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val TAXI = of("taxi")

                    @JvmField val HOV = of("hov")

                    @JvmStatic fun of(value: String) = Allow(JsonField.of(value))
                }

                /** An enum containing [Allow]'s known values. */
                enum class Known {
                    TAXI,
                    HOV,
                }

                /**
                 * An enum containing [Allow]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Allow] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TAXI,
                    HOV,
                    /**
                     * An enum member indicating that [Allow] was instantiated with an unknown
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
                        TAXI -> Value.TAXI
                        HOV -> Value.HOV
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
                        TAXI -> Known.TAXI
                        HOV -> Known.HOV
                        else -> throw NextbillionSdkInvalidDataException("Unknown Allow: $value")
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

                fun validate(): Allow = apply {
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

                    return /* spotless:off */ other is Allow && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Avoid @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val TOLL = of("`toll`")

                    @JvmField val HIGHWAY = of("`highway`")

                    @JvmField val BBOX = of("`bbox`")

                    @JvmField val LEFT_TURN = of("`left_turn`")

                    @JvmField val RIGHT_TURN = of("`right_turn`")

                    @JvmField val SHARP_TURN = of("`sharp_turn`")

                    @JvmField val UTURN = of("`uturn`")

                    @JvmField val SERVICE_ROAD = of("`service_road`")

                    @JvmField val FERRY = of("`ferry`")

                    @JvmField val NONE = of("`none` ")

                    @JvmStatic fun of(value: String) = Avoid(JsonField.of(value))
                }

                /** An enum containing [Avoid]'s known values. */
                enum class Known {
                    TOLL,
                    HIGHWAY,
                    BBOX,
                    LEFT_TURN,
                    RIGHT_TURN,
                    SHARP_TURN,
                    UTURN,
                    SERVICE_ROAD,
                    FERRY,
                    NONE,
                }

                /**
                 * An enum containing [Avoid]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Avoid] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TOLL,
                    HIGHWAY,
                    BBOX,
                    LEFT_TURN,
                    RIGHT_TURN,
                    SHARP_TURN,
                    UTURN,
                    SERVICE_ROAD,
                    FERRY,
                    NONE,
                    /**
                     * An enum member indicating that [Avoid] was instantiated with an unknown
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
                        TOLL -> Value.TOLL
                        HIGHWAY -> Value.HIGHWAY
                        BBOX -> Value.BBOX
                        LEFT_TURN -> Value.LEFT_TURN
                        RIGHT_TURN -> Value.RIGHT_TURN
                        SHARP_TURN -> Value.SHARP_TURN
                        UTURN -> Value.UTURN
                        SERVICE_ROAD -> Value.SERVICE_ROAD
                        FERRY -> Value.FERRY
                        NONE -> Value.NONE
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
                        TOLL -> Known.TOLL
                        HIGHWAY -> Known.HIGHWAY
                        BBOX -> Known.BBOX
                        LEFT_TURN -> Known.LEFT_TURN
                        RIGHT_TURN -> Known.RIGHT_TURN
                        SHARP_TURN -> Known.SHARP_TURN
                        UTURN -> Known.UTURN
                        SERVICE_ROAD -> Known.SERVICE_ROAD
                        FERRY -> Known.FERRY
                        NONE -> Known.NONE
                        else -> throw NextbillionSdkInvalidDataException("Unknown Avoid: $value")
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

                fun validate(): Avoid = apply {
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

                    return /* spotless:off */ other is Avoid && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Use this parameter to apply a single speed value for all ETA and drive time
             * calculations. In case, the `travel_cost` is set to duration then setting this
             * parameter also impacts the cost of the solution.
             */
            class Context @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val AVGSPEED = of("`avgspeed`")

                    @JvmStatic fun of(value: String) = Context(JsonField.of(value))
                }

                /** An enum containing [Context]'s known values. */
                enum class Known {
                    AVGSPEED
                }

                /**
                 * An enum containing [Context]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Context] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AVGSPEED,
                    /**
                     * An enum member indicating that [Context] was instantiated with an unknown
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
                        AVGSPEED -> Value.AVGSPEED
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
                        AVGSPEED -> Known.AVGSPEED
                        else -> throw NextbillionSdkInvalidDataException("Unknown Context: $value")
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

                fun validate(): Context = apply {
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

                    return /* spotless:off */ other is Context && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class HazmatType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val GENERAL = of("`general`")

                    @JvmField val CIRCUMSTANTIAL = of("`circumstantial`")

                    @JvmField val EXPLOSIVE = of("`explosive`")

                    @JvmField val HARMFUL_TO_WATER = of("`harmful_to_water`")

                    @JvmStatic fun of(value: String) = HazmatType(JsonField.of(value))
                }

                /** An enum containing [HazmatType]'s known values. */
                enum class Known {
                    GENERAL,
                    CIRCUMSTANTIAL,
                    EXPLOSIVE,
                    HARMFUL_TO_WATER,
                }

                /**
                 * An enum containing [HazmatType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [HazmatType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GENERAL,
                    CIRCUMSTANTIAL,
                    EXPLOSIVE,
                    HARMFUL_TO_WATER,
                    /**
                     * An enum member indicating that [HazmatType] was instantiated with an unknown
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
                        GENERAL -> Value.GENERAL
                        CIRCUMSTANTIAL -> Value.CIRCUMSTANTIAL
                        EXPLOSIVE -> Value.EXPLOSIVE
                        HARMFUL_TO_WATER -> Value.HARMFUL_TO_WATER
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
                        GENERAL -> Known.GENERAL
                        CIRCUMSTANTIAL -> Known.CIRCUMSTANTIAL
                        EXPLOSIVE -> Known.EXPLOSIVE
                        HARMFUL_TO_WATER -> Known.HARMFUL_TO_WATER
                        else ->
                            throw NextbillionSdkInvalidDataException("Unknown HazmatType: $value")
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

                fun validate(): HazmatType = apply {
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

                    return /* spotless:off */ other is HazmatType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Define the traveling mode to be used for determining the optimized routes. */
            class Mode @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val CAR = of("`car`")

                    @JvmField val TRUCK = of("`truck`")

                    @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
                }

                /** An enum containing [Mode]'s known values. */
                enum class Known {
                    CAR,
                    TRUCK,
                }

                /**
                 * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Mode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CAR,
                    TRUCK,
                    /**
                     * An enum member indicating that [Mode] was instantiated with an unknown value.
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
                        CAR -> Value.CAR
                        TRUCK -> Value.TRUCK
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
                        CAR -> Known.CAR
                        TRUCK -> Known.TRUCK
                        else -> throw NextbillionSdkInvalidDataException("Unknown Mode: $value")
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

                    return /* spotless:off */ other is Mode && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Routing && allow == other.allow && avoid == other.avoid && context == other.context && crossBorder == other.crossBorder && disableCache == other.disableCache && hazmatType == other.hazmatType && mode == other.mode && profiles == other.profiles && trafficTimestamp == other.trafficTimestamp && truckAxleLoad == other.truckAxleLoad && truckSize == other.truckSize && truckWeight == other.truckWeight && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(allow, avoid, context, crossBorder, disableCache, hazmatType, mode, profiles, trafficTimestamp, truckAxleLoad, truckSize, truckWeight, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Routing{allow=$allow, avoid=$avoid, context=$context, crossBorder=$crossBorder, disableCache=$disableCache, hazmatType=$hazmatType, mode=$mode, profiles=$profiles, trafficTimestamp=$trafficTimestamp, truckAxleLoad=$truckAxleLoad, truckSize=$truckSize, truckWeight=$truckWeight, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Options && constraint == other.constraint && grouping == other.grouping && objective == other.objective && routing == other.routing && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(constraint, grouping, objective, routing, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Options{constraint=$constraint, grouping=$grouping, objective=$objective, routing=$routing, additionalProperties=$additionalProperties}"
    }

    class Relation
    private constructor(
        private val steps: JsonField<List<Step>>,
        private val type: JsonField<Type>,
        private val id: JsonField<Long>,
        private val maxDuration: JsonField<Long>,
        private val minDuration: JsonField<Long>,
        private val vehicle: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("steps") @ExcludeMissing steps: JsonField<List<Step>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("max_duration")
            @ExcludeMissing
            maxDuration: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("min_duration")
            @ExcludeMissing
            minDuration: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("vehicle") @ExcludeMissing vehicle: JsonField<String> = JsonMissing.of(),
        ) : this(steps, type, id, maxDuration, minDuration, vehicle, mutableMapOf())

        /**
         * The `steps` property specifies the tasks or steps that are part of the relation and must
         * be carried out in a manner defined in the `type` parameter. Please note you can add any
         * number of steps here, except when relation type is `precedence` where only 2 tasks can be
         * added.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun steps(): List<Step> = steps.getRequired("steps")

        /**
         * Specifies the type of relation constraint. The following types are supported:
         * - `in_same_route`: Ensures that all `steps` are covered in the same route in solution.
         * - `in_sequence`: Ensures that all steps are in the same route and their sequence matches
         *   the order specified in the `steps` field. Insertion of new steps between the `steps`
         *   specified, is allowed.
         * - `in_direct_sequence`: Similar to `in_sequence`, but insertion of new `steps` is not
         *   allowed in the final route.
         * - `precedence`: Restricts the travel time between the first step and second step. If the
         *   precedence requirement cannot be satisfied, then the task specified at the second step
         *   will not be assigned. Only 2 steps can be specified in a single `precedence` type
         *   relations. Please use multiple `precedence` relations to apply restrictions on more
         *   than 2 tasks.
         *
         * If the `vehicle` field is specified in the relations input, all steps will be served by
         * that particular vehicle. Otherwise, the route can be allocated to any feasible vehicle.
         *
         * Please note that the `type` field is mandatory when using the `relations` object.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * **Deprecated! Please use the** `vehicle` **parameter to specify the vehicle ID.**
         *
         * Specifies the ID of the vehicle that would fulfil the steps. ID should be consistent with
         * input IDs provided in the `vehicles` object.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun id(): Optional<Long> = id.getOptional("id")

        /**
         * This attribute is effective only when `precedence` type relation is used. `max_duration`
         * restricts the travel time of the vehicle to go from location of first task to the
         * location of second task specified in `steps` object. The unit for this parameter is
         * seconds. It accepts values greater than 0 only.
         *
         * Please note that `max_duration` is a hard constraint. Hence, if aggressive durations are
         * provided such that the second task cannot be reached within the specified `max_duration`,
         * it might be done before the first task (usually in case of `jobs`) or remain un-assigned
         * (usually in case of `shipments`).
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxDuration(): Optional<Long> = maxDuration.getOptional("max_duration")

        /**
         * This attribute is effective only when `precedence` type relation is used. Use
         * `min_duration` to enforce a minimum time-gap between the two tasks specified in `steps`
         * object. When specified, the second task will get completed after a gap of `min_duration`
         * with respect to the first task. The unit for this parameter is seconds.
         *
         * Please note that `min_duration` is implemented as a soft constraint and it can be
         * violated in presence of other relation types. The optimizer will tend to provide
         * solutions where `min_duration` is not violated, but it is not guaranteed.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun minDuration(): Optional<Long> = minDuration.getOptional("min_duration")

        /**
         * Specifies the ID of the vehicle that would fulfill the steps. Providing the same vehicle
         * ID to multiple ‘relations’ is prohibited. The vehicle ID provided here should be
         * consistent with ID provided in the `vehicles` attribute.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun vehicle(): Optional<String> = vehicle.getOptional("vehicle")

        /**
         * Returns the raw JSON value of [steps].
         *
         * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("steps") @ExcludeMissing fun _steps(): JsonField<List<Step>> = steps

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [maxDuration].
         *
         * Unlike [maxDuration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_duration")
        @ExcludeMissing
        fun _maxDuration(): JsonField<Long> = maxDuration

        /**
         * Returns the raw JSON value of [minDuration].
         *
         * Unlike [minDuration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("min_duration")
        @ExcludeMissing
        fun _minDuration(): JsonField<Long> = minDuration

        /**
         * Returns the raw JSON value of [vehicle].
         *
         * Unlike [vehicle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vehicle") @ExcludeMissing fun _vehicle(): JsonField<String> = vehicle

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
             * Returns a mutable builder for constructing an instance of [Relation].
             *
             * The following fields are required:
             * ```java
             * .steps()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Relation]. */
        class Builder internal constructor() {

            private var steps: JsonField<MutableList<Step>>? = null
            private var type: JsonField<Type>? = null
            private var id: JsonField<Long> = JsonMissing.of()
            private var maxDuration: JsonField<Long> = JsonMissing.of()
            private var minDuration: JsonField<Long> = JsonMissing.of()
            private var vehicle: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(relation: Relation) = apply {
                steps = relation.steps.map { it.toMutableList() }
                type = relation.type
                id = relation.id
                maxDuration = relation.maxDuration
                minDuration = relation.minDuration
                vehicle = relation.vehicle
                additionalProperties = relation.additionalProperties.toMutableMap()
            }

            /**
             * The `steps` property specifies the tasks or steps that are part of the relation and
             * must be carried out in a manner defined in the `type` parameter. Please note you can
             * add any number of steps here, except when relation type is `precedence` where only 2
             * tasks can be added.
             */
            fun steps(steps: List<Step>) = steps(JsonField.of(steps))

            /**
             * Sets [Builder.steps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.steps] with a well-typed `List<Step>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun steps(steps: JsonField<List<Step>>) = apply {
                this.steps = steps.map { it.toMutableList() }
            }

            /**
             * Adds a single [Step] to [steps].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStep(step: Step) = apply {
                steps =
                    (steps ?: JsonField.of(mutableListOf())).also {
                        checkKnown("steps", it).add(step)
                    }
            }

            /**
             * Specifies the type of relation constraint. The following types are supported:
             * - `in_same_route`: Ensures that all `steps` are covered in the same route in
             *   solution.
             * - `in_sequence`: Ensures that all steps are in the same route and their sequence
             *   matches the order specified in the `steps` field. Insertion of new steps between
             *   the `steps` specified, is allowed.
             * - `in_direct_sequence`: Similar to `in_sequence`, but insertion of new `steps` is not
             *   allowed in the final route.
             * - `precedence`: Restricts the travel time between the first step and second step. If
             *   the precedence requirement cannot be satisfied, then the task specified at the
             *   second step will not be assigned. Only 2 steps can be specified in a single
             *   `precedence` type relations. Please use multiple `precedence` relations to apply
             *   restrictions on more than 2 tasks.
             *
             * If the `vehicle` field is specified in the relations input, all steps will be served
             * by that particular vehicle. Otherwise, the route can be allocated to any feasible
             * vehicle.
             *
             * Please note that the `type` field is mandatory when using the `relations` object.
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

            /**
             * **Deprecated! Please use the** `vehicle` **parameter to specify the vehicle ID.**
             *
             * Specifies the ID of the vehicle that would fulfil the steps. ID should be consistent
             * with input IDs provided in the `vehicles` object.
             */
            fun id(id: Long) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Long>) = apply { this.id = id }

            /**
             * This attribute is effective only when `precedence` type relation is used.
             * `max_duration` restricts the travel time of the vehicle to go from location of first
             * task to the location of second task specified in `steps` object. The unit for this
             * parameter is seconds. It accepts values greater than 0 only.
             *
             * Please note that `max_duration` is a hard constraint. Hence, if aggressive durations
             * are provided such that the second task cannot be reached within the specified
             * `max_duration`, it might be done before the first task (usually in case of `jobs`) or
             * remain un-assigned (usually in case of `shipments`).
             */
            fun maxDuration(maxDuration: Long) = maxDuration(JsonField.of(maxDuration))

            /**
             * Sets [Builder.maxDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxDuration] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxDuration(maxDuration: JsonField<Long>) = apply { this.maxDuration = maxDuration }

            /**
             * This attribute is effective only when `precedence` type relation is used. Use
             * `min_duration` to enforce a minimum time-gap between the two tasks specified in
             * `steps` object. When specified, the second task will get completed after a gap of
             * `min_duration` with respect to the first task. The unit for this parameter is
             * seconds.
             *
             * Please note that `min_duration` is implemented as a soft constraint and it can be
             * violated in presence of other relation types. The optimizer will tend to provide
             * solutions where `min_duration` is not violated, but it is not guaranteed.
             */
            fun minDuration(minDuration: Long) = minDuration(JsonField.of(minDuration))

            /**
             * Sets [Builder.minDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minDuration] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minDuration(minDuration: JsonField<Long>) = apply { this.minDuration = minDuration }

            /**
             * Specifies the ID of the vehicle that would fulfill the steps. Providing the same
             * vehicle ID to multiple ‘relations’ is prohibited. The vehicle ID provided here should
             * be consistent with ID provided in the `vehicles` attribute.
             */
            fun vehicle(vehicle: String) = vehicle(JsonField.of(vehicle))

            /**
             * Sets [Builder.vehicle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vehicle] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vehicle(vehicle: JsonField<String>) = apply { this.vehicle = vehicle }

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
             * Returns an immutable instance of [Relation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .steps()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Relation =
                Relation(
                    checkRequired("steps", steps).map { it.toImmutable() },
                    checkRequired("type", type),
                    id,
                    maxDuration,
                    minDuration,
                    vehicle,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Relation = apply {
            if (validated) {
                return@apply
            }

            steps().forEach { it.validate() }
            type().validate()
            id()
            maxDuration()
            minDuration()
            vehicle()
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
            (steps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (maxDuration.asKnown().isPresent) 1 else 0) +
                (if (minDuration.asKnown().isPresent) 1 else 0) +
                (if (vehicle.asKnown().isPresent) 1 else 0)

        class Step
        private constructor(
            private val type: JsonField<Type>,
            private val id: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            ) : this(type, id, mutableMapOf())

            /**
             * Specifies the type of the step. The `start` and `end` step types have to be the first
             * and last steps, respectively, in a relation.
             *
             * Please note that the `type` is mandatory when using the `relations` object.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * This represents the ID of the task and should be consistent with the input IDs
             * provided in the `jobs` or `shipments` objects for a given step. The `id` is required
             * for all steps other than `start` and `end`.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
                 * Returns a mutable builder for constructing an instance of [Step].
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Step]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(step: Step) = apply {
                    type = step.type
                    id = step.id
                    additionalProperties = step.additionalProperties.toMutableMap()
                }

                /**
                 * Specifies the type of the step. The `start` and `end` step types have to be the
                 * first and last steps, respectively, in a relation.
                 *
                 * Please note that the `type` is mandatory when using the `relations` object.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * This represents the ID of the task and should be consistent with the input IDs
                 * provided in the `jobs` or `shipments` objects for a given step. The `id` is
                 * required for all steps other than `start` and `end`.
                 */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

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
                 * Returns an immutable instance of [Step].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Step =
                    Step(checkRequired("type", type), id, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Step = apply {
                if (validated) {
                    return@apply
                }

                type().validate()
                id()
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
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (id.asKnown().isPresent) 1 else 0)

            /**
             * Specifies the type of the step. The `start` and `end` step types have to be the first
             * and last steps, respectively, in a relation.
             *
             * Please note that the `type` is mandatory when using the `relations` object.
             */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val START = of("`start`")

                    @JvmField val END = of("`end`")

                    @JvmField val JOB = of("`job`")

                    @JvmField val PICKUP = of("`pickup`")

                    @JvmField val DELIVERY = of("`delivery`")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    START,
                    END,
                    JOB,
                    PICKUP,
                    DELIVERY,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    START,
                    END,
                    JOB,
                    PICKUP,
                    DELIVERY,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        START -> Value.START
                        END -> Value.END
                        JOB -> Value.JOB
                        PICKUP -> Value.PICKUP
                        DELIVERY -> Value.DELIVERY
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
                        START -> Known.START
                        END -> Known.END
                        JOB -> Known.JOB
                        PICKUP -> Known.PICKUP
                        DELIVERY -> Known.DELIVERY
                        else -> throw NextbillionSdkInvalidDataException("Unknown Type: $value")
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

                return /* spotless:off */ other is Step && type == other.type && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Step{type=$type, id=$id, additionalProperties=$additionalProperties}"
        }

        /**
         * Specifies the type of relation constraint. The following types are supported:
         * - `in_same_route`: Ensures that all `steps` are covered in the same route in solution.
         * - `in_sequence`: Ensures that all steps are in the same route and their sequence matches
         *   the order specified in the `steps` field. Insertion of new steps between the `steps`
         *   specified, is allowed.
         * - `in_direct_sequence`: Similar to `in_sequence`, but insertion of new `steps` is not
         *   allowed in the final route.
         * - `precedence`: Restricts the travel time between the first step and second step. If the
         *   precedence requirement cannot be satisfied, then the task specified at the second step
         *   will not be assigned. Only 2 steps can be specified in a single `precedence` type
         *   relations. Please use multiple `precedence` relations to apply restrictions on more
         *   than 2 tasks.
         *
         * If the `vehicle` field is specified in the relations input, all steps will be served by
         * that particular vehicle. Otherwise, the route can be allocated to any feasible vehicle.
         *
         * Please note that the `type` field is mandatory when using the `relations` object.
         */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val IN_SAME_ROUTE = of("`in_same_route`")

                @JvmField val IN_SEQUENCE = of("`in_sequence`")

                @JvmField val IN_DIRECT_SEQUENCE = of("`in_direct_sequence`")

                @JvmField val PRECEDENCE = of("`precedence`")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                IN_SAME_ROUTE,
                IN_SEQUENCE,
                IN_DIRECT_SEQUENCE,
                PRECEDENCE,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                IN_SAME_ROUTE,
                IN_SEQUENCE,
                IN_DIRECT_SEQUENCE,
                PRECEDENCE,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    IN_SAME_ROUTE -> Value.IN_SAME_ROUTE
                    IN_SEQUENCE -> Value.IN_SEQUENCE
                    IN_DIRECT_SEQUENCE -> Value.IN_DIRECT_SEQUENCE
                    PRECEDENCE -> Value.PRECEDENCE
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
                    IN_SAME_ROUTE -> Known.IN_SAME_ROUTE
                    IN_SEQUENCE -> Known.IN_SEQUENCE
                    IN_DIRECT_SEQUENCE -> Known.IN_DIRECT_SEQUENCE
                    PRECEDENCE -> Known.PRECEDENCE
                    else -> throw NextbillionSdkInvalidDataException("Unknown Type: $value")
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

            return /* spotless:off */ other is Relation && steps == other.steps && type == other.type && id == other.id && maxDuration == other.maxDuration && minDuration == other.minDuration && vehicle == other.vehicle && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(steps, type, id, maxDuration, minDuration, vehicle, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Relation{steps=$steps, type=$type, id=$id, maxDuration=$maxDuration, minDuration=$minDuration, vehicle=$vehicle, additionalProperties=$additionalProperties}"
    }

    class Solution
    private constructor(
        private val cost: JsonField<Long>,
        private val steps: JsonField<List<Step>>,
        private val vehicle: JsonField<String>,
        private val delivery: JsonField<List<Long>>,
        private val description: JsonField<String>,
        private val distance: JsonField<Long>,
        private val duration: JsonField<Long>,
        private val geometry: JsonField<String>,
        private val pickup: JsonField<List<Long>>,
        private val priority: JsonField<Long>,
        private val service: JsonField<Long>,
        private val setup: JsonField<Long>,
        private val waitingTime: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cost") @ExcludeMissing cost: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("steps") @ExcludeMissing steps: JsonField<List<Step>> = JsonMissing.of(),
            @JsonProperty("vehicle") @ExcludeMissing vehicle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("delivery")
            @ExcludeMissing
            delivery: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("distance") @ExcludeMissing distance: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("duration") @ExcludeMissing duration: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("geometry")
            @ExcludeMissing
            geometry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pickup")
            @ExcludeMissing
            pickup: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("priority") @ExcludeMissing priority: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("service") @ExcludeMissing service: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("setup") @ExcludeMissing setup: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("waiting_time")
            @ExcludeMissing
            waitingTime: JsonField<Long> = JsonMissing.of(),
        ) : this(
            cost,
            steps,
            vehicle,
            delivery,
            description,
            distance,
            duration,
            geometry,
            pickup,
            priority,
            service,
            setup,
            waitingTime,
            mutableMapOf(),
        )

        /**
         * Specify the cost of the route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cost(): Long = cost.getRequired("cost")

        /**
         * Describe the steps in this route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun steps(): List<Step> = steps.getRequired("steps")

        /**
         * Specify the ID of the vehicle that was assigned to the route. This field is mandatory
         * when using the `solution` attribute and providing an empty string would result in error.
         * The IDs are case-sensitive.
         *
         * **Note:** Since the vehicles can be configured using either a string or an integer ID,
         * please ensure that the same value type is provided for this field as was used in the
         * original request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun vehicle(): String = vehicle.getRequired("vehicle")

        /**
         * Specify the total quantities, for each dimension (or unit), of deliveries performed in
         * the route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun delivery(): Optional<List<Long>> = delivery.getOptional("delivery")

        /**
         * Specify the description of the assigned vehicle.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Specify the total distance of the route, in meters.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun distance(): Optional<Long> = distance.getOptional("distance")

        /**
         * Specify the total drive duration of the route, in seconds.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun duration(): Optional<Long> = duration.getOptional("duration")

        /**
         * Specify the geometry of this route encoded in polyline format.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geometry(): Optional<String> = geometry.getOptional("geometry")

        /**
         * Specify the total quantities, for each dimension (or unit), of pickups performed in the
         * route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun pickup(): Optional<List<Long>> = pickup.getOptional("pickup")

        /**
         * Specify the sum of priorities of all tasks on the route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun priority(): Optional<Long> = priority.getOptional("priority")

        /**
         * Specify the total service time for the route, in seconds.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun service(): Optional<Long> = service.getOptional("service")

        /**
         * Specify the total set-up duration, in seconds, needed for the tasks on the route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun setup(): Optional<Long> = setup.getOptional("setup")

        /**
         * Specify the total waiting time of the vehicle on the route, in seconds.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun waitingTime(): Optional<Long> = waitingTime.getOptional("waiting_time")

        /**
         * Returns the raw JSON value of [cost].
         *
         * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Long> = cost

        /**
         * Returns the raw JSON value of [steps].
         *
         * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("steps") @ExcludeMissing fun _steps(): JsonField<List<Step>> = steps

        /**
         * Returns the raw JSON value of [vehicle].
         *
         * Unlike [vehicle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vehicle") @ExcludeMissing fun _vehicle(): JsonField<String> = vehicle

        /**
         * Returns the raw JSON value of [delivery].
         *
         * Unlike [delivery], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delivery") @ExcludeMissing fun _delivery(): JsonField<List<Long>> = delivery

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [distance].
         *
         * Unlike [distance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Long> = distance

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

        /**
         * Returns the raw JSON value of [geometry].
         *
         * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("geometry") @ExcludeMissing fun _geometry(): JsonField<String> = geometry

        /**
         * Returns the raw JSON value of [pickup].
         *
         * Unlike [pickup], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pickup") @ExcludeMissing fun _pickup(): JsonField<List<Long>> = pickup

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Long> = priority

        /**
         * Returns the raw JSON value of [service].
         *
         * Unlike [service], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("service") @ExcludeMissing fun _service(): JsonField<Long> = service

        /**
         * Returns the raw JSON value of [setup].
         *
         * Unlike [setup], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("setup") @ExcludeMissing fun _setup(): JsonField<Long> = setup

        /**
         * Returns the raw JSON value of [waitingTime].
         *
         * Unlike [waitingTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("waiting_time")
        @ExcludeMissing
        fun _waitingTime(): JsonField<Long> = waitingTime

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
             * Returns a mutable builder for constructing an instance of [Solution].
             *
             * The following fields are required:
             * ```java
             * .cost()
             * .steps()
             * .vehicle()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Solution]. */
        class Builder internal constructor() {

            private var cost: JsonField<Long>? = null
            private var steps: JsonField<MutableList<Step>>? = null
            private var vehicle: JsonField<String>? = null
            private var delivery: JsonField<MutableList<Long>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var distance: JsonField<Long> = JsonMissing.of()
            private var duration: JsonField<Long> = JsonMissing.of()
            private var geometry: JsonField<String> = JsonMissing.of()
            private var pickup: JsonField<MutableList<Long>>? = null
            private var priority: JsonField<Long> = JsonMissing.of()
            private var service: JsonField<Long> = JsonMissing.of()
            private var setup: JsonField<Long> = JsonMissing.of()
            private var waitingTime: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(solution: Solution) = apply {
                cost = solution.cost
                steps = solution.steps.map { it.toMutableList() }
                vehicle = solution.vehicle
                delivery = solution.delivery.map { it.toMutableList() }
                description = solution.description
                distance = solution.distance
                duration = solution.duration
                geometry = solution.geometry
                pickup = solution.pickup.map { it.toMutableList() }
                priority = solution.priority
                service = solution.service
                setup = solution.setup
                waitingTime = solution.waitingTime
                additionalProperties = solution.additionalProperties.toMutableMap()
            }

            /** Specify the cost of the route. */
            fun cost(cost: Long) = cost(JsonField.of(cost))

            /**
             * Sets [Builder.cost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cost] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cost(cost: JsonField<Long>) = apply { this.cost = cost }

            /** Describe the steps in this route. */
            fun steps(steps: List<Step>) = steps(JsonField.of(steps))

            /**
             * Sets [Builder.steps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.steps] with a well-typed `List<Step>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun steps(steps: JsonField<List<Step>>) = apply {
                this.steps = steps.map { it.toMutableList() }
            }

            /**
             * Adds a single [Step] to [steps].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStep(step: Step) = apply {
                steps =
                    (steps ?: JsonField.of(mutableListOf())).also {
                        checkKnown("steps", it).add(step)
                    }
            }

            /**
             * Specify the ID of the vehicle that was assigned to the route. This field is mandatory
             * when using the `solution` attribute and providing an empty string would result in
             * error. The IDs are case-sensitive.
             *
             * **Note:** Since the vehicles can be configured using either a string or an integer
             * ID, please ensure that the same value type is provided for this field as was used in
             * the original request.
             */
            fun vehicle(vehicle: String) = vehicle(JsonField.of(vehicle))

            /**
             * Sets [Builder.vehicle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vehicle] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vehicle(vehicle: JsonField<String>) = apply { this.vehicle = vehicle }

            /**
             * Specify the total quantities, for each dimension (or unit), of deliveries performed
             * in the route.
             */
            fun delivery(delivery: List<Long>) = delivery(JsonField.of(delivery))

            /**
             * Sets [Builder.delivery] to an arbitrary JSON value.
             *
             * You should usually call [Builder.delivery] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun delivery(delivery: JsonField<List<Long>>) = apply {
                this.delivery = delivery.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [Builder.delivery].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDelivery(delivery: Long) = apply {
                this.delivery =
                    (this.delivery ?: JsonField.of(mutableListOf())).also {
                        checkKnown("delivery", it).add(delivery)
                    }
            }

            /** Specify the description of the assigned vehicle. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Specify the total distance of the route, in meters. */
            fun distance(distance: Long) = distance(JsonField.of(distance))

            /**
             * Sets [Builder.distance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distance] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distance(distance: JsonField<Long>) = apply { this.distance = distance }

            /** Specify the total drive duration of the route, in seconds. */
            fun duration(duration: Long) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

            /** Specify the geometry of this route encoded in polyline format. */
            fun geometry(geometry: String) = geometry(JsonField.of(geometry))

            /**
             * Sets [Builder.geometry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geometry] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geometry(geometry: JsonField<String>) = apply { this.geometry = geometry }

            /**
             * Specify the total quantities, for each dimension (or unit), of pickups performed in
             * the route.
             */
            fun pickup(pickup: List<Long>) = pickup(JsonField.of(pickup))

            /**
             * Sets [Builder.pickup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pickup] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pickup(pickup: JsonField<List<Long>>) = apply {
                this.pickup = pickup.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [Builder.pickup].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPickup(pickup: Long) = apply {
                this.pickup =
                    (this.pickup ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pickup", it).add(pickup)
                    }
            }

            /** Specify the sum of priorities of all tasks on the route. */
            fun priority(priority: Long) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Long>) = apply { this.priority = priority }

            /** Specify the total service time for the route, in seconds. */
            fun service(service: Long) = service(JsonField.of(service))

            /**
             * Sets [Builder.service] to an arbitrary JSON value.
             *
             * You should usually call [Builder.service] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun service(service: JsonField<Long>) = apply { this.service = service }

            /** Specify the total set-up duration, in seconds, needed for the tasks on the route. */
            fun setup(setup: Long) = setup(JsonField.of(setup))

            /**
             * Sets [Builder.setup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.setup] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun setup(setup: JsonField<Long>) = apply { this.setup = setup }

            /** Specify the total waiting time of the vehicle on the route, in seconds. */
            fun waitingTime(waitingTime: Long) = waitingTime(JsonField.of(waitingTime))

            /**
             * Sets [Builder.waitingTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waitingTime] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun waitingTime(waitingTime: JsonField<Long>) = apply { this.waitingTime = waitingTime }

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
             * Returns an immutable instance of [Solution].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .cost()
             * .steps()
             * .vehicle()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Solution =
                Solution(
                    checkRequired("cost", cost),
                    checkRequired("steps", steps).map { it.toImmutable() },
                    checkRequired("vehicle", vehicle),
                    (delivery ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    distance,
                    duration,
                    geometry,
                    (pickup ?: JsonMissing.of()).map { it.toImmutable() },
                    priority,
                    service,
                    setup,
                    waitingTime,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Solution = apply {
            if (validated) {
                return@apply
            }

            cost()
            steps().forEach { it.validate() }
            vehicle()
            delivery()
            description()
            distance()
            duration()
            geometry()
            pickup()
            priority()
            service()
            setup()
            waitingTime()
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
            (if (cost.asKnown().isPresent) 1 else 0) +
                (steps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (vehicle.asKnown().isPresent) 1 else 0) +
                (delivery.asKnown().getOrNull()?.size ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (distance.asKnown().isPresent) 1 else 0) +
                (if (duration.asKnown().isPresent) 1 else 0) +
                (if (geometry.asKnown().isPresent) 1 else 0) +
                (pickup.asKnown().getOrNull()?.size ?: 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (if (service.asKnown().isPresent) 1 else 0) +
                (if (setup.asKnown().isPresent) 1 else 0) +
                (if (waitingTime.asKnown().isPresent) 1 else 0)

        /** Describe details about a step of a route */
        class Step
        private constructor(
            private val id: JsonField<String>,
            private val arrival: JsonField<Long>,
            private val type: JsonField<Type>,
            private val description: JsonField<String>,
            private val distance: JsonField<Long>,
            private val duration: JsonField<Long>,
            private val load: JsonField<List<Long>>,
            private val location: JsonField<List<Double>>,
            private val locationIndex: JsonField<Long>,
            private val service: JsonField<Long>,
            private val setup: JsonField<Long>,
            private val waitingTime: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("arrival")
                @ExcludeMissing
                arrival: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("distance")
                @ExcludeMissing
                distance: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("duration")
                @ExcludeMissing
                duration: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("load")
                @ExcludeMissing
                load: JsonField<List<Long>> = JsonMissing.of(),
                @JsonProperty("location")
                @ExcludeMissing
                location: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("location_index")
                @ExcludeMissing
                locationIndex: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("service")
                @ExcludeMissing
                service: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("setup") @ExcludeMissing setup: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("waiting_time")
                @ExcludeMissing
                waitingTime: JsonField<Long> = JsonMissing.of(),
            ) : this(
                id,
                arrival,
                type,
                description,
                distance,
                duration,
                load,
                location,
                locationIndex,
                service,
                setup,
                waitingTime,
                mutableMapOf(),
            )

            /**
             * The ID of the step. This field is mandatory for all steps except for `start` and
             * `end` type.
             *
             * Please note that the ID provided here must also be present in either the `jobs` or
             * the `shipments` objects.
             *
             * **Note:** We have modified the data type of this field. The latest change is backward
             * compatible and both integer and string type IDs are valid for this field, as long as
             * they match the IDs of the jobs or shipments already configured.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Specify the time at which the vehicle arrives at the `step` location. If
             * `time_windows` is provided, then `arrival` will be an UNIX timestamp expressed in
             * seconds. Otherwise, it will be the total duration, in seconds, elapsed since the
             * start of the route.
             *
             * Please note that arrival is mandatory when using the `solution` object.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun arrival(): Long = arrival.getRequired("arrival")

            /**
             * Specify the type of the step.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Specify the description of this step.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Specify the distance covered, in meters, from the start of the route up until the
             * current step.
             *
             * Please note that the value of this parameter accumulates with each step. In case ,
             * the `travel_cost: air_distance`, then the distance here should be the straight line
             * distance.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun distance(): Optional<Long> = distance.getOptional("distance")

            /**
             * Specify the drive time, in seconds, from the start of the route up until the start of
             * the `step`. Please note that the value of this parameter accumulates with each step.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun duration(): Optional<Long> = duration.getOptional("duration")

            /**
             * Specify the load on the vehicle after completing this step. In case of multiple
             * dimensions, please specify the load for each type.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun load(): Optional<List<Long>> = load.getOptional("load")

            /**
             * Specify the location coordinates of the step in the \[latitude, longitude\] format.
             * Alternatively, `location_index` property can also be used to specify the location of
             * the step.
             *
             * Please note that either `location` or `location_index` is mandatory.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun location(): Optional<List<Double>> = location.getOptional("location")

            /**
             * Specify the index (in the `location` array) of the location coordinates where the
             * step is performed. The valid range of values is \[0, length of `location` array).
             * Alternatively, `location` property can also be used to specify the location.
             *
             * Please note that either `location` or `location_index` is mandatory.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun locationIndex(): Optional<Long> = locationIndex.getOptional("location_index")

            /**
             * Specify the service time, in seconds, at this step.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun service(): Optional<Long> = service.getOptional("service")

            /**
             * Specify the set-up duration, in seconds, needed at the step.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun setup(): Optional<Long> = setup.getOptional("setup")

            /**
             * Specify the wait time of the vehicle at this step, in seconds.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun waitingTime(): Optional<Long> = waitingTime.getOptional("waiting_time")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [arrival].
             *
             * Unlike [arrival], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("arrival") @ExcludeMissing fun _arrival(): JsonField<Long> = arrival

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
            @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Long> = distance

            /**
             * Returns the raw JSON value of [duration].
             *
             * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

            /**
             * Returns the raw JSON value of [load].
             *
             * Unlike [load], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("load") @ExcludeMissing fun _load(): JsonField<List<Long>> = load

            /**
             * Returns the raw JSON value of [location].
             *
             * Unlike [location], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("location")
            @ExcludeMissing
            fun _location(): JsonField<List<Double>> = location

            /**
             * Returns the raw JSON value of [locationIndex].
             *
             * Unlike [locationIndex], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("location_index")
            @ExcludeMissing
            fun _locationIndex(): JsonField<Long> = locationIndex

            /**
             * Returns the raw JSON value of [service].
             *
             * Unlike [service], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("service") @ExcludeMissing fun _service(): JsonField<Long> = service

            /**
             * Returns the raw JSON value of [setup].
             *
             * Unlike [setup], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("setup") @ExcludeMissing fun _setup(): JsonField<Long> = setup

            /**
             * Returns the raw JSON value of [waitingTime].
             *
             * Unlike [waitingTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("waiting_time")
            @ExcludeMissing
            fun _waitingTime(): JsonField<Long> = waitingTime

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
                 * Returns a mutable builder for constructing an instance of [Step].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .arrival()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Step]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var arrival: JsonField<Long>? = null
                private var type: JsonField<Type>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var distance: JsonField<Long> = JsonMissing.of()
                private var duration: JsonField<Long> = JsonMissing.of()
                private var load: JsonField<MutableList<Long>>? = null
                private var location: JsonField<MutableList<Double>>? = null
                private var locationIndex: JsonField<Long> = JsonMissing.of()
                private var service: JsonField<Long> = JsonMissing.of()
                private var setup: JsonField<Long> = JsonMissing.of()
                private var waitingTime: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(step: Step) = apply {
                    id = step.id
                    arrival = step.arrival
                    type = step.type
                    description = step.description
                    distance = step.distance
                    duration = step.duration
                    load = step.load.map { it.toMutableList() }
                    location = step.location.map { it.toMutableList() }
                    locationIndex = step.locationIndex
                    service = step.service
                    setup = step.setup
                    waitingTime = step.waitingTime
                    additionalProperties = step.additionalProperties.toMutableMap()
                }

                /**
                 * The ID of the step. This field is mandatory for all steps except for `start` and
                 * `end` type.
                 *
                 * Please note that the ID provided here must also be present in either the `jobs`
                 * or the `shipments` objects.
                 *
                 * **Note:** We have modified the data type of this field. The latest change is
                 * backward compatible and both integer and string type IDs are valid for this
                 * field, as long as they match the IDs of the jobs or shipments already configured.
                 */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Specify the time at which the vehicle arrives at the `step` location. If
                 * `time_windows` is provided, then `arrival` will be an UNIX timestamp expressed in
                 * seconds. Otherwise, it will be the total duration, in seconds, elapsed since the
                 * start of the route.
                 *
                 * Please note that arrival is mandatory when using the `solution` object.
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

                /** Specify the type of the step. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** Specify the description of this step. */
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
                 * Specify the distance covered, in meters, from the start of the route up until the
                 * current step.
                 *
                 * Please note that the value of this parameter accumulates with each step. In case
                 * , the `travel_cost: air_distance`, then the distance here should be the straight
                 * line distance.
                 */
                fun distance(distance: Long) = distance(JsonField.of(distance))

                /**
                 * Sets [Builder.distance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.distance] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun distance(distance: JsonField<Long>) = apply { this.distance = distance }

                /**
                 * Specify the drive time, in seconds, from the start of the route up until the
                 * start of the `step`. Please note that the value of this parameter accumulates
                 * with each step.
                 */
                fun duration(duration: Long) = duration(JsonField.of(duration))

                /**
                 * Sets [Builder.duration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.duration] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

                /**
                 * Specify the load on the vehicle after completing this step. In case of multiple
                 * dimensions, please specify the load for each type.
                 */
                fun load(load: List<Long>) = load(JsonField.of(load))

                /**
                 * Sets [Builder.load] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.load] with a well-typed `List<Long>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun load(load: JsonField<List<Long>>) = apply {
                    this.load = load.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Long] to [Builder.load].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLoad(load: Long) = apply {
                    this.load =
                        (this.load ?: JsonField.of(mutableListOf())).also {
                            checkKnown("load", it).add(load)
                        }
                }

                /**
                 * Specify the location coordinates of the step in the \[latitude, longitude\]
                 * format. Alternatively, `location_index` property can also be used to specify the
                 * location of the step.
                 *
                 * Please note that either `location` or `location_index` is mandatory.
                 */
                fun location(location: List<Double>) = location(JsonField.of(location))

                /**
                 * Sets [Builder.location] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.location] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Specify the index (in the `location` array) of the location coordinates where the
                 * step is performed. The valid range of values is \[0, length of `location` array).
                 * Alternatively, `location` property can also be used to specify the location.
                 *
                 * Please note that either `location` or `location_index` is mandatory.
                 */
                fun locationIndex(locationIndex: Long) = locationIndex(JsonField.of(locationIndex))

                /**
                 * Sets [Builder.locationIndex] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.locationIndex] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun locationIndex(locationIndex: JsonField<Long>) = apply {
                    this.locationIndex = locationIndex
                }

                /** Specify the service time, in seconds, at this step. */
                fun service(service: Long) = service(JsonField.of(service))

                /**
                 * Sets [Builder.service] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.service] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun service(service: JsonField<Long>) = apply { this.service = service }

                /** Specify the set-up duration, in seconds, needed at the step. */
                fun setup(setup: Long) = setup(JsonField.of(setup))

                /**
                 * Sets [Builder.setup] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.setup] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun setup(setup: JsonField<Long>) = apply { this.setup = setup }

                /** Specify the wait time of the vehicle at this step, in seconds. */
                fun waitingTime(waitingTime: Long) = waitingTime(JsonField.of(waitingTime))

                /**
                 * Sets [Builder.waitingTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.waitingTime] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun waitingTime(waitingTime: JsonField<Long>) = apply {
                    this.waitingTime = waitingTime
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
                 * Returns an immutable instance of [Step].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .arrival()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Step =
                    Step(
                        checkRequired("id", id),
                        checkRequired("arrival", arrival),
                        checkRequired("type", type),
                        description,
                        distance,
                        duration,
                        (load ?: JsonMissing.of()).map { it.toImmutable() },
                        (location ?: JsonMissing.of()).map { it.toImmutable() },
                        locationIndex,
                        service,
                        setup,
                        waitingTime,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Step = apply {
                if (validated) {
                    return@apply
                }

                id()
                arrival()
                type().validate()
                description()
                distance()
                duration()
                load()
                location()
                locationIndex()
                service()
                setup()
                waitingTime()
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
                    (if (arrival.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (distance.asKnown().isPresent) 1 else 0) +
                    (if (duration.asKnown().isPresent) 1 else 0) +
                    (load.asKnown().getOrNull()?.size ?: 0) +
                    (location.asKnown().getOrNull()?.size ?: 0) +
                    (if (locationIndex.asKnown().isPresent) 1 else 0) +
                    (if (service.asKnown().isPresent) 1 else 0) +
                    (if (setup.asKnown().isPresent) 1 else 0) +
                    (if (waitingTime.asKnown().isPresent) 1 else 0)

            /** Specify the type of the step. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val START = of("`start`")

                    @JvmField val END = of("`end`")

                    @JvmField val JOB = of("`job`")

                    @JvmField val PICKUP = of("`pickup`")

                    @JvmField val DELIVERY = of("`delivery`")

                    @JvmField val BREAK = of("`break`")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    START,
                    END,
                    JOB,
                    PICKUP,
                    DELIVERY,
                    BREAK,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    START,
                    END,
                    JOB,
                    PICKUP,
                    DELIVERY,
                    BREAK,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        START -> Value.START
                        END -> Value.END
                        JOB -> Value.JOB
                        PICKUP -> Value.PICKUP
                        DELIVERY -> Value.DELIVERY
                        BREAK -> Value.BREAK
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
                        START -> Known.START
                        END -> Known.END
                        JOB -> Known.JOB
                        PICKUP -> Known.PICKUP
                        DELIVERY -> Known.DELIVERY
                        BREAK -> Known.BREAK
                        else -> throw NextbillionSdkInvalidDataException("Unknown Type: $value")
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

                return /* spotless:off */ other is Step && id == other.id && arrival == other.arrival && type == other.type && description == other.description && distance == other.distance && duration == other.duration && load == other.load && location == other.location && locationIndex == other.locationIndex && service == other.service && setup == other.setup && waitingTime == other.waitingTime && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, arrival, type, description, distance, duration, load, location, locationIndex, service, setup, waitingTime, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Step{id=$id, arrival=$arrival, type=$type, description=$description, distance=$distance, duration=$duration, load=$load, location=$location, locationIndex=$locationIndex, service=$service, setup=$setup, waitingTime=$waitingTime, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Solution && cost == other.cost && steps == other.steps && vehicle == other.vehicle && delivery == other.delivery && description == other.description && distance == other.distance && duration == other.duration && geometry == other.geometry && pickup == other.pickup && priority == other.priority && service == other.service && setup == other.setup && waitingTime == other.waitingTime && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cost, steps, vehicle, delivery, description, distance, duration, geometry, pickup, priority, service, setup, waitingTime, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Solution{cost=$cost, steps=$steps, vehicle=$vehicle, delivery=$delivery, description=$description, distance=$distance, duration=$duration, geometry=$geometry, pickup=$pickup, priority=$priority, service=$service, setup=$setup, waitingTime=$waitingTime, additionalProperties=$additionalProperties}"
    }

    /**
     * `unassigned` attribute is related to the re-optimization feature. This attribute should
     * contain the tasks that were not assigned during an earlier optimization process. Please note
     * that the `unassigned` part in request should be consistent with the `unassigned` part in the
     * previous optimization result.
     *
     * Users can reduce the number of unassigned tasks in the re-optimized solution, by following
     * strategies such as:
     * - Extending the time windows for vehicles or tasks to give more flexibility
     * - Adding more vehicles to the optimization problem
     * - Adjusting the priority of different tasks to balance the workload more evenly
     * - Modifying other constraints or parameters to make the problem more solvable
     *
     * Ultimately, the goal is to minimize the number of unassigned tasks while still meeting all
     * the necessary constraints and objectives.
     */
    class Unassigned
    private constructor(
        private val jobs: JsonField<List<String>>,
        private val shipments: JsonField<List<List<String>>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("jobs") @ExcludeMissing jobs: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("shipments")
            @ExcludeMissing
            shipments: JsonField<List<List<String>>> = JsonMissing.of(),
        ) : this(jobs, shipments, mutableMapOf())

        /**
         * Specify the unassigned job IDs from the previous optimization result. Please note the IDs
         * should also be present in the `jobs` part of the input.
         *
         * **Note:** We have modified the data type of this field. However, the latest change is
         * backward compatible and both integer and string type job IDs are valid for this field, as
         * long as they match the IDs of the jobs already configured. Providing mixed value types in
         * the array, will lead to an error.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun jobs(): Optional<List<String>> = jobs.getOptional("jobs")

        /**
         * Specify the unassigned shipment pickup & delivery IDs from the previous optimization
         * result. Both the pickup & delivery steps of a shipment should be part of the same array.
         *
         * **Note:** We have modified the data type of this field. However, the latest change is
         * backward compatible and both integer and string type shipment IDs are valid for this
         * field, as long as they match the IDs of the shipments already configured. Providing mixed
         * value types in the array, will lead to an error.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun shipments(): Optional<List<List<String>>> = shipments.getOptional("shipments")

        /**
         * Returns the raw JSON value of [jobs].
         *
         * Unlike [jobs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("jobs") @ExcludeMissing fun _jobs(): JsonField<List<String>> = jobs

        /**
         * Returns the raw JSON value of [shipments].
         *
         * Unlike [shipments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shipments")
        @ExcludeMissing
        fun _shipments(): JsonField<List<List<String>>> = shipments

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

            /** Returns a mutable builder for constructing an instance of [Unassigned]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Unassigned]. */
        class Builder internal constructor() {

            private var jobs: JsonField<MutableList<String>>? = null
            private var shipments: JsonField<MutableList<List<String>>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unassigned: Unassigned) = apply {
                jobs = unassigned.jobs.map { it.toMutableList() }
                shipments = unassigned.shipments.map { it.toMutableList() }
                additionalProperties = unassigned.additionalProperties.toMutableMap()
            }

            /**
             * Specify the unassigned job IDs from the previous optimization result. Please note the
             * IDs should also be present in the `jobs` part of the input.
             *
             * **Note:** We have modified the data type of this field. However, the latest change is
             * backward compatible and both integer and string type job IDs are valid for this
             * field, as long as they match the IDs of the jobs already configured. Providing mixed
             * value types in the array, will lead to an error.
             */
            fun jobs(jobs: List<String>) = jobs(JsonField.of(jobs))

            /**
             * Sets [Builder.jobs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jobs] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jobs(jobs: JsonField<List<String>>) = apply {
                this.jobs = jobs.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [jobs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addJob(job: String) = apply {
                jobs =
                    (jobs ?: JsonField.of(mutableListOf())).also { checkKnown("jobs", it).add(job) }
            }

            /**
             * Specify the unassigned shipment pickup & delivery IDs from the previous optimization
             * result. Both the pickup & delivery steps of a shipment should be part of the same
             * array.
             *
             * **Note:** We have modified the data type of this field. However, the latest change is
             * backward compatible and both integer and string type shipment IDs are valid for this
             * field, as long as they match the IDs of the shipments already configured. Providing
             * mixed value types in the array, will lead to an error.
             */
            fun shipments(shipments: List<List<String>>) = shipments(JsonField.of(shipments))

            /**
             * Sets [Builder.shipments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shipments] with a well-typed `List<List<String>>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun shipments(shipments: JsonField<List<List<String>>>) = apply {
                this.shipments = shipments.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<String>] to [shipments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addShipment(shipment: List<String>) = apply {
                shipments =
                    (shipments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("shipments", it).add(shipment)
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
             * Returns an immutable instance of [Unassigned].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Unassigned =
                Unassigned(
                    (jobs ?: JsonMissing.of()).map { it.toImmutable() },
                    (shipments ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Unassigned = apply {
            if (validated) {
                return@apply
            }

            jobs()
            shipments()
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
            (jobs.asKnown().getOrNull()?.size ?: 0) +
                (shipments.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Unassigned && jobs == other.jobs && shipments == other.shipments && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(jobs, shipments, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Unassigned{jobs=$jobs, shipments=$shipments, additionalProperties=$additionalProperties}"
    }

    class Zone
    private constructor(
        private val id: JsonField<Long>,
        private val geofenceId: JsonField<String>,
        private val geometry: JsonField<Geometry>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("geofence_id")
            @ExcludeMissing
            geofenceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("geometry")
            @ExcludeMissing
            geometry: JsonField<Geometry> = JsonMissing.of(),
        ) : this(id, geofenceId, geometry, mutableMapOf())

        /**
         * Provide an ID for the zone. This field is mandatory when adding zones.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): Long = id.getRequired("id")

        /**
         * Provide the ID of a pre-created geofence using the
         * [Geofence API](https://docs.nextbillion.ai/docs/tracking/api/geofence).
         *
         * Please note that one of `geometry` or `geofence_id` should be provided.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geofenceId(): Optional<String> = geofenceId.getOptional("geofence_id")

        /**
         * It is a [geoJSON object](https://datatracker.ietf.org/doc/html/rfc7946#page-9) with
         * details of the geographic boundaries of the zone. Only “Polygon” and “MultiPolygon”
         * geoJSON types are supported.
         *
         * Please note that one of `geometry` or `geofence_id` should be provided.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geometry(): Optional<Geometry> = geometry.getOptional("geometry")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [geofenceId].
         *
         * Unlike [geofenceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("geofence_id")
        @ExcludeMissing
        fun _geofenceId(): JsonField<String> = geofenceId

        /**
         * Returns the raw JSON value of [geometry].
         *
         * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("geometry") @ExcludeMissing fun _geometry(): JsonField<Geometry> = geometry

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
             * Returns a mutable builder for constructing an instance of [Zone].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Zone]. */
        class Builder internal constructor() {

            private var id: JsonField<Long>? = null
            private var geofenceId: JsonField<String> = JsonMissing.of()
            private var geometry: JsonField<Geometry> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(zone: Zone) = apply {
                id = zone.id
                geofenceId = zone.geofenceId
                geometry = zone.geometry
                additionalProperties = zone.additionalProperties.toMutableMap()
            }

            /** Provide an ID for the zone. This field is mandatory when adding zones. */
            fun id(id: Long) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Long>) = apply { this.id = id }

            /**
             * Provide the ID of a pre-created geofence using the
             * [Geofence API](https://docs.nextbillion.ai/docs/tracking/api/geofence).
             *
             * Please note that one of `geometry` or `geofence_id` should be provided.
             */
            fun geofenceId(geofenceId: String) = geofenceId(JsonField.of(geofenceId))

            /**
             * Sets [Builder.geofenceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geofenceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geofenceId(geofenceId: JsonField<String>) = apply { this.geofenceId = geofenceId }

            /**
             * It is a [geoJSON object](https://datatracker.ietf.org/doc/html/rfc7946#page-9) with
             * details of the geographic boundaries of the zone. Only “Polygon” and “MultiPolygon”
             * geoJSON types are supported.
             *
             * Please note that one of `geometry` or `geofence_id` should be provided.
             */
            fun geometry(geometry: Geometry) = geometry(JsonField.of(geometry))

            /**
             * Sets [Builder.geometry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geometry] with a well-typed [Geometry] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geometry(geometry: JsonField<Geometry>) = apply { this.geometry = geometry }

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
             * Returns an immutable instance of [Zone].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Zone =
                Zone(
                    checkRequired("id", id),
                    geofenceId,
                    geometry,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Zone = apply {
            if (validated) {
                return@apply
            }

            id()
            geofenceId()
            geometry().ifPresent { it.validate() }
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
                (if (geofenceId.asKnown().isPresent) 1 else 0) +
                (geometry.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * It is a [geoJSON object](https://datatracker.ietf.org/doc/html/rfc7946#page-9) with
         * details of the geographic boundaries of the zone. Only “Polygon” and “MultiPolygon”
         * geoJSON types are supported.
         *
         * Please note that one of `geometry` or `geofence_id` should be provided.
         */
        class Geometry
        private constructor(
            private val coordinates: JsonField<List<List<Double>>>,
            private val description: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("coordinates")
                @ExcludeMissing
                coordinates: JsonField<List<List<Double>>> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(coordinates, description, type, mutableMapOf())

            /**
             * An array of coordinates in the \[longitude, latitude\] format, representing the zone
             * boundary.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun coordinates(): Optional<List<List<Double>>> = coordinates.getOptional("coordinates")

            /**
             * Provide a description to identify the zone
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Type of the geoJSON geometry. Should always be `Polygon` or `MultiPolygon`.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [coordinates].
             *
             * Unlike [coordinates], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("coordinates")
            @ExcludeMissing
            fun _coordinates(): JsonField<List<List<Double>>> = coordinates

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

                /** Returns a mutable builder for constructing an instance of [Geometry]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Geometry]. */
            class Builder internal constructor() {

                private var coordinates: JsonField<MutableList<List<Double>>>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(geometry: Geometry) = apply {
                    coordinates = geometry.coordinates.map { it.toMutableList() }
                    description = geometry.description
                    type = geometry.type
                    additionalProperties = geometry.additionalProperties.toMutableMap()
                }

                /**
                 * An array of coordinates in the \[longitude, latitude\] format, representing the
                 * zone boundary.
                 */
                fun coordinates(coordinates: List<List<Double>>) =
                    coordinates(JsonField.of(coordinates))

                /**
                 * Sets [Builder.coordinates] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.coordinates] with a well-typed
                 * `List<List<Double>>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun coordinates(coordinates: JsonField<List<List<Double>>>) = apply {
                    this.coordinates = coordinates.map { it.toMutableList() }
                }

                /**
                 * Adds a single [List<Double>] to [coordinates].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCoordinate(coordinate: List<Double>) = apply {
                    coordinates =
                        (coordinates ?: JsonField.of(mutableListOf())).also {
                            checkKnown("coordinates", it).add(coordinate)
                        }
                }

                /** Provide a description to identify the zone */
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

                /** Type of the geoJSON geometry. Should always be `Polygon` or `MultiPolygon`. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Geometry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Geometry =
                    Geometry(
                        (coordinates ?: JsonMissing.of()).map { it.toImmutable() },
                        description,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Geometry = apply {
                if (validated) {
                    return@apply
                }

                coordinates()
                description()
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
                (coordinates.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /** Type of the geoJSON geometry. Should always be `Polygon` or `MultiPolygon`. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val POLYGON = of("`Polygon`")

                    @JvmField val MULTI_POLYGON = of("`MultiPolygon`")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    POLYGON,
                    MULTI_POLYGON,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    POLYGON,
                    MULTI_POLYGON,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        POLYGON -> Value.POLYGON
                        MULTI_POLYGON -> Value.MULTI_POLYGON
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
                        POLYGON -> Known.POLYGON
                        MULTI_POLYGON -> Known.MULTI_POLYGON
                        else -> throw NextbillionSdkInvalidDataException("Unknown Type: $value")
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

                return /* spotless:off */ other is Geometry && coordinates == other.coordinates && description == other.description && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(coordinates, description, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Geometry{coordinates=$coordinates, description=$description, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Zone && id == other.id && geofenceId == other.geofenceId && geometry == other.geometry && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, geofenceId, geometry, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Zone{id=$id, geofenceId=$geofenceId, geometry=$geometry, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V2SubmitParams && key == other.key && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V2SubmitParams{key=$key, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
