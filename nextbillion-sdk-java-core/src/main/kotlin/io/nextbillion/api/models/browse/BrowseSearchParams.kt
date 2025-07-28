// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.browse

import io.nextbillion.api.core.Params
import io.nextbillion.api.core.checkRequired
import io.nextbillion.api.core.http.Headers
import io.nextbillion.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Browse a search area using a free text query */
class BrowseSearchParams
private constructor(
    private val key: String,
    private val at: String?,
    private val categories: String?,
    private val in_: String?,
    private val lang: String?,
    private val limit: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * Specify the center of the search context expressed as coordinates.
     *
     * Please note that one of "at", "in=circle" or "in=bbox" should be provided for relevant
     * results.
     */
    fun at(): Optional<String> = Optional.ofNullable(at)

    /**
     * This is a category filter consisting of a comma-separated list of categories. Places with any
     * assigned categories that match any of the requested categories are included in the response.
     */
    fun categories(): Optional<String> = Optional.ofNullable(categories)

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
     *
     * Please provide one of 'at', 'in=circle' or 'in=bbox' input for a relevant result.
     */
    fun in_(): Optional<String> = Optional.ofNullable(in_)

    /**
     * Select the language to be used for result rendering from a list of
     * [BCP 47](https://en.wikipedia.org/wiki/IETF_language_tag) compliant language codes.
     */
    fun lang(): Optional<String> = Optional.ofNullable(lang)

    /** Sets the maximum number of results to be returned. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BrowseSearchParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrowseSearchParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var at: String? = null
        private var categories: String? = null
        private var in_: String? = null
        private var lang: String? = null
        private var limit: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(browseSearchParams: BrowseSearchParams) = apply {
            key = browseSearchParams.key
            at = browseSearchParams.at
            categories = browseSearchParams.categories
            in_ = browseSearchParams.in_
            lang = browseSearchParams.lang
            limit = browseSearchParams.limit
            additionalHeaders = browseSearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = browseSearchParams.additionalQueryParams.toBuilder()
        }

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

        /**
         * This is a category filter consisting of a comma-separated list of categories. Places with
         * any assigned categories that match any of the requested categories are included in the
         * response.
         */
        fun categories(categories: String?) = apply { this.categories = categories }

        /** Alias for calling [Builder.categories] with `categories.orElse(null)`. */
        fun categories(categories: Optional<String>) = categories(categories.getOrNull())

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
         *
         * Please provide one of 'at', 'in=circle' or 'in=bbox' input for a relevant result.
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
         * Returns an immutable instance of [BrowseSearchParams].
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
        fun build(): BrowseSearchParams =
            BrowseSearchParams(
                checkRequired("key", key),
                at,
                categories,
                in_,
                lang,
                limit,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                at?.let { put("at", it) }
                categories?.let { put("categories", it) }
                in_?.let { put("in", it) }
                lang?.let { put("lang", it) }
                limit?.let { put("limit", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BrowseSearchParams && key == other.key && at == other.at && categories == other.categories && in_ == other.in_ && lang == other.lang && limit == other.limit && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, at, categories, in_, lang, limit, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BrowseSearchParams{key=$key, at=$at, categories=$categories, in_=$in_, lang=$lang, limit=$limit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
