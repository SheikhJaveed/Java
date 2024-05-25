public class Variables {
    // Class variable (static variable)
    static int classVariable = 0;
    
    // Instance variable
    int instanceVariable;

    public Variables(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    public static void main(String[] args) {
        // Creating instances of Variables
        Variables obj1 = new Variables(10);
        Variables obj2 = new Variables(20);
        
        // Accessing and modifying class variable
        Variables.classVariable = 100;
        
        // Accessing instance variables
        System.out.println("Instance variable of obj1: " + obj1.instanceVariable); // Output: 10
        System.out.println("Instance variable of obj2: " + obj2.instanceVariable); // Output: 20
        
        // Accessing class variable through instances
        System.out.println("Class variable through obj1: " + obj1.classVariable); // Output: 100
        System.out.println("Class variable through obj2: " + obj2.classVariable); // Output: 100
        
        // Modifying instance variables
        obj1.instanceVariable = 50;
        obj2.instanceVariable = 60;
        
        System.out.println("Modified instance variable of obj1: " + obj1.instanceVariable); // Output: 50
        System.out.println("Modified instance variable of obj2: " + obj2.instanceVariable); // Output: 60
    }
}
