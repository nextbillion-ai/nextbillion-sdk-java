// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.fleetify.routes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.nextbillion.api.core.ExcludeMissing
import io.nextbillion.api.core.JsonField
import io.nextbillion.api.core.JsonMissing
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * An object returning the routing characteristics that are used to generate the route and
 * turn-by-turn navigation steps for the dispatched route. The route and navigation steps are
 * available when driver uses the in-app navigation.
 *
 * Please note the routing characteristics returned here are the same as those configured in the
 * input request. The fields which were not specified in the input will be returned as blanks.
 */
class RoutingResponse
private constructor(
    private val approaches: JsonField<String>,
    private val avoid: JsonField<String>,
    private val hazmatType: JsonField<String>,
    private val mode: JsonField<String>,
    private val truckAxleLoad: JsonField<String>,
    private val truckSize: JsonField<String>,
    private val truckWeight: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("approaches")
        @ExcludeMissing
        approaches: JsonField<String> = JsonMissing.of(),
        @JsonProperty("avoid") @ExcludeMissing avoid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hazmat_type")
        @ExcludeMissing
        hazmatType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("truck_axle_load")
        @ExcludeMissing
        truckAxleLoad: JsonField<String> = JsonMissing.of(),
        @JsonProperty("truck_size") @ExcludeMissing truckSize: JsonField<String> = JsonMissing.of(),
        @JsonProperty("truck_weight")
        @ExcludeMissing
        truckWeight: JsonField<String> = JsonMissing.of(),
    ) : this(
        approaches,
        avoid,
        hazmatType,
        mode,
        truckAxleLoad,
        truckSize,
        truckWeight,
        mutableMapOf(),
    )

    /**
     * Returns the configuration of approaches for each step, that is used when generating the route
     * to help the driver with turn-by-turn navigation.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun approaches(): Optional<String> = approaches.getOptional("approaches")

    /**
     * Returns the objects and maneuvers that will be avoided in the route that is built when driver
     * starts the in-app turn-by-turn navigation.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun avoid(): Optional<String> = avoid.getOptional("avoid")

    /**
     * Returns the hazardous cargo type that the truck is carrying. The hazardous cargo type is used
     * to determine the compliant routes that the driver can take while navigating the dispatched
     * route.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun hazmatType(): Optional<String> = hazmatType.getOptional("hazmat_type")

    /**
     * Returns the driving mode that is used to build the route when driver starts the in-app
     * turn-by-turn navigation.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun mode(): Optional<String> = mode.getOptional("mode")

    /**
     * Returns the total load per axle of the truck, in tonnes, used to determine compliant routes
     * that the driver can take when he starts navigating the dispatched route.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun truckAxleLoad(): Optional<String> = truckAxleLoad.getOptional("truck_axle_load")

    /**
     * Returns the truck dimensions, in centimeters, used to determine compliant routes that the
     * driver can take when he starts navigating the dispatched route.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun truckSize(): Optional<String> = truckSize.getOptional("truck_size")

    /**
     * Returns the truck weight that will determine compliant routes that can be used by the driver
     * during navigation.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun truckWeight(): Optional<String> = truckWeight.getOptional("truck_weight")

    /**
     * Returns the raw JSON value of [approaches].
     *
     * Unlike [approaches], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("approaches") @ExcludeMissing fun _approaches(): JsonField<String> = approaches

    /**
     * Returns the raw JSON value of [avoid].
     *
     * Unlike [avoid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avoid") @ExcludeMissing fun _avoid(): JsonField<String> = avoid

    /**
     * Returns the raw JSON value of [hazmatType].
     *
     * Unlike [hazmatType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hazmat_type") @ExcludeMissing fun _hazmatType(): JsonField<String> = hazmatType

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<String> = mode

    /**
     * Returns the raw JSON value of [truckAxleLoad].
     *
     * Unlike [truckAxleLoad], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("truck_axle_load")
    @ExcludeMissing
    fun _truckAxleLoad(): JsonField<String> = truckAxleLoad

    /**
     * Returns the raw JSON value of [truckSize].
     *
     * Unlike [truckSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("truck_size") @ExcludeMissing fun _truckSize(): JsonField<String> = truckSize

    /**
     * Returns the raw JSON value of [truckWeight].
     *
     * Unlike [truckWeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("truck_weight")
    @ExcludeMissing
    fun _truckWeight(): JsonField<String> = truckWeight

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

        /** Returns a mutable builder for constructing an instance of [RoutingResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RoutingResponse]. */
    class Builder internal constructor() {

        private var approaches: JsonField<String> = JsonMissing.of()
        private var avoid: JsonField<String> = JsonMissing.of()
        private var hazmatType: JsonField<String> = JsonMissing.of()
        private var mode: JsonField<String> = JsonMissing.of()
        private var truckAxleLoad: JsonField<String> = JsonMissing.of()
        private var truckSize: JsonField<String> = JsonMissing.of()
        private var truckWeight: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(routingResponse: RoutingResponse) = apply {
            approaches = routingResponse.approaches
            avoid = routingResponse.avoid
            hazmatType = routingResponse.hazmatType
            mode = routingResponse.mode
            truckAxleLoad = routingResponse.truckAxleLoad
            truckSize = routingResponse.truckSize
            truckWeight = routingResponse.truckWeight
            additionalProperties = routingResponse.additionalProperties.toMutableMap()
        }

        /**
         * Returns the configuration of approaches for each step, that is used when generating the
         * route to help the driver with turn-by-turn navigation.
         */
        fun approaches(approaches: String) = approaches(JsonField.of(approaches))

        /**
         * Sets [Builder.approaches] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approaches] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun approaches(approaches: JsonField<String>) = apply { this.approaches = approaches }

        /**
         * Returns the objects and maneuvers that will be avoided in the route that is built when
         * driver starts the in-app turn-by-turn navigation.
         */
        fun avoid(avoid: String) = avoid(JsonField.of(avoid))

        /**
         * Sets [Builder.avoid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avoid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avoid(avoid: JsonField<String>) = apply { this.avoid = avoid }

        /**
         * Returns the hazardous cargo type that the truck is carrying. The hazardous cargo type is
         * used to determine the compliant routes that the driver can take while navigating the
         * dispatched route.
         */
        fun hazmatType(hazmatType: String) = hazmatType(JsonField.of(hazmatType))

        /**
         * Sets [Builder.hazmatType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hazmatType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hazmatType(hazmatType: JsonField<String>) = apply { this.hazmatType = hazmatType }

        /**
         * Returns the driving mode that is used to build the route when driver starts the in-app
         * turn-by-turn navigation.
         */
        fun mode(mode: String) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<String>) = apply { this.mode = mode }

        /**
         * Returns the total load per axle of the truck, in tonnes, used to determine compliant
         * routes that the driver can take when he starts navigating the dispatched route.
         */
        fun truckAxleLoad(truckAxleLoad: String) = truckAxleLoad(JsonField.of(truckAxleLoad))

        /**
         * Sets [Builder.truckAxleLoad] to an arbitrary JSON value.
         *
         * You should usually call [Builder.truckAxleLoad] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun truckAxleLoad(truckAxleLoad: JsonField<String>) = apply {
            this.truckAxleLoad = truckAxleLoad
        }

        /**
         * Returns the truck dimensions, in centimeters, used to determine compliant routes that the
         * driver can take when he starts navigating the dispatched route.
         */
        fun truckSize(truckSize: String) = truckSize(JsonField.of(truckSize))

        /**
         * Sets [Builder.truckSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.truckSize] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun truckSize(truckSize: JsonField<String>) = apply { this.truckSize = truckSize }

        /**
         * Returns the truck weight that will determine compliant routes that can be used by the
         * driver during navigation.
         */
        fun truckWeight(truckWeight: String) = truckWeight(JsonField.of(truckWeight))

        /**
         * Sets [Builder.truckWeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.truckWeight] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun truckWeight(truckWeight: JsonField<String>) = apply { this.truckWeight = truckWeight }

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
         * Returns an immutable instance of [RoutingResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RoutingResponse =
            RoutingResponse(
                approaches,
                avoid,
                hazmatType,
                mode,
                truckAxleLoad,
                truckSize,
                truckWeight,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RoutingResponse = apply {
        if (validated) {
            return@apply
        }

        approaches()
        avoid()
        hazmatType()
        mode()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (approaches.asKnown().isPresent) 1 else 0) +
            (if (avoid.asKnown().isPresent) 1 else 0) +
            (if (hazmatType.asKnown().isPresent) 1 else 0) +
            (if (mode.asKnown().isPresent) 1 else 0) +
            (if (truckAxleLoad.asKnown().isPresent) 1 else 0) +
            (if (truckSize.asKnown().isPresent) 1 else 0) +
            (if (truckWeight.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutingResponse && approaches == other.approaches && avoid == other.avoid && hazmatType == other.hazmatType && mode == other.mode && truckAxleLoad == other.truckAxleLoad && truckSize == other.truckSize && truckWeight == other.truckWeight && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(approaches, avoid, hazmatType, mode, truckAxleLoad, truckSize, truckWeight, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RoutingResponse{approaches=$approaches, avoid=$avoid, hazmatType=$hazmatType, mode=$mode, truckAxleLoad=$truckAxleLoad, truckSize=$truckSize, truckWeight=$truckWeight, additionalProperties=$additionalProperties}"
}
