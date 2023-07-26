public class ProductCatalogue {
    public static void main(String[] args) {

        productCatalogue(30,500,30,0.1F, 0.1F, 0.05F, 0.05F);

    }

    static void productCatalogue(int duration, int tariff, int divider, float... adjustments) {
        int basicTariff = duration / divider * tariff;
        float result = basicTariff;
        for (var adjustment : adjustments) {
            result = result + (result * adjustment);
        }
        System.out.println(result);
    }

}
