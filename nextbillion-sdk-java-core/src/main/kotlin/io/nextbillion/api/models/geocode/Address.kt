// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.geocode

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

/** Postal address of the result item. */
class Address
private constructor(
    private val city: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val countryName: JsonField<String>,
    private val county: JsonField<String>,
    private val district: JsonField<String>,
    private val houseNumber: JsonField<String>,
    private val label: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val state: JsonField<String>,
    private val stateCode: JsonField<String>,
    private val street: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("countryName")
        @ExcludeMissing
        countryName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("county") @ExcludeMissing county: JsonField<String> = JsonMissing.of(),
        @JsonProperty("district") @ExcludeMissing district: JsonField<String> = JsonMissing.of(),
        @JsonProperty("houseNumber")
        @ExcludeMissing
        houseNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postalCode")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stateCode") @ExcludeMissing stateCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street") @ExcludeMissing street: JsonField<String> = JsonMissing.of(),
    ) : this(
        city,
        countryCode,
        countryName,
        county,
        district,
        houseNumber,
        label,
        postalCode,
        state,
        stateCode,
        street,
        mutableMapOf(),
    )

    /**
     * The name of the primary locality of the place.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun city(): Optional<String> = city.getOptional("city")

    /**
     * A three-letter country code.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

    /**
     * The localised country name.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun countryName(): Optional<String> = countryName.getOptional("countryName")

    /**
     * A division of a state; typically, a secondary-level administrative division of a country or
     * equivalent.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun county(): Optional<String> = county.getOptional("county")

    /**
     * A division of city; typically an administrative unit within a larger city or a customary name
     * of a city's neighborhood.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun district(): Optional<String> = district.getOptional("district")

    /**
     * House number of the returned place, if available.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun houseNumber(): Optional<String> = houseNumber.getOptional("houseNumber")

    /**
     * Assembled address value built out of the address components according to the regional postal
     * rules. These are the same rules for all endpoints. It may not include all the input terms.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * An alphanumeric string included in a postal address to facilitate mail sorting, such as post
     * code, postcode, or ZIP code.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun postalCode(): Optional<String> = postalCode.getOptional("postalCode")

    /**
     * The state division of a country.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * A country specific state code or state name abbreviation. For example, in the United States
     * it is the two letter state abbreviation: "CA" for California.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun stateCode(): Optional<String> = stateCode.getOptional("stateCode")

    /**
     * Name of street of the returned place, if available.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun street(): Optional<String> = street.getOptional("street")

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [countryName].
     *
     * Unlike [countryName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryName") @ExcludeMissing fun _countryName(): JsonField<String> = countryName

    /**
     * Returns the raw JSON value of [county].
     *
     * Unlike [county], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("county") @ExcludeMissing fun _county(): JsonField<String> = county

    /**
     * Returns the raw JSON value of [district].
     *
     * Unlike [district], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("district") @ExcludeMissing fun _district(): JsonField<String> = district

    /**
     * Returns the raw JSON value of [houseNumber].
     *
     * Unlike [houseNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("houseNumber") @ExcludeMissing fun _houseNumber(): JsonField<String> = houseNumber

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postalCode") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    /**
     * Returns the raw JSON value of [stateCode].
     *
     * Unlike [stateCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stateCode") @ExcludeMissing fun _stateCode(): JsonField<String> = stateCode

    /**
     * Returns the raw JSON value of [street].
     *
     * Unlike [street], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("street") @ExcludeMissing fun _street(): JsonField<String> = street

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

        /** Returns a mutable builder for constructing an instance of [Address]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Address]. */
    class Builder internal constructor() {

        private var city: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var countryName: JsonField<String> = JsonMissing.of()
        private var county: JsonField<String> = JsonMissing.of()
        private var district: JsonField<String> = JsonMissing.of()
        private var houseNumber: JsonField<String> = JsonMissing.of()
        private var label: JsonField<String> = JsonMissing.of()
        private var postalCode: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var stateCode: JsonField<String> = JsonMissing.of()
        private var street: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(address: Address) = apply {
            city = address.city
            countryCode = address.countryCode
            countryName = address.countryName
            county = address.county
            district = address.district
            houseNumber = address.houseNumber
            label = address.label
            postalCode = address.postalCode
            state = address.state
            stateCode = address.stateCode
            street = address.street
            additionalProperties = address.additionalProperties.toMutableMap()
        }

        /** The name of the primary locality of the place. */
        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** A three-letter country code. */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        /** The localised country name. */
        fun countryName(countryName: String) = countryName(JsonField.of(countryName))

        /**
         * Sets [Builder.countryName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryName(countryName: JsonField<String>) = apply { this.countryName = countryName }

        /**
         * A division of a state; typically, a secondary-level administrative division of a country
         * or equivalent.
         */
        fun county(county: String) = county(JsonField.of(county))

        /**
         * Sets [Builder.county] to an arbitrary JSON value.
         *
         * You should usually call [Builder.county] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun county(county: JsonField<String>) = apply { this.county = county }

        /**
         * A division of city; typically an administrative unit within a larger city or a customary
         * name of a city's neighborhood.
         */
        fun district(district: String) = district(JsonField.of(district))

        /**
         * Sets [Builder.district] to an arbitrary JSON value.
         *
         * You should usually call [Builder.district] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun district(district: JsonField<String>) = apply { this.district = district }

        /** House number of the returned place, if available. */
        fun houseNumber(houseNumber: String) = houseNumber(JsonField.of(houseNumber))

        /**
         * Sets [Builder.houseNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.houseNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun houseNumber(houseNumber: JsonField<String>) = apply { this.houseNumber = houseNumber }

        /**
         * Assembled address value built out of the address components according to the regional
         * postal rules. These are the same rules for all endpoints. It may not include all the
         * input terms.
         */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /**
         * An alphanumeric string included in a postal address to facilitate mail sorting, such as
         * post code, postcode, or ZIP code.
         */
        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /** The state division of a country. */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /**
         * A country specific state code or state name abbreviation. For example, in the United
         * States it is the two letter state abbreviation: "CA" for California.
         */
        fun stateCode(stateCode: String) = stateCode(JsonField.of(stateCode))

        /**
         * Sets [Builder.stateCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stateCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stateCode(stateCode: JsonField<String>) = apply { this.stateCode = stateCode }

        /** Name of street of the returned place, if available. */
        fun street(street: String) = street(JsonField.of(street))

        /**
         * Sets [Builder.street] to an arbitrary JSON value.
         *
         * You should usually call [Builder.street] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun street(street: JsonField<String>) = apply { this.street = street }

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
         * Returns an immutable instance of [Address].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Address =
            Address(
                city,
                countryCode,
                countryName,
                county,
                district,
                houseNumber,
                label,
                postalCode,
                state,
                stateCode,
                street,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Address = apply {
        if (validated) {
            return@apply
        }

        city()
        countryCode()
        countryName()
        county()
        district()
        houseNumber()
        label()
        postalCode()
        state()
        stateCode()
        street()
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
        (if (city.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (countryName.asKnown().isPresent) 1 else 0) +
            (if (county.asKnown().isPresent) 1 else 0) +
            (if (district.asKnown().isPresent) 1 else 0) +
            (if (houseNumber.asKnown().isPresent) 1 else 0) +
            (if (label.asKnown().isPresent) 1 else 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (if (stateCode.asKnown().isPresent) 1 else 0) +
            (if (street.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Address && city == other.city && countryCode == other.countryCode && countryName == other.countryName && county == other.county && district == other.district && houseNumber == other.houseNumber && label == other.label && postalCode == other.postalCode && state == other.state && stateCode == other.stateCode && street == other.street && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(city, countryCode, countryName, county, district, houseNumber, label, postalCode, state, stateCode, street, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Address{city=$city, countryCode=$countryCode, countryName=$countryName, county=$county, district=$district, houseNumber=$houseNumber, label=$label, postalCode=$postalCode, state=$state, stateCode=$stateCode, street=$street, additionalProperties=$additionalProperties}"
}
