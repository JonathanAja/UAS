/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Controller;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author shyen
 */
public class UserDataScreen {
    public UserDataScreen() {
        print();
    }

    private void print() {
        //frame
        JFrame frame = new JFrame("Data Pengguna");
        frame.setSize(1500, 900);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);

        //font
        Font font1 = new Font("Arial", Font.PLAIN, 15);
        Font font2 = new Font("Arial", Font.PLAIN, 35);

        JComboBox cate = new JComboBox(Controller.kategori());
        cate.setBounds(15, 80, 150, 40);
        frame.add(cate);

        JButton search = new JButton("Search");
        search.setBounds(15, 130, 150, 40);
        frame.add(search);

        JButton back = new JButton("Back");
        back.setBounds(15, 180, 150, 40);
        frame.add(back);

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new JTableScreen(Controller.getIntId((String) cate.getSelectedItem()));
            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new MainMenu();
            }
        });
    }
}
