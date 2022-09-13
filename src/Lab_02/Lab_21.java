package Lab_02;

import java.util.Scanner;

public class Lab_21 {
    public static void main(String[] args) {
        // <18.5 || 18.5 - 24.9 || 25 - 29.9 || >= 30
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your weight:");
        int clientWeight = scanner.nextInt();
        System.out.print("Please enter your height: ");


        double clientHeight = scanner.nextFloat();

        double BMI = clientWeight / Math.pow(clientHeight,2);
        BMI = Math.round(BMI*10)/10;
        System.out.println("BMI is :"+ BMI);

        //Comparison operator
        if(BMI < 18.5){
            System.out.println("Under weight!");
            double increase_weight =  24.9*Math.pow(clientHeight,2) - clientWeight;
            System.out.println(" You need to increase:" + increase_weight);
        }else if (BMI >= 18.5 && BMI <= 24.9){
            System.out.println("Normal weight!");
        }else if (BMI >= 25 && BMI <= 29.9){
            System.out.println("Over weight");
            double decrease_weight = clientWeight - 24.9*Math.pow(clientHeight,2);
            System.out.println("You need to decrease:" + decrease_weight);
        }else{
            System.out.println("Obesity!");
            double decrease_weight = clientWeight - 24.9*Math.pow(clientHeight,2);
            System.out.println("You need to decrease:" + decrease_weight);
        }

    }
}
