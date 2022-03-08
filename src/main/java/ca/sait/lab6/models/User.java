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
    
}
