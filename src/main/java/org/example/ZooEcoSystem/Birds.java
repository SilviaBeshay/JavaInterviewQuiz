package org.example.ZooEcoSystem;

public class Birds extends Animal{


        public Birds(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println("each Birds has different  sound");
        }

        @Override
        public void eat(){
            System.out.println("eat seeds");
        }

    @Override
    public void printInfo() {
        System.out.println(name+" "+age);
    }
}

class Eagle extends Birds{
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Eagle makes quack sound and it is very Scary");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Eagle love can eat anything even Humans");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(name+" "+age);

    }
}
class Parrot extends Birds{
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Parrot is whistling all the time, make good songs");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Parrot love to eat seeds");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(name+" "+age);

    }
}

