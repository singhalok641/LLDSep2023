package designPatterns.singleton.doubleCheckLocking;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if(databaseConnection == null){ // t1, t2 -> First check is without lock
            synchronized (DatabaseConnection.class){ // Taking a lock
                if(databaseConnection == null) { // Second check after taking a lock
                    databaseConnection = new DatabaseConnection();
                }
            }
        }
        return databaseConnection;
    }
}

/*
Pros of Singleton DP
1. Resource Efficiency
2. Creating a new object is inefficient

Cons
1. Difficulty in testing a singleton class
 */
