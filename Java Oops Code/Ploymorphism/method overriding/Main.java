class Animal{
    void makeSound(){
        System.out.println("Animal males sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog makes sound");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat makes sound");
    }
}

class Main{
    public static void main(String args[]){
        Dog d = new Dog();
        Cat c = new Cat();
        d.makeSound();
        c.makeSound();
    }
}