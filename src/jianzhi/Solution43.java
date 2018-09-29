package jianzhi;

import java.util.Arrays;

/**
 *  @author   :   symfony
 *  @fileName :   jianzhi.Solution43.java
 *  create time:2018年8月4日
 *
 *  @describe :
 *
 *牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 *同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 *例如，“student. a am I”。
 *后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 *Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
*/
public class Solution43 {
	public static void main(String[] args) {
		Solution43 rs=new Solution43();
		System.out.println(rs.ReverseSentence(" "));
		
	}
	public String ReverseSentence(String str) {
		if(str==null||str.length()<=1) {
			return str;
		}
		String[] words=str.split(" ");
		String res="";
		for(int i=words.length-1;i>=0;i--) {
			res+=words[i]+" ";
		}
		if(res.length()>1) {
		res=res.substring(0, res.length()-1);
		}else {
			return str;
		}
		return res;
	}
	
	public String Rotate(String str) {
		return new String(Rotate(str.toCharArray(),0,str.length()-1));
	}
	public char[] Rotate(char[] array,int begin,int end) {
		for(int i=begin,j=end;i<j;i++,j--) {
			char tmp=array[i];
			array[i]=array[j];
			array[j]=tmp;
		}
		return array;
	}
}
