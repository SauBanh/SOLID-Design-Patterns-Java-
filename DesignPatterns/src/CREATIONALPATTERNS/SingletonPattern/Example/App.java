package CREATIONALPATTERNS.SingletonPattern.Example;

public class App {
    public static void main(String[] args) {
        // new DatabaseConnector();
        // DatabaseConnector.INSTANCE.connect();
        // DatabaseConnector o1 = DatabaseConnector.getInstance();
        // DatabaseConnector o2 = DatabaseConnector.getInstance();

        Database o1 = Database.INSTANCE;
        Database o2 = Database.INSTANCE;

        if (o1 == o2) {
            System.out.println("The objects are the same...");
        }
    }
}
