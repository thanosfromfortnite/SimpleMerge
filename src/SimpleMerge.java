/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        boolean done = false;
        int[] out = new int[arr1.length + arr2.length];
        while (!done) {
            if (arr1[i] < arr2[j]) {
                out[i + j] = arr1[i];
                i ++;
            }
            else {
                out[i + j] = arr2[j];
                j ++;
            }

            if (j == arr2.length - 1) {
                for (i = i; i < arr1.length; i ++) {
                    out[i + j] = arr1[i];
                }
                done = true;
            }

            if (i == arr1.length - 1) {
                for (j = j; j < arr2.length; j ++) {
                    out[i + j] = arr2[j];
                }
                done = true;
            }

        }
        return out;
    }

}
