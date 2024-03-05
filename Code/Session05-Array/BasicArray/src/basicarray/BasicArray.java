package basicarray;

public class BasicArray {

    public static void main(String[] args) {
        //playWithPrimitiveArray();
        //playWithPrimitiveArrayV2();
        //playWithPrimitiveArrayV3();
        //playWithAnObject();
        //playWithObjectArray();
        //playWithObjectArrayV2();
        //sortPrimitiveArray();
        //sortObjectArray();
        //sortPrimitiveArrayV2();
        sortObjectArrayV2();
    }

    public static void playWithPrimitiveArray() {
        //double vol[365]; cấm tuyệt đối trong lệnh khai báo gõ kích thước mảng, số phần tử

        //double v[365] = {0, 5, 10, 15, 20, 25, 30}; 
        double v[] = {0, 5, 10, 15, 20, 25, 30}; //mảng 7 phần tử, 7 biến double
        //có sẵn value v[0] = 0; v[1] = 5;...
        //STACK            //HEAP ĐÓ EM
        v[6] = 6868; //vượt biên, cứa cổ

        System.out.println("v[0]: " + v[0] + " | v[1]: " + v[1]);
        System.out.printf("Element 0 nè: %.1f\n", v[0]);

        for (int i = 0; i < 7; i++) {
            System.out.print(v[i] + "  ");
        }

        //TOÁN TẬP HỢP
        //N = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        //V x e N, tức là x sẽ là mấy, có value mấy, vì tập hợp toàn là số
        //x = -5 sai, e N kia ma
        //x = 0; x = 1; x = 2; x = 3;...
        //x sure phải là số tự nhiên đã, lấy value trong N
        //V x là integer e N
        //x = N[0] = 0, x có thể là số tự nhiên đầu tiên
        //x = N[1] = 1, x có thể là số tự nhiên kế tiếp
        //chữ với mọi, với mỗi chính là kĩ thuật giúp ta duyệt qua toàn bộ
        //value của 1 tập hợp, rọi đèn pin từ trái sang phải,
        //lôi hết các element phần tử/giá trị của tập hợp.
        System.out.println("\n\nThe array V has values of (using for each)");
        for (double x : v) {
            //với mọi biến double x nó sẽ càn quét qua toàn bộ phần tử của mảng
            //x thuộc : tập hợp v, x có quyền bằng phần tử v thứ 1, x = v[0]
            //x = v[1], x = v[2] ... x = v[i]
            //sout(x) ~~~~~~~ sout(v[i])
            //phần tử thứ i của mảng double là 1 biến double v[i] -> x biến double có gì sai
            System.out.print(x + " ");
        }

    }

    public static void playWithPrimitiveArrayV2() {
        //float* arr = calloc(7, sizeof(float));
        //	STACK			//HEAP
        //bien con tro	tro vung RAM bu cha ba, 28 byte chia 7 cum 7 bien
        //		   = luu toa do vung bat dau, 
        //		   = new ben Java

        double arr[] = new double[5]; //ngoặc vuông là mảng, xin số biến
        //       () là gọi phễu của Khuôn heng
        //có new có vùng chà bá lửa , có RAM bụ chứa đến 365 biến double
        //default là 0
        //arr[0] là 1 biến double, arr[i] biến double, primitive
        //primitive giá trị đơn xài luôn, ÉO CÓ CHẤM À NHEN

        //QUAN TRỌNG: tên mảng bản thân là 1 biến má mì, tú ông, tú bà, con trỏ, reference
        //trỏ vào đầu 1 dãy rất nhiều biến khác
        //nó là biến má mì vì quản lí ở dưới rất nhiều em chân dài trai ngành...
        //hỏi má mì ơi bà có bao nhiêu lính, má mì trả lời rằng tao có 365 
        //đây chính là đặc điểm của má mì, quản lí nhiều lính...
        //má mì ơi bà có bao nhiêu lính ~~~ má mì chấm length
        //double pi = 3.14;
        //pi. chấm cái đầu mày
        arr[0] = 68;
        arr[1] = 79;
        arr[2] = 100;

        //arr[0]. CHẤM CÁI ĐẦU MÀY VÌ MÀY LÀ 1 BIẾN DOUBLE THƯỜNG THƯỜNG THÔI MÀ
        //        TÊN MÀY PHỨC TẠP DO 365 ĐỨA XÀI CHUNG TÊN, MÀY CHẢ KHÁC DOUBLE X
        
        //arr[0]. đầu mày primitive
        //arr.length okie

        //in mảng bình thường
        System.out.println("The array arr has: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\n");
        for (double x : arr) {
            System.out.print(x + " ");
        }

    }
    
    public static void playWithPrimitiveArrayV3() {
        int a = 10;
        //a chấm xổ cái đầu mày, a là 10 rõ ràng đòi j nữa
        int a1 = 10, a2 = 100, a3, a4, a5, a6, a7, a8, a9, a11; //LẺ
        //System.out.println(a2 + " ");
        
        int arr1[] = {5,    10,     15, 20, 25, 30}; //có nhiều biến, gọi chung arr
        //cụ thể là arr[0] [1]      [2]...           //implicit new
        
        int arr2[] = new int[]{5, 10, 15, 20, 25, 30}; //explicit new
        
        int[] arr3 = {5, 10, 15, 20, 25, 30};
        //đưa nhiều value thì phải có nhiều biến tương ứng
        //có nhiều biến lắm luôn và value tương ứng
        
        int[] arr;  //arr là biến má mì, con trỏ, trỏ vùng new cực bự hơn C
        arr = new int[30];  //trỏ object chứa rất nhiều biến int khác
        
        System.out.println("The arr array has: ");
        arr[0] = 100;
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        
        for (int x : arr)   //x = arr[0] tao xin value thằng đầu tiên
                            //x = arr[1] tao xin value thằng kế, [i]
            System.out.print(x + " ");
        
        //arr[0] chấm xổ ra gì??? xổ ra cái đầu mày, pri xài luôn, chấm gì nó là 100 mà
        
        System.out.println("");
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");

    }
    
    public static void playWithAnObject() {
        //muốn lưu hồ sơ 1 sinh viên, ta cần 2 thứ: biến, tên tắt, con trỏ, reference
        //                                          vùng new clone đổ phễu
        //muốn lưu 1 giá trị bình thường, ta cần 2 thứ: biến primitive
        //                                              value đơn
        int a = 100;
        Student x;  //en với thầy cùng nói xấu đứa kia x đi
        //đã là sinh viên, thì chắc chắn showProfile() công dân thì phải có CCCD
        x = new Student("SE123456", "AN NGUYỄN", 2001, 5.6);      
        
        //hạ cánh nơi anh - cho con trỏ hạ cánh xuống 1 chỗ cực kì cool
        x = null;   //trỏ vùng mới, hạ cánh đáy của RAM
                    //gán địa chỉ 0, con số 0 vào trong biến con trỏ
                    //biến con trỏ lưu tọa độ đáy RAM, chứa toàn bộ 0, byte null
                    //nhà đầu phố (số nhà 0) tối thui, 0 có gì
                    //nhà null
        x.showProfile();

    }
    
    public static void playWithObjectArray() {
        //tui muốn lưu hồ sơ 50 bạn sinh viên
        //tui cần chuẩn bị những gì? 2 thứ
        //50 biến/tên tắt,
        //50 value - 50 VÙNG NEW
        int a1, a2, a3, a4, a5, a6; //..50 số 
        //a1 = 5; //value 5
        
        int arr[] = new int[50]; //50 biến, éo có, chưa có value
        
        Student s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13; //, ...
        //s1 = new Student(id, name, a6, a6)
        
        //50 biến cái đã, mảng các biên sinh viên
        Student s[] = new Student[3];  //13 biến sinh viên, chưa có object thực, value
                                        //s[0], s[1], s[2] ~~~~
                                        //s1    s2    s3 ở khai báo lẻ
        
        s[0] = new Student("SE123456", "AN NGUYỄN", 2001, 5.6);
        s[1] = new Student("SE123457", "BÌNH LÊ", 2000, 5.7);
        s[2] = new Student("SE123458", "CƯỜNG VÕ", 1999, 5.8);
        
        System.out.println("The student list: ");
//        s[0].showProfile();
//        s[1].showProfile();
//        s[2].showProfile();
        System.out.println("Cường lower: " + s[2].getName().toUpperCase().toLowerCase().charAt(0));
        
        for (int i = 0; i < s.length; i++) 
            s[i].showProfile();
            //sv x.showProfile()
        
        
        //BIẾN SINH VIÊN CÒN LẠI TỪ S[3] ... S[12] GIÁ TRỊ DEFAULT GÌ???
        //DEFAULT NULL HẠ CÁNH ĐÁY RAM
        //NGUYÊN TẮC CHƠI VỚI MẢNG OBJECT CẤM TUYỆT ĐỐI FOR HẾT NẾU MẢNG CHƯA 
        //GÁN FULL VÌ PHẦN CÒN LẠI TRỎ ĐÁY RAM MẶC ĐỊNH, ĐỊA CHỈ 0 MẶC ĐỊNH
        //PHẦN GÁN RỒI GÁN VÀO NEW CLONE THÌ CHẠY BÌNH THƯỜNG
        //MẢNG OBJECT BẮT BUỘC PHẢI FOR ĐẾN COUNT LÀ SỐ PHẦN TỬ ĐÃ GÁN
        //mảng primitive default là 0, boolean, value in bình thường
        //dáy ram của [i].showProfile() có value gì mà show, toàn 0 à
        
        //s.length chấm xổ ra gì
        //s[0]. xổ ra gì? info Sinh Viên, tao là biến object
        //s[0] = 100; tao là biến Student, tao cần vùng new
        
        //arr.length chấm xổ ra gì
        //arr[0]. chấm xổ ra gì
    }
    
    public static void playWithObjectArrayV2() {
        
        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 9.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2000, 5.0);
        
        //in mảng

        System.out.println("The student list before sorting");
//        for (int i = 0; i < 2; i++) { 
//           //arr[i].showProfile();
//            System.out.println(arr[i]);
//        }  

        for (Student x : arr) {
            //x = từng phần tử của mảng, tập hợp, vào từng phần tử lấy value
            //với mỗi, duyệt qua toàn bộ mảng
            //x = arr[0]; x = arr[1]; x = arr[i] cho tao cùng nhìn cái coi
            //arr[i].showProfile() ~~~ x.showProfile()
            //2 chàng 1 nàng
            //x.showProfile();
            System.out.println(x); //gọi thầm tên em
        }
        
        //Tui muốn in mảng tăng dần ascending về điểm, về lí Bình 5.0 | An 9.0
        //arr[0] đang trỏ sai, mày đầu mảng thì phải trỏ new BÌNH 5.0
        //arr[1] đang trỏ sai, đang trỏ 5.0 sai, nhì mảng, phải trỏ AN 9.0
        //cần hoán đổi việc trỏ
        //arr[0] trỏ BÌNH 5.0 đang giữ bởi arr[1]
        //arr[1] ơi cho tao arr[0[ xin vùng RAM BÌNH 5.0 đi
        arr[0] = arr[1]; //trỏ BÌNH 5.0
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) 
            x.showProfile();

    }
    
    public static void sortPrimitiveArray() {
        int a = 9, b = 5;
        //quy ước a đứng trước b khi in ra kết quả
        System.out.println("Before sorting: a: " + a + " | b: " + b);
        //tui muốn in gia trị a b tăng dần
        //đổi giá trị cho nhau là xong
        //a = b;  //a lấy giá trị của b, đang 5, do đó a = 5
        //b = a;  //b lấy giá trị của a, đang 5 luôn rồi (1 giá trị tại 1 thời điểm)
                  //đúng ra phải là b = a cũ xưa xưa, 9 đó
                  //đúng chuẩn phải backup a trước khi a chơi với giá trị mới
        //biến trung gian, tờ giấy nháp ghi lại cái sắp bị quên 9 trong a 
        int t = a;  //a 9 cất vào t temporary, tmp, t
        a = b;      //a lấy 5 của b
        b = t;      //b lấy a cũ đang trong t là 9
        System.out.println("Before sorting: a: " + a + " | b: " + b);
    }
    
    public static void sortObjectArray() {
        Student arr[] = new Student[2];        
        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 4.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2000, 8.0);
        
        System.out.println("The student list before sorting");
        for (Student x : arr) {
            System.out.println(x);
        }
        Student t = arr[0]; //arr[0] cho tao tọa độ bạn AN 9.0, TRỎ CÙNG, BACKUP
        arr[0] = arr[1];    //[1] đang trỏ BÌNH 5.0, ngồi sau trỏ nhỏ
                            //đưa nhỏ cho [0]
        arr[1] = t;         //trỏ vào AN 9.0
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }
        
    }
    
    public static void sortPrimitiveArrayV2() {
        int a = 10, b = 10;      
        System.out.println("Before sorting: a: " + a + " | b: " + b);
        //nếu có trục trặc thứ tự thì mới đổi
        //trong sắp xếp tăng dần, thì thằng trước PHẢI bé hơn thằng sau
        //nếu đứng trước mà lớn hơn đứng sau, 9 5 | 8 | 4,
        //SURE PHẢI ĐỔI VALUE, HOÁN ĐỔI
        //chỉ hoán đổi khi có trục trặc, thằng trước LỚN HƠN  thằng sau
        //if thằng trước > thằng sau, đổi ngay và luôn
        if (a > b) { //do ta quy ước a trước b
            int t = a;
            a = b;
            b = t;
        }
              
        System.out.println("Before sorting: a: " + a + " | b: " + b);
    }
    
    public static void sortObjectArrayV2() {
        Student arr[] = new Student[2];        
        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 10.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2000, 10.0);
        
        System.out.println("The student list before sorting");
        for (Student x : arr) {
            System.out.println(x);
        }
        
        //SẮP XẾP MẢNG OBJECT - mảng của các biến object mà trỏ vào object
        //chẳng qua là đổi vị trí trỏ, thay đổi value/tọa độ vùng object
        //mà đang được lưu trong các biến con trỏ
        //đổi cách trỏ của từng biến mảng. Chơi biến trung gian
        //khi nào thì đổi, nhắm mắt đổi là sai
        //GIẢ BỘ SẮP XẾP TĂNG DẦN THEO ĐIỂM TRUNG BÌNH
        //nếu thứ tự trỏ vùng new đã đúng thứ tự điểm, để im
        //nếu điểm của arr[0] đang trỏ > điểm của arr[1] đang trỏ thì mới đổi
        
        //CHỐT HẠ: CẤM TUYỆT ĐỐI XÀI > >= < <= == != CHO VIỆC SO SÁNH 2 BIẾN OBJECT
        //VÌ TOÁN TỬ SO SÁNH TRUYỀN THỐNG CHỈ DÀNH CHO PRIMITIVE
        //int a = 5, b = 10; if (a > b) vì 2 giá trị, so sánh được
        //arr[0] [1] bản chất trong RAM nó là tọa độ, là con số luôn, hàm ý địa chỉ vùng RAM,
        //ĐI SO SÁNH 2 BIẾN OBJECT arr[0] [1] tương đương so sánh tọa độ, số nhà
        //nhà tao số nhà 500 đường Quan Trung
        //nhà mày số nhà 2   đường Lê Lợi
        //số nhà tao to hơn 250 lần số nhà mày, vô nghĩa vãi
        //hãy so sánh giùm tui 2 sinh viên An và Bình
        //sv1:                          sv2 vô nghĩa vì lúc thắng lúc thua theo data bên trong
        if(arr[0].getGpa() > arr[1].getGpa()) {
            Student t = arr[0];
            arr[0] = arr[1];
            arr[1] = t;
        }
            
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }
        
    }
    
}
