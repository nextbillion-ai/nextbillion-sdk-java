// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.revgeocode

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RevgeocodeRetrieveParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        RevgeocodeRetrieveParams.builder()
            .at("at=52.5308,13.3856")
            .key("key=API_KEY")
            .in_("in=countryCode:CAN,MEX,USA")
            .lang("lang=en")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            RevgeocodeRetrieveParams.builder()
                .at("at=52.5308,13.3856")
                .key("key=API_KEY")
                .in_("in=countryCode:CAN,MEX,USA")
                .lang("lang=en")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("at", "at=52.5308,13.3856")
                    .put("key", "key=API_KEY")
                    .put("in", "in=countryCode:CAN,MEX,USA")
                    .put("lang", "lang=en")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RevgeocodeRetrieveParams.builder().at("at=52.5308,13.3856").key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("at", "at=52.5308,13.3856")
                    .put("key", "key=API_KEY")
                    .build()
            )
    }
}
