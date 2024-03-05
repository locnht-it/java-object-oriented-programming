 package amazingracev3;

import data.*;
import java.util.Random;

public class AmazingRaceV3 {

    public static void main(String[] args) {
        //showRecords();
        showRecordsWithTakeAway();
    }

    public static void showRecords() {
        Hamster xx = new Hamster("NHẮT", 2021, 0.3);

        Pet racer[] = new Pet[]{new Dog("CHIHUHU", 2021, 0.5),
            new Dog("VÀNG ƠI", 1950, 10.0),
            new Cat("TOM", 1960, 15.0),
            new Cat("KITTY", 1990, 5.0),
            new Hamster("JERRY", 1960, 0.5),
            xx
        };

        //racer[0] = new Dog("", 0, 0);
        //phần tử mảng Pet thì phải là gán 1 con Pet nào đó, Cat, Dog, HT
        //gán = new Dog(...); [i] = cần tọa độ vùng new Con Nào Đó()
        //new Dog() ...; bố trí vùng RAM trong HEAP, gọi phễu đổ vào, lấy mốc
        //tọa độ vùng new đưa cho ai đó
        //đa hình quay trở lại
        //vì mảng Pet, mọi việc CHẤM LÀ CỦA CHA, CỦA PET, CHA TOÀN LÀ ABSTRACT
        //HOÀN TOÀN KO ĐÁNG LO, VÌ CON ĐÃ IMPLEMENT
        //CHA QUẤT ROI CHẠY ĐI CHÚNG MÀY, THẾ LÀ 3 ĐỨA CON CHẠY THEO
        //TỐC ĐỘ CỦA RIÊNG CHÚNG, ĐA HÌNH XUẤT HIỆN, @Override QUA MẶT CHA XUẤT HIỆN
        System.out.println("The records table");
        for (Pet x : racer) {
            //x = racer[0], x = racer[i]
            x.showRecord();   
        }
        for (Pet x : racer) {
            System.out.println(x.getName() + ": " + x.getRecordFirstSpeed());
        }

        //TẠI THỜI ĐIỂM VIẾT CODE THẾ NÀY, KO SORT THÀNH TÍCH CHẠY ĐƯỢC
//        for (int i = 0; i < racer.length - 1; i++) 
//            for (int j = i + 1; j < racer.length; j++) 
//                if (racer[i].run() > racer[j].run()) {
//                    //đa hình, hàm Cha nhưng chạy Con tương ứng: HT, D, C, ...
//                    Pet t = racer[i];
//                    racer[i] = racer[j];
//                    racer[j] = t;
//                }   //mỗi lần gọi run() để so sánh thì sẽ có tốc độ khác
//                    //bài SV, Hình Học, S cố định cho n lần gọi
//                    //điểm tb cố định cho đến khi cập nhật điểm mới
//                    //for hoài, getGPA(), getS() cố định nên ta đảo được
//                    //bài AmazingRace bắt tụi nhỏ chạy 1 lượt để ghi nhận thành tích,
//                    //ta so sánh trên thành tích chạy này
        for (int i = 0; i < racer.length - 1f; i++) 
            for (int j = i + 1; j < racer.length; j++) 
                if (racer[i].getRecordFirstSpeed() > racer[j].getRecordFirstSpeed()) {
                    //đa hình, hàm Cha nhưng chạy Con tương ứng: HT, D, C, ...
                    Pet t = racer[i];
                    racer[i] = racer[j];
                    racer[j] = t;
                }
            
        System.out.println("The record table sorting ascending by first record");
        for (Pet x : racer) {
            System.out.println(x.getName() + ": " + x.getRecordFirstSpeed());
        }
    }
    
    public static void showRecordsWithTakeAway() {
        
        //đường đua đông vui, có nhiều racer, và có một con gì đó ko nhìn rõ
        //bay theo, vật gì đó bay theo, tức là có tốc độ
        //mình ko biết, ko xác định được nhóm của nó là gì, chưa biết class gì
        //vì mày muốn nhập hội, okie, chạy theo đi, chơi trò take-away
        //mượn gió bẻ măng, mượn Pet để new Object
        
        Pet ufo = new Pet("UFO", 2021, 0.3) {
            @Override
            public double run() {
                return new Random().nextDouble() * 30;
            }

            @Override
            public void showRecord() {
                System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", "XXX", name, yob, weight, run());
            }
            
        };  //VIP
        
        Hamster xx = new Hamster("NHẮT", 2021, 0.3);

        Pet racer[] = new Pet[]{new Dog("CHIHUHU", 2021, 0.5),
                      new Dog("VÀNG ƠI", 1950, 10.0),
                      new Cat("TOM", 1960, 15.0),
                      new Cat("KITTY", 1990, 5.0),
                      new Hamster("JERRY", 1960, 0.5),
                      xx,
                      ufo
        };
   
        System.out.println("The records table");
        for (Pet x : racer) {
            //x = racer[0], x = racer[i]
            x.showRecord();   
        }
        
    }
    
    
    

}
