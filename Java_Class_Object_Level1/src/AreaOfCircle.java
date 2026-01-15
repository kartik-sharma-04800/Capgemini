public class AreaOfCircle {

    int radius;

    public AreaOfCircle(int radius)
    {
        this.radius = radius;
    }

    public double calculateArea()
    {
        return 3.14 * radius * radius;
    }

    public void displayArea()
    {
        System.out.println(calculateArea());
    }

    public static void main(String[] args) {

        AreaOfCircle aoc = new AreaOfCircle(5);

        aoc.displayArea();


    }

}
