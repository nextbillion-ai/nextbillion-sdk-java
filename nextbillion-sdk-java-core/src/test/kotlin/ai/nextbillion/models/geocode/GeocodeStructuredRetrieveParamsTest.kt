// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.geocode

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeocodeStructuredRetrieveParamsTest {

    @Test
    fun create() {
        GeocodeStructuredRetrieveParams.builder()
            .countryCode("countryCode")
            .key("key=API_KEY")
            .at("at=52.5308,13.3856")
            .city("city")
            .county("county")
            .houseNumber("houseNumber")
            .in_("in=circle:52.53,13.38;r=10000")
            .limit(0L)
            .postalCode("postalCode")
            .state("state")
            .street("street")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            GeocodeStructuredRetrieveParams.builder()
                .countryCode("countryCode")
                .key("key=API_KEY")
                .at("at=52.5308,13.3856")
                .city("city")
                .county("county")
                .houseNumber("houseNumber")
                .in_("in=circle:52.53,13.38;r=10000")
                .limit(0L)
                .postalCode("postalCode")
                .state("state")
                .street("street")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("countryCode", "countryCode")
                    .put("key", "key=API_KEY")
                    .put("at", "at=52.5308,13.3856")
                    .put("city", "city")
                    .put("county", "county")
                    .put("houseNumber", "houseNumber")
                    .put("in", "in=circle:52.53,13.38;r=10000")
                    .put("limit", "0")
                    .put("postalCode", "postalCode")
                    .put("state", "state")
                    .put("street", "street")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            GeocodeStructuredRetrieveParams.builder()
                .countryCode("countryCode")
                .key("key=API_KEY")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("countryCode", "countryCode")
                    .put("key", "key=API_KEY")
                    .build()
            )
    }
}
