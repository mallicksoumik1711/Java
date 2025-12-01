class Animal{
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}

class Main{
    public static void main(String args[]){
        Dog d = new Dog();
        //creating the object of the dog class
        d.bark();
        d.makeSound();
    }
}
