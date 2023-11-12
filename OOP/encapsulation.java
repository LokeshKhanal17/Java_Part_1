package OOP;
/*
 * Access Modifier	Visibility	In Same Class	In Same Package	In Subclasses	In Other Packages
public	            Public	       Yes	        Yes             	Yes     	Yes
protected	        Protected	   Yes	        Yes	                Yes	        No
(default)	        Package	       Yes	        Yes	                No	        No
private	            Private	       Yes	        No	                No	        No
 */
class Student{
    private int roll;
    private String name;
    
    //getter and setter methods

    public void setRoll(int roll){
        this.roll=roll;
    }
    public int getRoll(){
        return roll;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}

public class encapsulation {
    //encapsulation is a process of binding data and methods into a single unit.
    //it is also called data hiding.
    //it is used to hide the data from outside world.

    //we can achieve encapsulation by using access modifiers.
    //access modifiers are: public, private, protected, default.
//example
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student obj = new Student();
        obj.setRoll(10);
        obj.setName("Rahul");
        System.out.println(obj.getRoll());
        System.out.println(obj.getName());
    }

    
}
