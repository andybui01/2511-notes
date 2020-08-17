package patterns.strategy;

public class Demo {
    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false; // It is proven that the array is not sorted.
            }
        }
        return true; // If this part has been reached, the array must be sorted.
    }

    public static void main(String[] args) {

        Context context;

        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = {7,6,8,4,3,1,2};

        boolean isSorted = isSorted(arr);
        boolean isSorted2 = isSorted(arr2);

        /**
        * If an array sorted, we pick a fitting strategy,
        * namely a binary search, else linear search array
        */

        if (isSorted) {
            context = new Context(new BinarySearch());
            context.printFound(arr, 5);
        }

        if (!isSorted2) {
            context = new Context(new LinearSearch());
            context.printFound(arr2, 5);
        }
    }
}