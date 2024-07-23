import java.lang.reflect.Array;
import java.util.*;
public class subsequence_of_an_array  {

    public static void subsequences(int idx, ArrayList<Integer> adj, int[] arr, int n) {
        if (idx == n) {
            System.out.print(adj + " ");
            System.out.println();
            return; // Return after printing the subsequence
        }
        // Pick the current index
        adj.add(arr[idx]);
        subsequences(idx + 1, adj, arr, n);

        // Not pick the current index
        adj.remove(adj.size() - 1);
        subsequences(idx + 1, adj, arr, n);
    }
//To pick in reverse add the not pick condition before pick condition
    public static void main(String[] args) {
        ArrayList<Integer> adj = new ArrayList<>();
        int[] arr = {3, 1, 2};
        int n = arr.length;
        subsequences(0, adj, arr, n);
    }
}
