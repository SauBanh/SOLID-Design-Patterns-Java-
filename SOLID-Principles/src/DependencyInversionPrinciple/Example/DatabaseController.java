package DependencyInversionPrinciple.Example;

// the high level module
public class DatabaseController {
    
    // we program to an interface - so we can achieve loosely copupled architecture
    private Database database;
    public DatabaseController(Database database) {
        // tight binding when we program to a class (instead of an interface)
        // database = new OracleDatabase();
        // database.connect();
        // database.disconnect();
        this.database  = database;
    }

    public void connect() {
        this.database.connect();
    }

    public void disconnect() {
        this.database.disconnect();
    }
}
