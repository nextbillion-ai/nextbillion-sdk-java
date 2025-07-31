// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.monitor

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
 * An object with pagination details of the search results. Use this object to implement pagination
 * in your application.
 */
class Pagination
private constructor(
    private val hasmore: JsonField<Boolean>,
    private val page: JsonField<Long>,
    private val size: JsonField<Long>,
    private val total: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("hasmore") @ExcludeMissing hasmore: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
    ) : this(hasmore, page, size, total, mutableMapOf())

    /**
     * A boolean value indicating whether there are more items available beyond the current page.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun hasmore(): Optional<Boolean> = hasmore.getOptional("hasmore")

    /**
     * An integer value indicating the current page number (starting at 0).
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun page(): Optional<Long> = page.getOptional("page")

    /**
     * An integer value indicating the maximum number of items retrieved per page.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun size(): Optional<Long> = size.getOptional("size")

    /**
     * An integer value indicating the total number of items available in the data set. This
     * parameter can be used to calculate the total number of pages available.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun total(): Optional<Long> = total.getOptional("total")

    /**
     * Returns the raw JSON value of [hasmore].
     *
     * Unlike [hasmore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasmore") @ExcludeMissing fun _hasmore(): JsonField<Boolean> = hasmore

    /**
     * Returns the raw JSON value of [page].
     *
     * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

    /**
     * Returns the raw JSON value of [size].
     *
     * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Long> = size

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

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

        /** Returns a mutable builder for constructing an instance of [Pagination]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Pagination]. */
    class Builder internal constructor() {

        private var hasmore: JsonField<Boolean> = JsonMissing.of()
        private var page: JsonField<Long> = JsonMissing.of()
        private var size: JsonField<Long> = JsonMissing.of()
        private var total: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pagination: Pagination) = apply {
            hasmore = pagination.hasmore
            page = pagination.page
            size = pagination.size
            total = pagination.total
            additionalProperties = pagination.additionalProperties.toMutableMap()
        }

        /**
         * A boolean value indicating whether there are more items available beyond the current
         * page.
         */
        fun hasmore(hasmore: Boolean) = hasmore(JsonField.of(hasmore))

        /**
         * Sets [Builder.hasmore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasmore] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasmore(hasmore: JsonField<Boolean>) = apply { this.hasmore = hasmore }

        /** An integer value indicating the current page number (starting at 0). */
        fun page(page: Long) = page(JsonField.of(page))

        /**
         * Sets [Builder.page] to an arbitrary JSON value.
         *
         * You should usually call [Builder.page] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun page(page: JsonField<Long>) = apply { this.page = page }

        /** An integer value indicating the maximum number of items retrieved per page. */
        fun size(size: Long) = size(JsonField.of(size))

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun size(size: JsonField<Long>) = apply { this.size = size }

        /**
         * An integer value indicating the total number of items available in the data set. This
         * parameter can be used to calculate the total number of pages available.
         */
        fun total(total: Long) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Long>) = apply { this.total = total }

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
         * Returns an immutable instance of [Pagination].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Pagination =
            Pagination(hasmore, page, size, total, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): Pagination = apply {
        if (validated) {
            return@apply
        }

        hasmore()
        page()
        size()
        total()
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
        (if (hasmore.asKnown().isPresent) 1 else 0) +
            (if (page.asKnown().isPresent) 1 else 0) +
            (if (size.asKnown().isPresent) 1 else 0) +
            (if (total.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Pagination && hasmore == other.hasmore && page == other.page && size == other.size && total == other.total && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(hasmore, page, size, total, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Pagination{hasmore=$hasmore, page=$page, size=$size, total=$total, additionalProperties=$additionalProperties}"
}
