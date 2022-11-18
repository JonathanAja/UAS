/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author shyen
 */
public class MainMenu {
    public static void main(String[] args) {
        new MainMenu();
    }
    
    public MainMenu(){
         JFrame frame = new JFrame("UAS");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        JButton login = new JButton("Login");
        login.setBounds(25, 25, 200, 40);
        frame.add(login);
        
        JButton regis = new JButton("Registrasi");
        regis.setBounds(25, 75, 200, 40);
        frame.add(regis);
        
        JButton user = new JButton("Lihat Data Pengguna");
        user.setBounds(25, 125, 200, 40);
        frame.add(user);
        
        
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new LoginScreen(); 
            }
        });
        
        regis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
               new RegistrasiScreen(); 
            }
        });
        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
               new UserDataScreen(); 
            }
        });
    }
}
