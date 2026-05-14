public class MinimumString {

    public static String minimumString(String str) {

        char[] arr = str.toCharArray();
        int n = arr.length;

        // Bubble sort using adjacent swaps
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // swap adjacent characters
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String str = "abacbad";

        System.out.println(minimumString(str));
    }
}
