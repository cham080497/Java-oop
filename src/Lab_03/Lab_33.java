package Lab_03;

//Sort an integer array from min to max
//
//        Input: {12, 34, 1, 16, 28}

public class Lab_33 {
    public static void main(String[] args) {

        int [] arr = {12, 34, 1, 16, 28};

        for(int i = 0; i < arr.length; i++){
            for (int j = i +1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Result after sorted: ");
        for (int i = 0; i < arr.length - 1; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
    }
}
