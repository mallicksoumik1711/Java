class fact{
    int factorial_of_num(int n){
        int ans = 1;
        while(n != 0){
            ans *= n;
            n-=1;
        }
        return ans;
    }

    int recursivefact(int n){
        if(n == 1){
            return 1;
        }
        return n * recursivefact(n-1);
    }
}

class factorial{
    public static void main(String args[]){
        fact f = new fact();
        System.out.println(f.factorial_of_num(4));
        System.out.println(f.recursivefact(5));
    }
}