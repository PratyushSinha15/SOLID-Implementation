package SRP.Ex2.Solution;

public class User {
    private String name;
    private String email;
    private String password;

    public User(String name, String email, String encryptedPassword){
        this.name= name;
        this.email= email;
        this.password= encryptedPassword;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
