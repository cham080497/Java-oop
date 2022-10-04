package lab_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//=====MENU======
//        1. Add number into ArrayList
//        2. Print numbers
//        3. Get maximum number
//        4. Get minimum number
public class lab_5 {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        boolean isContinuing = true;
        while (isContinuing){
            printGameMenu();
            int userOption  =getUserOption();
            switch (userOption){
                case 0:
                    isContinuing =false;
                    break;
                case 1:
                    addNumberIntoArrList(myArrayList);
                    break;
                case 2:
                    printArrayList(myArrayList);
                case 3:
                    if(myArrayList.size() > 0){
                        int maxNum = getMaximumNumber(myArrayList);
                        System.out.println("Maximum Number is :"+ maxNum);
                    } else System.out.println("Array is blank");
                    break;
                case 4:
                if(myArrayList.size() > 0){
                    int minNum = getMinimumNumber(myArrayList);
                    System.out.println("Minimum Number:" + minNum);
                } else System.out.println("Array is blank");

                break;
//                case 5:
//                    searchMethod();
                case 6:
                    resetTheList(myArrayList);
                    break;
                default:
                    System.out.println("Wrong option!");
            }

        }
    }
    private static void printGameMenu() {
        System.out.println("====== Game menu ======");
        System.out.println("1. Add number into Array List");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Choose any number to see its position");
        System.out.println("6. Reset the list");
        System.out.println("0. Exit!");
    }

    private static int getUserOption() {
        System.out.println("Please enter your option: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    private static void addNumberIntoArrList(List<Integer> myArrayList) {
        System.out.println("Please enter the number into list: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        myArrayList.add(number);
    }
    private static void printArrayList(List<Integer> myArrayList) {
        System.out.println(myArrayList);
    }
    private static int getMaximumNumber(List<Integer> myArrayList) {
        int maxNum = 0;
        for (int i = 0; i < myArrayList.size() -1; i++) {
            if(myArrayList.get(i) < myArrayList.get(i+1)){
                maxNum = myArrayList.get(i + 1);
            }
        }
        return maxNum;
    }
    private static int getMinimumNumber(List<Integer> myArraylist) {
        int minNum = 0;
        for (int i = 0; i < myArraylist.size() - 1; i++) {
            if(myArraylist.get(i) < myArraylist.get(i+1)){
                minNum = myArraylist.get(i);
            }
        }
        return minNum;
    }
    private static void resetTheList(List<Integer> myArrayList) {
        myArrayList.clear();
        System.out.println("The list is now reset");
    }

}
