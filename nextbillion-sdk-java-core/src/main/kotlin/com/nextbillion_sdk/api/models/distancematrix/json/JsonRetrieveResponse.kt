// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.distancematrix.json

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.nextbillion_sdk.api.core.ExcludeMissing
import com.nextbillion_sdk.api.core.JsonField
import com.nextbillion_sdk.api.core.JsonMissing
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.checkKnown
import com.nextbillion_sdk.api.core.toImmutable
import com.nextbillion_sdk.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class JsonRetrieveResponse
private constructor(
    private val msg: JsonField<String>,
    private val rows: JsonField<List<Row>>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("msg") @ExcludeMissing msg: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rows") @ExcludeMissing rows: JsonField<List<Row>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(msg, rows, status, mutableMapOf())

    /**
     * Displays the error message in case of a failed request or operation. Please note that this
     * parameter is not returned in the response in case of a successful request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun msg(): Optional<String> = msg.getOptional("msg")

    /**
     * Container object for a response with an array of arrays structure.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun rows(): Optional<List<Row>> = rows.getOptional("rows")

    /**
     * A string indicating the state of the response. On normal responses, the value will be `Ok`.
     * Indicative HTTP error codes are returned for different errors. See the
     * [API Errors Codes](#api-error-codes) section below for more information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [msg].
     *
     * Unlike [msg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msg") @ExcludeMissing fun _msg(): JsonField<String> = msg

    /**
     * Returns the raw JSON value of [rows].
     *
     * Unlike [rows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rows") @ExcludeMissing fun _rows(): JsonField<List<Row>> = rows

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

        /** Returns a mutable builder for constructing an instance of [JsonRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JsonRetrieveResponse]. */
    class Builder internal constructor() {

        private var msg: JsonField<String> = JsonMissing.of()
        private var rows: JsonField<MutableList<Row>>? = null
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(jsonRetrieveResponse: JsonRetrieveResponse) = apply {
            msg = jsonRetrieveResponse.msg
            rows = jsonRetrieveResponse.rows.map { it.toMutableList() }
            status = jsonRetrieveResponse.status
            additionalProperties = jsonRetrieveResponse.additionalProperties.toMutableMap()
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

        /** Container object for a response with an array of arrays structure. */
        fun rows(rows: List<Row>) = rows(JsonField.of(rows))

        /**
         * Sets [Builder.rows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rows] with a well-typed `List<Row>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rows(rows: JsonField<List<Row>>) = apply { this.rows = rows.map { it.toMutableList() } }

        /**
         * Adds a single [Row] to [rows].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRow(row: Row) = apply {
            rows = (rows ?: JsonField.of(mutableListOf())).also { checkKnown("rows", it).add(row) }
        }

        /**
         * A string indicating the state of the response. On normal responses, the value will be
         * `Ok`. Indicative HTTP error codes are returned for different errors. See the
         * [API Errors Codes](#api-error-codes) section below for more information.
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
         * Returns an immutable instance of [JsonRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): JsonRetrieveResponse =
            JsonRetrieveResponse(
                msg,
                (rows ?: JsonMissing.of()).map { it.toImmutable() },
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): JsonRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        msg()
        rows().ifPresent { it.forEach { it.validate() } }
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
        (if (msg.asKnown().isPresent) 1 else 0) +
            (rows.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    class Row
    private constructor(
        private val elements: JsonField<List<Element>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("elements")
            @ExcludeMissing
            elements: JsonField<List<Element>> = JsonMissing.of()
        ) : this(elements, mutableMapOf())

        /**
         * An array of objects. Each `elements` array corresponds to a single `origins` coordinate
         * and contains objects with `distance` and `duration` values for each of the
         * `destinations`. The details in the first `elements` array correspond to the first
         * `origins` point and the first object corresponds to the first `destinations` point and so
         * on.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun elements(): Optional<List<Element>> = elements.getOptional("elements")

        /**
         * Returns the raw JSON value of [elements].
         *
         * Unlike [elements], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("elements")
        @ExcludeMissing
        fun _elements(): JsonField<List<Element>> = elements

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

            /** Returns a mutable builder for constructing an instance of [Row]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Row]. */
        class Builder internal constructor() {

            private var elements: JsonField<MutableList<Element>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(row: Row) = apply {
                elements = row.elements.map { it.toMutableList() }
                additionalProperties = row.additionalProperties.toMutableMap()
            }

            /**
             * An array of objects. Each `elements` array corresponds to a single `origins`
             * coordinate and contains objects with `distance` and `duration` values for each of the
             * `destinations`. The details in the first `elements` array correspond to the first
             * `origins` point and the first object corresponds to the first `destinations` point
             * and so on.
             */
            fun elements(elements: List<Element>) = elements(JsonField.of(elements))

            /**
             * Sets [Builder.elements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elements] with a well-typed `List<Element>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun elements(elements: JsonField<List<Element>>) = apply {
                this.elements = elements.map { it.toMutableList() }
            }

            /**
             * Adds a single [Element] to [elements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addElement(element: Element) = apply {
                elements =
                    (elements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("elements", it).add(element)
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
             * Returns an immutable instance of [Row].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Row =
                Row(
                    (elements ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Row = apply {
            if (validated) {
                return@apply
            }

            elements().ifPresent { it.forEach { it.validate() } }
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
            (elements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Element
        private constructor(
            private val distance: JsonField<Double>,
            private val duration: JsonField<Double>,
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
            ) : this(distance, duration, mutableMapOf())

            /**
             * Distance of the route from an origin to a destination, in meters.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun distance(): Optional<Double> = distance.getOptional("distance")

            /**
             * Duration of the trip from an origin to a destination, in seconds.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun duration(): Optional<Double> = duration.getOptional("duration")

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

                /** Returns a mutable builder for constructing an instance of [Element]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Element]. */
            class Builder internal constructor() {

                private var distance: JsonField<Double> = JsonMissing.of()
                private var duration: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(element: Element) = apply {
                    distance = element.distance
                    duration = element.duration
                    additionalProperties = element.additionalProperties.toMutableMap()
                }

                /** Distance of the route from an origin to a destination, in meters. */
                fun distance(distance: Double) = distance(JsonField.of(distance))

                /**
                 * Sets [Builder.distance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.distance] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

                /** Duration of the trip from an origin to a destination, in seconds. */
                fun duration(duration: Double) = duration(JsonField.of(duration))

                /**
                 * Sets [Builder.duration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.duration] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

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
                 * Returns an immutable instance of [Element].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Element =
                    Element(distance, duration, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Element = apply {
                if (validated) {
                    return@apply
                }

                distance()
                duration()
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
                    (if (duration.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Element && distance == other.distance && duration == other.duration && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(distance, duration, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Element{distance=$distance, duration=$duration, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Row && elements == other.elements && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(elements, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Row{elements=$elements, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is JsonRetrieveResponse && msg == other.msg && rows == other.rows && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(msg, rows, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JsonRetrieveResponse{msg=$msg, rows=$rows, status=$status, additionalProperties=$additionalProperties}"
}
