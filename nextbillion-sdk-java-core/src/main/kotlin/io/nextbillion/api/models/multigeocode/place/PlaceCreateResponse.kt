// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.multigeocode.place

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.nextbillion.api.core.ExcludeMissing
import io.nextbillion.api.core.JsonField
import io.nextbillion.api.core.JsonMissing
import io.nextbillion.api.core.JsonValue
import io.nextbillion.api.errors.NextbillionSdkInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PlaceCreateResponse
private constructor(
    private val docId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("docId") @ExcludeMissing docId: JsonField<String> = JsonMissing.of()
    ) : this(docId, mutableMapOf())

    /**
     * A unique NextBillion DocID will be created for the POI. Use this ID to search this place
     * through the “Get Place” method, to update attributes or ‘status’ through the “Update Place”
     * method or delete it using the “Delete Place” method.
     *
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun docId(): Optional<String> = docId.getOptional("docId")

    /**
     * Returns the raw JSON value of [docId].
     *
     * Unlike [docId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("docId") @ExcludeMissing fun _docId(): JsonField<String> = docId

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

        /** Returns a mutable builder for constructing an instance of [PlaceCreateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlaceCreateResponse]. */
    class Builder internal constructor() {

        private var docId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(placeCreateResponse: PlaceCreateResponse) = apply {
            docId = placeCreateResponse.docId
            additionalProperties = placeCreateResponse.additionalProperties.toMutableMap()
        }

        /**
         * A unique NextBillion DocID will be created for the POI. Use this ID to search this place
         * through the “Get Place” method, to update attributes or ‘status’ through the “Update
         * Place” method or delete it using the “Delete Place” method.
         */
        fun docId(docId: String) = docId(JsonField.of(docId))

        /**
         * Sets [Builder.docId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.docId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun docId(docId: JsonField<String>) = apply { this.docId = docId }

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
         * Returns an immutable instance of [PlaceCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlaceCreateResponse =
            PlaceCreateResponse(docId, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PlaceCreateResponse = apply {
        if (validated) {
            return@apply
        }

        docId()
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
    @JvmSynthetic internal fun validity(): Int = (if (docId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlaceCreateResponse && docId == other.docId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(docId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlaceCreateResponse{docId=$docId, additionalProperties=$additionalProperties}"
}
