package jianzhi;

import java.util.ArrayList;

public class Case3 {
	public static void main(String[] args) {
		ListNode res = new ListNode(0);
		ListNode tmp = res;
		tmp.next = new ListNode(11);
		System.out.println(res.next.val);
	}

	public ArrayList<Integer> printMatrix(int[][] matrix) {
		int low_row = 0;
		int high_row = matrix.length - 1;
		int low_col = 0;
		int high_col = matrix[0].length - 1;
		ArrayList<Integer> res = new ArrayList<>();
		while (low_col <= high_col || low_row <= high_row) {
			// ����һ i���䣬j++
			for (int i = low_col; i <= high_col; i++) {
				res.add(matrix[low_row][i]);
			}
			low_row++;
			
			for (int i = low_row; i <= high_row; i++) {
				res.add(matrix[i][high_col]);
			}
			high_col--;

			for (int i = high_col; i >= low_col; i--) {
				res.add(matrix[high_row][i]);
			}
			high_row--;
			for (int i = high_row; i >= low_row; i--) {
				res.add(matrix[i][low_col]);
			}
			low_col++;
		}
		return res;
	}

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}
	}
}
