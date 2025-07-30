// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.routereport

import ai.nextbillion.core.Enum
import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.Params
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.http.Headers
import ai.nextbillion.core.http.QueryParams
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Route Report */
class RouteReportCreateParams
private constructor(
    private val key: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * Takes a route geometry as input and returns the route details. Accepts `polyline` and
     * `polyline6` encoded geometry as input.
     *
     * **Note**: Route geometries generated from sources other than
     * [NextBillion.ai](http://NextBillion.ai) services, are not supported in this version.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originalShape(): String = body.originalShape()

    /**
     * Specify the encoding type of route geometry provided in `original_shape` input. Please note
     * that an error is returned when this parameter is not specified while an input is added to
     * `original_shape` parameter.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originalShapeType(): OriginalShapeType = body.originalShapeType()

    /**
     * Returns the raw JSON value of [originalShape].
     *
     * Unlike [originalShape], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _originalShape(): JsonField<String> = body._originalShape()

    /**
     * Returns the raw JSON value of [originalShapeType].
     *
     * Unlike [originalShapeType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _originalShapeType(): JsonField<OriginalShapeType> = body._originalShapeType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RouteReportCreateParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .originalShape()
         * .originalShapeType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RouteReportCreateParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(routeReportCreateParams: RouteReportCreateParams) = apply {
            key = routeReportCreateParams.key
            body = routeReportCreateParams.body.toBuilder()
            additionalHeaders = routeReportCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = routeReportCreateParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [originalShape]
         * - [originalShapeType]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Takes a route geometry as input and returns the route details. Accepts `polyline` and
         * `polyline6` encoded geometry as input.
         *
         * **Note**: Route geometries generated from sources other than
         * [NextBillion.ai](http://NextBillion.ai) services, are not supported in this version.
         */
        fun originalShape(originalShape: String) = apply { body.originalShape(originalShape) }

        /**
         * Sets [Builder.originalShape] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originalShape] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun originalShape(originalShape: JsonField<String>) = apply {
            body.originalShape(originalShape)
        }

        /**
         * Specify the encoding type of route geometry provided in `original_shape` input. Please
         * note that an error is returned when this parameter is not specified while an input is
         * added to `original_shape` parameter.
         */
        fun originalShapeType(originalShapeType: OriginalShapeType) = apply {
            body.originalShapeType(originalShapeType)
        }

        /**
         * Sets [Builder.originalShapeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originalShapeType] with a well-typed [OriginalShapeType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun originalShapeType(originalShapeType: JsonField<OriginalShapeType>) = apply {
            body.originalShapeType(originalShapeType)
        }

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
         * Returns an immutable instance of [RouteReportCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .originalShape()
         * .originalShapeType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RouteReportCreateParams =
            RouteReportCreateParams(
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
        private val originalShape: JsonField<String>,
        private val originalShapeType: JsonField<OriginalShapeType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("original_shape")
            @ExcludeMissing
            originalShape: JsonField<String> = JsonMissing.of(),
            @JsonProperty("original_shape_type")
            @ExcludeMissing
            originalShapeType: JsonField<OriginalShapeType> = JsonMissing.of(),
        ) : this(originalShape, originalShapeType, mutableMapOf())

        /**
         * Takes a route geometry as input and returns the route details. Accepts `polyline` and
         * `polyline6` encoded geometry as input.
         *
         * **Note**: Route geometries generated from sources other than
         * [NextBillion.ai](http://NextBillion.ai) services, are not supported in this version.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originalShape(): String = originalShape.getRequired("original_shape")

        /**
         * Specify the encoding type of route geometry provided in `original_shape` input. Please
         * note that an error is returned when this parameter is not specified while an input is
         * added to `original_shape` parameter.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originalShapeType(): OriginalShapeType =
            originalShapeType.getRequired("original_shape_type")

        /**
         * Returns the raw JSON value of [originalShape].
         *
         * Unlike [originalShape], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("original_shape")
        @ExcludeMissing
        fun _originalShape(): JsonField<String> = originalShape

        /**
         * Returns the raw JSON value of [originalShapeType].
         *
         * Unlike [originalShapeType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("original_shape_type")
        @ExcludeMissing
        fun _originalShapeType(): JsonField<OriginalShapeType> = originalShapeType

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
             * .originalShape()
             * .originalShapeType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var originalShape: JsonField<String>? = null
            private var originalShapeType: JsonField<OriginalShapeType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                originalShape = body.originalShape
                originalShapeType = body.originalShapeType
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Takes a route geometry as input and returns the route details. Accepts `polyline` and
             * `polyline6` encoded geometry as input.
             *
             * **Note**: Route geometries generated from sources other than
             * [NextBillion.ai](http://NextBillion.ai) services, are not supported in this version.
             */
            fun originalShape(originalShape: String) = originalShape(JsonField.of(originalShape))

            /**
             * Sets [Builder.originalShape] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originalShape] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun originalShape(originalShape: JsonField<String>) = apply {
                this.originalShape = originalShape
            }

            /**
             * Specify the encoding type of route geometry provided in `original_shape` input.
             * Please note that an error is returned when this parameter is not specified while an
             * input is added to `original_shape` parameter.
             */
            fun originalShapeType(originalShapeType: OriginalShapeType) =
                originalShapeType(JsonField.of(originalShapeType))

            /**
             * Sets [Builder.originalShapeType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originalShapeType] with a well-typed
             * [OriginalShapeType] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun originalShapeType(originalShapeType: JsonField<OriginalShapeType>) = apply {
                this.originalShapeType = originalShapeType
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .originalShape()
             * .originalShapeType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("originalShape", originalShape),
                    checkRequired("originalShapeType", originalShapeType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            originalShape()
            originalShapeType().validate()
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
            (if (originalShape.asKnown().isPresent) 1 else 0) +
                (originalShapeType.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && originalShape == other.originalShape && originalShapeType == other.originalShapeType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(originalShape, originalShapeType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{originalShape=$originalShape, originalShapeType=$originalShapeType, additionalProperties=$additionalProperties}"
    }

    /**
     * Specify the encoding type of route geometry provided in `original_shape` input. Please note
     * that an error is returned when this parameter is not specified while an input is added to
     * `original_shape` parameter.
     */
    class OriginalShapeType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val POLYLINE = of("`polyline`")

            @JvmField val POLYLINE6 = of("`polyline6`")

            @JvmStatic fun of(value: String) = OriginalShapeType(JsonField.of(value))
        }

        /** An enum containing [OriginalShapeType]'s known values. */
        enum class Known {
            POLYLINE,
            POLYLINE6,
        }

        /**
         * An enum containing [OriginalShapeType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OriginalShapeType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            POLYLINE,
            POLYLINE6,
            /**
             * An enum member indicating that [OriginalShapeType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                POLYLINE -> Value.POLYLINE
                POLYLINE6 -> Value.POLYLINE6
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws NextbillionSdkInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                POLYLINE -> Known.POLYLINE
                POLYLINE6 -> Known.POLYLINE6
                else ->
                    throw NextbillionSdkInvalidDataException("Unknown OriginalShapeType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws NextbillionSdkInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                NextbillionSdkInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): OriginalShapeType = apply {
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

            return /* spotless:off */ other is OriginalShapeType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RouteReportCreateParams && key == other.key && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "RouteReportCreateParams{key=$key, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
