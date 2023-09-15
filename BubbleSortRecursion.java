import java.util.Arrays;
public class BubbleSort {

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void sort(int[] arr, int i, int j){
        if(i == arr.length){
            return;
        }

        if(arr[j] > arr[j+1]){
            swap(arr, j, j+1);
        }

        if(j == arr.length - 1 - i){
            sort(arr,i+1,0);
        }else{
            sort(arr, i, j+1);
        }


    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,5,1};
        sort(arr, 1, 0);
        System.out.println(Arrays.toString(arr));
    }
}
