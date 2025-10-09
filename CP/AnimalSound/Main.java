/*
    Question:
    You are asked to create a simple program that demonstrates 
    the concepts of INHERITANCE and POLYMORPHISM in Java.

    Requirements:
    1. Create a parent class called "Animal" with:
       - a method called "makeSound()" that prints "Animal makes a sound."

    2. Create two subclasses:
       - "Dog" that overrides makeSound() to print "Dog barks."
       - "Cat" that overrides makeSound() to print "Cat meows."

    3. In the main method:
       - Create an array of Animal references containing both Dog and Cat objects.
       - Use a loop to call makeSound() on each object.
         (This should demonstrate runtime polymorphism.)

    Expected Output:
    Dog barks.
    Cat meows.
*/




package CP.AnimalSound;


class Animal{
    
    public void makeSound(){
         System.out.println("Animal makes a sound.");
    }
}


class Dog extends Animal{
    @Override
     public void makeSound(){
        System.out.println("Dog barks.");
     }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat meows.");
    }
}


class AnimalTest {
     public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Cat();

        for (Animal animal : animals){
            animal.makeSound();
        }
     }
}
