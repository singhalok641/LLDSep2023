package designPatterns.singleton;

import designPatterns.singleton.eagerLoading.DatabaseConnection;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
    }
}
