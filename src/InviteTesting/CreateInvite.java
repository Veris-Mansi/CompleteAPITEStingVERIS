package InviteTesting;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.Map;

import org.testng.annotations.Test;
//1 invalid token
//create invite right format(phone only)
//invalid date(email only)
//create invite at past
//create invite with wrong format

import Files.PayloaddataInvite;
import Files.ResourcesPortalLogin;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateInvite {

	String token=ResourcesPortalLogin.portalLogin();
	String invalid_token="19fbca94eb937121ee1446d164b851b9d13f04a";	
	String not_allowed_token="37861fd59be46f7211b9316b1bdb5b8794b9c750";
	@Test(groups="createInvite")
	public void invalidToken()
	{
		RestAssured.baseURI="https://sandbox.veris.in";
		Response res =given().
				headers("Content-Type","application/json").headers("Authorization","token "+invalid_token).
				when().post("/api/v2/passes/").
				then().assertThat().statusCode(401).and().body("detail", equalTo("Invalid token.")).extract().response();
	}

	@Test(groups="createInvite")
	public void createInviteInvalidPhone()
	{

		RestAssured.baseURI="https://sandbox.veris.in";
		Response res =given().
				headers("Content-Type","application/json").headers("Authorization","token "+token).
				body(PayloaddataInvite.invalidEmail()).
				when().post("/api/v2/passes/").
				then().assertThat().statusCode(400).and().extract().response();

		String response = res.asString();

		JsonPath path = new JsonPath(response);
		System.out.println("Response "+response);

	}
	
	@Test(groups="createInvite")
	public void createInviteIncorrectDate()
	{

		RestAssured.baseURI="https://sandbox.veris.in";
		Response res =given().
				headers("Content-Type","application/json").headers("Authorization","token "+token).
				body(PayloaddataInvite.invalidDate()).
				when().post("/api/v2/passes/").
				then().assertThat().statusCode(400).and().extract().response();

		String response = res.asString();

		JsonPath path = new JsonPath(response);
		System.out.println("Response "+response);

	}

	@Test(groups="createInvite")
	public void createInvitePastvalidTill()
	{

		RestAssured.baseURI="https://sandbox.veris.in";
		Response res =given().
				headers("Content-Type","application/json").headers("Authorization","token "+token).
				body(PayloaddataInvite.pastDatavalidTill()).
				when().post("/api/v2/passes/").
				then().assertThat().statusCode(400).and().extract().response();

		String response = res.asString();

		JsonPath path = new JsonPath(response);
		System.out.println("Response "+response);

	}
	
	
	@Test(groups="createInvite")
	public void createInviteInvalidEmail()
	{

		RestAssured.baseURI="https://sandbox.veris.in";
		Response res =given().
				headers("Content-Type","application/json").headers("Authorization","token "+token).
				body(PayloaddataInvite.invalidEmail()).
				when().post("/api/v2/passes/").
				then().assertThat().statusCode(400).and().extract().response();

		String response = res.asString();

		JsonPath path = new JsonPath(response);
		System.out.println("Response "+response);
	}

	@Test(groups="createInvite")
	public void createInviteEmail()
	{
		RestAssured.baseURI="https://sandbox.veris.in";
		Response res =given().
				headers("Content-Type","application/json").headers("Authorization","token "+token).
				body(PayloaddataInvite.createinviteEmail()).
				when().post("/api/v2/passes/").
				then().assertThat().statusCode(201).and().extract().response();

		String response = res.asString();

		JsonPath path = new JsonPath(response);
		System.out.println("Response "+response);
		String _id=path.getString("_id");
		System.out.println("_id "+_id);

	}

	@Test(groups="createInvite")
	public void createInvitePhone()
	{
		RestAssured.baseURI="https://sandbox.veris.in";
		Response res =given().
				headers("Content-Type","application/json").headers("Authorization","token "+token).
				body(PayloaddataInvite.createinvite()).
				when().post("/api/v2/passes/").
				then().assertThat().statusCode(201).and().extract().response();

		String response = res.asString();

		JsonPath path = new JsonPath(response);
		System.out.println("Response "+response);
		String _id=path.getString("_id");
		System.out.println("_id "+_id);

	}
	@Test(groups="createInvite")
	public void NopermissioncreateInvitePhone()
	{
		RestAssured.baseURI="https://sandbox.veris.in";
		Response res =given().
				headers("Content-Type","application/json").headers("Authorization","token "+not_allowed_token).
				body(PayloaddataInvite.createinvite()).
				when().post("/api/v2/passes/").
				then().assertThat().statusCode(400).body("venue[0]", equalTo("Not allowed to create pass for this venue.")).and().extract().response();

		String response = res.asString();

		JsonPath path = new JsonPath(response);
		System.out.println("Response "+response);
		

	}

	
}
