import java.text.MessageFormat;

public class Chair extends Product implements Descuento {
    //==================== PROPERTIES ===================================
    private boolean wheels;
    //==================== CONSTRUCTORS =================================

    public Chair(int numberStock, String name, long price, boolean wheels) {
        super(numberStock, name, price);
        setWheels(wheels);
    }

    //==================== GETTERS & SETTERS ============================

    public boolean isWheels() {
        return wheels;
    }

    public void setWheels(boolean wheels) {
        this.wheels = wheels;
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
        return super.toString().concat(MessageFormat.format("Chair'{'wheels={0}'}'", isWheels()));
    }
}
