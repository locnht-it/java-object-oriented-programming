
package data;

import java.util.Random;

//DOg ngoan ngoãn ban ngày, tối chủ đi ngủ, nó trốn nhà đi hoang
//đi đua thì nó phải chạy vượt tốc độ bình thường, runTODead() như mọi đua thủ
//Mình vẫn là Con Cháu dòng họ Lê, Phạm, học như bình thường SinhVien,
//nhưng còn tham gia CLB Đua Thủ, Phượt, CLB gì đó, thì phải có hành động của clb đó
//IMPLEMENT ALL ABSTRACT METHODS, NỘI QUY CLB, @Override
public class Dog extends Pet implements DeathRacer{
    public static final double MAX_SPEED  = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }
    
    @Override 
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }
    
    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", "DOG", name, yob, weight, run());
    }
    
    //PHẦN HOANG DÃ TRONG TA, BỘC LỘ KHI ĐI ĐUA
    //TỤI MÀY, SV, NGOAN NGOÃN Ở NHÀ GIÃN CÁCH
    //VÀO SÀI GÒN, CHẮC CHẮN THÊM PHẦN BỘC LỘ KHÁC: NHẬU NHẸT, GAME, CÁ ĐỘ, ĐÁNH BÀI, ...
    //                                              CLB TIẾNG ANH, PHƯỢT, TỪ THIỆN, CẦU LÔNG
    
    @Override
    public double runToDeath() {
        return run() * 5;   //chạy hơn 5 lần so bình thường
    }

    @Override
    public void showHowToDeath() {
        System.out.printf("|%-20s|%-15s|%4d|%4.1f|%4.1f|\n", "DOG-RACER", name, yob, weight, runToDeath());
    }
}
