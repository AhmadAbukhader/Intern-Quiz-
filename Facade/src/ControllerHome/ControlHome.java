package ControllerHome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControlHome {
    private final Music song ;
    private final Security alarming;
    private final Lights bedRoomLight ;

    public ControlHome(){
        song = new Music("beethoven");
        alarming = new Security();
        bedRoomLight = new Lights();

    }
//music
    public void musicAutoPlay (){
        song.startMusic();
        song.turnOffMusic();
    }
//light
    public void turnOnLight(){
        bedRoomLight.lightOn();
    }
    public void turnOffLight(){
        bedRoomLight.lightOff();
    }
//security

    public void alarmReady(){
        alarming.alarmOn();
    }
    public void changeSong (String newSong) {
        song.setSongName(newSong);
    }

    public void welcoming(){
        alarming.doorOpen("main house door");
        song.setSongName("welcome home music");
        song.startMusic();

    }
}
