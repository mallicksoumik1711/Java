class reverseNumber{
    static int reverseNum(int n){
        int num = 0;
        while(n != 0){
            int rem = n%10;
            n /= 10;
            num = (num * 10) + rem;
        }
        return num;
    }

    public static void main(String args[]){
        int n = 675463;
        int reversedNZum = reverseNum(n);
        System.out.println(reversedNZum);
    }
}