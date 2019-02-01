package leetcode;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LC524LongestWordinDictionarythroughDeleting {
	public static void main(String[] args) {
		List<String> d = new LinkedList<>();
		d.add("dsa");
		d.add("sd");
		d.add("asa");
		findLongestWord("d", d);
	}

	public static String findLongestWord(String s, List<String> d) {
		d.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return o2.length() - o1.length();
			}
		});
		for(String str:d) {
			if(match(s,str)) {
				return str;
			}
		}
		return "";
	}

	public static boolean match(String s, String d) {
		int i = 0, j = 0;
		while (i < s.length()) {
			if (j < d.length()) {
				if (s.charAt(i) == d.charAt(j)) {
					j++;
				}
			} else {
				return true;
			}
			i++;
		}
		return j==d.length();
	}
}
