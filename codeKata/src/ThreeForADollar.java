import java.util.Scanner;

public class ThreeForADollar {
    public static void threeForADollar(){
        ProductsPriceSum productsPriceSum = new ProductsPriceSum();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość produktów: ");
        double numberOfProducts = scanner.nextInt();

        System.out.println("Podaj cenę produktu: ");
        double normalPrice = scanner.nextFloat();

        double overThree = numberOfProducts % 3;
        double inOfferProducts = numberOfProducts - overThree;

        double sum = inOfferProducts /3 + overThree*normalPrice;
        sum = RoundTo2DecimalPlace.roundTo2DecimalPlace(sum);

        productsPriceSum.productsPriceSum(sum);

//      System.out.println("Kwota: " + sum + " zł");

    }
}
