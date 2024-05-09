import java.text.MessageFormat;

public class ComputerProduct extends Product{
    //==================== PROPERTIES ===================================
    private String makerName;
    //==================== CONSTRUCTORS =================================

    public ComputerProduct(int numberStock, String name, long price, String makerName) {
        super(numberStock, name, price);
        setMakerName(makerName);
    }

    //==================== GETTERS & SETTERS ============================

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }

    //==================== METHODS ======================================
    //==================== TO STRING ====================================

    @Override
    public String toString() {
        return super.toString().concat(MessageFormat.format("ComputerProduct'{'makerName=''{0}'''}'", getMakerName()));
    }
}
