package crudoperations;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step1:Send the Request
	Response resp = RestAssured.delete("https://reqres.in/api/users/2");
	
	//Step2:Log the Response
			resp.then().log().all();
	}

}
