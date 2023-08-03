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
    private static Connection conecta() {
        try {
            System.out.println("conectado");
            return DriverManager.getConnection(url_db, usuario, senha);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    /*** FUNÇÃO PARA FAZER O SELECT NO BANCO ***/
    public static void select(String query) {
        try (Connection conn = conecta();
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
    public static void update(String query) {
        try (Connection conn = conecta();
             Statement stmt = conn.createStatement()) {

            int rowsAffected = stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Linhas afetadas: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
