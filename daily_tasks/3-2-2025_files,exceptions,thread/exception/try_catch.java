package exception;
import java.util.*;
import java.io.*;
public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a,b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try
        {
        		System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
        	System.out.println("can't divide by zero");
        }
	}

}
