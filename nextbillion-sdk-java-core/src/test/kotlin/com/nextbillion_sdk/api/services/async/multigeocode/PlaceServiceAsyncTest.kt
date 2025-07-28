// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.async.multigeocode

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClientAsync
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceCreateParams
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceDeleteParams
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceItem
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceRetrieveParams
import com.nextbillion_sdk.api.models.multigeocode.place.PlaceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlaceServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val placeServiceAsync = client.multigeocode().place()

        val placeFuture =
            placeServiceAsync.create(
                PlaceCreateParams.builder()
                    .key("key=API_KEY")
                    .addPlace(
                        PlaceCreateParams.Place.builder()
                            .geopoint(
                                PlaceCreateParams.Place.Geopoint.builder().lat(0.0).lng(0.0).build()
                            )
                            .address("address")
                            .building("building")
                            .city("city")
                            .country("\"country\":\"IND\"")
                            .district("district")
                            .house("house")
                            .poi(PlaceCreateParams.Place.Poi.builder().title("title").build())
                            .postalCode("postalCode")
                            .state("state")
                            .street("street")
                            .subDistrict("subDistrict")
                            .build()
                    )
                    .dataSource(
                        PlaceCreateParams.DataSource.builder()
                            .refId("refId")
                            .source("source")
                            .status(PlaceCreateParams.DataSource.Status.ENABLE)
                            .build()
                    )
                    .force(true)
                    .score(0L)
                    .build()
            )

        val place = placeFuture.get()
        place.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val placeServiceAsync = client.multigeocode().place()

        val placeFuture =
            placeServiceAsync.retrieve(
                PlaceRetrieveParams.builder().docId("docId").key("key=API_KEY").build()
            )

        val place = placeFuture.get()
        place.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val placeServiceAsync = client.multigeocode().place()

        val placeFuture =
            placeServiceAsync.update(
                PlaceUpdateParams.builder()
                    .docId("docId")
                    .key("key=API_KEY")
                    .dataSource(
                        PlaceUpdateParams.DataSource.builder()
                            .refId("refId")
                            .source("source")
                            .status(PlaceUpdateParams.DataSource.Status.ENABLE)
                            .build()
                    )
                    .addPlace(
                        PlaceItem.builder()
                            .address("address")
                            .building("building")
                            .city("city")
                            .country("country")
                            .district("district")
                            .geopoint(PlaceItem.Geopoint.builder().lat(0.0).lng(0.0).build())
                            .house("house")
                            .poi(PlaceItem.Poi.builder().title("title").build())
                            .postalCode("postalCode")
                            .state("state")
                            .street("street")
                            .subDistrict("subDistrict")
                            .build()
                    )
                    .score(0L)
                    .build()
            )

        val place = placeFuture.get()
        place.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val placeServiceAsync = client.multigeocode().place()

        val placeFuture =
            placeServiceAsync.delete(
                PlaceDeleteParams.builder().docId("docId").key("key=API_KEY").build()
            )

        val place = placeFuture.get()
        place.validate()
    }
}
