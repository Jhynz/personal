public class Item {
    // Attributes
    String itemname;
    int price;
    float weight;
    int quantity;
    String description;
    boolean canbetraded;

    // Method
    public void saMyName() {
        System.out.println("Name: " + itemname);
    }

    public void saMyAttributes() {
        System.out.println("price:" +  price + "\n" + "weight:" + weight + "\n" +"quantity:" + quantity + "\n" + "description:" + description + "\n" +"can be traded:" + canbetraded );
    }

    // Constructor
    public Item (String itmnm, int prc, float wgt, int qty, String dsc, boolean cbt) { 
        itemname = itmnm;
        price = prc;
        weight = wgt;
        quantity = qty;
        description = dsc;
        canbetraded = cbt;
    }
}
