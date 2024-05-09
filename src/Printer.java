import java.text.MessageFormat;

public class Printer extends ComputerProduct implements Descuento {
    //==================== PROPERTIES ===================================
    private int quantityCopy;

    //==================== CONSTRUCTORS =================================

    public Printer(int numberStock, String name, long price, String makerName, int quantityCopy) {
        super(numberStock, name, price, makerName);
        setQuantityCopy(quantityCopy);
    }

    //==================== GETTERS & SETTERS ============================

    public int getQuantityCopy() {
        return quantityCopy;
    }

    public void setQuantityCopy(int quantityCopy) {
        this.quantityCopy = quantityCopy;
    }

    //==================== METHODS ======================================

    @Override
    public long aplicarDecuento(int descuento) {
        setPrice(getPrice()-((getPrice()*descuento)/100));
        return getPrice();
    }

    //==================== TO STRING ====================================

    @Override
    public String toString() {
        return super.toString().concat(MessageFormat.format("Printer'{'quantityCopy={0}'}'", getQuantityCopy()));
    }
}
