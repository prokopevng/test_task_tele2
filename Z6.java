import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class Z6 {
	public static void main(String[] args) {
		Random rd = new Random(); // creating Random object
		Integer[] arr = new Integer[5];
		  
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(); // storing random integers in an array
		}
		
		System.out.println("Array:");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		System.out.println("Second highest number: " + arr[1]);
   }
}