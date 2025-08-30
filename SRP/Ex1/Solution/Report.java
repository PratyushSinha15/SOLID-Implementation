package SRP.Ex1.Solution;

public class Report {
    private String text;

    public Report(String text){
        this.text= text;
    }
    public Report(){
        System.out.println("Constructor created");
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text=text;
    }
}

