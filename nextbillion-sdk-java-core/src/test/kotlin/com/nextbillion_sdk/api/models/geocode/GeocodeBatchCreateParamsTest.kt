// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.geocode

import com.nextbillion_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GeocodeBatchCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        GeocodeBatchCreateParams.builder()
            .key("key=API_KEY")
            .addBody(
                GeocodeBatchCreateParams.Body.builder()
                    .q("\"q\":\"125, Berliner, berlin\"")
                    .at("\"at\": \"52.5308,13.3856\"")
                    .in_("\"in\":\"countryCode:CAN,MEX,USA\"")
                    .lang("\"lang\":\"en\"")
                    .limit(0L)
                    .build()
            )
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            GeocodeBatchCreateParams.builder()
                .key("key=API_KEY")
                .addBody(
                    GeocodeBatchCreateParams.Body.builder()
                        .q("\"q\":\"125, Berliner, berlin\"")
                        .at("\"at\": \"52.5308,13.3856\"")
                        .in_("\"in\":\"countryCode:CAN,MEX,USA\"")
                        .lang("\"lang\":\"en\"")
                        .limit(0L)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            GeocodeBatchCreateParams.builder()
                .key("key=API_KEY")
                .addBody(
                    GeocodeBatchCreateParams.Body.builder()
                        .q("\"q\":\"125, Berliner, berlin\"")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            GeocodeBatchCreateParams.builder()
                .key("key=API_KEY")
                .addBody(
                    GeocodeBatchCreateParams.Body.builder()
                        .q("\"q\":\"125, Berliner, berlin\"")
                        .at("\"at\": \"52.5308,13.3856\"")
                        .in_("\"in\":\"countryCode:CAN,MEX,USA\"")
                        .lang("\"lang\":\"en\"")
                        .limit(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                GeocodeBatchCreateParams.Body.builder()
                    .q("\"q\":\"125, Berliner, berlin\"")
                    .at("\"at\": \"52.5308,13.3856\"")
                    .in_("\"in\":\"countryCode:CAN,MEX,USA\"")
                    .lang("\"lang\":\"en\"")
                    .limit(0L)
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GeocodeBatchCreateParams.builder()
                .key("key=API_KEY")
                .addBody(
                    GeocodeBatchCreateParams.Body.builder()
                        .q("\"q\":\"125, Berliner, berlin\"")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                GeocodeBatchCreateParams.Body.builder().q("\"q\":\"125, Berliner, berlin\"").build()
            )
    }
}
