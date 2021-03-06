import java.lang.Thread.State;
import java.util.Arrays;

public class FaultyProblem7 {
	public static int binarySearch(int element, int... array) {

		int low = 0;
		int high = array.length - 1;
		int mid = (low + high) / 2;
		while (high - low > 1) {
			if (element == array[mid]) {
				return mid;
			}
			if (element < array[mid]) {
				high = mid - 1;
				mid = (high + low) / 2;
			} else {
				low = (mid + 1);
				mid = (high + low) / 2;
			}
		}
		if (array[high] == element)
			return high;
		if (array[low] == element)
			return low;
		return -1; 
	}
}