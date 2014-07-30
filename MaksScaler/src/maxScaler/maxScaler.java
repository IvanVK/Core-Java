package maxScaler;

import java.util.Arrays;

public class maxScaler {
	public long maxScalarProduct(int[] a, int[] b) {
		long result = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i = 0;i < a.length;i++){
			result += a[i] * b[i];
		}
		return result;
	}
	
}
