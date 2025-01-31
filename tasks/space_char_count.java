package tasks;
import java.util.*;
public class space_char_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.println("enter a sentence");
	      String s=sc.nextLine();
	      int n=s.length();
	      s=s.replaceAll("\\s+","");
	      int spacec=n-s.length();
	      s=s.replaceAll("[0-9]","");
	      System.out.println("space count="+spacec);
	      System.out.println("character count="+(s.length()));
	}

}
