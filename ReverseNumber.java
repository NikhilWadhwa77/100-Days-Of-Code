public class ReverseNumber {
  
    public static void main(String[] args) {
       int num = 2202;
       int ans = reverse(num,0);
       System.out.println(ans);
      // output = 2022
    }

    public static int reverse(int n, int rev){
        if(n == 0){
            return rev;
        }
        rev = (rev*10) + (n%10);
        return reverse(n/10, rev);
    }
}



