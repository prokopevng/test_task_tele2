import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.print("Your line: ");
        String line = in.nextLine();
        StringBuilder reverse_line = new StringBuilder();
        for(int index = line.length()-1; index >= 0; --index) {
            reverse_line.append(line.charAt(index));
        }
		
		if (line.equals(reverse_line.toString()))
			System.out.println("Palindrome");
        else
			System.out.println("No palindrome");
    }
}