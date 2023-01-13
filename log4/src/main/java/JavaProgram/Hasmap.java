package JavaProgram;

import java.util.HashMap;

public class Hasmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> data= new HashMap<Integer,String>();
		
		data.put(101,"rajkumar");
		data.put(102, "reshma");
		data.put(105, "rajkumar");
		data.put(103, "riyansh");
		System.out.println(data);
		System.out.println(data.keySet());
		System.out.println(data.values());
		System.out.println(data.containsKey(104));
		System.out.println(data.isEmpty());
		data.remove(105);
		System.out.println(data);
		System.out.println(data.get(103));

	}

}
