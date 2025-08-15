// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.fleetify.documenttemplates

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

/**
 * An object to collect the details of form fields - data structures, validation rules - for
 * collecting required information after successfully executing a route step.
 */
class DocumentTemplateContentRequest
private constructor(
    private val label: JsonField<String>,
    private val type: JsonField<Type>,
    private val meta: JsonField<Meta>,
    private val name: JsonField<String>,
    private val required: JsonField<Boolean>,
    private val validation: JsonField<Validation>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("required") @ExcludeMissing required: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("validation")
        @ExcludeMissing
        validation: JsonField<Validation> = JsonMissing.of(),
    ) : this(label, type, meta, name, required, validation, mutableMapOf())

    /**
     * Specify the label or the name of the field. The label specified here can be used as field
     * name when rendering the document in the Driver app.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * Specify the data type of the field. It corresponds to the type of information that the driver
     * needs to collect.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * An object to define additional information required for single_choice or multi_choices type
     * document items.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun meta(): Optional<Meta> = meta.getOptional("meta")

    /**
     * Specify the name of the document field. A field'sname can be used for internal references to
     * the document field.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Specify if it is mandatory to fill the field. Default value is false.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun required(): Optional<Boolean> = required.getOptional("required")

    /**
     * Specify the validation rules for the field. This can be used to enforce data quality and
     * integrity checks. For example, if the field is a number type, validation can define
     * constraints like minimum / maximum number values.
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
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * [DocumentTemplateContentRequest].
         *
         * The following fields are required:
         * ```java
         * .label()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentTemplateContentRequest]. */
    class Builder internal constructor() {

        private var label: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var required: JsonField<Boolean> = JsonMissing.of()
        private var validation: JsonField<Validation> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentTemplateContentRequest: DocumentTemplateContentRequest) = apply {
            label = documentTemplateContentRequest.label
            type = documentTemplateContentRequest.type
            meta = documentTemplateContentRequest.meta
            name = documentTemplateContentRequest.name
            required = documentTemplateContentRequest.required
            validation = documentTemplateContentRequest.validation
            additionalProperties =
                documentTemplateContentRequest.additionalProperties.toMutableMap()
        }

        /**
         * Specify the label or the name of the field. The label specified here can be used as field
         * name when rendering the document in the Driver app.
         */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /**
         * Specify the data type of the field. It corresponds to the type of information that the
         * driver needs to collect.
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
         * An object to define additional information required for single_choice or multi_choices
         * type document items.
         */
        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

        /**
         * Specify the name of the document field. A field'sname can be used for internal references
         * to the document field.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Specify if it is mandatory to fill the field. Default value is false. */
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
         * Specify the validation rules for the field. This can be used to enforce data quality and
         * integrity checks. For example, if the field is a number type, validation can define
         * constraints like minimum / maximum number values.
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
         * Returns an immutable instance of [DocumentTemplateContentRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .label()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentTemplateContentRequest =
            DocumentTemplateContentRequest(
                checkRequired("label", label),
                checkRequired("type", type),
                meta,
                name,
                required,
                validation,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DocumentTemplateContentRequest = apply {
        if (validated) {
            return@apply
        }

        label()
        type().validate()
        meta().ifPresent { it.validate() }
        name()
        required()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (required.asKnown().isPresent) 1 else 0) +
            (validation.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Specify the data type of the field. It corresponds to the type of information that the driver
     * needs to collect.
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

            @JvmField val STRING = of("string")

            @JvmField val NUMBER = of("number")

            @JvmField val DATE_TIME = of("date_time")

            @JvmField val PHOTOS = of("photos")

            @JvmField val MULTI_CHOICES = of("multi_choices")

            @JvmField val SIGNATURE = of("signature")

            @JvmField val BARCODE = of("barcode")

            @JvmField val SINGLE_CHOICE = of("single_choice")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            STRING,
            NUMBER,
            DATE_TIME,
            PHOTOS,
            MULTI_CHOICES,
            SIGNATURE,
            BARCODE,
            SINGLE_CHOICE,
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
            STRING,
            NUMBER,
            DATE_TIME,
            PHOTOS,
            MULTI_CHOICES,
            SIGNATURE,
            BARCODE,
            SINGLE_CHOICE,
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
                STRING -> Value.STRING
                NUMBER -> Value.NUMBER
                DATE_TIME -> Value.DATE_TIME
                PHOTOS -> Value.PHOTOS
                MULTI_CHOICES -> Value.MULTI_CHOICES
                SIGNATURE -> Value.SIGNATURE
                BARCODE -> Value.BARCODE
                SINGLE_CHOICE -> Value.SINGLE_CHOICE
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
                STRING -> Known.STRING
                NUMBER -> Known.NUMBER
                DATE_TIME -> Known.DATE_TIME
                PHOTOS -> Known.PHOTOS
                MULTI_CHOICES -> Known.MULTI_CHOICES
                SIGNATURE -> Known.SIGNATURE
                BARCODE -> Known.BARCODE
                SINGLE_CHOICE -> Known.SINGLE_CHOICE
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * An object to define additional information required for single_choice or multi_choices type
     * document items.
     */
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
         * An array of objects to define options for a multi_choices or single_choice type document
         * field. Each object represents one option.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun options(): List<Option> = options.getRequired("options")

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

            /**
             * Returns a mutable builder for constructing an instance of [Meta].
             *
             * The following fields are required:
             * ```java
             * .options()
             * ```
             */
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
             * An array of objects to define options for a multi_choices or single_choice type
             * document field. Each object represents one option.
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
             *
             * The following fields are required:
             * ```java
             * .options()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Meta =
                Meta(
                    checkRequired("options", options).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            options().forEach { it.validate() }
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
             * Specify the label or name for the option.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun label(): String = label.getRequired("label")

            /**
             * Specify the value associated with the option. This value will be submitted when the
             * option is checked in the Driver app.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): String = value.getRequired("value")

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

                /**
                 * Returns a mutable builder for constructing an instance of [Option].
                 *
                 * The following fields are required:
                 * ```java
                 * .label()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Option]. */
            class Builder internal constructor() {

                private var label: JsonField<String>? = null
                private var value: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(option: Option) = apply {
                    label = option.label
                    value = option.value
                    additionalProperties = option.additionalProperties.toMutableMap()
                }

                /** Specify the label or name for the option. */
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
                 * Specify the value associated with the option. This value will be submitted when
                 * the option is checked in the Driver app.
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
                 *
                 * The following fields are required:
                 * ```java
                 * .label()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Option =
                    Option(
                        checkRequired("label", label),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
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
     * Specify the validation rules for the field. This can be used to enforce data quality and
     * integrity checks. For example, if the field is a number type, validation can define
     * constraints like minimum / maximum number values.
     */
    class Validation
    private constructor(
        private val max: JsonField<Long>,
        private val maxItems: JsonField<Long>,
        private val min: JsonField<Long>,
        private val minItems: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("max") @ExcludeMissing max: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("max_items") @ExcludeMissing maxItems: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("min") @ExcludeMissing min: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("min_items") @ExcludeMissing minItems: JsonField<Long> = JsonMissing.of(),
        ) : this(max, maxItems, min, minItems, mutableMapOf())

        /**
         * Specifies the maximum allowed value for number type document field. Input values must be
         * less than or equal to this threshold.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun max(): Optional<Long> = max.getOptional("max")

        /**
         * Specifies the maximum number of items for multi_choices, photos type document fields. The
         * number of provided input items must be less than or equal to this threshold.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxItems(): Optional<Long> = maxItems.getOptional("max_items")

        /**
         * Specifies the minimum allowed value for number type document field. Input values must be
         * greater than or equal to this threshold.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun min(): Optional<Long> = min.getOptional("min")

        /**
         * Specifies the minimum number of items for multi_choices, photos type document fields. The
         * number of provided input items must be greater than or equal to this threshold.
         *
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun minItems(): Optional<Long> = minItems.getOptional("min_items")

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
        @JsonProperty("max_items") @ExcludeMissing fun _maxItems(): JsonField<Long> = maxItems

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
        @JsonProperty("min_items") @ExcludeMissing fun _minItems(): JsonField<Long> = minItems

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
            private var maxItems: JsonField<Long> = JsonMissing.of()
            private var min: JsonField<Long> = JsonMissing.of()
            private var minItems: JsonField<Long> = JsonMissing.of()
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
             * Specifies the maximum allowed value for number type document field. Input values must
             * be less than or equal to this threshold.
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
             * Specifies the maximum number of items for multi_choices, photos type document fields.
             * The number of provided input items must be less than or equal to this threshold.
             */
            fun maxItems(maxItems: Long) = maxItems(JsonField.of(maxItems))

            /**
             * Sets [Builder.maxItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxItems] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxItems(maxItems: JsonField<Long>) = apply { this.maxItems = maxItems }

            /**
             * Specifies the minimum allowed value for number type document field. Input values must
             * be greater than or equal to this threshold.
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
             * Specifies the minimum number of items for multi_choices, photos type document fields.
             * The number of provided input items must be greater than or equal to this threshold.
             */
            fun minItems(minItems: Long) = minItems(JsonField.of(minItems))

            /**
             * Sets [Builder.minItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minItems] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minItems(minItems: JsonField<Long>) = apply { this.minItems = minItems }

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

        return other is DocumentTemplateContentRequest &&
            label == other.label &&
            type == other.type &&
            meta == other.meta &&
            name == other.name &&
            required == other.required &&
            validation == other.validation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(label, type, meta, name, required, validation, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocumentTemplateContentRequest{label=$label, type=$type, meta=$meta, name=$name, required=$required, validation=$validation, additionalProperties=$additionalProperties}"
}
