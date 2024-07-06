public class DBConnection {
     
    private static  DBConnection con = new DBConnection();

    private DBConnection(){

    }
    public static DBConnection getDBInstance(){
        return con;
    }
         
}