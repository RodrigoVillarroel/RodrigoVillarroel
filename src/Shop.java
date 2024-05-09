import java.text.MessageFormat;
import java.util.ArrayList;

public class Shop {
    //==================== PROPERTIES ===================================
    private ArrayList<Product> productArrayList;
    //==================== CONSTRUCTORS =================================

    public Shop(ArrayList<Product> productArrayList) {
        setProductArrayList(productArrayList);
    }

    public Shop() {
        setProductArrayList(new ArrayList<>());
    }


    //==================== GETTERS & SETTERS ============================

    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }

    public void setProductArrayList(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    //==================== METHODS ======================================

    public void listProducts(){
        if(getProductArrayList()!=null){
            for (Product p: getProductArrayList()
            ) {
                System.out.println(p.getClass().toString() + " [" +p+"] ");
            }
        }
    }

    public void addProducts(Product p){
        if(getProductArrayList()!=null){
            getProductArrayList().add(p);
        }
    }


    public void actualizarPrecios(){
        if(getProductArrayList()!=null){
            for (Product p: getProductArrayList()
                 ) {
                switch (p.getClass().getName()) {
                    case "Desk" -> p.setPrice(p.getPrice() + ((p.getPrice() * 10) / 100));
                    case "Chair" -> p.setPrice(p.getPrice() + ((p.getPrice() * 5) / 100));
                    case "Notebook" -> p.setPrice(p.getPrice() + ((p.getPrice() * 20) / 100));
                    case "Printer" -> p.setPrice(p.getPrice() + ((p.getPrice() * 15) / 100));
                }

            }
        }
    }


    //==================== TO STRING ====================================

    @Override
    public String toString() {
        return MessageFormat.format("Shop'{'productArrayList={0}'}'", getProductArrayList());
    }
}
