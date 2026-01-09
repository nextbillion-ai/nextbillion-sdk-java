// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.services.async.skynet.asset

import ai.nextbillion.TestServerExtension
import ai.nextbillion.client.okhttp.NextbillionSdkOkHttpClientAsync
import ai.nextbillion.models.skynet.asset.event.EventListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            NextbillionSdkOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventServiceAsync = client.skynet().asset().event()

        val eventsFuture =
            eventServiceAsync.list(
                EventListParams.builder()
                    .id("id")
                    .key("key=API_KEY")
                    .cluster(EventListParams.Cluster.AMERICA)
                    .endTime(0L)
                    .monitorId("monitor_id")
                    .pn(0L)
                    .ps(100L)
                    .startTime(0L)
                    .build()
            )

        val events = eventsFuture.get()
        events.validate()
    }
}
