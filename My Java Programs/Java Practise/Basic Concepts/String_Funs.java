package practise;
import java.lang.String;
import java.util.*;
public class String_Funs 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String txt="hii how are u";
		System.out.println(txt.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.indexOf("nivas"));
		System.out.println(str1.concat(txt));
		System.out.println(str1.charAt(5));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.replace("sri","sai"));
	}

}
