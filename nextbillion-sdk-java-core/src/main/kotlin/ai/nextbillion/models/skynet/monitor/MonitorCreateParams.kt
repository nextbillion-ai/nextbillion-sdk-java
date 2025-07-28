// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.monitor

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

/** Create a Monitor */
class MonitorCreateParams
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
     * Use this parameter to add `tags` to the `monitor`. `tags` can be used for filtering monitors
     * in the _Get Monitor List_ operation. They can also be used for easy identification of
     * monitors.
     *
     * Please note that valid `tags` are strings, consisting of alphanumeric characters (A-Z, a-z,
     * 0-9) along with the underscore ('\_') and hyphen ('-') symbols.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tags(): List<String> = body.tags()

    /**
     * Specify the type of activity the `monitor` would detect.
     *
     * The `monitor` will be able to detect the specified `type` of activity and create events for
     * eligible `asset`. A `monitor` can detect following types of asset activity:
     * - `enter`: The `monitor` will create an event when a linked `asset` enters into the specified
     *   geofence.
     * - `exit`: The `monitor` will create an event when a linked `asset` exits the specified
     *   geofence.
     * - `enter_and_exit`: The `monitor` will create an event when a linked `asset` either enters or
     *   exits the specified geofence.
     * - `speeding`: The `monitor` will create an event when a linked `asset` exceeds a given speed
     *   limit.
     * - `idle`: The `monitor` will create an event when a linked `asset` exhibits idle activity.
     *
     * Please note that `assets` and geofences can be linked to a `monitor` using the `match_filter`
     * and `geofence_config` attributes respectively.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = body.type()

    /**
     * Set a unique ID for the new `monitor`. If not provided, an ID will be automatically generated
     * in UUID format. A valid `custom_id` can contain letters, numbers, "-", & "\_" only.
     *
     * Please note that the ID of an `monitor` can not be changed once it is created.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customId(): Optional<String> = body.customId()

    /**
     * Add a description for your `monitor` using this parameter.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Geofences are geographic boundaries surrounding an area of interest. `geofence_config` is
     * used to specify the geofences for creating `enter` or `exit` type of events based on the
     * asset's location. When an asset associated with the `monitor` enters the given geofence, an
     * `enter` type event is created, whereas when the asset moves out of the geofence an `exit`
     * type event is created.
     *
     * Please note that this object is mandatory when the monitor `type` belongs to one of `enter`,
     * `exit` or `enter_and_exit`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun geofenceConfig(): Optional<GeofenceConfig> = body.geofenceConfig()

    /**
     * **Deprecated. Please use the `geofence_config` to specify the geofence_ids for this
     * monitor.**
     *
     * An array of strings to collect the geofence IDs that should be linked to the `monitor`.
     * Geofences are geographic boundaries that can be used to trigger events based on an asset's
     * location.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun geofenceIds(): Optional<List<String>> = body.geofenceIds()

    /**
     * `idle_config` is used to set up constraints for creating idle events. When an asset
     * associated with the `monitor` has not moved a given distance within a given time, the Live
     * Tracking API can create events to denote such instances. Please note that this object is
     * mandatory when the monitor `type` is `idle`.
     *
     * Let's look at the properties of this object.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun idleConfig(): Optional<IdleConfig> = body.idleConfig()

    /**
     * This object is used to identify the asset(s) on which the `monitor` would be applied.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun matchFilter(): Optional<MatchFilter> = body.matchFilter()

    /** Any valid json object data. Can be used to save customized data. Max size is 65kb. */
    fun _metaData(): JsonValue = body._metaData()

    /**
     * Name of the `monitor`. Use this field to assign a meaningful, custom name to the `monitor`
     * being created.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * `speeding_config` is used to set up constraints for creating over-speed events. When an
     * `asset` associated with a `monitor` is traveling at a speed above the given limits, the Live
     * Tracking API can create events to denote such instances. There is also an option to set up a
     * tolerance before creating an event. Please note that this object is mandatory when
     * `type=speeding`.
     *
     * Let's look at the properties of this object.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun speedingConfig(): Optional<SpeedingConfig> = body.speedingConfig()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

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
     * Returns the raw JSON value of [geofenceConfig].
     *
     * Unlike [geofenceConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _geofenceConfig(): JsonField<GeofenceConfig> = body._geofenceConfig()

    /**
     * Returns the raw JSON value of [geofenceIds].
     *
     * Unlike [geofenceIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _geofenceIds(): JsonField<List<String>> = body._geofenceIds()

    /**
     * Returns the raw JSON value of [idleConfig].
     *
     * Unlike [idleConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _idleConfig(): JsonField<IdleConfig> = body._idleConfig()

    /**
     * Returns the raw JSON value of [matchFilter].
     *
     * Unlike [matchFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _matchFilter(): JsonField<MatchFilter> = body._matchFilter()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [speedingConfig].
     *
     * Unlike [speedingConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _speedingConfig(): JsonField<SpeedingConfig> = body._speedingConfig()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MonitorCreateParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * .tags()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MonitorCreateParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var cluster: Cluster? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(monitorCreateParams: MonitorCreateParams) = apply {
            key = monitorCreateParams.key
            cluster = monitorCreateParams.cluster
            body = monitorCreateParams.body.toBuilder()
            additionalHeaders = monitorCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = monitorCreateParams.additionalQueryParams.toBuilder()
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
         * - [tags]
         * - [type]
         * - [customId]
         * - [description]
         * - [geofenceConfig]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Use this parameter to add `tags` to the `monitor`. `tags` can be used for filtering
         * monitors in the _Get Monitor List_ operation. They can also be used for easy
         * identification of monitors.
         *
         * Please note that valid `tags` are strings, consisting of alphanumeric characters (A-Z,
         * a-z, 0-9) along with the underscore ('\_') and hyphen ('-') symbols.
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

        /**
         * Specify the type of activity the `monitor` would detect.
         *
         * The `monitor` will be able to detect the specified `type` of activity and create events
         * for eligible `asset`. A `monitor` can detect following types of asset activity:
         * - `enter`: The `monitor` will create an event when a linked `asset` enters into the
         *   specified geofence.
         * - `exit`: The `monitor` will create an event when a linked `asset` exits the specified
         *   geofence.
         * - `enter_and_exit`: The `monitor` will create an event when a linked `asset` either
         *   enters or exits the specified geofence.
         * - `speeding`: The `monitor` will create an event when a linked `asset` exceeds a given
         *   speed limit.
         * - `idle`: The `monitor` will create an event when a linked `asset` exhibits idle
         *   activity.
         *
         * Please note that `assets` and geofences can be linked to a `monitor` using the
         * `match_filter` and `geofence_config` attributes respectively.
         */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /**
         * Set a unique ID for the new `monitor`. If not provided, an ID will be automatically
         * generated in UUID format. A valid `custom_id` can contain letters, numbers, "-", & "\_"
         * only.
         *
         * Please note that the ID of an `monitor` can not be changed once it is created.
         */
        fun customId(customId: String) = apply { body.customId(customId) }

        /**
         * Sets [Builder.customId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun customId(customId: JsonField<String>) = apply { body.customId(customId) }

        /** Add a description for your `monitor` using this parameter. */
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
         * Geofences are geographic boundaries surrounding an area of interest. `geofence_config` is
         * used to specify the geofences for creating `enter` or `exit` type of events based on the
         * asset's location. When an asset associated with the `monitor` enters the given geofence,
         * an `enter` type event is created, whereas when the asset moves out of the geofence an
         * `exit` type event is created.
         *
         * Please note that this object is mandatory when the monitor `type` belongs to one of
         * `enter`, `exit` or `enter_and_exit`.
         */
        fun geofenceConfig(geofenceConfig: GeofenceConfig) = apply {
            body.geofenceConfig(geofenceConfig)
        }

        /**
         * Sets [Builder.geofenceConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geofenceConfig] with a well-typed [GeofenceConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geofenceConfig(geofenceConfig: JsonField<GeofenceConfig>) = apply {
            body.geofenceConfig(geofenceConfig)
        }

        /**
         * **Deprecated. Please use the `geofence_config` to specify the geofence_ids for this
         * monitor.**
         *
         * An array of strings to collect the geofence IDs that should be linked to the `monitor`.
         * Geofences are geographic boundaries that can be used to trigger events based on an
         * asset's location.
         */
        fun geofenceIds(geofenceIds: List<String>) = apply { body.geofenceIds(geofenceIds) }

        /**
         * Sets [Builder.geofenceIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geofenceIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geofenceIds(geofenceIds: JsonField<List<String>>) = apply {
            body.geofenceIds(geofenceIds)
        }

        /**
         * Adds a single [String] to [geofenceIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGeofenceId(geofenceId: String) = apply { body.addGeofenceId(geofenceId) }

        /**
         * `idle_config` is used to set up constraints for creating idle events. When an asset
         * associated with the `monitor` has not moved a given distance within a given time, the
         * Live Tracking API can create events to denote such instances. Please note that this
         * object is mandatory when the monitor `type` is `idle`.
         *
         * Let's look at the properties of this object.
         */
        fun idleConfig(idleConfig: IdleConfig) = apply { body.idleConfig(idleConfig) }

        /**
         * Sets [Builder.idleConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idleConfig] with a well-typed [IdleConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idleConfig(idleConfig: JsonField<IdleConfig>) = apply { body.idleConfig(idleConfig) }

        /** This object is used to identify the asset(s) on which the `monitor` would be applied. */
        fun matchFilter(matchFilter: MatchFilter) = apply { body.matchFilter(matchFilter) }

        /**
         * Sets [Builder.matchFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matchFilter] with a well-typed [MatchFilter] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun matchFilter(matchFilter: JsonField<MatchFilter>) = apply {
            body.matchFilter(matchFilter)
        }

        /** Any valid json object data. Can be used to save customized data. Max size is 65kb. */
        fun metaData(metaData: JsonValue) = apply { body.metaData(metaData) }

        /**
         * Name of the `monitor`. Use this field to assign a meaningful, custom name to the
         * `monitor` being created.
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
         * `speeding_config` is used to set up constraints for creating over-speed events. When an
         * `asset` associated with a `monitor` is traveling at a speed above the given limits, the
         * Live Tracking API can create events to denote such instances. There is also an option to
         * set up a tolerance before creating an event. Please note that this object is mandatory
         * when `type=speeding`.
         *
         * Let's look at the properties of this object.
         */
        fun speedingConfig(speedingConfig: SpeedingConfig) = apply {
            body.speedingConfig(speedingConfig)
        }

        /**
         * Sets [Builder.speedingConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speedingConfig] with a well-typed [SpeedingConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun speedingConfig(speedingConfig: JsonField<SpeedingConfig>) = apply {
            body.speedingConfig(speedingConfig)
        }

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
         * Returns an immutable instance of [MonitorCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * .tags()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MonitorCreateParams =
            MonitorCreateParams(
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
        private val tags: JsonField<List<String>>,
        private val type: JsonField<Type>,
        private val customId: JsonField<String>,
        private val description: JsonField<String>,
        private val geofenceConfig: JsonField<GeofenceConfig>,
        private val geofenceIds: JsonField<List<String>>,
        private val idleConfig: JsonField<IdleConfig>,
        private val matchFilter: JsonField<MatchFilter>,
        private val metaData: JsonValue,
        private val name: JsonField<String>,
        private val speedingConfig: JsonField<SpeedingConfig>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("custom_id")
            @ExcludeMissing
            customId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("geofence_config")
            @ExcludeMissing
            geofenceConfig: JsonField<GeofenceConfig> = JsonMissing.of(),
            @JsonProperty("geofence_ids")
            @ExcludeMissing
            geofenceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("idle_config")
            @ExcludeMissing
            idleConfig: JsonField<IdleConfig> = JsonMissing.of(),
            @JsonProperty("match_filter")
            @ExcludeMissing
            matchFilter: JsonField<MatchFilter> = JsonMissing.of(),
            @JsonProperty("meta_data") @ExcludeMissing metaData: JsonValue = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("speeding_config")
            @ExcludeMissing
            speedingConfig: JsonField<SpeedingConfig> = JsonMissing.of(),
        ) : this(
            tags,
            type,
            customId,
            description,
            geofenceConfig,
            geofenceIds,
            idleConfig,
            matchFilter,
            metaData,
            name,
            speedingConfig,
            mutableMapOf(),
        )

        /**
         * Use this parameter to add `tags` to the `monitor`. `tags` can be used for filtering
         * monitors in the _Get Monitor List_ operation. They can also be used for easy
         * identification of monitors.
         *
         * Please note that valid `tags` are strings, consisting of alphanumeric characters (A-Z,
         * a-z, 0-9) along with the underscore ('\_') and hyphen ('-') symbols.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tags(): List<String> = tags.getRequired("tags")

        /**
         * Specify the type of activity the `monitor` would detect.
         *
         * The `monitor` will be able to detect the specified `type` of activity and create events
         * for eligible `asset`. A `monitor` can detect following types of asset activity:
         * - `enter`: The `monitor` will create an event when a linked `asset` enters into the
         *   specified geofence.
         * - `exit`: The `monitor` will create an event when a linked `asset` exits the specified
         *   geofence.
         * - `enter_and_exit`: The `monitor` will create an event when a linked `asset` either
         *   enters or exits the specified geofence.
         * - `speeding`: The `monitor` will create an event when a linked `asset` exceeds a given
         *   speed limit.
         * - `idle`: The `monitor` will create an event when a linked `asset` exhibits idle
         *   activity.
         *
         * Please note that `assets` and geofences can be linked to a `monitor` using the
         * `match_filter` and `geofence_config` attributes respectively.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Set a unique ID for the new `monitor`. If not provided, an ID will be automatically
         * generated in UUID format. A valid `custom_id` can contain letters, numbers, "-", & "\_"
         * only.
         *
         * Please note that the ID of an `monitor` can not be changed once it is created.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customId(): Optional<String> = customId.getOptional("custom_id")

        /**
         * Add a description for your `monitor` using this parameter.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Geofences are geographic boundaries surrounding an area of interest. `geofence_config` is
         * used to specify the geofences for creating `enter` or `exit` type of events based on the
         * asset's location. When an asset associated with the `monitor` enters the given geofence,
         * an `enter` type event is created, whereas when the asset moves out of the geofence an
         * `exit` type event is created.
         *
         * Please note that this object is mandatory when the monitor `type` belongs to one of
         * `enter`, `exit` or `enter_and_exit`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geofenceConfig(): Optional<GeofenceConfig> =
            geofenceConfig.getOptional("geofence_config")

        /**
         * **Deprecated. Please use the `geofence_config` to specify the geofence_ids for this
         * monitor.**
         *
         * An array of strings to collect the geofence IDs that should be linked to the `monitor`.
         * Geofences are geographic boundaries that can be used to trigger events based on an
         * asset's location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geofenceIds(): Optional<List<String>> = geofenceIds.getOptional("geofence_ids")

        /**
         * `idle_config` is used to set up constraints for creating idle events. When an asset
         * associated with the `monitor` has not moved a given distance within a given time, the
         * Live Tracking API can create events to denote such instances. Please note that this
         * object is mandatory when the monitor `type` is `idle`.
         *
         * Let's look at the properties of this object.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun idleConfig(): Optional<IdleConfig> = idleConfig.getOptional("idle_config")

        /**
         * This object is used to identify the asset(s) on which the `monitor` would be applied.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun matchFilter(): Optional<MatchFilter> = matchFilter.getOptional("match_filter")

        /** Any valid json object data. Can be used to save customized data. Max size is 65kb. */
        @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonValue = metaData

        /**
         * Name of the `monitor`. Use this field to assign a meaningful, custom name to the
         * `monitor` being created.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * `speeding_config` is used to set up constraints for creating over-speed events. When an
         * `asset` associated with a `monitor` is traveling at a speed above the given limits, the
         * Live Tracking API can create events to denote such instances. There is also an option to
         * set up a tolerance before creating an event. Please note that this object is mandatory
         * when `type=speeding`.
         *
         * Let's look at the properties of this object.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun speedingConfig(): Optional<SpeedingConfig> =
            speedingConfig.getOptional("speeding_config")

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns the raw JSON value of [geofenceConfig].
         *
         * Unlike [geofenceConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("geofence_config")
        @ExcludeMissing
        fun _geofenceConfig(): JsonField<GeofenceConfig> = geofenceConfig

        /**
         * Returns the raw JSON value of [geofenceIds].
         *
         * Unlike [geofenceIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("geofence_ids")
        @ExcludeMissing
        fun _geofenceIds(): JsonField<List<String>> = geofenceIds

        /**
         * Returns the raw JSON value of [idleConfig].
         *
         * Unlike [idleConfig], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idle_config")
        @ExcludeMissing
        fun _idleConfig(): JsonField<IdleConfig> = idleConfig

        /**
         * Returns the raw JSON value of [matchFilter].
         *
         * Unlike [matchFilter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("match_filter")
        @ExcludeMissing
        fun _matchFilter(): JsonField<MatchFilter> = matchFilter

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [speedingConfig].
         *
         * Unlike [speedingConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("speeding_config")
        @ExcludeMissing
        fun _speedingConfig(): JsonField<SpeedingConfig> = speedingConfig

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
             * .tags()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var tags: JsonField<MutableList<String>>? = null
            private var type: JsonField<Type>? = null
            private var customId: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var geofenceConfig: JsonField<GeofenceConfig> = JsonMissing.of()
            private var geofenceIds: JsonField<MutableList<String>>? = null
            private var idleConfig: JsonField<IdleConfig> = JsonMissing.of()
            private var matchFilter: JsonField<MatchFilter> = JsonMissing.of()
            private var metaData: JsonValue = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var speedingConfig: JsonField<SpeedingConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                tags = body.tags.map { it.toMutableList() }
                type = body.type
                customId = body.customId
                description = body.description
                geofenceConfig = body.geofenceConfig
                geofenceIds = body.geofenceIds.map { it.toMutableList() }
                idleConfig = body.idleConfig
                matchFilter = body.matchFilter
                metaData = body.metaData
                name = body.name
                speedingConfig = body.speedingConfig
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Use this parameter to add `tags` to the `monitor`. `tags` can be used for filtering
             * monitors in the _Get Monitor List_ operation. They can also be used for easy
             * identification of monitors.
             *
             * Please note that valid `tags` are strings, consisting of alphanumeric characters
             * (A-Z, a-z, 0-9) along with the underscore ('\_') and hyphen ('-') symbols.
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

            /**
             * Specify the type of activity the `monitor` would detect.
             *
             * The `monitor` will be able to detect the specified `type` of activity and create
             * events for eligible `asset`. A `monitor` can detect following types of asset
             * activity:
             * - `enter`: The `monitor` will create an event when a linked `asset` enters into the
             *   specified geofence.
             * - `exit`: The `monitor` will create an event when a linked `asset` exits the
             *   specified geofence.
             * - `enter_and_exit`: The `monitor` will create an event when a linked `asset` either
             *   enters or exits the specified geofence.
             * - `speeding`: The `monitor` will create an event when a linked `asset` exceeds a
             *   given speed limit.
             * - `idle`: The `monitor` will create an event when a linked `asset` exhibits idle
             *   activity.
             *
             * Please note that `assets` and geofences can be linked to a `monitor` using the
             * `match_filter` and `geofence_config` attributes respectively.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Set a unique ID for the new `monitor`. If not provided, an ID will be automatically
             * generated in UUID format. A valid `custom_id` can contain letters, numbers, "-", &
             * "\_" only.
             *
             * Please note that the ID of an `monitor` can not be changed once it is created.
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

            /** Add a description for your `monitor` using this parameter. */
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
             * Geofences are geographic boundaries surrounding an area of interest.
             * `geofence_config` is used to specify the geofences for creating `enter` or `exit`
             * type of events based on the asset's location. When an asset associated with the
             * `monitor` enters the given geofence, an `enter` type event is created, whereas when
             * the asset moves out of the geofence an `exit` type event is created.
             *
             * Please note that this object is mandatory when the monitor `type` belongs to one of
             * `enter`, `exit` or `enter_and_exit`.
             */
            fun geofenceConfig(geofenceConfig: GeofenceConfig) =
                geofenceConfig(JsonField.of(geofenceConfig))

            /**
             * Sets [Builder.geofenceConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geofenceConfig] with a well-typed [GeofenceConfig]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun geofenceConfig(geofenceConfig: JsonField<GeofenceConfig>) = apply {
                this.geofenceConfig = geofenceConfig
            }

            /**
             * **Deprecated. Please use the `geofence_config` to specify the geofence_ids for this
             * monitor.**
             *
             * An array of strings to collect the geofence IDs that should be linked to the
             * `monitor`. Geofences are geographic boundaries that can be used to trigger events
             * based on an asset's location.
             */
            fun geofenceIds(geofenceIds: List<String>) = geofenceIds(JsonField.of(geofenceIds))

            /**
             * Sets [Builder.geofenceIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geofenceIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geofenceIds(geofenceIds: JsonField<List<String>>) = apply {
                this.geofenceIds = geofenceIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [geofenceIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGeofenceId(geofenceId: String) = apply {
                geofenceIds =
                    (geofenceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("geofenceIds", it).add(geofenceId)
                    }
            }

            /**
             * `idle_config` is used to set up constraints for creating idle events. When an asset
             * associated with the `monitor` has not moved a given distance within a given time, the
             * Live Tracking API can create events to denote such instances. Please note that this
             * object is mandatory when the monitor `type` is `idle`.
             *
             * Let's look at the properties of this object.
             */
            fun idleConfig(idleConfig: IdleConfig) = idleConfig(JsonField.of(idleConfig))

            /**
             * Sets [Builder.idleConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idleConfig] with a well-typed [IdleConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idleConfig(idleConfig: JsonField<IdleConfig>) = apply {
                this.idleConfig = idleConfig
            }

            /**
             * This object is used to identify the asset(s) on which the `monitor` would be applied.
             */
            fun matchFilter(matchFilter: MatchFilter) = matchFilter(JsonField.of(matchFilter))

            /**
             * Sets [Builder.matchFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matchFilter] with a well-typed [MatchFilter] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun matchFilter(matchFilter: JsonField<MatchFilter>) = apply {
                this.matchFilter = matchFilter
            }

            /**
             * Any valid json object data. Can be used to save customized data. Max size is 65kb.
             */
            fun metaData(metaData: JsonValue) = apply { this.metaData = metaData }

            /**
             * Name of the `monitor`. Use this field to assign a meaningful, custom name to the
             * `monitor` being created.
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
             * `speeding_config` is used to set up constraints for creating over-speed events. When
             * an `asset` associated with a `monitor` is traveling at a speed above the given
             * limits, the Live Tracking API can create events to denote such instances. There is
             * also an option to set up a tolerance before creating an event. Please note that this
             * object is mandatory when `type=speeding`.
             *
             * Let's look at the properties of this object.
             */
            fun speedingConfig(speedingConfig: SpeedingConfig) =
                speedingConfig(JsonField.of(speedingConfig))

            /**
             * Sets [Builder.speedingConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.speedingConfig] with a well-typed [SpeedingConfig]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun speedingConfig(speedingConfig: JsonField<SpeedingConfig>) = apply {
                this.speedingConfig = speedingConfig
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
             * .tags()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("tags", tags).map { it.toImmutable() },
                    checkRequired("type", type),
                    customId,
                    description,
                    geofenceConfig,
                    (geofenceIds ?: JsonMissing.of()).map { it.toImmutable() },
                    idleConfig,
                    matchFilter,
                    metaData,
                    name,
                    speedingConfig,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            tags()
            type().validate()
            customId()
            description()
            geofenceConfig().ifPresent { it.validate() }
            geofenceIds()
            idleConfig().ifPresent { it.validate() }
            matchFilter().ifPresent { it.validate() }
            name()
            speedingConfig().ifPresent { it.validate() }
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
            (tags.asKnown().getOrNull()?.size ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (customId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (geofenceConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (geofenceIds.asKnown().getOrNull()?.size ?: 0) +
                (idleConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (matchFilter.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (speedingConfig.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && tags == other.tags && type == other.type && customId == other.customId && description == other.description && geofenceConfig == other.geofenceConfig && geofenceIds == other.geofenceIds && idleConfig == other.idleConfig && matchFilter == other.matchFilter && metaData == other.metaData && name == other.name && speedingConfig == other.speedingConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(tags, type, customId, description, geofenceConfig, geofenceIds, idleConfig, matchFilter, metaData, name, speedingConfig, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{tags=$tags, type=$type, customId=$customId, description=$description, geofenceConfig=$geofenceConfig, geofenceIds=$geofenceIds, idleConfig=$idleConfig, matchFilter=$matchFilter, metaData=$metaData, name=$name, speedingConfig=$speedingConfig, additionalProperties=$additionalProperties}"
    }

    /**
     * Specify the type of activity the `monitor` would detect.
     *
     * The `monitor` will be able to detect the specified `type` of activity and create events for
     * eligible `asset`. A `monitor` can detect following types of asset activity:
     * - `enter`: The `monitor` will create an event when a linked `asset` enters into the specified
     *   geofence.
     * - `exit`: The `monitor` will create an event when a linked `asset` exits the specified
     *   geofence.
     * - `enter_and_exit`: The `monitor` will create an event when a linked `asset` either enters or
     *   exits the specified geofence.
     * - `speeding`: The `monitor` will create an event when a linked `asset` exceeds a given speed
     *   limit.
     * - `idle`: The `monitor` will create an event when a linked `asset` exhibits idle activity.
     *
     * Please note that `assets` and geofences can be linked to a `monitor` using the `match_filter`
     * and `geofence_config` attributes respectively.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ENTER = of("`enter`")

            @JvmField val EXIT = of("`exit`")

            @JvmField val ENTER_AND_EXIT = of("`enter_and_exit`")

            @JvmField val SPEEDING = of("`speeding`")

            @JvmField val IDLE = of("`idle`")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ENTER,
            EXIT,
            ENTER_AND_EXIT,
            SPEEDING,
            IDLE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENTER,
            EXIT,
            ENTER_AND_EXIT,
            SPEEDING,
            IDLE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                ENTER -> Value.ENTER
                EXIT -> Value.EXIT
                ENTER_AND_EXIT -> Value.ENTER_AND_EXIT
                SPEEDING -> Value.SPEEDING
                IDLE -> Value.IDLE
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
                ENTER -> Known.ENTER
                EXIT -> Known.EXIT
                ENTER_AND_EXIT -> Known.ENTER_AND_EXIT
                SPEEDING -> Known.SPEEDING
                IDLE -> Known.IDLE
                else -> throw NextbillionSdkInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Geofences are geographic boundaries surrounding an area of interest. `geofence_config` is
     * used to specify the geofences for creating `enter` or `exit` type of events based on the
     * asset's location. When an asset associated with the `monitor` enters the given geofence, an
     * `enter` type event is created, whereas when the asset moves out of the geofence an `exit`
     * type event is created.
     *
     * Please note that this object is mandatory when the monitor `type` belongs to one of `enter`,
     * `exit` or `enter_and_exit`.
     */
    class GeofenceConfig
    private constructor(
        private val geofenceIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("geofence_ids")
            @ExcludeMissing
            geofenceIds: JsonField<List<String>> = JsonMissing.of()
        ) : this(geofenceIds, mutableMapOf())

        /**
         * An array of strings to collect the geofence IDs that should be linked to the `monitor`.
         * Please note `geofence_ids` are mandatory when using the `geofence_config` attribute.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun geofenceIds(): List<String> = geofenceIds.getRequired("geofence_ids")

        /**
         * Returns the raw JSON value of [geofenceIds].
         *
         * Unlike [geofenceIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("geofence_ids")
        @ExcludeMissing
        fun _geofenceIds(): JsonField<List<String>> = geofenceIds

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
             * Returns a mutable builder for constructing an instance of [GeofenceConfig].
             *
             * The following fields are required:
             * ```java
             * .geofenceIds()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GeofenceConfig]. */
        class Builder internal constructor() {

            private var geofenceIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(geofenceConfig: GeofenceConfig) = apply {
                geofenceIds = geofenceConfig.geofenceIds.map { it.toMutableList() }
                additionalProperties = geofenceConfig.additionalProperties.toMutableMap()
            }

            /**
             * An array of strings to collect the geofence IDs that should be linked to the
             * `monitor`. Please note `geofence_ids` are mandatory when using the `geofence_config`
             * attribute.
             */
            fun geofenceIds(geofenceIds: List<String>) = geofenceIds(JsonField.of(geofenceIds))

            /**
             * Sets [Builder.geofenceIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geofenceIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geofenceIds(geofenceIds: JsonField<List<String>>) = apply {
                this.geofenceIds = geofenceIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [geofenceIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGeofenceId(geofenceId: String) = apply {
                geofenceIds =
                    (geofenceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("geofenceIds", it).add(geofenceId)
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
             * Returns an immutable instance of [GeofenceConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .geofenceIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): GeofenceConfig =
                GeofenceConfig(
                    checkRequired("geofenceIds", geofenceIds).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): GeofenceConfig = apply {
            if (validated) {
                return@apply
            }

            geofenceIds()
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
        @JvmSynthetic internal fun validity(): Int = (geofenceIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GeofenceConfig && geofenceIds == other.geofenceIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(geofenceIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GeofenceConfig{geofenceIds=$geofenceIds, additionalProperties=$additionalProperties}"
    }

    /**
     * `idle_config` is used to set up constraints for creating idle events. When an asset
     * associated with the `monitor` has not moved a given distance within a given time, the Live
     * Tracking API can create events to denote such instances. Please note that this object is
     * mandatory when the monitor `type` is `idle`.
     *
     * Let's look at the properties of this object.
     */
    class IdleConfig
    private constructor(
        private val distanceTolerance: JsonField<Double>,
        private val timeTolerance: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("distance_tolerance")
            @ExcludeMissing
            distanceTolerance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("time_tolerance")
            @ExcludeMissing
            timeTolerance: JsonField<Long> = JsonMissing.of(),
        ) : this(distanceTolerance, timeTolerance, mutableMapOf())

        /**
         * Use this parameter to configure a distance threshold that will be used to determine if
         * the asset was idle or not. If the asset moves by a distance less than the value of this
         * parameter within a certain time period, the `monitor` would create an idle event against
         * the asset. The `distance_tolerance` should be provided in meters.
         *
         * Users can set an appropriate value for this parameter, along with appropriate
         * `time_tolerance` value, to avoid triggering idle events when the asset is crossing a busy
         * intersection or waiting at the traffic lights.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun distanceTolerance(): Double = distanceTolerance.getRequired("distance_tolerance")

        /**
         * Use this parameter to configure a time duration for which the `monitor` would track the
         * distance covered by an asset before triggering an idle event. The `time_tolerance` should
         * be provided in milliseconds.
         *
         * If the distance covered by the asset during a `time_tolerance` is less than that
         * specified in `distance_tolerance` the asset will be assumed to be idle.
         *
         * Please observe that this attribute along with `distance_tolerance` parameter can be used
         * to control the "sensitivity" of the `monitor` with respect to idle alerts. If the
         * `distance_tolerance` is set a high value, then setting `time_tolerance` to a low value
         * may result in a situation where asset is always judged as idle. On the contrary, it might
         * never be judged as idle if `distance_tolerance` is set to a low value but
         * `time_tolerance` is set to a high value.
         *
         * It is recommended to use these properties with appropriate values to trigger genuine idle
         * events. The appropriate values might depend on the traffic conditions, nature of
         * operations that the asset is involved in, type of asset and other factors.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun timeTolerance(): Optional<Long> = timeTolerance.getOptional("time_tolerance")

        /**
         * Returns the raw JSON value of [distanceTolerance].
         *
         * Unlike [distanceTolerance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("distance_tolerance")
        @ExcludeMissing
        fun _distanceTolerance(): JsonField<Double> = distanceTolerance

        /**
         * Returns the raw JSON value of [timeTolerance].
         *
         * Unlike [timeTolerance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("time_tolerance")
        @ExcludeMissing
        fun _timeTolerance(): JsonField<Long> = timeTolerance

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
             * Returns a mutable builder for constructing an instance of [IdleConfig].
             *
             * The following fields are required:
             * ```java
             * .distanceTolerance()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [IdleConfig]. */
        class Builder internal constructor() {

            private var distanceTolerance: JsonField<Double>? = null
            private var timeTolerance: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(idleConfig: IdleConfig) = apply {
                distanceTolerance = idleConfig.distanceTolerance
                timeTolerance = idleConfig.timeTolerance
                additionalProperties = idleConfig.additionalProperties.toMutableMap()
            }

            /**
             * Use this parameter to configure a distance threshold that will be used to determine
             * if the asset was idle or not. If the asset moves by a distance less than the value of
             * this parameter within a certain time period, the `monitor` would create an idle event
             * against the asset. The `distance_tolerance` should be provided in meters.
             *
             * Users can set an appropriate value for this parameter, along with appropriate
             * `time_tolerance` value, to avoid triggering idle events when the asset is crossing a
             * busy intersection or waiting at the traffic lights.
             */
            fun distanceTolerance(distanceTolerance: Double) =
                distanceTolerance(JsonField.of(distanceTolerance))

            /**
             * Sets [Builder.distanceTolerance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distanceTolerance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distanceTolerance(distanceTolerance: JsonField<Double>) = apply {
                this.distanceTolerance = distanceTolerance
            }

            /**
             * Use this parameter to configure a time duration for which the `monitor` would track
             * the distance covered by an asset before triggering an idle event. The
             * `time_tolerance` should be provided in milliseconds.
             *
             * If the distance covered by the asset during a `time_tolerance` is less than that
             * specified in `distance_tolerance` the asset will be assumed to be idle.
             *
             * Please observe that this attribute along with `distance_tolerance` parameter can be
             * used to control the "sensitivity" of the `monitor` with respect to idle alerts. If
             * the `distance_tolerance` is set a high value, then setting `time_tolerance` to a low
             * value may result in a situation where asset is always judged as idle. On the
             * contrary, it might never be judged as idle if `distance_tolerance` is set to a low
             * value but `time_tolerance` is set to a high value.
             *
             * It is recommended to use these properties with appropriate values to trigger genuine
             * idle events. The appropriate values might depend on the traffic conditions, nature of
             * operations that the asset is involved in, type of asset and other factors.
             */
            fun timeTolerance(timeTolerance: Long) = timeTolerance(JsonField.of(timeTolerance))

            /**
             * Sets [Builder.timeTolerance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeTolerance] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeTolerance(timeTolerance: JsonField<Long>) = apply {
                this.timeTolerance = timeTolerance
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
             * Returns an immutable instance of [IdleConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .distanceTolerance()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): IdleConfig =
                IdleConfig(
                    checkRequired("distanceTolerance", distanceTolerance),
                    timeTolerance,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): IdleConfig = apply {
            if (validated) {
                return@apply
            }

            distanceTolerance()
            timeTolerance()
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
            (if (distanceTolerance.asKnown().isPresent) 1 else 0) +
                (if (timeTolerance.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is IdleConfig && distanceTolerance == other.distanceTolerance && timeTolerance == other.timeTolerance && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(distanceTolerance, timeTolerance, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "IdleConfig{distanceTolerance=$distanceTolerance, timeTolerance=$timeTolerance, additionalProperties=$additionalProperties}"
    }

    /** This object is used to identify the asset(s) on which the `monitor` would be applied. */
    class MatchFilter
    private constructor(
        private val includeAllOfAttributes: JsonValue,
        private val includeAnyOfAttributes: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("include_all_of_attributes")
            @ExcludeMissing
            includeAllOfAttributes: JsonValue = JsonMissing.of(),
            @JsonProperty("include_any_of_attributes")
            @ExcludeMissing
            includeAnyOfAttributes: JsonValue = JsonMissing.of(),
        ) : this(includeAllOfAttributes, includeAnyOfAttributes, mutableMapOf())

        /**
         * A string type dictionary object to specify the `attributes`. Only the assets having all
         * of the `attributes` added to this parameter will be linked to this `monitor`. Once an
         * `asset` is linked to a `monitor`, the `monitor` will be able to create events for that
         * `asset` whenever an activity specified in `type` is detected. Multiple attributes should
         * be separated by a comma `,`.
         *
         * Please note that this parameter can not be used in conjunction with
         * `include_any_of_attributes`. Also, the maximum number of `key`:`value` pairs that this
         * parameter can take is 100 and the overall size of the `match_filter` object should not
         * exceed 65kb.
         */
        @JsonProperty("include_all_of_attributes")
        @ExcludeMissing
        fun _includeAllOfAttributes(): JsonValue = includeAllOfAttributes

        /**
         * A string type dictionary object to specify the `attributes`. The assets having at least
         * one of the `attributes` added to this parameter will be linked to this `monitor`. Once an
         * `asset` is linked to a `monitor`, the `monitor` will be able to create events for that
         * `asset` whenever an activity specified in `type` is detected. Multiple attributes should
         * be separated by a comma `,`.
         *
         * Please note that this parameter can not be used in conjunction with
         * `include_all_of_attributes`. Also, the maximum number of `key`:`value` pairs that this
         * parameter can take is 100 and the overall size of the `match_filter` object should not
         * exceed 65kb.
         */
        @JsonProperty("include_any_of_attributes")
        @ExcludeMissing
        fun _includeAnyOfAttributes(): JsonValue = includeAnyOfAttributes

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

            /** Returns a mutable builder for constructing an instance of [MatchFilter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MatchFilter]. */
        class Builder internal constructor() {

            private var includeAllOfAttributes: JsonValue = JsonMissing.of()
            private var includeAnyOfAttributes: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(matchFilter: MatchFilter) = apply {
                includeAllOfAttributes = matchFilter.includeAllOfAttributes
                includeAnyOfAttributes = matchFilter.includeAnyOfAttributes
                additionalProperties = matchFilter.additionalProperties.toMutableMap()
            }

            /**
             * A string type dictionary object to specify the `attributes`. Only the assets having
             * all of the `attributes` added to this parameter will be linked to this `monitor`.
             * Once an `asset` is linked to a `monitor`, the `monitor` will be able to create events
             * for that `asset` whenever an activity specified in `type` is detected. Multiple
             * attributes should be separated by a comma `,`.
             *
             * Please note that this parameter can not be used in conjunction with
             * `include_any_of_attributes`. Also, the maximum number of `key`:`value` pairs that
             * this parameter can take is 100 and the overall size of the `match_filter` object
             * should not exceed 65kb.
             */
            fun includeAllOfAttributes(includeAllOfAttributes: JsonValue) = apply {
                this.includeAllOfAttributes = includeAllOfAttributes
            }

            /**
             * A string type dictionary object to specify the `attributes`. The assets having at
             * least one of the `attributes` added to this parameter will be linked to this
             * `monitor`. Once an `asset` is linked to a `monitor`, the `monitor` will be able to
             * create events for that `asset` whenever an activity specified in `type` is detected.
             * Multiple attributes should be separated by a comma `,`.
             *
             * Please note that this parameter can not be used in conjunction with
             * `include_all_of_attributes`. Also, the maximum number of `key`:`value` pairs that
             * this parameter can take is 100 and the overall size of the `match_filter` object
             * should not exceed 65kb.
             */
            fun includeAnyOfAttributes(includeAnyOfAttributes: JsonValue) = apply {
                this.includeAnyOfAttributes = includeAnyOfAttributes
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
             * Returns an immutable instance of [MatchFilter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): MatchFilter =
                MatchFilter(
                    includeAllOfAttributes,
                    includeAnyOfAttributes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): MatchFilter = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic internal fun validity(): Int = 0

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MatchFilter && includeAllOfAttributes == other.includeAllOfAttributes && includeAnyOfAttributes == other.includeAnyOfAttributes && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(includeAllOfAttributes, includeAnyOfAttributes, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MatchFilter{includeAllOfAttributes=$includeAllOfAttributes, includeAnyOfAttributes=$includeAnyOfAttributes, additionalProperties=$additionalProperties}"
    }

    /**
     * `speeding_config` is used to set up constraints for creating over-speed events. When an
     * `asset` associated with a `monitor` is traveling at a speed above the given limits, the Live
     * Tracking API can create events to denote such instances. There is also an option to set up a
     * tolerance before creating an event. Please note that this object is mandatory when
     * `type=speeding`.
     *
     * Let's look at the properties of this object.
     */
    class SpeedingConfig
    private constructor(
        private val customerSpeedLimit: JsonField<Long>,
        private val timeTolerance: JsonField<Long>,
        private val useAdminSpeedLimit: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_speed_limit")
            @ExcludeMissing
            customerSpeedLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("time_tolerance")
            @ExcludeMissing
            timeTolerance: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("use_admin_speed_limit")
            @ExcludeMissing
            useAdminSpeedLimit: JsonField<Boolean> = JsonMissing.of(),
        ) : this(customerSpeedLimit, timeTolerance, useAdminSpeedLimit, mutableMapOf())

        /**
         * Use this parameter to establish the speed limit that will allow the `monitor` to create
         * events, depending on the `time_tolerance` value, when an asset's tracked speed exceeds
         * it. The speed limit should be specified in meters per second.
         *
         * Please note that `customer_speed_limit` is mandatory when `use_admin_speed_limit` is
         * false. However, when `use_admin_speed_limit` is true, `customer_speed_limit` is
         * ineffective.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerSpeedLimit(): Optional<Long> =
            customerSpeedLimit.getOptional("customer_speed_limit")

        /**
         * Use this parameter to configure a time tolerance before triggering an event. Adding a
         * tolerance would make the Tracking service wait for the specified time before triggering
         * the event. Consequently, an event is triggered only when the time for which the `asset`
         * has been over-speeding continuously, exceeds the configured tolerance time. The unit for
         * this parameter is milliseconds.
         *
         * It can be seen that this attribute is used to control the "sensitivity" of the `monitor`
         * with respect to speed alerts. Higher the value of `time_tolerance` the less sensitive the
         * `monitor` would be to instances of over-speeding. Conversely, if 'time_tolerance' is set
         * to 0, the `monitor` will be extremely sensitive and will create an event as soon as
         * tracking information with a speed value greater than the specified limit is received.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun timeTolerance(): Optional<Long> = timeTolerance.getOptional("time_tolerance")

        /**
         * A boolean attribute to indicate which speed limit values should be used by the `monitor`.
         * When `use_admin_speed_limit` is true, the administrative speed limit of the road on which
         * the asset is located, will be used to generate events when the asset’s tracked speed
         * exceeds it. Whereas, when `use_admin_speed_limit` is false, the `customer_speed_limit`
         * specified will be used to generate events when the asset's tracked speed exceeds it.
         *
         * Please note that if `use_admin_speed_limit` is false, `customer_speed_limit` is
         * mandatory, however, when `use_admin_speed_limit` is true then `customer_speed_limit` is
         * ineffective.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun useAdminSpeedLimit(): Optional<Boolean> =
            useAdminSpeedLimit.getOptional("use_admin_speed_limit")

        /**
         * Returns the raw JSON value of [customerSpeedLimit].
         *
         * Unlike [customerSpeedLimit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("customer_speed_limit")
        @ExcludeMissing
        fun _customerSpeedLimit(): JsonField<Long> = customerSpeedLimit

        /**
         * Returns the raw JSON value of [timeTolerance].
         *
         * Unlike [timeTolerance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("time_tolerance")
        @ExcludeMissing
        fun _timeTolerance(): JsonField<Long> = timeTolerance

        /**
         * Returns the raw JSON value of [useAdminSpeedLimit].
         *
         * Unlike [useAdminSpeedLimit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("use_admin_speed_limit")
        @ExcludeMissing
        fun _useAdminSpeedLimit(): JsonField<Boolean> = useAdminSpeedLimit

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

            /** Returns a mutable builder for constructing an instance of [SpeedingConfig]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SpeedingConfig]. */
        class Builder internal constructor() {

            private var customerSpeedLimit: JsonField<Long> = JsonMissing.of()
            private var timeTolerance: JsonField<Long> = JsonMissing.of()
            private var useAdminSpeedLimit: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(speedingConfig: SpeedingConfig) = apply {
                customerSpeedLimit = speedingConfig.customerSpeedLimit
                timeTolerance = speedingConfig.timeTolerance
                useAdminSpeedLimit = speedingConfig.useAdminSpeedLimit
                additionalProperties = speedingConfig.additionalProperties.toMutableMap()
            }

            /**
             * Use this parameter to establish the speed limit that will allow the `monitor` to
             * create events, depending on the `time_tolerance` value, when an asset's tracked speed
             * exceeds it. The speed limit should be specified in meters per second.
             *
             * Please note that `customer_speed_limit` is mandatory when `use_admin_speed_limit` is
             * false. However, when `use_admin_speed_limit` is true, `customer_speed_limit` is
             * ineffective.
             */
            fun customerSpeedLimit(customerSpeedLimit: Long) =
                customerSpeedLimit(JsonField.of(customerSpeedLimit))

            /**
             * Sets [Builder.customerSpeedLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerSpeedLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerSpeedLimit(customerSpeedLimit: JsonField<Long>) = apply {
                this.customerSpeedLimit = customerSpeedLimit
            }

            /**
             * Use this parameter to configure a time tolerance before triggering an event. Adding a
             * tolerance would make the Tracking service wait for the specified time before
             * triggering the event. Consequently, an event is triggered only when the time for
             * which the `asset` has been over-speeding continuously, exceeds the configured
             * tolerance time. The unit for this parameter is milliseconds.
             *
             * It can be seen that this attribute is used to control the "sensitivity" of the
             * `monitor` with respect to speed alerts. Higher the value of `time_tolerance` the less
             * sensitive the `monitor` would be to instances of over-speeding. Conversely, if
             * 'time_tolerance' is set to 0, the `monitor` will be extremely sensitive and will
             * create an event as soon as tracking information with a speed value greater than the
             * specified limit is received.
             */
            fun timeTolerance(timeTolerance: Long) = timeTolerance(JsonField.of(timeTolerance))

            /**
             * Sets [Builder.timeTolerance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeTolerance] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeTolerance(timeTolerance: JsonField<Long>) = apply {
                this.timeTolerance = timeTolerance
            }

            /**
             * A boolean attribute to indicate which speed limit values should be used by the
             * `monitor`. When `use_admin_speed_limit` is true, the administrative speed limit of
             * the road on which the asset is located, will be used to generate events when the
             * asset’s tracked speed exceeds it. Whereas, when `use_admin_speed_limit` is false, the
             * `customer_speed_limit` specified will be used to generate events when the asset's
             * tracked speed exceeds it.
             *
             * Please note that if `use_admin_speed_limit` is false, `customer_speed_limit` is
             * mandatory, however, when `use_admin_speed_limit` is true then `customer_speed_limit`
             * is ineffective.
             */
            fun useAdminSpeedLimit(useAdminSpeedLimit: Boolean) =
                useAdminSpeedLimit(JsonField.of(useAdminSpeedLimit))

            /**
             * Sets [Builder.useAdminSpeedLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useAdminSpeedLimit] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun useAdminSpeedLimit(useAdminSpeedLimit: JsonField<Boolean>) = apply {
                this.useAdminSpeedLimit = useAdminSpeedLimit
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
             * Returns an immutable instance of [SpeedingConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SpeedingConfig =
                SpeedingConfig(
                    customerSpeedLimit,
                    timeTolerance,
                    useAdminSpeedLimit,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SpeedingConfig = apply {
            if (validated) {
                return@apply
            }

            customerSpeedLimit()
            timeTolerance()
            useAdminSpeedLimit()
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
            (if (customerSpeedLimit.asKnown().isPresent) 1 else 0) +
                (if (timeTolerance.asKnown().isPresent) 1 else 0) +
                (if (useAdminSpeedLimit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SpeedingConfig && customerSpeedLimit == other.customerSpeedLimit && timeTolerance == other.timeTolerance && useAdminSpeedLimit == other.useAdminSpeedLimit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerSpeedLimit, timeTolerance, useAdminSpeedLimit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpeedingConfig{customerSpeedLimit=$customerSpeedLimit, timeTolerance=$timeTolerance, useAdminSpeedLimit=$useAdminSpeedLimit, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is MonitorCreateParams && key == other.key && cluster == other.cluster && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(key, cluster, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "MonitorCreateParams{key=$key, cluster=$cluster, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
