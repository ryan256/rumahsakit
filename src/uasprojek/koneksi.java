package uasprojek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private Connection koneks;

    public Connection getkoneksi() {
        return koneks;
    }
    
    public void dbkoneksi() {
    try {
            Class.forName("com.mysql.jdbc.Driver");
            
            try {
                String url, user, password;
                url = "jdbc:mysql://localhost:3306/uas_projek";
                user = "root";
                password = "";
                koneks = DriverManager.getConnection(url, user, password);

                System.out.println("Koneksi Berhasil");
            } catch (SQLException a) {
                System.out.println("Koneksi gagal"+a);
            System.exit(0);}
        
    
    } catch (ClassNotFoundException b) {
            System.out.println("driver Tidak diTEMUKAN"+b);
            System.exit(0);
        }
} 
}
