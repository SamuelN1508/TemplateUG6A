package org.rplbo.app.Data;

public class User {
    // Buatkan
    private String username;
    private String email;
    private String role;
    private String password;

    // Constructor
    public User(String username, String role, String password, String email) {
        this.username = username;
        this.role = role;
        this.password = password;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }
}
