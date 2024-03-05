
package data;

import java.util.Random;


//Chơi thêm kế thừa, Motor is a kind of Vehicle (abstract class)

//MOTOR MUA VỀ CHẠY ĐI HỌC, CHUYỆN BÌNH THƯỜNG, HÀM RUN()
//NHƯNG TRÊN ĐƯỜNG THẰNG VỚ VẨN NÀO ĐÓ NẸT-PÔ, MÌNH KÉO TAY GA MẠNH HƠN
//BỐC ĐẦU, VỌT XE, TỐC ĐỘ PHẢI DỮ HƠN BÌNH THƯỜNG, LÚC NÀY NGOÀI VIỆC MOTOR
//THÔNG THƯỜNG, TA CÒN LÀ ĐUA-THỦ NỮA, PHẢI LÀ ĐUA THỦ MỚI CÓ TỐC ĐỘ CAO
//GIA NHẬP HỘI ĐUA THOI, CHỈ ĐUA THOI
//TỚ CÒN LÀ 1 ĐUA-THỦ, KO DÙNG TỪ KHÓA EXTENDS, XÀI TỪ LÀ 1 MEMBER CỦA
//                                                      IMPLEMENTS
//                                             TỞ THAM GIA CLB, TRIÊN KHAI VIỆC ĐUA
//THAM GIA CLB NÀO THÌ PHẢI CÓ HÀNH ĐỘNG CỦA CLB ĐÓ
//IMPLEMENTS ALL ABSTRACT METHODS BÊN CLB, CHỌN ĐI ĐUA MÀ KO CHỊU ĐUA SAO ĐƯỢC
//@Override
//CLASS CHÍNH CỦA CHÚNG TA CỨ CÓ ĐẶC ĐIỂM/HÀNH VI NHƯ BÌNH THƯỜNG
//CHÚNG TA THAM GIA CLB NÀO THÌ CÓ THÊM HÀNH ĐỘNG CỦA CLB ĐÓ, @Override HÀNH ĐỘNG ĐÓ
//TRONG TA CÓ NHIỀU HÀNH ĐỘNG ỨNG VỚI TỪNG CLB TA THAM GIA, HỢP LÍ NGOÀI ĐỜI
//ĐI VỚI BỤT MẶC ÁO CÀ SA, ĐI VỚI MA MẶC ÁO GIẤY
//VỀ LOGIC, TA CÓ THỂ THAM GIA N CLB, NHƯNG TA CHỈ CÓ 1 DÒNG HỌ
//TRONG JAVA, 1 CON TỐI ĐA 1 CHA, CON KẾ THỪA
//            1 CON THAM GIA N CLB, VẬY SẼ CÓ HÀNH ĐỘNG CỦA N CLB

//C++, 1 CON NHIỀU CHA LUÔN, ĐA KẾ THỪA!!!

public class Motor implements DeathRacer{
    public static final double MAX_SPEED = 180;
    
    private String model;   //Exciter 2021, Winner 2020
    private String volume;  //số phân khối 125.0cm3
    private String vin;     //biển số, số khung, Vehicle Identifier Number

    public Motor(String model, String volume, String vin) {
        this.model = model;
        this.volume = volume;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Motor{" + "model=" + model + ", volume=" + volume + ", vin=" + vin + '}';
    }
    
    //Hành vi xe máy là chạy, có tốc độ được ghi nhận
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
                    //chạy ngẫu nhiên và ko quá 180km/h
    }
    
    //quay video và gáy tốc độ
    public void showRecord() {
        System.out.printf("|%-10s|%-15s|%-8s|%11s|%5.1f|\n", "MOTOR", model, volume, vin, run());
                                                                                   //150.0cm3   //58F-567.89    //180.0     
    }

    @Override
    public double runToDeath() {
        //chạy tốc độ cao hoy, đôn nòng, xoáy nòng, ép dên, đôn dên
        return run() * 3; //run() giả sử được 150 * 3 đua đến chết còn gì!
    }

    @Override
    public void showHowToDeath() {
        System.out.printf("|%-20s|%-15s|%-8s|%11s|%5.1f|\n", "MOTOR-RACER", model, volume, vin, runToDeath());
    }
    
}
