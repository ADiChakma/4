package sumarray;

/**
 *
 * @author Adison
 */
public class Sumarray {

    public static int sumMatch(int[] inputArray, int targetSum) {
        int sum = 0;
        for (int element : inputArray) {
            if (element == targetSum) {
                sum += element;
            }
        }
        return sum;
    }
}
