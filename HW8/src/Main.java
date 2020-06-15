import java.io.File;

public class Main {
    public static void main(String[] args) {
        FlowerStore.sellBouquet(5, 1, 3, true);
        System.out.println("\n" + FlowerStore.getBenefit() + "\n");

        File file = new File("D:\\Flowers.txt");
        FlowersSaver.save(file, FlowerStore.sell(2, 2, 3));


        StringBuilder bouquet = new StringBuilder();
        for (AllFlowers f : FlowersLoader.load(file)) {
            bouquet.append(f.getName()).append(" ");
        }
        System.out.println(bouquet);

    }
}