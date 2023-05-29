package gr.aueb.cf.ch10;

public class ProjectSecondMin {

    public static void main(String[] args) {
        int[] arr = new int[] {5, 3, 1};
        int minPosition;

        minPosition = getSecondMinPosition(arr);
        if (minPosition == -1){
            System.out.println("Error");
            System.exit(1);
        }

        System.out.printf("Position: %d, Value: %d ", minPosition + 1, arr[minPosition]);
    }

    public static int getSecondMinPosition(int[] arr){
        int min = 0;
        int secondMin = 0;
        int minValue = 0;
        int secondMinValue = 0;

        if (arr == null) return -1;
        if ( arr.length < 2) return -1;

        for (int i = 0; i < arr.length; i++){

            if (arr[i] < minValue && arr[i] < secondMinValue){
                secondMin = min;
                secondMinValue = minValue;
                min = i;
                minValue = arr[i];
                System.out.println(secondMin);

            }else if (arr[i] > minValue && arr[i] < secondMinValue){
                secondMin = i;
                secondMinValue = arr[i];
                System.out.println(secondMin);
            }

        }
        return secondMin;
    }
}
