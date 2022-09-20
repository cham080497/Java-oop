package lesson_03;

public class ArrayLearning {
    public static void main(String[] args) {
        final int ARR_LENGTH = 5;
        int[] myArr = new int[ARR_LENGTH];
        for (int index = 0; index < ARR_LENGTH; index++) {
            myArr[index] = ++index;
        }
        for (int index = 0; index < ARR_LENGTH; index++) {
            System.out.println(myArr[index]);
        }
        //Enhanced for
        for(int value: myArr){
            System.out.println(value);
        }
        }
}
