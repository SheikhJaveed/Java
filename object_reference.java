class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}

public class object_reference {
    public static void main(String[] args) {
        // Creating car objects
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Accord", 2021);

        // Assigning object reference variables
        Car car3 = car1; // car3 now refers to the same object as car1
        Car car4 = new Car("Ford", "Mustang", 2020); // car4 refers to a different object

        // Modifying car3 will also affect car1
        car3.year = 2019;

        // Displaying information
        System.out.println("Car1:");
        car1.displayInfo(); // Output: Brand: Toyota, Model: Camry, Year: 2019
        System.out.println("Car2:");
        car2.displayInfo(); // Output: Brand: Honda, Model: Accord, Year: 2021
        System.out.println("Car3:");
        car3.displayInfo(); // Output: Brand: Toyota, Model: Camry, Year: 2019
        System.out.println("Car4:");
        car4.displayInfo(); // Output: Brand: Ford, Model: Mustang, Year: 2020
    }
}
