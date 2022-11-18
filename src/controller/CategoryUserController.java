/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Database.DatabaseHandler;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.CategoryUser;

/**
 *
 * @author shyen
 */
public class CategoryUserController {
    DatabaseHandler a = new DatabaseHandler();
    
    
    public ArrayList<CategoryUser> getCategory(){
        ArrayList<CategoryUser> aa = new ArrayList<>();
        try {
            a.connect();
            String que = "SELECT * FROM categoryuser";
            PreparedStatement state = a.con.prepareStatement(que);
            ResultSet res = state.executeQuery();
            while(res.next()){
                int id = res.getInt("idCategory");
                String name = res.getString("nameCategory");
                CategoryUser a = new CategoryUser(id,name);
                aa.add(a);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        a.disconnect();
        return aa;
    }
}
