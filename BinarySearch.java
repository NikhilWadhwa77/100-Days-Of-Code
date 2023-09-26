import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        


        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        int start = 0;
        int end = n-1;
        int mid;

        while(start <= end){
            mid = (start+end)/2;

            if(arr[mid] == key){
                System.out.println(mid);
                return;
            }
            if(arr[mid] > key){
                end = mid-1;
            }
            if(arr[mid] < key){
                start = mid+1;
            }
        }
        System.out.println(-1);
    }
}
