package practise;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files2 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File f=new File("C:\\Users\\srinivas\\Desktop\\a.txt");
		Scanner sc=new Scanner(f);
		int a=sc.nextInt();
		double b=sc.nextDouble();
		String c=sc.next();
		sc.close();
		f=new File("C:\\Users\\srinivas\\Desktop\\b.txt");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
