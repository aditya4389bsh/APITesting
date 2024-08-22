package httprequestmethod;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class APIkeyAuth {
	
	@Test
	
	void authorization()
	{
		
		String apikey = "5dc88208098b4b61086193ee398f3f05";
		given()
			.queryParam("appid", apikey)
		
		.when()
			.get("https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99")
		
		
		.then()
			.log().all();
	}

}
