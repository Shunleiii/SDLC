package java_questions;

public class StringMethod_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first="java programming";
		String second="java programming";
		String third="python programming";
		
		boolean result=first.equals(third);
		System.out.println("Strings first and second are equal: " + result);
		
		int cmp=third.compareTo(second);
		System.out.println("By using compareTo method: " +cmp);
		System.out.println("By using Uppercase method: " + third.toUpperCase());
		System.out.println("By using concat method: " +third.concat(" Language"));
		

	}

}
