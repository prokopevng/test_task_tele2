import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Z4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.print("Your line: ");
        String line = in.nextLine();
		
		String array_of_words[]= line.split(" ");
		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		
		for(String word : array_of_words) {
			if (hashmap.containsKey(word)) {
				hashmap.put(word, hashmap.get(word) + 1);
			}
			else {
				hashmap.put(word, 1);
			}
		}
		
		hashmap.forEach((k, v) -> {
            System.out.format("Word: %s, count: %d%n", k, v);
        });
		
    }
}