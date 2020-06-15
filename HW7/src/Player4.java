import java.math.BigDecimal;

//Плеер 4.
//Имеет final цену(задается в конструкторе) и геттер
//Имеет плейлист
//playSong Может проиграть последнюю песню
//playAllSongs может проиграть все песни
public class Player4 extends AllPlayers {


    public Player4(double price) {
        this.price = new BigDecimal(price);
               song = playlist[playlist.length-1];
    }

    private BigDecimal getPrice() {
        return price;
    }
}
