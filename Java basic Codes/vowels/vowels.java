class vowels{
    static int vowelsInString(String s){
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                ans += 1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(vowelsInString("AEIOUHSFGREYVsdhfveufygerkjuwebrkjueghvgbiuehbliweruAYFYF"));
    }
}