// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.blocking

import io.nextbillion.api.TestServerExtension
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClient
import io.nextbillion.api.models.mdm.MdmCreateDistanceMatrixParams
import io.nextbillion.api.models.mdm.MdmGetDistanceMatrixStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MdmServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createDistanceMatrix() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mdmService = client.mdm()

        val response =
            mdmService.createDistanceMatrix(
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
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getDistanceMatrixStatus() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mdmService = client.mdm()

        val response =
            mdmService.getDistanceMatrixStatus(
                MdmGetDistanceMatrixStatusParams.builder().id("id").key("key=API_KEY").build()
            )

        response.validate()
    }
}
