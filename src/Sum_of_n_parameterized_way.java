import java.util.*;
public class Sum_of_n_parameterized_way {
    public static int sum_of_n(int i, int sum){
        if(i<1){
            return sum;
        }
        return  sum_of_n(i-1,sum+i);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        System.out.println(sum_of_n(n,0));
    }
}
