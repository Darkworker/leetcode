package jianzhi;

/**
 *  @author   :   symfony
 *  @fileName :   jianzhi.Solution43.java
 *  create time:2018��8��4��
 *
 *  @describe :
 *
 *ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
 *ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼��
 *���磬��student. a am I����
 *��������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ���ǡ�I am a student.����
 *Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
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
