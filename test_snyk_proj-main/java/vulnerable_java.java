import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class VulnerableJava {
  public static void main(String[] args) {
    String user = "admin";
    String pass = "admin";
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" + "user=" + user + "&password=" + pass);  // Vulnerability: SQL Injection
  }
}