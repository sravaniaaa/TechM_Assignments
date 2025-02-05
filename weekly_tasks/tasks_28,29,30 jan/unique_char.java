package tasks;
import java.util.*;
public class unique_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.println("enter a sentence");
	      String s=sc.nextLine();
	      String g="";
	      for(int i=0;i<s.length();i++)
	      {
	    	  if(g.indexOf(s.charAt(i))<0)
	    		  g+=s.charAt(i);
	      }
	      System.out.println(g);
	}

}
