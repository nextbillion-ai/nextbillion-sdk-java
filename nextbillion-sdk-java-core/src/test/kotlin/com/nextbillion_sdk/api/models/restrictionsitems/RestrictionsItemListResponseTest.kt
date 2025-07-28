// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.restrictionsitems

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nextbillion_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RestrictionsItemListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val restrictionsItemListResponse =
            RestrictionsItemListResponse.builder()
                .id(0.0)
                .area("area")
                .coordinate(
                    RestrictionsItemListResponse.Coordinate.builder().lat(0.0).lon(0.0).build()
                )
                .groupId(0.0)
                .groupType(RestrictionsItemListResponse.GroupType.SEGMENT)
                .addMode(RestrictionsItemListResponse.Mode._0W)
                .repeatOn("repeat_on")
                .restrictionType(RestrictionsItemListResponse.RestrictionType.CLOSURE)
                .source(RestrictionsItemListResponse.Source.RRT)
                .state(RestrictionsItemListResponse.State.ENABLED)
                .status(RestrictionsItemListResponse.Status.ACTIVE)
                .build()

        assertThat(restrictionsItemListResponse.id()).isEqualTo(0.0)
        assertThat(restrictionsItemListResponse.area()).isEqualTo("area")
        assertThat(restrictionsItemListResponse.coordinate())
            .isEqualTo(RestrictionsItemListResponse.Coordinate.builder().lat(0.0).lon(0.0).build())
        assertThat(restrictionsItemListResponse.groupId()).isEqualTo(0.0)
        assertThat(restrictionsItemListResponse.groupType())
            .isEqualTo(RestrictionsItemListResponse.GroupType.SEGMENT)
        assertThat(restrictionsItemListResponse.mode())
            .containsExactly(RestrictionsItemListResponse.Mode._0W)
        assertThat(restrictionsItemListResponse.repeatOn()).isEqualTo("repeat_on")
        assertThat(restrictionsItemListResponse.restrictionType())
            .isEqualTo(RestrictionsItemListResponse.RestrictionType.CLOSURE)
        assertThat(restrictionsItemListResponse.source())
            .isEqualTo(RestrictionsItemListResponse.Source.RRT)
        assertThat(restrictionsItemListResponse.state())
            .isEqualTo(RestrictionsItemListResponse.State.ENABLED)
        assertThat(restrictionsItemListResponse.status())
            .isEqualTo(RestrictionsItemListResponse.Status.ACTIVE)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val restrictionsItemListResponse =
            RestrictionsItemListResponse.builder()
                .id(0.0)
                .area("area")
                .coordinate(
                    RestrictionsItemListResponse.Coordinate.builder().lat(0.0).lon(0.0).build()
                )
                .groupId(0.0)
                .groupType(RestrictionsItemListResponse.GroupType.SEGMENT)
                .addMode(RestrictionsItemListResponse.Mode._0W)
                .repeatOn("repeat_on")
                .restrictionType(RestrictionsItemListResponse.RestrictionType.CLOSURE)
                .source(RestrictionsItemListResponse.Source.RRT)
                .state(RestrictionsItemListResponse.State.ENABLED)
                .status(RestrictionsItemListResponse.Status.ACTIVE)
                .build()

        val roundtrippedRestrictionsItemListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(restrictionsItemListResponse),
                jacksonTypeRef<RestrictionsItemListResponse>(),
            )

        assertThat(roundtrippedRestrictionsItemListResponse).isEqualTo(restrictionsItemListResponse)
    }
}
