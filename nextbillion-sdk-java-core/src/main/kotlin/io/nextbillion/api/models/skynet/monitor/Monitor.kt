// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.skynet.monitor

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.nextbillion.api.core.Enum
import io.nextbillion.api.core.ExcludeMissing
import io.nextbillion.api.core.JsonField
import io.nextbillion.api.core.JsonMissing
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.core.checkKnown
import io.nextbillion.api.core.toImmutable
import io.nextbillion.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Monitor
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<Long>,
    private val description: JsonField<String>,
    private val geofenceConfig: JsonField<GeofenceConfig>,
    private val geofences: JsonField<List<String>>,
    private val idleConfig: JsonField<IdleConfig>,
    private val matchFilter: JsonField<MatchFilter>,
    private val metaData: JsonValue,
    private val name: JsonField<String>,
    private val speedingConfig: JsonField<SpeedingConfig>,
    private val tags: JsonField<List<String>>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("geofence_config")
        @ExcludeMissing
        geofenceConfig: JsonField<GeofenceConfig> = JsonMissing.of(),
        @JsonProperty("geofences")
        @ExcludeMissing
        geofences: JsonField<List<String>> = JsonMissing.of(),
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
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        description,
        geofenceConfig,
        geofences,
        idleConfig,
        matchFilter,
        metaData,
        name,
        speedingConfig,
        tags,
        type,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Unique ID of the `monitor`. This is the same ID that was generated at the time of creating
     * the `monitor`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * A UNIX epoch timestamp in seconds representing the time at which the `monitor` was created.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun createdAt(): Optional<Long> = createdAt.getOptional("created_at")

    /**
     * Description of the `monitor`. The value would be the same as that provided for the
     * `description` parameter at the time of creating or updating the `monitor`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * An object returning the details of the geofence that are associated with the `monitor` for an
     * `enter`, `exit` or `enter_and_exit` type of monitor.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun geofenceConfig(): Optional<GeofenceConfig> = geofenceConfig.getOptional("geofence_config")

    /**
     * Geofence IDs that are linked to the `monitor`. These IDs were associated with the `monitor`
     * at the time of creating or updating it.
     *
     * The `monitor` uses the geofences mentioned here to create events of `type` nature for the
     * eligible asset(s).
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun geofences(): Optional<List<String>> = geofences.getOptional("geofences")

    /**
     * An object returning the details of the idle activity constraints for a `idle` type of
     * `monitor`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun idleConfig(): Optional<IdleConfig> = idleConfig.getOptional("idle_config")

    /**
     * Use this object to update the `attributes` of the `monitor`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun matchFilter(): Optional<MatchFilter> = matchFilter.getOptional("match_filter")

    /** Any valid json object data. Can be used to save customized data. Max size is 65kb. */
    @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonValue = metaData

    /**
     * Name of the `monitor`. The value would be the same as that provided for the `name` parameter
     * at the time of creating or updating the `monitor`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * An object returning the details of the over-speeding constraints for a `speeding` type of
     * `monitor`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun speedingConfig(): Optional<SpeedingConfig> = speedingConfig.getOptional("speeding_config")

    /**
     * Tags of the `monitor`. The values would be the same as that provided for the `tags` parameter
     * at the time of creating or updating the `monitor`.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Type of the `monitor`. It represents the type of `asset` activity that the `monitor` is
     * configured to detect.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * A UNIX epoch timestamp in seconds representing the time at which the `monitor` was last
     * updated.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<Long> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [geofenceConfig].
     *
     * Unlike [geofenceConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geofence_config")
    @ExcludeMissing
    fun _geofenceConfig(): JsonField<GeofenceConfig> = geofenceConfig

    /**
     * Returns the raw JSON value of [geofences].
     *
     * Unlike [geofences], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geofences") @ExcludeMissing fun _geofences(): JsonField<List<String>> = geofences

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
     * Unlike [speedingConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speeding_config")
    @ExcludeMissing
    fun _speedingConfig(): JsonField<SpeedingConfig> = speedingConfig

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
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<Long> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [Monitor]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Monitor]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<Long> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var geofenceConfig: JsonField<GeofenceConfig> = JsonMissing.of()
        private var geofences: JsonField<MutableList<String>>? = null
        private var idleConfig: JsonField<IdleConfig> = JsonMissing.of()
        private var matchFilter: JsonField<MatchFilter> = JsonMissing.of()
        private var metaData: JsonValue = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var speedingConfig: JsonField<SpeedingConfig> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var type: JsonField<Type> = JsonMissing.of()
        private var updatedAt: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(monitor: Monitor) = apply {
            id = monitor.id
            createdAt = monitor.createdAt
            description = monitor.description
            geofenceConfig = monitor.geofenceConfig
            geofences = monitor.geofences.map { it.toMutableList() }
            idleConfig = monitor.idleConfig
            matchFilter = monitor.matchFilter
            metaData = monitor.metaData
            name = monitor.name
            speedingConfig = monitor.speedingConfig
            tags = monitor.tags.map { it.toMutableList() }
            type = monitor.type
            updatedAt = monitor.updatedAt
            additionalProperties = monitor.additionalProperties.toMutableMap()
        }

        /**
         * Unique ID of the `monitor`. This is the same ID that was generated at the time of
         * creating the `monitor`.
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * A UNIX epoch timestamp in seconds representing the time at which the `monitor` was
         * created.
         */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /**
         * Description of the `monitor`. The value would be the same as that provided for the
         * `description` parameter at the time of creating or updating the `monitor`.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * An object returning the details of the geofence that are associated with the `monitor`
         * for an `enter`, `exit` or `enter_and_exit` type of monitor.
         */
        fun geofenceConfig(geofenceConfig: GeofenceConfig) =
            geofenceConfig(JsonField.of(geofenceConfig))

        /**
         * Sets [Builder.geofenceConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geofenceConfig] with a well-typed [GeofenceConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geofenceConfig(geofenceConfig: JsonField<GeofenceConfig>) = apply {
            this.geofenceConfig = geofenceConfig
        }

        /**
         * Geofence IDs that are linked to the `monitor`. These IDs were associated with the
         * `monitor` at the time of creating or updating it.
         *
         * The `monitor` uses the geofences mentioned here to create events of `type` nature for the
         * eligible asset(s).
         */
        fun geofences(geofences: List<String>) = geofences(JsonField.of(geofences))

        /**
         * Sets [Builder.geofences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geofences] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun geofences(geofences: JsonField<List<String>>) = apply {
            this.geofences = geofences.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [geofences].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGeofence(geofence: String) = apply {
            geofences =
                (geofences ?: JsonField.of(mutableListOf())).also {
                    checkKnown("geofences", it).add(geofence)
                }
        }

        /**
         * An object returning the details of the idle activity constraints for a `idle` type of
         * `monitor`.
         */
        fun idleConfig(idleConfig: IdleConfig) = idleConfig(JsonField.of(idleConfig))

        /**
         * Sets [Builder.idleConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idleConfig] with a well-typed [IdleConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idleConfig(idleConfig: JsonField<IdleConfig>) = apply { this.idleConfig = idleConfig }

        /** Use this object to update the `attributes` of the `monitor`. */
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

        /** Any valid json object data. Can be used to save customized data. Max size is 65kb. */
        fun metaData(metaData: JsonValue) = apply { this.metaData = metaData }

        /**
         * Name of the `monitor`. The value would be the same as that provided for the `name`
         * parameter at the time of creating or updating the `monitor`.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * An object returning the details of the over-speeding constraints for a `speeding` type of
         * `monitor`.
         */
        fun speedingConfig(speedingConfig: SpeedingConfig) =
            speedingConfig(JsonField.of(speedingConfig))

        /**
         * Sets [Builder.speedingConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speedingConfig] with a well-typed [SpeedingConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun speedingConfig(speedingConfig: JsonField<SpeedingConfig>) = apply {
            this.speedingConfig = speedingConfig
        }

        /**
         * Tags of the `monitor`. The values would be the same as that provided for the `tags`
         * parameter at the time of creating or updating the `monitor`.
         */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        /**
         * Type of the `monitor`. It represents the type of `asset` activity that the `monitor` is
         * configured to detect.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * A UNIX epoch timestamp in seconds representing the time at which the `monitor` was last
         * updated.
         */
        fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [Monitor].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Monitor =
            Monitor(
                id,
                createdAt,
                description,
                geofenceConfig,
                (geofences ?: JsonMissing.of()).map { it.toImmutable() },
                idleConfig,
                matchFilter,
                metaData,
                name,
                speedingConfig,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                type,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Monitor = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        description()
        geofenceConfig().ifPresent { it.validate() }
        geofences()
        idleConfig().ifPresent { it.validate() }
        matchFilter().ifPresent { it.validate() }
        name()
        speedingConfig().ifPresent { it.validate() }
        tags()
        type().ifPresent { it.validate() }
        updatedAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (geofenceConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (geofences.asKnown().getOrNull()?.size ?: 0) +
            (idleConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (matchFilter.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (speedingConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /**
     * An object returning the details of the geofence that are associated with the `monitor` for an
     * `enter`, `exit` or `enter_and_exit` type of monitor.
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
         * An array of geofence IDs that are linked to the `monitor`. Geofences are geographic
         * boundaries that can be used to trigger events based on an asset's location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geofenceIds(): Optional<List<String>> = geofenceIds.getOptional("geofence_ids")

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

            /** Returns a mutable builder for constructing an instance of [GeofenceConfig]. */
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
             * An array of geofence IDs that are linked to the `monitor`. Geofences are geographic
             * boundaries that can be used to trigger events based on an asset's location.
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
             */
            fun build(): GeofenceConfig =
                GeofenceConfig(
                    (geofenceIds ?: JsonMissing.of()).map { it.toImmutable() },
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
     * An object returning the details of the idle activity constraints for a `idle` type of
     * `monitor`.
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
         * This parameter returns the distance threshold that was used to determine if the asset was
         * idle or not. The value returned for this parameter is the same as that provided while
         * creating or updating a `idle` type `monitor`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun distanceTolerance(): Optional<Double> =
            distanceTolerance.getOptional("distance_tolerance")

        /**
         * This parameter returns the time duration for which the `monitor` tracks the distance
         * covered by an asset before triggering an idle event. The value returned for this
         * parameter is the same as that provided while creating or updating a `idle` type
         * `monitor`.
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

            /** Returns a mutable builder for constructing an instance of [IdleConfig]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [IdleConfig]. */
        class Builder internal constructor() {

            private var distanceTolerance: JsonField<Double> = JsonMissing.of()
            private var timeTolerance: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(idleConfig: IdleConfig) = apply {
                distanceTolerance = idleConfig.distanceTolerance
                timeTolerance = idleConfig.timeTolerance
                additionalProperties = idleConfig.additionalProperties.toMutableMap()
            }

            /**
             * This parameter returns the distance threshold that was used to determine if the asset
             * was idle or not. The value returned for this parameter is the same as that provided
             * while creating or updating a `idle` type `monitor`.
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
             * This parameter returns the time duration for which the `monitor` tracks the distance
             * covered by an asset before triggering an idle event. The value returned for this
             * parameter is the same as that provided while creating or updating a `idle` type
             * `monitor`.
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
             */
            fun build(): IdleConfig =
                IdleConfig(distanceTolerance, timeTolerance, additionalProperties.toMutableMap())
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

    /** Use this object to update the `attributes` of the `monitor`. */
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
         * A string type dictionary object to specify the `attributes` which will be used to
         * identify the asset(s) on which the `monitor` would be applied. Please note that using
         * this parameter overwrites the existing `attributes` of the monitor.
         *
         * If the `attributes` added to a `monitor` do not match fully with the `attributes` added
         * to any `asset`, the `monitor` will be ineffective.
         *
         * Please note that the maximum number of `key`:`value` pairs that
         * 'include_all_of_attributes' can take is 100. Also, the overall size of the `match_filter`
         * object should not exceed 65kb.
         */
        @JsonProperty("include_all_of_attributes")
        @ExcludeMissing
        fun _includeAllOfAttributes(): JsonValue = includeAllOfAttributes

        /**
         * A string dictionary object to specify the `attributes`, separated by a `,`. Only the
         * `assets` with any one of the `attributes` added to this parameter will be linked to this
         * `monitor`. Once an `asset` and a `monitor` are linked, the `monitor` will be able to
         * create events for the `asset` when an activity specified in `type` is detected.
         *
         * If no input is provided for this object or if the `attributes` added here do not match at
         * least one of the `attributes` added to any `asset`, the `monitor` will be ineffective.
         *
         * Please note that the maximum number of `key`:`value` pairs that
         * `include_any_of_attributes` can take is 100. Also, the overall size of `match_filter`
         * object should not exceed 65kb.
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
             * A string type dictionary object to specify the `attributes` which will be used to
             * identify the asset(s) on which the `monitor` would be applied. Please note that using
             * this parameter overwrites the existing `attributes` of the monitor.
             *
             * If the `attributes` added to a `monitor` do not match fully with the `attributes`
             * added to any `asset`, the `monitor` will be ineffective.
             *
             * Please note that the maximum number of `key`:`value` pairs that
             * 'include_all_of_attributes' can take is 100. Also, the overall size of the
             * `match_filter` object should not exceed 65kb.
             */
            fun includeAllOfAttributes(includeAllOfAttributes: JsonValue) = apply {
                this.includeAllOfAttributes = includeAllOfAttributes
            }

            /**
             * A string dictionary object to specify the `attributes`, separated by a `,`. Only the
             * `assets` with any one of the `attributes` added to this parameter will be linked to
             * this `monitor`. Once an `asset` and a `monitor` are linked, the `monitor` will be
             * able to create events for the `asset` when an activity specified in `type` is
             * detected.
             *
             * If no input is provided for this object or if the `attributes` added here do not
             * match at least one of the `attributes` added to any `asset`, the `monitor` will be
             * ineffective.
             *
             * Please note that the maximum number of `key`:`value` pairs that
             * `include_any_of_attributes` can take is 100. Also, the overall size of `match_filter`
             * object should not exceed 65kb.
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
     * An object returning the details of the over-speeding constraints for a `speeding` type of
     * `monitor`.
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
         * This property returns the actual speed limit that the `monitor` uses as a threshold for
         * generating a speed limit event. The value returned for this parameter is the same as that
         * provided while creating or updating a `speeding` type `monitor`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerSpeedLimit(): Optional<Long> =
            customerSpeedLimit.getOptional("customer_speed_limit")

        /**
         * This property returns the time duration value, in milliseconds, for which the `monitor`
         * will track the speed of the asset. An event is triggered if the speed remains higher than
         * the specified limit for a duration more than the tolerance value.
         *
         * The value returned for this parameter is the same as that provided while creating or
         * updating a `speeding` type `monitor`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun timeTolerance(): Optional<Long> = timeTolerance.getOptional("time_tolerance")

        /**
         * A boolean value denoting if the administrative speed limit of the road was used as speed
         * limit threshold for triggering events. The value returned for this parameter is the same
         * as that provided while creating or updating a `speeding` type `monitor`.
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
             * This property returns the actual speed limit that the `monitor` uses as a threshold
             * for generating a speed limit event. The value returned for this parameter is the same
             * as that provided while creating or updating a `speeding` type `monitor`.
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
             * This property returns the time duration value, in milliseconds, for which the
             * `monitor` will track the speed of the asset. An event is triggered if the speed
             * remains higher than the specified limit for a duration more than the tolerance value.
             *
             * The value returned for this parameter is the same as that provided while creating or
             * updating a `speeding` type `monitor`.
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
             * A boolean value denoting if the administrative speed limit of the road was used as
             * speed limit threshold for triggering events. The value returned for this parameter is
             * the same as that provided while creating or updating a `speeding` type `monitor`.
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

    /**
     * Type of the `monitor`. It represents the type of `asset` activity that the `monitor` is
     * configured to detect.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Monitor && id == other.id && createdAt == other.createdAt && description == other.description && geofenceConfig == other.geofenceConfig && geofences == other.geofences && idleConfig == other.idleConfig && matchFilter == other.matchFilter && metaData == other.metaData && name == other.name && speedingConfig == other.speedingConfig && tags == other.tags && type == other.type && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, description, geofenceConfig, geofences, idleConfig, matchFilter, metaData, name, speedingConfig, tags, type, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Monitor{id=$id, createdAt=$createdAt, description=$description, geofenceConfig=$geofenceConfig, geofences=$geofences, idleConfig=$idleConfig, matchFilter=$matchFilter, metaData=$metaData, name=$name, speedingConfig=$speedingConfig, tags=$tags, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
