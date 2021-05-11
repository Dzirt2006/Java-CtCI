package Strings;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsUnique {

	// O(n)
	public boolean uniqueChecker(String phrase) {
		char[] arr = phrase.toCharArray();
		Map<Character, Character> charsMap = new HashMap<Character, Character>();
		for (char point : arr) {
			if (!charsMap.containsKey(point))
				charsMap.put(point, point);
		}

		return arr.length==charsMap.size();
	}

	@Test
	public void f() {
		String phrase = "Abra Kadabra";
		boolean expected = false;
		Assert.assertEquals(uniqueChecker(phrase), expected);
	}
	
	@Test
	public void t() {
		String phrase = "Torque";
		boolean expected = true;
		Assert.assertEquals(uniqueChecker(phrase), expected);
	}
}
