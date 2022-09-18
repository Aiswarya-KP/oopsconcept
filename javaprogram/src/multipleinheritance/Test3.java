package multipleinheritance;

public class Test3 implements Test1,Test2 
{

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int a=1000;
		System.out.println("Sum of the number "+(a*5)/100);
	}
	public static void main(String args[])
	{
		Test1 obj=new Test3();
		obj.sum();
	}

}
