package locnht.main;

import data.Student;

public class Stage {

    public static void main(String[] args) {
        //checkObjectV1();
        //checkObjectV2();
        //checkObjectV3();
        //checkObjectV4();
        //checkObjectV5();
        //checkObjectV6();
        Student x = checkObjectV7();    //x = tọa độ ai đó new, ai đó new đã được return qua tên hàm
        
        x.showProfile();
        x.setName("EM KO ĐỔI NGÀNH");
        x.showProfile();    
        
        //VI DIỆU TRẤN THÀNH
        checkObjectV7().showProfile();
    }

    public static void checkObject() {
        Student s1 = new Student("SE686868", "LỘC PHÁT", 1998, 6.8);
        //  biến object         
        //  biến đối tượng           OBJECT, INSTANCE, HIỆN THÂN, THỂ HIỆN...CỤ THỂ
        //  object variable
        //  reference variable
        //  *con trỏ*
        //1. new là clone vùng RAM từ Khuôn (static if any)
        //2. gọi phễu đổ data vào vùng clone
        //3. chốt lại tọa độ vùng new thảy cho ai đó giữ
        //   thảy cho biến object giữ

        s1.showProfile();

        s1 = new Student("SE666789", "ĐẠI GIA", 2001, 9.9);
        s1.showProfile();

        //mất tọa độ LỘC PHÁT rồi
        //mất tọa độ vùng RAM/object thì điều gì xảy ra
        //Công ti Môi Trường Đô Thị, GARBAGE COLLECTOR, vùng RAM object ko ai trỏ sẽ bị thu hồi, object bị giết
        //HEAP được clear - free(con trỏ bên C) vùng HEAP trả lại cho new object mới
        System.gc();
        //HAI CHÀNG TRỎ/NHÌN 1 NÀNG
        //VỪA SINH RA KHÓC 1 TIẾNG RỒI CHẾT

        //sếp -> CA SĨ SƠN TÙNG
        //sếp -> người quyết định mức lương cho người đi làm thuê
        //tí -> mày ở nhà, tao ở nhà
        //tí -> Trạng Tí
        int a = 10;
        a = 100;    //biến vì mày thay đổi value
        //a bị biến đổi giá trị
        //a được gọi là biến - variable
    }

    //Kiểm tra việc new trùng thông tin xem sao???
    public static void checkObjectV1() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);

        Student s2 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);

        s1.showProfile();
        s2.showProfile();
        //Chứng minh 2 new là 2 object khác nhau, 2 vùng clone khác nhau, dù đổ info giống nhau.
        //ở ngoài đời: vào tiệm sách, tô tượng, chọn 2 tượng "giống nhau", vẫn là 2

        s1.setName("DỖI RỒI, KHÔNG HỌC BÀI!!!");

        s2.showProfile(); //AN NGUYỄN
        s1.showProfile(); //DỖI

        System.out.println("Check duplication if any???");
        System.out.println(s1); //gọi thầm tên em
        System.out.println(s2);

    }
    
    //BIẾN CÓ QUYỀN THAY ĐỔI CHỖ TRỎ!!!
    //MẤT TỌA ĐỘ, MẤT DẤU VÙNG NEW, CÓ THỂ CÓ ĐIỀU NÀY HAY KO? NẾU CÓ THÌ HẬU TRƯỜNG DIỄN RA GÌ?
    public static void checkObjectV2() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);
        //                          object/instance/đủ info được đổ, nằm vùng nào đó trong HEAP
        //                          new trả về tọa độ vùng clone
        //                          cả nguyên dòng từ new...; được xem là tọa độ/giá trị phức tạp
        //con trỏ, lưu tọa độ vùng new
        //biến object, lưu tọa độ vùng clone
        //reference variable, tao chiếu tọa độ chỗ khác heng
        //BIẾN CON TRỎ/OBJECT/THAM CHIẾU BẢN CHẤT LÀ CON TRỎ, CẦN LƯU 1 TỌA ĐỘ VÙNG NEW CLONE
        //vậy ko ai cấm mình trỏ vùng new mới
        s1 = new Student("SE666788", "BÌNH LÊ", 1998, 8.8);
        s1.showProfile(); //in ra cái gì??? Bình Lê
        
        //Em muốn lấy lại vùng clone AN thì sao, mất dấu rồi???
        //s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9); //AN khác AN trên heng
        
        //LƯU Ý - SOURCE: khi 1 object/vùng new clone ko có ai trỏ tới, mất con trỏ
        //do con trỏ gán qua vùng new khác, thì ta mất dấu tọa độ vùng new cũ.
        //J: JVM máy ảo JAVA chạy bên Windows, giám sát vùng RAM app viết = Java
        //                                              cà chớn hok, giết app, cảnh báo gửi báo tử
        //                                              khi chơi try-catch
        //                                              có vùng new mồ côi nào ko, vùng ko con trỏ
        //                                              HEAP có object nào ko có con trỏ hay ko
        //                                  bộ giám sát này của máy ảo Java gọi là công ti môi trường đô thị
        //                                  GARBAGE COLLECTOR, clear, available cho new clone khác
        //                                  free(con trỏ bên C - free vùng malloc())
        //                                                                 HEAP
        //việc clear RAM HEAP của Java diễn ra định kì, bao nhiêu giây, phút...
        //tuy nhiên mình có thể gọi ngay luôn
        System.gc();
    }
    
    //BACKUP OBJECT, TỨC LÀ GIỮ LẠI TỌA ĐỘ
    public static void checkObjectV3() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);
        
        //Trước khi s1 chơi với BÌNH, ko muốn mất AN
        //vậy cần ghi ra đâu đó cái tọa độ vùng new của AN,
        //trước khi đãng trí quên tên, thì ghi ra giấy, danh bạ
        Student x = s1; //ĂN ĐÒN new Student("SE666789", "AN NGUYỄN", 1999, 8.9);
        
        s1.setName("EM ÉO TIN THẦY");
        
        //x tao là biến object, tao rất rất cần tọa độ 1 vùng new
        //tự new okie, có thằng nào new trước rồi chưa, cho tao cùng chơi với
        //cho tao tọa độ đi, tao éo new
        //x trỏ dến AN ở trên
        
        int a = 10;
        int b = a;  //gán giá trị 2 biến cho nhau, a ơi cho tao giá trị của mày
        
        s1 = new Student("SE666788", "BÌNH LÊ", 1998, 8.8);
        //s1 đã bỏ AN, đi với BÌNH
        //x đang là AN của NGÀY HÔM QUA, XƯA CŨ BỊ S1 RUỒNG BỎ
        s1.showProfile();  //BÌNH LÊ
        x.showProfile();   //AN NGUYỄN NHƯNG BỊ THAY THÀNH EM ÉO TIN
        
        System.out.println("CHeck thầy LUÔN đúng");
        s1.setName("AHUHU, THẦY LUÔN ĐÚNG");
        x.showProfile(); //EM ÉO TIN
        s1.showProfile(); //AHUHU
    }
    
    //HAI CHÀNG THEO/TRỎ 1 NÀNG
    public static void checkObjectV4() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);
        Student s2 = s1;    //2 thằng cùng nhòm 1 hướng tọa độ, 2 chàng trỏ 1 nàng
        //s1 s2 cùng lưu 1 tọa độ, cùng trỏ vùng new clone AN
        s1.setName("ANH CỤC SÚC");
        
        s2.showProfile();   //CỤC SÚC
        s1.showProfile();   //CỤC SÚC
        
        //sếp
        //sky                   ---> (CaSi Sơn Tùng)
        //anh lạc trôi
        
        //an-game               --> BẠN NÀO ĐÓ
        //tèo       
        
    }
    
    public static void checkObjectV5() {
        //Student s1 = new Student("SE666789", "AHIHI", 1999, 8.9);
        
        //object vô danh, sinh ra mà hok thèm đặt tên, chỉ khóc 1 tiếng rồi pass away
        //s1.showProfile();
        //s1 chấm tức là vào vùng tọa độ chấm để làm gì đó
        //new... cũng chính là tọa độ, đẩy cho s1, s1 và new... cũng là như nhau
        //s1 chấm cũng như new chấm
        
        new Student("SE666789", "AHIHI", 1999, 8.9).showProfile();
        //cờ hó chạy ra đường ko có ông chủ cầm xích, Exciter hốt luôn
        //ko con trỏ, lóe lên 1 lần, rồi chết bởi CT MTĐT
        //object vô danh, anonymous object
        //MUỐN RE-USE OBJECT, CHẤM NHIỀU LẦN THÌ PHẢI CÓ TÊN GỌI
        
    }
    
    //KHAI BÁO BIẾN RỒI GÁN SAU
    public static void checkObjectV6() {
        //Student s1 = new Student("SE666789", "AHIHI", 1999, 8.9);
        
        int a;
        a = 10; //~~~~~ int a = 10;
        
        Student s1; //Tớ với cậu sẽ nói xấu dìm hàng 1 thằng bạn heng
                    //s1 là đứa tao với mày sẽ chơi nó, troll, lên confession
                    //s1 cần lắm luôn trỏ vùng new, sẵn sàng để trỏ                 
        //thằng đó đây 
        //giờ trỏ nè
        s1 = new Student("SE666789", "AHIHI", 1999, 8.9);
        s1.showProfile();
    }
    
    //HÀM TRẢ VỀ OBJECT, KO TRẢ PRIMITIVE
    //Đọc đúng phải thế này: Hàm này trả về tọa độ của 1 object đã new đâu đó
    //              Student x = ...;
    //              Student s1 = ...;
    //              int a;
    //              int f();    <- sqrt()   //tên hàm là 1 biến vì nó ~~~ 1 giá trị
    public static Student checkObjectV7() { //tên hàm này cũng là 1 biến/biến object
                                            //giá trị của hàm này, biến này là tọa độ new nào đó
        
        Student s1 = new Student("SE666789", "AHIHI", 1999, 8.9);        
        //      s1 em nắm tọa độ vùng new clone trong HEAP đó anh
        return s1;  //em ném cái tọa độ đó vào tên hàm
                    //tên hàm là tọa độ, Student f() mà, f() là tọa độ mà
                    //2 chàng trỏ 1 nàng new f() và s1 cùng trỏ new
        //từ trong hàm ném được tọa độ vùng new clone HEAP ra ngoài
        //lát hồi hàm chạy xong, mất mẹ nó biến s1 vì s1 nằm trong STACK
    }              
    
}
