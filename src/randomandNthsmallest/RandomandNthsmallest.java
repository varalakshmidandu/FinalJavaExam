/* Description : Generate 500 random numbers and print the nth smallest number in a programming language of your choice.
 *  (Ask user for the Nth smallest number)
 * Created By : Varalakshmi.Pareedu
 * Created On : 11/28/2022  
 * */
package randomandNthsmallest;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomandNthsmallest {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		Random rng = new Random();
		int number;
		int[] num = new int[500];

		for (int i = 0; i < 500; i++) {
			number = rng.nextInt(500); // generating the random numbers
			num[i] = number; // storing the random numbers in array

		}

		System.out.println("Random Numbers");
		Arrays.sort(num);// here sorting the Array
		for (int k = 0; k < 500; k++) {

			System.out.print(num[k] + " ");
		}
		System.out.println();
		System.out.println("please enter  Nth smallest number");
		int n = scr.nextInt();
		System.out.println("The " + n + "th smallest Number is " + num[n]);

	}

}
