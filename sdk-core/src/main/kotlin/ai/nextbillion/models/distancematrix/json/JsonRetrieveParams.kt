// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.distancematrix.json

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
 * Nextbillion.ai Distance Matrix API computes distances and ETAs between a set of origins and
 * destinations — could be for one-to-many or many-to-many scenarios. The API call returns a matrix
 * of ETAs and distances for each origin and destination pair. For example, If the set is Origins
 * {A,B} and Destinations {C,D,E} we can get the following set of results with distance (meters) and
 * time (seconds) for each. The GET method can only handle up to 100 locations (1 location is either
 * 1 origin or 1 destination).
 */
class JsonRetrieveParams
private constructor(
    private val destinations: String,
    private val key: String,
    private val origins: String,
    private val approaches: Approaches?,
    private val avoid: Avoid?,
    private val bearings: String?,
    private val mode: Mode?,
    private val routeFailedPrompt: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * "destinations" are the ending coordinates of your route. Ensure that "destinations" are
     * routable land locations. Multiple "destinations" should be separated by a pipe symbol "|".
     */
    fun destinations(): String = destinations

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * "origins" are the starting point of your route. Ensure that "origins" are routable land
     * locations. Multiple "origins" should be separated by a pipe symbol "|".
     */
    fun origins(): String = origins

    /**
     * A semicolon-separated list indicating the side of the road from which the route will approach
     * "destinations". When set to "unrestricted" a route can arrive at a destination from either
     * side of the road. When set to "curb" the route will arrive at a destination on the driving
     * side of the region. Please note the number of values provided must be equal to the number of
     * "destinations". However, you can skip a coordinate and show its position in the list with the
     * ";" separator. The values provided for the "approaches" parameter are effective for the
     * "destinations" value at the same index. Example: "curb;;curb" will apply curbside restriction
     * on the "destinations" points provided at the first and third index.
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
     * Limits the search to segments with given bearing in degrees towards true north in clockwise
     * direction. Each "bearing" should be in the format of "degree,range", where the "degree"
     * should be a value between \[0, 360\] and "range" should be a value between \[0, 180\]. Please
     * note that the number of "bearings" should be equal to the sum of the number of points in
     * "origins" and "destinations". If a route can approach a destination from any direction, the
     * bearing for that point can be specified as "0,180".
     */
    fun bearings(): Optional<String> = Optional.ofNullable(bearings)

    /**
     * Set which driving mode the service should use to determine the "distance" and "duration"
     * values. For example, if you use "car", the API will return the duration and distance of a
     * route that a car can take. Using "truck" will return the same for a route a truck can use,
     * taking into account appropriate truck routing restrictions.
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
     * Please use the Distance Matrix Flexible version if you want to use custom truck dimensions.
     *
     * Note: Only the "car" profile is enabled by default. Please note that customized profiles
     * (including "truck") might not be available for all regions. Please contact your
     * [NextBillion.ai](http://NextBillion.ai) account manager, sales representative or reach out at
     * [support@nextbillion.ai](mailto:support@nextbillion.ai) in case you need additional profiles.
     */
    fun mode(): Optional<Mode> = Optional.ofNullable(mode)

    /**
     * A prompt to modify the response in case no feasible route is available for a given pair of
     * origin and destination. When set to "true", a value of "-1" is returned for those pairs in
     * which:
     *
     * \- Either origin or the destination can not be snapped to a nearest road. Please note that if
     * all the origins and destinations in a request can't be snapped to their nearest roads, a 4xx
     * error is returned instead, as the entire request failed.
     *
     * \- Both origin and destination can be snapped to the nearest road, but the service can't find
     * a valid route between them. However, a value of "0" is returned if both the origin and
     * destination are snapped to the same location.
     *
     * "false" is the default value. In this case, a "0" value is returned for all the above cases.
     * A 4xx error is returned, in this case as well, when all origins and destinations in the
     * request can't be snapped to their nearest road.
     */
    fun routeFailedPrompt(): Optional<Boolean> = Optional.ofNullable(routeFailedPrompt)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JsonRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .destinations()
         * .key()
         * .origins()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JsonRetrieveParams]. */
    class Builder internal constructor() {

        private var destinations: String? = null
        private var key: String? = null
        private var origins: String? = null
        private var approaches: Approaches? = null
        private var avoid: Avoid? = null
        private var bearings: String? = null
        private var mode: Mode? = null
        private var routeFailedPrompt: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(jsonRetrieveParams: JsonRetrieveParams) = apply {
            destinations = jsonRetrieveParams.destinations
            key = jsonRetrieveParams.key
            origins = jsonRetrieveParams.origins
            approaches = jsonRetrieveParams.approaches
            avoid = jsonRetrieveParams.avoid
            bearings = jsonRetrieveParams.bearings
            mode = jsonRetrieveParams.mode
            routeFailedPrompt = jsonRetrieveParams.routeFailedPrompt
            additionalHeaders = jsonRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = jsonRetrieveParams.additionalQueryParams.toBuilder()
        }

        /**
         * "destinations" are the ending coordinates of your route. Ensure that "destinations" are
         * routable land locations. Multiple "destinations" should be separated by a pipe symbol
         * "|".
         */
        fun destinations(destinations: String) = apply { this.destinations = destinations }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * "origins" are the starting point of your route. Ensure that "origins" are routable land
         * locations. Multiple "origins" should be separated by a pipe symbol "|".
         */
        fun origins(origins: String) = apply { this.origins = origins }

        /**
         * A semicolon-separated list indicating the side of the road from which the route will
         * approach "destinations". When set to "unrestricted" a route can arrive at a destination
         * from either side of the road. When set to "curb" the route will arrive at a destination
         * on the driving side of the region. Please note the number of values provided must be
         * equal to the number of "destinations". However, you can skip a coordinate and show its
         * position in the list with the ";" separator. The values provided for the "approaches"
         * parameter are effective for the "destinations" value at the same index. Example:
         * "curb;;curb" will apply curbside restriction on the "destinations" points provided at the
         * first and third index.
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
         * Limits the search to segments with given bearing in degrees towards true north in
         * clockwise direction. Each "bearing" should be in the format of "degree,range", where the
         * "degree" should be a value between \[0, 360\] and "range" should be a value between \[0,
         * 180\]. Please note that the number of "bearings" should be equal to the sum of the number
         * of points in "origins" and "destinations". If a route can approach a destination from any
         * direction, the bearing for that point can be specified as "0,180".
         */
        fun bearings(bearings: String?) = apply { this.bearings = bearings }

        /** Alias for calling [Builder.bearings] with `bearings.orElse(null)`. */
        fun bearings(bearings: Optional<String>) = bearings(bearings.getOrNull())

        /**
         * Set which driving mode the service should use to determine the "distance" and "duration"
         * values. For example, if you use "car", the API will return the duration and distance of a
         * route that a car can take. Using "truck" will return the same for a route a truck can
         * use, taking into account appropriate truck routing restrictions.
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
         * Please use the Distance Matrix Flexible version if you want to use custom truck
         * dimensions.
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
         * A prompt to modify the response in case no feasible route is available for a given pair
         * of origin and destination. When set to "true", a value of "-1" is returned for those
         * pairs in which:
         *
         * \- Either origin or the destination can not be snapped to a nearest road. Please note
         * that if all the origins and destinations in a request can't be snapped to their nearest
         * roads, a 4xx error is returned instead, as the entire request failed.
         *
         * \- Both origin and destination can be snapped to the nearest road, but the service can't
         * find a valid route between them. However, a value of "0" is returned if both the origin
         * and destination are snapped to the same location.
         *
         * "false" is the default value. In this case, a "0" value is returned for all the above
         * cases. A 4xx error is returned, in this case as well, when all origins and destinations
         * in the request can't be snapped to their nearest road.
         */
        fun routeFailedPrompt(routeFailedPrompt: Boolean?) = apply {
            this.routeFailedPrompt = routeFailedPrompt
        }

        /**
         * Alias for [Builder.routeFailedPrompt].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun routeFailedPrompt(routeFailedPrompt: Boolean) =
            routeFailedPrompt(routeFailedPrompt as Boolean?)

        /** Alias for calling [Builder.routeFailedPrompt] with `routeFailedPrompt.orElse(null)`. */
        fun routeFailedPrompt(routeFailedPrompt: Optional<Boolean>) =
            routeFailedPrompt(routeFailedPrompt.getOrNull())

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
         * Returns an immutable instance of [JsonRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .destinations()
         * .key()
         * .origins()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JsonRetrieveParams =
            JsonRetrieveParams(
                checkRequired("destinations", destinations),
                checkRequired("key", key),
                checkRequired("origins", origins),
                approaches,
                avoid,
                bearings,
                mode,
                routeFailedPrompt,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("destinations", destinations)
                put("key", key)
                put("origins", origins)
                approaches?.let { put("approaches", it.toString()) }
                avoid?.let { put("avoid", it.toString()) }
                bearings?.let { put("bearings", it) }
                mode?.let { put("mode", it.toString()) }
                routeFailedPrompt?.let { put("route_failed_prompt", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * A semicolon-separated list indicating the side of the road from which the route will approach
     * "destinations". When set to "unrestricted" a route can arrive at a destination from either
     * side of the road. When set to "curb" the route will arrive at a destination on the driving
     * side of the region. Please note the number of values provided must be equal to the number of
     * "destinations". However, you can skip a coordinate and show its position in the list with the
     * ";" separator. The values provided for the "approaches" parameter are effective for the
     * "destinations" value at the same index. Example: "curb;;curb" will apply curbside restriction
     * on the "destinations" points provided at the first and third index.
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
     * Set which driving mode the service should use to determine the "distance" and "duration"
     * values. For example, if you use "car", the API will return the duration and distance of a
     * route that a car can take. Using "truck" will return the same for a route a truck can use,
     * taking into account appropriate truck routing restrictions.
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
     * Please use the Distance Matrix Flexible version if you want to use custom truck dimensions.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JsonRetrieveParams &&
            destinations == other.destinations &&
            key == other.key &&
            origins == other.origins &&
            approaches == other.approaches &&
            avoid == other.avoid &&
            bearings == other.bearings &&
            mode == other.mode &&
            routeFailedPrompt == other.routeFailedPrompt &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            destinations,
            key,
            origins,
            approaches,
            avoid,
            bearings,
            mode,
            routeFailedPrompt,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "JsonRetrieveParams{destinations=$destinations, key=$key, origins=$origins, approaches=$approaches, avoid=$avoid, bearings=$bearings, mode=$mode, routeFailedPrompt=$routeFailedPrompt, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
