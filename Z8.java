import java.util.Random;
import java.util.Arrays;

public class Z8 {
	
	static void bubbleSort(int[] arr) {
		int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){  
                    //swap elements  
					temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }
	}
	
	public static void main(String[] args) {
		Random rd = new Random(); // creating Random object
		int[] arr = new int[5];
		  
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(); // storing random integers in an array
		}
		
		System.out.println("Array:");
		System.out.println(Arrays.toString(arr));
		
		bubbleSort(arr);
		System.out.println("Sorted array:");
		System.out.println(Arrays.toString(arr));
		
   }
}