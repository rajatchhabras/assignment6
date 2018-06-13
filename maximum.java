package assignment6;
import java.lang.String;
import java.util.Scanner;
public class maximum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String p=sc.next();
	int k=Integer.parseInt(s);
	int v=Integer.parseInt(p);
	if(k>v)
		System.out.println("This one is greator "+k);
	else
		System.out.println("This one is greator "+v);
		
	
	

	}

}
