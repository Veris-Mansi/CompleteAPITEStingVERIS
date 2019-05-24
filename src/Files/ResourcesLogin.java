package Files;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ResourcesLogin {

	public static String login()
	{
		RestAssured.baseURI="https://sandbox.veris.in";
		Response res =given().
				headers("Content-Type","application/json").
				body(PayloaddataTerminallogin.terminalLogin()).
				when().post("/api/v2/gatekeeper-login/").
				then().assertThat().statusCode(200).and().extract().response();

		String response = res.asString();

		JsonPath path = new JsonPath(response);
		System.out.println("Response "+response);
		String token=path.getString("token");
		System.out.println("token "+token);
		return token;
	}
}
