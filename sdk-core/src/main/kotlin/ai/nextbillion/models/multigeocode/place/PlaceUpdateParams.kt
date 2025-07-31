// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.multigeocode.place

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

/**
 * The "Update Place" method allows businesses to update the attributes of an existing place.
 *
 * This method allows you to update the attributes of custom places. In effect, updating a place
 * replaces the current information in search results with the updated information associated with
 * the specific docID. Use this method to enhance the accuracy/usability of your search results with
 * respect to the default dataset to suit your business needs.
 *
 * If you want to prioritize a particular result in your search results, update the ‘score’ of that
 * specific place. Alternatively, you can block places which are no longer needed by setting their
 * status: ‘disable’.
 */
class PlaceUpdateParams
private constructor(
    private val docId: String?,
    private val key: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun docId(): Optional<String> = Optional.ofNullable(docId)

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * dataSource values can be updated to enhance or prioritize the search results to better suit
     * specific business use cases.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dataSource(): Optional<DataSource> = body.dataSource()

    /**
     * This parameter represents the place details, including geographical information, address and
     * other related information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun place(): Optional<List<PlaceItem>> = body.place()

    /**
     * Search score of the place. This is calculated based on how ‘richly’ the place is defined. For
     * instance, a place with street name, city, state and country attributes set might be ranked
     * lower than a place which has values of house, building, street name, city, state and country
     * attributes set. The score determines the rank of the place among search results. You can also
     * use this field to set a custom score as per its relevance to rank it among the search results
     * from multiple data sources.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun score(): Optional<Long> = body.score()

    /**
     * Returns the raw JSON value of [dataSource].
     *
     * Unlike [dataSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dataSource(): JsonField<DataSource> = body._dataSource()

    /**
     * Returns the raw JSON value of [place].
     *
     * Unlike [place], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _place(): JsonField<List<PlaceItem>> = body._place()

    /**
     * Returns the raw JSON value of [score].
     *
     * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _score(): JsonField<Long> = body._score()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlaceUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlaceUpdateParams]. */
    class Builder internal constructor() {

        private var docId: String? = null
        private var key: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(placeUpdateParams: PlaceUpdateParams) = apply {
            docId = placeUpdateParams.docId
            key = placeUpdateParams.key
            body = placeUpdateParams.body.toBuilder()
            additionalHeaders = placeUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = placeUpdateParams.additionalQueryParams.toBuilder()
        }

        fun docId(docId: String?) = apply { this.docId = docId }

        /** Alias for calling [Builder.docId] with `docId.orElse(null)`. */
        fun docId(docId: Optional<String>) = docId(docId.getOrNull())

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [dataSource]
         * - [place]
         * - [score]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * dataSource values can be updated to enhance or prioritize the search results to better
         * suit specific business use cases.
         */
        fun dataSource(dataSource: DataSource) = apply { body.dataSource(dataSource) }

        /**
         * Sets [Builder.dataSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSource] with a well-typed [DataSource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataSource(dataSource: JsonField<DataSource>) = apply { body.dataSource(dataSource) }

        /**
         * This parameter represents the place details, including geographical information, address
         * and other related information.
         */
        fun place(place: List<PlaceItem>) = apply { body.place(place) }

        /**
         * Sets [Builder.place] to an arbitrary JSON value.
         *
         * You should usually call [Builder.place] with a well-typed `List<PlaceItem>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun place(place: JsonField<List<PlaceItem>>) = apply { body.place(place) }

        /**
         * Adds a single [PlaceItem] to [Builder.place].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPlace(place: PlaceItem) = apply { body.addPlace(place) }

        /**
         * Search score of the place. This is calculated based on how ‘richly’ the place is defined.
         * For instance, a place with street name, city, state and country attributes set might be
         * ranked lower than a place which has values of house, building, street name, city, state
         * and country attributes set. The score determines the rank of the place among search
         * results. You can also use this field to set a custom score as per its relevance to rank
         * it among the search results from multiple data sources.
         */
        fun score(score: Long) = apply { body.score(score) }

        /**
         * Sets [Builder.score] to an arbitrary JSON value.
         *
         * You should usually call [Builder.score] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun score(score: JsonField<Long>) = apply { body.score(score) }

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
         * Returns an immutable instance of [PlaceUpdateParams].
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
        fun build(): PlaceUpdateParams =
            PlaceUpdateParams(
                docId,
                checkRequired("key", key),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> docId ?: ""
            else -> ""
        }

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
        private val dataSource: JsonField<DataSource>,
        private val place: JsonField<List<PlaceItem>>,
        private val score: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dataSource")
            @ExcludeMissing
            dataSource: JsonField<DataSource> = JsonMissing.of(),
            @JsonProperty("place")
            @ExcludeMissing
            place: JsonField<List<PlaceItem>> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Long> = JsonMissing.of(),
        ) : this(dataSource, place, score, mutableMapOf())

        /**
         * dataSource values can be updated to enhance or prioritize the search results to better
         * suit specific business use cases.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dataSource(): Optional<DataSource> = dataSource.getOptional("dataSource")

        /**
         * This parameter represents the place details, including geographical information, address
         * and other related information.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun place(): Optional<List<PlaceItem>> = place.getOptional("place")

        /**
         * Search score of the place. This is calculated based on how ‘richly’ the place is defined.
         * For instance, a place with street name, city, state and country attributes set might be
         * ranked lower than a place which has values of house, building, street name, city, state
         * and country attributes set. The score determines the rank of the place among search
         * results. You can also use this field to set a custom score as per its relevance to rank
         * it among the search results from multiple data sources.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun score(): Optional<Long> = score.getOptional("score")

        /**
         * Returns the raw JSON value of [dataSource].
         *
         * Unlike [dataSource], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataSource")
        @ExcludeMissing
        fun _dataSource(): JsonField<DataSource> = dataSource

        /**
         * Returns the raw JSON value of [place].
         *
         * Unlike [place], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("place") @ExcludeMissing fun _place(): JsonField<List<PlaceItem>> = place

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Long> = score

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

            private var dataSource: JsonField<DataSource> = JsonMissing.of()
            private var place: JsonField<MutableList<PlaceItem>>? = null
            private var score: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                dataSource = body.dataSource
                place = body.place.map { it.toMutableList() }
                score = body.score
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * dataSource values can be updated to enhance or prioritize the search results to
             * better suit specific business use cases.
             */
            fun dataSource(dataSource: DataSource) = dataSource(JsonField.of(dataSource))

            /**
             * Sets [Builder.dataSource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataSource] with a well-typed [DataSource] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataSource(dataSource: JsonField<DataSource>) = apply {
                this.dataSource = dataSource
            }

            /**
             * This parameter represents the place details, including geographical information,
             * address and other related information.
             */
            fun place(place: List<PlaceItem>) = place(JsonField.of(place))

            /**
             * Sets [Builder.place] to an arbitrary JSON value.
             *
             * You should usually call [Builder.place] with a well-typed `List<PlaceItem>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun place(place: JsonField<List<PlaceItem>>) = apply {
                this.place = place.map { it.toMutableList() }
            }

            /**
             * Adds a single [PlaceItem] to [Builder.place].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPlace(place: PlaceItem) = apply {
                this.place =
                    (this.place ?: JsonField.of(mutableListOf())).also {
                        checkKnown("place", it).add(place)
                    }
            }

            /**
             * Search score of the place. This is calculated based on how ‘richly’ the place is
             * defined. For instance, a place with street name, city, state and country attributes
             * set might be ranked lower than a place which has values of house, building, street
             * name, city, state and country attributes set. The score determines the rank of the
             * place among search results. You can also use this field to set a custom score as per
             * its relevance to rank it among the search results from multiple data sources.
             */
            fun score(score: Long) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun score(score: JsonField<Long>) = apply { this.score = score }

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
                Body(
                    dataSource,
                    (place ?: JsonMissing.of()).map { it.toImmutable() },
                    score,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            dataSource().ifPresent { it.validate() }
            place().ifPresent { it.forEach { it.validate() } }
            score()
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
            (dataSource.asKnown().getOrNull()?.validity() ?: 0) +
                (place.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (score.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && dataSource == other.dataSource && place == other.place && score == other.score && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dataSource, place, score, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{dataSource=$dataSource, place=$place, score=$score, additionalProperties=$additionalProperties}"
    }

    /**
     * dataSource values can be updated to enhance or prioritize the search results to better suit
     * specific business use cases.
     */
    class DataSource
    private constructor(
        private val refId: JsonField<String>,
        private val source: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("refId") @ExcludeMissing refId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(refId, source, status, mutableMapOf())

        /**
         * This parameter represents the unique reference ID associated with the data source.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun refId(): Optional<String> = refId.getOptional("refId")

        /**
         * 1. Move the place to a new dataset by setting the value to a unique dataset name. You can
         *    also move the place to an existing dataset by using an existing dataset name other
         *    than the current one. In both cases, the current datasource will be replaced for the
         *    specified docID.
         * 2. Update the place in an existing dataset by setting the name to the current value.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun source(): Optional<String> = source.getOptional("source")

        /**
         * Set this to either enable or disable to allow the place to be retrieved by a search API
         * or block it respectively.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [refId].
         *
         * Unlike [refId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("refId") @ExcludeMissing fun _refId(): JsonField<String> = refId

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

            /** Returns a mutable builder for constructing an instance of [DataSource]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DataSource]. */
        class Builder internal constructor() {

            private var refId: JsonField<String> = JsonMissing.of()
            private var source: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dataSource: DataSource) = apply {
                refId = dataSource.refId
                source = dataSource.source
                status = dataSource.status
                additionalProperties = dataSource.additionalProperties.toMutableMap()
            }

            /**
             * This parameter represents the unique reference ID associated with the data source.
             */
            fun refId(refId: String) = refId(JsonField.of(refId))

            /**
             * Sets [Builder.refId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refId(refId: JsonField<String>) = apply { this.refId = refId }

            /**
             * 1. Move the place to a new dataset by setting the value to a unique dataset name. You
             *    can also move the place to an existing dataset by using an existing dataset name
             *    other than the current one. In both cases, the current datasource will be replaced
             *    for the specified docID.
             * 2. Update the place in an existing dataset by setting the name to the current value.
             */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /**
             * Set this to either enable or disable to allow the place to be retrieved by a search
             * API or block it respectively.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [DataSource].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DataSource =
                DataSource(refId, source, status, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): DataSource = apply {
            if (validated) {
                return@apply
            }

            refId()
            source()
            status().ifPresent { it.validate() }
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
            (if (refId.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Set this to either enable or disable to allow the place to be retrieved by a search API
         * or block it respectively.
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ENABLE = of("enable")

                @JvmField val DISABLE = of("disable")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                ENABLE,
                DISABLE,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ENABLE,
                DISABLE,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    ENABLE -> Value.ENABLE
                    DISABLE -> Value.DISABLE
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
                    ENABLE -> Known.ENABLE
                    DISABLE -> Known.DISABLE
                    else -> throw NextbillionSdkInvalidDataException("Unknown Status: $value")
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

            fun validate(): Status = apply {
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

                return /* spotless:off */ other is Status && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DataSource && refId == other.refId && source == other.source && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(refId, source, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DataSource{refId=$refId, source=$source, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlaceUpdateParams && docId == other.docId && key == other.key && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(docId, key, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PlaceUpdateParams{docId=$docId, key=$key, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
