package OOP;

//abstract class
abstract class Vechile{
    abstract void start();
    abstract void stop();

}
//concrete class that inherits abstract class
class Car extends Vechile{
    @Override
    void start(){
        System.out.println("Car is starting.");
    }
    @Override
    void stop(){
        System.out.println("Car is stopping.");
    }

}
/**
 * Abstraction
 */

public class Abstraction {
    //Abstraction is a process of hiding the implementation details and showing only functionality to the user.
    //Abstraction lets you focus on what the object does instead of how it does it.

    //Abstraction can be achieved by two ways:
    //Abstract Class (0 to 100%)
    //Interface (100%)

    //Abstract Class

    //example
    public void main(String[] args){

    }
    
}
