package generics;

public class findelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = {1,2,3,4,5};
		int s=4;
		generic3<Integer> ob=new generic3<>(arr1,s);
		System.out.println("index of first occurence of target element"+ob.checkindex());
		
	}

}
