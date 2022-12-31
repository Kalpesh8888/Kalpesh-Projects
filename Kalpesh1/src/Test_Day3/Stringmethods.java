package Test_Day3;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //String Methods
 String s= "welcome to java & ";
 String B= " java is High sensetive langauage";
 String A1= "Rohit";
 String A2="rohit";
 String A3 = "Rohit";
String a= "         kalpesh";
String b= "Ram";

 System.out.println(s.length());//Nos
 System.out.println(s.concat(B));//Join TWo sentences
 System.out.println(a);
System.out.println(a.trim());//reduce space
System.out.println(s.charAt(11));//charat value

System.out.println(s.contains("java"));
System.out.println(s.contains("india"));

System.out.println(A2.equals(A3));

System.out.println(A2.equalsIgnoreCase(A3));
	
System.out.println(s.substring(0,7));

System.out.println(b.toLowerCase());

System.out.println(b.toUpperCase());

System.out.println(b.isEmpty());

     System.out.println(B.substring(8));                                                       
	
	}

}
