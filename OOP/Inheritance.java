package OOP;

/**
 * Inheritance
 */
public class Inheritance {

    public static void main(String args[]) {
        //single inheritance
        Car car = new Car();
        car.brand="tata";
        car.color="red";
        car.mileage=888;
        car.price=9999;
        car.display();
        car.showCase();

        //Multi-Level Inheritance 
        Elantra eltr = new Elantra();
        eltr.display();//ascess features oof vechile class which is parent class of Car
        eltr.show();//method of elantra class
        eltr.showCase();//method of parents class Car.

        //mutiple inheritance
        //this is possible only in interfaces in java .
        // for example if we have two interface A and B then we can implements A and B in C class 
        //i.e. Class C implements A, B{...................}





       
    }
}

/**
 * single Inheritance
 */
 class Vechile {
    int price;
    int mileage;
    String color;
    void display(){
        System.out.println(price);
        System.out.println(color);
        System.out.println(mileage);
    }
    
}

class Car extends Vechile{
    String brand;
    boolean isSunroof;
    String fuelType;
    void Car(){
        System.out.println("I am Constructor of Car.");
    }

    void showCase(){
        System.out.println("Car for you ....");
    }

}
//class elantra can inherit from both Vechile and Car class. i.e. Multi level inheritance.

class Elantra extends Car{
    void show(){
        System.out.println("Third level");
    }

}
//Multilevel In heritance: Cannnot be Achieved directly in java.
//due to ambiguity(i.e. different parent class have same method then compiler get confused which method to compile.)
//to solve multiple inheritance java have Interface 
//interface example
/**
 * Animal interface
 * //interface doesn't have ay object and constructors.
 */
 interface Animal {
   public void run();
    
}

class Cheeta implements Animal {

    public void run(){
        System.out.println("FAst Runner.");
    }
    
}


