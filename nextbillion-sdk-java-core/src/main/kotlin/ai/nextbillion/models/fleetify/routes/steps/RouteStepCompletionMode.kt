// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.routes.steps

import ai.nextbillion.core.Enum
import ai.nextbillion.core.JsonField
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * Specify the mode of completion to be used for the step. Currently, following values are allowed:
 * - `manual`: Steps must be marked as completed manually through the Driver App.
 * - `geofence`: Steps are marked as completed automatically based on the entry conditions and
 *   geofence specified.
 * - `geofence_manual_fallback`: Steps will be marked as completed automatically based on geofence
 *   and entry condition configurations but there will also be a provision for manually updating the
 *   status in case, geofence detection fails.
 */
class RouteStepCompletionMode
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val MANUAL = of("`manual`")

        @JvmField val GEOFENCE = of("`geofence`")

        @JvmField val GEOFENCE_MANUAL_FALLBACK = of("`geofence_manual_fallback`")

        @JvmStatic fun of(value: String) = RouteStepCompletionMode(JsonField.of(value))
    }

    /** An enum containing [RouteStepCompletionMode]'s known values. */
    enum class Known {
        MANUAL,
        GEOFENCE,
        GEOFENCE_MANUAL_FALLBACK,
    }

    /**
     * An enum containing [RouteStepCompletionMode]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [RouteStepCompletionMode] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        MANUAL,
        GEOFENCE,
        GEOFENCE_MANUAL_FALLBACK,
        /**
         * An enum member indicating that [RouteStepCompletionMode] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            MANUAL -> Value.MANUAL
            GEOFENCE -> Value.GEOFENCE
            GEOFENCE_MANUAL_FALLBACK -> Value.GEOFENCE_MANUAL_FALLBACK
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws NextbillionSdkInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            MANUAL -> Known.MANUAL
            GEOFENCE -> Known.GEOFENCE
            GEOFENCE_MANUAL_FALLBACK -> Known.GEOFENCE_MANUAL_FALLBACK
            else ->
                throw NextbillionSdkInvalidDataException("Unknown RouteStepCompletionMode: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws NextbillionSdkInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow {
            NextbillionSdkInvalidDataException("Value is not a String")
        }

    private var validated: Boolean = false

    fun validate(): RouteStepCompletionMode = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RouteStepCompletionMode && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
