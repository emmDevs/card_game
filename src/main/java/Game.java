import jdk.jfr.internal.consumer.RecordingInput;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private ArrayList<Player> winners;

    public Game(){
        this.players = new ArrayList<Player>();
        this.winners = new ArrayList<Player>();
    }

    public int getNumberOfPlayers(){
        return this.players.size();
    }
}
