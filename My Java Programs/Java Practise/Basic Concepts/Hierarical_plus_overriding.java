package practise;
class Bank
{
	public float getSimpleInterest(float p,float t,float r)
	{
		return ((p*t*r)/100);
	}
}
class SBI extends Bank
{
	public float getSimpleInterest(float p,float t,float r)
	{
		return ((p*t*r)/100);
	}
}
class ICICI extends Bank
{
	public float getSimpleInterest(float p,float t,float r)
	{
		return ((p*t*r)/100);
	}
}
class AXIS extends Bank
{
	public float getSimpleInterest(float p,float t,float r)
	{
		return ((p*t*r)/100);
	}
}
public class Hierarical_plus_overriding
{
	public static void main(String[] args) 
	{
		SBI a=new SBI();
		ICICI b=new ICICI();
		AXIS c=new AXIS();
		float x=a.getSimpleInterest(1.2f, 2.2f, 3.2f);
		float y=b.getSimpleInterest(2.2f, 2.2f, 2.2f);
		float z=c.getSimpleInterest(5.2f, 5.2f, 5.2f);
		System.out.println(x+"  "+y+"  "+z);	
	}
}
