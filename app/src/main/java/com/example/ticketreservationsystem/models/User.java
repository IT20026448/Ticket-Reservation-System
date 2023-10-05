package com.example.ticketreservationsystem.models;

public class User {
    private String nic; // National Identity Card, used as a primary key
    private String name;
    private String email;
    private String password; // You should hash and salt passwords in a real application
    private boolean isActive; // Indicates if the account is active or deactivated

    // Constructors (if needed)
    public User() {
    }

    public User(String nic, String name, String email, String password, boolean isActive) {
        this.nic = nic;
        this.name = name;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
    }

    // Getters and setters
    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

