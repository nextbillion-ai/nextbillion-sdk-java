// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.postalcode

import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.checkKnown
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

class PostalcodeRetrieveCoordinatesResponse
private constructor(
    private val places: JsonField<Places>,
    private val warning: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("places") @ExcludeMissing places: JsonField<Places> = JsonMissing.of(),
        @JsonProperty("warning") @ExcludeMissing warning: JsonField<List<String>> = JsonMissing.of(),
    ) : this(places, warning, mutableMapOf())

    /**
     * An object that contains details about the place that was provided in the input.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun places(): Optional<Places> = places.getOptional("places")

    /**
     * Returns a message, in case the input provided triggers any warnings.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun warning(): Optional<List<String>> = warning.getOptional("warning")

    /**
     * Returns the raw JSON value of [places].
     *
     * Unlike [places], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("places") @ExcludeMissing fun _places(): JsonField<Places> = places

    /**
     * Returns the raw JSON value of [warning].
     *
     * Unlike [warning], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("warning") @ExcludeMissing fun _warning(): JsonField<List<String>> = warning

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
         * Returns a mutable builder for constructing an instance of
         * [PostalcodeRetrieveCoordinatesResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PostalcodeRetrieveCoordinatesResponse]. */
    class Builder internal constructor() {

        private var places: JsonField<Places> = JsonMissing.of()
        private var warning: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            postalcodeRetrieveCoordinatesResponse: PostalcodeRetrieveCoordinatesResponse
        ) = apply {
            places = postalcodeRetrieveCoordinatesResponse.places
            warning = postalcodeRetrieveCoordinatesResponse.warning.map { it.toMutableList() }
            additionalProperties =
                postalcodeRetrieveCoordinatesResponse.additionalProperties.toMutableMap()
        }

        /** An object that contains details about the place that was provided in the input. */
        fun places(places: Places) = places(JsonField.of(places))

        /**
         * Sets [Builder.places] to an arbitrary JSON value.
         *
         * You should usually call [Builder.places] with a well-typed [Places] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun places(places: JsonField<Places>) = apply { this.places = places }

        /** Returns a message, in case the input provided triggers any warnings. */
        fun warning(warning: List<String>) = warning(JsonField.of(warning))

        /**
         * Sets [Builder.warning] to an arbitrary JSON value.
         *
         * You should usually call [Builder.warning] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun warning(warning: JsonField<List<String>>) = apply {
            this.warning = warning.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.warning].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWarning(warning: String) = apply {
            this.warning =
                (this.warning ?: JsonField.of(mutableListOf())).also {
                    checkKnown("warning", it).add(warning)
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
         * Returns an immutable instance of [PostalcodeRetrieveCoordinatesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PostalcodeRetrieveCoordinatesResponse =
            PostalcodeRetrieveCoordinatesResponse(
                places,
                (warning ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PostalcodeRetrieveCoordinatesResponse = apply {
        if (validated) {
            return@apply
        }

        places().ifPresent { it.validate() }
        warning()
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
        (places.asKnown().getOrNull()?.validity() ?: 0) + (warning.asKnown().getOrNull()?.size ?: 0)

    /** An object that contains details about the place that was provided in the input. */
    class Places
    private constructor(
        private val address: JsonField<String>,
        private val boundary: JsonField<Boundary>,
        private val country: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val distance: JsonField<Double>,
        private val district: JsonField<String>,
        private val geopoint: JsonField<Geopoint>,
        private val postalcode: JsonField<String>,
        private val state: JsonField<String>,
        private val subdistrict: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
            @JsonProperty("boundary")
            @ExcludeMissing
            boundary: JsonField<Boundary> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("countryCode")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("distance")
            @ExcludeMissing
            distance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("district")
            @ExcludeMissing
            district: JsonField<String> = JsonMissing.of(),
            @JsonProperty("geopoint")
            @ExcludeMissing
            geopoint: JsonField<Geopoint> = JsonMissing.of(),
            @JsonProperty("postalcode")
            @ExcludeMissing
            postalcode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subdistrict")
            @ExcludeMissing
            subdistrict: JsonField<String> = JsonMissing.of(),
        ) : this(
            address,
            boundary,
            country,
            countryCode,
            distance,
            district,
            geopoint,
            postalcode,
            state,
            subdistrict,
            mutableMapOf(),
        )

        /**
         * Returns the address of the postalcode returned.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun address(): Optional<String> = address.getOptional("address")

        /**
         * An object containing the boundary details of the postal code area. This object will not
         * be returned in case the boundary information of the postal code provided is not available
         * (only for selected countries).
         *
         * Please note the contents of this object will change based on the format field in the
         * input. When the format field is not present in the input this object would contain
         * multipolygon - polygon - points objects depending on the boundary of the given postal
         * code. When the format field is present in the input, then the contents of this object
         * would match the
         * [geojson format and standard](https://datatracker.ietf.org/doc/html/rfc7946).
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun boundary(): Optional<Boundary> = boundary.getOptional("boundary")

        /**
         * Name of the country containing the geographic coordinate point / postal code provided in
         * the input request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * Returns the [alpha-3 ISO code](https://www.iban.com/country-codes) of the country
         * containing the postalcode returned.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

        /**
         * This property is returned only when the API is requested to fetch the postal code
         * containing the location coordinate provided in the at input parameter. distance denotes
         * the straight line distance, in meters, from the requested location coordinate to the
         * postal code centroid.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun distance(): Optional<Double> = distance.getOptional("distance")

        /**
         * Name of the district or region containing the geographic coordinate point / postal code
         * provided in the input request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun district(): Optional<String> = district.getOptional("district")

        /**
         * Refers to the geographic coordinate denoting the center of the postal code in latitude,
         * longitude format.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geopoint(): Optional<Geopoint> = geopoint.getOptional("geopoint")

        /**
         * Returns the postal code associated with the requested geographic coordinate point or the
         * postal code itself as provided in the input API request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun postalcode(): Optional<String> = postalcode.getOptional("postalcode")

        /**
         * Name of the state or province containing the geographic coordinate point / postal code
         * provided in the input request.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun state(): Optional<String> = state.getOptional("state")

        /**
         * Name of the sub-district or sub-region containing the postal code or geographic
         * coordinate point / postal code provided in the input request
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun subdistrict(): Optional<String> = subdistrict.getOptional("subdistrict")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

        /**
         * Returns the raw JSON value of [boundary].
         *
         * Unlike [boundary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("boundary") @ExcludeMissing fun _boundary(): JsonField<Boundary> = boundary

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countryCode")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [distance].
         *
         * Unlike [distance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Double> = distance

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
         * Returns the raw JSON value of [postalcode].
         *
         * Unlike [postalcode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postalcode")
        @ExcludeMissing
        fun _postalcode(): JsonField<String> = postalcode

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /**
         * Returns the raw JSON value of [subdistrict].
         *
         * Unlike [subdistrict], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subdistrict")
        @ExcludeMissing
        fun _subdistrict(): JsonField<String> = subdistrict

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

            /** Returns a mutable builder for constructing an instance of [Places]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Places]. */
        class Builder internal constructor() {

            private var address: JsonField<String> = JsonMissing.of()
            private var boundary: JsonField<Boundary> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var distance: JsonField<Double> = JsonMissing.of()
            private var district: JsonField<String> = JsonMissing.of()
            private var geopoint: JsonField<Geopoint> = JsonMissing.of()
            private var postalcode: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var subdistrict: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(places: Places) = apply {
                address = places.address
                boundary = places.boundary
                country = places.country
                countryCode = places.countryCode
                distance = places.distance
                district = places.district
                geopoint = places.geopoint
                postalcode = places.postalcode
                state = places.state
                subdistrict = places.subdistrict
                additionalProperties = places.additionalProperties.toMutableMap()
            }

            /** Returns the address of the postalcode returned. */
            fun address(address: String) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            /**
             * An object containing the boundary details of the postal code area. This object will
             * not be returned in case the boundary information of the postal code provided is not
             * available (only for selected countries).
             *
             * Please note the contents of this object will change based on the format field in the
             * input. When the format field is not present in the input this object would contain
             * multipolygon - polygon - points objects depending on the boundary of the given postal
             * code. When the format field is present in the input, then the contents of this object
             * would match the
             * [geojson format and standard](https://datatracker.ietf.org/doc/html/rfc7946).
             */
            fun boundary(boundary: Boundary) = boundary(JsonField.of(boundary))

            /**
             * Sets [Builder.boundary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.boundary] with a well-typed [Boundary] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun boundary(boundary: JsonField<Boundary>) = apply { this.boundary = boundary }

            /**
             * Name of the country containing the geographic coordinate point / postal code provided
             * in the input request.
             */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /**
             * Returns the [alpha-3 ISO code](https://www.iban.com/country-codes) of the country
             * containing the postalcode returned.
             */
            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
            }

            /**
             * This property is returned only when the API is requested to fetch the postal code
             * containing the location coordinate provided in the at input parameter. distance
             * denotes the straight line distance, in meters, from the requested location coordinate
             * to the postal code centroid.
             */
            fun distance(distance: Double) = distance(JsonField.of(distance))

            /**
             * Sets [Builder.distance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distance] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

            /**
             * Name of the district or region containing the geographic coordinate point / postal
             * code provided in the input request.
             */
            fun district(district: String) = district(JsonField.of(district))

            /**
             * Sets [Builder.district] to an arbitrary JSON value.
             *
             * You should usually call [Builder.district] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun district(district: JsonField<String>) = apply { this.district = district }

            /**
             * Refers to the geographic coordinate denoting the center of the postal code in
             * latitude, longitude format.
             */
            fun geopoint(geopoint: Geopoint) = geopoint(JsonField.of(geopoint))

            /**
             * Sets [Builder.geopoint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geopoint] with a well-typed [Geopoint] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geopoint(geopoint: JsonField<Geopoint>) = apply { this.geopoint = geopoint }

            /**
             * Returns the postal code associated with the requested geographic coordinate point or
             * the postal code itself as provided in the input API request.
             */
            fun postalcode(postalcode: String) = postalcode(JsonField.of(postalcode))

            /**
             * Sets [Builder.postalcode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalcode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalcode(postalcode: JsonField<String>) = apply { this.postalcode = postalcode }

            /**
             * Name of the state or province containing the geographic coordinate point / postal
             * code provided in the input request.
             */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /**
             * Name of the sub-district or sub-region containing the postal code or geographic
             * coordinate point / postal code provided in the input request
             */
            fun subdistrict(subdistrict: String) = subdistrict(JsonField.of(subdistrict))

            /**
             * Sets [Builder.subdistrict] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subdistrict] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subdistrict(subdistrict: JsonField<String>) = apply {
                this.subdistrict = subdistrict
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
             * Returns an immutable instance of [Places].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Places =
                Places(
                    address,
                    boundary,
                    country,
                    countryCode,
                    distance,
                    district,
                    geopoint,
                    postalcode,
                    state,
                    subdistrict,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Places = apply {
            if (validated) {
                return@apply
            }

            address()
            boundary().ifPresent { it.validate() }
            country()
            countryCode()
            distance()
            district()
            geopoint().ifPresent { it.validate() }
            postalcode()
            state()
            subdistrict()
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
            (if (address.asKnown().isPresent) 1 else 0) +
                (boundary.asKnown().getOrNull()?.validity() ?: 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (distance.asKnown().isPresent) 1 else 0) +
                (if (district.asKnown().isPresent) 1 else 0) +
                (geopoint.asKnown().getOrNull()?.validity() ?: 0) +
                (if (postalcode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0) +
                (if (subdistrict.asKnown().isPresent) 1 else 0)

        /**
         * An object containing the boundary details of the postal code area. This object will not
         * be returned in case the boundary information of the postal code provided is not available
         * (only for selected countries).
         *
         * Please note the contents of this object will change based on the format field in the
         * input. When the format field is not present in the input this object would contain
         * multipolygon - polygon - points objects depending on the boundary of the given postal
         * code. When the format field is present in the input, then the contents of this object
         * would match the
         * [geojson format and standard](https://datatracker.ietf.org/doc/html/rfc7946).
         */
        class Boundary
        private constructor(
            private val geometry: JsonField<Geometry>,
            private val multipolygon: JsonField<List<Multipolygon>>,
            private val properties: JsonField<String>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("geometry")
                @ExcludeMissing
                geometry: JsonField<Geometry> = JsonMissing.of(),
                @JsonProperty("multipolygon")
                @ExcludeMissing
                multipolygon: JsonField<List<Multipolygon>> = JsonMissing.of(),
                @JsonProperty("properties")
                @ExcludeMissing
                properties: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(geometry, multipolygon, properties, type, mutableMapOf())

            /**
             * An object with geoJSON details of the boundary. This object is returned when the
             * format field is set to geojson in the input request, otherwise it is not present in
             * the response. The contents of this object follow the
             * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun geometry(): Optional<Geometry> = geometry.getOptional("geometry")

            /**
             * An array of objects containing information about all the polygons forming the postal
             * code area. In case, the postal code area is formed by multiple polygons not
             * containing each other, a matching count of polygon objects will be returned.
             *
             * Please note that this object is returned only when format field is not specified in
             * the input, otherwise it is not present in the response.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun multipolygon(): Optional<List<Multipolygon>> =
                multipolygon.getOptional("multipolygon")

            /**
             * Property associated with the geoJSON shape.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun properties(): Optional<String> = properties.getOptional("properties")

            /**
             * Type of the geoJSON object. This parameter is returned when the format field is set
             * to geojson in the input request, otherwise it is not present in the response. The
             * contents of this object follow the
             * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [geometry].
             *
             * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("geometry")
            @ExcludeMissing
            fun _geometry(): JsonField<Geometry> = geometry

            /**
             * Returns the raw JSON value of [multipolygon].
             *
             * Unlike [multipolygon], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("multipolygon")
            @ExcludeMissing
            fun _multipolygon(): JsonField<List<Multipolygon>> = multipolygon

            /**
             * Returns the raw JSON value of [properties].
             *
             * Unlike [properties], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("properties")
            @ExcludeMissing
            fun _properties(): JsonField<String> = properties

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [Boundary]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Boundary]. */
            class Builder internal constructor() {

                private var geometry: JsonField<Geometry> = JsonMissing.of()
                private var multipolygon: JsonField<MutableList<Multipolygon>>? = null
                private var properties: JsonField<String> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(boundary: Boundary) = apply {
                    geometry = boundary.geometry
                    multipolygon = boundary.multipolygon.map { it.toMutableList() }
                    properties = boundary.properties
                    type = boundary.type
                    additionalProperties = boundary.additionalProperties.toMutableMap()
                }

                /**
                 * An object with geoJSON details of the boundary. This object is returned when the
                 * format field is set to geojson in the input request, otherwise it is not present
                 * in the response. The contents of this object follow the
                 * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
                 */
                fun geometry(geometry: Geometry) = geometry(JsonField.of(geometry))

                /**
                 * Sets [Builder.geometry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.geometry] with a well-typed [Geometry] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun geometry(geometry: JsonField<Geometry>) = apply { this.geometry = geometry }

                /**
                 * An array of objects containing information about all the polygons forming the
                 * postal code area. In case, the postal code area is formed by multiple polygons
                 * not containing each other, a matching count of polygon objects will be returned.
                 *
                 * Please note that this object is returned only when format field is not specified
                 * in the input, otherwise it is not present in the response.
                 */
                fun multipolygon(multipolygon: List<Multipolygon>) =
                    multipolygon(JsonField.of(multipolygon))

                /**
                 * Sets [Builder.multipolygon] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.multipolygon] with a well-typed
                 * `List<Multipolygon>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun multipolygon(multipolygon: JsonField<List<Multipolygon>>) = apply {
                    this.multipolygon = multipolygon.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Multipolygon] to [Builder.multipolygon].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMultipolygon(multipolygon: Multipolygon) = apply {
                    this.multipolygon =
                        (this.multipolygon ?: JsonField.of(mutableListOf())).also {
                            checkKnown("multipolygon", it).add(multipolygon)
                        }
                }

                /** Property associated with the geoJSON shape. */
                fun properties(properties: String) = properties(JsonField.of(properties))

                /**
                 * Sets [Builder.properties] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.properties] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun properties(properties: JsonField<String>) = apply {
                    this.properties = properties
                }

                /**
                 * Type of the geoJSON object. This parameter is returned when the format field is
                 * set to geojson in the input request, otherwise it is not present in the response.
                 * The contents of this object follow the
                 * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
                 */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Boundary].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Boundary =
                    Boundary(
                        geometry,
                        (multipolygon ?: JsonMissing.of()).map { it.toImmutable() },
                        properties,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Boundary = apply {
                if (validated) {
                    return@apply
                }

                geometry().ifPresent { it.validate() }
                multipolygon().ifPresent { it.forEach { it.validate() } }
                properties()
                type()
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
                (geometry.asKnown().getOrNull()?.validity() ?: 0) +
                    (multipolygon.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (properties.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            /**
             * An object with geoJSON details of the boundary. This object is returned when the
             * format field is set to geojson in the input request, otherwise it is not present in
             * the response. The contents of this object follow the
             * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
             */
            class Geometry
            private constructor(
                private val coordinates: JsonField<List<List<List<Double>>>>,
                private val type: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("coordinates")
                    @ExcludeMissing
                    coordinates: JsonField<List<List<List<Double>>>> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                ) : this(coordinates, type, mutableMapOf())

                /**
                 * An array of coordinates in the [longitude, latitude] format, representing the
                 * coordinates points which lie on the boundary of the postal code area.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun coordinates(): Optional<List<List<List<Double>>>> =
                    coordinates.getOptional("coordinates")

                /**
                 * Type of the geoJSON geometry.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun type(): Optional<String> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [coordinates].
                 *
                 * Unlike [coordinates], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("coordinates")
                @ExcludeMissing
                fun _coordinates(): JsonField<List<List<List<Double>>>> = coordinates

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                    private var coordinates: JsonField<MutableList<List<List<Double>>>>? = null
                    private var type: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(geometry: Geometry) = apply {
                        coordinates = geometry.coordinates.map { it.toMutableList() }
                        type = geometry.type
                        additionalProperties = geometry.additionalProperties.toMutableMap()
                    }

                    /**
                     * An array of coordinates in the [longitude, latitude] format, representing the
                     * coordinates points which lie on the boundary of the postal code area.
                     */
                    fun coordinates(coordinates: List<List<List<Double>>>) =
                        coordinates(JsonField.of(coordinates))

                    /**
                     * Sets [Builder.coordinates] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.coordinates] with a well-typed
                     * `List<List<List<Double>>>` value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun coordinates(coordinates: JsonField<List<List<List<Double>>>>) = apply {
                        this.coordinates = coordinates.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [List<List<Double>>] to [coordinates].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addCoordinate(coordinate: List<List<Double>>) = apply {
                        coordinates =
                            (coordinates ?: JsonField.of(mutableListOf())).also {
                                checkKnown("coordinates", it).add(coordinate)
                            }
                    }

                    /** Type of the geoJSON geometry. */
                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

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
                    type()
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
                    (coordinates.asKnown().getOrNull()?.sumOf {
                        it.sumOf { it.size.toInt() }.toInt()
                    } ?: 0) + (if (type.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Geometry && coordinates == other.coordinates && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(coordinates, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Geometry{coordinates=$coordinates, type=$type, additionalProperties=$additionalProperties}"
            }

            class Multipolygon
            private constructor(
                private val polygon: JsonField<List<Polygon>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("polygon")
                    @ExcludeMissing
                    polygon: JsonField<List<Polygon>> = JsonMissing.of()
                ) : this(polygon, mutableMapOf())

                /**
                 * An object containing the details of a single polygon that is a part of the postal
                 * code area. In case the postal code area contains other polygon(s), the details of
                 * such polygon(s) would be returned through an array of points object.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun polygon(): Optional<List<Polygon>> = polygon.getOptional("polygon")

                /**
                 * Returns the raw JSON value of [polygon].
                 *
                 * Unlike [polygon], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("polygon")
                @ExcludeMissing
                fun _polygon(): JsonField<List<Polygon>> = polygon

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

                    /** Returns a mutable builder for constructing an instance of [Multipolygon]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Multipolygon]. */
                class Builder internal constructor() {

                    private var polygon: JsonField<MutableList<Polygon>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(multipolygon: Multipolygon) = apply {
                        polygon = multipolygon.polygon.map { it.toMutableList() }
                        additionalProperties = multipolygon.additionalProperties.toMutableMap()
                    }

                    /**
                     * An object containing the details of a single polygon that is a part of the
                     * postal code area. In case the postal code area contains other polygon(s), the
                     * details of such polygon(s) would be returned through an array of points
                     * object.
                     */
                    fun polygon(polygon: List<Polygon>) = polygon(JsonField.of(polygon))

                    /**
                     * Sets [Builder.polygon] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.polygon] with a well-typed `List<Polygon>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun polygon(polygon: JsonField<List<Polygon>>) = apply {
                        this.polygon = polygon.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Polygon] to [Builder.polygon].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addPolygon(polygon: Polygon) = apply {
                        this.polygon =
                            (this.polygon ?: JsonField.of(mutableListOf())).also {
                                checkKnown("polygon", it).add(polygon)
                            }
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
                     * Returns an immutable instance of [Multipolygon].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Multipolygon =
                        Multipolygon(
                            (polygon ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Multipolygon = apply {
                    if (validated) {
                        return@apply
                    }

                    polygon().ifPresent { it.forEach { it.validate() } }
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
                    (polygon.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                class Polygon
                private constructor(
                    private val points: JsonField<List<Point>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("points")
                        @ExcludeMissing
                        points: JsonField<List<Point>> = JsonMissing.of()
                    ) : this(points, mutableMapOf())

                    /**
                     * Represents an array of geographic coordinates that define a polygon boundary.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun points(): Optional<List<Point>> = points.getOptional("points")

                    /**
                     * Returns the raw JSON value of [points].
                     *
                     * Unlike [points], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("points")
                    @ExcludeMissing
                    fun _points(): JsonField<List<Point>> = points

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

                        /** Returns a mutable builder for constructing an instance of [Polygon]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Polygon]. */
                    class Builder internal constructor() {

                        private var points: JsonField<MutableList<Point>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(polygon: Polygon) = apply {
                            points = polygon.points.map { it.toMutableList() }
                            additionalProperties = polygon.additionalProperties.toMutableMap()
                        }

                        /**
                         * Represents an array of geographic coordinates that define a polygon
                         * boundary.
                         */
                        fun points(points: List<Point>) = points(JsonField.of(points))

                        /**
                         * Sets [Builder.points] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.points] with a well-typed `List<Point>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun points(points: JsonField<List<Point>>) = apply {
                            this.points = points.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Point] to [points].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addPoint(point: Point) = apply {
                            points =
                                (points ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("points", it).add(point)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Polygon].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Polygon =
                            Polygon(
                                (points ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Polygon = apply {
                        if (validated) {
                            return@apply
                        }

                        points().ifPresent { it.forEach { it.validate() } }
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
                        (points.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                    class Point
                    private constructor(
                        private val lat: JsonField<Double>,
                        private val lng: JsonField<Double>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("lat")
                            @ExcludeMissing
                            lat: JsonField<Double> = JsonMissing.of(),
                            @JsonProperty("lng")
                            @ExcludeMissing
                            lng: JsonField<Double> = JsonMissing.of(),
                        ) : this(lat, lng, mutableMapOf())

                        /**
                         * Latitude of the coordinate.
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun lat(): Optional<Double> = lat.getOptional("lat")

                        /**
                         * Longitude of the coordinate.
                         *
                         * @throws NextbillionSdkInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun lng(): Optional<Double> = lng.getOptional("lng")

                        /**
                         * Returns the raw JSON value of [lat].
                         *
                         * Unlike [lat], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

                        /**
                         * Returns the raw JSON value of [lng].
                         *
                         * Unlike [lng], this method doesn't throw if the JSON field has an
                         * unexpected type.
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

                            /**
                             * Returns a mutable builder for constructing an instance of [Point].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Point]. */
                        class Builder internal constructor() {

                            private var lat: JsonField<Double> = JsonMissing.of()
                            private var lng: JsonField<Double> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(point: Point) = apply {
                                lat = point.lat
                                lng = point.lng
                                additionalProperties = point.additionalProperties.toMutableMap()
                            }

                            /** Latitude of the coordinate. */
                            fun lat(lat: Double) = lat(JsonField.of(lat))

                            /**
                             * Sets [Builder.lat] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.lat] with a well-typed [Double]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                            /** Longitude of the coordinate. */
                            fun lng(lng: Double) = lng(JsonField.of(lng))

                            /**
                             * Sets [Builder.lng] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.lng] with a well-typed [Double]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun lng(lng: JsonField<Double>) = apply { this.lng = lng }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Point].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Point =
                                Point(lat, lng, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        fun validate(): Point = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (lat.asKnown().isPresent) 1 else 0) +
                                (if (lng.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Point && lat == other.lat && lng == other.lng && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(lat, lng, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Point{lat=$lat, lng=$lng, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Polygon && points == other.points && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(points, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Polygon{points=$points, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Multipolygon && polygon == other.polygon && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(polygon, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Multipolygon{polygon=$polygon, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Boundary && geometry == other.geometry && multipolygon == other.multipolygon && properties == other.properties && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(geometry, multipolygon, properties, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Boundary{geometry=$geometry, multipolygon=$multipolygon, properties=$properties, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * Refers to the geographic coordinate denoting the center of the postal code in latitude,
         * longitude format.
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
             * Latitude of the location.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lat(): Optional<Double> = lat.getOptional("lat")

            /**
             * Longitude of the location.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
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

                /** Latitude of the location. */
                fun lat(lat: Double) = lat(JsonField.of(lat))

                /**
                 * Sets [Builder.lat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lat] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                /** Longitude of the location. */
                fun lng(lng: Double) = lng(JsonField.of(lng))

                /**
                 * Sets [Builder.lng] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lng] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lng(lng: JsonField<Double>) = apply { this.lng = lng }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Places && address == other.address && boundary == other.boundary && country == other.country && countryCode == other.countryCode && distance == other.distance && district == other.district && geopoint == other.geopoint && postalcode == other.postalcode && state == other.state && subdistrict == other.subdistrict && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, boundary, country, countryCode, distance, district, geopoint, postalcode, state, subdistrict, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Places{address=$address, boundary=$boundary, country=$country, countryCode=$countryCode, distance=$distance, district=$district, geopoint=$geopoint, postalcode=$postalcode, state=$state, subdistrict=$subdistrict, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PostalcodeRetrieveCoordinatesResponse && places == other.places && warning == other.warning && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(places, warning, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PostalcodeRetrieveCoordinatesResponse{places=$places, warning=$warning, additionalProperties=$additionalProperties}"
}
