package generics;
import java.util.Arrays;
public class arrayequal<T> {
	private T[] ob1;
	private T[] ob2;
	public arrayequal(T[] array1,T[] array2)
	{
		this.ob1=Arrays.copyOf(array1,array1.length);
		this.ob2=Arrays.copyOf(array2,array2.length);
	}
	 public boolean areArraysEqual() {
	        
	        return Arrays.equals(ob1, ob2);
	    }
}
