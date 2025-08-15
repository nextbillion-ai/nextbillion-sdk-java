// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geofence.console

import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.checkKnown
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

/**
 * An object with geoJSON details of the geofence. The contents of this object follow the
 * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
 */
class PolygonGeojson
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
     * An array of coordinates in the [longitude, latitude] format, representing the geofence
     * boundary.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun coordinates(): Optional<List<List<Double>>> = coordinates.getOptional("coordinates")

    /**
     * Type of the geoJSON geometry. Will always be Polygon.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [coordinates].
     *
     * Unlike [coordinates], this method doesn't throw if the JSON field has an unexpected type.
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

        /** Returns a mutable builder for constructing an instance of [PolygonGeojson]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PolygonGeojson]. */
    class Builder internal constructor() {

        private var coordinates: JsonField<MutableList<List<Double>>>? = null
        private var type: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(polygonGeojson: PolygonGeojson) = apply {
            coordinates = polygonGeojson.coordinates.map { it.toMutableList() }
            type = polygonGeojson.type
            additionalProperties = polygonGeojson.additionalProperties.toMutableMap()
        }

        /**
         * An array of coordinates in the [longitude, latitude] format, representing the geofence
         * boundary.
         */
        fun coordinates(coordinates: List<List<Double>>) = coordinates(JsonField.of(coordinates))

        /**
         * Sets [Builder.coordinates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coordinates] with a well-typed `List<List<Double>>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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

        /** Type of the geoJSON geometry. Will always be Polygon. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Returns an immutable instance of [PolygonGeojson].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PolygonGeojson =
            PolygonGeojson(
                (coordinates ?: JsonMissing.of()).map { it.toImmutable() },
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PolygonGeojson = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

        return other is PolygonGeojson &&
            coordinates == other.coordinates &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(coordinates, type, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PolygonGeojson{coordinates=$coordinates, type=$type, additionalProperties=$additionalProperties}"
}
