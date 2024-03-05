
package amazingrace;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;

public class AmazingRace {

    public static void main(String[] args) {
        register();
    }
    
    public static void register() {
        Cat tom = new Cat("TOM", 1950, 10.5, "><");
        tom.showRecord();
        
        Pet kitty = new Cat("KITTY", 1990, 5.0, "><");
        kitty.showRecord();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2021, 50.0);
        Pet beTo = new Dog("BÊ-TÔ", 2012, 5.0);
        ngaoDa.showRecord();
        beTo.showRecord();
        
        Hamster Jerry = new Hamster("JERRY", 1950, 0.5);
        Jerry.showRecord();
        
        //run() đa hình rồi các con ơi
        //if ([i].run() > [j].run()) KHÓ VÌ MÓA, MỖI LẦN GỌI RUN() THẰNG I, J
        //LÀ KHÁC NHAU
        //BÀI KIA LÀ DIỆN TÍCH ĐIỂM TRUNG BÌNH CỐ ĐỊNH LÚC SORT, 2 FOR KO ĐỔI DIỆN TÍCH, ĐIỂM
        //BÀI NÀY CỨ GỌI TOM.RUN() TÊN CỐ ĐỊNH, NĂM SINH CỐ ĐỊNH
        //RUN() ÉO CỐ ĐỊNH
    }
    
}
