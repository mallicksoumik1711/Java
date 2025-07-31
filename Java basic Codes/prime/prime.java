class primeCheck{
    boolean isPrime(int n){
        if(n <= 1){
            return true;
        }
        for(int i=2; i<n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}

class prime{
    public static void main(String args[]){
        primeCheck pc = new primeCheck();
        System.out.println(pc.isPrime());
    }
}