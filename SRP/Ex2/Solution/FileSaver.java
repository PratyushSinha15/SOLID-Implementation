package SRP.Ex2.Solution;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileSaver {
    public void saveToFile(User user, String filename) {
        try {
            Path path = Paths.get(filename);
            Path parent = path.getParent();
            if (parent != null) {
                Files.createDirectories(parent);
            }
            try (BufferedWriter writer = Files.newBufferedWriter(
                    path, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
                writer.write(user.getName() + "," + user.getEmail() + "," + user.getPassword());
                writer.newLine();
            }

            System.out.println("User saved to file: " + path.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}