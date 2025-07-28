// File generated from our OpenAPI spec by Stainless.

package ai.nextbillion.models.multigeocode

import ai.nextbillion.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MultigeocodeSearchParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        MultigeocodeSearchParams.builder()
            .key("key=API_KEY")
            .at(MultigeocodeSearchParams.At.builder().lat(0.0).lng(0.0).build())
            .query("“query”: “Taj Mahal”")
            .city("“city”: “Glendale”")
            .country("“country”:”IND”")
            .district("“district”: “City Center”")
            .limit(0L)
            .radius("“radius”: “10m”")
            .state("“state”: “California”")
            .street("“street”: “Americana Way”")
            .subDistrict("“subDistrict”: “Golkonda”")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParams() {
        val params =
            MultigeocodeSearchParams.builder()
                .key("key=API_KEY")
                .at(MultigeocodeSearchParams.At.builder().lat(0.0).lng(0.0).build())
                .query("“query”: “Taj Mahal”")
                .city("“city”: “Glendale”")
                .country("“country”:”IND”")
                .district("“district”: “City Center”")
                .limit(0L)
                .radius("“radius”: “10m”")
                .state("“state”: “California”")
                .street("“street”: “Americana Way”")
                .subDistrict("“subDistrict”: “Golkonda”")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            MultigeocodeSearchParams.builder()
                .key("key=API_KEY")
                .at(MultigeocodeSearchParams.At.builder().lat(0.0).lng(0.0).build())
                .query("“query”: “Taj Mahal”")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("key", "key=API_KEY").build())
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            MultigeocodeSearchParams.builder()
                .key("key=API_KEY")
                .at(MultigeocodeSearchParams.At.builder().lat(0.0).lng(0.0).build())
                .query("“query”: “Taj Mahal”")
                .city("“city”: “Glendale”")
                .country("“country”:”IND”")
                .district("“district”: “City Center”")
                .limit(0L)
                .radius("“radius”: “10m”")
                .state("“state”: “California”")
                .street("“street”: “Americana Way”")
                .subDistrict("“subDistrict”: “Golkonda”")
                .build()

        val body = params._body()

        assertThat(body.at())
            .isEqualTo(MultigeocodeSearchParams.At.builder().lat(0.0).lng(0.0).build())
        assertThat(body.query()).isEqualTo("“query”: “Taj Mahal”")
        assertThat(body.city()).contains("“city”: “Glendale”")
        assertThat(body.country()).contains("“country”:”IND”")
        assertThat(body.district()).contains("“district”: “City Center”")
        assertThat(body.limit()).contains(0L)
        assertThat(body.radius()).contains("“radius”: “10m”")
        assertThat(body.state()).contains("“state”: “California”")
        assertThat(body.street()).contains("“street”: “Americana Way”")
        assertThat(body.subDistrict()).contains("“subDistrict”: “Golkonda”")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MultigeocodeSearchParams.builder()
                .key("key=API_KEY")
                .at(MultigeocodeSearchParams.At.builder().lat(0.0).lng(0.0).build())
                .query("“query”: “Taj Mahal”")
                .build()

        val body = params._body()

        assertThat(body.at())
            .isEqualTo(MultigeocodeSearchParams.At.builder().lat(0.0).lng(0.0).build())
        assertThat(body.query()).isEqualTo("“query”: “Taj Mahal”")
    }
}
