// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence

import ai.nextbillion.core.Params
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.http.Headers
import ai.nextbillion.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Geofence Contains */
class GeofenceContainsParams
private constructor(
    private val key: String,
    private val locations: String,
    private val geofences: String?,
    private val verbose: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * Pipe (|) separated coordinates, in [latitude,longitude] format, of the locations to be
     * searched against the geofences.
     */
    fun locations(): String = locations

    /**
     * A `,` separated list geofence IDs against which the `locations` will be searched. If not
     * provided, then the 'locations' will be searched against all your existing geofences.
     *
     * Maximum length of the string can be 256 characters.
     */
    fun geofences(): Optional<String> = Optional.ofNullable(geofences)

    /**
     * When `true`, an array with detailed information of geofences is returned. When `false`, an
     * array containing only the IDs of the geofences is returned.
     */
    fun verbose(): Optional<String> = Optional.ofNullable(verbose)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GeofenceContainsParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .locations()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GeofenceContainsParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var locations: String? = null
        private var geofences: String? = null
        private var verbose: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(geofenceContainsParams: GeofenceContainsParams) = apply {
            key = geofenceContainsParams.key
            locations = geofenceContainsParams.locations
            geofences = geofenceContainsParams.geofences
            verbose = geofenceContainsParams.verbose
            additionalHeaders = geofenceContainsParams.additionalHeaders.toBuilder()
            additionalQueryParams = geofenceContainsParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Pipe (|) separated coordinates, in [latitude,longitude] format, of the locations to be
         * searched against the geofences.
         */
        fun locations(locations: String) = apply { this.locations = locations }

        /**
         * A `,` separated list geofence IDs against which the `locations` will be searched. If not
         * provided, then the 'locations' will be searched against all your existing geofences.
         *
         * Maximum length of the string can be 256 characters.
         */
        fun geofences(geofences: String?) = apply { this.geofences = geofences }

        /** Alias for calling [Builder.geofences] with `geofences.orElse(null)`. */
        fun geofences(geofences: Optional<String>) = geofences(geofences.getOrNull())

        /**
         * When `true`, an array with detailed information of geofences is returned. When `false`,
         * an array containing only the IDs of the geofences is returned.
         */
        fun verbose(verbose: String?) = apply { this.verbose = verbose }

        /** Alias for calling [Builder.verbose] with `verbose.orElse(null)`. */
        fun verbose(verbose: Optional<String>) = verbose(verbose.getOrNull())

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
         * Returns an immutable instance of [GeofenceContainsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .locations()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GeofenceContainsParams =
            GeofenceContainsParams(
                checkRequired("key", key),
                checkRequired("locations", locations),
                geofences,
                verbose,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                put("locations", locations)
                geofences?.let { put("geofences", it) }
                verbose?.let { put("verbose", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GeofenceContainsParams && key == other.key && locations == other.locations && geofences == other.geofences && verbose == other.verbose && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, locations, geofences, verbose, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "GeofenceContainsParams{key=$key, locations=$locations, geofences=$geofences, verbose=$verbose, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
