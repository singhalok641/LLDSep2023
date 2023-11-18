package designPatterns.singleton.singleThreaded;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if(databaseConnection == null){ // t1, t2
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }
}
