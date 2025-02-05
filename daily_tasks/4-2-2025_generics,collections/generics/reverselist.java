package generics;

public class reverselist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = {1,2,3,4,5};
		generic4<Integer> ob=new generic4<>(arr1);
		Integer[] arr2=ob.reverse();
		System.out.println("reversed list");
		for(int i:arr2)
			System.out.print(i+" ");
		String a[]= {"hii","hello"};
		
		generic4<String> ob1=new generic4<>(a);
		String[] h=ob1.reverse();
		System.out.println("reversed list");
		for(String i:h)
			System.out.print(i+" ");
	}

}
