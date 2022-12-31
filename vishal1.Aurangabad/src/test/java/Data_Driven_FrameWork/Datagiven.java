package Data_Driven_FrameWork;

import java.util.ArrayList;

public class Datagiven {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Datafeach1 d = new Datafeach1();
	    
	    ArrayList <String> data = d.Exceldata("development");
	    

	    System.out.println((String)data.get(0));
	    System.out.println((String)data.get(1));
	    System.out.println((String)data.get(2));
	    System.out.println((String)data.get(3));
	
	
	
	
	
	}

}
