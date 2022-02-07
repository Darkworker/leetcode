package jianzhi;

import java.util.Scanner;

/**
 *  @author   :   symfony
 *  @fileName :   jianzhi.Toutiao1.java
 *  create time:2018年9月9日
 *
 *  @describe :
 *
 *  ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
*/
public class Toutiao1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		 if(str==null||str.length()==0){
	            System.out.println(0);
	            return;
	        }
		System.out.println(maxSubString(str));
	}
	public static int maxSubString(String str) {
		int[] nums=new int[str.length()];
		nums[0]=1;
		for(int i=1;i<nums.length;i++) {
			if(!contain(str,i-nums[i-1],i-1,str.charAt(i))) {
				nums[i]=1;
			}else {
				nums[i]=nums[i-1]+1;
			}
		}
		int max=-1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) max=nums[i];
		}
		return max;
	}
	public static boolean contain(String str,int begin,int end,char c) {
		for(int i=begin;i<=end;i++) {
			if(str.charAt(i)==c) {
				return false;
			}
		}
		return true;
	}
}
