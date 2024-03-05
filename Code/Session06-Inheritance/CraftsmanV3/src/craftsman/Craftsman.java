
package craftsman;

import data.Disk;
import data.Rectangle;
import data.RightTriangle;
import data.Square;
import data.Triangle;

public class Craftsman {

    public static void main(String[] args) {
        //cutShapes();
        //sortShapes();
        //playWithSquare();
        playWithTriangle();
    }
    
    public static void cutShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", 1.0, 2.0);
        r1.paint();
        
        Square s1 = new Square("MÁ", "PINK", 3.0);
        s1.paint();
        
        Disk d1 = new Disk("MÁ", "PINK", "<3", 2.0);
        d1.paint();               
    }
    
    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", 1.0, 2.0);
        
        Rectangle rectArr[] = new Rectangle[9];
        //có 9 biến, bàn có 9 chỗ ngồi, nhưng chưa có ai ghé/chưa có object cụ thể
        //rectArr[0], [i] là những biến Rectangle, con trỏ
        //                = trỏ vào vùng new Rectangle(), tọa độ vùng new clone
        //                  chỉ cần có vùng new Rect() là được
        rectArr[0] = r1;    //2 chàng 1 nàng
        
//        rectArr[0].paint(); //TÍA
//        
//        rectArr[0].setOwner("TÍA YÊU");
//        r1.paint();

        rectArr[1] = new Rectangle("MÁ", "PINK", 2.0, 3.0);
        rectArr[2] = new Rectangle("BÉ NA", "RAINBOW", 2.0, 2.0);
        
        rectArr[3] = new Square("GHỆ BÉ NA", "RAINBOW", 1.0);
        
        //Mảng là kĩ thuật khai báo các biến cùng kiểu, mà Vuông, HCN khác kiểu, ko cửa nào vào 
        //chung 1 mảng, Vuông chơi mảng Vuông, HCN chơi mảng HCN, Tròn chơi mảng Tròn
        //về lí thuyết: chỉ sort HCN, Vuông, Tròn riêng, ko sort chung được
        //vì khác data type, ko chung mảng, ko for chung được
        
//        ??? arr[] = new ???[9];
//        arr[0] = new Square(...);
//        arr[1] = new Rectangle(...);
        //dư sức for ???
        //Vuông, HCN chung mảng của ai???
        
        System.out.println("Before sorting");
//        for (Rectangle x : rectArr) {
//            //x = rectArr[i] 0..length
//            x.paint();
//        } //null pointer, for đến count thoi

        for (int i = 0; i < 3; i++) 
            rectArr[i].paint();
                
        System.out.println("After sorting ascending by area");
        for (int i = 0; i < 3 - 1; i++) 
            for (int j = i + 1; j < 3; j++) 
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle t = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = t;
                }
        
        for (int i = 0; i < 3; i++) 
            rectArr[i].paint();
        
    }
    
    public static void playWithSquare() {
        Square s1 = new Square("TÍA", "PINK", 6.0);
        //HV là HV, còn là HCN ngầm hiểu
        s1.paint();
        
        //vi diệu tập 1
        Rectangle r1 = new Rectangle("MÁ", "PINK", 7.0, 8.0);
        //HCN là HCN
        r1.paint();
        
        //vi diệu tập 2
        Rectangle s2 = new Square("BÉ NA", "RAINBOW", 10.0);
        //HV là HCN, hùa theo kế thừa dòng họ
        s2.paint(); //CON QUA MẶT CHA, ĐA HÌNH XUẤT HIỆN
        //HÀM PAINT() CỦA CHA, XEM LÚC CHẠY COI - LẤY HÀM PAINT() CỦA CON!!!
        
    }   //in ra HCN, 6 6 36 hoàn toàn đúng do xài ké Cha
        //phải theo quy tắc Cha đặt ra, tao in HCN, xài ké thì là HCN
        //mượn xe của Ba thì phải theo lời Ba dặn
    
    public static void playWithTriangle() {
        
        //Cha new Cha (cụ thể - concrete class) //abstract class
        //gọi đúng chuẩn tên: TG là TG
        Triangle t1 = new Triangle("TÍA", "PINK", 3, 4, 5);
        t1.paint(); //của Cha
        
        //Con new Con, gọi tên object đúng là nó, TGV là TGV
        RightTriangle rt1 = new RightTriangle("MÁ", "PINK", 6, 8);
        rt1.paint();    //của Con
        
        //Khai Cha new Con, đọc kiểu IS A, dùng 2 danh nghĩa, Con, phiên bản Cha
        Triangle rt2 = new RightTriangle("BÉ NA", "RAINBOW", 6, 8);
        //        TG <- một là TGV, nó vẫn Vuông như câu lệnh ngay trên
        rt2.paint();    //của Cha,
                        //LÚC CHẠY THÌ HÀNH XỬ NHƯ CON, NẾU CON TRÙNG TÊN HÀM CHA
                        //CHA NGỒI IM ĐỂ CON LO, OVERRIDE - QUA MẶT CHA
        
        //KHAI BÁO GÌ THÌ HÀNH XỬ NHƯ THẾ, VÌ MÌNH SẼ ĐẶT TÊN CHO OBJECT KÈM DATA TYPE.
        //OBJECT SẼ THUỘC NHÓM GÌ/KHUÔN, THEO KHUÔN NHÌN HÀNH XỬ/NHÌN HÀM.
                
    }
    
}
