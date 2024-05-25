
class Pen{
    String color;
    String type;

    public void function(){
        System.out.println("Writing something");
    }
    public void printcolor(){
        System.out.println(this.color);
    }
}


class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //we have created a parameterized constructor class
    // Student(String name,int age){
    //     this.name = name;
    //     this.age = age;
    // }

    //copy constructor -> properties of s1 are copied to s2
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    //empty constructor for s1
    Student(){

    }
}
public class oops {    
    public static void main(String[] args) {
        Pen pen1 = new Pen(); 
        pen1.color = "blue";
        pen1.type = "gel";
        
        pen1.function();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
        pen1.printcolor();
        pen2.printcolor();

        // Student s1 = new Student(); non-parameterized constructor
        // s1.name = "aman";
        // s1.age = 24;
        // s1.printInfo();

        Student s1 = new Student();
        s1.printInfo();
        s1.name = "aman";
        s1.age = 24;
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}




