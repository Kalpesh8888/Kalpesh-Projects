package JavaProgram;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the year");
		int year =sc.nextInt();
		
		if (year%400==0 ||year%4==0 && year%100!=0) {
			
			System.out.println("year is leap");
		}
		else {
			System.out.println("year is not leap");
		}

	}

}
