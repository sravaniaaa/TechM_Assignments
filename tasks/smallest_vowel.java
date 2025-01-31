package tasks;
import java.util.*;
public class smallest_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.println("enter a sentence");
	      String s=sc.nextLine();
	      s=s.replaceAll("[^aeiouAEIOU]", "");
	      char a[]=s.toCharArray();
	      Arrays.sort(a);
	      System.out.println(a[0]);
	}

}
