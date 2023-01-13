package Selenium_practice;

public class Raj extends ram{
	
	
	
int a=12;
	


	public static void main(String[] args) {
	
	ram R = new Raj();
	R.r();
	int a=10;

	
		
	

	}
	

	public void r() {
		System.out.println("hsjs");
		System.out.println(this.a);
	}
	public void y() {
		super.r();

		
	}
	
	
	

}

 class ram {
	 
	 
	 public ram(){
		 System.out.println("rahul");
	 }
	 
	 
	 
	 public void r() {
		 System.out.println("hiii");
	 }
	 public void x() {
		 System.out.println("rahu");
	 }
	
}
