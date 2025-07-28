// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.mdm.MdmCreateDistanceMatrixParams
import ai.nextbillion.models.mdm.MdmGetDistanceMatrixStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MdmServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun createDistanceMatrix() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mdmServiceAsync = client.mdm()

        val responseFuture =
            mdmServiceAsync.createDistanceMatrix(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun getDistanceMatrixStatus() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mdmServiceAsync = client.mdm()

        val responseFuture =
            mdmServiceAsync.getDistanceMatrixStatus(
                MdmGetDistanceMatrixStatusParams.builder().id("id").key("key=API_KEY").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
