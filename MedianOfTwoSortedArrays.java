class Solution {

    static int[] merge(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int index = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                merged[index] = arr1[i];
                index++;
                i++;
            }else{
                merged[index] = arr2[j];
                index++;
                j++;
            }
        }
        while(i < arr1.length){
            merged[index] = arr1[i];
            index++;
            i++;
        }
        while(j < arr2.length){
            merged[index] = arr2[j];
            index++;
            j++;
        }
        return merged;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = merge(nums1, nums2);

        double median;

        if((arr.length & 1) == 1){
            median = arr[arr.length/2];
        }else{
            median = ((double)(arr[arr.length/2]) + (double)(arr[arr.length/2 - 1]))/2;
        }

        return median;
    }
}
