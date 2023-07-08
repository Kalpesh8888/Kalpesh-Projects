package i__assign_values_to_the_Variables;
// we can assign values to variable by 3 ways
//  1) by using reference variable
//  2) by using methods
//  3) by using constructor.

public class Demo1 {
	
	//1) by using reference variable 
 
	
 String name;
 int salary;
 char grade;
 
 void show()
 { System.out.println(name +"  "+ salary +"  "+ grade);} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
	
		Demo1 d = new Demo1();
		d.name ="arjuna";
		d.salary=85000;
		d.grade='A';
		
		d.show();
		
		
	}

}
