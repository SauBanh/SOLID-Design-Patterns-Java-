package BEHAVIORALDESIGNPATTERNS.StrategyPattern.Example;

// abstract layer in between the high level modules and the low level modules
public class OperationManager {
    // we have to use composition
    // BECAUSE THE BEHAVIORAL CAN BE CHANGED AT RUN-TIME
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void execute(int num1, int num2){
        this.strategy.execute(num1, num2);
    }
}
