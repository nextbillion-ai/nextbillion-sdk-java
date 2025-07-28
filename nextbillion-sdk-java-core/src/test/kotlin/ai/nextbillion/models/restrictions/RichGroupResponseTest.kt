// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.restrictions

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RichGroupResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val richGroupResponse =
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
                    JsonValue.from(listOf(listOf(0, 1), listOf(1, 2), listOf(3, 4), listOf(5, 6)))
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

        assertThat(richGroupResponse.id()).contains(0L)
        assertThat(richGroupResponse.area()).contains("area")
        assertThat(richGroupResponse._bbox())
            .isEqualTo(
                JsonValue.from(mapOf("minLat" to 0, "minLon" to 0, "maxLat" to 1, "maxLon" to 1))
            )
        assertThat(richGroupResponse.comment()).contains("comment")
        assertThat(richGroupResponse.createAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(richGroupResponse.direction()).contains(RichGroupResponse.Direction.FORWARD)
        assertThat(richGroupResponse.endTime()).contains(0.0)
        assertThat(richGroupResponse._geofence())
            .isEqualTo(
                JsonValue.from(listOf(listOf(0, 1), listOf(1, 2), listOf(3, 4), listOf(5, 6)))
            )
        assertThat(richGroupResponse.highway()).contains("highway")
        assertThat(richGroupResponse.mode().getOrNull()).containsExactly("string")
        assertThat(richGroupResponse.name()).contains("name")
        assertThat(richGroupResponse.repeatOn()).contains("Mo-Fr 07:00-09:00,17:00-19:00")
        assertThat(richGroupResponse.restrictionType())
            .contains(RichGroupResponse.RestrictionType.CLOSURE)
        assertThat(richGroupResponse.speed()).contains(0.0)
        assertThat(richGroupResponse.speedLimit()).contains(0.0)
        assertThat(richGroupResponse.startTime()).contains(0.0)
        assertThat(richGroupResponse.state()).contains(RichGroupResponse.State.ENABLED)
        assertThat(richGroupResponse.status()).contains(RichGroupResponse.Status.ACTIVE)
        assertThat(richGroupResponse.updateAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val richGroupResponse =
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
                    JsonValue.from(listOf(listOf(0, 1), listOf(1, 2), listOf(3, 4), listOf(5, 6)))
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

        val roundtrippedRichGroupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(richGroupResponse),
                jacksonTypeRef<RichGroupResponse>(),
            )

        assertThat(roundtrippedRichGroupResponse).isEqualTo(richGroupResponse)
    }
}
