/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoBD;

import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class conexaoPostgres {

    private static final String DRIVER = "org.postgres.driver";
    private static final String URL = "jdbc:postgres://localhost:5432/UniparBD";
    private static final String USER = "postgres";
    private static final String PASSWORD = "unipar";

    
    //abrir abrir conexao com o BD
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return (Connection) DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexaoPostgres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(conexaoPostgres.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    //fechar conexao
    
    public static void closeConnection(Connection conn){
        if(conn != null){

            try {
                conn.close();
            } catch (IOException ex) {
                Logger.getLogger(conexaoPostgres.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
    }
    
    //fechar transacao
    
    public static void closeTransaction(Connection conn, PreparedStatement ps){
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(conexaoPostgres.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        closeConnection(conn);
    }
    
    
    
}
