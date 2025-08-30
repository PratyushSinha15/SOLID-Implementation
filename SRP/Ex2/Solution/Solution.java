package SRP.Ex2.Solution;

public class Solution {
    public static void main(String[] args) {
        Encrypter encrypt= new Encrypter();
        String encryptedPass= encrypt.encryptPass("Mypassword");
        User user = new User("Alice", "alice@example.com", encryptedPass);

        FileSaver saver = new FileSaver();
        saver.saveToFile(user, "SRP/Ex2/Solution/users.txt");
    }
}
