package data;

import java.util.Random;

public class Cat extends Pet {

    public static final double MAX_SPEED = 50;
    private int count = 0;

    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
    }
    
    @Override
    public double getRecordFirstSpeed() {
        return recordFirstSpeed;
    }

    @Override
    public void setRecordFirstSpeed(double recordFirstSpeed) {
        this.recordFirstSpeed = recordFirstSpeed;
    }

    @Override
    public double run() {
//        Random rd = new Random();   //rd nắm tọa độ vùng new
//                                    //trong vùng new có hàm .nextDouble() quan trọng
//        //return rd.nextDouble() * MAX_SPEED;
//        //          (0...1)    * 50 coi như được con số sát 50
//        return new Random().nextDouble() * MAX_SPEED;
//        //      object ko thèm đặt tên, xài vùng new 1 lần bỏ luôn
//        //      CT MTĐT GARBAGE COLLECTOR
        count++;
        Random rd = new Random();
        double recordSpeed = rd.nextDouble() * MAX_SPEED;
        if (count == 1) 
            setRecordFirstSpeed(recordSpeed);
        
        return recordSpeed;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", "CAT", name, yob, weight, run());
    }
}
