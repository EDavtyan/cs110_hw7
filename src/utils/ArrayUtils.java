package utils;

public class ArrayUtils {


    public static int[] reverse(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }


    public static String stringifyArray(int[] arr) {
        String arrStr = "";
        int i = 0;
        while (i != arr.length) {
            if (i == arr.length - 1) {
                arrStr += arr[i];
            } else {
                arrStr += arr[i] + ", ";
            }
            i++;
        }
        return arrStr;
    }
}
