package gr.aueb.cf.ch6;

public class MissingArrayElement {

    public static void main(String[] args) {
        int missingElement;
        int[] arr = {5, 1, 3, 2};

        missingElement = getMissing(arr);

        System.out.println(missingElement);

    }

    public static int getMissing(int[] arr){
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
        arrSum += arr[i];
        }
         return sum - arrSum;
    }
}
