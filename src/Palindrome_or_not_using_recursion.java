import java.util.Scanner;
public class Palindrome_or_not_using_recursion {
    public static boolean reverse(int i, int length,String word){
        if(i>=length/2) {
            return true;
        }
            if(word.charAt(i) != word.charAt(length-i-1)){
               return false;
            }
        return reverse(i+1,length,word);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int n = word.length();
        boolean ans =reverse(0,n,word);
        System.out.println(ans);
    }
}
