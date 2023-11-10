package OOP;

public class Polymorphism {
    //two types: overloading and overriding
    //function name same but different purpose
    
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
