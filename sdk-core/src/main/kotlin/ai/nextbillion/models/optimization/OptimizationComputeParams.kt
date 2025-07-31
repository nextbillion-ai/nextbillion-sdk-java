// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.optimization

import ai.nextbillion.core.Enum
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.Params
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.http.Headers
import ai.nextbillion.core.http.QueryParams
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Nextbillion.ai Optimization API computes and returns an optimized route between an origin and
 * destination which have multiple stop points in between. With NextBillion.ai's Route Optimization
 * API you get.
 *
 * Optimized routing between way points
 *
 * Highly accurate ETAs with customized routes
 *
 * Roundtrip optimization with customized destinations
 *
 * A list of all parameters is specified in the next section.
 */
class OptimizationComputeParams
private constructor(
    private val coordinates: String,
    private val key: String,
    private val approaches: Approaches?,
    private val destination: Destination?,
    private val geometries: Geometries?,
    private val mode: Mode?,
    private val roundtrip: Boolean?,
    private val source: Source?,
    private val withGeometry: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * This is a pipe-separated list of coordinates.
     *
     * Minimum 3 pairs of coordinates and Maximum 12 pairs of coordinates are allowed.
     */
    fun coordinates(): String = coordinates

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * A semicolon-separated list indicating the side of the road from which to approach waypoints
     * in a requested route. If provided, the number of approaches must be the same as the number of
     * coordinates. However, you can skip a coordinate and show its position in the list with the ;
     * separator.
     */
    fun approaches(): Optional<Approaches> = Optional.ofNullable(approaches)

    /**
     * Specify the destination coordinate of the returned route. If the input is last, the last
     * coordinate will be the destination.
     */
    fun destination(): Optional<Destination> = Optional.ofNullable(destination)

    /**
     * Sets the output format of the route geometry in the response.
     *
     * On providing polyline and polyline6 as input, respective encoded geometry is returned.
     * However, when geojson is provided as the input value, polyline encoded geometry is returned
     * in the response along with a geojson details of the route.
     */
    fun geometries(): Optional<Geometries> = Optional.ofNullable(geometries)

    /**
     * Set which driving mode the service should use to determine a route. For example, if you use
     * "car", the API will return a route that a car can take. Using "truck" will return a route a
     * truck can use, taking into account appropriate truck routing restrictions.
     *
     * When "mode=truck", following are the default dimensions that are used:
     *
     * \- truck_height = 214 centimeters
     *
     * \- truck_width = 183 centimeters
     *
     * \- truck_length = 519 centimeters
     *
     * \- truck_weight = 5000 kg
     *
     * Please use the Directions Flexible version if you want to use custom truck dimensions.
     *
     * Note: Only the "car" profile is enabled by default. Please note that customized profiles
     * (including "truck") might not be available for all regions. Please contact your
     * [NextBillion.ai](http://NextBillion.ai) account manager, sales representative or reach out at
     * [support@nextbillion.ai](mailto:support@nextbillion.ai) in case you need additional profiles.
     */
    fun mode(): Optional<Mode> = Optional.ofNullable(mode)

    /** Indicates whether the returned route is a roundtrip. */
    fun roundtrip(): Optional<Boolean> = Optional.ofNullable(roundtrip)

    /**
     * The coordinate at which to start the returned route. If this is not configured, the return
     * route’s destination will be the first coordinate.
     */
    fun source(): Optional<Source> = Optional.ofNullable(source)

    /** Indicates whether the return geometry should be computed or not. */
    fun withGeometry(): Optional<Boolean> = Optional.ofNullable(withGeometry)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OptimizationComputeParams].
         *
         * The following fields are required:
         * ```java
         * .coordinates()
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OptimizationComputeParams]. */
    class Builder internal constructor() {

        private var coordinates: String? = null
        private var key: String? = null
        private var approaches: Approaches? = null
        private var destination: Destination? = null
        private var geometries: Geometries? = null
        private var mode: Mode? = null
        private var roundtrip: Boolean? = null
        private var source: Source? = null
        private var withGeometry: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(optimizationComputeParams: OptimizationComputeParams) = apply {
            coordinates = optimizationComputeParams.coordinates
            key = optimizationComputeParams.key
            approaches = optimizationComputeParams.approaches
            destination = optimizationComputeParams.destination
            geometries = optimizationComputeParams.geometries
            mode = optimizationComputeParams.mode
            roundtrip = optimizationComputeParams.roundtrip
            source = optimizationComputeParams.source
            withGeometry = optimizationComputeParams.withGeometry
            additionalHeaders = optimizationComputeParams.additionalHeaders.toBuilder()
            additionalQueryParams = optimizationComputeParams.additionalQueryParams.toBuilder()
        }

        /**
         * This is a pipe-separated list of coordinates.
         *
         * Minimum 3 pairs of coordinates and Maximum 12 pairs of coordinates are allowed.
         */
        fun coordinates(coordinates: String) = apply { this.coordinates = coordinates }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * A semicolon-separated list indicating the side of the road from which to approach
         * waypoints in a requested route. If provided, the number of approaches must be the same as
         * the number of coordinates. However, you can skip a coordinate and show its position in
         * the list with the ; separator.
         */
        fun approaches(approaches: Approaches?) = apply { this.approaches = approaches }

        /** Alias for calling [Builder.approaches] with `approaches.orElse(null)`. */
        fun approaches(approaches: Optional<Approaches>) = approaches(approaches.getOrNull())

        /**
         * Specify the destination coordinate of the returned route. If the input is last, the last
         * coordinate will be the destination.
         */
        fun destination(destination: Destination?) = apply { this.destination = destination }

        /** Alias for calling [Builder.destination] with `destination.orElse(null)`. */
        fun destination(destination: Optional<Destination>) = destination(destination.getOrNull())

        /**
         * Sets the output format of the route geometry in the response.
         *
         * On providing polyline and polyline6 as input, respective encoded geometry is returned.
         * However, when geojson is provided as the input value, polyline encoded geometry is
         * returned in the response along with a geojson details of the route.
         */
        fun geometries(geometries: Geometries?) = apply { this.geometries = geometries }

        /** Alias for calling [Builder.geometries] with `geometries.orElse(null)`. */
        fun geometries(geometries: Optional<Geometries>) = geometries(geometries.getOrNull())

        /**
         * Set which driving mode the service should use to determine a route. For example, if you
         * use "car", the API will return a route that a car can take. Using "truck" will return a
         * route a truck can use, taking into account appropriate truck routing restrictions.
         *
         * When "mode=truck", following are the default dimensions that are used:
         *
         * \- truck_height = 214 centimeters
         *
         * \- truck_width = 183 centimeters
         *
         * \- truck_length = 519 centimeters
         *
         * \- truck_weight = 5000 kg
         *
         * Please use the Directions Flexible version if you want to use custom truck dimensions.
         *
         * Note: Only the "car" profile is enabled by default. Please note that customized profiles
         * (including "truck") might not be available for all regions. Please contact your
         * [NextBillion.ai](http://NextBillion.ai) account manager, sales representative or reach
         * out at [support@nextbillion.ai](mailto:support@nextbillion.ai) in case you need
         * additional profiles.
         */
        fun mode(mode: Mode?) = apply { this.mode = mode }

        /** Alias for calling [Builder.mode] with `mode.orElse(null)`. */
        fun mode(mode: Optional<Mode>) = mode(mode.getOrNull())

        /** Indicates whether the returned route is a roundtrip. */
        fun roundtrip(roundtrip: Boolean?) = apply { this.roundtrip = roundtrip }

        /**
         * Alias for [Builder.roundtrip].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun roundtrip(roundtrip: Boolean) = roundtrip(roundtrip as Boolean?)

        /** Alias for calling [Builder.roundtrip] with `roundtrip.orElse(null)`. */
        fun roundtrip(roundtrip: Optional<Boolean>) = roundtrip(roundtrip.getOrNull())

        /**
         * The coordinate at which to start the returned route. If this is not configured, the
         * return route’s destination will be the first coordinate.
         */
        fun source(source: Source?) = apply { this.source = source }

        /** Alias for calling [Builder.source] with `source.orElse(null)`. */
        fun source(source: Optional<Source>) = source(source.getOrNull())

        /** Indicates whether the return geometry should be computed or not. */
        fun withGeometry(withGeometry: Boolean?) = apply { this.withGeometry = withGeometry }

        /**
         * Alias for [Builder.withGeometry].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun withGeometry(withGeometry: Boolean) = withGeometry(withGeometry as Boolean?)

        /** Alias for calling [Builder.withGeometry] with `withGeometry.orElse(null)`. */
        fun withGeometry(withGeometry: Optional<Boolean>) = withGeometry(withGeometry.getOrNull())

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
         * Returns an immutable instance of [OptimizationComputeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .coordinates()
         * .key()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OptimizationComputeParams =
            OptimizationComputeParams(
                checkRequired("coordinates", coordinates),
                checkRequired("key", key),
                approaches,
                destination,
                geometries,
                mode,
                roundtrip,
                source,
                withGeometry,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("coordinates", coordinates)
                put("key", key)
                approaches?.let { put("approaches", it.toString()) }
                destination?.let { put("destination", it.toString()) }
                geometries?.let { put("geometries", it.toString()) }
                mode?.let { put("mode", it.toString()) }
                roundtrip?.let { put("roundtrip", it.toString()) }
                source?.let { put("source", it.toString()) }
                withGeometry?.let { put("with_geometry", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * A semicolon-separated list indicating the side of the road from which to approach waypoints
     * in a requested route. If provided, the number of approaches must be the same as the number of
     * coordinates. However, you can skip a coordinate and show its position in the list with the ;
     * separator.
     */
    class Approaches @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val UNRESTRICTED = of("unrestricted")

            @JvmField val CURB = of("curb")

            @JvmStatic fun of(value: String) = Approaches(JsonField.of(value))
        }

        /** An enum containing [Approaches]'s known values. */
        enum class Known {
            UNRESTRICTED,
            CURB,
        }

        /**
         * An enum containing [Approaches]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Approaches] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNRESTRICTED,
            CURB,
            /**
             * An enum member indicating that [Approaches] was instantiated with an unknown value.
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
                UNRESTRICTED -> Value.UNRESTRICTED
                CURB -> Value.CURB
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
                UNRESTRICTED -> Known.UNRESTRICTED
                CURB -> Known.CURB
                else -> throw NextbillionSdkInvalidDataException("Unknown Approaches: $value")
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

        fun validate(): Approaches = apply {
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

            return /* spotless:off */ other is Approaches && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specify the destination coordinate of the returned route. If the input is last, the last
     * coordinate will be the destination.
     */
    class Destination @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ANY = of("any")

            @JvmField val LAST = of("last")

            @JvmStatic fun of(value: String) = Destination(JsonField.of(value))
        }

        /** An enum containing [Destination]'s known values. */
        enum class Known {
            ANY,
            LAST,
        }

        /**
         * An enum containing [Destination]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Destination] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ANY,
            LAST,
            /**
             * An enum member indicating that [Destination] was instantiated with an unknown value.
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
                ANY -> Value.ANY
                LAST -> Value.LAST
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
                ANY -> Known.ANY
                LAST -> Known.LAST
                else -> throw NextbillionSdkInvalidDataException("Unknown Destination: $value")
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

        fun validate(): Destination = apply {
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

            return /* spotless:off */ other is Destination && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Sets the output format of the route geometry in the response.
     *
     * On providing polyline and polyline6 as input, respective encoded geometry is returned.
     * However, when geojson is provided as the input value, polyline encoded geometry is returned
     * in the response along with a geojson details of the route.
     */
    class Geometries @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val POLYLINE = of("polyline")

            @JvmField val POLYLINE6 = of("polyline6")

            @JvmField val GEOJSON = of("geojson")

            @JvmStatic fun of(value: String) = Geometries(JsonField.of(value))
        }

        /** An enum containing [Geometries]'s known values. */
        enum class Known {
            POLYLINE,
            POLYLINE6,
            GEOJSON,
        }

        /**
         * An enum containing [Geometries]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Geometries] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            POLYLINE,
            POLYLINE6,
            GEOJSON,
            /**
             * An enum member indicating that [Geometries] was instantiated with an unknown value.
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
                GEOJSON -> Value.GEOJSON
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
                GEOJSON -> Known.GEOJSON
                else -> throw NextbillionSdkInvalidDataException("Unknown Geometries: $value")
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

        fun validate(): Geometries = apply {
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

            return /* spotless:off */ other is Geometries && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Set which driving mode the service should use to determine a route. For example, if you use
     * "car", the API will return a route that a car can take. Using "truck" will return a route a
     * truck can use, taking into account appropriate truck routing restrictions.
     *
     * When "mode=truck", following are the default dimensions that are used:
     *
     * \- truck_height = 214 centimeters
     *
     * \- truck_width = 183 centimeters
     *
     * \- truck_length = 519 centimeters
     *
     * \- truck_weight = 5000 kg
     *
     * Please use the Directions Flexible version if you want to use custom truck dimensions.
     *
     * Note: Only the "car" profile is enabled by default. Please note that customized profiles
     * (including "truck") might not be available for all regions. Please contact your
     * [NextBillion.ai](http://NextBillion.ai) account manager, sales representative or reach out at
     * [support@nextbillion.ai](mailto:support@nextbillion.ai) in case you need additional profiles.
     */
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

            @JvmField val CAR = of("car")

            @JvmField val TRUCK = of("truck")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            CAR,
            TRUCK,
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
            CAR,
            TRUCK,
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
                CAR -> Value.CAR
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
                CAR -> Known.CAR
                TRUCK -> Known.TRUCK
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

    /**
     * The coordinate at which to start the returned route. If this is not configured, the return
     * route’s destination will be the first coordinate.
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

            @JvmField val ANY = of("any")

            @JvmField val FIRST = of("first")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        /** An enum containing [Source]'s known values. */
        enum class Known {
            ANY,
            FIRST,
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
            ANY,
            FIRST,
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
                ANY -> Value.ANY
                FIRST -> Value.FIRST
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
                ANY -> Known.ANY
                FIRST -> Known.FIRST
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OptimizationComputeParams && coordinates == other.coordinates && key == other.key && approaches == other.approaches && destination == other.destination && geometries == other.geometries && mode == other.mode && roundtrip == other.roundtrip && source == other.source && withGeometry == other.withGeometry && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(coordinates, key, approaches, destination, geometries, mode, roundtrip, source, withGeometry, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "OptimizationComputeParams{coordinates=$coordinates, key=$key, approaches=$approaches, destination=$destination, geometries=$geometries, mode=$mode, roundtrip=$roundtrip, source=$source, withGeometry=$withGeometry, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
