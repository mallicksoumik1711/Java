class code{
    static int length(int num){
        int ans = 0;
        while(num != 0){
            num /= 10;
            ans += 1;
        }
        return ans;
    }
    static int isArmstrong(int n){
        int tempNum = n;
        int sum = 0;
        while(n != 0){
            int rem = n%10;
            n /= 10;
            int product = 1;
            int l = length(tempNum);
            while(l != 0){
                product *= rem;
                l-=1;
            }
            sum += product;
        }
        return sum;
    }
    public static void main(String args[]){
        int n = 370;
        System.out.println(isArmstrong(n)==n);
    }
}