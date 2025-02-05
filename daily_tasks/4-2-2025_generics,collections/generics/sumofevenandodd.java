package generics;

public class sumofevenandodd {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = {1,2,3,4,5};
		Generics2<Integer> ob=new Generics2<>(arr1);
		Integer[] arr2=ob.Sum();
		System.out.println("Sum of even no is: "+arr2[0]+" Sum of odd no is:"+arr2[1]);
		
	}

}

	