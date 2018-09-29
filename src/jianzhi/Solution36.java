package jianzhi;
/**
 *  @author   :   symfony
 *  @fileName :   jianzhi.Solution36.java
 *  create time:2018年8月4日
 *
 *  @describe :
 *统计一个数字在排序数组中出现的次数。
*/
public class Solution36 {
	public static void main(String[] args) {
		Solution36 rr=new Solution36();
		System.out.println(rr.GetNumberOfK(new int[] {1,2,3,3,3,3},3));
	}
	public int GetNumberOfK(int [] array , int k) {
		System.out.println(findRight(array,k,0,array.length-1));
		System.out.println(findLeft(array,k,0,array.length-1));
	    return findRight(array,k,0,array.length-1)-findLeft(array,k,0,array.length-1)+1;
    }
	public int findLeft(int[] array,int k,int begin,int end) {
		if(begin>=end&&array[begin]==k) {
			return begin;
		}else if(begin==end&&array[begin]!=k){
			return Integer.MAX_VALUE;
		}
		int mid=(end+begin)>>1;
		if(array[mid]<k) {
			return findLeft(array,k,mid+1,end);
		}else if(array[mid]>k) {
			return findLeft(array,k,begin,mid-1);
		}else {
			return Math.min(findLeft(array,k,begin,mid-1),mid);
		}
	}
	public int findRight(int[] array,int k,int begin,int end) {
		if(begin>=end&&array[end]==k) {
			return end;
		}else if(begin==end&&array[begin]!=k){
			return -1;
		}
		int mid=(end+begin)>>1;
		if(array[mid]>k) {
			return findRight(array,k,begin,mid-1);
		}else if(array[mid]<k) {
			return findRight(array,k,mid+1,end);
		}else {
			return Math.max(findRight(array,k,mid+1,end),mid);
		}
	}
}
