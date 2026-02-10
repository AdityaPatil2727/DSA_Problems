public class MinMaxArray {

    public static void findMinMax(int[] arr) {
        // Edge case: empty or null array
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        // Start from index 1 since min & max are initialized
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 1, 5};
        findMinMax(arr);
    }
}
