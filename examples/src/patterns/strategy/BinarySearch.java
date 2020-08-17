package patterns.strategy;

import java.util.Arrays;

public class BinarySearch implements Search {

    @Override
    public boolean search(int[] arr, int num) {
        return (Arrays.binarySearch(arr, num) >= 0);
    }

}