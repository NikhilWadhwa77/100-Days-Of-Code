import java.util.*;

public class temp2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        
        int start = 0;
        int end = size-1;
        
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
        
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
