package de.softknk.icecream;

public class ConeIceCream extends IceCream {

    private static final float conePrice = 0.2f;

    public ConeIceCream(int numOfScoops) {
        this.numOfScoops = numOfScoops;
    }

    @Override
    public float computeTotal() {
        return (numOfScoops * pricePerScoop) + conePrice;
    }
}