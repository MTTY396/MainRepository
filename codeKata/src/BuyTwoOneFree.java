import java.util.Scanner;

public class BuyTwoOneFree {
    public static void buyTwoOneFree(){
        ProductsPriceSum productsPriceSum = new ProductsPriceSum();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość produktów: ");
        double numberOfProducts = scanner.nextInt();

        System.out.println("Podaj cenę produktu: ");
        double normalPrice = scanner.nextFloat();

        double overThree = numberOfProducts % 3;
        double inOfferProducts = numberOfProducts - overThree;
        double freeProducts = inOfferProducts/3;
        double productsToPaid = inOfferProducts - freeProducts;

        double sum = productsToPaid*normalPrice + overThree*normalPrice;
        sum = RoundTo2DecimalPlace.roundTo2DecimalPlace(sum);

        productsPriceSum.productsPriceSum(sum);
    }
}
