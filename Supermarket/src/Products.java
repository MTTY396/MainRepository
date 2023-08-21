public class Products {
    public double checkBuyTwoOneFree(double numberOfProducts, double price) {
        double sum = 0;
        if (numberOfProducts % 3 == 0){
            sum = numberOfProducts*2/3 * price;
        }
        else if (numberOfProducts % 3 == 1) {
            double inProm = numberOfProducts - numberOfProducts % 3;
            sum = inProm*2/3 * price + price;
        }
        else if (numberOfProducts % 3 == 2) {
            double inProm = numberOfProducts - numberOfProducts % 3;
            sum = inProm*2/3 * price + 2 * price;
        }

        sum = RoundTo2DecimalPlace.roundTo2DecimalPlace(sum);
        return sum;
    }


    public double checkThreeForADollar(double numberOfProducts, double price) {
        double sum = 0;
        if (numberOfProducts % 3 == 0){
            sum = numberOfProducts / 3 * 1;  // / jest potrzebny jeśli kupujemy np 6
        }
        else if (numberOfProducts % 3 == 1) {
            double numProm = (numberOfProducts - numberOfProducts % 3) / 3;
            sum = numProm * 1 + price;
        }
        else if (numberOfProducts % 3 == 2){
            double numProm = (numberOfProducts - numberOfProducts % 3) / 3;
            sum = numProm * 1 + 2*price;
        }
        return sum;
    }


}
