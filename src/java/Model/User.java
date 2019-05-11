/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Divyanshu Bali
 */
@Entity
public class User {

    @Id
    private String username;
    private String password;
    private String type;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        User u = (User) obj;
        if (u == null) {
            return false;
        }
        if (this.password.equals(u.getPassword()) && this.username.equals(u.getUsername()) && this.type.equals(u.getType())) {
            return true;
        } else {
            return false;
        }
    }
}
