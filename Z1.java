import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.print("Your line: ");
        String line = in.nextLine();
        StringBuilder new_line = new StringBuilder();
        for(int index = line.length()-1; index >= 0; --index) {
            new_line.append(line.charAt(index));
        }
        System.out.println("Source line: " + line);
        System.out.println("Reverse line: " + new_line);
    }
}