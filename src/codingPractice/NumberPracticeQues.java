package codingPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberPracticeQues {

	static int x=3;
	int y=0;
	{y=20;}
	private static final Map<String,Integer> map= new HashMap<>();
//	NumberPracticeQues.x=20;
	static {
//		x=20;
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("nine", 9);
		map.put("ten", 10);
		map.put("eleven", 11);
		map.put("twelve", 12);
		map.put("thirteen", 13);
		map.put("fourteen", 14);
		map.put("fifteen", 15);
		map.put("sixteen", 16);
		map.put("seventeen", 17);
		map.put("eighteen", 18);
		map.put("nineteen", 19);
		map.put("twenty", 20);
		map.put("thirty", 30);
		map.put("fourty", 40);
		map.put("forty", 40);
		map.put("fifty", 50);
		map.put("sixty", 60);
		map.put("seventy", 70);
		map.put("eighty", 80);
		map.put("ninety", 90);
	}
	
	public static void main(String[] args) {

		String str="one lakh seventy thousand six hundred and thirty nine only";
//		String str="nine hundred ninety nine crore";
		NumberPracticeQues npq= new NumberPracticeQues();
		mapToWord(str);
		System.out.println(NumberPracticeQues.x);
		System.out.println(npq.y);
	}

	private static void mapToWord(String str) {
		
		List<String> words = Arrays.stream(str.split("\\s+"))
				.filter(e -> !e.equalsIgnoreCase("and") && !e.equalsIgnoreCase("only")).collect(Collectors.toList());

		long current = 0;
		long result = 0;
		for (String string : words) {
			if (map.containsKey(string)) {
				current = current + map.get(string); // 70,6,630,639
			}

			else if (string.equals("hundred")) {
				current = current * 100; // 600,
			}

			else if (string.equals("thousand")) {
				result += current * 1000; // 70000
				current = 0;
			}

			else if (string.equals("lakh")) {
				result += current * 100000; // 100000
				current = 0;
			} else if (string.equals("crore")) {
				result += current * 10000000; // 10000000
				current = 0;
			}

		}
		result += current;
		System.out.println(result);
	}
}
