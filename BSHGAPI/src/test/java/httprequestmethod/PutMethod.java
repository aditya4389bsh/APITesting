package httprequestmethod;

import java.util.HashMap;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class PutMethod {
	
	@Test
	
	void modifydata()
	{
		HashMap Mdata = new HashMap();
		
		Mdata.put("name", "George");
		Mdata.put("job", "Gardener");
		
		given()
			.contentType("application/json; charset=utf-8")
			.body(Mdata)
		
		.when()
			.put("https://reqres.in/api/users/229")
		
		.then()
			.log().all();
	}

}
