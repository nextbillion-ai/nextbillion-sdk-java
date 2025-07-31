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
 * The "Add Place" method allows users to create custom places
 *
 * Add place method provides the flexibility to create custom places in a way that suits your
 * business needs. The newly created place and its attributes can be added to custom (proprietary)
 * dataset - to the effect of building your own places dataset (s) - or, to a default dataset.
 * Overcome inaccurate ‘POI’ details from default search provider by creating custom, highly
 * accurate ‘POIs’.
 */
class PlaceCreateParams
private constructor(
    private val key: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * This parameter represents the place details, including geographical information, address and
     * other related information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun place(): List<Place> = body.place()

    /**
     * It contains information about the dataset that returns the specific result
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dataSource(): Optional<DataSource> = body.dataSource()

    /**
     * When 2 places are located within 100 meters of each other and have more than 90% of matching
     * attributes (at least 11 out of 12 attributes in the “place” object), they will be considered
     * duplicates and any requests to add such a new place would be rejected. Set force=true to
     * override this duplicate check. You can use this to create closely located POIs. For instance,
     * places inside a mall, university or a government building etc.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun force(): Optional<Boolean> = body.force()

    /**
     * Search score of the place. This is calculated based on how ‘richly’ the place is defined. For
     * instance, a place with - street name, city, state and country attributes set might be ranked
     * lower than a place which has values of - house, building, street name, city, state and
     * country attributes set. The score determines the rank of the place among search results. You
     * can also use this field to set a custom score as per its relevance to rank it among the
     * search results from multiple data sources.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun score(): Optional<Long> = body.score()

    /**
     * Returns the raw JSON value of [place].
     *
     * Unlike [place], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _place(): JsonField<List<Place>> = body._place()

    /**
     * Returns the raw JSON value of [dataSource].
     *
     * Unlike [dataSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dataSource(): JsonField<DataSource> = body._dataSource()

    /**
     * Returns the raw JSON value of [force].
     *
     * Unlike [force], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _force(): JsonField<Boolean> = body._force()

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
         * Returns a mutable builder for constructing an instance of [PlaceCreateParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .place()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlaceCreateParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(placeCreateParams: PlaceCreateParams) = apply {
            key = placeCreateParams.key
            body = placeCreateParams.body.toBuilder()
            additionalHeaders = placeCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = placeCreateParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [place]
         * - [dataSource]
         * - [force]
         * - [score]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * This parameter represents the place details, including geographical information, address
         * and other related information.
         */
        fun place(place: List<Place>) = apply { body.place(place) }

        /**
         * Sets [Builder.place] to an arbitrary JSON value.
         *
         * You should usually call [Builder.place] with a well-typed `List<Place>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun place(place: JsonField<List<Place>>) = apply { body.place(place) }

        /**
         * Adds a single [Place] to [Builder.place].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPlace(place: Place) = apply { body.addPlace(place) }

        /** It contains information about the dataset that returns the specific result */
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
         * When 2 places are located within 100 meters of each other and have more than 90% of
         * matching attributes (at least 11 out of 12 attributes in the “place” object), they will
         * be considered duplicates and any requests to add such a new place would be rejected. Set
         * force=true to override this duplicate check. You can use this to create closely located
         * POIs. For instance, places inside a mall, university or a government building etc.
         */
        fun force(force: Boolean) = apply { body.force(force) }

        /**
         * Sets [Builder.force] to an arbitrary JSON value.
         *
         * You should usually call [Builder.force] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun force(force: JsonField<Boolean>) = apply { body.force(force) }

        /**
         * Search score of the place. This is calculated based on how ‘richly’ the place is defined.
         * For instance, a place with - street name, city, state and country attributes set might be
         * ranked lower than a place which has values of - house, building, street name, city, state
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
         * Returns an immutable instance of [PlaceCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .place()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlaceCreateParams =
            PlaceCreateParams(
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
        private val place: JsonField<List<Place>>,
        private val dataSource: JsonField<DataSource>,
        private val force: JsonField<Boolean>,
        private val score: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("place") @ExcludeMissing place: JsonField<List<Place>> = JsonMissing.of(),
            @JsonProperty("dataSource")
            @ExcludeMissing
            dataSource: JsonField<DataSource> = JsonMissing.of(),
            @JsonProperty("force") @ExcludeMissing force: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Long> = JsonMissing.of(),
        ) : this(place, dataSource, force, score, mutableMapOf())

        /**
         * This parameter represents the place details, including geographical information, address
         * and other related information.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun place(): List<Place> = place.getRequired("place")

        /**
         * It contains information about the dataset that returns the specific result
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dataSource(): Optional<DataSource> = dataSource.getOptional("dataSource")

        /**
         * When 2 places are located within 100 meters of each other and have more than 90% of
         * matching attributes (at least 11 out of 12 attributes in the “place” object), they will
         * be considered duplicates and any requests to add such a new place would be rejected. Set
         * force=true to override this duplicate check. You can use this to create closely located
         * POIs. For instance, places inside a mall, university or a government building etc.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun force(): Optional<Boolean> = force.getOptional("force")

        /**
         * Search score of the place. This is calculated based on how ‘richly’ the place is defined.
         * For instance, a place with - street name, city, state and country attributes set might be
         * ranked lower than a place which has values of - house, building, street name, city, state
         * and country attributes set. The score determines the rank of the place among search
         * results. You can also use this field to set a custom score as per its relevance to rank
         * it among the search results from multiple data sources.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun score(): Optional<Long> = score.getOptional("score")

        /**
         * Returns the raw JSON value of [place].
         *
         * Unlike [place], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("place") @ExcludeMissing fun _place(): JsonField<List<Place>> = place

        /**
         * Returns the raw JSON value of [dataSource].
         *
         * Unlike [dataSource], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataSource")
        @ExcludeMissing
        fun _dataSource(): JsonField<DataSource> = dataSource

        /**
         * Returns the raw JSON value of [force].
         *
         * Unlike [force], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("force") @ExcludeMissing fun _force(): JsonField<Boolean> = force

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .place()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var place: JsonField<MutableList<Place>>? = null
            private var dataSource: JsonField<DataSource> = JsonMissing.of()
            private var force: JsonField<Boolean> = JsonMissing.of()
            private var score: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                place = body.place.map { it.toMutableList() }
                dataSource = body.dataSource
                force = body.force
                score = body.score
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * This parameter represents the place details, including geographical information,
             * address and other related information.
             */
            fun place(place: List<Place>) = place(JsonField.of(place))

            /**
             * Sets [Builder.place] to an arbitrary JSON value.
             *
             * You should usually call [Builder.place] with a well-typed `List<Place>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun place(place: JsonField<List<Place>>) = apply {
                this.place = place.map { it.toMutableList() }
            }

            /**
             * Adds a single [Place] to [Builder.place].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPlace(place: Place) = apply {
                this.place =
                    (this.place ?: JsonField.of(mutableListOf())).also {
                        checkKnown("place", it).add(place)
                    }
            }

            /** It contains information about the dataset that returns the specific result */
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
             * When 2 places are located within 100 meters of each other and have more than 90% of
             * matching attributes (at least 11 out of 12 attributes in the “place” object), they
             * will be considered duplicates and any requests to add such a new place would be
             * rejected. Set force=true to override this duplicate check. You can use this to create
             * closely located POIs. For instance, places inside a mall, university or a government
             * building etc.
             */
            fun force(force: Boolean) = force(JsonField.of(force))

            /**
             * Sets [Builder.force] to an arbitrary JSON value.
             *
             * You should usually call [Builder.force] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun force(force: JsonField<Boolean>) = apply { this.force = force }

            /**
             * Search score of the place. This is calculated based on how ‘richly’ the place is
             * defined. For instance, a place with - street name, city, state and country attributes
             * set might be ranked lower than a place which has values of - house, building, street
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
             *
             * The following fields are required:
             * ```java
             * .place()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("place", place).map { it.toImmutable() },
                    dataSource,
                    force,
                    score,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            place().forEach { it.validate() }
            dataSource().ifPresent { it.validate() }
            force()
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
            (place.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (dataSource.asKnown().getOrNull()?.validity() ?: 0) +
                (if (force.asKnown().isPresent) 1 else 0) +
                (if (score.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && place == other.place && dataSource == other.dataSource && force == other.force && score == other.score && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(place, dataSource, force, score, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{place=$place, dataSource=$dataSource, force=$force, score=$score, additionalProperties=$additionalProperties}"
    }

    class Place
    private constructor(
        private val geopoint: JsonField<Geopoint>,
        private val address: JsonField<String>,
        private val building: JsonField<String>,
        private val city: JsonField<String>,
        private val country: JsonField<String>,
        private val district: JsonField<String>,
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
            @JsonProperty("geopoint")
            @ExcludeMissing
            geopoint: JsonField<Geopoint> = JsonMissing.of(),
            @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
            @JsonProperty("building")
            @ExcludeMissing
            building: JsonField<String> = JsonMissing.of(),
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("district")
            @ExcludeMissing
            district: JsonField<String> = JsonMissing.of(),
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
            geopoint,
            address,
            building,
            city,
            country,
            district,
            house,
            poi,
            postalCode,
            state,
            street,
            subDistrict,
            mutableMapOf(),
        )

        /**
         * This parameter represents the geographical coordinates of the place. It includes the
         * latitude and longitude values.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun geopoint(): Geopoint = geopoint.getRequired("geopoint")

        /**
         * This parameter represents the complete address of the place, including the street, city,
         * state, postal code and country.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun address(): Optional<String> = address.getOptional("address")

        /**
         * This parameter represents additional building information if applicable.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun building(): Optional<String> = building.getOptional("building")

        /**
         * This parameter represents the city or town of the place.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun city(): Optional<String> = city.getOptional("city")

        /**
         * Country of the search context provided as comma-separated
         * [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) country codes.
         *
         * Note: Country codes should be provided in uppercase.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * This parameter represents the district of the place.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun district(): Optional<String> = district.getOptional("district")

        /**
         * This parameter represents the house or building number of the place.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun house(): Optional<String> = house.getOptional("house")

        /**
         * This parameter represents a point of interest within the place. A Point of Interest (POI)
         * refers to a specific location or area that is of interest to individuals for various
         * reasons. It could be a landmark, tourist attraction, business, or any other location that
         * people might find important or intriguing.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun poi(): Optional<Poi> = poi.getOptional("poi")

        /**
         * This parameter represents the postal code or ZIP code of the place.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun postalCode(): Optional<String> = postalCode.getOptional("postalCode")

        /**
         * This parameter represents the state or region of the place.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun state(): Optional<String> = state.getOptional("state")

        /**
         * This parameter represents the street name of the place.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun street(): Optional<String> = street.getOptional("street")

        /**
         * This parameter represents the sub-district or locality of the place.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun subDistrict(): Optional<String> = subDistrict.getOptional("subDistrict")

        /**
         * Returns the raw JSON value of [geopoint].
         *
         * Unlike [geopoint], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("geopoint") @ExcludeMissing fun _geopoint(): JsonField<Geopoint> = geopoint

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
        @JsonProperty("postalCode")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

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
        @JsonProperty("subDistrict")
        @ExcludeMissing
        fun _subDistrict(): JsonField<String> = subDistrict

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
             * Returns a mutable builder for constructing an instance of [Place].
             *
             * The following fields are required:
             * ```java
             * .geopoint()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Place]. */
        class Builder internal constructor() {

            private var geopoint: JsonField<Geopoint>? = null
            private var address: JsonField<String> = JsonMissing.of()
            private var building: JsonField<String> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var district: JsonField<String> = JsonMissing.of()
            private var house: JsonField<String> = JsonMissing.of()
            private var poi: JsonField<Poi> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var street: JsonField<String> = JsonMissing.of()
            private var subDistrict: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(place: Place) = apply {
                geopoint = place.geopoint
                address = place.address
                building = place.building
                city = place.city
                country = place.country
                district = place.district
                house = place.house
                poi = place.poi
                postalCode = place.postalCode
                state = place.state
                street = place.street
                subDistrict = place.subDistrict
                additionalProperties = place.additionalProperties.toMutableMap()
            }

            /**
             * This parameter represents the geographical coordinates of the place. It includes the
             * latitude and longitude values.
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
             * This parameter represents the complete address of the place, including the street,
             * city, state, postal code and country.
             */
            fun address(address: String) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            /** This parameter represents additional building information if applicable. */
            fun building(building: String) = building(JsonField.of(building))

            /**
             * Sets [Builder.building] to an arbitrary JSON value.
             *
             * You should usually call [Builder.building] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun building(building: JsonField<String>) = apply { this.building = building }

            /** This parameter represents the city or town of the place. */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /**
             * Country of the search context provided as comma-separated
             * [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) country codes.
             *
             * Note: Country codes should be provided in uppercase.
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

            /** This parameter represents the district of the place. */
            fun district(district: String) = district(JsonField.of(district))

            /**
             * Sets [Builder.district] to an arbitrary JSON value.
             *
             * You should usually call [Builder.district] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun district(district: JsonField<String>) = apply { this.district = district }

            /** This parameter represents the house or building number of the place. */
            fun house(house: String) = house(JsonField.of(house))

            /**
             * Sets [Builder.house] to an arbitrary JSON value.
             *
             * You should usually call [Builder.house] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun house(house: JsonField<String>) = apply { this.house = house }

            /**
             * This parameter represents a point of interest within the place. A Point of Interest
             * (POI) refers to a specific location or area that is of interest to individuals for
             * various reasons. It could be a landmark, tourist attraction, business, or any other
             * location that people might find important or intriguing.
             */
            fun poi(poi: Poi) = poi(JsonField.of(poi))

            /**
             * Sets [Builder.poi] to an arbitrary JSON value.
             *
             * You should usually call [Builder.poi] with a well-typed [Poi] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun poi(poi: JsonField<Poi>) = apply { this.poi = poi }

            /** This parameter represents the postal code or ZIP code of the place. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** This parameter represents the state or region of the place. */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** This parameter represents the street name of the place. */
            fun street(street: String) = street(JsonField.of(street))

            /**
             * Sets [Builder.street] to an arbitrary JSON value.
             *
             * You should usually call [Builder.street] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun street(street: JsonField<String>) = apply { this.street = street }

            /** This parameter represents the sub-district or locality of the place. */
            fun subDistrict(subDistrict: String) = subDistrict(JsonField.of(subDistrict))

            /**
             * Sets [Builder.subDistrict] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subDistrict] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subDistrict(subDistrict: JsonField<String>) = apply {
                this.subDistrict = subDistrict
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
             * Returns an immutable instance of [Place].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .geopoint()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Place =
                Place(
                    checkRequired("geopoint", geopoint),
                    address,
                    building,
                    city,
                    country,
                    district,
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

        fun validate(): Place = apply {
            if (validated) {
                return@apply
            }

            geopoint().validate()
            address()
            building()
            city()
            country()
            district()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (geopoint.asKnown().getOrNull()?.validity() ?: 0) +
                (if (address.asKnown().isPresent) 1 else 0) +
                (if (building.asKnown().isPresent) 1 else 0) +
                (if (city.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (district.asKnown().isPresent) 1 else 0) +
                (if (house.asKnown().isPresent) 1 else 0) +
                (poi.asKnown().getOrNull()?.validity() ?: 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0) +
                (if (street.asKnown().isPresent) 1 else 0) +
                (if (subDistrict.asKnown().isPresent) 1 else 0)

        /**
         * This parameter represents the geographical coordinates of the place. It includes the
         * latitude and longitude values.
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
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lat(): Optional<Double> = lat.getOptional("lat")

            /**
             * This parameter represents the longitude value of the place.
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

                /** This parameter represents the latitude value of the place. */
                fun lat(lat: Double) = lat(JsonField.of(lat))

                /**
                 * Sets [Builder.lat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lat] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                /** This parameter represents the longitude value of the place. */
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

        /**
         * This parameter represents a point of interest within the place. A Point of Interest (POI)
         * refers to a specific location or area that is of interest to individuals for various
         * reasons. It could be a landmark, tourist attraction, business, or any other location that
         * people might find important or intriguing.
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
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
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

            override fun toString() =
                "Poi{title=$title, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Place && geopoint == other.geopoint && address == other.address && building == other.building && city == other.city && country == other.country && district == other.district && house == other.house && poi == other.poi && postalCode == other.postalCode && state == other.state && street == other.street && subDistrict == other.subDistrict && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(geopoint, address, building, city, country, district, house, poi, postalCode, state, street, subDistrict, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Place{geopoint=$geopoint, address=$address, building=$building, city=$city, country=$country, district=$district, house=$house, poi=$poi, postalCode=$postalCode, state=$state, street=$street, subDistrict=$subDistrict, additionalProperties=$additionalProperties}"
    }

    /** It contains information about the dataset that returns the specific result */
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
         * This parameter represents the source of the data.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun source(): Optional<String> = source.getOptional("source")

        /**
         * This parameter indicates if a place is searchable.
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

            /** This parameter represents the source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** This parameter indicates if a place is searchable. */
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

        /** This parameter indicates if a place is searchable. */
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

        return /* spotless:off */ other is PlaceCreateParams && key == other.key && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PlaceCreateParams{key=$key, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
