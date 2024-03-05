package data;

import java.util.Random;

public class Hamster extends Pet {

    public static final double MAX_SPEED = 10;
    private int count = 0;

    public Hamster(String name, int yob, double weight) {
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
        //return new Random().nextDouble() * MAX_SPEED;
        count++;
        Random rd = new Random();
        double recordSpeed = rd.nextDouble() * MAX_SPEED;
        if (count == 1) 
            setRecordFirstSpeed(recordSpeed);
        
        return recordSpeed;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", "HAMSTER", name, yob, weight, run());
    }

}
