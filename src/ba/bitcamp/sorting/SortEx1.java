package ba.bitcamp.sorting;

public class SortEx1 {

	public static void main(String a[]) {
		int[] arr1 = { 10, 34, 2, 56, 7, 67, 88, 42 };
		arr1 = doInsertionSort(arr1);
		for (int i : arr1) {
			System.out.print(i);
			System.out.print(", ");
		}
	}

	public static int[] doInsertionSort(int[] input) {

		for (int i = 0; i < input.length; i++) {
			int index = i;

			while (index > 0 && input[index] < input[index - 1]) {

				int temp = input[index];
				input[index] = input[index - 1];
				input[index - 1] = temp;
				index--;

			}

		}

		return input;

	}

}
