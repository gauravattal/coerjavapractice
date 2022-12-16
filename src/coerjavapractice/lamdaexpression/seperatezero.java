package coerjavapractice.lamdaexpression;

import java.util.Arrays;

public class seperatezero {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 0, 1, 0, 1, 1 };
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				arr[counter] = arr[i];
				counter++;
			}

		}
	

		while (counter < arr.length) {
			arr[counter] = 0;
			counter++;
		}

		for (int i : arr) {
			System.out.println(i);
		}

	}
}
