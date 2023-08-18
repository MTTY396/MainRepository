import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;
            while (shouldContinue) {
                System.out.println("Wybierz typ promocji:");
                System.out.println("1. Bez promocji");
                System.out.println("2. 3 za 1 zł");
                System.out.println("3. Produkt na wagę");
                System.out.println("4. Kup 2 to 1 dostaniesz za darmo");
                System.out.println("5. Produkt minus 50%, jeśli kwota zakupów przekroczy 40 zł");
                System.out.println("6. Zakończ");

                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1 -> NoSpecialOffer.noSpecialOffer();
                    case 2 -> ThreeForADollar.threeForADollar();
                    case 3 -> WeightProduct.weightProduct();
                    case 4 -> BuyTwoOneFree.buyTwoOneFree();
                    case 5 -> MinusPriceIfOverFourty.minusPriceIfOverFourty();
                    case 6 -> {
                        ProductsPriceSum.displayPriceSum();
                        shouldContinue = false;
                    }
                }
            }
    }




    }
