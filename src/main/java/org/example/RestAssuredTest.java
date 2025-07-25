package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssuredTest {
    public static void main(String[] args) {
        System.out.println("this is RestAssured Test");

        RestAssuredTest test = new RestAssuredTest();
//        test.restAssured_Get_Request_test();
//        test.restAssured_Post_Request_test();
//        test.restAssured_Put_Request_test();
        test.restAssured_Delete_Request_test();

    }

    public void restAssured_Get_Request_test () {
        RestAssured.baseURI = "https://api.restful-api.dev";

        Response response = given().when().get("/objects/7");
        int statuscode = response.getStatusCode();
        System.out.println("statuscode = " +  statuscode);
        String responsebody = response.getBody().asString();
        System.out.println("responsebody: " + responsebody);
    }

    public void restAssured_Post_Request_test () {
        RestAssured.baseURI = "https://api.restful-api.dev";

        String requestBody = "{\n" +
                "   \"name\": \"Apple MacBook Pro 16\",\n" +
                "   \"data\": {\n" +
                "      \"year\": 2019,\n" +
                "      \"price\": 1849.99,\n" +
                "      \"CPU model\": \"Intel Core i9\",\n" +
                "      \"Hard disk size\": \"1 TB\"\n" +
                "   }\n" +
                "}";

        Map<String, String> requestBodyMap = new HashMap<String, String>();
        requestBodyMap.put("name", "Jane Doe");
        requestBodyMap.put("email", "jane.doe@example.com");

        Response response = given()
                .header("Content-Type", "application/json")
                .and() // Optional, for readability
                .body(requestBody) // or requestBodyMap, or user object
                .when()
                .post("/objects") // Example endpoint
                .then()
                .extract().response();

        int statuscode = response.getStatusCode();
        System.out.println("statuscode = " +  statuscode);
        String responsebody = response.getBody().asString();
        System.out.println("responsebody: " + responsebody);
    }

    public void restAssured_Put_Request_test () {
        RestAssured.baseURI = "https://api.restful-api.dev";

        String requestBody = "{\n" +
                "   \"name\": \"Apple MacBook Pro 16\",\n" +
                "   \"data\": {\n" +
                "      \"year\": 2019,\n" +
                "      \"price\": 1849.99,\n" +
                "      \"CPU model\": \"Intel Core i9\",\n" +
                "      \"Hard disk size\": \"1 TB\"\n" +
                "   }\n" +
                "}";

        Map<String, String> requestBodyMap = new HashMap<String, String>();
        requestBodyMap.put("name", "Jane Doe");
        requestBodyMap.put("email", "jane.doe@example.com");

        Response response = given()
                .header("Content-Type", "application/json")
                .and() // Optional, for readability
                .body(requestBody) // or requestBodyMap, or user object
                .when()
                .put("/objects") // Example endpoint
                .then()
                .extract().response();

        int statuscode = response.getStatusCode();
        System.out.println("statuscode = " +  statuscode);
        String responsebody = response.getBody().asString();
        System.out.println("responsebody: " + responsebody);
    }

    public void restAssured_Delete_Request_test () {
        RestAssured.baseURI = "https://api.restful-api.dev";

        Response response = given().when().delete("/objects/7");
        int statuscode = response.getStatusCode();
        System.out.println("statuscode = " +  statuscode);
        String responsebody = response.getBody().asString();
        System.out.println("responsebody: " + responsebody);
    }


}
