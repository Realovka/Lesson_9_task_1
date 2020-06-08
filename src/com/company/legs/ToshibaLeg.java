package com.company.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Шаг делает нога Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
