// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
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
internal class RestrictionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val restrictionServiceAsync = client.restrictions()

        val richGroupResponseFuture =
            restrictionServiceAsync.create(
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

        val richGroupResponse = richGroupResponseFuture.get()
        richGroupResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val restrictionServiceAsync = client.restrictions()

        val richGroupResponseFuture =
            restrictionServiceAsync.retrieve(
                RestrictionRetrieveParams.builder()
                    .id(0L)
                    .key("key=API_KEY")
                    .transform(true)
                    .build()
            )

        val richGroupResponse = richGroupResponseFuture.get()
        richGroupResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val restrictionServiceAsync = client.restrictions()

        val richGroupResponseFuture =
            restrictionServiceAsync.update(
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

        val richGroupResponse = richGroupResponseFuture.get()
        richGroupResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val restrictionServiceAsync = client.restrictions()

        val restrictionsFuture =
            restrictionServiceAsync.list(
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

        val restrictions = restrictionsFuture.get()
        restrictions.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val restrictionServiceAsync = client.restrictions()

        val restrictionFuture =
            restrictionServiceAsync.delete(
                RestrictionDeleteParams.builder().id(0L).key("key=API_KEY").build()
            )

        val restriction = restrictionFuture.get()
        restriction.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listByBbox() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val restrictionServiceAsync = client.restrictions()

        val richGroupResponsesFuture =
            restrictionServiceAsync.listByBbox(
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

        val richGroupResponses = richGroupResponsesFuture.get()
        richGroupResponses.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setState() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val restrictionServiceAsync = client.restrictions()

        val richGroupResponseFuture =
            restrictionServiceAsync.setState(
                RestrictionSetStateParams.builder()
                    .id(0L)
                    .key("key=API_KEY")
                    .state(RestrictionSetStateParams.State.ENABLED)
                    .build()
            )

        val richGroupResponse = richGroupResponseFuture.get()
        richGroupResponse.validate()
    }
}
