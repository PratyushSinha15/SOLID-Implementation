package SRP.Ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;

public class ProblemCode {
    public class Report{

        private String text;

        public Report(String text){
            this.text=text;
        }

        public String getText(){
            return text;
        }
        public void setText(String text){
            this.text=text;
        }

        public void printReport(){
            System.out.println("Report : " + text);
        }

        //save to file
        public void saveToFile(String filename){
            try( FileWriter writer=new FileWriter(filename)){
                writer.write(text);
                System.out.println("Report Save to "+ filename);
            } catch (IOException e) {
                System.out.println("Could Not save to file");
                e.printStackTrace();
//                throw new RuntimeException(e);
            }
        }

    }
}
