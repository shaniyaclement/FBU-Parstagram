package com.example.parstagram;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("_User")
public class User extends ParseUser {

    public static final String KEY_USERNAME = "username";
    public static final String KEY_PASSWORD = "password";


//    public String getUsername() {
//        return getString(KEY_USERNAME);
//    }

    public void setUsername(String user) {
        put(KEY_USERNAME, user);
    }
//    public String getPassword(String password){
//        return getString(password);
//    }

    public void setPassword(String password) {
        put(KEY_PASSWORD, password);
    }
}
