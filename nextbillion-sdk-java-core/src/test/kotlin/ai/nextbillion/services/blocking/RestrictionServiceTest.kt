// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.restrictions.RestrictionCreateParams
import ai.nextbillion.models.restrictions.RestrictionDeleteParams
import ai.nextbillion.models.restrictions.RestrictionListByBboxParams
import ai.nextbillion.models.restrictions.RestrictionListParams
import ai.nextbillion.models.restrictions.RestrictionRetrieveParams
import ai.nextbillion.models.restrictions.RestrictionSetStateParams
import ai.nextbillion.models.restrictions.RestrictionUpdateParams
import ai.nextbillion.models.restrictions.RichGroupRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RestrictionServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val restrictionService = client.restrictions()

        val richGroupResponse =
            restrictionService.create(
                RestrictionCreateParams.builder()
                    .restrictionType(RestrictionCreateParams.RestrictionType.TURN)
                    .key("key=API_KEY")
                    .latlon(true)
                    .richGroupRequest(
                        RichGroupRequest.builder()
                            .area("area")
                            .name("name")
                            .comment("comment")
                            .direction(RichGroupRequest.Direction.FORWARD)
                            .endTime(0.0)
                            .addGeofence(listOf(0.0))
                            .height(0L)
                            .length(0L)
                            .addMode(RichGroupRequest.Mode._0W)
                            .repeatOn("repeatOn=\"Mo-Fr 07:00-09:00,17:00-19:00\"")
                            .addSegment(
                                RichGroupRequest.Segment.builder().from(0.0).to(0.0).build()
                            )
                            .speed(0.0)
                            .speedLimit(0.0)
                            .startTime(0.0)
                            .addTrack(listOf(0.0))
                            .addTurn(
                                RichGroupRequest.Turn.builder().from(0L).to(0L).via(0L).build()
                            )
                            .weight(0L)
                            .width(0L)
                            .build()
                    )
                    .build()
            )

        richGroupResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val restrictionService = client.restrictions()

        val richGroupResponse =
            restrictionService.retrieve(
                RestrictionRetrieveParams.builder()
                    .id(0L)
                    .key("key=API_KEY")
                    .transform(true)
                    .build()
            )

        richGroupResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val restrictionService = client.restrictions()

        val richGroupResponse =
            restrictionService.update(
                RestrictionUpdateParams.builder()
                    .id(0L)
                    .key("key=API_KEY")
                    .latlon(true)
                    .richGroupRequest(
                        RichGroupRequest.builder()
                            .area("area")
                            .name("name")
                            .comment("comment")
                            .direction(RichGroupRequest.Direction.FORWARD)
                            .endTime(0.0)
                            .addGeofence(listOf(0.0))
                            .height(0L)
                            .length(0L)
                            .addMode(RichGroupRequest.Mode._0W)
                            .repeatOn("repeatOn=\"Mo-Fr 07:00-09:00,17:00-19:00\"")
                            .addSegment(
                                RichGroupRequest.Segment.builder().from(0.0).to(0.0).build()
                            )
                            .speed(0.0)
                            .speedLimit(0.0)
                            .startTime(0.0)
                            .addTrack(listOf(0.0))
                            .addTurn(
                                RichGroupRequest.Turn.builder().from(0L).to(0L).via(0L).build()
                            )
                            .weight(0L)
                            .width(0L)
                            .build()
                    )
                    .build()
            )

        richGroupResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val restrictionService = client.restrictions()

        val restrictions =
            restrictionService.list(
                RestrictionListParams.builder()
                    .area("area")
                    .key("key=API_KEY")
                    .limit(0L)
                    .offset(0L)
                    .mode(RestrictionListParams.Mode._0W)
                    .name("name")
                    .restrictionType(RestrictionListParams.RestrictionType.TURN)
                    .source(RestrictionListParams.Source.RRT)
                    .state(RestrictionListParams.State.ENABLED)
                    .status(RestrictionListParams.Status.ACTIVE)
                    .transform(true)
                    .build()
            )

        restrictions.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val restrictionService = client.restrictions()

        val restriction =
            restrictionService.delete(
                RestrictionDeleteParams.builder().id(0L).key("key=API_KEY").build()
            )

        restriction.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listByBbox() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val restrictionService = client.restrictions()

        val richGroupResponses =
            restrictionService.listByBbox(
                RestrictionListByBboxParams.builder()
                    .key("key=API_KEY")
                    .maxLat(0.0)
                    .maxLon(0.0)
                    .minLat(0.0)
                    .minLon(0.0)
                    .addMode(RestrictionListByBboxParams.Mode._0W)
                    .restrictionType(RestrictionListByBboxParams.RestrictionType.TURN)
                    .source(RestrictionListByBboxParams.Source.RRT)
                    .state(RestrictionListByBboxParams.State.ENABLED)
                    .status(RestrictionListByBboxParams.Status.ACTIVE)
                    .transform(true)
                    .build()
            )

        richGroupResponses.forEach { it.validate() }
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun setState() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val restrictionService = client.restrictions()

        val richGroupResponse =
            restrictionService.setState(
                RestrictionSetStateParams.builder()
                    .id(0L)
                    .key("key=API_KEY")
                    .state(RestrictionSetStateParams.State.ENABLED)
                    .build()
            )

        richGroupResponse.validate()
    }
}
