package com.company;

import com.company.hands.SamsungHand;
import com.company.hands.SonyHand;
import com.company.hands.ToshibaHand;
import com.company.heads.SamsungHead;
import com.company.heads.SonyHead;
import com.company.heads.ToshibaHead;
import com.company.legs.SamsungLeg;
import com.company.legs.SonyLeg;
import com.company.legs.ToshibaLeg;

public class Main {

    public static void main(String[] args) {
        SamsungHand samsungHand = new SamsungHand(100);
        SonyHand sonyHand = new SonyHand(110);
        ToshibaHand toshibaHand = new ToshibaHand(95);
        SamsungHead samsungHead = new SamsungHead(120);
        SonyHead sonyHead = new SonyHead(88);
        ToshibaHead toshibaHead = new ToshibaHead(50);
        SamsungLeg samsungLeg = new SamsungLeg(110);
        SonyLeg sonyLeg = new SonyLeg(90);
        ToshibaLeg toshibaLeg = new ToshibaLeg(78);

        Robot robot1 = new Robot("первый",samsungHead, toshibaHand, sonyLeg);
        Robot robot2 = new Robot("второй", sonyHead, sonyHand, toshibaLeg);
        Robot robot3 = new Robot("третий",toshibaHead, toshibaHand, samsungLeg);

        robot1.action();
        System.out.println();
        robot2.action();
        System.out.println();
        robot3.action();
        System.out.println();
        Robot.dearestComputer(robot1,robot2,robot3);




    }
}
