// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.optimization.v2

import ai.nextbillion.core.Enum
import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.checkKnown
import ai.nextbillion.core.checkRequired
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

class Job
private constructor(
    private val id: JsonField<String>,
    private val locationIndex: JsonField<Long>,
    private val delivery: JsonField<List<Long>>,
    private val depotIds: JsonField<List<String>>,
    private val description: JsonField<String>,
    private val followLifoOrder: JsonField<Boolean>,
    private val incompatibleLoadTypes: JsonField<List<String>>,
    private val jointOrder: JsonField<Long>,
    private val loadTypes: JsonField<List<String>>,
    private val maxVisitLateness: JsonField<Long>,
    private val metadata: JsonValue,
    private val outsourcingCost: JsonField<Long>,
    private val pickup: JsonField<List<Long>>,
    private val priority: JsonField<Long>,
    private val revenue: JsonField<Long>,
    private val sequenceOrder: JsonField<Long>,
    private val service: JsonField<Long>,
    private val setup: JsonField<Long>,
    private val skills: JsonField<List<Long>>,
    private val timeWindows: JsonField<List<List<Long>>>,
    private val volume: JsonField<Volume>,
    private val zones: JsonField<List<Long>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("location_index")
        @ExcludeMissing
        locationIndex: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("delivery")
        @ExcludeMissing
        delivery: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("depot_ids")
        @ExcludeMissing
        depotIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("follow_lifo_order")
        @ExcludeMissing
        followLifoOrder: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("incompatible_load_types")
        @ExcludeMissing
        incompatibleLoadTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("joint_order") @ExcludeMissing jointOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("load_types")
        @ExcludeMissing
        loadTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("max_visit_lateness")
        @ExcludeMissing
        maxVisitLateness: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("outsourcing_cost")
        @ExcludeMissing
        outsourcingCost: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("pickup") @ExcludeMissing pickup: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("revenue") @ExcludeMissing revenue: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sequence_order")
        @ExcludeMissing
        sequenceOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("service") @ExcludeMissing service: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("setup") @ExcludeMissing setup: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("skills") @ExcludeMissing skills: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("time_windows")
        @ExcludeMissing
        timeWindows: JsonField<List<List<Long>>> = JsonMissing.of(),
        @JsonProperty("volume") @ExcludeMissing volume: JsonField<Volume> = JsonMissing.of(),
        @JsonProperty("zones") @ExcludeMissing zones: JsonField<List<Long>> = JsonMissing.of(),
    ) : this(
        id,
        locationIndex,
        delivery,
        depotIds,
        description,
        followLifoOrder,
        incompatibleLoadTypes,
        jointOrder,
        loadTypes,
        maxVisitLateness,
        metadata,
        outsourcingCost,
        pickup,
        priority,
        revenue,
        sequenceOrder,
        service,
        setup,
        skills,
        timeWindows,
        volume,
        zones,
        mutableMapOf(),
    )

    /**
     * Provide an unique ID for the job. The IDs are case-sensitive.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * An integer denoting the index (in the `location` array) of the location coordinates where the
     * job needs to be performed. The valid range of values is \[0, length of `location` array).
     *
     * Please note the `location_index` is mandatory when using the `jobs` object.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun locationIndex(): Long = locationIndex.getRequired("location_index")

    /**
     * In case the job involves a delivery step, use this attribute to describe delivery quantity.
     * This attribute supports multidimensional quantities, to support delivering quantities of
     * different units/dimensions. It is recommended to keep the dimensions of quantity for
     * pickup/delivery consistent when defining them in `jobs` and `vehicles` (in `capacity`
     * attribute).
     *
     * Please note that the quantity of delivery will be added to the assigned vehicle’s initial
     * load.
     *
     * In case depots are being added, the delivery configured here can be fulfilled by vehicles
     * starting from specific depots. Refer to `depot_ids` and `vehicles.start_depot_ids` to know
     * more.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun delivery(): Optional<List<Long>> = delivery.getOptional("delivery")

    /**
     * Specify the depots which can be used to fulfil this job. In case of a pickup job, the
     * assigned vehicle will deliver the goods to the depot specified here, at the end of its trip.
     * Conversely, in case of delivery jobs, the vehicle will load the goods from the depot
     * specified here, before starting the trip.
     *
     * **Note:**
     * - If multiple IDs are provided for this field then any of the given depots can be used to
     *   fulfil the job.
     * - If this field is not provided then the given job can be fulfilled by any vehicle (subject
     *   to other constraints configured in the input).
     * - If the job does not have any delivery or pick-up step configured then depots configuration
     *   will not have any impact on the given job.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun depotIds(): Optional<List<String>> = depotIds.getOptional("depot_ids")

    /**
     * Add a custom description for the job.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Specify whether the job route should follow LIFO (last in, first out). Use this parameter
     * when `pickup` or `delivery` jobs are involved and the loading or unloading sequence of cargo
     * is important. The default is `false`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun followLifoOrder(): Optional<Boolean> = followLifoOrder.getOptional("follow_lifo_order")

    /**
     * Use this parameter to specify the type of loads which are incompatible with the job’s load
     * type. Once this property is configured, the job can only be serviced by a vehicle which has
     * not serviced any other task with an incompatible `load_types` . Add multiple load types to
     * indicate all the types which are incompatible for this job. The incompatible load type
     * considerations are ignored for the first task of the route.
     *
     * For example, an input value of \[“groceries”, “food”\] means that current job’s load is
     * incompatible with both groceries and food type of loads. Consequently, the optimizer will not
     * assign this job to a vehicle which has served any task with `load_types` as either groceries
     * or food.
     *
     * Note:
     * - This parameter is effective only when a pickup / delivery is configured for the job.
     * - If the job is part of any `relations` then, configured `incompatible_load_types` might be
     *   ignored.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun incompatibleLoadTypes(): Optional<List<String>> =
        incompatibleLoadTypes.getOptional("incompatible_load_types")

    /**
     * Specify a joint order group ID that this job is associated with. Tasks having the same joint
     * order group ID are treated as a single unit: either all tasks in the group are assigned, or
     * none are. Users can add tasks of both `jobs` and `shipments` types to a single joint order
     * group by using the same unique ID. Please note that:
     * - Each job in a single joint order group will be fulfilled by a unique vehicle.
     * - Jobs belonging to a joint order group can be served in any sequence.
     * - Joint order settings will not be effective if \`solution\` or \`relations\` attributes are
     *   also provided in the input request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun jointOrder(): Optional<Long> = jointOrder.getOptional("joint_order")

    /**
     * Use this parameter to specify the type of loads for the given job. Once this property is
     * configured, the job can not be served by a vehicle which has serviced any task whose load is
     * incompatible with any of the`load_types` provided in this input. The load type considerations
     * are ignored for the first task of the route.
     *
     * For example, an input value of \[“groceries”, “food”\] means that job’s load characteristics
     * belong to either one or both types. Consequently, the optimizer will assign this job to a
     * vehicle which has served other tasks whose `incompatible_load_types` do not contain either
     * groceries or food.
     *
     * Note:
     * - This parameter is effective only when a pickup / delivery is configured for the job.
     * - If the job is part of any `relations` then, `load_types` might be ignored.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun loadTypes(): Optional<List<String>> = loadTypes.getOptional("load_types")

    /**
     * It determines the allowable delay, in seconds, to begin a job after its designated time
     * window has concluded. Please note that this parameter would override the
     * `constraint.max_visit_lateness` (global) if both are specified.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxVisitLateness(): Optional<Long> = maxVisitLateness.getOptional("max_visit_lateness")

    /**
     * Specify any custom data that should be attached along with job fulfilment details in the
     * `steps` attribute of the optimized solution. Users can leverage this property to provide
     * additional details/context when sharing information about the job with integrated systems
     * (TMS, Fleet Management, Driver dispatch etc).
     *
     * Please note that the `metadata` content must always be specified in a`key` : `value` pair
     * format, where the “key” is always a string.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * Specify the cost of keeping this job unassigned, namely, the cost of outsourcing the job.
     * When provided, the optimizer weighs the cost of assigning the job against the cost of keeping
     * it unassigned and chooses a solution with lower cost. In the solution, the `outsourcing_cost`
     * of unassigned jobs is added to the total cost of the solution.
     *
     * If the `outsourcing_cost` is not provided, which is to say that the job can not be
     * outsourced, then the optimizer tries to fulfill the job irrespective of the cost incurred,
     * subject to other constraints.
     *
     * Please note that `revenue` and `outsourcing_cost` can not be specified simultaneously for a
     * job. Also, the `outsourcing_cost` would override the priority settings of the job.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun outsourcingCost(): Optional<Long> = outsourcingCost.getOptional("outsourcing_cost")

    /**
     * In case the job involves a pickup step, use this attribute to describe pickup quantity. This
     * attribute supports multidimensional quantities, to support picking up quantities of different
     * units/dimensions. It is recommended to keep the dimensions of quantity for pickup/delivery
     * consistent when defining them in `jobs` and `vehicles` (in `capacity` attribute).
     *
     * Please note that the vehicle will continue to carry the picked-up quantity until its last
     * stop.
     *
     * In case depots are being added, the pickup configured here can be fulfilled by vehicles
     * ending at specific depots. Refer to `depot_ids` and `vehicles.end_depot_ids` to know more.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pickup(): Optional<List<Long>> = pickup.getOptional("pickup")

    /**
     * Specify the priority of this job. The valid values are in the range of \[0, 100\]. Default
     * value is 0.
     *
     * Please note that setting a priority will only decide whether this job will be assigned or
     * not, but has nothing to do with the sequence of job fulfilment.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun priority(): Optional<Long> = priority.getOptional("priority")

    /**
     * Specify the revenue earned by completing this job. The optimizer uses the `revenue` input to
     * identify the potential profit earned by fulfilling this job after taking into account the
     * costs incurred to do so. The`options.objective` and `vehicles.costs` input are taken into
     * account to identify the costs of fulfilling the job.
     *
     * In general, the optimizer will prefer fulfilling the tasks with higher profits over the tasks
     * with lower profits, should it need to reject some tasks in order to honor other constraints.
     * In case the profit from fulfilling a job is negative, it will remain unassigned whatsoever.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun revenue(): Optional<Long> = revenue.getOptional("revenue")

    /**
     * Use this parameter to prioritize completing a task relative to certain other tasks. A task
     * configured with a `sequence_order` of 2 will be done after the task with `sequence_order` of
     * 1, but before the task with `sequence_order` of 3. Valid range of values for this input is
     * \[0,100\].
     *
     * Please note that:
     * - Only the tasks within the same route are compared and ordered as per their
     *   `sequence_order`.
     * - Tasks without a `sequence_order` are not involved in the comparison.
     * - Following is the precedence of `sequence_order` when used along side some of the other
     *   constraints:
     *     - `relations` are prioritized over `sequence_order` comparisons.
     *     - `sequence_order` will override `order_grouping` configurations.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sequenceOrder(): Optional<Long> = sequenceOrder.getOptional("sequence_order")

    /**
     * Use this attribute to define the time duration, in seconds, needed to complete the job.
     * Default value is 0.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun service(): Optional<Long> = service.getOptional("service")

    /**
     * Specify the job set-up duration, in seconds. `setup` is the one-time effort needed apart from
     * working on the original task - for example, effort to record some information for compliance,
     * or effort to set-up the equipment, or perform any other action for completing all steps
     * required to fulfil the job.
     *
     * Please note that `setup` time is applied only once for a given task location. `setup` time,
     * unlike `service` time, is not repeated in case there are multiple tasks at the same location.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun setup(): Optional<Long> = setup.getOptional("setup")

    /**
     * Define the skills needed to complete the job. This attribute supports multidimensional skills
     * allowing users to add multiple skills.
     *
     * Read more about the behavior of this attribute in the
     * [Multi-Dimensional Parameters](#multi-dimensional-parameters) section.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun skills(): Optional<List<Long>> = skills.getOptional("skills")

    /**
     * Define time periods within which this job should be started. The time periods should be
     * expressed as a UNIX timestamp in seconds.
     *
     * Please note that the time periods should not overlap with each other and should always follow
     * the format of \[start_timestamp, end_timestamp\].
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun timeWindows(): Optional<List<List<Long>>> = timeWindows.getOptional("time_windows")

    /**
     * Specify the dimensions and alignment configurations for the cargo associated with the task.
     * These inputs will be used to arrange the items into the loading compartment of the vehicle to
     * utilize the three-dimensional space. If a job consists of several different items, each with
     * its own dimensions, please specify the final characteristics for the task: total height,
     * total length, total width.
     *
     * Please note that vehicles which contain the `volume` input, will only be considered for
     * arranging such items.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun volume(): Optional<Volume> = volume.getOptional("volume")

    /**
     * An array of integers specifying the IDs of the zone(s) that this job belongs to. The job can
     * be fulfilled by all vehicles which are allowed to complete tasks in the zone(s) assigned to
     * this job. Please note following points about job zones:
     * - If zone IDs are provided for any one of the jobs, then all other jobs should also be
     *   specified with zone IDs. Zone IDs provided here will override any zone geometries provided
     *   in the `zones` attribute and these IDs will be used for allocating appropriate vehicles.
     * - Jobs can be auto-allocated to zones if this parameter is not specified while the zone
     *   geometries (either `zones.geometry` or `zones.geofence_id`) are provided.
     * - Jobs not falling in any zones can be fulfilled by only those vehicles which are allowed to
     *   take up tasks outside zones as well. Refer to `vehicles` attribute for more information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun zones(): Optional<List<Long>> = zones.getOptional("zones")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [locationIndex].
     *
     * Unlike [locationIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("location_index")
    @ExcludeMissing
    fun _locationIndex(): JsonField<Long> = locationIndex

    /**
     * Returns the raw JSON value of [delivery].
     *
     * Unlike [delivery], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("delivery") @ExcludeMissing fun _delivery(): JsonField<List<Long>> = delivery

    /**
     * Returns the raw JSON value of [depotIds].
     *
     * Unlike [depotIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("depot_ids") @ExcludeMissing fun _depotIds(): JsonField<List<String>> = depotIds

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [followLifoOrder].
     *
     * Unlike [followLifoOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("follow_lifo_order")
    @ExcludeMissing
    fun _followLifoOrder(): JsonField<Boolean> = followLifoOrder

    /**
     * Returns the raw JSON value of [incompatibleLoadTypes].
     *
     * Unlike [incompatibleLoadTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("incompatible_load_types")
    @ExcludeMissing
    fun _incompatibleLoadTypes(): JsonField<List<String>> = incompatibleLoadTypes

    /**
     * Returns the raw JSON value of [jointOrder].
     *
     * Unlike [jointOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("joint_order") @ExcludeMissing fun _jointOrder(): JsonField<Long> = jointOrder

    /**
     * Returns the raw JSON value of [loadTypes].
     *
     * Unlike [loadTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("load_types")
    @ExcludeMissing
    fun _loadTypes(): JsonField<List<String>> = loadTypes

    /**
     * Returns the raw JSON value of [maxVisitLateness].
     *
     * Unlike [maxVisitLateness], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_visit_lateness")
    @ExcludeMissing
    fun _maxVisitLateness(): JsonField<Long> = maxVisitLateness

    /**
     * Returns the raw JSON value of [outsourcingCost].
     *
     * Unlike [outsourcingCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outsourcing_cost")
    @ExcludeMissing
    fun _outsourcingCost(): JsonField<Long> = outsourcingCost

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
     * Returns the raw JSON value of [revenue].
     *
     * Unlike [revenue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revenue") @ExcludeMissing fun _revenue(): JsonField<Long> = revenue

    /**
     * Returns the raw JSON value of [sequenceOrder].
     *
     * Unlike [sequenceOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sequence_order")
    @ExcludeMissing
    fun _sequenceOrder(): JsonField<Long> = sequenceOrder

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
     * Returns the raw JSON value of [skills].
     *
     * Unlike [skills], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("skills") @ExcludeMissing fun _skills(): JsonField<List<Long>> = skills

    /**
     * Returns the raw JSON value of [timeWindows].
     *
     * Unlike [timeWindows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("time_windows")
    @ExcludeMissing
    fun _timeWindows(): JsonField<List<List<Long>>> = timeWindows

    /**
     * Returns the raw JSON value of [volume].
     *
     * Unlike [volume], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("volume") @ExcludeMissing fun _volume(): JsonField<Volume> = volume

    /**
     * Returns the raw JSON value of [zones].
     *
     * Unlike [zones], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zones") @ExcludeMissing fun _zones(): JsonField<List<Long>> = zones

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
         * Returns a mutable builder for constructing an instance of [Job].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .locationIndex()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Job]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var locationIndex: JsonField<Long>? = null
        private var delivery: JsonField<MutableList<Long>>? = null
        private var depotIds: JsonField<MutableList<String>>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var followLifoOrder: JsonField<Boolean> = JsonMissing.of()
        private var incompatibleLoadTypes: JsonField<MutableList<String>>? = null
        private var jointOrder: JsonField<Long> = JsonMissing.of()
        private var loadTypes: JsonField<MutableList<String>>? = null
        private var maxVisitLateness: JsonField<Long> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var outsourcingCost: JsonField<Long> = JsonMissing.of()
        private var pickup: JsonField<MutableList<Long>>? = null
        private var priority: JsonField<Long> = JsonMissing.of()
        private var revenue: JsonField<Long> = JsonMissing.of()
        private var sequenceOrder: JsonField<Long> = JsonMissing.of()
        private var service: JsonField<Long> = JsonMissing.of()
        private var setup: JsonField<Long> = JsonMissing.of()
        private var skills: JsonField<MutableList<Long>>? = null
        private var timeWindows: JsonField<MutableList<List<Long>>>? = null
        private var volume: JsonField<Volume> = JsonMissing.of()
        private var zones: JsonField<MutableList<Long>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(job: Job) = apply {
            id = job.id
            locationIndex = job.locationIndex
            delivery = job.delivery.map { it.toMutableList() }
            depotIds = job.depotIds.map { it.toMutableList() }
            description = job.description
            followLifoOrder = job.followLifoOrder
            incompatibleLoadTypes = job.incompatibleLoadTypes.map { it.toMutableList() }
            jointOrder = job.jointOrder
            loadTypes = job.loadTypes.map { it.toMutableList() }
            maxVisitLateness = job.maxVisitLateness
            metadata = job.metadata
            outsourcingCost = job.outsourcingCost
            pickup = job.pickup.map { it.toMutableList() }
            priority = job.priority
            revenue = job.revenue
            sequenceOrder = job.sequenceOrder
            service = job.service
            setup = job.setup
            skills = job.skills.map { it.toMutableList() }
            timeWindows = job.timeWindows.map { it.toMutableList() }
            volume = job.volume
            zones = job.zones.map { it.toMutableList() }
            additionalProperties = job.additionalProperties.toMutableMap()
        }

        /** Provide an unique ID for the job. The IDs are case-sensitive. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * An integer denoting the index (in the `location` array) of the location coordinates where
         * the job needs to be performed. The valid range of values is \[0, length of `location`
         * array).
         *
         * Please note the `location_index` is mandatory when using the `jobs` object.
         */
        fun locationIndex(locationIndex: Long) = locationIndex(JsonField.of(locationIndex))

        /**
         * Sets [Builder.locationIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locationIndex] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun locationIndex(locationIndex: JsonField<Long>) = apply {
            this.locationIndex = locationIndex
        }

        /**
         * In case the job involves a delivery step, use this attribute to describe delivery
         * quantity. This attribute supports multidimensional quantities, to support delivering
         * quantities of different units/dimensions. It is recommended to keep the dimensions of
         * quantity for pickup/delivery consistent when defining them in `jobs` and `vehicles` (in
         * `capacity` attribute).
         *
         * Please note that the quantity of delivery will be added to the assigned vehicle’s initial
         * load.
         *
         * In case depots are being added, the delivery configured here can be fulfilled by vehicles
         * starting from specific depots. Refer to `depot_ids` and `vehicles.start_depot_ids` to
         * know more.
         */
        fun delivery(delivery: List<Long>) = delivery(JsonField.of(delivery))

        /**
         * Sets [Builder.delivery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.delivery] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /**
         * Specify the depots which can be used to fulfil this job. In case of a pickup job, the
         * assigned vehicle will deliver the goods to the depot specified here, at the end of its
         * trip. Conversely, in case of delivery jobs, the vehicle will load the goods from the
         * depot specified here, before starting the trip.
         *
         * **Note:**
         * - If multiple IDs are provided for this field then any of the given depots can be used to
         *   fulfil the job.
         * - If this field is not provided then the given job can be fulfilled by any vehicle
         *   (subject to other constraints configured in the input).
         * - If the job does not have any delivery or pick-up step configured then depots
         *   configuration will not have any impact on the given job.
         */
        fun depotIds(depotIds: List<String>) = depotIds(JsonField.of(depotIds))

        /**
         * Sets [Builder.depotIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depotIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun depotIds(depotIds: JsonField<List<String>>) = apply {
            this.depotIds = depotIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [depotIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDepotId(depotId: String) = apply {
            depotIds =
                (depotIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("depotIds", it).add(depotId)
                }
        }

        /** Add a custom description for the job. */
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
         * Specify whether the job route should follow LIFO (last in, first out). Use this parameter
         * when `pickup` or `delivery` jobs are involved and the loading or unloading sequence of
         * cargo is important. The default is `false`.
         */
        fun followLifoOrder(followLifoOrder: Boolean) =
            followLifoOrder(JsonField.of(followLifoOrder))

        /**
         * Sets [Builder.followLifoOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.followLifoOrder] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun followLifoOrder(followLifoOrder: JsonField<Boolean>) = apply {
            this.followLifoOrder = followLifoOrder
        }

        /**
         * Use this parameter to specify the type of loads which are incompatible with the job’s
         * load type. Once this property is configured, the job can only be serviced by a vehicle
         * which has not serviced any other task with an incompatible `load_types` . Add multiple
         * load types to indicate all the types which are incompatible for this job. The
         * incompatible load type considerations are ignored for the first task of the route.
         *
         * For example, an input value of \[“groceries”, “food”\] means that current job’s load is
         * incompatible with both groceries and food type of loads. Consequently, the optimizer will
         * not assign this job to a vehicle which has served any task with `load_types` as either
         * groceries or food.
         *
         * Note:
         * - This parameter is effective only when a pickup / delivery is configured for the job.
         * - If the job is part of any `relations` then, configured `incompatible_load_types` might
         *   be ignored.
         */
        fun incompatibleLoadTypes(incompatibleLoadTypes: List<String>) =
            incompatibleLoadTypes(JsonField.of(incompatibleLoadTypes))

        /**
         * Sets [Builder.incompatibleLoadTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.incompatibleLoadTypes] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun incompatibleLoadTypes(incompatibleLoadTypes: JsonField<List<String>>) = apply {
            this.incompatibleLoadTypes = incompatibleLoadTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [incompatibleLoadTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIncompatibleLoadType(incompatibleLoadType: String) = apply {
            incompatibleLoadTypes =
                (incompatibleLoadTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("incompatibleLoadTypes", it).add(incompatibleLoadType)
                }
        }

        /**
         * Specify a joint order group ID that this job is associated with. Tasks having the same
         * joint order group ID are treated as a single unit: either all tasks in the group are
         * assigned, or none are. Users can add tasks of both `jobs` and `shipments` types to a
         * single joint order group by using the same unique ID. Please note that:
         * - Each job in a single joint order group will be fulfilled by a unique vehicle.
         * - Jobs belonging to a joint order group can be served in any sequence.
         * - Joint order settings will not be effective if \`solution\` or \`relations\` attributes
         *   are also provided in the input request.
         */
        fun jointOrder(jointOrder: Long) = jointOrder(JsonField.of(jointOrder))

        /**
         * Sets [Builder.jointOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jointOrder] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jointOrder(jointOrder: JsonField<Long>) = apply { this.jointOrder = jointOrder }

        /**
         * Use this parameter to specify the type of loads for the given job. Once this property is
         * configured, the job can not be served by a vehicle which has serviced any task whose load
         * is incompatible with any of the`load_types` provided in this input. The load type
         * considerations are ignored for the first task of the route.
         *
         * For example, an input value of \[“groceries”, “food”\] means that job’s load
         * characteristics belong to either one or both types. Consequently, the optimizer will
         * assign this job to a vehicle which has served other tasks whose `incompatible_load_types`
         * do not contain either groceries or food.
         *
         * Note:
         * - This parameter is effective only when a pickup / delivery is configured for the job.
         * - If the job is part of any `relations` then, `load_types` might be ignored.
         */
        fun loadTypes(loadTypes: List<String>) = loadTypes(JsonField.of(loadTypes))

        /**
         * Sets [Builder.loadTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loadTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun loadTypes(loadTypes: JsonField<List<String>>) = apply {
            this.loadTypes = loadTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [loadTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLoadType(loadType: String) = apply {
            loadTypes =
                (loadTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("loadTypes", it).add(loadType)
                }
        }

        /**
         * It determines the allowable delay, in seconds, to begin a job after its designated time
         * window has concluded. Please note that this parameter would override the
         * `constraint.max_visit_lateness` (global) if both are specified.
         */
        fun maxVisitLateness(maxVisitLateness: Long) =
            maxVisitLateness(JsonField.of(maxVisitLateness))

        /**
         * Sets [Builder.maxVisitLateness] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxVisitLateness] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxVisitLateness(maxVisitLateness: JsonField<Long>) = apply {
            this.maxVisitLateness = maxVisitLateness
        }

        /**
         * Specify any custom data that should be attached along with job fulfilment details in the
         * `steps` attribute of the optimized solution. Users can leverage this property to provide
         * additional details/context when sharing information about the job with integrated systems
         * (TMS, Fleet Management, Driver dispatch etc).
         *
         * Please note that the `metadata` content must always be specified in a`key` : `value` pair
         * format, where the “key” is always a string.
         */
        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        /**
         * Specify the cost of keeping this job unassigned, namely, the cost of outsourcing the job.
         * When provided, the optimizer weighs the cost of assigning the job against the cost of
         * keeping it unassigned and chooses a solution with lower cost. In the solution, the
         * `outsourcing_cost` of unassigned jobs is added to the total cost of the solution.
         *
         * If the `outsourcing_cost` is not provided, which is to say that the job can not be
         * outsourced, then the optimizer tries to fulfill the job irrespective of the cost
         * incurred, subject to other constraints.
         *
         * Please note that `revenue` and `outsourcing_cost` can not be specified simultaneously for
         * a job. Also, the `outsourcing_cost` would override the priority settings of the job.
         */
        fun outsourcingCost(outsourcingCost: Long) = outsourcingCost(JsonField.of(outsourcingCost))

        /**
         * Sets [Builder.outsourcingCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outsourcingCost] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outsourcingCost(outsourcingCost: JsonField<Long>) = apply {
            this.outsourcingCost = outsourcingCost
        }

        /**
         * In case the job involves a pickup step, use this attribute to describe pickup quantity.
         * This attribute supports multidimensional quantities, to support picking up quantities of
         * different units/dimensions. It is recommended to keep the dimensions of quantity for
         * pickup/delivery consistent when defining them in `jobs` and `vehicles` (in `capacity`
         * attribute).
         *
         * Please note that the vehicle will continue to carry the picked-up quantity until its last
         * stop.
         *
         * In case depots are being added, the pickup configured here can be fulfilled by vehicles
         * ending at specific depots. Refer to `depot_ids` and `vehicles.end_depot_ids` to know
         * more.
         */
        fun pickup(pickup: List<Long>) = pickup(JsonField.of(pickup))

        /**
         * Sets [Builder.pickup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pickup] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /**
         * Specify the priority of this job. The valid values are in the range of \[0, 100\].
         * Default value is 0.
         *
         * Please note that setting a priority will only decide whether this job will be assigned or
         * not, but has nothing to do with the sequence of job fulfilment.
         */
        fun priority(priority: Long) = priority(JsonField.of(priority))

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priority(priority: JsonField<Long>) = apply { this.priority = priority }

        /**
         * Specify the revenue earned by completing this job. The optimizer uses the `revenue` input
         * to identify the potential profit earned by fulfilling this job after taking into account
         * the costs incurred to do so. The`options.objective` and `vehicles.costs` input are taken
         * into account to identify the costs of fulfilling the job.
         *
         * In general, the optimizer will prefer fulfilling the tasks with higher profits over the
         * tasks with lower profits, should it need to reject some tasks in order to honor other
         * constraints. In case the profit from fulfilling a job is negative, it will remain
         * unassigned whatsoever.
         */
        fun revenue(revenue: Long) = revenue(JsonField.of(revenue))

        /**
         * Sets [Builder.revenue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revenue] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun revenue(revenue: JsonField<Long>) = apply { this.revenue = revenue }

        /**
         * Use this parameter to prioritize completing a task relative to certain other tasks. A
         * task configured with a `sequence_order` of 2 will be done after the task with
         * `sequence_order` of 1, but before the task with `sequence_order` of 3. Valid range of
         * values for this input is \[0,100\].
         *
         * Please note that:
         * - Only the tasks within the same route are compared and ordered as per their
         *   `sequence_order`.
         * - Tasks without a `sequence_order` are not involved in the comparison.
         * - Following is the precedence of `sequence_order` when used along side some of the other
         *   constraints:
         *     - `relations` are prioritized over `sequence_order` comparisons.
         *     - `sequence_order` will override `order_grouping` configurations.
         */
        fun sequenceOrder(sequenceOrder: Long) = sequenceOrder(JsonField.of(sequenceOrder))

        /**
         * Sets [Builder.sequenceOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sequenceOrder] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sequenceOrder(sequenceOrder: JsonField<Long>) = apply {
            this.sequenceOrder = sequenceOrder
        }

        /**
         * Use this attribute to define the time duration, in seconds, needed to complete the job.
         * Default value is 0.
         */
        fun service(service: Long) = service(JsonField.of(service))

        /**
         * Sets [Builder.service] to an arbitrary JSON value.
         *
         * You should usually call [Builder.service] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun service(service: JsonField<Long>) = apply { this.service = service }

        /**
         * Specify the job set-up duration, in seconds. `setup` is the one-time effort needed apart
         * from working on the original task - for example, effort to record some information for
         * compliance, or effort to set-up the equipment, or perform any other action for completing
         * all steps required to fulfil the job.
         *
         * Please note that `setup` time is applied only once for a given task location. `setup`
         * time, unlike `service` time, is not repeated in case there are multiple tasks at the same
         * location.
         */
        fun setup(setup: Long) = setup(JsonField.of(setup))

        /**
         * Sets [Builder.setup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.setup] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun setup(setup: JsonField<Long>) = apply { this.setup = setup }

        /**
         * Define the skills needed to complete the job. This attribute supports multidimensional
         * skills allowing users to add multiple skills.
         *
         * Read more about the behavior of this attribute in the
         * [Multi-Dimensional Parameters](#multi-dimensional-parameters) section.
         */
        fun skills(skills: List<Long>) = skills(JsonField.of(skills))

        /**
         * Sets [Builder.skills] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skills] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun skills(skills: JsonField<List<Long>>) = apply {
            this.skills = skills.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [skills].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSkill(skill: Long) = apply {
            skills =
                (skills ?: JsonField.of(mutableListOf())).also {
                    checkKnown("skills", it).add(skill)
                }
        }

        /**
         * Define time periods within which this job should be started. The time periods should be
         * expressed as a UNIX timestamp in seconds.
         *
         * Please note that the time periods should not overlap with each other and should always
         * follow the format of \[start_timestamp, end_timestamp\].
         */
        fun timeWindows(timeWindows: List<List<Long>>) = timeWindows(JsonField.of(timeWindows))

        /**
         * Sets [Builder.timeWindows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeWindows] with a well-typed `List<List<Long>>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /**
         * Specify the dimensions and alignment configurations for the cargo associated with the
         * task. These inputs will be used to arrange the items into the loading compartment of the
         * vehicle to utilize the three-dimensional space. If a job consists of several different
         * items, each with its own dimensions, please specify the final characteristics for the
         * task: total height, total length, total width.
         *
         * Please note that vehicles which contain the `volume` input, will only be considered for
         * arranging such items.
         */
        fun volume(volume: Volume) = volume(JsonField.of(volume))

        /**
         * Sets [Builder.volume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.volume] with a well-typed [Volume] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun volume(volume: JsonField<Volume>) = apply { this.volume = volume }

        /**
         * An array of integers specifying the IDs of the zone(s) that this job belongs to. The job
         * can be fulfilled by all vehicles which are allowed to complete tasks in the zone(s)
         * assigned to this job. Please note following points about job zones:
         * - If zone IDs are provided for any one of the jobs, then all other jobs should also be
         *   specified with zone IDs. Zone IDs provided here will override any zone geometries
         *   provided in the `zones` attribute and these IDs will be used for allocating appropriate
         *   vehicles.
         * - Jobs can be auto-allocated to zones if this parameter is not specified while the zone
         *   geometries (either `zones.geometry` or `zones.geofence_id`) are provided.
         * - Jobs not falling in any zones can be fulfilled by only those vehicles which are allowed
         *   to take up tasks outside zones as well. Refer to `vehicles` attribute for more
         *   information.
         */
        fun zones(zones: List<Long>) = zones(JsonField.of(zones))

        /**
         * Sets [Builder.zones] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zones] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun zones(zones: JsonField<List<Long>>) = apply {
            this.zones = zones.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [zones].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addZone(zone: Long) = apply {
            zones =
                (zones ?: JsonField.of(mutableListOf())).also { checkKnown("zones", it).add(zone) }
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
         * Returns an immutable instance of [Job].
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
        fun build(): Job =
            Job(
                checkRequired("id", id),
                checkRequired("locationIndex", locationIndex),
                (delivery ?: JsonMissing.of()).map { it.toImmutable() },
                (depotIds ?: JsonMissing.of()).map { it.toImmutable() },
                description,
                followLifoOrder,
                (incompatibleLoadTypes ?: JsonMissing.of()).map { it.toImmutable() },
                jointOrder,
                (loadTypes ?: JsonMissing.of()).map { it.toImmutable() },
                maxVisitLateness,
                metadata,
                outsourcingCost,
                (pickup ?: JsonMissing.of()).map { it.toImmutable() },
                priority,
                revenue,
                sequenceOrder,
                service,
                setup,
                (skills ?: JsonMissing.of()).map { it.toImmutable() },
                (timeWindows ?: JsonMissing.of()).map { it.toImmutable() },
                volume,
                (zones ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Job = apply {
        if (validated) {
            return@apply
        }

        id()
        locationIndex()
        delivery()
        depotIds()
        description()
        followLifoOrder()
        incompatibleLoadTypes()
        jointOrder()
        loadTypes()
        maxVisitLateness()
        outsourcingCost()
        pickup()
        priority()
        revenue()
        sequenceOrder()
        service()
        setup()
        skills()
        timeWindows()
        volume().ifPresent { it.validate() }
        zones()
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
            (if (locationIndex.asKnown().isPresent) 1 else 0) +
            (delivery.asKnown().getOrNull()?.size ?: 0) +
            (depotIds.asKnown().getOrNull()?.size ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (followLifoOrder.asKnown().isPresent) 1 else 0) +
            (incompatibleLoadTypes.asKnown().getOrNull()?.size ?: 0) +
            (if (jointOrder.asKnown().isPresent) 1 else 0) +
            (loadTypes.asKnown().getOrNull()?.size ?: 0) +
            (if (maxVisitLateness.asKnown().isPresent) 1 else 0) +
            (if (outsourcingCost.asKnown().isPresent) 1 else 0) +
            (pickup.asKnown().getOrNull()?.size ?: 0) +
            (if (priority.asKnown().isPresent) 1 else 0) +
            (if (revenue.asKnown().isPresent) 1 else 0) +
            (if (sequenceOrder.asKnown().isPresent) 1 else 0) +
            (if (service.asKnown().isPresent) 1 else 0) +
            (if (setup.asKnown().isPresent) 1 else 0) +
            (skills.asKnown().getOrNull()?.size ?: 0) +
            (timeWindows.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
            (volume.asKnown().getOrNull()?.validity() ?: 0) +
            (zones.asKnown().getOrNull()?.size ?: 0)

    /**
     * Specify the dimensions and alignment configurations for the cargo associated with the task.
     * These inputs will be used to arrange the items into the loading compartment of the vehicle to
     * utilize the three-dimensional space. If a job consists of several different items, each with
     * its own dimensions, please specify the final characteristics for the task: total height,
     * total length, total width.
     *
     * Please note that vehicles which contain the `volume` input, will only be considered for
     * arranging such items.
     */
    class Volume
    private constructor(
        private val alignment: JsonField<Alignment>,
        private val depth: JsonField<Double>,
        private val height: JsonField<Double>,
        private val width: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("alignment")
            @ExcludeMissing
            alignment: JsonField<Alignment> = JsonMissing.of(),
            @JsonProperty("depth") @ExcludeMissing depth: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("height") @ExcludeMissing height: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("width") @ExcludeMissing width: JsonField<Double> = JsonMissing.of(),
        ) : this(alignment, depth, height, width, mutableMapOf())

        /**
         * Refers to the orientation of the cargo in the loading compartment. It supports the
         * following values:
         * - **" "** : A blank space to indicate that the dimension check for the cargo should be
         *   skipped. This is also the default value.
         * - **strict :** In this orientation, the cargo must fit within the vehicle’s dimensions
         *   exactly as is—no rotation is allowed. All dimensions of the cargo must be less than or
         *   equal to the corresponding dimensions of the vehicle. If any dimension exceeds that of
         *   the vehicle, the cargo cannot be loaded.
         * - **parallel :** With parallel orientation, the cargo can be rotated around any one of
         *   the axes to help it fit into the loading compartment. For example, if the cargo is
         *   wider than the vehicle, it can still be loaded by rotating it around the vertical axis
         *   (so the width aligns with the vehicle’s depth) or the horizontal axis (so the width
         *   aligns with the vehicle’s height). Using this orientation, even a cargo whose one
         *   dimension is larger than the corresponding dimension of the vehicle but smaller than
         *   other dimensions, can also be loaded.
         * - **fixed_bottom :** In this orientation, the cargo can only be rotated around the
         *   vertical axis, meaning its base stays fixed and it cannot be tilted or turned over. The
         *   height of the cargo remains aligned with the vehicle’s height and cannot be adjusted.
         *   As a result, if the cargo’s height exceeds the vehicle’s available height, it cannot be
         *   loaded into the compartment.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun alignment(): Optional<Alignment> = alignment.getOptional("alignment")

        /**
         * Cargo length, in meters.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun depth(): Optional<Double> = depth.getOptional("depth")

        /**
         * Cargo height, in meters.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun height(): Optional<Double> = height.getOptional("height")

        /**
         * Cargo width, in meters.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun width(): Optional<Double> = width.getOptional("width")

        /**
         * Returns the raw JSON value of [alignment].
         *
         * Unlike [alignment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alignment")
        @ExcludeMissing
        fun _alignment(): JsonField<Alignment> = alignment

        /**
         * Returns the raw JSON value of [depth].
         *
         * Unlike [depth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("depth") @ExcludeMissing fun _depth(): JsonField<Double> = depth

        /**
         * Returns the raw JSON value of [height].
         *
         * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Double> = height

        /**
         * Returns the raw JSON value of [width].
         *
         * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Double> = width

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

            /** Returns a mutable builder for constructing an instance of [Volume]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Volume]. */
        class Builder internal constructor() {

            private var alignment: JsonField<Alignment> = JsonMissing.of()
            private var depth: JsonField<Double> = JsonMissing.of()
            private var height: JsonField<Double> = JsonMissing.of()
            private var width: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(volume: Volume) = apply {
                alignment = volume.alignment
                depth = volume.depth
                height = volume.height
                width = volume.width
                additionalProperties = volume.additionalProperties.toMutableMap()
            }

            /**
             * Refers to the orientation of the cargo in the loading compartment. It supports the
             * following values:
             * - **" "** : A blank space to indicate that the dimension check for the cargo should
             *   be skipped. This is also the default value.
             * - **strict :** In this orientation, the cargo must fit within the vehicle’s
             *   dimensions exactly as is—no rotation is allowed. All dimensions of the cargo must
             *   be less than or equal to the corresponding dimensions of the vehicle. If any
             *   dimension exceeds that of the vehicle, the cargo cannot be loaded.
             * - **parallel :** With parallel orientation, the cargo can be rotated around any one
             *   of the axes to help it fit into the loading compartment. For example, if the cargo
             *   is wider than the vehicle, it can still be loaded by rotating it around the
             *   vertical axis (so the width aligns with the vehicle’s depth) or the horizontal axis
             *   (so the width aligns with the vehicle’s height). Using this orientation, even a
             *   cargo whose one dimension is larger than the corresponding dimension of the vehicle
             *   but smaller than other dimensions, can also be loaded.
             * - **fixed_bottom :** In this orientation, the cargo can only be rotated around the
             *   vertical axis, meaning its base stays fixed and it cannot be tilted or turned over.
             *   The height of the cargo remains aligned with the vehicle’s height and cannot be
             *   adjusted. As a result, if the cargo’s height exceeds the vehicle’s available
             *   height, it cannot be loaded into the compartment.
             */
            fun alignment(alignment: Alignment) = alignment(JsonField.of(alignment))

            /**
             * Sets [Builder.alignment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alignment] with a well-typed [Alignment] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alignment(alignment: JsonField<Alignment>) = apply { this.alignment = alignment }

            /** Cargo length, in meters. */
            fun depth(depth: Double) = depth(JsonField.of(depth))

            /**
             * Sets [Builder.depth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.depth] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun depth(depth: JsonField<Double>) = apply { this.depth = depth }

            /** Cargo height, in meters. */
            fun height(height: Double) = height(JsonField.of(height))

            /**
             * Sets [Builder.height] to an arbitrary JSON value.
             *
             * You should usually call [Builder.height] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun height(height: JsonField<Double>) = apply { this.height = height }

            /** Cargo width, in meters. */
            fun width(width: Double) = width(JsonField.of(width))

            /**
             * Sets [Builder.width] to an arbitrary JSON value.
             *
             * You should usually call [Builder.width] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun width(width: JsonField<Double>) = apply { this.width = width }

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
             * Returns an immutable instance of [Volume].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Volume =
                Volume(alignment, depth, height, width, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Volume = apply {
            if (validated) {
                return@apply
            }

            alignment().ifPresent { it.validate() }
            depth()
            height()
            width()
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
            (alignment.asKnown().getOrNull()?.validity() ?: 0) +
                (if (depth.asKnown().isPresent) 1 else 0) +
                (if (height.asKnown().isPresent) 1 else 0) +
                (if (width.asKnown().isPresent) 1 else 0)

        /**
         * Refers to the orientation of the cargo in the loading compartment. It supports the
         * following values:
         * - **" "** : A blank space to indicate that the dimension check for the cargo should be
         *   skipped. This is also the default value.
         * - **strict :** In this orientation, the cargo must fit within the vehicle’s dimensions
         *   exactly as is—no rotation is allowed. All dimensions of the cargo must be less than or
         *   equal to the corresponding dimensions of the vehicle. If any dimension exceeds that of
         *   the vehicle, the cargo cannot be loaded.
         * - **parallel :** With parallel orientation, the cargo can be rotated around any one of
         *   the axes to help it fit into the loading compartment. For example, if the cargo is
         *   wider than the vehicle, it can still be loaded by rotating it around the vertical axis
         *   (so the width aligns with the vehicle’s depth) or the horizontal axis (so the width
         *   aligns with the vehicle’s height). Using this orientation, even a cargo whose one
         *   dimension is larger than the corresponding dimension of the vehicle but smaller than
         *   other dimensions, can also be loaded.
         * - **fixed_bottom :** In this orientation, the cargo can only be rotated around the
         *   vertical axis, meaning its base stays fixed and it cannot be tilted or turned over. The
         *   height of the cargo remains aligned with the vehicle’s height and cannot be adjusted.
         *   As a result, if the cargo’s height exceeds the vehicle’s available height, it cannot be
         *   loaded into the compartment.
         */
        class Alignment @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val STRICT = of("`strict`")

                @JvmField val PARALLEL = of("`parallel`")

                @JvmField val FIXED_BOTTOM = of("`fixed_bottom`")

                @JvmField val Unknown0 = of("`\" \"`")

                @JvmStatic fun of(value: String) = Alignment(JsonField.of(value))
            }

            /** An enum containing [Alignment]'s known values. */
            enum class Known {
                STRICT,
                PARALLEL,
                FIXED_BOTTOM,
                Unknown0,
            }

            /**
             * An enum containing [Alignment]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Alignment] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STRICT,
                PARALLEL,
                FIXED_BOTTOM,
                Unknown0,
                /**
                 * An enum member indicating that [Alignment] was instantiated with an unknown
                 * value.
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
                    STRICT -> Value.STRICT
                    PARALLEL -> Value.PARALLEL
                    FIXED_BOTTOM -> Value.FIXED_BOTTOM
                    Unknown0 -> Value.Unknown0
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
                    STRICT -> Known.STRICT
                    PARALLEL -> Known.PARALLEL
                    FIXED_BOTTOM -> Known.FIXED_BOTTOM
                    Unknown0 -> Known.Unknown0
                    else -> throw NextbillionSdkInvalidDataException("Unknown Alignment: $value")
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

            fun validate(): Alignment = apply {
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

                return /* spotless:off */ other is Alignment && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Volume && alignment == other.alignment && depth == other.depth && height == other.height && width == other.width && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(alignment, depth, height, width, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Volume{alignment=$alignment, depth=$depth, height=$height, width=$width, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Job && id == other.id && locationIndex == other.locationIndex && delivery == other.delivery && depotIds == other.depotIds && description == other.description && followLifoOrder == other.followLifoOrder && incompatibleLoadTypes == other.incompatibleLoadTypes && jointOrder == other.jointOrder && loadTypes == other.loadTypes && maxVisitLateness == other.maxVisitLateness && metadata == other.metadata && outsourcingCost == other.outsourcingCost && pickup == other.pickup && priority == other.priority && revenue == other.revenue && sequenceOrder == other.sequenceOrder && service == other.service && setup == other.setup && skills == other.skills && timeWindows == other.timeWindows && volume == other.volume && zones == other.zones && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, locationIndex, delivery, depotIds, description, followLifoOrder, incompatibleLoadTypes, jointOrder, loadTypes, maxVisitLateness, metadata, outsourcingCost, pickup, priority, revenue, sequenceOrder, service, setup, skills, timeWindows, volume, zones, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Job{id=$id, locationIndex=$locationIndex, delivery=$delivery, depotIds=$depotIds, description=$description, followLifoOrder=$followLifoOrder, incompatibleLoadTypes=$incompatibleLoadTypes, jointOrder=$jointOrder, loadTypes=$loadTypes, maxVisitLateness=$maxVisitLateness, metadata=$metadata, outsourcingCost=$outsourcingCost, pickup=$pickup, priority=$priority, revenue=$revenue, sequenceOrder=$sequenceOrder, service=$service, setup=$setup, skills=$skills, timeWindows=$timeWindows, volume=$volume, zones=$zones, additionalProperties=$additionalProperties}"
}
