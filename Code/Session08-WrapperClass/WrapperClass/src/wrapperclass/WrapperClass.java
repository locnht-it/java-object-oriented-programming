package wrapperclass;

public class WrapperClass {

    public static void main(String[] args) {
        //playWithIntegers();
        //playWithPointers();
        playWithPool();
    }

    public static void playWithIntegers() {
        int n1 = 2003;  //4 byte 
        Integer n2 = new Integer("2003");   //2 vùng RAM lận
        Integer n3 = new Integer(2003);  //2 vùng RAM

        Integer n4 = 2003;                    //new ngầm, vẫn 2 vùng RAM
        //tự nhiên hơn, vẫn phải new ngầm
        //n2, n3, n4 trỏ 3 vùng RAM new Integer(), lõi vùng new là int 2003

        //in thì sao?
        System.out.println("n1: " + n1);    //primitive, xài luôn
        System.out.println("n2: " + n2);    //gọi thầm tên em
        System.out.println("n3: " + n3.toString());
        System.out.println("n4: " + n4.intValue());

        //Integer n4 = 2003;
        Integer n5 = n1;    //CPU xử lí giống nhau, new ngầm Integer()
        //nhét vào trong lõi Integer vùng new á, con số
        //int 2003 core/lõi
        //CƠ CHẾ BOXING/ĐÓNG HỘP/WRAPPING: KHI TA GÓI CÁI PRIMITIVE -> OBJECT                    
        System.out.println("n5: " + n5);    //gọi thầm tên em

        //int n6 = 2001;    //primitive
        int n6 = n5;    //á đù, chuyện gì? MỞ HỘP QUÀ
        //UNBOXING: KHI TA MỞ HỘP, LẤY VALUE LÕI ĐỂ GÁN RA PRIMITIVE
        //VẪN TƯƠNG THÍCH, PHÙ HỢP
        //UNBOXING: OBJECT -> PRIMITIVE
        System.out.println("n6: " + n6);

        //Integer n5 = n1;  //TRỎ VÙNG NEW 2003 riêng của nó
        n5 = 2000;  //điều gì diễn ra trong RAM?
        //  vùng new mới Integer(lõi là 2000)
        //  éo quan tâm vùng new Cũ (2003)
        //Khác với int yob = 2003; yob = 2000; //vẫn vùng RAM cũ, ON-OFF lại
        //VẬY THÌ INTEGER KO CÓ KHÁI NIỆM SET(), TỨC LÀ MỖI LẦN GÁN VALUE LÀ 1 LẦN NEW MỚI,
        //KO XÀI VÙNG NEW CŨ,
        //KO CÓ CƠ CHẾ SET() LẠI CÁI GÌ ĐÃ CÓ LÚC NEW, KO CHO PHÉP THAY ĐỔI VALUE LÕI,
        //TỨC LÀ READ-ONLY, CHỈ ĐỌC, KO CHO CHỈNH SỬA
        //INTEGER CHỈ CÓ HÀM GET() KO CÓ HÀM SET()
        //MỘT CLASS BẤT KÌ NÀO KHÁC, KỂ CẢ INTEGER, MÀ CHỈ CÓ HÀM GET() KO CÓ HÀM SET(), KO CÓ HÀM CHO THAY ĐỔI BÊN TRONG,
        //NGOẠI TRỪ LÚC ĐÚC, CLASS READ-ONLY ĐẶC ĐIỂM
        //THÌ CLASS NÀY ĐƯỢC GỌI LÀ IMMUTABLE CLASS

        //CLASS NÀO MÀ CHO PHÉP THAY ĐỔI VALUE ĐÃ ĐƯỢC ĐÚC, GỌI LÀ MUTABLE CLASS
        //CÓ TỔNG CỘNG 8 CÁI WRAPPER/TRAI BAO CLASS ỨNG VỚI 8 THẰNG PRIMITIVE
        //Byte      Short   Integer     Long    Float   Double      Boolean     Character
        //byte      short   int         long    float   double      boolean     char
    }

    //học về so sánh 2 object, học về vùng new
    public static void playWithPointers() {
        int n0 = 2003;
        int n00 = 2003;
        //hỏi: n0 có bằng n00 ko?   primitive
        if (n0 == n00) {
            System.out.println("2 thằng này n0 và n00 bằng nhau");
        } else {
            System.out.println("2 thằng này n0 và n00 ÉO bằng nhau");
        }
        Integer n1 = new Integer("2003");
        Integer n2 = new Integer(2003); //ko khuyến khích
        Integer n3 = 2003;                   //khuyến khích
        Integer n4 = 2005;

        //hỏi: n3 có bằng n4 ko?
        if (n3 == n4) //so sánh 2 tọa độ, 2 địa chỉ vùng new khác nhau
        //đi so sánh 2 biến object, biến con trỏ
        {
            System.out.println("2 thằng này n3 và n4 bằng nhau");
        } else {
            System.out.println("2 thằng này n3 và n4 ÉO bằng nhau");
        }

        //NHƯNG BẢN CHẤT LÕI LÀ BẰNG NHAU VÌ CÙNG 2003
        //CHỐT HẠ: CẤM TUYỆT ĐỐI KO DÙNG TOÁN TỬ SO SÁNH TRUYỀN THỐNG
        //> >= < <= == KHI ĐEM ĐI SO SÁNH 2 BIẾN OBJECT/BIẾN THAM CHIẾU/CON TRỎ
        //MUỐN SO SÁNH 2 BIẾN OBJECT, KO NÊN, MÀ PHẢI VÀO BÊN TRONG VÙNG TRỎ ĐÓ
        //COI CÓ VALUE GÌ ĐỂ MÀ SO SÁNH THÌ MỚI HỢP LÍ
        //n3 ơi mày có value gì vậy, tao muốn so sánh với value của n4
        //đi vào vùng new mà SO SÁNH
        //SO BÊN TRONG VÙNG NEW MỚI LÀ ĐÚNG, VÌ SO SÁNH ĐẶC ĐIỂM, CHỨ AI ĐI SO SÁNH NICKNAME
        //ĐI VÀO VÙNG NEW TỨC LÀ CHẤM . LẤY VALUE LÕI, CÂU HỎI EQUALS() COMPARETO()
        //N3.   N4.
        //VIỆC SO SÁNH NÊN DIỄN RA Ở ĐÂU - HÀM SO SÁNH() ĐẶT Ở ĐÂU??? Ở TRONG OBJECT
        System.out.println("n3 vs. n4 (core): " + n3.equals(n4));
        System.out.println("n3 vs. n4 (core): " + n4.compareTo(n3));

    }

    //Pool là 1 vùng RAM chứa các vùng new của Wrapper Class, String
    //giống như hồi bơi ngoài đời, nhiều object tắm chung
    //chỉ áp dụng kĩ thuật hồ bơi trong 1 số tình huống đặc biệt, ko nhầm với static
    public static void playWithPool() {
        Integer n1 = new Integer("2000");
        Integer n2 = new Integer(2000);
        Integer n3 = 2000;  //boxing
        Integer n4 = 2000;

        //n3 có bằng n4 hay ko??? hỏi con trỏ thoi, so sánh địa chỉ hoi
        System.out.println("n3 == n4? " + (n3 == n4)); //2 vùng new khác nhau

        //Không bằng về con trỏ, nhưng bằng về value bên trong, vào trong mà so sánh
        System.out.println("n3 == n4 (core)? " + n3.equals(n4)); //2 vùng new khác nhau, nhưng value lõi bằng nhau

        //n2 vs. n3: n2 có bằng n3 ko? n1 vs. n2 có bằng nhau ko?
        //4 thằng ko bằng nhau về con trỏ, value của card, thẻ bài, mỗi thằng là thẻ bài,
        //ghi địa chỉ vùng new, trỏ new khác nhau mà
        //ÉO BẰNG VỀ CON TRỎ, ÉO TRỎ CHUNG
        //CHỈ BẰNG BÊN TRONG LÕI!!!
        System.out.println("n1 == n2? " + (n1 == n2)); //KO
        System.out.println("n2 == n3? " + (n2 == n3)); //KO

        //GÁN MỚI TRỎ MỚI VÌ READ-ONLY, IMMUTABLE CLASS
        
        //VI DIỆU:
        Integer n5 = 127;
        Integer n6 = 127;
        //n5 bằng n6 ko? SO CON TRỎ HOI, LÕI THÌ = NHAU RỒI
        
        //  -129-FALSE, -128-TRUE,  ... TRUE ...        127-TRUE 128-FALSE
        //                  TRUE [-128; 127]
        //CHƠI NEW NGẦM TRONG ĐOẠN -128 - 127 THÌ XÀI POOL
        
        //n5 = 127 -> ~~~ new ngầm Integer(127)
        //n6 = 127 -> ko new ngầm nữa, xài ké 127 ở trên: 2 CHÀNG 1 NÀNG
        //n7 = 127 -> mình tắm chung luôn 3 chàng 1 nàng
        
        System.out.println("n5 == n6? " + (n5 == n6)); //TRUE
        
        Integer n7 = 127; //POOL

        System.out.println("n5 == n7? " + (n5 == n7)); //TRUE
        
        //có 256 vùng new [-128 -> +127] dùng chung cho n biến Integer
        //nếu xài kiểu BOXING NEW NGẦM
        
        Integer n8 = new Integer(127); //tọa độ khác
        
        //hỏi n7 và n8 có bằng nhau ko?
        System.out.println("n7 == n8? " + (n7 == n8)); //FALSE
        
        Integer n9 = new Integer("127");
        System.out.println("n8 == n9? " + (n8 == n9)); //FALSE
        //ko xài pool, tọa độ khác rồi
        
        //CHỐT HẠ: CẤM TUYỆT ĐỐI SO SÁNH 2 BIẾN OBJECT QUA TOÁN TỬ == 
        //VÌ ĐI SO SÁNH 2 ĐỊA CHỈ, LÚC BẰNG LÚC KO DO CÓ POOL HAY KO
        //CHÍNH XÁC PHẢI SO SÁNH 2 OBJECT QUA DẤU CHẤM VÀO TRONG LẤY DATA MÀ SO
        //CHẤM ĐỂ SO SÁNH OBJECT!!!
        
    }

}
