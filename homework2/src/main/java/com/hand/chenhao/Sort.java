package com.hand.chenhao;

/*
 * 使用java编写时间复杂度为nlogn的排序算法(快速排序)，
 */
public class Sort {
	public static int getMiddle(int[] numbers, int low, int high) {
		int temp = numbers[low]; // 数组的第一个作为中轴
		while (low < high) {
			while (low < high && numbers[high] > temp) {
				high--;
			}
			numbers[low] = numbers[high];// 比中轴小的记录移到低端
			while (low < high && numbers[low] < temp) {
				low++;
			}
			numbers[high] = numbers[low]; // 比中轴大的记录移到高端
		}
		numbers[low] = temp; // 中轴记录到尾
		return low; // 返回中轴的位置
	}

	public static void quickSort(int[] numbers, int low, int high) {
		if (low < high) {
			int middle = getMiddle(numbers, low, high); // 将numbers数组进行一分为二
			quickSort(numbers, low, middle - 1); // 对低字段表进行递归排序
			quickSort(numbers, middle + 1, high); // 对高字段表进行递归排序

		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 56, 89, 58, 34, 24, 45, 12 };
		System.out.print("初始数组:[");
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.print(arr[i] + ",");
			} else {
				System.out.print(arr[arr.length - 1] + "]");
			}
		}
		System.out.println("\t");
		quickSort(arr, 0, arr.length - 1);
		System.out.print("排序后数组:[");
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.print(arr[i] + ",");
			} else {
				System.out.print(arr[arr.length - 1] + "]");
			}
		}
	}
}