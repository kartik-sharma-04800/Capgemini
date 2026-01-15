public class MobilePhone {

    String brand;
    String model;
    double price;

    public MobilePhone(String brand,String model,double price)
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails()
    {
        System.out.println("Brand Name : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }

    public static void main(String[] args) {

        MobilePhone mb = new MobilePhone("Realme","RMX0012",35000);
        MobilePhone mb1 = new MobilePhone("Nokia","N23231",10000);

        mb.displayDetails();
        mb1.displayDetails();


    }


}
