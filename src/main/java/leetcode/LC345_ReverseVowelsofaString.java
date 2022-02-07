package leetcode;

import java.util.HashSet;

public class LC345_ReverseVowelsofaString {
	public static void main(String[] args) {
		System.out.println(reverseVowels("leetcode"));
	}
	public static String reverseVowels(String s) {
		char[] str=s.toCharArray();
		char[] vowels1=new char[] {'a','e','i','o','u'};
		HashSet<Character> vowels=new HashSet<>();
		for(char c:vowels1) {
			vowels.add(c);
		}
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			while(i<j&&vowels.contains(s.charAt(i))==false) {
				i++;
			}
			while(i<j&&vowels.contains(s.charAt(j))==false) {
				j--;
			}
			if(i<j) {
				char tmp=s.charAt(i);
				str[i]=str[j];
				str[j]=tmp;
				i++;
				j--;
			}
		}
		return new String(str);
	}
}
