package benav4;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

public class BeNaV4 {

    public static void main(String[] args) {
        //playWithShapes();
        sortShapes();
    }

    public static void playWithShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0);

        Disk d1 = new Disk("MÁ", "PINK", "MAGENTA", "<3", 6.0);
        Shape d2 = new Disk("MÁ", "MAGENTA", "PINK", ":x", 6.0);

        r1.paint(); //của ai??? Con, chạy của Con
        r2.paint(); //của ai??? Cha, chạy của Con, Con qua mặt @Override
        d1.paint(); //của ai??? Con, chạy của Con
        d2.paint(); //của ai??? Cha, chạy của Con, Con qua mặt @Override
        //Cha éo có code, ko lo, vì Con qua mặt
        //Chơi trò Khai Con new Con
        //              Cha new Con
        //KO LO LẮNG CHA KO HOÀN HẢO, CON CÂN HẾT
        //PAINT() Ở TRÊN CHÍNH LÀ HIỆN TƯỢNG ĐA HÌNH - POLYMORPHISM

        //KHAI CHA NEW CHA, CHUYỆN MỚI HOÀN TOÀN (LEVEL 3)            
    }

    public static void sortShapes() {
        //sắp xếp các hình giống bé Na
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0);
        //Shape hết okie

        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 8.0);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9.0);
        //Square x = (Square) s3;
        ((Square)s3).sayHi();
        //Shape hết okie, IS A

        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 6.0);
        Shape d2 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", ":x", 6.0);
        //Shape hết cx okie

        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3, 4, 5);
        Shape t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6, 8, 10);
        //Shape hết okie luôn
        //in hoy
        //paint() của ai, chạy thế nào
        r1.paint(); //Con, new Con, chạy Con Rect
        r2.paint(); //paint() của Shape, chạy của Rect, qua mặt Shape
        s1.paint(); //paint() của Square, chạy của Square
        s2.paint(); //paint() của Rect, chạy của Square, qua mặt Rect
        s3.paint(); //paint() của Shape, chạy của Square, qua mặt Shape
        d1.paint();
        d2.paint();
        t1.paint();
        t2.paint();
        //chấp Cha, Ông Nội thế nào, luôn luôn chạy paint() đúng ngữ cảnh

        //tui sắp xếp luôn
//        Shape[] arr = new Shape[9];
//        //Có 9 biến Shape arr[0], arr[1], arr[2]...
//        //mới có 9 con trỏ, chưa có object nào
//        //arr[0] arr[1] arr[i] cần lắm luôn bằng, trỏ, tọa độ của vùng 
//        //new Rectangle()   new Disk()  new Triangle()  new Con mẹ nào đó mà 
//        //là một Shape, IS A Shape, cùng họ, cùng kiểu mới chung mảng
//        //cần tọa độ new nào đó thả vào arr[i]
//        arr[0] = new Rectangle(...);
//        arr[1] = new Disk(...);
//        arr[2] = new Triangle(...);
//        arr[3] = r1; //2 chàng trỏ 1 nàng
//        arr[4] = r1;
//        arr[5] = arr[0];
        //ĐÃ HỌC RỒI, ÉO THÈM LÀM
        //Shape arr[] = new Shape[] { new Rectangle(), new Disk(), , , ,}; //value được gán
        //                          vùng new được gán vào
        //                            arr[0]          arr[1]
    
        Shape arr[] = new Shape[] {r1, r2, s1, s2, s3, d1, d2, t1, t2};
        //                      arr[0]
        System.out.println("The list of Shapes");
        for (Shape x : arr) {
            //x = arr[0]  arr[1]    arr[2]  arr[i]
            x.paint();
        }   //GỌI ÔNG NỘI, ABSTRACT ĐÓ NHEN, NHƯNG KO SỢ
            //VÌ TÙY CON LÀ AI, THÌ @Override
            //GỌI ÔNG NỘI, NHƯNG CON CHÁU QUA MẶT TÙY TÌNH HUỐNG
            //HIỆN TƯỢNG TỪ 1 HÀM PAINT() NHƯNG CÓ N CÁCH VIẾT CODE KHÁC NHAU
            //Ở MỨC CON CHÁU, CÓ N CÁCH CHẠY KHÁC NHAU LÚC RUN-TIME
            //TỪ 1 HÀM PAINT() MÀ CÓ ĐẾN RẤT NHIỀU CÁCH CÀI ĐẶT/THỰC THI
            //TỪ 1 BIẾN HÌNH, ĐA HÌNH DẠNG, ĐA CÁCH THỨC, ĐA NHÂN CÁCH, 50 SẮC THÁI
            //BIẾN HÓA KHÔN LƯỜNG, TRANSFORMER,
            //TỪ 1 BIẾN HÓA RA NHIỀU QUA HÌNH DẠNG @Override
            //HIỆN TƯỢNG NÀY, KĨ THUẬT NÀY GỌI LÀ TÍNH ĐA ÁNH XẠ, ĐA HÌNH DẠNG, 
            //ĐA SẮC THÁI, POLYMORPHISM
            //1 HÀM CHA (TỔ) CÓ N HÀM CON @Override, HIỆN TƯỢNG ĐA HÌNH DẠNG
            
            //CHA LÊN TIẾNG PAINT() ĐÁM CON HƯỞNG ỨNG LIỀN
            //ĐẠI CA LÊN TIẾNG, ĐÀN EM XÁCH MÃ TẤU, HÀNG
            
            //CÂU BÁC HỒ: AI CÓ SÚNG DÙNG SÚNG...
            //                          ĐA DẠNG CÁCH THỨC GIẾT GIẶC CỦA NHÂN DÂN
            //HIỆN TƯỢNG ĐA HÌNH, VIỆC GIẾT GIẶC RẤT ĐA DẠNG, NHƯNG GỌI CHUNG LÀ GIẾT GIẶC
            
            //OOP: ABSTRACTION, ENCAPSULATION, INHERITANCE, POLYMORPHISM
            //                      X               X           X       
            
            for (int i = 0; i < arr.length - 1; i++) 
                for (int j = i + 1; j < arr.length; j++) 
                    if (arr[i].getArea() > arr[j].getArea()) {
                        Shape t = arr[i];   //đa hình tiếp nè, gọi hàm Cha, ko có code
                        arr[i] = arr[j];    //chạy hàm Con nè, qua mặt Cha tính S()
                        arr[j] = t;
                    }
            
            System.out.println("The list after sorting ascending by area");
            for (Shape x : arr) {
                x.paint();
            }
                
        
    }

}


