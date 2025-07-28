// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.skynet.namespacedapikeys

import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.Params
import com.nextbillion_sdk.api.core.checkRequired
import com.nextbillion_sdk.api.core.http.Headers
import com.nextbillion_sdk.api.core.http.QueryParams
import com.nextbillion_sdk.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/** Delete namespace under a parent key */
class NamespacedApikeyDeleteParams
private constructor(
    private val key: String,
    private val keyToDelete: String,
    private val namespace: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    /**
     * A key is a unique identifier that is required to authenticate a request to the API. Please
     * note for the delete namespace key operation another namespace key cannot be used.
     *
     * The namespace created using this key can be managed using the APIs & Services > Credentials
     * section of user’s [NextBillion Console](https://console.nextbillion.ai).
     */
    fun key(): String = key

    /** Specify the key to be deleted. */
    fun keyToDelete(): String = keyToDelete

    /**
     * Specify the name of the `namespace` to which the \`key_to_delete\` belongs. Please note that
     * a namespace key cannot be deleted using another namespace key.
     */
    fun namespace(): String = namespace

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NamespacedApikeyDeleteParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .keyToDelete()
         * .namespace()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NamespacedApikeyDeleteParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var keyToDelete: String? = null
        private var namespace: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(namespacedApikeyDeleteParams: NamespacedApikeyDeleteParams) = apply {
            key = namespacedApikeyDeleteParams.key
            keyToDelete = namespacedApikeyDeleteParams.keyToDelete
            namespace = namespacedApikeyDeleteParams.namespace
            additionalHeaders = namespacedApikeyDeleteParams.additionalHeaders.toBuilder()
            additionalQueryParams = namespacedApikeyDeleteParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                namespacedApikeyDeleteParams.additionalBodyProperties.toMutableMap()
        }

        /**
         * A key is a unique identifier that is required to authenticate a request to the API.
         * Please note for the delete namespace key operation another namespace key cannot be used.
         *
         * The namespace created using this key can be managed using the APIs & Services >
         * Credentials section of user’s [NextBillion Console](https://console.nextbillion.ai).
         */
        fun key(key: String) = apply { this.key = key }

        /** Specify the key to be deleted. */
        fun keyToDelete(keyToDelete: String) = apply { this.keyToDelete = keyToDelete }

        /**
         * Specify the name of the `namespace` to which the \`key_to_delete\` belongs. Please note
         * that a namespace key cannot be deleted using another namespace key.
         */
        fun namespace(namespace: String) = apply { this.namespace = namespace }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [NamespacedApikeyDeleteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .keyToDelete()
         * .namespace()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NamespacedApikeyDeleteParams =
            NamespacedApikeyDeleteParams(
                checkRequired("key", key),
                checkRequired("keyToDelete", keyToDelete),
                checkRequired("namespace", namespace),
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Optional<Map<String, JsonValue>> =
        Optional.ofNullable(additionalBodyProperties.ifEmpty { null })

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                put("key_to_delete", keyToDelete)
                put("namespace", namespace)
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NamespacedApikeyDeleteParams && key == other.key && keyToDelete == other.keyToDelete && namespace == other.namespace && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, keyToDelete, namespace, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "NamespacedApikeyDeleteParams{key=$key, keyToDelete=$keyToDelete, namespace=$namespace, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
