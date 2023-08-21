public class Test {

    public void test(){
        Products products = new Products();

        products.checkBuyTwoOneFree(3, 0.55);
        products.checkBuyTwoOneFree(4, 1.66);
        products.checkBuyTwoOneFree(5, 0.9);
//        System.out.println(products.checkBuyTwoOneFree(4, 0.76));

        products.checkThreeForADollar(3, 0.4);
        products.checkThreeForADollar(4, 0.45);
        products.checkThreeForADollar(5, 0.48);
//        System.out.println(products.checkThreeForADollar(8, 0.45));


        }
    }

