package sample;

public class User {
    private String name;
    private String user;
    private String token;
    private String pass;

    public User(String name, String user, String token, String pass) {
        this.name = name;
        this.user = user;
        this.token = token;
        this.pass = pass;
    }
    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
