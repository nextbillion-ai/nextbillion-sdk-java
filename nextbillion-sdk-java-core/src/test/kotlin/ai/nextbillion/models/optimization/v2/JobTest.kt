// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.optimization.v2

import ai.nextbillion.core.JsonValue
import ai.nextbillion.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val job =
            Job.builder()
                .id("\"id\":\"Job 1\"")
                .locationIndex(0L)
                .addDelivery(0L)
                .addDepotId("string")
                .description("description")
                .followLifoOrder(true)
                .addIncompatibleLoadType("string")
                .jointOrder(0L)
                .addLoadType("string")
                .maxVisitLateness(0L)
                .metadata(
                    JsonValue.from("{\n  \"contact\": \"212-456-7890\",\n  \"metaId\": 1234\n}")
                )
                .outsourcingCost(0L)
                .addPickup(0L)
                .priority(0L)
                .revenue(0L)
                .sequenceOrder(0L)
                .service(0L)
                .setup(0L)
                .addSkill(1L)
                .addTimeWindow(listOf(0L))
                .volume(
                    Job.Volume.builder()
                        .alignment(Job.Volume.Alignment.STRICT)
                        .depth(0.0)
                        .height(0.0)
                        .width(0.0)
                        .build()
                )
                .addZone(0L)
                .build()

        assertThat(job.id()).isEqualTo("\"id\":\"Job 1\"")
        assertThat(job.locationIndex()).isEqualTo(0L)
        assertThat(job.delivery().getOrNull()).containsExactly(0L)
        assertThat(job.depotIds().getOrNull()).containsExactly("string")
        assertThat(job.description()).contains("description")
        assertThat(job.followLifoOrder()).contains(true)
        assertThat(job.incompatibleLoadTypes().getOrNull()).containsExactly("string")
        assertThat(job.jointOrder()).contains(0L)
        assertThat(job.loadTypes().getOrNull()).containsExactly("string")
        assertThat(job.maxVisitLateness()).contains(0L)
        assertThat(job._metadata())
            .isEqualTo(JsonValue.from("{\n  \"contact\": \"212-456-7890\",\n  \"metaId\": 1234\n}"))
        assertThat(job.outsourcingCost()).contains(0L)
        assertThat(job.pickup().getOrNull()).containsExactly(0L)
        assertThat(job.priority()).contains(0L)
        assertThat(job.revenue()).contains(0L)
        assertThat(job.sequenceOrder()).contains(0L)
        assertThat(job.service()).contains(0L)
        assertThat(job.setup()).contains(0L)
        assertThat(job.skills().getOrNull()).containsExactly(1L)
        assertThat(job.timeWindows().getOrNull()).containsExactly(listOf(0L))
        assertThat(job.volume())
            .contains(
                Job.Volume.builder()
                    .alignment(Job.Volume.Alignment.STRICT)
                    .depth(0.0)
                    .height(0.0)
                    .width(0.0)
                    .build()
            )
        assertThat(job.zones().getOrNull()).containsExactly(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val job =
            Job.builder()
                .id("\"id\":\"Job 1\"")
                .locationIndex(0L)
                .addDelivery(0L)
                .addDepotId("string")
                .description("description")
                .followLifoOrder(true)
                .addIncompatibleLoadType("string")
                .jointOrder(0L)
                .addLoadType("string")
                .maxVisitLateness(0L)
                .metadata(
                    JsonValue.from("{\n  \"contact\": \"212-456-7890\",\n  \"metaId\": 1234\n}")
                )
                .outsourcingCost(0L)
                .addPickup(0L)
                .priority(0L)
                .revenue(0L)
                .sequenceOrder(0L)
                .service(0L)
                .setup(0L)
                .addSkill(1L)
                .addTimeWindow(listOf(0L))
                .volume(
                    Job.Volume.builder()
                        .alignment(Job.Volume.Alignment.STRICT)
                        .depth(0.0)
                        .height(0.0)
                        .width(0.0)
                        .build()
                )
                .addZone(0L)
                .build()

        val roundtrippedJob =
            jsonMapper.readValue(jsonMapper.writeValueAsString(job), jacksonTypeRef<Job>())

        assertThat(roundtrippedJob).isEqualTo(job)
    }
}
