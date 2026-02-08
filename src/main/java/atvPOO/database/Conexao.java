package atvPOO.database;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {

    public static Connection getConnection() throws RuntimeException {

        try (InputStream input = Conexao.class.getClassLoader().getResourceAsStream("db.properties")) {
            if(input == null){
                throw new RuntimeException("Arquivo db.properties não encontrado");
            }

            Properties dbProperties = new Properties();

            dbProperties.load(input);

            String url = dbProperties.getProperty("db.url");
            String username = dbProperties.getProperty("db.username");
            String password = dbProperties.getProperty("db.password");

            return DriverManager.getConnection(url, username, password);

        } catch (SQLException e) {
            e.getMessage();
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
