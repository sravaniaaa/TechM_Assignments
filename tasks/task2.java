package tasks;
import java.util.*;
public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter no. of students");
     int n=sc.nextInt();
     String s[]=new String[n];
     int a[]=new int[n];
     
     for(int i=0;i<n;i++)
     {
    	 int f=0,t=0;
    	 double avg=0.0;
    	 System.out.println("enter student name");
    	 s[i]=sc.next();
    	 System.out.println("enter student marks of 3 subjects");
    	 for(int j=0;j<3;j++)
    	 {
    	    f=sc.nextInt();
    	    t+=f;
    	 }
    	 a[i]=t/3;
     }
       Arrays.sort(a);
       for(int i=a.length-1;i>=0;i--)
    	   System.out.print(a[i]+" ");
	}

}
