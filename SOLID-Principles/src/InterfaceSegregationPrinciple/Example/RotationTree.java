package InterfaceSegregationPrinciple.Example;

public interface RotationTree extends Tree{
    //  // "design smell"
    // // let's create "fat interfaces"
    // public void insert();
    // public void delete();
    // public void traverse();
    // // methods related to balanced tree
    public void leftRotation();
    public void rightRotation();
}
