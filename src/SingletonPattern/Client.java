package SingletonPattern;

public class Client {
    public static void main(String[] args) {
        DbConnection dbConnection = DbConnection.getInstance();
        DbConnection dbConnection1 = DbConnection.getInstance();

        System.out.println(dbConnection.hashCode());
        System.out.println(dbConnection1.hashCode());
    }
}
