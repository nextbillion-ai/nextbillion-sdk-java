// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.mdm

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.nextbillion.api.core.Enum
import io.nextbillion.api.core.ExcludeMissing
import io.nextbillion.api.core.JsonField
import io.nextbillion.api.core.JsonMissing
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.Params
import io.nextbillion.api.core.checkRequired
import io.nextbillion.api.core.http.Headers
import io.nextbillion.api.core.http.QueryParams
import io.nextbillion.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a massive distance matrix task */
class MdmCreateDistanceMatrixParams
private constructor(
    private val key: String,
    private val option: Option,
    private val spliter: Spliter?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * Use this option to switch to truck-specific routing or time based routing or if you want to
     * choose between the fastest and shortest route types.
     */
    fun option(): Option = option

    /**
     * Specify a spliter to split the matrix by. It accepts 2 values:
     * - `od_number_spliter`:
     * - `straight_distance_spliter`:
     *
     * Please note it is an internal, debug field only.
     *
     * _debug field. choose specific spliter to split matrix._
     */
    fun spliter(): Optional<Spliter> = Optional.ofNullable(spliter)

    /**
     * `origins` are the starting point of your route. Ensure that origins are routable land
     * locations. Multiple origins should be separated by a pipe symbol (|).
     *
     * **Format:** latitude_1,longitude_1|latitude_2,longitude_2|…
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun origins(): String = body.origins()

    /**
     * Provide the country that the coordinates belong to.
     *
     * _the input coordinates area._
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun area(): Optional<Area> = body.area()

    /**
     * Setting this will ensure the route avoids the object(s) specified as input. Multiple values
     * should be separated by a pipe (|). If `none` is provided along with other values, an error is
     * returned as a valid route is not feasible.
     * - **Note:**
     *     - This parameter is effective only when `route_type=fastest`.
     *     - When this parameter is not provided in the input, ferries are set to be avoided by
     *       default. When `avoid` input is provided, only the mentioned objects are avoided.
     *     - When using `avoid=bbox` users also need to specify the boundaries of the bounding box
     *       to be avoid. Multiple bounding boxes can be specified simultaneously. Please note that
     *       bounding box is a hard filter and if it blocks all possible routes between given
     *       locations, a 4xx error is returned.
     *
     *     - **Format:** bbox: min_latitude,min_longtitude,max_latitude,max_longitude.
     *     - **Example:** avoid=bbox: 34.0635,-118.2547, 34.0679,-118.2478 | bbox: 34.0521,-118.2342, 34.0478,-118.2437
     *     - When using `avoid=sharp_turn`, default range of permissible turn angles is \[120,240\].
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun avoid(): Optional<Avoid> = body.avoid()

    /**
     * Specify if crossing an international border is expected for operations near border areas.
     * When set to false, the API will prohibit routes going back & forth between countries.
     * Consequently, routes within the same country will be preferred if they are feasible for the
     * given set of `destination` or `waypoints` . When set to true, the routes will be allowed to
     * go back & forth between countries as needed.
     *
     * This feature is available in North America region only. Please get in touch with
     * [support@nextbillion.ai](mailto:support@nextbillion.ai) to enquire/enable other areas.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun crossBorder(): Optional<Boolean> = body.crossBorder()

    /**
     * This is a number in UNIX epoch timestamp in seconds format that can be used to provide the
     * departure time. The response will return the `distance` and `duration` of the route based on
     * typical traffic for at the given start time.If no input is provided for this parameter then
     * the traffic conditions at the time of making the request are considered.
     *
     * Please note that when `route_type` is set to `shortest` then the `departure_time` will be
     * ineffective as the service will return the result for the shortest path possible irrespective
     * of the traffic conditions.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun departureTime(): Optional<Long> = body.departureTime()

    /**
     * `destinations` are the ending coordinates of your route. Ensure that destinations are
     * routable land locations. Multiple destinations should be separated by a pipe symbol (|).
     *
     * In case `destinations` are not provided or if it is left empty, then the input value of
     * `origins` will be copied to `destinations` to create the OD matrix pairs.
     *
     * **Format:** latitude_1,longitude_1|latitude_2,longitude_2|…
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun destinations(): Optional<String> = body.destinations()

    /**
     * Specify the side of the road from which to approach `destinations` points. Please note that
     * the given approach will be applied to all the `destinations`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun destinationsApproach(): Optional<DestinationsApproach> = body.destinationsApproach()

    /**
     * Specify the type of hazardous material being carried and the service will avoid roads which
     * are not suitable for the type of goods specified. Multiple values can be separated using a
     * pipe operator `|` .
     *
     * Please note that this parameter is effective only when `mode=truck`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun hazmatType(): Optional<HazmatType> = body.hazmatType()

    /**
     * Set which driving mode the service should use to determine a route.
     *
     * For example, if you use `car`, the API will return a route that a car can take. Using `truck`
     * will return a route a truck can use, taking into account appropriate truck routing
     * restrictions.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun mode(): Optional<Mode> = body.mode()

    /**
     * Specify the side of the road from which to approach `origins` points. Please note that the
     * given approach will be applied to all the points provided as `origins`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun originsApproach(): Optional<OriginsApproach> = body.originsApproach()

    /**
     * Set the route type that needs to be returned. Please note that `route_type` is effective only
     * when `option=flexible`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun routeType(): Optional<RouteType> = body.routeType()

    /**
     * Specify the total load per axle (including the weight of trailers and shipped goods) of the
     * truck, in tonnes. When used, the service will return routes which are legally allowed to
     * carry the load specified per axle.
     *
     * Please note this parameter is effective only when `mode=truck`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun truckAxleLoad(): Optional<Double> = body.truckAxleLoad()

    /**
     * This defines the dimensions of a truck in centimeters (cm) in the format of
     * "height,width,length". This parameter is effective only when `mode=truck` and
     * `option=flexible`. Maximum dimensions are as follows:
     *
     * Height = 1000 cm Width = 5000 cm Length = 5000 cm
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun truckSize(): Optional<String> = body.truckSize()

    /**
     * This parameter defines the weight of the truck including trailers and shipped goods in
     * kilograms (kg). This parameter is effective only when `mode=truck` and `option=flexible`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun truckWeight(): Optional<Long> = body.truckWeight()

    /**
     * Returns the raw JSON value of [origins].
     *
     * Unlike [origins], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _origins(): JsonField<String> = body._origins()

    /**
     * Returns the raw JSON value of [area].
     *
     * Unlike [area], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _area(): JsonField<Area> = body._area()

    /**
     * Returns the raw JSON value of [avoid].
     *
     * Unlike [avoid], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _avoid(): JsonField<Avoid> = body._avoid()

    /**
     * Returns the raw JSON value of [crossBorder].
     *
     * Unlike [crossBorder], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _crossBorder(): JsonField<Boolean> = body._crossBorder()

    /**
     * Returns the raw JSON value of [departureTime].
     *
     * Unlike [departureTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _departureTime(): JsonField<Long> = body._departureTime()

    /**
     * Returns the raw JSON value of [destinations].
     *
     * Unlike [destinations], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _destinations(): JsonField<String> = body._destinations()

    /**
     * Returns the raw JSON value of [destinationsApproach].
     *
     * Unlike [destinationsApproach], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _destinationsApproach(): JsonField<DestinationsApproach> = body._destinationsApproach()

    /**
     * Returns the raw JSON value of [hazmatType].
     *
     * Unlike [hazmatType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _hazmatType(): JsonField<HazmatType> = body._hazmatType()

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mode(): JsonField<Mode> = body._mode()

    /**
     * Returns the raw JSON value of [originsApproach].
     *
     * Unlike [originsApproach], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _originsApproach(): JsonField<OriginsApproach> = body._originsApproach()

    /**
     * Returns the raw JSON value of [routeType].
     *
     * Unlike [routeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _routeType(): JsonField<RouteType> = body._routeType()

    /**
     * Returns the raw JSON value of [truckAxleLoad].
     *
     * Unlike [truckAxleLoad], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _truckAxleLoad(): JsonField<Double> = body._truckAxleLoad()

    /**
     * Returns the raw JSON value of [truckSize].
     *
     * Unlike [truckSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _truckSize(): JsonField<String> = body._truckSize()

    /**
     * Returns the raw JSON value of [truckWeight].
     *
     * Unlike [truckWeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _truckWeight(): JsonField<Long> = body._truckWeight()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MdmCreateDistanceMatrixParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .option()
         * .origins()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MdmCreateDistanceMatrixParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var option: Option? = null
        private var spliter: Spliter? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(mdmCreateDistanceMatrixParams: MdmCreateDistanceMatrixParams) = apply {
            key = mdmCreateDistanceMatrixParams.key
            option = mdmCreateDistanceMatrixParams.option
            spliter = mdmCreateDistanceMatrixParams.spliter
            body = mdmCreateDistanceMatrixParams.body.toBuilder()
            additionalHeaders = mdmCreateDistanceMatrixParams.additionalHeaders.toBuilder()
            additionalQueryParams = mdmCreateDistanceMatrixParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Use this option to switch to truck-specific routing or time based routing or if you want
         * to choose between the fastest and shortest route types.
         */
        fun option(option: Option) = apply { this.option = option }

        /**
         * Specify a spliter to split the matrix by. It accepts 2 values:
         * - `od_number_spliter`:
         * - `straight_distance_spliter`:
         *
         * Please note it is an internal, debug field only.
         *
         * _debug field. choose specific spliter to split matrix._
         */
        fun spliter(spliter: Spliter?) = apply { this.spliter = spliter }

        /** Alias for calling [Builder.spliter] with `spliter.orElse(null)`. */
        fun spliter(spliter: Optional<Spliter>) = spliter(spliter.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [origins]
         * - [area]
         * - [avoid]
         * - [crossBorder]
         * - [departureTime]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * `origins` are the starting point of your route. Ensure that origins are routable land
         * locations. Multiple origins should be separated by a pipe symbol (|).
         *
         * **Format:** latitude_1,longitude_1|latitude_2,longitude_2|…
         */
        fun origins(origins: String) = apply { body.origins(origins) }

        /**
         * Sets [Builder.origins] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origins] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun origins(origins: JsonField<String>) = apply { body.origins(origins) }

        /**
         * Provide the country that the coordinates belong to.
         *
         * _the input coordinates area._
         */
        fun area(area: Area) = apply { body.area(area) }

        /**
         * Sets [Builder.area] to an arbitrary JSON value.
         *
         * You should usually call [Builder.area] with a well-typed [Area] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun area(area: JsonField<Area>) = apply { body.area(area) }

        /**
         * Setting this will ensure the route avoids the object(s) specified as input. Multiple
         * values should be separated by a pipe (|). If `none` is provided along with other values,
         * an error is returned as a valid route is not feasible.
         * - **Note:**
         *     - This parameter is effective only when `route_type=fastest`.
         *     - When this parameter is not provided in the input, ferries are set to be avoided by
         *       default. When `avoid` input is provided, only the mentioned objects are avoided.
         *     - When using `avoid=bbox` users also need to specify the boundaries of the bounding
         *       box to be avoid. Multiple bounding boxes can be specified simultaneously. Please
         *       note that bounding box is a hard filter and if it blocks all possible routes
         *       between given locations, a 4xx error is returned.
         *
         *     - **Format:** bbox: min_latitude,min_longtitude,max_latitude,max_longitude.
         *     - **Example:** avoid=bbox: 34.0635,-118.2547, 34.0679,-118.2478 | bbox: 34.0521,-118.2342, 34.0478,-118.2437
         *     - When using `avoid=sharp_turn`, default range of permissible turn angles is
         *       \[120,240\].
         */
        fun avoid(avoid: Avoid) = apply { body.avoid(avoid) }

        /**
         * Sets [Builder.avoid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avoid] with a well-typed [Avoid] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avoid(avoid: JsonField<Avoid>) = apply { body.avoid(avoid) }

        /**
         * Specify if crossing an international border is expected for operations near border areas.
         * When set to false, the API will prohibit routes going back & forth between countries.
         * Consequently, routes within the same country will be preferred if they are feasible for
         * the given set of `destination` or `waypoints` . When set to true, the routes will be
         * allowed to go back & forth between countries as needed.
         *
         * This feature is available in North America region only. Please get in touch with
         * [support@nextbillion.ai](mailto:support@nextbillion.ai) to enquire/enable other areas.
         */
        fun crossBorder(crossBorder: Boolean) = apply { body.crossBorder(crossBorder) }

        /**
         * Sets [Builder.crossBorder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.crossBorder] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun crossBorder(crossBorder: JsonField<Boolean>) = apply { body.crossBorder(crossBorder) }

        /**
         * This is a number in UNIX epoch timestamp in seconds format that can be used to provide
         * the departure time. The response will return the `distance` and `duration` of the route
         * based on typical traffic for at the given start time.If no input is provided for this
         * parameter then the traffic conditions at the time of making the request are considered.
         *
         * Please note that when `route_type` is set to `shortest` then the `departure_time` will be
         * ineffective as the service will return the result for the shortest path possible
         * irrespective of the traffic conditions.
         */
        fun departureTime(departureTime: Long) = apply { body.departureTime(departureTime) }

        /**
         * Sets [Builder.departureTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.departureTime] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun departureTime(departureTime: JsonField<Long>) = apply {
            body.departureTime(departureTime)
        }

        /**
         * `destinations` are the ending coordinates of your route. Ensure that destinations are
         * routable land locations. Multiple destinations should be separated by a pipe symbol (|).
         *
         * In case `destinations` are not provided or if it is left empty, then the input value of
         * `origins` will be copied to `destinations` to create the OD matrix pairs.
         *
         * **Format:** latitude_1,longitude_1|latitude_2,longitude_2|…
         */
        fun destinations(destinations: String) = apply { body.destinations(destinations) }

        /**
         * Sets [Builder.destinations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinations] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun destinations(destinations: JsonField<String>) = apply {
            body.destinations(destinations)
        }

        /**
         * Specify the side of the road from which to approach `destinations` points. Please note
         * that the given approach will be applied to all the `destinations`.
         */
        fun destinationsApproach(destinationsApproach: DestinationsApproach) = apply {
            body.destinationsApproach(destinationsApproach)
        }

        /**
         * Sets [Builder.destinationsApproach] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationsApproach] with a well-typed
         * [DestinationsApproach] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun destinationsApproach(destinationsApproach: JsonField<DestinationsApproach>) = apply {
            body.destinationsApproach(destinationsApproach)
        }

        /**
         * Specify the type of hazardous material being carried and the service will avoid roads
         * which are not suitable for the type of goods specified. Multiple values can be separated
         * using a pipe operator `|` .
         *
         * Please note that this parameter is effective only when `mode=truck`.
         */
        fun hazmatType(hazmatType: HazmatType) = apply { body.hazmatType(hazmatType) }

        /**
         * Sets [Builder.hazmatType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hazmatType] with a well-typed [HazmatType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hazmatType(hazmatType: JsonField<HazmatType>) = apply { body.hazmatType(hazmatType) }

        /**
         * Set which driving mode the service should use to determine a route.
         *
         * For example, if you use `car`, the API will return a route that a car can take. Using
         * `truck` will return a route a truck can use, taking into account appropriate truck
         * routing restrictions.
         */
        fun mode(mode: Mode) = apply { body.mode(mode) }

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<Mode>) = apply { body.mode(mode) }

        /**
         * Specify the side of the road from which to approach `origins` points. Please note that
         * the given approach will be applied to all the points provided as `origins`.
         */
        fun originsApproach(originsApproach: OriginsApproach) = apply {
            body.originsApproach(originsApproach)
        }

        /**
         * Sets [Builder.originsApproach] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originsApproach] with a well-typed [OriginsApproach]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun originsApproach(originsApproach: JsonField<OriginsApproach>) = apply {
            body.originsApproach(originsApproach)
        }

        /**
         * Set the route type that needs to be returned. Please note that `route_type` is effective
         * only when `option=flexible`.
         */
        fun routeType(routeType: RouteType) = apply { body.routeType(routeType) }

        /**
         * Sets [Builder.routeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routeType] with a well-typed [RouteType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routeType(routeType: JsonField<RouteType>) = apply { body.routeType(routeType) }

        /**
         * Specify the total load per axle (including the weight of trailers and shipped goods) of
         * the truck, in tonnes. When used, the service will return routes which are legally allowed
         * to carry the load specified per axle.
         *
         * Please note this parameter is effective only when `mode=truck`.
         */
        fun truckAxleLoad(truckAxleLoad: Double) = apply { body.truckAxleLoad(truckAxleLoad) }

        /**
         * Sets [Builder.truckAxleLoad] to an arbitrary JSON value.
         *
         * You should usually call [Builder.truckAxleLoad] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun truckAxleLoad(truckAxleLoad: JsonField<Double>) = apply {
            body.truckAxleLoad(truckAxleLoad)
        }

        /**
         * This defines the dimensions of a truck in centimeters (cm) in the format of
         * "height,width,length". This parameter is effective only when `mode=truck` and
         * `option=flexible`. Maximum dimensions are as follows:
         *
         * Height = 1000 cm Width = 5000 cm Length = 5000 cm
         */
        fun truckSize(truckSize: String) = apply { body.truckSize(truckSize) }

        /**
         * Sets [Builder.truckSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.truckSize] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun truckSize(truckSize: JsonField<String>) = apply { body.truckSize(truckSize) }

        /**
         * This parameter defines the weight of the truck including trailers and shipped goods in
         * kilograms (kg). This parameter is effective only when `mode=truck` and `option=flexible`.
         */
        fun truckWeight(truckWeight: Long) = apply { body.truckWeight(truckWeight) }

        /**
         * Sets [Builder.truckWeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.truckWeight] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun truckWeight(truckWeight: JsonField<Long>) = apply { body.truckWeight(truckWeight) }

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
         * Returns an immutable instance of [MdmCreateDistanceMatrixParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .option()
         * .origins()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MdmCreateDistanceMatrixParams =
            MdmCreateDistanceMatrixParams(
                checkRequired("key", key),
                checkRequired("option", option),
                spliter,
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
                put("option", option.toString())
                spliter?.let { put("spliter", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    private constructor(
        private val origins: JsonField<String>,
        private val area: JsonField<Area>,
        private val avoid: JsonField<Avoid>,
        private val crossBorder: JsonField<Boolean>,
        private val departureTime: JsonField<Long>,
        private val destinations: JsonField<String>,
        private val destinationsApproach: JsonField<DestinationsApproach>,
        private val hazmatType: JsonField<HazmatType>,
        private val mode: JsonField<Mode>,
        private val originsApproach: JsonField<OriginsApproach>,
        private val routeType: JsonField<RouteType>,
        private val truckAxleLoad: JsonField<Double>,
        private val truckSize: JsonField<String>,
        private val truckWeight: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("origins") @ExcludeMissing origins: JsonField<String> = JsonMissing.of(),
            @JsonProperty("area") @ExcludeMissing area: JsonField<Area> = JsonMissing.of(),
            @JsonProperty("avoid") @ExcludeMissing avoid: JsonField<Avoid> = JsonMissing.of(),
            @JsonProperty("cross_border")
            @ExcludeMissing
            crossBorder: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("departure_time")
            @ExcludeMissing
            departureTime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("destinations")
            @ExcludeMissing
            destinations: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destinations_approach")
            @ExcludeMissing
            destinationsApproach: JsonField<DestinationsApproach> = JsonMissing.of(),
            @JsonProperty("hazmat_type")
            @ExcludeMissing
            hazmatType: JsonField<HazmatType> = JsonMissing.of(),
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
            @JsonProperty("origins_approach")
            @ExcludeMissing
            originsApproach: JsonField<OriginsApproach> = JsonMissing.of(),
            @JsonProperty("route_type")
            @ExcludeMissing
            routeType: JsonField<RouteType> = JsonMissing.of(),
            @JsonProperty("truck_axle_load")
            @ExcludeMissing
            truckAxleLoad: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("truck_size")
            @ExcludeMissing
            truckSize: JsonField<String> = JsonMissing.of(),
            @JsonProperty("truck_weight")
            @ExcludeMissing
            truckWeight: JsonField<Long> = JsonMissing.of(),
        ) : this(
            origins,
            area,
            avoid,
            crossBorder,
            departureTime,
            destinations,
            destinationsApproach,
            hazmatType,
            mode,
            originsApproach,
            routeType,
            truckAxleLoad,
            truckSize,
            truckWeight,
            mutableMapOf(),
        )

        /**
         * `origins` are the starting point of your route. Ensure that origins are routable land
         * locations. Multiple origins should be separated by a pipe symbol (|).
         *
         * **Format:** latitude_1,longitude_1|latitude_2,longitude_2|…
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun origins(): String = origins.getRequired("origins")

        /**
         * Provide the country that the coordinates belong to.
         *
         * _the input coordinates area._
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun area(): Optional<Area> = area.getOptional("area")

        /**
         * Setting this will ensure the route avoids the object(s) specified as input. Multiple
         * values should be separated by a pipe (|). If `none` is provided along with other values,
         * an error is returned as a valid route is not feasible.
         * - **Note:**
         *     - This parameter is effective only when `route_type=fastest`.
         *     - When this parameter is not provided in the input, ferries are set to be avoided by
         *       default. When `avoid` input is provided, only the mentioned objects are avoided.
         *     - When using `avoid=bbox` users also need to specify the boundaries of the bounding
         *       box to be avoid. Multiple bounding boxes can be specified simultaneously. Please
         *       note that bounding box is a hard filter and if it blocks all possible routes
         *       between given locations, a 4xx error is returned.
         *
         *     - **Format:** bbox: min_latitude,min_longtitude,max_latitude,max_longitude.
         *     - **Example:** avoid=bbox: 34.0635,-118.2547, 34.0679,-118.2478 | bbox: 34.0521,-118.2342, 34.0478,-118.2437
         *     - When using `avoid=sharp_turn`, default range of permissible turn angles is
         *       \[120,240\].
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun avoid(): Optional<Avoid> = avoid.getOptional("avoid")

        /**
         * Specify if crossing an international border is expected for operations near border areas.
         * When set to false, the API will prohibit routes going back & forth between countries.
         * Consequently, routes within the same country will be preferred if they are feasible for
         * the given set of `destination` or `waypoints` . When set to true, the routes will be
         * allowed to go back & forth between countries as needed.
         *
         * This feature is available in North America region only. Please get in touch with
         * [support@nextbillion.ai](mailto:support@nextbillion.ai) to enquire/enable other areas.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun crossBorder(): Optional<Boolean> = crossBorder.getOptional("cross_border")

        /**
         * This is a number in UNIX epoch timestamp in seconds format that can be used to provide
         * the departure time. The response will return the `distance` and `duration` of the route
         * based on typical traffic for at the given start time.If no input is provided for this
         * parameter then the traffic conditions at the time of making the request are considered.
         *
         * Please note that when `route_type` is set to `shortest` then the `departure_time` will be
         * ineffective as the service will return the result for the shortest path possible
         * irrespective of the traffic conditions.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun departureTime(): Optional<Long> = departureTime.getOptional("departure_time")

        /**
         * `destinations` are the ending coordinates of your route. Ensure that destinations are
         * routable land locations. Multiple destinations should be separated by a pipe symbol (|).
         *
         * In case `destinations` are not provided or if it is left empty, then the input value of
         * `origins` will be copied to `destinations` to create the OD matrix pairs.
         *
         * **Format:** latitude_1,longitude_1|latitude_2,longitude_2|…
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun destinations(): Optional<String> = destinations.getOptional("destinations")

        /**
         * Specify the side of the road from which to approach `destinations` points. Please note
         * that the given approach will be applied to all the `destinations`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun destinationsApproach(): Optional<DestinationsApproach> =
            destinationsApproach.getOptional("destinations_approach")

        /**
         * Specify the type of hazardous material being carried and the service will avoid roads
         * which are not suitable for the type of goods specified. Multiple values can be separated
         * using a pipe operator `|` .
         *
         * Please note that this parameter is effective only when `mode=truck`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun hazmatType(): Optional<HazmatType> = hazmatType.getOptional("hazmat_type")

        /**
         * Set which driving mode the service should use to determine a route.
         *
         * For example, if you use `car`, the API will return a route that a car can take. Using
         * `truck` will return a route a truck can use, taking into account appropriate truck
         * routing restrictions.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun mode(): Optional<Mode> = mode.getOptional("mode")

        /**
         * Specify the side of the road from which to approach `origins` points. Please note that
         * the given approach will be applied to all the points provided as `origins`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun originsApproach(): Optional<OriginsApproach> =
            originsApproach.getOptional("origins_approach")

        /**
         * Set the route type that needs to be returned. Please note that `route_type` is effective
         * only when `option=flexible`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun routeType(): Optional<RouteType> = routeType.getOptional("route_type")

        /**
         * Specify the total load per axle (including the weight of trailers and shipped goods) of
         * the truck, in tonnes. When used, the service will return routes which are legally allowed
         * to carry the load specified per axle.
         *
         * Please note this parameter is effective only when `mode=truck`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun truckAxleLoad(): Optional<Double> = truckAxleLoad.getOptional("truck_axle_load")

        /**
         * This defines the dimensions of a truck in centimeters (cm) in the format of
         * "height,width,length". This parameter is effective only when `mode=truck` and
         * `option=flexible`. Maximum dimensions are as follows:
         *
         * Height = 1000 cm Width = 5000 cm Length = 5000 cm
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun truckSize(): Optional<String> = truckSize.getOptional("truck_size")

        /**
         * This parameter defines the weight of the truck including trailers and shipped goods in
         * kilograms (kg). This parameter is effective only when `mode=truck` and `option=flexible`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun truckWeight(): Optional<Long> = truckWeight.getOptional("truck_weight")

        /**
         * Returns the raw JSON value of [origins].
         *
         * Unlike [origins], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origins") @ExcludeMissing fun _origins(): JsonField<String> = origins

        /**
         * Returns the raw JSON value of [area].
         *
         * Unlike [area], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("area") @ExcludeMissing fun _area(): JsonField<Area> = area

        /**
         * Returns the raw JSON value of [avoid].
         *
         * Unlike [avoid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("avoid") @ExcludeMissing fun _avoid(): JsonField<Avoid> = avoid

        /**
         * Returns the raw JSON value of [crossBorder].
         *
         * Unlike [crossBorder], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cross_border")
        @ExcludeMissing
        fun _crossBorder(): JsonField<Boolean> = crossBorder

        /**
         * Returns the raw JSON value of [departureTime].
         *
         * Unlike [departureTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("departure_time")
        @ExcludeMissing
        fun _departureTime(): JsonField<Long> = departureTime

        /**
         * Returns the raw JSON value of [destinations].
         *
         * Unlike [destinations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destinations")
        @ExcludeMissing
        fun _destinations(): JsonField<String> = destinations

        /**
         * Returns the raw JSON value of [destinationsApproach].
         *
         * Unlike [destinationsApproach], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("destinations_approach")
        @ExcludeMissing
        fun _destinationsApproach(): JsonField<DestinationsApproach> = destinationsApproach

        /**
         * Returns the raw JSON value of [hazmatType].
         *
         * Unlike [hazmatType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hazmat_type")
        @ExcludeMissing
        fun _hazmatType(): JsonField<HazmatType> = hazmatType

        /**
         * Returns the raw JSON value of [mode].
         *
         * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

        /**
         * Returns the raw JSON value of [originsApproach].
         *
         * Unlike [originsApproach], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("origins_approach")
        @ExcludeMissing
        fun _originsApproach(): JsonField<OriginsApproach> = originsApproach

        /**
         * Returns the raw JSON value of [routeType].
         *
         * Unlike [routeType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("route_type")
        @ExcludeMissing
        fun _routeType(): JsonField<RouteType> = routeType

        /**
         * Returns the raw JSON value of [truckAxleLoad].
         *
         * Unlike [truckAxleLoad], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("truck_axle_load")
        @ExcludeMissing
        fun _truckAxleLoad(): JsonField<Double> = truckAxleLoad

        /**
         * Returns the raw JSON value of [truckSize].
         *
         * Unlike [truckSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("truck_size") @ExcludeMissing fun _truckSize(): JsonField<String> = truckSize

        /**
         * Returns the raw JSON value of [truckWeight].
         *
         * Unlike [truckWeight], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("truck_weight")
        @ExcludeMissing
        fun _truckWeight(): JsonField<Long> = truckWeight

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
             * .origins()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var origins: JsonField<String>? = null
            private var area: JsonField<Area> = JsonMissing.of()
            private var avoid: JsonField<Avoid> = JsonMissing.of()
            private var crossBorder: JsonField<Boolean> = JsonMissing.of()
            private var departureTime: JsonField<Long> = JsonMissing.of()
            private var destinations: JsonField<String> = JsonMissing.of()
            private var destinationsApproach: JsonField<DestinationsApproach> = JsonMissing.of()
            private var hazmatType: JsonField<HazmatType> = JsonMissing.of()
            private var mode: JsonField<Mode> = JsonMissing.of()
            private var originsApproach: JsonField<OriginsApproach> = JsonMissing.of()
            private var routeType: JsonField<RouteType> = JsonMissing.of()
            private var truckAxleLoad: JsonField<Double> = JsonMissing.of()
            private var truckSize: JsonField<String> = JsonMissing.of()
            private var truckWeight: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                origins = body.origins
                area = body.area
                avoid = body.avoid
                crossBorder = body.crossBorder
                departureTime = body.departureTime
                destinations = body.destinations
                destinationsApproach = body.destinationsApproach
                hazmatType = body.hazmatType
                mode = body.mode
                originsApproach = body.originsApproach
                routeType = body.routeType
                truckAxleLoad = body.truckAxleLoad
                truckSize = body.truckSize
                truckWeight = body.truckWeight
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * `origins` are the starting point of your route. Ensure that origins are routable land
             * locations. Multiple origins should be separated by a pipe symbol (|).
             *
             * **Format:** latitude_1,longitude_1|latitude_2,longitude_2|…
             */
            fun origins(origins: String) = origins(JsonField.of(origins))

            /**
             * Sets [Builder.origins] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origins] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origins(origins: JsonField<String>) = apply { this.origins = origins }

            /**
             * Provide the country that the coordinates belong to.
             *
             * _the input coordinates area._
             */
            fun area(area: Area) = area(JsonField.of(area))

            /**
             * Sets [Builder.area] to an arbitrary JSON value.
             *
             * You should usually call [Builder.area] with a well-typed [Area] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun area(area: JsonField<Area>) = apply { this.area = area }

            /**
             * Setting this will ensure the route avoids the object(s) specified as input. Multiple
             * values should be separated by a pipe (|). If `none` is provided along with other
             * values, an error is returned as a valid route is not feasible.
             * - **Note:**
             *     - This parameter is effective only when `route_type=fastest`.
             *     - When this parameter is not provided in the input, ferries are set to be avoided
             *       by default. When `avoid` input is provided, only the mentioned objects are
             *       avoided.
             *     - When using `avoid=bbox` users also need to specify the boundaries of the
             *       bounding box to be avoid. Multiple bounding boxes can be specified
             *       simultaneously. Please note that bounding box is a hard filter and if it blocks
             *       all possible routes between given locations, a 4xx error is returned.
             *
             *     - **Format:** bbox: min_latitude,min_longtitude,max_latitude,max_longitude.
             *     - **Example:** avoid=bbox: 34.0635,-118.2547, 34.0679,-118.2478 | bbox: 34.0521,-118.2342, 34.0478,-118.2437
             *     - When using `avoid=sharp_turn`, default range of permissible turn angles is
             *       \[120,240\].
             */
            fun avoid(avoid: Avoid) = avoid(JsonField.of(avoid))

            /**
             * Sets [Builder.avoid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avoid] with a well-typed [Avoid] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun avoid(avoid: JsonField<Avoid>) = apply { this.avoid = avoid }

            /**
             * Specify if crossing an international border is expected for operations near border
             * areas. When set to false, the API will prohibit routes going back & forth between
             * countries. Consequently, routes within the same country will be preferred if they are
             * feasible for the given set of `destination` or `waypoints` . When set to true, the
             * routes will be allowed to go back & forth between countries as needed.
             *
             * This feature is available in North America region only. Please get in touch with
             * [support@nextbillion.ai](mailto:support@nextbillion.ai) to enquire/enable other
             * areas.
             */
            fun crossBorder(crossBorder: Boolean) = crossBorder(JsonField.of(crossBorder))

            /**
             * Sets [Builder.crossBorder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.crossBorder] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun crossBorder(crossBorder: JsonField<Boolean>) = apply {
                this.crossBorder = crossBorder
            }

            /**
             * This is a number in UNIX epoch timestamp in seconds format that can be used to
             * provide the departure time. The response will return the `distance` and `duration` of
             * the route based on typical traffic for at the given start time.If no input is
             * provided for this parameter then the traffic conditions at the time of making the
             * request are considered.
             *
             * Please note that when `route_type` is set to `shortest` then the `departure_time`
             * will be ineffective as the service will return the result for the shortest path
             * possible irrespective of the traffic conditions.
             */
            fun departureTime(departureTime: Long) = departureTime(JsonField.of(departureTime))

            /**
             * Sets [Builder.departureTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.departureTime] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun departureTime(departureTime: JsonField<Long>) = apply {
                this.departureTime = departureTime
            }

            /**
             * `destinations` are the ending coordinates of your route. Ensure that destinations are
             * routable land locations. Multiple destinations should be separated by a pipe symbol
             * (|).
             *
             * In case `destinations` are not provided or if it is left empty, then the input value
             * of `origins` will be copied to `destinations` to create the OD matrix pairs.
             *
             * **Format:** latitude_1,longitude_1|latitude_2,longitude_2|…
             */
            fun destinations(destinations: String) = destinations(JsonField.of(destinations))

            /**
             * Sets [Builder.destinations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinations] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destinations(destinations: JsonField<String>) = apply {
                this.destinations = destinations
            }

            /**
             * Specify the side of the road from which to approach `destinations` points. Please
             * note that the given approach will be applied to all the `destinations`.
             */
            fun destinationsApproach(destinationsApproach: DestinationsApproach) =
                destinationsApproach(JsonField.of(destinationsApproach))

            /**
             * Sets [Builder.destinationsApproach] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationsApproach] with a well-typed
             * [DestinationsApproach] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun destinationsApproach(destinationsApproach: JsonField<DestinationsApproach>) =
                apply {
                    this.destinationsApproach = destinationsApproach
                }

            /**
             * Specify the type of hazardous material being carried and the service will avoid roads
             * which are not suitable for the type of goods specified. Multiple values can be
             * separated using a pipe operator `|` .
             *
             * Please note that this parameter is effective only when `mode=truck`.
             */
            fun hazmatType(hazmatType: HazmatType) = hazmatType(JsonField.of(hazmatType))

            /**
             * Sets [Builder.hazmatType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hazmatType] with a well-typed [HazmatType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hazmatType(hazmatType: JsonField<HazmatType>) = apply {
                this.hazmatType = hazmatType
            }

            /**
             * Set which driving mode the service should use to determine a route.
             *
             * For example, if you use `car`, the API will return a route that a car can take. Using
             * `truck` will return a route a truck can use, taking into account appropriate truck
             * routing restrictions.
             */
            fun mode(mode: Mode) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

            /**
             * Specify the side of the road from which to approach `origins` points. Please note
             * that the given approach will be applied to all the points provided as `origins`.
             */
            fun originsApproach(originsApproach: OriginsApproach) =
                originsApproach(JsonField.of(originsApproach))

            /**
             * Sets [Builder.originsApproach] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originsApproach] with a well-typed [OriginsApproach]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originsApproach(originsApproach: JsonField<OriginsApproach>) = apply {
                this.originsApproach = originsApproach
            }

            /**
             * Set the route type that needs to be returned. Please note that `route_type` is
             * effective only when `option=flexible`.
             */
            fun routeType(routeType: RouteType) = routeType(JsonField.of(routeType))

            /**
             * Sets [Builder.routeType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routeType] with a well-typed [RouteType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routeType(routeType: JsonField<RouteType>) = apply { this.routeType = routeType }

            /**
             * Specify the total load per axle (including the weight of trailers and shipped goods)
             * of the truck, in tonnes. When used, the service will return routes which are legally
             * allowed to carry the load specified per axle.
             *
             * Please note this parameter is effective only when `mode=truck`.
             */
            fun truckAxleLoad(truckAxleLoad: Double) = truckAxleLoad(JsonField.of(truckAxleLoad))

            /**
             * Sets [Builder.truckAxleLoad] to an arbitrary JSON value.
             *
             * You should usually call [Builder.truckAxleLoad] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun truckAxleLoad(truckAxleLoad: JsonField<Double>) = apply {
                this.truckAxleLoad = truckAxleLoad
            }

            /**
             * This defines the dimensions of a truck in centimeters (cm) in the format of
             * "height,width,length". This parameter is effective only when `mode=truck` and
             * `option=flexible`. Maximum dimensions are as follows:
             *
             * Height = 1000 cm Width = 5000 cm Length = 5000 cm
             */
            fun truckSize(truckSize: String) = truckSize(JsonField.of(truckSize))

            /**
             * Sets [Builder.truckSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.truckSize] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun truckSize(truckSize: JsonField<String>) = apply { this.truckSize = truckSize }

            /**
             * This parameter defines the weight of the truck including trailers and shipped goods
             * in kilograms (kg). This parameter is effective only when `mode=truck` and
             * `option=flexible`.
             */
            fun truckWeight(truckWeight: Long) = truckWeight(JsonField.of(truckWeight))

            /**
             * Sets [Builder.truckWeight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.truckWeight] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun truckWeight(truckWeight: JsonField<Long>) = apply { this.truckWeight = truckWeight }

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
             * .origins()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("origins", origins),
                    area,
                    avoid,
                    crossBorder,
                    departureTime,
                    destinations,
                    destinationsApproach,
                    hazmatType,
                    mode,
                    originsApproach,
                    routeType,
                    truckAxleLoad,
                    truckSize,
                    truckWeight,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            origins()
            area().ifPresent { it.validate() }
            avoid().ifPresent { it.validate() }
            crossBorder()
            departureTime()
            destinations()
            destinationsApproach().ifPresent { it.validate() }
            hazmatType().ifPresent { it.validate() }
            mode().ifPresent { it.validate() }
            originsApproach().ifPresent { it.validate() }
            routeType().ifPresent { it.validate() }
            truckAxleLoad()
            truckSize()
            truckWeight()
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
            (if (origins.asKnown().isPresent) 1 else 0) +
                (area.asKnown().getOrNull()?.validity() ?: 0) +
                (avoid.asKnown().getOrNull()?.validity() ?: 0) +
                (if (crossBorder.asKnown().isPresent) 1 else 0) +
                (if (departureTime.asKnown().isPresent) 1 else 0) +
                (if (destinations.asKnown().isPresent) 1 else 0) +
                (destinationsApproach.asKnown().getOrNull()?.validity() ?: 0) +
                (hazmatType.asKnown().getOrNull()?.validity() ?: 0) +
                (mode.asKnown().getOrNull()?.validity() ?: 0) +
                (originsApproach.asKnown().getOrNull()?.validity() ?: 0) +
                (routeType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (truckAxleLoad.asKnown().isPresent) 1 else 0) +
                (if (truckSize.asKnown().isPresent) 1 else 0) +
                (if (truckWeight.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && origins == other.origins && area == other.area && avoid == other.avoid && crossBorder == other.crossBorder && departureTime == other.departureTime && destinations == other.destinations && destinationsApproach == other.destinationsApproach && hazmatType == other.hazmatType && mode == other.mode && originsApproach == other.originsApproach && routeType == other.routeType && truckAxleLoad == other.truckAxleLoad && truckSize == other.truckSize && truckWeight == other.truckWeight && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(origins, area, avoid, crossBorder, departureTime, destinations, destinationsApproach, hazmatType, mode, originsApproach, routeType, truckAxleLoad, truckSize, truckWeight, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{origins=$origins, area=$area, avoid=$avoid, crossBorder=$crossBorder, departureTime=$departureTime, destinations=$destinations, destinationsApproach=$destinationsApproach, hazmatType=$hazmatType, mode=$mode, originsApproach=$originsApproach, routeType=$routeType, truckAxleLoad=$truckAxleLoad, truckSize=$truckSize, truckWeight=$truckWeight, additionalProperties=$additionalProperties}"
    }

    /**
     * Provide the country that the coordinates belong to.
     *
     * _the input coordinates area._
     */
    class Area @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SINGAPORE = of("singapore")

            @JvmField val USA = of("usa")

            @JvmField val INDIA = of("india")

            @JvmStatic fun of(value: String) = Area(JsonField.of(value))
        }

        /** An enum containing [Area]'s known values. */
        enum class Known {
            SINGAPORE,
            USA,
            INDIA,
        }

        /**
         * An enum containing [Area]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Area] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SINGAPORE,
            USA,
            INDIA,
            /** An enum member indicating that [Area] was instantiated with an unknown value. */
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
                SINGAPORE -> Value.SINGAPORE
                USA -> Value.USA
                INDIA -> Value.INDIA
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
                SINGAPORE -> Known.SINGAPORE
                USA -> Known.USA
                INDIA -> Known.INDIA
                else -> throw NextbillionSdkInvalidDataException("Unknown Area: $value")
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

        fun validate(): Area = apply {
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

            return /* spotless:off */ other is Area && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Setting this will ensure the route avoids the object(s) specified as input. Multiple values
     * should be separated by a pipe (|). If `none` is provided along with other values, an error is
     * returned as a valid route is not feasible.
     * - **Note:**
     *     - This parameter is effective only when `route_type=fastest`.
     *     - When this parameter is not provided in the input, ferries are set to be avoided by
     *       default. When `avoid` input is provided, only the mentioned objects are avoided.
     *     - When using `avoid=bbox` users also need to specify the boundaries of the bounding box
     *       to be avoid. Multiple bounding boxes can be specified simultaneously. Please note that
     *       bounding box is a hard filter and if it blocks all possible routes between given
     *       locations, a 4xx error is returned.
     *
     *     - **Format:** bbox: min_latitude,min_longtitude,max_latitude,max_longitude.
     *     - **Example:** avoid=bbox: 34.0635,-118.2547, 34.0679,-118.2478 | bbox: 34.0521,-118.2342, 34.0478,-118.2437
     *     - When using `avoid=sharp_turn`, default range of permissible turn angles is \[120,240\].
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

            @JvmField val TOLL = of("`toll`")

            @JvmField val FERRY = of("`ferry`")

            @JvmField val HIGHWAY = of("`highway`")

            @JvmField val SHARP_TURN = of("`sharp_turn`")

            @JvmField val SERVICE_ROAD = of("`service_road`")

            @JvmField val BBOX = of("`bbox`")

            @JvmField val LEFT_TURN = of("`left_turn`")

            @JvmField val RIGHT_TURN = of("`right_turn`")

            @JvmField val NONE = of("`none`")

            @JvmStatic fun of(value: String) = Avoid(JsonField.of(value))
        }

        /** An enum containing [Avoid]'s known values. */
        enum class Known {
            TOLL,
            FERRY,
            HIGHWAY,
            SHARP_TURN,
            SERVICE_ROAD,
            BBOX,
            LEFT_TURN,
            RIGHT_TURN,
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
            SHARP_TURN,
            SERVICE_ROAD,
            BBOX,
            LEFT_TURN,
            RIGHT_TURN,
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
                SHARP_TURN -> Value.SHARP_TURN
                SERVICE_ROAD -> Value.SERVICE_ROAD
                BBOX -> Value.BBOX
                LEFT_TURN -> Value.LEFT_TURN
                RIGHT_TURN -> Value.RIGHT_TURN
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
                SHARP_TURN -> Known.SHARP_TURN
                SERVICE_ROAD -> Known.SERVICE_ROAD
                BBOX -> Known.BBOX
                LEFT_TURN -> Known.LEFT_TURN
                RIGHT_TURN -> Known.RIGHT_TURN
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
     * Specify the side of the road from which to approach `destinations` points. Please note that
     * the given approach will be applied to all the `destinations`.
     */
    class DestinationsApproach
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = DestinationsApproach(JsonField.of(value))
        }

        /** An enum containing [DestinationsApproach]'s known values. */
        enum class Known {
            UNRESTRICTED,
            CURB,
        }

        /**
         * An enum containing [DestinationsApproach]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [DestinationsApproach] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNRESTRICTED,
            CURB,
            /**
             * An enum member indicating that [DestinationsApproach] was instantiated with an
             * unknown value.
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
                else ->
                    throw NextbillionSdkInvalidDataException("Unknown DestinationsApproach: $value")
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

        fun validate(): DestinationsApproach = apply {
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

            return /* spotless:off */ other is DestinationsApproach && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specify the type of hazardous material being carried and the service will avoid roads which
     * are not suitable for the type of goods specified. Multiple values can be separated using a
     * pipe operator `|` .
     *
     * Please note that this parameter is effective only when `mode=truck`.
     */
    class HazmatType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val GENERAL = of("`general`")

            @JvmField val CIRCUMSTANTIAL = of("`circumstantial`")

            @JvmField val EXPLOSIVE = of("`explosive`")

            @JvmField val HARMFUL_TO_WATER = of("`harmful_to_water`")

            @JvmStatic fun of(value: String) = HazmatType(JsonField.of(value))
        }

        /** An enum containing [HazmatType]'s known values. */
        enum class Known {
            GENERAL,
            CIRCUMSTANTIAL,
            EXPLOSIVE,
            HARMFUL_TO_WATER,
        }

        /**
         * An enum containing [HazmatType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [HazmatType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GENERAL,
            CIRCUMSTANTIAL,
            EXPLOSIVE,
            HARMFUL_TO_WATER,
            /**
             * An enum member indicating that [HazmatType] was instantiated with an unknown value.
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
                GENERAL -> Value.GENERAL
                CIRCUMSTANTIAL -> Value.CIRCUMSTANTIAL
                EXPLOSIVE -> Value.EXPLOSIVE
                HARMFUL_TO_WATER -> Value.HARMFUL_TO_WATER
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
                GENERAL -> Known.GENERAL
                CIRCUMSTANTIAL -> Known.CIRCUMSTANTIAL
                EXPLOSIVE -> Known.EXPLOSIVE
                HARMFUL_TO_WATER -> Known.HARMFUL_TO_WATER
                else -> throw NextbillionSdkInvalidDataException("Unknown HazmatType: $value")
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

        fun validate(): HazmatType = apply {
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

            return /* spotless:off */ other is HazmatType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Set which driving mode the service should use to determine a route.
     *
     * For example, if you use `car`, the API will return a route that a car can take. Using `truck`
     * will return a route a truck can use, taking into account appropriate truck routing
     * restrictions.
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
     * Specify the side of the road from which to approach `origins` points. Please note that the
     * given approach will be applied to all the points provided as `origins`.
     */
    class OriginsApproach @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val UNRESTRICTED = of("`unrestricted`")

            @JvmField val CURB = of("`curb`")

            @JvmStatic fun of(value: String) = OriginsApproach(JsonField.of(value))
        }

        /** An enum containing [OriginsApproach]'s known values. */
        enum class Known {
            UNRESTRICTED,
            CURB,
        }

        /**
         * An enum containing [OriginsApproach]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OriginsApproach] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNRESTRICTED,
            CURB,
            /**
             * An enum member indicating that [OriginsApproach] was instantiated with an unknown
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
                else -> throw NextbillionSdkInvalidDataException("Unknown OriginsApproach: $value")
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

        fun validate(): OriginsApproach = apply {
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

            return /* spotless:off */ other is OriginsApproach && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Set the route type that needs to be returned. Please note that `route_type` is effective only
     * when `option=flexible`.
     */
    class RouteType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FASTEST = of("`fastest`")

            @JvmField val SHORTEST = of("`shortest`")

            @JvmStatic fun of(value: String) = RouteType(JsonField.of(value))
        }

        /** An enum containing [RouteType]'s known values. */
        enum class Known {
            FASTEST,
            SHORTEST,
        }

        /**
         * An enum containing [RouteType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RouteType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FASTEST,
            SHORTEST,
            /**
             * An enum member indicating that [RouteType] was instantiated with an unknown value.
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
                FASTEST -> Value.FASTEST
                SHORTEST -> Value.SHORTEST
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
                FASTEST -> Known.FASTEST
                SHORTEST -> Known.SHORTEST
                else -> throw NextbillionSdkInvalidDataException("Unknown RouteType: $value")
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

        fun validate(): RouteType = apply {
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

            return /* spotless:off */ other is RouteType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Use this option to switch to truck-specific routing or time based routing or if you want to
     * choose between the fastest and shortest route types.
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

            @JvmField val FLEXIBLE = of("flexible")

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
     * Specify a spliter to split the matrix by. It accepts 2 values:
     * - `od_number_spliter`:
     * - `straight_distance_spliter`:
     *
     * Please note it is an internal, debug field only.
     *
     * _debug field. choose specific spliter to split matrix._
     */
    class Spliter @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OD_NUMBER_SPLITER = of("od_number_spliter")

            @JvmField val STRAIGHT_DISTANCE_SPLITER = of("straight_distance_spliter")

            @JvmField val LOCATION_SPLITER = of("location_spliter")

            @JvmStatic fun of(value: String) = Spliter(JsonField.of(value))
        }

        /** An enum containing [Spliter]'s known values. */
        enum class Known {
            OD_NUMBER_SPLITER,
            STRAIGHT_DISTANCE_SPLITER,
            LOCATION_SPLITER,
        }

        /**
         * An enum containing [Spliter]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Spliter] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OD_NUMBER_SPLITER,
            STRAIGHT_DISTANCE_SPLITER,
            LOCATION_SPLITER,
            /** An enum member indicating that [Spliter] was instantiated with an unknown value. */
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
                OD_NUMBER_SPLITER -> Value.OD_NUMBER_SPLITER
                STRAIGHT_DISTANCE_SPLITER -> Value.STRAIGHT_DISTANCE_SPLITER
                LOCATION_SPLITER -> Value.LOCATION_SPLITER
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
                OD_NUMBER_SPLITER -> Known.OD_NUMBER_SPLITER
                STRAIGHT_DISTANCE_SPLITER -> Known.STRAIGHT_DISTANCE_SPLITER
                LOCATION_SPLITER -> Known.LOCATION_SPLITER
                else -> throw NextbillionSdkInvalidDataException("Unknown Spliter: $value")
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

        fun validate(): Spliter = apply {
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

            return /* spotless:off */ other is Spliter && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MdmCreateDistanceMatrixParams && key == other.key && option == other.option && spliter == other.spliter && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, option, spliter, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "MdmCreateDistanceMatrixParams{key=$key, option=$option, spliter=$spliter, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
