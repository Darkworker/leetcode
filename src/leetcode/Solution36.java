package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author : symfony
 * @fileName : leetcode.Solution36.java create time:2018年9月15日
 *
 * @describe :
 *
 *           ALL RIGHTS RESERVED,COPYRIGHT(C) FCH LIMITED 2018
 */
public class Solution36 {
	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		char[][] board1 = { { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		System.out.println(isValidSudoku(board));
	}

	public static boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == '.') {
					Set set = getPossible(board, i, j);
					if (set.isEmpty()) {
						return false;
					} else {
						//set.forEach(x->System.out.print(x+", "));
						//System.out.println();
						for (Object c : set) {
							board[i][j] = (char) c;
							print(board);
							if (isValidSudoku(board)) {
								return true;
							}
						}
						board[i][j]='.';
						return false;
					}
				}
			}
		}
		return true;
	}
	public static void print(char[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]+" ,");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static Set getPossible(char[][] board, int idx_i, int idx_j) {
		HashMap<Character, Integer> possible = new HashMap<>();
		for (int i = 1; i <= 9; i++)
			possible.put((char) (i + '0'), 1);
		// 规则1
		for (int j = 0; j < 9; j++) {
			if (j != idx_j && board[idx_i][j] != '.') {
				possible.remove(board[idx_i][j]);
			}
		}
		// 规则2
		for (int i = 0; i < 9; i++) {
			if (i != idx_i && board[i][idx_j] != '.') {
				possible.remove(board[i][idx_j]);
			}
		}
		// 规则3
		int angle_i = idx_i / 3*3;
		int angle_j = idx_j / 3*3;
		for (int i = angle_i; i < angle_i + 3; i++) {
			for (int j = angle_j; j < angle_j + 3; j++) {
				if (board[i][j] != '.') {
					possible.remove(board[i][j]);
				}
			}
		}
		return possible.keySet();
	}
}
