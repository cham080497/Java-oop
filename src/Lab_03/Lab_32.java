package Lab_03;

import java.util.Scanner;

//Finding maximum value/minimum value from an integer array
//
//        int[] intArr = {1, 2, 3, 4, 5};
public class Lab_32 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max ){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
