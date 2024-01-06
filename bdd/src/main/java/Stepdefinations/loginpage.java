package Stepdefinations;

import org.openqa.selenium.WebDriver;
import Stepdefinations.HelpersClass;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.json.JSONArray;
import org.json.JSONObject;


public class loginpage {
	
	 WebDriver driver;
	 
	 public  loginpage()
	 {
		 driver = HelpersClass.getDriver();
	 }
	 public static Response res ;
	 JSONObject data = new JSONObject();
	 private static final String USER_ID = "9b5f49ab-eea9-45f4-9d66-bcf56a531b85";
		private static final String USERNAME = "TOOLSQA-Test";
		private static final String PASSWORD = "Test@@123";
		private static final String BASE_URL = "https://bookstore.toolsqa.com";

		private static String token;
		private static Response response;
		private static String jsonString;
		private static String bookId;


		@Given("I am an authorized user")
		public void get_token() {
			RestAssured.baseURI= BASE_URL;
			JSONObject obj = new JSONObject();
			obj.put("userName",USERNAME);
			obj.put("password",PASSWORD);
			
			
			RequestSpecification  req = RestAssured.given();
			req.header("Content-Type", "application/json");
			
			
			Response res = req.body(obj.toString())
					.post("/Account/v1/GenerateToken");
		token = res.jsonPath().getString("token");
		System.out.println("token :"+token);
			
		}
		
		@Given("A list of books are available")	
		public void list_books() {
			RestAssured.baseURI=BASE_URL;	
			
			RequestSpecification req = RestAssured.given();
			req.header("Content-Type", "application/json");
			Response res = req.get("/BookStore/v1/Books");
			
			List<Object> lt = res.jsonPath().get("books");
			System.out.println("response :" + lt.size());
				
		}
		
		@When ("I add a book to my reading list")
		public void adding_book(){
			RestAssured.baseURI="https://reqres.in/api";	
			
			JSONObject json = new JSONObject();
					JSONObject json1 = new JSONObject();
					JSONArray jar = new JSONArray();
					jar.put(json1);
			//json1.put("isbn","9781593277574");
			//json1.put("title","Understanding api automtion");
					json1.put("id","99");
					json1.put("email","george.bluth@reqres.in");
			
			
//json.put("userId",USER_ID);

json.put("data",jar);
			RequestSpecification req = RestAssured.given();
			req.header("Content-Type","Application/json");
			Response res =
			req.body(json.toString()).put("/users/99");
			
			System.out.println("response :" + res.asPrettyString());
			System.out.println("response code:" + res.getStatusCode());
			System.out.println("response line:" + res.getStatusLine());
			
			
		}
	 
	 @Given("user setup driver")
	 public void user_setup_driver() {
	     // Write code here that turns the phrase above into concrete actions
		// System.setProperty("webdriver.chrome.driver","D:\\Download\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		//	driver = new ChromeDriver();
		driver = HelpersClass.getDriver();
	 }
	
	@Given("^User already in login \"(.*)\"$")
	public void user_already_in_login_page(String page) throws InterruptedException{
	
		
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Testing");
	 driver.get(page);

	}

	@When("^User enter the details$")
	public void user_enter_the_details(){
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Testing");
	}

	@Then("^User validate the details$")
	public void user_validate_the_details(){
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Testing");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getPageSource());
	}
	
	@Given("User is in home page")
	public void user_is_in_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://mail.google.com/");
	}
	
	
	@Given("User send the Get Request")
	public void user_send_the_get_request() {
	    // Write code here that turns the phrase above into concrete action
		 	RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
         res = /*given()
        	.contentType("ContentType.JSON")
        	.when()
        	.get("/posts")
        	.then()
        	.extract().response();*/
        		 given()
        		 .contentType(ContentType.JSON)
                 .param("postId", "2")
                 .when()
                 .get("/comments")
                 .then()
                 .extract().response();
        
	    
	}
	
	@Given("User send the post Request")
	public void user_send_the_post_request() {
	    // Write code here that turns the phrase above into concrete action
	
		 RestAssured.baseURI = "https://dummy.restapiexample.com/api";
		
		// HashMap<String,String>data = new HashMap<>();
		  data.put("id", "1");
		  data.put("employee_name", "NewUser10");
	        data.put("employee_salary", "10000");
	        data.put("employee_age", "53");
	       // JSONObject jsonObject = new JSONObject(data);
         res = given()
        		 
        		 .header("Content-type", "application/json")
        	.body(data.toString())
        	.when()
        	.put("/v1/employee/1")
        	.then()
        	.statusCode(200)
        	.extract().response();
        
	    
	}
	@When("user get the response")
	public void user_get_the_response() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(data);
	
	}
	@Then("user validate the response for get")
	public void user_validate_the_response() {
	    // Write code here that turns the phrase above into concrete actions
		Assertions.assertEquals(200, res.statusCode());
		//Assertions.assertEquals("Sincere@april.biz",res.jsonPath().getString("email"));
		JSONArray JSONResponseBody = new   JSONArray(res.body().asString());
		System.out.println("res size :" +JSONResponseBody.length());
		List<Object> lt = Arrays.asList(JSONResponseBody);
		System.out.println("list size"+lt.size());
		System.out.println("list 1"+lt.get(0));
		for(Object jar:JSONResponseBody )
		{
			System.out.println(jar);
		}
	}
	
	@Then("user validate the response for post")
	public void user_validate_the_response_post() {
	    // Write code here that turns the phrase above into concrete actions
		Assertions.assertEquals(200, res.statusCode());
	//	Assertions.assertEquals("Sincere@april.biz",res.jsonPath().getString("email"));
		System.out.println("Json response :"+res.jsonPath().getString("employee_name"));
	}
	
	


}
