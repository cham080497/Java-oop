package Lab_03;

import java.util.Scanner;

//Count how many odd, even number(s) in an integer array
//
//        int[] intArr = {1, 2, 3, 4, 5};

public class Lab_31 {
    public static void main(String[] args) {
        int n;
        int evenCount = 0, oddCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of Elements: ");
        n = scanner.nextInt();
        int [] Arr = new int[n];

        for(int i = 0; i < n; i++){
            Arr[i] = scanner.nextInt();
        }

        for(int i=0;i<n;i++) {
            if(Arr[i] % 2 == 0) {
                evenCount++;
            }else {
                oddCount++;
            }
        }

        System.out.println("Total number of even number in this Array =" + evenCount);
        System.out.println("Total number of odd number in this Array =" + oddCount);

    }
}
