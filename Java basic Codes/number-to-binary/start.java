import java.util.*;

class start{
    static int binary(int n){
        ArrayList<Integer> ai = new ArrayList<>();
        int num = 0;
        while(n != 0){
            int rem = n%2;
            n = n/2;
            ai.add(rem);
        }
        for(int i=ai.size()-1; i>=0; i--){
            num = num*10 + ai.get(i);
        }
        return num;
    }
    public static void main(String args[]){
        System.out.println(binary(23));
    }
}