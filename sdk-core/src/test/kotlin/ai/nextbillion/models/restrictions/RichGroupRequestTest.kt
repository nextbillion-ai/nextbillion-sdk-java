// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.restrictions

import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RichGroupRequestTest {

    @Test
    fun create() {
        val richGroupRequest =
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

        assertThat(richGroupRequest.area()).isEqualTo("area")
        assertThat(richGroupRequest.name()).isEqualTo("name")
        assertThat(richGroupRequest.comment()).contains("comment")
        assertThat(richGroupRequest.direction()).contains(RichGroupRequest.Direction.FORWARD)
        assertThat(richGroupRequest.endTime()).contains(0.0)
        assertThat(richGroupRequest.geofence().getOrNull()).containsExactly(listOf(0.0))
        assertThat(richGroupRequest.height()).contains(0L)
        assertThat(richGroupRequest.length()).contains(0L)
        assertThat(richGroupRequest.mode().getOrNull()).containsExactly(RichGroupRequest.Mode._0W)
        assertThat(richGroupRequest.repeatOn())
            .contains("repeatOn=\"Mo-Fr 07:00-09:00,17:00-19:00\"")
        assertThat(richGroupRequest.segments().getOrNull())
            .containsExactly(RichGroupRequest.Segment.builder().from(0.0).to(0.0).build())
        assertThat(richGroupRequest.speed()).contains(0.0)
        assertThat(richGroupRequest.speedLimit()).contains(0.0)
        assertThat(richGroupRequest.startTime()).contains(0.0)
        assertThat(richGroupRequest.tracks().getOrNull()).containsExactly(listOf(0.0))
        assertThat(richGroupRequest.turns().getOrNull())
            .containsExactly(RichGroupRequest.Turn.builder().from(0L).to(0L).via(0L).build())
        assertThat(richGroupRequest.weight()).contains(0L)
        assertThat(richGroupRequest.width()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val richGroupRequest =
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

        val roundtrippedRichGroupRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(richGroupRequest),
                jacksonTypeRef<RichGroupRequest>(),
            )

        assertThat(roundtrippedRichGroupRequest).isEqualTo(richGroupRequest)
    }
}
