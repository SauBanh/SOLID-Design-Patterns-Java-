package CREATIONALPATTERNS.PrototypePattern.Example;

public class Retangle extends Shape{
    public Retangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Retangle with width: " + width + " height: " + height);
    }

    @Override
    public Shape cloneObject() {
        // this is the prototype pattern 
        return new Retangle(width, height);
    }
}
