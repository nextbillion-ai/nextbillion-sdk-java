// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.areas

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

class AreaListResponse
private constructor(
    private val code: JsonField<String>,
    private val modes: JsonField<List<String>>,
    private val name: JsonField<String>,
    private val timezone: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("modes") @ExcludeMissing modes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<Double> = JsonMissing.of(),
    ) : this(code, modes, name, timezone, mutableMapOf())

    /**
     * Returns the code for the available area.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun code(): Optional<String> = code.getOptional("code")

    /**
     * Returns available traveling modes for the given area.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun modes(): Optional<List<String>> = modes.getOptional("modes")

    /**
     * Returns the name of the available area.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Returns the offset from UTC time.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun timezone(): Optional<Double> = timezone.getOptional("timezone")

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [modes].
     *
     * Unlike [modes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modes") @ExcludeMissing fun _modes(): JsonField<List<String>> = modes

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<Double> = timezone

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

        /** Returns a mutable builder for constructing an instance of [AreaListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AreaListResponse]. */
    class Builder internal constructor() {

        private var code: JsonField<String> = JsonMissing.of()
        private var modes: JsonField<MutableList<String>>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var timezone: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(areaListResponse: AreaListResponse) = apply {
            code = areaListResponse.code
            modes = areaListResponse.modes.map { it.toMutableList() }
            name = areaListResponse.name
            timezone = areaListResponse.timezone
            additionalProperties = areaListResponse.additionalProperties.toMutableMap()
        }

        /** Returns the code for the available area. */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** Returns available traveling modes for the given area. */
        fun modes(modes: List<String>) = modes(JsonField.of(modes))

        /**
         * Sets [Builder.modes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modes] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modes(modes: JsonField<List<String>>) = apply {
            this.modes = modes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [modes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMode(mode: String) = apply {
            modes =
                (modes ?: JsonField.of(mutableListOf())).also { checkKnown("modes", it).add(mode) }
        }

        /** Returns the name of the available area. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Returns the offset from UTC time. */
        fun timezone(timezone: Double) = timezone(JsonField.of(timezone))

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<Double>) = apply { this.timezone = timezone }

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
         * Returns an immutable instance of [AreaListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AreaListResponse =
            AreaListResponse(
                code,
                (modes ?: JsonMissing.of()).map { it.toImmutable() },
                name,
                timezone,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AreaListResponse = apply {
        if (validated) {
            return@apply
        }

        code()
        modes()
        name()
        timezone()
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
        (if (code.asKnown().isPresent) 1 else 0) +
            (modes.asKnown().getOrNull()?.size ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (timezone.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AreaListResponse && code == other.code && modes == other.modes && name == other.name && timezone == other.timezone && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(code, modes, name, timezone, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AreaListResponse{code=$code, modes=$modes, name=$name, timezone=$timezone, additionalProperties=$additionalProperties}"
}
