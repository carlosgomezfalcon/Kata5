package kata5.main;

import java.sql.*;
import java.util.List;
import kata5.model.Histogram;
import kata5.view.HistogramDisplay;
import kata5.view.MailHistogramBuilder;
import kata5.view.MailListReaderBD;

public class Kata5 {
    
    private static List<String> mailList;
    private static Histogram<String> mailHistogram;
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException { 
        execute();
    }
    
    private static void execute() throws ClassNotFoundException, SQLException {
        input();
        process();
        output();
    }
    
    private static void input() throws ClassNotFoundException, SQLException {
        mailList = MailListReaderBD.read(); 
    }
    
    private static void process() {
        mailHistogram = MailHistogramBuilder.build(mailList);
    }
   
    private static void output() {
        new HistogramDisplay(mailHistogram).execute();
    }
    
}
