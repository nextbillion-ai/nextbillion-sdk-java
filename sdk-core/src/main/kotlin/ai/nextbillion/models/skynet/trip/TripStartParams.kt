// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.trip

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

/** Add a new trip to the system with the provided data. */
class TripStartParams
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
     * Specify the ID of the asset which is making this trip. The asset will be linked to this trip.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun assetId(): String = body.assetId()

    /**
     * attributes can be used to store custom information about a trip in key:value format. Use
     * attributes to add any useful information or context to your trips like the driver name,
     * destination etc.
     *
     * Please note that the maximum number of key:value pairs that can be added to an attributes
     * object is 100. Also, the overall size of attributes object should not exceed 65kb.
     */
    fun _attributes(): JsonValue = body._attributes()

    /**
     * Set a unique ID for the new trip. If not provided, an ID will be automatically generated in
     * UUID format. A valid custom_id can contain letters, numbers, “-”, & “\_” only.
     *
     * Please note that the ID of a trip can not be changed once it is created.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customId(): Optional<String> = body.customId()

    /**
     * Add a custom description for the trip.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * An JSON object to collect additional details about the trip. Use this property to add any
     * custom information / context about the trip. The input will be passed on to the response
     * as-is and can be used to display useful information on, for example, a UI app.
     */
    fun _metaData(): JsonValue = body._metaData()

    /**
     * Specify a name for the trip.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * An array of objects to collect the details about all the stops that need to be made before
     * the trip ends. Each object represents one stop.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun stops(): Optional<List<Stop>> = body.stops()

    /**
     * Returns the raw JSON value of [assetId].
     *
     * Unlike [assetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assetId(): JsonField<String> = body._assetId()

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
     * Returns the raw JSON value of [stops].
     *
     * Unlike [stops], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stops(): JsonField<List<Stop>> = body._stops()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TripStartParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .assetId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TripStartParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var cluster: Cluster? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tripStartParams: TripStartParams) = apply {
            key = tripStartParams.key
            cluster = tripStartParams.cluster
            body = tripStartParams.body.toBuilder()
            additionalHeaders = tripStartParams.additionalHeaders.toBuilder()
            additionalQueryParams = tripStartParams.additionalQueryParams.toBuilder()
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
         * - [assetId]
         * - [attributes]
         * - [customId]
         * - [description]
         * - [metaData]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Specify the ID of the asset which is making this trip. The asset will be linked to this
         * trip.
         */
        fun assetId(assetId: String) = apply { body.assetId(assetId) }

        /**
         * Sets [Builder.assetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assetId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun assetId(assetId: JsonField<String>) = apply { body.assetId(assetId) }

        /**
         * attributes can be used to store custom information about a trip in key:value format. Use
         * attributes to add any useful information or context to your trips like the driver name,
         * destination etc.
         *
         * Please note that the maximum number of key:value pairs that can be added to an attributes
         * object is 100. Also, the overall size of attributes object should not exceed 65kb.
         */
        fun attributes(attributes: JsonValue) = apply { body.attributes(attributes) }

        /**
         * Set a unique ID for the new trip. If not provided, an ID will be automatically generated
         * in UUID format. A valid custom_id can contain letters, numbers, “-”, & “\_” only.
         *
         * Please note that the ID of a trip can not be changed once it is created.
         */
        fun customId(customId: String) = apply { body.customId(customId) }

        /**
         * Sets [Builder.customId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun customId(customId: JsonField<String>) = apply { body.customId(customId) }

        /** Add a custom description for the trip. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * An JSON object to collect additional details about the trip. Use this property to add any
         * custom information / context about the trip. The input will be passed on to the response
         * as-is and can be used to display useful information on, for example, a UI app.
         */
        fun metaData(metaData: JsonValue) = apply { body.metaData(metaData) }

        /** Specify a name for the trip. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * An array of objects to collect the details about all the stops that need to be made
         * before the trip ends. Each object represents one stop.
         */
        fun stops(stops: List<Stop>) = apply { body.stops(stops) }

        /**
         * Sets [Builder.stops] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stops] with a well-typed `List<Stop>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stops(stops: JsonField<List<Stop>>) = apply { body.stops(stops) }

        /**
         * Adds a single [Stop] to [stops].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStop(stop: Stop) = apply { body.addStop(stop) }

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
         * Returns an immutable instance of [TripStartParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .assetId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TripStartParams =
            TripStartParams(
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
        private val assetId: JsonField<String>,
        private val attributes: JsonValue,
        private val customId: JsonField<String>,
        private val description: JsonField<String>,
        private val metaData: JsonValue,
        private val name: JsonField<String>,
        private val stops: JsonField<List<Stop>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("asset_id") @ExcludeMissing assetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attributes") @ExcludeMissing attributes: JsonValue = JsonMissing.of(),
            @JsonProperty("custom_id")
            @ExcludeMissing
            customId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("meta_data") @ExcludeMissing metaData: JsonValue = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stops") @ExcludeMissing stops: JsonField<List<Stop>> = JsonMissing.of(),
        ) : this(assetId, attributes, customId, description, metaData, name, stops, mutableMapOf())

        /**
         * Specify the ID of the asset which is making this trip. The asset will be linked to this
         * trip.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun assetId(): String = assetId.getRequired("asset_id")

        /**
         * attributes can be used to store custom information about a trip in key:value format. Use
         * attributes to add any useful information or context to your trips like the driver name,
         * destination etc.
         *
         * Please note that the maximum number of key:value pairs that can be added to an attributes
         * object is 100. Also, the overall size of attributes object should not exceed 65kb.
         */
        @JsonProperty("attributes") @ExcludeMissing fun _attributes(): JsonValue = attributes

        /**
         * Set a unique ID for the new trip. If not provided, an ID will be automatically generated
         * in UUID format. A valid custom_id can contain letters, numbers, “-”, & “\_” only.
         *
         * Please note that the ID of a trip can not be changed once it is created.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customId(): Optional<String> = customId.getOptional("custom_id")

        /**
         * Add a custom description for the trip.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * An JSON object to collect additional details about the trip. Use this property to add any
         * custom information / context about the trip. The input will be passed on to the response
         * as-is and can be used to display useful information on, for example, a UI app.
         */
        @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonValue = metaData

        /**
         * Specify a name for the trip.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * An array of objects to collect the details about all the stops that need to be made
         * before the trip ends. Each object represents one stop.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun stops(): Optional<List<Stop>> = stops.getOptional("stops")

        /**
         * Returns the raw JSON value of [assetId].
         *
         * Unlike [assetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("asset_id") @ExcludeMissing fun _assetId(): JsonField<String> = assetId

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
         * Returns the raw JSON value of [stops].
         *
         * Unlike [stops], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stops") @ExcludeMissing fun _stops(): JsonField<List<Stop>> = stops

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .assetId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var assetId: JsonField<String>? = null
            private var attributes: JsonValue = JsonMissing.of()
            private var customId: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var metaData: JsonValue = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var stops: JsonField<MutableList<Stop>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                assetId = body.assetId
                attributes = body.attributes
                customId = body.customId
                description = body.description
                metaData = body.metaData
                name = body.name
                stops = body.stops.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Specify the ID of the asset which is making this trip. The asset will be linked to
             * this trip.
             */
            fun assetId(assetId: String) = assetId(JsonField.of(assetId))

            /**
             * Sets [Builder.assetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assetId(assetId: JsonField<String>) = apply { this.assetId = assetId }

            /**
             * attributes can be used to store custom information about a trip in key:value format.
             * Use attributes to add any useful information or context to your trips like the driver
             * name, destination etc.
             *
             * Please note that the maximum number of key:value pairs that can be added to an
             * attributes object is 100. Also, the overall size of attributes object should not
             * exceed 65kb.
             */
            fun attributes(attributes: JsonValue) = apply { this.attributes = attributes }

            /**
             * Set a unique ID for the new trip. If not provided, an ID will be automatically
             * generated in UUID format. A valid custom_id can contain letters, numbers, “-”, & “\_”
             * only.
             *
             * Please note that the ID of a trip can not be changed once it is created.
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

            /** Add a custom description for the trip. */
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
             * An JSON object to collect additional details about the trip. Use this property to add
             * any custom information / context about the trip. The input will be passed on to the
             * response as-is and can be used to display useful information on, for example, a UI
             * app.
             */
            fun metaData(metaData: JsonValue) = apply { this.metaData = metaData }

            /** Specify a name for the trip. */
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
             * An array of objects to collect the details about all the stops that need to be made
             * before the trip ends. Each object represents one stop.
             */
            fun stops(stops: List<Stop>) = stops(JsonField.of(stops))

            /**
             * Sets [Builder.stops] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stops] with a well-typed `List<Stop>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stops(stops: JsonField<List<Stop>>) = apply {
                this.stops = stops.map { it.toMutableList() }
            }

            /**
             * Adds a single [Stop] to [stops].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStop(stop: Stop) = apply {
                stops =
                    (stops ?: JsonField.of(mutableListOf())).also {
                        checkKnown("stops", it).add(stop)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .assetId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("assetId", assetId),
                    attributes,
                    customId,
                    description,
                    metaData,
                    name,
                    (stops ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            assetId()
            customId()
            description()
            name()
            stops().ifPresent { it.forEach { it.validate() } }
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
            (if (assetId.asKnown().isPresent) 1 else 0) +
                (if (customId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (stops.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && assetId == other.assetId && attributes == other.attributes && customId == other.customId && description == other.description && metaData == other.metaData && name == other.name && stops == other.stops && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(assetId, attributes, customId, description, metaData, name, stops, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{assetId=$assetId, attributes=$attributes, customId=$customId, description=$description, metaData=$metaData, name=$name, stops=$stops, additionalProperties=$additionalProperties}"
    }

    class Stop
    private constructor(
        private val geofenceId: JsonField<String>,
        private val metaData: JsonValue,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("geofence_id")
            @ExcludeMissing
            geofenceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("meta_data") @ExcludeMissing metaData: JsonValue = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(geofenceId, metaData, name, mutableMapOf())

        /**
         * Specify the ID of the geofence indicating the area where the asset needs to make a stop,
         * during the trip. Only the IDs of geofences created using
         * [NextBillion.ai's Geofence API](https://docs.nextbillion.ai/docs/tracking/api/geofence#create-a-geofence)
         * are accepted.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geofenceId(): Optional<String> = geofenceId.getOptional("geofence_id")

        /**
         * An JSON object to collect additional details about the stop. Use this property to add any
         * custom information / context about the stop. The input will be passed on to the response
         * as-is and can be used to display useful information on, for example, a UI app.
         */
        @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonValue = metaData

        /**
         * Specify a custom name for the stop.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [geofenceId].
         *
         * Unlike [geofenceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("geofence_id")
        @ExcludeMissing
        fun _geofenceId(): JsonField<String> = geofenceId

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [Stop]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Stop]. */
        class Builder internal constructor() {

            private var geofenceId: JsonField<String> = JsonMissing.of()
            private var metaData: JsonValue = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stop: Stop) = apply {
                geofenceId = stop.geofenceId
                metaData = stop.metaData
                name = stop.name
                additionalProperties = stop.additionalProperties.toMutableMap()
            }

            /**
             * Specify the ID of the geofence indicating the area where the asset needs to make a
             * stop, during the trip. Only the IDs of geofences created using
             * [NextBillion.ai's Geofence API](https://docs.nextbillion.ai/docs/tracking/api/geofence#create-a-geofence)
             * are accepted.
             */
            fun geofenceId(geofenceId: String) = geofenceId(JsonField.of(geofenceId))

            /**
             * Sets [Builder.geofenceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geofenceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geofenceId(geofenceId: JsonField<String>) = apply { this.geofenceId = geofenceId }

            /**
             * An JSON object to collect additional details about the stop. Use this property to add
             * any custom information / context about the stop. The input will be passed on to the
             * response as-is and can be used to display useful information on, for example, a UI
             * app.
             */
            fun metaData(metaData: JsonValue) = apply { this.metaData = metaData }

            /** Specify a custom name for the stop. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Stop].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Stop =
                Stop(geofenceId, metaData, name, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Stop = apply {
            if (validated) {
                return@apply
            }

            geofenceId()
            name()
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
            (if (geofenceId.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Stop && geofenceId == other.geofenceId && metaData == other.metaData && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(geofenceId, metaData, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Stop{geofenceId=$geofenceId, metaData=$metaData, name=$name, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is TripStartParams && key == other.key && cluster == other.cluster && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, cluster, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TripStartParams{key=$key, cluster=$cluster, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
