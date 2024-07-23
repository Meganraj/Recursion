import java.util.*;
public class fibonacci_using_recursion {
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        int flast = fibonacci(n-1);
        int slast = fibonacci(n-2);
        return flast + slast;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
