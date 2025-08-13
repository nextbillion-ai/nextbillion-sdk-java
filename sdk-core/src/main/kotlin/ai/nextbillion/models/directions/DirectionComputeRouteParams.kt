// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.directions

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Directions API is a service that computes a route with given coordinates. */
class DirectionComputeRouteParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destination(): String = body.destination()

    /**
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun origin(): String = body.origin()

    /**
     * Sets the number of alternative routes to return. It is effective only when alternatives=true.
     * Default to 3.
     *
     * Please note that adding alternative route count does not guarantee matching number of routes
     * to be returned if potential alternative routes do not exist.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun altcount(): Optional<Long> = body.altcount()

    /**
     * When true the API will return alternate routes.
     *
     * The alternatives is effective only when there are no waypoints included in the request.
     *
     * You can set the number of alternate routes to be returned in the altcount property.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun alternatives(): Optional<Boolean> = body.alternatives()

    /**
     * A semicolon-separated list indicating the side of the road from which to approach waypoints
     * in a requested route.
     *
     * When set to unrestricted a route can arrive at the waypoint from either side of the road and
     * when set to curb the route will arrive at the waypoint on the driving side of the region.
     *
     * Please note the number of values provided must be one more than the number of waypoints. The
     * last value of approaches will determine the approach for the destination. However, you can
     * skip a coordinate and show its position in the list with the ; separator.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun approaches(): Optional<String> = body.approaches()

    /**
     * When option=fast (by default):
     *
     * Setting this will ensure the route avoids ferries, tolls, highways or nothing. Multiple
     * values should be separated by a pipe "|". If none is provided along with other values, an
     * error is returned as a valid route is not feasible.
     *
     * Please note that when this parameter is not provided in the input, ferries are set to be
     * avoided by default. When this parameter is provided, only the mentioned objects are avoided.
     *
     * When option=flexible:
     *
     * Set this parameter to find alternative routes that bypass specified objects. Use a pipe "|"
     * to separate multiple values. This is a flexible filter; if no alternative routes exist, the
     * service will still provide a route that includes the objects. For a strict filter, consider
     * using the exclude parameter.
     *
     * \- This parameter is effective only when route_type=fastest. \- Following objects are
     * exceptions to the flexible filtering behavior of avoid parameter: bbox, tunnel and
     * geofence_id. When used, the service will return an error in case there are no alternative
     * routes available. \- When using avoid=bbox users also need to specify the boundaries of the
     * bounding box to be avoided. Multiple bounding boxes can be specified simultaneously. The
     * perimeter of a bounding box can not exceed 500 KM. Format:
     * bbox=min_latitude,min_longtitude,max_latitude,max_longitude. Example: avoid=bbox:
     * 34.0635,-118.2547, 34.0679,-118.2478 | bbox: 34.0521,-118.2342, 34.0478,-118.2437 \- When
     * using avoid=sharp_turn, default range of permissible turn angles is \[120,240\] in the
     * clockwise direction from the current road. In order to override default range, please use
     * turn_angle_range parameter. \- When using avoid=geofence_id, only the the geofences created
     * using [NextBillion.ai](http://NextBillion.ai) Geofence API are valid. \- When this parameter
     * is not provided in the input, ferry routes are set to be avoided by default. When this
     * parameter is provided, only the mentioned object(s) are avoided. \- If none is provided along
     * with other values, an error is returned as a valid route is not feasible.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun avoid(): Optional<Avoid> = body.avoid()

    /**
     * Limits the search to road segments with given bearing, in degrees, towards true north in
     * clockwise direction. Each bearings should be in the format of degree,range, where the degree
     * should be a value between \[0, 360\] and range should be a value between \[0, 180\].
     *
     * Please note that the number of bearings should be two more than the number of waypoints. This
     * is to account for the bearing of origin and destination. If a route can approach a waypoint
     * or the destination from any direction, the bearing for that point can be specified as
     * "0,180".
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun bearings(): Optional<String> = body.bearings()

    /**
     * Requires option=flexible.
     *
     * Specify if crossing an international border is expected for operations near border areas.
     * When set to false, the API will prohibit routes crossing the borders. When set to true, the
     * service will return routes which cross the borders between countries, if required for the
     * given set destination and waypoints.
     *
     * This feature is available in North America region only. Please get in touch with
     * [support@nextbillion.ai](mailto:support@nextbillion.ai) to enquire/enable other areas.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun crossBorder(): Optional<Boolean> = body.crossBorder()

    /**
     * Requires option=flexible.
     *
     * Use this parameter to set a departure time, expressed as UNIX epoch timestamp in seconds, for
     * calculating the isochrone contour. The response will consider the typical traffic conditions
     * at the given time and return a contour which can be reached under those traffic conditions.
     *
     * Please note that if no input is provided for this parameter then the traffic conditions at
     * the time of making the request are considered.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun departureTime(): Optional<Long> = body.departureTime()

    /**
     * Requires option=flexible.
     *
     * An array of durations, in seconds, for which the driver can drive continuously before taking
     * a rest. Multiple drive time limits can be separated by a comma character ",". After driving
     * for the given duration the driver will take a rest for a fixed period, specified in
     * rest_times . Once the rest duration is over, the subsequent driving duration starts and the
     * process continues until all drive times and rest periods are exhausted or if the driver
     * reaches the destination. This feature is useful in complying with Hours of Service
     * regulations and calculates actual ETAs with regulated driving periods.
     *
     * As an example, a drive_time_limits=\[500, 300\] means that driver can drive for 500 seconds
     * before the first rest period and then drive for another 300 seconds before taking a rest next
     * time.
     *
     * \- If the trip duration is smaller than the first input of drive_time_limits, then there will
     * be no rest actions scheduled by the service. \- If the trip duration is larger than the
     * scheduled time, then a "warning" is returned in the response - along with details of last leg
     * of the trip - to indicate the same.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun driveTimeLimits(): Optional<String> = body.driveTimeLimits()

    /**
     * Requires option=flexible.
     *
     * Specify the emission class to which the vehicle (engine) belongs to. The service will use
     * this setting to generate routes that are permissible for that engine class. Only the emission
     * classifications in the EU regions are supported currently. Please reach out to
     * [support@nextbillion.ai](mailto:support@nextbillion.ai) to enable for your region.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun emissionClass(): Optional<EmissionClass> = body.emissionClass()

    /**
     * Requires option=flexible.
     *
     * This parameter serves as a mandatory filter, ensuring the service returns only those routes
     * that strictly avoid the object(s) indicated. Multiple values should be separated by a pipe
     * |). If no routes can be found that exclude the specified object(s), the service will return
     * an error. For a less strict filtering approach, consider using the avoid parameter.
     *
     * \- This parameter is effective only when route_type=fastest. \- When using
     * exclude=sharp_turn, default range of permissible turn angles is \[120,240\]. In order to
     * override default range, please use turn_angle_range parameter. \- If none is provided along
     * with other values, an error is returned as a valid route is not feasible.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun exclude(): Optional<Exclude> = body.exclude()

    /**
     * Sets the output format of the route geometry in the response.
     *
     * On providing polyline and polyline6 as input, respective encoded geometry is returned.
     * However, when geojson is provided as the input value, polyline encoded geometry is returned
     * in the response along with the geojson details of the route.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun geometry(): Optional<Geometry> = body.geometry()

    /**
     * Requires option=flexible.
     *
     * Specify the type of hazardous material being carried and the service will avoid roads which
     * are not suitable for the type of goods specified. Multiple values can be separated using a
     * pipe operator "|".
     *
     * Please note that this parameter is effective only when mode=truck.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun hazmatType(): Optional<HazmatType> = body.hazmatType()

    /**
     * Set the driving mode the service should use to determine a route. In "car" mode, the API will
     * return a route that a car can take. Using "truck" mode will return a route a truck can use,
     * taking into account appropriate truck routing restrictions.
     *
     * When mode=truck, following are the default dimensions that are used:
     *
     * \- truck_height = 214 centimeters \- truck_width = 183 centimeters \- truck_length = 519
     * centimeters \- truck_weight = 5000 kg
     *
     * When option=flexible, you can use custom truck dimensions with truck_weight and truck_size
     * parameters.
     *
     * Note: Only the car profile is enabled by default. Please note that customized profiles
     * (including truck) might not be available for all regions. Please contact your
     * [NextBillion.ai](http://NextBillion.ai) account manager, sales representative or reach out at
     * [support@nextbillion.ai](mailto:support@nextbillion.ai) in case you need additional profiles.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun mode(): Optional<Mode> = body.mode()

    /**
     * The option parameter specifies the version of the directions service to use. Setting
     * option=flexible activates the Flexible API, which supports advanced features like truck
     * routing, time-based routing, route type selection (fastest/shortest), and segment-wise speed
     * limits. If not set, the API defaults to the Fast version for real-time routing.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun option(): Optional<Option> = body.option()

    /**
     * Specify the verbosity of route geometry.
     *
     * When set to full, the most detailed geometry available is returned. When set to simplified, a
     * simplified version of the full geometry is returned. No overview geometry is returned when
     * set to false.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun overview(): Optional<Overview> = body.overview()

    /**
     * Requires option=flexible.
     *
     * An array of durations, in seconds, for which the driver should rest after completing the
     * corresponding continuous driving interval (provided in drive_time_limits). Multiple rest
     * times can be separated by a comma character ",". Ideally, the number of rest_times provided
     * should be equal to the number of drive_time_limits provided for proper scheduling of driver
     * breaks.
     *
     * As an example, a rest_times=\[500, 300\] means that driver can rest for 500 seconds after the
     * first continuous driving session and rest for 300 seconds after the next continuous driving
     * session.
     *
     * \- If the number of rest_times provided are less than the number of drive_time_limits, the
     * service will schedule a rest period of "0" seconds after each such drive time period which
     * does not have a corresponding entry in rest_times. \- If the number of rest_times provided is
     * more than the number of drive times provided, the additional rest times are never applied.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun restTimes(): Optional<String> = body.restTimes()

    /**
     * Requires option=flexible.
     *
     * Use this parameter to receive additional information about the road segments returned in the
     * response. Currently, following inputs are supported:
     *
     * \- max_speed : segment-wise maximum speed information of roads in the response. \-
     * toll_distance : returns the total distance travelled on the road segments having tolls. \-
     * toll_cost: returns the range of toll charges, in local currency, that can be incurred for the
     * suggested route.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun roadInfo(): Optional<RoadInfo> = body.roadInfo()

    /**
     * Requires option=flexible.
     *
     * Set the route type that needs to be returned.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun routeType(): Optional<RouteType> = body.routeType()

    /**
     * Set this to true to receive additional details about the routes and each of its legs (details
     * of geometry, start & end locations) in the response.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun steps(): Optional<Boolean> = body.steps()

    /**
     * Requires option=flexible.
     *
     * Specify the total load per axle (including the weight of trailers and shipped goods) of the
     * truck, in tonnes. When used, the service will return routes which are legally allowed to
     * carry the load specified per axle.
     *
     * Please note this parameter is effective only when mode=truck.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun truckAxleLoad(): Optional<Double> = body.truckAxleLoad()

    /**
     * Requires option=flexible.
     *
     * This defines the dimensions of a truck in centimeters (CM). This parameter is effective only
     * when the mode=truck. Maximum dimensions are as follows:
     *
     * \- Height = 1000 cm \- Width = 5000 cm \- Length = 5000 cm
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun truckSize(): Optional<String> = body.truckSize()

    /**
     * Requires option=flexible.
     *
     * This parameter defines the weight of the truck including trailers and shipped goods in
     * kilograms (KG). This parameter is effective only when mode=truck.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun truckWeight(): Optional<Long> = body.truckWeight()

    /**
     * Requires option=flexible.
     *
     * Specify the turn angles that can be taken safely by the vehicle. The permissible turn angles
     * are calculated as \[0 + turn_angle_range , 360 - turn_angle_range\]. Please note that this
     * parameter is effective only when avoid=sharp_turn.
     *
     * It is worth highlighting here that providing smaller angles might lead to 4xx errors as route
     * engine might not be able find routes satisfying the smaller turn angle criteria for all turns
     * in the route.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun turnAngleRange(): Optional<Long> = body.turnAngleRange()

    /**
     * Pipe-separated list of coordinate pairs
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun waypoints(): Optional<String> = body.waypoints()

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _destination(): JsonField<String> = body._destination()

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _origin(): JsonField<String> = body._origin()

    /**
     * Returns the raw JSON value of [altcount].
     *
     * Unlike [altcount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _altcount(): JsonField<Long> = body._altcount()

    /**
     * Returns the raw JSON value of [alternatives].
     *
     * Unlike [alternatives], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _alternatives(): JsonField<Boolean> = body._alternatives()

    /**
     * Returns the raw JSON value of [approaches].
     *
     * Unlike [approaches], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _approaches(): JsonField<String> = body._approaches()

    /**
     * Returns the raw JSON value of [avoid].
     *
     * Unlike [avoid], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _avoid(): JsonField<Avoid> = body._avoid()

    /**
     * Returns the raw JSON value of [bearings].
     *
     * Unlike [bearings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bearings(): JsonField<String> = body._bearings()

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
     * Returns the raw JSON value of [driveTimeLimits].
     *
     * Unlike [driveTimeLimits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _driveTimeLimits(): JsonField<String> = body._driveTimeLimits()

    /**
     * Returns the raw JSON value of [emissionClass].
     *
     * Unlike [emissionClass], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _emissionClass(): JsonField<EmissionClass> = body._emissionClass()

    /**
     * Returns the raw JSON value of [exclude].
     *
     * Unlike [exclude], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _exclude(): JsonField<Exclude> = body._exclude()

    /**
     * Returns the raw JSON value of [geometry].
     *
     * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _geometry(): JsonField<Geometry> = body._geometry()

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
     * Returns the raw JSON value of [option].
     *
     * Unlike [option], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _option(): JsonField<Option> = body._option()

    /**
     * Returns the raw JSON value of [overview].
     *
     * Unlike [overview], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _overview(): JsonField<Overview> = body._overview()

    /**
     * Returns the raw JSON value of [restTimes].
     *
     * Unlike [restTimes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _restTimes(): JsonField<String> = body._restTimes()

    /**
     * Returns the raw JSON value of [roadInfo].
     *
     * Unlike [roadInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _roadInfo(): JsonField<RoadInfo> = body._roadInfo()

    /**
     * Returns the raw JSON value of [routeType].
     *
     * Unlike [routeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _routeType(): JsonField<RouteType> = body._routeType()

    /**
     * Returns the raw JSON value of [steps].
     *
     * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _steps(): JsonField<Boolean> = body._steps()

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

    /**
     * Returns the raw JSON value of [turnAngleRange].
     *
     * Unlike [turnAngleRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _turnAngleRange(): JsonField<Long> = body._turnAngleRange()

    /**
     * Returns the raw JSON value of [waypoints].
     *
     * Unlike [waypoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _waypoints(): JsonField<String> = body._waypoints()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DirectionComputeRouteParams].
         *
         * The following fields are required:
         * ```java
         * .destination()
         * .origin()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DirectionComputeRouteParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(directionComputeRouteParams: DirectionComputeRouteParams) = apply {
            body = directionComputeRouteParams.body.toBuilder()
            additionalHeaders = directionComputeRouteParams.additionalHeaders.toBuilder()
            additionalQueryParams = directionComputeRouteParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [destination]
         * - [origin]
         * - [altcount]
         * - [alternatives]
         * - [approaches]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun destination(destination: String) = apply { body.destination(destination) }

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun destination(destination: JsonField<String>) = apply { body.destination(destination) }

        fun origin(origin: String) = apply { body.origin(origin) }

        /**
         * Sets [Builder.origin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origin] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun origin(origin: JsonField<String>) = apply { body.origin(origin) }

        /**
         * Sets the number of alternative routes to return. It is effective only when
         * alternatives=true. Default to 3.
         *
         * Please note that adding alternative route count does not guarantee matching number of
         * routes to be returned if potential alternative routes do not exist.
         */
        fun altcount(altcount: Long) = apply { body.altcount(altcount) }

        /**
         * Sets [Builder.altcount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altcount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun altcount(altcount: JsonField<Long>) = apply { body.altcount(altcount) }

        /**
         * When true the API will return alternate routes.
         *
         * The alternatives is effective only when there are no waypoints included in the request.
         *
         * You can set the number of alternate routes to be returned in the altcount property.
         */
        fun alternatives(alternatives: Boolean) = apply { body.alternatives(alternatives) }

        /**
         * Sets [Builder.alternatives] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alternatives] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun alternatives(alternatives: JsonField<Boolean>) = apply {
            body.alternatives(alternatives)
        }

        /**
         * A semicolon-separated list indicating the side of the road from which to approach
         * waypoints in a requested route.
         *
         * When set to unrestricted a route can arrive at the waypoint from either side of the road
         * and when set to curb the route will arrive at the waypoint on the driving side of the
         * region.
         *
         * Please note the number of values provided must be one more than the number of waypoints.
         * The last value of approaches will determine the approach for the destination. However,
         * you can skip a coordinate and show its position in the list with the ; separator.
         */
        fun approaches(approaches: String) = apply { body.approaches(approaches) }

        /**
         * Sets [Builder.approaches] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approaches] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun approaches(approaches: JsonField<String>) = apply { body.approaches(approaches) }

        /**
         * When option=fast (by default):
         *
         * Setting this will ensure the route avoids ferries, tolls, highways or nothing. Multiple
         * values should be separated by a pipe "|". If none is provided along with other values, an
         * error is returned as a valid route is not feasible.
         *
         * Please note that when this parameter is not provided in the input, ferries are set to be
         * avoided by default. When this parameter is provided, only the mentioned objects are
         * avoided.
         *
         * When option=flexible:
         *
         * Set this parameter to find alternative routes that bypass specified objects. Use a pipe
         * "|" to separate multiple values. This is a flexible filter; if no alternative routes
         * exist, the service will still provide a route that includes the objects. For a strict
         * filter, consider using the exclude parameter.
         *
         * \- This parameter is effective only when route_type=fastest. \- Following objects are
         * exceptions to the flexible filtering behavior of avoid parameter: bbox, tunnel and
         * geofence_id. When used, the service will return an error in case there are no alternative
         * routes available. \- When using avoid=bbox users also need to specify the boundaries of
         * the bounding box to be avoided. Multiple bounding boxes can be specified simultaneously.
         * The perimeter of a bounding box can not exceed 500 KM. Format:
         * bbox=min_latitude,min_longtitude,max_latitude,max_longitude. Example: avoid=bbox:
         * 34.0635,-118.2547, 34.0679,-118.2478 | bbox: 34.0521,-118.2342, 34.0478,-118.2437 \- When
         * using avoid=sharp_turn, default range of permissible turn angles is \[120,240\] in the
         * clockwise direction from the current road. In order to override default range, please use
         * turn_angle_range parameter. \- When using avoid=geofence_id, only the the geofences
         * created using [NextBillion.ai](http://NextBillion.ai) Geofence API are valid. \- When
         * this parameter is not provided in the input, ferry routes are set to be avoided by
         * default. When this parameter is provided, only the mentioned object(s) are avoided. \- If
         * none is provided along with other values, an error is returned as a valid route is not
         * feasible.
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
         * Limits the search to road segments with given bearing, in degrees, towards true north in
         * clockwise direction. Each bearings should be in the format of degree,range, where the
         * degree should be a value between \[0, 360\] and range should be a value between \[0,
         * 180\].
         *
         * Please note that the number of bearings should be two more than the number of waypoints.
         * This is to account for the bearing of origin and destination. If a route can approach a
         * waypoint or the destination from any direction, the bearing for that point can be
         * specified as "0,180".
         */
        fun bearings(bearings: String) = apply { body.bearings(bearings) }

        /**
         * Sets [Builder.bearings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bearings] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bearings(bearings: JsonField<String>) = apply { body.bearings(bearings) }

        /**
         * Requires option=flexible.
         *
         * Specify if crossing an international border is expected for operations near border areas.
         * When set to false, the API will prohibit routes crossing the borders. When set to true,
         * the service will return routes which cross the borders between countries, if required for
         * the given set destination and waypoints.
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
         * Requires option=flexible.
         *
         * Use this parameter to set a departure time, expressed as UNIX epoch timestamp in seconds,
         * for calculating the isochrone contour. The response will consider the typical traffic
         * conditions at the given time and return a contour which can be reached under those
         * traffic conditions.
         *
         * Please note that if no input is provided for this parameter then the traffic conditions
         * at the time of making the request are considered.
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
         * Requires option=flexible.
         *
         * An array of durations, in seconds, for which the driver can drive continuously before
         * taking a rest. Multiple drive time limits can be separated by a comma character ",".
         * After driving for the given duration the driver will take a rest for a fixed period,
         * specified in rest_times . Once the rest duration is over, the subsequent driving duration
         * starts and the process continues until all drive times and rest periods are exhausted or
         * if the driver reaches the destination. This feature is useful in complying with Hours of
         * Service regulations and calculates actual ETAs with regulated driving periods.
         *
         * As an example, a drive_time_limits=\[500, 300\] means that driver can drive for 500
         * seconds before the first rest period and then drive for another 300 seconds before taking
         * a rest next time.
         *
         * \- If the trip duration is smaller than the first input of drive_time_limits, then there
         * will be no rest actions scheduled by the service. \- If the trip duration is larger than
         * the scheduled time, then a "warning" is returned in the response - along with details of
         * last leg of the trip - to indicate the same.
         */
        fun driveTimeLimits(driveTimeLimits: String) = apply {
            body.driveTimeLimits(driveTimeLimits)
        }

        /**
         * Sets [Builder.driveTimeLimits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.driveTimeLimits] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun driveTimeLimits(driveTimeLimits: JsonField<String>) = apply {
            body.driveTimeLimits(driveTimeLimits)
        }

        /**
         * Requires option=flexible.
         *
         * Specify the emission class to which the vehicle (engine) belongs to. The service will use
         * this setting to generate routes that are permissible for that engine class. Only the
         * emission classifications in the EU regions are supported currently. Please reach out to
         * [support@nextbillion.ai](mailto:support@nextbillion.ai) to enable for your region.
         */
        fun emissionClass(emissionClass: EmissionClass) = apply {
            body.emissionClass(emissionClass)
        }

        /**
         * Sets [Builder.emissionClass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emissionClass] with a well-typed [EmissionClass] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emissionClass(emissionClass: JsonField<EmissionClass>) = apply {
            body.emissionClass(emissionClass)
        }

        /**
         * Requires option=flexible.
         *
         * This parameter serves as a mandatory filter, ensuring the service returns only those
         * routes that strictly avoid the object(s) indicated. Multiple values should be separated
         * by a pipe |). If no routes can be found that exclude the specified object(s), the service
         * will return an error. For a less strict filtering approach, consider using the avoid
         * parameter.
         *
         * \- This parameter is effective only when route_type=fastest. \- When using
         * exclude=sharp_turn, default range of permissible turn angles is \[120,240\]. In order to
         * override default range, please use turn_angle_range parameter. \- If none is provided
         * along with other values, an error is returned as a valid route is not feasible.
         */
        fun exclude(exclude: Exclude) = apply { body.exclude(exclude) }

        /**
         * Sets [Builder.exclude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exclude] with a well-typed [Exclude] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun exclude(exclude: JsonField<Exclude>) = apply { body.exclude(exclude) }

        /**
         * Sets the output format of the route geometry in the response.
         *
         * On providing polyline and polyline6 as input, respective encoded geometry is returned.
         * However, when geojson is provided as the input value, polyline encoded geometry is
         * returned in the response along with the geojson details of the route.
         */
        fun geometry(geometry: Geometry) = apply { body.geometry(geometry) }

        /**
         * Sets [Builder.geometry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geometry] with a well-typed [Geometry] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun geometry(geometry: JsonField<Geometry>) = apply { body.geometry(geometry) }

        /**
         * Requires option=flexible.
         *
         * Specify the type of hazardous material being carried and the service will avoid roads
         * which are not suitable for the type of goods specified. Multiple values can be separated
         * using a pipe operator "|".
         *
         * Please note that this parameter is effective only when mode=truck.
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
         * Set the driving mode the service should use to determine a route. In "car" mode, the API
         * will return a route that a car can take. Using "truck" mode will return a route a truck
         * can use, taking into account appropriate truck routing restrictions.
         *
         * When mode=truck, following are the default dimensions that are used:
         *
         * \- truck_height = 214 centimeters \- truck_width = 183 centimeters \- truck_length = 519
         * centimeters \- truck_weight = 5000 kg
         *
         * When option=flexible, you can use custom truck dimensions with truck_weight and
         * truck_size parameters.
         *
         * Note: Only the car profile is enabled by default. Please note that customized profiles
         * (including truck) might not be available for all regions. Please contact your
         * [NextBillion.ai](http://NextBillion.ai) account manager, sales representative or reach
         * out at [support@nextbillion.ai](mailto:support@nextbillion.ai) in case you need
         * additional profiles.
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
         * The option parameter specifies the version of the directions service to use. Setting
         * option=flexible activates the Flexible API, which supports advanced features like truck
         * routing, time-based routing, route type selection (fastest/shortest), and segment-wise
         * speed limits. If not set, the API defaults to the Fast version for real-time routing.
         */
        fun option(option: Option) = apply { body.option(option) }

        /**
         * Sets [Builder.option] to an arbitrary JSON value.
         *
         * You should usually call [Builder.option] with a well-typed [Option] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun option(option: JsonField<Option>) = apply { body.option(option) }

        /**
         * Specify the verbosity of route geometry.
         *
         * When set to full, the most detailed geometry available is returned. When set to
         * simplified, a simplified version of the full geometry is returned. No overview geometry
         * is returned when set to false.
         */
        fun overview(overview: Overview) = apply { body.overview(overview) }

        /**
         * Sets [Builder.overview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overview] with a well-typed [Overview] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun overview(overview: JsonField<Overview>) = apply { body.overview(overview) }

        /**
         * Requires option=flexible.
         *
         * An array of durations, in seconds, for which the driver should rest after completing the
         * corresponding continuous driving interval (provided in drive_time_limits). Multiple rest
         * times can be separated by a comma character ",". Ideally, the number of rest_times
         * provided should be equal to the number of drive_time_limits provided for proper
         * scheduling of driver breaks.
         *
         * As an example, a rest_times=\[500, 300\] means that driver can rest for 500 seconds after
         * the first continuous driving session and rest for 300 seconds after the next continuous
         * driving session.
         *
         * \- If the number of rest_times provided are less than the number of drive_time_limits,
         * the service will schedule a rest period of "0" seconds after each such drive time period
         * which does not have a corresponding entry in rest_times. \- If the number of rest_times
         * provided is more than the number of drive times provided, the additional rest times are
         * never applied.
         */
        fun restTimes(restTimes: String) = apply { body.restTimes(restTimes) }

        /**
         * Sets [Builder.restTimes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restTimes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun restTimes(restTimes: JsonField<String>) = apply { body.restTimes(restTimes) }

        /**
         * Requires option=flexible.
         *
         * Use this parameter to receive additional information about the road segments returned in
         * the response. Currently, following inputs are supported:
         *
         * \- max_speed : segment-wise maximum speed information of roads in the response. \-
         * toll_distance : returns the total distance travelled on the road segments having tolls.
         * \- toll_cost: returns the range of toll charges, in local currency, that can be incurred
         * for the suggested route.
         */
        fun roadInfo(roadInfo: RoadInfo) = apply { body.roadInfo(roadInfo) }

        /**
         * Sets [Builder.roadInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roadInfo] with a well-typed [RoadInfo] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun roadInfo(roadInfo: JsonField<RoadInfo>) = apply { body.roadInfo(roadInfo) }

        /**
         * Requires option=flexible.
         *
         * Set the route type that needs to be returned.
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
         * Set this to true to receive additional details about the routes and each of its legs
         * (details of geometry, start & end locations) in the response.
         */
        fun steps(steps: Boolean) = apply { body.steps(steps) }

        /**
         * Sets [Builder.steps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.steps] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun steps(steps: JsonField<Boolean>) = apply { body.steps(steps) }

        /**
         * Requires option=flexible.
         *
         * Specify the total load per axle (including the weight of trailers and shipped goods) of
         * the truck, in tonnes. When used, the service will return routes which are legally allowed
         * to carry the load specified per axle.
         *
         * Please note this parameter is effective only when mode=truck.
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
         * Requires option=flexible.
         *
         * This defines the dimensions of a truck in centimeters (CM). This parameter is effective
         * only when the mode=truck. Maximum dimensions are as follows:
         *
         * \- Height = 1000 cm \- Width = 5000 cm \- Length = 5000 cm
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
         * Requires option=flexible.
         *
         * This parameter defines the weight of the truck including trailers and shipped goods in
         * kilograms (KG). This parameter is effective only when mode=truck.
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

        /**
         * Requires option=flexible.
         *
         * Specify the turn angles that can be taken safely by the vehicle. The permissible turn
         * angles are calculated as \[0 + turn_angle_range , 360 - turn_angle_range\]. Please note
         * that this parameter is effective only when avoid=sharp_turn.
         *
         * It is worth highlighting here that providing smaller angles might lead to 4xx errors as
         * route engine might not be able find routes satisfying the smaller turn angle criteria for
         * all turns in the route.
         */
        fun turnAngleRange(turnAngleRange: Long) = apply { body.turnAngleRange(turnAngleRange) }

        /**
         * Sets [Builder.turnAngleRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.turnAngleRange] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun turnAngleRange(turnAngleRange: JsonField<Long>) = apply {
            body.turnAngleRange(turnAngleRange)
        }

        /** Pipe-separated list of coordinate pairs */
        fun waypoints(waypoints: String) = apply { body.waypoints(waypoints) }

        /**
         * Sets [Builder.waypoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.waypoints] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun waypoints(waypoints: JsonField<String>) = apply { body.waypoints(waypoints) }

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
         * Returns an immutable instance of [DirectionComputeRouteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .destination()
         * .origin()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DirectionComputeRouteParams =
            DirectionComputeRouteParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val destination: JsonField<String>,
        private val origin: JsonField<String>,
        private val altcount: JsonField<Long>,
        private val alternatives: JsonField<Boolean>,
        private val approaches: JsonField<String>,
        private val avoid: JsonField<Avoid>,
        private val bearings: JsonField<String>,
        private val crossBorder: JsonField<Boolean>,
        private val departureTime: JsonField<Long>,
        private val driveTimeLimits: JsonField<String>,
        private val emissionClass: JsonField<EmissionClass>,
        private val exclude: JsonField<Exclude>,
        private val geometry: JsonField<Geometry>,
        private val hazmatType: JsonField<HazmatType>,
        private val mode: JsonField<Mode>,
        private val option: JsonField<Option>,
        private val overview: JsonField<Overview>,
        private val restTimes: JsonField<String>,
        private val roadInfo: JsonField<RoadInfo>,
        private val routeType: JsonField<RouteType>,
        private val steps: JsonField<Boolean>,
        private val truckAxleLoad: JsonField<Double>,
        private val truckSize: JsonField<String>,
        private val truckWeight: JsonField<Long>,
        private val turnAngleRange: JsonField<Long>,
        private val waypoints: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("destination")
            @ExcludeMissing
            destination: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("altcount") @ExcludeMissing altcount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("alternatives")
            @ExcludeMissing
            alternatives: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("approaches")
            @ExcludeMissing
            approaches: JsonField<String> = JsonMissing.of(),
            @JsonProperty("avoid") @ExcludeMissing avoid: JsonField<Avoid> = JsonMissing.of(),
            @JsonProperty("bearings")
            @ExcludeMissing
            bearings: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cross_border")
            @ExcludeMissing
            crossBorder: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("departure_time")
            @ExcludeMissing
            departureTime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("drive_time_limits")
            @ExcludeMissing
            driveTimeLimits: JsonField<String> = JsonMissing.of(),
            @JsonProperty("emission_class")
            @ExcludeMissing
            emissionClass: JsonField<EmissionClass> = JsonMissing.of(),
            @JsonProperty("exclude") @ExcludeMissing exclude: JsonField<Exclude> = JsonMissing.of(),
            @JsonProperty("geometry")
            @ExcludeMissing
            geometry: JsonField<Geometry> = JsonMissing.of(),
            @JsonProperty("hazmat_type")
            @ExcludeMissing
            hazmatType: JsonField<HazmatType> = JsonMissing.of(),
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
            @JsonProperty("option") @ExcludeMissing option: JsonField<Option> = JsonMissing.of(),
            @JsonProperty("overview")
            @ExcludeMissing
            overview: JsonField<Overview> = JsonMissing.of(),
            @JsonProperty("rest_times")
            @ExcludeMissing
            restTimes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("road_info")
            @ExcludeMissing
            roadInfo: JsonField<RoadInfo> = JsonMissing.of(),
            @JsonProperty("route_type")
            @ExcludeMissing
            routeType: JsonField<RouteType> = JsonMissing.of(),
            @JsonProperty("steps") @ExcludeMissing steps: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("truck_axle_load")
            @ExcludeMissing
            truckAxleLoad: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("truck_size")
            @ExcludeMissing
            truckSize: JsonField<String> = JsonMissing.of(),
            @JsonProperty("truck_weight")
            @ExcludeMissing
            truckWeight: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("turn_angle_range")
            @ExcludeMissing
            turnAngleRange: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("waypoints")
            @ExcludeMissing
            waypoints: JsonField<String> = JsonMissing.of(),
        ) : this(
            destination,
            origin,
            altcount,
            alternatives,
            approaches,
            avoid,
            bearings,
            crossBorder,
            departureTime,
            driveTimeLimits,
            emissionClass,
            exclude,
            geometry,
            hazmatType,
            mode,
            option,
            overview,
            restTimes,
            roadInfo,
            routeType,
            steps,
            truckAxleLoad,
            truckSize,
            truckWeight,
            turnAngleRange,
            waypoints,
            mutableMapOf(),
        )

        /**
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destination(): String = destination.getRequired("destination")

        /**
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun origin(): String = origin.getRequired("origin")

        /**
         * Sets the number of alternative routes to return. It is effective only when
         * alternatives=true. Default to 3.
         *
         * Please note that adding alternative route count does not guarantee matching number of
         * routes to be returned if potential alternative routes do not exist.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun altcount(): Optional<Long> = altcount.getOptional("altcount")

        /**
         * When true the API will return alternate routes.
         *
         * The alternatives is effective only when there are no waypoints included in the request.
         *
         * You can set the number of alternate routes to be returned in the altcount property.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun alternatives(): Optional<Boolean> = alternatives.getOptional("alternatives")

        /**
         * A semicolon-separated list indicating the side of the road from which to approach
         * waypoints in a requested route.
         *
         * When set to unrestricted a route can arrive at the waypoint from either side of the road
         * and when set to curb the route will arrive at the waypoint on the driving side of the
         * region.
         *
         * Please note the number of values provided must be one more than the number of waypoints.
         * The last value of approaches will determine the approach for the destination. However,
         * you can skip a coordinate and show its position in the list with the ; separator.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun approaches(): Optional<String> = approaches.getOptional("approaches")

        /**
         * When option=fast (by default):
         *
         * Setting this will ensure the route avoids ferries, tolls, highways or nothing. Multiple
         * values should be separated by a pipe "|". If none is provided along with other values, an
         * error is returned as a valid route is not feasible.
         *
         * Please note that when this parameter is not provided in the input, ferries are set to be
         * avoided by default. When this parameter is provided, only the mentioned objects are
         * avoided.
         *
         * When option=flexible:
         *
         * Set this parameter to find alternative routes that bypass specified objects. Use a pipe
         * "|" to separate multiple values. This is a flexible filter; if no alternative routes
         * exist, the service will still provide a route that includes the objects. For a strict
         * filter, consider using the exclude parameter.
         *
         * \- This parameter is effective only when route_type=fastest. \- Following objects are
         * exceptions to the flexible filtering behavior of avoid parameter: bbox, tunnel and
         * geofence_id. When used, the service will return an error in case there are no alternative
         * routes available. \- When using avoid=bbox users also need to specify the boundaries of
         * the bounding box to be avoided. Multiple bounding boxes can be specified simultaneously.
         * The perimeter of a bounding box can not exceed 500 KM. Format:
         * bbox=min_latitude,min_longtitude,max_latitude,max_longitude. Example: avoid=bbox:
         * 34.0635,-118.2547, 34.0679,-118.2478 | bbox: 34.0521,-118.2342, 34.0478,-118.2437 \- When
         * using avoid=sharp_turn, default range of permissible turn angles is \[120,240\] in the
         * clockwise direction from the current road. In order to override default range, please use
         * turn_angle_range parameter. \- When using avoid=geofence_id, only the the geofences
         * created using [NextBillion.ai](http://NextBillion.ai) Geofence API are valid. \- When
         * this parameter is not provided in the input, ferry routes are set to be avoided by
         * default. When this parameter is provided, only the mentioned object(s) are avoided. \- If
         * none is provided along with other values, an error is returned as a valid route is not
         * feasible.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun avoid(): Optional<Avoid> = avoid.getOptional("avoid")

        /**
         * Limits the search to road segments with given bearing, in degrees, towards true north in
         * clockwise direction. Each bearings should be in the format of degree,range, where the
         * degree should be a value between \[0, 360\] and range should be a value between \[0,
         * 180\].
         *
         * Please note that the number of bearings should be two more than the number of waypoints.
         * This is to account for the bearing of origin and destination. If a route can approach a
         * waypoint or the destination from any direction, the bearing for that point can be
         * specified as "0,180".
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun bearings(): Optional<String> = bearings.getOptional("bearings")

        /**
         * Requires option=flexible.
         *
         * Specify if crossing an international border is expected for operations near border areas.
         * When set to false, the API will prohibit routes crossing the borders. When set to true,
         * the service will return routes which cross the borders between countries, if required for
         * the given set destination and waypoints.
         *
         * This feature is available in North America region only. Please get in touch with
         * [support@nextbillion.ai](mailto:support@nextbillion.ai) to enquire/enable other areas.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun crossBorder(): Optional<Boolean> = crossBorder.getOptional("cross_border")

        /**
         * Requires option=flexible.
         *
         * Use this parameter to set a departure time, expressed as UNIX epoch timestamp in seconds,
         * for calculating the isochrone contour. The response will consider the typical traffic
         * conditions at the given time and return a contour which can be reached under those
         * traffic conditions.
         *
         * Please note that if no input is provided for this parameter then the traffic conditions
         * at the time of making the request are considered.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun departureTime(): Optional<Long> = departureTime.getOptional("departure_time")

        /**
         * Requires option=flexible.
         *
         * An array of durations, in seconds, for which the driver can drive continuously before
         * taking a rest. Multiple drive time limits can be separated by a comma character ",".
         * After driving for the given duration the driver will take a rest for a fixed period,
         * specified in rest_times . Once the rest duration is over, the subsequent driving duration
         * starts and the process continues until all drive times and rest periods are exhausted or
         * if the driver reaches the destination. This feature is useful in complying with Hours of
         * Service regulations and calculates actual ETAs with regulated driving periods.
         *
         * As an example, a drive_time_limits=\[500, 300\] means that driver can drive for 500
         * seconds before the first rest period and then drive for another 300 seconds before taking
         * a rest next time.
         *
         * \- If the trip duration is smaller than the first input of drive_time_limits, then there
         * will be no rest actions scheduled by the service. \- If the trip duration is larger than
         * the scheduled time, then a "warning" is returned in the response - along with details of
         * last leg of the trip - to indicate the same.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun driveTimeLimits(): Optional<String> = driveTimeLimits.getOptional("drive_time_limits")

        /**
         * Requires option=flexible.
         *
         * Specify the emission class to which the vehicle (engine) belongs to. The service will use
         * this setting to generate routes that are permissible for that engine class. Only the
         * emission classifications in the EU regions are supported currently. Please reach out to
         * [support@nextbillion.ai](mailto:support@nextbillion.ai) to enable for your region.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun emissionClass(): Optional<EmissionClass> = emissionClass.getOptional("emission_class")

        /**
         * Requires option=flexible.
         *
         * This parameter serves as a mandatory filter, ensuring the service returns only those
         * routes that strictly avoid the object(s) indicated. Multiple values should be separated
         * by a pipe |). If no routes can be found that exclude the specified object(s), the service
         * will return an error. For a less strict filtering approach, consider using the avoid
         * parameter.
         *
         * \- This parameter is effective only when route_type=fastest. \- When using
         * exclude=sharp_turn, default range of permissible turn angles is \[120,240\]. In order to
         * override default range, please use turn_angle_range parameter. \- If none is provided
         * along with other values, an error is returned as a valid route is not feasible.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun exclude(): Optional<Exclude> = exclude.getOptional("exclude")

        /**
         * Sets the output format of the route geometry in the response.
         *
         * On providing polyline and polyline6 as input, respective encoded geometry is returned.
         * However, when geojson is provided as the input value, polyline encoded geometry is
         * returned in the response along with the geojson details of the route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geometry(): Optional<Geometry> = geometry.getOptional("geometry")

        /**
         * Requires option=flexible.
         *
         * Specify the type of hazardous material being carried and the service will avoid roads
         * which are not suitable for the type of goods specified. Multiple values can be separated
         * using a pipe operator "|".
         *
         * Please note that this parameter is effective only when mode=truck.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun hazmatType(): Optional<HazmatType> = hazmatType.getOptional("hazmat_type")

        /**
         * Set the driving mode the service should use to determine a route. In "car" mode, the API
         * will return a route that a car can take. Using "truck" mode will return a route a truck
         * can use, taking into account appropriate truck routing restrictions.
         *
         * When mode=truck, following are the default dimensions that are used:
         *
         * \- truck_height = 214 centimeters \- truck_width = 183 centimeters \- truck_length = 519
         * centimeters \- truck_weight = 5000 kg
         *
         * When option=flexible, you can use custom truck dimensions with truck_weight and
         * truck_size parameters.
         *
         * Note: Only the car profile is enabled by default. Please note that customized profiles
         * (including truck) might not be available for all regions. Please contact your
         * [NextBillion.ai](http://NextBillion.ai) account manager, sales representative or reach
         * out at [support@nextbillion.ai](mailto:support@nextbillion.ai) in case you need
         * additional profiles.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun mode(): Optional<Mode> = mode.getOptional("mode")

        /**
         * The option parameter specifies the version of the directions service to use. Setting
         * option=flexible activates the Flexible API, which supports advanced features like truck
         * routing, time-based routing, route type selection (fastest/shortest), and segment-wise
         * speed limits. If not set, the API defaults to the Fast version for real-time routing.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun option(): Optional<Option> = option.getOptional("option")

        /**
         * Specify the verbosity of route geometry.
         *
         * When set to full, the most detailed geometry available is returned. When set to
         * simplified, a simplified version of the full geometry is returned. No overview geometry
         * is returned when set to false.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun overview(): Optional<Overview> = overview.getOptional("overview")

        /**
         * Requires option=flexible.
         *
         * An array of durations, in seconds, for which the driver should rest after completing the
         * corresponding continuous driving interval (provided in drive_time_limits). Multiple rest
         * times can be separated by a comma character ",". Ideally, the number of rest_times
         * provided should be equal to the number of drive_time_limits provided for proper
         * scheduling of driver breaks.
         *
         * As an example, a rest_times=\[500, 300\] means that driver can rest for 500 seconds after
         * the first continuous driving session and rest for 300 seconds after the next continuous
         * driving session.
         *
         * \- If the number of rest_times provided are less than the number of drive_time_limits,
         * the service will schedule a rest period of "0" seconds after each such drive time period
         * which does not have a corresponding entry in rest_times. \- If the number of rest_times
         * provided is more than the number of drive times provided, the additional rest times are
         * never applied.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun restTimes(): Optional<String> = restTimes.getOptional("rest_times")

        /**
         * Requires option=flexible.
         *
         * Use this parameter to receive additional information about the road segments returned in
         * the response. Currently, following inputs are supported:
         *
         * \- max_speed : segment-wise maximum speed information of roads in the response. \-
         * toll_distance : returns the total distance travelled on the road segments having tolls.
         * \- toll_cost: returns the range of toll charges, in local currency, that can be incurred
         * for the suggested route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun roadInfo(): Optional<RoadInfo> = roadInfo.getOptional("road_info")

        /**
         * Requires option=flexible.
         *
         * Set the route type that needs to be returned.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun routeType(): Optional<RouteType> = routeType.getOptional("route_type")

        /**
         * Set this to true to receive additional details about the routes and each of its legs
         * (details of geometry, start & end locations) in the response.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun steps(): Optional<Boolean> = steps.getOptional("steps")

        /**
         * Requires option=flexible.
         *
         * Specify the total load per axle (including the weight of trailers and shipped goods) of
         * the truck, in tonnes. When used, the service will return routes which are legally allowed
         * to carry the load specified per axle.
         *
         * Please note this parameter is effective only when mode=truck.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun truckAxleLoad(): Optional<Double> = truckAxleLoad.getOptional("truck_axle_load")

        /**
         * Requires option=flexible.
         *
         * This defines the dimensions of a truck in centimeters (CM). This parameter is effective
         * only when the mode=truck. Maximum dimensions are as follows:
         *
         * \- Height = 1000 cm \- Width = 5000 cm \- Length = 5000 cm
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun truckSize(): Optional<String> = truckSize.getOptional("truck_size")

        /**
         * Requires option=flexible.
         *
         * This parameter defines the weight of the truck including trailers and shipped goods in
         * kilograms (KG). This parameter is effective only when mode=truck.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun truckWeight(): Optional<Long> = truckWeight.getOptional("truck_weight")

        /**
         * Requires option=flexible.
         *
         * Specify the turn angles that can be taken safely by the vehicle. The permissible turn
         * angles are calculated as \[0 + turn_angle_range , 360 - turn_angle_range\]. Please note
         * that this parameter is effective only when avoid=sharp_turn.
         *
         * It is worth highlighting here that providing smaller angles might lead to 4xx errors as
         * route engine might not be able find routes satisfying the smaller turn angle criteria for
         * all turns in the route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun turnAngleRange(): Optional<Long> = turnAngleRange.getOptional("turn_angle_range")

        /**
         * Pipe-separated list of coordinate pairs
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun waypoints(): Optional<String> = waypoints.getOptional("waypoints")

        /**
         * Returns the raw JSON value of [destination].
         *
         * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("destination")
        @ExcludeMissing
        fun _destination(): JsonField<String> = destination

        /**
         * Returns the raw JSON value of [origin].
         *
         * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<String> = origin

        /**
         * Returns the raw JSON value of [altcount].
         *
         * Unlike [altcount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("altcount") @ExcludeMissing fun _altcount(): JsonField<Long> = altcount

        /**
         * Returns the raw JSON value of [alternatives].
         *
         * Unlike [alternatives], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("alternatives")
        @ExcludeMissing
        fun _alternatives(): JsonField<Boolean> = alternatives

        /**
         * Returns the raw JSON value of [approaches].
         *
         * Unlike [approaches], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("approaches")
        @ExcludeMissing
        fun _approaches(): JsonField<String> = approaches

        /**
         * Returns the raw JSON value of [avoid].
         *
         * Unlike [avoid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("avoid") @ExcludeMissing fun _avoid(): JsonField<Avoid> = avoid

        /**
         * Returns the raw JSON value of [bearings].
         *
         * Unlike [bearings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bearings") @ExcludeMissing fun _bearings(): JsonField<String> = bearings

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
         * Returns the raw JSON value of [driveTimeLimits].
         *
         * Unlike [driveTimeLimits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("drive_time_limits")
        @ExcludeMissing
        fun _driveTimeLimits(): JsonField<String> = driveTimeLimits

        /**
         * Returns the raw JSON value of [emissionClass].
         *
         * Unlike [emissionClass], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("emission_class")
        @ExcludeMissing
        fun _emissionClass(): JsonField<EmissionClass> = emissionClass

        /**
         * Returns the raw JSON value of [exclude].
         *
         * Unlike [exclude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("exclude") @ExcludeMissing fun _exclude(): JsonField<Exclude> = exclude

        /**
         * Returns the raw JSON value of [geometry].
         *
         * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("geometry") @ExcludeMissing fun _geometry(): JsonField<Geometry> = geometry

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
         * Returns the raw JSON value of [option].
         *
         * Unlike [option], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("option") @ExcludeMissing fun _option(): JsonField<Option> = option

        /**
         * Returns the raw JSON value of [overview].
         *
         * Unlike [overview], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("overview") @ExcludeMissing fun _overview(): JsonField<Overview> = overview

        /**
         * Returns the raw JSON value of [restTimes].
         *
         * Unlike [restTimes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rest_times") @ExcludeMissing fun _restTimes(): JsonField<String> = restTimes

        /**
         * Returns the raw JSON value of [roadInfo].
         *
         * Unlike [roadInfo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("road_info") @ExcludeMissing fun _roadInfo(): JsonField<RoadInfo> = roadInfo

        /**
         * Returns the raw JSON value of [routeType].
         *
         * Unlike [routeType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("route_type")
        @ExcludeMissing
        fun _routeType(): JsonField<RouteType> = routeType

        /**
         * Returns the raw JSON value of [steps].
         *
         * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("steps") @ExcludeMissing fun _steps(): JsonField<Boolean> = steps

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

        /**
         * Returns the raw JSON value of [turnAngleRange].
         *
         * Unlike [turnAngleRange], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("turn_angle_range")
        @ExcludeMissing
        fun _turnAngleRange(): JsonField<Long> = turnAngleRange

        /**
         * Returns the raw JSON value of [waypoints].
         *
         * Unlike [waypoints], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("waypoints") @ExcludeMissing fun _waypoints(): JsonField<String> = waypoints

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
             * .destination()
             * .origin()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var destination: JsonField<String>? = null
            private var origin: JsonField<String>? = null
            private var altcount: JsonField<Long> = JsonMissing.of()
            private var alternatives: JsonField<Boolean> = JsonMissing.of()
            private var approaches: JsonField<String> = JsonMissing.of()
            private var avoid: JsonField<Avoid> = JsonMissing.of()
            private var bearings: JsonField<String> = JsonMissing.of()
            private var crossBorder: JsonField<Boolean> = JsonMissing.of()
            private var departureTime: JsonField<Long> = JsonMissing.of()
            private var driveTimeLimits: JsonField<String> = JsonMissing.of()
            private var emissionClass: JsonField<EmissionClass> = JsonMissing.of()
            private var exclude: JsonField<Exclude> = JsonMissing.of()
            private var geometry: JsonField<Geometry> = JsonMissing.of()
            private var hazmatType: JsonField<HazmatType> = JsonMissing.of()
            private var mode: JsonField<Mode> = JsonMissing.of()
            private var option: JsonField<Option> = JsonMissing.of()
            private var overview: JsonField<Overview> = JsonMissing.of()
            private var restTimes: JsonField<String> = JsonMissing.of()
            private var roadInfo: JsonField<RoadInfo> = JsonMissing.of()
            private var routeType: JsonField<RouteType> = JsonMissing.of()
            private var steps: JsonField<Boolean> = JsonMissing.of()
            private var truckAxleLoad: JsonField<Double> = JsonMissing.of()
            private var truckSize: JsonField<String> = JsonMissing.of()
            private var truckWeight: JsonField<Long> = JsonMissing.of()
            private var turnAngleRange: JsonField<Long> = JsonMissing.of()
            private var waypoints: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                destination = body.destination
                origin = body.origin
                altcount = body.altcount
                alternatives = body.alternatives
                approaches = body.approaches
                avoid = body.avoid
                bearings = body.bearings
                crossBorder = body.crossBorder
                departureTime = body.departureTime
                driveTimeLimits = body.driveTimeLimits
                emissionClass = body.emissionClass
                exclude = body.exclude
                geometry = body.geometry
                hazmatType = body.hazmatType
                mode = body.mode
                option = body.option
                overview = body.overview
                restTimes = body.restTimes
                roadInfo = body.roadInfo
                routeType = body.routeType
                steps = body.steps
                truckAxleLoad = body.truckAxleLoad
                truckSize = body.truckSize
                truckWeight = body.truckWeight
                turnAngleRange = body.turnAngleRange
                waypoints = body.waypoints
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun destination(destination: String) = destination(JsonField.of(destination))

            /**
             * Sets [Builder.destination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destination] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destination(destination: JsonField<String>) = apply {
                this.destination = destination
            }

            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) = apply { this.origin = origin }

            /**
             * Sets the number of alternative routes to return. It is effective only when
             * alternatives=true. Default to 3.
             *
             * Please note that adding alternative route count does not guarantee matching number of
             * routes to be returned if potential alternative routes do not exist.
             */
            fun altcount(altcount: Long) = altcount(JsonField.of(altcount))

            /**
             * Sets [Builder.altcount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altcount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun altcount(altcount: JsonField<Long>) = apply { this.altcount = altcount }

            /**
             * When true the API will return alternate routes.
             *
             * The alternatives is effective only when there are no waypoints included in the
             * request.
             *
             * You can set the number of alternate routes to be returned in the altcount property.
             */
            fun alternatives(alternatives: Boolean) = alternatives(JsonField.of(alternatives))

            /**
             * Sets [Builder.alternatives] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alternatives] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alternatives(alternatives: JsonField<Boolean>) = apply {
                this.alternatives = alternatives
            }

            /**
             * A semicolon-separated list indicating the side of the road from which to approach
             * waypoints in a requested route.
             *
             * When set to unrestricted a route can arrive at the waypoint from either side of the
             * road and when set to curb the route will arrive at the waypoint on the driving side
             * of the region.
             *
             * Please note the number of values provided must be one more than the number of
             * waypoints. The last value of approaches will determine the approach for the
             * destination. However, you can skip a coordinate and show its position in the list
             * with the ; separator.
             */
            fun approaches(approaches: String) = approaches(JsonField.of(approaches))

            /**
             * Sets [Builder.approaches] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approaches] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun approaches(approaches: JsonField<String>) = apply { this.approaches = approaches }

            /**
             * When option=fast (by default):
             *
             * Setting this will ensure the route avoids ferries, tolls, highways or nothing.
             * Multiple values should be separated by a pipe "|". If none is provided along with
             * other values, an error is returned as a valid route is not feasible.
             *
             * Please note that when this parameter is not provided in the input, ferries are set to
             * be avoided by default. When this parameter is provided, only the mentioned objects
             * are avoided.
             *
             * When option=flexible:
             *
             * Set this parameter to find alternative routes that bypass specified objects. Use a
             * pipe "|" to separate multiple values. This is a flexible filter; if no alternative
             * routes exist, the service will still provide a route that includes the objects. For a
             * strict filter, consider using the exclude parameter.
             *
             * \- This parameter is effective only when route_type=fastest. \- Following objects are
             * exceptions to the flexible filtering behavior of avoid parameter: bbox, tunnel and
             * geofence_id. When used, the service will return an error in case there are no
             * alternative routes available. \- When using avoid=bbox users also need to specify the
             * boundaries of the bounding box to be avoided. Multiple bounding boxes can be
             * specified simultaneously. The perimeter of a bounding box can not exceed 500 KM.
             * Format: bbox=min_latitude,min_longtitude,max_latitude,max_longitude. Example:
             * avoid=bbox: 34.0635,-118.2547, 34.0679,-118.2478 | bbox: 34.0521,-118.2342,
             * 34.0478,-118.2437 \- When using avoid=sharp_turn, default range of permissible turn
             * angles is \[120,240\] in the clockwise direction from the current road. In order to
             * override default range, please use turn_angle_range parameter. \- When using
             * avoid=geofence_id, only the the geofences created using
             * [NextBillion.ai](http://NextBillion.ai) Geofence API are valid. \- When this
             * parameter is not provided in the input, ferry routes are set to be avoided by
             * default. When this parameter is provided, only the mentioned object(s) are avoided.
             * \- If none is provided along with other values, an error is returned as a valid route
             * is not feasible.
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
             * Limits the search to road segments with given bearing, in degrees, towards true north
             * in clockwise direction. Each bearings should be in the format of degree,range, where
             * the degree should be a value between \[0, 360\] and range should be a value between
             * \[0, 180\].
             *
             * Please note that the number of bearings should be two more than the number of
             * waypoints. This is to account for the bearing of origin and destination. If a route
             * can approach a waypoint or the destination from any direction, the bearing for that
             * point can be specified as "0,180".
             */
            fun bearings(bearings: String) = bearings(JsonField.of(bearings))

            /**
             * Sets [Builder.bearings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bearings] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bearings(bearings: JsonField<String>) = apply { this.bearings = bearings }

            /**
             * Requires option=flexible.
             *
             * Specify if crossing an international border is expected for operations near border
             * areas. When set to false, the API will prohibit routes crossing the borders. When set
             * to true, the service will return routes which cross the borders between countries, if
             * required for the given set destination and waypoints.
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
             * Requires option=flexible.
             *
             * Use this parameter to set a departure time, expressed as UNIX epoch timestamp in
             * seconds, for calculating the isochrone contour. The response will consider the
             * typical traffic conditions at the given time and return a contour which can be
             * reached under those traffic conditions.
             *
             * Please note that if no input is provided for this parameter then the traffic
             * conditions at the time of making the request are considered.
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
             * Requires option=flexible.
             *
             * An array of durations, in seconds, for which the driver can drive continuously before
             * taking a rest. Multiple drive time limits can be separated by a comma character ",".
             * After driving for the given duration the driver will take a rest for a fixed period,
             * specified in rest_times . Once the rest duration is over, the subsequent driving
             * duration starts and the process continues until all drive times and rest periods are
             * exhausted or if the driver reaches the destination. This feature is useful in
             * complying with Hours of Service regulations and calculates actual ETAs with regulated
             * driving periods.
             *
             * As an example, a drive_time_limits=\[500, 300\] means that driver can drive for 500
             * seconds before the first rest period and then drive for another 300 seconds before
             * taking a rest next time.
             *
             * \- If the trip duration is smaller than the first input of drive_time_limits, then
             * there will be no rest actions scheduled by the service. \- If the trip duration is
             * larger than the scheduled time, then a "warning" is returned in the response - along
             * with details of last leg of the trip - to indicate the same.
             */
            fun driveTimeLimits(driveTimeLimits: String) =
                driveTimeLimits(JsonField.of(driveTimeLimits))

            /**
             * Sets [Builder.driveTimeLimits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.driveTimeLimits] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun driveTimeLimits(driveTimeLimits: JsonField<String>) = apply {
                this.driveTimeLimits = driveTimeLimits
            }

            /**
             * Requires option=flexible.
             *
             * Specify the emission class to which the vehicle (engine) belongs to. The service will
             * use this setting to generate routes that are permissible for that engine class. Only
             * the emission classifications in the EU regions are supported currently. Please reach
             * out to [support@nextbillion.ai](mailto:support@nextbillion.ai) to enable for your
             * region.
             */
            fun emissionClass(emissionClass: EmissionClass) =
                emissionClass(JsonField.of(emissionClass))

            /**
             * Sets [Builder.emissionClass] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emissionClass] with a well-typed [EmissionClass]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun emissionClass(emissionClass: JsonField<EmissionClass>) = apply {
                this.emissionClass = emissionClass
            }

            /**
             * Requires option=flexible.
             *
             * This parameter serves as a mandatory filter, ensuring the service returns only those
             * routes that strictly avoid the object(s) indicated. Multiple values should be
             * separated by a pipe |). If no routes can be found that exclude the specified
             * object(s), the service will return an error. For a less strict filtering approach,
             * consider using the avoid parameter.
             *
             * \- This parameter is effective only when route_type=fastest. \- When using
             * exclude=sharp_turn, default range of permissible turn angles is \[120,240\]. In order
             * to override default range, please use turn_angle_range parameter. \- If none is
             * provided along with other values, an error is returned as a valid route is not
             * feasible.
             */
            fun exclude(exclude: Exclude) = exclude(JsonField.of(exclude))

            /**
             * Sets [Builder.exclude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exclude] with a well-typed [Exclude] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exclude(exclude: JsonField<Exclude>) = apply { this.exclude = exclude }

            /**
             * Sets the output format of the route geometry in the response.
             *
             * On providing polyline and polyline6 as input, respective encoded geometry is
             * returned. However, when geojson is provided as the input value, polyline encoded
             * geometry is returned in the response along with the geojson details of the route.
             */
            fun geometry(geometry: Geometry) = geometry(JsonField.of(geometry))

            /**
             * Sets [Builder.geometry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geometry] with a well-typed [Geometry] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geometry(geometry: JsonField<Geometry>) = apply { this.geometry = geometry }

            /**
             * Requires option=flexible.
             *
             * Specify the type of hazardous material being carried and the service will avoid roads
             * which are not suitable for the type of goods specified. Multiple values can be
             * separated using a pipe operator "|".
             *
             * Please note that this parameter is effective only when mode=truck.
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
             * Set the driving mode the service should use to determine a route. In "car" mode, the
             * API will return a route that a car can take. Using "truck" mode will return a route a
             * truck can use, taking into account appropriate truck routing restrictions.
             *
             * When mode=truck, following are the default dimensions that are used:
             *
             * \- truck_height = 214 centimeters \- truck_width = 183 centimeters \- truck_length =
             * 519 centimeters \- truck_weight = 5000 kg
             *
             * When option=flexible, you can use custom truck dimensions with truck_weight and
             * truck_size parameters.
             *
             * Note: Only the car profile is enabled by default. Please note that customized
             * profiles (including truck) might not be available for all regions. Please contact
             * your [NextBillion.ai](http://NextBillion.ai) account manager, sales representative or
             * reach out at [support@nextbillion.ai](mailto:support@nextbillion.ai) in case you need
             * additional profiles.
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
             * The option parameter specifies the version of the directions service to use. Setting
             * option=flexible activates the Flexible API, which supports advanced features like
             * truck routing, time-based routing, route type selection (fastest/shortest), and
             * segment-wise speed limits. If not set, the API defaults to the Fast version for
             * real-time routing.
             */
            fun option(option: Option) = option(JsonField.of(option))

            /**
             * Sets [Builder.option] to an arbitrary JSON value.
             *
             * You should usually call [Builder.option] with a well-typed [Option] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun option(option: JsonField<Option>) = apply { this.option = option }

            /**
             * Specify the verbosity of route geometry.
             *
             * When set to full, the most detailed geometry available is returned. When set to
             * simplified, a simplified version of the full geometry is returned. No overview
             * geometry is returned when set to false.
             */
            fun overview(overview: Overview) = overview(JsonField.of(overview))

            /**
             * Sets [Builder.overview] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overview] with a well-typed [Overview] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overview(overview: JsonField<Overview>) = apply { this.overview = overview }

            /**
             * Requires option=flexible.
             *
             * An array of durations, in seconds, for which the driver should rest after completing
             * the corresponding continuous driving interval (provided in drive_time_limits).
             * Multiple rest times can be separated by a comma character ",". Ideally, the number of
             * rest_times provided should be equal to the number of drive_time_limits provided for
             * proper scheduling of driver breaks.
             *
             * As an example, a rest_times=\[500, 300\] means that driver can rest for 500 seconds
             * after the first continuous driving session and rest for 300 seconds after the next
             * continuous driving session.
             *
             * \- If the number of rest_times provided are less than the number of
             * drive_time_limits, the service will schedule a rest period of "0" seconds after each
             * such drive time period which does not have a corresponding entry in rest_times. \- If
             * the number of rest_times provided is more than the number of drive times provided,
             * the additional rest times are never applied.
             */
            fun restTimes(restTimes: String) = restTimes(JsonField.of(restTimes))

            /**
             * Sets [Builder.restTimes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.restTimes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun restTimes(restTimes: JsonField<String>) = apply { this.restTimes = restTimes }

            /**
             * Requires option=flexible.
             *
             * Use this parameter to receive additional information about the road segments returned
             * in the response. Currently, following inputs are supported:
             *
             * \- max_speed : segment-wise maximum speed information of roads in the response. \-
             * toll_distance : returns the total distance travelled on the road segments having
             * tolls. \- toll_cost: returns the range of toll charges, in local currency, that can
             * be incurred for the suggested route.
             */
            fun roadInfo(roadInfo: RoadInfo) = roadInfo(JsonField.of(roadInfo))

            /**
             * Sets [Builder.roadInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roadInfo] with a well-typed [RoadInfo] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roadInfo(roadInfo: JsonField<RoadInfo>) = apply { this.roadInfo = roadInfo }

            /**
             * Requires option=flexible.
             *
             * Set the route type that needs to be returned.
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
             * Set this to true to receive additional details about the routes and each of its legs
             * (details of geometry, start & end locations) in the response.
             */
            fun steps(steps: Boolean) = steps(JsonField.of(steps))

            /**
             * Sets [Builder.steps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.steps] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun steps(steps: JsonField<Boolean>) = apply { this.steps = steps }

            /**
             * Requires option=flexible.
             *
             * Specify the total load per axle (including the weight of trailers and shipped goods)
             * of the truck, in tonnes. When used, the service will return routes which are legally
             * allowed to carry the load specified per axle.
             *
             * Please note this parameter is effective only when mode=truck.
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
             * Requires option=flexible.
             *
             * This defines the dimensions of a truck in centimeters (CM). This parameter is
             * effective only when the mode=truck. Maximum dimensions are as follows:
             *
             * \- Height = 1000 cm \- Width = 5000 cm \- Length = 5000 cm
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
             * Requires option=flexible.
             *
             * This parameter defines the weight of the truck including trailers and shipped goods
             * in kilograms (KG). This parameter is effective only when mode=truck.
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

            /**
             * Requires option=flexible.
             *
             * Specify the turn angles that can be taken safely by the vehicle. The permissible turn
             * angles are calculated as \[0 + turn_angle_range , 360 - turn_angle_range\]. Please
             * note that this parameter is effective only when avoid=sharp_turn.
             *
             * It is worth highlighting here that providing smaller angles might lead to 4xx errors
             * as route engine might not be able find routes satisfying the smaller turn angle
             * criteria for all turns in the route.
             */
            fun turnAngleRange(turnAngleRange: Long) = turnAngleRange(JsonField.of(turnAngleRange))

            /**
             * Sets [Builder.turnAngleRange] to an arbitrary JSON value.
             *
             * You should usually call [Builder.turnAngleRange] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun turnAngleRange(turnAngleRange: JsonField<Long>) = apply {
                this.turnAngleRange = turnAngleRange
            }

            /** Pipe-separated list of coordinate pairs */
            fun waypoints(waypoints: String) = waypoints(JsonField.of(waypoints))

            /**
             * Sets [Builder.waypoints] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waypoints] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun waypoints(waypoints: JsonField<String>) = apply { this.waypoints = waypoints }

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
             * .destination()
             * .origin()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("destination", destination),
                    checkRequired("origin", origin),
                    altcount,
                    alternatives,
                    approaches,
                    avoid,
                    bearings,
                    crossBorder,
                    departureTime,
                    driveTimeLimits,
                    emissionClass,
                    exclude,
                    geometry,
                    hazmatType,
                    mode,
                    option,
                    overview,
                    restTimes,
                    roadInfo,
                    routeType,
                    steps,
                    truckAxleLoad,
                    truckSize,
                    truckWeight,
                    turnAngleRange,
                    waypoints,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            destination()
            origin()
            altcount()
            alternatives()
            approaches()
            avoid().ifPresent { it.validate() }
            bearings()
            crossBorder()
            departureTime()
            driveTimeLimits()
            emissionClass().ifPresent { it.validate() }
            exclude().ifPresent { it.validate() }
            geometry().ifPresent { it.validate() }
            hazmatType().ifPresent { it.validate() }
            mode().ifPresent { it.validate() }
            option().ifPresent { it.validate() }
            overview().ifPresent { it.validate() }
            restTimes()
            roadInfo().ifPresent { it.validate() }
            routeType().ifPresent { it.validate() }
            steps()
            truckAxleLoad()
            truckSize()
            truckWeight()
            turnAngleRange()
            waypoints()
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
            (if (destination.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (altcount.asKnown().isPresent) 1 else 0) +
                (if (alternatives.asKnown().isPresent) 1 else 0) +
                (if (approaches.asKnown().isPresent) 1 else 0) +
                (avoid.asKnown().getOrNull()?.validity() ?: 0) +
                (if (bearings.asKnown().isPresent) 1 else 0) +
                (if (crossBorder.asKnown().isPresent) 1 else 0) +
                (if (departureTime.asKnown().isPresent) 1 else 0) +
                (if (driveTimeLimits.asKnown().isPresent) 1 else 0) +
                (emissionClass.asKnown().getOrNull()?.validity() ?: 0) +
                (exclude.asKnown().getOrNull()?.validity() ?: 0) +
                (geometry.asKnown().getOrNull()?.validity() ?: 0) +
                (hazmatType.asKnown().getOrNull()?.validity() ?: 0) +
                (mode.asKnown().getOrNull()?.validity() ?: 0) +
                (option.asKnown().getOrNull()?.validity() ?: 0) +
                (overview.asKnown().getOrNull()?.validity() ?: 0) +
                (if (restTimes.asKnown().isPresent) 1 else 0) +
                (roadInfo.asKnown().getOrNull()?.validity() ?: 0) +
                (routeType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (steps.asKnown().isPresent) 1 else 0) +
                (if (truckAxleLoad.asKnown().isPresent) 1 else 0) +
                (if (truckSize.asKnown().isPresent) 1 else 0) +
                (if (truckWeight.asKnown().isPresent) 1 else 0) +
                (if (turnAngleRange.asKnown().isPresent) 1 else 0) +
                (if (waypoints.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                destination == other.destination &&
                origin == other.origin &&
                altcount == other.altcount &&
                alternatives == other.alternatives &&
                approaches == other.approaches &&
                avoid == other.avoid &&
                bearings == other.bearings &&
                crossBorder == other.crossBorder &&
                departureTime == other.departureTime &&
                driveTimeLimits == other.driveTimeLimits &&
                emissionClass == other.emissionClass &&
                exclude == other.exclude &&
                geometry == other.geometry &&
                hazmatType == other.hazmatType &&
                mode == other.mode &&
                option == other.option &&
                overview == other.overview &&
                restTimes == other.restTimes &&
                roadInfo == other.roadInfo &&
                routeType == other.routeType &&
                steps == other.steps &&
                truckAxleLoad == other.truckAxleLoad &&
                truckSize == other.truckSize &&
                truckWeight == other.truckWeight &&
                turnAngleRange == other.turnAngleRange &&
                waypoints == other.waypoints &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                destination,
                origin,
                altcount,
                alternatives,
                approaches,
                avoid,
                bearings,
                crossBorder,
                departureTime,
                driveTimeLimits,
                emissionClass,
                exclude,
                geometry,
                hazmatType,
                mode,
                option,
                overview,
                restTimes,
                roadInfo,
                routeType,
                steps,
                truckAxleLoad,
                truckSize,
                truckWeight,
                turnAngleRange,
                waypoints,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{destination=$destination, origin=$origin, altcount=$altcount, alternatives=$alternatives, approaches=$approaches, avoid=$avoid, bearings=$bearings, crossBorder=$crossBorder, departureTime=$departureTime, driveTimeLimits=$driveTimeLimits, emissionClass=$emissionClass, exclude=$exclude, geometry=$geometry, hazmatType=$hazmatType, mode=$mode, option=$option, overview=$overview, restTimes=$restTimes, roadInfo=$roadInfo, routeType=$routeType, steps=$steps, truckAxleLoad=$truckAxleLoad, truckSize=$truckSize, truckWeight=$truckWeight, turnAngleRange=$turnAngleRange, waypoints=$waypoints, additionalProperties=$additionalProperties}"
    }

    /**
     * When option=fast (by default):
     *
     * Setting this will ensure the route avoids ferries, tolls, highways or nothing. Multiple
     * values should be separated by a pipe "|". If none is provided along with other values, an
     * error is returned as a valid route is not feasible.
     *
     * Please note that when this parameter is not provided in the input, ferries are set to be
     * avoided by default. When this parameter is provided, only the mentioned objects are avoided.
     *
     * When option=flexible:
     *
     * Set this parameter to find alternative routes that bypass specified objects. Use a pipe "|"
     * to separate multiple values. This is a flexible filter; if no alternative routes exist, the
     * service will still provide a route that includes the objects. For a strict filter, consider
     * using the exclude parameter.
     *
     * \- This parameter is effective only when route_type=fastest. \- Following objects are
     * exceptions to the flexible filtering behavior of avoid parameter: bbox, tunnel and
     * geofence_id. When used, the service will return an error in case there are no alternative
     * routes available. \- When using avoid=bbox users also need to specify the boundaries of the
     * bounding box to be avoided. Multiple bounding boxes can be specified simultaneously. The
     * perimeter of a bounding box can not exceed 500 KM. Format:
     * bbox=min_latitude,min_longtitude,max_latitude,max_longitude. Example: avoid=bbox:
     * 34.0635,-118.2547, 34.0679,-118.2478 | bbox: 34.0521,-118.2342, 34.0478,-118.2437 \- When
     * using avoid=sharp_turn, default range of permissible turn angles is \[120,240\] in the
     * clockwise direction from the current road. In order to override default range, please use
     * turn_angle_range parameter. \- When using avoid=geofence_id, only the the geofences created
     * using [NextBillion.ai](http://NextBillion.ai) Geofence API are valid. \- When this parameter
     * is not provided in the input, ferry routes are set to be avoided by default. When this
     * parameter is provided, only the mentioned object(s) are avoided. \- If none is provided along
     * with other values, an error is returned as a valid route is not feasible.
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

            @JvmField val SHARP_TURN = of("sharp_turn")

            @JvmField val UTURN = of("uturn")

            @JvmField val SERVICE_ROAD = of("service_road")

            @JvmField val LEFT_TURN = of("left_turn")

            @JvmField val RIGHT_TURN = of("right_turn")

            @JvmField val BBOX = of("bbox")

            @JvmField val GEOFENCE_ID = of("geofence_id")

            @JvmField val TUNNEL = of("tunnel")

            @JvmStatic fun of(value: String) = Avoid(JsonField.of(value))
        }

        /** An enum containing [Avoid]'s known values. */
        enum class Known {
            TOLL,
            FERRY,
            HIGHWAY,
            NONE,
            SHARP_TURN,
            UTURN,
            SERVICE_ROAD,
            LEFT_TURN,
            RIGHT_TURN,
            BBOX,
            GEOFENCE_ID,
            TUNNEL,
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
            SHARP_TURN,
            UTURN,
            SERVICE_ROAD,
            LEFT_TURN,
            RIGHT_TURN,
            BBOX,
            GEOFENCE_ID,
            TUNNEL,
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
                SHARP_TURN -> Value.SHARP_TURN
                UTURN -> Value.UTURN
                SERVICE_ROAD -> Value.SERVICE_ROAD
                LEFT_TURN -> Value.LEFT_TURN
                RIGHT_TURN -> Value.RIGHT_TURN
                BBOX -> Value.BBOX
                GEOFENCE_ID -> Value.GEOFENCE_ID
                TUNNEL -> Value.TUNNEL
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
                SHARP_TURN -> Known.SHARP_TURN
                UTURN -> Known.UTURN
                SERVICE_ROAD -> Known.SERVICE_ROAD
                LEFT_TURN -> Known.LEFT_TURN
                RIGHT_TURN -> Known.RIGHT_TURN
                BBOX -> Known.BBOX
                GEOFENCE_ID -> Known.GEOFENCE_ID
                TUNNEL -> Known.TUNNEL
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
     * Requires option=flexible.
     *
     * Specify the emission class to which the vehicle (engine) belongs to. The service will use
     * this setting to generate routes that are permissible for that engine class. Only the emission
     * classifications in the EU regions are supported currently. Please reach out to
     * [support@nextbillion.ai](mailto:support@nextbillion.ai) to enable for your region.
     */
    class EmissionClass @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val EURO0 = of("euro0")

            @JvmField val EURO1 = of("euro1")

            @JvmField val EURO2 = of("euro2")

            @JvmField val EURO3 = of("euro3")

            @JvmField val EURO4 = of("euro4")

            @JvmField val EURO5 = of("euro5")

            @JvmField val EURO6 = of("euro6")

            @JvmField val EURO7 = of("euro7")

            @JvmField val EURO8 = of("euro8")

            @JvmField val EURO9 = of("euro9")

            @JvmStatic fun of(value: String) = EmissionClass(JsonField.of(value))
        }

        /** An enum containing [EmissionClass]'s known values. */
        enum class Known {
            EURO0,
            EURO1,
            EURO2,
            EURO3,
            EURO4,
            EURO5,
            EURO6,
            EURO7,
            EURO8,
            EURO9,
        }

        /**
         * An enum containing [EmissionClass]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EmissionClass] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EURO0,
            EURO1,
            EURO2,
            EURO3,
            EURO4,
            EURO5,
            EURO6,
            EURO7,
            EURO8,
            EURO9,
            /**
             * An enum member indicating that [EmissionClass] was instantiated with an unknown
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
                EURO0 -> Value.EURO0
                EURO1 -> Value.EURO1
                EURO2 -> Value.EURO2
                EURO3 -> Value.EURO3
                EURO4 -> Value.EURO4
                EURO5 -> Value.EURO5
                EURO6 -> Value.EURO6
                EURO7 -> Value.EURO7
                EURO8 -> Value.EURO8
                EURO9 -> Value.EURO9
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
                EURO0 -> Known.EURO0
                EURO1 -> Known.EURO1
                EURO2 -> Known.EURO2
                EURO3 -> Known.EURO3
                EURO4 -> Known.EURO4
                EURO5 -> Known.EURO5
                EURO6 -> Known.EURO6
                EURO7 -> Known.EURO7
                EURO8 -> Known.EURO8
                EURO9 -> Known.EURO9
                else -> throw NextbillionSdkInvalidDataException("Unknown EmissionClass: $value")
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

        fun validate(): EmissionClass = apply {
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

            return other is EmissionClass && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Requires option=flexible.
     *
     * This parameter serves as a mandatory filter, ensuring the service returns only those routes
     * that strictly avoid the object(s) indicated. Multiple values should be separated by a pipe
     * |). If no routes can be found that exclude the specified object(s), the service will return
     * an error. For a less strict filtering approach, consider using the avoid parameter.
     *
     * \- This parameter is effective only when route_type=fastest. \- When using
     * exclude=sharp_turn, default range of permissible turn angles is \[120,240\]. In order to
     * override default range, please use turn_angle_range parameter. \- If none is provided along
     * with other values, an error is returned as a valid route is not feasible.
     */
    class Exclude @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SERVICE_ROAD = of("service_road")

            @JvmField val UTURN = of("uturn")

            @JvmField val SHARP_TURN = of("sharp_turn")

            @JvmField val LEFT_TURN = of("left_turn")

            @JvmField val RIGHT_TURN = of("right_turn")

            @JvmField val NONE = of("none")

            @JvmStatic fun of(value: String) = Exclude(JsonField.of(value))
        }

        /** An enum containing [Exclude]'s known values. */
        enum class Known {
            TOLL,
            FERRY,
            HIGHWAY,
            SERVICE_ROAD,
            UTURN,
            SHARP_TURN,
            LEFT_TURN,
            RIGHT_TURN,
            NONE,
        }

        /**
         * An enum containing [Exclude]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Exclude] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TOLL,
            FERRY,
            HIGHWAY,
            SERVICE_ROAD,
            UTURN,
            SHARP_TURN,
            LEFT_TURN,
            RIGHT_TURN,
            NONE,
            /** An enum member indicating that [Exclude] was instantiated with an unknown value. */
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
                SERVICE_ROAD -> Value.SERVICE_ROAD
                UTURN -> Value.UTURN
                SHARP_TURN -> Value.SHARP_TURN
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
                SERVICE_ROAD -> Known.SERVICE_ROAD
                UTURN -> Known.UTURN
                SHARP_TURN -> Known.SHARP_TURN
                LEFT_TURN -> Known.LEFT_TURN
                RIGHT_TURN -> Known.RIGHT_TURN
                NONE -> Known.NONE
                else -> throw NextbillionSdkInvalidDataException("Unknown Exclude: $value")
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

        fun validate(): Exclude = apply {
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

            return other is Exclude && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Sets the output format of the route geometry in the response.
     *
     * On providing polyline and polyline6 as input, respective encoded geometry is returned.
     * However, when geojson is provided as the input value, polyline encoded geometry is returned
     * in the response along with the geojson details of the route.
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
     * Requires option=flexible.
     *
     * Specify the type of hazardous material being carried and the service will avoid roads which
     * are not suitable for the type of goods specified. Multiple values can be separated using a
     * pipe operator "|".
     *
     * Please note that this parameter is effective only when mode=truck.
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

            @JvmField val GENERAL = of("general")

            @JvmField val CIRCUMSTANTIAL = of("circumstantial")

            @JvmField val EXPLOSIVE = of("explosive")

            @JvmField val HARMFUL_TO_WATER = of("harmful_to_water")

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

            return other is HazmatType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Set the driving mode the service should use to determine a route. In "car" mode, the API will
     * return a route that a car can take. Using "truck" mode will return a route a truck can use,
     * taking into account appropriate truck routing restrictions.
     *
     * When mode=truck, following are the default dimensions that are used:
     *
     * \- truck_height = 214 centimeters \- truck_width = 183 centimeters \- truck_length = 519
     * centimeters \- truck_weight = 5000 kg
     *
     * When option=flexible, you can use custom truck dimensions with truck_weight and truck_size
     * parameters.
     *
     * Note: Only the car profile is enabled by default. Please note that customized profiles
     * (including truck) might not be available for all regions. Please contact your
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
     * The option parameter specifies the version of the directions service to use. Setting
     * option=flexible activates the Flexible API, which supports advanced features like truck
     * routing, time-based routing, route type selection (fastest/shortest), and segment-wise speed
     * limits. If not set, the API defaults to the Fast version for real-time routing.
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

            @JvmField val FAST = of("fast")

            @JvmField val FLEXIBLE = of("flexible")

            @JvmStatic fun of(value: String) = Option(JsonField.of(value))
        }

        /** An enum containing [Option]'s known values. */
        enum class Known {
            FAST,
            FLEXIBLE,
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
            FAST,
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
                FAST -> Value.FAST
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
                FAST -> Known.FAST
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

            return other is Option && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specify the verbosity of route geometry.
     *
     * When set to full, the most detailed geometry available is returned. When set to simplified, a
     * simplified version of the full geometry is returned. No overview geometry is returned when
     * set to false.
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

    /**
     * Requires option=flexible.
     *
     * Use this parameter to receive additional information about the road segments returned in the
     * response. Currently, following inputs are supported:
     *
     * \- max_speed : segment-wise maximum speed information of roads in the response. \-
     * toll_distance : returns the total distance travelled on the road segments having tolls. \-
     * toll_cost: returns the range of toll charges, in local currency, that can be incurred for the
     * suggested route.
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

            @JvmField val MAX_SPEED = of("max_speed")

            @JvmField val TOLL_DISTANCE = of("toll_distance")

            @JvmField val TOLL_COST = of("toll_cost")

            @JvmStatic fun of(value: String) = RoadInfo(JsonField.of(value))
        }

        /** An enum containing [RoadInfo]'s known values. */
        enum class Known {
            MAX_SPEED,
            TOLL_DISTANCE,
            TOLL_COST,
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
            TOLL_DISTANCE,
            TOLL_COST,
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
                TOLL_DISTANCE -> Value.TOLL_DISTANCE
                TOLL_COST -> Value.TOLL_COST
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
                TOLL_DISTANCE -> Known.TOLL_DISTANCE
                TOLL_COST -> Known.TOLL_COST
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

            return other is RoadInfo && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Requires option=flexible.
     *
     * Set the route type that needs to be returned.
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

            @JvmField val FASTEST = of("fastest")

            @JvmField val SHORTEST = of("shortest")

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

            return other is RouteType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DirectionComputeRouteParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DirectionComputeRouteParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
