package lesson_04;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int userInput =  sc.nextInt();
//        if(userInput == 1){
//            System.out.println("Giai nhat");
//        } else if(userInput == 2){
//            System.out.println("Giai nhi");
//        } else if(userInput == 3){
//            System.out.println("Giai ba");
//        }else{
//            System.out.println("Nhap sai!!");
//        }
        switch (userInput){
            case 1:
                System.out.println("Giai nhat");
                break;
            case 2:
                System.out.println("Giai nhi");
                break;
            case 3:
                System.out.println("Giai ba");
                break;
            default:
                System.out.println("Nhap sai");
        }
    }

}
