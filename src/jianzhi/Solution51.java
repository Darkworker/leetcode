package jianzhi;

import java.util.LinkedList;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution51.java create time:2018年8月5日
 *
 * @describe :
 *
 *           请实现一个函数用来找出字符流中第一个只出现一次的字符。
 *           例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 */
public class Solution51 {
	public static void main(String[] args) {
		Solution51 so = new Solution51();
		String str = "google123l";
		for (char c : str.toCharArray()) {
			so.Insert(c);
			System.out.println(so.FirstAppearingOnce());
		}
	}

	int[] table = new int[256];
	LinkedList<Character> que = new LinkedList<>();

	// Insert one char from stringstream
	public void Insert(char ch) {
		table[ch]++;
		if (table[ch] == 1) {
			que.addLast(ch);
		}
	}

	// return the first appearence once char in current stringstream
	public char FirstAppearingOnce() {
		char tmp = que.getFirst();
		while (table[tmp] != 1 && !que.isEmpty()) {
			que.removeFirst();
			if (que.isEmpty()) {
				break;
			}
			tmp = que.getFirst();
		}
		if (que.isEmpty() && table[tmp] != 1)
			return '#';
		return tmp;
	}
}
