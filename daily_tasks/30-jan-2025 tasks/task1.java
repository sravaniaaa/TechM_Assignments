package tasks;
import java.util.*;
public class task1 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a[]= {1,2,3,4,5,6,7};
			int b[]= {9,10,11,12,13,14};
			int j=0;
			for(int i=0;i<a.length;i=i+2)
			{
				System.arraycopy(a, i, b, j,1);
				j++;
			}
	        for(int i:b)
	        	System.out.println(i);
		}

	}
