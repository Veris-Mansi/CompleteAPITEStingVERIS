package Files;

public class PayloaddataInvite {

	public static String createinvite()
	{
		String s="{\r\n" + 
				"  \"guests\": {\r\n" + 
				"    \"phones\": [\"+919035111511\"],\r\n" + 
				"    \"emails\": []\r\n" + 
				"  },\r\n" + 
				"  \"venue\": \"https://sandbox.veris.in/api/v2/venues/62/\",\r\n" + 
				"  \"valid_from\": \"2025-12-29T13:00:00Z\",\r\n" + 
				"  \"valid_till\": \"2027-05-28T15:00:00Z\"\r\n" + 
				"}";
		
		return s;
		
	}

	public static String createinviteEmail() {
		// TODO Auto-generated method stub
		
		String s="{\r\n" + 
				"  \"guests\": {\r\n" + 
				"    \"phones\": [],\r\n" + 
				"    \"emails\": [\"vihid@top-mailer.net\"]\r\n" + 
				"  },\r\n" + 
				"  \"venue\": \"https://sandbox.veris.in/api/v2/venues/62/\",\r\n" + 
				"  \"valid_from\": \"2025-12-29T13:00:00Z\",\r\n" + 
				"  \"valid_till\": \"2027-05-28T15:00:00Z\"\r\n" + 
				"}";
		return s;
	}
	public static String invalidEmail()
	{
		String s ="{\r\n" + 
				"  \"guests\": {\r\n" + 
				"    \"phones\": [],\r\n" + 
				"    \"emails\": [\"s\"]\r\n" + 
				"  },\r\n" + 
				"  \"venue\": \"https://sandbox.veris.in/api/v2/venues/62/\",\r\n" + 
				"  \"valid_from\": \"2025-05-24T13:00:00Z\",\r\n" + 
				"  \"valid_till\": \"2027-05-24T15:00:00Z\"\r\n" + 
				"}";
		return s;
	}

	public static String invalidPhone()
	{
		String s ="{\r\n" + 
				"  \"guests\": {\r\n" + 
				"    \"phones\": [\"+9199992222\"],\r\n" + 
				"    \"emails\": []\r\n" + 
				"  },\r\n" + 
				"  \"venue\": \"https://sandbox.veris.in/api/v2/venues/62/\",\r\n" + 
				"  \"valid_from\": \"2025-05-24T13:00:00Z\",\r\n" + 
				"  \"valid_till\": \"2027-05-24T15:00:00Z\"\r\n" + 
				"}";
		return s;
	}
	
	public static String invalidDate()
	{
		String s="{\r\n" + 
				"  \"guests\": {\r\n" + 
				"    \"phones\": [\"+919993483676\"],\r\n" + 
				"    \"emails\": []\r\n" + 
				"  },\r\n" + 
				"  \"venue\": \"https://sandbox.veris.in/api/v2/venues/62/\",\r\n" + 
				"  \"valid_from\": \"2019-05-24T13:00:00Z\",\r\n" + 
				"  \"valid_till\": \"2019-05-24T15:00:0Z\"\r\n" + 
				"}";
		return s;
	}
	public static String pastDatevalidFrom()
	{
		String s="{\r\n" + 
				"  \"guests\": {\r\n" + 
				"    \"phones\": [\"+919993483676\"],\r\n" + 
				"    \"emails\": []\r\n" + 
				"  },\r\n" + 
				"  \"venue\": \"https://sandbox.veris.in/api/v2/venues/62/\",\r\n" + 
				"  \"valid_from\": \"2019-05-22T13:00:00Z\",\r\n" + 
				"  \"valid_till\": \"2019-05-24T15:00:00Z\"\r\n" + 
				"}";
		return s;
	}
	public static String pastDatavalidTill()
	{
		String s="{\r\n" + 
				"  \"guests\": {\r\n" + 
				"    \"phones\": [\"+919993483676\"],\r\n" + 
				"    \"emails\": []\r\n" + 
				"  },\r\n" + 
				"  \"venue\": \"https://sandbox.veris.in/api/v2/venues/62/\",\r\n" + 
				"  \"valid_from\": \"2019-05-24T13:00:00Z\",\r\n" + 
				"  \"valid_till\": \"2018-05-22T15:00:00Z\"\r\n" + 
				"}";
		return s;
	}
}
