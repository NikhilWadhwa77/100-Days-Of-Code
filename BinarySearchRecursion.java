package recursion;

public class searchBinary {

    static int binary(int[] arr, int key,int s, int e){

        int mid = (s+e)/2;

        if(s > e){
            return -1;
        }
        if(arr[mid] == key){
            return mid;
        }
        if(arr[mid] > key){
            return binary(arr,key,s,mid-1);
        }
        if(arr[mid] < key){
            return binary(arr,key,mid+1,e);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {12,16,22,99,123,444,981};

        System.out.println(binary(arr,13,0,arr.length-1));

    }
}
