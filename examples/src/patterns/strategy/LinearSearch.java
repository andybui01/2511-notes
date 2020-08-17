package patterns.strategy;

public class LinearSearch implements Search {

    @Override
    public boolean search(int[] arr, int num) {
        for (int curr: arr) {
            if (curr == num) {
                return true;
            }
        }
        return false;
    }

}