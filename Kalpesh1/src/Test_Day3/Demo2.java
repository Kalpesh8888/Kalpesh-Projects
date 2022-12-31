package Test_Day3;

public class Demo2 {
	
 String name;
 int salary;
 char grade;
 
 void show()
 { System.out.println(name +"  "+ salary +"  "+ grade);} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //by refrence variable
		Demo2 d = new Demo2();
		d.name ="arjuna";
		d.salary=85000;
		d.grade='A';
		
		d.show();
		
		
	}

}
