import java.util.ArrayList;
public class sum_of_kth_subsequences {
    public static void sumofsubsequences(int idx, ArrayList<Integer> adj, int[] arr, int n,int sum,int target) {
        if (idx == n) {
            if(target == sum){
                System.out.print(adj);
                System.out.println();
                // Return after printing the subsequence
            }
            return;
        }
        // Pick the current index
        sum+=arr[idx];
        adj.add(arr[idx]);

        sumofsubsequences(idx + 1, adj, arr, n,sum,target);


        // Not pick the current index
        sum-=arr[idx];
        adj.remove(adj.size() - 1);

        sumofsubsequences(idx + 1, adj, arr, n,sum,target);

    }
    //To pick in reverse add the not pick condition before pick condition
    public static void main(String[] args) {
        ArrayList<Integer> adj = new ArrayList<>();
        int[] arr = {1,2,1};
        int n = arr.length;
        int sum=0;
        int target=2;
        sumofsubsequences(0, adj, arr, n,sum, target);
    }
}
