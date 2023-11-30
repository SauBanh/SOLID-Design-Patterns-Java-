package BEHAVIORALDESIGNPATTERNS.StrategyPattern.Example;

public class App {
    public static void main(String[] args) {
        // OperationManager manager = new OperationManager();
        // manager.setStrategy(new Addition());
        // manager.execute(10, 5);
        OperationManagerBad manager = new OperationManagerBad();
        manager.execute(new Addition(), 10, 5);
    }
}
