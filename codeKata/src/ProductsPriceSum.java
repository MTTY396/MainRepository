public class ProductsPriceSum {
    static double priceSum;
    public void productsPriceSum(double productPrice){
        this.priceSum += productPrice;
    }
    public static double setPriceSum(){
        priceSum = RoundTo2DecimalPlace.roundTo2DecimalPlace(priceSum);
        return priceSum;
    }
    public static void displayPriceSum(){
        System.out.println("Całą kwota wynosi:" + priceSum +" zł");
    }
}
