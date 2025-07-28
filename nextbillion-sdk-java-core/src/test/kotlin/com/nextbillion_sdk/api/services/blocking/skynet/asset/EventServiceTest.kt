// File generated from our OpenAPI spec by Stainless.

package com.nextbillion_sdk.api.services.blocking.skynet.asset

import com.nextbillion_sdk.api.TestServerExtension
import com.nextbillion_sdk.api.client.okhttp.NextbillionSdkOkHttpClient
import com.nextbillion_sdk.api.models.skynet.asset.event.EventListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            NextbillionSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventService = client.skynet().asset().event()

        val events =
            eventService.list(
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

        events.validate()
    }
}
