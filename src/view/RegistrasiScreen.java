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
import java.io.File;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author shyen
 */
public class RegistrasiScreen {
    public RegistrasiScreen() {
        regis();
    }

    private void regis() {
        //frame
        JFrame frame = new JFrame("Registrasi Form");
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

        //Email
        JLabel emailLab = new JLabel("Email:");
        emailLab.setBounds(15, 130, 150, 40);
        emailLab.setFont(font1);
        frame.add(emailLab);

        JTextField email = new JTextField();
        email.setBounds(175, 130, 200, 40);
        frame.add(email);

        //Gender
        JLabel labJK = new JLabel("Jenis Kelamin:");
        labJK.setBounds(15, 180, 250, 40);
        labJK.setFont(font1);
        frame.add(labJK);

        JRadioButton jkLaki = new JRadioButton(" Laki-laki");
        jkLaki.setBounds(175, 180, 100, 40);
        jkLaki.setFont(font1);
        frame.add(jkLaki);

        JRadioButton jkCewe = new JRadioButton(" Perempuan");
        jkCewe.setBounds(275, 180, 125, 40);
        jkCewe.setFont(font1);
        frame.add(jkCewe);
        
        
        //pass
        JLabel password = new JLabel("Password:");
        password.setBounds(15, 230, 250, 40);
        password.setFont(font1);
        frame.add(password);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(175, 230, 200, 40);
        frame.add(pass);
        
        //follower
        JLabel fol= new JLabel("User Follower:");
        fol.setBounds(15, 280, 250, 40);
        fol.setFont(font1);
        frame.add(fol);

        JTextField foll = new JTextField();
        foll.setBounds(175, 280, 200, 40);
        frame.add(foll);

        //Category
        JLabel catLab = new JLabel("Pilih Kategori:");
        catLab.setBounds(15, 330, 250, 40);
        frame.add(catLab);

        JComboBox cate = new JComboBox(Controller.kategori());
        cate.setBounds(175, 380, 250, 40);
        frame.add(cate);

        JButton reg = new JButton("registrasi");
        reg.setBounds(55, 430, 100, 40);
        frame.add(reg);

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

        reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                if(nama.getText().isEmpty()||email.getText().isEmpty()||pass.getText().isEmpty()||controller.Controller.pilihJK(jkLaki, jkCewe).isEmpty()||foll.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Semua kolom wajib diisi!");
                    new RegistrasiScreen();
                }
                else{
                DataBaseController.insertDataUser(nama.getText(), email.getText(), pass.getText(),controller.Controller.pilihJK(jkLaki, jkCewe) , 
                        Integer.parseInt(foll.getText()), Controller.getIntId((String) cate.getSelectedItem()));
                }
            }
        });
    }
}
