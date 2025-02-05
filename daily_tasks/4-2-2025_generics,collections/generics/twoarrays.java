package generics;

public class twoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {1, 2, 3, 4, 5};
        arrayequal<Integer> obj1=new arrayequal<Integer>(arr1,arr2);
        
        
        System.out.println("arr1 and arr2 are equal: " + obj1.areArraysEqual()); 
        
        
	}

}
