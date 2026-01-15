public class Item {

    int itemCode;
    String itemName;
    double price;
    static double totalprice;

    public Item(int itemCode,String itemName,double price)
    {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        totalprice += price;
    }

    public void displayDetails()
    {
        System.out.println("Item Code : "+itemCode);
        System.out.println("Item Name : "+itemName);
        System.out.println("Item Price : "+price);
    }

    public void totalCostDisplay()
    {
        System.out.println("Total Cost : "+totalprice);
    }


    public static void main(String[] args) {

        Item item = new Item(1,"Bucket",200);
        Item item1 = new Item(1,"Bucket1",300);
        Item item2 = new Item(1,"Bucket2",400);

        item.displayDetails();
        item1.displayDetails();
        item2.displayDetails();

        item.totalCostDisplay();
    }

}

