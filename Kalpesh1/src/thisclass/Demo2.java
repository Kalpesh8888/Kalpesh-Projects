package thisclass;
//  Encapulstion by Get & set method
class ABC
{
	private String name;
  
  void SetName(String company)
  { 
      name = company;
  }
void getname()
{
System.out.println(name);
}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ABC a = new ABC();
	
		a.SetName("radhe");
       a.getname();
	
	}

}
