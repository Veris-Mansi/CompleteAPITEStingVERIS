package InviteTesting;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import Files.ResourcesPortalLogin;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetVenuesListforInvite {

	String token=ResourcesPortalLogin.portalLogin();
	String invalid_token="19fbca94eb937121ee1446d164b851b9d13f04a";	
	public void invalidToken()
	{
		RestAssured.baseURI="https://sandbox.veris.in";
		Response res =given().
		headers("Content-Type","application/json").headers("Authorization","token "+invalid_token).
		when().post("/api/v2/venues/").
		then().assertThat().statusCode(401).and().body("detail", equalTo("Invalid token.")).extract().response();
	}
	
	@Test(groups="Getting All Invites")
	public void gettingVenuesListPortalUser()
	{
		RestAssured.baseURI="https://sandbox.veris.in";
		Response res =given().
		headers("Content-Type","application/json").headers("Authorization","token "+token).
		when().get("/api/v2/venues/").
		then().assertThat().statusCode(200).extract().response();
		String response = res.asString();
		JsonPath path = new JsonPath(response);
		System.out.println("Response "+response);
		String count=path.getString("count");
		System.out.println("count"+count);
	}
}
