package leetcode;

import java.util.Arrays;

/**
 * @author : symfony
 * @fileName : leetcode.LC48_RotateImage.java create time:2018年10月7日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class LC48_RotateImage {
	public static void main(String[] args) {
		LC48_RotateImage obj=new LC48_RotateImage();
		int[][] matrix=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		obj.rotate(matrix);
		for(int[] line:matrix) {
			Arrays.stream(line).forEach(x->System.out.print(x+" "));
			System.out.println();
		}
	}
	public void rotate(int[][] matrix) {
		for (int i = 0; i < matrix.length / 2; i++) {
			System.out.println(i);
			rotateHelper(matrix, i);
		}
	}

	// 旋转一圈
	public void rotateHelper(int[][] matrix, int begin) {
		for (int i = begin; i < matrix.length - begin; i++) {
			System.out.println(begin+","+i);
			rotateHelper(matrix, begin, i);
		}
	}

	// 旋转一个点
	public void rotateHelper(int[][] matrix, int idx_i, int idx_j) {
		// 获取第一个变化后的坐标
		// 横变，纵不变
		int idx1j = idx_i;
		int idx1i = matrix.length - 1 - idx_j;
		System.out.println("idx1 "+idx1i+","+idx1j);
		// 获取第二个变化后的坐标
		// 纵变，横不变
		int idx2i = matrix.length - 1 - idx1j;
		int idx2j = idx1i;
		System.out.println("idx2 "+idx2i+","+idx2j);
		// 获取第二个变化后的坐标
		// 横变，纵不变
		int idx3j=idx2i;
		int idx3i=matrix.length - 1 - idx2j;
		System.out.println("idx3 "+idx3i+","+idx3j);
		
		int tmp=matrix[idx_i][idx_j];
		matrix[idx_i][idx_j]=matrix[idx3i][idx3j];
		matrix[idx3i][idx3j]=matrix[idx2i][idx2j];
		matrix[idx2i][idx2j]=matrix[idx1i][idx1j];
		matrix[idx1i][idx1j]=tmp;
	}
}
