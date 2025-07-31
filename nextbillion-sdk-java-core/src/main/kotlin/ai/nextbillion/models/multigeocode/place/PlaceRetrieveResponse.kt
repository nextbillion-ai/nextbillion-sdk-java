// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.multigeocode.place

import ai.nextbillion.core.Enum
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

class PlaceRetrieveResponse
private constructor(
    private val dataSorce: JsonField<DataSorce>,
    private val docId: JsonField<String>,
    private val place: JsonField<List<PlaceItem>>,
    private val score: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dataSorce")
        @ExcludeMissing
        dataSorce: JsonField<DataSorce> = JsonMissing.of(),
        @JsonProperty("docId") @ExcludeMissing docId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("place") @ExcludeMissing place: JsonField<List<PlaceItem>> = JsonMissing.of(),
        @JsonProperty("score") @ExcludeMissing score: JsonField<Long> = JsonMissing.of(),
    ) : this(dataSorce, docId, place, score, mutableMapOf())

    /**
     * It displays the information about the current source and current status of the place. Use the
     * “Update Place” method to change these values, as needed.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dataSorce(): Optional<DataSorce> = dataSorce.getOptional("dataSorce")

    /**
     * The unique NextBillion ID for the result item.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun docId(): Optional<String> = docId.getOptional("docId")

    /**
     * This parameter represents the place details, including geographical information, address and
     * other related information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun place(): Optional<List<PlaceItem>> = place.getOptional("place")

    /**
     * It returns the system calculated weighted score of the place. It depends on how ‘richly’ the
     * place was defined at the time of creation. In order to modify the score, use “Update Place”
     * method and update information for parameters which are not set currently. As an alternative,
     * you can directly update the `score` to a custom value.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun score(): Optional<Long> = score.getOptional("score")

    /**
     * Returns the raw JSON value of [dataSorce].
     *
     * Unlike [dataSorce], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataSorce") @ExcludeMissing fun _dataSorce(): JsonField<DataSorce> = dataSorce

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

        /** Returns a mutable builder for constructing an instance of [PlaceRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlaceRetrieveResponse]. */
    class Builder internal constructor() {

        private var dataSorce: JsonField<DataSorce> = JsonMissing.of()
        private var docId: JsonField<String> = JsonMissing.of()
        private var place: JsonField<MutableList<PlaceItem>>? = null
        private var score: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(placeRetrieveResponse: PlaceRetrieveResponse) = apply {
            dataSorce = placeRetrieveResponse.dataSorce
            docId = placeRetrieveResponse.docId
            place = placeRetrieveResponse.place.map { it.toMutableList() }
            score = placeRetrieveResponse.score
            additionalProperties = placeRetrieveResponse.additionalProperties.toMutableMap()
        }

        /**
         * It displays the information about the current source and current status of the place. Use
         * the “Update Place” method to change these values, as needed.
         */
        fun dataSorce(dataSorce: DataSorce) = dataSorce(JsonField.of(dataSorce))

        /**
         * Sets [Builder.dataSorce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSorce] with a well-typed [DataSorce] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataSorce(dataSorce: JsonField<DataSorce>) = apply { this.dataSorce = dataSorce }

        /** The unique NextBillion ID for the result item. */
        fun docId(docId: String) = docId(JsonField.of(docId))

        /**
         * Sets [Builder.docId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.docId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun docId(docId: JsonField<String>) = apply { this.docId = docId }

        /**
         * This parameter represents the place details, including geographical information, address
         * and other related information.
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
         * It returns the system calculated weighted score of the place. It depends on how ‘richly’
         * the place was defined at the time of creation. In order to modify the score, use “Update
         * Place” method and update information for parameters which are not set currently. As an
         * alternative, you can directly update the `score` to a custom value.
         */
        fun score(score: Long) = score(JsonField.of(score))

        /**
         * Sets [Builder.score] to an arbitrary JSON value.
         *
         * You should usually call [Builder.score] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [PlaceRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlaceRetrieveResponse =
            PlaceRetrieveResponse(
                dataSorce,
                docId,
                (place ?: JsonMissing.of()).map { it.toImmutable() },
                score,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PlaceRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        dataSorce().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (dataSorce.asKnown().getOrNull()?.validity() ?: 0) +
            (if (docId.asKnown().isPresent) 1 else 0) +
            (place.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (score.asKnown().isPresent) 1 else 0)

    /**
     * It displays the information about the current source and current status of the place. Use the
     * “Update Place” method to change these values, as needed.
     */
    class DataSorce
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
         * This parameter represents the current dataset source of the information returned in the
         * result.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun source(): Optional<String> = source.getOptional("source")

        /**
         * This parameter indicates if a place is currently discoverable by search API or not.
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

            /** Returns a mutable builder for constructing an instance of [DataSorce]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DataSorce]. */
        class Builder internal constructor() {

            private var refId: JsonField<String> = JsonMissing.of()
            private var source: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dataSorce: DataSorce) = apply {
                refId = dataSorce.refId
                source = dataSorce.source
                status = dataSorce.status
                additionalProperties = dataSorce.additionalProperties.toMutableMap()
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
             * This parameter represents the current dataset source of the information returned in
             * the result.
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
             * This parameter indicates if a place is currently discoverable by search API or not.
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
             * Returns an immutable instance of [DataSorce].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DataSorce =
                DataSorce(refId, source, status, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): DataSorce = apply {
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

        /** This parameter indicates if a place is currently discoverable by search API or not. */
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

            return /* spotless:off */ other is DataSorce && refId == other.refId && source == other.source && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(refId, source, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DataSorce{refId=$refId, source=$source, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlaceRetrieveResponse && dataSorce == other.dataSorce && docId == other.docId && place == other.place && score == other.score && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(dataSorce, docId, place, score, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlaceRetrieveResponse{dataSorce=$dataSorce, docId=$docId, place=$place, score=$score, additionalProperties=$additionalProperties}"
}
