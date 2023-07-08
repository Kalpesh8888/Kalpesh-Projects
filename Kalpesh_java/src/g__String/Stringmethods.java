package g__String;

public class Stringmethods {

	public static void main(String[] args) {
		
 
		//Predefine String Methods
 
		String s= "welcome to java & ";
        String B= " java is High sensetive langauage";
        String A1= "Rohit";
        String A2="rohit";
        String A3 = "Rohit";
        String a= "         kalpesh";
        String b= "Ram";

   System.out.println(s.length());// Nos
   System.out.println(s.concat(B));// Join TWo sentences
   System.out.println(a);
   System.out.println(a.trim());// reduce space
   System.out.println(s.charAt(11));//charat value output j

   System.out.println(s.contains("java"));  //true or false
   System.out.println(s.contains("india"));  //true or false

    System.out.println(A2.equals(A3));     //true or false

    System.out.println(A2.equalsIgnoreCase(A3));  //true or false
	
     System.out.println(s.substring(0 , 7));   //output welcome

     System.out.println(b.toLowerCase());  //lowercase all sentence

    System.out.println(b.toUpperCase());  //uppercase all sentence

    System.out.println(b.isEmpty());    //true or false

     System.out.println(B.substring(8));      // output  High sensetive langauage
                                                
     System.out.println("---------------");
     
       //replace:
   		String u = "Hello world";
   		System.out.println(u.replace(" ", "-"));
   		System.out.println(u.replace(" ", ""));
   		
   		String d = "01-01-1990";
   		System.out.println(d.replace("-", "/"));
     
     System.out.println("---------------");
 	
     String c = "The rains have started here";
	String c1 = "The rains Have started here";

	System.out.println(c.indexOf('s')); //1st occurrence of s
	
	System.out.println(c.indexOf('s', 9)); //2nd occurrence of s
	
	System.out.println(c.indexOf("have"));
	
	System.out.println(c.indexOf("hello"));
	

     
	}

}
