package de.softknk.icecream;

public class CupIceCream extends IceCream {

    public CupIceCream(int numOfScoops) {
        this.numOfScoops = numOfScoops;
    }

    @Override
    public float computeTotal() {
        return numOfScoops * pricePerScoop;
    }
}