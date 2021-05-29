package solid.lsp;

public class DiscountBag extends Bag {
    private double discountedRate = 0;

    public void setDiscounted(double discountedRate) {
        this.discountedRate = discountedRate;
    }

    public void applyDiscount(int price) {
        super.setPrice(price - (int)(discountedRate * price));
    }
}
