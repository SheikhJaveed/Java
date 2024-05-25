
interface Animal{
    int eyes = 2; //note this variable or any variable is fixed in interface
    void walk(); //interfaces cannot have non-abstract functions 
}

interface Herbivore{
    public void eats();
}

//interface is used to create multiple inheritance in Java
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
    public void eats(){
        System.out.println("eats only grass");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eats();
    }
}
