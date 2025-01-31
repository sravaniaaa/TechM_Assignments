package tasks;
import java.util.*;
public class revnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t=0;
    while(n!=0)
    {
    	t=t*10+n%10;
    	n=n/10;
    }
    System.out.println(t);
	}

}
