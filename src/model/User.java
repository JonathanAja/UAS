/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shyen
 */
public class User {
    int idUser;
    String name;
    String email;
    String gender;
    int idCategory;
    int followerUser;
    String password;

    public User(int idUser, String name, String email, String gender, int idCategory, int followerUser, String password) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.idCategory = idCategory;
        this.followerUser = followerUser;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public int getFollowerUser() {
        return followerUser;
    }

    public void setFollowerUser(int followerUser) {
        this.followerUser = followerUser;
    }

}
