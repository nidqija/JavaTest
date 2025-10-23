package CP.SmartParkingsystem.Test;

import java.util.Vector;

class AnimalSound {
    public void animalSound(){
        System.out.println("This animal makes a sound");
    }
}


class Dog extends AnimalSound{
     public void animalSound(){
        System.out.println("Woof Woof");
     }
}

class Cat extends AnimalSound{
    public void animalSound(){
        System.out.println("Meow Meow");
    }
}

public class Main {
    public static void main(String []args){
        AnimalSound myAnimal = new AnimalSound();
        AnimalSound myDog = new Dog();
        AnimalSound myCat = new Cat();

        Vector<AnimalSound> animals = new Vector<>(5);
        animals.add(myAnimal);
        animals.add(myDog);
        animals.add(myCat);
        animals.add(myAnimal);

        for ( AnimalSound animal : animals){
            animal.animalSound();
        }

               
        }
}






