// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.skynet.asset.location

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.nextbillion_sdk.api.core.ExcludeMissing
import com.nextbillion_sdk.api.core.JsonField
import com.nextbillion_sdk.api.core.JsonMissing
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.checkKnown
import com.nextbillion_sdk.api.core.toImmutable
import com.nextbillion_sdk.api.errors.NextbillionSdkInvalidDataException
import com.nextbillion_sdk.api.models.skynet.monitor.Pagination
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class LocationListResponse
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
     * A string indicating the state of the response. On successful responses, the value will be
     * `Ok`. Indicative error messages are returned for different errors. See the
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

        /** Returns a mutable builder for constructing an instance of [LocationListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LocationListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(locationListResponse: LocationListResponse) = apply {
            data = locationListResponse.data
            message = locationListResponse.message
            status = locationListResponse.status
            additionalProperties = locationListResponse.additionalProperties.toMutableMap()
        }

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
         * `Ok`. Indicative error messages are returned for different errors. See the
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
         * Returns an immutable instance of [LocationListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LocationListResponse =
            LocationListResponse(data, message, status, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): LocationListResponse = apply {
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

    class Data
    private constructor(
        private val distance: JsonField<Double>,
        private val geojson: JsonField<Geojson>,
        private val geometry: JsonField<List<String>>,
        private val list: JsonField<List<TrackLocation>>,
        private val page: JsonField<Pagination>,
        private val snappedPoints: JsonField<List<SnappedPoint>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("distance")
            @ExcludeMissing
            distance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("geojson") @ExcludeMissing geojson: JsonField<Geojson> = JsonMissing.of(),
            @JsonProperty("geometry")
            @ExcludeMissing
            geometry: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("list")
            @ExcludeMissing
            list: JsonField<List<TrackLocation>> = JsonMissing.of(),
            @JsonProperty("page") @ExcludeMissing page: JsonField<Pagination> = JsonMissing.of(),
            @JsonProperty("snapped_points")
            @ExcludeMissing
            snappedPoints: JsonField<List<SnappedPoint>> = JsonMissing.of(),
        ) : this(distance, geojson, geometry, list, page, snappedPoints, mutableMapOf())

        /**
         * Distance of the path, in meters, formed by connecting all tracked locations returned.
         *
         * Please note that `distance` is returned only when the `mapmatch` property of `correction`
         * parameter is set to 1.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun distance(): Optional<Double> = distance.getOptional("distance")

        /**
         * An object with geoJSON details of the route. It is returned only when the `mapmatch`
         * property of the `correction` parameter is set to 1 and `geometry_type` is `geojson,
         * otherwise it is not present in the response. The contents of this object follow the
         * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geojson(): Optional<Geojson> = geojson.getOptional("geojson")

        /**
         * Geometry of tracked locations in the requested format. It is returned only if the
         * `mapmatch` property of the ‘correction’ parameter is set to 1.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun geometry(): Optional<List<String>> = geometry.getOptional("geometry")

        /**
         * An array of objects with details of the tracked locations of the `asset`. Each object
         * represents one tracked location.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun list(): Optional<List<TrackLocation>> = list.getOptional("list")

        /**
         * An object with pagination details of the search results. Use this object to implement
         * pagination in your application.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun page(): Optional<Pagination> = page.getOptional("page")

        /**
         * An array of objects with details about the snapped points for each of the tracked
         * locations returned for the `asset`.
         *
         * Please note that this property is returned only when the `mapmatch` property of
         * `correction` parameter is set to 1.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun snappedPoints(): Optional<List<SnappedPoint>> =
            snappedPoints.getOptional("snapped_points")

        /**
         * Returns the raw JSON value of [distance].
         *
         * Unlike [distance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Double> = distance

        /**
         * Returns the raw JSON value of [geojson].
         *
         * Unlike [geojson], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("geojson") @ExcludeMissing fun _geojson(): JsonField<Geojson> = geojson

        /**
         * Returns the raw JSON value of [geometry].
         *
         * Unlike [geometry], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("geometry")
        @ExcludeMissing
        fun _geometry(): JsonField<List<String>> = geometry

        /**
         * Returns the raw JSON value of [list].
         *
         * Unlike [list], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("list") @ExcludeMissing fun _list(): JsonField<List<TrackLocation>> = list

        /**
         * Returns the raw JSON value of [page].
         *
         * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Pagination> = page

        /**
         * Returns the raw JSON value of [snappedPoints].
         *
         * Unlike [snappedPoints], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("snapped_points")
        @ExcludeMissing
        fun _snappedPoints(): JsonField<List<SnappedPoint>> = snappedPoints

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

            private var distance: JsonField<Double> = JsonMissing.of()
            private var geojson: JsonField<Geojson> = JsonMissing.of()
            private var geometry: JsonField<MutableList<String>>? = null
            private var list: JsonField<MutableList<TrackLocation>>? = null
            private var page: JsonField<Pagination> = JsonMissing.of()
            private var snappedPoints: JsonField<MutableList<SnappedPoint>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                distance = data.distance
                geojson = data.geojson
                geometry = data.geometry.map { it.toMutableList() }
                list = data.list.map { it.toMutableList() }
                page = data.page
                snappedPoints = data.snappedPoints.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /**
             * Distance of the path, in meters, formed by connecting all tracked locations returned.
             *
             * Please note that `distance` is returned only when the `mapmatch` property of
             * `correction` parameter is set to 1.
             */
            fun distance(distance: Double) = distance(JsonField.of(distance))

            /**
             * Sets [Builder.distance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distance] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

            /**
             * An object with geoJSON details of the route. It is returned only when the `mapmatch`
             * property of the `correction` parameter is set to 1 and `geometry_type` is `geojson,
             * otherwise it is not present in the response. The contents of this object follow the
             * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
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

            /**
             * Geometry of tracked locations in the requested format. It is returned only if the
             * `mapmatch` property of the ‘correction’ parameter is set to 1.
             */
            fun geometry(geometry: List<String>) = geometry(JsonField.of(geometry))

            /**
             * Sets [Builder.geometry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geometry] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geometry(geometry: JsonField<List<String>>) = apply {
                this.geometry = geometry.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.geometry].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGeometry(geometry: String) = apply {
                this.geometry =
                    (this.geometry ?: JsonField.of(mutableListOf())).also {
                        checkKnown("geometry", it).add(geometry)
                    }
            }

            /**
             * An array of objects with details of the tracked locations of the `asset`. Each object
             * represents one tracked location.
             */
            fun list(list: List<TrackLocation>) = list(JsonField.of(list))

            /**
             * Sets [Builder.list] to an arbitrary JSON value.
             *
             * You should usually call [Builder.list] with a well-typed `List<TrackLocation>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun list(list: JsonField<List<TrackLocation>>) = apply {
                this.list = list.map { it.toMutableList() }
            }

            /**
             * Adds a single [TrackLocation] to [Builder.list].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addList(list: TrackLocation) = apply {
                this.list =
                    (this.list ?: JsonField.of(mutableListOf())).also {
                        checkKnown("list", it).add(list)
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

            /**
             * An array of objects with details about the snapped points for each of the tracked
             * locations returned for the `asset`.
             *
             * Please note that this property is returned only when the `mapmatch` property of
             * `correction` parameter is set to 1.
             */
            fun snappedPoints(snappedPoints: List<SnappedPoint>) =
                snappedPoints(JsonField.of(snappedPoints))

            /**
             * Sets [Builder.snappedPoints] to an arbitrary JSON value.
             *
             * You should usually call [Builder.snappedPoints] with a well-typed
             * `List<SnappedPoint>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun snappedPoints(snappedPoints: JsonField<List<SnappedPoint>>) = apply {
                this.snappedPoints = snappedPoints.map { it.toMutableList() }
            }

            /**
             * Adds a single [SnappedPoint] to [snappedPoints].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSnappedPoint(snappedPoint: SnappedPoint) = apply {
                snappedPoints =
                    (snappedPoints ?: JsonField.of(mutableListOf())).also {
                        checkKnown("snappedPoints", it).add(snappedPoint)
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    distance,
                    geojson,
                    (geometry ?: JsonMissing.of()).map { it.toImmutable() },
                    (list ?: JsonMissing.of()).map { it.toImmutable() },
                    page,
                    (snappedPoints ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            distance()
            geojson().ifPresent { it.validate() }
            geometry()
            list().ifPresent { it.forEach { it.validate() } }
            page().ifPresent { it.validate() }
            snappedPoints().ifPresent { it.forEach { it.validate() } }
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
                (geojson.asKnown().getOrNull()?.validity() ?: 0) +
                (geometry.asKnown().getOrNull()?.size ?: 0) +
                (list.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (page.asKnown().getOrNull()?.validity() ?: 0) +
                (snappedPoints.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /**
         * An object with geoJSON details of the route. It is returned only when the `mapmatch`
         * property of the `correction` parameter is set to 1 and `geometry_type` is `geojson,
         * otherwise it is not present in the response. The contents of this object follow the
         * [geoJSON standard](https://datatracker.ietf.org/doc/html/rfc7946).
         */
        class Geojson
        private constructor(
            private val geometry: JsonField<Geometry>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("geometry")
                @ExcludeMissing
                geometry: JsonField<Geometry> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(geometry, type, mutableMapOf())

            /**
             * An object with details of the geoJSON geometry of the route.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun geometry(): Optional<Geometry> = geometry.getOptional("geometry")

            /**
             * Type of the geoJSON object.
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
            fun _geometry(): JsonField<Geometry> = geometry

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

                private var geometry: JsonField<Geometry> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(geojson: Geojson) = apply {
                    geometry = geojson.geometry
                    type = geojson.type
                    additionalProperties = geojson.additionalProperties.toMutableMap()
                }

                /** An object with details of the geoJSON geometry of the route. */
                fun geometry(geometry: Geometry) = geometry(JsonField.of(geometry))

                /**
                 * Sets [Builder.geometry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.geometry] with a well-typed [Geometry] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun geometry(geometry: JsonField<Geometry>) = apply { this.geometry = geometry }

                /** Type of the geoJSON object. */
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
                fun build(): Geojson = Geojson(geometry, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Geojson = apply {
                if (validated) {
                    return@apply
                }

                geometry().ifPresent { it.validate() }
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
                    (if (type.asKnown().isPresent) 1 else 0)

            /** An object with details of the geoJSON geometry of the route. */
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
                 * An array of coordinates in the [longitude, latitude] format, representing the
                 * route geometry.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun coordinates(): Optional<List<Double>> = coordinates.getOptional("coordinates")

                /**
                 * Type of the geoJSON geometry.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun type(): Optional<String> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [coordinates].
                 *
                 * Unlike [coordinates], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("coordinates")
                @ExcludeMissing
                fun _coordinates(): JsonField<List<Double>> = coordinates

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * An array of coordinates in the [longitude, latitude] format, representing the
                     * route geometry.
                     */
                    fun coordinates(coordinates: List<Double>) =
                        coordinates(JsonField.of(coordinates))

                    /**
                     * Sets [Builder.coordinates] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.coordinates] with a well-typed
                     * `List<Double>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
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
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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

        class SnappedPoint
        private constructor(
            private val bearing: JsonField<String>,
            private val distance: JsonField<Double>,
            private val location: JsonField<Location>,
            private val name: JsonField<String>,
            private val originalIndex: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bearing")
                @ExcludeMissing
                bearing: JsonField<String> = JsonMissing.of(),
                @JsonProperty("distance")
                @ExcludeMissing
                distance: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("location")
                @ExcludeMissing
                location: JsonField<Location> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("originalIndex")
                @ExcludeMissing
                originalIndex: JsonField<String> = JsonMissing.of(),
            ) : this(bearing, distance, location, name, originalIndex, mutableMapOf())

            /**
             * The bearing angle of the snapped point from the original tracked location, in
             * radians. It indicates the direction of the snapped point.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun bearing(): Optional<String> = bearing.getOptional("bearing")

            /**
             * The distance of the snapped point from the original tracked location, in meters.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun distance(): Optional<Double> = distance.getOptional("distance")

            /**
             * The latitude and longitude coordinates of the snapped point.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun location(): Optional<Location> = location.getOptional("location")

            /**
             * The name of the street or road of the snapped point.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * The index of the tracked location to which this snapped point corresponds to.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun originalIndex(): Optional<String> = originalIndex.getOptional("originalIndex")

            /**
             * Returns the raw JSON value of [bearing].
             *
             * Unlike [bearing], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("bearing") @ExcludeMissing fun _bearing(): JsonField<String> = bearing

            /**
             * Returns the raw JSON value of [distance].
             *
             * Unlike [distance], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Double> = distance

            /**
             * Returns the raw JSON value of [location].
             *
             * Unlike [location], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("location")
            @ExcludeMissing
            fun _location(): JsonField<Location> = location

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [originalIndex].
             *
             * Unlike [originalIndex], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("originalIndex")
            @ExcludeMissing
            fun _originalIndex(): JsonField<String> = originalIndex

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

                /** Returns a mutable builder for constructing an instance of [SnappedPoint]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SnappedPoint]. */
            class Builder internal constructor() {

                private var bearing: JsonField<String> = JsonMissing.of()
                private var distance: JsonField<Double> = JsonMissing.of()
                private var location: JsonField<Location> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var originalIndex: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(snappedPoint: SnappedPoint) = apply {
                    bearing = snappedPoint.bearing
                    distance = snappedPoint.distance
                    location = snappedPoint.location
                    name = snappedPoint.name
                    originalIndex = snappedPoint.originalIndex
                    additionalProperties = snappedPoint.additionalProperties.toMutableMap()
                }

                /**
                 * The bearing angle of the snapped point from the original tracked location, in
                 * radians. It indicates the direction of the snapped point.
                 */
                fun bearing(bearing: String) = bearing(JsonField.of(bearing))

                /**
                 * Sets [Builder.bearing] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bearing] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bearing(bearing: JsonField<String>) = apply { this.bearing = bearing }

                /**
                 * The distance of the snapped point from the original tracked location, in meters.
                 */
                fun distance(distance: Double) = distance(JsonField.of(distance))

                /**
                 * Sets [Builder.distance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.distance] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

                /** The latitude and longitude coordinates of the snapped point. */
                fun location(location: Location) = location(JsonField.of(location))

                /**
                 * Sets [Builder.location] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.location] with a well-typed [Location] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun location(location: JsonField<Location>) = apply { this.location = location }

                /** The name of the street or road of the snapped point. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The index of the tracked location to which this snapped point corresponds to. */
                fun originalIndex(originalIndex: String) =
                    originalIndex(JsonField.of(originalIndex))

                /**
                 * Sets [Builder.originalIndex] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originalIndex] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun originalIndex(originalIndex: JsonField<String>) = apply {
                    this.originalIndex = originalIndex
                }

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
                 * Returns an immutable instance of [SnappedPoint].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): SnappedPoint =
                    SnappedPoint(
                        bearing,
                        distance,
                        location,
                        name,
                        originalIndex,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): SnappedPoint = apply {
                if (validated) {
                    return@apply
                }

                bearing()
                distance()
                location().ifPresent { it.validate() }
                name()
                originalIndex()
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
                (if (bearing.asKnown().isPresent) 1 else 0) +
                    (if (distance.asKnown().isPresent) 1 else 0) +
                    (location.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (originalIndex.asKnown().isPresent) 1 else 0)

            /** The latitude and longitude coordinates of the snapped point. */
            class Location
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
                 * Latitude of the snapped point.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun lat(): Optional<Double> = lat.getOptional("lat")

                /**
                 * Longitude of the snapped point.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
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

                    /** Returns a mutable builder for constructing an instance of [Location]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Location]. */
                class Builder internal constructor() {

                    private var lat: JsonField<Double> = JsonMissing.of()
                    private var lon: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(location: Location) = apply {
                        lat = location.lat
                        lon = location.lon
                        additionalProperties = location.additionalProperties.toMutableMap()
                    }

                    /** Latitude of the snapped point. */
                    fun lat(lat: Double) = lat(JsonField.of(lat))

                    /**
                     * Sets [Builder.lat] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lat] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

                    /** Longitude of the snapped point. */
                    fun lon(lon: Double) = lon(JsonField.of(lon))

                    /**
                     * Sets [Builder.lon] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lon] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * Returns an immutable instance of [Location].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Location = Location(lat, lon, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Location = apply {
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
                    (if (lat.asKnown().isPresent) 1 else 0) +
                        (if (lon.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Location && lat == other.lat && lon == other.lon && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(lat, lon, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Location{lat=$lat, lon=$lon, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SnappedPoint && bearing == other.bearing && distance == other.distance && location == other.location && name == other.name && originalIndex == other.originalIndex && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(bearing, distance, location, name, originalIndex, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SnappedPoint{bearing=$bearing, distance=$distance, location=$location, name=$name, originalIndex=$originalIndex, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && distance == other.distance && geojson == other.geojson && geometry == other.geometry && list == other.list && page == other.page && snappedPoints == other.snappedPoints && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(distance, geojson, geometry, list, page, snappedPoints, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{distance=$distance, geojson=$geojson, geometry=$geometry, list=$list, page=$page, snappedPoints=$snappedPoints, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LocationListResponse && data == other.data && message == other.message && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, message, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LocationListResponse{data=$data, message=$message, status=$status, additionalProperties=$additionalProperties}"
}
