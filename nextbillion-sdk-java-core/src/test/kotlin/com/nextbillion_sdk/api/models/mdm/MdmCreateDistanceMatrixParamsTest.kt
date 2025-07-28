// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.models.mdm

import com.nextbillion_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MdmCreateDistanceMatrixParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        MdmCreateDistanceMatrixParams.builder()
            .key("key=API_KEY")
            .option(MdmCreateDistanceMatrixParams.Option.FLEXIBLE)
            .spliter(MdmCreateDistanceMatrixParams.Spliter.OD_NUMBER_SPLITER)
            .origins("origins")
            .area(MdmCreateDistanceMatrixParams.Area.SINGAPORE)
            .avoid(MdmCreateDistanceMatrixParams.Avoid.TOLL)
            .crossBorder(true)
            .departureTime(0L)
            .destinations("destinations")
            .destinationsApproach(MdmCreateDistanceMatrixParams.DestinationsApproach.UNRESTRICTED)
            .hazmatType(MdmCreateDistanceMatrixParams.HazmatType.GENERAL)
            .mode(MdmCreateDistanceMatrixParams.Mode.CAR)
            .originsApproach(MdmCreateDistanceMatrixParams.OriginsApproach.UNRESTRICTED)
            .routeType(MdmCreateDistanceMatrixParams.RouteType.FASTEST)
            .truckAxleLoad(0.0)
            .truckSize("\"truck_size\"=200,210,600")
            .truckWeight(0L)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            MdmCreateDistanceMatrixParams.builder()
                .key("key=API_KEY")
                .option(MdmCreateDistanceMatrixParams.Option.FLEXIBLE)
                .spliter(MdmCreateDistanceMatrixParams.Spliter.OD_NUMBER_SPLITER)
                .origins("origins")
                .area(MdmCreateDistanceMatrixParams.Area.SINGAPORE)
                .avoid(MdmCreateDistanceMatrixParams.Avoid.TOLL)
                .crossBorder(true)
                .departureTime(0L)
                .destinations("destinations")
                .destinationsApproach(
                    MdmCreateDistanceMatrixParams.DestinationsApproach.UNRESTRICTED
                )
                .hazmatType(MdmCreateDistanceMatrixParams.HazmatType.GENERAL)
                .mode(MdmCreateDistanceMatrixParams.Mode.CAR)
                .originsApproach(MdmCreateDistanceMatrixParams.OriginsApproach.UNRESTRICTED)
                .routeType(MdmCreateDistanceMatrixParams.RouteType.FASTEST)
                .truckAxleLoad(0.0)
                .truckSize("\"truck_size\"=200,210,600")
                .truckWeight(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("key", "key=API_KEY")
                    .put("option", "flexible")
                    .put("spliter", "od_number_spliter")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            MdmCreateDistanceMatrixParams.builder()
                .key("key=API_KEY")
                .option(MdmCreateDistanceMatrixParams.Option.FLEXIBLE)
                .origins("origins")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("key", "key=API_KEY").put("option", "flexible").build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            MdmCreateDistanceMatrixParams.builder()
                .key("key=API_KEY")
                .option(MdmCreateDistanceMatrixParams.Option.FLEXIBLE)
                .spliter(MdmCreateDistanceMatrixParams.Spliter.OD_NUMBER_SPLITER)
                .origins("origins")
                .area(MdmCreateDistanceMatrixParams.Area.SINGAPORE)
                .avoid(MdmCreateDistanceMatrixParams.Avoid.TOLL)
                .crossBorder(true)
                .departureTime(0L)
                .destinations("destinations")
                .destinationsApproach(
                    MdmCreateDistanceMatrixParams.DestinationsApproach.UNRESTRICTED
                )
                .hazmatType(MdmCreateDistanceMatrixParams.HazmatType.GENERAL)
                .mode(MdmCreateDistanceMatrixParams.Mode.CAR)
                .originsApproach(MdmCreateDistanceMatrixParams.OriginsApproach.UNRESTRICTED)
                .routeType(MdmCreateDistanceMatrixParams.RouteType.FASTEST)
                .truckAxleLoad(0.0)
                .truckSize("\"truck_size\"=200,210,600")
                .truckWeight(0L)
                .build()

        val body = params._body()

        assertThat(body.origins()).isEqualTo("origins")
        assertThat(body.area()).contains(MdmCreateDistanceMatrixParams.Area.SINGAPORE)
        assertThat(body.avoid()).contains(MdmCreateDistanceMatrixParams.Avoid.TOLL)
        assertThat(body.crossBorder()).contains(true)
        assertThat(body.departureTime()).contains(0L)
        assertThat(body.destinations()).contains("destinations")
        assertThat(body.destinationsApproach())
            .contains(MdmCreateDistanceMatrixParams.DestinationsApproach.UNRESTRICTED)
        assertThat(body.hazmatType()).contains(MdmCreateDistanceMatrixParams.HazmatType.GENERAL)
        assertThat(body.mode()).contains(MdmCreateDistanceMatrixParams.Mode.CAR)
        assertThat(body.originsApproach())
            .contains(MdmCreateDistanceMatrixParams.OriginsApproach.UNRESTRICTED)
        assertThat(body.routeType()).contains(MdmCreateDistanceMatrixParams.RouteType.FASTEST)
        assertThat(body.truckAxleLoad()).contains(0.0)
        assertThat(body.truckSize()).contains("\"truck_size\"=200,210,600")
        assertThat(body.truckWeight()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MdmCreateDistanceMatrixParams.builder()
                .key("key=API_KEY")
                .option(MdmCreateDistanceMatrixParams.Option.FLEXIBLE)
                .origins("origins")
                .build()

        val body = params._body()

        assertThat(body.origins()).isEqualTo("origins")
    }
}
