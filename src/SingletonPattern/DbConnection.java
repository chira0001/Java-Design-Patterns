package SingletonPattern;

public class DbConnection {
    private static DbConnection dbConnection = null;

    private DbConnection(){

    }

    public static DbConnection getInstance(){
        if (dbConnection == null){
            synchronized (DbConnection.class){
                dbConnection = new DbConnection();
            }
        }
        return dbConnection;
    }
}
