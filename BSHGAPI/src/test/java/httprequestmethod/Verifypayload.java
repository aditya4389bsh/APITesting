package httprequestmethod;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class Verifypayload {
	
	@Test
	void verifyID()
	{
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		
		.then()
			.log().all()
			.body("data[0].id", equalTo(7))
			.body("page", equalTo(2));
	}

}