import java.util.Scanner;

public class NoSpecialOffer {
    public static void noSpecialOffer() {
        ProductsPriceSum productsPriceSum = new ProductsPriceSum();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość produktów: ");
        double numberOfProducts = scanner.nextInt();

        System.out.println("Podaj cenę produktu: ");
        double Price = scanner.nextFloat();

        double sum = (double) numberOfProducts*Price;
        sum = RoundTo2DecimalPlace.roundTo2DecimalPlace(sum);


        productsPriceSum.productsPriceSum(sum);

//        System.out.println("Kwota: " + sum + " zł");
    }
}
