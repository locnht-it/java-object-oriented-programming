package data;

import java.util.Random;

public class Dog extends Pet {

    public static final double MAX_SPEED = 40;
    private int count = 0;

    public Dog(String name, int yob, double weight) {
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
//        Random mayNgauNhien = new Random();
//        return mayNgauNhien.nextDouble() * Dog.MAX_SPEED;
//        //return new Random().nextDouble() * MAX_SPEED;
        count++;
        Random rd = new Random();
        double recordSpeed = rd.nextDouble() * MAX_SPEED;
        if (count == 1) 
            setRecordFirstSpeed(recordSpeed);
        
        return recordSpeed;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", "DOG", name, yob, weight, run());
    }
}
