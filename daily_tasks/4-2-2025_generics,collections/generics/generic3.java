package generics;
import java.util.Arrays;
	public class generic3<T> {
		private T[] obj;
		private T obj1;
		public generic3(T[] a,T k) {
			this.obj=Arrays.copyOf(a, a.length);
		    this.obj1=k;
		}
		
		public Integer checkindex(){
			for(int i=0;i<obj.length;i++) {
				if(obj[i]==obj1) {
					return i;
				}
			}
			return -1;
			
		}
	}

