package jianzhi;

/**
 * @author : symfony
 * @fileName : jianzhi.Solution29.java create time:2018��8��4��
 *
 * @describe :
 *
 *           HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ����������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,
 *           ������ȫΪ������ʱ��,����ܺý��������,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�����:{6,-3,-2,7,-15,1,2,2},
 *           ����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)����һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)
 */
public class Solution29 {
	public static void main(String[] args) {
		Solution29 so = new Solution29();
		System.out.println(so.FindGreatestSumOfSubArray(new int[] {6,-3,-2,7,-15,1,2,2}));
	}
	public int FindGreatestSumOfSubArray(int[] array) {
		if(array==null||array.length==0) {
			return 0;
		}
		int max=Integer.MIN_VALUE;
		int tmp=0;
		for(int i=0;i<array.length;i++) {
			tmp+=array[i];
			if(tmp<0) {
				tmp=0;
			}else if(tmp>max) {
				max=tmp;
			}
		}
		return max;
	}
}
