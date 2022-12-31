package Programming;

public class NumbersAdditon {
// Numbers Addition in one digit Ex 2456=2+4+5+6=17=8
	
	public static void main(String[] args) {
 
		int Number=1555, reminder;
		
	 while (Number>9)
       {
		 int Sum=0;
		
		 while(Number!=0)
		 
		{ reminder=Number%10;
		  Sum=Sum+reminder;
		  Number=Number/10;
		}
		 Number=Sum;
	}
		System.out.println(Number);
	}
	

}
