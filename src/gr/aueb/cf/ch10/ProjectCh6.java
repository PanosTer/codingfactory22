package gr.aueb.cf.ch10;

public class ProjectCh6 {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 8, 14, 9};
        int maxPosition;

        maxPosition = getMaxPosition(arr, 0, arr.length - 1);
        if (maxPosition == -1){
            System.out.println("Error");
            System.exit(1);
        }

        System.out.printf("Position: %d, Value: %d ", maxPosition + 1, arr[maxPosition]);
    }

    public static int getMaxPosition(int arr[], int low, int high){
        int maxPosition = 0;
        int maxValue = 0;

        if (arr == null || arr.length == 0) return -1;
        if ( low < 0 || high > arr.length -1 || low > high) return -1;

        maxValue = arr[0];
        for (int i = low + 1; i <= high; i++){
            if (arr[i] > maxValue){
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return maxPosition;
    }

}
