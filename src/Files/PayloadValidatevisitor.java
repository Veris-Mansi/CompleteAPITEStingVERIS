package Files;

public class PayloadValidatevisitor {

	public static String validateVisitorMobile()
	{
		String s="{\r\n" + 
				"            \"visitor\":\"9993483676\",\r\n" + 
				"            \"action\": \"in\"\r\n" + 
				"}";
		return s;
	}
	
	public static String invalidMobile()
	{
		String s="{\r\n" + 
				"            \"visitor\":\"+91999348376\",\r\n" + 
				"            \"action\": \"in\"\r\n" + 
				"}";
		return s;
	}
	public static String invalidEmail()
	{
		String p="{\r\n" + 
				"            \"visitor\":\"m@dd\",\r\n" + 
				"            \"action\": \"in\"\r\n" + 
				"}";
		return p;
	}
	
	public static String validateVisitorEmail()
	{
		String s="{\r\n" + 
				"            \"visitor\":\"mansi.sahu@veris.in\",\r\n" + 
				"            \"action\": \"in\"\r\n" + 
				"}";
		return s;
	}
	public static String invalidQR()
	{
		String s="{\r\n" + 
				"            \"visitor\":\"bf21e4d9-5fec-4c36-84f5-bafe9f75e65d\",\r\n" + 
				"            \"action\": \"in\"\r\n" + 
				"}";
		return s;
	}
	public static String validQR()
	{
		String s="{\r\n" + 
				"            \"visitor\":\"75111903-af03-4c69-92e6-041ef81a7a47\",\r\n" + 
				"            \"action\": \"in\"\r\n" + 
				"}";
		return s;
	}
	public static String invalidActivity()
	{
		String s="{\r\n" + 
				"            \"visitor\":\"9993483676\",\r\n" + 
				"            \"action\": \"inqqqq\"\r\n" + 
				"}";
		return s;
	}
}
