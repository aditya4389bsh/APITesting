package httprequestmethod;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DeleteMethod {
	
	@Test
	
	void Deletedata()
	{
		given()
		
		.when()
			.delete("https://reqres.in/api/users/229")
		
		.then()
			.log().all();
	}

}
