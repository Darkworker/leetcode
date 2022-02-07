package leetcode;

public class LC4_MedianofTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length, n = nums2.length;
		if (m > n) {
			// 交换数组，避免m比n大的时候
			return findMedianSortedArrays(nums2, nums1);
		}
		if (n == 0) {
			return -1;
		}
		int imin = 0, imax = m, half = (m + n + 1) / 2;
		int i = 0;
		int j = half - i;
		while (imin <= imax) {
			i = (imin + imax) / 2;
			j = half - i;
			if (i < m && nums2[j - 1] > nums1[i]) {
				// i太小
				imin = imin + 1;
			} else if (i > 0 && nums1[i - 1] > nums2[j]) {
				// i太大
				imax = imax - 1;
			} else {
				break;
			}
		}

		// 此时i正好
		int max_of_left = 0;
		int min_of_right = 0;
		j = half - i;
		if (i == 0) {
			max_of_left = nums2[j - 1];
		} else if (j == 0) {
			max_of_left = nums1[i - 1];
		} else {
			max_of_left = Math.max(nums1[i - 1], nums2[j - 1]);
		}
		if (i == m) {
			if (j < n) {
				min_of_right = nums2[j];
			} else {
				min_of_right = nums2[j - 1];
			}
		} else if (j == n) {
			min_of_right = nums1[i];
		} else {
			min_of_right = Math.min(nums1[i], nums2[j]);
		}
		if ((m + n) % 2 == 0) {
			return (max_of_left + min_of_right) / 2.0;
		} else {
			return max_of_left;
		}
	}

}
