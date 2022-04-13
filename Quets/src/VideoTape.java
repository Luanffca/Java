public class VideoTape {  
    private String title; // the title of the programme  
    private int time;
    private String classification; // classification of the programme (comedy, drama, action, or romance) private int time;// the running time of the programme in minutes 
    /* Create a new video tape with a given title, classification, and time.*/ 
    
    public VideoTape(String fullTitle, String programClassification, int runningTime){ 
        title = fullTitle; 
        classification = programClassification; 
        time = runningTime; 
    } 
    // Return the title of this video tape. 
    public String getTitle( ){ 
        return title; 
    }
    // Return the classification of this video tape.  
    public String getClassification ( ) {
         return classification; }
    /*Return the time of this video tape as a string in the following format: 2:06.*/  
    public String getTime(){ 
        int hour = time / 60; 
        int minute = time % 60; 
        if (minute > 9 ) 
            return hour + ":" + minute ; 
        else 
            return hour + ":0" + minute ; 
    }  
    // Set a new classification for this video tape.  
    public void setClassification (String clas1){ 
        classification = clas1; 
    } 
    /* Print the details of the video tape to the output terminal in the following format: * Adil Emam  (COMEDY) 2:16 */ 
    public void printDetails ( ) { 
        System.out.println ( title + "(" + classification + ")" + getTime()); 
    }
}