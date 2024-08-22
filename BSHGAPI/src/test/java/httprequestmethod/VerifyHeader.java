package httprequestmethod;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class VerifyHeader {
	
	@Test
	
	void verifyContentType()
	{
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		
		.then()
			.log().all()
			.header("Content-Type", "application/json; charset=utf-8");		
	}

}
