// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.models.geocode

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.nextbillion.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AddressTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val address =
            Address.builder()
                .city("city")
                .countryCode("countryCode")
                .countryName("countryName")
                .county("county")
                .district("district")
                .houseNumber("houseNumber")
                .label("label")
                .postalCode("postalCode")
                .state("state")
                .stateCode("stateCode")
                .street("street")
                .build()

        assertThat(address.city()).contains("city")
        assertThat(address.countryCode()).contains("countryCode")
        assertThat(address.countryName()).contains("countryName")
        assertThat(address.county()).contains("county")
        assertThat(address.district()).contains("district")
        assertThat(address.houseNumber()).contains("houseNumber")
        assertThat(address.label()).contains("label")
        assertThat(address.postalCode()).contains("postalCode")
        assertThat(address.state()).contains("state")
        assertThat(address.stateCode()).contains("stateCode")
        assertThat(address.street()).contains("street")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val address =
            Address.builder()
                .city("city")
                .countryCode("countryCode")
                .countryName("countryName")
                .county("county")
                .district("district")
                .houseNumber("houseNumber")
                .label("label")
                .postalCode("postalCode")
                .state("state")
                .stateCode("stateCode")
                .street("street")
                .build()

        val roundtrippedAddress =
            jsonMapper.readValue(jsonMapper.writeValueAsString(address), jacksonTypeRef<Address>())

        assertThat(roundtrippedAddress).isEqualTo(address)
    }
}
