/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.User;
import controller.DataBaseController;

/**
 *
 * @author shyen
 */
public class JTableScreen extends JFrame {

    private DefaultTableModel kolom;
    private JTable tabel;

    public JTableScreen(int id) {
        printTable(id);
        setTitle("Produk yang ditemukan");
        setSize(1500, 900);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void printTable(int id) {

        kolom = new DefaultTableModel();
        kolom.setColumnIdentifiers(new Object[]{
            "IdUser", "Name", "Password", "Email", "Gender", "IdCategory","follower"
        });
        tabel = new JTable();
        tabel.setModel(kolom);
        tabel.setVisible(true);

        ArrayList<User> aa = DataBaseController.getAllUserData(id);
        for (int i = 0; i < aa.size(); i++) {

            int idUser = aa.get(i).getIdUser();
            int idCategory = aa.get(i).getIdCategory();
            String email = aa.get(i).getEmail();
            String name = aa.get(i).getName();
            String pass = aa.get(i).getPassword();
            String gender = aa.get(i).getGender();
            int foll = aa.get(i).getFollowerUser();
            kolom.addRow(new Object[]{idUser, name, pass, email, gender, idCategory,foll});
            System.out.println(aa.get(i).getName());
        }
        JScrollPane scroll = new JScrollPane();
        scroll.setViewportView(tabel);
        getContentPane().add(scroll);

    }
}
