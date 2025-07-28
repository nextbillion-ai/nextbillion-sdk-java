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
import io.nextbillion.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class TripStop
private constructor(
    private val geofenceId: JsonField<String>,
    private val metaData: JsonValue,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("geofence_id")
        @ExcludeMissing
        geofenceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("meta_data") @ExcludeMissing metaData: JsonValue = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(geofenceId, metaData, name, mutableMapOf())

    /**
     * Returns the ID of the geofence that was used to indicate the area to make a stop.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun geofenceId(): Optional<String> = geofenceId.getOptional("geofence_id")

    /** Returns any meta data that was added to provide additional information about the stop. */
    @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonValue = metaData

    /**
     * Returns the name of the stop that was provided when configuring this stop for the trip.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Returns the raw JSON value of [geofenceId].
     *
     * Unlike [geofenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geofence_id") @ExcludeMissing fun _geofenceId(): JsonField<String> = geofenceId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

        /** Returns a mutable builder for constructing an instance of [TripStop]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TripStop]. */
    class Builder internal constructor() {

        private var geofenceId: JsonField<String> = JsonMissing.of()
        private var metaData: JsonValue = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tripStop: TripStop) = apply {
            geofenceId = tripStop.geofenceId
            metaData = tripStop.metaData
            name = tripStop.name
            additionalProperties = tripStop.additionalProperties.toMutableMap()
        }

        /** Returns the ID of the geofence that was used to indicate the area to make a stop. */
        fun geofenceId(geofenceId: String) = geofenceId(JsonField.of(geofenceId))

        /**
         * Sets [Builder.geofenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geofenceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun geofenceId(geofenceId: JsonField<String>) = apply { this.geofenceId = geofenceId }

        /**
         * Returns any meta data that was added to provide additional information about the stop.
         */
        fun metaData(metaData: JsonValue) = apply { this.metaData = metaData }

        /**
         * Returns the name of the stop that was provided when configuring this stop for the trip.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [TripStop].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TripStop =
            TripStop(geofenceId, metaData, name, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): TripStop = apply {
        if (validated) {
            return@apply
        }

        geofenceId()
        name()
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
        (if (geofenceId.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TripStop && geofenceId == other.geofenceId && metaData == other.metaData && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(geofenceId, metaData, name, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TripStop{geofenceId=$geofenceId, metaData=$metaData, name=$name, additionalProperties=$additionalProperties}"
}
