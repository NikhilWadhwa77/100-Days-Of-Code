import java.util.*;
class Solution {

void swap(int []arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }

    void reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i < j){
           swap(arr,j,i);
            i++;
            j--;
        }
    }

    public boolean isMonotonic(int[] nums) {
        
     int arr[] = Arrays.copyOfRange(nums,0,nums.length); 
     Arrays.sort(arr);

     int arrdec[] = Arrays.copyOfRange(arr,0,nums.length);
     reverse(arrdec);

    if(Arrays.equals(nums, arr)||Arrays.equals(nums, arrdec)){
        return true;
    }
    else{
        return false;
    }
    }
}
