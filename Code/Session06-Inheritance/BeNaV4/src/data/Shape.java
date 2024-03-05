
package data;

//ta phát hiện được 1 mối quán hệ đặc biệt giữa nhiều Khuôn "khác biệt" nhưng lại tương đồng.
//Ví dụ: anh em trong nhà: trai giái, cao thấp, ngăm ngăm, ít ngăm ngăm
//tương đồng: Con của Ba Má
//ta đang nói về cái Khuôn Tổ mà sinh ra nhiều Khuôn khác
//Shape đại diện, Cha của đám Vuông, Tròn, CN, TG, ...
//đọc 1 chiều thôi heng
//MỘT CLASS CHỨA HÀM ABSTRACT TỨC LÀ HÀM KO CÓ CODE, TỨC LÀ Ý TƯỞNG CẦN CÓ
//THÌ BẢN THÂN CLASS CHƯA HOÀN HẢO, CHƯA HÀNH XỬ ĐƯỢC, GIỐNG NHƯ BẢN CONCEPT
//NÓ CHỈ MỚI LÀ Ý TƯỞNG MÀ THÔI, DO ĐÓ NẾU CLASS CHỨA HÀM ABSTRACT
//CLASS CŨNG PHẢI LÀ ABSTRACT
public abstract class Shape {
    //đặc tính của Cha, Hình Học là gì???
    protected String owner;
    protected String color;
    protected String borderColor; //màu đường bo cạnh, biên
    
    //protected double a, b, c, radius; //... bốc mùi
    //giả sử thằng Con Hình Tròn kế thừa Shape, thế thì nó có cạnh
    //lúc get() set() xổ ra 1 đống cạnh
    //phía khác HCN lần đầu tiên có bán kính
    //Cha có nhiều Con, Cha là nhân tử chung của các Con
    //Chung cho các Con kế thừa, phần dị biệt của mỗi đứa thì mỗi đứa giữ
    //TUYỆT ĐỐI KO ĐỂ DỊ BIỆT LÊN CHA, DỊ BIỆT CỦA TỪNG ĐỨA CON

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    
    
    //hành động tiếp theo, hàm của tui???
    //tính diện tích, chu vi???
    //hàm xử lí data!!! ai có nhiều info kẻ đó phải xử lí!!!
    //ở đây ko có data nhiều để tính toán, data thuộc về dị biệt
    //KO CẦN HÀM getS() getP() được ko???
    //CẤM BỎ HÀM TÍNH S(), P() VÌ LOGIC VỀ HÌNH HỌC, TƯ DUY VỀ HÌNH HỌC
    //HÌNH HỌC CÓ ĐƯỜNG NÉT, CÓ BỀ MẶT, RÕ RÀNG LÀ TÍNH ĐƯỢC S, P (TÍCH PHÂN CHO NHỮNG HÌNH PHỨC TẠP)
    //Hành động/hành vi của 1 Hình Học nói chung chắc chắn là có P, S, nó là
    //bao nhiêu, tính sao? từ từ, nhưng chắc chắn phải có khái niệm này
    //CHỐT HẠ: HÌNH HỌC LUÔN BÀN VỀ MÀU SẮC, CHU VI, S
    
//    public double getArea() {
//        //return ???; //ko tính được vì thiếu cạnh, kích thước
//                      //ko cho bỏ cái hàm đi vì nó là thứ đi kèm của Hình Học
//        return 0;     //sai nhen, ko có hình nào mà S = 0
//                      //new Shape() chấm getArea() là toang
//    }
//    
//    public double getPerimeter() {  //XIN LỖI, EM CHỈ LÀ KHÁI NIỆM, Ý TƯỞNG
//        return ???; //ko tính được, vì ko có cạnh
//    }
    
    public abstract double getArea(); //diện tích là khái niệm heng
    public abstract double getPerimeter(); //ý tưởng đo cạnh heng, từ từ tính
    //hình nào mà chả có
    
    public abstract void paint();
    
    //vì các thao tác vẽ hình là khác nhau, chưa kể in ra là khác nhau
    //CHUỖI IN RA KHÁC NHAU: RECT, SQR, TRG, R.TRG,...
    //diện tích tính toán khác nhau
    //CÃI/PHẢN BIỆN: VIẾT PAINT() HERE SHAPE VÀ EM IF (TRG) in Triangle
    //if(hình tròn) in DISK, if...
    //ĐƯỢC NHƯNG MẤT ĐI TÍNH LINH HOẠT DỄ MỞ RỘNG, THÍCH ỨNG VỚI MỌI LOẠI
    //HÌNH CÒN TIẾP TÚC ĐƯỢC SINH RA SAU NÀY...
    //NGUYÊN LÍ SOLID
    
}

//CHỐT HẠ: VIỆC TÍNH S P LÀ GẮN KÈM VỚI KHÁI NIỆM HÌNH HỌC, NÓI Ý TƯỞNG RẰNG
//SẼ ĐO ĐƯỢC ĐƯỜNG BO, ĐƯỜNG BIÊN, TÍNH ĐƯỢC ĐỘ RỘNG BỀ MẶT
//CHỈ NÓI ĐÓ LÀ Ý TƯỞNG, KHÁI NIỆM HÌNH HỌC THÌ CÓ S, P, CỤ THỂ RA SAO, THÌ TÙY HÌNH
//MÀ TÍNH

//S P của Hình Học chỉ là khái niệm nói về 1 con số đại diện cho đường biên, bề mặt
//tùy mỗi hình sẽ tính và đo khác nhau
//Hình Học cũng là 1 khái niệm chung chung, chung chung thì sao mà tính được
//cái chung chung vẫn ở đó, nhưng ko cụ thể, chúng tôi gọi là trừu tượng
//abstract
//cái gì tồn tại nhưng ko chạm nắm được, chỉ mang ý nghĩa khái niệm, nói về 1 ý tưởng,
//cái đó hữu nhưng mà vô, có thấy nhưng ko chạm được - ABSTRACT - TRỪU TƯỢNG
//MA QUỶ, MÔN HỌC KHÓ NẮM BẮT, TÌNH YÊU

//S P của Shape là trừu tượng, tồn tại để nói về thứ cần đo đạc, chưa cụ thể
//vì ngay cả Hình Học cũng là 1 khái niệm chưa cụ thể, biết hình gì đâu???

//Vẽ tao 1 cái hình, hỏi lại liền, hình gì???
//chúng là những khái niệm sẽ được nạp vào đầu mình để biết rằng sẽ có gì đó 
//diễn ra tiếp theo
//KHÁI NIỆM - ABSTRACT - TÍNH TRỪU TƯỢNG CHÍNH LÀ NÓI VỀ 1 Ý TƯỢNG
