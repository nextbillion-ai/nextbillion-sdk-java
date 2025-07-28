// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.skynet.asset

import com.fasterxml.jackson.annotation.JsonCreator
import com.nextbillion_sdk.api.core.Enum
import com.nextbillion_sdk.api.core.JsonField
import com.nextbillion_sdk.api.core.Params
import com.nextbillion_sdk.api.core.checkRequired
import com.nextbillion_sdk.api.core.http.Headers
import com.nextbillion_sdk.api.core.http.QueryParams
import com.nextbillion_sdk.api.errors.NextbillionSdkInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get Asset List */
class AssetListParams
private constructor(
    private val key: String,
    private val cluster: Cluster?,
    private val includeAllOfAttributes: String?,
    private val includeAnyOfAttributes: String?,
    private val pn: Long?,
    private val ps: Long?,
    private val sort: String?,
    private val tags: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /** the cluster of the region you want to use */
    fun cluster(): Optional<Cluster> = Optional.ofNullable(cluster)

    /**
     * Use this parameter to filter the assets by their `attributes`. Only the assets having all the
     * `attributes` added to this parameter, will be returned in the response. Multiple `attributes`
     * can be separated using pipes (`|`).
     *
     * Please note the attributes are case sensitive. Also, this parameter can not be used in
     * conjunction with `include_any_of_attributes` parameter.
     */
    fun includeAllOfAttributes(): Optional<String> = Optional.ofNullable(includeAllOfAttributes)

    /**
     * Use this parameter to filter the assets by their `attributes`. Assets having at least one of
     * the `attributes` added to this parameter, will be returned in the response. Multiple
     * `attributes` can be separated using pipes (`|`).
     *
     * Please note the attributes are case sensitive. Also, this parameter can not be used in
     * conjunction with `include_all_of_attributes` parameter.
     */
    fun includeAnyOfAttributes(): Optional<String> = Optional.ofNullable(includeAnyOfAttributes)

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
     * Provide a single field to sort the results by. Only `updated_at` or `created_at` fields can
     * be selected for ordering the results.
     *
     * By default, the result is sorted by `created_at` field in the descending order. Allowed
     * values for specifying the order are `asc` for ascending order and `desc` for descending
     * order.
     */
    fun sort(): Optional<String> = Optional.ofNullable(sort)

    /**
     * **This parameter will be deprecated soon! Please use the `include_all_of_attributes` or
     * `include_any_of_attributes` parameters to provide labels or markers for the assets to be
     * retrieved.**
     *
     * `tags` can be used to filter the assets. Only those assets which have all the `tags`
     * provided, will be included in the result. In case multiple `tags` need to be specified, use
     * `,` to separate them.
     */
    fun tags(): Optional<String> = Optional.ofNullable(tags)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AssetListParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssetListParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var cluster: Cluster? = null
        private var includeAllOfAttributes: String? = null
        private var includeAnyOfAttributes: String? = null
        private var pn: Long? = null
        private var ps: Long? = null
        private var sort: String? = null
        private var tags: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(assetListParams: AssetListParams) = apply {
            key = assetListParams.key
            cluster = assetListParams.cluster
            includeAllOfAttributes = assetListParams.includeAllOfAttributes
            includeAnyOfAttributes = assetListParams.includeAnyOfAttributes
            pn = assetListParams.pn
            ps = assetListParams.ps
            sort = assetListParams.sort
            tags = assetListParams.tags
            additionalHeaders = assetListParams.additionalHeaders.toBuilder()
            additionalQueryParams = assetListParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /** the cluster of the region you want to use */
        fun cluster(cluster: Cluster?) = apply { this.cluster = cluster }

        /** Alias for calling [Builder.cluster] with `cluster.orElse(null)`. */
        fun cluster(cluster: Optional<Cluster>) = cluster(cluster.getOrNull())

        /**
         * Use this parameter to filter the assets by their `attributes`. Only the assets having all
         * the `attributes` added to this parameter, will be returned in the response. Multiple
         * `attributes` can be separated using pipes (`|`).
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
         * Use this parameter to filter the assets by their `attributes`. Assets having at least one
         * of the `attributes` added to this parameter, will be returned in the response. Multiple
         * `attributes` can be separated using pipes (`|`).
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
         * Provide a single field to sort the results by. Only `updated_at` or `created_at` fields
         * can be selected for ordering the results.
         *
         * By default, the result is sorted by `created_at` field in the descending order. Allowed
         * values for specifying the order are `asc` for ascending order and `desc` for descending
         * order.
         */
        fun sort(sort: String?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<String>) = sort(sort.getOrNull())

        /**
         * **This parameter will be deprecated soon! Please use the `include_all_of_attributes` or
         * `include_any_of_attributes` parameters to provide labels or markers for the assets to be
         * retrieved.**
         *
         * `tags` can be used to filter the assets. Only those assets which have all the `tags`
         * provided, will be included in the result. In case multiple `tags` need to be specified,
         * use `,` to separate them.
         */
        fun tags(tags: String?) = apply { this.tags = tags }

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<String>) = tags(tags.getOrNull())

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
         * Returns an immutable instance of [AssetListParams].
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
        fun build(): AssetListParams =
            AssetListParams(
                checkRequired("key", key),
                cluster,
                includeAllOfAttributes,
                includeAnyOfAttributes,
                pn,
                ps,
                sort,
                tags,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                cluster?.let { put("cluster", it.toString()) }
                includeAllOfAttributes?.let { put("include_all_of_attributes", it) }
                includeAnyOfAttributes?.let { put("include_any_of_attributes", it) }
                pn?.let { put("pn", it.toString()) }
                ps?.let { put("ps", it.toString()) }
                sort?.let { put("sort", it) }
                tags?.let { put("tags", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** the cluster of the region you want to use */
    class Cluster @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AMERICA = of("america")

            @JvmStatic fun of(value: String) = Cluster(JsonField.of(value))
        }

        /** An enum containing [Cluster]'s known values. */
        enum class Known {
            AMERICA
        }

        /**
         * An enum containing [Cluster]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Cluster] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AMERICA,
            /** An enum member indicating that [Cluster] was instantiated with an unknown value. */
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
                AMERICA -> Value.AMERICA
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
                AMERICA -> Known.AMERICA
                else -> throw NextbillionSdkInvalidDataException("Unknown Cluster: $value")
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

        fun validate(): Cluster = apply {
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

            return /* spotless:off */ other is Cluster && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AssetListParams && key == other.key && cluster == other.cluster && includeAllOfAttributes == other.includeAllOfAttributes && includeAnyOfAttributes == other.includeAnyOfAttributes && pn == other.pn && ps == other.ps && sort == other.sort && tags == other.tags && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, cluster, includeAllOfAttributes, includeAnyOfAttributes, pn, ps, sort, tags, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AssetListParams{key=$key, cluster=$cluster, includeAllOfAttributes=$includeAllOfAttributes, includeAnyOfAttributes=$includeAnyOfAttributes, pn=$pn, ps=$ps, sort=$sort, tags=$tags, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
