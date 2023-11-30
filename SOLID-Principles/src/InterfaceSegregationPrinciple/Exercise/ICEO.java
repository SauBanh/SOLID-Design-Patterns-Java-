package InterfaceSegregationPrinciple.Exercise;

public interface ICEO extends IEmployee{
    // CEO + managers
    public void addBonus();
    // CEO
    public void makeDecisions();	
    public void addStocks();
}