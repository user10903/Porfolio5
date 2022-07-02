package FP_Experiments;


import java.util.*;

public class IPL02 {
  public static void main(String[] args) {
    List<Match> table = Arrays.asList(
        new Match(1312200,"Ahmedabad","Final", "Rajasthan Royals","Gujarat Titans","Rajasthan Royals",
            "bat","Gujarat Titans", "Wickets", 7,"HH Pandya"),
        new Match(1312199,"Ahmedabad", "Qualifier 2", "Royal Challengers Bangalore","Rajasthan Royals",
            "Rajasthan Royals","field","Rajasthan Royals", "Wickets", 7, "JC Buttler"),
        new Match(1312198,"Kolkata", "Eliminator", "Royal Challengers Bangalore", "Lucknow Super Giants", "Lucknow Super Giants",
            "field","Royal Challengers Bangalore","Runs",14,"RM Patidar"),
        new Match(1312197,"Kolkata", "Qualifier 1", "Rajasthan Royals", "Gujarat Titans", "Gujarat Titans",
            "field","Gujarat Titans","Wickets",7,"DA Miller"),
        new Match(1304116,"Mumbai", "70", "Sunrisers Hyderabad", "Punjab Kings", "Sunrisers Hyderabad",
            "bat","Punjab Kings","Wickets",5,"Harpreet Brar"),
        new Match(1304115,"Mumbai", "69","Delhi Capitals","Mumbai Indians","Mumbai Indians",
            "field","Mumbai Indians","Wickets",5,"JJ Bumrah"),
        new Match(1304114,"Mumbai", "68","Chennai Super Kings","Rajasthan Royals", "Chennai Super Kings",
            "bat","Rajasthan Royals","Wickets",5,"R Ashwin"),
        new Match(1304113,"Mumbai", "67", "Gujarat Titans", "Royal Challengers Bangalore","Gujarat Titans",
            "bat","Royal Challengers Bangalore","Wickets",8,"V Kohli"),
        new Match(1304112,"Navi Mumbai", "66", "Lucknow Super Giants", "Kolkata Knight Riders","Lucknow Super Giants",
            "bat","Lucknow Super Giants","Runs",2,"Q de Kock"),
        new Match(1304111,"Mumbai", "65","Sunrisers Hyderabad", "Mumbai Indians", "Mumbai Indians",
            "field","Sunrisers Hyderabad","Runs",3,"RA Tripathi"),
        new Match(1304110,"Navi Mumbai", "64", "Delhi Capitals", "Punjab Kings", "Punjab Kings",
            "field","Delhi Capitals","Runs",17,"SN Thakur"),
        new Match(1304109,"Mumbai", "63", "Rajasthan Royals","Lucknow Super Giants", "Rajasthan Royals",
            "bat","Rajasthan Royals","Runs",24,"TA Boult"));

    table.stream().forEach(x -> System.out.println(x));
    System.out.println();
    table.parallelStream().forEach(System.out::println);
  }
}
