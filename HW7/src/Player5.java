import java.math.BigDecimal;
import java.util.stream.IntStream;

//Плеер 5.
//Имеет final цену(задается в конструкторе) и геттер
//Имеет плейлист
//playSong Может проиграть первую песню
//playAllSongs может проиграть все песни с конца плейлиста в начало
public class Player5 extends AllPlayers {


    public Player5(double price) {
        this.price = new BigDecimal(price);
               song = this.playlist[0];
    }

    private BigDecimal getPrice() {
        return price;
    }


    public void playAllSongs(String[] playlist) {
        for (int i = playlist.length; i > 0 ; i--) {
            System.out.println("Playing: " + playlist[i-1]);
        }
    }
}