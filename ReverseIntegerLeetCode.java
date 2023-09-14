class Solution {

  public static Long reversed(Long n, Long rev){
        if(n == 0){
            return rev;
        }
        rev = (rev*10) + (n%10);
        return reversed(n/10, rev);
    }

  public int reverse(int x) {
    Long num = Long.valueOf(x);
    Long reversedInt = reversed(num,0L);
    if(reversedInt > Integer.MAX_VALUE || reversedInt < Integer.MIN_VALUE){
      return 0;
    }else{
      return reversedInt.intValue();
    }

  }
}
