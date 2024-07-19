package com.example.demo.Model;

import lombok.Getter;
import lombok.SneakyThrows;

import java.sql.*;

@Getter
public abstract class Fonksiyon {

        private String name;

    public String getName() {
        return name;
    }

    public String Task() throws SQLException {
        boolean b = getName().equals("item-add");

        System.out.println(b);

        if (b) {

            String sql = "test_database2";

            String url = "jdbc:mysql://localhost/";
            String username = "root";
            String password = "0000";

            Connection c = DriverManager.getConnection(url,username,password);
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);

            System.out.println(rs.getString(1));

            // data base

            // itemi data base e ekle

            //sonra geri döndür

            return rs.getString(1);
        } else {

            // data base

            // item varmı kontroll et

            // varsa geri item ı döndür

            return "item";
        }

    }

}
