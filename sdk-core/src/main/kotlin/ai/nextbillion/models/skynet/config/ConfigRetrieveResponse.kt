// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.skynet.config

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

class ConfigRetrieveResponse
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
     * A data object containing the config response.
     *
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
     * A string indicating the state of the response. On successful responses, the value will be Ok.
     * Indicative error messages are returned for different errors. See the
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

        /** Returns a mutable builder for constructing an instance of [ConfigRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConfigRetrieveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(configRetrieveResponse: ConfigRetrieveResponse) = apply {
            data = configRetrieveResponse.data
            message = configRetrieveResponse.message
            status = configRetrieveResponse.status
            additionalProperties = configRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** A data object containing the config response. */
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
         * Ok. Indicative error messages are returned for different errors. See the
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
         * Returns an immutable instance of [ConfigRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConfigRetrieveResponse =
            ConfigRetrieveResponse(data, message, status, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ConfigRetrieveResponse = apply {
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

    /** A data object containing the config response. */
    class Data
    private constructor(
        private val config: JsonField<Config>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("config") @ExcludeMissing config: JsonField<Config> = JsonMissing.of()
        ) : this(config, mutableMapOf())

        /**
         * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun config(): Optional<Config> = config.getOptional("config")

        /**
         * Returns the raw JSON value of [config].
         *
         * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

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

            private var config: JsonField<Config> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                config = data.config
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun config(config: Config) = config(JsonField.of(config))

            /**
             * Sets [Builder.config] to an arbitrary JSON value.
             *
             * You should usually call [Builder.config] with a well-typed [Config] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun config(config: JsonField<Config>) = apply { this.config = config }

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
            fun build(): Data = Data(config, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            config().ifPresent { it.validate() }
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
        @JvmSynthetic internal fun validity(): Int = (config.asKnown().getOrNull()?.validity() ?: 0)

        class Config
        private constructor(
            private val webhook: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("webhook")
                @ExcludeMissing
                webhook: JsonField<List<String>> = JsonMissing.of()
            ) : this(webhook, mutableMapOf())

            /**
             * An array of strings representing the list of webhooks. Webhooks are used to receive
             * information, through POST requests, whenever any event is triggered.
             *
             * @throws NextbillionSdkInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun webhook(): Optional<List<String>> = webhook.getOptional("webhook")

            /**
             * Returns the raw JSON value of [webhook].
             *
             * Unlike [webhook], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("webhook")
            @ExcludeMissing
            fun _webhook(): JsonField<List<String>> = webhook

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

                /** Returns a mutable builder for constructing an instance of [Config]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Config]. */
            class Builder internal constructor() {

                private var webhook: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(config: Config) = apply {
                    webhook = config.webhook.map { it.toMutableList() }
                    additionalProperties = config.additionalProperties.toMutableMap()
                }

                /**
                 * An array of strings representing the list of webhooks. Webhooks are used to
                 * receive information, through POST requests, whenever any event is triggered.
                 */
                fun webhook(webhook: List<String>) = webhook(JsonField.of(webhook))

                /**
                 * Sets [Builder.webhook] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.webhook] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun webhook(webhook: JsonField<List<String>>) = apply {
                    this.webhook = webhook.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.webhook].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addWebhook(webhook: String) = apply {
                    this.webhook =
                        (this.webhook ?: JsonField.of(mutableListOf())).also {
                            checkKnown("webhook", it).add(webhook)
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
                 * Returns an immutable instance of [Config].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Config =
                    Config(
                        (webhook ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Config = apply {
                if (validated) {
                    return@apply
                }

                webhook()
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
            @JvmSynthetic internal fun validity(): Int = (webhook.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Config &&
                    webhook == other.webhook &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(webhook, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Config{webhook=$webhook, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                config == other.config &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(config, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{config=$config, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConfigRetrieveResponse &&
            data == other.data &&
            message == other.message &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, message, status, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConfigRetrieveResponse{data=$data, message=$message, status=$status, additionalProperties=$additionalProperties}"
}
