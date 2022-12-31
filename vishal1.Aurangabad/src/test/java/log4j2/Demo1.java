package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Demo1 {
 

	   static Logger log= LogManager.getLogger(Demo1.class.getName());
	
	   // Define a static logger variable so that it references the
	   //Demo1.class is class name & get name method not necessary
	
	   public static void main(String[] args) {
	   	// TODO Auto-generated method stub
		
		  log.trace("Sample trace message");  // Set up a simple configuration that logs on the console.
		  log.debug("Sample debug message");
		  log.info("Sample info message");
		  log.warn("Sample warn message");
		  log.error("Sample error message");
		  log.fatal("Sample fatal message");

	}

}
