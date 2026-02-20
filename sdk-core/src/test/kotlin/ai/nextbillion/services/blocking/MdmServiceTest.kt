// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.blocking

import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClient
import ai.nextbillion.models.mdm.MdmCreateDistanceMatrixParams
import ai.nextbillion.models.mdm.MdmGetDistanceMatrixStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MdmServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createDistanceMatrix() {
        val client = NextbillionSdkOkHttpClient.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDistanceMatrixStatus() {
        val client = NextbillionSdkOkHttpClient.builder().apiKey("My API Key").build()
        val mdmService = client.mdm()

        val response =
            mdmService.getDistanceMatrixStatus(
                MdmGetDistanceMatrixStatusParams.builder().id("id").key("key=API_KEY").build()
            )

        response.validate()
    }
}
