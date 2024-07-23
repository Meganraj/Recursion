import java.util.*;
public class sum_of_n_functional_way {
    public static int sum_of_n(int n){
        if(n==0){
            return n;
        }
        return n+sum_of_n(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =sum_of_n(n);
        System.out.println(ans);
    }
}
