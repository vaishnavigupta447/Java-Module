package Capg;

import java.util.Scanner;

public class Assng2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary");
		int bs= sc.nextInt();
		double hra,da,tax=0.0,ts;
		hra= (40*bs)/100;
		da= (60*(bs+hra))/100;
		if(bs<=200000) {
			tax=0.0;
		}
		else if(bs>200000 && bs<=600000)
		{
			tax=(10*bs)/100;
		}
		else
		{
			tax=(20*bs)/100;
		}
		ts= hra+da+tax;
		System.out.println("Basic Salary : "+bs);
		System.out.println("HRA : "+hra);
		System.out.println("DA : "+da);
		System.out.println("Tax : "+tax);
		System.out.println("Total Salary : "+ts);
	}

}
