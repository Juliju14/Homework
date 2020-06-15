public class Main {
    public static void main(String[] args) {
        System.out.println("Player1: ");
        Player1 play1 = new Player1(3);
        play1.getPlaylist();
        System.out.println(play1.song);

        System.out.println("\nPlayer2: ");
        Player2 play2 = new Player2(7);
        play2.playSong("m");

        System.out.println("\nPlayer3: ");
        Player3 play3 = new Player3(2);
        System.out.println(play3.song);

        System.out.println("\nPlayer4: ");
        Player4 play4 = new Player4(4);
        play4.getPlaylist();
        System.out.println(play4.song);

        System.out.println("\nPlayer5: ");
        Player5 play5 = new Player5(6);
        play5.getPlaylist();
        play5.playAllSongs(play5.playlist);

        System.out.println("\nPlayer6: ");
        Player6 play6 = new Player6(99);
        play6.shuffle();
        play6.playAllSongs(play6.getPlaylist());

    }
}
