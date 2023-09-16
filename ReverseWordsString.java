class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        String[] arr = str.split(" ");

        String result = "";

        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] == ""){
                continue;
            }
            result += arr[i] + " ";
        }
        return result.trim();
    }
}
