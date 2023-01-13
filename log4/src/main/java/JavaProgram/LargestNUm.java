package JavaProgram;

public class LargestNUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=4,c=40,d=50;
		
		if(a<b && a>c && a>d) {
			System.out.println("lagets number is a "+a);
		}
		else if(b>a && b>c && b>d) {
			System.out.println("largest num is b = "+b);
		}
		else  if(c>a && c>b && c>d) {
			System.out.println("lagets num is c = "+c);
		}
		else 
		{
			System.out.println("largest num is d="+d);
		}

	}

}
