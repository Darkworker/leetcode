package jianzhi;

import java.util.LinkedList;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution51.java create time:2018��8��5��
 *
 * @describe :
 *
 *           ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
 *           ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
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
