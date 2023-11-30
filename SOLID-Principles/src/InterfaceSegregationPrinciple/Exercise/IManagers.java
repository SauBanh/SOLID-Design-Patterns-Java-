package InterfaceSegregationPrinciple.Exercise;

public interface IManagers extends IEmployee {
    // managers
    public void hire();
    public void train();
    // CEO + managers
    public void addBonus();
}
