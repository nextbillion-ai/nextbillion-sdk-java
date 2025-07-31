// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geocode

import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * The bounding box enclosing the geometric shape (area or line) that an individual result covers.
 * place typed results have no mapView.
 */
class MapView
private constructor(
    private val east: JsonField<String>,
    private val north: JsonField<String>,
    private val south: JsonField<String>,
    private val west: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("east") @ExcludeMissing east: JsonField<String> = JsonMissing.of(),
        @JsonProperty("north") @ExcludeMissing north: JsonField<String> = JsonMissing.of(),
        @JsonProperty("south") @ExcludeMissing south: JsonField<String> = JsonMissing.of(),
        @JsonProperty("west") @ExcludeMissing west: JsonField<String> = JsonMissing.of(),
    ) : this(east, north, south, west, mutableMapOf())

    /**
     * Longitude of the eastern-side of the box.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun east(): Optional<String> = east.getOptional("east")

    /**
     * Longitude of the northern-side of the box.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun north(): Optional<String> = north.getOptional("north")

    /**
     * Longitude of the southern-side of the box.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun south(): Optional<String> = south.getOptional("south")

    /**
     * Longitude of the western-side of the box.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun west(): Optional<String> = west.getOptional("west")

    /**
     * Returns the raw JSON value of [east].
     *
     * Unlike [east], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("east") @ExcludeMissing fun _east(): JsonField<String> = east

    /**
     * Returns the raw JSON value of [north].
     *
     * Unlike [north], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("north") @ExcludeMissing fun _north(): JsonField<String> = north

    /**
     * Returns the raw JSON value of [south].
     *
     * Unlike [south], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("south") @ExcludeMissing fun _south(): JsonField<String> = south

    /**
     * Returns the raw JSON value of [west].
     *
     * Unlike [west], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("west") @ExcludeMissing fun _west(): JsonField<String> = west

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

        /** Returns a mutable builder for constructing an instance of [MapView]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MapView]. */
    class Builder internal constructor() {

        private var east: JsonField<String> = JsonMissing.of()
        private var north: JsonField<String> = JsonMissing.of()
        private var south: JsonField<String> = JsonMissing.of()
        private var west: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mapView: MapView) = apply {
            east = mapView.east
            north = mapView.north
            south = mapView.south
            west = mapView.west
            additionalProperties = mapView.additionalProperties.toMutableMap()
        }

        /** Longitude of the eastern-side of the box. */
        fun east(east: String) = east(JsonField.of(east))

        /**
         * Sets [Builder.east] to an arbitrary JSON value.
         *
         * You should usually call [Builder.east] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun east(east: JsonField<String>) = apply { this.east = east }

        /** Longitude of the northern-side of the box. */
        fun north(north: String) = north(JsonField.of(north))

        /**
         * Sets [Builder.north] to an arbitrary JSON value.
         *
         * You should usually call [Builder.north] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun north(north: JsonField<String>) = apply { this.north = north }

        /** Longitude of the southern-side of the box. */
        fun south(south: String) = south(JsonField.of(south))

        /**
         * Sets [Builder.south] to an arbitrary JSON value.
         *
         * You should usually call [Builder.south] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun south(south: JsonField<String>) = apply { this.south = south }

        /** Longitude of the western-side of the box. */
        fun west(west: String) = west(JsonField.of(west))

        /**
         * Sets [Builder.west] to an arbitrary JSON value.
         *
         * You should usually call [Builder.west] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun west(west: JsonField<String>) = apply { this.west = west }

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
         * Returns an immutable instance of [MapView].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MapView =
            MapView(east, north, south, west, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): MapView = apply {
        if (validated) {
            return@apply
        }

        east()
        north()
        south()
        west()
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
        (if (east.asKnown().isPresent) 1 else 0) +
            (if (north.asKnown().isPresent) 1 else 0) +
            (if (south.asKnown().isPresent) 1 else 0) +
            (if (west.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MapView && east == other.east && north == other.north && south == other.south && west == other.west && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(east, north, south, west, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MapView{east=$east, north=$north, south=$south, west=$west, additionalProperties=$additionalProperties}"
}
