
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
	this.artist = artist;
	this.name = name;
	this.durationInSeconds = durationInSeconds;
    }

//    public boolean equals(Object compared) {
//
//	if (this == compared) {
//	    return true;
//	} else if (!(compared instanceof Song)) {
//	    return false;
//	} else {
//	    Song comparedSong = (Song) compared;
//	    if (this.artist.equals(comparedSong.artist)
//		    && this.name.equals(comparedSong.name)
//		    && this.durationInSeconds == comparedSong.durationInSeconds) {
//		
//		return true;
//	    }
//
//	}
//
//	return false;
//    }
    @Override
    public boolean equals(Object song) {
	if(this == song){
	    return true;
	}
	if(!(song instanceof Song)){
	    return false;
	}
	
	Song comparedSong = (Song)song;
	
	return this.name.equals(comparedSong.name) &&
		this.artist.equals(comparedSong.artist) &&
		this.durationInSeconds == comparedSong.durationInSeconds;
    }
    
    

    @Override
    public String toString() {
	return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}

// ANSWER
//public boolean equals(Object compared) {
//        if (this == compared) {
//            return true;
//        }
//        
//        if (!(compared instanceof Song)) {
//            return false;
//        }
//        
//        Song comparedSong = (Song) compared;
//        
//        if (this.artist.equals(comparedSong.artist) &&
//            this.name.equals(comparedSong.name) &&
//            this.durationInSeconds == comparedSong.durationInSeconds) {
//            return true;
//        }
//        
//        return false;
//    }
