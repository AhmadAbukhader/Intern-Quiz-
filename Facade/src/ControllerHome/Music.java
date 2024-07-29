package ControllerHome;

public class Music {
 private String songName ;

    public Music (String songName){
        this.songName = songName;
    }
    public void setSongName(String song){
        this.songName = song;
    }

    public void startMusic(){
     System.out.println("the "+songName+" is going on : ........");
    }
    public void stopMusic(){
     System.out.println("the "+songName+" is paused : ........");
    }
    public void turnOffMusic(){
     System.out.println("the music is turned off : ........");
    }

}
