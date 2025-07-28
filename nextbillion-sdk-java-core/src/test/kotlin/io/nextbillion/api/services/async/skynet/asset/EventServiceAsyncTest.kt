// File generated from our OpenAPI spec by Stainless.

package io.nextbillion.api.services.async.skynet.asset

import io.nextbillion.api.TestServerExtension
import io.nextbillion.api.client.okhttp.NextbillionSdkOkHttpClientAsync
import io.nextbillion.api.models.skynet.asset.event.EventListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
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
