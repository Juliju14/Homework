import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

    public abstract class FlowersSaver {

        public static void save(File file, ArrayList<AllFlowers> bouquet) {
            if (!file.exists()) {
                file = new File(file.getAbsolutePath());
            }

            try (FileWriter writer = new FileWriter(file, false)) {
                for (AllFlowers f : bouquet) {
                    if (f instanceof Roses) {
                        writer.write( new Roses().getName() + " ");
                    } else if (f instanceof Chamomiles) {
                        writer.write(new Chamomiles().getName() + " ");
                    } else if (f instanceof Tulips) {
                        writer.write(new Tulips().getName() + " ");
                    }
                }
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }