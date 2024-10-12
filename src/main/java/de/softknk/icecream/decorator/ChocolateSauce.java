package de.softknk.icecream.decorator;

import de.softknk.icecream.IceCream;

public class ChocolateSauce extends ExtrasDecorator {

    public ChocolateSauce(IceCream wrapperIceCream) {
        super(wrapperIceCream);
    }

    @Override
    public float computeTotal() {
        return super.computeTotal() + getExtraPrice();
    }

    @Override
    protected float getExtraPrice() {
        return 0.3f;
    }

}