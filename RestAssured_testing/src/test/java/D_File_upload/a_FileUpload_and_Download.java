package D_File_upload;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.annotations.Test;



public class a_FileUpload_and_Download {

	//Not woking due local host
         @Test
         void single_file_upload() 
         {
        	     File Myfile= new File("E:\\KALPESH\\KALPESH\\Automation Practice\\Test1.txt");
                 
        	    given()
                    .multiPart("file",Myfile)
                    .contentType("multipart/form-data")
                .when()
                    .post("https://v2.convertapi.com/upload ")
                //.post("http://localhost:8080/fileupload")
                //.post("https://localhost:8080//uploadFile")
                .then()
                  .statusCode(200)
                  .body("filename", equalTo("Test1.txt"))
                  .log().all();
         }
         @Test
         void Multiple_file_upload() 
         {
        	     File Myfile1= new File("E:\\KALPESH\\KALPESH\\Automation Practice\\Test1.txt");
        	     File Myfile2= new File("E:\\KALPESH\\KALPESH\\Automation Practice\\Test2.txt");
        	    given()
                    .multiPart("files", Myfile1)
                    .multiPart("files", Myfile1)
                    .contentType("multipart/form-data")
                .when()
                    .post("https://v2.convertapi.com/upload ")
                //.post("http://localhost:8080/fileupload")
                //.post("https://localhost:8080//uploadMultipleFile")
                .then()
                  .statusCode(200)
                  .body("[0]filename", equalTo("Test1.txt"))
                  .body("[0]filename", equalTo("Test1.txt"))
                  .body("[1]filename", equalTo("Test1.txt"))
                  .log().all();
         }
         @Test
         void download_file()
         {
        	 given()
         
            .when()
                .get("https://localhost:8080//downloadfile/Test1.txt ")
            .then()
              .statusCode(200)
              .log().body()
              .log().all();
         }
}