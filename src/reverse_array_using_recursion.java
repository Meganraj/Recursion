// Using Two Pointer
public class reverse_array_using_recursion {
    public static int[] functraversal(int[] array,int l , int r){
        if(l>=r){
            return array;
        }
        else{
            int temp =array[l];
            array[l] = array[r];
            array[r] = temp;
        }
       return functraversal(array,l+1,r-1);

    }
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5};
        int n = array.length;
       // Function call
       functraversal(array,0,n-1);
       for(int i : array){
           System.out.print(" ");
           System.out.print(i);
       }
    }
}
