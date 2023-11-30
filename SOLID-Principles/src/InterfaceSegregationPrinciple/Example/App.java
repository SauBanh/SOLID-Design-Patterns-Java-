package InterfaceSegregationPrinciple.Example;

public class App {
    public static void main(String[] args) {
        
        // Tree tree = new BinarySearchTree();
        // tree.insert();
        // tree.delete();
        // tree.traverse();
        // tree.leftRotation();
        // tree.rightRotation();

        // Tree tree = new BalancedTree();
        // tree.insert();
        // tree.delete();
        // tree.traverse();
        // tree.leftRotation();
        // tree.rightRotation();

        // RotationTree tree = new BinarySearchTree(); // false
        // Tree tree = new BinarySearchTree();
        RotationTree tree = new BalancedTree();
        tree.insert();
        tree.delete();
        tree.traverse();
        tree.leftRotation();
        tree.rightRotation();

    }
}
