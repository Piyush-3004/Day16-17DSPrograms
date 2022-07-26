import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Asg4BubbleSort {

	static List<Integer> integerList = new ArrayList<>();
	static Random random = new Random();

	public static void main(String[] args) {
		createArrayList();
		printArrayList();
		bubbleSortArrayList();
		System.out.println("Sorted Array : ");
		printArrayList();
	}

	private static void bubbleSortArrayList() {
		for (int i = 1; i < integerList.size(); i++) {
			int size = integerList.size();

			for (int j = 0; j < size - 1; j++)

				for (int k = 0; k < size - j - 1; k++)

					if (integerList.get(k).compareTo(integerList.get(k + 1)) > 0) {

						Integer temp = integerList.get(k);
						integerList.set(k, integerList.get(k + 1));
						integerList.set(k + 1, temp);
					}
		}
	}

	private static void printArrayList() {
		System.out.println(integerList);
	}

//  IP - Enter array elements
	private static void createArrayList() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter array integer elements");
		for (int i = 0; i < 10; i++) {
			integerList.add(scanner.nextInt());
		}
	}

}
