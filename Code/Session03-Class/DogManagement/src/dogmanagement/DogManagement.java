
package dogmanagement;

import data.Dog;
//Đi mượn cái Khuôn Dog ở ngăn data về đúc.
//~ #include<stdio.h> bên C

public class DogManagement {

    public static void main(String[] args) {
        int        yob          =         2021;
  //data type   tên gọi/biến            value, single, primitive
        Dog         chiHu           = new Dog("CHI HU HU", 2021, 0.5);
  //data type    tên biến object        phức tạp, object      

        //   chiPu   (name: Nguyen Thuy Chi, yob: 1993, hits: Anh ơi anh ở lại)
        
        //có bao nhiêu data type: 2
        
        chiHu.bark();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);     
        ngaoDa.bark();
        
        //Kiểm tra coi khi đổ vào Khuôn, đứa sau có đè đứa trước hay ko?
        System.out.println("CHI HU HU barks again.");
        chiHu.bark();
        
        //Một biến tại 1 thời điểm chỉ lưu 1 value.
        int x = 68;
        System.out.println("x: " + x);
        x = 79;
        System.out.println("x again: " + x);
        
        //Ăn nhiều thì mập ú
        chiHu.updateWeight(5.0);
        System.out.println("After online courses");
        chiHu.bark();
        ngaoDa.bark();
        
        int chiHuYob = chiHu.getYob();
        System.out.println("Chi Hu Yob: " + chiHuYob);
        System.out.println("ND Yob: " + ngaoDa.getYob());
    }
    
}
