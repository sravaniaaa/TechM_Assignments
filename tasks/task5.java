package tasks;
import java.util.*;
public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String a=sc.next();
       String g="";
       for(int i=0;i<a.length();i++)
       {
    	   g+=Character.toUpperCase(a.charAt(i));
    	   i++;
    	   g+=a.charAt(i);
       }
       System.out.println(g);
	}

}
