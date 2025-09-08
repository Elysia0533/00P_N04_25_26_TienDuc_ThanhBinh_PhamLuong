package main.java.musicapp.model;

public class user {
    private String id;
    private String username;
    private String email;

    public User(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }
    public String getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        if (username == null || username.isEmpty()) {
            this.username = "Unknown";
        } else {this.username = username;}
    }
    public String getEmail() {return email;}
    public void setEmail(String email) {
        if (email != null && email.contain("@")) {
            this.email = email;
        } else {
            this.email = "invalid";
        }
    }
    public String toString() {
        return "User{id='" + getId() + "', username='" + getUsername() + "', email='" + getEmail() + "'}";
    }
}
