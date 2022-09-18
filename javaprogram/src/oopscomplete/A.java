package oopscomplete;

public  class A extends Marks
{
private float sub1,sub2,sub3;
public A(float s1,float s2,float s3)
{
	sub1 =s1;
	sub2=s2;
	sub3=s3;
}

	// TODO Auto-generated constructor stub


@Override
double getpercentage() {

	return (sub1 + sub2 + sub3)/300.0*100;
			
}
	
	}


