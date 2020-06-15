import java.math.BigDecimal;

public class Chamomiles extends AllFlowers {

    public Chamomiles() {
        this.cell = BigDecimal.valueOf(70);
        this.name = "Chamomile";
    }

    @Override
    public BigDecimal getCell() {
        return cell;
    }

    @Override
    public String getName() {
        return name;
    }
}