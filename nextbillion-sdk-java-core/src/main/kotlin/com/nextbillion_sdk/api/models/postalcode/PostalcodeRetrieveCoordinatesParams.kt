// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.postalcode

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.nextbillion_sdk.api.core.Enum
import com.nextbillion_sdk.api.core.ExcludeMissing
import com.nextbillion_sdk.api.core.JsonField
import com.nextbillion_sdk.api.core.JsonMissing
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.Params
import com.nextbillion_sdk.api.core.checkRequired
import com.nextbillion_sdk.api.core.http.Headers
import com.nextbillion_sdk.api.core.http.QueryParams
import com.nextbillion_sdk.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve coordinates by postal code */
class PostalcodeRetrieveCoordinatesParams
private constructor(
    private val key: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * Location coordinates that you want to get the postal code of. If not providing `postalcode`
     * in the request, `at` becomes mandatory. Please note that only 1 point can be requested.
     * [See this example](#note).
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun at(): Optional<At> = body.at()

    /**
     * Country containing the postal code or the location. It is mandatory if `postalcode` is
     * provided in the request. [See this example](#note).
     *
     * Please check the [API Query Limits](#api-query-limits) section below for a list of the
     * countries covered by the Geocode Postcode API. Users can provide either the name or the
     * alpha-2/3 code as per the [ISO 3166-1 standard](https://en.wikipedia.org/wiki/ISO_3166-1) of
     * a country covered by the API as input for this parameter.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun country(): Optional<String> = body.country()

    /**
     * Specify the format in which the boundary details of the post code will be returned. When
     * specified, the boundary details will be returned in the `geojson` format. When not specified,
     * the boundary details are returned in general format.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun format(): Optional<Format> = body.format()

    /**
     * Provide the postal code for which the information is needed. At least one of (`postalcode` +
     * `country`) or `at` needs to be provided. Please note that only 1 postal code can be
     * requested. [See this example](#note).
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun postalcode(): Optional<String> = body.postalcode()

    /**
     * Returns the raw JSON value of [at].
     *
     * Unlike [at], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _at(): JsonField<At> = body._at()

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _country(): JsonField<String> = body._country()

    /**
     * Returns the raw JSON value of [format].
     *
     * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _format(): JsonField<Format> = body._format()

    /**
     * Returns the raw JSON value of [postalcode].
     *
     * Unlike [postalcode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _postalcode(): JsonField<String> = body._postalcode()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PostalcodeRetrieveCoordinatesParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PostalcodeRetrieveCoordinatesParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            postalcodeRetrieveCoordinatesParams: PostalcodeRetrieveCoordinatesParams
        ) = apply {
            key = postalcodeRetrieveCoordinatesParams.key
            body = postalcodeRetrieveCoordinatesParams.body.toBuilder()
            additionalHeaders = postalcodeRetrieveCoordinatesParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                postalcodeRetrieveCoordinatesParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [at]
         * - [country]
         * - [format]
         * - [postalcode]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Location coordinates that you want to get the postal code of. If not providing
         * `postalcode` in the request, `at` becomes mandatory. Please note that only 1 point can be
         * requested. [See this example](#note).
         */
        fun at(at: At) = apply { body.at(at) }

        /**
         * Sets [Builder.at] to an arbitrary JSON value.
         *
         * You should usually call [Builder.at] with a well-typed [At] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun at(at: JsonField<At>) = apply { body.at(at) }

        /**
         * Country containing the postal code or the location. It is mandatory if `postalcode` is
         * provided in the request. [See this example](#note).
         *
         * Please check the [API Query Limits](#api-query-limits) section below for a list of the
         * countries covered by the Geocode Postcode API. Users can provide either the name or the
         * alpha-2/3 code as per the [ISO 3166-1 standard](https://en.wikipedia.org/wiki/ISO_3166-1)
         * of a country covered by the API as input for this parameter.
         */
        fun country(country: String) = apply { body.country(country) }

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { body.country(country) }

        /**
         * Specify the format in which the boundary details of the post code will be returned. When
         * specified, the boundary details will be returned in the `geojson` format. When not
         * specified, the boundary details are returned in general format.
         */
        fun format(format: Format) = apply { body.format(format) }

        /**
         * Sets [Builder.format] to an arbitrary JSON value.
         *
         * You should usually call [Builder.format] with a well-typed [Format] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun format(format: JsonField<Format>) = apply { body.format(format) }

        /**
         * Provide the postal code for which the information is needed. At least one of
         * (`postalcode` + `country`) or `at` needs to be provided. Please note that only 1 postal
         * code can be requested. [See this example](#note).
         */
        fun postalcode(postalcode: String) = apply { body.postalcode(postalcode) }

        /**
         * Sets [Builder.postalcode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalcode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalcode(postalcode: JsonField<String>) = apply { body.postalcode(postalcode) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PostalcodeRetrieveCoordinatesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PostalcodeRetrieveCoordinatesParams =
            PostalcodeRetrieveCoordinatesParams(
                checkRequired("key", key),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    private constructor(
        private val at: JsonField<At>,
        private val country: JsonField<String>,
        private val format: JsonField<Format>,
        private val postalcode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("at") @ExcludeMissing at: JsonField<At> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("format") @ExcludeMissing format: JsonField<Format> = JsonMissing.of(),
            @JsonProperty("postalcode")
            @ExcludeMissing
            postalcode: JsonField<String> = JsonMissing.of(),
        ) : this(at, country, format, postalcode, mutableMapOf())

        /**
         * Location coordinates that you want to get the postal code of. If not providing
         * `postalcode` in the request, `at` becomes mandatory. Please note that only 1 point can be
         * requested. [See this example](#note).
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun at(): Optional<At> = at.getOptional("at")

        /**
         * Country containing the postal code or the location. It is mandatory if `postalcode` is
         * provided in the request. [See this example](#note).
         *
         * Please check the [API Query Limits](#api-query-limits) section below for a list of the
         * countries covered by the Geocode Postcode API. Users can provide either the name or the
         * alpha-2/3 code as per the [ISO 3166-1 standard](https://en.wikipedia.org/wiki/ISO_3166-1)
         * of a country covered by the API as input for this parameter.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * Specify the format in which the boundary details of the post code will be returned. When
         * specified, the boundary details will be returned in the `geojson` format. When not
         * specified, the boundary details are returned in general format.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun format(): Optional<Format> = format.getOptional("format")

        /**
         * Provide the postal code for which the information is needed. At least one of
         * (`postalcode` + `country`) or `at` needs to be provided. Please note that only 1 postal
         * code can be requested. [See this example](#note).
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun postalcode(): Optional<String> = postalcode.getOptional("postalcode")

        /**
         * Returns the raw JSON value of [at].
         *
         * Unlike [at], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("at") @ExcludeMissing fun _at(): JsonField<At> = at

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [format].
         *
         * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<Format> = format

        /**
         * Returns the raw JSON value of [postalcode].
         *
         * Unlike [postalcode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postalcode")
        @ExcludeMissing
        fun _postalcode(): JsonField<String> = postalcode

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var at: JsonField<At> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var format: JsonField<Format> = JsonMissing.of()
            private var postalcode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                at = body.at
                country = body.country
                format = body.format
                postalcode = body.postalcode
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Location coordinates that you want to get the postal code of. If not providing
             * `postalcode` in the request, `at` becomes mandatory. Please note that only 1 point
             * can be requested. [See this example](#note).
             */
            fun at(at: At) = at(JsonField.of(at))

            /**
             * Sets [Builder.at] to an arbitrary JSON value.
             *
             * You should usually call [Builder.at] with a well-typed [At] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun at(at: JsonField<At>) = apply { this.at = at }

            /**
             * Country containing the postal code or the location. It is mandatory if `postalcode`
             * is provided in the request. [See this example](#note).
             *
             * Please check the [API Query Limits](#api-query-limits) section below for a list of
             * the countries covered by the Geocode Postcode API. Users can provide either the name
             * or the alpha-2/3 code as per the
             * [ISO 3166-1 standard](https://en.wikipedia.org/wiki/ISO_3166-1) of a country covered
             * by the API as input for this parameter.
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
             * Specify the format in which the boundary details of the post code will be returned.
             * When specified, the boundary details will be returned in the `geojson` format. When
             * not specified, the boundary details are returned in general format.
             */
            fun format(format: Format) = format(JsonField.of(format))

            /**
             * Sets [Builder.format] to an arbitrary JSON value.
             *
             * You should usually call [Builder.format] with a well-typed [Format] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun format(format: JsonField<Format>) = apply { this.format = format }

            /**
             * Provide the postal code for which the information is needed. At least one of
             * (`postalcode` + `country`) or `at` needs to be provided. Please note that only 1
             * postal code can be requested. [See this example](#note).
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(at, country, format, postalcode, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            at().ifPresent { it.validate() }
            country()
            format().ifPresent { it.validate() }
            postalcode()
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
            (at.asKnown().getOrNull()?.validity() ?: 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (format.asKnown().getOrNull()?.validity() ?: 0) +
                (if (postalcode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && at == other.at && country == other.country && format == other.format && postalcode == other.postalcode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(at, country, format, postalcode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{at=$at, country=$country, format=$format, postalcode=$postalcode, additionalProperties=$additionalProperties}"
    }

    /**
     * Location coordinates that you want to get the postal code of. If not providing `postalcode`
     * in the request, `at` becomes mandatory. Please note that only 1 point can be requested.
     * [See this example](#note).
     */
    class At
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
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lat(): Optional<Double> = lat.getOptional("lat")

        /**
         * Longitude of the location.
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

            /** Returns a mutable builder for constructing an instance of [At]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [At]. */
        class Builder internal constructor() {

            private var lat: JsonField<Double> = JsonMissing.of()
            private var lng: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(at: At) = apply {
                lat = at.lat
                lng = at.lng
                additionalProperties = at.additionalProperties.toMutableMap()
            }

            /** Latitude of the location. */
            fun lat(lat: Double) = lat(JsonField.of(lat))

            /**
             * Sets [Builder.lat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

            /** Longitude of the location. */
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
             * Returns an immutable instance of [At].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): At = At(lat, lng, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): At = apply {
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

            return /* spotless:off */ other is At && lat == other.lat && lng == other.lng && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(lat, lng, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "At{lat=$lat, lng=$lng, additionalProperties=$additionalProperties}"
    }

    /**
     * Specify the format in which the boundary details of the post code will be returned. When
     * specified, the boundary details will be returned in the `geojson` format. When not specified,
     * the boundary details are returned in general format.
     */
    class Format @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val GEOJSON = of("`geojson`")

            @JvmStatic fun of(value: String) = Format(JsonField.of(value))
        }

        /** An enum containing [Format]'s known values. */
        enum class Known {
            GEOJSON
        }

        /**
         * An enum containing [Format]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Format] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GEOJSON,
            /** An enum member indicating that [Format] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                GEOJSON -> Value.GEOJSON
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws NextbillionSdkInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                GEOJSON -> Known.GEOJSON
                else -> throw NextbillionSdkInvalidDataException("Unknown Format: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws NextbillionSdkInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                NextbillionSdkInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Format = apply {
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

            return /* spotless:off */ other is Format && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PostalcodeRetrieveCoordinatesParams && key == other.key && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PostalcodeRetrieveCoordinatesParams{key=$key, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
