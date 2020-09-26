import java.util.Scanner;

public class Z7 {
	static String with_replace(String str) {
		return str.replace(" ", "");
	}
	
	static String without_replace(String str) {
		StringBuilder new_line = new StringBuilder();
		for(char ch : str) {
			if (ch != " ")
				new_line.append(ch);
		}
		return new_line.toString();
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.print("Your line: ");
        String line = in.nextLine();
        
		System.out.println();
		System.out.println("With replace: " + with_replace(line));
		System.out.println("Without replace: " + without_replace(line));
    }
}