import java.math.BigDecimal;

//Плеер 6.
//Имеет final цену(задается в конструкторе) и геттер
//Имеет плейлист
//playSong Может проиграть первую песню
//playAllSongs может проиграть все песни
//Имеет метод public void shuffle() - перемешивает все песни в плейлисте местами
public class Player6 extends AllPlayers {


    public Player6(double price) {
        this.price = new BigDecimal(price);
                song = playlist[0];
    }

    private BigDecimal getPrice() {
        return price;
    }

    public void shuffle() {

                String stringTemp = new String();
               int playlistLength = playlist.length;
                int random;

                for (int i = 0; i <3; i++) {
                    random = ((int) (Math.random() * playlistLength));

                    if (random < (playlistLength - 1)) {
                        stringTemp = playlist[random + 1];
                        playlist[random + 1] = playlist[random];
                        playlist[random] = stringTemp;
                    } else {
                        stringTemp = playlist[0];
                        playlist[0] = playlist[random];
                        playlist[random] = stringTemp;
                }
            }
    }

        }

