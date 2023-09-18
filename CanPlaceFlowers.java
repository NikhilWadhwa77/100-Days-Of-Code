class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1){
            if(n == 1){
                if(flowerbed[0] == 0) return true;
                return false;
            }
            return true;
        }
        for(int i = 0; i < flowerbed.length; i++){
            if(n == 0) return true;
            if(i == 0){
                if(flowerbed[i] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    n--;
                    if(n == 0) return true;
                }
            }
            else if(i == flowerbed.length-1){
                if(flowerbed[i-1] == 0 && flowerbed[i] == 0){
                    flowerbed[i] = 1;
                    n--;
                    if(n == 0) return true;
                }
            }else if(flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                n--;
                if(n == 0) return true;
            }
        }
        return n == 0;
    }
}
