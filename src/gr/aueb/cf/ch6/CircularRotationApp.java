package gr.aueb.cf.ch6;

public class CircularRotationApp {

    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 8};
        int[] rotated = doCircularRightShiftBy(arr, 25);

        for (int item : rotated){
            System.out.print(item + " ");
        }

    }

    public static int[] doCircularRightShiftBy(int[] arr, int offset){
        if (arr == null) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    public static int[] doCircularLeftShiftBy(int[] arr, int offset){
        if (arr == null) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
    }
}
