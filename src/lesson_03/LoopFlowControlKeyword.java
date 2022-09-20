package lesson_03;

public class LoopFlowControlKeyword {
    public static void main(String[] args) {
        for (int number = 0; number < 5; number++)
        {
            if (number == 3)
                continue;
            System.out.println(number);
        }
    }
}
