import java.util.*;

class armstrong{
    static int length(int n){
        int ans = 0;
        while(n != 0){
            n /= 10;
            ans += 1;
        }
        return ans;   
    }       

    static int isArmstrong(int n){   
        int num = n;
        int sum = 0;
        while(n != 0){
            int product = 1;
            int rem = n%10;
            n /= 10;
            int size = length(num);
            while(size != 0){
                product *= rem;
                size -= 1;
            }
            sum += product;
        }
        return sum;
    }

    public static void main(String args[]){
        int n = 153;
        int result = isArmstrong(n);
        System.out.println(n == result);
    }
}
