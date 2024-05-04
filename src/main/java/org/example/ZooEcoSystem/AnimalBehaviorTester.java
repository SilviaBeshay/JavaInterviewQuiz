package org.example.ZooEcoSystem;

public class AnimalBehaviorTester {
    public static void main(String[] args) {
        Animal [] animal={new Lion("Lony",8),new Elephant("Eley", 15),new Eagle("Egy",22),new Parrot("Peri",4)};
        for (Animal n:animal) {
            n.printInfo();
            n.eat();
            n.makeSound();
            n.sleep();
            System.out.println("+++++++**************+++++++++");

        }
    }
}
