package assignment6;
import java.util.Scanner;
abstract class animal
{
	public int x;
	abstract public void set();
	public void get()
	{
		System.out.println("The value of the x is " +x);
	}
	public animal()
	{
		System.out.println("Welcome to the Abstract Class ");
	}
	
}
class yours extends animal
{
	public yours()
	{
		System.out.println("Welcome to the first inherited Class ");
		
	}
	public void set()
	{
		Scanner sc=new Scanner(System.in);
	    x=sc.nextInt();
	}
	public void personal()
	{
		System.out.println("This will be run only if its class referrence variable is made  ");
		
	}
}

public class assignment {

	public static void main(String[] args) {
		animal a=new yours();
		a.set();
		a.get();
		
		// a.personal() not work here..
		yours d=new yours();
		d.set();
		d.get();
		
		d.personal();//it will run easily		

	}

}

