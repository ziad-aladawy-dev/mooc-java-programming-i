
public class Matches {
    private String team1;
    private String team2;
    private int score1;
    private int score2;
    
    public Matches(String team1, String team2, int score1, int score2) {
	this.team1 = team1;
	this.team2 = team2;
	this.score1 = score1;
	this.score2 = score2;
    }
    
    public String whoWon(){
	if(this.score1 > this.score2) {
	    return this.team1;
	} else if (this.score1 < this.score2) {
	  return this.team2;
	} else {
	    return "tie";
	}
    }
    
    public String whoLost(){
	if(this.score1 < this.score2) {
	    return this.team1;
	} else if (this.score1 > this.score2) {
	  return this.team2;
	} else {
	    return "tie";
	}
    }
    
    @Override
    public String toString(){
	return team1 + "," + team2;
    }
    
}


//public class Matchs {
//    private String homeTeam;
//    private String awayTeam;
//    private int homeScore;
//    private int awayScore;
//    
//    public Matchs(String homeTeam, String awayTeam, int homeScore, int awayScore) {
//        this.homeTeam = homeTeam;
//        this.awayTeam = awayTeam;
//        this.homeScore = homeScore;
//        this.awayScore = awayScore;
//    }
//    
//    public String winner() {
//        String winner = "";
//        if (this.homeScore > this.awayScore) {
//            winner = this.homeTeam;
//        }
//        if (this.homeScore < this.awayScore) {
//            winner = this.awayTeam;
//        }
//        return winner;
//    }
//    
//    @Override
//    public String toString() {
//        return this.homeTeam + " " + this.awayTeam + " " + this.homeScore + this.awayScore + this.winner();
//    }
//    
//}
