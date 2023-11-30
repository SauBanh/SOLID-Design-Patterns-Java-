package CREATIONALPATTERNS.FactoryPattern.AbstractFactoryPattern;

public class App {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("ELECTRIC");
        factory.getcar("FORD").assemble();
    }
}
