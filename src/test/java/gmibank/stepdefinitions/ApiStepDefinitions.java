package gmibank.stepdefinitions;

import gmibank.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.net.URI;

import static io.restassured.RestAssured.given;

public class ApiStepDefinitions {




    @Given("user go to api end point {string}")
        public void user_go_to_api_end_point (String string){

        String api_end_point = null;
        Response response=given().headers("Authorization","Bearer "+ConfigurationReader.getProperty("api_berare_token"),
                "Contente_Type",ContentType.JSON,
                "Accept",ContentType.JSON)
                .when()
                .get(api_end_point)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

            response.prettyPrint();
        }

        @Given("read all customer and sets create pojo class")
        public void read_all_customer_and_sets_create_pojo_class () {

        }

        @Then("validate data")
        public void validate_data () {

        }
    }