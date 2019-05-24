package Validatevisitor;
//valid mobile no
//valid email
//invalid email
//invalid phone
//checkin(phone)
//check-out(phone)
//general(phone)
//validQRcode(phone)
//invalidqrcode(phone)

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;
import Files.ResourcesLogin;
import Files.PayloaddataInvite;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class TerminalLogin {

	String token="";
	String invalid_token="291b12850a914d0dba55bd5aa62b16d3769797";
	@Test(groups="TerminalLogin")
	public void terminalLogin()
	{
		token=ResourcesLogin.login();
		
	}
	@Test(groups="TerminalLogin")
	public void terminalinvalidToken()
	{
		RestAssured.baseURI="https://sandbox.veris.in";
		Response res =given().
		headers("Content-Type","application/json").headers("Authorization","gatekeeper "+invalid_token).
		when().post("/api/v2/gatekeeper-login/").
		then().assertThat().statusCode(401).and().body("detail", equalTo("Invalid token.")).extract().response();
	}
}
