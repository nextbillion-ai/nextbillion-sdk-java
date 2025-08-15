// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.documenttemplates

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
 * An array of objects returning the details of data structures and validation rules and other
 * properties of all document fields. Each object represents one document field.
 */
class DocumentTemplateContentResponse
private constructor(
    private val label: JsonField<String>,
    private val meta: JsonField<Meta>,
    private val name: JsonField<String>,
    private val required: JsonField<Boolean>,
    private val type: JsonField<String>,
    private val validation: JsonField<Validation>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("required") @ExcludeMissing required: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("validation")
        @ExcludeMissing
        validation: JsonField<Validation> = JsonMissing.of(),
    ) : this(label, meta, name, required, type, validation, mutableMapOf())

    /**
     * Returns the label of the document field.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun label(): Optional<String> = label.getOptional("label")

    /**
     * Returns the options configured for single_choice or multi_choices type document items.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun meta(): Optional<Meta> = meta.getOptional("meta")

    /**
     * Returns the name of the document field.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Indicates if the document field is mandatory or not.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun required(): Optional<Boolean> = required.getOptional("required")

    /**
     * Returns the data type of the document field. It will always belong to one of string, number,
     * date_time, photos, multi_choices, signature, barcode, and single_choice.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

    /**
     * Returns the validation rules for number , multi_choices , and photos document field types.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun validation(): Optional<Validation> = validation.getOptional("validation")

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [required].
     *
     * Unlike [required], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("required") @ExcludeMissing fun _required(): JsonField<Boolean> = required

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [validation].
     *
     * Unlike [validation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("validation")
    @ExcludeMissing
    fun _validation(): JsonField<Validation> = validation

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
         * Returns a mutable builder for constructing an instance of
         * [DocumentTemplateContentResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentTemplateContentResponse]. */
    class Builder internal constructor() {

        private var label: JsonField<String> = JsonMissing.of()
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var required: JsonField<Boolean> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var validation: JsonField<Validation> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentTemplateContentResponse: DocumentTemplateContentResponse) =
            apply {
                label = documentTemplateContentResponse.label
                meta = documentTemplateContentResponse.meta
                name = documentTemplateContentResponse.name
                required = documentTemplateContentResponse.required
                type = documentTemplateContentResponse.type
                validation = documentTemplateContentResponse.validation
                additionalProperties =
                    documentTemplateContentResponse.additionalProperties.toMutableMap()
            }

        /** Returns the label of the document field. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /**
         * Returns the options configured for single_choice or multi_choices type document items.
         */
        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

        /** Returns the name of the document field. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Indicates if the document field is mandatory or not. */
        fun required(required: Boolean) = required(JsonField.of(required))

        /**
         * Sets [Builder.required] to an arbitrary JSON value.
         *
         * You should usually call [Builder.required] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun required(required: JsonField<Boolean>) = apply { this.required = required }

        /**
         * Returns the data type of the document field. It will always belong to one of string,
         * number, date_time, photos, multi_choices, signature, barcode, and single_choice.
         */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /**
         * Returns the validation rules for number , multi_choices , and photos document field
         * types.
         */
        fun validation(validation: Validation) = validation(JsonField.of(validation))

        /**
         * Sets [Builder.validation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validation] with a well-typed [Validation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun validation(validation: JsonField<Validation>) = apply { this.validation = validation }

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
         * Returns an immutable instance of [DocumentTemplateContentResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocumentTemplateContentResponse =
            DocumentTemplateContentResponse(
                label,
                meta,
                name,
                required,
                type,
                validation,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DocumentTemplateContentResponse = apply {
        if (validated) {
            return@apply
        }

        label()
        meta().ifPresent { it.validate() }
        name()
        required()
        type()
        validation().ifPresent { it.validate() }
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
        (if (label.asKnown().isPresent) 1 else 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (required.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (validation.asKnown().getOrNull()?.validity() ?: 0)

    /** Returns the options configured for single_choice or multi_choices type document items. */
    class Meta
    private constructor(
        private val options: JsonField<List<Option>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("options")
            @ExcludeMissing
            options: JsonField<List<Option>> = JsonMissing.of()
        ) : this(options, mutableMapOf())

        /**
         * An array of objects returning the options for multi_choices or single_choice type
         * document field. Each object represents one configured option.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun options(): Optional<List<Option>> = options.getOptional("options")

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<List<Option>> = options

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

            /** Returns a mutable builder for constructing an instance of [Meta]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var options: JsonField<MutableList<Option>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                options = meta.options.map { it.toMutableList() }
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            /**
             * An array of objects returning the options for multi_choices or single_choice type
             * document field. Each object represents one configured option.
             */
            fun options(options: List<Option>) = options(JsonField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed `List<Option>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<List<Option>>) = apply {
                this.options = options.map { it.toMutableList() }
            }

            /**
             * Adds a single [Option] to [options].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOption(option: Option) = apply {
                options =
                    (options ?: JsonField.of(mutableListOf())).also {
                        checkKnown("options", it).add(option)
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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Meta =
                Meta(
                    (options ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            options().ifPresent { it.forEach { it.validate() } }
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
            (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Option
        private constructor(
            private val label: JsonField<String>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(label, value, mutableMapOf())

            /**
             * Returns the label for the option.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun label(): Optional<String> = label.getOptional("label")

            /**
             * Returns the value associated with the option. This value gets submitted when the
             * option is checked in the Driver app.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun value(): Optional<String> = value.getOptional("value")

            /**
             * Returns the raw JSON value of [label].
             *
             * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

                /** Returns a mutable builder for constructing an instance of [Option]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Option]. */
            class Builder internal constructor() {

                private var label: JsonField<String> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(option: Option) = apply {
                    label = option.label
                    value = option.value
                    additionalProperties = option.additionalProperties.toMutableMap()
                }

                /** Returns the label for the option. */
                fun label(label: String) = label(JsonField.of(label))

                /**
                 * Sets [Builder.label] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.label] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun label(label: JsonField<String>) = apply { this.label = label }

                /**
                 * Returns the value associated with the option. This value gets submitted when the
                 * option is checked in the Driver app.
                 */
                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

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
                 * Returns an immutable instance of [Option].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Option = Option(label, value, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Option = apply {
                if (validated) {
                    return@apply
                }

                label()
                value()
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
                (if (label.asKnown().isPresent) 1 else 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Option &&
                    label == other.label &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(label, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Option{label=$label, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                options == other.options &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(options, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{options=$options, additionalProperties=$additionalProperties}"
    }

    /**
     * Returns the validation rules for number , multi_choices , and photos document field types.
     */
    class Validation
    private constructor(
        private val max: JsonField<Long>,
        private val maxItems: JsonField<String>,
        private val min: JsonField<Long>,
        private val minItems: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("max") @ExcludeMissing max: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("max_items")
            @ExcludeMissing
            maxItems: JsonField<String> = JsonMissing.of(),
            @JsonProperty("min") @ExcludeMissing min: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("min_items")
            @ExcludeMissing
            minItems: JsonField<String> = JsonMissing.of(),
        ) : this(max, maxItems, min, minItems, mutableMapOf())

        /**
         * Returns the maximum allowed value for number type document item, as specified at the time
         * of configuring the field. This parameter is not present in the response if it was not
         * provided in the input.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun max(): Optional<Long> = max.getOptional("max")

        /**
         * Returns the maximum number of items required for multi_choices, photos type document
         * items. This parameter will not be present in the response if it was not provided in the
         * input.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxItems(): Optional<String> = maxItems.getOptional("max_items")

        /**
         * Returns the minimum allowed value for number type document item, as specified at the time
         * of configuring the field. This parameter is not present in the response if it was not
         * provided in the input.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun min(): Optional<Long> = min.getOptional("min")

        /**
         * Returns the minimum number of items required for multi_choices, photos type document
         * items. This parameter will not be present in the response if it was not provided in the
         * input.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun minItems(): Optional<String> = minItems.getOptional("min_items")

        /**
         * Returns the raw JSON value of [max].
         *
         * Unlike [max], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max") @ExcludeMissing fun _max(): JsonField<Long> = max

        /**
         * Returns the raw JSON value of [maxItems].
         *
         * Unlike [maxItems], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_items") @ExcludeMissing fun _maxItems(): JsonField<String> = maxItems

        /**
         * Returns the raw JSON value of [min].
         *
         * Unlike [min], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("min") @ExcludeMissing fun _min(): JsonField<Long> = min

        /**
         * Returns the raw JSON value of [minItems].
         *
         * Unlike [minItems], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("min_items") @ExcludeMissing fun _minItems(): JsonField<String> = minItems

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

            /** Returns a mutable builder for constructing an instance of [Validation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Validation]. */
        class Builder internal constructor() {

            private var max: JsonField<Long> = JsonMissing.of()
            private var maxItems: JsonField<String> = JsonMissing.of()
            private var min: JsonField<Long> = JsonMissing.of()
            private var minItems: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(validation: Validation) = apply {
                max = validation.max
                maxItems = validation.maxItems
                min = validation.min
                minItems = validation.minItems
                additionalProperties = validation.additionalProperties.toMutableMap()
            }

            /**
             * Returns the maximum allowed value for number type document item, as specified at the
             * time of configuring the field. This parameter is not present in the response if it
             * was not provided in the input.
             */
            fun max(max: Long) = max(JsonField.of(max))

            /**
             * Sets [Builder.max] to an arbitrary JSON value.
             *
             * You should usually call [Builder.max] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun max(max: JsonField<Long>) = apply { this.max = max }

            /**
             * Returns the maximum number of items required for multi_choices, photos type document
             * items. This parameter will not be present in the response if it was not provided in
             * the input.
             */
            fun maxItems(maxItems: String) = maxItems(JsonField.of(maxItems))

            /**
             * Sets [Builder.maxItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxItems] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxItems(maxItems: JsonField<String>) = apply { this.maxItems = maxItems }

            /**
             * Returns the minimum allowed value for number type document item, as specified at the
             * time of configuring the field. This parameter is not present in the response if it
             * was not provided in the input.
             */
            fun min(min: Long) = min(JsonField.of(min))

            /**
             * Sets [Builder.min] to an arbitrary JSON value.
             *
             * You should usually call [Builder.min] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun min(min: JsonField<Long>) = apply { this.min = min }

            /**
             * Returns the minimum number of items required for multi_choices, photos type document
             * items. This parameter will not be present in the response if it was not provided in
             * the input.
             */
            fun minItems(minItems: String) = minItems(JsonField.of(minItems))

            /**
             * Sets [Builder.minItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minItems] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minItems(minItems: JsonField<String>) = apply { this.minItems = minItems }

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
             * Returns an immutable instance of [Validation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Validation =
                Validation(max, maxItems, min, minItems, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Validation = apply {
            if (validated) {
                return@apply
            }

            max()
            maxItems()
            min()
            minItems()
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
            (if (max.asKnown().isPresent) 1 else 0) +
                (if (maxItems.asKnown().isPresent) 1 else 0) +
                (if (min.asKnown().isPresent) 1 else 0) +
                (if (minItems.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Validation &&
                max == other.max &&
                maxItems == other.maxItems &&
                min == other.min &&
                minItems == other.minItems &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(max, maxItems, min, minItems, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Validation{max=$max, maxItems=$maxItems, min=$min, minItems=$minItems, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentTemplateContentResponse &&
            label == other.label &&
            meta == other.meta &&
            name == other.name &&
            required == other.required &&
            type == other.type &&
            validation == other.validation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(label, meta, name, required, type, validation, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocumentTemplateContentResponse{label=$label, meta=$meta, name=$name, required=$required, type=$type, validation=$validation, additionalProperties=$additionalProperties}"
}
