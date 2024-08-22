package httprequestmethod;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class VerifyStatuscode {
	
	@Test
	
	void verifystatus200()
	{
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		
		.then()
			.log().all()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK");
		
	}

}
