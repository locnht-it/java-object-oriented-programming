package data;

public class Dog {
    public String name;   // _____
    private int yob;       // _____
    private double weight; // _____
    
    //phễu dùng để rót/chế/đổ/fill vật liệu đưa vào,
    //lấp đầy các chi tiết chừa sẵn chỗ - Khuôn rỗng ở các chi tiết.
    public Dog(String iName, int iYob, double iWeight) {
        name = iName;
        yob = iYob;
        weight = iWeight;
    }
    
    public void bark() {
//        System.out.println("gogogogogo... my name is " + name);
//        System.out.println("gogogogogo... my yob is " + yob); 
        System.out.printf("|GOGO|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
    
    //sủa() là hành động của object Dog,
    //speak() là hành động của Person,
    //scanChannel() là hành động của Tivi, showMovie()
    
    public void updateWeight(double newWeight) {
        weight = newWeight;
    }
    
    //Giống câu chuyện hỏi ai đó info,
    //cho tao biết năm sinh của mày, mày.nămSinh
    //mày.getNamSinh() ~~ mày lấy năm sinh của mày đưa cho tao.
    public int getYob() {
        return yob;
    }
    
}
//KHUÔN LÀ HÌNH DÁNG CỦA 1 OBJECT SẼ XUẤT HIỆN TRONG TƯƠNG LAI
//CHỨA ĐỰNG ĐẶC TÍNH/ĐẶC ĐIỂM VÀ HÀNH VI (XỬ LÍ INFO - HÀM)
//Khuôn thì phải kín, code phải viết trong class

//Nhóm các bạn Dog chia sẻ chung nhiều đặc điểm: tên:____; cân nặng:_____;
//TEMPLATE, FORM, 
//Trong khuôn chứa các chi tiết mô tả Object
//Tượng THD có chiều cao, chiều cao đế...
//CMND/CCCD cũng là khuôn để chứa các info mô tả công dân
//CaSi là Khuôn chứa các info mô tả mọi object đi hát

//PHỄU LÀ 1 HÀM RẤT ĐẶC BIỆT, nó có xử lí: ép dòng dữ liệu/vật liệu nhận bên ngoài
//chảy vào đúng chỗ bên trong - xử lí - hàm quan điểm của lập trình.
//MỖI LẦN GỌI PHỄU, SỬ DỤNG PHỄU TƯƠNG ĐƯƠNG VIỆC ĐÚC 1 BỨC TƯỢNG MỚI, TẠO 1 OBJECT MỚI,
//GIỐNG ĐI MUA 1 EM DOG, ĐEM VỀ BÁN, NUÔI (CHO TÊN, GHI CÂN NẶNG, VACCIN...)

//Lưu ý hàm này tên phải trùng 100% tên class. Chữ hoa từng đầu từ - quy ước.
//Tên hàm phễu KO CÓ GIÁ TRỊ TRẢ VỀ, KO ĐC CÓ VOID LUÔN 
//void sẽ nhầm lẫn với các ứng xử/hành động của object.
//Hàm phễu sẽ nhận vật liệu vào, chờ khô ra được chính object thuộc nhóm Dog đang đề cập.
//Trả về ngay object sẽ dược tạo trong tương lai, đúng ko gian mình đang đứng, đã là object, 
//ko cần giá trị trả về, thậm chí ko đc dùng void,
//trong khi đó nhờ phễu ra chính object này.

//KĨ THUẬT ĐÓNG GÓI/GOM ĐẶC TÍNH, VÀ HÀNH VI XỬ LÍ ĐẶC TÍNH ĐÓ HÌNH THÀNH NÊN
//1 OBJECT RIÊNG BIỆT,
//KĨ THUẬT CÔ LẬP HÀM VÀ BIẾN VÀO 1 KHU VỰC (OBJECT, CLASS)
//TẠO THÀNH 1 THỰC THỂ HOẠT ĐỘNG RIÊNG BIỆT, CÓ ĐẶC ĐIỂM LUÔN,
//KĨ THUẬT GÓI MỌI THỨ LẠI THÀNH 1 ĐƠN VỊ (OBJECT) ĐƯỢC GỌI LÀ ENCAPSULATION

//ABSTRACTION/INHERITANCE/POLYMORPHISM