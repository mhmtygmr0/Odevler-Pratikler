package week6;

import java.sql.*;

public class VeriTabaniUygulamasi {

    // Veritabanı URL'si, kullanıcı adı ve şifresi sabit olarak tanımlanır
    public static final String DB_URL = "jdbc:postgresql://localhost/company";
    public static final String DB_USERNAME = "postgres";
    public static final String DB_PASSWORD = "mehmet";

    public static void main(String[] args) {

        Connection connect; // Veritabanı bağlantısını tutacak nesne
        String sql = "Select * From employees"; // SQL sorgusu

        try {
            // Veritabanına bağlantı kurulur
            connect = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            // SQL sorgusunu çalıştırmak için bir Statement nesnesi oluşturulur
            Statement st = connect.createStatement();
            ResultSet data = st.executeQuery(sql); // Sorgu çalıştırılır ve sonuçlar alınır

            // Sonuçlar üzerinde gezinilir ve her bir satır ekrana yazdırılır
            System.out.println("| ID | Name           | Position           | Salary     |");
            System.out.println("+----+----------------+--------------------+------------+");
            while (data.next()) {
                System.out.format("| %-2d | %-14s | %-18s | %-10s |\n",
                        data.getInt("id"),
                        data.getString("name"),
                        data.getString("position"),
                        data.getBigDecimal("salary"));
            }
            System.out.println("+----+----------------+--------------------+------------+");

            // Kullanılan kaynaklar kapatılır
            st.close();
            data.close();
            connect.close();


        } catch (SQLException e) {
            // SQL hatası durumunda hata mesajı ekrana yazdırılır
            System.out.println(e.getMessage());
        }


    }
}
