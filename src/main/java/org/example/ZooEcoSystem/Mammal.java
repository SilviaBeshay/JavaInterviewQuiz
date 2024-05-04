package org.example.ZooEcoSystem;

public class Mammal extends Animal {


        public Mammal(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
        }

        @Override
        public void eat(){
        }
        @Override
        public void printInfo() {

        }
    }

    class Lion extends Mammal {
        public Lion(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            super.makeSound();
            System.out.println("Lions makes ror sound and it is very Scary");
        }

        @Override
        public void eat() {
            super.eat();
            System.out.println("Lions love to eat meat");
        }

        @Override
       public void printInfo() {
            super.printInfo();
            System.out.println(name+" "+age);

        }
    }

    class Elephant extends Mammal{
        public Elephant(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            super.makeSound();
            System.out.println("Elephants makes trumpet sound ");
        }

        @Override
        public void eat() {
            super.eat();
            System.out.println("Elephants love to eat peanuts using his hose to get food from people");
        }

        @Override
        public void printInfo() {
            super.printInfo();
            System.out.println(name+" "+age);

        }
    }


