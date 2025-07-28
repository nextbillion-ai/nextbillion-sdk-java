// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.skynet.asset.event

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

/** Event History of an Asset */
class EventListParams
private constructor(
    private val id: String?,
    private val key: String,
    private val cluster: Cluster?,
    private val endTime: Long?,
    private val monitorId: String?,
    private val pn: Long?,
    private val ps: Long?,
    private val startTime: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /** the cluster of the region you want to use */
    fun cluster(): Optional<Cluster> = Optional.ofNullable(cluster)

    /** Time before which the events triggered by the `asset` need to be retrieved. */
    fun endTime(): Optional<Long> = Optional.ofNullable(endTime)

    /**
     * Filter the events by `monitor_id`. When provided, only the events triggered by the `monitor`
     * will be returned in response.
     *
     * Please note that if the `attributes` of the asset identified by `id` and those of the
     * `monitor` do not match, then no events might be returned for this `monitor_id`.
     */
    fun monitorId(): Optional<String> = Optional.ofNullable(monitorId)

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

    /** Time after which the events triggered by the `asset` need to be retrieved. */
    fun startTime(): Optional<Long> = Optional.ofNullable(startTime)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventListParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventListParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var key: String? = null
        private var cluster: Cluster? = null
        private var endTime: Long? = null
        private var monitorId: String? = null
        private var pn: Long? = null
        private var ps: Long? = null
        private var startTime: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventListParams: EventListParams) = apply {
            id = eventListParams.id
            key = eventListParams.key
            cluster = eventListParams.cluster
            endTime = eventListParams.endTime
            monitorId = eventListParams.monitorId
            pn = eventListParams.pn
            ps = eventListParams.ps
            startTime = eventListParams.startTime
            additionalHeaders = eventListParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventListParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /** the cluster of the region you want to use */
        fun cluster(cluster: Cluster?) = apply { this.cluster = cluster }

        /** Alias for calling [Builder.cluster] with `cluster.orElse(null)`. */
        fun cluster(cluster: Optional<Cluster>) = cluster(cluster.getOrNull())

        /** Time before which the events triggered by the `asset` need to be retrieved. */
        fun endTime(endTime: Long?) = apply { this.endTime = endTime }

        /**
         * Alias for [Builder.endTime].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun endTime(endTime: Long) = endTime(endTime as Long?)

        /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
        fun endTime(endTime: Optional<Long>) = endTime(endTime.getOrNull())

        /**
         * Filter the events by `monitor_id`. When provided, only the events triggered by the
         * `monitor` will be returned in response.
         *
         * Please note that if the `attributes` of the asset identified by `id` and those of the
         * `monitor` do not match, then no events might be returned for this `monitor_id`.
         */
        fun monitorId(monitorId: String?) = apply { this.monitorId = monitorId }

        /** Alias for calling [Builder.monitorId] with `monitorId.orElse(null)`. */
        fun monitorId(monitorId: Optional<String>) = monitorId(monitorId.getOrNull())

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

        /** Time after which the events triggered by the `asset` need to be retrieved. */
        fun startTime(startTime: Long?) = apply { this.startTime = startTime }

        /**
         * Alias for [Builder.startTime].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun startTime(startTime: Long) = startTime(startTime as Long?)

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<Long>) = startTime(startTime.getOrNull())

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
         * Returns an immutable instance of [EventListParams].
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
        fun build(): EventListParams =
            EventListParams(
                id,
                checkRequired("key", key),
                cluster,
                endTime,
                monitorId,
                pn,
                ps,
                startTime,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                cluster?.let { put("cluster", it.toString()) }
                endTime?.let { put("end_time", it.toString()) }
                monitorId?.let { put("monitor_id", it) }
                pn?.let { put("pn", it.toString()) }
                ps?.let { put("ps", it.toString()) }
                startTime?.let { put("start_time", it.toString()) }
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

        return /* spotless:off */ other is EventListParams && id == other.id && key == other.key && cluster == other.cluster && endTime == other.endTime && monitorId == other.monitorId && pn == other.pn && ps == other.ps && startTime == other.startTime && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, key, cluster, endTime, monitorId, pn, ps, startTime, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EventListParams{id=$id, key=$key, cluster=$cluster, endTime=$endTime, monitorId=$monitorId, pn=$pn, ps=$ps, startTime=$startTime, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
