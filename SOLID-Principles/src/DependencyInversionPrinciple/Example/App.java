package DependencyInversionPrinciple.Example;

public class App {
    public static void main(String[] args) {
        // DatabaseController controller = new DatabaseController(new MySQLDatabase());
        DatabaseController controller = new DatabaseController(new OracleDatabase());
        controller.connect();
    }
}