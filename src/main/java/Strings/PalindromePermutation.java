package Strings;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromePermutation {

	public boolean checker(String phrase) {
		Map<Character, Integer> strMap = new HashMap<Character, Integer>();
		mapFill(phrase, strMap);
		return mapPalindromer(strMap);
	}

	private void mapFill(String phrase, Map<Character, Integer> strMap) {
		for (int i = 0; i < phrase.length(); i++) {
			char curr = phrase.charAt(i);
			if (curr == ' ')
				continue;
			if (strMap.containsKey(curr)) {
				int temp = 1 + strMap.get(curr);
				strMap.put(curr, temp);
			} else {
				strMap.put(curr, 1);
			}
		}
	}

	/**
	 * palindrome can has only one odd set of characters
	 * @param strMap
	 * @return
	 */
	private boolean mapPalindromer(Map<Character, Integer> strMap) {
		Collection<Integer> valuesArr = strMap.values();
		Iterator iterator = valuesArr.iterator();
		boolean odd = false;
		while (iterator.hasNext()) {
			int num = (int) iterator.next();
			if (num % 2 == 1) {
				if (!!odd)
					return false;
				odd = true;
			}
		}
		return true;
	}

	@Test
	public void t() {
		String phrase = "carambaT T Tabmarac";
		Assert.assertTrue(checker(phrase));
	}
	
	@Test
	public void f() {
		String phrase = "carambaT RT Tabmarac";
		Assert.assertFalse(checker(phrase));
	}

}
