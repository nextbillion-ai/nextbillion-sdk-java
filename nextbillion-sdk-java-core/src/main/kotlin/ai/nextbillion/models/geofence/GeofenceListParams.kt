// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence

import ai.nextbillion.core.Params
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.http.Headers
import ai.nextbillion.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get Geofence List */
class GeofenceListParams
private constructor(
    private val key: String,
    private val pn: Long?,
    private val ps: Long?,
    private val tags: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * Denotes page number. Use this along with the ps parameter to implement pagination for your
     * searched results. This parameter does not have a maximum limit but would return an empty
     * response in case a higher value is provided when the result-set itself is smaller.
     */
    fun pn(): Optional<Long> = Optional.ofNullable(pn)

    /**
     * Denotes number of search results per page. Use this along with the pn parameter to implement
     * pagination for your searched results.
     */
    fun ps(): Optional<Long> = Optional.ofNullable(ps)

    /**
     * Comma (,) separated list of tags which will be used to filter the geofences.
     *
     * Please note only the geofences which have all the tags added to this parameter will be
     * included in the result. This parameter can accept a string with a maximum length of 256
     * characters.
     */
    fun tags(): Optional<String> = Optional.ofNullable(tags)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GeofenceListParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GeofenceListParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var pn: Long? = null
        private var ps: Long? = null
        private var tags: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(geofenceListParams: GeofenceListParams) = apply {
            key = geofenceListParams.key
            pn = geofenceListParams.pn
            ps = geofenceListParams.ps
            tags = geofenceListParams.tags
            additionalHeaders = geofenceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = geofenceListParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Denotes page number. Use this along with the ps parameter to implement pagination for
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
         * Denotes number of search results per page. Use this along with the pn parameter to
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
         * Comma (,) separated list of tags which will be used to filter the geofences.
         *
         * Please note only the geofences which have all the tags added to this parameter will be
         * included in the result. This parameter can accept a string with a maximum length of 256
         * characters.
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
         * Returns an immutable instance of [GeofenceListParams].
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
        fun build(): GeofenceListParams =
            GeofenceListParams(
                checkRequired("key", key),
                pn,
                ps,
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
                pn?.let { put("pn", it.toString()) }
                ps?.let { put("ps", it.toString()) }
                tags?.let { put("tags", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GeofenceListParams && key == other.key && pn == other.pn && ps == other.ps && tags == other.tags && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, pn, ps, tags, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "GeofenceListParams{key=$key, pn=$pn, ps=$ps, tags=$tags, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
