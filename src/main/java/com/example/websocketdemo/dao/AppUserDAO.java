package com.example.websocketdemo.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.websocketdemo.formbean.AppUserForm;
import com.example.websocketdemo.model.AppUser;
import com.example.websocketdemo.model.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
public class AppUserDAO {
 
    // Config in WebSecurityConfig
    @Autowired
    private PasswordEncoder passwordEncoder;
 
    private static final Map<Long, AppUser> USERS_MAP = new HashMap<>();
 
    static {
        initDATA();
    }
 
    private static void initDATA() {
        String encrytedPassword = "";
 
        AppUser alan = new AppUser(1L, "PLS2060-01", "Alan", "11/30", //
                true, "talk about the debates", "aptrieu@cpp.edu", "Library", encrytedPassword);
 
        AppUser alan2 = new AppUser(2L, "Basketball 3v3", "Alan", "12/2 2PM", //
                true, "Need two more players.", "aptrieu@cpp.edu", "BRIC", encrytedPassword);
        
        AppUser alan3 = new AppUser(3L, "Smash Tourament", "Alan", "12/4 8PM", //
                true, "", "aptrieu@cpp.edu", "Games Room", encrytedPassword);
        
        AppUser alan4 = new AppUser(4L, "CS3800 Study Group", "Alan", "12/2 12PM", //
                true, "Review for quiz", "aptrieu@cpp.edu", "CS Lab", encrytedPassword);
 
        USERS_MAP.put(alan.getUserId(), alan);
        USERS_MAP.put(alan2.getUserId(), alan2);
        USERS_MAP.put(alan3.getUserId(), alan3);
        USERS_MAP.put(alan4.getUserId(), alan4);
    }
 
    public Long getMaxUserId() {
        long max = 0;
        for (Long id : USERS_MAP.keySet()) {
            if (id > max) {
                max = id;
            }
        }
        return max;
    }
 
    //
 
    public AppUser findAppUserByUserName(String userName) {
        Collection<AppUser> appUsers = USERS_MAP.values();
        for (AppUser u : appUsers) {
            if (u.getUserName().equals(userName)) {
                return u;
            }
        }
        return null;
    }
 
    public AppUser findAppUserByEmail(String email) {
        Collection<AppUser> appUsers = USERS_MAP.values();
        for (AppUser u : appUsers) {
            if (u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }
 
    public List<AppUser> getAppUsers() {
        List<AppUser> list = new ArrayList<>();
 
        list.addAll(USERS_MAP.values());
        return list;
    }
 
    public AppUser createAppUser(AppUserForm form) {
        Long userId = this.getMaxUserId() + 1;
        String encrytedPassword = this.passwordEncoder.encode(form.getPassword());
 
        AppUser user = new AppUser(userId, form.getUserName(), //
                form.getFirstName(), form.getLastName(), false, //
                form.getGender(), form.getEmail(), form.getCountryCode(), //
                encrytedPassword);
 
        USERS_MAP.put(userId, user);
        return user;
    }
 
}