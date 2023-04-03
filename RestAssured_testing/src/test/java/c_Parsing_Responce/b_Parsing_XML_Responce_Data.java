package c_Parsing_Responce;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;




public class b_Parsing_XML_Responce_Data {

       //  2) Parsing XML response using XML Path     

	    // @Test (priority = 1)
		void test_XML_response_data () 
		{
		       // Approch 1
		      given()
	      	     .contentType(ContentType.XML)
	      	 .when()
	      	     .get("http://restapi.adequateshop.com/api/Traveler")   
	      	 .then()
	      	  .statusCode(200)
	      	  .header("Content-Type","application/xml; charset=utf-8")
	      	  .body("TravelerinformationResponse.page", equalTo("1"))
	      	  .body("TravelerinformationResponse.travelers.Travelerinformation[1].email",equalTo("qweqw@mail.ru"));
	  
		}
		 
		//@Test (priority = 2)
		void test_xml_response_data1 () 
		{
		       // Approch 2
		      
   Response res=given()
	      	      .contentType(ContentType.XML)
	      	    .when()
	      	     .get("http://restapi.adequateshop.com/api/Traveler");  
	      
	      	  
           Assert.assertEquals(res.statusCode(),200);         // validation1
           Assert.assertEquals(res.contentType(),"application/xml; charset=utf-8");   // validation2
       
   
           String EmailName = res.xmlPath().get("TravelerinformationResponse.travelers.Travelerinformation[1].email").toString();
          
           Assert.assertEquals(EmailName,"qweqw@mail.ru");        // validation3
   
           String Pageno= res.xmlPath().get("TravelerinformationResponse.page").toString();
           
           Assert.assertEquals( Pageno ,"1");
   
	  
		}


		// Apporch 2 More example

        @Test
		void test_xml_response_data () 
		{
		       // Approch 2
		      
   Response res=given()
	      	      .contentType(ContentType.XML)
	      	    .when()
	      	     .get("http://restapi.adequateshop.com/api/Traveler");  
	      
	      	  
           Assert.assertEquals(res.statusCode(),200);         // validation1
           Assert.assertEquals(res.contentType(),"application/xml; charset=utf-8");   // validation2
       
   
           String EmailName = res.xmlPath().get("TravelerinformationResponse.travelers.Travelerinformation[1].email").toString();
          
           Assert.assertEquals(EmailName,"qweqw@mail.ru");        // validation3
   
           
           XmlPath  Xmlobj = new XmlPath(res.asPrettyString());
        List <String>   travellersInfo = Xmlobj.getList("TravelerinformationResponse.travelers.Travelerinformation");
           
 
           for( String travellers: travellersInfo )
           {
              System.out.println(travellers);
                                             //printout 10 nos of travellers information
                  }   
           
           //verifying  10 nos of travellers
        Assert.assertEquals(travellersInfo.size(), 10);
           
          
        
        // printout name of travellers only 
           
       boolean status = false;
        List <String>   travellersNames = Xmlobj.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
          
           
          for( String travellerNames: travellersNames)
         
           {  
        	   System.out.println(travellerNames);      // printout names of travllers 
               
        	   if ( travellerNames.equals("karen") )
          {
        		 status  = true;
        		 break;}
           }
          Assert.assertEquals(status, true);            
		
		}}
