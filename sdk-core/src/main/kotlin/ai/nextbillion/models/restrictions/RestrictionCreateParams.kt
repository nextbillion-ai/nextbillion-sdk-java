// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.restrictions

import ai.nextbillion.core.Enum
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.Params
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.http.Headers
import ai.nextbillion.core.http.QueryParams
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new restriction */
class RestrictionCreateParams
private constructor(
    private val restrictionType: RestrictionType?,
    private val key: String,
    private val latlon: Boolean?,
    private val richGroupRequest: RichGroupRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun restrictionType(): Optional<RestrictionType> = Optional.ofNullable(restrictionType)

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * Use this parameter to decide the format for specifying the geofence coordinates. If true,
     * then the coordinates of geofence can be specified as "latitude,longitude" format, otherwise
     * they should be specified in "longitude,latitude" format.
     */
    fun latlon(): Optional<Boolean> = Optional.ofNullable(latlon)

    fun richGroupRequest(): RichGroupRequest = richGroupRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        richGroupRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RestrictionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .richGroupRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RestrictionCreateParams]. */
    class Builder internal constructor() {

        private var restrictionType: RestrictionType? = null
        private var key: String? = null
        private var latlon: Boolean? = null
        private var richGroupRequest: RichGroupRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(restrictionCreateParams: RestrictionCreateParams) = apply {
            restrictionType = restrictionCreateParams.restrictionType
            key = restrictionCreateParams.key
            latlon = restrictionCreateParams.latlon
            richGroupRequest = restrictionCreateParams.richGroupRequest
            additionalHeaders = restrictionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = restrictionCreateParams.additionalQueryParams.toBuilder()
        }

        fun restrictionType(restrictionType: RestrictionType?) = apply {
            this.restrictionType = restrictionType
        }

        /** Alias for calling [Builder.restrictionType] with `restrictionType.orElse(null)`. */
        fun restrictionType(restrictionType: Optional<RestrictionType>) =
            restrictionType(restrictionType.getOrNull())

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Use this parameter to decide the format for specifying the geofence coordinates. If true,
         * then the coordinates of geofence can be specified as "latitude,longitude" format,
         * otherwise they should be specified in "longitude,latitude" format.
         */
        fun latlon(latlon: Boolean?) = apply { this.latlon = latlon }

        /**
         * Alias for [Builder.latlon].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun latlon(latlon: Boolean) = latlon(latlon as Boolean?)

        /** Alias for calling [Builder.latlon] with `latlon.orElse(null)`. */
        fun latlon(latlon: Optional<Boolean>) = latlon(latlon.getOrNull())

        fun richGroupRequest(richGroupRequest: RichGroupRequest) = apply {
            this.richGroupRequest = richGroupRequest
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
         * Returns an immutable instance of [RestrictionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .richGroupRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RestrictionCreateParams =
            RestrictionCreateParams(
                restrictionType,
                checkRequired("key", key),
                latlon,
                checkRequired("richGroupRequest", richGroupRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): RichGroupRequest = richGroupRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> restrictionType?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                latlon?.let { put("latlon", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class RestrictionType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val TURN = of("turn")

            @JvmField val PARKING = of("parking")

            @JvmField val FIXEDSPEED = of("fixedspeed")

            @JvmField val MAXSPEED = of("maxspeed")

            @JvmField val CLOSURE = of("closure")

            @JvmField val TRUCK = of("truck")

            @JvmStatic fun of(value: String) = RestrictionType(JsonField.of(value))
        }

        /** An enum containing [RestrictionType]'s known values. */
        enum class Known {
            TURN,
            PARKING,
            FIXEDSPEED,
            MAXSPEED,
            CLOSURE,
            TRUCK,
        }

        /**
         * An enum containing [RestrictionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RestrictionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TURN,
            PARKING,
            FIXEDSPEED,
            MAXSPEED,
            CLOSURE,
            TRUCK,
            /**
             * An enum member indicating that [RestrictionType] was instantiated with an unknown
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
                TURN -> Value.TURN
                PARKING -> Value.PARKING
                FIXEDSPEED -> Value.FIXEDSPEED
                MAXSPEED -> Value.MAXSPEED
                CLOSURE -> Value.CLOSURE
                TRUCK -> Value.TRUCK
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
                TURN -> Known.TURN
                PARKING -> Known.PARKING
                FIXEDSPEED -> Known.FIXEDSPEED
                MAXSPEED -> Known.MAXSPEED
                CLOSURE -> Known.CLOSURE
                TRUCK -> Known.TRUCK
                else -> throw NextbillionSdkInvalidDataException("Unknown RestrictionType: $value")
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

        fun validate(): RestrictionType = apply {
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

            return other is RestrictionType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RestrictionCreateParams &&
            restrictionType == other.restrictionType &&
            key == other.key &&
            latlon == other.latlon &&
            richGroupRequest == other.richGroupRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            restrictionType,
            key,
            latlon,
            richGroupRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RestrictionCreateParams{restrictionType=$restrictionType, key=$key, latlon=$latlon, richGroupRequest=$richGroupRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
