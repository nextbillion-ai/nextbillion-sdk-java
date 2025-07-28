// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.geofence.console

import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.Params
import io.nextbillion.api.core.checkRequired
import io.nextbillion.api.core.http.Headers
import io.nextbillion.api.core.http.QueryParams
import io.nextbillion.api.models.geofence.GeofenceEntityCreate
import java.util.Objects

/** preview geofence geojson */
class ConsolePreviewParams
private constructor(
    private val geofenceEntityCreate: GeofenceEntityCreate,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun geofenceEntityCreate(): GeofenceEntityCreate = geofenceEntityCreate

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        geofenceEntityCreate._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConsolePreviewParams].
         *
         * The following fields are required:
         * ```java
         * .geofenceEntityCreate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConsolePreviewParams]. */
    class Builder internal constructor() {

        private var geofenceEntityCreate: GeofenceEntityCreate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(consolePreviewParams: ConsolePreviewParams) = apply {
            geofenceEntityCreate = consolePreviewParams.geofenceEntityCreate
            additionalHeaders = consolePreviewParams.additionalHeaders.toBuilder()
            additionalQueryParams = consolePreviewParams.additionalQueryParams.toBuilder()
        }

        fun geofenceEntityCreate(geofenceEntityCreate: GeofenceEntityCreate) = apply {
            this.geofenceEntityCreate = geofenceEntityCreate
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
         * Returns an immutable instance of [ConsolePreviewParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .geofenceEntityCreate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConsolePreviewParams =
            ConsolePreviewParams(
                checkRequired("geofenceEntityCreate", geofenceEntityCreate),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): GeofenceEntityCreate = geofenceEntityCreate

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConsolePreviewParams && geofenceEntityCreate == other.geofenceEntityCreate && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(geofenceEntityCreate, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ConsolePreviewParams{geofenceEntityCreate=$geofenceEntityCreate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
