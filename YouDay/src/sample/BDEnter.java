package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class BDEnter extends Config{
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException,SQLException{
        String connection = "jdbc:mysql://" + bdHost + ":"
                + bdPort + "/" + bdName + "?serverTimezone=Europe/Moscow";

        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connection, bdUser, bdPass);

        return dbConnection;
    }

    public void signUpUser(User user){
        String insert = String.format("INSERT INTO %s(%s,%s,%s,%s)VALUES(?,?,?,?)", Const.USER_TABLE, Const.USER_NAME, Const.USER_NIK, Const.USER_PASS, Const.USER_TOKEN);


        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getUser());
            preparedStatement.setString(3, user.getPass());
            preparedStatement.setString(4, user.getToken());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getUser(User user){
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.USER_TABLE + " " +
                " WHERE " + Const.USER_NIK + "=? AND " + Const.USER_PASS + "=?";
        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(select);
            preparedStatement.setString(1, user.getUser());
            preparedStatement.setString(2, user.getPass());

            resSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resSet;

    }


}
