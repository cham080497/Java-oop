package lesson_04;

import java.security.SecureRandom;

public class FunctionLearning {
    public static void main(String[] args) {
        //printARandomNum(2);
        int maximum = getMaximumValue(4, 2);
        System.out.println(maximum);
    }

    private static int getMaximumValue(int firstNum, int secondNum) {
        int maximum = firstNum;
        if (secondNum >= firstNum){
            maximum = secondNum;
        }
        return maximum;
    }

    // Access Modifier | class method | returned type
    // number is parameter
    public static void printARandomNum(int number){
        System.out.println(new SecureRandom().nextInt(20));
    }
}
