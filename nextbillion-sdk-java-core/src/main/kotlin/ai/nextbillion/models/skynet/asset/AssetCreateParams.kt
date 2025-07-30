// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.asset

import ai.nextbillion.core.Enum
import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.Params
import ai.nextbillion.core.checkKnown
import ai.nextbillion.core.checkRequired
import ai.nextbillion.core.http.Headers
import ai.nextbillion.core.http.QueryParams
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

/** Create an Asset */
class AssetCreateParams
private constructor(
    private val key: String,
    private val cluster: Cluster?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /** the cluster of the region you want to use */
    fun cluster(): Optional<Cluster> = Optional.ofNullable(cluster)

    /**
     * `attributes` can be used to store custom information about an asset in `key`:`value` format.
     * Use `attributes` to add any useful information or context to your assets like the vehicle
     * type, shift timing etc. Moreover, these attributes can be used to filter `assets` in
     * **Search**, **Monitor**, and _Get Asset List_ queries.
     *
     * Please note that the maximum number of `key`:`value` pairs that can be added to an
     * `attributes` object is 100. Also, the overall size of `attributes` object should not exceed
     * 65kb.
     */
    fun _attributes(): JsonValue = body._attributes()

    /**
     * Set a unique ID for the new `asset`. If not provided, an ID will be automatically generated
     * in UUID format. A valid `custom_id` can contain letters, numbers, "-", & "\_" only.
     *
     * Please note that the ID of an `asset` can not be changed once it is created.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customId(): Optional<String> = body.customId()

    /**
     * Description for the `asset`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /** Any valid json object data. Can be used to save customized data. Max size is 65kb. */
    fun _metaData(): JsonValue = body._metaData()

    /**
     * Name of the `asset`. Use this field to assign a meaningful, custom name to the `asset` being
     * created.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * **This parameter will be deprecated soon! Please use the `attributes` parameter to add labels
     * or markers for the asset.**
     *
     * Tags of the `asset`. `tags` can be used for filtering assets in operations like _Get Asset
     * List_ and asset **Search** methods. They can also be used for monitoring of assets using the
     * **Monitor** methods after linking `tags` and `asset`.
     *
     * Valid `tags` are strings consisting of alphanumeric characters (A-Z, a-z, 0-9) along with the
     * underscore ('\_') and hyphen ('-') symbols.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * Returns the raw JSON value of [customId].
     *
     * Unlike [customId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customId(): JsonField<String> = body._customId()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AssetCreateParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AssetCreateParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var cluster: Cluster? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(assetCreateParams: AssetCreateParams) = apply {
            key = assetCreateParams.key
            cluster = assetCreateParams.cluster
            body = assetCreateParams.body.toBuilder()
            additionalHeaders = assetCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = assetCreateParams.additionalQueryParams.toBuilder()
        }

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /** the cluster of the region you want to use */
        fun cluster(cluster: Cluster?) = apply { this.cluster = cluster }

        /** Alias for calling [Builder.cluster] with `cluster.orElse(null)`. */
        fun cluster(cluster: Optional<Cluster>) = cluster(cluster.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [attributes]
         * - [customId]
         * - [description]
         * - [metaData]
         * - [name]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * `attributes` can be used to store custom information about an asset in `key`:`value`
         * format. Use `attributes` to add any useful information or context to your assets like the
         * vehicle type, shift timing etc. Moreover, these attributes can be used to filter `assets`
         * in **Search**, **Monitor**, and _Get Asset List_ queries.
         *
         * Please note that the maximum number of `key`:`value` pairs that can be added to an
         * `attributes` object is 100. Also, the overall size of `attributes` object should not
         * exceed 65kb.
         */
        fun attributes(attributes: JsonValue) = apply { body.attributes(attributes) }

        /**
         * Set a unique ID for the new `asset`. If not provided, an ID will be automatically
         * generated in UUID format. A valid `custom_id` can contain letters, numbers, "-", & "\_"
         * only.
         *
         * Please note that the ID of an `asset` can not be changed once it is created.
         */
        fun customId(customId: String) = apply { body.customId(customId) }

        /**
         * Sets [Builder.customId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun customId(customId: JsonField<String>) = apply { body.customId(customId) }

        /** Description for the `asset`. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Any valid json object data. Can be used to save customized data. Max size is 65kb. */
        fun metaData(metaData: JsonValue) = apply { body.metaData(metaData) }

        /**
         * Name of the `asset`. Use this field to assign a meaningful, custom name to the `asset`
         * being created.
         */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * **This parameter will be deprecated soon! Please use the `attributes` parameter to add
         * labels or markers for the asset.**
         *
         * Tags of the `asset`. `tags` can be used for filtering assets in operations like _Get
         * Asset List_ and asset **Search** methods. They can also be used for monitoring of assets
         * using the **Monitor** methods after linking `tags` and `asset`.
         *
         * Valid `tags` are strings consisting of alphanumeric characters (A-Z, a-z, 0-9) along with
         * the underscore ('\_') and hyphen ('-') symbols.
         */
        fun tags(tags: List<String>) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

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
         * Returns an immutable instance of [AssetCreateParams].
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
        fun build(): AssetCreateParams =
            AssetCreateParams(
                checkRequired("key", key),
                cluster,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                cluster?.let { put("cluster", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    private constructor(
        private val attributes: JsonValue,
        private val customId: JsonField<String>,
        private val description: JsonField<String>,
        private val metaData: JsonValue,
        private val name: JsonField<String>,
        private val tags: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attributes") @ExcludeMissing attributes: JsonValue = JsonMissing.of(),
            @JsonProperty("custom_id")
            @ExcludeMissing
            customId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("meta_data") @ExcludeMissing metaData: JsonValue = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        ) : this(attributes, customId, description, metaData, name, tags, mutableMapOf())

        /**
         * `attributes` can be used to store custom information about an asset in `key`:`value`
         * format. Use `attributes` to add any useful information or context to your assets like the
         * vehicle type, shift timing etc. Moreover, these attributes can be used to filter `assets`
         * in **Search**, **Monitor**, and _Get Asset List_ queries.
         *
         * Please note that the maximum number of `key`:`value` pairs that can be added to an
         * `attributes` object is 100. Also, the overall size of `attributes` object should not
         * exceed 65kb.
         */
        @JsonProperty("attributes") @ExcludeMissing fun _attributes(): JsonValue = attributes

        /**
         * Set a unique ID for the new `asset`. If not provided, an ID will be automatically
         * generated in UUID format. A valid `custom_id` can contain letters, numbers, "-", & "\_"
         * only.
         *
         * Please note that the ID of an `asset` can not be changed once it is created.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customId(): Optional<String> = customId.getOptional("custom_id")

        /**
         * Description for the `asset`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /** Any valid json object data. Can be used to save customized data. Max size is 65kb. */
        @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonValue = metaData

        /**
         * Name of the `asset`. Use this field to assign a meaningful, custom name to the `asset`
         * being created.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * **This parameter will be deprecated soon! Please use the `attributes` parameter to add
         * labels or markers for the asset.**
         *
         * Tags of the `asset`. `tags` can be used for filtering assets in operations like _Get
         * Asset List_ and asset **Search** methods. They can also be used for monitoring of assets
         * using the **Monitor** methods after linking `tags` and `asset`.
         *
         * Valid `tags` are strings consisting of alphanumeric characters (A-Z, a-z, 0-9) along with
         * the underscore ('\_') and hyphen ('-') symbols.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * Returns the raw JSON value of [customId].
         *
         * Unlike [customId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("custom_id") @ExcludeMissing fun _customId(): JsonField<String> = customId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var attributes: JsonValue = JsonMissing.of()
            private var customId: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var metaData: JsonValue = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                attributes = body.attributes
                customId = body.customId
                description = body.description
                metaData = body.metaData
                name = body.name
                tags = body.tags.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * `attributes` can be used to store custom information about an asset in `key`:`value`
             * format. Use `attributes` to add any useful information or context to your assets like
             * the vehicle type, shift timing etc. Moreover, these attributes can be used to filter
             * `assets` in **Search**, **Monitor**, and _Get Asset List_ queries.
             *
             * Please note that the maximum number of `key`:`value` pairs that can be added to an
             * `attributes` object is 100. Also, the overall size of `attributes` object should not
             * exceed 65kb.
             */
            fun attributes(attributes: JsonValue) = apply { this.attributes = attributes }

            /**
             * Set a unique ID for the new `asset`. If not provided, an ID will be automatically
             * generated in UUID format. A valid `custom_id` can contain letters, numbers, "-", &
             * "\_" only.
             *
             * Please note that the ID of an `asset` can not be changed once it is created.
             */
            fun customId(customId: String) = customId(JsonField.of(customId))

            /**
             * Sets [Builder.customId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customId(customId: JsonField<String>) = apply { this.customId = customId }

            /** Description for the `asset`. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Any valid json object data. Can be used to save customized data. Max size is 65kb.
             */
            fun metaData(metaData: JsonValue) = apply { this.metaData = metaData }

            /**
             * Name of the `asset`. Use this field to assign a meaningful, custom name to the
             * `asset` being created.
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * **This parameter will be deprecated soon! Please use the `attributes` parameter to
             * add labels or markers for the asset.**
             *
             * Tags of the `asset`. `tags` can be used for filtering assets in operations like _Get
             * Asset List_ and asset **Search** methods. They can also be used for monitoring of
             * assets using the **Monitor** methods after linking `tags` and `asset`.
             *
             * Valid `tags` are strings consisting of alphanumeric characters (A-Z, a-z, 0-9) along
             * with the underscore ('\_') and hyphen ('-') symbols.
             */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    attributes,
                    customId,
                    description,
                    metaData,
                    name,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            customId()
            description()
            name()
            tags()
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
            (if (customId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && attributes == other.attributes && customId == other.customId && description == other.description && metaData == other.metaData && name == other.name && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(attributes, customId, description, metaData, name, tags, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{attributes=$attributes, customId=$customId, description=$description, metaData=$metaData, name=$name, tags=$tags, additionalProperties=$additionalProperties}"
    }

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

        return /* spotless:off */ other is AssetCreateParams && key == other.key && cluster == other.cluster && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, cluster, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AssetCreateParams{key=$key, cluster=$cluster, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
