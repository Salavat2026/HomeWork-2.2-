package org.skypro.skyshop;

public class DiscountedProduct extends Product {
    private final double basePrice; // базовая цена
    private final int discountedPercent;// скидка в целых процентах

    public DiscountedProduct(String name, double basePrice, int discountedPercent) {
        super(name);
        this.basePrice = basePrice;
        this.discountedPercent = discountedPercent;
    }

    @Override
    public double getPrice (){
        return basePrice * (100-discountedPercent)/100.0;
    }

    public int getDiscountedPercent(){
        return discountedPercent;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return "<" + getName() + ">: <" + getPrice() + ">  (<" + getDiscountedPercent() + ">%)";
    }


}
