// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence

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

/** Update a Geofence */
class GeofenceUpdateParams
private constructor(
    private val id: String?,
    private val key: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** A key is a unique identifier that is required to authenticate a request to the API. */
    fun key(): String = key

    /**
     * Use this object to update details of a circular geofence. Please note that this object is
     * mandatory only when `type` is `circle`. When the `type` is not `circle`, the properties of
     * this object will be ignored while creating the geofence.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun circle(): Optional<Circle> = body.circle()

    /**
     * Use this object to update details of an isochrone based geofence. Please note that this
     * object is mandatory only when `type` is `isochrone`. When the `type` is not `isochrone`, the
     * properties of this object will be ignored while creating the geofence.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isochrone(): Optional<Isochrone> = body.isochrone()

    /**
     * Updated the `meta_data` associated with a geofence. Use this field to define custom
     * attributes that provide more context and information about the geofence being updated like
     * country, group ID etc.
     *
     * The data being added should be in valid JSON object format (i.e. `key` and `value` pairs).
     * Max size allowed for the object is 65kb.
     */
    fun _metaData(): JsonValue = body._metaData()

    /**
     * Use this parameter to update the `name` of a geofence. Users can assign meaningful custom
     * names to their geofences.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Use this object to update details of a custom polygon geofence. Please note that this object
     * is mandatory only when `type` is `polygon`. When the `type` is not `polygon`, the properties
     * of this object will be ignored while creating the geofence.
     *
     * Self-intersecting polygons or polygons containing other polygons are invalid and will be
     * removed while processing the request.
     *
     * Area of the polygon should be less than 2000 km<sup>2</sup>.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun polygon(): Optional<Polygon> = body.polygon()

    /**
     * Use this parameter to add/modify one or multiple `tags` of a geofence. `tags` can be used to
     * search or filter geofences (using `Get Geofence List` method).
     *
     * Valid values for updating `tags` consist of alphanumeric characters (A-Z, a-z, 0-9) along
     * with the underscore ('\_') and hyphen ('-') symbols.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * Use this parameter to update the `type` of a geofence. Please note that you will need to
     * provide required details for creating a geofence of the new `type`. Check other parameters of
     * this method to know more.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): Optional<Type> = body.type()

    /**
     * Returns the raw JSON value of [circle].
     *
     * Unlike [circle], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _circle(): JsonField<Circle> = body._circle()

    /**
     * Returns the raw JSON value of [isochrone].
     *
     * Unlike [isochrone], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isochrone(): JsonField<Isochrone> = body._isochrone()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [polygon].
     *
     * Unlike [polygon], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _polygon(): JsonField<Polygon> = body._polygon()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GeofenceUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GeofenceUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var key: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(geofenceUpdateParams: GeofenceUpdateParams) = apply {
            id = geofenceUpdateParams.id
            key = geofenceUpdateParams.key
            body = geofenceUpdateParams.body.toBuilder()
            additionalHeaders = geofenceUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = geofenceUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** A key is a unique identifier that is required to authenticate a request to the API. */
        fun key(key: String) = apply { this.key = key }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [circle]
         * - [isochrone]
         * - [metaData]
         * - [name]
         * - [polygon]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Use this object to update details of a circular geofence. Please note that this object is
         * mandatory only when `type` is `circle`. When the `type` is not `circle`, the properties
         * of this object will be ignored while creating the geofence.
         */
        fun circle(circle: Circle) = apply { body.circle(circle) }

        /**
         * Sets [Builder.circle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.circle] with a well-typed [Circle] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun circle(circle: JsonField<Circle>) = apply { body.circle(circle) }

        /**
         * Use this object to update details of an isochrone based geofence. Please note that this
         * object is mandatory only when `type` is `isochrone`. When the `type` is not `isochrone`,
         * the properties of this object will be ignored while creating the geofence.
         */
        fun isochrone(isochrone: Isochrone) = apply { body.isochrone(isochrone) }

        /**
         * Sets [Builder.isochrone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isochrone] with a well-typed [Isochrone] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isochrone(isochrone: JsonField<Isochrone>) = apply { body.isochrone(isochrone) }

        /**
         * Updated the `meta_data` associated with a geofence. Use this field to define custom
         * attributes that provide more context and information about the geofence being updated
         * like country, group ID etc.
         *
         * The data being added should be in valid JSON object format (i.e. `key` and `value`
         * pairs). Max size allowed for the object is 65kb.
         */
        fun metaData(metaData: JsonValue) = apply { body.metaData(metaData) }

        /**
         * Use this parameter to update the `name` of a geofence. Users can assign meaningful custom
         * names to their geofences.
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
         * Use this object to update details of a custom polygon geofence. Please note that this
         * object is mandatory only when `type` is `polygon`. When the `type` is not `polygon`, the
         * properties of this object will be ignored while creating the geofence.
         *
         * Self-intersecting polygons or polygons containing other polygons are invalid and will be
         * removed while processing the request.
         *
         * Area of the polygon should be less than 2000 km<sup>2</sup>.
         */
        fun polygon(polygon: Polygon) = apply { body.polygon(polygon) }

        /**
         * Sets [Builder.polygon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polygon] with a well-typed [Polygon] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun polygon(polygon: JsonField<Polygon>) = apply { body.polygon(polygon) }

        /**
         * Use this parameter to add/modify one or multiple `tags` of a geofence. `tags` can be used
         * to search or filter geofences (using `Get Geofence List` method).
         *
         * Valid values for updating `tags` consist of alphanumeric characters (A-Z, a-z, 0-9) along
         * with the underscore ('\_') and hyphen ('-') symbols.
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
         * Use this parameter to update the `type` of a geofence. Please note that you will need to
         * provide required details for creating a geofence of the new `type`. Check other
         * parameters of this method to know more.
         */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

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
         * Returns an immutable instance of [GeofenceUpdateParams].
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
        fun build(): GeofenceUpdateParams =
            GeofenceUpdateParams(
                id,
                checkRequired("key", key),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("key", key)
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    private constructor(
        private val circle: JsonField<Circle>,
        private val isochrone: JsonField<Isochrone>,
        private val metaData: JsonValue,
        private val name: JsonField<String>,
        private val polygon: JsonField<Polygon>,
        private val tags: JsonField<List<String>>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("circle") @ExcludeMissing circle: JsonField<Circle> = JsonMissing.of(),
            @JsonProperty("isochrone")
            @ExcludeMissing
            isochrone: JsonField<Isochrone> = JsonMissing.of(),
            @JsonProperty("meta_data") @ExcludeMissing metaData: JsonValue = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("polygon") @ExcludeMissing polygon: JsonField<Polygon> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(circle, isochrone, metaData, name, polygon, tags, type, mutableMapOf())

        /**
         * Use this object to update details of a circular geofence. Please note that this object is
         * mandatory only when `type` is `circle`. When the `type` is not `circle`, the properties
         * of this object will be ignored while creating the geofence.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun circle(): Optional<Circle> = circle.getOptional("circle")

        /**
         * Use this object to update details of an isochrone based geofence. Please note that this
         * object is mandatory only when `type` is `isochrone`. When the `type` is not `isochrone`,
         * the properties of this object will be ignored while creating the geofence.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun isochrone(): Optional<Isochrone> = isochrone.getOptional("isochrone")

        /**
         * Updated the `meta_data` associated with a geofence. Use this field to define custom
         * attributes that provide more context and information about the geofence being updated
         * like country, group ID etc.
         *
         * The data being added should be in valid JSON object format (i.e. `key` and `value`
         * pairs). Max size allowed for the object is 65kb.
         */
        @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonValue = metaData

        /**
         * Use this parameter to update the `name` of a geofence. Users can assign meaningful custom
         * names to their geofences.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Use this object to update details of a custom polygon geofence. Please note that this
         * object is mandatory only when `type` is `polygon`. When the `type` is not `polygon`, the
         * properties of this object will be ignored while creating the geofence.
         *
         * Self-intersecting polygons or polygons containing other polygons are invalid and will be
         * removed while processing the request.
         *
         * Area of the polygon should be less than 2000 km<sup>2</sup>.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun polygon(): Optional<Polygon> = polygon.getOptional("polygon")

        /**
         * Use this parameter to add/modify one or multiple `tags` of a geofence. `tags` can be used
         * to search or filter geofences (using `Get Geofence List` method).
         *
         * Valid values for updating `tags` consist of alphanumeric characters (A-Z, a-z, 0-9) along
         * with the underscore ('\_') and hyphen ('-') symbols.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * Use this parameter to update the `type` of a geofence. Please note that you will need to
         * provide required details for creating a geofence of the new `type`. Check other
         * parameters of this method to know more.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [circle].
         *
         * Unlike [circle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("circle") @ExcludeMissing fun _circle(): JsonField<Circle> = circle

        /**
         * Returns the raw JSON value of [isochrone].
         *
         * Unlike [isochrone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isochrone")
        @ExcludeMissing
        fun _isochrone(): JsonField<Isochrone> = isochrone

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [polygon].
         *
         * Unlike [polygon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("polygon") @ExcludeMissing fun _polygon(): JsonField<Polygon> = polygon

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

            private var circle: JsonField<Circle> = JsonMissing.of()
            private var isochrone: JsonField<Isochrone> = JsonMissing.of()
            private var metaData: JsonValue = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var polygon: JsonField<Polygon> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                circle = body.circle
                isochrone = body.isochrone
                metaData = body.metaData
                name = body.name
                polygon = body.polygon
                tags = body.tags.map { it.toMutableList() }
                type = body.type
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Use this object to update details of a circular geofence. Please note that this
             * object is mandatory only when `type` is `circle`. When the `type` is not `circle`,
             * the properties of this object will be ignored while creating the geofence.
             */
            fun circle(circle: Circle) = circle(JsonField.of(circle))

            /**
             * Sets [Builder.circle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.circle] with a well-typed [Circle] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun circle(circle: JsonField<Circle>) = apply { this.circle = circle }

            /**
             * Use this object to update details of an isochrone based geofence. Please note that
             * this object is mandatory only when `type` is `isochrone`. When the `type` is not
             * `isochrone`, the properties of this object will be ignored while creating the
             * geofence.
             */
            fun isochrone(isochrone: Isochrone) = isochrone(JsonField.of(isochrone))

            /**
             * Sets [Builder.isochrone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isochrone] with a well-typed [Isochrone] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isochrone(isochrone: JsonField<Isochrone>) = apply { this.isochrone = isochrone }

            /**
             * Updated the `meta_data` associated with a geofence. Use this field to define custom
             * attributes that provide more context and information about the geofence being updated
             * like country, group ID etc.
             *
             * The data being added should be in valid JSON object format (i.e. `key` and `value`
             * pairs). Max size allowed for the object is 65kb.
             */
            fun metaData(metaData: JsonValue) = apply { this.metaData = metaData }

            /**
             * Use this parameter to update the `name` of a geofence. Users can assign meaningful
             * custom names to their geofences.
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
             * Use this object to update details of a custom polygon geofence. Please note that this
             * object is mandatory only when `type` is `polygon`. When the `type` is not `polygon`,
             * the properties of this object will be ignored while creating the geofence.
             *
             * Self-intersecting polygons or polygons containing other polygons are invalid and will
             * be removed while processing the request.
             *
             * Area of the polygon should be less than 2000 km<sup>2</sup>.
             */
            fun polygon(polygon: Polygon) = polygon(JsonField.of(polygon))

            /**
             * Sets [Builder.polygon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.polygon] with a well-typed [Polygon] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun polygon(polygon: JsonField<Polygon>) = apply { this.polygon = polygon }

            /**
             * Use this parameter to add/modify one or multiple `tags` of a geofence. `tags` can be
             * used to search or filter geofences (using `Get Geofence List` method).
             *
             * Valid values for updating `tags` consist of alphanumeric characters (A-Z, a-z, 0-9)
             * along with the underscore ('\_') and hyphen ('-') symbols.
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
             * Use this parameter to update the `type` of a geofence. Please note that you will need
             * to provide required details for creating a geofence of the new `type`. Check other
             * parameters of this method to know more.
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
                    circle,
                    isochrone,
                    metaData,
                    name,
                    polygon,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            circle().ifPresent { it.validate() }
            isochrone().ifPresent { it.validate() }
            name()
            polygon().ifPresent { it.validate() }
            tags()
            type().ifPresent { it.validate() }
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
            (circle.asKnown().getOrNull()?.validity() ?: 0) +
                (isochrone.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (polygon.asKnown().getOrNull()?.validity() ?: 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && circle == other.circle && isochrone == other.isochrone && metaData == other.metaData && name == other.name && polygon == other.polygon && tags == other.tags && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(circle, isochrone, metaData, name, polygon, tags, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{circle=$circle, isochrone=$isochrone, metaData=$metaData, name=$name, polygon=$polygon, tags=$tags, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * Use this object to update details of a circular geofence. Please note that this object is
     * mandatory only when `type` is `circle`. When the `type` is not `circle`, the properties of
     * this object will be ignored while creating the geofence.
     */
    class Circle
    private constructor(
        private val center: JsonField<Center>,
        private val radius: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("center") @ExcludeMissing center: JsonField<Center> = JsonMissing.of(),
            @JsonProperty("radius") @ExcludeMissing radius: JsonField<Double> = JsonMissing.of(),
        ) : this(center, radius, mutableMapOf())

        /**
         * Use this parameter to update the coordinate of the location which will act as the center
         * of a circular geofence.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun center(): Center = center.getRequired("center")

        /**
         * Use this parameter to update the radius of the circular geofence, in meters. Maximum
         * value allowed is 50000 meters.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun radius(): Optional<Double> = radius.getOptional("radius")

        /**
         * Returns the raw JSON value of [center].
         *
         * Unlike [center], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("center") @ExcludeMissing fun _center(): JsonField<Center> = center

        /**
         * Returns the raw JSON value of [radius].
         *
         * Unlike [radius], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("radius") @ExcludeMissing fun _radius(): JsonField<Double> = radius

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
             * Returns a mutable builder for constructing an instance of [Circle].
             *
             * The following fields are required:
             * ```java
             * .center()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Circle]. */
        class Builder internal constructor() {

            private var center: JsonField<Center>? = null
            private var radius: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(circle: Circle) = apply {
                center = circle.center
                radius = circle.radius
                additionalProperties = circle.additionalProperties.toMutableMap()
            }

            /**
             * Use this parameter to update the coordinate of the location which will act as the
             * center of a circular geofence.
             */
            fun center(center: Center) = center(JsonField.of(center))

            /**
             * Sets [Builder.center] to an arbitrary JSON value.
             *
             * You should usually call [Builder.center] with a well-typed [Center] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun center(center: JsonField<Center>) = apply { this.center = center }

            /**
             * Use this parameter to update the radius of the circular geofence, in meters. Maximum
             * value allowed is 50000 meters.
             */
            fun radius(radius: Double) = radius(JsonField.of(radius))

            /**
             * Sets [Builder.radius] to an arbitrary JSON value.
             *
             * You should usually call [Builder.radius] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun radius(radius: JsonField<Double>) = apply { this.radius = radius }

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
             * Returns an immutable instance of [Circle].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .center()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Circle =
                Circle(checkRequired("center", center), radius, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Circle = apply {
            if (validated) {
                return@apply
            }

            center().validate()
            radius()
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
            (center.asKnown().getOrNull()?.validity() ?: 0) +
                (if (radius.asKnown().isPresent) 1 else 0)

        /**
         * Use this parameter to update the coordinate of the location which will act as the center
         * of a circular geofence.
         */
        class Center
        private constructor(
            private val lat: JsonField<Double>,
            private val lon: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
            ) : this(lat, lon, mutableMapOf())

            /**
             * Latitude of the `center` location.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lat(): Optional<Double> = lat.getOptional("lat")

            /**
             * Longitude of the `center` location.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun lon(): Optional<Double> = lon.getOptional("lon")

            /**
             * Returns the raw JSON value of [lat].
             *
             * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

            /**
             * Returns the raw JSON value of [lon].
             *
             * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

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

                /** Returns a mutable builder for constructing an instance of [Center]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Center]. */
            class Builder internal constructor() {

                private var lat: JsonField<Double> = JsonMissing.of()
                private var lon: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(center: Center) = apply {
                    lat = center.lat
                    lon = center.lon
                    additionalProperties = center.additionalProperties.toMutableMap()
                }

                /** Latitude of the `center` location. */
                fun lat(lat: Double) = lat(JsonField.of(lat))

                /**
                 * Sets [Builder.lat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lat] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                /** Longitude of the `center` location. */
                fun lon(lon: Double) = lon(JsonField.of(lon))

                /**
                 * Sets [Builder.lon] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lon] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

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
                 * Returns an immutable instance of [Center].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Center = Center(lat, lon, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Center = apply {
                if (validated) {
                    return@apply
                }

                lat()
                lon()
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
                (if (lat.asKnown().isPresent) 1 else 0) + (if (lon.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Center && lat == other.lat && lon == other.lon && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(lat, lon, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Center{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Circle && center == other.center && radius == other.radius && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(center, radius, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Circle{center=$center, radius=$radius, additionalProperties=$additionalProperties}"
    }

    /**
     * Use this object to update details of an isochrone based geofence. Please note that this
     * object is mandatory only when `type` is `isochrone`. When the `type` is not `isochrone`, the
     * properties of this object will be ignored while creating the geofence.
     */
    class Isochrone
    private constructor(
        private val contoursMeter: JsonField<Long>,
        private val contoursMinute: JsonField<Long>,
        private val coordinates: JsonField<String>,
        private val denoise: JsonField<Double>,
        private val departureTime: JsonField<Long>,
        private val mode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contours_meter")
            @ExcludeMissing
            contoursMeter: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("contours_minute")
            @ExcludeMissing
            contoursMinute: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("coordinates")
            @ExcludeMissing
            coordinates: JsonField<String> = JsonMissing.of(),
            @JsonProperty("denoise") @ExcludeMissing denoise: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("departure_time")
            @ExcludeMissing
            departureTime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<String> = JsonMissing.of(),
        ) : this(
            contoursMeter,
            contoursMinute,
            coordinates,
            denoise,
            departureTime,
            mode,
            mutableMapOf(),
        )

        /**
         * Use this parameter to update the distance, in meters, for which an isochrone polygon
         * needs to be determined. When provided, the API would create a geofence representing the
         * area that can be reached after driving the given number of meters starting from the point
         * specified in `coordinates`.
         *
         * The maximum distance that can be specified is 60000 meters (60km).
         *
         * At least one of `contours_meter` or `contours_minute` is mandatory when `type` is
         * `isochrone`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun contoursMeter(): Optional<Long> = contoursMeter.getOptional("contours_meter")

        /**
         * Use this parameter to update the duration, in minutes, for which an isochrone polygon
         * needs to be determined. When provided, the API would create a geofence representing the
         * area that can be reached after driving for the given number of minutes starting from the
         * point specified in `coordinates`.
         *
         * The maximum duration that can be specified is 40 minutes.
         *
         * At least one of `contours_meter` or `contours_minute` is mandatory when `type` is
         * `isochrone`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun contoursMinute(): Optional<Long> = contoursMinute.getOptional("contours_minute")

        /**
         * Use this parameter to update the coordinates of the location, in [latitude,longitude]
         * format, which would act as the starting point for identifying the isochrone polygon or
         * the boundary of reachable area.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun coordinates(): Optional<String> = coordinates.getOptional("coordinates")

        /**
         * A floating point value from 0.0 to 1.0 that can be used to remove smaller contours. A
         * value of 1.0 will only return the largest contour for a given value. A value of 0.5 drops
         * any contours that are less than half the area of the largest contour in the set of
         * contours for that same value.
         *
         * Use this parameter to update the denoise value of the isochrone geofence.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun denoise(): Optional<Double> = denoise.getOptional("denoise")

        /**
         * Use this parameter to update the `departure_time`, expressed as UNIX epoch timestamp in
         * seconds. The isochrone boundary will be determined based on the typical traffic
         * conditions at the given time.
         *
         * If no input is provided for this parameter then, the traffic conditions at the time of
         * making the request are considered by default. Please note that because of this behavior
         * the geofence boundaries may change even if the `departure_time` was not specifically
         * provided at the time of updating the geofence.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun departureTime(): Optional<Long> = departureTime.getOptional("departure_time")

        /**
         * Use this parameter to update the driving mode that the service should use to determine
         * the isochrone line. For example, if you use `car`, the API will return an isochrone
         * polygon that a car can cover within the specified time or after driving the specified
         * distance. Using `truck` will return an isochrone that a truck can reach after taking into
         * account appropriate truck routing restrictions.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun mode(): Optional<String> = mode.getOptional("mode")

        /**
         * Returns the raw JSON value of [contoursMeter].
         *
         * Unlike [contoursMeter], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contours_meter")
        @ExcludeMissing
        fun _contoursMeter(): JsonField<Long> = contoursMeter

        /**
         * Returns the raw JSON value of [contoursMinute].
         *
         * Unlike [contoursMinute], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contours_minute")
        @ExcludeMissing
        fun _contoursMinute(): JsonField<Long> = contoursMinute

        /**
         * Returns the raw JSON value of [coordinates].
         *
         * Unlike [coordinates], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("coordinates")
        @ExcludeMissing
        fun _coordinates(): JsonField<String> = coordinates

        /**
         * Returns the raw JSON value of [denoise].
         *
         * Unlike [denoise], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("denoise") @ExcludeMissing fun _denoise(): JsonField<Double> = denoise

        /**
         * Returns the raw JSON value of [departureTime].
         *
         * Unlike [departureTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("departure_time")
        @ExcludeMissing
        fun _departureTime(): JsonField<Long> = departureTime

        /**
         * Returns the raw JSON value of [mode].
         *
         * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<String> = mode

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

            /** Returns a mutable builder for constructing an instance of [Isochrone]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Isochrone]. */
        class Builder internal constructor() {

            private var contoursMeter: JsonField<Long> = JsonMissing.of()
            private var contoursMinute: JsonField<Long> = JsonMissing.of()
            private var coordinates: JsonField<String> = JsonMissing.of()
            private var denoise: JsonField<Double> = JsonMissing.of()
            private var departureTime: JsonField<Long> = JsonMissing.of()
            private var mode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(isochrone: Isochrone) = apply {
                contoursMeter = isochrone.contoursMeter
                contoursMinute = isochrone.contoursMinute
                coordinates = isochrone.coordinates
                denoise = isochrone.denoise
                departureTime = isochrone.departureTime
                mode = isochrone.mode
                additionalProperties = isochrone.additionalProperties.toMutableMap()
            }

            /**
             * Use this parameter to update the distance, in meters, for which an isochrone polygon
             * needs to be determined. When provided, the API would create a geofence representing
             * the area that can be reached after driving the given number of meters starting from
             * the point specified in `coordinates`.
             *
             * The maximum distance that can be specified is 60000 meters (60km).
             *
             * At least one of `contours_meter` or `contours_minute` is mandatory when `type` is
             * `isochrone`.
             */
            fun contoursMeter(contoursMeter: Long) = contoursMeter(JsonField.of(contoursMeter))

            /**
             * Sets [Builder.contoursMeter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contoursMeter] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contoursMeter(contoursMeter: JsonField<Long>) = apply {
                this.contoursMeter = contoursMeter
            }

            /**
             * Use this parameter to update the duration, in minutes, for which an isochrone polygon
             * needs to be determined. When provided, the API would create a geofence representing
             * the area that can be reached after driving for the given number of minutes starting
             * from the point specified in `coordinates`.
             *
             * The maximum duration that can be specified is 40 minutes.
             *
             * At least one of `contours_meter` or `contours_minute` is mandatory when `type` is
             * `isochrone`.
             */
            fun contoursMinute(contoursMinute: Long) = contoursMinute(JsonField.of(contoursMinute))

            /**
             * Sets [Builder.contoursMinute] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contoursMinute] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contoursMinute(contoursMinute: JsonField<Long>) = apply {
                this.contoursMinute = contoursMinute
            }

            /**
             * Use this parameter to update the coordinates of the location, in [latitude,longitude]
             * format, which would act as the starting point for identifying the isochrone polygon
             * or the boundary of reachable area.
             */
            fun coordinates(coordinates: String) = coordinates(JsonField.of(coordinates))

            /**
             * Sets [Builder.coordinates] to an arbitrary JSON value.
             *
             * You should usually call [Builder.coordinates] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun coordinates(coordinates: JsonField<String>) = apply {
                this.coordinates = coordinates
            }

            /**
             * A floating point value from 0.0 to 1.0 that can be used to remove smaller contours. A
             * value of 1.0 will only return the largest contour for a given value. A value of 0.5
             * drops any contours that are less than half the area of the largest contour in the set
             * of contours for that same value.
             *
             * Use this parameter to update the denoise value of the isochrone geofence.
             */
            fun denoise(denoise: Double) = denoise(JsonField.of(denoise))

            /**
             * Sets [Builder.denoise] to an arbitrary JSON value.
             *
             * You should usually call [Builder.denoise] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun denoise(denoise: JsonField<Double>) = apply { this.denoise = denoise }

            /**
             * Use this parameter to update the `departure_time`, expressed as UNIX epoch timestamp
             * in seconds. The isochrone boundary will be determined based on the typical traffic
             * conditions at the given time.
             *
             * If no input is provided for this parameter then, the traffic conditions at the time
             * of making the request are considered by default. Please note that because of this
             * behavior the geofence boundaries may change even if the `departure_time` was not
             * specifically provided at the time of updating the geofence.
             */
            fun departureTime(departureTime: Long) = departureTime(JsonField.of(departureTime))

            /**
             * Sets [Builder.departureTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.departureTime] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun departureTime(departureTime: JsonField<Long>) = apply {
                this.departureTime = departureTime
            }

            /**
             * Use this parameter to update the driving mode that the service should use to
             * determine the isochrone line. For example, if you use `car`, the API will return an
             * isochrone polygon that a car can cover within the specified time or after driving the
             * specified distance. Using `truck` will return an isochrone that a truck can reach
             * after taking into account appropriate truck routing restrictions.
             */
            fun mode(mode: String) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<String>) = apply { this.mode = mode }

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
             * Returns an immutable instance of [Isochrone].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Isochrone =
                Isochrone(
                    contoursMeter,
                    contoursMinute,
                    coordinates,
                    denoise,
                    departureTime,
                    mode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Isochrone = apply {
            if (validated) {
                return@apply
            }

            contoursMeter()
            contoursMinute()
            coordinates()
            denoise()
            departureTime()
            mode()
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
            (if (contoursMeter.asKnown().isPresent) 1 else 0) +
                (if (contoursMinute.asKnown().isPresent) 1 else 0) +
                (if (coordinates.asKnown().isPresent) 1 else 0) +
                (if (denoise.asKnown().isPresent) 1 else 0) +
                (if (departureTime.asKnown().isPresent) 1 else 0) +
                (if (mode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Isochrone && contoursMeter == other.contoursMeter && contoursMinute == other.contoursMinute && coordinates == other.coordinates && denoise == other.denoise && departureTime == other.departureTime && mode == other.mode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contoursMeter, contoursMinute, coordinates, denoise, departureTime, mode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Isochrone{contoursMeter=$contoursMeter, contoursMinute=$contoursMinute, coordinates=$coordinates, denoise=$denoise, departureTime=$departureTime, mode=$mode, additionalProperties=$additionalProperties}"
    }

    /**
     * Use this object to update details of a custom polygon geofence. Please note that this object
     * is mandatory only when `type` is `polygon`. When the `type` is not `polygon`, the properties
     * of this object will be ignored while creating the geofence.
     *
     * Self-intersecting polygons or polygons containing other polygons are invalid and will be
     * removed while processing the request.
     *
     * Area of the polygon should be less than 2000 km<sup>2</sup>.
     */
    class Polygon
    private constructor(
        private val geojson: JsonField<Geojson>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("geojson") @ExcludeMissing geojson: JsonField<Geojson> = JsonMissing.of()
        ) : this(geojson, mutableMapOf())

        /**
         * An object to collect geoJSON details of the `polygon` geofence. The contents of this
         * object follow the [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geojson(): Optional<Geojson> = geojson.getOptional("geojson")

        /**
         * Returns the raw JSON value of [geojson].
         *
         * Unlike [geojson], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("geojson") @ExcludeMissing fun _geojson(): JsonField<Geojson> = geojson

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

            /** Returns a mutable builder for constructing an instance of [Polygon]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Polygon]. */
        class Builder internal constructor() {

            private var geojson: JsonField<Geojson> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(polygon: Polygon) = apply {
                geojson = polygon.geojson
                additionalProperties = polygon.additionalProperties.toMutableMap()
            }

            /**
             * An object to collect geoJSON details of the `polygon` geofence. The contents of this
             * object follow the [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
             */
            fun geojson(geojson: Geojson) = geojson(JsonField.of(geojson))

            /**
             * Sets [Builder.geojson] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geojson] with a well-typed [Geojson] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geojson(geojson: JsonField<Geojson>) = apply { this.geojson = geojson }

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
             * Returns an immutable instance of [Polygon].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Polygon = Polygon(geojson, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Polygon = apply {
            if (validated) {
                return@apply
            }

            geojson().ifPresent { it.validate() }
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
        internal fun validity(): Int = (geojson.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * An object to collect geoJSON details of the `polygon` geofence. The contents of this
         * object follow the [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
         */
        class Geojson
        private constructor(
            private val geometry: JsonField<List<List<Double>>>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("geometry")
                @ExcludeMissing
                geometry: JsonField<List<List<Double>>> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(geometry, type, mutableMapOf())

            /**
             * An array of coordinates in the [longitude, latitude] format, representing the
             * geofence boundary.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun geometry(): Optional<List<List<Double>>> = geometry.getOptional("geometry")

            /**
             * Type of the geoJSON geometry. Should always be `Polygon`.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [geometry].
             *
             * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("geometry")
            @ExcludeMissing
            fun _geometry(): JsonField<List<List<Double>>> = geometry

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [Geojson]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Geojson]. */
            class Builder internal constructor() {

                private var geometry: JsonField<MutableList<List<Double>>>? = null
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(geojson: Geojson) = apply {
                    geometry = geojson.geometry.map { it.toMutableList() }
                    type = geojson.type
                    additionalProperties = geojson.additionalProperties.toMutableMap()
                }

                /**
                 * An array of coordinates in the [longitude, latitude] format, representing the
                 * geofence boundary.
                 */
                fun geometry(geometry: List<List<Double>>) = geometry(JsonField.of(geometry))

                /**
                 * Sets [Builder.geometry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.geometry] with a well-typed `List<List<Double>>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun geometry(geometry: JsonField<List<List<Double>>>) = apply {
                    this.geometry = geometry.map { it.toMutableList() }
                }

                /**
                 * Adds a single [List<Double>] to [Builder.geometry].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addGeometry(geometry: List<Double>) = apply {
                    this.geometry =
                        (this.geometry ?: JsonField.of(mutableListOf())).also {
                            checkKnown("geometry", it).add(geometry)
                        }
                }

                /** Type of the geoJSON geometry. Should always be `Polygon`. */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Geojson].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Geojson =
                    Geojson(
                        (geometry ?: JsonMissing.of()).map { it.toImmutable() },
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Geojson = apply {
                if (validated) {
                    return@apply
                }

                geometry()
                type()
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
                (geometry.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Geojson && geometry == other.geometry && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(geometry, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Geojson{geometry=$geometry, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Polygon && geojson == other.geojson && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(geojson, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Polygon{geojson=$geojson, additionalProperties=$additionalProperties}"
    }

    /**
     * Use this parameter to update the `type` of a geofence. Please note that you will need to
     * provide required details for creating a geofence of the new `type`. Check other parameters of
     * this method to know more.
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

            @JvmField val CIRCLE = of("`circle`")

            @JvmField val POLYGON = of("`polygon`")

            @JvmField val ISOCHRONE = of("`isochrone`")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CIRCLE,
            POLYGON,
            ISOCHRONE,
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
            CIRCLE,
            POLYGON,
            ISOCHRONE,
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
                CIRCLE -> Value.CIRCLE
                POLYGON -> Value.POLYGON
                ISOCHRONE -> Value.ISOCHRONE
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
                CIRCLE -> Known.CIRCLE
                POLYGON -> Known.POLYGON
                ISOCHRONE -> Known.ISOCHRONE
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

        return /* spotless:off */ other is GeofenceUpdateParams && id == other.id && key == other.key && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, key, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "GeofenceUpdateParams{id=$id, key=$key, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
