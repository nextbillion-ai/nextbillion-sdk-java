// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.optimization.v2

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.nextbillion_sdk.api.core.Enum
import com.nextbillion_sdk.api.core.ExcludeMissing
import com.nextbillion_sdk.api.core.JsonField
import com.nextbillion_sdk.api.core.JsonMissing
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.checkKnown
import com.nextbillion_sdk.api.core.checkRequired
import com.nextbillion_sdk.api.core.toImmutable
import com.nextbillion_sdk.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Shipment
private constructor(
    private val delivery: JsonField<Delivery>,
    private val pickup: JsonField<Pickup>,
    private val amount: JsonField<List<Long>>,
    private val followLifoOrder: JsonField<Boolean>,
    private val incompatibleLoadTypes: JsonField<List<String>>,
    private val jointOrder: JsonField<Long>,
    private val loadTypes: JsonField<List<String>>,
    private val maxTimeInVehicle: JsonField<Long>,
    private val outsourcingCost: JsonField<Long>,
    private val priority: JsonField<Long>,
    private val revenue: JsonField<Long>,
    private val skills: JsonField<List<Long>>,
    private val volume: JsonField<Volume>,
    private val zones: JsonField<List<Long>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("delivery") @ExcludeMissing delivery: JsonField<Delivery> = JsonMissing.of(),
        @JsonProperty("pickup") @ExcludeMissing pickup: JsonField<Pickup> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<List<Long>> = JsonMissing.of(),
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
        @JsonProperty("max_time_in_vehicle")
        @ExcludeMissing
        maxTimeInVehicle: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("outsourcing_cost")
        @ExcludeMissing
        outsourcingCost: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("revenue") @ExcludeMissing revenue: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("skills") @ExcludeMissing skills: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("volume") @ExcludeMissing volume: JsonField<Volume> = JsonMissing.of(),
        @JsonProperty("zones") @ExcludeMissing zones: JsonField<List<Long>> = JsonMissing.of(),
    ) : this(
        delivery,
        pickup,
        amount,
        followLifoOrder,
        incompatibleLoadTypes,
        jointOrder,
        loadTypes,
        maxTimeInVehicle,
        outsourcingCost,
        priority,
        revenue,
        skills,
        volume,
        zones,
        mutableMapOf(),
    )

    /**
     * Specify the details of the delivery step of the shipment.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun delivery(): Delivery = delivery.getRequired("delivery")

    /**
     * Specify the details of the pickup step of the shipment.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pickup(): Pickup = pickup.getRequired("pickup")

    /**
     * This parameter defines the quantity that needs to be shipped. This attribute supports
     * multidimensional quantities, to support shipment of quantities of different units/dimensions.
     * It is recommended to keep the dimensions of `amount` in `shipments` and that of `capacity` in
     * `vehicles` consistent.
     *
     * Please note that the `amount` will be added to the assigned vehicle’s initial load.
     *
     * Read more about the behavior of this attribute in the
     * [Multi-Dimensional Parameters](#multi-dimensional-parameters) section.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amount(): Optional<List<Long>> = amount.getOptional("amount")

    /**
     * Specify whether the shipment route should follow LIFO (last in, first out). Use this
     * parameter when the loading or unloading sequence of cargo is important. The default value is
     * \`false\`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun followLifoOrder(): Optional<Boolean> = followLifoOrder.getOptional("follow_lifo_order")

    /**
     * Use this parameter to specify the type of loads which are incompatible with the shipment’s
     * load type. Once this property is configured, the shipment can only be serviced by a vehicle
     * which has not serviced any other task with an incompatible `load_types` . Add multiple load
     * types to indicate all the types which are incompatible for this shipment. The incompatible
     * load type considerations are ignored for the first task of the route.
     *
     * For example, an input value of \[“groceries”, “food”\] means that shipment’s load is
     * incompatible with both groceries and food type of loads. Consequently, the optimizer will not
     * assign this shipment to a vehicle which has served any task with `load_types` as either
     * groceries or food.
     *
     * Please note that if the shipment is part of any `relations` then, configured
     * `incompatible_load_types` might be ignored.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun incompatibleLoadTypes(): Optional<List<String>> =
        incompatibleLoadTypes.getOptional("incompatible_load_types")

    /**
     * Specify a joint order group ID that this shipment is associated with. Tasks having the same
     * joint order group ID are treated as a single unit: either all tasks in the group are
     * assigned, or none are. Users can add tasks of both `jobs` and `shipments` types to a single
     * joint order group by using the same unique ID. Please note that:
     * - Each shipment in a single joint order group will be fulfilled by a unique vehicle.
     * - Shipments belonging to a joint order group can be served in any sequence while maintaining
     *   the pickup -> delivery sequence for an individual shipment.
     * - Joint order settings will not be effective if \`solution\` or \`relations\` attributes are
     *   also provided in the input request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun jointOrder(): Optional<Long> = jointOrder.getOptional("joint_order")

    /**
     * Use this parameter to specify the type of loads for the given shipment. Once this property is
     * configured, the shipment can not be served by a vehicle which has serviced any task whose
     * load is incompatible with any of the`load_types` provided in this input. The load type
     * considerations are ignored for the first task of the route.
     *
     * For example, an input value of \[“groceries”, “food”\] means that shipment’s load
     * characteristics belong to either one or both types. Consequently, the optimizer will assign
     * this shipment to a vehicle which has served other tasks whose `incompatible_load_types` do
     * not contain either groceries or food.
     *
     * Please note that if the shipment is part of any `relations` then, configured `load_types`
     * might be ignored.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun loadTypes(): Optional<List<String>> = loadTypes.getOptional("load_types")

    /**
     * Use this parameter to limit the drive time for which a shipment stays in the vehicle. The
     * time-in-vehicle calculations start once the pickup leg of shipment is completed after serving
     * any setup and service time that may have been configured for it. For the delivery leg,
     * time-in-vehicle calculations wouldn’t consider any setup and service time that needs to be
     * served for completing the delivery. The service or setup times of other tasks performed in
     * between will also be not accumulated against the time-in-vehicle limit.
     *
     * Please note that this property would be overridden if any `relations` configuration is used
     * except for “precedence” type. If “precedence” type relations is used then
     * `max_time_in_vehicle` will override it.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxTimeInVehicle(): Optional<Long> = maxTimeInVehicle.getOptional("max_time_in_vehicle")

    /**
     * Specify the cost of keeping this shipment unassigned, namely, the cost of outsourcing the
     * shipment. When provided, the optimizer weighs the cost of assigning the shipment against the
     * cost of keeping it unassigned and chooses a solution with lower cost. In the solution, the
     * `outsourcing_cost` of unassigned shipments is added to the total cost of the solution.
     *
     * If the `outsourcing_cost` is not provided, which is to say that the shipment can not be
     * outsourced, then the optimizer tries to fulfill the shipment irrespective of the cost
     * incurred, subject to other constraints.
     *
     * Please note that `revenue` and `outsourcing_cost` can not be specified simultaneously for a
     * shipment. Also, the `outsourcing_cost` would override the priority settings of the shipment.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun outsourcingCost(): Optional<Long> = outsourcingCost.getOptional("outsourcing_cost")

    /**
     * Describe the priority of this shipment. The valid values are in the range of \[0, 100\].
     * Default value is 0.
     *
     * Please note that setting a priority will only decide whether this shipment will be assigned
     * or not, but has nothing to do with the sequence of fulfilling shipments.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun priority(): Optional<Long> = priority.getOptional("priority")

    /**
     * Specify the revenue earned by completing this shipment. The optimizer uses the `revenue`
     * input to identify the potential profit earned by fulfilling this shipment after taking into
     * account the costs incurred to do so. The`options.objective` and `vehicles.costs` input are
     * taken into account to identify the costs of fulfilling the shipment.
     *
     * In general, the optimizer will prefer fulfilling the tasks with higher profits over the tasks
     * with lower profits, should it need to reject some tasks in order to honor other constraints.
     * In case the profit from fulfilling a shipment is negative, it will remain unassigned
     * whatsoever.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun revenue(): Optional<Long> = revenue.getOptional("revenue")

    /**
     * Define the skills needed to complete the shipment. This attribute supports multidimensional
     * skills allowing users to add multiple skills for a shipment.
     *
     * Read more about the behavior of this attribute in the
     * [Multi-Dimensional Parameters](#multi-dimensional-parameters) section.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun skills(): Optional<List<Long>> = skills.getOptional("skills")

    /**
     * Specify the dimensions and alignment configurations for the cargo associated with the
     * shipment. These inputs will be used to arrange the items into the loading compartment of the
     * vehicle to utilize the three-dimensional space. If a shipment consists of several different
     * items, each with its own dimensions, please specify the final characteristics for the task:
     * total height, total depth, total width.
     *
     * Please note that vehicles which contain the `volume` input, will only be considered for
     * arranging such items.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun volume(): Optional<Volume> = volume.getOptional("volume")

    /**
     * An array of integers specifying the IDs of the zone(s) that this shipment belongs to. The
     * shipment can be fulfilled by all vehicles which are allowed to complete tasks in the zone(s)
     * assigned to this shipment. If the pickup and delivery steps belong to different zones, then a
     * vehicle should be allowed to fulfil tasks in both zones to take up such shipments. Please
     * note following points about shipment zones:
     * - If zone IDs are provided for any one of the shipments, then all other shipments should also
     *   be specified with zone IDs. Zone IDs provided here will override any zone geometries
     *   provided in the `zones` attribute and these IDs will be used for allocating appropriate
     *   vehicles.
     * - Shipment steps can be auto-allocated to zones if this parameter is not specified while the
     *   zone geometries (either `zones.geometry` or `zones.geofence_id`) are provided.
     * - Shipments not falling in any zones can be fulfilled by only those vehicles which are
     *   allowed to take up tasks outside zones as well. Refer to `vehicles` attribute for more
     *   information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun zones(): Optional<List<Long>> = zones.getOptional("zones")

    /**
     * Returns the raw JSON value of [delivery].
     *
     * Unlike [delivery], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("delivery") @ExcludeMissing fun _delivery(): JsonField<Delivery> = delivery

    /**
     * Returns the raw JSON value of [pickup].
     *
     * Unlike [pickup], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pickup") @ExcludeMissing fun _pickup(): JsonField<Pickup> = pickup

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<List<Long>> = amount

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
     * Returns the raw JSON value of [maxTimeInVehicle].
     *
     * Unlike [maxTimeInVehicle], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_time_in_vehicle")
    @ExcludeMissing
    fun _maxTimeInVehicle(): JsonField<Long> = maxTimeInVehicle

    /**
     * Returns the raw JSON value of [outsourcingCost].
     *
     * Unlike [outsourcingCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outsourcing_cost")
    @ExcludeMissing
    fun _outsourcingCost(): JsonField<Long> = outsourcingCost

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
     * Returns the raw JSON value of [skills].
     *
     * Unlike [skills], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("skills") @ExcludeMissing fun _skills(): JsonField<List<Long>> = skills

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
         * Returns a mutable builder for constructing an instance of [Shipment].
         *
         * The following fields are required:
         * ```java
         * .delivery()
         * .pickup()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Shipment]. */
    class Builder internal constructor() {

        private var delivery: JsonField<Delivery>? = null
        private var pickup: JsonField<Pickup>? = null
        private var amount: JsonField<MutableList<Long>>? = null
        private var followLifoOrder: JsonField<Boolean> = JsonMissing.of()
        private var incompatibleLoadTypes: JsonField<MutableList<String>>? = null
        private var jointOrder: JsonField<Long> = JsonMissing.of()
        private var loadTypes: JsonField<MutableList<String>>? = null
        private var maxTimeInVehicle: JsonField<Long> = JsonMissing.of()
        private var outsourcingCost: JsonField<Long> = JsonMissing.of()
        private var priority: JsonField<Long> = JsonMissing.of()
        private var revenue: JsonField<Long> = JsonMissing.of()
        private var skills: JsonField<MutableList<Long>>? = null
        private var volume: JsonField<Volume> = JsonMissing.of()
        private var zones: JsonField<MutableList<Long>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(shipment: Shipment) = apply {
            delivery = shipment.delivery
            pickup = shipment.pickup
            amount = shipment.amount.map { it.toMutableList() }
            followLifoOrder = shipment.followLifoOrder
            incompatibleLoadTypes = shipment.incompatibleLoadTypes.map { it.toMutableList() }
            jointOrder = shipment.jointOrder
            loadTypes = shipment.loadTypes.map { it.toMutableList() }
            maxTimeInVehicle = shipment.maxTimeInVehicle
            outsourcingCost = shipment.outsourcingCost
            priority = shipment.priority
            revenue = shipment.revenue
            skills = shipment.skills.map { it.toMutableList() }
            volume = shipment.volume
            zones = shipment.zones.map { it.toMutableList() }
            additionalProperties = shipment.additionalProperties.toMutableMap()
        }

        /** Specify the details of the delivery step of the shipment. */
        fun delivery(delivery: Delivery) = delivery(JsonField.of(delivery))

        /**
         * Sets [Builder.delivery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.delivery] with a well-typed [Delivery] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun delivery(delivery: JsonField<Delivery>) = apply { this.delivery = delivery }

        /** Specify the details of the pickup step of the shipment. */
        fun pickup(pickup: Pickup) = pickup(JsonField.of(pickup))

        /**
         * Sets [Builder.pickup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pickup] with a well-typed [Pickup] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pickup(pickup: JsonField<Pickup>) = apply { this.pickup = pickup }

        /**
         * This parameter defines the quantity that needs to be shipped. This attribute supports
         * multidimensional quantities, to support shipment of quantities of different
         * units/dimensions. It is recommended to keep the dimensions of `amount` in `shipments` and
         * that of `capacity` in `vehicles` consistent.
         *
         * Please note that the `amount` will be added to the assigned vehicle’s initial load.
         *
         * Read more about the behavior of this attribute in the
         * [Multi-Dimensional Parameters](#multi-dimensional-parameters) section.
         */
        fun amount(amount: List<Long>) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amount(amount: JsonField<List<Long>>) = apply {
            this.amount = amount.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [Builder.amount].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAmount(amount: Long) = apply {
            this.amount =
                (this.amount ?: JsonField.of(mutableListOf())).also {
                    checkKnown("amount", it).add(amount)
                }
        }

        /**
         * Specify whether the shipment route should follow LIFO (last in, first out). Use this
         * parameter when the loading or unloading sequence of cargo is important. The default value
         * is \`false\`.
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
         * Use this parameter to specify the type of loads which are incompatible with the
         * shipment’s load type. Once this property is configured, the shipment can only be serviced
         * by a vehicle which has not serviced any other task with an incompatible `load_types` .
         * Add multiple load types to indicate all the types which are incompatible for this
         * shipment. The incompatible load type considerations are ignored for the first task of the
         * route.
         *
         * For example, an input value of \[“groceries”, “food”\] means that shipment’s load is
         * incompatible with both groceries and food type of loads. Consequently, the optimizer will
         * not assign this shipment to a vehicle which has served any task with `load_types` as
         * either groceries or food.
         *
         * Please note that if the shipment is part of any `relations` then, configured
         * `incompatible_load_types` might be ignored.
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
         * Specify a joint order group ID that this shipment is associated with. Tasks having the
         * same joint order group ID are treated as a single unit: either all tasks in the group are
         * assigned, or none are. Users can add tasks of both `jobs` and `shipments` types to a
         * single joint order group by using the same unique ID. Please note that:
         * - Each shipment in a single joint order group will be fulfilled by a unique vehicle.
         * - Shipments belonging to a joint order group can be served in any sequence while
         *   maintaining the pickup -> delivery sequence for an individual shipment.
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
         * Use this parameter to specify the type of loads for the given shipment. Once this
         * property is configured, the shipment can not be served by a vehicle which has serviced
         * any task whose load is incompatible with any of the`load_types` provided in this input.
         * The load type considerations are ignored for the first task of the route.
         *
         * For example, an input value of \[“groceries”, “food”\] means that shipment’s load
         * characteristics belong to either one or both types. Consequently, the optimizer will
         * assign this shipment to a vehicle which has served other tasks whose
         * `incompatible_load_types` do not contain either groceries or food.
         *
         * Please note that if the shipment is part of any `relations` then, configured `load_types`
         * might be ignored.
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
         * Use this parameter to limit the drive time for which a shipment stays in the vehicle. The
         * time-in-vehicle calculations start once the pickup leg of shipment is completed after
         * serving any setup and service time that may have been configured for it. For the delivery
         * leg, time-in-vehicle calculations wouldn’t consider any setup and service time that needs
         * to be served for completing the delivery. The service or setup times of other tasks
         * performed in between will also be not accumulated against the time-in-vehicle limit.
         *
         * Please note that this property would be overridden if any `relations` configuration is
         * used except for “precedence” type. If “precedence” type relations is used then
         * `max_time_in_vehicle` will override it.
         */
        fun maxTimeInVehicle(maxTimeInVehicle: Long) =
            maxTimeInVehicle(JsonField.of(maxTimeInVehicle))

        /**
         * Sets [Builder.maxTimeInVehicle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTimeInVehicle] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxTimeInVehicle(maxTimeInVehicle: JsonField<Long>) = apply {
            this.maxTimeInVehicle = maxTimeInVehicle
        }

        /**
         * Specify the cost of keeping this shipment unassigned, namely, the cost of outsourcing the
         * shipment. When provided, the optimizer weighs the cost of assigning the shipment against
         * the cost of keeping it unassigned and chooses a solution with lower cost. In the
         * solution, the `outsourcing_cost` of unassigned shipments is added to the total cost of
         * the solution.
         *
         * If the `outsourcing_cost` is not provided, which is to say that the shipment can not be
         * outsourced, then the optimizer tries to fulfill the shipment irrespective of the cost
         * incurred, subject to other constraints.
         *
         * Please note that `revenue` and `outsourcing_cost` can not be specified simultaneously for
         * a shipment. Also, the `outsourcing_cost` would override the priority settings of the
         * shipment.
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
         * Describe the priority of this shipment. The valid values are in the range of \[0, 100\].
         * Default value is 0.
         *
         * Please note that setting a priority will only decide whether this shipment will be
         * assigned or not, but has nothing to do with the sequence of fulfilling shipments.
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
         * Specify the revenue earned by completing this shipment. The optimizer uses the `revenue`
         * input to identify the potential profit earned by fulfilling this shipment after taking
         * into account the costs incurred to do so. The`options.objective` and `vehicles.costs`
         * input are taken into account to identify the costs of fulfilling the shipment.
         *
         * In general, the optimizer will prefer fulfilling the tasks with higher profits over the
         * tasks with lower profits, should it need to reject some tasks in order to honor other
         * constraints. In case the profit from fulfilling a shipment is negative, it will remain
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
         * Define the skills needed to complete the shipment. This attribute supports
         * multidimensional skills allowing users to add multiple skills for a shipment.
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
         * Specify the dimensions and alignment configurations for the cargo associated with the
         * shipment. These inputs will be used to arrange the items into the loading compartment of
         * the vehicle to utilize the three-dimensional space. If a shipment consists of several
         * different items, each with its own dimensions, please specify the final characteristics
         * for the task: total height, total depth, total width.
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
         * An array of integers specifying the IDs of the zone(s) that this shipment belongs to. The
         * shipment can be fulfilled by all vehicles which are allowed to complete tasks in the
         * zone(s) assigned to this shipment. If the pickup and delivery steps belong to different
         * zones, then a vehicle should be allowed to fulfil tasks in both zones to take up such
         * shipments. Please note following points about shipment zones:
         * - If zone IDs are provided for any one of the shipments, then all other shipments should
         *   also be specified with zone IDs. Zone IDs provided here will override any zone
         *   geometries provided in the `zones` attribute and these IDs will be used for allocating
         *   appropriate vehicles.
         * - Shipment steps can be auto-allocated to zones if this parameter is not specified while
         *   the zone geometries (either `zones.geometry` or `zones.geofence_id`) are provided.
         * - Shipments not falling in any zones can be fulfilled by only those vehicles which are
         *   allowed to take up tasks outside zones as well. Refer to `vehicles` attribute for more
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
         * Returns an immutable instance of [Shipment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .delivery()
         * .pickup()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Shipment =
            Shipment(
                checkRequired("delivery", delivery),
                checkRequired("pickup", pickup),
                (amount ?: JsonMissing.of()).map { it.toImmutable() },
                followLifoOrder,
                (incompatibleLoadTypes ?: JsonMissing.of()).map { it.toImmutable() },
                jointOrder,
                (loadTypes ?: JsonMissing.of()).map { it.toImmutable() },
                maxTimeInVehicle,
                outsourcingCost,
                priority,
                revenue,
                (skills ?: JsonMissing.of()).map { it.toImmutable() },
                volume,
                (zones ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Shipment = apply {
        if (validated) {
            return@apply
        }

        delivery().validate()
        pickup().validate()
        amount()
        followLifoOrder()
        incompatibleLoadTypes()
        jointOrder()
        loadTypes()
        maxTimeInVehicle()
        outsourcingCost()
        priority()
        revenue()
        skills()
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
        (delivery.asKnown().getOrNull()?.validity() ?: 0) +
            (pickup.asKnown().getOrNull()?.validity() ?: 0) +
            (amount.asKnown().getOrNull()?.size ?: 0) +
            (if (followLifoOrder.asKnown().isPresent) 1 else 0) +
            (incompatibleLoadTypes.asKnown().getOrNull()?.size ?: 0) +
            (if (jointOrder.asKnown().isPresent) 1 else 0) +
            (loadTypes.asKnown().getOrNull()?.size ?: 0) +
            (if (maxTimeInVehicle.asKnown().isPresent) 1 else 0) +
            (if (outsourcingCost.asKnown().isPresent) 1 else 0) +
            (if (priority.asKnown().isPresent) 1 else 0) +
            (if (revenue.asKnown().isPresent) 1 else 0) +
            (skills.asKnown().getOrNull()?.size ?: 0) +
            (volume.asKnown().getOrNull()?.validity() ?: 0) +
            (zones.asKnown().getOrNull()?.size ?: 0)

    /** Specify the details of the delivery step of the shipment. */
    class Delivery
    private constructor(
        private val id: JsonField<String>,
        private val locationIndex: JsonField<Long>,
        private val description: JsonField<String>,
        private val maxVisitLateness: JsonField<Long>,
        private val metadata: JsonValue,
        private val sequenceOrder: JsonField<Long>,
        private val service: JsonField<Long>,
        private val setup: JsonField<Long>,
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
            @JsonProperty("max_visit_lateness")
            @ExcludeMissing
            maxVisitLateness: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("sequence_order")
            @ExcludeMissing
            sequenceOrder: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("service") @ExcludeMissing service: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("setup") @ExcludeMissing setup: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("time_windows")
            @ExcludeMissing
            timeWindows: JsonField<List<List<Long>>> = JsonMissing.of(),
        ) : this(
            id,
            locationIndex,
            description,
            maxVisitLateness,
            metadata,
            sequenceOrder,
            service,
            setup,
            timeWindows,
            mutableMapOf(),
        )

        /**
         * Indicate the ID of this shipment delivery step. An error will be reported if there are
         * duplicate IDs for multiple shipment deliveries. The IDs are case sensitive. Please note
         * `id` is mandatory when using the `shipments` attribute.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Indicate the index of location for this shipment delivery. The index references the
         * locations present in the `location` array. The valid range of value is \[0, length of
         * `location` array).
         *
         * Please note `location_index` is mandatory when using the `shipment` attribute.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun locationIndex(): Long = locationIndex.getRequired("location_index")

        /**
         * Specify a custom description for the shipment delivery step.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * It determines the allowable delay, in seconds, to begin a shipment delivery after its
         * designated time window has concluded. Please note that this parameter would override the
         * `constraint.max_visit_lateness` (global) if both are specified.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxVisitLateness(): Optional<Long> = maxVisitLateness.getOptional("max_visit_lateness")

        /**
         * Specify any custom data that should be attached along with delivery fulfilment details in
         * the `step` attribute of the optimized solution. Users can leverage this property to
         * provide additional details/context when sharing information about the delivery step with
         * integrated systems (TMS, Fleet Management, Driver dispatch etc).
         *
         * Please note that the `metadata` content must always be specified in a `key` : `value`
         * pair format, where the “key” is always a string.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        /**
         * Use this parameter to prioritize completing the shipment delivery relative to certain
         * other tasks. A task configured with a `sequence_order` of 2 will be done after the task
         * with `sequence_order` of 1, but before the task with `sequence_order` of 3. Valid range
         * of values for this input is \[0,100\].
         *
         * Please note that:
         * - The shipment delivery's sequence order must be greater than or equal to its
         *   corresponding pickup's sequence order.
         * - Only the tasks within the same route are compared and ordered as per their
         *   `sequence_order`.
         * - Tasks without a `sequence_order` are not involved in the comparison.
         * - Following is the precedence of `sequence_order` when used along side some of the other
         *   constraints:
         *     - `relations` are prioritized over `sequence_order` comparisons.
         *     - `sequence_order` will override `order_grouping` configurations.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sequenceOrder(): Optional<Long> = sequenceOrder.getOptional("sequence_order")

        /**
         * Provide the time duration, in seconds, needed to complete the shipment delivery. Default
         * value is 0.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun service(): Optional<Long> = service.getOptional("service")

        /**
         * Specify the set-up duration, in seconds, for the delivery. `setup` is the one-time effort
         * needed apart from working on the original task- for example, effort to record some
         * information for compliance, or effort to set-up the equipment, or perform any other
         * action for completing all steps required to fulfil the job.
         *
         * Please note that `setup` time is applied only once for a given task location. `setup`
         * time, unlike `service` time, is not repeated in case there are multiple tasks at the same
         * location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun setup(): Optional<Long> = setup.getOptional("setup")

        /**
         * Describe time periods within which the shipment delivery should start. The time periods
         * should be expressed as a UNIX timestamp in seconds.
         *
         * Please note that the time periods should not overlap with each other and should always
         * follow the format of \[start_timestamp, end_timestamp\].
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
         * Returns the raw JSON value of [maxVisitLateness].
         *
         * Unlike [maxVisitLateness], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_visit_lateness")
        @ExcludeMissing
        fun _maxVisitLateness(): JsonField<Long> = maxVisitLateness

        /**
         * Returns the raw JSON value of [sequenceOrder].
         *
         * Unlike [sequenceOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [Delivery].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .locationIndex()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Delivery]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var locationIndex: JsonField<Long>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var maxVisitLateness: JsonField<Long> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var sequenceOrder: JsonField<Long> = JsonMissing.of()
            private var service: JsonField<Long> = JsonMissing.of()
            private var setup: JsonField<Long> = JsonMissing.of()
            private var timeWindows: JsonField<MutableList<List<Long>>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(delivery: Delivery) = apply {
                id = delivery.id
                locationIndex = delivery.locationIndex
                description = delivery.description
                maxVisitLateness = delivery.maxVisitLateness
                metadata = delivery.metadata
                sequenceOrder = delivery.sequenceOrder
                service = delivery.service
                setup = delivery.setup
                timeWindows = delivery.timeWindows.map { it.toMutableList() }
                additionalProperties = delivery.additionalProperties.toMutableMap()
            }

            /**
             * Indicate the ID of this shipment delivery step. An error will be reported if there
             * are duplicate IDs for multiple shipment deliveries. The IDs are case sensitive.
             * Please note `id` is mandatory when using the `shipments` attribute.
             */
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
             * Indicate the index of location for this shipment delivery. The index references the
             * locations present in the `location` array. The valid range of value is \[0, length of
             * `location` array).
             *
             * Please note `location_index` is mandatory when using the `shipment` attribute.
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

            /** Specify a custom description for the shipment delivery step. */
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
             * It determines the allowable delay, in seconds, to begin a shipment delivery after its
             * designated time window has concluded. Please note that this parameter would override
             * the `constraint.max_visit_lateness` (global) if both are specified.
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
             * Specify any custom data that should be attached along with delivery fulfilment
             * details in the `step` attribute of the optimized solution. Users can leverage this
             * property to provide additional details/context when sharing information about the
             * delivery step with integrated systems (TMS, Fleet Management, Driver dispatch etc).
             *
             * Please note that the `metadata` content must always be specified in a `key` : `value`
             * pair format, where the “key” is always a string.
             */
            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            /**
             * Use this parameter to prioritize completing the shipment delivery relative to certain
             * other tasks. A task configured with a `sequence_order` of 2 will be done after the
             * task with `sequence_order` of 1, but before the task with `sequence_order` of 3.
             * Valid range of values for this input is \[0,100\].
             *
             * Please note that:
             * - The shipment delivery's sequence order must be greater than or equal to its
             *   corresponding pickup's sequence order.
             * - Only the tasks within the same route are compared and ordered as per their
             *   `sequence_order`.
             * - Tasks without a `sequence_order` are not involved in the comparison.
             * - Following is the precedence of `sequence_order` when used along side some of the
             *   other constraints:
             *     - `relations` are prioritized over `sequence_order` comparisons.
             *     - `sequence_order` will override `order_grouping` configurations.
             */
            fun sequenceOrder(sequenceOrder: Long) = sequenceOrder(JsonField.of(sequenceOrder))

            /**
             * Sets [Builder.sequenceOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceOrder(sequenceOrder: JsonField<Long>) = apply {
                this.sequenceOrder = sequenceOrder
            }

            /**
             * Provide the time duration, in seconds, needed to complete the shipment delivery.
             * Default value is 0.
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
             * Specify the set-up duration, in seconds, for the delivery. `setup` is the one-time
             * effort needed apart from working on the original task- for example, effort to record
             * some information for compliance, or effort to set-up the equipment, or perform any
             * other action for completing all steps required to fulfil the job.
             *
             * Please note that `setup` time is applied only once for a given task location. `setup`
             * time, unlike `service` time, is not repeated in case there are multiple tasks at the
             * same location.
             */
            fun setup(setup: Long) = setup(JsonField.of(setup))

            /**
             * Sets [Builder.setup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.setup] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun setup(setup: JsonField<Long>) = apply { this.setup = setup }

            /**
             * Describe time periods within which the shipment delivery should start. The time
             * periods should be expressed as a UNIX timestamp in seconds.
             *
             * Please note that the time periods should not overlap with each other and should
             * always follow the format of \[start_timestamp, end_timestamp\].
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
             * Returns an immutable instance of [Delivery].
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
            fun build(): Delivery =
                Delivery(
                    checkRequired("id", id),
                    checkRequired("locationIndex", locationIndex),
                    description,
                    maxVisitLateness,
                    metadata,
                    sequenceOrder,
                    service,
                    setup,
                    (timeWindows ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Delivery = apply {
            if (validated) {
                return@apply
            }

            id()
            locationIndex()
            description()
            maxVisitLateness()
            sequenceOrder()
            service()
            setup()
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
                (if (maxVisitLateness.asKnown().isPresent) 1 else 0) +
                (if (sequenceOrder.asKnown().isPresent) 1 else 0) +
                (if (service.asKnown().isPresent) 1 else 0) +
                (if (setup.asKnown().isPresent) 1 else 0) +
                (timeWindows.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Delivery && id == other.id && locationIndex == other.locationIndex && description == other.description && maxVisitLateness == other.maxVisitLateness && metadata == other.metadata && sequenceOrder == other.sequenceOrder && service == other.service && setup == other.setup && timeWindows == other.timeWindows && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, locationIndex, description, maxVisitLateness, metadata, sequenceOrder, service, setup, timeWindows, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Delivery{id=$id, locationIndex=$locationIndex, description=$description, maxVisitLateness=$maxVisitLateness, metadata=$metadata, sequenceOrder=$sequenceOrder, service=$service, setup=$setup, timeWindows=$timeWindows, additionalProperties=$additionalProperties}"
    }

    /** Specify the details of the pickup step of the shipment. */
    class Pickup
    private constructor(
        private val id: JsonField<String>,
        private val locationIndex: JsonField<Long>,
        private val description: JsonField<String>,
        private val maxVisitLateness: JsonField<Long>,
        private val metadata: JsonValue,
        private val sequenceOrder: JsonField<Long>,
        private val service: JsonField<Long>,
        private val setup: JsonField<Long>,
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
            @JsonProperty("max_visit_lateness")
            @ExcludeMissing
            maxVisitLateness: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("sequence_order")
            @ExcludeMissing
            sequenceOrder: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("service") @ExcludeMissing service: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("setup") @ExcludeMissing setup: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("time_windows")
            @ExcludeMissing
            timeWindows: JsonField<List<List<Long>>> = JsonMissing.of(),
        ) : this(
            id,
            locationIndex,
            description,
            maxVisitLateness,
            metadata,
            sequenceOrder,
            service,
            setup,
            timeWindows,
            mutableMapOf(),
        )

        /**
         * Indicate the ID of this shipment pickup step. An error will be reported if there are
         * duplicate IDs for multiple shipment pick-ups. The IDs are case-sensitive. Please note
         * `id` is mandatory when using the `shipments` attribute.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Indicate the index of the location for this shipment pickup. The index references the
         * locations present in the `location` array. The valid range of value is \[0, length of
         * `location` array).
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun locationIndex(): Long = locationIndex.getRequired("location_index")

        /**
         * Specify a custom description for the shipment pickup step.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * It determines the allowable delay, in seconds, to begin a shipment pickup after its
         * designated time window has concluded. Please note that this parameter would override the
         * `constraint.max_visit_lateness` (global) if both are specified.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxVisitLateness(): Optional<Long> = maxVisitLateness.getOptional("max_visit_lateness")

        /**
         * Specify any custom data that should be attached along with pickup fulfilment details in
         * the `steps` attribute of the optimized solution. Users can leverage this property to
         * provide additional details/context when sharing information about the pickup step with
         * integrated systems (TMS, Fleet Management, Driver dispatch etc).
         *
         * Please note that the `metadata` content must always be specified in a`key` : `value` pair
         * format, where the “key” is always a string.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        /**
         * Use this parameter to prioritize completing the shipment pickup relative to certain other
         * tasks. A task configured with a `sequence_order` of 2 will be done after the task with
         * `sequence_order` of 1, but before the task with `sequence_order` of 3. Valid range of
         * values for this input is \[0,100\].
         *
         * Please note that:
         * - The shipment pickups's sequence order must be lesser than or equal to its corresponding
         *   delivery's sequence order.
         * - Only the tasks within the same route are compared and ordered as per their
         *   `sequence_order`.
         * - Tasks without a `sequence_order` are not involved in the comparison.
         * - Following is the precedence of `sequence_order` when used along side some of the other
         *   constraints:
         *     - `relations` are prioritized over `sequence_order` comparisons.
         *     - `sequence_order` will override `order_grouping` configurations.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sequenceOrder(): Optional<Long> = sequenceOrder.getOptional("sequence_order")

        /**
         * Provide the time duration, in seconds, needed to complete the shipment pickup. Default
         * value is 0.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun service(): Optional<Long> = service.getOptional("service")

        /**
         * Specify the set-up duration, in seconds, for the pickup. `setup` is the one-time effort
         * needed apart from working on the original task- for example, effort to record some
         * information for compliance, or effort to set-up the equipment, or perform any other
         * action for completing all steps required to fulfil the job.
         *
         * Please note that `setup` time is applied only once for a given task location. `setup`
         * time, unlike `service` time, is not repeated in case there are multiple tasks at the same
         * location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun setup(): Optional<Long> = setup.getOptional("setup")

        /**
         * Describe time periods within which the shipment pickup should be start. The time periods
         * should be expressed as a UNIX timestamp in seconds.
         *
         * Please note that the time periods should not overlap with each other and should always
         * follow the format of \[start_timestamp, end_timestamp\]
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
         * Returns the raw JSON value of [maxVisitLateness].
         *
         * Unlike [maxVisitLateness], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_visit_lateness")
        @ExcludeMissing
        fun _maxVisitLateness(): JsonField<Long> = maxVisitLateness

        /**
         * Returns the raw JSON value of [sequenceOrder].
         *
         * Unlike [sequenceOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [Pickup].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .locationIndex()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Pickup]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var locationIndex: JsonField<Long>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var maxVisitLateness: JsonField<Long> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var sequenceOrder: JsonField<Long> = JsonMissing.of()
            private var service: JsonField<Long> = JsonMissing.of()
            private var setup: JsonField<Long> = JsonMissing.of()
            private var timeWindows: JsonField<MutableList<List<Long>>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pickup: Pickup) = apply {
                id = pickup.id
                locationIndex = pickup.locationIndex
                description = pickup.description
                maxVisitLateness = pickup.maxVisitLateness
                metadata = pickup.metadata
                sequenceOrder = pickup.sequenceOrder
                service = pickup.service
                setup = pickup.setup
                timeWindows = pickup.timeWindows.map { it.toMutableList() }
                additionalProperties = pickup.additionalProperties.toMutableMap()
            }

            /**
             * Indicate the ID of this shipment pickup step. An error will be reported if there are
             * duplicate IDs for multiple shipment pick-ups. The IDs are case-sensitive. Please note
             * `id` is mandatory when using the `shipments` attribute.
             */
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
             * Indicate the index of the location for this shipment pickup. The index references the
             * locations present in the `location` array. The valid range of value is \[0, length of
             * `location` array).
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

            /** Specify a custom description for the shipment pickup step. */
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
             * It determines the allowable delay, in seconds, to begin a shipment pickup after its
             * designated time window has concluded. Please note that this parameter would override
             * the `constraint.max_visit_lateness` (global) if both are specified.
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
             * Specify any custom data that should be attached along with pickup fulfilment details
             * in the `steps` attribute of the optimized solution. Users can leverage this property
             * to provide additional details/context when sharing information about the pickup step
             * with integrated systems (TMS, Fleet Management, Driver dispatch etc).
             *
             * Please note that the `metadata` content must always be specified in a`key` : `value`
             * pair format, where the “key” is always a string.
             */
            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            /**
             * Use this parameter to prioritize completing the shipment pickup relative to certain
             * other tasks. A task configured with a `sequence_order` of 2 will be done after the
             * task with `sequence_order` of 1, but before the task with `sequence_order` of 3.
             * Valid range of values for this input is \[0,100\].
             *
             * Please note that:
             * - The shipment pickups's sequence order must be lesser than or equal to its
             *   corresponding delivery's sequence order.
             * - Only the tasks within the same route are compared and ordered as per their
             *   `sequence_order`.
             * - Tasks without a `sequence_order` are not involved in the comparison.
             * - Following is the precedence of `sequence_order` when used along side some of the
             *   other constraints:
             *     - `relations` are prioritized over `sequence_order` comparisons.
             *     - `sequence_order` will override `order_grouping` configurations.
             */
            fun sequenceOrder(sequenceOrder: Long) = sequenceOrder(JsonField.of(sequenceOrder))

            /**
             * Sets [Builder.sequenceOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sequenceOrder] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sequenceOrder(sequenceOrder: JsonField<Long>) = apply {
                this.sequenceOrder = sequenceOrder
            }

            /**
             * Provide the time duration, in seconds, needed to complete the shipment pickup.
             * Default value is 0.
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
             * Specify the set-up duration, in seconds, for the pickup. `setup` is the one-time
             * effort needed apart from working on the original task- for example, effort to record
             * some information for compliance, or effort to set-up the equipment, or perform any
             * other action for completing all steps required to fulfil the job.
             *
             * Please note that `setup` time is applied only once for a given task location. `setup`
             * time, unlike `service` time, is not repeated in case there are multiple tasks at the
             * same location.
             */
            fun setup(setup: Long) = setup(JsonField.of(setup))

            /**
             * Sets [Builder.setup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.setup] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun setup(setup: JsonField<Long>) = apply { this.setup = setup }

            /**
             * Describe time periods within which the shipment pickup should be start. The time
             * periods should be expressed as a UNIX timestamp in seconds.
             *
             * Please note that the time periods should not overlap with each other and should
             * always follow the format of \[start_timestamp, end_timestamp\]
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
             * Returns an immutable instance of [Pickup].
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
            fun build(): Pickup =
                Pickup(
                    checkRequired("id", id),
                    checkRequired("locationIndex", locationIndex),
                    description,
                    maxVisitLateness,
                    metadata,
                    sequenceOrder,
                    service,
                    setup,
                    (timeWindows ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Pickup = apply {
            if (validated) {
                return@apply
            }

            id()
            locationIndex()
            description()
            maxVisitLateness()
            sequenceOrder()
            service()
            setup()
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
                (if (maxVisitLateness.asKnown().isPresent) 1 else 0) +
                (if (sequenceOrder.asKnown().isPresent) 1 else 0) +
                (if (service.asKnown().isPresent) 1 else 0) +
                (if (setup.asKnown().isPresent) 1 else 0) +
                (timeWindows.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Pickup && id == other.id && locationIndex == other.locationIndex && description == other.description && maxVisitLateness == other.maxVisitLateness && metadata == other.metadata && sequenceOrder == other.sequenceOrder && service == other.service && setup == other.setup && timeWindows == other.timeWindows && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, locationIndex, description, maxVisitLateness, metadata, sequenceOrder, service, setup, timeWindows, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pickup{id=$id, locationIndex=$locationIndex, description=$description, maxVisitLateness=$maxVisitLateness, metadata=$metadata, sequenceOrder=$sequenceOrder, service=$service, setup=$setup, timeWindows=$timeWindows, additionalProperties=$additionalProperties}"
    }

    /**
     * Specify the dimensions and alignment configurations for the cargo associated with the
     * shipment. These inputs will be used to arrange the items into the loading compartment of the
     * vehicle to utilize the three-dimensional space. If a shipment consists of several different
     * items, each with its own dimensions, please specify the final characteristics for the task:
     * total height, total depth, total width.
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

                @JvmField val Unknown1 = of("`\" \"`")

                @JvmStatic fun of(value: String) = Alignment(JsonField.of(value))
            }

            /** An enum containing [Alignment]'s known values. */
            enum class Known {
                STRICT,
                PARALLEL,
                FIXED_BOTTOM,
                Unknown1,
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
                Unknown1,
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
                    Unknown1 -> Value.Unknown1
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
                    Unknown1 -> Known.Unknown1
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

        return /* spotless:off */ other is Shipment && delivery == other.delivery && pickup == other.pickup && amount == other.amount && followLifoOrder == other.followLifoOrder && incompatibleLoadTypes == other.incompatibleLoadTypes && jointOrder == other.jointOrder && loadTypes == other.loadTypes && maxTimeInVehicle == other.maxTimeInVehicle && outsourcingCost == other.outsourcingCost && priority == other.priority && revenue == other.revenue && skills == other.skills && volume == other.volume && zones == other.zones && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(delivery, pickup, amount, followLifoOrder, incompatibleLoadTypes, jointOrder, loadTypes, maxTimeInVehicle, outsourcingCost, priority, revenue, skills, volume, zones, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Shipment{delivery=$delivery, pickup=$pickup, amount=$amount, followLifoOrder=$followLifoOrder, incompatibleLoadTypes=$incompatibleLoadTypes, jointOrder=$jointOrder, loadTypes=$loadTypes, maxTimeInVehicle=$maxTimeInVehicle, outsourcingCost=$outsourcingCost, priority=$priority, revenue=$revenue, skills=$skills, volume=$volume, zones=$zones, additionalProperties=$additionalProperties}"
}
