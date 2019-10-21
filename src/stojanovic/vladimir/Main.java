package stojanovic.vladimir;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] candies = { 62, 67, 100 };
		int treshold = 8;

		sugarHigh(candies, treshold);
	}

	public static void sugarHigh(int[] arr, int limit) {


        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i + 1; j < arr.length; j++) {
               

                if ((arr[i] + arr[j]) < limit) {
                    System.out.printf("(%d, %d) %n",i , j);
                }
            }

        }
    }
	
}
