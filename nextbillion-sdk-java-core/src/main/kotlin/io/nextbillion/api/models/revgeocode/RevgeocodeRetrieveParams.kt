// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.revgeocode

import io.nextbillion.api.core.Params
import io.nextbillion.api.core.checkRequired
import io.nextbillion.api.core.http.Headers
import io.nextbillion.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Reverse Geocode */
class RevgeocodeRetrieveParams
private constructor(
    private val at: String,
    private val key: String,
    private val in_: String?,
    private val lang: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Specify the center of the search context expressed as coordinates.
     *
     * Please note that one of "at", "in=circle" or "in=bbox" should be provided for relevant
     * results.
     */
    fun at(): String = at

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * Search within a geographic area. This is a hard filter. Results will be returned if they are
     * located within the specified area.
     *
     * A geographic area can be
     * - a country (or multiple countries), provided as comma-separated
     *   [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) country codes
     *
     *   The country codes are to be provided in all uppercase.
     *
     *   Format: `countryCode:{countryCode}[,{countryCode}]`
     * - a circular area, provided as latitude, longitude, and radius (an integer with meters as
     *   unit)
     *
     *   Format: `circle:{latitude},{longitude};r={radius}`
     * - a bounding box, provided as _west longitude_, _south latitude_, _east longitude_, _north
     *   latitude_
     *
     *   Format: `bbox:{west longitude},{south latitude},{east longitude},{north latitude}`
     */
    fun in_(): Optional<String> = Optional.ofNullable(in_)

    /**
     * Select the language to be used for result rendering from a list of
     * [BCP 47](https://en.wikipedia.org/wiki/IETF_language_tag) compliant language codes.
     */
    fun lang(): Optional<String> = Optional.ofNullable(lang)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RevgeocodeRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .at()
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RevgeocodeRetrieveParams]. */
    class Builder internal constructor() {

        private var at: String? = null
        private var key: String? = null
        private var in_: String? = null
        private var lang: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(revgeocodeRetrieveParams: RevgeocodeRetrieveParams) = apply {
            at = revgeocodeRetrieveParams.at
            key = revgeocodeRetrieveParams.key
            in_ = revgeocodeRetrieveParams.in_
            lang = revgeocodeRetrieveParams.lang
            additionalHeaders = revgeocodeRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = revgeocodeRetrieveParams.additionalQueryParams.toBuilder()
        }

        /**
         * Specify the center of the search context expressed as coordinates.
         *
         * Please note that one of "at", "in=circle" or "in=bbox" should be provided for relevant
         * results.
         */
        fun at(at: String) = apply { this.at = at }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Search within a geographic area. This is a hard filter. Results will be returned if they
         * are located within the specified area.
         *
         * A geographic area can be
         * - a country (or multiple countries), provided as comma-separated
         *   [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) country codes
         *
         *   The country codes are to be provided in all uppercase.
         *
         *   Format: `countryCode:{countryCode}[,{countryCode}]`
         * - a circular area, provided as latitude, longitude, and radius (an integer with meters as
         *   unit)
         *
         *   Format: `circle:{latitude},{longitude};r={radius}`
         * - a bounding box, provided as _west longitude_, _south latitude_, _east longitude_,
         *   _north latitude_
         *
         *   Format: `bbox:{west longitude},{south latitude},{east longitude},{north latitude}`
         */
        fun in_(in_: String?) = apply { this.in_ = in_ }

        /** Alias for calling [Builder.in_] with `in_.orElse(null)`. */
        fun in_(in_: Optional<String>) = in_(in_.getOrNull())

        /**
         * Select the language to be used for result rendering from a list of
         * [BCP 47](https://en.wikipedia.org/wiki/IETF_language_tag) compliant language codes.
         */
        fun lang(lang: String?) = apply { this.lang = lang }

        /** Alias for calling [Builder.lang] with `lang.orElse(null)`. */
        fun lang(lang: Optional<String>) = lang(lang.getOrNull())

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
         * Returns an immutable instance of [RevgeocodeRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .at()
         * .key()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RevgeocodeRetrieveParams =
            RevgeocodeRetrieveParams(
                checkRequired("at", at),
                checkRequired("key", key),
                in_,
                lang,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("at", at)
                put("key", key)
                in_?.let { put("in", it) }
                lang?.let { put("lang", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RevgeocodeRetrieveParams && at == other.at && key == other.key && in_ == other.in_ && lang == other.lang && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(at, key, in_, lang, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "RevgeocodeRetrieveParams{at=$at, key=$key, in_=$in_, lang=$lang, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
