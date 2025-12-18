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
}

class Main{
    public static void main(String args[]){
        Methodcomplete mc = new Methodcomplete();
        mc.cook();
        mc.dontDescribe();
    }
}
