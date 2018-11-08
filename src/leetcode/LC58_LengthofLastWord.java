package leetcode;

public class LC58_LengthofLastWord {
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello "));
	}
	public static int lengthOfLastWord(String s) {
		int len=0;
		boolean count=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count=true;
			}else if(count){
				len=1;
				count=false;
			}else{
				len++;
			}
		}
		return len;
	}
	public static int lengthOfLastWord1(String s) {
		String[] strs=s.split(" ");
		if(strs==null||strs.length==0) return 0;
		return strs[strs.length-1].length();
	}
}
