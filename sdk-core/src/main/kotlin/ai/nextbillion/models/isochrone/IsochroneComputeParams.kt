// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.isochrone

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
 * The NextBillion.ai Isochrone API computes areas that are reachable within a specified amount of
 * time from a location, and returns the reachable regions as contours of polygons or lines that you
 * can display on a map.
 */
class IsochroneComputeParams
private constructor(
    private val contoursMeters: Long,
    private val contoursMinutes: Long,
    private val coordinates: String,
    private val key: String,
    private val contoursColors: String?,
    private val denoise: Double?,
    private val departureTime: Long?,
    private val generalize: Double?,
    private val mode: Mode?,
    private val polygons: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The distances, in meters, to use for each isochrone contour. You can specify up to four
     * contours. Distances must be in increasing order. The maximum distance that can be specified
     * is 60000 meters (60 km).
     */
    fun contoursMeters(): Long = contoursMeters

    /**
     * The times, in minutes, to use for each isochrone contour. You can specify up to four
     * contours. Times must be in increasing order. The maximum time that can be specified is 40
     * minutes.
     */
    fun contoursMinutes(): Long = contoursMinutes

    /**
     * The coordinates of the location which acts as the starting point for which the isochrone
     * lines need to be determined.
     */
    fun coordinates(): String = coordinates

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * The hex code of the color to fill isochrone contour. When requesting multiple contours, it is
     * recommended to provide color codes for each of the requested contours, separated by a ",". If
     * no colors are specified, the Isochrone API will assign a random color scheme to the output.
     */
    fun contoursColors(): Optional<String> = Optional.ofNullable(contoursColors)

    /**
     * A floating point value from 0.0 to 1.0 can be used to remove smaller contours. The default is
     * 1.0. A value of 1.0 will only return the largest contour for a given value. A value of 0.5
     * drops any contours that are less than half the area of the largest contour in the set of
     * contours for that same value.
     */
    fun denoise(): Optional<Double> = Optional.ofNullable(denoise)

    /**
     * Use this parameter to set a departure time, expressed as UNIX epoch timestamp in seconds, for
     * calculating the isochrone contour. The response will consider the typical traffic conditions
     * at the given time and return a contour which can be reached under those traffic conditions.
     * Please note that if no input is provided for this parameter then the traffic conditions at
     * the time of making the request are considered.
     */
    fun departureTime(): Optional<Long> = Optional.ofNullable(departureTime)

    /**
     * A positive floating point value, in meters, used as the tolerance for Douglas-Peucker
     * generalization. There is no upper bound. If no value is specified in the request, the
     * Isochrone API will choose the most optimized generalization to use for the request. Note that
     * the generalization of contours can lead to self-intersections, as well as intersections of
     * adjacent contours.
     */
    fun generalize(): Optional<Double> = Optional.ofNullable(generalize)

    /**
     * Set which driving mode the service should use to determine the contour. For example, if you
     * use "car", the API will return an isochrone contour that a car can reach within the specified
     * time or after driving the specified distance. Using "truck" will return a contour that a
     * truck can reach after taking into account appropriate truck routing restrictions.
     *
     * Note: Only the "car" profile is enabled by default. Please note that customized profiles
     * (including "truck") might not be available for all regions. Please contact your
     * [NextBillion.ai](http://NextBillion.ai) account manager, sales representative or reach out at
     * [support@nextbillion.ai](mailto:support@nextbillion.ai) in case you need additional profiles.
     */
    fun mode(): Optional<Mode> = Optional.ofNullable(mode)

    /**
     * Specify whether to return the contours as GeoJSON polygons (true) or linestrings (false,
     * default). When polygons=true, any contour that forms a ring is returned as a polygon.
     */
    fun polygons(): Optional<Boolean> = Optional.ofNullable(polygons)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IsochroneComputeParams].
         *
         * The following fields are required:
         * ```java
         * .contoursMeters()
         * .contoursMinutes()
         * .coordinates()
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IsochroneComputeParams]. */
    class Builder internal constructor() {

        private var contoursMeters: Long? = null
        private var contoursMinutes: Long? = null
        private var coordinates: String? = null
        private var key: String? = null
        private var contoursColors: String? = null
        private var denoise: Double? = null
        private var departureTime: Long? = null
        private var generalize: Double? = null
        private var mode: Mode? = null
        private var polygons: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(isochroneComputeParams: IsochroneComputeParams) = apply {
            contoursMeters = isochroneComputeParams.contoursMeters
            contoursMinutes = isochroneComputeParams.contoursMinutes
            coordinates = isochroneComputeParams.coordinates
            key = isochroneComputeParams.key
            contoursColors = isochroneComputeParams.contoursColors
            denoise = isochroneComputeParams.denoise
            departureTime = isochroneComputeParams.departureTime
            generalize = isochroneComputeParams.generalize
            mode = isochroneComputeParams.mode
            polygons = isochroneComputeParams.polygons
            additionalHeaders = isochroneComputeParams.additionalHeaders.toBuilder()
            additionalQueryParams = isochroneComputeParams.additionalQueryParams.toBuilder()
        }

        /**
         * The distances, in meters, to use for each isochrone contour. You can specify up to four
         * contours. Distances must be in increasing order. The maximum distance that can be
         * specified is 60000 meters (60 km).
         */
        fun contoursMeters(contoursMeters: Long) = apply { this.contoursMeters = contoursMeters }

        /**
         * The times, in minutes, to use for each isochrone contour. You can specify up to four
         * contours. Times must be in increasing order. The maximum time that can be specified is 40
         * minutes.
         */
        fun contoursMinutes(contoursMinutes: Long) = apply {
            this.contoursMinutes = contoursMinutes
        }

        /**
         * The coordinates of the location which acts as the starting point for which the isochrone
         * lines need to be determined.
         */
        fun coordinates(coordinates: String) = apply { this.coordinates = coordinates }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * The hex code of the color to fill isochrone contour. When requesting multiple contours,
         * it is recommended to provide color codes for each of the requested contours, separated by
         * a ",". If no colors are specified, the Isochrone API will assign a random color scheme to
         * the output.
         */
        fun contoursColors(contoursColors: String?) = apply { this.contoursColors = contoursColors }

        /** Alias for calling [Builder.contoursColors] with `contoursColors.orElse(null)`. */
        fun contoursColors(contoursColors: Optional<String>) =
            contoursColors(contoursColors.getOrNull())

        /**
         * A floating point value from 0.0 to 1.0 can be used to remove smaller contours. The
         * default is 1.0. A value of 1.0 will only return the largest contour for a given value. A
         * value of 0.5 drops any contours that are less than half the area of the largest contour
         * in the set of contours for that same value.
         */
        fun denoise(denoise: Double?) = apply { this.denoise = denoise }

        /**
         * Alias for [Builder.denoise].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun denoise(denoise: Double) = denoise(denoise as Double?)

        /** Alias for calling [Builder.denoise] with `denoise.orElse(null)`. */
        fun denoise(denoise: Optional<Double>) = denoise(denoise.getOrNull())

        /**
         * Use this parameter to set a departure time, expressed as UNIX epoch timestamp in seconds,
         * for calculating the isochrone contour. The response will consider the typical traffic
         * conditions at the given time and return a contour which can be reached under those
         * traffic conditions. Please note that if no input is provided for this parameter then the
         * traffic conditions at the time of making the request are considered.
         */
        fun departureTime(departureTime: Long?) = apply { this.departureTime = departureTime }

        /**
         * Alias for [Builder.departureTime].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun departureTime(departureTime: Long) = departureTime(departureTime as Long?)

        /** Alias for calling [Builder.departureTime] with `departureTime.orElse(null)`. */
        fun departureTime(departureTime: Optional<Long>) = departureTime(departureTime.getOrNull())

        /**
         * A positive floating point value, in meters, used as the tolerance for Douglas-Peucker
         * generalization. There is no upper bound. If no value is specified in the request, the
         * Isochrone API will choose the most optimized generalization to use for the request. Note
         * that the generalization of contours can lead to self-intersections, as well as
         * intersections of adjacent contours.
         */
        fun generalize(generalize: Double?) = apply { this.generalize = generalize }

        /**
         * Alias for [Builder.generalize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun generalize(generalize: Double) = generalize(generalize as Double?)

        /** Alias for calling [Builder.generalize] with `generalize.orElse(null)`. */
        fun generalize(generalize: Optional<Double>) = generalize(generalize.getOrNull())

        /**
         * Set which driving mode the service should use to determine the contour. For example, if
         * you use "car", the API will return an isochrone contour that a car can reach within the
         * specified time or after driving the specified distance. Using "truck" will return a
         * contour that a truck can reach after taking into account appropriate truck routing
         * restrictions.
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
         * Specify whether to return the contours as GeoJSON polygons (true) or linestrings (false,
         * default). When polygons=true, any contour that forms a ring is returned as a polygon.
         */
        fun polygons(polygons: Boolean?) = apply { this.polygons = polygons }

        /**
         * Alias for [Builder.polygons].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun polygons(polygons: Boolean) = polygons(polygons as Boolean?)

        /** Alias for calling [Builder.polygons] with `polygons.orElse(null)`. */
        fun polygons(polygons: Optional<Boolean>) = polygons(polygons.getOrNull())

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
         * Returns an immutable instance of [IsochroneComputeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contoursMeters()
         * .contoursMinutes()
         * .coordinates()
         * .key()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IsochroneComputeParams =
            IsochroneComputeParams(
                checkRequired("contoursMeters", contoursMeters),
                checkRequired("contoursMinutes", contoursMinutes),
                checkRequired("coordinates", coordinates),
                checkRequired("key", key),
                contoursColors,
                denoise,
                departureTime,
                generalize,
                mode,
                polygons,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("contours_meters", contoursMeters.toString())
                put("contours_minutes", contoursMinutes.toString())
                put("coordinates", coordinates)
                put("key", key)
                contoursColors?.let { put("contours_colors", it) }
                denoise?.let { put("denoise", it.toString()) }
                departureTime?.let { put("departure_time", it.toString()) }
                generalize?.let { put("generalize", it.toString()) }
                mode?.let { put("mode", it.toString()) }
                polygons?.let { put("polygons", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Set which driving mode the service should use to determine the contour. For example, if you
     * use "car", the API will return an isochrone contour that a car can reach within the specified
     * time or after driving the specified distance. Using "truck" will return a contour that a
     * truck can reach after taking into account appropriate truck routing restrictions.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IsochroneComputeParams && contoursMeters == other.contoursMeters && contoursMinutes == other.contoursMinutes && coordinates == other.coordinates && key == other.key && contoursColors == other.contoursColors && denoise == other.denoise && departureTime == other.departureTime && generalize == other.generalize && mode == other.mode && polygons == other.polygons && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(contoursMeters, contoursMinutes, coordinates, key, contoursColors, denoise, departureTime, generalize, mode, polygons, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "IsochroneComputeParams{contoursMeters=$contoursMeters, contoursMinutes=$contoursMinutes, coordinates=$coordinates, key=$key, contoursColors=$contoursColors, denoise=$denoise, departureTime=$departureTime, generalize=$generalize, mode=$mode, polygons=$polygons, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
