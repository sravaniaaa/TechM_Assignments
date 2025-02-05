package tasks;
import java.util.*;
public class lastletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a sentence");
      String s=sc.nextLine();
      String a[]=s.split("\\s+");
      String g="";
      int n=0;
      for(int i=0;i<a.length;i++)
      {
    	 n=a[i].length();
    	 if(!(Character.isDigit(a[i].charAt(n-1))))
    		 g+=a[i].charAt(n-1);
    		 
      }
      System.out.println(g);
	}

}
