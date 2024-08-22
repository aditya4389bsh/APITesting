package httprequestmethod;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class BereartokenAuth {
	
	@Test
	
	void authorisation()
	{
		
		String token = "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";
		given()
			.header("Authorizaton", "Bearer"+token)
		
		.when()
			.get("https://api.github.com/user/repos")
		
		.then()
			.log().all();
	}

}
