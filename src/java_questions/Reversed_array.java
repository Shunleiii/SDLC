package java_questions;

import java.util.Scanner;

public class Reversed_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[5];
		System.out.println("Original Array: ");
		for (int i=0;i<num.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			num[i]=sc.nextInt();
		}
		System.out.println("Reversed Array: ");
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.print(num[i] + " ");
		}

	}

}
