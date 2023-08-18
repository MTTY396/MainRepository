import java.util.Scanner;

public class MinusPriceIfOverFourty {
    public static void minusPriceIfOverFourty(){
        ProductsPriceSum productsPriceSum = new ProductsPriceSum();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość produktów: ");
        double numberOfProducts = scanner.nextInt();

        System.out.println("Podaj cenę produktu: ");
        double normalPrice = scanner.nextFloat();
        double sum;
        if (40 < ProductsPriceSum.setPriceSum()){
            sum = numberOfProducts*normalPrice/2;
        }
        else {
            sum = numberOfProducts*normalPrice;
        }


        sum = RoundTo2DecimalPlace.roundTo2DecimalPlace(sum);

        productsPriceSum.productsPriceSum(sum);
    }
}
