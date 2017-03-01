package com.hand.chenhao;

/*
 * ʹ��java��дʱ�临�Ӷ�Ϊnlogn�������㷨(��������)��
 */
public class Sort {
	public static int getMiddle(int[] numbers, int low, int high) {
		int temp = numbers[low]; // ����ĵ�һ����Ϊ����
		while (low < high) {
			while (low < high && numbers[high] > temp) {
				high--;
			}
			numbers[low] = numbers[high];// ������С�ļ�¼�Ƶ��Ͷ�
			while (low < high && numbers[low] < temp) {
				low++;
			}
			numbers[high] = numbers[low]; // �������ļ�¼�Ƶ��߶�
		}
		numbers[low] = temp; // �����¼��β
		return low; // ���������λ��
	}

	public static void quickSort(int[] numbers, int low, int high) {
		if (low < high) {
			int middle = getMiddle(numbers, low, high); // ��numbers�������һ��Ϊ��
			quickSort(numbers, low, middle - 1); // �Ե��ֶα���еݹ�����
			quickSort(numbers, middle + 1, high); // �Ը��ֶα���еݹ�����

		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 56, 89, 58, 34, 24, 45, 12 };
		System.out.print("��ʼ����:[");
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.print(arr[i] + ",");
			} else {
				System.out.print(arr[arr.length - 1] + "]");
			}
		}
		System.out.println("\t");
		quickSort(arr, 0, arr.length - 1);
		System.out.print("���������:[");
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.print(arr[i] + ",");
			} else {
				System.out.print(arr[arr.length - 1] + "]");
			}
		}
	}
}