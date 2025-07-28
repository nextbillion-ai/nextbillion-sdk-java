// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.restrictions

import ai.nextbillion.core.Enum
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.Params
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.http.Headers
import ai.nextbillion.core.http.QueryParams
import ai.nextbillion.core.toImmutable
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get restrictions by bbox */
class RestrictionListByBboxParams
private constructor(
    private val key: String,
    private val maxLat: Double,
    private val maxLon: Double,
    private val minLat: Double,
    private val minLon: Double,
    private val mode: List<Mode>?,
    private val restrictionType: RestrictionType?,
    private val source: Source?,
    private val state: State?,
    private val status: Status?,
    private val transform: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /** Specifies the maximum latitude value for the bounding box. */
    fun maxLat(): Double = maxLat

    /** Specifies the maximum longitude value for the bounding box. */
    fun maxLon(): Double = maxLon

    /** Specifies the minimum latitude value for the bounding box. */
    fun minLat(): Double = minLat

    /** Specifies the minimum longitude value for the bounding box. */
    fun minLon(): Double = minLon

    /** Specify the modes of travel that the restriction pertains to. */
    fun mode(): Optional<List<Mode>> = Optional.ofNullable(mode)

    /** Specify the type of restrictions to fetch. */
    fun restrictionType(): Optional<RestrictionType> = Optional.ofNullable(restrictionType)

    /**
     * This parameter represents where the restriction comes from and cannot be modified by clients
     * sending requests to the API endpoint.
     *
     * For example, an API endpoint that returns a list of restrictions could include the source
     * parameter to indicate where each item comes from. This parameter can be useful for filtering,
     * sorting, or grouping the results based on their source.
     */
    fun source(): Optional<Source> = Optional.ofNullable(source)

    /**
     * This parameter is used to filter restrictions based on their state i.e. whether the
     * restriction is currently enabled, disabled, or deleted. For example, users can retrieve a
     * list of all the deleted restrictions by setting `state=deleted`.
     */
    fun state(): Optional<State> = Optional.ofNullable(state)

    /**
     * Restrictions can be active or inactive at a given time by virtue of their nature. For
     * example, maximum speed limits can be active on the roads leading to schools during school
     * hours and be inactive afterwards or certain road closure restrictions be active during
     * holidays/concerts and be inactive otherwise.
     *
     * Use this parameter to filter the restrictions based on their status at the time of making the
     * request i.e. whether they are in force or not.
     */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    /** This is internal parameter with a default value as `false`. */
    fun transform(): Optional<Boolean> = Optional.ofNullable(transform)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RestrictionListByBboxParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .maxLat()
         * .maxLon()
         * .minLat()
         * .minLon()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RestrictionListByBboxParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var maxLat: Double? = null
        private var maxLon: Double? = null
        private var minLat: Double? = null
        private var minLon: Double? = null
        private var mode: MutableList<Mode>? = null
        private var restrictionType: RestrictionType? = null
        private var source: Source? = null
        private var state: State? = null
        private var status: Status? = null
        private var transform: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(restrictionListByBboxParams: RestrictionListByBboxParams) = apply {
            key = restrictionListByBboxParams.key
            maxLat = restrictionListByBboxParams.maxLat
            maxLon = restrictionListByBboxParams.maxLon
            minLat = restrictionListByBboxParams.minLat
            minLon = restrictionListByBboxParams.minLon
            mode = restrictionListByBboxParams.mode?.toMutableList()
            restrictionType = restrictionListByBboxParams.restrictionType
            source = restrictionListByBboxParams.source
            state = restrictionListByBboxParams.state
            status = restrictionListByBboxParams.status
            transform = restrictionListByBboxParams.transform
            additionalHeaders = restrictionListByBboxParams.additionalHeaders.toBuilder()
            additionalQueryParams = restrictionListByBboxParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /** Specifies the maximum latitude value for the bounding box. */
        fun maxLat(maxLat: Double) = apply { this.maxLat = maxLat }

        /** Specifies the maximum longitude value for the bounding box. */
        fun maxLon(maxLon: Double) = apply { this.maxLon = maxLon }

        /** Specifies the minimum latitude value for the bounding box. */
        fun minLat(minLat: Double) = apply { this.minLat = minLat }

        /** Specifies the minimum longitude value for the bounding box. */
        fun minLon(minLon: Double) = apply { this.minLon = minLon }

        /** Specify the modes of travel that the restriction pertains to. */
        fun mode(mode: List<Mode>?) = apply { this.mode = mode?.toMutableList() }

        /** Alias for calling [Builder.mode] with `mode.orElse(null)`. */
        fun mode(mode: Optional<List<Mode>>) = mode(mode.getOrNull())

        /**
         * Adds a single [Mode] to [Builder.mode].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMode(mode: Mode) = apply {
            this.mode = (this.mode ?: mutableListOf()).apply { add(mode) }
        }

        /** Specify the type of restrictions to fetch. */
        fun restrictionType(restrictionType: RestrictionType?) = apply {
            this.restrictionType = restrictionType
        }

        /** Alias for calling [Builder.restrictionType] with `restrictionType.orElse(null)`. */
        fun restrictionType(restrictionType: Optional<RestrictionType>) =
            restrictionType(restrictionType.getOrNull())

        /**
         * This parameter represents where the restriction comes from and cannot be modified by
         * clients sending requests to the API endpoint.
         *
         * For example, an API endpoint that returns a list of restrictions could include the source
         * parameter to indicate where each item comes from. This parameter can be useful for
         * filtering, sorting, or grouping the results based on their source.
         */
        fun source(source: Source?) = apply { this.source = source }

        /** Alias for calling [Builder.source] with `source.orElse(null)`. */
        fun source(source: Optional<Source>) = source(source.getOrNull())

        /**
         * This parameter is used to filter restrictions based on their state i.e. whether the
         * restriction is currently enabled, disabled, or deleted. For example, users can retrieve a
         * list of all the deleted restrictions by setting `state=deleted`.
         */
        fun state(state: State?) = apply { this.state = state }

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<State>) = state(state.getOrNull())

        /**
         * Restrictions can be active or inactive at a given time by virtue of their nature. For
         * example, maximum speed limits can be active on the roads leading to schools during school
         * hours and be inactive afterwards or certain road closure restrictions be active during
         * holidays/concerts and be inactive otherwise.
         *
         * Use this parameter to filter the restrictions based on their status at the time of making
         * the request i.e. whether they are in force or not.
         */
        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        /** This is internal parameter with a default value as `false`. */
        fun transform(transform: Boolean?) = apply { this.transform = transform }

        /**
         * Alias for [Builder.transform].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun transform(transform: Boolean) = transform(transform as Boolean?)

        /** Alias for calling [Builder.transform] with `transform.orElse(null)`. */
        fun transform(transform: Optional<Boolean>) = transform(transform.getOrNull())

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
         * Returns an immutable instance of [RestrictionListByBboxParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .maxLat()
         * .maxLon()
         * .minLat()
         * .minLon()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RestrictionListByBboxParams =
            RestrictionListByBboxParams(
                checkRequired("key", key),
                checkRequired("maxLat", maxLat),
                checkRequired("maxLon", maxLon),
                checkRequired("minLat", minLat),
                checkRequired("minLon", minLon),
                mode?.toImmutable(),
                restrictionType,
                source,
                state,
                status,
                transform,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                put("max_lat", maxLat.toString())
                put("max_lon", maxLon.toString())
                put("min_lat", minLat.toString())
                put("min_lon", minLon.toString())
                mode?.let { put("mode", it.joinToString(",") { it.toString() }) }
                restrictionType?.let { put("restriction_type", it.toString()) }
                source?.let { put("source", it.toString()) }
                state?.let { put("state", it.toString()) }
                status?.let { put("status", it.toString()) }
                transform?.let { put("transform", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val _0W = of("0w")

            @JvmField val _2W = of("2w")

            @JvmField val _3W = of("3w")

            @JvmField val _4W = of("4w")

            @JvmField val _6W = of("6w")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            _0W,
            _2W,
            _3W,
            _4W,
            _6W,
        }

        /**
         * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _0W,
            _2W,
            _3W,
            _4W,
            _6W,
            /** An enum member indicating that [Mode] was instantiated with an unknown value. */
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
                _0W -> Value._0W
                _2W -> Value._2W
                _3W -> Value._3W
                _4W -> Value._4W
                _6W -> Value._6W
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
                _0W -> Known._0W
                _2W -> Known._2W
                _3W -> Known._3W
                _4W -> Known._4W
                _6W -> Known._6W
                else -> throw NextbillionSdkInvalidDataException("Unknown Mode: $value")
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

        fun validate(): Mode = apply {
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

            return /* spotless:off */ other is Mode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Specify the type of restrictions to fetch. */
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

            return /* spotless:off */ other is RestrictionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * This parameter represents where the restriction comes from and cannot be modified by clients
     * sending requests to the API endpoint.
     *
     * For example, an API endpoint that returns a list of restrictions could include the source
     * parameter to indicate where each item comes from. This parameter can be useful for filtering,
     * sorting, or grouping the results based on their source.
     */
    class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val RRT = of("rrt")

            @JvmField val PBF = of("pbf")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        /** An enum containing [Source]'s known values. */
        enum class Known {
            RRT,
            PBF,
        }

        /**
         * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Source] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RRT,
            PBF,
            /** An enum member indicating that [Source] was instantiated with an unknown value. */
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
                RRT -> Value.RRT
                PBF -> Value.PBF
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
                RRT -> Known.RRT
                PBF -> Known.PBF
                else -> throw NextbillionSdkInvalidDataException("Unknown Source: $value")
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

        fun validate(): Source = apply {
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

            return /* spotless:off */ other is Source && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * This parameter is used to filter restrictions based on their state i.e. whether the
     * restriction is currently enabled, disabled, or deleted. For example, users can retrieve a
     * list of all the deleted restrictions by setting `state=deleted`.
     */
    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ENABLED = of("`enabled`")

            @JvmField val DISABLED = of("`disabled`")

            @JvmField val DELETED = of("`deleted`")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            ENABLED,
            DISABLED,
            DELETED,
        }

        /**
         * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [State] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENABLED,
            DISABLED,
            DELETED,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
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
                ENABLED -> Value.ENABLED
                DISABLED -> Value.DISABLED
                DELETED -> Value.DELETED
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
                ENABLED -> Known.ENABLED
                DISABLED -> Known.DISABLED
                DELETED -> Known.DELETED
                else -> throw NextbillionSdkInvalidDataException("Unknown State: $value")
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

        fun validate(): State = apply {
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

            return /* spotless:off */ other is State && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Restrictions can be active or inactive at a given time by virtue of their nature. For
     * example, maximum speed limits can be active on the roads leading to schools during school
     * hours and be inactive afterwards or certain road closure restrictions be active during
     * holidays/concerts and be inactive otherwise.
     *
     * Use this parameter to filter the restrictions based on their status at the time of making the
     * request i.e. whether they are in force or not.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACTIVE = of("`active`")

            @JvmField val INACTIVE = of("`inactive`")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            INACTIVE,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            INACTIVE,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ACTIVE -> Value.ACTIVE
                INACTIVE -> Value.INACTIVE
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
                ACTIVE -> Known.ACTIVE
                INACTIVE -> Known.INACTIVE
                else -> throw NextbillionSdkInvalidDataException("Unknown Status: $value")
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

        return /* spotless:off */ other is RestrictionListByBboxParams && key == other.key && maxLat == other.maxLat && maxLon == other.maxLon && minLat == other.minLat && minLon == other.minLon && mode == other.mode && restrictionType == other.restrictionType && source == other.source && state == other.state && status == other.status && transform == other.transform && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, maxLat, maxLon, minLat, minLon, mode, restrictionType, source, state, status, transform, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "RestrictionListByBboxParams{key=$key, maxLat=$maxLat, maxLon=$maxLon, minLat=$minLat, minLon=$minLon, mode=$mode, restrictionType=$restrictionType, source=$source, state=$state, status=$status, transform=$transform, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
