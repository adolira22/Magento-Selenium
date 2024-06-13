package API;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestAPI {

    @Test
    public void getTest(){

        Response respone = get("https://reqres.in/api/users?page=2");
        System.out.println(respone.getStatusCode());
        System.out.println(respone.getBody().asString());

        given().get("https://reqres.in/api/users/2").then()
                .statusCode(200)
                .body("data.email", equalTo("janet.weaver@reqres.in"));


        Response response2 = given().get("https://reqres.in/api/users/2");
        JsonPath data = response2.jsonPath();

        System.out.println("Nombre " + data.get("data.first_name"));
        System.out.println("ID  " + data.get("data.id"));

    }

    @Test
    public void postTest() {

        JSONObject datos = new JSONObject();
        datos.put("name", "Adolfo");
        datos.put("job", "Developer");


        given().contentType("application/json").body(datos.toString())
                .when().post("https://reqres.in/api/users").then()
                .statusCode(201).body("name", equalTo("Adolfo"));



    }

    @Test
    public void putTest() {

        JSONObject datos = new JSONObject();
        datos.put("name", "Adolfo");
        datos.put("job", "Carpintero");


        given().contentType("application/json").body(datos.toString())
                .when().put("https://reqres.in/api/users/2").then()
                .statusCode(200).body("job", equalTo("Carpintero"));


    }

    @Test
    public void deleteTest() {

        given().delete("https://reqres.in/api/users/2").then()
                .statusCode(204);
    }
}
