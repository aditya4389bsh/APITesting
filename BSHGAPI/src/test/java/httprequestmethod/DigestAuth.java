package httprequestmethod;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DigestAuth {

	@Test
	void authorisation()
	{
		given()
			.auth().digest("postman", "password")
		.when()
			.get("https://postman-echo.com/digest-auth")
		
		.then()
			.log().all();
	}
}
