package CREATIONALPATTERNS.FactoryPattern.AbstractFactoryPattern;

public class PetrolCarFactory implements AbstractFactory{
    @Override
    public Car getcar(String type) {
        if (type.equals("FORD")) {
            return new PetrolFord();
        }else if (type.equals("TOYOTA")) {
            return new PetrolToyota();
        }
        return null;
    }
}
