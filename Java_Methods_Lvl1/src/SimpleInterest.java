import java.util.Scanner;

public class SimpleInterest {

    public static double simpleInterestCalculation(double principal,double rate,double time)
    {
        return (principal*rate*time)/100;
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double principalValue = input.nextDouble();
        double rateValue = input.nextDouble();
        double timeValue = input.nextDouble();

        double simpleInterest = simpleInterestCalculation(principalValue,rateValue,timeValue);

        System.out.println("The Simple Interest is "+simpleInterest+"for Principal"+principalValue+",Rate Of Interest"+rateValue+"and time"+timeValue
        );

    }

}
