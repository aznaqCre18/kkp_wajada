/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection.pk;

import java.sql.*;

/**
 *
 * @author Aziz Nur Abdul Qodir
 */
public class connect {
    private Connection connect;
    public Connection connect() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Berhasil Koneksi ke db");
        }catch(Exception e){
            System.out.println("gagal koneksi ke db " + e);
        }
        
        String url = "jdbc:mysql://localhost/wajada";
        
        try {
            connect = DriverManager.getConnection(url, "root", "");
            System.out.println("BERHASIL KONEKSI LAGI");
        } catch(Exception e) {
            System.out.println("GAGAL KONEKSI LAGI " + e);
        }
        
        return connect;
    }
}