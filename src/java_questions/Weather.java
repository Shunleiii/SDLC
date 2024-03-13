package java_questions;

import java.util.Arrays;

public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp= {45,44,39,48,37,46,53};
		System.out.print("Temperatures: ");
		System.out.println(Arrays.toString(temp));
		System.out.println("How many days' temperatures? " + temp.length);
		double totaltemp=0;
		for (int i=0;i<temp.length;i++)
		{
			System.out.println("Day " + (i+1) + "'s high temp: " + temp [i]);
			totaltemp+=temp[i];
		}
		double avg=(double)(totaltemp/temp.length);
		System.out.println("Average temp = " + avg);
		int count=0;
		for (int i=0;i<temp.length;i++)
		{
			if (temp[i]>avg)
			{
				count++;
			}
		}
		System.out.println(count + " days were above average.");
		
		Arrays.sort(temp);
		System.out.print("Temperatures after sorting: ");
		System.out.println(Arrays.toString(temp));
		System.out.println("Two coldest days: " + temp[0]+ ", " + temp[1]);
		System.out.println("Two hottest days: "+(temp[temp.length-1])+ ", "+(temp[temp.length-2]));
		
		
		
		

	}

}
