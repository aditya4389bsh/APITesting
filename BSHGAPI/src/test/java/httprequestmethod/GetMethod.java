package httprequestmethod;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetMethod {

	@Test
	void getdata()
	{
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		
		.then()
			.log().all();
	
	}
}
