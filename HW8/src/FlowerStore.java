import java.math.BigDecimal;
import java.util.ArrayList;

public class FlowerStore {
    static BigDecimal benefit = BigDecimal.valueOf(0);

    public static ArrayList<AllFlowers> sell(int roses, int chamomiles, int tulips) {
        ArrayList<AllFlowers> bouquet = new ArrayList<>();
        for (int i = 0; i < roses; i++) {
            bouquet.add(new Roses());
        }
        for (int i = 0; i < chamomiles; i++) {
            bouquet.add(new Chamomiles());
        }
        for (int i = 0; i < tulips; i++) {
            bouquet.add(new Tulips());
        }

        return bouquet;
    }

    public static ArrayList<AllFlowers> sellSequence(int roses, int chamomiles, int tulips) {
        ArrayList<AllFlowers> bouquet = new ArrayList<>();
        do {
            if (roses != 0) {
                bouquet.add(new Roses());
                roses--;
            }
            if (chamomiles != 0) {
                bouquet.add(new Chamomiles());
                chamomiles--;
            }
            if (tulips != 0) {
                bouquet.add(new Tulips());
                tulips--;
            }
        } while (roses != 0 || chamomiles != 0 || tulips != 0);

        return bouquet;
    }

    public static void sellBouquet(int roses, int chamomiles, int tulips, boolean sequence) {
        ArrayList<AllFlowers> bouquet;
        if (sequence) {
            bouquet = sellSequence(roses, chamomiles, tulips);
        } else {
            bouquet = sell(roses, chamomiles, tulips);
        }
        for (AllFlowers flower : bouquet) {
            System.out.print(flower.getClass().getSimpleName() + " ");
        }
        setProfit(roses, chamomiles, tulips);
    }

    public static BigDecimal getBenefit() {
        return benefit;
    }

    private static void setProfit(int roses, int chamomiles, int tulips) {
        benefit = benefit.add(BigDecimal.valueOf(roses * new Roses().getCell().intValue() +
                chamomiles * new Chamomiles().getCell().intValue() +
                tulips * new Tulips().getCell().intValue()));
    }
}

