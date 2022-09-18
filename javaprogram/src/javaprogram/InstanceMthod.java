package javaprogram;

public class InstanceMthod 
{
	int a=10;
	 int b=20;
	  int c =a+b;
	  
	 void sum()
	{
		System.out.println("Sum of a+b = " + c);
	}
	public  void main(String args[])
	{
		InstanceMthod s1=new InstanceMthod(); //creating new obj
		s1.sum(); // objName.MethodName
		
}
}
