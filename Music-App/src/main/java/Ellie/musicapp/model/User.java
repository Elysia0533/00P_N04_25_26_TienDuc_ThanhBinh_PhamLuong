package Ellie.musicapp.model;

public class User {

    private final String id;
    private String username;
    private String email;

    public User(String id, String username, String email) {

        this.id = id;
        setUsername(username);
        setEmail(email);
    }
    
    //id
    public String getId() { 
        return id; 
    }

    //username
    public String getUsername() { 
        return username; 
    }
    public void setUsername(String username) {

        if (username == null || username.isEmpty()) {

            this.username = "Unknown";
        } else {

            this.username = username;
        }
    }

    //email
    public String getEmail() { 
        
        return email; 
    }
    public void setEmail(String email) {

        if (email != null && email.contains("@")) {

            this.email = email;
        } else {

            this.email = "invalid@example.com";
        }
    }

    @Override
    public String toString() {

        return "User{id='" + id + "', username='" + username + "', email='" + email + "'}";
    }
}
