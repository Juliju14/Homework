import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class FlowersLoader {

    public static ArrayList<AllFlowers> load(File file) {
        ArrayList<AllFlowers> bouquet = new ArrayList<>();

        if (file.exists()) {
            StringBuilder fileBouquet = new StringBuilder();
            try (FileReader reader = new FileReader(file)) {
                int c;
                while ((c = reader.read()) != -1) {
                    fileBouquet.append((char) c);
                }
            } catch (IOException message) {
                System.out.println(message.getMessage());
            }

            String[] preBouquet = fileBouquet.toString().trim().split(" ");
            for (String s : preBouquet) {
                if (s.equals("Roses")) {
                    bouquet.add(new Roses());
                } else if (s.equals("Chamomiles")) {
                    bouquet.add(new Chamomiles());
                } else if (s.equals("Tulips")) {
                    bouquet.add(new Tulips());
                }
            }
        } else {
            System.out.println("Bouquet not found.");
        }

        return bouquet;
    }
}
