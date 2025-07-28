// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.snaptoroads

import com.fasterxml.jackson.annotation.JsonCreator
import io.nextbillion.api.core.Enum
import io.nextbillion.api.core.JsonField
import io.nextbillion.api.core.Params
import io.nextbillion.api.core.checkRequired
import io.nextbillion.api.core.http.Headers
import io.nextbillion.api.core.http.QueryParams
import io.nextbillion.api.errors.NextbillionSdkInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Nextbillion.ai Snap To Roads API takes a series of locations along a route, and returns the new
 * locations on this route that are snapped to the best-matched roads where the trip took place. You
 * can set various parameters, such as timestamps or radius, to optimize the result.
 */
class SnapToRoadSnapParams
private constructor(
    private val key: String,
    private val path: String,
    private val approaches: Approaches?,
    private val avoid: Avoid?,
    private val geometry: Geometry?,
    private val mode: Mode?,
    private val option: Option?,
    private val radiuses: String?,
    private val roadInfo: RoadInfo?,
    private val timestamps: String?,
    private val tolerateOutlier: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /** Pipe-separated list of coordinate points along a path which would be snapped to a road. */
    fun path(): String = path

    /**
     * A semicolon-separated list indicating the side of the road from which to approach the
     * locations on the snapped route. When set to "unrestricted" a route can arrive at the snapped
     * location from either side of the road and when set to "curb" the route will arrive at the
     * snapped location on the driving side of the region. Please note the number of values provided
     * must be equal to the number of coordinate points provided in the "path" parameter. However,
     * you can skip a coordinate and show its position in the list with the ";" separator.
     */
    fun approaches(): Optional<Approaches> = Optional.ofNullable(approaches)

    /**
     * Setting this will ensure the route avoids ferries, tolls, highways or nothing. Multiple
     * values should be separated by a pipe (|). If "none" is provided along with other values, an
     * error is returned as a valid route is not feasible. Please note that when this parameter is
     * not provided in the input, ferries are set to be avoided by default. When this parameter is
     * provided, only the mentioned objects are avoided.
     */
    fun avoid(): Optional<Avoid> = Optional.ofNullable(avoid)

    /**
     * Sets the output format of the route geometry in the response. Only the "polyline" or
     * "polyline6" encoded "geometry" of the snapped path is returned in the response depending on
     * the value provided in the input. When "geojson" is selected as the input value, "polyline6"
     * encoded geometry of the snapped path is returned along with a "geojson" object.
     */
    fun geometry(): Optional<Geometry> = Optional.ofNullable(geometry)

    /**
     * Set which driving mode the service should use to determine a route. For example, if you use
     * "car", the API will return a route that a car can take. Using "truck" will return a route a
     * truck can use, taking into account appropriate truck routing restrictions.
     *
     * Note: Only the "car" profile is enabled by default. Please note that customized profiles
     * (including "truck") might not be available for all regions. Please contact your
     * [NextBillion.ai](http://NextBillion.ai) account manager, sales representative or reach out at
     * [support@nextbillion.ai](mailto:support@nextbillion.ai) in case you need additional profiles.
     */
    fun mode(): Optional<Mode> = Optional.ofNullable(mode)

    /**
     * Include this parameter in the request to return segment-wise speed information of the route
     * returned in the response.
     *
     * Please note that returning speed information is a function of "road_info" parameter, which is
     * effective only when "option=flexible". However, the resultant route might not contain all the
     * locations provided in "path" input.
     */
    fun option(): Optional<Option> = Optional.ofNullable(option)

    /**
     * Pipe separated radiuses, in meters (m), up to which a coordinate point can be snapped. Please
     * note, if no valid road is available within the specified radius, the API would snap the
     * points to nearest, most viable road. When using this parameter, it is recommended to specify
     * as many radius values as the number of points in "path" parameter. If the same number of
     * "radiuses" are not provided, the API will use the default radius value of 25 meters for all
     * locations.
     */
    fun radiuses(): Optional<String> = Optional.ofNullable(radiuses)

    /**
     * Use this parameter to receive segment-wise maximum speed information of the route in the
     * response. "max_speed" is the only allowed value.
     */
    fun roadInfo(): Optional<RoadInfo> = Optional.ofNullable(roadInfo)

    /**
     * Pipe-separated UNIX epoch timestamp in seconds for each location. If used, the number of
     * timestamps must be equal to the number of coordinate points in the "path" parameter. The
     * "timestamps" must increase monotonically starting from the first timestamp. This means that
     * each subsequent timestamp should either be more than or equal to the preceding one.
     */
    fun timestamps(): Optional<String> = Optional.ofNullable(timestamps)

    /**
     * Enable it to ignore locations outside the service boundary. When "true", the service would
     * ignore "path" coordinates points falling outside the accessible area, which otherwise would
     * cause an error when this parameter is "false".
     */
    fun tolerateOutlier(): Optional<Boolean> = Optional.ofNullable(tolerateOutlier)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SnapToRoadSnapParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .path()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SnapToRoadSnapParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var path: String? = null
        private var approaches: Approaches? = null
        private var avoid: Avoid? = null
        private var geometry: Geometry? = null
        private var mode: Mode? = null
        private var option: Option? = null
        private var radiuses: String? = null
        private var roadInfo: RoadInfo? = null
        private var timestamps: String? = null
        private var tolerateOutlier: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(snapToRoadSnapParams: SnapToRoadSnapParams) = apply {
            key = snapToRoadSnapParams.key
            path = snapToRoadSnapParams.path
            approaches = snapToRoadSnapParams.approaches
            avoid = snapToRoadSnapParams.avoid
            geometry = snapToRoadSnapParams.geometry
            mode = snapToRoadSnapParams.mode
            option = snapToRoadSnapParams.option
            radiuses = snapToRoadSnapParams.radiuses
            roadInfo = snapToRoadSnapParams.roadInfo
            timestamps = snapToRoadSnapParams.timestamps
            tolerateOutlier = snapToRoadSnapParams.tolerateOutlier
            additionalHeaders = snapToRoadSnapParams.additionalHeaders.toBuilder()
            additionalQueryParams = snapToRoadSnapParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Pipe-separated list of coordinate points along a path which would be snapped to a road.
         */
        fun path(path: String) = apply { this.path = path }

        /**
         * A semicolon-separated list indicating the side of the road from which to approach the
         * locations on the snapped route. When set to "unrestricted" a route can arrive at the
         * snapped location from either side of the road and when set to "curb" the route will
         * arrive at the snapped location on the driving side of the region. Please note the number
         * of values provided must be equal to the number of coordinate points provided in the
         * "path" parameter. However, you can skip a coordinate and show its position in the list
         * with the ";" separator.
         */
        fun approaches(approaches: Approaches?) = apply { this.approaches = approaches }

        /** Alias for calling [Builder.approaches] with `approaches.orElse(null)`. */
        fun approaches(approaches: Optional<Approaches>) = approaches(approaches.getOrNull())

        /**
         * Setting this will ensure the route avoids ferries, tolls, highways or nothing. Multiple
         * values should be separated by a pipe (|). If "none" is provided along with other values,
         * an error is returned as a valid route is not feasible. Please note that when this
         * parameter is not provided in the input, ferries are set to be avoided by default. When
         * this parameter is provided, only the mentioned objects are avoided.
         */
        fun avoid(avoid: Avoid?) = apply { this.avoid = avoid }

        /** Alias for calling [Builder.avoid] with `avoid.orElse(null)`. */
        fun avoid(avoid: Optional<Avoid>) = avoid(avoid.getOrNull())

        /**
         * Sets the output format of the route geometry in the response. Only the "polyline" or
         * "polyline6" encoded "geometry" of the snapped path is returned in the response depending
         * on the value provided in the input. When "geojson" is selected as the input value,
         * "polyline6" encoded geometry of the snapped path is returned along with a "geojson"
         * object.
         */
        fun geometry(geometry: Geometry?) = apply { this.geometry = geometry }

        /** Alias for calling [Builder.geometry] with `geometry.orElse(null)`. */
        fun geometry(geometry: Optional<Geometry>) = geometry(geometry.getOrNull())

        /**
         * Set which driving mode the service should use to determine a route. For example, if you
         * use "car", the API will return a route that a car can take. Using "truck" will return a
         * route a truck can use, taking into account appropriate truck routing restrictions.
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

        /**
         * Include this parameter in the request to return segment-wise speed information of the
         * route returned in the response.
         *
         * Please note that returning speed information is a function of "road_info" parameter,
         * which is effective only when "option=flexible". However, the resultant route might not
         * contain all the locations provided in "path" input.
         */
        fun option(option: Option?) = apply { this.option = option }

        /** Alias for calling [Builder.option] with `option.orElse(null)`. */
        fun option(option: Optional<Option>) = option(option.getOrNull())

        /**
         * Pipe separated radiuses, in meters (m), up to which a coordinate point can be snapped.
         * Please note, if no valid road is available within the specified radius, the API would
         * snap the points to nearest, most viable road. When using this parameter, it is
         * recommended to specify as many radius values as the number of points in "path" parameter.
         * If the same number of "radiuses" are not provided, the API will use the default radius
         * value of 25 meters for all locations.
         */
        fun radiuses(radiuses: String?) = apply { this.radiuses = radiuses }

        /** Alias for calling [Builder.radiuses] with `radiuses.orElse(null)`. */
        fun radiuses(radiuses: Optional<String>) = radiuses(radiuses.getOrNull())

        /**
         * Use this parameter to receive segment-wise maximum speed information of the route in the
         * response. "max_speed" is the only allowed value.
         */
        fun roadInfo(roadInfo: RoadInfo?) = apply { this.roadInfo = roadInfo }

        /** Alias for calling [Builder.roadInfo] with `roadInfo.orElse(null)`. */
        fun roadInfo(roadInfo: Optional<RoadInfo>) = roadInfo(roadInfo.getOrNull())

        /**
         * Pipe-separated UNIX epoch timestamp in seconds for each location. If used, the number of
         * timestamps must be equal to the number of coordinate points in the "path" parameter. The
         * "timestamps" must increase monotonically starting from the first timestamp. This means
         * that each subsequent timestamp should either be more than or equal to the preceding one.
         */
        fun timestamps(timestamps: String?) = apply { this.timestamps = timestamps }

        /** Alias for calling [Builder.timestamps] with `timestamps.orElse(null)`. */
        fun timestamps(timestamps: Optional<String>) = timestamps(timestamps.getOrNull())

        /**
         * Enable it to ignore locations outside the service boundary. When "true", the service
         * would ignore "path" coordinates points falling outside the accessible area, which
         * otherwise would cause an error when this parameter is "false".
         */
        fun tolerateOutlier(tolerateOutlier: Boolean?) = apply {
            this.tolerateOutlier = tolerateOutlier
        }

        /**
         * Alias for [Builder.tolerateOutlier].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun tolerateOutlier(tolerateOutlier: Boolean) = tolerateOutlier(tolerateOutlier as Boolean?)

        /** Alias for calling [Builder.tolerateOutlier] with `tolerateOutlier.orElse(null)`. */
        fun tolerateOutlier(tolerateOutlier: Optional<Boolean>) =
            tolerateOutlier(tolerateOutlier.getOrNull())

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
         * Returns an immutable instance of [SnapToRoadSnapParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .path()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SnapToRoadSnapParams =
            SnapToRoadSnapParams(
                checkRequired("key", key),
                checkRequired("path", path),
                approaches,
                avoid,
                geometry,
                mode,
                option,
                radiuses,
                roadInfo,
                timestamps,
                tolerateOutlier,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                put("path", path)
                approaches?.let { put("approaches", it.toString()) }
                avoid?.let { put("avoid", it.toString()) }
                geometry?.let { put("geometry", it.toString()) }
                mode?.let { put("mode", it.toString()) }
                option?.let { put("option", it.toString()) }
                radiuses?.let { put("radiuses", it) }
                roadInfo?.let { put("road_info", it.toString()) }
                timestamps?.let { put("timestamps", it) }
                tolerateOutlier?.let { put("tolerate_outlier", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * A semicolon-separated list indicating the side of the road from which to approach the
     * locations on the snapped route. When set to "unrestricted" a route can arrive at the snapped
     * location from either side of the road and when set to "curb" the route will arrive at the
     * snapped location on the driving side of the region. Please note the number of values provided
     * must be equal to the number of coordinate points provided in the "path" parameter. However,
     * you can skip a coordinate and show its position in the list with the ";" separator.
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

            @JvmField val UNRESTRICTED = of("`unrestricted`")

            @JvmField val CURB = of("`curb`")

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
     * Setting this will ensure the route avoids ferries, tolls, highways or nothing. Multiple
     * values should be separated by a pipe (|). If "none" is provided along with other values, an
     * error is returned as a valid route is not feasible. Please note that when this parameter is
     * not provided in the input, ferries are set to be avoided by default. When this parameter is
     * provided, only the mentioned objects are avoided.
     */
    class Avoid @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TOLL = of("toll")

            @JvmField val FERRY = of("ferry")

            @JvmField val HIGHWAY = of("highway")

            @JvmField val NONE = of("none")

            @JvmStatic fun of(value: String) = Avoid(JsonField.of(value))
        }

        /** An enum containing [Avoid]'s known values. */
        enum class Known {
            TOLL,
            FERRY,
            HIGHWAY,
            NONE,
        }

        /**
         * An enum containing [Avoid]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Avoid] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TOLL,
            FERRY,
            HIGHWAY,
            NONE,
            /** An enum member indicating that [Avoid] was instantiated with an unknown value. */
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
                TOLL -> Value.TOLL
                FERRY -> Value.FERRY
                HIGHWAY -> Value.HIGHWAY
                NONE -> Value.NONE
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
                TOLL -> Known.TOLL
                FERRY -> Known.FERRY
                HIGHWAY -> Known.HIGHWAY
                NONE -> Known.NONE
                else -> throw NextbillionSdkInvalidDataException("Unknown Avoid: $value")
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

        fun validate(): Avoid = apply {
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

            return /* spotless:off */ other is Avoid && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Sets the output format of the route geometry in the response. Only the "polyline" or
     * "polyline6" encoded "geometry" of the snapped path is returned in the response depending on
     * the value provided in the input. When "geojson" is selected as the input value, "polyline6"
     * encoded geometry of the snapped path is returned along with a "geojson" object.
     */
    class Geometry @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val GEOJSON = of("`geojson`")

            @JvmStatic fun of(value: String) = Geometry(JsonField.of(value))
        }

        /** An enum containing [Geometry]'s known values. */
        enum class Known {
            POLYLINE,
            POLYLINE6,
            GEOJSON,
        }

        /**
         * An enum containing [Geometry]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Geometry] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            POLYLINE,
            POLYLINE6,
            GEOJSON,
            /** An enum member indicating that [Geometry] was instantiated with an unknown value. */
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
                else -> throw NextbillionSdkInvalidDataException("Unknown Geometry: $value")
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

        fun validate(): Geometry = apply {
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

            return /* spotless:off */ other is Geometry && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Set which driving mode the service should use to determine a route. For example, if you use
     * "car", the API will return a route that a car can take. Using "truck" will return a route a
     * truck can use, taking into account appropriate truck routing restrictions.
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

            @JvmField val CAR = of("`car`")

            @JvmField val TRUCK = of("`truck`")

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
     * Include this parameter in the request to return segment-wise speed information of the route
     * returned in the response.
     *
     * Please note that returning speed information is a function of "road_info" parameter, which is
     * effective only when "option=flexible". However, the resultant route might not contain all the
     * locations provided in "path" input.
     */
    class Option @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FLEXIBLE = of("`flexible`")

            @JvmStatic fun of(value: String) = Option(JsonField.of(value))
        }

        /** An enum containing [Option]'s known values. */
        enum class Known {
            FLEXIBLE
        }

        /**
         * An enum containing [Option]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Option] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FLEXIBLE,
            /** An enum member indicating that [Option] was instantiated with an unknown value. */
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
                FLEXIBLE -> Value.FLEXIBLE
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
                FLEXIBLE -> Known.FLEXIBLE
                else -> throw NextbillionSdkInvalidDataException("Unknown Option: $value")
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

        fun validate(): Option = apply {
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

            return /* spotless:off */ other is Option && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Use this parameter to receive segment-wise maximum speed information of the route in the
     * response. "max_speed" is the only allowed value.
     */
    class RoadInfo @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MAX_SPEED = of("`max_speed`")

            @JvmStatic fun of(value: String) = RoadInfo(JsonField.of(value))
        }

        /** An enum containing [RoadInfo]'s known values. */
        enum class Known {
            MAX_SPEED
        }

        /**
         * An enum containing [RoadInfo]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RoadInfo] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MAX_SPEED,
            /** An enum member indicating that [RoadInfo] was instantiated with an unknown value. */
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
                MAX_SPEED -> Value.MAX_SPEED
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
                MAX_SPEED -> Known.MAX_SPEED
                else -> throw NextbillionSdkInvalidDataException("Unknown RoadInfo: $value")
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

        fun validate(): RoadInfo = apply {
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

            return /* spotless:off */ other is RoadInfo && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SnapToRoadSnapParams && key == other.key && path == other.path && approaches == other.approaches && avoid == other.avoid && geometry == other.geometry && mode == other.mode && option == other.option && radiuses == other.radiuses && roadInfo == other.roadInfo && timestamps == other.timestamps && tolerateOutlier == other.tolerateOutlier && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, path, approaches, avoid, geometry, mode, option, radiuses, roadInfo, timestamps, tolerateOutlier, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SnapToRoadSnapParams{key=$key, path=$path, approaches=$approaches, avoid=$avoid, geometry=$geometry, mode=$mode, option=$option, radiuses=$radiuses, roadInfo=$roadInfo, timestamps=$timestamps, tolerateOutlier=$tolerateOutlier, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
