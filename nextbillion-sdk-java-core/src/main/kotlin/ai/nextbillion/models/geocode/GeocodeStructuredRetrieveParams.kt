// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geocode

import ai.nextbillion.core.Params
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.http.Headers
import ai.nextbillion.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Structured Geocode */
class GeocodeStructuredRetrieveParams
private constructor(
    private val countryCode: String,
    private val key: String,
    private val at: String?,
    private val city: String?,
    private val county: String?,
    private val houseNumber: String?,
    private val in_: String?,
    private val limit: Long?,
    private val postalCode: String?,
    private val state: String?,
    private val street: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Specify a valid [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3)
     * country code in which the place being searched should be located. Please note that this is a
     * case-sensitive field and the country code should be in all uppercase.
     */
    fun countryCode(): String = countryCode

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * Specify the center of the search context expressed as coordinates.
     *
     * Please note that one of "at", "in=circle" or "in=bbox" should be provided for relevant
     * results.
     */
    fun at(): Optional<String> = Optional.ofNullable(at)

    /** Specify the city in which the place being searched should be located. */
    fun city(): Optional<String> = Optional.ofNullable(city)

    /**
     * Specify the county division of the state in which the place being searched should be located.
     */
    fun county(): Optional<String> = Optional.ofNullable(county)

    /** Specify the house number of the place being searched. */
    fun houseNumber(): Optional<String> = Optional.ofNullable(houseNumber)

    /**
     * Search within a geographic area. This is a hard filter. Results will be returned if they are
     * located within the specified area.
     *
     * A geographic area can be
     * - a circular area, provided as latitude, longitude, and radius (an integer with meters as
     *   unit)
     *
     *   Format: `circle:{latitude},{longitude};r={radius}`
     * - a bounding box, provided as _west longitude_, _south latitude_, _east longitude_, _north
     *   latitude_
     *
     *   Format: `bbox:{west longitude},{south latitude},{east longitude},{north latitude}`
     *
     * Please provide one of 'at', 'in=circle' or 'in=bbox' input for a relevant result.
     */
    fun in_(): Optional<String> = Optional.ofNullable(in_)

    /** Sets the maximum number of results to be returned. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Specify the postal code in which the place being searched should be located. */
    fun postalCode(): Optional<String> = Optional.ofNullable(postalCode)

    /**
     * Specify the state division of the country in which the place being searched should be
     * located.
     */
    fun state(): Optional<String> = Optional.ofNullable(state)

    /** Specify the name of the street in which the place being searched should be located. */
    fun street(): Optional<String> = Optional.ofNullable(street)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [GeocodeStructuredRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .countryCode()
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GeocodeStructuredRetrieveParams]. */
    class Builder internal constructor() {

        private var countryCode: String? = null
        private var key: String? = null
        private var at: String? = null
        private var city: String? = null
        private var county: String? = null
        private var houseNumber: String? = null
        private var in_: String? = null
        private var limit: Long? = null
        private var postalCode: String? = null
        private var state: String? = null
        private var street: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(geocodeStructuredRetrieveParams: GeocodeStructuredRetrieveParams) =
            apply {
                countryCode = geocodeStructuredRetrieveParams.countryCode
                key = geocodeStructuredRetrieveParams.key
                at = geocodeStructuredRetrieveParams.at
                city = geocodeStructuredRetrieveParams.city
                county = geocodeStructuredRetrieveParams.county
                houseNumber = geocodeStructuredRetrieveParams.houseNumber
                in_ = geocodeStructuredRetrieveParams.in_
                limit = geocodeStructuredRetrieveParams.limit
                postalCode = geocodeStructuredRetrieveParams.postalCode
                state = geocodeStructuredRetrieveParams.state
                street = geocodeStructuredRetrieveParams.street
                additionalHeaders = geocodeStructuredRetrieveParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    geocodeStructuredRetrieveParams.additionalQueryParams.toBuilder()
            }

        /**
         * Specify a valid [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3)
         * country code in which the place being searched should be located. Please note that this
         * is a case-sensitive field and the country code should be in all uppercase.
         */
        fun countryCode(countryCode: String) = apply { this.countryCode = countryCode }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Specify the center of the search context expressed as coordinates.
         *
         * Please note that one of "at", "in=circle" or "in=bbox" should be provided for relevant
         * results.
         */
        fun at(at: String?) = apply { this.at = at }

        /** Alias for calling [Builder.at] with `at.orElse(null)`. */
        fun at(at: Optional<String>) = at(at.getOrNull())

        /** Specify the city in which the place being searched should be located. */
        fun city(city: String?) = apply { this.city = city }

        /** Alias for calling [Builder.city] with `city.orElse(null)`. */
        fun city(city: Optional<String>) = city(city.getOrNull())

        /**
         * Specify the county division of the state in which the place being searched should be
         * located.
         */
        fun county(county: String?) = apply { this.county = county }

        /** Alias for calling [Builder.county] with `county.orElse(null)`. */
        fun county(county: Optional<String>) = county(county.getOrNull())

        /** Specify the house number of the place being searched. */
        fun houseNumber(houseNumber: String?) = apply { this.houseNumber = houseNumber }

        /** Alias for calling [Builder.houseNumber] with `houseNumber.orElse(null)`. */
        fun houseNumber(houseNumber: Optional<String>) = houseNumber(houseNumber.getOrNull())

        /**
         * Search within a geographic area. This is a hard filter. Results will be returned if they
         * are located within the specified area.
         *
         * A geographic area can be
         * - a circular area, provided as latitude, longitude, and radius (an integer with meters as
         *   unit)
         *
         *   Format: `circle:{latitude},{longitude};r={radius}`
         * - a bounding box, provided as _west longitude_, _south latitude_, _east longitude_,
         *   _north latitude_
         *
         *   Format: `bbox:{west longitude},{south latitude},{east longitude},{north latitude}`
         *
         * Please provide one of 'at', 'in=circle' or 'in=bbox' input for a relevant result.
         */
        fun in_(in_: String?) = apply { this.in_ = in_ }

        /** Alias for calling [Builder.in_] with `in_.orElse(null)`. */
        fun in_(in_: Optional<String>) = in_(in_.getOrNull())

        /** Sets the maximum number of results to be returned. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Specify the postal code in which the place being searched should be located. */
        fun postalCode(postalCode: String?) = apply { this.postalCode = postalCode }

        /** Alias for calling [Builder.postalCode] with `postalCode.orElse(null)`. */
        fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.getOrNull())

        /**
         * Specify the state division of the country in which the place being searched should be
         * located.
         */
        fun state(state: String?) = apply { this.state = state }

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<String>) = state(state.getOrNull())

        /** Specify the name of the street in which the place being searched should be located. */
        fun street(street: String?) = apply { this.street = street }

        /** Alias for calling [Builder.street] with `street.orElse(null)`. */
        fun street(street: Optional<String>) = street(street.getOrNull())

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
         * Returns an immutable instance of [GeocodeStructuredRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .countryCode()
         * .key()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GeocodeStructuredRetrieveParams =
            GeocodeStructuredRetrieveParams(
                checkRequired("countryCode", countryCode),
                checkRequired("key", key),
                at,
                city,
                county,
                houseNumber,
                in_,
                limit,
                postalCode,
                state,
                street,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("countryCode", countryCode)
                put("key", key)
                at?.let { put("at", it) }
                city?.let { put("city", it) }
                county?.let { put("county", it) }
                houseNumber?.let { put("houseNumber", it) }
                in_?.let { put("in", it) }
                limit?.let { put("limit", it.toString()) }
                postalCode?.let { put("postalCode", it) }
                state?.let { put("state", it) }
                street?.let { put("street", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GeocodeStructuredRetrieveParams && countryCode == other.countryCode && key == other.key && at == other.at && city == other.city && county == other.county && houseNumber == other.houseNumber && in_ == other.in_ && limit == other.limit && postalCode == other.postalCode && state == other.state && street == other.street && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(countryCode, key, at, city, county, houseNumber, in_, limit, postalCode, state, street, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "GeocodeStructuredRetrieveParams{countryCode=$countryCode, key=$key, at=$at, city=$city, county=$county, houseNumber=$houseNumber, in_=$in_, limit=$limit, postalCode=$postalCode, state=$state, street=$street, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
