// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.geofence

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.nextbillion.api.core.ExcludeMissing
import io.nextbillion.api.core.JsonField
import io.nextbillion.api.core.JsonMissing
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.checkKnown
import io.nextbillion.api.core.toImmutable
import io.nextbillion.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class GeofenceContainsResponse
private constructor(
    private val data: JsonField<Data>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(data, status, mutableMapOf())

    /**
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * A string indicating the state of the response. On successful responses, the value will be
     * `Ok`. Indicative error messages are returned for different errors. See the
     * [API Error Codes](#api-error-codes) section below for more information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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

        /** Returns a mutable builder for constructing an instance of [GeofenceContainsResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GeofenceContainsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(geofenceContainsResponse: GeofenceContainsResponse) = apply {
            data = geofenceContainsResponse.data
            status = geofenceContainsResponse.status
            additionalProperties = geofenceContainsResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /**
         * A string indicating the state of the response. On successful responses, the value will be
         * `Ok`. Indicative error messages are returned for different errors. See the
         * [API Error Codes](#api-error-codes) section below for more information.
         */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

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
         * Returns an immutable instance of [GeofenceContainsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GeofenceContainsResponse =
            GeofenceContainsResponse(data, status, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): GeofenceContainsResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
        status()
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
        (data.asKnown().getOrNull()?.validity() ?: 0) + (if (status.asKnown().isPresent) 1 else 0)

    class Data
    private constructor(
        private val resultList: JsonField<List<ResultList>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("result_list")
            @ExcludeMissing
            resultList: JsonField<List<ResultList>> = JsonMissing.of()
        ) : this(resultList, mutableMapOf())

        /**
         * An array of objects containing each of the geofences provided in the `geofences` input.
         * If `geofences` in not provided then the array will return all the geofences associated
         * with the `key`
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun resultList(): Optional<List<ResultList>> = resultList.getOptional("result_list")

        /**
         * Returns the raw JSON value of [resultList].
         *
         * Unlike [resultList], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result_list")
        @ExcludeMissing
        fun _resultList(): JsonField<List<ResultList>> = resultList

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var resultList: JsonField<MutableList<ResultList>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                resultList = data.resultList.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * An array of objects containing each of the geofences provided in the `geofences`
             * input. If `geofences` in not provided then the array will return all the geofences
             * associated with the `key`
             */
            fun resultList(resultList: List<ResultList>) = resultList(JsonField.of(resultList))

            /**
             * Sets [Builder.resultList] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resultList] with a well-typed `List<ResultList>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun resultList(resultList: JsonField<List<ResultList>>) = apply {
                this.resultList = resultList.map { it.toMutableList() }
            }

            /**
             * Adds a single [ResultList] to [Builder.resultList].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addResultList(resultList: ResultList) = apply {
                this.resultList =
                    (this.resultList ?: JsonField.of(mutableListOf())).also {
                        checkKnown("resultList", it).add(resultList)
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    (resultList ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            resultList().ifPresent { it.forEach { it.validate() } }
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
            (resultList.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class ResultList
        private constructor(
            private val geofenceDetail: JsonField<Geofence>,
            private val geofenceId: JsonField<String>,
            private val result: JsonField<List<Result>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("geofence_detail")
                @ExcludeMissing
                geofenceDetail: JsonField<Geofence> = JsonMissing.of(),
                @JsonProperty("geofence_id")
                @ExcludeMissing
                geofenceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("result")
                @ExcludeMissing
                result: JsonField<List<Result>> = JsonMissing.of(),
            ) : this(geofenceDetail, geofenceId, result, mutableMapOf())

            /**
             * An object with details of the geofence.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun geofenceDetail(): Optional<Geofence> = geofenceDetail.getOptional("geofence_detail")

            /**
             * ID of the geofence provided/generated at the time of creating the geofence.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun geofenceId(): Optional<String> = geofenceId.getOptional("geofence_id")

            /**
             * An array of objects with results of the contains check for each of the coordinate
             * points in `locations` against the geofence represented by `geofence_id`.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun result(): Optional<List<Result>> = result.getOptional("result")

            /**
             * Returns the raw JSON value of [geofenceDetail].
             *
             * Unlike [geofenceDetail], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("geofence_detail")
            @ExcludeMissing
            fun _geofenceDetail(): JsonField<Geofence> = geofenceDetail

            /**
             * Returns the raw JSON value of [geofenceId].
             *
             * Unlike [geofenceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("geofence_id")
            @ExcludeMissing
            fun _geofenceId(): JsonField<String> = geofenceId

            /**
             * Returns the raw JSON value of [result].
             *
             * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<List<Result>> = result

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

                /** Returns a mutable builder for constructing an instance of [ResultList]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ResultList]. */
            class Builder internal constructor() {

                private var geofenceDetail: JsonField<Geofence> = JsonMissing.of()
                private var geofenceId: JsonField<String> = JsonMissing.of()
                private var result: JsonField<MutableList<Result>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(resultList: ResultList) = apply {
                    geofenceDetail = resultList.geofenceDetail
                    geofenceId = resultList.geofenceId
                    result = resultList.result.map { it.toMutableList() }
                    additionalProperties = resultList.additionalProperties.toMutableMap()
                }

                /** An object with details of the geofence. */
                fun geofenceDetail(geofenceDetail: Geofence) =
                    geofenceDetail(JsonField.of(geofenceDetail))

                /**
                 * Sets [Builder.geofenceDetail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.geofenceDetail] with a well-typed [Geofence]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun geofenceDetail(geofenceDetail: JsonField<Geofence>) = apply {
                    this.geofenceDetail = geofenceDetail
                }

                /** ID of the geofence provided/generated at the time of creating the geofence. */
                fun geofenceId(geofenceId: String) = geofenceId(JsonField.of(geofenceId))

                /**
                 * Sets [Builder.geofenceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.geofenceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun geofenceId(geofenceId: JsonField<String>) = apply {
                    this.geofenceId = geofenceId
                }

                /**
                 * An array of objects with results of the contains check for each of the coordinate
                 * points in `locations` against the geofence represented by `geofence_id`.
                 */
                fun result(result: List<Result>) = result(JsonField.of(result))

                /**
                 * Sets [Builder.result] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.result] with a well-typed `List<Result>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun result(result: JsonField<List<Result>>) = apply {
                    this.result = result.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Result] to [Builder.result].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addResult(result: Result) = apply {
                    this.result =
                        (this.result ?: JsonField.of(mutableListOf())).also {
                            checkKnown("result", it).add(result)
                        }
                }

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
                 * Returns an immutable instance of [ResultList].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ResultList =
                    ResultList(
                        geofenceDetail,
                        geofenceId,
                        (result ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ResultList = apply {
                if (validated) {
                    return@apply
                }

                geofenceDetail().ifPresent { it.validate() }
                geofenceId()
                result().ifPresent { it.forEach { it.validate() } }
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
                (geofenceDetail.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (geofenceId.asKnown().isPresent) 1 else 0) +
                    (result.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Result
            private constructor(
                private val contain: JsonField<Boolean>,
                private val locationIndex: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("contain")
                    @ExcludeMissing
                    contain: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("location_index")
                    @ExcludeMissing
                    locationIndex: JsonField<Long> = JsonMissing.of(),
                ) : this(contain, locationIndex, mutableMapOf())

                /**
                 * `true` when a coordinate point in `locations` is contained by this geofence.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun contain(): Optional<Boolean> = contain.getOptional("contain")

                /**
                 * Index of the coordinate point in the input `locations`.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun locationIndex(): Optional<Long> = locationIndex.getOptional("location_index")

                /**
                 * Returns the raw JSON value of [contain].
                 *
                 * Unlike [contain], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("contain")
                @ExcludeMissing
                fun _contain(): JsonField<Boolean> = contain

                /**
                 * Returns the raw JSON value of [locationIndex].
                 *
                 * Unlike [locationIndex], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("location_index")
                @ExcludeMissing
                fun _locationIndex(): JsonField<Long> = locationIndex

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

                    /** Returns a mutable builder for constructing an instance of [Result]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Result]. */
                class Builder internal constructor() {

                    private var contain: JsonField<Boolean> = JsonMissing.of()
                    private var locationIndex: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(result: Result) = apply {
                        contain = result.contain
                        locationIndex = result.locationIndex
                        additionalProperties = result.additionalProperties.toMutableMap()
                    }

                    /**
                     * `true` when a coordinate point in `locations` is contained by this geofence.
                     */
                    fun contain(contain: Boolean) = contain(JsonField.of(contain))

                    /**
                     * Sets [Builder.contain] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.contain] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun contain(contain: JsonField<Boolean>) = apply { this.contain = contain }

                    /** Index of the coordinate point in the input `locations`. */
                    fun locationIndex(locationIndex: Long) =
                        locationIndex(JsonField.of(locationIndex))

                    /**
                     * Sets [Builder.locationIndex] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.locationIndex] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun locationIndex(locationIndex: JsonField<Long>) = apply {
                        this.locationIndex = locationIndex
                    }

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
                     * Returns an immutable instance of [Result].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Result =
                        Result(contain, locationIndex, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Result = apply {
                    if (validated) {
                        return@apply
                    }

                    contain()
                    locationIndex()
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
                    (if (contain.asKnown().isPresent) 1 else 0) +
                        (if (locationIndex.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Result && contain == other.contain && locationIndex == other.locationIndex && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(contain, locationIndex, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Result{contain=$contain, locationIndex=$locationIndex, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ResultList && geofenceDetail == other.geofenceDetail && geofenceId == other.geofenceId && result == other.result && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(geofenceDetail, geofenceId, result, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ResultList{geofenceDetail=$geofenceDetail, geofenceId=$geofenceId, result=$result, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && resultList == other.resultList && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(resultList, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{resultList=$resultList, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GeofenceContainsResponse && data == other.data && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GeofenceContainsResponse{data=$data, status=$status, additionalProperties=$additionalProperties}"
}
