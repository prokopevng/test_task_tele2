import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.print("First num: ");
        int first = in.nextInt();
		System.out.print("Second num: ");
        int second = in.nextInt();
		
		System.out.println();
		System.out.println("First num:" + first);
		System.out.println("Second num:" + second);
		
		int temp;		
		temp = first;
		first = second;
		second = temp;
		
		System.out.println();
        System.out.println("First num:" + first);
		System.out.println("Second num:" + second);
    }
}