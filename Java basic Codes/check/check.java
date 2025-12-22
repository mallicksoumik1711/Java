import java.util.*;

class check{
    static String strToNum(String s){
        Stack<Character> stch = new Stack<>();
        Stack<Integer> stint = new Stack<>();
        for(int i=s.length()-1; i>=0; i--){
            int num = 0;
            if(s.charAt(i)=='0' || s.charAt(i)=='1' || s.charAt(i)=='2' || s.charAt(i)=='3' || s.charAt(i)=='4' || s.charAt(i)=='5' || s.charAt(i)=='6' || s.charAt(i)=='7' || s.charAt(i)=='8' || s.charAt(i)=='9'){
                num = Character.getNumericValue(s.charAt(i));
                stint.add(num);
            }
            else{
                stch.add(s.charAt(i));
                //i guess not optimal way to start
            }
        }
            String ans = "";
        while(!stch.empty() && !stint.empty()){
            int top_num = stint.peek();
            char ch = stch.peek();
            while(top_num != 0){
                ans += ch;
                top_num -= 1;
            }
            stint.pop();
            stch.pop();
        }
        return ans;
    }
    public static void main(String args[]){
        String s = "x3a5b7n2";
        System.out.print(strToNum(s));
    }
}
