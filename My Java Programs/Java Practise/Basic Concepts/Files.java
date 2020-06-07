package practise;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintStream;

public class Files 
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
		PrintStream p=new PrintStream(f);
		p.println(a);
		p.println(b);
		p.println(c);
		p.close();
	}

}
