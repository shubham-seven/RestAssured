package crudoperations;



import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetListUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step1:Send the Request
	Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
	
	//Step2:Log the Response
			resp.then().log().all();
	}

}
