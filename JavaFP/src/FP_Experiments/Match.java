package FP_Experiments;

public class Match implements Comparable<Match> {
  private int ID;
  private String City;
  private String MatchNumber;
  private String Team1;
  private String Team2;
  private String TossWinner;
  private String TossDecision;
  private String WinningTeam;
  private String WonBy;
  private int Margin;
  private String PlayerOfMatch;


  public Match(int ID, String City, String MatchNumber, String Team1,
      String Team2, String TossWinner, String TossDecision,String WinningTeam,
      String WonBy, int Margin,String PlayerOfMatch  ) {
    this.ID = ID;
    this.City = City;
    this.MatchNumber = MatchNumber;
    this.Team1 = Team1;
    this.Team2 = Team2;
    this.TossWinner = TossWinner;
    this.TossDecision = TossDecision;
    this.WinningTeam = WinningTeam;
    this.WonBy = WonBy;
    this.Margin = Margin;
    this.PlayerOfMatch = PlayerOfMatch;
  }

  public String toString() {
    return String.format("%-10d%-20s%-20s%-30s%-20s", ID, City, MatchNumber, WinningTeam, PlayerOfMatch);
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public String getCity() {
    return City;
  }

  public void setCity(String City) {
    this.City = City;
  }

  public String getMatchNumber() {
    return MatchNumber;
  }

  public void setMatchNumber(String MatchNumber) {
    this.MatchNumber = MatchNumber;
  }

  public String getTeam1() {
    return Team1;
  }

  public void setTeam1(String Team1) {
    this.Team1 = Team1;
  }

  public String getTeam2() {
    return Team2;
  }

  public void setTeam2(String Team2) {
    this.Team2 = Team2;
  }

  public String getTossWinner() {
    return TossWinner;
  }

  public void setTossWinner(String TossWinner) {
    this.TossWinner = TossWinner;
  }

  public String getTossDecision() {
    return TossDecision;
  }

  public void setTossDecision(String TossDecision) {
    this.TossDecision = TossDecision;
  }

  public String getWonBy() {
    return WonBy;
  }

  public void setWonBy(String WonBy) {
    this.WonBy = WonBy;
  }

  public int getMargin() {
    return Margin;
  }

  public void setMargin(int Margin) {
    this.Margin = Margin;
  }

  public String getPlayerOfMatch() {
    return PlayerOfMatch;
  }

  public void setPlayerOfMatch(String PlayerOfMatch) {
    this.PlayerOfMatch = PlayerOfMatch;
  }
  
  public int compareTo(Match c) {
    return ((Integer) Margin).compareTo(c.Margin);
  }
}
