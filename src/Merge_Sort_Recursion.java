import java.util.*;
public class Merge_Sort_Recursion {
    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
    }

    public static void mergesort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergesort(arr, low, mid); // left half
        mergesort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high); // merge the sorted values
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 8, 9, 7, 6, 4, 2, 1};
        System.out.println("Before Sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        mergesort(arr, 0, arr.length - 1);
        System.out.println("After Merge Sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
