package lesson_06;

import java.util.Arrays;

public class StringLearning {
    public static void main(String[] args) {
//        String myPassword = "123mypassword";
//        char[] myCharacter =  myPassword.toCharArray();
//        System.out.println(Arrays.toString(myCharacter));
//
//        int digitCount, lowerCaseCount, upperCaseCount;
//        digitCount = lowerCaseCount = upperCaseCount = 0;
//        for (char character : myCharacter) {
//            if(Character.isDigit(character))
//                digitCount++;
//            else if(Character.isUpperCase(character))
//                upperCaseCount++;
//            else if(Character.isLowerCase(character))
//                lowerCaseCount++;
//
//        }
//
//        if(digitCount > 0 && lowerCaseCount > 0 && upperCaseCount > 0){
//            System.out.println("You are all set");
//        }else {
//            System.out.println("Password format invalid!");
//        }

        //Immutable
//        String badWordContainer = "         very bad, bad, bitch     ";
//        String filteredStr = badWordContainer.replace("bad", "b**");
//        filteredStr = filteredStr.trim();
//        System.out.println(filteredStr);
//
//        //subString, indexOf, split
//        String url = "https://google.com";
//        System.out.println(url.substring(0 , 5));
//        System.out.println(url.substring(8, url.length()));
//
//        System.out.println(url.indexOf("p"));

        //Regular expression (Regex)
        String cookingTimeStr = "100mins";
        String cookingTimeNumStr = cookingTimeStr.replaceAll("[^0-9]", "");
        System.out.println(cookingTimeNumStr);

    }
}
