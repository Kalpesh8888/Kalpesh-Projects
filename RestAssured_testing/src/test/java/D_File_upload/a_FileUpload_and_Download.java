package D_File_upload;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.annotations.Test;



public class a_FileUpload_and_Download {

	// first start file-upload-RestAPI. jar file 
	
	
	
         @Test
         void single_file_upload() 
         {
        	 File Myfile= new File("E:\\KALPESH\\KALPESH\\API\\Pavan Sir\\Upload file\\Sample1-TXT (1).txt");
                 
        	    given()
                    .multiPart("file", Myfile)
                    .contentType("multipart/form-data")
                .when()
                  .post("http://localhost:9090/uploadFile")
                .then()
                  .statusCode(200)
                //  .body("fileName", equalTo("Sample1-TXT (1).txt"))
                  .log().all();
         }
         
         @Test
         void Multiple_file_upload() 
         {
        	     File Myfile1= new File("E:\\KALPESH\\KALPESH\\API\\Pavan Sir\\Upload file\\Sample1-TXT (1).txt");
        	     File Myfile2= new File("E:\\KALPESH\\KALPESH\\API\\Pavan Sir\\Upload file\\Sample1-TXT (2).txt");
        	    given()
                    .multiPart("files", Myfile1)
                    .multiPart("files", Myfile2)
                    .contentType("multipart/form-data")
                .when()
                     .post("http://localhost:9090/uploadMultipleFiles")
                .then()
                  .statusCode(200)
                  .body("fileName[0]", equalTo("Sample1-TXT (1).txt"))
                  .body("fileName[1]", equalTo("Sample1-TXT (2).txt"))
                  .log().all();
         }
         @Test
         void download_file()
         {
        	 given()
         
            .when()
                .get("http://localhost:9090/downloadFile/Sample1-TXT (1).txt")
            .then()
              .statusCode(200)
              .log().body()
              .log().all();
         }
}