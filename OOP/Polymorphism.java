package OOP;

public class Polymorphism {
    //two types: overloading and overriding
    //Method Over Loading 
    //same name of function name and different number of arguments or datatypes 
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        obj.add(10,20);
        obj.add(10,20,30);
    }
    
}

//Method Over Riding
//this properties come into play when inheritance comes first.
//Function Body()

class Bank1 {
    
    void rateOfIntrest(){
        System.out.println("Class Bank1 Method....");
        } 
}
class Bank2 extends Bank1 {
    
    void rateOfIntrest(){
        System.out.println("bAnk2 class Method.");
    } 
}
