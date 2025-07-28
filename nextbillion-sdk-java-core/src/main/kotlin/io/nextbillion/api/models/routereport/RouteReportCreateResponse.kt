// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.routereport

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

class RouteReportCreateResponse
private constructor(
    private val geometry: JsonField<List<String>>,
    private val mileage: JsonField<List<Mileage>>,
    private val msg: JsonField<String>,
    private val roadSummary: JsonField<List<RoadSummary>>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("geometry")
        @ExcludeMissing
        geometry: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("mileage")
        @ExcludeMissing
        mileage: JsonField<List<Mileage>> = JsonMissing.of(),
        @JsonProperty("msg") @ExcludeMissing msg: JsonField<String> = JsonMissing.of(),
        @JsonProperty("road_summary")
        @ExcludeMissing
        roadSummary: JsonField<List<RoadSummary>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(geometry, mileage, msg, roadSummary, status, mutableMapOf())

    /**
     * An array of objects returning encoded geometry of the routes. Each object represents an
     * individual route in the input.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun geometry(): Optional<List<String>> = geometry.getOptional("geometry")

    /**
     * Returns the details of route segments in each state or country that the route passes through.
     * Each object represents an individual route in the input request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun mileage(): Optional<List<Mileage>> = mileage.getOptional("mileage")

    /**
     * Displays the error message in case of a failed request or operation. Please note that this
     * parameter is not returned in the response in case of a successful request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun msg(): Optional<String> = msg.getOptional("msg")

    /**
     * An array of objects returning a summary of the route with information about tolls, bridges,
     * tunnels, segments, maximum speeds and more. Each array represents an individual route in the
     * input request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun roadSummary(): Optional<List<RoadSummary>> = roadSummary.getOptional("road_summary")

    /**
     * A string indicating the state of the response. On normal responses, the value will be `Ok`.
     * Indicative HTTP error codes are returned for different errors. See the
     * [**API Errors Codes**](https://app.reapi.com/ws/hmx8aL45B5jjrJa8/p/vNNilNksLVz675pI/s/ealJmVGjTQv4x5Wi/edit/path/VYzo7gOlRsQQZo0U#api-error-codes)
     * section below for more information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [geometry].
     *
     * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geometry") @ExcludeMissing fun _geometry(): JsonField<List<String>> = geometry

    /**
     * Returns the raw JSON value of [mileage].
     *
     * Unlike [mileage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mileage") @ExcludeMissing fun _mileage(): JsonField<List<Mileage>> = mileage

    /**
     * Returns the raw JSON value of [msg].
     *
     * Unlike [msg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msg") @ExcludeMissing fun _msg(): JsonField<String> = msg

    /**
     * Returns the raw JSON value of [roadSummary].
     *
     * Unlike [roadSummary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("road_summary")
    @ExcludeMissing
    fun _roadSummary(): JsonField<List<RoadSummary>> = roadSummary

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

        /**
         * Returns a mutable builder for constructing an instance of [RouteReportCreateResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RouteReportCreateResponse]. */
    class Builder internal constructor() {

        private var geometry: JsonField<MutableList<String>>? = null
        private var mileage: JsonField<MutableList<Mileage>>? = null
        private var msg: JsonField<String> = JsonMissing.of()
        private var roadSummary: JsonField<MutableList<RoadSummary>>? = null
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(routeReportCreateResponse: RouteReportCreateResponse) = apply {
            geometry = routeReportCreateResponse.geometry.map { it.toMutableList() }
            mileage = routeReportCreateResponse.mileage.map { it.toMutableList() }
            msg = routeReportCreateResponse.msg
            roadSummary = routeReportCreateResponse.roadSummary.map { it.toMutableList() }
            status = routeReportCreateResponse.status
            additionalProperties = routeReportCreateResponse.additionalProperties.toMutableMap()
        }

        /**
         * An array of objects returning encoded geometry of the routes. Each object represents an
         * individual route in the input.
         */
        fun geometry(geometry: List<String>) = geometry(JsonField.of(geometry))

        /**
         * Sets [Builder.geometry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geometry] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geometry(geometry: JsonField<List<String>>) = apply {
            this.geometry = geometry.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.geometry].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGeometry(geometry: String) = apply {
            this.geometry =
                (this.geometry ?: JsonField.of(mutableListOf())).also {
                    checkKnown("geometry", it).add(geometry)
                }
        }

        /**
         * Returns the details of route segments in each state or country that the route passes
         * through. Each object represents an individual route in the input request.
         */
        fun mileage(mileage: List<Mileage>) = mileage(JsonField.of(mileage))

        /**
         * Sets [Builder.mileage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mileage] with a well-typed `List<Mileage>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mileage(mileage: JsonField<List<Mileage>>) = apply {
            this.mileage = mileage.map { it.toMutableList() }
        }

        /**
         * Adds a single [Mileage] to [Builder.mileage].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMileage(mileage: Mileage) = apply {
            this.mileage =
                (this.mileage ?: JsonField.of(mutableListOf())).also {
                    checkKnown("mileage", it).add(mileage)
                }
        }

        /**
         * Displays the error message in case of a failed request or operation. Please note that
         * this parameter is not returned in the response in case of a successful request.
         */
        fun msg(msg: String) = msg(JsonField.of(msg))

        /**
         * Sets [Builder.msg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msg] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun msg(msg: JsonField<String>) = apply { this.msg = msg }

        /**
         * An array of objects returning a summary of the route with information about tolls,
         * bridges, tunnels, segments, maximum speeds and more. Each array represents an individual
         * route in the input request.
         */
        fun roadSummary(roadSummary: List<RoadSummary>) = roadSummary(JsonField.of(roadSummary))

        /**
         * Sets [Builder.roadSummary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roadSummary] with a well-typed `List<RoadSummary>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun roadSummary(roadSummary: JsonField<List<RoadSummary>>) = apply {
            this.roadSummary = roadSummary.map { it.toMutableList() }
        }

        /**
         * Adds a single [RoadSummary] to [Builder.roadSummary].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRoadSummary(roadSummary: RoadSummary) = apply {
            this.roadSummary =
                (this.roadSummary ?: JsonField.of(mutableListOf())).also {
                    checkKnown("roadSummary", it).add(roadSummary)
                }
        }

        /**
         * A string indicating the state of the response. On normal responses, the value will be
         * `Ok`. Indicative HTTP error codes are returned for different errors. See the
         * [**API Errors Codes**](https://app.reapi.com/ws/hmx8aL45B5jjrJa8/p/vNNilNksLVz675pI/s/ealJmVGjTQv4x5Wi/edit/path/VYzo7gOlRsQQZo0U#api-error-codes)
         * section below for more information.
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
         * Returns an immutable instance of [RouteReportCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RouteReportCreateResponse =
            RouteReportCreateResponse(
                (geometry ?: JsonMissing.of()).map { it.toImmutable() },
                (mileage ?: JsonMissing.of()).map { it.toImmutable() },
                msg,
                (roadSummary ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RouteReportCreateResponse = apply {
        if (validated) {
            return@apply
        }

        geometry()
        mileage().ifPresent { it.forEach { it.validate() } }
        msg()
        roadSummary().ifPresent { it.forEach { it.validate() } }
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
        (geometry.asKnown().getOrNull()?.size ?: 0) +
            (mileage.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (msg.asKnown().isPresent) 1 else 0) +
            (roadSummary.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    class Mileage
    private constructor(
        private val segment: JsonField<Segment>,
        private val summary: JsonField<Summary>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("segment") @ExcludeMissing segment: JsonField<Segment> = JsonMissing.of(),
            @JsonProperty("summary") @ExcludeMissing summary: JsonField<Summary> = JsonMissing.of(),
        ) : this(segment, summary, mutableMapOf())

        /**
         * Returns the details of road segments that the route covers in different states and
         * countries.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun segment(): Optional<Segment> = segment.getOptional("segment")

        /**
         * Returns a summary of distances that the route covers in different states and countries.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun summary(): Optional<Summary> = summary.getOptional("summary")

        /**
         * Returns the raw JSON value of [segment].
         *
         * Unlike [segment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("segment") @ExcludeMissing fun _segment(): JsonField<Segment> = segment

        /**
         * Returns the raw JSON value of [summary].
         *
         * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<Summary> = summary

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

            /** Returns a mutable builder for constructing an instance of [Mileage]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Mileage]. */
        class Builder internal constructor() {

            private var segment: JsonField<Segment> = JsonMissing.of()
            private var summary: JsonField<Summary> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(mileage: Mileage) = apply {
                segment = mileage.segment
                summary = mileage.summary
                additionalProperties = mileage.additionalProperties.toMutableMap()
            }

            /**
             * Returns the details of road segments that the route covers in different states and
             * countries.
             */
            fun segment(segment: Segment) = segment(JsonField.of(segment))

            /**
             * Sets [Builder.segment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.segment] with a well-typed [Segment] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun segment(segment: JsonField<Segment>) = apply { this.segment = segment }

            /**
             * Returns a summary of distances that the route covers in different states and
             * countries.
             */
            fun summary(summary: Summary) = summary(JsonField.of(summary))

            /**
             * Sets [Builder.summary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summary] with a well-typed [Summary] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

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
             * Returns an immutable instance of [Mileage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Mileage = Mileage(segment, summary, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Mileage = apply {
            if (validated) {
                return@apply
            }

            segment().ifPresent { it.validate() }
            summary().ifPresent { it.validate() }
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
            (segment.asKnown().getOrNull()?.validity() ?: 0) +
                (summary.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Returns the details of road segments that the route covers in different states and
         * countries.
         */
        class Segment
        private constructor(
            private val country: JsonField<List<Country>>,
            private val state: JsonField<List<State>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<List<Country>> = JsonMissing.of(),
                @JsonProperty("state")
                @ExcludeMissing
                state: JsonField<List<State>> = JsonMissing.of(),
            ) : this(country, state, mutableMapOf())

            /**
             * An array of objects containing country-wise break up of the route segments. Each
             * object returns the segment details of a different country.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun country(): Optional<List<Country>> = country.getOptional("country")

            /**
             * An array of objects containing state-wise break up of the route segments. Each object
             * returns the segment details of a different state.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun state(): Optional<List<State>> = state.getOptional("state")

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country")
            @ExcludeMissing
            fun _country(): JsonField<List<Country>> = country

            /**
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<List<State>> = state

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

                /** Returns a mutable builder for constructing an instance of [Segment]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Segment]. */
            class Builder internal constructor() {

                private var country: JsonField<MutableList<Country>>? = null
                private var state: JsonField<MutableList<State>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(segment: Segment) = apply {
                    country = segment.country.map { it.toMutableList() }
                    state = segment.state.map { it.toMutableList() }
                    additionalProperties = segment.additionalProperties.toMutableMap()
                }

                /**
                 * An array of objects containing country-wise break up of the route segments. Each
                 * object returns the segment details of a different country.
                 */
                fun country(country: List<Country>) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed `List<Country>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<List<Country>>) = apply {
                    this.country = country.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Country] to [Builder.country].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCountry(country: Country) = apply {
                    this.country =
                        (this.country ?: JsonField.of(mutableListOf())).also {
                            checkKnown("country", it).add(country)
                        }
                }

                /**
                 * An array of objects containing state-wise break up of the route segments. Each
                 * object returns the segment details of a different state.
                 */
                fun state(state: List<State>) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed `List<State>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun state(state: JsonField<List<State>>) = apply {
                    this.state = state.map { it.toMutableList() }
                }

                /**
                 * Adds a single [State] to [Builder.state].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addState(state: State) = apply {
                    this.state =
                        (this.state ?: JsonField.of(mutableListOf())).also {
                            checkKnown("state", it).add(state)
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
                 * Returns an immutable instance of [Segment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Segment =
                    Segment(
                        (country ?: JsonMissing.of()).map { it.toImmutable() },
                        (state ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Segment = apply {
                if (validated) {
                    return@apply
                }

                country().ifPresent { it.forEach { it.validate() } }
                state().ifPresent { it.forEach { it.validate() } }
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
                (country.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (state.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Country
            private constructor(
                private val distance: JsonField<Double>,
                private val length: JsonField<Long>,
                private val offset: JsonField<Long>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("distance")
                    @ExcludeMissing
                    distance: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("length")
                    @ExcludeMissing
                    length: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("offset")
                    @ExcludeMissing
                    offset: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(distance, length, offset, value, mutableMapOf())

                /**
                 * Represents the total distance of this segment, in meters.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun distance(): Optional<Double> = distance.getOptional("distance")

                /**
                 * Represents a sequence of ‘n’ consecutive vertices in the route geometry starting
                 * from the `offset`, forming a continuous section of route with a distance
                 * indicated in `distance`field.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun length(): Optional<Long> = length.getOptional("length")

                /**
                 * Represents the index value of the vertex of current segment's starting point in
                 * route geometry. First vertex in the route geometry has an offset of 0.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun offset(): Optional<Long> = offset.getOptional("offset")

                /**
                 * Returns the name of the country in which the segment lies.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun value(): Optional<String> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [distance].
                 *
                 * Unlike [distance], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("distance")
                @ExcludeMissing
                fun _distance(): JsonField<Double> = distance

                /**
                 * Returns the raw JSON value of [length].
                 *
                 * Unlike [length], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Long> = length

                /**
                 * Returns the raw JSON value of [offset].
                 *
                 * Unlike [offset], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

                    /** Returns a mutable builder for constructing an instance of [Country]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Country]. */
                class Builder internal constructor() {

                    private var distance: JsonField<Double> = JsonMissing.of()
                    private var length: JsonField<Long> = JsonMissing.of()
                    private var offset: JsonField<Long> = JsonMissing.of()
                    private var value: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(country: Country) = apply {
                        distance = country.distance
                        length = country.length
                        offset = country.offset
                        value = country.value
                        additionalProperties = country.additionalProperties.toMutableMap()
                    }

                    /** Represents the total distance of this segment, in meters. */
                    fun distance(distance: Double) = distance(JsonField.of(distance))

                    /**
                     * Sets [Builder.distance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.distance] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

                    /**
                     * Represents a sequence of ‘n’ consecutive vertices in the route geometry
                     * starting from the `offset`, forming a continuous section of route with a
                     * distance indicated in `distance`field.
                     */
                    fun length(length: Long) = length(JsonField.of(length))

                    /**
                     * Sets [Builder.length] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.length] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun length(length: JsonField<Long>) = apply { this.length = length }

                    /**
                     * Represents the index value of the vertex of current segment's starting point
                     * in route geometry. First vertex in the route geometry has an offset of 0.
                     */
                    fun offset(offset: Long) = offset(JsonField.of(offset))

                    /**
                     * Sets [Builder.offset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.offset] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

                    /** Returns the name of the country in which the segment lies. */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [Country].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Country =
                        Country(
                            distance,
                            length,
                            offset,
                            value,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Country = apply {
                    if (validated) {
                        return@apply
                    }

                    distance()
                    length()
                    offset()
                    value()
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
                    (if (distance.asKnown().isPresent) 1 else 0) +
                        (if (length.asKnown().isPresent) 1 else 0) +
                        (if (offset.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Country && distance == other.distance && length == other.length && offset == other.offset && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(distance, length, offset, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Country{distance=$distance, length=$length, offset=$offset, value=$value, additionalProperties=$additionalProperties}"
            }

            class State
            private constructor(
                private val distance: JsonField<Double>,
                private val length: JsonField<Long>,
                private val offset: JsonField<Long>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("distance")
                    @ExcludeMissing
                    distance: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("length")
                    @ExcludeMissing
                    length: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("offset")
                    @ExcludeMissing
                    offset: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(distance, length, offset, value, mutableMapOf())

                /**
                 * Represents the real distance of this segment, in meters.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun distance(): Optional<Double> = distance.getOptional("distance")

                /**
                 * Represents a sequence of ‘n’ consecutive vertices in the route geometry starting
                 * from the `offset`, forming a continuous section of route with a distance
                 * indicated in `distance`field.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun length(): Optional<Long> = length.getOptional("length")

                /**
                 * Represents the index value of the vertex of current segment's starting point in
                 * route geometry. First vertex in the route geometry has an offset of 0.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun offset(): Optional<Long> = offset.getOptional("offset")

                /**
                 * Returns the name of the state in which the segment lies.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun value(): Optional<String> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [distance].
                 *
                 * Unlike [distance], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("distance")
                @ExcludeMissing
                fun _distance(): JsonField<Double> = distance

                /**
                 * Returns the raw JSON value of [length].
                 *
                 * Unlike [length], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Long> = length

                /**
                 * Returns the raw JSON value of [offset].
                 *
                 * Unlike [offset], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

                    /** Returns a mutable builder for constructing an instance of [State]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [State]. */
                class Builder internal constructor() {

                    private var distance: JsonField<Double> = JsonMissing.of()
                    private var length: JsonField<Long> = JsonMissing.of()
                    private var offset: JsonField<Long> = JsonMissing.of()
                    private var value: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(state: State) = apply {
                        distance = state.distance
                        length = state.length
                        offset = state.offset
                        value = state.value
                        additionalProperties = state.additionalProperties.toMutableMap()
                    }

                    /** Represents the real distance of this segment, in meters. */
                    fun distance(distance: Double) = distance(JsonField.of(distance))

                    /**
                     * Sets [Builder.distance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.distance] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

                    /**
                     * Represents a sequence of ‘n’ consecutive vertices in the route geometry
                     * starting from the `offset`, forming a continuous section of route with a
                     * distance indicated in `distance`field.
                     */
                    fun length(length: Long) = length(JsonField.of(length))

                    /**
                     * Sets [Builder.length] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.length] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun length(length: JsonField<Long>) = apply { this.length = length }

                    /**
                     * Represents the index value of the vertex of current segment's starting point
                     * in route geometry. First vertex in the route geometry has an offset of 0.
                     */
                    fun offset(offset: Long) = offset(JsonField.of(offset))

                    /**
                     * Sets [Builder.offset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.offset] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

                    /** Returns the name of the state in which the segment lies. */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [State].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): State =
                        State(distance, length, offset, value, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): State = apply {
                    if (validated) {
                        return@apply
                    }

                    distance()
                    length()
                    offset()
                    value()
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
                    (if (distance.asKnown().isPresent) 1 else 0) +
                        (if (length.asKnown().isPresent) 1 else 0) +
                        (if (offset.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is State && distance == other.distance && length == other.length && offset == other.offset && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(distance, length, offset, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "State{distance=$distance, length=$length, offset=$offset, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Segment && country == other.country && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(country, state, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Segment{country=$country, state=$state, additionalProperties=$additionalProperties}"
        }

        /**
         * Returns a summary of distances that the route covers in different states and countries.
         */
        class Summary
        private constructor(
            private val country: JsonValue,
            private val state: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("country") @ExcludeMissing country: JsonValue = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonValue = JsonMissing.of(),
            ) : this(country, state, mutableMapOf())

            /**
             * A break up of country-wise distances that the route covers in `key:value` pair
             * format.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonValue = country

            /**
             * A break up of state-wise distances that the route covers specified in `key:value`
             * pair format.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonValue = state

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

                /** Returns a mutable builder for constructing an instance of [Summary]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Summary]. */
            class Builder internal constructor() {

                private var country: JsonValue = JsonMissing.of()
                private var state: JsonValue = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(summary: Summary) = apply {
                    country = summary.country
                    state = summary.state
                    additionalProperties = summary.additionalProperties.toMutableMap()
                }

                /**
                 * A break up of country-wise distances that the route covers in `key:value` pair
                 * format.
                 */
                fun country(country: JsonValue) = apply { this.country = country }

                /**
                 * A break up of state-wise distances that the route covers specified in `key:value`
                 * pair format.
                 */
                fun state(state: JsonValue) = apply { this.state = state }

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
                 * Returns an immutable instance of [Summary].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Summary = Summary(country, state, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Summary = apply {
                if (validated) {
                    return@apply
                }

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
            @JvmSynthetic internal fun validity(): Int = 0

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Summary && country == other.country && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(country, state, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Summary{country=$country, state=$state, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Mileage && segment == other.segment && summary == other.summary && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(segment, summary, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Mileage{segment=$segment, summary=$summary, additionalProperties=$additionalProperties}"
    }

    class RoadSummary
    private constructor(
        private val segment: JsonField<Segment>,
        private val summary: JsonField<Summary>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("segment") @ExcludeMissing segment: JsonField<Segment> = JsonMissing.of(),
            @JsonProperty("summary") @ExcludeMissing summary: JsonField<Summary> = JsonMissing.of(),
        ) : this(segment, summary, mutableMapOf())

        /**
         * Returns the segment-wise road class and max speed information of the route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun segment(): Optional<Segment> = segment.getOptional("segment")

        /**
         * Returns an overview of the route with information about trip distance, duration and road
         * class details among others.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun summary(): Optional<Summary> = summary.getOptional("summary")

        /**
         * Returns the raw JSON value of [segment].
         *
         * Unlike [segment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("segment") @ExcludeMissing fun _segment(): JsonField<Segment> = segment

        /**
         * Returns the raw JSON value of [summary].
         *
         * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<Summary> = summary

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

            /** Returns a mutable builder for constructing an instance of [RoadSummary]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RoadSummary]. */
        class Builder internal constructor() {

            private var segment: JsonField<Segment> = JsonMissing.of()
            private var summary: JsonField<Summary> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(roadSummary: RoadSummary) = apply {
                segment = roadSummary.segment
                summary = roadSummary.summary
                additionalProperties = roadSummary.additionalProperties.toMutableMap()
            }

            /** Returns the segment-wise road class and max speed information of the route. */
            fun segment(segment: Segment) = segment(JsonField.of(segment))

            /**
             * Sets [Builder.segment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.segment] with a well-typed [Segment] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun segment(segment: JsonField<Segment>) = apply { this.segment = segment }

            /**
             * Returns an overview of the route with information about trip distance, duration and
             * road class details among others.
             */
            fun summary(summary: Summary) = summary(JsonField.of(summary))

            /**
             * Sets [Builder.summary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summary] with a well-typed [Summary] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

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
             * Returns an immutable instance of [RoadSummary].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RoadSummary =
                RoadSummary(segment, summary, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): RoadSummary = apply {
            if (validated) {
                return@apply
            }

            segment().ifPresent { it.validate() }
            summary().ifPresent { it.validate() }
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
            (segment.asKnown().getOrNull()?.validity() ?: 0) +
                (summary.asKnown().getOrNull()?.validity() ?: 0)

        /** Returns the segment-wise road class and max speed information of the route. */
        class Segment
        private constructor(
            private val maxSpeed: JsonField<List<MaxSpeed>>,
            private val roadClass: JsonField<List<RoadClass>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("max_speed")
                @ExcludeMissing
                maxSpeed: JsonField<List<MaxSpeed>> = JsonMissing.of(),
                @JsonProperty("road_class")
                @ExcludeMissing
                roadClass: JsonField<List<RoadClass>> = JsonMissing.of(),
            ) : this(maxSpeed, roadClass, mutableMapOf())

            /**
             * An array of objects returning the maximum speed of different segments that the route
             * goes through.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun maxSpeed(): Optional<List<MaxSpeed>> = maxSpeed.getOptional("max_speed")

            /**
             * An array of objects returning the details of road segments belonging to different
             * road classes that the route goes through. Each object refers to a unique road class.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun roadClass(): Optional<List<RoadClass>> = roadClass.getOptional("road_class")

            /**
             * Returns the raw JSON value of [maxSpeed].
             *
             * Unlike [maxSpeed], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("max_speed")
            @ExcludeMissing
            fun _maxSpeed(): JsonField<List<MaxSpeed>> = maxSpeed

            /**
             * Returns the raw JSON value of [roadClass].
             *
             * Unlike [roadClass], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("road_class")
            @ExcludeMissing
            fun _roadClass(): JsonField<List<RoadClass>> = roadClass

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

                /** Returns a mutable builder for constructing an instance of [Segment]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Segment]. */
            class Builder internal constructor() {

                private var maxSpeed: JsonField<MutableList<MaxSpeed>>? = null
                private var roadClass: JsonField<MutableList<RoadClass>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(segment: Segment) = apply {
                    maxSpeed = segment.maxSpeed.map { it.toMutableList() }
                    roadClass = segment.roadClass.map { it.toMutableList() }
                    additionalProperties = segment.additionalProperties.toMutableMap()
                }

                /**
                 * An array of objects returning the maximum speed of different segments that the
                 * route goes through.
                 */
                fun maxSpeed(maxSpeed: List<MaxSpeed>) = maxSpeed(JsonField.of(maxSpeed))

                /**
                 * Sets [Builder.maxSpeed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSpeed] with a well-typed `List<MaxSpeed>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxSpeed(maxSpeed: JsonField<List<MaxSpeed>>) = apply {
                    this.maxSpeed = maxSpeed.map { it.toMutableList() }
                }

                /**
                 * Adds a single [MaxSpeed] to [Builder.maxSpeed].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMaxSpeed(maxSpeed: MaxSpeed) = apply {
                    this.maxSpeed =
                        (this.maxSpeed ?: JsonField.of(mutableListOf())).also {
                            checkKnown("maxSpeed", it).add(maxSpeed)
                        }
                }

                /**
                 * An array of objects returning the details of road segments belonging to different
                 * road classes that the route goes through. Each object refers to a unique road
                 * class.
                 */
                fun roadClass(roadClass: List<RoadClass>) = roadClass(JsonField.of(roadClass))

                /**
                 * Sets [Builder.roadClass] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.roadClass] with a well-typed `List<RoadClass>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun roadClass(roadClass: JsonField<List<RoadClass>>) = apply {
                    this.roadClass = roadClass.map { it.toMutableList() }
                }

                /**
                 * Adds a single [RoadClass] to [Builder.roadClass].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRoadClass(roadClass: RoadClass) = apply {
                    this.roadClass =
                        (this.roadClass ?: JsonField.of(mutableListOf())).also {
                            checkKnown("roadClass", it).add(roadClass)
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
                 * Returns an immutable instance of [Segment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Segment =
                    Segment(
                        (maxSpeed ?: JsonMissing.of()).map { it.toImmutable() },
                        (roadClass ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Segment = apply {
                if (validated) {
                    return@apply
                }

                maxSpeed().ifPresent { it.forEach { it.validate() } }
                roadClass().ifPresent { it.forEach { it.validate() } }
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
                (maxSpeed.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (roadClass.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class MaxSpeed
            private constructor(
                private val distance: JsonField<Long>,
                private val length: JsonField<Long>,
                private val offset: JsonField<Long>,
                private val value: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("distance")
                    @ExcludeMissing
                    distance: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("length")
                    @ExcludeMissing
                    length: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("offset")
                    @ExcludeMissing
                    offset: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
                ) : this(distance, length, offset, value, mutableMapOf())

                /**
                 * Returns the total distance of this segment, in meters.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun distance(): Optional<Long> = distance.getOptional("distance")

                /**
                 * Represents a sequence of ‘n’ consecutive vertices in the route geometry starting
                 * from the `offset`, forming a continuous section of route where the maximum speed
                 * is same and is indicated in `value`.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun length(): Optional<Long> = length.getOptional("length")

                /**
                 * Represents the index value of the vertex of current segment's starting point in
                 * route geometry. First vertex in the route geometry has an offset of 0.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun offset(): Optional<Long> = offset.getOptional("offset")

                /**
                 * Denotes the maximum speed of this segment, in kilometers per hour. - A value of
                 * “-1” indicates that the speed is unlimited for this road segment. - A value of
                 * “0” indicates that there is no information about the maximum speed for this road
                 * segment.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun value(): Optional<Long> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [distance].
                 *
                 * Unlike [distance], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("distance")
                @ExcludeMissing
                fun _distance(): JsonField<Long> = distance

                /**
                 * Returns the raw JSON value of [length].
                 *
                 * Unlike [length], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Long> = length

                /**
                 * Returns the raw JSON value of [offset].
                 *
                 * Unlike [offset], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

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

                    /** Returns a mutable builder for constructing an instance of [MaxSpeed]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [MaxSpeed]. */
                class Builder internal constructor() {

                    private var distance: JsonField<Long> = JsonMissing.of()
                    private var length: JsonField<Long> = JsonMissing.of()
                    private var offset: JsonField<Long> = JsonMissing.of()
                    private var value: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(maxSpeed: MaxSpeed) = apply {
                        distance = maxSpeed.distance
                        length = maxSpeed.length
                        offset = maxSpeed.offset
                        value = maxSpeed.value
                        additionalProperties = maxSpeed.additionalProperties.toMutableMap()
                    }

                    /** Returns the total distance of this segment, in meters. */
                    fun distance(distance: Long) = distance(JsonField.of(distance))

                    /**
                     * Sets [Builder.distance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.distance] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun distance(distance: JsonField<Long>) = apply { this.distance = distance }

                    /**
                     * Represents a sequence of ‘n’ consecutive vertices in the route geometry
                     * starting from the `offset`, forming a continuous section of route where the
                     * maximum speed is same and is indicated in `value`.
                     */
                    fun length(length: Long) = length(JsonField.of(length))

                    /**
                     * Sets [Builder.length] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.length] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun length(length: JsonField<Long>) = apply { this.length = length }

                    /**
                     * Represents the index value of the vertex of current segment's starting point
                     * in route geometry. First vertex in the route geometry has an offset of 0.
                     */
                    fun offset(offset: Long) = offset(JsonField.of(offset))

                    /**
                     * Sets [Builder.offset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.offset] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

                    /**
                     * Denotes the maximum speed of this segment, in kilometers per hour. - A value
                     * of “-1” indicates that the speed is unlimited for this road segment. - A
                     * value of “0” indicates that there is no information about the maximum speed
                     * for this road segment.
                     */
                    fun value(value: Long) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Long>) = apply { this.value = value }

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
                     * Returns an immutable instance of [MaxSpeed].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): MaxSpeed =
                        MaxSpeed(
                            distance,
                            length,
                            offset,
                            value,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): MaxSpeed = apply {
                    if (validated) {
                        return@apply
                    }

                    distance()
                    length()
                    offset()
                    value()
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
                    (if (distance.asKnown().isPresent) 1 else 0) +
                        (if (length.asKnown().isPresent) 1 else 0) +
                        (if (offset.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MaxSpeed && distance == other.distance && length == other.length && offset == other.offset && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(distance, length, offset, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MaxSpeed{distance=$distance, length=$length, offset=$offset, value=$value, additionalProperties=$additionalProperties}"
            }

            class RoadClass
            private constructor(
                private val distance: JsonField<Long>,
                private val length: JsonField<Long>,
                private val offset: JsonField<Long>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("distance")
                    @ExcludeMissing
                    distance: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("length")
                    @ExcludeMissing
                    length: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("offset")
                    @ExcludeMissing
                    offset: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(distance, length, offset, value, mutableMapOf())

                /**
                 * Returns the total distance of this segment, in meters.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun distance(): Optional<Long> = distance.getOptional("distance")

                /**
                 * Represents a sequence of ‘n’ consecutive vertices in the route geometry starting
                 * from the `offset`, forming a continuous section of route with a distance
                 * indicated in `distance`field.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun length(): Optional<Long> = length.getOptional("length")

                /**
                 * Represents the index value of the vertex of current segment's starting point in
                 * route geometry. First vertex in the route geometry has an offset of 0.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun offset(): Optional<Long> = offset.getOptional("offset")

                /**
                 * Returns the road class name to which the segment belongs.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun value(): Optional<String> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [distance].
                 *
                 * Unlike [distance], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("distance")
                @ExcludeMissing
                fun _distance(): JsonField<Long> = distance

                /**
                 * Returns the raw JSON value of [length].
                 *
                 * Unlike [length], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Long> = length

                /**
                 * Returns the raw JSON value of [offset].
                 *
                 * Unlike [offset], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

                    /** Returns a mutable builder for constructing an instance of [RoadClass]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RoadClass]. */
                class Builder internal constructor() {

                    private var distance: JsonField<Long> = JsonMissing.of()
                    private var length: JsonField<Long> = JsonMissing.of()
                    private var offset: JsonField<Long> = JsonMissing.of()
                    private var value: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(roadClass: RoadClass) = apply {
                        distance = roadClass.distance
                        length = roadClass.length
                        offset = roadClass.offset
                        value = roadClass.value
                        additionalProperties = roadClass.additionalProperties.toMutableMap()
                    }

                    /** Returns the total distance of this segment, in meters. */
                    fun distance(distance: Long) = distance(JsonField.of(distance))

                    /**
                     * Sets [Builder.distance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.distance] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun distance(distance: JsonField<Long>) = apply { this.distance = distance }

                    /**
                     * Represents a sequence of ‘n’ consecutive vertices in the route geometry
                     * starting from the `offset`, forming a continuous section of route with a
                     * distance indicated in `distance`field.
                     */
                    fun length(length: Long) = length(JsonField.of(length))

                    /**
                     * Sets [Builder.length] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.length] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun length(length: JsonField<Long>) = apply { this.length = length }

                    /**
                     * Represents the index value of the vertex of current segment's starting point
                     * in route geometry. First vertex in the route geometry has an offset of 0.
                     */
                    fun offset(offset: Long) = offset(JsonField.of(offset))

                    /**
                     * Sets [Builder.offset] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.offset] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

                    /** Returns the road class name to which the segment belongs. */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [RoadClass].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): RoadClass =
                        RoadClass(
                            distance,
                            length,
                            offset,
                            value,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): RoadClass = apply {
                    if (validated) {
                        return@apply
                    }

                    distance()
                    length()
                    offset()
                    value()
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
                    (if (distance.asKnown().isPresent) 1 else 0) +
                        (if (length.asKnown().isPresent) 1 else 0) +
                        (if (offset.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RoadClass && distance == other.distance && length == other.length && offset == other.offset && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(distance, length, offset, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RoadClass{distance=$distance, length=$length, offset=$offset, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Segment && maxSpeed == other.maxSpeed && roadClass == other.roadClass && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(maxSpeed, roadClass, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Segment{maxSpeed=$maxSpeed, roadClass=$roadClass, additionalProperties=$additionalProperties}"
        }

        /**
         * Returns an overview of the route with information about trip distance, duration and road
         * class details among others.
         */
        class Summary
        private constructor(
            private val distance: JsonField<Double>,
            private val duration: JsonField<Double>,
            private val hasBridge: JsonField<Boolean>,
            private val hasRoundabout: JsonField<Boolean>,
            private val hasToll: JsonField<Boolean>,
            private val hasTunnel: JsonField<Boolean>,
            private val roadClass: JsonValue,
            private val tollDistance: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("distance")
                @ExcludeMissing
                distance: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("duration")
                @ExcludeMissing
                duration: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("has_bridge")
                @ExcludeMissing
                hasBridge: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("has_roundabout")
                @ExcludeMissing
                hasRoundabout: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("has_toll")
                @ExcludeMissing
                hasToll: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("has_tunnel")
                @ExcludeMissing
                hasTunnel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("road_class") @ExcludeMissing roadClass: JsonValue = JsonMissing.of(),
                @JsonProperty("toll_distance")
                @ExcludeMissing
                tollDistance: JsonField<Double> = JsonMissing.of(),
            ) : this(
                distance,
                duration,
                hasBridge,
                hasRoundabout,
                hasToll,
                hasTunnel,
                roadClass,
                tollDistance,
                mutableMapOf(),
            )

            /**
             * Returns the total distance of the route , in meters.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun distance(): Optional<Double> = distance.getOptional("distance")

            /**
             * Returns the total duration of the route, in seconds.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun duration(): Optional<Double> = duration.getOptional("duration")

            /**
             * A boolean value indicating if there are any bridges in the given route.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun hasBridge(): Optional<Boolean> = hasBridge.getOptional("has_bridge")

            /**
             * A boolean value indicating if there are any roundabouts in the given route.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun hasRoundabout(): Optional<Boolean> = hasRoundabout.getOptional("has_roundabout")

            /**
             * A boolean value indicating if there are any tolls in the given route.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun hasToll(): Optional<Boolean> = hasToll.getOptional("has_toll")

            /**
             * A boolean value indicating if there are any tunnels in the given route.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun hasTunnel(): Optional<Boolean> = hasTunnel.getOptional("has_tunnel")

            /**
             * An object with details about the different types of road classes that the route goes
             * through. Distance traversed on a given road class is also returned. The contents of
             * this object follow the `key:value` pair format.
             */
            @JsonProperty("road_class") @ExcludeMissing fun _roadClass(): JsonValue = roadClass

            /**
             * Returns the total distance travelled on toll roads. This field is present in the
             * response only when the `has_toll` property is true.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun tollDistance(): Optional<Double> = tollDistance.getOptional("toll_distance")

            /**
             * Returns the raw JSON value of [distance].
             *
             * Unlike [distance], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Double> = distance

            /**
             * Returns the raw JSON value of [duration].
             *
             * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

            /**
             * Returns the raw JSON value of [hasBridge].
             *
             * Unlike [hasBridge], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("has_bridge")
            @ExcludeMissing
            fun _hasBridge(): JsonField<Boolean> = hasBridge

            /**
             * Returns the raw JSON value of [hasRoundabout].
             *
             * Unlike [hasRoundabout], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("has_roundabout")
            @ExcludeMissing
            fun _hasRoundabout(): JsonField<Boolean> = hasRoundabout

            /**
             * Returns the raw JSON value of [hasToll].
             *
             * Unlike [hasToll], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("has_toll") @ExcludeMissing fun _hasToll(): JsonField<Boolean> = hasToll

            /**
             * Returns the raw JSON value of [hasTunnel].
             *
             * Unlike [hasTunnel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("has_tunnel")
            @ExcludeMissing
            fun _hasTunnel(): JsonField<Boolean> = hasTunnel

            /**
             * Returns the raw JSON value of [tollDistance].
             *
             * Unlike [tollDistance], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("toll_distance")
            @ExcludeMissing
            fun _tollDistance(): JsonField<Double> = tollDistance

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

                /** Returns a mutable builder for constructing an instance of [Summary]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Summary]. */
            class Builder internal constructor() {

                private var distance: JsonField<Double> = JsonMissing.of()
                private var duration: JsonField<Double> = JsonMissing.of()
                private var hasBridge: JsonField<Boolean> = JsonMissing.of()
                private var hasRoundabout: JsonField<Boolean> = JsonMissing.of()
                private var hasToll: JsonField<Boolean> = JsonMissing.of()
                private var hasTunnel: JsonField<Boolean> = JsonMissing.of()
                private var roadClass: JsonValue = JsonMissing.of()
                private var tollDistance: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(summary: Summary) = apply {
                    distance = summary.distance
                    duration = summary.duration
                    hasBridge = summary.hasBridge
                    hasRoundabout = summary.hasRoundabout
                    hasToll = summary.hasToll
                    hasTunnel = summary.hasTunnel
                    roadClass = summary.roadClass
                    tollDistance = summary.tollDistance
                    additionalProperties = summary.additionalProperties.toMutableMap()
                }

                /** Returns the total distance of the route , in meters. */
                fun distance(distance: Double) = distance(JsonField.of(distance))

                /**
                 * Sets [Builder.distance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.distance] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

                /** Returns the total duration of the route, in seconds. */
                fun duration(duration: Double) = duration(JsonField.of(duration))

                /**
                 * Sets [Builder.duration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.duration] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

                /** A boolean value indicating if there are any bridges in the given route. */
                fun hasBridge(hasBridge: Boolean) = hasBridge(JsonField.of(hasBridge))

                /**
                 * Sets [Builder.hasBridge] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasBridge] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hasBridge(hasBridge: JsonField<Boolean>) = apply { this.hasBridge = hasBridge }

                /** A boolean value indicating if there are any roundabouts in the given route. */
                fun hasRoundabout(hasRoundabout: Boolean) =
                    hasRoundabout(JsonField.of(hasRoundabout))

                /**
                 * Sets [Builder.hasRoundabout] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasRoundabout] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hasRoundabout(hasRoundabout: JsonField<Boolean>) = apply {
                    this.hasRoundabout = hasRoundabout
                }

                /** A boolean value indicating if there are any tolls in the given route. */
                fun hasToll(hasToll: Boolean) = hasToll(JsonField.of(hasToll))

                /**
                 * Sets [Builder.hasToll] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasToll] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hasToll(hasToll: JsonField<Boolean>) = apply { this.hasToll = hasToll }

                /** A boolean value indicating if there are any tunnels in the given route. */
                fun hasTunnel(hasTunnel: Boolean) = hasTunnel(JsonField.of(hasTunnel))

                /**
                 * Sets [Builder.hasTunnel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasTunnel] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hasTunnel(hasTunnel: JsonField<Boolean>) = apply { this.hasTunnel = hasTunnel }

                /**
                 * An object with details about the different types of road classes that the route
                 * goes through. Distance traversed on a given road class is also returned. The
                 * contents of this object follow the `key:value` pair format.
                 */
                fun roadClass(roadClass: JsonValue) = apply { this.roadClass = roadClass }

                /**
                 * Returns the total distance travelled on toll roads. This field is present in the
                 * response only when the `has_toll` property is true.
                 */
                fun tollDistance(tollDistance: Double) = tollDistance(JsonField.of(tollDistance))

                /**
                 * Sets [Builder.tollDistance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tollDistance] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tollDistance(tollDistance: JsonField<Double>) = apply {
                    this.tollDistance = tollDistance
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
                 * Returns an immutable instance of [Summary].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Summary =
                    Summary(
                        distance,
                        duration,
                        hasBridge,
                        hasRoundabout,
                        hasToll,
                        hasTunnel,
                        roadClass,
                        tollDistance,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Summary = apply {
                if (validated) {
                    return@apply
                }

                distance()
                duration()
                hasBridge()
                hasRoundabout()
                hasToll()
                hasTunnel()
                tollDistance()
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
                (if (distance.asKnown().isPresent) 1 else 0) +
                    (if (duration.asKnown().isPresent) 1 else 0) +
                    (if (hasBridge.asKnown().isPresent) 1 else 0) +
                    (if (hasRoundabout.asKnown().isPresent) 1 else 0) +
                    (if (hasToll.asKnown().isPresent) 1 else 0) +
                    (if (hasTunnel.asKnown().isPresent) 1 else 0) +
                    (if (tollDistance.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Summary && distance == other.distance && duration == other.duration && hasBridge == other.hasBridge && hasRoundabout == other.hasRoundabout && hasToll == other.hasToll && hasTunnel == other.hasTunnel && roadClass == other.roadClass && tollDistance == other.tollDistance && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(distance, duration, hasBridge, hasRoundabout, hasToll, hasTunnel, roadClass, tollDistance, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Summary{distance=$distance, duration=$duration, hasBridge=$hasBridge, hasRoundabout=$hasRoundabout, hasToll=$hasToll, hasTunnel=$hasTunnel, roadClass=$roadClass, tollDistance=$tollDistance, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RoadSummary && segment == other.segment && summary == other.summary && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(segment, summary, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RoadSummary{segment=$segment, summary=$summary, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RouteReportCreateResponse && geometry == other.geometry && mileage == other.mileage && msg == other.msg && roadSummary == other.roadSummary && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(geometry, mileage, msg, roadSummary, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RouteReportCreateResponse{geometry=$geometry, mileage=$mileage, msg=$msg, roadSummary=$roadSummary, status=$status, additionalProperties=$additionalProperties}"
}
