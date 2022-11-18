/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Database.DatabaseHandler;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.User;

/**
 *
 * @author shyen
 */
public class DataBaseController {

    static DatabaseHandler a = new DatabaseHandler();

    public static String insertDataUser(String name, String email, String password, String gender, int follower, int id) {
        a.connect();
        try {
            String que = "INSERT INTO users (nameUser,emailUser,password,genderUser,idCategory,followersUser) VALUES (?,?,?,?,?,?)";
            PreparedStatement state = a.con.prepareStatement(que);
            state.setString(1, name);
            state.setString(2, email);
            state.setString(3, password);
            state.setString(4, gender);
            state.setInt(5, id);
            state.setInt(6, follower);
            System.out.println("masuk");
            state.executeUpdate();

            System.out.println("entah");
            return "insert berhasill..";
        } catch (Exception e) {
            e.printStackTrace();
            return "insert gagal!";
        }

    }

    public static ArrayList<User> getAllUserData(int id) {
        ArrayList<User> aa = new ArrayList<>();
        a.connect();
        try {
            String que = "Select*from users where idCategory = '" + id + "'";
            PreparedStatement state = a.con.prepareStatement(que);
            ResultSet res = state.executeQuery(que);

            while (res.next()) {
                int idUser = res.getInt("idUser");
                int idCategory = res.getInt("idCategory");
                int foll = res.getInt("followersUser");
                String email = res.getString("emailUser");
                String name = res.getString("nameuser");
                String pass = res.getString("password");
                String gender= res.getString("genderUser");
                User a = new User(idUser, name, email, gender, idCategory, foll,pass);
                aa.add(a);
                System.out.println("database aman");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aa;
    }
    
//    public static User getUserData(String User,String password) {
//        a.connect();
////        User aa = new User(" "," "," ",0,0," ");
//        try {
//            String que = "Select*from users where nameUser = '" + User + "' && password = '"+password+"'  " ;
//            PreparedStatement state = a.con.prepareStatement(que);
//            ResultSet res = state.executeQuery(que);
//
//
//                int idUserr = res.getInt("idUser");
//                int idCategory = res.getInt("idCategory");
//                int foll = res.getInt("followersUser");
//                String email = res.getString("emailUser");
//                String name = res.getString("nameuser");
//                String pass = res.getString("password");
//                String gender= res.getString("genderUser");
//                aa = new User(idUserr, name, email, gender, idCategory, foll,pass);
//                
//                System.out.println("database aman");
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return aa;
//    }
}
