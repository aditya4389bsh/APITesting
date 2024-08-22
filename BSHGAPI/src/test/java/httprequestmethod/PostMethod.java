package httprequestmethod;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.util.HashMap;

public class PostMethod {
	@Test

	void addDatat() 
	{
		HashMap data = new HashMap();
		data.put("nama", "George");
		data.put("job", "Teacher");
		
		given()
			.contentType("application/json; charset=utf-8")
			.body(data)
			
		.when()
			.post("https://reqres.in/api/users")
			
		.then()
			.log().all();
	}

}
