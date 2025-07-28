// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.lookup

import ai.nextbillion.core.jsonMapper
import ai.nextbillion.models.geocode.Access
import ai.nextbillion.models.geocode.Address
import ai.nextbillion.models.geocode.Categories
import ai.nextbillion.models.geocode.ContactObject
import ai.nextbillion.models.geocode.Contacts
import ai.nextbillion.models.geocode.MapView
import ai.nextbillion.models.geocode.Position
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LookupByIdResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val lookupByIdResponse =
            LookupByIdResponse.builder()
                .addItem(
                    LookupByIdResponse.Item.builder()
                        .id("id")
                        .access(Access.builder().lat(0.0).lng(0.0).build())
                        .address(
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
                        )
                        .addCategory(
                            Categories.builder().id("id").name("name").primary("primary").build()
                        )
                        .addContact(
                            Contacts.builder()
                                .addEmail(
                                    ContactObject.builder()
                                        .addCategory(
                                            ContactObject.Category.builder().id("id").build()
                                        )
                                        .label("label")
                                        .value("value")
                                        .build()
                                )
                                .addFax(
                                    ContactObject.builder()
                                        .addCategory(
                                            ContactObject.Category.builder().id("id").build()
                                        )
                                        .label("label")
                                        .value("value")
                                        .build()
                                )
                                .addMobile(
                                    ContactObject.builder()
                                        .addCategory(
                                            ContactObject.Category.builder().id("id").build()
                                        )
                                        .label("label")
                                        .value("value")
                                        .build()
                                )
                                .addPhone(
                                    ContactObject.builder()
                                        .addCategory(
                                            ContactObject.Category.builder().id("id").build()
                                        )
                                        .label("label")
                                        .value("value")
                                        .build()
                                )
                                .addTollFree(
                                    ContactObject.builder()
                                        .addCategory(
                                            ContactObject.Category.builder().id("id").build()
                                        )
                                        .label("label")
                                        .value("value")
                                        .build()
                                )
                                .addWww(
                                    ContactObject.builder()
                                        .addCategory(
                                            ContactObject.Category.builder().id("id").build()
                                        )
                                        .label("label")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .mapView(
                            MapView.builder()
                                .east("east")
                                .north("north")
                                .south("south")
                                .west("west")
                                .build()
                        )
                        .position(Position.builder().lat("lat").lng("lng").build())
                        .title("title")
                        .build()
                )
                .build()

        assertThat(lookupByIdResponse.items().getOrNull())
            .containsExactly(
                LookupByIdResponse.Item.builder()
                    .id("id")
                    .access(Access.builder().lat(0.0).lng(0.0).build())
                    .address(
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
                    )
                    .addCategory(
                        Categories.builder().id("id").name("name").primary("primary").build()
                    )
                    .addContact(
                        Contacts.builder()
                            .addEmail(
                                ContactObject.builder()
                                    .addCategory(ContactObject.Category.builder().id("id").build())
                                    .label("label")
                                    .value("value")
                                    .build()
                            )
                            .addFax(
                                ContactObject.builder()
                                    .addCategory(ContactObject.Category.builder().id("id").build())
                                    .label("label")
                                    .value("value")
                                    .build()
                            )
                            .addMobile(
                                ContactObject.builder()
                                    .addCategory(ContactObject.Category.builder().id("id").build())
                                    .label("label")
                                    .value("value")
                                    .build()
                            )
                            .addPhone(
                                ContactObject.builder()
                                    .addCategory(ContactObject.Category.builder().id("id").build())
                                    .label("label")
                                    .value("value")
                                    .build()
                            )
                            .addTollFree(
                                ContactObject.builder()
                                    .addCategory(ContactObject.Category.builder().id("id").build())
                                    .label("label")
                                    .value("value")
                                    .build()
                            )
                            .addWww(
                                ContactObject.builder()
                                    .addCategory(ContactObject.Category.builder().id("id").build())
                                    .label("label")
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .mapView(
                        MapView.builder()
                            .east("east")
                            .north("north")
                            .south("south")
                            .west("west")
                            .build()
                    )
                    .position(Position.builder().lat("lat").lng("lng").build())
                    .title("title")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupByIdResponse =
            LookupByIdResponse.builder()
                .addItem(
                    LookupByIdResponse.Item.builder()
                        .id("id")
                        .access(Access.builder().lat(0.0).lng(0.0).build())
                        .address(
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
                        )
                        .addCategory(
                            Categories.builder().id("id").name("name").primary("primary").build()
                        )
                        .addContact(
                            Contacts.builder()
                                .addEmail(
                                    ContactObject.builder()
                                        .addCategory(
                                            ContactObject.Category.builder().id("id").build()
                                        )
                                        .label("label")
                                        .value("value")
                                        .build()
                                )
                                .addFax(
                                    ContactObject.builder()
                                        .addCategory(
                                            ContactObject.Category.builder().id("id").build()
                                        )
                                        .label("label")
                                        .value("value")
                                        .build()
                                )
                                .addMobile(
                                    ContactObject.builder()
                                        .addCategory(
                                            ContactObject.Category.builder().id("id").build()
                                        )
                                        .label("label")
                                        .value("value")
                                        .build()
                                )
                                .addPhone(
                                    ContactObject.builder()
                                        .addCategory(
                                            ContactObject.Category.builder().id("id").build()
                                        )
                                        .label("label")
                                        .value("value")
                                        .build()
                                )
                                .addTollFree(
                                    ContactObject.builder()
                                        .addCategory(
                                            ContactObject.Category.builder().id("id").build()
                                        )
                                        .label("label")
                                        .value("value")
                                        .build()
                                )
                                .addWww(
                                    ContactObject.builder()
                                        .addCategory(
                                            ContactObject.Category.builder().id("id").build()
                                        )
                                        .label("label")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .mapView(
                            MapView.builder()
                                .east("east")
                                .north("north")
                                .south("south")
                                .west("west")
                                .build()
                        )
                        .position(Position.builder().lat("lat").lng("lng").build())
                        .title("title")
                        .build()
                )
                .build()

        val roundtrippedLookupByIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupByIdResponse),
                jacksonTypeRef<LookupByIdResponse>(),
            )

        assertThat(roundtrippedLookupByIdResponse).isEqualTo(lookupByIdResponse)
    }
}
