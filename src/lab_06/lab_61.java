package lab_06;

import java.util.Arrays;

//Given input string: "2hrs and 5 minutes"
//        Please calculate how many minutes in total
public class lab_61 {
    public static void main(String[] args) {

        String timeStr = "5hrs and 5 minutes";
        String timeNumberStr = timeStr.replaceAll("[^0-9]", "");
        String hour = timeNumberStr.substring(0,1);
        String min = timeNumberStr.substring(1,2);
        System.out.println(Integer.parseInt(hour)*60 + Integer.parseInt(min));

    }
}
