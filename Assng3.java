package Capg;

import java.util.Scanner;

public class Assng3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Date");
		int d= sc.nextInt();
		int i= d%10;
		if(d<=31)
		{
			if(i==1)
				System.out.println("Date is : "+d+"st");
			if(i==2)
				System.out.println("Date is : "+d+"nd");
			if(i==3)
				System.out.println("Date is : "+d+"rd");
			if(i>=4)
				System.out.println("Date is : "+d+"th");
		}
		else
			System.out.println("Date is invalid");
	}

}
