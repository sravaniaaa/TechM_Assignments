package tasks;
import java.util.*;
public class strrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.println("enter a string");
	      String s=sc.next();
	      StringBuffer s1=new StringBuffer(s);
	      s1=s1.reverse();
	      s=s1.toString();
	      s=s.toLowerCase();
	      System.out.println(s);
	      }

}
