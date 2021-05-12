package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Permutation {

	public boolean permutationChecker(String left, String right) {
		if (left.length() != right.length())
			return false;
		Set<String> stringList = new HashSet<String>();
		backtracking(stringList, left, "");
		System.out.println(stringList);
		return stringList.contains(right);
	}

	
	/**
	 * calling recursion with cutted by char at i string (length-1) 
	 * and second param is char at i
	 * ex: next iteration will be : abb, a
	 * @param list
	 * @param str
	 * @param res
	 */
	public void backtracking(Set<String> list, String str, String res) {
		if (str.length() == 0) {
			list.add(res);  // hashset allow to prevent duplicates
			return;
		} else {
			for (int i = 0; i < str.length(); i++) {
				char swap = str.charAt(i);
				String temp = str.substring(0, i) + str.substring(i + 1);
				backtracking(list, temp, res + swap);
			}
		}
	}

	@Test
	public void f() {
		String left = "abba";
		String right = "baab";
		boolean expected = true;
		Assert.assertEquals(permutationChecker(left, right), expected);
	}

}
