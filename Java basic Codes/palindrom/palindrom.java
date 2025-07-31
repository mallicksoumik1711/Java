class palindromCheck{
    static boolean isPalindrom(String s){
        int l=0, r=s.length()-1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l += 1;
            r -= 1;
        }
        return true;
    }
}

class palindrom{
    public static void main(String args[]){
        palindromCheck pc = new palindromCheck();
        System.out.println(pc.isPalindrom("abcba"));
    }
}