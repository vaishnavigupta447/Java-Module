package Capg;

import java.util.Scanner;

public class Assng1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of English");
		int eng= sc.nextInt();
		System.out.println("Enter the Marks of java");
		int j= sc.nextInt();
		System.out.println("Enter the Marks of database");
		int db= sc.nextInt();
		int t= eng+j+db;
		System.out.println("Total Sum : "+t);
		double avg=(eng+j+db)/3;
		System.out.println("Average is "+avg);

	}

}
