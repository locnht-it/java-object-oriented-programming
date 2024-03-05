
package data;

import java.util.Scanner;

public class Shelf {
    //đặc điểm của 1 cái tủ bất kì là gì: màu sơn:__; giá tiền:__; nhà sản xuất:__;
    
    //số ngăn/không gian chứa đồ:__các món đồ nhét vào, món đồ là object
    //chứa nhiều đồ, nhiều object rõ ràng đến thời điểm này là ta cần mảng object
    //tủ sẽ chứa 1 list/mảng/danh sách các đối tượng
    //ứng dụng của mảng, góp phần tạo nên object khác
    //OOP: tìm các object, chúng phối hợp, trộn nhau
    private String color;
    private String label; //tủ chén, tủ hồ sơ SE, IA, GD, JP
    
    //biến thì được đưa value, lúc nào???
    //                          qua phễu (default trong suy nghĩ)
    //                          qua trực tiếp lúc khai báo
    
    //chứa cái gì, chừa không gian để chứa đồ, thực ra đồ chưa có
    //             chưa có hồ sơ sinh viên
    private Student[] ds = new Student[300];    //ds[0] = new Student();
            //ds là biến má mì - cần value
            //             new sẵn 300 tương đương mua tủ 300 slot
            //             đặt hàng kích thước, dung tích size 500, 1000, 2000
    
    private int count = 0;  //mới mua tủ về, số hồ sơ = 0
                            //nhét thêm 1 hồ sơ thì count++
                            //chơi với mảng chỉ for đến count
    //lưu trữ cách để đồ vào mảng, vào giỏ, để từ trái sang phải, trên xuống dưới, 
    //tương đương sắp xếp đồ vào tủ/giỏ theo thứ tự gọn gàng.
    //FOR ĐẾN COUNT
    
    private Scanner sc = new Scanner(System.in);
    
    //tui có không gian chứa info, tui sẽ giải quyết chuyện nhập xuất
    public Shelf(String color, String label) { //int size //kích thức tủ
        this.color = color;
        this.label = label;
        //ds = new Student[size]; //linh hoạt trong kích thước tủ
    }
    
    //DATA + HÀM XỬ LÍ CỦA TỦ NHÂN CÁCH HÓA, TOÀN BỘ SẼ LÀ NON-STATIC
    //NẾU KO CÁC TRƯỜNG ĐẠI HỌC, BỘ MÔN XÀI CHUNG DSSV LÀ TOANG
    //ĐỒ ĐẠC, HÀNH XỬ PHẢI THUỘC VỀ OBJECT
    public void inputAStudent() {
        String id, name;
        int yob;
        double gpa;
        System.out.println("Input student #" + (count + 1) + "/" + ds.length);
        System.out.print("Input id: ");
        id = sc.nextLine();                 //TODO: kiểm tra id trùng
                                            //MyToys.get...("SEXXXXXX");
                                            //Regular Expression kiểm tra chuỗi nhập đúng định dạng hay ko
        System.out.print("Input name: ");
        name = sc.nextLine();
        
        yob = util.Util.getAnInteger("Input yob: ");
        gpa = util.Util.getADouble("Input gpa: ");
        ds[count] = new Student(id, name, yob, gpa);
        count++;    //SUPER PRO VVIP
        System.out.println("Add student successfully");
    }
    
    public void printStudentList() {
        System.out.println("The student list");
        for (int i = 0; i < count; i++) {
            ds[i].showProfile();    //for hết là toang vì mẹ kiếp, mãng object default các phần tử là null
                                    //hạ cánh nơi anh, trỏ đáy RAM, mà ép đáy RAM có code ShowProfile() quá đáng ko?
                                    //vùng new Student(...) thì mới có code chạy chứ!
        }
    }
    
    public void searchAStudent() {
        //search là quét/duyệt/đi từ trái sang phải lôi cổ từng sv[i] ra
        //hỏi hắn mã số mày là mấy???
        //so sánh với mã số muốn tìm??? == mã số of sv[i] sv[i].getMaSo()
        //báo tìm thấy, tìm hết ko thấy == báo rằng not found
        //THUẬT TOÁN TRÂU BÒ/VÉT CẠN/TÁT CẠN
        System.out.print("Input the id that you want to search: ");
        String id = sc.nextLine();  //hoa thường à nhen
        for (int i = 0; i < count; i++) { //đi đến chỗ đổ cuối cùng thôi heng
            if(ds[i].getId().equalsIgnoreCase(id)) {
                //tìm thấy tại vị trí [i] 
                System.out.println("Student found!!! Here she/he is");
                ds[i].showProfile(); //in kết quả liền
                return;
            } //tìm thấy thì dừng hàm luôn, ko for gì nữa    
        }
        
        //sống sót here, sure, ko có thấy id cần tìm, nếu thấy dừng sớm ở trên
        //đi hết for mà ko thoát được, báo ko thấy
        System.out.println("Student not found!!!");
        //dùng biến flag phất cờ nếu thấy và ko, if () in ra câu gì?
        
    }
    
    public void updateAStudent() {
        String name;
        int yob;
        double gpa;
        System.out.print("Input the id that you want to update profile: ");
        String id = sc.nextLine();
        for (int i = 0; i < count; i++) 
            if(ds[i].getId().equalsIgnoreCase(id)) {
                System.out.println("Student " + ds[i].getId() + " found!!! You can update profile: ");
                System.out.print("Input name: ");
                name = sc.nextLine();
                ds[i].setName(name);

                yob = util.Util.getAnInteger("Input yob: ");
                ds[i].setYob(yob);
                
                gpa = util.Util.getADouble("Input gpa: ");
                ds[i].setGpa(gpa);
                
                System.out.println("Update student " + ds[i].getId() + " successfully");
                return;
            }
        
        System.out.println("Student not found!!!");
    }
    
    public void removeAStudent() {
        System.out.print("Input the id that you want to remove: ");
        String id = sc.nextLine();
        for (int i = 0; i < count; i++) 
           if (ds[i].getId().equalsIgnoreCase(id)) {
               System.out.println("Student " + ds[i].getId() + " found!!! Preparing to remove ");
               for (int j = i; j < count; j++) {
                   ds[j] = ds[(j + 1)];
               }
               System.out.println("Remove successfully");
               count--;
               return;
           } 
        
         System.out.println("Student not found!!!");
        
    }
            
}               
