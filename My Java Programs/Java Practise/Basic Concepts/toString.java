package practise;
public class toString 
{
	int rno;
	String name;
	toString(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		toString s=new toString(10,"srinivas");
		System.out.println(s);
		System.out.println(s.toString());
	}
	public String toString()
	{
		return rno+" "+name;
	}
}