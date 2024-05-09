import java.text.MessageFormat;

public class Product {
    //==================== PROPERTIES ===================================
    private static int idCont = 0;
    private int id;
    private int numberStock;
    private String name;
    private long price;

    //==================== CONSTRUCTORS =================================

    public Product(int numberStock, String name, long price) {
        setNumberStock(numberStock);
        setPrice(price);
        setName(name);
        setId(idCont+1);
        idCont++;
    }

    //==================== GETTERS & SETTERS ============================

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberStock() {
        return numberStock;
    }

    public void setNumberStock(int numberStock) {
        this.numberStock = numberStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    //==================== METHODS ======================================
    //==================== TO STRING ====================================

    @Override
    public String toString() {
        return MessageFormat.format("Product'{'id={0}, numberStock={1}, name=''{2}'', price={3}'}'", getId(), getNumberStock(), getName(), getPrice());
    }


        //==================== PROPERTIES ===================================
        //==================== CONSTRUCTORS =================================
        //==================== GETTERS & SETTERS ============================
        //==================== METHODS ======================================
        //==================== TO STRING ====================================
}
