import java.math.BigDecimal;

//Плеер 3.
//Имеет final цену(задается в конструкторе) и геттер
//Имеет плейлист
//playSong Может проиграть первую песню
//playAllSongs может проиграть все песни
public class Player3 extends AllPlayers {


    public Player3(double price) {
        this.price = new BigDecimal(price);
                song = playlist[1];
    }

    private BigDecimal getPrice() {
        return price;
    }
}
