
package amazingracev4;

import data.*;
import java.util.*;


public class AmazingRaceV4 {

    
    public static void main(String[] args) {
        runToDead();
    }

    public static void runToDead() {
        
        //CÓ QUYỀN CÓ AI ĐÓ CHẠY NGANG NHẢY VÔ
        //MĨ NHÂN NGƯ CHÂU TINH TRÌ NHẢY VÀO!!!
        //Người Cá đúng chuẩn - class Mermaid thì chuyên ngồi mỏm đá, dụ
        //thủy thủ đến bắt ăn thịt!!!
        //nếu ta làm class Mermaid rời - concrete, phải chuột tạo mới class Mermaid
        //viết code bình thường, code này có hàm batThuyThuVaAnThit()
        //bắt Mermaid implement DeathRacer, bắt người cá đi đua chuyện quá đáng
        //ko phù hợp logic, người cá ko thích di chuyển đi đua!!!
        
        //Nhưng có 1 nàng người cá thích ăn chay, lên bờ chơi với con người
        //ko theo logic chung người cá là ăn thịt người thủy thủ
        //object lẻ ko nhập chung đoàn Mermaid truyền thống
        //ko bắt Mermaid implements DeathRacer
        //Mĩ nhân ngư của Châu Tinh Trì phá đoàn, tham gia đua dưới kênh Nhiêu Lộc cho vui
        //ko bắt cả họ Người Cá đi đua
        //object đánh lẻ, đánh lẻ đua, thì chỉ cần đua tốc độ là được rồi
        //Anonymous Class, ko thèm tạo class rời, mà vẫn tham gia CLB
        //chỉ cần có hành động của CLB là okie rồi, ghé ngang thoi thì cũng phải
        //hành động, implements all abstract methods on the go, take-away
        
        //làm class riêng rẻ để nhân bản được nhiều Member
        //làm on the go dành cho vãng lai ghé ngang
        //CẢ 2 ĐỀU PHẢI IMPLEMENTS, @Override VÌ CHA, CLB KO HOÀN HẢO
        
        //OBJECT ON THE GO, CẦN CÓ HÀM ĐUA VÀ GÁY THÀNH TÍCH LÀ XONG, KO LÀM CLASS RỜI,
        //KO LÀM CLASS CÓ SẴN ĐỂ NHÂN BẢN
        //DeathRacer mnnCTT = new Mermaid(); //class rời này sẽ có @Override
                                             //2 hàm runToDead() showHowTo()
                                             //y chang Motor à
                                             
        //Mượn gió bẻ măng, ko có Khuôn sẵn thì phải code @Override từ đầu,
        //cho mỗi lần chơi trò làm biếng tạo Khuôn
        //on the go @Override
        DeathRacer mnnCTT = new DeathRacer() {
            //VÙNG KO GIAN CỦA CLASS MERMAID MÀ TA LÀM BIẾNG LÀM RIÊNG
            //VÙNG NÀY CHÍNH LÀ PHẦN MỞ RỘNG CỦA CHA/CLB
            //BA SẼ LÀ CÁNH CHIM (new/super() new DeathRacer())
            //đưa Con extends/implements thật xa thật nhiều @Override
            //ta có quyền làm như truyền thống, thêm đặc điểm...
            //đừng lạm dụng, on-the-go thì nên quan tâm phần đang tham gia
            public static final double MAX_SPEED = 50;
            
            @Override
            public double runToDeath() {
                return new Random().nextDouble() * MAX_SPEED * 3; 
            }
            
            //anonymous làm biếng tạo class rời cho cả abstract class và interface
            //bên Abstract class thì ta còn có đặc điểm của Cha cho để xài
            //anonymous của Interface, đua thì đua đi, hỏi han làm chi, ko có info
            @Override
            public void showHowToDeath() {
                System.out.printf("|%-20s|%-15s|2015|%5.1f|\n", "MERMAID-RACER", "MNN CTT" ,runToDeath());
            }
        };  //VIP
        
        Dog d1 = new Dog("NGÁO ĐA", 2021, 50.0);
        //chấm full hàm của Con, đủ Code hàm Cha, CLB
        
        Pet d2 = new Dog("VÀNG ƠI", 1950, 10.0);
        //chấm full hàm Cha, Khai Cha, chạy ko sợ vì đa hình Con qua mặt
        //tổ lái con trỏ được, new Dog mà sợ gì
        //tao là "danh nghĩa Cha" thì chỉ xổ Cha hoy, học rồi
        //mày biết Bố tao là ai ko??, hù theo kiểu Bố

        DeathRacer d3 = new Dog("NANH TRẮNG", 1901, 20.0);
        //ngộ nhỡ chấm thì sao???
        //chấm chỉ xổ full CLB, 2 hàm runToDead() showHowToDead()
        //tao là Đua Thủ chỉ quan tâm đua thoi
        //chạy éo sợ vì Con qua mặt, có đủ hàm @Override đã làm rồi, đa hình tiếp
        //ép con trỏ được luôn, new Dog mà sợ gì
        
        Motor m1 = new Motor("EXCITER", "150.cm3", "58F8-22204");
        DeathRacer m2 = new Motor("WINNER", "150.cm3", "56F6-67889");
        
        //mnn em vẫn là một Racer, có hành động đua gấp 3 lần giới hạn
        //vật lí người cá,
        DeathRacer racer[] = {mnnCTT, d1, (Dog)d2, d3, m1, m2};
//        DeathRacer racer[] = new DeathRacer[5];   //có 5 đua thủ chuẩn bị
//        racer[0] = new Dog{,,,};
//        racer[1] = new Motor{,,,};
//        toàn bộ là DeathRacer, đa hình là đa hình trên runToDead() showHowToDead()
//        Con tự lo, Con Motor chạy theo kiểu Motor, Con Dog chạy theo kiểu Dog

        System.out.println("The racing records");
        for (DeathRacer x : racer) {
            x.showHowToDeath();
        }

    }
    
    public static void playAnonymous() {
        //List list = new ArrayList();
        //abstract, interface đó, 20 hàm ko có code
        List list = new List() {
            @Override
            public int size() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean isEmpty() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean contains(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Iterator iterator() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object[] toArray() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object[] toArray(Object[] a) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean add(Object e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean remove(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean containsAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean addAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean addAll(int index, Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean removeAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean retainAll(Collection c) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void clear() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object get(int index) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object set(int index, Object element) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void add(int index, Object element) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public Object remove(int index) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public int indexOf(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public int lastIndexOf(Object o) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public ListIterator listIterator() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public ListIterator listIterator(int index) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public List subList(int fromIndex, int toIndex) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
    }
    
}
