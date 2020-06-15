import java.math.BigDecimal;

public class Tulips extends AllFlowers{

    public Tulips() {
        this.cell = BigDecimal.valueOf(45);
        this.name = "Tulip";
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