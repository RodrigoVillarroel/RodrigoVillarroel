import java.text.MessageFormat;

public class Desk extends Product{
    //==================== PROPERTIES ===================================
    private float height;
    private float width;
    //==================== CONSTRUCTORS =================================

    public Desk(int numberStock, String name, long price, float height, float width) {
        super(numberStock, name, price);
        setHeight(height);
        setWidth(width);
    }

    //==================== GETTERS & SETTERS ============================

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    //==================== METHODS ======================================
    //==================== TO STRING ====================================

    @Override
    public String toString() {
        return super.toString().concat(MessageFormat.format("Desk'{'height={0}, width={1}'}'", getHeight(), getWidth()));
    }
}
