package crudoperations;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step1:Create data/reuestbody reuired
		JSONObject j = new JSONObject();
		j.put("name", "shubham");
		j.put("job", "ApiAutomation");
		
		//Step2:Send the Request
	    RequestSpecification req = RestAssured.given();
	    req.body(j);
	    req.contentType(ContentType.JSON);
	Response resp = req.post("https://reqres.in/api/users");
		
	//Step3:Log the Response
		resp.then().log().all();
	
	}

}
