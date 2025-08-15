// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geocode

import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** An array returning the location coordinates of all the access points of the search result. */
class Access
private constructor(
    private val lat: JsonField<Double>,
    private val lng: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lng") @ExcludeMissing lng: JsonField<Double> = JsonMissing.of(),
    ) : this(lat, lng, mutableMapOf())

    /**
     * The latitude of the access point of the search result.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lat(): Optional<Double> = lat.getOptional("lat")

    /**
     * The longitude of the access point of the search result.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lng(): Optional<Double> = lng.getOptional("lng")

    /**
     * Returns the raw JSON value of [lat].
     *
     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

    /**
     * Returns the raw JSON value of [lng].
     *
     * Unlike [lng], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lng") @ExcludeMissing fun _lng(): JsonField<Double> = lng

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

        /** Returns a mutable builder for constructing an instance of [Access]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Access]. */
    class Builder internal constructor() {

        private var lat: JsonField<Double> = JsonMissing.of()
        private var lng: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(access: Access) = apply {
            lat = access.lat
            lng = access.lng
            additionalProperties = access.additionalProperties.toMutableMap()
        }

        /** The latitude of the access point of the search result. */
        fun lat(lat: Double) = lat(JsonField.of(lat))

        /**
         * Sets [Builder.lat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

        /** The longitude of the access point of the search result. */
        fun lng(lng: Double) = lng(JsonField.of(lng))

        /**
         * Sets [Builder.lng] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lng] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lng(lng: JsonField<Double>) = apply { this.lng = lng }

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
         * Returns an immutable instance of [Access].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Access = Access(lat, lng, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): Access = apply {
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

        return other is Access &&
            lat == other.lat &&
            lng == other.lng &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(lat, lng, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Access{lat=$lat, lng=$lng, additionalProperties=$additionalProperties}"
}
