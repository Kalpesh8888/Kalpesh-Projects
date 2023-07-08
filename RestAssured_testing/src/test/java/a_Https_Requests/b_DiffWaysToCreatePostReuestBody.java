package a_Https_Requests;    



import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;



/*How many ways we can create request body
1) post request body using HashMap
2) post request body using Org.json library
3) post request body  using POJO class (Plain Old Java Object class) 
4)  post request body using external json file                                       */
public class b_DiffWaysToCreatePostReuestBody {
	
	//1) post request body using HashMap
	
	//@Test (priority = 1)
	void testPostUseingHashMap() {     
	
	  HashMap data =new HashMap ();
	  data.put("name","Kalpesh");
	  data.put("Location","Pune");
	  data.put("phone","8888334028");
	
	  String CourseArry[] = {"java","C++"};
	
       data.put("Courses", CourseArry);

       given()
         .contentType("application/json")
         .body(data)
       .when()
          .post("https://reqres.in/api/users") //or dummy api pan use karu shakto http://localhost:3000/students
        
        .then()
           .statusCode(201)
           .body("name",equalTo("Kalpesh"))
           .body("Location",equalTo("Pune"))
           .body("phone",equalTo("8888334028"))
           .body("Courses[0]",equalTo("java"))
           .body("Courses[1]",equalTo("C++"))
           .header("Content-Type","application/json; charset=utf-8")
           .log().all();
	
	
	
	}
	
	//@Test ( priority = 2)                
   	void DeleteUser() {                       //  Deleteing student record      
   		given()
   		
   		.when()
   		    .delete("https://reqres.in/api/users/948")   //948=id created in previous request       
   		
   		    .then()
   		   .statusCode(204)
   		   .log().all();
   	}

    //2) post request body using Org.json library
   	
	    //  @Test (priority = 1)
		void testPostUseing_json_library() {    
		
		  JSONObject data =new JSONObject(); 
		  data.put("name","Kalpesh Patil");
		  data.put("Location","Pune");
		  data.put("phone","8888334028");
		
		  String CourseArry[] = {"java","C++"};
		
	       data.put("Courses", CourseArry);

	       given()
	         .contentType("application/json")
	         .body(data.toString())
	       .when()
	          .post("https://reqres.in/api/users") //http://localhost:3000/students
	        
	        .then()
	           .statusCode(201)
	           .body("name",equalTo("Kalpesh Patil"))
	           .body("Location",equalTo("Pune"))
	           .body("phone",equalTo("8888334028"))
	           .body("Courses[0]",equalTo("java"))
	           .body("Courses[1]",equalTo("C++"))
	           .header("Content-Type","application/json; charset=utf-8")
	           .log().all();
		
		}
		
      // @Test ( priority = 2)                
	   	void DeleteUser_json_library(){                       //  Deleteing student record      
	   		given()
	   		
	   		.when()
	   		    .delete("https://reqres.in/api/users/919")     // 919=id created in previous request     
	   		
	   		.then()
	   		   .statusCode(204)
	   		   .log().all();
	   	}




       //3) post request body using using POJO class (Plain Old Java Object class)
      	
	    // @Test (priority = 1)
		void testPostUseing_POJO() {    
		
	    	  c_pojo_Post_Request data =new c_pojo_Post_Request ();
	    	   data.setName("Kalpesh");
	    	   data.setLocation("Pune");
	    	   data.setPhone("8888334028");
	    	  
	    	   String CoursesArry[]= {"java","C++"}; //Array
	    	   data.setCourses(CoursesArry);
	   
	   
	       given()
	         .contentType("application/json")
	         .body(data)
	      .when()
	          .post("https://reqres.in/api/users")  //http://localhost:3000/students
	        
	      .then()
	           .statusCode(201)
	           .body("name",equalTo("Kalpesh"))
	            .body("location",equalTo("Pune"))
	            .body("phone",equalTo("8888334028"))
	            .body("courses[0]",equalTo("java"))
	            .body("courses[1]",equalTo("C++"))
	            .header("Content-Type","application/json; charset=utf-8")
	           .log().all();
		
		}
		
      // @Test ( priority = 2)                
	   	void DeleteUser_POJO(){                       //  Deleteing student record      
	   		given()
	   		
	   		.when()
	   		    .delete("https://reqres.in/api/users/873")     // 873=id created in previous request     
	   		
	   		.then()
	   		   .statusCode(204)
	   		   .log().all();
	   	}


       //4)  post request body using External json file       
  
       @Test (priority = 1)
       void testPostUseing_External_json_file() throws FileNotFoundException {    
    		
    	     File F= new File(".//body.json");
    	   
    	    FileReader Fr= new FileReader(F);
  
    	    JSONTokener JT = new JSONTokener(Fr);
    	    
    	    JSONObject data = new JSONObject(JT);
    	      
    	    
    	    given()
    	         .contentType("application/json")
    	         .body(data.toString())
    	      .when()
    	          .post("https://reqres.in/api/users")  //http://localhost:3000/students
    	        
    	      .then()
    	           .statusCode(201)
    	           .body("name",equalTo("Kalpesh"))
    	           .body("location",equalTo("Pune"))
    	           .body("phone",equalTo("8888334028"))
    	           .body("courses[0]",equalTo("java"))
    	           .body("courses[1]",equalTo("C++"))
    	           .header("Content-Type","application/json; charset=utf-8")
    	           .log().all();
    		
    		}
    		
              @Test ( priority = 2)                
    	   	  void DeleteUser_External_json_file(){   //  Deleteing student record      
    	   		given()
    	   		
    	   		.when()
    	   		    .delete("https://reqres.in/api/users/824")  // 824=id created in previous request     
    	   		
    	   	    .then()
    	   		   .statusCode(204)
    	   		   .log().all();
    	   	}









}
