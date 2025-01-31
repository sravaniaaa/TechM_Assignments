package tasks;
import java.util.*;
public class charAtodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.println("enter a sentence");
	      String s=sc.nextLine();
	      String g="";
	      for(int i=1;i<s.length();i=i+2)
	    	  g+=s.charAt(i);
	      System.out.println(g);
	}

}
