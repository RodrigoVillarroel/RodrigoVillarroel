import java.text.MessageFormat;

public class Notebook extends ComputerProduct{
    //==================== PROPERTIES ===================================
    private int quantityGB;
    //==================== CONSTRUCTORS =================================

    public Notebook(int numberStock, String name, long price, String makerName, int quantityGB) {
        super(numberStock, name, price, makerName);
        setQuantityGB(quantityGB);
    }

    //==================== GETTERS & SETTERS ============================

    public int getQuantityGB() {
        return quantityGB;
    }

    public void setQuantityGB(int quantityGB) {
        this.quantityGB = quantityGB;
    }

    //==================== METHODS ======================================
    //==================== TO STRING ====================================

    @Override
    public String toString() {
        return super.toString().concat(MessageFormat.format("Notebook'{'quantityGB={0}'}'", getQuantityGB()));
    }
}
