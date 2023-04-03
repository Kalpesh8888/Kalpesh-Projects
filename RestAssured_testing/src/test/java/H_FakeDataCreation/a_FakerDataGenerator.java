package H_FakeDataCreation;



import org.testng.annotations.Test;

import com.github.javafaker.Faker;


public class a_FakerDataGenerator {
	
	
	
	@Test
	void TestFakeDatacreation() {
		
	
	Faker faker = new Faker();

	String Fullname = faker.name().fullName();              // Miss Samanta Schmidt
	String firstName = faker.name().firstName();        // Emory
	String lastName = faker.name().lastName();         // Barton

	String Address = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
	String username = faker.name().username();         // username 
	String Password = faker.internet().password();      //password
	String Cellphone = faker.phoneNumber().cellPhone() ;  //cellphone no
	String email =  faker.internet().emailAddress();
	
	System.out.println("Full Name"+" "+ Fullname);
	System.out.println("first Name"+"  "+ firstName);
	System.out.println("last Name "+"  "+lastName);
	System.out.println("Address"+"  "+Address);
	System.out.println("username"+"  "+username );
	System.out.println("Password"+"  "+Password);
	System.out.println("Cellphone"+"  "+ Cellphone);
	System.out.println("email"+"  "+ email);
	
	
	
	
	
	}
}