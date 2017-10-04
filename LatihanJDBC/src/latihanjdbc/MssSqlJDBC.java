/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class MssSqlJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:sqlserver://localhost:1433/AdventureWorks2008R2";
        String username = "sa";
        String password = "";
// Load JDBC driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
// Buat koneksi ke database
        Connection conn = DriverManager.getConnection(url, username, password);
// Buat statement
        Statement st = conn.createStatement();
// Eksekusi query statement dan tampung hasil ke result set
        ResultSet results = st.executeQuery("SELECT * from Address");
// Proses result set
        while (results.next()) {
            System.out.println(results.getString("city"));
        }
// Tutup statement dan connection ke database
        st.close();
        conn.close();
    }
    
}
