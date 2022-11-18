/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JRadioButton;

/**
 *
 * @author shyen
 */
public class Controller {
    public static String pilihJK(JRadioButton jk1, JRadioButton jk2) {
        String jk = "";
        if (jk1.isSelected()) {
            jk = "Male";
        } else if (jk2.isSelected()) {
            jk = "Female";
        }
        return jk;
    }
    
     public static String[] kategori(){
        CategoryUserController aa = new CategoryUserController();
        String [] listCate = new String[aa.getCategory().size()];
        for (int i = 0; i < listCate.length; i++) {
            listCate[i]= aa.getCategory().get(i).getNameCategory();
        }
        return listCate;
    }
    
    public static int getIntId(String selected){
        CategoryUserController aa = new CategoryUserController();
        int id=0;
        for (int i = 0; i < aa.getCategory().size(); i++) {
            if (selected.equals(aa.getCategory().get(i).getNameCategory())) {
                id= aa.getCategory().get(i).getIdCategory();
            }
        }
        return id;
    }
}
