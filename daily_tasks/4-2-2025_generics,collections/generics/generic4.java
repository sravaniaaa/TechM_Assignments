package generics;
import java.util.Arrays;
	public class generic4<T> {
		private T[] obj;
		
		public generic4(T[] a) {
			this.obj=Arrays.copyOf(a, a.length);
		}
		
		public T[] reverse(){
			T[] obj1=Arrays.copyOf(obj, obj.length);
			int j=0;
			for(int i=obj.length-1;i>=0;i--) {
				obj1[j]=obj[i];
				j++;
			}
			return obj1;
			
		}
	}

