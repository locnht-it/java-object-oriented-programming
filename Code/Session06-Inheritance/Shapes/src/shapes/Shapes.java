
package shapes;

import data.*;  //.* tức là import hết tất cả các Khuôn trong ngăn tủ đó



public class Shapes {

    
    public static void main(String[] args) {
        //sortShapes();
        //playWithAnonymousClass();
        sortShapesWithAnonymous();
        
    }
    
    public static void sortShapes() {
        //sort cần mảng, mảng chỉ chơi cùng kiểu
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0);
        
        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 8.0);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9.0);
        
        Disk d1 = new Disk("BÉ NA", "RAINBOW", "RAINBOW", 2.0);
        Disk d2 = new Disk("GHỆ BÉ NA", "RAINBOW", "RAINBOW", 1.0);
        
//        Shape arr[] = new Shape[7];
//        //arr[0] = new 1 Hình cụ thể nào đó, new Rectangle(...), new Disk(...)
//        //cần lắm luôn [i] lưu tọa độ vùng new()
//        //[i] tham chiếu vùng new, trỏ vùng new, lưu địa chỉ vùng new()
//        //vùng new() nằm đâu trong HEAP kệ nó
//        arr[0] = r1; //2 chàng 1 nàng
//        arr[0].paint();    
//        arr[1] = arr[0];    //3 chàng 1 nàng
//        arr[2] = d2;        //tao cần tọa độ vùng new Hình nào đó()
        //Shape arr[] = new Shape[] {các tọa độ vùng new() đưa vô};
        //                      [i] =
        
        Shape arr[] = new Shape[] {r1, r2, s1, s2, s3, d1, d2};
        //                      arr[0]
        
//        Shape arr1[] = new Shape[] {new Disk("BÉ NA", "RAINBOW", "RAINBOW", 2.0),
//                                    new Disk("GHỆ BÉ NA", "RAINBOW", "RAINBOW", 1.0)};
        
        System.out.println("The list of shapes");
        for (Shape x : arr) {
            //x = arr[0], x = arr[1], x = arr[2]
            x.paint();  //tính đa hình
        }   //GỌI HÀM PAINT() CỦA CHA, NHƯNG 3 ĐỨA CON TỰ ĐỘNG QUA MẶT
            //CHÚT LO LẮNG: PAINT() CỦA CHA KO CÓ CODE, ABSTRACT
            //ĐỪNG LO, VÌ LÁT HỒI MẤY CON TỰ LO, DO MÌNH NEW CON KO HÀ
            //NEW CON, CON ĐÃ VIẾT CODE RỒI, CHA NGỒI IM CON LO CHO
            //CON SẼ GIẢI QUYẾT CHUYỆN HOÀN HẢO CHO CHA,
            //TỪ HÀM CHA GỌI, CON HƯỞNG ỨNG, N CON HƯỞNG ỨNG
            //TỪ 1 ÁNH XẠ RA NHIỀU CÁCH THỨC, TÍNH ĐA XẠ ĐA HÌNH POLYMORPHISM - LÀM GIÙM TUI CÁI
        
        //sắp xếp tăng dần theo S
        for (int i = 0; i < arr.length - 1; i++) 
            for (int j = i + 1; j < arr.length; j++) 
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shape tmp = arr[i]; //đa hình nè: getArea() của Cha
                    arr[i] = arr[j];    //abstract, đừng lo, Con sẽ lo
                    arr[j] = tmp;       //vì [i] luôn trỏ 1 hình cụ thể
                }                        //      getArea() là cụ thể Con
                
            //tao arr[i] đang trỏ 1 hình có S là ?
            //tao arr[j] đang trỏ 2 hình có S là ?
            //so sánh 2 S có ổn ko, ko ổn thì đổi việc trỏ
            //thằng arr[i] phải trỏ vào thằng hình mà arr[j] đang trỏ
            //mày trỏ vào S mà ko đúng thứ tự, thì phải đổi trỏ
        
        
        System.out.println("The list of shapes sorting ascending by area");
        for (Shape x : arr) {
            x.paint();
        }
            
        
    }
    
    //kĩ thuật tạo object/vùng new mà ko cần Khuôn cụ thể
    //dành cho những object vô định hình, ko có công thức để tính toán và nhân bản,
    //ko có Khuôn cố định, cắt hình ngẫu nhiên, KO BIẾT NHÓM CON
    //NHƯNG VẪN CHẮC CHẮN LÀ HÌNH, CÓ NÉT, MÀU, CẠNH, BỀ MẶT
    //KO CÓ CÔNG THỨC TÍNH CHUNG, NHÂN BẢN LẠI ĐƯỢC NHANH CHÓNG
    //HCN CẮT NHANH CHÓNG, HÌNH ELIP NHANH, HBH NHANH,
    //HÌNH CẮT GẤP KHÚC, MỖI HÌNH DUY NHẤT, KO NHANH ĐƯỢC, KO CÓ KHUÔN
    //OBJECT VÃNG LAI, KO THƯỜNG QUEN SỬ DỤNG/LÀM/GẶP
    //DÙ LÀ HÌNH KIỂU GÌ, CÔNG THỨC CHUNG: NEW CHA/SUPER CHA + @Override
    public static void playWithAnonymousClass() {
       
        //Shape vangLai = new NoName(...);    //bên trong phải full code cho Cha
        //Shape x = new HCN(...);             //bên trong phải full code cho Cha
        //CẮT NGẪU NHIÊN LÀM SAO BIẾT BAO NHIÊU CẠNH MÀ ĐƯA VÀO???
        //CHỈ ĐƯA ĐƯỢC MÀU, TẶNG AI, TÔ MÀU VÀ TỰ ĐO S, P LÀ ỔN, KO CÓ CÔNG THỨC
        //NẾU MUỐN RÕ RÀNG THÌ CẮT V, TR, CN, TG, HBH, MŨI TÊN
        Shape vangLai = new Shape("CHÍNH MÌNH", "GREEN", "BLUE") {
            @Override
            public double getArea() {
                return 50;  //vì hình cụ thể, ko theo hình dạng nào, ta tự đo
            }
            
            @Override
            public double getPerimeter() {
               return 40;
            }
            
            @Override
            public void paint() {
               //Khai báo là Con của Shape vẫn kế thừa như bình thường
                System.out.printf("|NGẪU NHIÊN|%-10s|%-10s|%-10s|%4.1f|\n", owner, color, borderColor, getArea());
            }
        };   //.paint();  //VIP
        
        //mày là 1 hình, thoải mái vào mảng Shape sort nếu muốn
        //mày vẫn là Shape, kiểu Shape, có đủ code cho hàm Cha
        //kĩ thuật mượn gió bẻ măng, mượn Cha tạo Con, mượn Shape new Con
        //NEW ABSTRACT CLASS SẼ BUNG RỘNG MÀN HÌNH GÕ CODE OVERRIDE
        //THỎA CÔNG THỨC CON - NEW CHA + @Override
        //CHỈ XÀI CÁCH NÀY NẾU CHỈ CẦN LÀM 1 OBJECT ON THE GO, MÀ LÀM BIẾNG 
        //LÀM KHUÔN CON RIÊNG LẺ, THEO CÔNG THỨC NHÂN BẢN
        
        vangLai.paint();
    }
    
    public static void sortShapesWithAnonymous() {
        
        //Anonymous here!!!
        Shape onTheGo = new Shape("THIS-TUI", "RANDOM", "RANDOM") {
            @Override
            public double getArea() {
                //cắt hình ngẫu nhiên, ko gọi được là hình gì, S phải tự đo
                return 50;
            }
            
            @Override
            public double getPerimeter() {
               return 40;
            }
            
            @Override
            public void paint() {
                System.out.printf("|%-10s|%-10s|%-10s|%-10s| -- | -- |%7.2f|\n", "TAKE-AWAY", owner, color, borderColor, getArea());
            }
        };  //VIP
        
        
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0);
        
        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 8.0);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9.0);
        
        Disk d1 = new Disk("BÉ NA", "RAINBOW", "RAINBOW", 2.0);
        Disk d2 = new Disk("GHỆ BÉ NA", "RAINBOW", "RAINBOW", 1.0);
        
        Shape arr[] = new Shape[] {r1, r2, s1, s2, s3, d1, d2, onTheGo};
                                                              //hình ngẫu nhiên vẫn là hình  
        System.out.println("The list of shapes");
        for (Shape x : arr) {
            x.paint();  //tính đa hình
        }   
        
        
        for (int i = 0; i < arr.length - 1; i++) 
            for (int j = i + 1; j < arr.length; j++) 
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shape tmp = arr[i]; //đa hình nè: getArea() của Cha
                    arr[i] = arr[j];    //abstract, đừng lo, Con sẽ lo
                    arr[j] = tmp;       //vì [i] luôn trỏ 1 hình cụ thể
                }                        //      getArea() là cụ thể Con
                
            
        
        
        System.out.println("The list of shapes sorting ascending by area");
        for (Shape x : arr) {
            x.paint();
        }
            
        
    }
    
}
