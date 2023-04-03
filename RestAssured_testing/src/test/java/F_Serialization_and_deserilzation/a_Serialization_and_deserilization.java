package F_Serialization_and_deserilzation;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import a_Https_Requests.c_pojo_Post_Request;



// POjO---- Serialization---> JSON object------Deserilization----->POJO

public class a_Serialization_and_deserilization {

	
	
	   // POJO to json object     ( Serialization)
	@Test
     void pojoconvert2Json() throws JsonProcessingException {
    	 
      //Created java  object useing Pojo class	 
	 
		student_Pojo studentPojo= new  student_Pojo();                   // POjo
 	   
		studentPojo.setName("Kalpesh");
		studentPojo.setLocation("Pune");
		studentPojo.setPhone("88883334028");
	
	 
	     String CoursesArry[]= {"java","C++"}; 
	     studentPojo.setCourses(CoursesArry);
	     
 	     //Convert java Object to json object     ( Serialization)
          
 	      ObjectMapper objmapper = new ObjectMapper();
 	     
 	   String jsondata = objmapper.writerWithDefaultPrettyPrinter().writeValueAsString(studentPojo);
 	     
 	        System.out.println(jsondata);
	}
 	     
 	      //   json object to   POJO     ( De-serialization)
 	     	@Test
 	        void Jsonconvert2Pojo()  throws JsonProcessingException 
 	     	
 	     	{
 	       	 
 	          String jsondata = "{\r\n"
 	          		+ "  \"name\" : \"Kalpesh\",\r\n"
 	          		+ "  \"phone\" : \"88883334028\",\r\n"
 	          		+ "  \"location\" : \"Pune\",\r\n"
 	          		+ "  \"courses\" : [ \"java\", \"C++\" ]\r\n"
 	          		+ "}" ;
 	     		
 	     		
 	         //Convert   json object to Pojo Object  ( DeSerialization)
 	     		
 	         ObjectMapper objmapper1 = new ObjectMapper();
 	          
 	    student_Pojo studentPojo   = objmapper1.readValue(jsondata, student_Pojo.class);
 	   	 
 	       System.out.println(studentPojo.getName());  
 	       System.out.println(studentPojo.getLocation()); 
 	       System.out.println(studentPojo.getPhone());  
 	       System.out.println(studentPojo.getCourses()[0]);  
 	      System.out.println(studentPojo.getCourses()[1]); }































}
