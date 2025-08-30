package SRP.Ex1.Solution;

public class Solution {
    public static void main(String[] args) {
        Report report= new Report();
        report.setText("This is my first Report for Single Responsibility Principle");
        System.out.println(report.getText());
        PrintReport printer= new PrintReport();
        printer.print(report);
        ReportSaver saver= new ReportSaver();
        saver.SaveReport(report,"rep1SOl");
    }
}
