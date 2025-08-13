// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.optimization.v2

import ai.nextbillion.core.Enum
import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.checkKnown
import ai.nextbillion.core.toImmutable
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V2RetrieveResultResponse
private constructor(
    private val description: JsonField<String>,
    private val message: JsonField<String>,
    private val result: JsonField<Result>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(description, message, result, status, mutableMapOf())

    /**
     * Returns the description of the optimization job as given in the input POST optimization
     * request. This field will not be present in the response if no description was provided in the
     * input request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Returns the message in case of errors or failures, otherwise a blank string is returned.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * An object containing the details of the optimized routes.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun result(): Optional<Result> = result.getOptional("result")

    /**
     * It indicates the overall status or result of the API request denoting whether the operation
     * was successful or did it encounter any errors.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

        /** Returns a mutable builder for constructing an instance of [V2RetrieveResultResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V2RetrieveResultResponse]. */
    class Builder internal constructor() {

        private var description: JsonField<String> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v2RetrieveResultResponse: V2RetrieveResultResponse) = apply {
            description = v2RetrieveResultResponse.description
            message = v2RetrieveResultResponse.message
            result = v2RetrieveResultResponse.result
            status = v2RetrieveResultResponse.status
            additionalProperties = v2RetrieveResultResponse.additionalProperties.toMutableMap()
        }

        /**
         * Returns the description of the optimization job as given in the input POST optimization
         * request. This field will not be present in the response if no description was provided in
         * the input request.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * Returns the message in case of errors or failures, otherwise a blank string is returned.
         */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** An object containing the details of the optimized routes. */
        fun result(result: Result) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [Result] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

        /**
         * It indicates the overall status or result of the API request denoting whether the
         * operation was successful or did it encounter any errors.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [V2RetrieveResultResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V2RetrieveResultResponse =
            V2RetrieveResultResponse(
                description,
                message,
                result,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V2RetrieveResultResponse = apply {
        if (validated) {
            return@apply
        }

        description()
        message()
        result().ifPresent { it.validate() }
        status().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (description.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    /** An object containing the details of the optimized routes. */
    class Result
    private constructor(
        private val code: JsonField<Long>,
        private val error: JsonField<String>,
        private val routes: JsonField<List<Route>>,
        private val routingProfiles: JsonValue,
        private val summary: JsonField<Summary>,
        private val unassigned: JsonField<List<Unassigned>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routes")
            @ExcludeMissing
            routes: JsonField<List<Route>> = JsonMissing.of(),
            @JsonProperty("routing_profiles")
            @ExcludeMissing
            routingProfiles: JsonValue = JsonMissing.of(),
            @JsonProperty("summary") @ExcludeMissing summary: JsonField<Summary> = JsonMissing.of(),
            @JsonProperty("unassigned")
            @ExcludeMissing
            unassigned: JsonField<List<Unassigned>> = JsonMissing.of(),
        ) : this(code, error, routes, routingProfiles, summary, unassigned, mutableMapOf())

        /**
         * A custom code representing the status of the result. A code other than 0, represents an
         * internal error. In case of codes other than 0, please verify the parameter values,
         * constraints and locations. If the issue does not resolve, please reach out to NextBillion
         * at [support@nextbillion.ai](mailto:support@nextbillion.ai).
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun code(): Optional<Long> = code.getOptional("code")

        /**
         * Returns the error message for unfulfilled optimization jobs. This field will not be
         * present in the response in case there are no errors.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * An array of objects containing the details of each route in the optimized solution. Each
         * object represents one route.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun routes(): Optional<List<Route>> = routes.getOptional("routes")

        /**
         * Returns all the routing profiles used in the solution. If no routing profiles were
         * provided in the input or if the vehicles tagged to profiles were not used in the
         * solution, the "default" routing properties are returned. Default routing properties are
         * indicated by options.routing in the input.
         */
        @JsonProperty("routing_profiles")
        @ExcludeMissing
        fun _routingProfiles(): JsonValue = routingProfiles

        /**
         * An object to describe the summarized result of the optimization request. This object can
         * be useful to quickly get an overview of the important result parameters.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun summary(): Optional<Summary> = summary.getOptional("summary")

        /**
         * An array of objects containing the details of unassigned tasks in the optimized solution.
         * Each object represents one task.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun unassigned(): Optional<List<Unassigned>> = unassigned.getOptional("unassigned")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Long> = code

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

        /**
         * Returns the raw JSON value of [routes].
         *
         * Unlike [routes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("routes") @ExcludeMissing fun _routes(): JsonField<List<Route>> = routes

        /**
         * Returns the raw JSON value of [summary].
         *
         * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<Summary> = summary

        /**
         * Returns the raw JSON value of [unassigned].
         *
         * Unlike [unassigned], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unassigned")
        @ExcludeMissing
        fun _unassigned(): JsonField<List<Unassigned>> = unassigned

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

            /** Returns a mutable builder for constructing an instance of [Result]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var code: JsonField<Long> = JsonMissing.of()
            private var error: JsonField<String> = JsonMissing.of()
            private var routes: JsonField<MutableList<Route>>? = null
            private var routingProfiles: JsonValue = JsonMissing.of()
            private var summary: JsonField<Summary> = JsonMissing.of()
            private var unassigned: JsonField<MutableList<Unassigned>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                code = result.code
                error = result.error
                routes = result.routes.map { it.toMutableList() }
                routingProfiles = result.routingProfiles
                summary = result.summary
                unassigned = result.unassigned.map { it.toMutableList() }
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /**
             * A custom code representing the status of the result. A code other than 0, represents
             * an internal error. In case of codes other than 0, please verify the parameter values,
             * constraints and locations. If the issue does not resolve, please reach out to
             * NextBillion at [support@nextbillion.ai](mailto:support@nextbillion.ai).
             */
            fun code(code: Long) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<Long>) = apply { this.code = code }

            /**
             * Returns the error message for unfulfilled optimization jobs. This field will not be
             * present in the response in case there are no errors.
             */
            fun error(error: String) = error(JsonField.of(error))

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

            /**
             * An array of objects containing the details of each route in the optimized solution.
             * Each object represents one route.
             */
            fun routes(routes: List<Route>) = routes(JsonField.of(routes))

            /**
             * Sets [Builder.routes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routes] with a well-typed `List<Route>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routes(routes: JsonField<List<Route>>) = apply {
                this.routes = routes.map { it.toMutableList() }
            }

            /**
             * Adds a single [Route] to [routes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRoute(route: Route) = apply {
                routes =
                    (routes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("routes", it).add(route)
                    }
            }

            /**
             * Returns all the routing profiles used in the solution. If no routing profiles were
             * provided in the input or if the vehicles tagged to profiles were not used in the
             * solution, the "default" routing properties are returned. Default routing properties
             * are indicated by options.routing in the input.
             */
            fun routingProfiles(routingProfiles: JsonValue) = apply {
                this.routingProfiles = routingProfiles
            }

            /**
             * An object to describe the summarized result of the optimization request. This object
             * can be useful to quickly get an overview of the important result parameters.
             */
            fun summary(summary: Summary) = summary(JsonField.of(summary))

            /**
             * Sets [Builder.summary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summary] with a well-typed [Summary] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

            /**
             * An array of objects containing the details of unassigned tasks in the optimized
             * solution. Each object represents one task.
             */
            fun unassigned(unassigned: List<Unassigned>) = unassigned(JsonField.of(unassigned))

            /**
             * Sets [Builder.unassigned] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unassigned] with a well-typed `List<Unassigned>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun unassigned(unassigned: JsonField<List<Unassigned>>) = apply {
                this.unassigned = unassigned.map { it.toMutableList() }
            }

            /**
             * Adds a single [Unassigned] to [Builder.unassigned].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUnassigned(unassigned: Unassigned) = apply {
                this.unassigned =
                    (this.unassigned ?: JsonField.of(mutableListOf())).also {
                        checkKnown("unassigned", it).add(unassigned)
                    }
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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Result =
                Result(
                    code,
                    error,
                    (routes ?: JsonMissing.of()).map { it.toImmutable() },
                    routingProfiles,
                    summary,
                    (unassigned ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            code()
            error()
            routes().ifPresent { it.forEach { it.validate() } }
            summary().ifPresent { it.validate() }
            unassigned().ifPresent { it.forEach { it.validate() } }
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
            (if (code.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0) +
                (routes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (summary.asKnown().getOrNull()?.validity() ?: 0) +
                (unassigned.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Route
        private constructor(
            private val adoptedCapacity: JsonField<List<Long>>,
            private val cost: JsonField<Long>,
            private val delivery: JsonField<List<Long>>,
            private val description: JsonField<String>,
            private val distance: JsonField<Double>,
            private val duration: JsonField<Long>,
            private val geometry: JsonField<String>,
            private val metadata: JsonValue,
            private val pickup: JsonField<List<Long>>,
            private val priority: JsonField<Long>,
            private val profile: JsonField<String>,
            private val revenue: JsonField<Long>,
            private val service: JsonField<Long>,
            private val setup: JsonField<Long>,
            private val steps: JsonField<List<Step>>,
            private val vehicle: JsonField<String>,
            private val vehicleOvertime: JsonField<Long>,
            private val waitingTime: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("adopted_capacity")
                @ExcludeMissing
                adoptedCapacity: JsonField<List<Long>> = JsonMissing.of(),
                @JsonProperty("cost") @ExcludeMissing cost: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("delivery")
                @ExcludeMissing
                delivery: JsonField<List<Long>> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("distance")
                @ExcludeMissing
                distance: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("duration")
                @ExcludeMissing
                duration: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("geometry")
                @ExcludeMissing
                geometry: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
                @JsonProperty("pickup")
                @ExcludeMissing
                pickup: JsonField<List<Long>> = JsonMissing.of(),
                @JsonProperty("priority")
                @ExcludeMissing
                priority: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("profile")
                @ExcludeMissing
                profile: JsonField<String> = JsonMissing.of(),
                @JsonProperty("revenue")
                @ExcludeMissing
                revenue: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("service")
                @ExcludeMissing
                service: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("setup") @ExcludeMissing setup: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("steps")
                @ExcludeMissing
                steps: JsonField<List<Step>> = JsonMissing.of(),
                @JsonProperty("vehicle")
                @ExcludeMissing
                vehicle: JsonField<String> = JsonMissing.of(),
                @JsonProperty("vehicle_overtime")
                @ExcludeMissing
                vehicleOvertime: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("waiting_time")
                @ExcludeMissing
                waitingTime: JsonField<Long> = JsonMissing.of(),
            ) : this(
                adoptedCapacity,
                cost,
                delivery,
                description,
                distance,
                duration,
                geometry,
                metadata,
                pickup,
                priority,
                profile,
                revenue,
                service,
                setup,
                steps,
                vehicle,
                vehicleOvertime,
                waitingTime,
                mutableMapOf(),
            )

            /**
             * Returns the capacity configuration of the vehicle that was used for this route. This
             * field would return either the vehicle's capacity or one of the alternative_capacities
             * provided in the input request.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun adoptedCapacity(): Optional<List<Long>> =
                adoptedCapacity.getOptional("adopted_capacity")

            /**
             * Returns the cost of the route. The unit of cost type depends on the value of
             * travel_cost attribute in the optimization request.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun cost(): Optional<Long> = cost.getOptional("cost")

            /**
             * Returns the total quantities, for each dimension (or unit), of deliveries performed
             * in the route. Please note that when both shipments and jobs are provided, this field
             * corresponds to the sum of quantities delivered as part of the assigned shipments and
             * jobs on the route.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun delivery(): Optional<List<Long>> = delivery.getOptional("delivery")

            /**
             * Return the description of the assigned vehicle. It would be the same as that provided
             * in the description field of vehicles part of the input POST optimization request.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Returns the total distance of the route, in meters.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun distance(): Optional<Double> = distance.getOptional("distance")

            /**
             * Returns the total drive duration of the route, in seconds.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun duration(): Optional<Long> = duration.getOptional("duration")

            /**
             * Returns the geometry of this route encoded in polyline format.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun geometry(): Optional<String> = geometry.getOptional("geometry")

            /**
             * Returns the custom information that was provided when the vehicle was configured.
             * This field would not be present for the vehicles that were not provided with any
             * metadata.
             */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            /**
             * Returns the total quantities, for each dimension (or unit), of pickups performed in
             * the route. Please note that when both shipments and jobs are provided, this field
             * corresponds to the sum of quantities picked-up as part of the assigned shipments and
             * jobs on the route.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun pickup(): Optional<List<Long>> = pickup.getOptional("pickup")

            /**
             * Returns the sum of priorities of all tasks on the route.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun priority(): Optional<Long> = priority.getOptional("priority")

            /**
             * Returns the profile of the vehicle.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun profile(): Optional<String> = profile.getOptional("profile")

            /**
             * Returns the revenue earned by fulfilling the task on this route. Please note this
             * field is present only when the revenue inputs are provided in the input, otherwise it
             * is not present in the response.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun revenue(): Optional<Long> = revenue.getOptional("revenue")

            /**
             * Returns the total service time spent on the tasks or depots on the route, in seconds.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun service(): Optional<Long> = service.getOptional("service")

            /**
             * Returns the total setup time, in seconds, for the tasks assigned on the route.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun setup(): Optional<Long> = setup.getOptional("setup")

            /**
             * This attribute contains the details of all the steps involved in the route. It is an
             * array of objects with each object representing one step.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun steps(): Optional<List<Step>> = steps.getOptional("steps")

            /**
             * Returns the ID of the vehicle that was assigned to the route. The value type will be
             * same as the value type provided in the input request.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun vehicle(): Optional<String> = vehicle.getOptional("vehicle")

            /**
             * Returns the total vehicle overtime for the route, in seconds. Please note this field
             * is present only when there is a non-zero value for vehicle overtime, otherwise it is
             * not present in the response.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun vehicleOvertime(): Optional<Long> = vehicleOvertime.getOptional("vehicle_overtime")

            /**
             * Returns the total waiting time of the vehicle on the route, in seconds.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun waitingTime(): Optional<Long> = waitingTime.getOptional("waiting_time")

            /**
             * Returns the raw JSON value of [adoptedCapacity].
             *
             * Unlike [adoptedCapacity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("adopted_capacity")
            @ExcludeMissing
            fun _adoptedCapacity(): JsonField<List<Long>> = adoptedCapacity

            /**
             * Returns the raw JSON value of [cost].
             *
             * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Long> = cost

            /**
             * Returns the raw JSON value of [delivery].
             *
             * Unlike [delivery], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("delivery")
            @ExcludeMissing
            fun _delivery(): JsonField<List<Long>> = delivery

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [distance].
             *
             * Unlike [distance], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Double> = distance

            /**
             * Returns the raw JSON value of [duration].
             *
             * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

            /**
             * Returns the raw JSON value of [geometry].
             *
             * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("geometry") @ExcludeMissing fun _geometry(): JsonField<String> = geometry

            /**
             * Returns the raw JSON value of [pickup].
             *
             * Unlike [pickup], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pickup") @ExcludeMissing fun _pickup(): JsonField<List<Long>> = pickup

            /**
             * Returns the raw JSON value of [priority].
             *
             * Unlike [priority], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Long> = priority

            /**
             * Returns the raw JSON value of [profile].
             *
             * Unlike [profile], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("profile") @ExcludeMissing fun _profile(): JsonField<String> = profile

            /**
             * Returns the raw JSON value of [revenue].
             *
             * Unlike [revenue], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("revenue") @ExcludeMissing fun _revenue(): JsonField<Long> = revenue

            /**
             * Returns the raw JSON value of [service].
             *
             * Unlike [service], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("service") @ExcludeMissing fun _service(): JsonField<Long> = service

            /**
             * Returns the raw JSON value of [setup].
             *
             * Unlike [setup], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("setup") @ExcludeMissing fun _setup(): JsonField<Long> = setup

            /**
             * Returns the raw JSON value of [steps].
             *
             * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("steps") @ExcludeMissing fun _steps(): JsonField<List<Step>> = steps

            /**
             * Returns the raw JSON value of [vehicle].
             *
             * Unlike [vehicle], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("vehicle") @ExcludeMissing fun _vehicle(): JsonField<String> = vehicle

            /**
             * Returns the raw JSON value of [vehicleOvertime].
             *
             * Unlike [vehicleOvertime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("vehicle_overtime")
            @ExcludeMissing
            fun _vehicleOvertime(): JsonField<Long> = vehicleOvertime

            /**
             * Returns the raw JSON value of [waitingTime].
             *
             * Unlike [waitingTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("waiting_time")
            @ExcludeMissing
            fun _waitingTime(): JsonField<Long> = waitingTime

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

                /** Returns a mutable builder for constructing an instance of [Route]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Route]. */
            class Builder internal constructor() {

                private var adoptedCapacity: JsonField<MutableList<Long>>? = null
                private var cost: JsonField<Long> = JsonMissing.of()
                private var delivery: JsonField<MutableList<Long>>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var distance: JsonField<Double> = JsonMissing.of()
                private var duration: JsonField<Long> = JsonMissing.of()
                private var geometry: JsonField<String> = JsonMissing.of()
                private var metadata: JsonValue = JsonMissing.of()
                private var pickup: JsonField<MutableList<Long>>? = null
                private var priority: JsonField<Long> = JsonMissing.of()
                private var profile: JsonField<String> = JsonMissing.of()
                private var revenue: JsonField<Long> = JsonMissing.of()
                private var service: JsonField<Long> = JsonMissing.of()
                private var setup: JsonField<Long> = JsonMissing.of()
                private var steps: JsonField<MutableList<Step>>? = null
                private var vehicle: JsonField<String> = JsonMissing.of()
                private var vehicleOvertime: JsonField<Long> = JsonMissing.of()
                private var waitingTime: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(route: Route) = apply {
                    adoptedCapacity = route.adoptedCapacity.map { it.toMutableList() }
                    cost = route.cost
                    delivery = route.delivery.map { it.toMutableList() }
                    description = route.description
                    distance = route.distance
                    duration = route.duration
                    geometry = route.geometry
                    metadata = route.metadata
                    pickup = route.pickup.map { it.toMutableList() }
                    priority = route.priority
                    profile = route.profile
                    revenue = route.revenue
                    service = route.service
                    setup = route.setup
                    steps = route.steps.map { it.toMutableList() }
                    vehicle = route.vehicle
                    vehicleOvertime = route.vehicleOvertime
                    waitingTime = route.waitingTime
                    additionalProperties = route.additionalProperties.toMutableMap()
                }

                /**
                 * Returns the capacity configuration of the vehicle that was used for this route.
                 * This field would return either the vehicle's capacity or one of the
                 * alternative_capacities provided in the input request.
                 */
                fun adoptedCapacity(adoptedCapacity: List<Long>) =
                    adoptedCapacity(JsonField.of(adoptedCapacity))

                /**
                 * Sets [Builder.adoptedCapacity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.adoptedCapacity] with a well-typed `List<Long>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun adoptedCapacity(adoptedCapacity: JsonField<List<Long>>) = apply {
                    this.adoptedCapacity = adoptedCapacity.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Long] to [Builder.adoptedCapacity].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAdoptedCapacity(adoptedCapacity: Long) = apply {
                    this.adoptedCapacity =
                        (this.adoptedCapacity ?: JsonField.of(mutableListOf())).also {
                            checkKnown("adoptedCapacity", it).add(adoptedCapacity)
                        }
                }

                /**
                 * Returns the cost of the route. The unit of cost type depends on the value of
                 * travel_cost attribute in the optimization request.
                 */
                fun cost(cost: Long) = cost(JsonField.of(cost))

                /**
                 * Sets [Builder.cost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cost] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cost(cost: JsonField<Long>) = apply { this.cost = cost }

                /**
                 * Returns the total quantities, for each dimension (or unit), of deliveries
                 * performed in the route. Please note that when both shipments and jobs are
                 * provided, this field corresponds to the sum of quantities delivered as part of
                 * the assigned shipments and jobs on the route.
                 */
                fun delivery(delivery: List<Long>) = delivery(JsonField.of(delivery))

                /**
                 * Sets [Builder.delivery] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.delivery] with a well-typed `List<Long>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun delivery(delivery: JsonField<List<Long>>) = apply {
                    this.delivery = delivery.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Long] to [Builder.delivery].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDelivery(delivery: Long) = apply {
                    this.delivery =
                        (this.delivery ?: JsonField.of(mutableListOf())).also {
                            checkKnown("delivery", it).add(delivery)
                        }
                }

                /**
                 * Return the description of the assigned vehicle. It would be the same as that
                 * provided in the description field of vehicles part of the input POST optimization
                 * request.
                 */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Returns the total distance of the route, in meters. */
                fun distance(distance: Double) = distance(JsonField.of(distance))

                /**
                 * Sets [Builder.distance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.distance] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

                /** Returns the total drive duration of the route, in seconds. */
                fun duration(duration: Long) = duration(JsonField.of(duration))

                /**
                 * Sets [Builder.duration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.duration] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

                /** Returns the geometry of this route encoded in polyline format. */
                fun geometry(geometry: String) = geometry(JsonField.of(geometry))

                /**
                 * Sets [Builder.geometry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.geometry] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun geometry(geometry: JsonField<String>) = apply { this.geometry = geometry }

                /**
                 * Returns the custom information that was provided when the vehicle was configured.
                 * This field would not be present for the vehicles that were not provided with any
                 * metadata.
                 */
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                /**
                 * Returns the total quantities, for each dimension (or unit), of pickups performed
                 * in the route. Please note that when both shipments and jobs are provided, this
                 * field corresponds to the sum of quantities picked-up as part of the assigned
                 * shipments and jobs on the route.
                 */
                fun pickup(pickup: List<Long>) = pickup(JsonField.of(pickup))

                /**
                 * Sets [Builder.pickup] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pickup] with a well-typed `List<Long>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pickup(pickup: JsonField<List<Long>>) = apply {
                    this.pickup = pickup.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Long] to [Builder.pickup].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPickup(pickup: Long) = apply {
                    this.pickup =
                        (this.pickup ?: JsonField.of(mutableListOf())).also {
                            checkKnown("pickup", it).add(pickup)
                        }
                }

                /** Returns the sum of priorities of all tasks on the route. */
                fun priority(priority: Long) = priority(JsonField.of(priority))

                /**
                 * Sets [Builder.priority] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.priority] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun priority(priority: JsonField<Long>) = apply { this.priority = priority }

                /** Returns the profile of the vehicle. */
                fun profile(profile: String) = profile(JsonField.of(profile))

                /**
                 * Sets [Builder.profile] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.profile] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun profile(profile: JsonField<String>) = apply { this.profile = profile }

                /**
                 * Returns the revenue earned by fulfilling the task on this route. Please note this
                 * field is present only when the revenue inputs are provided in the input,
                 * otherwise it is not present in the response.
                 */
                fun revenue(revenue: Long) = revenue(JsonField.of(revenue))

                /**
                 * Sets [Builder.revenue] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.revenue] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun revenue(revenue: JsonField<Long>) = apply { this.revenue = revenue }

                /**
                 * Returns the total service time spent on the tasks or depots on the route, in
                 * seconds.
                 */
                fun service(service: Long) = service(JsonField.of(service))

                /**
                 * Sets [Builder.service] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.service] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun service(service: JsonField<Long>) = apply { this.service = service }

                /**
                 * Returns the total setup time, in seconds, for the tasks assigned on the route.
                 */
                fun setup(setup: Long) = setup(JsonField.of(setup))

                /**
                 * Sets [Builder.setup] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.setup] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun setup(setup: JsonField<Long>) = apply { this.setup = setup }

                /**
                 * This attribute contains the details of all the steps involved in the route. It is
                 * an array of objects with each object representing one step.
                 */
                fun steps(steps: List<Step>) = steps(JsonField.of(steps))

                /**
                 * Sets [Builder.steps] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.steps] with a well-typed `List<Step>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun steps(steps: JsonField<List<Step>>) = apply {
                    this.steps = steps.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Step] to [steps].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addStep(step: Step) = apply {
                    steps =
                        (steps ?: JsonField.of(mutableListOf())).also {
                            checkKnown("steps", it).add(step)
                        }
                }

                /**
                 * Returns the ID of the vehicle that was assigned to the route. The value type will
                 * be same as the value type provided in the input request.
                 */
                fun vehicle(vehicle: String) = vehicle(JsonField.of(vehicle))

                /**
                 * Sets [Builder.vehicle] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vehicle] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun vehicle(vehicle: JsonField<String>) = apply { this.vehicle = vehicle }

                /**
                 * Returns the total vehicle overtime for the route, in seconds. Please note this
                 * field is present only when there is a non-zero value for vehicle overtime,
                 * otherwise it is not present in the response.
                 */
                fun vehicleOvertime(vehicleOvertime: Long) =
                    vehicleOvertime(JsonField.of(vehicleOvertime))

                /**
                 * Sets [Builder.vehicleOvertime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vehicleOvertime] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun vehicleOvertime(vehicleOvertime: JsonField<Long>) = apply {
                    this.vehicleOvertime = vehicleOvertime
                }

                /** Returns the total waiting time of the vehicle on the route, in seconds. */
                fun waitingTime(waitingTime: Long) = waitingTime(JsonField.of(waitingTime))

                /**
                 * Sets [Builder.waitingTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.waitingTime] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun waitingTime(waitingTime: JsonField<Long>) = apply {
                    this.waitingTime = waitingTime
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Route].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Route =
                    Route(
                        (adoptedCapacity ?: JsonMissing.of()).map { it.toImmutable() },
                        cost,
                        (delivery ?: JsonMissing.of()).map { it.toImmutable() },
                        description,
                        distance,
                        duration,
                        geometry,
                        metadata,
                        (pickup ?: JsonMissing.of()).map { it.toImmutable() },
                        priority,
                        profile,
                        revenue,
                        service,
                        setup,
                        (steps ?: JsonMissing.of()).map { it.toImmutable() },
                        vehicle,
                        vehicleOvertime,
                        waitingTime,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Route = apply {
                if (validated) {
                    return@apply
                }

                adoptedCapacity()
                cost()
                delivery()
                description()
                distance()
                duration()
                geometry()
                pickup()
                priority()
                profile()
                revenue()
                service()
                setup()
                steps().ifPresent { it.forEach { it.validate() } }
                vehicle()
                vehicleOvertime()
                waitingTime()
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
                (adoptedCapacity.asKnown().getOrNull()?.size ?: 0) +
                    (if (cost.asKnown().isPresent) 1 else 0) +
                    (delivery.asKnown().getOrNull()?.size ?: 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (distance.asKnown().isPresent) 1 else 0) +
                    (if (duration.asKnown().isPresent) 1 else 0) +
                    (if (geometry.asKnown().isPresent) 1 else 0) +
                    (pickup.asKnown().getOrNull()?.size ?: 0) +
                    (if (priority.asKnown().isPresent) 1 else 0) +
                    (if (profile.asKnown().isPresent) 1 else 0) +
                    (if (revenue.asKnown().isPresent) 1 else 0) +
                    (if (service.asKnown().isPresent) 1 else 0) +
                    (if (setup.asKnown().isPresent) 1 else 0) +
                    (steps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (vehicle.asKnown().isPresent) 1 else 0) +
                    (if (vehicleOvertime.asKnown().isPresent) 1 else 0) +
                    (if (waitingTime.asKnown().isPresent) 1 else 0)

            /**
             * This attribute contains the details of all the steps involved in the route. It is an
             * array of objects with each object representing one step.
             */
            class Step
            private constructor(
                private val id: JsonField<String>,
                private val arrival: JsonField<Long>,
                private val depot: JsonField<String>,
                private val description: JsonField<String>,
                private val distance: JsonField<Long>,
                private val duration: JsonField<Long>,
                private val lateBy: JsonField<String>,
                private val load: JsonField<List<Long>>,
                private val location: JsonField<List<Double>>,
                private val locationIndex: JsonField<Long>,
                private val metadata: JsonValue,
                private val projectedLocation: JsonField<List<Double>>,
                private val run: JsonField<Long>,
                private val service: JsonField<Long>,
                private val setup: JsonField<Long>,
                private val snappedLocation: JsonField<List<Double>>,
                private val type: JsonField<String>,
                private val waitingTime: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("arrival")
                    @ExcludeMissing
                    arrival: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("depot")
                    @ExcludeMissing
                    depot: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("distance")
                    @ExcludeMissing
                    distance: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("duration")
                    @ExcludeMissing
                    duration: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("late_by")
                    @ExcludeMissing
                    lateBy: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("load")
                    @ExcludeMissing
                    load: JsonField<List<Long>> = JsonMissing.of(),
                    @JsonProperty("location")
                    @ExcludeMissing
                    location: JsonField<List<Double>> = JsonMissing.of(),
                    @JsonProperty("location_index")
                    @ExcludeMissing
                    locationIndex: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonValue = JsonMissing.of(),
                    @JsonProperty("projected_location")
                    @ExcludeMissing
                    projectedLocation: JsonField<List<Double>> = JsonMissing.of(),
                    @JsonProperty("run") @ExcludeMissing run: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("service")
                    @ExcludeMissing
                    service: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("setup")
                    @ExcludeMissing
                    setup: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("snapped_location")
                    @ExcludeMissing
                    snappedLocation: JsonField<List<Double>> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    type: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("waiting_time")
                    @ExcludeMissing
                    waitingTime: JsonField<Long> = JsonMissing.of(),
                ) : this(
                    id,
                    arrival,
                    depot,
                    description,
                    distance,
                    duration,
                    lateBy,
                    load,
                    location,
                    locationIndex,
                    metadata,
                    projectedLocation,
                    run,
                    service,
                    setup,
                    snappedLocation,
                    type,
                    waitingTime,
                    mutableMapOf(),
                )

                /**
                 * Returns the ID of the task. The ID returned here are the same values that were
                 * provided for the given task in the jobs or the shipments objects of the input
                 * POST optimization request.
                 *
                 * **Note:** Since both integer and string value types are supported for job IDs,
                 * the value type returned for this field will depend on the value type provided in
                 * the input request.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * Returns the time at which the vehicle arrives at the step location. If
                 * time_windows is provided for the task it will be returned as an UNIX timestamp
                 * expressed in seconds. When time_windows is not provided, it is returned as the
                 * total duration, in seconds, elapsed since the start of the route.
                 *
                 * Please note it includes all the other durations as well (setup, service,
                 * waiting).
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun arrival(): Optional<Long> = arrival.getOptional("arrival")

                /**
                 * For step type "start" or "end", this field returns the ID of the depot relevant
                 * to that step. For "start" steps, the field will contain the ID of the depot from
                 * which the vehicle commenced its journey. Conversely, for "end" steps, the field
                 * will hold the ID of the depot where the vehicle concluded its trip.
                 *
                 * Please note that start_depot_ids or end_depot_ids input for the vehicle must be
                 * configured to get this field in the response for respective step types in a
                 * route.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun depot(): Optional<String> = depot.getOptional("depot")

                /**
                 * Returns the description of this step. The description returned here are the same
                 * values that were provided for the given task in the jobs or the shipments objects
                 * of the input POST optimization request.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun description(): Optional<String> = description.getOptional("description")

                /**
                 * Returns the distance covered, in meters, from the start of the route and up until
                 * the current step.
                 *
                 * Please note that the value of this parameter accumulates with each step. In case
                 * , the travel_cost: air_distance, then the distance here represents straight line
                 * distance.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun distance(): Optional<Long> = distance.getOptional("distance")

                /**
                 * Returns the total drive time, in seconds, from the start of the route up until
                 * the start of the step. Please note that this value does not include any other
                 * category of durations (service, wait, setup) and the value of this parameter
                 * accumulates with each step.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun duration(): Optional<Long> = duration.getOptional("duration")

                /**
                 * Returns the amount of time, in seconds, by which the vehicle is late when
                 * arriving at this step. Please note this field is present only when there is a
                 * non-zero value for vehicle lateness, otherwise it is not present in the response.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun lateBy(): Optional<String> = lateBy.getOptional("late_by")

                /**
                 * Returns the load on the vehicle after completing this step. In case of multiple
                 * dimensions, loads of each type are returned by a matching number of elements in
                 * the array.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun load(): Optional<List<Long>> = load.getOptional("load")

                /**
                 * Returns the location coordinates of the step in the \[latitude, longitude\]
                 * format.
                 *
                 * The index of this location is also returned by the location_index parameter.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun location(): Optional<List<Double>> = location.getOptional("location")

                /**
                 * Returns the index (in the location array) of the location coordinates where the
                 * step is performed. The index will always be in the range of \[0, length of
                 * location array).
                 *
                 * Actual coordinates are also returned by the location parameter.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun locationIndex(): Optional<Long> = locationIndex.getOptional("location_index")

                /**
                 * Returns the custom information that was provided when the given task (job /
                 * pickup / delivery) was configured. This field would not be present for the tasks
                 * that were not provided with any metadata. It will also be not present for “start”
                 * and “end” steps.
                 */
                @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

                /**
                 * In case this step is part of a task group, this field returns the location
                 * coordinates of the point, in \[latitude, longitude\] format, which was used as a
                 * common stop for all grouped tasks.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun projectedLocation(): Optional<List<Double>> =
                    projectedLocation.getOptional("projected_location")

                /**
                 * When a vehicle is configured to make multiple runs to the depot (via
                 * max_depot_runs), this field returns the iteration to which the step belongs to.
                 * Each run will begin with a "start" step from the depot's location and conclude
                 * with an "end" step at either the last task's or the configured end location.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun run(): Optional<Long> = run.getOptional("run")

                /**
                 * Returns the service time, in seconds, for the task when the step type is not
                 * start or end.
                 *
                 * When the step type is start or end , the field also returns the service time, in
                 * seconds, spent at the depot when if the vehicle is starting or completing the
                 * trip at one of the depots.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun service(): Optional<Long> = service.getOptional("service")

                /**
                 * Returns the setup time, in seconds, for the task.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun setup(): Optional<Long> = setup.getOptional("setup")

                /**
                 * Returns the coordinates after snapping the location of this step to a nearby
                 * road. Please note that this field will not be available in the response when
                 * custom duration or distance matrix were used for cost calculations.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun snappedLocation(): Optional<List<Double>> =
                    snappedLocation.getOptional("snapped_location")

                /**
                 * Returns the type of the step. Its value will always be one of the following:
                 * start, job, pickup, delivery, end. In case the type is start or end, steps object
                 * will not have the id field.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun type(): Optional<String> = type.getOptional("type")

                /**
                 * Returns the wait time of the vehicle at this step, in seconds.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun waitingTime(): Optional<Long> = waitingTime.getOptional("waiting_time")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [arrival].
                 *
                 * Unlike [arrival], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("arrival") @ExcludeMissing fun _arrival(): JsonField<Long> = arrival

                /**
                 * Returns the raw JSON value of [depot].
                 *
                 * Unlike [depot], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("depot") @ExcludeMissing fun _depot(): JsonField<String> = depot

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [distance].
                 *
                 * Unlike [distance], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("distance")
                @ExcludeMissing
                fun _distance(): JsonField<Long> = distance

                /**
                 * Returns the raw JSON value of [duration].
                 *
                 * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("duration")
                @ExcludeMissing
                fun _duration(): JsonField<Long> = duration

                /**
                 * Returns the raw JSON value of [lateBy].
                 *
                 * Unlike [lateBy], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("late_by") @ExcludeMissing fun _lateBy(): JsonField<String> = lateBy

                /**
                 * Returns the raw JSON value of [load].
                 *
                 * Unlike [load], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("load") @ExcludeMissing fun _load(): JsonField<List<Long>> = load

                /**
                 * Returns the raw JSON value of [location].
                 *
                 * Unlike [location], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("location")
                @ExcludeMissing
                fun _location(): JsonField<List<Double>> = location

                /**
                 * Returns the raw JSON value of [locationIndex].
                 *
                 * Unlike [locationIndex], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("location_index")
                @ExcludeMissing
                fun _locationIndex(): JsonField<Long> = locationIndex

                /**
                 * Returns the raw JSON value of [projectedLocation].
                 *
                 * Unlike [projectedLocation], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("projected_location")
                @ExcludeMissing
                fun _projectedLocation(): JsonField<List<Double>> = projectedLocation

                /**
                 * Returns the raw JSON value of [run].
                 *
                 * Unlike [run], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("run") @ExcludeMissing fun _run(): JsonField<Long> = run

                /**
                 * Returns the raw JSON value of [service].
                 *
                 * Unlike [service], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("service") @ExcludeMissing fun _service(): JsonField<Long> = service

                /**
                 * Returns the raw JSON value of [setup].
                 *
                 * Unlike [setup], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("setup") @ExcludeMissing fun _setup(): JsonField<Long> = setup

                /**
                 * Returns the raw JSON value of [snappedLocation].
                 *
                 * Unlike [snappedLocation], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("snapped_location")
                @ExcludeMissing
                fun _snappedLocation(): JsonField<List<Double>> = snappedLocation

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

                /**
                 * Returns the raw JSON value of [waitingTime].
                 *
                 * Unlike [waitingTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("waiting_time")
                @ExcludeMissing
                fun _waitingTime(): JsonField<Long> = waitingTime

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

                    /** Returns a mutable builder for constructing an instance of [Step]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Step]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var arrival: JsonField<Long> = JsonMissing.of()
                    private var depot: JsonField<String> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var distance: JsonField<Long> = JsonMissing.of()
                    private var duration: JsonField<Long> = JsonMissing.of()
                    private var lateBy: JsonField<String> = JsonMissing.of()
                    private var load: JsonField<MutableList<Long>>? = null
                    private var location: JsonField<MutableList<Double>>? = null
                    private var locationIndex: JsonField<Long> = JsonMissing.of()
                    private var metadata: JsonValue = JsonMissing.of()
                    private var projectedLocation: JsonField<MutableList<Double>>? = null
                    private var run: JsonField<Long> = JsonMissing.of()
                    private var service: JsonField<Long> = JsonMissing.of()
                    private var setup: JsonField<Long> = JsonMissing.of()
                    private var snappedLocation: JsonField<MutableList<Double>>? = null
                    private var type: JsonField<String> = JsonMissing.of()
                    private var waitingTime: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(step: Step) = apply {
                        id = step.id
                        arrival = step.arrival
                        depot = step.depot
                        description = step.description
                        distance = step.distance
                        duration = step.duration
                        lateBy = step.lateBy
                        load = step.load.map { it.toMutableList() }
                        location = step.location.map { it.toMutableList() }
                        locationIndex = step.locationIndex
                        metadata = step.metadata
                        projectedLocation = step.projectedLocation.map { it.toMutableList() }
                        run = step.run
                        service = step.service
                        setup = step.setup
                        snappedLocation = step.snappedLocation.map { it.toMutableList() }
                        type = step.type
                        waitingTime = step.waitingTime
                        additionalProperties = step.additionalProperties.toMutableMap()
                    }

                    /**
                     * Returns the ID of the task. The ID returned here are the same values that
                     * were provided for the given task in the jobs or the shipments objects of the
                     * input POST optimization request.
                     *
                     * **Note:** Since both integer and string value types are supported for job
                     * IDs, the value type returned for this field will depend on the value type
                     * provided in the input request.
                     */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * Returns the time at which the vehicle arrives at the step location. If
                     * time_windows is provided for the task it will be returned as an UNIX
                     * timestamp expressed in seconds. When time_windows is not provided, it is
                     * returned as the total duration, in seconds, elapsed since the start of the
                     * route.
                     *
                     * Please note it includes all the other durations as well (setup, service,
                     * waiting).
                     */
                    fun arrival(arrival: Long) = arrival(JsonField.of(arrival))

                    /**
                     * Sets [Builder.arrival] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.arrival] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun arrival(arrival: JsonField<Long>) = apply { this.arrival = arrival }

                    /**
                     * For step type "start" or "end", this field returns the ID of the depot
                     * relevant to that step. For "start" steps, the field will contain the ID of
                     * the depot from which the vehicle commenced its journey. Conversely, for "end"
                     * steps, the field will hold the ID of the depot where the vehicle concluded
                     * its trip.
                     *
                     * Please note that start_depot_ids or end_depot_ids input for the vehicle must
                     * be configured to get this field in the response for respective step types in
                     * a route.
                     */
                    fun depot(depot: String) = depot(JsonField.of(depot))

                    /**
                     * Sets [Builder.depot] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.depot] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun depot(depot: JsonField<String>) = apply { this.depot = depot }

                    /**
                     * Returns the description of this step. The description returned here are the
                     * same values that were provided for the given task in the jobs or the
                     * shipments objects of the input POST optimization request.
                     */
                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * Returns the distance covered, in meters, from the start of the route and up
                     * until the current step.
                     *
                     * Please note that the value of this parameter accumulates with each step. In
                     * case , the travel_cost: air_distance, then the distance here represents
                     * straight line distance.
                     */
                    fun distance(distance: Long) = distance(JsonField.of(distance))

                    /**
                     * Sets [Builder.distance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.distance] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun distance(distance: JsonField<Long>) = apply { this.distance = distance }

                    /**
                     * Returns the total drive time, in seconds, from the start of the route up
                     * until the start of the step. Please note that this value does not include any
                     * other category of durations (service, wait, setup) and the value of this
                     * parameter accumulates with each step.
                     */
                    fun duration(duration: Long) = duration(JsonField.of(duration))

                    /**
                     * Sets [Builder.duration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.duration] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

                    /**
                     * Returns the amount of time, in seconds, by which the vehicle is late when
                     * arriving at this step. Please note this field is present only when there is a
                     * non-zero value for vehicle lateness, otherwise it is not present in the
                     * response.
                     */
                    fun lateBy(lateBy: String) = lateBy(JsonField.of(lateBy))

                    /**
                     * Sets [Builder.lateBy] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lateBy] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lateBy(lateBy: JsonField<String>) = apply { this.lateBy = lateBy }

                    /**
                     * Returns the load on the vehicle after completing this step. In case of
                     * multiple dimensions, loads of each type are returned by a matching number of
                     * elements in the array.
                     */
                    fun load(load: List<Long>) = load(JsonField.of(load))

                    /**
                     * Sets [Builder.load] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.load] with a well-typed `List<Long>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun load(load: JsonField<List<Long>>) = apply {
                        this.load = load.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Long] to [Builder.load].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addLoad(load: Long) = apply {
                        this.load =
                            (this.load ?: JsonField.of(mutableListOf())).also {
                                checkKnown("load", it).add(load)
                            }
                    }

                    /**
                     * Returns the location coordinates of the step in the \[latitude, longitude\]
                     * format.
                     *
                     * The index of this location is also returned by the location_index parameter.
                     */
                    fun location(location: List<Double>) = location(JsonField.of(location))

                    /**
                     * Sets [Builder.location] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.location] with a well-typed `List<Double>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun location(location: JsonField<List<Double>>) = apply {
                        this.location = location.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Double] to [Builder.location].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addLocation(location: Double) = apply {
                        this.location =
                            (this.location ?: JsonField.of(mutableListOf())).also {
                                checkKnown("location", it).add(location)
                            }
                    }

                    /**
                     * Returns the index (in the location array) of the location coordinates where
                     * the step is performed. The index will always be in the range of \[0, length
                     * of location array).
                     *
                     * Actual coordinates are also returned by the location parameter.
                     */
                    fun locationIndex(locationIndex: Long) =
                        locationIndex(JsonField.of(locationIndex))

                    /**
                     * Sets [Builder.locationIndex] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.locationIndex] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun locationIndex(locationIndex: JsonField<Long>) = apply {
                        this.locationIndex = locationIndex
                    }

                    /**
                     * Returns the custom information that was provided when the given task (job /
                     * pickup / delivery) was configured. This field would not be present for the
                     * tasks that were not provided with any metadata. It will also be not present
                     * for “start” and “end” steps.
                     */
                    fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                    /**
                     * In case this step is part of a task group, this field returns the location
                     * coordinates of the point, in \[latitude, longitude\] format, which was used
                     * as a common stop for all grouped tasks.
                     */
                    fun projectedLocation(projectedLocation: List<Double>) =
                        projectedLocation(JsonField.of(projectedLocation))

                    /**
                     * Sets [Builder.projectedLocation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.projectedLocation] with a well-typed
                     * `List<Double>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun projectedLocation(projectedLocation: JsonField<List<Double>>) = apply {
                        this.projectedLocation = projectedLocation.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Double] to [Builder.projectedLocation].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addProjectedLocation(projectedLocation: Double) = apply {
                        this.projectedLocation =
                            (this.projectedLocation ?: JsonField.of(mutableListOf())).also {
                                checkKnown("projectedLocation", it).add(projectedLocation)
                            }
                    }

                    /**
                     * When a vehicle is configured to make multiple runs to the depot (via
                     * max_depot_runs), this field returns the iteration to which the step belongs
                     * to. Each run will begin with a "start" step from the depot's location and
                     * conclude with an "end" step at either the last task's or the configured end
                     * location.
                     */
                    fun run(run: Long) = run(JsonField.of(run))

                    /**
                     * Sets [Builder.run] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.run] with a well-typed [Long] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun run(run: JsonField<Long>) = apply { this.run = run }

                    /**
                     * Returns the service time, in seconds, for the task when the step type is not
                     * start or end.
                     *
                     * When the step type is start or end , the field also returns the service time,
                     * in seconds, spent at the depot when if the vehicle is starting or completing
                     * the trip at one of the depots.
                     */
                    fun service(service: Long) = service(JsonField.of(service))

                    /**
                     * Sets [Builder.service] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.service] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun service(service: JsonField<Long>) = apply { this.service = service }

                    /** Returns the setup time, in seconds, for the task. */
                    fun setup(setup: Long) = setup(JsonField.of(setup))

                    /**
                     * Sets [Builder.setup] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.setup] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun setup(setup: JsonField<Long>) = apply { this.setup = setup }

                    /**
                     * Returns the coordinates after snapping the location of this step to a nearby
                     * road. Please note that this field will not be available in the response when
                     * custom duration or distance matrix were used for cost calculations.
                     */
                    fun snappedLocation(snappedLocation: List<Double>) =
                        snappedLocation(JsonField.of(snappedLocation))

                    /**
                     * Sets [Builder.snappedLocation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.snappedLocation] with a well-typed
                     * `List<Double>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun snappedLocation(snappedLocation: JsonField<List<Double>>) = apply {
                        this.snappedLocation = snappedLocation.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Double] to [Builder.snappedLocation].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSnappedLocation(snappedLocation: Double) = apply {
                        this.snappedLocation =
                            (this.snappedLocation ?: JsonField.of(mutableListOf())).also {
                                checkKnown("snappedLocation", it).add(snappedLocation)
                            }
                    }

                    /**
                     * Returns the type of the step. Its value will always be one of the following:
                     * start, job, pickup, delivery, end. In case the type is start or end, steps
                     * object will not have the id field.
                     */
                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

                    /** Returns the wait time of the vehicle at this step, in seconds. */
                    fun waitingTime(waitingTime: Long) = waitingTime(JsonField.of(waitingTime))

                    /**
                     * Sets [Builder.waitingTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.waitingTime] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun waitingTime(waitingTime: JsonField<Long>) = apply {
                        this.waitingTime = waitingTime
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Step].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Step =
                        Step(
                            id,
                            arrival,
                            depot,
                            description,
                            distance,
                            duration,
                            lateBy,
                            (load ?: JsonMissing.of()).map { it.toImmutable() },
                            (location ?: JsonMissing.of()).map { it.toImmutable() },
                            locationIndex,
                            metadata,
                            (projectedLocation ?: JsonMissing.of()).map { it.toImmutable() },
                            run,
                            service,
                            setup,
                            (snappedLocation ?: JsonMissing.of()).map { it.toImmutable() },
                            type,
                            waitingTime,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Step = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    arrival()
                    depot()
                    description()
                    distance()
                    duration()
                    lateBy()
                    load()
                    location()
                    locationIndex()
                    projectedLocation()
                    run()
                    service()
                    setup()
                    snappedLocation()
                    type()
                    waitingTime()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (arrival.asKnown().isPresent) 1 else 0) +
                        (if (depot.asKnown().isPresent) 1 else 0) +
                        (if (description.asKnown().isPresent) 1 else 0) +
                        (if (distance.asKnown().isPresent) 1 else 0) +
                        (if (duration.asKnown().isPresent) 1 else 0) +
                        (if (lateBy.asKnown().isPresent) 1 else 0) +
                        (load.asKnown().getOrNull()?.size ?: 0) +
                        (location.asKnown().getOrNull()?.size ?: 0) +
                        (if (locationIndex.asKnown().isPresent) 1 else 0) +
                        (projectedLocation.asKnown().getOrNull()?.size ?: 0) +
                        (if (run.asKnown().isPresent) 1 else 0) +
                        (if (service.asKnown().isPresent) 1 else 0) +
                        (if (setup.asKnown().isPresent) 1 else 0) +
                        (snappedLocation.asKnown().getOrNull()?.size ?: 0) +
                        (if (type.asKnown().isPresent) 1 else 0) +
                        (if (waitingTime.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Step &&
                        id == other.id &&
                        arrival == other.arrival &&
                        depot == other.depot &&
                        description == other.description &&
                        distance == other.distance &&
                        duration == other.duration &&
                        lateBy == other.lateBy &&
                        load == other.load &&
                        location == other.location &&
                        locationIndex == other.locationIndex &&
                        metadata == other.metadata &&
                        projectedLocation == other.projectedLocation &&
                        run == other.run &&
                        service == other.service &&
                        setup == other.setup &&
                        snappedLocation == other.snappedLocation &&
                        type == other.type &&
                        waitingTime == other.waitingTime &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        arrival,
                        depot,
                        description,
                        distance,
                        duration,
                        lateBy,
                        load,
                        location,
                        locationIndex,
                        metadata,
                        projectedLocation,
                        run,
                        service,
                        setup,
                        snappedLocation,
                        type,
                        waitingTime,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Step{id=$id, arrival=$arrival, depot=$depot, description=$description, distance=$distance, duration=$duration, lateBy=$lateBy, load=$load, location=$location, locationIndex=$locationIndex, metadata=$metadata, projectedLocation=$projectedLocation, run=$run, service=$service, setup=$setup, snappedLocation=$snappedLocation, type=$type, waitingTime=$waitingTime, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Route &&
                    adoptedCapacity == other.adoptedCapacity &&
                    cost == other.cost &&
                    delivery == other.delivery &&
                    description == other.description &&
                    distance == other.distance &&
                    duration == other.duration &&
                    geometry == other.geometry &&
                    metadata == other.metadata &&
                    pickup == other.pickup &&
                    priority == other.priority &&
                    profile == other.profile &&
                    revenue == other.revenue &&
                    service == other.service &&
                    setup == other.setup &&
                    steps == other.steps &&
                    vehicle == other.vehicle &&
                    vehicleOvertime == other.vehicleOvertime &&
                    waitingTime == other.waitingTime &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    adoptedCapacity,
                    cost,
                    delivery,
                    description,
                    distance,
                    duration,
                    geometry,
                    metadata,
                    pickup,
                    priority,
                    profile,
                    revenue,
                    service,
                    setup,
                    steps,
                    vehicle,
                    vehicleOvertime,
                    waitingTime,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Route{adoptedCapacity=$adoptedCapacity, cost=$cost, delivery=$delivery, description=$description, distance=$distance, duration=$duration, geometry=$geometry, metadata=$metadata, pickup=$pickup, priority=$priority, profile=$profile, revenue=$revenue, service=$service, setup=$setup, steps=$steps, vehicle=$vehicle, vehicleOvertime=$vehicleOvertime, waitingTime=$waitingTime, additionalProperties=$additionalProperties}"
        }

        /**
         * An object to describe the summarized result of the optimization request. This object can
         * be useful to quickly get an overview of the important result parameters.
         */
        class Summary
        private constructor(
            private val cost: JsonField<Long>,
            private val delivery: JsonField<List<Long>>,
            private val distance: JsonField<Double>,
            private val duration: JsonField<Long>,
            private val numLateVisits: JsonField<Long>,
            private val pickup: JsonField<List<Long>>,
            private val priority: JsonField<Long>,
            private val revenue: JsonField<Long>,
            private val routes: JsonField<Long>,
            private val service: JsonField<Long>,
            private val setup: JsonField<Long>,
            private val totalVisitLateness: JsonField<Long>,
            private val unassigned: JsonField<Long>,
            private val waitingTime: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cost") @ExcludeMissing cost: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("delivery")
                @ExcludeMissing
                delivery: JsonField<List<Long>> = JsonMissing.of(),
                @JsonProperty("distance")
                @ExcludeMissing
                distance: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("duration")
                @ExcludeMissing
                duration: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("num_late_visits")
                @ExcludeMissing
                numLateVisits: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("pickup")
                @ExcludeMissing
                pickup: JsonField<List<Long>> = JsonMissing.of(),
                @JsonProperty("priority")
                @ExcludeMissing
                priority: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("revenue")
                @ExcludeMissing
                revenue: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("routes") @ExcludeMissing routes: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("service")
                @ExcludeMissing
                service: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("setup") @ExcludeMissing setup: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("total_visit_lateness")
                @ExcludeMissing
                totalVisitLateness: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("unassigned")
                @ExcludeMissing
                unassigned: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("waiting_time")
                @ExcludeMissing
                waitingTime: JsonField<Long> = JsonMissing.of(),
            ) : this(
                cost,
                delivery,
                distance,
                duration,
                numLateVisits,
                pickup,
                priority,
                revenue,
                routes,
                service,
                setup,
                totalVisitLateness,
                unassigned,
                waitingTime,
                mutableMapOf(),
            )

            /**
             * Returns the total cost of all the routes returned in the solution. The unit of cost
             * type depends on the value of travel_cost attribute in the optimization request.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun cost(): Optional<Long> = cost.getOptional("cost")

            /**
             * Returns the sum of all quantities that were delivered in the optimized solution. If
             * quantities of different dimensions were delivered, then a matching number of elements
             * is returned in the delivery array.
             *
             * Please note that when both shipments and jobs are provided, this field corresponds to
             * the sum of quantities delivered as part of all the assigned shipments and jobs .
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun delivery(): Optional<List<Long>> = delivery.getOptional("delivery")

            /**
             * Returns the total distance of all routes, in meters. It is equal to the sum of
             * distances of individual routes.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun distance(): Optional<Double> = distance.getOptional("distance")

            /**
             * Returns the total drive time, in seconds, needed to cover all routes. Please note
             * that it does not include the service, setup or the waiting durations elapsed on these
             * routes.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun duration(): Optional<Long> = duration.getOptional("duration")

            /**
             * Returns the total number of tasks across all routes that failed to start within their
             * scheduled time windows.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun numLateVisits(): Optional<Long> = numLateVisits.getOptional("num_late_visits")

            /**
             * Returns the sum of all quantities that were picked-up in the optimized solution. If
             * quantities of different dimensions were picked-up, then a matching number of elements
             * is returned in the pickup array.
             *
             * Please note that when both shipments and jobs are provided, this field corresponds to
             * the sum of quantities picked-up as part of all the assigned shipments and jobs .
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun pickup(): Optional<List<Long>> = pickup.getOptional("pickup")

            /**
             * Returns the sum of priorities of all tasks that were assigned.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun priority(): Optional<Long> = priority.getOptional("priority")

            /**
             * Returns the revenue earned by completing all the assigned tasks. Overall profit
             * earned by following the suggested route plan can be inferred by subtracting the cost
             * of the solution from the reported revenue.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun revenue(): Optional<Long> = revenue.getOptional("revenue")

            /**
             * Returns the total number of routes in the solution.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun routes(): Optional<Long> = routes.getOptional("routes")

            /**
             * Returns the total service time, in seconds, for all the routes in the solution. It is
             * equal to the sum of service time of individual tasks that were assigned and the time
             * spent loading/unloading items at designated depots by all vehicles.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun service(): Optional<Long> = service.getOptional("service")

            /**
             * Returns the total setup time, in seconds, of all assigned tasks. It is equal to the
             * sum of setup time of individual tasks that were assigned.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun setup(): Optional<Long> = setup.getOptional("setup")

            /**
             * Returns the total duration, in seconds, that tasks across all routes were delayed
             * from starting after their scheduled time windows had passed.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun totalVisitLateness(): Optional<Long> =
                totalVisitLateness.getOptional("total_visit_lateness")

            /**
             * Returns the number of unfulfilled tasks in the solution.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun unassigned(): Optional<Long> = unassigned.getOptional("unassigned")

            /**
             * Returns the sum of durations spent waiting, in seconds, by vehicles on all routes.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun waitingTime(): Optional<Long> = waitingTime.getOptional("waiting_time")

            /**
             * Returns the raw JSON value of [cost].
             *
             * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Long> = cost

            /**
             * Returns the raw JSON value of [delivery].
             *
             * Unlike [delivery], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("delivery")
            @ExcludeMissing
            fun _delivery(): JsonField<List<Long>> = delivery

            /**
             * Returns the raw JSON value of [distance].
             *
             * Unlike [distance], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Double> = distance

            /**
             * Returns the raw JSON value of [duration].
             *
             * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Long> = duration

            /**
             * Returns the raw JSON value of [numLateVisits].
             *
             * Unlike [numLateVisits], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("num_late_visits")
            @ExcludeMissing
            fun _numLateVisits(): JsonField<Long> = numLateVisits

            /**
             * Returns the raw JSON value of [pickup].
             *
             * Unlike [pickup], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pickup") @ExcludeMissing fun _pickup(): JsonField<List<Long>> = pickup

            /**
             * Returns the raw JSON value of [priority].
             *
             * Unlike [priority], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Long> = priority

            /**
             * Returns the raw JSON value of [revenue].
             *
             * Unlike [revenue], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("revenue") @ExcludeMissing fun _revenue(): JsonField<Long> = revenue

            /**
             * Returns the raw JSON value of [routes].
             *
             * Unlike [routes], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("routes") @ExcludeMissing fun _routes(): JsonField<Long> = routes

            /**
             * Returns the raw JSON value of [service].
             *
             * Unlike [service], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("service") @ExcludeMissing fun _service(): JsonField<Long> = service

            /**
             * Returns the raw JSON value of [setup].
             *
             * Unlike [setup], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("setup") @ExcludeMissing fun _setup(): JsonField<Long> = setup

            /**
             * Returns the raw JSON value of [totalVisitLateness].
             *
             * Unlike [totalVisitLateness], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("total_visit_lateness")
            @ExcludeMissing
            fun _totalVisitLateness(): JsonField<Long> = totalVisitLateness

            /**
             * Returns the raw JSON value of [unassigned].
             *
             * Unlike [unassigned], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unassigned")
            @ExcludeMissing
            fun _unassigned(): JsonField<Long> = unassigned

            /**
             * Returns the raw JSON value of [waitingTime].
             *
             * Unlike [waitingTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("waiting_time")
            @ExcludeMissing
            fun _waitingTime(): JsonField<Long> = waitingTime

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

                /** Returns a mutable builder for constructing an instance of [Summary]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Summary]. */
            class Builder internal constructor() {

                private var cost: JsonField<Long> = JsonMissing.of()
                private var delivery: JsonField<MutableList<Long>>? = null
                private var distance: JsonField<Double> = JsonMissing.of()
                private var duration: JsonField<Long> = JsonMissing.of()
                private var numLateVisits: JsonField<Long> = JsonMissing.of()
                private var pickup: JsonField<MutableList<Long>>? = null
                private var priority: JsonField<Long> = JsonMissing.of()
                private var revenue: JsonField<Long> = JsonMissing.of()
                private var routes: JsonField<Long> = JsonMissing.of()
                private var service: JsonField<Long> = JsonMissing.of()
                private var setup: JsonField<Long> = JsonMissing.of()
                private var totalVisitLateness: JsonField<Long> = JsonMissing.of()
                private var unassigned: JsonField<Long> = JsonMissing.of()
                private var waitingTime: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(summary: Summary) = apply {
                    cost = summary.cost
                    delivery = summary.delivery.map { it.toMutableList() }
                    distance = summary.distance
                    duration = summary.duration
                    numLateVisits = summary.numLateVisits
                    pickup = summary.pickup.map { it.toMutableList() }
                    priority = summary.priority
                    revenue = summary.revenue
                    routes = summary.routes
                    service = summary.service
                    setup = summary.setup
                    totalVisitLateness = summary.totalVisitLateness
                    unassigned = summary.unassigned
                    waitingTime = summary.waitingTime
                    additionalProperties = summary.additionalProperties.toMutableMap()
                }

                /**
                 * Returns the total cost of all the routes returned in the solution. The unit of
                 * cost type depends on the value of travel_cost attribute in the optimization
                 * request.
                 */
                fun cost(cost: Long) = cost(JsonField.of(cost))

                /**
                 * Sets [Builder.cost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cost] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cost(cost: JsonField<Long>) = apply { this.cost = cost }

                /**
                 * Returns the sum of all quantities that were delivered in the optimized solution.
                 * If quantities of different dimensions were delivered, then a matching number of
                 * elements is returned in the delivery array.
                 *
                 * Please note that when both shipments and jobs are provided, this field
                 * corresponds to the sum of quantities delivered as part of all the assigned
                 * shipments and jobs .
                 */
                fun delivery(delivery: List<Long>) = delivery(JsonField.of(delivery))

                /**
                 * Sets [Builder.delivery] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.delivery] with a well-typed `List<Long>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun delivery(delivery: JsonField<List<Long>>) = apply {
                    this.delivery = delivery.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Long] to [Builder.delivery].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDelivery(delivery: Long) = apply {
                    this.delivery =
                        (this.delivery ?: JsonField.of(mutableListOf())).also {
                            checkKnown("delivery", it).add(delivery)
                        }
                }

                /**
                 * Returns the total distance of all routes, in meters. It is equal to the sum of
                 * distances of individual routes.
                 */
                fun distance(distance: Double) = distance(JsonField.of(distance))

                /**
                 * Sets [Builder.distance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.distance] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

                /**
                 * Returns the total drive time, in seconds, needed to cover all routes. Please note
                 * that it does not include the service, setup or the waiting durations elapsed on
                 * these routes.
                 */
                fun duration(duration: Long) = duration(JsonField.of(duration))

                /**
                 * Sets [Builder.duration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.duration] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun duration(duration: JsonField<Long>) = apply { this.duration = duration }

                /**
                 * Returns the total number of tasks across all routes that failed to start within
                 * their scheduled time windows.
                 */
                fun numLateVisits(numLateVisits: Long) = numLateVisits(JsonField.of(numLateVisits))

                /**
                 * Sets [Builder.numLateVisits] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.numLateVisits] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun numLateVisits(numLateVisits: JsonField<Long>) = apply {
                    this.numLateVisits = numLateVisits
                }

                /**
                 * Returns the sum of all quantities that were picked-up in the optimized solution.
                 * If quantities of different dimensions were picked-up, then a matching number of
                 * elements is returned in the pickup array.
                 *
                 * Please note that when both shipments and jobs are provided, this field
                 * corresponds to the sum of quantities picked-up as part of all the assigned
                 * shipments and jobs .
                 */
                fun pickup(pickup: List<Long>) = pickup(JsonField.of(pickup))

                /**
                 * Sets [Builder.pickup] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pickup] with a well-typed `List<Long>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pickup(pickup: JsonField<List<Long>>) = apply {
                    this.pickup = pickup.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Long] to [Builder.pickup].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPickup(pickup: Long) = apply {
                    this.pickup =
                        (this.pickup ?: JsonField.of(mutableListOf())).also {
                            checkKnown("pickup", it).add(pickup)
                        }
                }

                /** Returns the sum of priorities of all tasks that were assigned. */
                fun priority(priority: Long) = priority(JsonField.of(priority))

                /**
                 * Sets [Builder.priority] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.priority] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun priority(priority: JsonField<Long>) = apply { this.priority = priority }

                /**
                 * Returns the revenue earned by completing all the assigned tasks. Overall profit
                 * earned by following the suggested route plan can be inferred by subtracting the
                 * cost of the solution from the reported revenue.
                 */
                fun revenue(revenue: Long) = revenue(JsonField.of(revenue))

                /**
                 * Sets [Builder.revenue] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.revenue] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun revenue(revenue: JsonField<Long>) = apply { this.revenue = revenue }

                /** Returns the total number of routes in the solution. */
                fun routes(routes: Long) = routes(JsonField.of(routes))

                /**
                 * Sets [Builder.routes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routes] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun routes(routes: JsonField<Long>) = apply { this.routes = routes }

                /**
                 * Returns the total service time, in seconds, for all the routes in the solution.
                 * It is equal to the sum of service time of individual tasks that were assigned and
                 * the time spent loading/unloading items at designated depots by all vehicles.
                 */
                fun service(service: Long) = service(JsonField.of(service))

                /**
                 * Sets [Builder.service] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.service] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun service(service: JsonField<Long>) = apply { this.service = service }

                /**
                 * Returns the total setup time, in seconds, of all assigned tasks. It is equal to
                 * the sum of setup time of individual tasks that were assigned.
                 */
                fun setup(setup: Long) = setup(JsonField.of(setup))

                /**
                 * Sets [Builder.setup] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.setup] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun setup(setup: JsonField<Long>) = apply { this.setup = setup }

                /**
                 * Returns the total duration, in seconds, that tasks across all routes were delayed
                 * from starting after their scheduled time windows had passed.
                 */
                fun totalVisitLateness(totalVisitLateness: Long) =
                    totalVisitLateness(JsonField.of(totalVisitLateness))

                /**
                 * Sets [Builder.totalVisitLateness] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalVisitLateness] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun totalVisitLateness(totalVisitLateness: JsonField<Long>) = apply {
                    this.totalVisitLateness = totalVisitLateness
                }

                /** Returns the number of unfulfilled tasks in the solution. */
                fun unassigned(unassigned: Long) = unassigned(JsonField.of(unassigned))

                /**
                 * Sets [Builder.unassigned] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unassigned] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unassigned(unassigned: JsonField<Long>) = apply { this.unassigned = unassigned }

                /**
                 * Returns the sum of durations spent waiting, in seconds, by vehicles on all
                 * routes.
                 */
                fun waitingTime(waitingTime: Long) = waitingTime(JsonField.of(waitingTime))

                /**
                 * Sets [Builder.waitingTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.waitingTime] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun waitingTime(waitingTime: JsonField<Long>) = apply {
                    this.waitingTime = waitingTime
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Summary].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Summary =
                    Summary(
                        cost,
                        (delivery ?: JsonMissing.of()).map { it.toImmutable() },
                        distance,
                        duration,
                        numLateVisits,
                        (pickup ?: JsonMissing.of()).map { it.toImmutable() },
                        priority,
                        revenue,
                        routes,
                        service,
                        setup,
                        totalVisitLateness,
                        unassigned,
                        waitingTime,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Summary = apply {
                if (validated) {
                    return@apply
                }

                cost()
                delivery()
                distance()
                duration()
                numLateVisits()
                pickup()
                priority()
                revenue()
                routes()
                service()
                setup()
                totalVisitLateness()
                unassigned()
                waitingTime()
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
                (if (cost.asKnown().isPresent) 1 else 0) +
                    (delivery.asKnown().getOrNull()?.size ?: 0) +
                    (if (distance.asKnown().isPresent) 1 else 0) +
                    (if (duration.asKnown().isPresent) 1 else 0) +
                    (if (numLateVisits.asKnown().isPresent) 1 else 0) +
                    (pickup.asKnown().getOrNull()?.size ?: 0) +
                    (if (priority.asKnown().isPresent) 1 else 0) +
                    (if (revenue.asKnown().isPresent) 1 else 0) +
                    (if (routes.asKnown().isPresent) 1 else 0) +
                    (if (service.asKnown().isPresent) 1 else 0) +
                    (if (setup.asKnown().isPresent) 1 else 0) +
                    (if (totalVisitLateness.asKnown().isPresent) 1 else 0) +
                    (if (unassigned.asKnown().isPresent) 1 else 0) +
                    (if (waitingTime.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Summary &&
                    cost == other.cost &&
                    delivery == other.delivery &&
                    distance == other.distance &&
                    duration == other.duration &&
                    numLateVisits == other.numLateVisits &&
                    pickup == other.pickup &&
                    priority == other.priority &&
                    revenue == other.revenue &&
                    routes == other.routes &&
                    service == other.service &&
                    setup == other.setup &&
                    totalVisitLateness == other.totalVisitLateness &&
                    unassigned == other.unassigned &&
                    waitingTime == other.waitingTime &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    cost,
                    delivery,
                    distance,
                    duration,
                    numLateVisits,
                    pickup,
                    priority,
                    revenue,
                    routes,
                    service,
                    setup,
                    totalVisitLateness,
                    unassigned,
                    waitingTime,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Summary{cost=$cost, delivery=$delivery, distance=$distance, duration=$duration, numLateVisits=$numLateVisits, pickup=$pickup, priority=$priority, revenue=$revenue, routes=$routes, service=$service, setup=$setup, totalVisitLateness=$totalVisitLateness, unassigned=$unassigned, waitingTime=$waitingTime, additionalProperties=$additionalProperties}"
        }

        class Unassigned
        private constructor(
            private val id: JsonField<String>,
            private val location: JsonField<List<Double>>,
            private val outsourcingCost: JsonField<Long>,
            private val reason: JsonField<String>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("location")
                @ExcludeMissing
                location: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("outsourcing_cost")
                @ExcludeMissing
                outsourcingCost: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(id, location, outsourcingCost, reason, type, mutableMapOf())

            /**
             * Returns the ID of the unassigned task. The ID returned is the same as that provided
             * for the given task in the jobs or the shipments part in the input POST optimization
             * request.
             *
             * **Note:** Since both integer and string value types are supported for task IDs, the
             * value type returned for this field will depend on the value type provided in the
             * input request for the unassigned task.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Returns the location of the unassigned tasks in the \[latitude, longitude\] format.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun location(): Optional<List<Double>> = location.getOptional("location")

            /**
             * Returns the cost of outsourcing the task. This is the same value as provided in the
             * input. The field is present only if a outsourcing_cost was provided for the
             * unassigned task.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun outsourcingCost(): Optional<Long> = outsourcingCost.getOptional("outsourcing_cost")

            /**
             * Returns the most likely reason due to which the task remained unassigned. The
             * optimization service can capture the following causes of tasks remaining unassigned,
             * among others:
             * - unmatched skills of the tasks
             * - insufficient capacity of vehicle to accommodate the tasks
             * - time_window requirements of the tasks or the vehicles
             * - violation of vehicle’s max_activity_waiting_time constraint
             * - violation of vehicle’s max_tasks or max_stops constraints
             * - violation of vehicle’s max_distance or max_travel_time constraints
             * - task unassigned due to zone constraints
             * - task unassigned due to depot constraints
             * - task unassigned due to load type incompatibility constraints
             * - task unassigned due to max time in vehicle constraint
             * - task unassigned as it is unprofitable
             * - task unassigned due to low outsourcing cost
             * - task unassigned due to infeasible conditions specified in relations attribute
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun reason(): Optional<String> = reason.getOptional("reason")

            /**
             * Returns the type of the task that was unassigned. Will always belong to one of job,
             * pickup, or delivery.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [location].
             *
             * Unlike [location], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("location")
            @ExcludeMissing
            fun _location(): JsonField<List<Double>> = location

            /**
             * Returns the raw JSON value of [outsourcingCost].
             *
             * Unlike [outsourcingCost], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("outsourcing_cost")
            @ExcludeMissing
            fun _outsourcingCost(): JsonField<Long> = outsourcingCost

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [Unassigned]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Unassigned]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var location: JsonField<MutableList<Double>>? = null
                private var outsourcingCost: JsonField<Long> = JsonMissing.of()
                private var reason: JsonField<String> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unassigned: Unassigned) = apply {
                    id = unassigned.id
                    location = unassigned.location.map { it.toMutableList() }
                    outsourcingCost = unassigned.outsourcingCost
                    reason = unassigned.reason
                    type = unassigned.type
                    additionalProperties = unassigned.additionalProperties.toMutableMap()
                }

                /**
                 * Returns the ID of the unassigned task. The ID returned is the same as that
                 * provided for the given task in the jobs or the shipments part in the input POST
                 * optimization request.
                 *
                 * **Note:** Since both integer and string value types are supported for task IDs,
                 * the value type returned for this field will depend on the value type provided in
                 * the input request for the unassigned task.
                 */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Returns the location of the unassigned tasks in the \[latitude, longitude\]
                 * format.
                 */
                fun location(location: List<Double>) = location(JsonField.of(location))

                /**
                 * Sets [Builder.location] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.location] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun location(location: JsonField<List<Double>>) = apply {
                    this.location = location.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.location].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLocation(location: Double) = apply {
                    this.location =
                        (this.location ?: JsonField.of(mutableListOf())).also {
                            checkKnown("location", it).add(location)
                        }
                }

                /**
                 * Returns the cost of outsourcing the task. This is the same value as provided in
                 * the input. The field is present only if a outsourcing_cost was provided for the
                 * unassigned task.
                 */
                fun outsourcingCost(outsourcingCost: Long) =
                    outsourcingCost(JsonField.of(outsourcingCost))

                /**
                 * Sets [Builder.outsourcingCost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.outsourcingCost] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun outsourcingCost(outsourcingCost: JsonField<Long>) = apply {
                    this.outsourcingCost = outsourcingCost
                }

                /**
                 * Returns the most likely reason due to which the task remained unassigned. The
                 * optimization service can capture the following causes of tasks remaining
                 * unassigned, among others:
                 * - unmatched skills of the tasks
                 * - insufficient capacity of vehicle to accommodate the tasks
                 * - time_window requirements of the tasks or the vehicles
                 * - violation of vehicle’s max_activity_waiting_time constraint
                 * - violation of vehicle’s max_tasks or max_stops constraints
                 * - violation of vehicle’s max_distance or max_travel_time constraints
                 * - task unassigned due to zone constraints
                 * - task unassigned due to depot constraints
                 * - task unassigned due to load type incompatibility constraints
                 * - task unassigned due to max time in vehicle constraint
                 * - task unassigned as it is unprofitable
                 * - task unassigned due to low outsourcing cost
                 * - task unassigned due to infeasible conditions specified in relations attribute
                 */
                fun reason(reason: String) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

                /**
                 * Returns the type of the task that was unassigned. Will always belong to one of
                 * job, pickup, or delivery.
                 */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Unassigned].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Unassigned =
                    Unassigned(
                        id,
                        (location ?: JsonMissing.of()).map { it.toImmutable() },
                        outsourcingCost,
                        reason,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Unassigned = apply {
                if (validated) {
                    return@apply
                }

                id()
                location()
                outsourcingCost()
                reason()
                type()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (location.asKnown().getOrNull()?.size ?: 0) +
                    (if (outsourcingCost.asKnown().isPresent) 1 else 0) +
                    (if (reason.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Unassigned &&
                    id == other.id &&
                    location == other.location &&
                    outsourcingCost == other.outsourcingCost &&
                    reason == other.reason &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, location, outsourcingCost, reason, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Unassigned{id=$id, location=$location, outsourcingCost=$outsourcingCost, reason=$reason, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                code == other.code &&
                error == other.error &&
                routes == other.routes &&
                routingProfiles == other.routingProfiles &&
                summary == other.summary &&
                unassigned == other.unassigned &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                code,
                error,
                routes,
                routingProfiles,
                summary,
                unassigned,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{code=$code, error=$error, routes=$routes, routingProfiles=$routingProfiles, summary=$summary, unassigned=$unassigned, additionalProperties=$additionalProperties}"
    }

    /**
     * It indicates the overall status or result of the API request denoting whether the operation
     * was successful or did it encounter any errors.
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

            @JvmField val OK = of("Ok")

            @JvmField val ERROR = of("Error")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            OK,
            ERROR,
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
            OK,
            ERROR,
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
                OK -> Value.OK
                ERROR -> Value.ERROR
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
                OK -> Known.OK
                ERROR -> Known.ERROR
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V2RetrieveResultResponse &&
            description == other.description &&
            message == other.message &&
            result == other.result &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(description, message, result, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V2RetrieveResultResponse{description=$description, message=$message, result=$result, status=$status, additionalProperties=$additionalProperties}"
}
