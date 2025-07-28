// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.restrictions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.JsonValue
import com.nextbillion_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RestrictionListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val restrictionListResponse =
            RestrictionListResponse.builder()
                .addData(
                    RichGroupResponse.builder()
                        .id(0L)
                        .area("area")
                        .bbox(
                            JsonValue.from(
                                mapOf("minLat" to 0, "minLon" to 0, "maxLat" to 1, "maxLon" to 1)
                            )
                        )
                        .comment("comment")
                        .createAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .direction(RichGroupResponse.Direction.FORWARD)
                        .endTime(0.0)
                        .geofence(
                            JsonValue.from(
                                listOf(listOf(0, 1), listOf(1, 2), listOf(3, 4), listOf(5, 6))
                            )
                        )
                        .highway("highway")
                        .addMode("string")
                        .name("name")
                        .repeatOn("Mo-Fr 07:00-09:00,17:00-19:00")
                        .restrictionType(RichGroupResponse.RestrictionType.CLOSURE)
                        .speed(0.0)
                        .speedLimit(0.0)
                        .startTime(0.0)
                        .state(RichGroupResponse.State.ENABLED)
                        .status(RichGroupResponse.Status.ACTIVE)
                        .updateAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(RestrictionListResponse.Meta.builder().limit(0L).offset(0L).total(0L).build())
                .build()

        assertThat(restrictionListResponse.data().getOrNull())
            .containsExactly(
                RichGroupResponse.builder()
                    .id(0L)
                    .area("area")
                    .bbox(
                        JsonValue.from(
                            mapOf("minLat" to 0, "minLon" to 0, "maxLat" to 1, "maxLon" to 1)
                        )
                    )
                    .comment("comment")
                    .createAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .direction(RichGroupResponse.Direction.FORWARD)
                    .endTime(0.0)
                    .geofence(
                        JsonValue.from(
                            listOf(listOf(0, 1), listOf(1, 2), listOf(3, 4), listOf(5, 6))
                        )
                    )
                    .highway("highway")
                    .addMode("string")
                    .name("name")
                    .repeatOn("Mo-Fr 07:00-09:00,17:00-19:00")
                    .restrictionType(RichGroupResponse.RestrictionType.CLOSURE)
                    .speed(0.0)
                    .speedLimit(0.0)
                    .startTime(0.0)
                    .state(RichGroupResponse.State.ENABLED)
                    .status(RichGroupResponse.Status.ACTIVE)
                    .updateAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(restrictionListResponse.meta())
            .contains(RestrictionListResponse.Meta.builder().limit(0L).offset(0L).total(0L).build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val restrictionListResponse =
            RestrictionListResponse.builder()
                .addData(
                    RichGroupResponse.builder()
                        .id(0L)
                        .area("area")
                        .bbox(
                            JsonValue.from(
                                mapOf("minLat" to 0, "minLon" to 0, "maxLat" to 1, "maxLon" to 1)
                            )
                        )
                        .comment("comment")
                        .createAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .direction(RichGroupResponse.Direction.FORWARD)
                        .endTime(0.0)
                        .geofence(
                            JsonValue.from(
                                listOf(listOf(0, 1), listOf(1, 2), listOf(3, 4), listOf(5, 6))
                            )
                        )
                        .highway("highway")
                        .addMode("string")
                        .name("name")
                        .repeatOn("Mo-Fr 07:00-09:00,17:00-19:00")
                        .restrictionType(RichGroupResponse.RestrictionType.CLOSURE)
                        .speed(0.0)
                        .speedLimit(0.0)
                        .startTime(0.0)
                        .state(RichGroupResponse.State.ENABLED)
                        .status(RichGroupResponse.Status.ACTIVE)
                        .updateAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(RestrictionListResponse.Meta.builder().limit(0L).offset(0L).total(0L).build())
                .build()

        val roundtrippedRestrictionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(restrictionListResponse),
                jacksonTypeRef<RestrictionListResponse>(),
            )

        assertThat(roundtrippedRestrictionListResponse).isEqualTo(restrictionListResponse)
    }
}
