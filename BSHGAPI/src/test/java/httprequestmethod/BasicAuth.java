package httprequestmethod;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class BasicAuth {
	
	@Test
	
	void authorisation()
	{
		given()
			.auth().basic("postman", "password")
		
		.when()
			.get("https://postman-echo.com/basic-auth")
		
		.then()
			.log().all();
	}

}
