// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.restrictions

import com.nextbillion_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RestrictionCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
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
                    .addSegment(RichGroupRequest.Segment.builder().from(0.0).to(0.0).build())
                    .speed(0.0)
                    .speedLimit(0.0)
                    .startTime(0.0)
                    .addTrack(listOf(0.0))
                    .addTurn(RichGroupRequest.Turn.builder().from(0L).to(0L).via(0L).build())
                    .weight(0L)
                    .width(0L)
                    .build()
            )
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            RestrictionCreateParams.builder()
                .restrictionType(RestrictionCreateParams.RestrictionType.TURN)
                .key("key=API_KEY")
                .richGroupRequest(RichGroupRequest.builder().area("area").name("name").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("turn")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
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
                        .addSegment(RichGroupRequest.Segment.builder().from(0.0).to(0.0).build())
                        .speed(0.0)
                        .speedLimit(0.0)
                        .startTime(0.0)
                        .addTrack(listOf(0.0))
                        .addTurn(RichGroupRequest.Turn.builder().from(0L).to(0L).via(0L).build())
                        .weight(0L)
                        .width(0L)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("key", "key=API_KEY").put("latlon", "true").build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RestrictionCreateParams.builder()
                .restrictionType(RestrictionCreateParams.RestrictionType.TURN)
                .key("key=API_KEY")
                .richGroupRequest(RichGroupRequest.builder().area("area").name("name").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
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
                        .addSegment(RichGroupRequest.Segment.builder().from(0.0).to(0.0).build())
                        .speed(0.0)
                        .speedLimit(0.0)
                        .startTime(0.0)
                        .addTrack(listOf(0.0))
                        .addTurn(RichGroupRequest.Turn.builder().from(0L).to(0L).via(0L).build())
                        .weight(0L)
                        .width(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                    .addSegment(RichGroupRequest.Segment.builder().from(0.0).to(0.0).build())
                    .speed(0.0)
                    .speedLimit(0.0)
                    .startTime(0.0)
                    .addTrack(listOf(0.0))
                    .addTurn(RichGroupRequest.Turn.builder().from(0L).to(0L).via(0L).build())
                    .weight(0L)
                    .width(0L)
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RestrictionCreateParams.builder()
                .restrictionType(RestrictionCreateParams.RestrictionType.TURN)
                .key("key=API_KEY")
                .richGroupRequest(RichGroupRequest.builder().area("area").name("name").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(RichGroupRequest.builder().area("area").name("name").build())
    }
}
