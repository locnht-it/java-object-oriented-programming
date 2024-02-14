
package studentmanagement;

import data.Student;
import java.util.Scanner;

public class StudentManagement {

    
    public static void main(String[] args) {
        saveAStudent();
        //inputAStudent();
    }
    
    //SINGLETON pattern
    
    //hard-code như mọi khi, đổ sẵn value.
    public static void saveAStudent() {
        
        Student s1 = new Student("SE686868", "LỘC PHÁT", 1998, 6.8);
        Student s2 = new Student("SE682204", "BẤT TỬ", 2004, 0.4);
        
        s1.showProfile();
        s2.showProfile();
        
        System.out.println("Check the public/private.");
        //Xem chấm khi có public private
        String s1Name = s1.name;
        System.out.println("s1 name: " + s1Name); //LỘC PHÁT
        System.out.println("s1 name: " + s1.getName());
        System.out.println("s1 name: " + s1.name);
        //Khi sờ trực tiếp đặc điểm, tức là ta chạm trực tiếp biến, chạm biến - get() set()
        
//        s1.name = "KHÔNG HỌC BÀI";
//        s1.setName("CÀY RANK KO CÀY CODE");
//        System.out.println("After ko học bài");
        s2.name ="ĐỔI NGÀNH CŨNG LÀ LỰA CHỌN";
        
        s1.showProfile();
        s2.showProfile();
        
        //static là vùng nhớ dùng chung cho các object cùng loại,
        //ai cũng nghĩ là của mình, nhưng thực tế là chung
        //nếu có 1 ai tác động, thì tất cả bị ảnh hưởng.
        System.out.println("s1 yob: " + s1.yob);
        System.out.println("s2 yob: " + s2.yob);
        
        System.out.println("s1 name: " + s1.name); //ĐN
        System.out.println("s2 name: " + s2.name); //ĐN
        //Vùng static xài chung cho mọi object, cho nên giá trị của vùng này
        //chung cho tất cả các sinh viên hiện tại và tương lai, WC tập thể chung cho cả dãy lầu,
        //ko nên tư hữu cái đồ xài chung
        //s1.name = s2.name = s3.name ~~~~~ Student.name
        //sờ static đừng sờ qua kiểu tư hữu mà nên sờ theo kiểu Class chấm static
        System.out.println("Student name: " + Student.name); //ĐN
        //Có 2 loại dấu chấm: chấm qua biến object hàm ý non-static, đồ thuộc từng object
        //tui.namSinh khác bạn.namSinh khác banAy.namSinh
        //Chấm thứ 2: đồ static xài chung, new cả tỉ lần cũng chỉ 1 vùng RAM, chung cả đám
        //vậy chấm qua cả đám hợp lí hơn.
        
        s1.sayHi();
        Student.sayHi();
    }
    
    //Em muốn nhập từ bàn phím hồ sơ của ai đó, y chang như đăng kí member vào 1 website.
    //Cần có bàn phím để nhập, Scanner tiệm photo, Camera, Web-cam, Bàn phím cơ, Touchpad...
    //      -> thuộc Nhóm đưa data vào máy tính/Class Scanner
    //Cần có biến trung gian để hứng value từ bàn phím vào,
    //có vật liệu rồi, gọi phễu mà new của Student.
    //gáy
    public static void inputAStudent() {
        String id, name;
        int yob;
        double gpa; //local variable, STACK SEGMENT
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input id: ");
        id = sc.nextLine();
        
        System.out.print("Input name: ");
        name = sc.nextLine();
        
        System.out.print("Input yob: "); //Java trôi lệnh y chang, lệnh nhập chuỗi sau số.
        yob = sc.nextInt();
        
        System.out.print("Input gpa: ");
        gpa = sc.nextDouble();
        
        //Đủ data vật liệu rồi, đúc sinh viên, y chang nhấn nút Register sau khi đã fill vào form.
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
       
    }
}
