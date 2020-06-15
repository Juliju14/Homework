import java.math.BigDecimal;
//Плеер 1.
//Имеет final цену(задается в конструкторе) и геттер
//Имеет только 1 песню (нельзя объявить эту переменную в классе этого плеера)
//playSong Может проиграть песню
public class Player1 extends AllPlayers {

    public Player1(double price) {
     this.price = new BigDecimal(price);
        song = playlist[1];
    }

    public BigDecimal getPrice() {
        return price;
    }

}
