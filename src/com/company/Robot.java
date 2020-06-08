package com.company;

import com.company.hands.IHand;
import com.company.heads.IHead;
import com.company.legs.ILeg;

public class Robot implements IRobot {
    private String number;
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(String number, IHead head, IHand hand, ILeg leg) {
        this.number = number;
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();
    }

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }


    public static void dearestComputer(Robot a, Robot b, Robot c) {
        System.out.print("Самый дорогой компьютер ");
        int[] array = {a.getPrice(), b.getPrice(), c.getPrice()};
        int max = array[0];
        int place = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                array[i] = max;
                place = i;
            }
        }
        if (place == 0) {
            System.out.println(a.getNumber());
        } else if (place == 1) {
            System.out.println(b.getNumber());
        } else if (place == 2) {
            System.out.println(c.getNumber());
        }
    }


}
