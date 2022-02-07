package jianzhi;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : symfony
 * @fileName : jianzhi.Toutiao2.java create time:2018年9月9日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Toutiao2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		if (N <= 0) {
			System.out.println(0);
			return;
		}
		int[][] M = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				M[i][j] = sc.nextInt();
			}
		}
		System.out.println(findTeam(M));
	}

	public static int findTeam(int[][] M) {
		List<HashMap<String, Integer>> segs = new LinkedList<>();
		int N = M.length;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (M[i][j] == 0)
					continue;
				HashMap<HashMap, Integer> contain = new HashMap<>();
				for (int k = 0; k < segs.size(); k++) {
					if (segs.get(k).containsKey((i - 1) + "," + j) || segs.get(k).containsKey(i + "," + (j - 1))) {
						contain.put(segs.get(k), k);
					}
				}
				if (contain.isEmpty()) {
					HashMap<String, Integer> seg = new HashMap<>();
					seg.put(i + "," + j, 1);
					segs.add(seg);
				} else {
					HashMap<String, Integer> seg = new HashMap<>();
					for (HashMap key : contain.keySet()) {
						seg.putAll(key);
					}
					seg.put(i + "," + j, 1);
					segs.add(seg);
					for (HashMap key : contain.keySet()) {
						segs.remove(key);
					}
				}
			}
		}

		return segs.size();
	}
}
/**
 * 4 1 0 0 0 1 0 0 1 0 0 0 1 0 0 0 1
 **/
