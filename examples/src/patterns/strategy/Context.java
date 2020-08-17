package patterns.strategy;

/**
 * Context classes don't know what strategy have been chosen,
 * they just execute said strategy in a consistent manner and
 * deal with the result.
 */

public class Context {

    Search search;

    public Context(Search search) {
        this.search = search;
    }

    public void printFound(int[] arr, int num) {
        if (search.search(arr, num) == true) {
            System.out.println(Integer.toString(num) + " was found in the array!");
        } else {
            System.out.println(Integer.toString(num) + " was not found in the array :(");
        }
    }

}