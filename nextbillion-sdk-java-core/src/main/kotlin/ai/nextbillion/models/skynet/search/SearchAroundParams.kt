// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.search

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

/** Around Search */
class SearchAroundParams
private constructor(
    private val center: String,
    private val key: String,
    private val radius: Double,
    private val filter: String?,
    private val includeAllOfAttributes: String?,
    private val includeAnyOfAttributes: String?,
    private val maxSearchLimit: Boolean?,
    private val pn: Long?,
    private val ps: Long?,
    private val sortBy: SortBy?,
    private val sortDestination: String?,
    private val sortDrivingMode: SortDrivingMode?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Location coordinates of the point which would act as the center of the circular area to be
     * searched.
     */
    fun center(): String = center

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /** Radius, in meters, of the circular area to be searched. */
    fun radius(): Double = radius

    /**
     * **`tags` parameter will be deprecated soon! Please use the `include_any_of_attributes` or
     * `include_all_of_attributes` parameters to match assets based on their labels or markers.**
     *
     * Use this parameter to filter the assets found inside the specified area by their `tags`.
     * Multiple `tags` can be separated using commas (`,`).
     *
     * Please note the tags are case sensitive.
     */
    fun filter(): Optional<String> = Optional.ofNullable(filter)

    /**
     * Use this parameter to filter the assets found inside the specified area by their
     * `attributes`. Only the assets having all the `attributes` that are added to this parameter,
     * will be returned in the search results. Multiple `attributes` can be separated using pipes
     * (`|`).
     *
     * Please note the attributes are case sensitive. Also, this parameter can not be used in
     * conjunction with `include_any_of_attributes` parameter.
     */
    fun includeAllOfAttributes(): Optional<String> = Optional.ofNullable(includeAllOfAttributes)

    /**
     * Use this parameter to filter the assets found inside the specified area by their
     * `attributes`. Assets having at least one of the `attributes` added to this parameter, will be
     * returned in the search results. Multiple `attributes` can be separated using pipes (`|`).
     *
     * Please note the attributes are case sensitive. Also, this parameter can not be used in
     * conjunction with `include_all_of_attributes` parameter.
     */
    fun includeAnyOfAttributes(): Optional<String> = Optional.ofNullable(includeAnyOfAttributes)

    /**
     * When true, the maximum limit is 20Km for around search API and 48000 Km2 for other search
     * methods.
     */
    fun maxSearchLimit(): Optional<Boolean> = Optional.ofNullable(maxSearchLimit)

    /**
     * Denotes page number. Use this along with the `ps` parameter to implement pagination for your
     * searched results. This parameter does not have a maximum limit but would return an empty
     * response in case a higher value is provided when the result-set itself is smaller.
     */
    fun pn(): Optional<Long> = Optional.ofNullable(pn)

    /**
     * Denotes number of search results per page. Use this along with the `pn` parameter to
     * implement pagination for your searched results.
     */
    fun ps(): Optional<Long> = Optional.ofNullable(ps)

    /**
     * Specify the metric to sort the assets returned in the search result. The valid values are:
     * - **distance** : Sorts the assets by driving distance to the given `sort_destination` .
     * - **duration** : Sorts the assets by travel time to the given `sort_destination` .
     * - **straight_distance** : Sort the assets by straight-line distance to the given
     *   `sort-destination` .
     */
    fun sortBy(): Optional<SortBy> = Optional.ofNullable(sortBy)

    /**
     * Specifies the location coordinates of the point which acts as destination for sorting the
     * assets in the search results. The service will sort each asset based on the driving distance
     * or travel time to this destination, from its current location. Use the `sort_by` parameter to
     * configure the metric that should be used for sorting the assets. Please note that
     * `sort_destination` is required when `sort_by` is provided.
     */
    fun sortDestination(): Optional<String> = Optional.ofNullable(sortDestination)

    /**
     * Specifies the driving mode to be used for determining travel duration or driving distance for
     * sorting the assets in search result.
     */
    fun sortDrivingMode(): Optional<SortDrivingMode> = Optional.ofNullable(sortDrivingMode)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SearchAroundParams].
         *
         * The following fields are required:
         * ```java
         * .center()
         * .key()
         * .radius()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SearchAroundParams]. */
    class Builder internal constructor() {

        private var center: String? = null
        private var key: String? = null
        private var radius: Double? = null
        private var filter: String? = null
        private var includeAllOfAttributes: String? = null
        private var includeAnyOfAttributes: String? = null
        private var maxSearchLimit: Boolean? = null
        private var pn: Long? = null
        private var ps: Long? = null
        private var sortBy: SortBy? = null
        private var sortDestination: String? = null
        private var sortDrivingMode: SortDrivingMode? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(searchAroundParams: SearchAroundParams) = apply {
            center = searchAroundParams.center
            key = searchAroundParams.key
            radius = searchAroundParams.radius
            filter = searchAroundParams.filter
            includeAllOfAttributes = searchAroundParams.includeAllOfAttributes
            includeAnyOfAttributes = searchAroundParams.includeAnyOfAttributes
            maxSearchLimit = searchAroundParams.maxSearchLimit
            pn = searchAroundParams.pn
            ps = searchAroundParams.ps
            sortBy = searchAroundParams.sortBy
            sortDestination = searchAroundParams.sortDestination
            sortDrivingMode = searchAroundParams.sortDrivingMode
            additionalHeaders = searchAroundParams.additionalHeaders.toBuilder()
            additionalQueryParams = searchAroundParams.additionalQueryParams.toBuilder()
        }

        /**
         * Location coordinates of the point which would act as the center of the circular area to
         * be searched.
         */
        fun center(center: String) = apply { this.center = center }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /** Radius, in meters, of the circular area to be searched. */
        fun radius(radius: Double) = apply { this.radius = radius }

        /**
         * **`tags` parameter will be deprecated soon! Please use the `include_any_of_attributes` or
         * `include_all_of_attributes` parameters to match assets based on their labels or
         * markers.**
         *
         * Use this parameter to filter the assets found inside the specified area by their `tags`.
         * Multiple `tags` can be separated using commas (`,`).
         *
         * Please note the tags are case sensitive.
         */
        fun filter(filter: String?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

        /**
         * Use this parameter to filter the assets found inside the specified area by their
         * `attributes`. Only the assets having all the `attributes` that are added to this
         * parameter, will be returned in the search results. Multiple `attributes` can be separated
         * using pipes (`|`).
         *
         * Please note the attributes are case sensitive. Also, this parameter can not be used in
         * conjunction with `include_any_of_attributes` parameter.
         */
        fun includeAllOfAttributes(includeAllOfAttributes: String?) = apply {
            this.includeAllOfAttributes = includeAllOfAttributes
        }

        /**
         * Alias for calling [Builder.includeAllOfAttributes] with
         * `includeAllOfAttributes.orElse(null)`.
         */
        fun includeAllOfAttributes(includeAllOfAttributes: Optional<String>) =
            includeAllOfAttributes(includeAllOfAttributes.getOrNull())

        /**
         * Use this parameter to filter the assets found inside the specified area by their
         * `attributes`. Assets having at least one of the `attributes` added to this parameter,
         * will be returned in the search results. Multiple `attributes` can be separated using
         * pipes (`|`).
         *
         * Please note the attributes are case sensitive. Also, this parameter can not be used in
         * conjunction with `include_all_of_attributes` parameter.
         */
        fun includeAnyOfAttributes(includeAnyOfAttributes: String?) = apply {
            this.includeAnyOfAttributes = includeAnyOfAttributes
        }

        /**
         * Alias for calling [Builder.includeAnyOfAttributes] with
         * `includeAnyOfAttributes.orElse(null)`.
         */
        fun includeAnyOfAttributes(includeAnyOfAttributes: Optional<String>) =
            includeAnyOfAttributes(includeAnyOfAttributes.getOrNull())

        /**
         * When true, the maximum limit is 20Km for around search API and 48000 Km2 for other search
         * methods.
         */
        fun maxSearchLimit(maxSearchLimit: Boolean?) = apply {
            this.maxSearchLimit = maxSearchLimit
        }

        /**
         * Alias for [Builder.maxSearchLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxSearchLimit(maxSearchLimit: Boolean) = maxSearchLimit(maxSearchLimit as Boolean?)

        /** Alias for calling [Builder.maxSearchLimit] with `maxSearchLimit.orElse(null)`. */
        fun maxSearchLimit(maxSearchLimit: Optional<Boolean>) =
            maxSearchLimit(maxSearchLimit.getOrNull())

        /**
         * Denotes page number. Use this along with the `ps` parameter to implement pagination for
         * your searched results. This parameter does not have a maximum limit but would return an
         * empty response in case a higher value is provided when the result-set itself is smaller.
         */
        fun pn(pn: Long?) = apply { this.pn = pn }

        /**
         * Alias for [Builder.pn].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pn(pn: Long) = pn(pn as Long?)

        /** Alias for calling [Builder.pn] with `pn.orElse(null)`. */
        fun pn(pn: Optional<Long>) = pn(pn.getOrNull())

        /**
         * Denotes number of search results per page. Use this along with the `pn` parameter to
         * implement pagination for your searched results.
         */
        fun ps(ps: Long?) = apply { this.ps = ps }

        /**
         * Alias for [Builder.ps].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun ps(ps: Long) = ps(ps as Long?)

        /** Alias for calling [Builder.ps] with `ps.orElse(null)`. */
        fun ps(ps: Optional<Long>) = ps(ps.getOrNull())

        /**
         * Specify the metric to sort the assets returned in the search result. The valid values
         * are:
         * - **distance** : Sorts the assets by driving distance to the given `sort_destination` .
         * - **duration** : Sorts the assets by travel time to the given `sort_destination` .
         * - **straight_distance** : Sort the assets by straight-line distance to the given
         *   `sort-destination` .
         */
        fun sortBy(sortBy: SortBy?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<SortBy>) = sortBy(sortBy.getOrNull())

        /**
         * Specifies the location coordinates of the point which acts as destination for sorting the
         * assets in the search results. The service will sort each asset based on the driving
         * distance or travel time to this destination, from its current location. Use the `sort_by`
         * parameter to configure the metric that should be used for sorting the assets. Please note
         * that `sort_destination` is required when `sort_by` is provided.
         */
        fun sortDestination(sortDestination: String?) = apply {
            this.sortDestination = sortDestination
        }

        /** Alias for calling [Builder.sortDestination] with `sortDestination.orElse(null)`. */
        fun sortDestination(sortDestination: Optional<String>) =
            sortDestination(sortDestination.getOrNull())

        /**
         * Specifies the driving mode to be used for determining travel duration or driving distance
         * for sorting the assets in search result.
         */
        fun sortDrivingMode(sortDrivingMode: SortDrivingMode?) = apply {
            this.sortDrivingMode = sortDrivingMode
        }

        /** Alias for calling [Builder.sortDrivingMode] with `sortDrivingMode.orElse(null)`. */
        fun sortDrivingMode(sortDrivingMode: Optional<SortDrivingMode>) =
            sortDrivingMode(sortDrivingMode.getOrNull())

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
         * Returns an immutable instance of [SearchAroundParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .center()
         * .key()
         * .radius()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SearchAroundParams =
            SearchAroundParams(
                checkRequired("center", center),
                checkRequired("key", key),
                checkRequired("radius", radius),
                filter,
                includeAllOfAttributes,
                includeAnyOfAttributes,
                maxSearchLimit,
                pn,
                ps,
                sortBy,
                sortDestination,
                sortDrivingMode,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("center", center)
                put("key", key)
                put("radius", radius.toString())
                filter?.let { put("filter", it) }
                includeAllOfAttributes?.let { put("include_all_of_attributes", it) }
                includeAnyOfAttributes?.let { put("include_any_of_attributes", it) }
                maxSearchLimit?.let { put("max_search_limit", it.toString()) }
                pn?.let { put("pn", it.toString()) }
                ps?.let { put("ps", it.toString()) }
                sortBy?.let { put("sort_by", it.toString()) }
                sortDestination?.let { put("sort_destination", it) }
                sortDrivingMode?.let { put("sort_driving_mode", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Specify the metric to sort the assets returned in the search result. The valid values are:
     * - **distance** : Sorts the assets by driving distance to the given `sort_destination` .
     * - **duration** : Sorts the assets by travel time to the given `sort_destination` .
     * - **straight_distance** : Sort the assets by straight-line distance to the given
     *   `sort-destination` .
     */
    class SortBy @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DISTANCE = of("`distance`")

            @JvmField val DURATION = of("`duration`")

            @JvmField val STRAIGHT_DISTANCE = of("`straight_distance`")

            @JvmStatic fun of(value: String) = SortBy(JsonField.of(value))
        }

        /** An enum containing [SortBy]'s known values. */
        enum class Known {
            DISTANCE,
            DURATION,
            STRAIGHT_DISTANCE,
        }

        /**
         * An enum containing [SortBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DISTANCE,
            DURATION,
            STRAIGHT_DISTANCE,
            /** An enum member indicating that [SortBy] was instantiated with an unknown value. */
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
                DISTANCE -> Value.DISTANCE
                DURATION -> Value.DURATION
                STRAIGHT_DISTANCE -> Value.STRAIGHT_DISTANCE
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
                DISTANCE -> Known.DISTANCE
                DURATION -> Known.DURATION
                STRAIGHT_DISTANCE -> Known.STRAIGHT_DISTANCE
                else -> throw NextbillionSdkInvalidDataException("Unknown SortBy: $value")
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

        fun validate(): SortBy = apply {
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

            return /* spotless:off */ other is SortBy && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specifies the driving mode to be used for determining travel duration or driving distance for
     * sorting the assets in search result.
     */
    class SortDrivingMode @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CAR = of("`car`")

            @JvmField val TRUCK = of("`truck`")

            @JvmStatic fun of(value: String) = SortDrivingMode(JsonField.of(value))
        }

        /** An enum containing [SortDrivingMode]'s known values. */
        enum class Known {
            CAR,
            TRUCK,
        }

        /**
         * An enum containing [SortDrivingMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortDrivingMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CAR,
            TRUCK,
            /**
             * An enum member indicating that [SortDrivingMode] was instantiated with an unknown
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
                else -> throw NextbillionSdkInvalidDataException("Unknown SortDrivingMode: $value")
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

        fun validate(): SortDrivingMode = apply {
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

            return /* spotless:off */ other is SortDrivingMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SearchAroundParams && center == other.center && key == other.key && radius == other.radius && filter == other.filter && includeAllOfAttributes == other.includeAllOfAttributes && includeAnyOfAttributes == other.includeAnyOfAttributes && maxSearchLimit == other.maxSearchLimit && pn == other.pn && ps == other.ps && sortBy == other.sortBy && sortDestination == other.sortDestination && sortDrivingMode == other.sortDrivingMode && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(center, key, radius, filter, includeAllOfAttributes, includeAnyOfAttributes, maxSearchLimit, pn, ps, sortBy, sortDestination, sortDrivingMode, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SearchAroundParams{center=$center, key=$key, radius=$radius, filter=$filter, includeAllOfAttributes=$includeAllOfAttributes, includeAnyOfAttributes=$includeAnyOfAttributes, maxSearchLimit=$maxSearchLimit, pn=$pn, ps=$ps, sortBy=$sortBy, sortDestination=$sortDestination, sortDrivingMode=$sortDrivingMode, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
