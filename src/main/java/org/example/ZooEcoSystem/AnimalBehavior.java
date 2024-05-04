package org.example.ZooEcoSystem;

public interface AnimalBehavior {
    void eat();
    void sleep();
    void makeSound();

}
abstract class Animal implements AnimalBehavior{
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void sleep(){
        System.out.println("All Animal sleeping");
    }
   public abstract void printInfo();

}




