import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class SportStatistics {
    public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	
	System.out.println("File:");
	String fileName = reader.nextLine();
	
	System.out.println("Team:");
	String teamName = reader.nextLine();
	
	ArrayList<Matches> matches = new ArrayList<>();
	
	try(Scanner readCSV = new Scanner(Paths.get(fileName))) {
	    
	    // There is another way to use either List or ArrayList but I don't bother
	    String[] matchInfo;
	    
	    while(readCSV.hasNextLine()) {
		String s = readCSV.nextLine();
		matchInfo = s.split(",");
		
		String team1 = matchInfo[0];
		String team2 = matchInfo[1];
		int score1 = Integer.valueOf(matchInfo[2]);
		int score2 = Integer.valueOf(matchInfo[3]);

		matches.add(new Matches(team1, team2, score1, score2));
	    }
	    
	} catch(Exception e) {
	    System.out.println("Error: " + e.getMessage());
	}
	
	// get Game, Wins, Losses
	int count = 0;
	int wins = 0;
	int losses = 0;
	
	for(Matches match : matches) {
	    if(match.toString().contains(teamName)){
		count++;
		if(match.whoWon().equals(teamName)){
		    wins++;
		} else if(match.whoLost().equals(teamName)){
		    losses++;
		}
	    }
	}
	System.out.println(matches);
	System.out.println("Games: " + count);
	System.out.println("Wins: " + wins);
	System.out.println("Losses: " + losses);

    }
}


//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class SportStatistics {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        
//        System.out.println("File:");
//        String file = scan.nextLine();
//        System.out.println("Team:");
//        String team = scan.nextLine();
//        
//        ArrayList<Matchs> matchs = new ArrayList<>();
//        
//        try (Scanner reader = new Scanner(Paths.get(file))) {
//            while (reader.hasNextLine()) {
//                String line = reader.nextLine();
//                String[] parts = line.split(",");
//                String home = parts[0];
//                String away = parts[1];
//                int homeScore = Integer.valueOf(parts[2]);
//                int awayScore = Integer.valueOf(parts[3]);
//                matchs.add(new Matchs(home, away, homeScore, awayScore));
//                
//            }
//        } catch (Exception e) {
//            System.out.println("Error file");
//        }
//        
//        int count = 0;
//        int wins = 0;
//        int losses = 0;
//        
//        for (Matchs match:matchs) {
//            String test = match.toString();
//            if (test.contains(team)) {
//                count++;
//                if (match.winner().equals(team)) {
//                    wins++;
//                } else {
//                    losses++;
//                }
//            }
//            
//        }
//        
//        System.out.println("Games: " + count);
//        System.out.println("Wins: " + wins);
//        System.out.println("Losses: " + losses);
//
//    }
//
//}
