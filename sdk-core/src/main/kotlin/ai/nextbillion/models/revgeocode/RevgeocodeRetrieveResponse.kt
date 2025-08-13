// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.revgeocode

import ai.nextbillion.core.ExcludeMissing
import ai.nextbillion.core.JsonField
import ai.nextbillion.core.JsonMissing
import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.checkKnown
import ai.nextbillion.core.toImmutable
import ai.nextbillion.errors.NextbillionSdkInvalidDataException
import ai.nextbillion.models.geocode.Access
import ai.nextbillion.models.geocode.Address
import ai.nextbillion.models.geocode.Categories
import ai.nextbillion.models.geocode.Contacts
import ai.nextbillion.models.geocode.MapView
import ai.nextbillion.models.geocode.Position
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RevgeocodeRetrieveResponse
private constructor(
    private val items: JsonField<List<Item>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of()
    ) : this(items, mutableMapOf())

    /**
     * The results are presented as a JSON list of candidates in ranked order (most-likely to
     * least-likely) based on the matched location criteria.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun items(): Optional<List<Item>> = items.getOptional("items")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

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
         * Returns a mutable builder for constructing an instance of [RevgeocodeRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RevgeocodeRetrieveResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(revgeocodeRetrieveResponse: RevgeocodeRetrieveResponse) = apply {
            items = revgeocodeRetrieveResponse.items.map { it.toMutableList() }
            additionalProperties = revgeocodeRetrieveResponse.additionalProperties.toMutableMap()
        }

        /**
         * The results are presented as a JSON list of candidates in ranked order (most-likely to
         * least-likely) based on the matched location criteria.
         */
        fun items(items: List<Item>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
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
         * Returns an immutable instance of [RevgeocodeRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RevgeocodeRetrieveResponse =
            RevgeocodeRetrieveResponse(
                (items ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RevgeocodeRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        items().ifPresent { it.forEach { it.validate() } }
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Item
    private constructor(
        private val id: JsonField<String>,
        private val access: JsonField<Access>,
        private val address: JsonField<Address>,
        private val categories: JsonField<List<Categories>>,
        private val contacts: JsonField<List<Contacts>>,
        private val distance: JsonField<Long>,
        private val mapView: JsonField<MapView>,
        private val openingHours: JsonField<OpeningHours>,
        private val position: JsonField<Position>,
        private val scoring: JsonField<Scoring>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("access") @ExcludeMissing access: JsonField<Access> = JsonMissing.of(),
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("categories")
            @ExcludeMissing
            categories: JsonField<List<Categories>> = JsonMissing.of(),
            @JsonProperty("contacts")
            @ExcludeMissing
            contacts: JsonField<List<Contacts>> = JsonMissing.of(),
            @JsonProperty("distance") @ExcludeMissing distance: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("mapView") @ExcludeMissing mapView: JsonField<MapView> = JsonMissing.of(),
            @JsonProperty("openingHours")
            @ExcludeMissing
            openingHours: JsonField<OpeningHours> = JsonMissing.of(),
            @JsonProperty("position")
            @ExcludeMissing
            position: JsonField<Position> = JsonMissing.of(),
            @JsonProperty("scoring") @ExcludeMissing scoring: JsonField<Scoring> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            access,
            address,
            categories,
            contacts,
            distance,
            mapView,
            openingHours,
            position,
            scoring,
            title,
            mutableMapOf(),
        )

        /**
         * The unique identifier for the result item.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * An array returning the location coordinates of all the access points of the search
         * result.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun access(): Optional<Access> = access.getOptional("access")

        /**
         * Postal address of the result item.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun address(): Optional<Address> = address.getOptional("address")

        /**
         * The list of categories assigned to this place.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun categories(): Optional<List<Categories>> = categories.getOptional("categories")

        /**
         * Contact information like phone, email or website.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun contacts(): Optional<List<Contacts>> = contacts.getOptional("contacts")

        /**
         * The distance "as the crow flies" from the search center to this result item in meters.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun distance(): Optional<Long> = distance.getOptional("distance")

        /**
         * The bounding box enclosing the geometric shape (area or line) that an individual result
         * covers. place typed results have no mapView.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun mapView(): Optional<MapView> = mapView.getOptional("mapView")

        /**
         * Returns the operating hours of the place, if available.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun openingHours(): Optional<OpeningHours> = openingHours.getOptional("openingHours")

        /**
         * Returns the location coordinates of the result.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun position(): Optional<Position> = position.getOptional("position")

        /**
         * Score of the result. A higher score indicates a closer match.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun scoring(): Optional<Scoring> = scoring.getOptional("scoring")

        /**
         * The localized display name of this result item.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [access].
         *
         * Unlike [access], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("access") @ExcludeMissing fun _access(): JsonField<Access> = access

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [categories].
         *
         * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("categories")
        @ExcludeMissing
        fun _categories(): JsonField<List<Categories>> = categories

        /**
         * Returns the raw JSON value of [contacts].
         *
         * Unlike [contacts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contacts")
        @ExcludeMissing
        fun _contacts(): JsonField<List<Contacts>> = contacts

        /**
         * Returns the raw JSON value of [distance].
         *
         * Unlike [distance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Long> = distance

        /**
         * Returns the raw JSON value of [mapView].
         *
         * Unlike [mapView], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mapView") @ExcludeMissing fun _mapView(): JsonField<MapView> = mapView

        /**
         * Returns the raw JSON value of [openingHours].
         *
         * Unlike [openingHours], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("openingHours")
        @ExcludeMissing
        fun _openingHours(): JsonField<OpeningHours> = openingHours

        /**
         * Returns the raw JSON value of [position].
         *
         * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("position") @ExcludeMissing fun _position(): JsonField<Position> = position

        /**
         * Returns the raw JSON value of [scoring].
         *
         * Unlike [scoring], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scoring") @ExcludeMissing fun _scoring(): JsonField<Scoring> = scoring

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

            /** Returns a mutable builder for constructing an instance of [Item]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var access: JsonField<Access> = JsonMissing.of()
            private var address: JsonField<Address> = JsonMissing.of()
            private var categories: JsonField<MutableList<Categories>>? = null
            private var contacts: JsonField<MutableList<Contacts>>? = null
            private var distance: JsonField<Long> = JsonMissing.of()
            private var mapView: JsonField<MapView> = JsonMissing.of()
            private var openingHours: JsonField<OpeningHours> = JsonMissing.of()
            private var position: JsonField<Position> = JsonMissing.of()
            private var scoring: JsonField<Scoring> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                id = item.id
                access = item.access
                address = item.address
                categories = item.categories.map { it.toMutableList() }
                contacts = item.contacts.map { it.toMutableList() }
                distance = item.distance
                mapView = item.mapView
                openingHours = item.openingHours
                position = item.position
                scoring = item.scoring
                title = item.title
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** The unique identifier for the result item. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * An array returning the location coordinates of all the access points of the search
             * result.
             */
            fun access(access: Access) = access(JsonField.of(access))

            /**
             * Sets [Builder.access] to an arbitrary JSON value.
             *
             * You should usually call [Builder.access] with a well-typed [Access] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun access(access: JsonField<Access>) = apply { this.access = access }

            /** Postal address of the result item. */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The list of categories assigned to this place. */
            fun categories(categories: List<Categories>) = categories(JsonField.of(categories))

            /**
             * Sets [Builder.categories] to an arbitrary JSON value.
             *
             * You should usually call [Builder.categories] with a well-typed `List<Categories>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun categories(categories: JsonField<List<Categories>>) = apply {
                this.categories = categories.map { it.toMutableList() }
            }

            /**
             * Adds a single [Categories] to [categories].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCategory(category: Categories) = apply {
                categories =
                    (categories ?: JsonField.of(mutableListOf())).also {
                        checkKnown("categories", it).add(category)
                    }
            }

            /** Contact information like phone, email or website. */
            fun contacts(contacts: List<Contacts>) = contacts(JsonField.of(contacts))

            /**
             * Sets [Builder.contacts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contacts] with a well-typed `List<Contacts>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contacts(contacts: JsonField<List<Contacts>>) = apply {
                this.contacts = contacts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Contacts] to [contacts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContact(contact: Contacts) = apply {
                contacts =
                    (contacts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contacts", it).add(contact)
                    }
            }

            /**
             * The distance "as the crow flies" from the search center to this result item in
             * meters.
             */
            fun distance(distance: Long) = distance(JsonField.of(distance))

            /**
             * Sets [Builder.distance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distance] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distance(distance: JsonField<Long>) = apply { this.distance = distance }

            /**
             * The bounding box enclosing the geometric shape (area or line) that an individual
             * result covers. place typed results have no mapView.
             */
            fun mapView(mapView: MapView) = mapView(JsonField.of(mapView))

            /**
             * Sets [Builder.mapView] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mapView] with a well-typed [MapView] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mapView(mapView: JsonField<MapView>) = apply { this.mapView = mapView }

            /** Returns the operating hours of the place, if available. */
            fun openingHours(openingHours: OpeningHours) = openingHours(JsonField.of(openingHours))

            /**
             * Sets [Builder.openingHours] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openingHours] with a well-typed [OpeningHours] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun openingHours(openingHours: JsonField<OpeningHours>) = apply {
                this.openingHours = openingHours
            }

            /** Returns the location coordinates of the result. */
            fun position(position: Position) = position(JsonField.of(position))

            /**
             * Sets [Builder.position] to an arbitrary JSON value.
             *
             * You should usually call [Builder.position] with a well-typed [Position] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun position(position: JsonField<Position>) = apply { this.position = position }

            /** Score of the result. A higher score indicates a closer match. */
            fun scoring(scoring: Scoring) = scoring(JsonField.of(scoring))

            /**
             * Sets [Builder.scoring] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scoring] with a well-typed [Scoring] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scoring(scoring: JsonField<Scoring>) = apply { this.scoring = scoring }

            /** The localized display name of this result item. */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * Returns an immutable instance of [Item].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Item =
                Item(
                    id,
                    access,
                    address,
                    (categories ?: JsonMissing.of()).map { it.toImmutable() },
                    (contacts ?: JsonMissing.of()).map { it.toImmutable() },
                    distance,
                    mapView,
                    openingHours,
                    position,
                    scoring,
                    title,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            id()
            access().ifPresent { it.validate() }
            address().ifPresent { it.validate() }
            categories().ifPresent { it.forEach { it.validate() } }
            contacts().ifPresent { it.forEach { it.validate() } }
            distance()
            mapView().ifPresent { it.validate() }
            openingHours().ifPresent { it.validate() }
            position().ifPresent { it.validate() }
            scoring().ifPresent { it.validate() }
            title()
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
                (access.asKnown().getOrNull()?.validity() ?: 0) +
                (address.asKnown().getOrNull()?.validity() ?: 0) +
                (categories.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (contacts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (distance.asKnown().isPresent) 1 else 0) +
                (mapView.asKnown().getOrNull()?.validity() ?: 0) +
                (openingHours.asKnown().getOrNull()?.validity() ?: 0) +
                (position.asKnown().getOrNull()?.validity() ?: 0) +
                (scoring.asKnown().getOrNull()?.validity() ?: 0) +
                (if (title.asKnown().isPresent) 1 else 0)

        /** Returns the operating hours of the place, if available. */
        class OpeningHours
        private constructor(
            private val timeRanges: JsonField<List<TimeRange>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("timeRanges")
                @ExcludeMissing
                timeRanges: JsonField<List<TimeRange>> = JsonMissing.of()
            ) : this(timeRanges, mutableMapOf())

            /**
             * A collection of attributes with details about the opening and closing hours for each
             * day of the week.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun timeRanges(): Optional<List<TimeRange>> = timeRanges.getOptional("timeRanges")

            /**
             * Returns the raw JSON value of [timeRanges].
             *
             * Unlike [timeRanges], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timeRanges")
            @ExcludeMissing
            fun _timeRanges(): JsonField<List<TimeRange>> = timeRanges

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

                /** Returns a mutable builder for constructing an instance of [OpeningHours]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OpeningHours]. */
            class Builder internal constructor() {

                private var timeRanges: JsonField<MutableList<TimeRange>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(openingHours: OpeningHours) = apply {
                    timeRanges = openingHours.timeRanges.map { it.toMutableList() }
                    additionalProperties = openingHours.additionalProperties.toMutableMap()
                }

                /**
                 * A collection of attributes with details about the opening and closing hours for
                 * each day of the week.
                 */
                fun timeRanges(timeRanges: List<TimeRange>) = timeRanges(JsonField.of(timeRanges))

                /**
                 * Sets [Builder.timeRanges] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeRanges] with a well-typed `List<TimeRange>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timeRanges(timeRanges: JsonField<List<TimeRange>>) = apply {
                    this.timeRanges = timeRanges.map { it.toMutableList() }
                }

                /**
                 * Adds a single [TimeRange] to [timeRanges].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTimeRange(timeRange: TimeRange) = apply {
                    timeRanges =
                        (timeRanges ?: JsonField.of(mutableListOf())).also {
                            checkKnown("timeRanges", it).add(timeRange)
                        }
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
                 * Returns an immutable instance of [OpeningHours].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): OpeningHours =
                    OpeningHours(
                        (timeRanges ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OpeningHours = apply {
                if (validated) {
                    return@apply
                }

                timeRanges().ifPresent { it.forEach { it.validate() } }
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
                (timeRanges.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class TimeRange
            private constructor(
                private val endTime: JsonField<EndTime>,
                private val startTime: JsonField<StartTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("endTime")
                    @ExcludeMissing
                    endTime: JsonField<EndTime> = JsonMissing.of(),
                    @JsonProperty("startTime")
                    @ExcludeMissing
                    startTime: JsonField<StartTime> = JsonMissing.of(),
                ) : this(endTime, startTime, mutableMapOf())

                /**
                 * Returns the closing time details.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun endTime(): Optional<EndTime> = endTime.getOptional("endTime")

                /**
                 * Returns the open time details.
                 *
                 * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun startTime(): Optional<StartTime> = startTime.getOptional("startTime")

                /**
                 * Returns the raw JSON value of [endTime].
                 *
                 * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("endTime")
                @ExcludeMissing
                fun _endTime(): JsonField<EndTime> = endTime

                /**
                 * Returns the raw JSON value of [startTime].
                 *
                 * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("startTime")
                @ExcludeMissing
                fun _startTime(): JsonField<StartTime> = startTime

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

                    /** Returns a mutable builder for constructing an instance of [TimeRange]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TimeRange]. */
                class Builder internal constructor() {

                    private var endTime: JsonField<EndTime> = JsonMissing.of()
                    private var startTime: JsonField<StartTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(timeRange: TimeRange) = apply {
                        endTime = timeRange.endTime
                        startTime = timeRange.startTime
                        additionalProperties = timeRange.additionalProperties.toMutableMap()
                    }

                    /** Returns the closing time details. */
                    fun endTime(endTime: EndTime) = endTime(JsonField.of(endTime))

                    /**
                     * Sets [Builder.endTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endTime] with a well-typed [EndTime] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun endTime(endTime: JsonField<EndTime>) = apply { this.endTime = endTime }

                    /** Returns the open time details. */
                    fun startTime(startTime: StartTime) = startTime(JsonField.of(startTime))

                    /**
                     * Sets [Builder.startTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startTime] with a well-typed [StartTime]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun startTime(startTime: JsonField<StartTime>) = apply {
                        this.startTime = startTime
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
                     * Returns an immutable instance of [TimeRange].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): TimeRange =
                        TimeRange(endTime, startTime, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): TimeRange = apply {
                    if (validated) {
                        return@apply
                    }

                    endTime().ifPresent { it.validate() }
                    startTime().ifPresent { it.validate() }
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
                    (endTime.asKnown().getOrNull()?.validity() ?: 0) +
                        (startTime.asKnown().getOrNull()?.validity() ?: 0)

                /** Returns the closing time details. */
                class EndTime
                private constructor(
                    private val date: JsonField<String>,
                    private val hour: JsonField<Long>,
                    private val minute: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("date")
                        @ExcludeMissing
                        date: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("hour")
                        @ExcludeMissing
                        hour: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("minute")
                        @ExcludeMissing
                        minute: JsonField<Long> = JsonMissing.of(),
                    ) : this(date, hour, minute, mutableMapOf())

                    /**
                     * The date to which the subsequent closing time details belong to.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun date(): Optional<String> = date.getOptional("date")

                    /**
                     * The hour of the day when the place closes.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun hour(): Optional<Long> = hour.getOptional("hour")

                    /**
                     * The minute of the hour when the place closes.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun minute(): Optional<Long> = minute.getOptional("minute")

                    /**
                     * Returns the raw JSON value of [date].
                     *
                     * Unlike [date], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<String> = date

                    /**
                     * Returns the raw JSON value of [hour].
                     *
                     * Unlike [hour], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("hour") @ExcludeMissing fun _hour(): JsonField<Long> = hour

                    /**
                     * Returns the raw JSON value of [minute].
                     *
                     * Unlike [minute], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("minute") @ExcludeMissing fun _minute(): JsonField<Long> = minute

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

                        /** Returns a mutable builder for constructing an instance of [EndTime]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [EndTime]. */
                    class Builder internal constructor() {

                        private var date: JsonField<String> = JsonMissing.of()
                        private var hour: JsonField<Long> = JsonMissing.of()
                        private var minute: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(endTime: EndTime) = apply {
                            date = endTime.date
                            hour = endTime.hour
                            minute = endTime.minute
                            additionalProperties = endTime.additionalProperties.toMutableMap()
                        }

                        /** The date to which the subsequent closing time details belong to. */
                        fun date(date: String) = date(JsonField.of(date))

                        /**
                         * Sets [Builder.date] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.date] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun date(date: JsonField<String>) = apply { this.date = date }

                        /** The hour of the day when the place closes. */
                        fun hour(hour: Long) = hour(JsonField.of(hour))

                        /**
                         * Sets [Builder.hour] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.hour] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun hour(hour: JsonField<Long>) = apply { this.hour = hour }

                        /** The minute of the hour when the place closes. */
                        fun minute(minute: Long) = minute(JsonField.of(minute))

                        /**
                         * Sets [Builder.minute] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.minute] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun minute(minute: JsonField<Long>) = apply { this.minute = minute }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [EndTime].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): EndTime =
                            EndTime(date, hour, minute, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): EndTime = apply {
                        if (validated) {
                            return@apply
                        }

                        date()
                        hour()
                        minute()
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
                        (if (date.asKnown().isPresent) 1 else 0) +
                            (if (hour.asKnown().isPresent) 1 else 0) +
                            (if (minute.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is EndTime &&
                            date == other.date &&
                            hour == other.hour &&
                            minute == other.minute &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(date, hour, minute, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "EndTime{date=$date, hour=$hour, minute=$minute, additionalProperties=$additionalProperties}"
                }

                /** Returns the open time details. */
                class StartTime
                private constructor(
                    private val date: JsonField<String>,
                    private val hour: JsonField<Long>,
                    private val minute: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("date")
                        @ExcludeMissing
                        date: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("hour")
                        @ExcludeMissing
                        hour: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("minute")
                        @ExcludeMissing
                        minute: JsonField<Long> = JsonMissing.of(),
                    ) : this(date, hour, minute, mutableMapOf())

                    /**
                     * The date to which the subsequent open time details belong to.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun date(): Optional<String> = date.getOptional("date")

                    /**
                     * The hour of the day when the place opens.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun hour(): Optional<Long> = hour.getOptional("hour")

                    /**
                     * The minute of the hour when the place opens.
                     *
                     * @throws NextbillionSdkInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun minute(): Optional<Long> = minute.getOptional("minute")

                    /**
                     * Returns the raw JSON value of [date].
                     *
                     * Unlike [date], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<String> = date

                    /**
                     * Returns the raw JSON value of [hour].
                     *
                     * Unlike [hour], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("hour") @ExcludeMissing fun _hour(): JsonField<Long> = hour

                    /**
                     * Returns the raw JSON value of [minute].
                     *
                     * Unlike [minute], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("minute") @ExcludeMissing fun _minute(): JsonField<Long> = minute

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
                         * Returns a mutable builder for constructing an instance of [StartTime].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [StartTime]. */
                    class Builder internal constructor() {

                        private var date: JsonField<String> = JsonMissing.of()
                        private var hour: JsonField<Long> = JsonMissing.of()
                        private var minute: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(startTime: StartTime) = apply {
                            date = startTime.date
                            hour = startTime.hour
                            minute = startTime.minute
                            additionalProperties = startTime.additionalProperties.toMutableMap()
                        }

                        /** The date to which the subsequent open time details belong to. */
                        fun date(date: String) = date(JsonField.of(date))

                        /**
                         * Sets [Builder.date] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.date] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun date(date: JsonField<String>) = apply { this.date = date }

                        /** The hour of the day when the place opens. */
                        fun hour(hour: Long) = hour(JsonField.of(hour))

                        /**
                         * Sets [Builder.hour] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.hour] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun hour(hour: JsonField<Long>) = apply { this.hour = hour }

                        /** The minute of the hour when the place opens. */
                        fun minute(minute: Long) = minute(JsonField.of(minute))

                        /**
                         * Sets [Builder.minute] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.minute] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun minute(minute: JsonField<Long>) = apply { this.minute = minute }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [StartTime].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): StartTime =
                            StartTime(date, hour, minute, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): StartTime = apply {
                        if (validated) {
                            return@apply
                        }

                        date()
                        hour()
                        minute()
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
                        (if (date.asKnown().isPresent) 1 else 0) +
                            (if (hour.asKnown().isPresent) 1 else 0) +
                            (if (minute.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is StartTime &&
                            date == other.date &&
                            hour == other.hour &&
                            minute == other.minute &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(date, hour, minute, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "StartTime{date=$date, hour=$hour, minute=$minute, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TimeRange &&
                        endTime == other.endTime &&
                        startTime == other.startTime &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(endTime, startTime, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TimeRange{endTime=$endTime, startTime=$startTime, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OpeningHours &&
                    timeRanges == other.timeRanges &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(timeRanges, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OpeningHours{timeRanges=$timeRanges, additionalProperties=$additionalProperties}"
        }

        /** Score of the result. A higher score indicates a closer match. */
        class Scoring
        private constructor(
            private val fieldScore: JsonValue,
            private val queryScore: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("fieldScore")
                @ExcludeMissing
                fieldScore: JsonValue = JsonMissing.of(),
                @JsonProperty("queryScore")
                @ExcludeMissing
                queryScore: JsonField<Double> = JsonMissing.of(),
            ) : this(fieldScore, queryScore, mutableMapOf())

            /**
             * A breakdown of how closely individual field of the result matched with the provided
             * query q.
             */
            @JsonProperty("fieldScore") @ExcludeMissing fun _fieldScore(): JsonValue = fieldScore

            /**
             * A score, out of 1, indicating how closely the result matches with the provided query
             * q .
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun queryScore(): Optional<Double> = queryScore.getOptional("queryScore")

            /**
             * Returns the raw JSON value of [queryScore].
             *
             * Unlike [queryScore], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("queryScore")
            @ExcludeMissing
            fun _queryScore(): JsonField<Double> = queryScore

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

                /** Returns a mutable builder for constructing an instance of [Scoring]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Scoring]. */
            class Builder internal constructor() {

                private var fieldScore: JsonValue = JsonMissing.of()
                private var queryScore: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(scoring: Scoring) = apply {
                    fieldScore = scoring.fieldScore
                    queryScore = scoring.queryScore
                    additionalProperties = scoring.additionalProperties.toMutableMap()
                }

                /**
                 * A breakdown of how closely individual field of the result matched with the
                 * provided query q.
                 */
                fun fieldScore(fieldScore: JsonValue) = apply { this.fieldScore = fieldScore }

                /**
                 * A score, out of 1, indicating how closely the result matches with the provided
                 * query q .
                 */
                fun queryScore(queryScore: Double) = queryScore(JsonField.of(queryScore))

                /**
                 * Sets [Builder.queryScore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.queryScore] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun queryScore(queryScore: JsonField<Double>) = apply {
                    this.queryScore = queryScore
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
                 * Returns an immutable instance of [Scoring].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Scoring =
                    Scoring(fieldScore, queryScore, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Scoring = apply {
                if (validated) {
                    return@apply
                }

                queryScore()
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
            internal fun validity(): Int = (if (queryScore.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Scoring &&
                    fieldScore == other.fieldScore &&
                    queryScore == other.queryScore &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(fieldScore, queryScore, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Scoring{fieldScore=$fieldScore, queryScore=$queryScore, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                id == other.id &&
                access == other.access &&
                address == other.address &&
                categories == other.categories &&
                contacts == other.contacts &&
                distance == other.distance &&
                mapView == other.mapView &&
                openingHours == other.openingHours &&
                position == other.position &&
                scoring == other.scoring &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                access,
                address,
                categories,
                contacts,
                distance,
                mapView,
                openingHours,
                position,
                scoring,
                title,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{id=$id, access=$access, address=$address, categories=$categories, contacts=$contacts, distance=$distance, mapView=$mapView, openingHours=$openingHours, position=$position, scoring=$scoring, title=$title, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RevgeocodeRetrieveResponse &&
            items == other.items &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RevgeocodeRetrieveResponse{items=$items, additionalProperties=$additionalProperties}"
}
