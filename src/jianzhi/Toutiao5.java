package jianzhi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
/**
 * @author : symfony
 * @fileName : jianzhi.Toutiao5.java create time:2018年9月9日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Toutiao5 {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				HashSet[] array = new HashSet[n+1];
				for(int i=1; i<=n; i++) {
					array[i] = new HashSet();
				}
				for(int i=0; i<m; i++) {
					int a = sc.nextInt();
					int b = sc.nextInt();
					if(a>n||b>n) continue;
					array[b].add(a);
				}
				if(n==1) {
					System.out.println(1);
					return;
				}
				for(int i=1; i<=n; i++) {
					HashSet set = array[i];
					Iterator it = set.iterator();
					while(it.hasNext()) {
						int index = (int)it.next();
						HashSet temp = array[index];
						Iterator tempit = temp.iterator();
						while(tempit.hasNext()) {
							int num = (int)tempit.next();
							if(num!=i) {
								set.add(num);
							}
						}
					}
				}
				int count = 0;
				for(int i=1; i<=n; i++) {
					if(array[i].size()==n-1) {
						count++;
					}
				}
				System.out.println(count);
	 		}
		}
}
