package de.softknk.icecream.decorator;

import de.softknk.icecream.IceCream;

public class Sprinkles extends ExtrasDecorator {

    public Sprinkles(IceCream wrapperIceCream) {
        super(wrapperIceCream);
    }

    @Override
    public float computeTotal() {
        return super.computeTotal() + getExtraPrice();
    }

    @Override
    protected float getExtraPrice() {
        return 0.1f;
    }

}