package ca.sait.lab6.services;

import ca.sait.lab6.dataccess.RoleDB;
import ca.sait.lab6.dataccess.UserDB;
import ca.sait.lab6.models.Role;
import ca.sait.lab6.models.User;
import java.util.List;

public class RoleService {
    private RoleDB roleDB = new RoleDB();

    public List<Role> getAll() throws Exception {
        List<Role> roles = this.roleDB.getAll();
        return roles;
    }
}
