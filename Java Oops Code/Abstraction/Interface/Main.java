interface Describe{
    void cook();
}

interface DoNot{
    void dontDescribe();
}

class Methodcomplete implements Describe, DoNot{
    public void cook(){
        System.out.println("Cooking....");
    }

    public void dontDescribe(){
        System.out.println("Not describing");
    }

    public void nmdefination1(){
        System.out.println("normal method defination 1");
    }

    public void nmdefination2(){
        System.out.println("normal method defination 2");
    }
}

class Main{
    public static void main(String args[]){
        Methodcomplete mc = new Methodcomplete();
        mc.cook();
        mc.dontDescribe();
    }
}
