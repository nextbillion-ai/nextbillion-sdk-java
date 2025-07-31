// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking.multigeocode

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.multigeocode.place.PlaceCreateParams
import ai.nextbillion.models.multigeocode.place.PlaceDeleteParams
import ai.nextbillion.models.multigeocode.place.PlaceItem
import ai.nextbillion.models.multigeocode.place.PlaceRetrieveParams
import ai.nextbillion.models.multigeocode.place.PlaceUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PlaceServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val placeService = client.multigeocode().place()

        val place =
            placeService.create(
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

        place.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val placeService = client.multigeocode().place()

        val place =
            placeService.retrieve(
                PlaceRetrieveParams.builder().docId("docId").key("key=API_KEY").build()
            )

        place.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val placeService = client.multigeocode().place()

        val place =
            placeService.update(
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

        place.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val placeService = client.multigeocode().place()

        val place =
            placeService.delete(
                PlaceDeleteParams.builder().docId("docId").key("key=API_KEY").build()
            )

        place.validate()
    }
}
