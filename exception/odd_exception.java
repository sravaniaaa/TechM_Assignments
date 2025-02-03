package exception;
import java.util.*;
public class odd_exception {
    public static void checknum(int d)throws Exception
    {
    	if(d%2!=0)
    	{
    		throw new Exception("number is odd");
    	}
    	System.out.println("number is even");
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner (System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     try
     {
    	 checknum(n);
     }
     catch(Exception e)
     {
    	 System.out.println(e.getMessage());
     }
	}

}
