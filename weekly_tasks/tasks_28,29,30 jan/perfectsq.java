package tasks;
import java.util.*;
public class perfectsq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int d=(int)Math.sqrt(n);
      if((d*d)==n)
    	  System.out.println("perfect square");
      else
    	  System.out.println("not perfect square");
	}

}
