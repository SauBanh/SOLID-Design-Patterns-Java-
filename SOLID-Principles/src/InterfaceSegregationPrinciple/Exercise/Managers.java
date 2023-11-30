package InterfaceSegregationPrinciple.Exercise;

public class Managers implements IManagers{

    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }

    @Override
    public void hire() {
        System.out.println("Hiring new employees...");
    }

    @Override
    public void train() {
        System.out.println("Training the employees...");
    }

    @Override
    public void addBonus() {
        System.out.println("Addin bonus at the end of the salary...");
    }
    
}
