package Class;

public class HighestRectangle {

    static int findHighestRectangle(int[] arr){

        int max = 0;
        for(int i = 0; i < arr.length; i++){
            int left = i-1;
            int right = i+1;
            int width = 1;

            while(left >= 0 && arr[left] >= arr[i]){
                left--;
                width++;
            }
            while(right < arr.length && arr[right] >= arr[i]){
                right++;
                width++;
            }
            int area = width * arr[i];
            if(area > max){
                max = area;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {4};
        System.out.println(findHighestRectangle(arr));
    }
}
