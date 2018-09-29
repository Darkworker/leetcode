package jianzhi;

public class Case1 {
	public static void main(String[] args) {
		if(3==3) {
			System.out.println("3");
		}else if(4==4) {
			System.out.println("4");
		}
	}

	public boolean Find(int target, int[][] array) {
		int col = array[0].length - 1;
		int row = 0;
		while (col >= 0 && row < array.length) {
			if (target == array[row][col]) {
				return true;
			} else if (target < array[row][col]) {
				col--;
			} else if (target > array[row][col]) {
				row++;
			}
		}
		return false;
	}
}
