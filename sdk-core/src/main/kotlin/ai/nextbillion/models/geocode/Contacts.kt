// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geocode

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

class Contacts
private constructor(
    private val email: JsonField<List<ContactObject>>,
    private val fax: JsonField<List<ContactObject>>,
    private val mobile: JsonField<List<ContactObject>>,
    private val phone: JsonField<List<ContactObject>>,
    private val tollFree: JsonField<List<ContactObject>>,
    private val www: JsonField<List<ContactObject>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("email")
        @ExcludeMissing
        email: JsonField<List<ContactObject>> = JsonMissing.of(),
        @JsonProperty("fax") @ExcludeMissing fax: JsonField<List<ContactObject>> = JsonMissing.of(),
        @JsonProperty("mobile")
        @ExcludeMissing
        mobile: JsonField<List<ContactObject>> = JsonMissing.of(),
        @JsonProperty("phone")
        @ExcludeMissing
        phone: JsonField<List<ContactObject>> = JsonMissing.of(),
        @JsonProperty("tollFree")
        @ExcludeMissing
        tollFree: JsonField<List<ContactObject>> = JsonMissing.of(),
        @JsonProperty("www") @ExcludeMissing www: JsonField<List<ContactObject>> = JsonMissing.of(),
    ) : this(email, fax, mobile, phone, tollFree, www, mutableMapOf())

    /**
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun email(): Optional<List<ContactObject>> = email.getOptional("email")

    /**
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fax(): Optional<List<ContactObject>> = fax.getOptional("fax")

    /**
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun mobile(): Optional<List<ContactObject>> = mobile.getOptional("mobile")

    /**
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun phone(): Optional<List<ContactObject>> = phone.getOptional("phone")

    /**
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tollFree(): Optional<List<ContactObject>> = tollFree.getOptional("tollFree")

    /**
     * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun www(): Optional<List<ContactObject>> = www.getOptional("www")

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<List<ContactObject>> = email

    /**
     * Returns the raw JSON value of [fax].
     *
     * Unlike [fax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fax") @ExcludeMissing fun _fax(): JsonField<List<ContactObject>> = fax

    /**
     * Returns the raw JSON value of [mobile].
     *
     * Unlike [mobile], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mobile") @ExcludeMissing fun _mobile(): JsonField<List<ContactObject>> = mobile

    /**
     * Returns the raw JSON value of [phone].
     *
     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<List<ContactObject>> = phone

    /**
     * Returns the raw JSON value of [tollFree].
     *
     * Unlike [tollFree], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tollFree")
    @ExcludeMissing
    fun _tollFree(): JsonField<List<ContactObject>> = tollFree

    /**
     * Returns the raw JSON value of [www].
     *
     * Unlike [www], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("www") @ExcludeMissing fun _www(): JsonField<List<ContactObject>> = www

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

        /** Returns a mutable builder for constructing an instance of [Contacts]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Contacts]. */
    class Builder internal constructor() {

        private var email: JsonField<MutableList<ContactObject>>? = null
        private var fax: JsonField<MutableList<ContactObject>>? = null
        private var mobile: JsonField<MutableList<ContactObject>>? = null
        private var phone: JsonField<MutableList<ContactObject>>? = null
        private var tollFree: JsonField<MutableList<ContactObject>>? = null
        private var www: JsonField<MutableList<ContactObject>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contacts: Contacts) = apply {
            email = contacts.email.map { it.toMutableList() }
            fax = contacts.fax.map { it.toMutableList() }
            mobile = contacts.mobile.map { it.toMutableList() }
            phone = contacts.phone.map { it.toMutableList() }
            tollFree = contacts.tollFree.map { it.toMutableList() }
            www = contacts.www.map { it.toMutableList() }
            additionalProperties = contacts.additionalProperties.toMutableMap()
        }

        fun email(email: List<ContactObject>) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed `List<ContactObject>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun email(email: JsonField<List<ContactObject>>) = apply {
            this.email = email.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactObject] to [Builder.email].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEmail(email: ContactObject) = apply {
            this.email =
                (this.email ?: JsonField.of(mutableListOf())).also {
                    checkKnown("email", it).add(email)
                }
        }

        fun fax(fax: List<ContactObject>) = fax(JsonField.of(fax))

        /**
         * Sets [Builder.fax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fax] with a well-typed `List<ContactObject>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fax(fax: JsonField<List<ContactObject>>) = apply {
            this.fax = fax.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactObject] to [Builder.fax].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFax(fax: ContactObject) = apply {
            this.fax =
                (this.fax ?: JsonField.of(mutableListOf())).also { checkKnown("fax", it).add(fax) }
        }

        fun mobile(mobile: List<ContactObject>) = mobile(JsonField.of(mobile))

        /**
         * Sets [Builder.mobile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mobile] with a well-typed `List<ContactObject>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mobile(mobile: JsonField<List<ContactObject>>) = apply {
            this.mobile = mobile.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactObject] to [Builder.mobile].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMobile(mobile: ContactObject) = apply {
            this.mobile =
                (this.mobile ?: JsonField.of(mutableListOf())).also {
                    checkKnown("mobile", it).add(mobile)
                }
        }

        fun phone(phone: List<ContactObject>) = phone(JsonField.of(phone))

        /**
         * Sets [Builder.phone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phone] with a well-typed `List<ContactObject>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phone(phone: JsonField<List<ContactObject>>) = apply {
            this.phone = phone.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactObject] to [Builder.phone].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhone(phone: ContactObject) = apply {
            this.phone =
                (this.phone ?: JsonField.of(mutableListOf())).also {
                    checkKnown("phone", it).add(phone)
                }
        }

        fun tollFree(tollFree: List<ContactObject>) = tollFree(JsonField.of(tollFree))

        /**
         * Sets [Builder.tollFree] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tollFree] with a well-typed `List<ContactObject>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tollFree(tollFree: JsonField<List<ContactObject>>) = apply {
            this.tollFree = tollFree.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactObject] to [Builder.tollFree].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTollFree(tollFree: ContactObject) = apply {
            this.tollFree =
                (this.tollFree ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tollFree", it).add(tollFree)
                }
        }

        fun www(www: List<ContactObject>) = www(JsonField.of(www))

        /**
         * Sets [Builder.www] to an arbitrary JSON value.
         *
         * You should usually call [Builder.www] with a well-typed `List<ContactObject>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun www(www: JsonField<List<ContactObject>>) = apply {
            this.www = www.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactObject] to [Builder.www].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWww(www: ContactObject) = apply {
            this.www =
                (this.www ?: JsonField.of(mutableListOf())).also { checkKnown("www", it).add(www) }
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
         * Returns an immutable instance of [Contacts].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Contacts =
            Contacts(
                (email ?: JsonMissing.of()).map { it.toImmutable() },
                (fax ?: JsonMissing.of()).map { it.toImmutable() },
                (mobile ?: JsonMissing.of()).map { it.toImmutable() },
                (phone ?: JsonMissing.of()).map { it.toImmutable() },
                (tollFree ?: JsonMissing.of()).map { it.toImmutable() },
                (www ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Contacts = apply {
        if (validated) {
            return@apply
        }

        email().ifPresent { it.forEach { it.validate() } }
        fax().ifPresent { it.forEach { it.validate() } }
        mobile().ifPresent { it.forEach { it.validate() } }
        phone().ifPresent { it.forEach { it.validate() } }
        tollFree().ifPresent { it.forEach { it.validate() } }
        www().ifPresent { it.forEach { it.validate() } }
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
        (email.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (fax.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (mobile.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (phone.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (tollFree.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (www.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Contacts && email == other.email && fax == other.fax && mobile == other.mobile && phone == other.phone && tollFree == other.tollFree && www == other.www && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(email, fax, mobile, phone, tollFree, www, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Contacts{email=$email, fax=$fax, mobile=$mobile, phone=$phone, tollFree=$tollFree, www=$www, additionalProperties=$additionalProperties}"
}
