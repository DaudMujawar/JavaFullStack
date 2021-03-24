package jdbc;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class jdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");     //Registering driver
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/java15feb","root","daud@4134");
            Statement statement=connection.createStatement();
            String sql= "select * from employee";
            ResultSet rs=statement.executeQuery(sql);

            while(rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                String address=rs.getString(3);
                System.out.println("Id:"+id+" Name:"+name+" Address:"+address);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
