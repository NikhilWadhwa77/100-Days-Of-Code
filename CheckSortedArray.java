class IsSorted {
  
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2};
        System.out.println(sorted(arr,0));
    }

    static boolean sorted(int[] arr, int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] <= arr[i+1]){
            return sorted(arr, ++i);
        }
        return false;
    }
}
