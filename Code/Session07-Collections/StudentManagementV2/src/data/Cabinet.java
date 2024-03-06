package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cabinet {

    //màu sắc, giá tiền, nhãn tủ là đặc trưng, mình ko care
    //mua Tủ đựng nhiều đồ
    private List<Student> arr = new ArrayList(); //= new ArrayList() là đủ, add() vào tính sau

    private Scanner sc = new Scanner(System.in);

    //Phễu này được gọi là phễu rỗng/empty constructor/default constructor
    public Cabinet() {
    }

    //TỦ có hành động cơ bản: mở khóa kéo ra, bỏ đồ vô, loại bỏ, thêm, chỉnh sửa, tìm kiếm, sắp xếp
    public void addAStudent() {
        String id, name;
        int yob;
        double gpa;

        System.out.println("Input student profile #" + (arr.size() + 1));

        while (true) {
            System.out.print("Input id: ");
            id = sc.nextLine().trim().toUpperCase();
            //trả về chuỗi cắt khoảng trắng dư đầu đuôi
            //đổi chuỗi vừa cắt qua HOA
            //Vừa gõ id xong, check liền coi có trùng id ko, có, chửi, bắt nhập lại
            //còn sai còn ăn chửi, còn nhập lại
            Student xxx = searchAStudent(id);
            if (xxx == null) {
                break; //ko thấy có SinhVien nào trùng với id vừa gõ này, ko trùng
            } //break để nhập tiếp info còn lại
            //ko trùng id chính là khái niệm primary key bên database
            else {
                System.out.println("Duplicated ID. Try with another one.");
            }
        }
        System.out.print("Input name: ");
        name = sc.nextLine().trim().toUpperCase();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        arr.add(new Student(id, name, yob, gpa));
        System.out.println("Add a new student successfully");

    }

    public void printStudentList() {
        if (arr.isEmpty()) {
            System.out.println("There is no student to print");
            return;
        }
        System.out.println("There is/are " + arr.size() + " student(s)");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    //CRUD: Create/Retrieve(Read)/Update/Delete
    //viết hàm search là hàm quan trọng, vì nó không chỉ là search cho nhu cầu 
    //tìm hồ sơ, mà còn giúp cho các hành động khác: xóa, sửa hồ sơ
    //giúp việc tạo mới hoàn hảo
    //tìm xem mã số SinhVien vừa tạo mới có trùng không
    //tương đương việc đăng kí 1 member, gõ acc báo trùng rồi, còn trùng còn chửi ko cho đi tiếp
    //ta sẽ viết hàm search giải quyết được khá nhiều chuyện thì tốt hơn
    public Student searchAStudent(String id) {
        if (arr.isEmpty()) {
            return null;
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id)) {
                return arr.get(i);
            }
        }

        return null;
    }

    //          overloading xảy ra
    //hàm này bao hàm trên lại - dùng lại, cung cấp id. Nhìn ra ngoài tủ
    //thấy có 2 cách search, bạn đưa id trực tiếp, hoặc bạn nhập id
    public void searchAStudent() {
        String id;
        System.out.print("Input a student id that you want to search: ");
        id = sc.nextLine().trim();
        Student xxx = searchAStudent(id);
        if (xxx == null) {
            System.out.println("NOT FOUND!!!");
            return;
        }

        System.out.println("STUDENT FOUND! Here she/he is");
        xxx.showProfile();

    }

    public void updateAStudent() {
        String id;
        double newGPA; //có ai đó làm price kiểu int -> ăn đòn
        System.out.print("Input the student id that you want to update profile: ");
        id = sc.nextLine().trim();
        Student xxx = searchAStudent(id);
        //có tham chiếu trỏ đến vùng new Student() có id cần tìm
        if (xxx == null) {
            System.out.println("STUDENT NOT FOUND! Nothing to update");
        } else {
            System.out.println("Before updating");
            xxx.showProfile();

            //mời nhập điểm số mới/giá tiền mới
            System.out.print("Input new gpa: ");
            newGPA = Double.parseDouble(sc.nextLine());
            xxx.setGpa(newGPA);

            System.out.println("Before updating");
            xxx.showProfile();
        }

    }

    public void updateAStudent(String id, double newGPA) {
        Student xxx = searchAStudent(id);

        if (xxx == null) 
            System.out.println("STUDENT NOT FOUND! Nothing to update");
        
        else {
            System.out.println("Before updating");
            xxx.showProfile();

            xxx.setGpa(newGPA);

            System.out.println("Before updating");
            xxx.showProfile();
        }
    }
    
    public void updateAStudent(Student x, double newGPA) {
        //đã đưa tham chiếu đến SinhVien x thì set luôn
        if (x != null)
            x.setGpa(newGPA);
    }
    
    
}
