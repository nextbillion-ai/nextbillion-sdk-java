// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.multigeocode.place

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
import kotlin.jvm.optionals.getOrNull

class PlaceItem
private constructor(
    private val address: JsonField<String>,
    private val building: JsonField<String>,
    private val city: JsonField<String>,
    private val country: JsonField<String>,
    private val district: JsonField<String>,
    private val geopoint: JsonField<Geopoint>,
    private val house: JsonField<String>,
    private val poi: JsonField<Poi>,
    private val postalCode: JsonField<String>,
    private val state: JsonField<String>,
    private val street: JsonField<String>,
    private val subDistrict: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
        @JsonProperty("building") @ExcludeMissing building: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("district") @ExcludeMissing district: JsonField<String> = JsonMissing.of(),
        @JsonProperty("geopoint") @ExcludeMissing geopoint: JsonField<Geopoint> = JsonMissing.of(),
        @JsonProperty("house") @ExcludeMissing house: JsonField<String> = JsonMissing.of(),
        @JsonProperty("poi") @ExcludeMissing poi: JsonField<Poi> = JsonMissing.of(),
        @JsonProperty("postalCode")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street") @ExcludeMissing street: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subDistrict")
        @ExcludeMissing
        subDistrict: JsonField<String> = JsonMissing.of(),
    ) : this(
        address,
        building,
        city,
        country,
        district,
        geopoint,
        house,
        poi,
        postalCode,
        state,
        street,
        subDistrict,
        mutableMapOf(),
    )

    /**
     * This parameter represents the complete address of the place, including the street, city,
     * state, postal code and country.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun address(): Optional<String> = address.getOptional("address")

    /**
     * This parameter represents additional building information if applicable.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun building(): Optional<String> = building.getOptional("building")

    /**
     * This parameter represents the city or town of the place.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun city(): Optional<String> = city.getOptional("city")

    /**
     * This parameter represents the country of the place.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun country(): Optional<String> = country.getOptional("country")

    /**
     * This parameter represents the district of the place.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun district(): Optional<String> = district.getOptional("district")

    /**
     * This parameter represents the geographical coordinates of the place. It includes the latitude
     * and longitude values.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun geopoint(): Optional<Geopoint> = geopoint.getOptional("geopoint")

    /**
     * This parameter represents the house or building number of the place.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun house(): Optional<String> = house.getOptional("house")

    /**
     * This parameter represents a point of interest within the place. A Point of Interest (POI)
     * refers to a specific location or area that is of interest to individuals for various reasons.
     * It could be a landmark, tourist attraction, business, or any other location that people might
     * find important or intriguing.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun poi(): Optional<Poi> = poi.getOptional("poi")

    /**
     * This parameter represents the postal code or ZIP code of the place.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun postalCode(): Optional<String> = postalCode.getOptional("postalCode")

    /**
     * This parameter represents the state or region of the place.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * This parameter represents the street name of the place.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun street(): Optional<String> = street.getOptional("street")

    /**
     * This parameter represents the sub-district or locality of the place.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subDistrict(): Optional<String> = subDistrict.getOptional("subDistrict")

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

    /**
     * Returns the raw JSON value of [building].
     *
     * Unlike [building], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("building") @ExcludeMissing fun _building(): JsonField<String> = building

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [district].
     *
     * Unlike [district], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("district") @ExcludeMissing fun _district(): JsonField<String> = district

    /**
     * Returns the raw JSON value of [geopoint].
     *
     * Unlike [geopoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geopoint") @ExcludeMissing fun _geopoint(): JsonField<Geopoint> = geopoint

    /**
     * Returns the raw JSON value of [house].
     *
     * Unlike [house], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("house") @ExcludeMissing fun _house(): JsonField<String> = house

    /**
     * Returns the raw JSON value of [poi].
     *
     * Unlike [poi], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("poi") @ExcludeMissing fun _poi(): JsonField<Poi> = poi

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
     * Returns the raw JSON value of [street].
     *
     * Unlike [street], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("street") @ExcludeMissing fun _street(): JsonField<String> = street

    /**
     * Returns the raw JSON value of [subDistrict].
     *
     * Unlike [subDistrict], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subDistrict") @ExcludeMissing fun _subDistrict(): JsonField<String> = subDistrict

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

        /** Returns a mutable builder for constructing an instance of [PlaceItem]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlaceItem]. */
    class Builder internal constructor() {

        private var address: JsonField<String> = JsonMissing.of()
        private var building: JsonField<String> = JsonMissing.of()
        private var city: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var district: JsonField<String> = JsonMissing.of()
        private var geopoint: JsonField<Geopoint> = JsonMissing.of()
        private var house: JsonField<String> = JsonMissing.of()
        private var poi: JsonField<Poi> = JsonMissing.of()
        private var postalCode: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var street: JsonField<String> = JsonMissing.of()
        private var subDistrict: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(placeItem: PlaceItem) = apply {
            address = placeItem.address
            building = placeItem.building
            city = placeItem.city
            country = placeItem.country
            district = placeItem.district
            geopoint = placeItem.geopoint
            house = placeItem.house
            poi = placeItem.poi
            postalCode = placeItem.postalCode
            state = placeItem.state
            street = placeItem.street
            subDistrict = placeItem.subDistrict
            additionalProperties = placeItem.additionalProperties.toMutableMap()
        }

        /**
         * This parameter represents the complete address of the place, including the street, city,
         * state, postal code and country.
         */
        fun address(address: String) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<String>) = apply { this.address = address }

        /** This parameter represents additional building information if applicable. */
        fun building(building: String) = building(JsonField.of(building))

        /**
         * Sets [Builder.building] to an arbitrary JSON value.
         *
         * You should usually call [Builder.building] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun building(building: JsonField<String>) = apply { this.building = building }

        /** This parameter represents the city or town of the place. */
        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** This parameter represents the country of the place. */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** This parameter represents the district of the place. */
        fun district(district: String) = district(JsonField.of(district))

        /**
         * Sets [Builder.district] to an arbitrary JSON value.
         *
         * You should usually call [Builder.district] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun district(district: JsonField<String>) = apply { this.district = district }

        /**
         * This parameter represents the geographical coordinates of the place. It includes the
         * latitude and longitude values.
         */
        fun geopoint(geopoint: Geopoint) = geopoint(JsonField.of(geopoint))

        /**
         * Sets [Builder.geopoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geopoint] with a well-typed [Geopoint] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun geopoint(geopoint: JsonField<Geopoint>) = apply { this.geopoint = geopoint }

        /** This parameter represents the house or building number of the place. */
        fun house(house: String) = house(JsonField.of(house))

        /**
         * Sets [Builder.house] to an arbitrary JSON value.
         *
         * You should usually call [Builder.house] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun house(house: JsonField<String>) = apply { this.house = house }

        /**
         * This parameter represents a point of interest within the place. A Point of Interest (POI)
         * refers to a specific location or area that is of interest to individuals for various
         * reasons. It could be a landmark, tourist attraction, business, or any other location that
         * people might find important or intriguing.
         */
        fun poi(poi: Poi) = poi(JsonField.of(poi))

        /**
         * Sets [Builder.poi] to an arbitrary JSON value.
         *
         * You should usually call [Builder.poi] with a well-typed [Poi] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun poi(poi: JsonField<Poi>) = apply { this.poi = poi }

        /** This parameter represents the postal code or ZIP code of the place. */
        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /** This parameter represents the state or region of the place. */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /** This parameter represents the street name of the place. */
        fun street(street: String) = street(JsonField.of(street))

        /**
         * Sets [Builder.street] to an arbitrary JSON value.
         *
         * You should usually call [Builder.street] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun street(street: JsonField<String>) = apply { this.street = street }

        /** This parameter represents the sub-district or locality of the place. */
        fun subDistrict(subDistrict: String) = subDistrict(JsonField.of(subDistrict))

        /**
         * Sets [Builder.subDistrict] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subDistrict] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subDistrict(subDistrict: JsonField<String>) = apply { this.subDistrict = subDistrict }

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
         * Returns an immutable instance of [PlaceItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlaceItem =
            PlaceItem(
                address,
                building,
                city,
                country,
                district,
                geopoint,
                house,
                poi,
                postalCode,
                state,
                street,
                subDistrict,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PlaceItem = apply {
        if (validated) {
            return@apply
        }

        address()
        building()
        city()
        country()
        district()
        geopoint().ifPresent { it.validate() }
        house()
        poi().ifPresent { it.validate() }
        postalCode()
        state()
        street()
        subDistrict()
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
        (if (address.asKnown().isPresent) 1 else 0) +
            (if (building.asKnown().isPresent) 1 else 0) +
            (if (city.asKnown().isPresent) 1 else 0) +
            (if (country.asKnown().isPresent) 1 else 0) +
            (if (district.asKnown().isPresent) 1 else 0) +
            (geopoint.asKnown().getOrNull()?.validity() ?: 0) +
            (if (house.asKnown().isPresent) 1 else 0) +
            (poi.asKnown().getOrNull()?.validity() ?: 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (if (street.asKnown().isPresent) 1 else 0) +
            (if (subDistrict.asKnown().isPresent) 1 else 0)

    /**
     * This parameter represents the geographical coordinates of the place. It includes the latitude
     * and longitude values.
     */
    class Geopoint
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
         * This parameter represents the latitude value of the place.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lat(): Optional<Double> = lat.getOptional("lat")

        /**
         * This parameter represents the longitude value of the place.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
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

            /** Returns a mutable builder for constructing an instance of [Geopoint]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Geopoint]. */
        class Builder internal constructor() {

            private var lat: JsonField<Double> = JsonMissing.of()
            private var lng: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(geopoint: Geopoint) = apply {
                lat = geopoint.lat
                lng = geopoint.lng
                additionalProperties = geopoint.additionalProperties.toMutableMap()
            }

            /** This parameter represents the latitude value of the place. */
            fun lat(lat: Double) = lat(JsonField.of(lat))

            /**
             * Sets [Builder.lat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

            /** This parameter represents the longitude value of the place. */
            fun lng(lng: Double) = lng(JsonField.of(lng))

            /**
             * Sets [Builder.lng] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lng] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Geopoint].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Geopoint = Geopoint(lat, lng, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Geopoint = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return /* spotless:off */ other is Geopoint && lat == other.lat && lng == other.lng && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(lat, lng, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Geopoint{lat=$lat, lng=$lng, additionalProperties=$additionalProperties}"
    }

    /**
     * This parameter represents a point of interest within the place. A Point of Interest (POI)
     * refers to a specific location or area that is of interest to individuals for various reasons.
     * It could be a landmark, tourist attraction, business, or any other location that people might
     * find important or intriguing.
     */
    class Poi
    private constructor(
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of()
        ) : this(title, mutableMapOf())

        /**
         * A title that describes the point of interest.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

            /** Returns a mutable builder for constructing an instance of [Poi]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Poi]. */
        class Builder internal constructor() {

            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(poi: Poi) = apply {
                title = poi.title
                additionalProperties = poi.additionalProperties.toMutableMap()
            }

            /** A title that describes the point of interest. */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * Returns an immutable instance of [Poi].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Poi = Poi(title, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Poi = apply {
            if (validated) {
                return@apply
            }

            title()
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
        @JvmSynthetic internal fun validity(): Int = (if (title.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Poi && title == other.title && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(title, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Poi{title=$title, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlaceItem && address == other.address && building == other.building && city == other.city && country == other.country && district == other.district && geopoint == other.geopoint && house == other.house && poi == other.poi && postalCode == other.postalCode && state == other.state && street == other.street && subDistrict == other.subDistrict && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(address, building, city, country, district, geopoint, house, poi, postalCode, state, street, subDistrict, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlaceItem{address=$address, building=$building, city=$city, country=$country, district=$district, geopoint=$geopoint, house=$house, poi=$poi, postalCode=$postalCode, state=$state, street=$street, subDistrict=$subDistrict, additionalProperties=$additionalProperties}"
}
