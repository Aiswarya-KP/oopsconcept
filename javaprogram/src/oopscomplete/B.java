package oopscomplete;

public class B extends Marks 
{
private float sub1,sub2,sub3,sub4;
public B(float s1,float s2,float s3,float s4)
{
	sub1= s1;
	sub2=s2;
	sub3=s3;
	sub4=s4;

	
}
	@Override
	double getpercentage() {
		// TODO Auto-generated method stub
		return(sub1+sub2+sub3+sub4)/400.0*100;
		

	}

}
