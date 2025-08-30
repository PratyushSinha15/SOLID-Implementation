package SRP.Ex2;
import javax.sound.midi.Soundbank;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import  java.security.NoSuchAlgorithmException;

public class ProblemCode {
    public class User{

        private String name;
        private String email;
        private String password;
        public User(String name, String email, String password){
            this.name= name;
            this.email= email;
            this.password= encryptPass(password);
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
        private String encryptPass(String pass){
            try{
                MessageDigest md= MessageDigest.getInstance("SHA-256");
                byte[] hash= md.digest(pass.getBytes());
                StringBuilder hashed= new StringBuilder();
                for(byte i: hash){
                    hashed.append(String.format("%02x", i));
                }
                return hashed.toString();
            }catch (NoSuchAlgorithmException e){
                throw new RuntimeException(e);
            }
        }

        public void saveToFile(String FileName){
            try(FileWriter writer= new FileWriter(FileName,true)){
                writer.write(name + "," + email + "," + password + "\n");
                System.out.println("User saved to file: " + FileName);
            }catch (IOException e){
                throw  new RuntimeException(e);
            }
        }
    }
}
