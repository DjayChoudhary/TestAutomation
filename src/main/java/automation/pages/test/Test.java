package automation.pages.test;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is an is an interview, a QA interview,  .";

		Map<String, Integer> freqMap = new HashMap<>();

		String words[] = s.split("\\s");
		System.out.println(words.length);

		for (String word : words) {
			freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}

	}

}
