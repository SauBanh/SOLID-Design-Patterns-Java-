package LiskovSubstitutionPrinciple.Example;

public class App {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle("Ford", 6);
        // Vehicle v = new PetrolCar("Ford", 6);
        // "design smell"
        // Vehicle v = new ElectricCar("Tesla", 12);
        Vehicle v = new PetrolCar("Toyota", 3);
        v.speedUp();
        v.slowDown();
        v.fuel();
    }
}
