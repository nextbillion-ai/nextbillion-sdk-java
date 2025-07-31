// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geocode

import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.Params
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.http.Headers
import ai.nextbillion.core.http.QueryParams
import ai.nextbillion.core.toImmutable
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional

/** Batch Geocode */
class GeocodeBatchCreateParams
private constructor(
    private val key: String,
    private val body: List<Body>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    fun body(): List<Body> = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GeocodeBatchCreateParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GeocodeBatchCreateParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(geocodeBatchCreateParams: GeocodeBatchCreateParams) = apply {
            key = geocodeBatchCreateParams.key
            body = geocodeBatchCreateParams.body.toMutableList()
            additionalHeaders = geocodeBatchCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = geocodeBatchCreateParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        fun body(body: List<Body>) = apply { this.body = body.toMutableList() }

        /**
         * Adds a single [Body] to [Builder.body].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBody(body: Body) = apply {
            this.body = (this.body ?: mutableListOf()).apply { add(body) }
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
         * Returns an immutable instance of [GeocodeBatchCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GeocodeBatchCreateParams =
            GeocodeBatchCreateParams(
                checkRequired("key", key),
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("q") @ExcludeMissing private val q: JsonField<String>,
        @JsonProperty("at") @ExcludeMissing private val at: JsonField<String>,
        @JsonProperty("in") @ExcludeMissing private val in_: JsonField<String>,
        @JsonProperty("lang") @ExcludeMissing private val lang: JsonField<String>,
        @JsonProperty("limit") @ExcludeMissing private val limit: JsonField<Long>,
    ) {

        /**
         * Specify the free-text search query. Please note that whitespace, urls, email addresses,
         * or other out-of-scope queries will yield no results.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun q(): String = q.getRequired("q")

        /**
         * Specify the center of the search context expressed as coordinates.
         *
         * Please note that one of "at", "in=circle" or "in=bbox" should be provided for relevant
         * results.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun at(): Optional<String> = at.getOptional("at")

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
         *   Format: countryCode:{countryCode}[,{countryCode}]
         * - a circular area, provided as latitude, longitude, and radius (an integer with meters as
         *   unit)
         *
         *   Format: circle:{latitude},{longitude};r={radius}
         * - a bounding box, provided as _west longitude_, _south latitude_, _east longitude_,
         *   _north latitude_
         *
         *   Format: bbox:{west longitude},{south latitude},{east longitude},{north latitude}
         *
         * Please provide one of 'at', 'in=circle' or 'in=bbox' input for a relevant result.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun in_(): Optional<String> = in_.getOptional("in")

        /**
         * Select the language to be used for result rendering from a list of
         * [BCP 47](https://en.wikipedia.org/wiki/IETF_language_tag) compliant language codes.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lang(): Optional<String> = lang.getOptional("lang")

        /**
         * Maximum number of results to be returned. Please note that the minimum value that can be
         * provided is 1 and the maximum that can be provided is 100.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
         * Returns the raw JSON value of [q].
         *
         * Unlike [q], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("q") @ExcludeMissing fun _q(): JsonField<String> = q

        /**
         * Returns the raw JSON value of [at].
         *
         * Unlike [at], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("at") @ExcludeMissing fun _at(): JsonField<String> = at

        /**
         * Returns the raw JSON value of [in_].
         *
         * Unlike [in_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("in") @ExcludeMissing fun _in_(): JsonField<String> = in_

        /**
         * Returns the raw JSON value of [lang].
         *
         * Unlike [lang], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lang") @ExcludeMissing fun _lang(): JsonField<String> = lang

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .q()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var q: JsonField<String>? = null
            private var at: JsonField<String> = JsonMissing.of()
            private var in_: JsonField<String> = JsonMissing.of()
            private var lang: JsonField<String> = JsonMissing.of()
            private var limit: JsonField<Long> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                q = body.q
                at = body.at
                in_ = body.in_
                lang = body.lang
                limit = body.limit
            }

            /**
             * Specify the free-text search query. Please note that whitespace, urls, email
             * addresses, or other out-of-scope queries will yield no results.
             */
            fun q(q: String) = q(JsonField.of(q))

            /**
             * Sets [Builder.q] to an arbitrary JSON value.
             *
             * You should usually call [Builder.q] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun q(q: JsonField<String>) = apply { this.q = q }

            /**
             * Specify the center of the search context expressed as coordinates.
             *
             * Please note that one of "at", "in=circle" or "in=bbox" should be provided for
             * relevant results.
             */
            fun at(at: String) = at(JsonField.of(at))

            /**
             * Sets [Builder.at] to an arbitrary JSON value.
             *
             * You should usually call [Builder.at] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun at(at: JsonField<String>) = apply { this.at = at }

            /**
             * Search within a geographic area. This is a hard filter. Results will be returned if
             * they are located within the specified area.
             *
             * A geographic area can be
             * - a country (or multiple countries), provided as comma-separated
             *   [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) country
             *   codes
             *
             *   The country codes are to be provided in all uppercase.
             *
             *   Format: countryCode:{countryCode}[,{countryCode}]
             * - a circular area, provided as latitude, longitude, and radius (an integer with
             *   meters as unit)
             *
             *   Format: circle:{latitude},{longitude};r={radius}
             * - a bounding box, provided as _west longitude_, _south latitude_, _east longitude_,
             *   _north latitude_
             *
             *   Format: bbox:{west longitude},{south latitude},{east longitude},{north latitude}
             *
             * Please provide one of 'at', 'in=circle' or 'in=bbox' input for a relevant result.
             */
            fun in_(in_: String) = in_(JsonField.of(in_))

            /**
             * Sets [Builder.in_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.in_] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun in_(in_: JsonField<String>) = apply { this.in_ = in_ }

            /**
             * Select the language to be used for result rendering from a list of
             * [BCP 47](https://en.wikipedia.org/wiki/IETF_language_tag) compliant language codes.
             */
            fun lang(lang: String) = lang(JsonField.of(lang))

            /**
             * Sets [Builder.lang] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lang] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lang(lang: JsonField<String>) = apply { this.lang = lang }

            /**
             * Maximum number of results to be returned. Please note that the minimum value that can
             * be provided is 1 and the maximum that can be provided is 100.
             */
            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .q()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body = Body(checkRequired("q", q), at, in_, lang, limit)
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            q()
            at()
            in_()
            lang()
            limit()
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
            (if (q.asKnown().isPresent) 1 else 0) +
                (if (at.asKnown().isPresent) 1 else 0) +
                (if (in_.asKnown().isPresent) 1 else 0) +
                (if (lang.asKnown().isPresent) 1 else 0) +
                (if (limit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && q == other.q && at == other.at && in_ == other.in_ && lang == other.lang && limit == other.limit /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(q, at, in_, lang, limit) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{q=$q, at=$at, in_=$in_, lang=$lang, limit=$limit}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GeocodeBatchCreateParams && key == other.key && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "GeocodeBatchCreateParams{key=$key, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
