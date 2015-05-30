import java.sql.Connection;


public final class jdbcUtils {
	  private static String url="jdbc:mysql://localhost:3306/student";
	  private static String user="root";
	  private static String password="0314www";
      private jdbcUtils(){
    	  
      }
      static {
    	  try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new ExceptionInInitializerError(e);
		}
      }
      public static Connection getConnection(){
    	  return DriverManager.getConnection(url,user,password);
      }
}
