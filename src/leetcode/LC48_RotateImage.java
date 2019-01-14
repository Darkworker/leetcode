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
		int[][] matrix=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		LC48_RotateImage rotate=new LC48_RotateImage();
		rotate.rotate(matrix);
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+", ");
			}
			System.out.println();
		}
	}
	
	public void rotate(int[][] matrix) {
		for(int i=0;i<matrix.length/2;i++) {
			rotate(matrix,i);
		}
	}

	public void rotate(int[][] matrix,int lay) {
		for(int i=lay;i<matrix.length-1-lay;i++) {
			int x1=lay;
			int y1=i;
			for(int k=0;k<3;k++) {
				int x2,y2;
				if(k==0) {
					x2=i;
					y2=matrix.length-1-lay;
				}else if(k==1) {
					x2=matrix.length-1-lay;
					y2=matrix.length-1-i;
				}else {
					x2=matrix.length-1-i;
					y2=lay;
				}
				this.swap(matrix, x1, y1, x2, y2);
			}
		}
	}

	private void swap(int[][] matrix, int x1, int y1, int x2, int y2) {
		int tmp = matrix[x1][y1];
		matrix[x1][y1] = matrix[x2][y2];
		matrix[x2][y2] = tmp;
	}

}
