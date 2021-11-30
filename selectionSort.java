package searchingAndSorting;
import java.util.Scanner;

import java.util.*;

public class selectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println(
                "Sorting an integer array Using selections sort, press enter to generate a random array of 10 integers.");
        input.nextLine();

        int[] array = new int[10];

        System.out.print("\nGreat. Here's a look at our unsorted array: ");
        for (int i = 0; i < array.length; i++) { // fills array with random numbers between 1 and 99
            array[i] = 1 + rand.nextInt(21);
        }

        System.out.println("\nArray: ");
        displayArr(array);
        selectionSort(array);
    }

   
    public static void selectionSort(int arr[]) {
        int counter = 0;
        int max = arr[0];
        int maxIndex = 0;
        int n = 1;
        Boolean check = true;
        int i = 0;

        int length = arr.length;
        while (check) {
            for (i = 0; i <= length - n; i++) {

                if (arr[i] > max) {
                    maxIndex = i;
                    max = arr[i];
                }

            }
            
            arr[maxIndex] = arr[arr.length - n];
            arr[arr.length - n] = max;
            n++;
            

            max = 0;
            maxIndex = 0;

            displayArr(arr);
            if (n == arr.length) {
                check = false;
            }

        }
        System.out.println("sorted: ");
        displayArr(arr);
    }
    
    public static int[] displayArr(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		return arr;
}
}
