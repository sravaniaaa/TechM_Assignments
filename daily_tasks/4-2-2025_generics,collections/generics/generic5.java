package generics;
import java.util.Arrays;
public class generic5 <T> {

	private T[] obj1;
	private T[] obj2;
	
	public generic5(T[] a,T[] a1) {
		this.obj1=Arrays.copyOf(a,a.length);
		this.obj2=Arrays.copyOf(a1,a1.length);
	}
	public T[] mergeArrays() {
		T[] obj3=Arrays.copyOf(obj1, (obj1.length+obj2.length));
		int i=0;
		int j=0;
		for(int l=0;l<obj3.length;l++) {
			if(l%2==0) {
				obj3[l]=obj1[i];
				i++;
			}
			else {
				obj3[l]=obj2[j];
				j++;
			}
		}
		return obj3;
	}
}