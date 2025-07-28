// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.multigeocode

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.nextbillion_sdk.api.core.Enum
import com.nextbillion_sdk.api.core.ExcludeMissing
import com.nextbillion_sdk.api.core.JsonField
import com.nextbillion_sdk.api.core.JsonMissing
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.checkKnown
import com.nextbillion_sdk.api.core.toImmutable
import com.nextbillion_sdk.api.errors.NextbillionSdkInvalidDataException
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceItem
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MultigeocodeSearchResponse
private constructor(
    private val entities: JsonField<List<Entity>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("entities")
        @ExcludeMissing
        entities: JsonField<List<Entity>> = JsonMissing.of()
    ) : this(entities, mutableMapOf())

    /**
     * An array of objects containing the search result response. Each object represents one place
     * returned in the search response. An empty array would be returned if no matching place is
     * found.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun entities(): Optional<List<Entity>> = entities.getOptional("entities")

    /**
     * Returns the raw JSON value of [entities].
     *
     * Unlike [entities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entities") @ExcludeMissing fun _entities(): JsonField<List<Entity>> = entities

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
         * Returns a mutable builder for constructing an instance of [MultigeocodeSearchResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MultigeocodeSearchResponse]. */
    class Builder internal constructor() {

        private var entities: JsonField<MutableList<Entity>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(multigeocodeSearchResponse: MultigeocodeSearchResponse) = apply {
            entities = multigeocodeSearchResponse.entities.map { it.toMutableList() }
            additionalProperties = multigeocodeSearchResponse.additionalProperties.toMutableMap()
        }

        /**
         * An array of objects containing the search result response. Each object represents one
         * place returned in the search response. An empty array would be returned if no matching
         * place is found.
         */
        fun entities(entities: List<Entity>) = entities(JsonField.of(entities))

        /**
         * Sets [Builder.entities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entities] with a well-typed `List<Entity>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entities(entities: JsonField<List<Entity>>) = apply {
            this.entities = entities.map { it.toMutableList() }
        }

        /**
         * Adds a single [Entity] to [entities].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntity(entity: Entity) = apply {
            entities =
                (entities ?: JsonField.of(mutableListOf())).also {
                    checkKnown("entities", it).add(entity)
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
         * Returns an immutable instance of [MultigeocodeSearchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MultigeocodeSearchResponse =
            MultigeocodeSearchResponse(
                (entities ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MultigeocodeSearchResponse = apply {
        if (validated) {
            return@apply
        }

        entities().ifPresent { it.forEach { it.validate() } }
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
        (entities.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Entity
    private constructor(
        private val dataSource: JsonField<DataSource>,
        private val docId: JsonField<String>,
        private val place: JsonField<List<PlaceItem>>,
        private val score: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dataSource")
            @ExcludeMissing
            dataSource: JsonField<DataSource> = JsonMissing.of(),
            @JsonProperty("docId") @ExcludeMissing docId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("place")
            @ExcludeMissing
            place: JsonField<List<PlaceItem>> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Long> = JsonMissing.of(),
        ) : this(dataSource, docId, place, score, mutableMapOf())

        /**
         * It contains information about the dataset that returns the specific result
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dataSource(): Optional<DataSource> = dataSource.getOptional("dataSource")

        /**
         * The unique NextBillion ID for the result item. This ID can be used as input in “Get
         * Place”, “Update Place”, “Delete Place” methods.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun docId(): Optional<String> = docId.getOptional("docId")

        /**
         * This parameter represents the place details, including geographical information, address
         * and other related information.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun place(): Optional<List<PlaceItem>> = place.getOptional("place")

        /**
         * Integer value representing how good the result is. Higher score indicates a better match
         * between the search query and the result. This can be used to accept or reject the results
         * depending on how “relevant” a result is, for a given use case
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
         * Returns the raw JSON value of [docId].
         *
         * Unlike [docId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("docId") @ExcludeMissing fun _docId(): JsonField<String> = docId

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

            /** Returns a mutable builder for constructing an instance of [Entity]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Entity]. */
        class Builder internal constructor() {

            private var dataSource: JsonField<DataSource> = JsonMissing.of()
            private var docId: JsonField<String> = JsonMissing.of()
            private var place: JsonField<MutableList<PlaceItem>>? = null
            private var score: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entity: Entity) = apply {
                dataSource = entity.dataSource
                docId = entity.docId
                place = entity.place.map { it.toMutableList() }
                score = entity.score
                additionalProperties = entity.additionalProperties.toMutableMap()
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
             * The unique NextBillion ID for the result item. This ID can be used as input in “Get
             * Place”, “Update Place”, “Delete Place” methods.
             */
            fun docId(docId: String) = docId(JsonField.of(docId))

            /**
             * Sets [Builder.docId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.docId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun docId(docId: JsonField<String>) = apply { this.docId = docId }

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
             * Integer value representing how good the result is. Higher score indicates a better
             * match between the search query and the result. This can be used to accept or reject
             * the results depending on how “relevant” a result is, for a given use case
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
             * Returns an immutable instance of [Entity].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Entity =
                Entity(
                    dataSource,
                    docId,
                    (place ?: JsonMissing.of()).map { it.toImmutable() },
                    score,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Entity = apply {
            if (validated) {
                return@apply
            }

            dataSource().ifPresent { it.validate() }
            docId()
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
                (if (docId.asKnown().isPresent) 1 else 0) +
                (place.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (score.asKnown().isPresent) 1 else 0)

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
                @JsonProperty("source")
                @ExcludeMissing
                source: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            ) : this(refId, source, status, mutableMapOf())

            /**
             * This parameter represents the unique reference ID associated with the data source.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun refId(): Optional<String> = refId.getOptional("refId")

            /**
             * This parameter represents the source of the data.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun source(): Optional<String> = source.getOptional("source")

            /**
             * This parameter indicates if a place is searchable.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
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
                 * This parameter represents the unique reference ID associated with the data
                 * source.
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
                 * You should usually call [Builder.source] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun source(source: JsonField<String>) = apply { this.source = source }

                /** This parameter indicates if a place is searchable. */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

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
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ENABLE,
                    DISABLE,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws NextbillionSdkInvalidDataException if this class instance's value is a
                 *   not a known member.
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
                 * @throws NextbillionSdkInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
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

            return /* spotless:off */ other is Entity && dataSource == other.dataSource && docId == other.docId && place == other.place && score == other.score && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dataSource, docId, place, score, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entity{dataSource=$dataSource, docId=$docId, place=$place, score=$score, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MultigeocodeSearchResponse && entities == other.entities && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(entities, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MultigeocodeSearchResponse{entities=$entities, additionalProperties=$additionalProperties}"
}
