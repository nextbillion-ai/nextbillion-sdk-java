// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.search.polygon

import ai.nextbillion.core.Enum
import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.Params
import ai.nextbillion.core.checkKnown
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.http.Headers
import ai.nextbillion.core.http.QueryParams
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

/** Polygon Search */
class PolygonCreateParams
private constructor(
    private val key: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * An object to collect geoJSON details of a custom polygon. Please ensure that:
     * - the polygon provided is enclosed. This can be achieved by making the last location
     *   coordinate in the list equal to the first location coordinate of the list.
     * - the 'polygon' provided does not contain multiple rings.
     *
     * The contents of this object follow the
     * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
     *
     * Please note that the maximum area of the search polygon allowed is 3000 km<sup>2</sup>.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun polygon(): Polygon = body.polygon()

    /**
     * **tags parameter will be deprecated soon! Please use the include_any_of_attributes or
     * include_all_of_attributes parameters to match assets based on their labels or markers.**
     *
     * Use this parameter to filter the assets found inside the specified area by their tag.
     * Multiple tag can be separated using comma (,).
     *
     * Please note the tags are case sensitive.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun filter(): Optional<String> = body.filter()

    /**
     * An object to define the attributes which will be used to filter the assets found within the
     * polygon.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun matchFilter(): Optional<MatchFilter> = body.matchFilter()

    /**
     * if ture, can get 16x bigger limitation in search.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxSearchLimit(): Optional<Boolean> = body.maxSearchLimit()

    /**
     * Denotes page number. Use this along with the ps parameter to implement pagination for your
     * searched results. This parameter does not have a maximum limit but would return an empty
     * response in case a higher value is provided when the result-set itself is smaller.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pn(): Optional<Long> = body.pn()

    /**
     * Denotes number of search results per page. Use this along with the pn parameter to implement
     * pagination for your searched results. Please note that ps has a default value of 20 and
     * accepts integers only in the range of [1, 100].
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ps(): Optional<Long> = body.ps()

    /**
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sort(): Optional<Sort> = body.sort()

    /**
     * Returns the raw JSON value of [polygon].
     *
     * Unlike [polygon], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _polygon(): JsonField<Polygon> = body._polygon()

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filter(): JsonField<String> = body._filter()

    /**
     * Returns the raw JSON value of [matchFilter].
     *
     * Unlike [matchFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _matchFilter(): JsonField<MatchFilter> = body._matchFilter()

    /**
     * Returns the raw JSON value of [maxSearchLimit].
     *
     * Unlike [maxSearchLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxSearchLimit(): JsonField<Boolean> = body._maxSearchLimit()

    /**
     * Returns the raw JSON value of [pn].
     *
     * Unlike [pn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pn(): JsonField<Long> = body._pn()

    /**
     * Returns the raw JSON value of [ps].
     *
     * Unlike [ps], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ps(): JsonField<Long> = body._ps()

    /**
     * Returns the raw JSON value of [sort].
     *
     * Unlike [sort], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sort(): JsonField<Sort> = body._sort()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PolygonCreateParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .polygon()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PolygonCreateParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(polygonCreateParams: PolygonCreateParams) = apply {
            key = polygonCreateParams.key
            body = polygonCreateParams.body.toBuilder()
            additionalHeaders = polygonCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = polygonCreateParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [polygon]
         * - [filter]
         * - [matchFilter]
         * - [maxSearchLimit]
         * - [pn]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * An object to collect geoJSON details of a custom polygon. Please ensure that:
         * - the polygon provided is enclosed. This can be achieved by making the last location
         *   coordinate in the list equal to the first location coordinate of the list.
         * - the 'polygon' provided does not contain multiple rings.
         *
         * The contents of this object follow the
         * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
         *
         * Please note that the maximum area of the search polygon allowed is 3000 km<sup>2</sup>.
         */
        fun polygon(polygon: Polygon) = apply { body.polygon(polygon) }

        /**
         * Sets [Builder.polygon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polygon] with a well-typed [Polygon] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun polygon(polygon: JsonField<Polygon>) = apply { body.polygon(polygon) }

        /**
         * **tags parameter will be deprecated soon! Please use the include_any_of_attributes or
         * include_all_of_attributes parameters to match assets based on their labels or markers.**
         *
         * Use this parameter to filter the assets found inside the specified area by their tag.
         * Multiple tag can be separated using comma (,).
         *
         * Please note the tags are case sensitive.
         */
        fun filter(filter: String) = apply { body.filter(filter) }

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { body.filter(filter) }

        /**
         * An object to define the attributes which will be used to filter the assets found within
         * the polygon.
         */
        fun matchFilter(matchFilter: MatchFilter) = apply { body.matchFilter(matchFilter) }

        /**
         * Sets [Builder.matchFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matchFilter] with a well-typed [MatchFilter] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun matchFilter(matchFilter: JsonField<MatchFilter>) = apply {
            body.matchFilter(matchFilter)
        }

        /** if ture, can get 16x bigger limitation in search. */
        fun maxSearchLimit(maxSearchLimit: Boolean) = apply { body.maxSearchLimit(maxSearchLimit) }

        /**
         * Sets [Builder.maxSearchLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxSearchLimit] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxSearchLimit(maxSearchLimit: JsonField<Boolean>) = apply {
            body.maxSearchLimit(maxSearchLimit)
        }

        /**
         * Denotes page number. Use this along with the ps parameter to implement pagination for
         * your searched results. This parameter does not have a maximum limit but would return an
         * empty response in case a higher value is provided when the result-set itself is smaller.
         */
        fun pn(pn: Long) = apply { body.pn(pn) }

        /**
         * Sets [Builder.pn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pn] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pn(pn: JsonField<Long>) = apply { body.pn(pn) }

        /**
         * Denotes number of search results per page. Use this along with the pn parameter to
         * implement pagination for your searched results. Please note that ps has a default value
         * of 20 and accepts integers only in the range of [1, 100].
         */
        fun ps(ps: Long) = apply { body.ps(ps) }

        /**
         * Sets [Builder.ps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ps] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ps(ps: JsonField<Long>) = apply { body.ps(ps) }

        fun sort(sort: Sort) = apply { body.sort(sort) }

        /**
         * Sets [Builder.sort] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sort] with a well-typed [Sort] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sort(sort: JsonField<Sort>) = apply { body.sort(sort) }

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
         * Returns an immutable instance of [PolygonCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .polygon()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PolygonCreateParams =
            PolygonCreateParams(
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
        private val polygon: JsonField<Polygon>,
        private val filter: JsonField<String>,
        private val matchFilter: JsonField<MatchFilter>,
        private val maxSearchLimit: JsonField<Boolean>,
        private val pn: JsonField<Long>,
        private val ps: JsonField<Long>,
        private val sort: JsonField<Sort>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("polygon") @ExcludeMissing polygon: JsonField<Polygon> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("match_filter")
            @ExcludeMissing
            matchFilter: JsonField<MatchFilter> = JsonMissing.of(),
            @JsonProperty("max_search_limit")
            @ExcludeMissing
            maxSearchLimit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("pn") @ExcludeMissing pn: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("ps") @ExcludeMissing ps: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sort") @ExcludeMissing sort: JsonField<Sort> = JsonMissing.of(),
        ) : this(polygon, filter, matchFilter, maxSearchLimit, pn, ps, sort, mutableMapOf())

        /**
         * An object to collect geoJSON details of a custom polygon. Please ensure that:
         * - the polygon provided is enclosed. This can be achieved by making the last location
         *   coordinate in the list equal to the first location coordinate of the list.
         * - the 'polygon' provided does not contain multiple rings.
         *
         * The contents of this object follow the
         * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
         *
         * Please note that the maximum area of the search polygon allowed is 3000 km<sup>2</sup>.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun polygon(): Polygon = polygon.getRequired("polygon")

        /**
         * **tags parameter will be deprecated soon! Please use the include_any_of_attributes or
         * include_all_of_attributes parameters to match assets based on their labels or markers.**
         *
         * Use this parameter to filter the assets found inside the specified area by their tag.
         * Multiple tag can be separated using comma (,).
         *
         * Please note the tags are case sensitive.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun filter(): Optional<String> = filter.getOptional("filter")

        /**
         * An object to define the attributes which will be used to filter the assets found within
         * the polygon.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun matchFilter(): Optional<MatchFilter> = matchFilter.getOptional("match_filter")

        /**
         * if ture, can get 16x bigger limitation in search.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxSearchLimit(): Optional<Boolean> = maxSearchLimit.getOptional("max_search_limit")

        /**
         * Denotes page number. Use this along with the ps parameter to implement pagination for
         * your searched results. This parameter does not have a maximum limit but would return an
         * empty response in case a higher value is provided when the result-set itself is smaller.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun pn(): Optional<Long> = pn.getOptional("pn")

        /**
         * Denotes number of search results per page. Use this along with the pn parameter to
         * implement pagination for your searched results. Please note that ps has a default value
         * of 20 and accepts integers only in the range of [1, 100].
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ps(): Optional<Long> = ps.getOptional("ps")

        /**
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sort(): Optional<Sort> = sort.getOptional("sort")

        /**
         * Returns the raw JSON value of [polygon].
         *
         * Unlike [polygon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("polygon") @ExcludeMissing fun _polygon(): JsonField<Polygon> = polygon

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Returns the raw JSON value of [matchFilter].
         *
         * Unlike [matchFilter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("match_filter")
        @ExcludeMissing
        fun _matchFilter(): JsonField<MatchFilter> = matchFilter

        /**
         * Returns the raw JSON value of [maxSearchLimit].
         *
         * Unlike [maxSearchLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_search_limit")
        @ExcludeMissing
        fun _maxSearchLimit(): JsonField<Boolean> = maxSearchLimit

        /**
         * Returns the raw JSON value of [pn].
         *
         * Unlike [pn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pn") @ExcludeMissing fun _pn(): JsonField<Long> = pn

        /**
         * Returns the raw JSON value of [ps].
         *
         * Unlike [ps], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ps") @ExcludeMissing fun _ps(): JsonField<Long> = ps

        /**
         * Returns the raw JSON value of [sort].
         *
         * Unlike [sort], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sort") @ExcludeMissing fun _sort(): JsonField<Sort> = sort

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .polygon()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var polygon: JsonField<Polygon>? = null
            private var filter: JsonField<String> = JsonMissing.of()
            private var matchFilter: JsonField<MatchFilter> = JsonMissing.of()
            private var maxSearchLimit: JsonField<Boolean> = JsonMissing.of()
            private var pn: JsonField<Long> = JsonMissing.of()
            private var ps: JsonField<Long> = JsonMissing.of()
            private var sort: JsonField<Sort> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                polygon = body.polygon
                filter = body.filter
                matchFilter = body.matchFilter
                maxSearchLimit = body.maxSearchLimit
                pn = body.pn
                ps = body.ps
                sort = body.sort
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * An object to collect geoJSON details of a custom polygon. Please ensure that:
             * - the polygon provided is enclosed. This can be achieved by making the last location
             *   coordinate in the list equal to the first location coordinate of the list.
             * - the 'polygon' provided does not contain multiple rings.
             *
             * The contents of this object follow the
             * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
             *
             * Please note that the maximum area of the search polygon allowed is 3000
             * km<sup>2</sup>.
             */
            fun polygon(polygon: Polygon) = polygon(JsonField.of(polygon))

            /**
             * Sets [Builder.polygon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.polygon] with a well-typed [Polygon] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun polygon(polygon: JsonField<Polygon>) = apply { this.polygon = polygon }

            /**
             * **tags parameter will be deprecated soon! Please use the include_any_of_attributes or
             * include_all_of_attributes parameters to match assets based on their labels or
             * markers.**
             *
             * Use this parameter to filter the assets found inside the specified area by their tag.
             * Multiple tag can be separated using comma (,).
             *
             * Please note the tags are case sensitive.
             */
            fun filter(filter: String) = filter(JsonField.of(filter))

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            /**
             * An object to define the attributes which will be used to filter the assets found
             * within the polygon.
             */
            fun matchFilter(matchFilter: MatchFilter) = matchFilter(JsonField.of(matchFilter))

            /**
             * Sets [Builder.matchFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matchFilter] with a well-typed [MatchFilter] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun matchFilter(matchFilter: JsonField<MatchFilter>) = apply {
                this.matchFilter = matchFilter
            }

            /** if ture, can get 16x bigger limitation in search. */
            fun maxSearchLimit(maxSearchLimit: Boolean) =
                maxSearchLimit(JsonField.of(maxSearchLimit))

            /**
             * Sets [Builder.maxSearchLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxSearchLimit] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxSearchLimit(maxSearchLimit: JsonField<Boolean>) = apply {
                this.maxSearchLimit = maxSearchLimit
            }

            /**
             * Denotes page number. Use this along with the ps parameter to implement pagination for
             * your searched results. This parameter does not have a maximum limit but would return
             * an empty response in case a higher value is provided when the result-set itself is
             * smaller.
             */
            fun pn(pn: Long) = pn(JsonField.of(pn))

            /**
             * Sets [Builder.pn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pn] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun pn(pn: JsonField<Long>) = apply { this.pn = pn }

            /**
             * Denotes number of search results per page. Use this along with the pn parameter to
             * implement pagination for your searched results. Please note that ps has a default
             * value of 20 and accepts integers only in the range of [1, 100].
             */
            fun ps(ps: Long) = ps(JsonField.of(ps))

            /**
             * Sets [Builder.ps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ps] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ps(ps: JsonField<Long>) = apply { this.ps = ps }

            fun sort(sort: Sort) = sort(JsonField.of(sort))

            /**
             * Sets [Builder.sort] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sort] with a well-typed [Sort] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun sort(sort: JsonField<Sort>) = apply { this.sort = sort }

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
             *
             * The following fields are required:
             * ```java
             * .polygon()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("polygon", polygon),
                    filter,
                    matchFilter,
                    maxSearchLimit,
                    pn,
                    ps,
                    sort,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            polygon().validate()
            filter()
            matchFilter().ifPresent { it.validate() }
            maxSearchLimit()
            pn()
            ps()
            sort().ifPresent { it.validate() }
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
            (polygon.asKnown().getOrNull()?.validity() ?: 0) +
                (if (filter.asKnown().isPresent) 1 else 0) +
                (matchFilter.asKnown().getOrNull()?.validity() ?: 0) +
                (if (maxSearchLimit.asKnown().isPresent) 1 else 0) +
                (if (pn.asKnown().isPresent) 1 else 0) +
                (if (ps.asKnown().isPresent) 1 else 0) +
                (sort.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                polygon == other.polygon &&
                filter == other.filter &&
                matchFilter == other.matchFilter &&
                maxSearchLimit == other.maxSearchLimit &&
                pn == other.pn &&
                ps == other.ps &&
                sort == other.sort &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                polygon,
                filter,
                matchFilter,
                maxSearchLimit,
                pn,
                ps,
                sort,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{polygon=$polygon, filter=$filter, matchFilter=$matchFilter, maxSearchLimit=$maxSearchLimit, pn=$pn, ps=$ps, sort=$sort, additionalProperties=$additionalProperties}"
    }

    /**
     * An object to collect geoJSON details of a custom polygon. Please ensure that:
     * - the polygon provided is enclosed. This can be achieved by making the last location
     *   coordinate in the list equal to the first location coordinate of the list.
     * - the 'polygon' provided does not contain multiple rings.
     *
     * The contents of this object follow the
     * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
     *
     * Please note that the maximum area of the search polygon allowed is 3000 km<sup>2</sup>.
     */
    class Polygon
    private constructor(
        private val coordinates: JsonField<List<Double>>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("coordinates")
            @ExcludeMissing
            coordinates: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(coordinates, type, mutableMapOf())

        /**
         * An array of coordinates in the [longitude, latitude] format, representing the polygon
         * boundary.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun coordinates(): List<Double> = coordinates.getRequired("coordinates")

        /**
         * Type of the geoJSON geometry. Should always be polygon.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): String = type.getRequired("type")

        /**
         * Returns the raw JSON value of [coordinates].
         *
         * Unlike [coordinates], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("coordinates")
        @ExcludeMissing
        fun _coordinates(): JsonField<List<Double>> = coordinates

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

            /**
             * Returns a mutable builder for constructing an instance of [Polygon].
             *
             * The following fields are required:
             * ```java
             * .coordinates()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Polygon]. */
        class Builder internal constructor() {

            private var coordinates: JsonField<MutableList<Double>>? = null
            private var type: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(polygon: Polygon) = apply {
                coordinates = polygon.coordinates.map { it.toMutableList() }
                type = polygon.type
                additionalProperties = polygon.additionalProperties.toMutableMap()
            }

            /**
             * An array of coordinates in the [longitude, latitude] format, representing the polygon
             * boundary.
             */
            fun coordinates(coordinates: List<Double>) = coordinates(JsonField.of(coordinates))

            /**
             * Sets [Builder.coordinates] to an arbitrary JSON value.
             *
             * You should usually call [Builder.coordinates] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun coordinates(coordinates: JsonField<List<Double>>) = apply {
                this.coordinates = coordinates.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [coordinates].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCoordinate(coordinate: Double) = apply {
                coordinates =
                    (coordinates ?: JsonField.of(mutableListOf())).also {
                        checkKnown("coordinates", it).add(coordinate)
                    }
            }

            /** Type of the geoJSON geometry. Should always be polygon. */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [Polygon].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .coordinates()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Polygon =
                Polygon(
                    checkRequired("coordinates", coordinates).map { it.toImmutable() },
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Polygon = apply {
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
            (coordinates.asKnown().getOrNull()?.size ?: 0) +
                (if (type.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Polygon &&
                coordinates == other.coordinates &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(coordinates, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Polygon{coordinates=$coordinates, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * An object to define the attributes which will be used to filter the assets found within the
     * polygon.
     */
    class MatchFilter
    private constructor(
        private val includeAllOfAttributes: JsonField<String>,
        private val includeAnyOfAttributes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("include_all_of_attributes")
            @ExcludeMissing
            includeAllOfAttributes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("include_any_of_attributes")
            @ExcludeMissing
            includeAnyOfAttributes: JsonField<String> = JsonMissing.of(),
        ) : this(includeAllOfAttributes, includeAnyOfAttributes, mutableMapOf())

        /**
         * Use this parameter to filter the assets found inside the specified area by their
         * attributes. Only the assets having all the attributes that are added to this parameter,
         * will be returned in the search results. Multiple attributes can be separated using commas
         * (,).
         *
         * Please note the attributes are case sensitive. Also, this parameter can not be used in
         * conjunction with include_any_of_attributes parameter.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun includeAllOfAttributes(): Optional<String> =
            includeAllOfAttributes.getOptional("include_all_of_attributes")

        /**
         * Use this parameter to filter the assets found inside the specified area by their
         * attributes. Assets having at least one of the attributes added to this parameter, will be
         * returned in the search results. Multiple attributes can be separated using commas (,).
         *
         * Please note the attributes are case sensitive. Also, this parameter can not be used in
         * conjunction with include_all_of_attributes parameter.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun includeAnyOfAttributes(): Optional<String> =
            includeAnyOfAttributes.getOptional("include_any_of_attributes")

        /**
         * Returns the raw JSON value of [includeAllOfAttributes].
         *
         * Unlike [includeAllOfAttributes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("include_all_of_attributes")
        @ExcludeMissing
        fun _includeAllOfAttributes(): JsonField<String> = includeAllOfAttributes

        /**
         * Returns the raw JSON value of [includeAnyOfAttributes].
         *
         * Unlike [includeAnyOfAttributes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("include_any_of_attributes")
        @ExcludeMissing
        fun _includeAnyOfAttributes(): JsonField<String> = includeAnyOfAttributes

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

            /** Returns a mutable builder for constructing an instance of [MatchFilter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MatchFilter]. */
        class Builder internal constructor() {

            private var includeAllOfAttributes: JsonField<String> = JsonMissing.of()
            private var includeAnyOfAttributes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(matchFilter: MatchFilter) = apply {
                includeAllOfAttributes = matchFilter.includeAllOfAttributes
                includeAnyOfAttributes = matchFilter.includeAnyOfAttributes
                additionalProperties = matchFilter.additionalProperties.toMutableMap()
            }

            /**
             * Use this parameter to filter the assets found inside the specified area by their
             * attributes. Only the assets having all the attributes that are added to this
             * parameter, will be returned in the search results. Multiple attributes can be
             * separated using commas (,).
             *
             * Please note the attributes are case sensitive. Also, this parameter can not be used
             * in conjunction with include_any_of_attributes parameter.
             */
            fun includeAllOfAttributes(includeAllOfAttributes: String) =
                includeAllOfAttributes(JsonField.of(includeAllOfAttributes))

            /**
             * Sets [Builder.includeAllOfAttributes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeAllOfAttributes] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun includeAllOfAttributes(includeAllOfAttributes: JsonField<String>) = apply {
                this.includeAllOfAttributes = includeAllOfAttributes
            }

            /**
             * Use this parameter to filter the assets found inside the specified area by their
             * attributes. Assets having at least one of the attributes added to this parameter,
             * will be returned in the search results. Multiple attributes can be separated using
             * commas (,).
             *
             * Please note the attributes are case sensitive. Also, this parameter can not be used
             * in conjunction with include_all_of_attributes parameter.
             */
            fun includeAnyOfAttributes(includeAnyOfAttributes: String) =
                includeAnyOfAttributes(JsonField.of(includeAnyOfAttributes))

            /**
             * Sets [Builder.includeAnyOfAttributes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeAnyOfAttributes] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun includeAnyOfAttributes(includeAnyOfAttributes: JsonField<String>) = apply {
                this.includeAnyOfAttributes = includeAnyOfAttributes
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
             * Returns an immutable instance of [MatchFilter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): MatchFilter =
                MatchFilter(
                    includeAllOfAttributes,
                    includeAnyOfAttributes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): MatchFilter = apply {
            if (validated) {
                return@apply
            }

            includeAllOfAttributes()
            includeAnyOfAttributes()
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
            (if (includeAllOfAttributes.asKnown().isPresent) 1 else 0) +
                (if (includeAnyOfAttributes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MatchFilter &&
                includeAllOfAttributes == other.includeAllOfAttributes &&
                includeAnyOfAttributes == other.includeAnyOfAttributes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(includeAllOfAttributes, includeAnyOfAttributes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MatchFilter{includeAllOfAttributes=$includeAllOfAttributes, includeAnyOfAttributes=$includeAnyOfAttributes, additionalProperties=$additionalProperties}"
    }

    class Sort
    private constructor(
        private val sortBy: JsonField<SortBy>,
        private val sortDestination: JsonField<SortDestination>,
        private val sortDrivingMode: JsonField<SortDrivingMode>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("sort_by") @ExcludeMissing sortBy: JsonField<SortBy> = JsonMissing.of(),
            @JsonProperty("sort_destination")
            @ExcludeMissing
            sortDestination: JsonField<SortDestination> = JsonMissing.of(),
            @JsonProperty("sort_driving_mode")
            @ExcludeMissing
            sortDrivingMode: JsonField<SortDrivingMode> = JsonMissing.of(),
        ) : this(sortBy, sortDestination, sortDrivingMode, mutableMapOf())

        /**
         * Specify the metric to sort the assets returned in the search result. The valid values
         * are:
         * - **distance** : Sorts the assets by driving distance to the given sort_destination .
         * - **duration** : Sorts the assets by travel time to the given sort_destination .
         * - **straight_distance** : Sort the assets by straight-line distance to the given
         *   sort-destination .
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sortBy(): Optional<SortBy> = sortBy.getOptional("sort_by")

        /**
         * Specifies the location coordinates of the point which acts as destination for sorting the
         * assets in the search results. The service will sort each asset based on the driving
         * distance or travel time to this destination, from its current location. Use the sort_by
         * parameter to configure the metric that should be used for sorting the assets. Please note
         * that sort_destination is required when sort_by is provided.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sortDestination(): Optional<SortDestination> =
            sortDestination.getOptional("sort_destination")

        /**
         * Specifies the driving mode to be used for determining travel duration or driving distance
         * for sorting the assets in search result.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sortDrivingMode(): Optional<SortDrivingMode> =
            sortDrivingMode.getOptional("sort_driving_mode")

        /**
         * Returns the raw JSON value of [sortBy].
         *
         * Unlike [sortBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sort_by") @ExcludeMissing fun _sortBy(): JsonField<SortBy> = sortBy

        /**
         * Returns the raw JSON value of [sortDestination].
         *
         * Unlike [sortDestination], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sort_destination")
        @ExcludeMissing
        fun _sortDestination(): JsonField<SortDestination> = sortDestination

        /**
         * Returns the raw JSON value of [sortDrivingMode].
         *
         * Unlike [sortDrivingMode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sort_driving_mode")
        @ExcludeMissing
        fun _sortDrivingMode(): JsonField<SortDrivingMode> = sortDrivingMode

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

            /** Returns a mutable builder for constructing an instance of [Sort]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Sort]. */
        class Builder internal constructor() {

            private var sortBy: JsonField<SortBy> = JsonMissing.of()
            private var sortDestination: JsonField<SortDestination> = JsonMissing.of()
            private var sortDrivingMode: JsonField<SortDrivingMode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sort: Sort) = apply {
                sortBy = sort.sortBy
                sortDestination = sort.sortDestination
                sortDrivingMode = sort.sortDrivingMode
                additionalProperties = sort.additionalProperties.toMutableMap()
            }

            /**
             * Specify the metric to sort the assets returned in the search result. The valid values
             * are:
             * - **distance** : Sorts the assets by driving distance to the given sort_destination .
             * - **duration** : Sorts the assets by travel time to the given sort_destination .
             * - **straight_distance** : Sort the assets by straight-line distance to the given
             *   sort-destination .
             */
            fun sortBy(sortBy: SortBy) = sortBy(JsonField.of(sortBy))

            /**
             * Sets [Builder.sortBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sortBy] with a well-typed [SortBy] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sortBy(sortBy: JsonField<SortBy>) = apply { this.sortBy = sortBy }

            /**
             * Specifies the location coordinates of the point which acts as destination for sorting
             * the assets in the search results. The service will sort each asset based on the
             * driving distance or travel time to this destination, from its current location. Use
             * the sort_by parameter to configure the metric that should be used for sorting the
             * assets. Please note that sort_destination is required when sort_by is provided.
             */
            fun sortDestination(sortDestination: SortDestination) =
                sortDestination(JsonField.of(sortDestination))

            /**
             * Sets [Builder.sortDestination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sortDestination] with a well-typed [SortDestination]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sortDestination(sortDestination: JsonField<SortDestination>) = apply {
                this.sortDestination = sortDestination
            }

            /**
             * Specifies the driving mode to be used for determining travel duration or driving
             * distance for sorting the assets in search result.
             */
            fun sortDrivingMode(sortDrivingMode: SortDrivingMode) =
                sortDrivingMode(JsonField.of(sortDrivingMode))

            /**
             * Sets [Builder.sortDrivingMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sortDrivingMode] with a well-typed [SortDrivingMode]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sortDrivingMode(sortDrivingMode: JsonField<SortDrivingMode>) = apply {
                this.sortDrivingMode = sortDrivingMode
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
             * Returns an immutable instance of [Sort].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Sort =
                Sort(sortBy, sortDestination, sortDrivingMode, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Sort = apply {
            if (validated) {
                return@apply
            }

            sortBy().ifPresent { it.validate() }
            sortDestination().ifPresent { it.validate() }
            sortDrivingMode().ifPresent { it.validate() }
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
            (sortBy.asKnown().getOrNull()?.validity() ?: 0) +
                (sortDestination.asKnown().getOrNull()?.validity() ?: 0) +
                (sortDrivingMode.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Specify the metric to sort the assets returned in the search result. The valid values
         * are:
         * - **distance** : Sorts the assets by driving distance to the given sort_destination .
         * - **duration** : Sorts the assets by travel time to the given sort_destination .
         * - **straight_distance** : Sort the assets by straight-line distance to the given
         *   sort-destination .
         */
        class SortBy @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DISTANCE = of("distance")

                @JvmField val DURATION = of("duration")

                @JvmField val STRAIGHT_DISTANCE = of("straight_distance")

                @JvmStatic fun of(value: String) = SortBy(JsonField.of(value))
            }

            /** An enum containing [SortBy]'s known values. */
            enum class Known {
                DISTANCE,
                DURATION,
                STRAIGHT_DISTANCE,
            }

            /**
             * An enum containing [SortBy]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [SortBy] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DISTANCE,
                DURATION,
                STRAIGHT_DISTANCE,
                /**
                 * An enum member indicating that [SortBy] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DISTANCE -> Value.DISTANCE
                    DURATION -> Value.DURATION
                    STRAIGHT_DISTANCE -> Value.STRAIGHT_DISTANCE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws NextbillionSdkInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    DISTANCE -> Known.DISTANCE
                    DURATION -> Known.DURATION
                    STRAIGHT_DISTANCE -> Known.STRAIGHT_DISTANCE
                    else -> throw NextbillionSdkInvalidDataException("Unknown SortBy: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws NextbillionSdkInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    NextbillionSdkInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): SortBy = apply {
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

                return other is SortBy && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Specifies the location coordinates of the point which acts as destination for sorting the
         * assets in the search results. The service will sort each asset based on the driving
         * distance or travel time to this destination, from its current location. Use the sort_by
         * parameter to configure the metric that should be used for sorting the assets. Please note
         * that sort_destination is required when sort_by is provided.
         */
        class SortDestination
        private constructor(
            private val lat: JsonField<Double>,
            private val lon: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
            ) : this(lat, lon, mutableMapOf())

            /**
             * Latitude of the destination location
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lat(): Double = lat.getRequired("lat")

            /**
             * Longitude of the destination location
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lon(): Double = lon.getRequired("lon")

            /**
             * Returns the raw JSON value of [lat].
             *
             * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

            /**
             * Returns the raw JSON value of [lon].
             *
             * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

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
                 * Returns a mutable builder for constructing an instance of [SortDestination].
                 *
                 * The following fields are required:
                 * ```java
                 * .lat()
                 * .lon()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SortDestination]. */
            class Builder internal constructor() {

                private var lat: JsonField<Double>? = null
                private var lon: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(sortDestination: SortDestination) = apply {
                    lat = sortDestination.lat
                    lon = sortDestination.lon
                    additionalProperties = sortDestination.additionalProperties.toMutableMap()
                }

                /** Latitude of the destination location */
                fun lat(lat: Double) = lat(JsonField.of(lat))

                /**
                 * Sets [Builder.lat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lat] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                /** Longitude of the destination location */
                fun lon(lon: Double) = lon(JsonField.of(lon))

                /**
                 * Sets [Builder.lon] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lon] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

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
                 * Returns an immutable instance of [SortDestination].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .lat()
                 * .lon()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SortDestination =
                    SortDestination(
                        checkRequired("lat", lat),
                        checkRequired("lon", lon),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): SortDestination = apply {
                if (validated) {
                    return@apply
                }

                lat()
                lon()
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
                (if (lat.asKnown().isPresent) 1 else 0) + (if (lon.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SortDestination &&
                    lat == other.lat &&
                    lon == other.lon &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(lat, lon, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SortDestination{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
        }

        /**
         * Specifies the driving mode to be used for determining travel duration or driving distance
         * for sorting the assets in search result.
         */
        class SortDrivingMode
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CAR = of("car")

                @JvmField val TRUCK = of("truck")

                @JvmStatic fun of(value: String) = SortDrivingMode(JsonField.of(value))
            }

            /** An enum containing [SortDrivingMode]'s known values. */
            enum class Known {
                CAR,
                TRUCK,
            }

            /**
             * An enum containing [SortDrivingMode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [SortDrivingMode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CAR,
                TRUCK,
                /**
                 * An enum member indicating that [SortDrivingMode] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CAR -> Value.CAR
                    TRUCK -> Value.TRUCK
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws NextbillionSdkInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    CAR -> Known.CAR
                    TRUCK -> Known.TRUCK
                    else ->
                        throw NextbillionSdkInvalidDataException("Unknown SortDrivingMode: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws NextbillionSdkInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    NextbillionSdkInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): SortDrivingMode = apply {
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

                return other is SortDrivingMode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sort &&
                sortBy == other.sortBy &&
                sortDestination == other.sortDestination &&
                sortDrivingMode == other.sortDrivingMode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(sortBy, sortDestination, sortDrivingMode, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Sort{sortBy=$sortBy, sortDestination=$sortDestination, sortDrivingMode=$sortDrivingMode, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PolygonCreateParams &&
            key == other.key &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(key, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PolygonCreateParams{key=$key, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
