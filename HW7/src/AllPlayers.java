import java.math.BigDecimal;

public abstract class AllPlayers {
    String song;
    BigDecimal price;
String[] playlist = new String[] {"The best song", "Good song", "Super Song"};


    public String getSong() {
        return song;
    }

    public String[] getPlaylist() {
        return playlist;

    }

    public void playSong(String songName) {
        System.out.println("Playing: " + songName);
    }

    public void playAllSongs(String[] playlist) {
        for (String song : playlist) {
            System.out.println("Playing: " + song);
        }
    }

}
