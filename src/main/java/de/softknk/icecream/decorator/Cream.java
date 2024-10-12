package de.softknk.icecream.decorator;

import de.softknk.icecream.IceCream;

public class Cream extends ExtrasDecorator {

    public Cream(IceCream wrapperIceCream) {
        super(wrapperIceCream);
    }

    @Override
    public float computeTotal() {
        return super.computeTotal() + getExtraPrice();
    }

    @Override
    protected float getExtraPrice() {
        return 0.5f;
    }

}