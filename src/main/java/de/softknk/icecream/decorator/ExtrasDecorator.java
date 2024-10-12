package de.softknk.icecream.decorator;

import de.softknk.icecream.IceCream;

public abstract class ExtrasDecorator extends IceCream {

    private IceCream wrapperIceCream;

    protected ExtrasDecorator(IceCream wrapperIceCream) {
        this.wrapperIceCream = wrapperIceCream;
    }

    @Override
    public float computeTotal() {
        return wrapperIceCream.computeTotal();
    }

    protected abstract float getExtraPrice();

}