package jianzhi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 
 * @author symfony
 *
 */
public class Solution26 {
	public static void main(String[] args) {
		ArrayList<String> result =new Solution26().Permutation("dewe");
		System.out.println(result.size());
		System.out.println(result.get(0));
	}
	ArrayList<String> result=new ArrayList<>();
	ArrayList<Character> str=new ArrayList<>();
	public ArrayList<String> Permutation(String str) {
		
		if(str==null||str.length()==0) {
			return result;
		}
		char[] cs=str.toCharArray();
		Arrays.sort(cs);
		ArrayList<Character> alpha= new ArrayList<>();
		for(char c:cs) {
			alpha.add(c);
		}
		helper(alpha);
		
		return result;
	}
	public void helper(ArrayList<Character> alpha) {
		if(alpha.size()==0) {
//			String st=Stream.of(str.toArray()).map(new Function<Object, String>() {
//
//				@Override
//				public String apply(Object t) {
//					// TODO Auto-generated method stub
//					return t+"";
//				}
//			}).reduce(new BinaryOperator<String>() {
//				
//				@Override
//				public String apply(String arg0, String arg1) {
//					// TODO Auto-generated method stub
//					return arg0+arg1;
//				}
//			}).get();
			String st=Stream.of(str.toArray()).map((t)->t+"").reduce((str1,str2)->str1+str2).get();
			result.add(st);
		}
		for(int i=0;i<alpha.size();i++) {
			char c=alpha.get(i);
			if(i>0&&c==alpha.get(i-1)) {
				continue;
			}
			str.add(c);
			alpha.remove(i);
			helper(alpha);
			alpha.add(i,c);
			str.remove(str.size()-1);
		}
	}
	
}
