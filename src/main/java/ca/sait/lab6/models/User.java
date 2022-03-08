package ca.sait.lab6.models;

import java.io.Serializable;

/**
 *
 * @author Andy Diep
 */
public class User implements Serializable {
    private String email;
    private boolean active;
    private String firstName;
    private String lastName;
    private String password;
    private Role role;
    
    public User(){
        
    }
    
    public User(String email, boolean active, String firstName, String lastName, String password, Role role){
        this.email = email;
        this.active = active;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.role = role;
    }
    
}
