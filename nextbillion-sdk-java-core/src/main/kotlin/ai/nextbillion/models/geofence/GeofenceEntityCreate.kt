// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence

import ai.nextbillion.core.Enum
import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.checkKnown
import ai.nextbillion.core.checkRequired
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

class GeofenceEntityCreate
private constructor(
    private val type: JsonField<Type>,
    private val circle: JsonField<Circle>,
    private val customId: JsonField<String>,
    private val isochrone: JsonField<Isochrone>,
    private val metaData: JsonValue,
    private val name: JsonField<String>,
    private val polygon: JsonField<Polygon>,
    private val tags: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("circle") @ExcludeMissing circle: JsonField<Circle> = JsonMissing.of(),
        @JsonProperty("custom_id") @ExcludeMissing customId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isochrone")
        @ExcludeMissing
        isochrone: JsonField<Isochrone> = JsonMissing.of(),
        @JsonProperty("meta_data") @ExcludeMissing metaData: JsonValue = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("polygon") @ExcludeMissing polygon: JsonField<Polygon> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
    ) : this(type, circle, customId, isochrone, metaData, name, polygon, tags, mutableMapOf())

    /**
     * Specify the type of the geofence that is being created.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Provide the details to create a circular geofence. Please note that this object is mandatory
     * when `type` is `circle`. When the `type` is not `circle`, the properties of this object will
     * be ignored while creating the geofence.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun circle(): Optional<Circle> = circle.getOptional("circle")

    /**
     * Set an unique ID for the new geofence. If not provided, an ID will be automatically generated
     * in UUID format. A valid `custom_id` can contain letters, numbers, "-", & "\_" only.
     *
     * Please note that the ID of a geofence can not be changed once it is created.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customId(): Optional<String> = customId.getOptional("custom_id")

    /**
     * Provide the details to create an isochrone based geofence. Use this object when `type` is
     * `isochrone`. When the `type` is not `isochrone`, the properties of this object will be
     * ignored while creating the geofence.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isochrone(): Optional<Isochrone> = isochrone.getOptional("isochrone")

    /**
     * Metadata of the geofence. Use this field to define custom attributes that provide more
     * context and information about the geofence being created like country, group ID etc.
     *
     * The data being added should be in valid JSON object format (i.e. `key` and `value` pairs).
     * Max size allowed for the object is 65kb.
     */
    @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonValue = metaData

    /**
     * Name of the geofence. Use this field to assign a meaningful, custom name to the geofence
     * being created.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Provide the details to create a custom polygon type of geofence. Please note that this object
     * is mandatory when `type` is `polygon`. When the `type` is not `polygon`, the properties of
     * this object will be ignored while creating the geofence.
     *
     * Self-intersecting polygons or polygons containing other polygons are invalid and will be
     * removed while processing the request.
     *
     * Area of the polygon should be less than 2000 km<sup>2</sup>.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun polygon(): Optional<Polygon> = polygon.getOptional("polygon")

    /**
     * An array of strings to associate multiple tags to the geofence. `tags` can be used to search
     * or filter geofences (using `Get Geofence List` method).
     *
     * Create valid `tags` using a string consisting of alphanumeric characters (A-Z, a-z, 0-9)
     * along with the underscore ('\_') and hyphen ('-') symbols.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [circle].
     *
     * Unlike [circle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("circle") @ExcludeMissing fun _circle(): JsonField<Circle> = circle

    /**
     * Returns the raw JSON value of [customId].
     *
     * Unlike [customId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_id") @ExcludeMissing fun _customId(): JsonField<String> = customId

    /**
     * Returns the raw JSON value of [isochrone].
     *
     * Unlike [isochrone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isochrone") @ExcludeMissing fun _isochrone(): JsonField<Isochrone> = isochrone

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
         * Returns a mutable builder for constructing an instance of [GeofenceEntityCreate].
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GeofenceEntityCreate]. */
    class Builder internal constructor() {

        private var type: JsonField<Type>? = null
        private var circle: JsonField<Circle> = JsonMissing.of()
        private var customId: JsonField<String> = JsonMissing.of()
        private var isochrone: JsonField<Isochrone> = JsonMissing.of()
        private var metaData: JsonValue = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var polygon: JsonField<Polygon> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(geofenceEntityCreate: GeofenceEntityCreate) = apply {
            type = geofenceEntityCreate.type
            circle = geofenceEntityCreate.circle
            customId = geofenceEntityCreate.customId
            isochrone = geofenceEntityCreate.isochrone
            metaData = geofenceEntityCreate.metaData
            name = geofenceEntityCreate.name
            polygon = geofenceEntityCreate.polygon
            tags = geofenceEntityCreate.tags.map { it.toMutableList() }
            additionalProperties = geofenceEntityCreate.additionalProperties.toMutableMap()
        }

        /** Specify the type of the geofence that is being created. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * Provide the details to create a circular geofence. Please note that this object is
         * mandatory when `type` is `circle`. When the `type` is not `circle`, the properties of
         * this object will be ignored while creating the geofence.
         */
        fun circle(circle: Circle) = circle(JsonField.of(circle))

        /**
         * Sets [Builder.circle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.circle] with a well-typed [Circle] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun circle(circle: JsonField<Circle>) = apply { this.circle = circle }

        /**
         * Set an unique ID for the new geofence. If not provided, an ID will be automatically
         * generated in UUID format. A valid `custom_id` can contain letters, numbers, "-", & "\_"
         * only.
         *
         * Please note that the ID of a geofence can not be changed once it is created.
         */
        fun customId(customId: String) = customId(JsonField.of(customId))

        /**
         * Sets [Builder.customId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun customId(customId: JsonField<String>) = apply { this.customId = customId }

        /**
         * Provide the details to create an isochrone based geofence. Use this object when `type` is
         * `isochrone`. When the `type` is not `isochrone`, the properties of this object will be
         * ignored while creating the geofence.
         */
        fun isochrone(isochrone: Isochrone) = isochrone(JsonField.of(isochrone))

        /**
         * Sets [Builder.isochrone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isochrone] with a well-typed [Isochrone] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isochrone(isochrone: JsonField<Isochrone>) = apply { this.isochrone = isochrone }

        /**
         * Metadata of the geofence. Use this field to define custom attributes that provide more
         * context and information about the geofence being created like country, group ID etc.
         *
         * The data being added should be in valid JSON object format (i.e. `key` and `value`
         * pairs). Max size allowed for the object is 65kb.
         */
        fun metaData(metaData: JsonValue) = apply { this.metaData = metaData }

        /**
         * Name of the geofence. Use this field to assign a meaningful, custom name to the geofence
         * being created.
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
         * Provide the details to create a custom polygon type of geofence. Please note that this
         * object is mandatory when `type` is `polygon`. When the `type` is not `polygon`, the
         * properties of this object will be ignored while creating the geofence.
         *
         * Self-intersecting polygons or polygons containing other polygons are invalid and will be
         * removed while processing the request.
         *
         * Area of the polygon should be less than 2000 km<sup>2</sup>.
         */
        fun polygon(polygon: Polygon) = polygon(JsonField.of(polygon))

        /**
         * Sets [Builder.polygon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polygon] with a well-typed [Polygon] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun polygon(polygon: JsonField<Polygon>) = apply { this.polygon = polygon }

        /**
         * An array of strings to associate multiple tags to the geofence. `tags` can be used to
         * search or filter geofences (using `Get Geofence List` method).
         *
         * Create valid `tags` using a string consisting of alphanumeric characters (A-Z, a-z, 0-9)
         * along with the underscore ('\_') and hyphen ('-') symbols.
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
         * Returns an immutable instance of [GeofenceEntityCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GeofenceEntityCreate =
            GeofenceEntityCreate(
                checkRequired("type", type),
                circle,
                customId,
                isochrone,
                metaData,
                name,
                polygon,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GeofenceEntityCreate = apply {
        if (validated) {
            return@apply
        }

        type().validate()
        circle().ifPresent { it.validate() }
        customId()
        isochrone().ifPresent { it.validate() }
        name()
        polygon().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (type.asKnown().getOrNull()?.validity() ?: 0) +
            (circle.asKnown().getOrNull()?.validity() ?: 0) +
            (if (customId.asKnown().isPresent) 1 else 0) +
            (isochrone.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (polygon.asKnown().getOrNull()?.validity() ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0)

    /** Specify the type of the geofence that is being created. */
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

    /**
     * Provide the details to create a circular geofence. Please note that this object is mandatory
     * when `type` is `circle`. When the `type` is not `circle`, the properties of this object will
     * be ignored while creating the geofence.
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
         * Coordinate of the location which will act as the center of a circular geofence.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun center(): Center = center.getRequired("center")

        /**
         * Radius of the circular geofence, in meters. Maximum value allowed is 50000 meters.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun radius(): Double = radius.getRequired("radius")

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
             * .radius()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Circle]. */
        class Builder internal constructor() {

            private var center: JsonField<Center>? = null
            private var radius: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(circle: Circle) = apply {
                center = circle.center
                radius = circle.radius
                additionalProperties = circle.additionalProperties.toMutableMap()
            }

            /** Coordinate of the location which will act as the center of a circular geofence. */
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
             * Radius of the circular geofence, in meters. Maximum value allowed is 50000 meters.
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
             * .radius()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Circle =
                Circle(
                    checkRequired("center", center),
                    checkRequired("radius", radius),
                    additionalProperties.toMutableMap(),
                )
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

        /** Coordinate of the location which will act as the center of a circular geofence. */
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
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lat(): Double = lat.getRequired("lat")

            /**
             * Longitude of the `center` location.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lon(): Double = lon.getRequired("lon")

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

                /**
                 * Returns a mutable builder for constructing an instance of [Center].
                 *
                 * The following fields are required:
                 * ```java
                 * .lat()
                 * .lon()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Center]. */
            class Builder internal constructor() {

                private var lat: JsonField<Double>? = null
                private var lon: JsonField<Double>? = null
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
                 *
                 * The following fields are required:
                 * ```java
                 * .lat()
                 * .lon()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Center =
                    Center(
                        checkRequired("lat", lat),
                        checkRequired("lon", lon),
                        additionalProperties.toMutableMap(),
                    )
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
     * Provide the details to create an isochrone based geofence. Use this object when `type` is
     * `isochrone`. When the `type` is not `isochrone`, the properties of this object will be
     * ignored while creating the geofence.
     */
    class Isochrone
    private constructor(
        private val coordinates: JsonField<String>,
        private val contoursMeter: JsonField<Long>,
        private val contoursMinute: JsonField<Long>,
        private val denoise: JsonField<Double>,
        private val departureTime: JsonField<Long>,
        private val mode: JsonField<Mode>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("coordinates")
            @ExcludeMissing
            coordinates: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contours_meter")
            @ExcludeMissing
            contoursMeter: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("contours_minute")
            @ExcludeMissing
            contoursMinute: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("denoise") @ExcludeMissing denoise: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("departure_time")
            @ExcludeMissing
            departureTime: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
        ) : this(
            coordinates,
            contoursMeter,
            contoursMinute,
            denoise,
            departureTime,
            mode,
            mutableMapOf(),
        )

        /**
         * Coordinates of the location, in [latitude,longitude] format, which would act as the
         * starting point for identifying the isochrone polygon or the boundary of reachable area.
         * This parameter is mandatory when `type` is `isochrone`.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun coordinates(): String = coordinates.getRequired("coordinates")

        /**
         * The distance, in meters, for which an isochrone polygon needs to be determined. When
         * provided, the API would create a geofence representing the area that can be reached after
         * driving the given number of meters starting from the point specified in `coordinates`.
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
         * The duration, in minutes, for which an isochrone polygon needs to be determined. When
         * provided, the API would create a geofence representing the area that can be reached after
         * driving for the given number of minutes starting from the point specified in
         * `coordinates`.
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
         * A floating point value from 0.0 to 1.0 that can be used to remove smaller contours. A
         * value of 1.0 will only return the largest contour for a given value. A value of 0.5 drops
         * any contours that are less than half the area of the largest contour in the set of
         * contours for that same value.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun denoise(): Optional<Double> = denoise.getOptional("denoise")

        /**
         * A UNIX epoch timestamp in seconds format that can be used to set the departure time. The
         * isochrone boundary will be determined based on the typical traffic conditions at the
         * given time. If no input is provided for this parameter then the traffic conditions at the
         * time of making the request are considered
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun departureTime(): Optional<Long> = departureTime.getOptional("departure_time")

        /**
         * Set which driving mode the service should use to determine the isochrone line.
         *
         * For example, if you use `car`, the API will return an isochrone polygon that a car can
         * cover within the specified time or after driving the specified distance. Using `truck`
         * will return an isochrone that a truck can reach after taking into account appropriate
         * truck routing restrictions.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun mode(): Optional<Mode> = mode.getOptional("mode")

        /**
         * Returns the raw JSON value of [coordinates].
         *
         * Unlike [coordinates], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("coordinates")
        @ExcludeMissing
        fun _coordinates(): JsonField<String> = coordinates

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
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

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
             * Returns a mutable builder for constructing an instance of [Isochrone].
             *
             * The following fields are required:
             * ```java
             * .coordinates()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Isochrone]. */
        class Builder internal constructor() {

            private var coordinates: JsonField<String>? = null
            private var contoursMeter: JsonField<Long> = JsonMissing.of()
            private var contoursMinute: JsonField<Long> = JsonMissing.of()
            private var denoise: JsonField<Double> = JsonMissing.of()
            private var departureTime: JsonField<Long> = JsonMissing.of()
            private var mode: JsonField<Mode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(isochrone: Isochrone) = apply {
                coordinates = isochrone.coordinates
                contoursMeter = isochrone.contoursMeter
                contoursMinute = isochrone.contoursMinute
                denoise = isochrone.denoise
                departureTime = isochrone.departureTime
                mode = isochrone.mode
                additionalProperties = isochrone.additionalProperties.toMutableMap()
            }

            /**
             * Coordinates of the location, in [latitude,longitude] format, which would act as the
             * starting point for identifying the isochrone polygon or the boundary of reachable
             * area. This parameter is mandatory when `type` is `isochrone`.
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
             * The distance, in meters, for which an isochrone polygon needs to be determined. When
             * provided, the API would create a geofence representing the area that can be reached
             * after driving the given number of meters starting from the point specified in
             * `coordinates`.
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
             * The duration, in minutes, for which an isochrone polygon needs to be determined. When
             * provided, the API would create a geofence representing the area that can be reached
             * after driving for the given number of minutes starting from the point specified in
             * `coordinates`.
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
             * A floating point value from 0.0 to 1.0 that can be used to remove smaller contours. A
             * value of 1.0 will only return the largest contour for a given value. A value of 0.5
             * drops any contours that are less than half the area of the largest contour in the set
             * of contours for that same value.
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
             * A UNIX epoch timestamp in seconds format that can be used to set the departure time.
             * The isochrone boundary will be determined based on the typical traffic conditions at
             * the given time. If no input is provided for this parameter then the traffic
             * conditions at the time of making the request are considered
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
             * Set which driving mode the service should use to determine the isochrone line.
             *
             * For example, if you use `car`, the API will return an isochrone polygon that a car
             * can cover within the specified time or after driving the specified distance. Using
             * `truck` will return an isochrone that a truck can reach after taking into account
             * appropriate truck routing restrictions.
             */
            fun mode(mode: Mode) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

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
             *
             * The following fields are required:
             * ```java
             * .coordinates()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Isochrone =
                Isochrone(
                    checkRequired("coordinates", coordinates),
                    contoursMeter,
                    contoursMinute,
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

            coordinates()
            contoursMeter()
            contoursMinute()
            denoise()
            departureTime()
            mode().ifPresent { it.validate() }
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
            (if (coordinates.asKnown().isPresent) 1 else 0) +
                (if (contoursMeter.asKnown().isPresent) 1 else 0) +
                (if (contoursMinute.asKnown().isPresent) 1 else 0) +
                (if (denoise.asKnown().isPresent) 1 else 0) +
                (if (departureTime.asKnown().isPresent) 1 else 0) +
                (mode.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Set which driving mode the service should use to determine the isochrone line.
         *
         * For example, if you use `car`, the API will return an isochrone polygon that a car can
         * cover within the specified time or after driving the specified distance. Using `truck`
         * will return an isochrone that a truck can reach after taking into account appropriate
         * truck routing restrictions.
         */
        class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CAR = of("`car`")

                @JvmField val TRUCK = of("`truck`")

                @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
            }

            /** An enum containing [Mode]'s known values. */
            enum class Known {
                CAR,
                TRUCK,
            }

            /**
             * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Mode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CAR,
                TRUCK,
                /** An enum member indicating that [Mode] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CAR -> Value.CAR
                    TRUCK -> Value.TRUCK
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws NextbillionSdkInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    CAR -> Known.CAR
                    TRUCK -> Known.TRUCK
                    else -> throw NextbillionSdkInvalidDataException("Unknown Mode: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws NextbillionSdkInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    NextbillionSdkInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Mode = apply {
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

                return /* spotless:off */ other is Mode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Isochrone && coordinates == other.coordinates && contoursMeter == other.contoursMeter && contoursMinute == other.contoursMinute && denoise == other.denoise && departureTime == other.departureTime && mode == other.mode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(coordinates, contoursMeter, contoursMinute, denoise, departureTime, mode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Isochrone{coordinates=$coordinates, contoursMeter=$contoursMeter, contoursMinute=$contoursMinute, denoise=$denoise, departureTime=$departureTime, mode=$mode, additionalProperties=$additionalProperties}"
    }

    /**
     * Provide the details to create a custom polygon type of geofence. Please note that this object
     * is mandatory when `type` is `polygon`. When the `type` is not `polygon`, the properties of
     * this object will be ignored while creating the geofence.
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
         * An object to collect geoJSON details of the geofence. The contents of this object follow
         * the [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun geojson(): Geojson = geojson.getRequired("geojson")

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

            /**
             * Returns a mutable builder for constructing an instance of [Polygon].
             *
             * The following fields are required:
             * ```java
             * .geojson()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Polygon]. */
        class Builder internal constructor() {

            private var geojson: JsonField<Geojson>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(polygon: Polygon) = apply {
                geojson = polygon.geojson
                additionalProperties = polygon.additionalProperties.toMutableMap()
            }

            /**
             * An object to collect geoJSON details of the geofence. The contents of this object
             * follow the [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
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
             *
             * The following fields are required:
             * ```java
             * .geojson()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Polygon =
                Polygon(checkRequired("geojson", geojson), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Polygon = apply {
            if (validated) {
                return@apply
            }

            geojson().validate()
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
         * An object to collect geoJSON details of the geofence. The contents of this object follow
         * the [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
         */
        class Geojson
        private constructor(
            private val coordinates: JsonField<List<List<Double>>>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("coordinates")
                @ExcludeMissing
                coordinates: JsonField<List<List<Double>>> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(coordinates, type, mutableMapOf())

            /**
             * An array of coordinates in the [longitude, latitude] format, representing the
             * geofence boundary.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun coordinates(): List<List<Double>> = coordinates.getRequired("coordinates")

            /**
             * Type of the geoJSON geometry. Should always be `Polygon`.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): String = type.getRequired("type")

            /**
             * Returns the raw JSON value of [coordinates].
             *
             * Unlike [coordinates], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("coordinates")
            @ExcludeMissing
            fun _coordinates(): JsonField<List<List<Double>>> = coordinates

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

                /**
                 * Returns a mutable builder for constructing an instance of [Geojson].
                 *
                 * The following fields are required:
                 * ```java
                 * .coordinates()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Geojson]. */
            class Builder internal constructor() {

                private var coordinates: JsonField<MutableList<List<Double>>>? = null
                private var type: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(geojson: Geojson) = apply {
                    coordinates = geojson.coordinates.map { it.toMutableList() }
                    type = geojson.type
                    additionalProperties = geojson.additionalProperties.toMutableMap()
                }

                /**
                 * An array of coordinates in the [longitude, latitude] format, representing the
                 * geofence boundary.
                 */
                fun coordinates(coordinates: List<List<Double>>) =
                    coordinates(JsonField.of(coordinates))

                /**
                 * Sets [Builder.coordinates] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.coordinates] with a well-typed
                 * `List<List<Double>>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun coordinates(coordinates: JsonField<List<List<Double>>>) = apply {
                    this.coordinates = coordinates.map { it.toMutableList() }
                }

                /**
                 * Adds a single [List<Double>] to [coordinates].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCoordinate(coordinate: List<Double>) = apply {
                    coordinates =
                        (coordinates ?: JsonField.of(mutableListOf())).also {
                            checkKnown("coordinates", it).add(coordinate)
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
                 *
                 * The following fields are required:
                 * ```java
                 * .coordinates()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Geojson =
                    Geojson(
                        checkRequired("coordinates", coordinates).map { it.toImmutable() },
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Geojson = apply {
                if (validated) {
                    return@apply
                }

                coordinates()
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
                (coordinates.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Geojson && coordinates == other.coordinates && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(coordinates, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Geojson{coordinates=$coordinates, type=$type, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GeofenceEntityCreate && type == other.type && circle == other.circle && customId == other.customId && isochrone == other.isochrone && metaData == other.metaData && name == other.name && polygon == other.polygon && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(type, circle, customId, isochrone, metaData, name, polygon, tags, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GeofenceEntityCreate{type=$type, circle=$circle, customId=$customId, isochrone=$isochrone, metaData=$metaData, name=$name, polygon=$polygon, tags=$tags, additionalProperties=$additionalProperties}"
}
