package lab_06;

import java.util.Arrays;
import java.util.Scanner;

//String myPassword = "password123";
//        Allow user to input maximum 3 times
public class lab_62 {
    public static void main(String[] args) {
        String myPassword = "password123";
        Scanner sc = new Scanner(System.in);
        String userInput;
        int count = 1;

        System.out.print("Please enter your password: ");

        do{
            userInput = sc.nextLine();
            if (userInput.equals(myPassword)){
                System.out.println("Password correct!");
                break;
            }else {
                count++;
                System.out.print("Wrong password");
                if(count <= 3) {
                    System.out.print("Vui long nhap lai: ");
                }else {
                    System.out.println("Het luot!");
                }
            }
        }while (count <=3);

//        for (int i = count; i <= 3; i++){
//            userInput = sc.nextLine();
//            if(userInput.equals(myPassword)){
//                System.out.println("You are correct!");
//            }else{
//                System.out.println("Wrong password!");
//                count++;
//                break;
//            }
//        }
    }
}
