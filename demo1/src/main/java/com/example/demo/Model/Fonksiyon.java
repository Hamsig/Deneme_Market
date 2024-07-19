package com.example.demo.Model;

import java.sql.*;
import java.util.Properties;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.SneakyThrows;

public class Fonksiyon {

    private String name;
    private String version;
    private int owner_id;
    private int ID;
    private Item item;

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public int getOwnerId() { return owner_id; }

    public int getID() { return ID; }

    public Item getItem() { return item; }

    @SneakyThrows
    @Override
    public String toString() {
        boolean b = getName().equals("item-add");

        Connection con = null;

        if (b){
            Gson gson = new Gson();

            String json = gson.toJson(item);

            JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();

            String ITEM_NAME = jsonObject.get("name").getAsString();
            String ITEM_DESCRIPTION = jsonObject.get("description").getAsString();
            String ITEM_RANK = jsonObject.get("rank").getAsString();

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/test_database2";
                Properties info = new Properties();
                info.put("user","root");
                info.put("password","0000");

                DriverManager.getDrivers();
                con = DriverManager.getConnection(url,info);
            ;} catch (SQLException ex) {
                System.out.println("An error occurred while connecting MySQL databse");
                ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            assert con != null;
            PreparedStatement st = con.prepareStatement("INSERT INTO item (`name`, `description`, `rank`, `ID`, `Owner_ID`) VALUES (?,?,?,?,?)");

            st.setString(1,ITEM_NAME);
            st.setString(2,ITEM_DESCRIPTION);
            st.setString(3,ITEM_RANK);
            st.setInt(4,getID());
            st.setInt(5,getOwnerId());

            st.execute();

            con.close();
        }


        return  "[TEST_NAME]: " + getName() + '\n' +
                "[TEST_VERSION]: " + getVersion() + '\n' +
                "[TEST_ITEM]: " + getItem();
    }
}

