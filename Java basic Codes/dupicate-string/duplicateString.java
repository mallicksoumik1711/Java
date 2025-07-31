class duplicateString{
    static String duplicate(String s){
        String str = "";
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                str += s.charAt(i-1);
            }
        }
        return str+s.charAt(s.length()-1);
    }
    public static void main(String args[]){
        System.out.println(duplicate(""));
    }
}