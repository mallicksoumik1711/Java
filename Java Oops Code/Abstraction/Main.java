abstract class Describe{
    abstract void greet();
    abstract void sayName();

    void heisenberg(){
        System.out.println("Say my name");
    }
}

class Methodcomplete extends Describe{
    void greet(){
        System.out.println("Greeting now");
    }
    void sayName(){
        System.out.println("Cooking...");
    }
}

class Main{
    public static void main(String args[]){
        Methodcomplete mc = new Methodcomplete();
        mc.greet();
        mc.sayName();
    }
}