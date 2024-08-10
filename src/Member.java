/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author senak
 */
import java.io.Serializable;
public class Member implements Serializable {
    private String name;
    private String surname;
    private String eMail;
    private String password;
    

    public Member(String memberName, String memberSurname, String memberMail, String memberPassword) {
        this.name = memberName;
        this.surname = memberSurname;
        this.eMail = memberMail;
        this.password = memberPassword;
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
    
}
