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
            while (data.next()) {
                System.out.print("ID :" + data.getInt("id") + "\t\t");
                System.out.print("Adı : " + data.getString("name") + "\t\t");
                System.out.print("Pozisyonu : " + data.getString("position") + "\t\t");
                System.out.println("Maaşı : " + data.getBigDecimal("salary") + "\t\t");
                System.out.println("#############################################################");
            }

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
