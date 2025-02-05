package generics;

public class task5 {
public static void main(String[] args) {
	
	Integer[] arr1= {10,20,30,40,50};
	Integer[] arr2= {1,2,3,4,6};
	
	generic5<Integer> ob=new generic5<>(arr1,arr2);
	Integer[] arr3=ob.mergeArrays();
	for(int num:arr3) {
		System.out.print(num+ " ");
	}
}
}