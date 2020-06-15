import java.math.BigDecimal;
//Плеер 2.
//Имеет final цену(задается в конструкторе) и геттер
//Имеет только 1 песню (нельзя объявить эту переменную в классе этого плеера)
//playSong Пытаясь проиграть песню выдает ошибку в консоль - “error”.
public class Player2 extends AllPlayers{

    final BigDecimal price;

    public Player2(double price) {
        this.price = new BigDecimal(price);
        song = this.playlist[2];
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void playSong(String songName) {
        System.out.println("error");
    }
}
