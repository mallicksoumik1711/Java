class Add{
    int addNum(int a, int b){
        return a+b;
    }

    boolean addNum(int a, int b, int c){
        return a+b+c > 10;
    }
}

class Main{
    public static void main(String args[]){
        Add a = new Add();
        System.out.println(a.addNum(5,5));
        System.out.println(a.addNum(5,3,3));
    }
}