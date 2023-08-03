package SQL;

/*      @author Kevyn      */

import java.sql.*;
import javax.swing.JOptionPane;

public class sql {
    
    /*** VARIAVEIS DE LOGIN PRIVADA E ENCAPSULADA ***/
    private static final String url_db = "jdbc:mysql://192.168.64.245/DMD_TESTE";
    private static final String usuario = "sa";
    private static final String senha = "t$gmminf";

    /*** FUNÇÃO PARA ACESSAR O BANCO DE DADOS ***/
    private static Connection getConnection() {
        try {
            return DriverManager.getConnection(url_db, usuario, senha);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /*** FUNÇÃO PARA FAZER O SELECT NO BANCO ***/
    public static void executeSelectQuery(String query) {
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            /*** PROCESSA OS RESULTADOS ***/
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                System.out.println("ID: " + id + ", Nome: " + nome);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*** FUNÇÃO PARA FAZER O UPDATE BANCO ***/
    public static void executeUpdateQuery(String query) {
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {

            int rowsAffected = stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Linhas afetadas: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
