/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Controller;
import controller.DataBaseController;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.User;

/**
 *
 * @author shyen
 */
public class LoginScreen extends JFrame {
    private DefaultTableModel kolom;
    private JTable tabel;
    public LoginScreen() {
        login();
    }

    private void login() {
        //frame
        JFrame frame = new JFrame("Login");
        frame.setSize(1500, 900);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);

        //font
        Font font1 = new Font("Arial", Font.PLAIN, 15);
        Font font2 = new Font("Arial", Font.PLAIN, 35);

        //Nama
        JLabel namaLab = new JLabel("Nama:");
        namaLab.setBounds(15, 80, 150, 40);
        namaLab.setFont(font1);
        frame.add(namaLab);

        JTextField nama = new JTextField();
        nama.setBounds(175, 80, 200, 40);
        frame.add(nama);

        //pass
        JLabel password = new JLabel("Password:");
        password.setBounds(15, 230, 250, 40);
        password.setFont(font1);
        frame.add(password);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(175, 230, 200, 40);
        frame.add(pass);

        JButton back = new JButton("back");
        back.setBounds(205, 430, 100, 40);
        frame.add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new MainMenu();
            }
        });

        JButton login = new JButton("Login");
        login.setBounds(55, 430, 100, 40);
        frame.add(login);

//        login.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                frame.setVisible(false);
//                kolom = new DefaultTableModel();
//                kolom.setColumnIdentifiers(new Object[]{
//                    "IdUser", "Name", "Password", "Email", "Gender", "IdCategory", "follower"
//                });
//                tabel = new JTable();
//                tabel.setModel(kolom);
//                tabel.setVisible(true);
//
//                User aa = DataBaseController.getUserData(nama.getText(),pass.getText());
//
//                    int idUser = aa.getIdUser();
//                    int idCategory = aa.getIdCategory();
//                    String email = aa.getEmail();
//                    String name = aa.getName();
//                    String pass = aa.getPassword();
//                    String gender = aa.getGender();
//                    int foll = aa.getFollowerUser();
//                    kolom.addRow(new Object[]{idUser, name, pass, email, gender, idCategory, foll});
//                    System.out.println(aa.getName());
//                
//                JScrollPane scroll = new JScrollPane();
//                scroll.setViewportView(tabel);
//                getContentPane().add(scroll);
//            }
//        });
    }
}
