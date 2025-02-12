package tasks;

import java.util.Arrays;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,2,3};
       int b[]= {1,2,3};
       int a1[][] = {{1,2,3},{1,2,3}};
       int b1[][] = {{1,2,3},{1,2,3}};
       System.out.println(Arrays.equals(a,b));
       System.out.println(Arrays.deepEquals(a1, b1));
	}

}
