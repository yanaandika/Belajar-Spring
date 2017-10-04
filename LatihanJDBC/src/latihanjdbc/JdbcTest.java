/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihanjdbc;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */


public class JdbcTest {

    public static void main(String args[]) throws Exception {
// Siapkan URL, username, dan password
        String url = "jdbc:derby://localhost:1527/sample";
        String username = "app";
        String password = "app";
// Load JDBC driver
        Class.forName("org.apache.derby.jdbc.ClientDriver");
// Buat koneksi ke database
        Connection conn = DriverManager.getConnection(url, username, password);
// Buat statement
        Statement st = conn.createStatement();
// Eksekusi query statement dan tampung hasil ke result set
        ResultSet results = st.executeQuery("SELECT * from APP.CUSTOMER");
// Proses result set
//        while (results.next()) {
//            System.out.println(results.getString("name")+ " alamat: " + results.getString("addressLine1"));
//        }

        List<Customer> customers = new ArrayList<>();
        while (results.next()) {
            Customer c = new Customer();
            c.setName(results.getString("name"));
            c.setAddresLine1(results.getString("addressline1"));
            c.setAddresLine2(results.getString("addressline2"));
            c.setCity(results.getString("city"));
            c.setCustomerId(results.getInt("customer_id"));
            c.setDiscountCode(results.getString("discount_code"));
            c.setCreditLimit(results.getDouble("credit_limit"));
            c.setEmail(results.getString("email"));
            c.setFax(results.getString("fax"));
            c.setPhone(results.getString("phone"));
            c.setState(results.getString("state"));
            c.setZip(results.getString("zip"));
            
            customers.add(c);
            
        }
        System.out.println(customers.size());
        double totalCreditLimit = 0.0;
        for (Customer customer : customers) {
            totalCreditLimit += customer.getCreditLimit();
        }
// Tutup statement dan connection ke database
        st.close();
        conn.close();
    }
}

