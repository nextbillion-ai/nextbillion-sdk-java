// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.navigation

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
 * Nextbillion.ai’s Navigation API is a service that computes a route between 2 places, and also
 * returns detailed turn by turn instructions for the route.
 *
 * The Navigation API can be used as an input into your Navigation app. Alternatively, you can
 * directly use Nextbillion.ai’s Navigation SDK for a complete turn by turn navigation experience.
 */
class NavigationRetrieveRouteParams
private constructor(
    private val key: String,
    private val altcount: Long?,
    private val alternatives: Boolean?,
    private val approaches: Approaches?,
    private val avoid: Avoid?,
    private val bearings: String?,
    private val destination: String?,
    private val geometry: Geometry?,
    private val lang: String?,
    private val mode: Mode?,
    private val origin: String?,
    private val originalShape: String?,
    private val originalShapeType: OriginalShapeType?,
    private val overview: Overview?,
    private val waypoints: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * Sets the number of alternative routes to return. It is effective only when "alternatives" is
     * "true". Please note that adding alternative route count does not guarantee matching number of
     * routes to be returned if potential alternative routes do not exist.
     */
    fun altcount(): Optional<Long> = Optional.ofNullable(altcount)

    /**
     * When "true" the API will return alternate routes. The "alternatives" is effective only when
     * there are no "waypoints" included in the request. You can set the number of alternate routes
     * to be returned in the "altcount" property.
     */
    fun alternatives(): Optional<Boolean> = Optional.ofNullable(alternatives)

    /**
     * A semicolon-separated list indicating the side of the road from which to approach "waypoints"
     * in a requested route. When set to "unrestricted" a route can arrive at the waypoint from
     * either side of the road and when set to "curb" the route will arrive at the waypoint on the
     * driving side of the region. Please note the number of values provided must be one more than
     * the number of "waypoints". The last value of "approaches" will determine the approach for the
     * "destination". However, you can skip a coordinate and show its position in the list with the
     * ";" separator.
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
     * Limits the search to road segments with given bearing, in degrees, towards true north in
     * clockwise direction. Each "bearings" should be in the format of "degree,range", where the
     * "degree" should be a value between \[0, 360\] and "range" should be a value between \[0,
     * 180\]. Please note that the number of "bearings" should be two more than the number of
     * "waypoints". This is to account for the bearing of "origin" and "destination". If a route can
     * approach a "waypoint" or the "destination" from any direction, the bearing for that point can
     * be specified as "0,180".
     */
    fun bearings(): Optional<String> = Optional.ofNullable(bearings)

    /**
     * "destination" is the ending point of your route. Ensure that the "destination" is a routable
     * land location. Please note that this parameter is mandatory if the "original_shape" parameter
     * is not given.
     */
    fun destination(): Optional<String> = Optional.ofNullable(destination)

    /**
     * Sets the output format of the route geometry in the response. On providing “polyline“ and
     * “polyline6“ as input, respective encoded geometry is returned. However, when “geojson“ is
     * provided as the input value, “polyline“ encoded geometry is returned in the response along
     * with the geojson details of the route.
     */
    fun geometry(): Optional<Geometry> = Optional.ofNullable(geometry)

    /**
     * Select the language to be used for result rendering from a list of
     * [BCP 47](https://en.wikipedia.org/wiki/IETF_language_tag) compliant language codes.
     */
    fun lang(): Optional<String> = Optional.ofNullable(lang)

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
     * Please use the Navigation Flexible version if you want to use custom truck dimensions.
     *
     * Note: Only the "car" profile is enabled by default. Please note that customized profiles
     * (including "truck") might not be available for all regions. Please contact your
     * [NextBillion.ai](http://NextBillion.ai) account manager, sales representative or reach out at
     * [support@nextbillion.ai](mailto:support@nextbillion.ai) in case you need additional profiles.
     */
    fun mode(): Optional<Mode> = Optional.ofNullable(mode)

    /**
     * "origin" is the starting point of your route. Ensure that "origin" is a routable land
     * location. Please note that this parameter is mandatory if the geometry parameter is not
     * given.
     */
    fun origin(): Optional<String> = Optional.ofNullable(origin)

    /**
     * Takes a route geometry as input and returns the navigation information for that route.
     * Accepts "polyline" and "polyline6" encoded geometry as input. "original_shape_type" becomes
     * mandatory when "original_shape" is used. If this parameter is provided, the only other
     * parameters which will be considered are "original_shape_type", "lang", "geometry". The rest
     * of the parameters in the input request will be ignored. Please note overview verbosity will
     * always be "full" when using this parameter.
     */
    fun originalShape(): Optional<String> = Optional.ofNullable(originalShape)

    /**
     * Specify the encoding format of route geometry provided in the request using "original_shape"
     * parameter. Please note that an error is returned when this parameter is not specified while
     * an input is added to "original_shape" parameter.
     */
    fun originalShapeType(): Optional<OriginalShapeType> = Optional.ofNullable(originalShapeType)

    /**
     * Specify the verbosity of route geometry. When set to "full", the most detailed geometry
     * available is returned. When set to "simplified", a simplified version of the full geometry is
     * returned. No overview geometry is returned when set to "false".
     */
    fun overview(): Optional<Overview> = Optional.ofNullable(overview)

    /**
     * "waypoints" are coordinates along the route between the "origin" and "destination". It is a
     * pipe-separated list of coordinate pairs. Please note that the route returned will arrive at
     * the "waypoints" in the sequence they are provided in the input request. Please note that the
     * maximum number of waypoints that can be provided in a single request is 50 when using GET
     * method and 200 with POST method.
     */
    fun waypoints(): Optional<String> = Optional.ofNullable(waypoints)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NavigationRetrieveRouteParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NavigationRetrieveRouteParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var altcount: Long? = null
        private var alternatives: Boolean? = null
        private var approaches: Approaches? = null
        private var avoid: Avoid? = null
        private var bearings: String? = null
        private var destination: String? = null
        private var geometry: Geometry? = null
        private var lang: String? = null
        private var mode: Mode? = null
        private var origin: String? = null
        private var originalShape: String? = null
        private var originalShapeType: OriginalShapeType? = null
        private var overview: Overview? = null
        private var waypoints: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(navigationRetrieveRouteParams: NavigationRetrieveRouteParams) = apply {
            key = navigationRetrieveRouteParams.key
            altcount = navigationRetrieveRouteParams.altcount
            alternatives = navigationRetrieveRouteParams.alternatives
            approaches = navigationRetrieveRouteParams.approaches
            avoid = navigationRetrieveRouteParams.avoid
            bearings = navigationRetrieveRouteParams.bearings
            destination = navigationRetrieveRouteParams.destination
            geometry = navigationRetrieveRouteParams.geometry
            lang = navigationRetrieveRouteParams.lang
            mode = navigationRetrieveRouteParams.mode
            origin = navigationRetrieveRouteParams.origin
            originalShape = navigationRetrieveRouteParams.originalShape
            originalShapeType = navigationRetrieveRouteParams.originalShapeType
            overview = navigationRetrieveRouteParams.overview
            waypoints = navigationRetrieveRouteParams.waypoints
            additionalHeaders = navigationRetrieveRouteParams.additionalHeaders.toBuilder()
            additionalQueryParams = navigationRetrieveRouteParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Sets the number of alternative routes to return. It is effective only when "alternatives"
         * is "true". Please note that adding alternative route count does not guarantee matching
         * number of routes to be returned if potential alternative routes do not exist.
         */
        fun altcount(altcount: Long?) = apply { this.altcount = altcount }

        /**
         * Alias for [Builder.altcount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun altcount(altcount: Long) = altcount(altcount as Long?)

        /** Alias for calling [Builder.altcount] with `altcount.orElse(null)`. */
        fun altcount(altcount: Optional<Long>) = altcount(altcount.getOrNull())

        /**
         * When "true" the API will return alternate routes. The "alternatives" is effective only
         * when there are no "waypoints" included in the request. You can set the number of
         * alternate routes to be returned in the "altcount" property.
         */
        fun alternatives(alternatives: Boolean?) = apply { this.alternatives = alternatives }

        /**
         * Alias for [Builder.alternatives].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun alternatives(alternatives: Boolean) = alternatives(alternatives as Boolean?)

        /** Alias for calling [Builder.alternatives] with `alternatives.orElse(null)`. */
        fun alternatives(alternatives: Optional<Boolean>) = alternatives(alternatives.getOrNull())

        /**
         * A semicolon-separated list indicating the side of the road from which to approach
         * "waypoints" in a requested route. When set to "unrestricted" a route can arrive at the
         * waypoint from either side of the road and when set to "curb" the route will arrive at the
         * waypoint on the driving side of the region. Please note the number of values provided
         * must be one more than the number of "waypoints". The last value of "approaches" will
         * determine the approach for the "destination". However, you can skip a coordinate and show
         * its position in the list with the ";" separator.
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
         * Limits the search to road segments with given bearing, in degrees, towards true north in
         * clockwise direction. Each "bearings" should be in the format of "degree,range", where the
         * "degree" should be a value between \[0, 360\] and "range" should be a value between \[0,
         * 180\]. Please note that the number of "bearings" should be two more than the number of
         * "waypoints". This is to account for the bearing of "origin" and "destination". If a route
         * can approach a "waypoint" or the "destination" from any direction, the bearing for that
         * point can be specified as "0,180".
         */
        fun bearings(bearings: String?) = apply { this.bearings = bearings }

        /** Alias for calling [Builder.bearings] with `bearings.orElse(null)`. */
        fun bearings(bearings: Optional<String>) = bearings(bearings.getOrNull())

        /**
         * "destination" is the ending point of your route. Ensure that the "destination" is a
         * routable land location. Please note that this parameter is mandatory if the
         * "original_shape" parameter is not given.
         */
        fun destination(destination: String?) = apply { this.destination = destination }

        /** Alias for calling [Builder.destination] with `destination.orElse(null)`. */
        fun destination(destination: Optional<String>) = destination(destination.getOrNull())

        /**
         * Sets the output format of the route geometry in the response. On providing “polyline“ and
         * “polyline6“ as input, respective encoded geometry is returned. However, when “geojson“ is
         * provided as the input value, “polyline“ encoded geometry is returned in the response
         * along with the geojson details of the route.
         */
        fun geometry(geometry: Geometry?) = apply { this.geometry = geometry }

        /** Alias for calling [Builder.geometry] with `geometry.orElse(null)`. */
        fun geometry(geometry: Optional<Geometry>) = geometry(geometry.getOrNull())

        /**
         * Select the language to be used for result rendering from a list of
         * [BCP 47](https://en.wikipedia.org/wiki/IETF_language_tag) compliant language codes.
         */
        fun lang(lang: String?) = apply { this.lang = lang }

        /** Alias for calling [Builder.lang] with `lang.orElse(null)`. */
        fun lang(lang: Optional<String>) = lang(lang.getOrNull())

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
         * Please use the Navigation Flexible version if you want to use custom truck dimensions.
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
         * "origin" is the starting point of your route. Ensure that "origin" is a routable land
         * location. Please note that this parameter is mandatory if the geometry parameter is not
         * given.
         */
        fun origin(origin: String?) = apply { this.origin = origin }

        /** Alias for calling [Builder.origin] with `origin.orElse(null)`. */
        fun origin(origin: Optional<String>) = origin(origin.getOrNull())

        /**
         * Takes a route geometry as input and returns the navigation information for that route.
         * Accepts "polyline" and "polyline6" encoded geometry as input. "original_shape_type"
         * becomes mandatory when "original_shape" is used. If this parameter is provided, the only
         * other parameters which will be considered are "original_shape_type", "lang", "geometry".
         * The rest of the parameters in the input request will be ignored. Please note overview
         * verbosity will always be "full" when using this parameter.
         */
        fun originalShape(originalShape: String?) = apply { this.originalShape = originalShape }

        /** Alias for calling [Builder.originalShape] with `originalShape.orElse(null)`. */
        fun originalShape(originalShape: Optional<String>) =
            originalShape(originalShape.getOrNull())

        /**
         * Specify the encoding format of route geometry provided in the request using
         * "original_shape" parameter. Please note that an error is returned when this parameter is
         * not specified while an input is added to "original_shape" parameter.
         */
        fun originalShapeType(originalShapeType: OriginalShapeType?) = apply {
            this.originalShapeType = originalShapeType
        }

        /** Alias for calling [Builder.originalShapeType] with `originalShapeType.orElse(null)`. */
        fun originalShapeType(originalShapeType: Optional<OriginalShapeType>) =
            originalShapeType(originalShapeType.getOrNull())

        /**
         * Specify the verbosity of route geometry. When set to "full", the most detailed geometry
         * available is returned. When set to "simplified", a simplified version of the full
         * geometry is returned. No overview geometry is returned when set to "false".
         */
        fun overview(overview: Overview?) = apply { this.overview = overview }

        /** Alias for calling [Builder.overview] with `overview.orElse(null)`. */
        fun overview(overview: Optional<Overview>) = overview(overview.getOrNull())

        /**
         * "waypoints" are coordinates along the route between the "origin" and "destination". It is
         * a pipe-separated list of coordinate pairs. Please note that the route returned will
         * arrive at the "waypoints" in the sequence they are provided in the input request. Please
         * note that the maximum number of waypoints that can be provided in a single request is 50
         * when using GET method and 200 with POST method.
         */
        fun waypoints(waypoints: String?) = apply { this.waypoints = waypoints }

        /** Alias for calling [Builder.waypoints] with `waypoints.orElse(null)`. */
        fun waypoints(waypoints: Optional<String>) = waypoints(waypoints.getOrNull())

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
         * Returns an immutable instance of [NavigationRetrieveRouteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NavigationRetrieveRouteParams =
            NavigationRetrieveRouteParams(
                checkRequired("key", key),
                altcount,
                alternatives,
                approaches,
                avoid,
                bearings,
                destination,
                geometry,
                lang,
                mode,
                origin,
                originalShape,
                originalShapeType,
                overview,
                waypoints,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                altcount?.let { put("altcount", it.toString()) }
                alternatives?.let { put("alternatives", it.toString()) }
                approaches?.let { put("approaches", it.toString()) }
                avoid?.let { put("avoid", it.toString()) }
                bearings?.let { put("bearings", it) }
                destination?.let { put("destination", it) }
                geometry?.let { put("geometry", it.toString()) }
                lang?.let { put("lang", it) }
                mode?.let { put("mode", it.toString()) }
                origin?.let { put("origin", it) }
                originalShape?.let { put("original_shape", it) }
                originalShapeType?.let { put("original_shape_type", it.toString()) }
                overview?.let { put("overview", it.toString()) }
                waypoints?.let { put("waypoints", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * A semicolon-separated list indicating the side of the road from which to approach "waypoints"
     * in a requested route. When set to "unrestricted" a route can arrive at the waypoint from
     * either side of the road and when set to "curb" the route will arrive at the waypoint on the
     * driving side of the region. Please note the number of values provided must be one more than
     * the number of "waypoints". The last value of "approaches" will determine the approach for the
     * "destination". However, you can skip a coordinate and show its position in the list with the
     * ";" separator.
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

            return other is Approaches && value == other.value
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

            return other is Avoid && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Sets the output format of the route geometry in the response. On providing “polyline“ and
     * “polyline6“ as input, respective encoded geometry is returned. However, when “geojson“ is
     * provided as the input value, “polyline“ encoded geometry is returned in the response along
     * with the geojson details of the route.
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

            @JvmField val POLYLINE = of("polyline")

            @JvmField val POLYLINE6 = of("polyline6")

            @JvmField val GEOJSON = of("geojson")

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

            return other is Geometry && value == other.value
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
     * Please use the Navigation Flexible version if you want to use custom truck dimensions.
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

            return other is Mode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specify the encoding format of route geometry provided in the request using "original_shape"
     * parameter. Please note that an error is returned when this parameter is not specified while
     * an input is added to "original_shape" parameter.
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

            @JvmField val POLYLINE = of("polyline")

            @JvmField val POLYLINE6 = of("polyline6")

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

            return other is OriginalShapeType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specify the verbosity of route geometry. When set to "full", the most detailed geometry
     * available is returned. When set to "simplified", a simplified version of the full geometry is
     * returned. No overview geometry is returned when set to "false".
     */
    class Overview @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FULL = of("full")

            @JvmField val SIMPLIFIED = of("simplified")

            @JvmField val FALSE = of("false")

            @JvmStatic fun of(value: String) = Overview(JsonField.of(value))
        }

        /** An enum containing [Overview]'s known values. */
        enum class Known {
            FULL,
            SIMPLIFIED,
            FALSE,
        }

        /**
         * An enum containing [Overview]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Overview] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FULL,
            SIMPLIFIED,
            FALSE,
            /** An enum member indicating that [Overview] was instantiated with an unknown value. */
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
                FULL -> Value.FULL
                SIMPLIFIED -> Value.SIMPLIFIED
                FALSE -> Value.FALSE
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
                FULL -> Known.FULL
                SIMPLIFIED -> Known.SIMPLIFIED
                FALSE -> Known.FALSE
                else -> throw NextbillionSdkInvalidDataException("Unknown Overview: $value")
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

        fun validate(): Overview = apply {
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

            return other is Overview && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NavigationRetrieveRouteParams &&
            key == other.key &&
            altcount == other.altcount &&
            alternatives == other.alternatives &&
            approaches == other.approaches &&
            avoid == other.avoid &&
            bearings == other.bearings &&
            destination == other.destination &&
            geometry == other.geometry &&
            lang == other.lang &&
            mode == other.mode &&
            origin == other.origin &&
            originalShape == other.originalShape &&
            originalShapeType == other.originalShapeType &&
            overview == other.overview &&
            waypoints == other.waypoints &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            key,
            altcount,
            alternatives,
            approaches,
            avoid,
            bearings,
            destination,
            geometry,
            lang,
            mode,
            origin,
            originalShape,
            originalShapeType,
            overview,
            waypoints,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "NavigationRetrieveRouteParams{key=$key, altcount=$altcount, alternatives=$alternatives, approaches=$approaches, avoid=$avoid, bearings=$bearings, destination=$destination, geometry=$geometry, lang=$lang, mode=$mode, origin=$origin, originalShape=$originalShape, originalShapeType=$originalShapeType, overview=$overview, waypoints=$waypoints, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
