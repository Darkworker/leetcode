package jianzhi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
 * ���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
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
