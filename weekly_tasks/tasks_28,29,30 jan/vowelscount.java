package tasks;
import java.util.*;
public class vowelscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.println("enter a sentence");
	      String s=sc.nextLine();
	      s=s.replaceAll("[^a-zA-Z]","");
	      int n=s.length();
	      s=s.replaceAll("[aeiouAEIOU]","");
	      int c=s.length();
	      System.out.println("vowels count="+(n-c));
	      System.out.println("consonant count="+(c));
	}

}
