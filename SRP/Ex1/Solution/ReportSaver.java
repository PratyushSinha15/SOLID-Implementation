package SRP.Ex1.Solution;

import java.io.FileWriter;
import java.io.IOException;

public class ReportSaver {
    public void SaveReport(Report report, String FileName){
        try(FileWriter writer= new FileWriter("SRP/Ex1/"+FileName)){
            writer.write(report.getText());
            System.out.println("File Report saved to: "+ FileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

