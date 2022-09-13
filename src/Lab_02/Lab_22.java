package Lab_02;

import java.util.Scanner;

public class Lab_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int myNum = scanner.nextInt();

        if(myNum % 2 == 0){
            System.out.println("This is even number!");
        }
        else {
            System.out.println("This is an odd!");
        }

    }
}
