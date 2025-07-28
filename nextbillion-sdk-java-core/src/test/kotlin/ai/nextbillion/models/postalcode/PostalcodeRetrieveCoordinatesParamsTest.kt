// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.postalcode

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PostalcodeRetrieveCoordinatesParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        PostalcodeRetrieveCoordinatesParams.builder()
            .key("key=API_KEY")
            .at(PostalcodeRetrieveCoordinatesParams.At.builder().lat(0.0).lng(0.0).build())
            .country("country")
            .format(PostalcodeRetrieveCoordinatesParams.Format.GEOJSON)
            .postalcode("postalcode")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            PostalcodeRetrieveCoordinatesParams.builder()
                .key("key=API_KEY")
                .at(PostalcodeRetrieveCoordinatesParams.At.builder().lat(0.0).lng(0.0).build())
                .country("country")
                .format(PostalcodeRetrieveCoordinatesParams.Format.GEOJSON)
                .postalcode("postalcode")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PostalcodeRetrieveCoordinatesParams.builder().key("key=API_KEY").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            PostalcodeRetrieveCoordinatesParams.builder()
                .key("key=API_KEY")
                .at(PostalcodeRetrieveCoordinatesParams.At.builder().lat(0.0).lng(0.0).build())
                .country("country")
                .format(PostalcodeRetrieveCoordinatesParams.Format.GEOJSON)
                .postalcode("postalcode")
                .build()

        val body = params._body()

        assertThat(body.at())
            .contains(PostalcodeRetrieveCoordinatesParams.At.builder().lat(0.0).lng(0.0).build())
        assertThat(body.country()).contains("country")
        assertThat(body.format()).contains(PostalcodeRetrieveCoordinatesParams.Format.GEOJSON)
        assertThat(body.postalcode()).contains("postalcode")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = PostalcodeRetrieveCoordinatesParams.builder().key("key=API_KEY").build()

        val body = params._body()
    }
}
