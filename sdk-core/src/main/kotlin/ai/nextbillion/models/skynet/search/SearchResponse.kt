// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.search

import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.checkKnown
import ai.nextbillion.core.toImmutable
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import ai.nextbillion.models.skynet.asset.MetaData
import ai.nextbillion.models.skynet.asset.location.TrackLocation
import ai.nextbillion.models.skynet.monitor.Pagination
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SearchResponse
private constructor(
    private val data: JsonField<Data>,
    private val message: JsonField<String>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(data, message, status, mutableMapOf())

    /**
     * A data object containing the search result.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Displays the error message in case of a failed request. If the request is successful, this
     * field is not present in the response.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * A string indicating the state of the response. On successful responses, the value will be Ok.
     * Indicative error messages are returned for different errors. See the
     * [API Error Codes](#api-error-codes) section below for more information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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

        /** Returns a mutable builder for constructing an instance of [SearchResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SearchResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(searchResponse: SearchResponse) = apply {
            data = searchResponse.data
            message = searchResponse.message
            status = searchResponse.status
            additionalProperties = searchResponse.additionalProperties.toMutableMap()
        }

        /** A data object containing the search result. */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /**
         * Displays the error message in case of a failed request. If the request is successful,
         * this field is not present in the response.
         */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /**
         * A string indicating the state of the response. On successful responses, the value will be
         * Ok. Indicative error messages are returned for different errors. See the
         * [API Error Codes](#api-error-codes) section below for more information.
         */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

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
         * Returns an immutable instance of [SearchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SearchResponse =
            SearchResponse(data, message, status, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): SearchResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
        message()
        status()
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
        (data.asKnown().getOrNull()?.validity() ?: 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    /** A data object containing the search result. */
    class Data
    private constructor(
        private val assets: JsonField<List<Asset>>,
        private val page: JsonField<Pagination>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("assets")
            @ExcludeMissing
            assets: JsonField<List<Asset>> = JsonMissing.of(),
            @JsonProperty("page") @ExcludeMissing page: JsonField<Pagination> = JsonMissing.of(),
        ) : this(assets, page, mutableMapOf())

        /**
         * An array of objects with details of the asset(s) returned in the search result. Each
         * object represents one asset
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun assets(): Optional<List<Asset>> = assets.getOptional("assets")

        /**
         * An object with pagination details of the search results. Use this object to implement
         * pagination in your application.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun page(): Optional<Pagination> = page.getOptional("page")

        /**
         * Returns the raw JSON value of [assets].
         *
         * Unlike [assets], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assets") @ExcludeMissing fun _assets(): JsonField<List<Asset>> = assets

        /**
         * Returns the raw JSON value of [page].
         *
         * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Pagination> = page

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var assets: JsonField<MutableList<Asset>>? = null
            private var page: JsonField<Pagination> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                assets = data.assets.map { it.toMutableList() }
                page = data.page
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * An array of objects with details of the asset(s) returned in the search result. Each
             * object represents one asset
             */
            fun assets(assets: List<Asset>) = assets(JsonField.of(assets))

            /**
             * Sets [Builder.assets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assets] with a well-typed `List<Asset>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assets(assets: JsonField<List<Asset>>) = apply {
                this.assets = assets.map { it.toMutableList() }
            }

            /**
             * Adds a single [Asset] to [assets].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAsset(asset: Asset) = apply {
                assets =
                    (assets ?: JsonField.of(mutableListOf())).also {
                        checkKnown("assets", it).add(asset)
                    }
            }

            /**
             * An object with pagination details of the search results. Use this object to implement
             * pagination in your application.
             */
            fun page(page: Pagination) = page(JsonField.of(page))

            /**
             * Sets [Builder.page] to an arbitrary JSON value.
             *
             * You should usually call [Builder.page] with a well-typed [Pagination] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun page(page: JsonField<Pagination>) = apply { this.page = page }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    (assets ?: JsonMissing.of()).map { it.toImmutable() },
                    page,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            assets().ifPresent { it.forEach { it.validate() } }
            page().ifPresent { it.validate() }
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
            (assets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (page.asKnown().getOrNull()?.validity() ?: 0)

        class Asset
        private constructor(
            private val id: JsonField<String>,
            private val createdAt: JsonField<Long>,
            private val description: JsonField<String>,
            private val latestLocation: JsonField<TrackLocation>,
            private val metaData: JsonField<MetaData>,
            private val name: JsonField<String>,
            private val rankingInfo: JsonField<RankingInfo>,
            private val tags: JsonField<List<String>>,
            private val trackedAt: JsonField<Long>,
            private val updatedAt: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("latest_location")
                @ExcludeMissing
                latestLocation: JsonField<TrackLocation> = JsonMissing.of(),
                @JsonProperty("meta_data")
                @ExcludeMissing
                metaData: JsonField<MetaData> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ranking_info")
                @ExcludeMissing
                rankingInfo: JsonField<RankingInfo> = JsonMissing.of(),
                @JsonProperty("tags")
                @ExcludeMissing
                tags: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("tracked_at")
                @ExcludeMissing
                trackedAt: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<Long> = JsonMissing.of(),
            ) : this(
                id,
                createdAt,
                description,
                latestLocation,
                metaData,
                name,
                rankingInfo,
                tags,
                trackedAt,
                updatedAt,
                mutableMapOf(),
            )

            /**
             * ID of asset which was last located inside the specified area in the input request.
             * This is the same ID that was generated/provided at the time of creating the asset.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * A UNIX timestamp in seconds representing the time at which the asset was created.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun createdAt(): Optional<Long> = createdAt.getOptional("created_at")

            /**
             * Description of the asset. The value would be the same as that provided for the
             * description parameter at the time of creating or updating the asset.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * An object with details of the tracked location. Please note that if there are no
             * tracking records for an asset, no location data will be returned.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun latestLocation(): Optional<TrackLocation> =
                latestLocation.getOptional("latest_location")

            /**
             * Any valid json object data. Can be used to save customized data. Max size is 65kb.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metaData(): Optional<MetaData> = metaData.getOptional("meta_data")

            /**
             * Name of asset. The value would be the same as that provided for the name parameter at
             * the time of creating or updating the asset.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * An object returning the sorting details of the asset as per the configuration
             * specified in the input.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun rankingInfo(): Optional<RankingInfo> = rankingInfo.getOptional("ranking_info")

            /**
             * **This parameter will be deprecated soon! Please move existing tags to attributes
             * parameter.**
             *
             * Tags associated with the asset.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun tags(): Optional<List<String>> = tags.getOptional("tags")

            /**
             * A UNIX epoch timestamp in seconds representing the last time when the asset was
             * tracked.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun trackedAt(): Optional<Long> = trackedAt.getOptional("tracked_at")

            /**
             * A UNIX timestamp in seconds representing the time at which the asset was last
             * updated.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
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
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<Long> = createdAt

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [latestLocation].
             *
             * Unlike [latestLocation], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("latest_location")
            @ExcludeMissing
            fun _latestLocation(): JsonField<TrackLocation> = latestLocation

            /**
             * Returns the raw JSON value of [metaData].
             *
             * Unlike [metaData], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("meta_data")
            @ExcludeMissing
            fun _metaData(): JsonField<MetaData> = metaData

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [rankingInfo].
             *
             * Unlike [rankingInfo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ranking_info")
            @ExcludeMissing
            fun _rankingInfo(): JsonField<RankingInfo> = rankingInfo

            /**
             * Returns the raw JSON value of [tags].
             *
             * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

            /**
             * Returns the raw JSON value of [trackedAt].
             *
             * Unlike [trackedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tracked_at")
            @ExcludeMissing
            fun _trackedAt(): JsonField<Long> = trackedAt

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<Long> = updatedAt

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

                /** Returns a mutable builder for constructing an instance of [Asset]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Asset]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var createdAt: JsonField<Long> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var latestLocation: JsonField<TrackLocation> = JsonMissing.of()
                private var metaData: JsonField<MetaData> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var rankingInfo: JsonField<RankingInfo> = JsonMissing.of()
                private var tags: JsonField<MutableList<String>>? = null
                private var trackedAt: JsonField<Long> = JsonMissing.of()
                private var updatedAt: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(asset: Asset) = apply {
                    id = asset.id
                    createdAt = asset.createdAt
                    description = asset.description
                    latestLocation = asset.latestLocation
                    metaData = asset.metaData
                    name = asset.name
                    rankingInfo = asset.rankingInfo
                    tags = asset.tags.map { it.toMutableList() }
                    trackedAt = asset.trackedAt
                    updatedAt = asset.updatedAt
                    additionalProperties = asset.additionalProperties.toMutableMap()
                }

                /**
                 * ID of asset which was last located inside the specified area in the input
                 * request. This is the same ID that was generated/provided at the time of creating
                 * the asset.
                 */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * A UNIX timestamp in seconds representing the time at which the asset was created.
                 */
                fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

                /**
                 * Description of the asset. The value would be the same as that provided for the
                 * description parameter at the time of creating or updating the asset.
                 */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * An object with details of the tracked location. Please note that if there are no
                 * tracking records for an asset, no location data will be returned.
                 */
                fun latestLocation(latestLocation: TrackLocation) =
                    latestLocation(JsonField.of(latestLocation))

                /**
                 * Sets [Builder.latestLocation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latestLocation] with a well-typed
                 * [TrackLocation] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun latestLocation(latestLocation: JsonField<TrackLocation>) = apply {
                    this.latestLocation = latestLocation
                }

                /**
                 * Any valid json object data. Can be used to save customized data. Max size is
                 * 65kb.
                 */
                fun metaData(metaData: MetaData) = metaData(JsonField.of(metaData))

                /**
                 * Sets [Builder.metaData] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metaData] with a well-typed [MetaData] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metaData(metaData: JsonField<MetaData>) = apply { this.metaData = metaData }

                /**
                 * Name of asset. The value would be the same as that provided for the name
                 * parameter at the time of creating or updating the asset.
                 */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * An object returning the sorting details of the asset as per the configuration
                 * specified in the input.
                 */
                fun rankingInfo(rankingInfo: RankingInfo) = rankingInfo(JsonField.of(rankingInfo))

                /**
                 * Sets [Builder.rankingInfo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rankingInfo] with a well-typed [RankingInfo]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun rankingInfo(rankingInfo: JsonField<RankingInfo>) = apply {
                    this.rankingInfo = rankingInfo
                }

                /**
                 * **This parameter will be deprecated soon! Please move existing tags to attributes
                 * parameter.**
                 *
                 * Tags associated with the asset.
                 */
                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                        (tags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tags", it).add(tag)
                        }
                }

                /**
                 * A UNIX epoch timestamp in seconds representing the last time when the asset was
                 * tracked.
                 */
                fun trackedAt(trackedAt: Long) = trackedAt(JsonField.of(trackedAt))

                /**
                 * Sets [Builder.trackedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.trackedAt] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun trackedAt(trackedAt: JsonField<Long>) = apply { this.trackedAt = trackedAt }

                /**
                 * A UNIX timestamp in seconds representing the time at which the asset was last
                 * updated.
                 */
                fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Asset].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Asset =
                    Asset(
                        id,
                        createdAt,
                        description,
                        latestLocation,
                        metaData,
                        name,
                        rankingInfo,
                        (tags ?: JsonMissing.of()).map { it.toImmutable() },
                        trackedAt,
                        updatedAt,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Asset = apply {
                if (validated) {
                    return@apply
                }

                id()
                createdAt()
                description()
                latestLocation().ifPresent { it.validate() }
                name()
                rankingInfo().ifPresent { it.validate() }
                tags()
                trackedAt()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (latestLocation.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (rankingInfo.asKnown().getOrNull()?.validity() ?: 0) +
                    (tags.asKnown().getOrNull()?.size ?: 0) +
                    (if (trackedAt.asKnown().isPresent) 1 else 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0)

            /**
             * An object returning the sorting details of the asset as per the configuration
             * specified in the input.
             */
            class RankingInfo
            private constructor(
                private val distance: JsonField<Double>,
                private val duration: JsonField<Double>,
                private val index: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("distance")
                    @ExcludeMissing
                    distance: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("duration")
                    @ExcludeMissing
                    duration: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
                ) : this(distance, duration, index, mutableMapOf())

                /**
                 * Driving distance between the asset and the sort_destination.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun distance(): Optional<Double> = distance.getOptional("distance")

                /**
                 * Driving duration between the asset and the sort_destination. Please note this
                 * field in not returned in the response when sort_by = straight_distance .
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun duration(): Optional<Double> = duration.getOptional("duration")

                /**
                 * Index of the ranked asset. The index value starts from 0.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun index(): Optional<Long> = index.getOptional("index")

                /**
                 * Returns the raw JSON value of [distance].
                 *
                 * Unlike [distance], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("distance")
                @ExcludeMissing
                fun _distance(): JsonField<Double> = distance

                /**
                 * Returns the raw JSON value of [duration].
                 *
                 * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("duration")
                @ExcludeMissing
                fun _duration(): JsonField<Double> = duration

                /**
                 * Returns the raw JSON value of [index].
                 *
                 * Unlike [index], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

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

                    /** Returns a mutable builder for constructing an instance of [RankingInfo]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RankingInfo]. */
                class Builder internal constructor() {

                    private var distance: JsonField<Double> = JsonMissing.of()
                    private var duration: JsonField<Double> = JsonMissing.of()
                    private var index: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(rankingInfo: RankingInfo) = apply {
                        distance = rankingInfo.distance
                        duration = rankingInfo.duration
                        index = rankingInfo.index
                        additionalProperties = rankingInfo.additionalProperties.toMutableMap()
                    }

                    /** Driving distance between the asset and the sort_destination. */
                    fun distance(distance: Double) = distance(JsonField.of(distance))

                    /**
                     * Sets [Builder.distance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.distance] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

                    /**
                     * Driving duration between the asset and the sort_destination. Please note this
                     * field in not returned in the response when sort_by = straight_distance .
                     */
                    fun duration(duration: Double) = duration(JsonField.of(duration))

                    /**
                     * Sets [Builder.duration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.duration] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

                    /** Index of the ranked asset. The index value starts from 0. */
                    fun index(index: Long) = index(JsonField.of(index))

                    /**
                     * Sets [Builder.index] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.index] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun index(index: JsonField<Long>) = apply { this.index = index }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [RankingInfo].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): RankingInfo =
                        RankingInfo(distance, duration, index, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): RankingInfo = apply {
                    if (validated) {
                        return@apply
                    }

                    distance()
                    duration()
                    index()
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
                    (if (distance.asKnown().isPresent) 1 else 0) +
                        (if (duration.asKnown().isPresent) 1 else 0) +
                        (if (index.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RankingInfo &&
                        distance == other.distance &&
                        duration == other.duration &&
                        index == other.index &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(distance, duration, index, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RankingInfo{distance=$distance, duration=$duration, index=$index, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Asset &&
                    id == other.id &&
                    createdAt == other.createdAt &&
                    description == other.description &&
                    latestLocation == other.latestLocation &&
                    metaData == other.metaData &&
                    name == other.name &&
                    rankingInfo == other.rankingInfo &&
                    tags == other.tags &&
                    trackedAt == other.trackedAt &&
                    updatedAt == other.updatedAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    createdAt,
                    description,
                    latestLocation,
                    metaData,
                    name,
                    rankingInfo,
                    tags,
                    trackedAt,
                    updatedAt,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Asset{id=$id, createdAt=$createdAt, description=$description, latestLocation=$latestLocation, metaData=$metaData, name=$name, rankingInfo=$rankingInfo, tags=$tags, trackedAt=$trackedAt, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                assets == other.assets &&
                page == other.page &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(assets, page, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{assets=$assets, page=$page, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SearchResponse &&
            data == other.data &&
            message == other.message &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, message, status, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SearchResponse{data=$data, message=$message, status=$status, additionalProperties=$additionalProperties}"
}
