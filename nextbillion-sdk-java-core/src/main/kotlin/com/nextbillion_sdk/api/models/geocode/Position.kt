// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.geocode

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.nextbillion_sdk.api.core.ExcludeMissing
import com.nextbillion_sdk.api.core.JsonField
import com.nextbillion_sdk.api.core.JsonMissing
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Returns the location coordinates of the result. */
class Position
private constructor(
    private val lat: JsonField<String>,
    private val lng: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lng") @ExcludeMissing lng: JsonField<String> = JsonMissing.of(),
    ) : this(lat, lng, mutableMapOf())

    /**
     * The latitude of the searched place.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lat(): Optional<String> = lat.getOptional("lat")

    /**
     * The longitude of the searched place.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lng(): Optional<String> = lng.getOptional("lng")

    /**
     * Returns the raw JSON value of [lat].
     *
     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<String> = lat

    /**
     * Returns the raw JSON value of [lng].
     *
     * Unlike [lng], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lng") @ExcludeMissing fun _lng(): JsonField<String> = lng

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

        /** Returns a mutable builder for constructing an instance of [Position]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Position]. */
    class Builder internal constructor() {

        private var lat: JsonField<String> = JsonMissing.of()
        private var lng: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(position: Position) = apply {
            lat = position.lat
            lng = position.lng
            additionalProperties = position.additionalProperties.toMutableMap()
        }

        /** The latitude of the searched place. */
        fun lat(lat: String) = lat(JsonField.of(lat))

        /**
         * Sets [Builder.lat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lat] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lat(lat: JsonField<String>) = apply { this.lat = lat }

        /** The longitude of the searched place. */
        fun lng(lng: String) = lng(JsonField.of(lng))

        /**
         * Sets [Builder.lng] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lng] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lng(lng: JsonField<String>) = apply { this.lng = lng }

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
         * Returns an immutable instance of [Position].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Position = Position(lat, lng, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): Position = apply {
        if (validated) {
            return@apply
        }

        lat()
        lng()
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
        (if (lat.asKnown().isPresent) 1 else 0) + (if (lng.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Position && lat == other.lat && lng == other.lng && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(lat, lng, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Position{lat=$lat, lng=$lng, additionalProperties=$additionalProperties}"
}
