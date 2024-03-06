package studentmanagement;

import data.Student;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentManagement {

    public static void main(String[] args) {
        //playWithArrayList();
        //sortArrayListManually();
        //playWithSet();
//        Student xxx = searchStudent("se123456");
//        if (xxx != null) //null được quyền kết hợp với == != có trỏ null đáy ram hay ko
//        {
//            xxx.showProfile();
//        } else {
//            System.out.println("NOT FOUND!!!");
//        }
        
        //sortStudentList();
        
        //List<Student> arr = initData(); //arr here trỏ thẳng vào Túi có 5 Sinh Viên
//        System.out.println("The student list");
//        for (Student x : initData()) { //for (int i = 2; i <= sqrt(n)...)
//            x.showProfile();
//        }
        
        List<Student> arr = initData();
        //5 9 4 2 8
        Student xxx = searchAStudent(arr, "SE888888");
        if (xxx == null)
            System.out.println("NOT FOUND!!!");
        else { //vi diệu nè
            xxx.showProfile();
            //nếu tìm thấy tui sẽ update dữ liệu luôn, sửa điểm của bạn TÁM thành 6789
            xxx.setGpa(6789);
        }    
        //in ra kết quả thì biết
        System.out.println("The student list after updating SE 8");
        for (Student x : arr) {
            x.showProfile();    //8 -> 6789
        }
            
    }

    public static void playWithArrayList() {
        //Student[] arr = new Student[500];
        //arr là 1 cái túi chứa sẵn 500 chỗ, 500 món đồ có thể bỏ vô
        //món đồ phải đi mua, new, thảy vào
        //tên mảng chính là má mì, quản lí nhiều đồ, tên túi luôn

        //List arr = new ArrayList(); //đựng lộn xộn đủ loại con trỏ
        //đúng nghĩa túi Doraemon, món gì cũng đựng, đựng tham chiếu thoi nha
        //nhét được NhanVien, GiangVien, Animal, Dog,...
        //túi đồng nhất chỉ lưu con trỏ Student
        List<Student> arr = new ArrayList();    //túi đựng đồng nhất 1 loại GENERIC
        //List<Student> arr = new ArrayList<>();
        //List<Student> arr = new ArrayList<Student();
        //arr là cái túi chứa vô hạn chỗ, vô hạn con trỏ
        //nhét đồng nhất món đồ dễ chấm chung được, đa hình được

        //MỞ NGĂN TỦ, TÚI, NHÉT ĐỒ VÔ
        //arr[i] = new Student(...); //mảng
        //arr.add(new Student(...)); //lưu con trỏ thoi, new Student() thoải mái
        //bên ngoài, vùng HEAP
        Student s1 = new Student("SE123456", "AN NGUYỄN", 2003, 9.0);
        Student s2 = new Student("SE123457", "BÌNH LÊ", 2003, 9.0);
        arr.add(s1);    //giỏ vùng new ArrayList, tủ có thêm 1 con trỏ, sinh ra 1 con trỏ
        //2 chàng 1 nàng
        arr.add(s2);    //sinh ra thêm con trỏ nữa [1]
        //add() vô tận, mảng [length - 1] hết mức
        //new cứ nằm HEAP, SinhVien cứ ở nhà, CongNhan cứ ở xưởng, BenhNhan cứ ở phòng
        //add() mở khóa kéo, khóa dây, nhét đồ vô, nhét tham chiếu, thẻ bài
        //sinh ra con trỏ
        arr.add(s1);    //add trùng nè, 1 tên người vào danh sách
        //Set ko báo lỗi, chỉ lấy 1 

        arr.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.0));
        //      new cứ lên HEAP mà nằm, Bệnh nhân cứ về phòng, tớ nắm thẻ bài
        //1 con trỏ nữa lại được add vào

        //hỏi xem túi đang có bao nhiêu đồ
        //arr.length hỏi túi mà, hỏi má mì mà, tên mảng mà
        System.out.println("The bag has: " + arr.size() + " elements");
        //4 sinh viên in ra, nhưng thực ra chỉ có 3 sinh viên, do có người đếm trùng

        //in mọi người ra
        //tủ có gì, chứa bên trong một đống con trỏ
        //mảng: [i].showProfile()
        //Tủ ArrayList[con-trỏ1, con-trỏ2, con-tro3, con-tro4, ... nếu add() thêm]
        //add() đẩy vào 1 con trỏ, tọa độ, thẻ bài
        //get(vị trí thẻ bài muốn lấy), trả về tọa độ con trỏ thứ i
        //                              trả về địa chỉ vùng new đang trỏ
        //[i] lấy được tham chiếu bạn thứ i
        //get(i) lấy được chỗ ngồi tham chiếu con trỏ the bài thứ i
        //a, thẻ này trỏ bạn sinh viên kia kìa
        //in bạn đầu tiên
        //arr[i].showProfile() phần tử đầu tiên của mảng
        Student xx = arr.get(0); //trả về tọa độ thẻ bài bạn thứ 0
        //trả về tọa độ gán vào biến Student khác nằm cùng tọa độ okie
        System.out.println("The student list");
        xx.showProfile();

        //bạn 1 get(1), có tọa độ chấm luôn cho rồi, thêm biến con trỏ trỏ cùng làm gì?
        arr.get(1).showProfile();   //trả về con trỏ

        System.out.println("In xịn sò");
        for (Student x : arr) { //ko sợ NULL POINTER vì add() đến đâu thêm con trỏ đến đó
            //x = arr.get(i) = arr[i]
            x.showProfile();
        }

        System.out.println("In xịn sò for truyền thống");
        for (int i = 0; i < arr.size(); i++) {
            //arr[i].showProfile();
            arr.get(i).showProfile();
        }

        //có hành động xóa 1 con trỏ, loại bỏ 1 thẻ bài, 1 món đồ, gạch tên 1 người
        //khỏi danh sách, vùng new Student() có bị mất hay ko tùy vào mấy con trỏ trỏ nó
        //size() giảm liền, mảng ko có, fix cứng số con trỏ
        //set() đảo con trỏ, trỏ sang vùng khác (get() set() xưa nay của các object)
    }

    //một cái túi List Cha (nhiều Con ArrayList, Vector,...) có 1 cơ chế
    //sort tự động QUA GỌI LỆNH, các thẻ bài/biến tham chiếu/biến con trỏ bên trong
    //cơ chế này thì phải xài Interface (Comparable và Comparator) 
    //cuối cùng vẫn là so sánh và đảo thứ tự
    //ta dùng trước cơ chế tự viết sort, so sánh và đổi thứ tự trỏ
    public static void sortArrayListManually() {

        List<Student> arr = new ArrayList<>();  //new là có Túi, có hành động, có chỗ chứa đồ

        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);

        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        //mở khóa dây của giỏ, nhét 1 thẻ bài vào, thẻ bài ghi thông tin trỏ tới SV AN 9.0
        //thẻ bài nằm ở vị trí đầu tiên trong giỏ (0) [0]
        //bệnh nhân cứ nằm ở phòng, new nằm trong HEAP
        //thông tin bệnh nhân + phòng -> ghi vào excel/1 dòng trong danh sách
        //bác sĩ cầm trên tay, arr đấy
        //arr là cái túi cái excel chứa tọa độ của bệnh nhân

        arr.add(binh);  //1 thẻ bài được thêm vào giỏ trỏ BÌNH 4.9
        arr.add(binh);  //add trùng, đã có trước đó 1 thẻ bài trỏ vùng new Binh 4.9 rồi
        //THÊM 1 THẺ BÀI NỮA GHI INFO TRỎ BÌNH 4.9
        //danh sách 3 người, 1 người ghi trùng 2 lần
        //in danh sách
        //binh.setName("AHUHU");
        System.out.println("The student list");
        for (Student x : arr) {
            //x = con trỏ/thẻ bài thứ 0, thẻ bài thứ 1, thẻ bài thứ n
            //x lưu tọa độ nằm trong thẻ bài thứ i, tức là trỏ vùng new thứ i
            x.showProfile();
        }
        //LẤY TRỰC TIẾP TỪNG CON TRỎ, KO CHƠI TRÒ QUÉT FOR EACH
        //~~~ [i] bên mảng, vị trí thứ i, biến thứ i
        //chính là chứa trong nó tọa độ vùng new
        System.out.println("The student list (printed by using for i)");
        for (int i = 0; i < arr.size(); i++) {
            //Student tmp = arr.get(i);    //trả về thẻ bài thứ i, chứa tọa độ new Student
            //cất tọa độ này vào 1 biến SV khác okie
            //tmp.showProfile();
            arr.get(i).showProfile(); //lấy thẻ bài thứ i trên đó có tọa độ, chấm luôn
        }

        //xóa BÌNH CUỐI CÙNG TRONG GIỎ, TỨC LÀ LOẠI BỎ THẲNG ĐI 1 THẺ BÀI,
        //BIẾN MẤT 1 CON TRỎ LUÔN, SIZE() SẼ GIẢM 1 ĐƠN VỊ
        //MẢNG KO CÓ TRÒ NÀY, XIN BAO NHIÊU, FIX BẤY NHIÊU, CÒN BẤY NHIỀU, KO REMOVE
        arr.remove(2);

        System.out.println("The LAST student list (printed by using for i)");
        for (int i = 0; i < arr.size(); i++) {

            arr.get(i).showProfile();
        }
        //THẺ BÀI (0) GET(0) LUÔN CÓ GHI TRÊN THẺ BÀI INFO CỦA SV AN 9.0 Ở XA
        //THẺ BÀI (1) GET(1) LUÔN CÓ GHI TRÊN THẺ BÀI INFO CỦA SV BÌNH 4.9 Ở XA
        //TUI MUỐN SẮP XẾP TĂNG DẦN THEO ĐIỂM
        //SURE, PHẢI ĐỔI LẠI INFO TRỎ, CÁCH TRỎ, GHI LẠI CÁI THẺ BÀI TRỎ LẠI ĐI
        //THẺ BÀI 0 PHẢI TRỎ VÀO BÌNH 4.9
        //THẺ BÀI 1 PHẢI GHI LẠI INFO TRỎ, TRỎ VÀO AN 9.0
        //[i] = [j] ĐỔI INFO TRỎ
        //hàm .set(thẻ nào vị trí thẻ bài, thông tin tọa độ mới)
        Student tmpStudent = arr.get(0); //lấy tọa độ vùng new AN 9.0, THẢY VÀO TMP
        arr.set(0, arr.get(1)); //get(1) được tọa độ BÌNH 4.9, THẢY TỌA ĐỘ VÀO THẺ 0
        arr.set(1, tmpStudent); //sửa đồng thời thẻ 1, trỏ vùng mới
        //vùng tmp đang trỏ, AN 9 XƯA KIA

        System.out.println("The student list sorting ascending by gpa");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile(); //BÌNH -> AN 4.9 -> 9.0
        }

        Student nam = new Student("SE999999", "NAM LÊ", 2003, 8.9);
        Student hieu = new Student("SE999999", "HIẾU NGUYỄN", 2003, 9.0);
        arr.add(nam);
        arr.add(hieu);
        System.out.println("The new student list");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile(); //BÌNH -> AN 4.9 -> 9.0
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student tmp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, tmp);
                }
            }
        }
        System.out.println("The new student list sorting ascending by gpa");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile(); //BÌNH -> AN 4.9 -> 9.0
        }

    }

    //Set: nhóm Túi/Giỏ hàng hiệu, mỗi món 1 lần tính, xuất hiện 1 lần
    //ko có 2-n thẻ bài trong giỏ trỏ cùng 1 vùng new
    //mỗi thẻ bài trong giỏ này trỏ duy nhất 1 vùng new
    //Set chia 2 loại Giỏ chi tiết hơn: HashSet: đồ đưa vào lộn xộn thứ tự
    //                                  TreeSet: đồ đưa vào TỰ ĐỘNG SẮP XẾP
    //ArrayList đưa vào giữ nguyên thứ tự, vào ra đúng thứ tự, get() set() add()
    public static void playWithSet() {
        Set<Student> arr = new HashSet<>();

        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);

        Student ahihi = new Student("SE123456", "AN NGUYỄN", 2003, 9.0);

        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));

        arr.add(ahihi);
        ahihi.setName("AHUHU");
        //CÓ NEW CÓ VÙNG NHỚ MỚI, ĐÃ CÓ AI TRỎ ĐÂU
        //QUAN TÂM ÉO GÌ INFRO TRÙNG CỦA VÙNG NEW
        arr.add(binh);
        arr.add(binh); //add trùng rồi, có 1 thẻ bài trước đó đã trỏ vùng BÌNH rồi
        //ÂM THẦM LOẠI BỎ TRÙNG
        //VÀO RA KO THEO ĐÚNG THỨ TỰ, ADD() VÀO THÌ OKIE, KO CÓ HÀM GET RA()
        //MUỐN LẤY INFO TRONG SET CHỈ CÓ CÁCH FOR EACH
        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }

    }

    //TÌM KIẾM 1 SINH VIÊN TRONG DANH SÁCH, HÀM TRẢ VỀ OBJECT
    //ĐỌC ĐÚNG LÀ: HÀM TRẢ VỀ THAM CHIẾU ĐẾN 1 VÙNG NEW
    //             HÀM TRẢ VỀ CÁI THẺ BÀI, TRÊN THẺ CÓ KHẮC TỌA ĐỘ VÙNG NEW
    //             HÀM TRẢ VỀ ĐỊA CHỈ MÀ OBJECT NEW ĐANG NẰM
    //      ~~~  Student x; //cần lắm luôn 1 tọa độ new Student
    public static Student searchStudent(String id) {  //tên hàm là 1 tọa độ searchStudent()
        //mò trong ArrayList, mảng [] lấy được thẻ bài, thảy ra ngoài thẻ bài,
        //thảy ra ngoài hàm cái tọa độ ghi trong thẻ bài, chính là trỏ đến object

        List<Student> arr = new ArrayList();
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(binh);

        //quét từ đầu đến cuối giỏ, lôi từng thẻ bài ra, get(i)
        //hỏi tiếp ê mày, mssv là mấy, get(i).getId()
        //if (id cần tìm == id vừa lấy trong giỏ) return thẻ bài khớp info
        //return tọa độ ghi trong thẻ bài, return vùng new SV tìm thấy
        Student tmp = arr.get(0);
        String tmpId = tmp.getId(); //tmpId = arr.get(0).getId()

        //if (tmpId == id đưa vào) thì return
        //ko thấy thì return null
        if (tmpId.equalsIgnoreCase(id)) {
            return tmp; //trả về tọa độ vùng new trong thẻ bài 0
        }
        return null;

    }

    //CÁC HÀM XỊN SÒ, SORT, SEARCH, CHUẨN BỊ KHO DATA
    //3 HÀM NÀY ĐỀU LÀ STATIC CHO MỤC TIÊU THỬ NGHIỆM, NÓ CHƯA LÀ TƯ DUY OOP
    //TƯ DUY OOP LÀ: CÁC HÀM PHẢI NẰM TRONG OBJECT NÀO ĐÓ
    //               CHẾ TẠO CÁI TỦ, THÙNG CHỨA, CÓ CÁC HÀNH ĐỘNG: THÊM, XÓA, SỬA, TÌM KIẾM
    public static void sortStudentList() {
        //cần chuẩn bị danh sách sinh viên: mua cái Túi-new Túi(), có các hồ sơ sinh viên, new SinhVien()
        List<Student> arr = new ArrayList();
        arr.add(new Student("SE555555", "NĂM LÊ", 2003, 5.5));
        arr.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.9));
        arr.add(new Student("SE444444", "BỐN VÕ", 2003, 4.4));
        arr.add(new Student("SE222222", "HAI TRẦN", 2003, 2.2));
        arr.add(new Student("SE888888", "TÁM LÍ", 2003, 8.8));
        //TÚI đang có chứa thẻ bài, cardvisit, 5 biến con trỏ, tham chiếu
        //thông tin trên card chính là địa chỉ vùng new Student() nằm trên HEAP
        //y chang bác sĩ cầm danh sách Excel chứa info các bệnh nhân, bệnh nhân cứ nằm phòng bệnh,
        //bác sĩ đi thăm sau. Bác sĩ thăm, nhìn danh sách, thấy số phòng, chính là địa chỉ từng bệnh nhân
        //bệnh nhân 1, bệnh nhân 2, thẻ 1, thẻ 2, card 1, card 2 chính là biến con trỏ,
        //trên đó có địa chỉ object ~~~~~ get(i) - lấy được cái thẻ
        System.out.println("The student list before sorting ascending by gpa");
        for (Student x : arr) {
            //x = arr.get(i); //lấy tọa độ địa chỉ của vùng new ghi trên thẻ thứ i cất vào x
            x.showProfile();
            
        }
        
        for (int i = 0; i < arr.size() - 1; i++) 
            for (int j = i + 1; j < arr.size(); j++) 
                if (arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student tmp = arr.get(i);            //cất tọa độ bạn i
                    arr.set(i, arr.get(j)); //thẻ/card 0 khắc lại địa chỉ, lấy địa chỉ bạn j = i + 1
                    arr.set(j, tmp);
                }
            
        
        
        System.out.println("The student list after sorting ascending by gpa");
        for (int i = 0; i < arr.size(); i++) 
            //Student x = arr.get(i); x.showProfile();
            arr.get(i).showProfile();
        
        
    }
    
    //            Student x = cần trỏ 1 vùng new SinhVien()
    //                    tên hàm là 1 biến SinhVien, tên hà mnayf cần trỏ 1 vùng new SinhVien()
    //hàm trả về giá trị thì tên hàm ~~~ giá trị
    //double r = sqrt(4);
    //                                                 arr trỏ 1 cái Giỏ có sẵn
    //                                                 Giỏ ArrayList new ở đâu ko care, 
    //                                                 trong Giỏ có gì, ko care vội, lục lọi sau
    //Xài hàm này ta cần chuẩn bị sẵn 1 cái Túi/Giỏ ở đâu đó trước rồi, có đồ bên trong luôn,
    //đưa vị trí Giỏ có sẵn đó vào hàm,
    //y tá đưa danh sách bệnh nhân nằm sẵn ở các phòng rồi
    //đưa mảng/Túi ArrayList có sẵn từ main() vào hàm này, OKIE
    //NHƯNG KO HAY, LẬP TRÌNH LÀ MỌI THỨ TRONG HÀM -> C
    //                           MỌI THỨ NẰM TRONG OBJECT -> OOP
    //BÀI NÀY, ĐANG THỬ NGHIỆM, TA ĐƯA TOÀN BỘ DATA VÀO TRONG HÀM CÁI ĐÃ
    public static Student searchAStudent(List<Student> arr, String id) {
        //rà qua các phần tử trong mảng, Giỏ, lôi từng thẻ/con trỏ
        //hỏi thẻ đó, ê, cho tao biết SinhVien này có id mấy, (i).getId()
        //          trỏ vào new Student()
        //if (id mới tìm == id cần tìm đưa vào) return tọa độ/địa chỉ trên thẻ
        //                                             cái thẻ
        //nếu ko thấy, return null; //tên hàm trỏ vào null, ko có SinhVien, chấm bị Exception
        //SinhVien ko tìm thấy chấm vô nghĩa!!!
        //TA CẦN MỘT DANH SÁCH SINH VIÊN ĐỂ FOR
        
        if (arr.isEmpty())    //đưa Túi rỗng mới mua, có gì đâu mà Search
            return null;      //cho mày tọa độ NULL trả về
        
        for (int i = 0; i < arr.size(); i++) {
            //lôi từng thẻ ra, hỏi id của mỗi sinh viên
            //Student t = arr.get(i);
            //String tId = t.getId(); //định luật bắt cầu arr.get(i).getId()
            //if (tId == id) id vừa lấy của Sinh Viên == id đưa vào thì return tọa độ
            //if (tId.equalsIgnoreCase(tId))
            //    return t; //arr.get(i);
            
            if (arr.get(i).getId().equalsIgnoreCase(id))
                return arr.get(i);
            
        }
        //đi hết for ko return được, sure ko thấy, null
        return null;
    }
    
    //hàm chuẩn bị DATA. HÀM TRẢ VỀ 1 CÁI TÚI/ARRAYLIST/DANH SÁCH SINH VIÊN
    //ĐỌC ĐÚNG: HÀM TRẢ VỀ TỌA ĐỘ VÙNG NEW ARRAYLIST() MÀ BÊN TRONG CÓ SẴN
    //          1 ĐỐNG CARDVISIT GHI ĐỊA CHỈ SINH VIÊN
    //          HÀM TRẢ VỀ VỊ TRÍ 1 CÁI TÚI CÓ SẴN/MUA RỒI, TRONG TÚI CÓ...
    //          List<Student> arr; = new gì đó
    //                          initData = new ArrayList() nào đó
    public static List<Student> initData() {
        List<Student> arr = new ArrayList();
        arr.add(new Student("SE555555", "NĂM LÊ", 2003, 5.5));
        arr.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.9));
        arr.add(new Student("SE444444", "BỐN VÕ", 2003, 4.4));
        arr.add(new Student("SE222222", "HAI TRẦN", 2003, 2.2));
        arr.add(new Student("SE888888", "TÁM LÍ", 2003, 8.8));
        return arr; //initData() = arr = new ArrayList()
        //tên-hàm cùng trỏ vào giỏ vừa new - 2 CHÀNG ARR, TÊN HÀM CÙNG TRỎ 
        //1 NÀNG NEW ARRAYLIST(BÊN TRONG CÓ 5 THẺ SINH VIÊN)
        
    }
    
}
