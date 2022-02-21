import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJDBC {

    public static void main(String[] args) {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Mateuszek1!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from people");
            while (resultSet.next()) {
                System.out.print(resultSet.getString("id"));
                System.out.print(". ");
                System.out.print(resultSet.getString("firstname"));
                System.out.print(" ");
                System.out.print(resultSet.getString("lastname"));
                System.out.println(" ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
