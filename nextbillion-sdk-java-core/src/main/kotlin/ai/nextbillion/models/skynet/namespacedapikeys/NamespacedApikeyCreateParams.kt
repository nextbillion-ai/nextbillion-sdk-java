// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.namespacedapikeys

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.Params
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.http.Headers
import ai.nextbillion.core.http.QueryParams
import java.util.Objects

/** Create namespace under a parent key */
class NamespacedApikeyCreateParams
private constructor(
    private val key: String,
    private val namespace: String,
    private val body: JsonValue,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * Specify a name for the `namespace`. If the namespace specified is unique then a new namespace
     * along with a new key is created. Whereas if the specified `namespace` is not unique, a new
     * key will be created in the existing `namespace`. Please note that a `namespace` cannot be
     * created using another namespace key.
     */
    fun namespace(): String = namespace

    fun body(): JsonValue = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NamespacedApikeyCreateParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .namespace()
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NamespacedApikeyCreateParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var namespace: String? = null
        private var body: JsonValue? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(namespacedApikeyCreateParams: NamespacedApikeyCreateParams) = apply {
            key = namespacedApikeyCreateParams.key
            namespace = namespacedApikeyCreateParams.namespace
            body = namespacedApikeyCreateParams.body
            additionalHeaders = namespacedApikeyCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = namespacedApikeyCreateParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Specify a name for the `namespace`. If the namespace specified is unique then a new
         * namespace along with a new key is created. Whereas if the specified `namespace` is not
         * unique, a new key will be created in the existing `namespace`. Please note that a
         * `namespace` cannot be created using another namespace key.
         */
        fun namespace(namespace: String) = apply { this.namespace = namespace }

        fun body(body: JsonValue) = apply { this.body = body }

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
         * Returns an immutable instance of [NamespacedApikeyCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .namespace()
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NamespacedApikeyCreateParams =
            NamespacedApikeyCreateParams(
                checkRequired("key", key),
                checkRequired("namespace", namespace),
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): JsonValue = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                put("namespace", namespace)
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NamespacedApikeyCreateParams && key == other.key && namespace == other.namespace && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, namespace, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "NamespacedApikeyCreateParams{key=$key, namespace=$namespace, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
