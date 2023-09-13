/*

n = 4

****
***
**
*

 */

public class DescendingTriangle {

    static void print(int n, int i){
        if(n == 0){
            return;
        }
        if(i == n){
            System.out.println();
            print(n-1,0);
        }else{
            System.out.print("*");
            print(n,i+1);
        }

    }

    public static void main(String[] args) {
        print(4,0);
    }
}
