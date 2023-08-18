import java.util.Scanner;

public class WeightProduct {
    public static void weightProduct(){
        ProductsPriceSum productsPriceSum = new ProductsPriceSum();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wagę produktu w kg: ");
        double weightOfProduct = scanner.nextDouble();

        System.out.println("Podaj cenę produktu za 1kg: ");
        double Price = scanner.nextFloat();

        double sum = weightOfProduct*Price;
        sum = RoundTo2DecimalPlace.roundTo2DecimalPlace(sum);

        productsPriceSum.productsPriceSum(sum);

//        System.out.println("Kwota: " + sum + " zł");
    }
}
