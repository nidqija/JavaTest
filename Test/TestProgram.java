    /*
        Question:
        You are asked to demonstrate your understanding of INTERFACE, INHERITANCE, 
        and POLYMORPHISM in Java.

        Requirements:
        1. Create an interface called "Playable" that has a method called play().
        
        2. Create a superclass called "Instrument" that has:
        - a method called tune() that prints "Tuning the instrument."

        3. Create two subclasses:
        - "Guitar" that extends Instrument and implements Playable.
            - The play() method should print "Playing the guitar."
        - "Piano" that extends Instrument and implements Playable.
            - The play() method should print "Playing the piano."

        4. In the main method:
        - Create an array of Playable references containing both Guitar and Piano objects.
        - Use a loop to call play() on each object (demonstrating polymorphism).
        - Also call tune() by casting each object to Instrument (demonstrating inheritance).

        Expected Output:
        -----------------
        Tuning the instrument.
        Playing the guitar.
        Tuning the instrument.
        Playing the piano.
    */



    package Test;

    interface Playable {
        void play();
    }


    class Instrument{
        public void tune(){
            System.out.println("Tuning the instrument.");
        }
    }

    class Guitar extends Instrument implements Playable{
        public void play(){
            System.out.println("Playing the guitar.");
        }
    }

    class Piano extends Instrument implements Playable{
        public void play(){
            System.out.println("Playing the piano.");
        }
    }

    public class TestProgram{
        public static void main(String[] args){
            Playable[] instruments = new Playable[2];

            instruments[0] = new Guitar();
            instruments[1] = new Piano();
             
            for(Playable instrument : instruments){
                ((Instrument)instrument).tune();
                instrument.play();
            }
        }
    }


