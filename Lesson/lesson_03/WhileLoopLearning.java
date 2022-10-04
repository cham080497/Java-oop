package lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopLearning {
    public static void main(String[] args) {
        boolean isContinuing = true;

        while (isContinuing){
            System.out.println("===Game Menus===");
            System.out.println("1. Generate a random number");
            System.out.println("0. Exit!");

            System.out.print("Please input option: \n");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            if (option == 0) {
                isContinuing = false;
            } else if (option == 1) {
                int randomNumber = new SecureRandom().nextInt(1000);
                System.out.printf("Your random number is: %d\n", randomNumber);

            }else {
                System.out.println("Game over");
            }
        }
    }
}
