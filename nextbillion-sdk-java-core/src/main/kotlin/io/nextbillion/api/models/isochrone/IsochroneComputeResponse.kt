// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.isochrone

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class IsochroneComputeResponse
private constructor(
    private val features: JsonField<List<Feature>>,
    private val msg: JsonField<String>,
    private val status: JsonField<String>,
    private val type: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("features")
        @ExcludeMissing
        features: JsonField<List<Feature>> = JsonMissing.of(),
        @JsonProperty("msg") @ExcludeMissing msg: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
    ) : this(features, msg, status, type, mutableMapOf())

    /**
     * A [GeoJSON FeatureCollection](https://datatracker.ietf.org/doc/html/rfc7946#section-3.3)
     * object with details of the isochrone contours. Each `feature` object in this collection
     * represents an isochrone.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun features(): Optional<List<Feature>> = features.getOptional("features")

    /**
     * Displays the error message in case of a failed request or operation. Please note that this
     * parameter is not returned in the response in case of a successful request.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun msg(): Optional<String> = msg.getOptional("msg")

    /**
     * A string indicating the state of the response. On normal responses, the value will be `Ok`.
     * Indicative HTTP error codes are returned for different errors. See the
     * [API Errors Codes](#api-error-codes) section below for more information.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Type of the GeoJSON object. As prescribed in
     * [GeoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946#section-1.4), its value is
     * `FeatureCollection` as the `feature` property contains a list of geoJSON feature objects.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [features].
     *
     * Unlike [features], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("features") @ExcludeMissing fun _features(): JsonField<List<Feature>> = features

    /**
     * Returns the raw JSON value of [msg].
     *
     * Unlike [msg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msg") @ExcludeMissing fun _msg(): JsonField<String> = msg

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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

        /** Returns a mutable builder for constructing an instance of [IsochroneComputeResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IsochroneComputeResponse]. */
    class Builder internal constructor() {

        private var features: JsonField<MutableList<Feature>>? = null
        private var msg: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(isochroneComputeResponse: IsochroneComputeResponse) = apply {
            features = isochroneComputeResponse.features.map { it.toMutableList() }
            msg = isochroneComputeResponse.msg
            status = isochroneComputeResponse.status
            type = isochroneComputeResponse.type
            additionalProperties = isochroneComputeResponse.additionalProperties.toMutableMap()
        }

        /**
         * A [GeoJSON FeatureCollection](https://datatracker.ietf.org/doc/html/rfc7946#section-3.3)
         * object with details of the isochrone contours. Each `feature` object in this collection
         * represents an isochrone.
         */
        fun features(features: List<Feature>) = features(JsonField.of(features))

        /**
         * Sets [Builder.features] to an arbitrary JSON value.
         *
         * You should usually call [Builder.features] with a well-typed `List<Feature>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun features(features: JsonField<List<Feature>>) = apply {
            this.features = features.map { it.toMutableList() }
        }

        /**
         * Adds a single [Feature] to [features].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFeature(feature: Feature) = apply {
            features =
                (features ?: JsonField.of(mutableListOf())).also {
                    checkKnown("features", it).add(feature)
                }
        }

        /**
         * Displays the error message in case of a failed request or operation. Please note that
         * this parameter is not returned in the response in case of a successful request.
         */
        fun msg(msg: String) = msg(JsonField.of(msg))

        /**
         * Sets [Builder.msg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msg] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun msg(msg: JsonField<String>) = apply { this.msg = msg }

        /**
         * A string indicating the state of the response. On normal responses, the value will be
         * `Ok`. Indicative HTTP error codes are returned for different errors. See the
         * [API Errors Codes](#api-error-codes) section below for more information.
         */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /**
         * Type of the GeoJSON object. As prescribed in
         * [GeoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946#section-1.4), its value
         * is `FeatureCollection` as the `feature` property contains a list of geoJSON feature
         * objects.
         */
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
         * Returns an immutable instance of [IsochroneComputeResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): IsochroneComputeResponse =
            IsochroneComputeResponse(
                (features ?: JsonMissing.of()).map { it.toImmutable() },
                msg,
                status,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IsochroneComputeResponse = apply {
        if (validated) {
            return@apply
        }

        features().ifPresent { it.forEach { it.validate() } }
        msg()
        status()
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
        (features.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (msg.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0)

    class Feature
    private constructor(
        private val geometry: JsonField<Geometry>,
        private val properties: JsonField<Properties>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("geometry")
            @ExcludeMissing
            geometry: JsonField<Geometry> = JsonMissing.of(),
            @JsonProperty("properties")
            @ExcludeMissing
            properties: JsonField<Properties> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(geometry, properties, type, mutableMapOf())

        /**
         * A [GeoJSON geometry](https://datatracker.ietf.org/doc/html/rfc7946#page-7) object with
         * details of the contour line.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geometry(): Optional<Geometry> = geometry.getOptional("geometry")

        /**
         * An object with details of how the isochrone contour can be drawn on a map.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun properties(): Optional<Properties> = properties.getOptional("properties")

        /**
         * Type of the GeoJSON object. Its value is `Feature` as per the
         * [GeoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946#section-1.4) object.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [geometry].
         *
         * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("geometry") @ExcludeMissing fun _geometry(): JsonField<Geometry> = geometry

        /**
         * Returns the raw JSON value of [properties].
         *
         * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("properties")
        @ExcludeMissing
        fun _properties(): JsonField<Properties> = properties

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

            /** Returns a mutable builder for constructing an instance of [Feature]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Feature]. */
        class Builder internal constructor() {

            private var geometry: JsonField<Geometry> = JsonMissing.of()
            private var properties: JsonField<Properties> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(feature: Feature) = apply {
                geometry = feature.geometry
                properties = feature.properties
                type = feature.type
                additionalProperties = feature.additionalProperties.toMutableMap()
            }

            /**
             * A [GeoJSON geometry](https://datatracker.ietf.org/doc/html/rfc7946#page-7) object
             * with details of the contour line.
             */
            fun geometry(geometry: Geometry) = geometry(JsonField.of(geometry))

            /**
             * Sets [Builder.geometry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geometry] with a well-typed [Geometry] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geometry(geometry: JsonField<Geometry>) = apply { this.geometry = geometry }

            /** An object with details of how the isochrone contour can be drawn on a map. */
            fun properties(properties: Properties) = properties(JsonField.of(properties))

            /**
             * Sets [Builder.properties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.properties] with a well-typed [Properties] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun properties(properties: JsonField<Properties>) = apply {
                this.properties = properties
            }

            /**
             * Type of the GeoJSON object. Its value is `Feature` as per the
             * [GeoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946#section-1.4) object.
             */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Feature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Feature =
                Feature(geometry, properties, type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Feature = apply {
            if (validated) {
                return@apply
            }

            geometry().ifPresent { it.validate() }
            properties().ifPresent { it.validate() }
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
            (geometry.asKnown().getOrNull()?.validity() ?: 0) +
                (properties.asKnown().getOrNull()?.validity() ?: 0) +
                (if (type.asKnown().isPresent) 1 else 0)

        /**
         * A [GeoJSON geometry](https://datatracker.ietf.org/doc/html/rfc7946#page-7) object with
         * details of the contour line.
         */
        class Geometry
        private constructor(
            private val coordinates: JsonField<List<Double>>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("coordinates")
                @ExcludeMissing
                coordinates: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(coordinates, type, mutableMapOf())

            /**
             * An array of coordinate points, in [longitude,latitude] format representing the
             * isochrone contour line.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun coordinates(): Optional<List<Double>> = coordinates.getOptional("coordinates")

            /**
             * Type of the geoJSON geometry.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [coordinates].
             *
             * Unlike [coordinates], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("coordinates")
            @ExcludeMissing
            fun _coordinates(): JsonField<List<Double>> = coordinates

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

                /** Returns a mutable builder for constructing an instance of [Geometry]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Geometry]. */
            class Builder internal constructor() {

                private var coordinates: JsonField<MutableList<Double>>? = null
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(geometry: Geometry) = apply {
                    coordinates = geometry.coordinates.map { it.toMutableList() }
                    type = geometry.type
                    additionalProperties = geometry.additionalProperties.toMutableMap()
                }

                /**
                 * An array of coordinate points, in [longitude,latitude] format representing the
                 * isochrone contour line.
                 */
                fun coordinates(coordinates: List<Double>) = coordinates(JsonField.of(coordinates))

                /**
                 * Sets [Builder.coordinates] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.coordinates] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun coordinates(coordinates: JsonField<List<Double>>) = apply {
                    this.coordinates = coordinates.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [coordinates].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCoordinate(coordinate: Double) = apply {
                    coordinates =
                        (coordinates ?: JsonField.of(mutableListOf())).also {
                            checkKnown("coordinates", it).add(coordinate)
                        }
                }

                /** Type of the geoJSON geometry. */
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
                 * Returns an immutable instance of [Geometry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Geometry =
                    Geometry(
                        (coordinates ?: JsonMissing.of()).map { it.toImmutable() },
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Geometry = apply {
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
                (coordinates.asKnown().getOrNull()?.size ?: 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Geometry && coordinates == other.coordinates && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(coordinates, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Geometry{coordinates=$coordinates, type=$type, additionalProperties=$additionalProperties}"
        }

        /** An object with details of how the isochrone contour can be drawn on a map. */
        class Properties
        private constructor(
            private val color: JsonField<String>,
            private val contour: JsonField<Double>,
            private val fill: JsonField<String>,
            private val fillColor: JsonField<String>,
            private val fillOpacity: JsonField<Double>,
            private val metric: JsonField<String>,
            private val opacity: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("color") @ExcludeMissing color: JsonField<String> = JsonMissing.of(),
                @JsonProperty("contour")
                @ExcludeMissing
                contour: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("fill") @ExcludeMissing fill: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fillColor")
                @ExcludeMissing
                fillColor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fillOpacity")
                @ExcludeMissing
                fillOpacity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("metric")
                @ExcludeMissing
                metric: JsonField<String> = JsonMissing.of(),
                @JsonProperty("opacity")
                @ExcludeMissing
                opacity: JsonField<Double> = JsonMissing.of(),
            ) : this(color, contour, fill, fillColor, fillOpacity, metric, opacity, mutableMapOf())

            /**
             * The hex code of the color of the isochrone contour line
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun color(): Optional<String> = color.getOptional("color")

            /**
             * The value of the metric used in this contour. See the `metric` property to determine
             * whether this is a `time` or `distance` contour. When the `metric` is `time` this
             * value denotes the travel time in minutes and when the `metric` is `distance` this
             * value denotes the travel distance in kilometers.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun contour(): Optional<Double> = contour.getOptional("contour")

            /**
             * The hex code for the fill color of the isochrone contour line.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun fill(): Optional<String> = fill.getOptional("fill")

            /**
             * The hex code for the fill color of the isochrone contour line
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun fillColor(): Optional<String> = fillColor.getOptional("fillColor")

            /**
             * The fill opacity for the isochrone contour line. It is a float value starting from
             * 0.0 with a max value of 1.0. Higher number indicates a higher fill opacity.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun fillOpacity(): Optional<Double> = fillOpacity.getOptional("fillOpacity")

            /**
             * The metric that the contour represents - either `distance` or `time`
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metric(): Optional<String> = metric.getOptional("metric")

            /**
             * The opacity of the isochrone contour line. It is a float value starting from 0.0 with
             * a max value of 1.0. Higher number indicates a higher line opacity
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun opacity(): Optional<Double> = opacity.getOptional("opacity")

            /**
             * Returns the raw JSON value of [color].
             *
             * Unlike [color], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<String> = color

            /**
             * Returns the raw JSON value of [contour].
             *
             * Unlike [contour], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("contour") @ExcludeMissing fun _contour(): JsonField<Double> = contour

            /**
             * Returns the raw JSON value of [fill].
             *
             * Unlike [fill], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("fill") @ExcludeMissing fun _fill(): JsonField<String> = fill

            /**
             * Returns the raw JSON value of [fillColor].
             *
             * Unlike [fillColor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fillColor")
            @ExcludeMissing
            fun _fillColor(): JsonField<String> = fillColor

            /**
             * Returns the raw JSON value of [fillOpacity].
             *
             * Unlike [fillOpacity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fillOpacity")
            @ExcludeMissing
            fun _fillOpacity(): JsonField<Double> = fillOpacity

            /**
             * Returns the raw JSON value of [metric].
             *
             * Unlike [metric], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<String> = metric

            /**
             * Returns the raw JSON value of [opacity].
             *
             * Unlike [opacity], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("opacity") @ExcludeMissing fun _opacity(): JsonField<Double> = opacity

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

                /** Returns a mutable builder for constructing an instance of [Properties]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Properties]. */
            class Builder internal constructor() {

                private var color: JsonField<String> = JsonMissing.of()
                private var contour: JsonField<Double> = JsonMissing.of()
                private var fill: JsonField<String> = JsonMissing.of()
                private var fillColor: JsonField<String> = JsonMissing.of()
                private var fillOpacity: JsonField<Double> = JsonMissing.of()
                private var metric: JsonField<String> = JsonMissing.of()
                private var opacity: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(properties: Properties) = apply {
                    color = properties.color
                    contour = properties.contour
                    fill = properties.fill
                    fillColor = properties.fillColor
                    fillOpacity = properties.fillOpacity
                    metric = properties.metric
                    opacity = properties.opacity
                    additionalProperties = properties.additionalProperties.toMutableMap()
                }

                /** The hex code of the color of the isochrone contour line */
                fun color(color: String) = color(JsonField.of(color))

                /**
                 * Sets [Builder.color] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.color] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun color(color: JsonField<String>) = apply { this.color = color }

                /**
                 * The value of the metric used in this contour. See the `metric` property to
                 * determine whether this is a `time` or `distance` contour. When the `metric` is
                 * `time` this value denotes the travel time in minutes and when the `metric` is
                 * `distance` this value denotes the travel distance in kilometers.
                 */
                fun contour(contour: Double) = contour(JsonField.of(contour))

                /**
                 * Sets [Builder.contour] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contour] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contour(contour: JsonField<Double>) = apply { this.contour = contour }

                /** The hex code for the fill color of the isochrone contour line. */
                fun fill(fill: String) = fill(JsonField.of(fill))

                /**
                 * Sets [Builder.fill] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fill] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun fill(fill: JsonField<String>) = apply { this.fill = fill }

                /** The hex code for the fill color of the isochrone contour line */
                fun fillColor(fillColor: String) = fillColor(JsonField.of(fillColor))

                /**
                 * Sets [Builder.fillColor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fillColor] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fillColor(fillColor: JsonField<String>) = apply { this.fillColor = fillColor }

                /**
                 * The fill opacity for the isochrone contour line. It is a float value starting
                 * from 0.0 with a max value of 1.0. Higher number indicates a higher fill opacity.
                 */
                fun fillOpacity(fillOpacity: Double) = fillOpacity(JsonField.of(fillOpacity))

                /**
                 * Sets [Builder.fillOpacity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fillOpacity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fillOpacity(fillOpacity: JsonField<Double>) = apply {
                    this.fillOpacity = fillOpacity
                }

                /** The metric that the contour represents - either `distance` or `time` */
                fun metric(metric: String) = metric(JsonField.of(metric))

                /**
                 * Sets [Builder.metric] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metric] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metric(metric: JsonField<String>) = apply { this.metric = metric }

                /**
                 * The opacity of the isochrone contour line. It is a float value starting from 0.0
                 * with a max value of 1.0. Higher number indicates a higher line opacity
                 */
                fun opacity(opacity: Double) = opacity(JsonField.of(opacity))

                /**
                 * Sets [Builder.opacity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.opacity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun opacity(opacity: JsonField<Double>) = apply { this.opacity = opacity }

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
                 * Returns an immutable instance of [Properties].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Properties =
                    Properties(
                        color,
                        contour,
                        fill,
                        fillColor,
                        fillOpacity,
                        metric,
                        opacity,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Properties = apply {
                if (validated) {
                    return@apply
                }

                color()
                contour()
                fill()
                fillColor()
                fillOpacity()
                metric()
                opacity()
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
                (if (color.asKnown().isPresent) 1 else 0) +
                    (if (contour.asKnown().isPresent) 1 else 0) +
                    (if (fill.asKnown().isPresent) 1 else 0) +
                    (if (fillColor.asKnown().isPresent) 1 else 0) +
                    (if (fillOpacity.asKnown().isPresent) 1 else 0) +
                    (if (metric.asKnown().isPresent) 1 else 0) +
                    (if (opacity.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Properties && color == other.color && contour == other.contour && fill == other.fill && fillColor == other.fillColor && fillOpacity == other.fillOpacity && metric == other.metric && opacity == other.opacity && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(color, contour, fill, fillColor, fillOpacity, metric, opacity, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Properties{color=$color, contour=$contour, fill=$fill, fillColor=$fillColor, fillOpacity=$fillOpacity, metric=$metric, opacity=$opacity, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Feature && geometry == other.geometry && properties == other.properties && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(geometry, properties, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Feature{geometry=$geometry, properties=$properties, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IsochroneComputeResponse && features == other.features && msg == other.msg && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(features, msg, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IsochroneComputeResponse{features=$features, msg=$msg, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
