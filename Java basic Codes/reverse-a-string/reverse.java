class reversingAString{
    static String reverse(String s){
        String ans = "";
        for(int i=s.length()-1; i>=0; i--){
            ans += s.charAt(i);
        }
        return ans;
    }
}
// string immutable hota hai java mein
class reverse{
    public static void main(String args[]){
        reversingAString rs = new reversingAString();
        String s = "reverse it afrterf";
        String ans = rs.reverse(s);
        System.out.println(ans);
    }
}
