package practise;
class A2
{
int a=10,b=20;
}

class B2 extends A2
{
int a=100,b=200;
void sum(int a,int b)
{
System.out.println(a+b);
System.out.println(this.a+this.b);
System.out.println(super.a+super.b);
}
}

class super_keyword
{
public static void main(String ar[])
{
B2 x=new B2();
x.sum(1000,2000);
}
}
