package javaprogram;

public class StaticMethod 
{
	static int a=10;
	 static int b=20;
	 static int c =a+b;
	static void sum()
	{
		System.out.println("c");
		System.out.println("Sum of a+b = " + c);
	}
	public static void main(String args[])
	{
		StaticMethod.sum(); // className.MethodName
		
}
}