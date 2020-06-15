import java.math.BigDecimal;

public class Roses extends AllFlowers {

    public Roses() {
        this.cell = BigDecimal.valueOf(100);
        this.name = "Rose";
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