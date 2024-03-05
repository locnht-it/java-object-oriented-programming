
package data;


//1. IS A
//2. Đặc điểm: Con trùng hoàn toàn Cha, gửi Cha giữ hết khỏi làm gì
//             Con dị biệt, làm như bình thường

//3. Phễu, nhớ thỏa hiệp nếu cần, đổi thứ tự biến cho thuận chiều

//4. Hàm của Con: có quyền làm dị biệt như bình thường (drift con trỏ
//   Phiên bản kế thừa Level 1 - chưa xài abstract - thì Con chỉ làm phễu là xong
//   XÀI 100% Ở CHA, NGỨA TAY MUỐN QUA MẶT CỨ LÀM @Override, DỊ BIỆT THÍCH THÌ LÀM
public class Rectangle extends Shape{
    
    protected double a, b;    //width, length

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    //PHẦN DỊ BIỆT CON PHẢI LÀM
    //CÁC VUA HÙNG ĐÃ CÓ CÔNG...    BÁC CHÁU TA...  CHỖ NÀY ĐÂY
    //BA: TAO CHỈ NÓI VẬY, MÀY MUỐN LÀM SAO THÌ LÀM, ĐÂY, CON LÀM NÈ
    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public void paint() {
        System.out.printf("|RECTANGLE |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n", owner, color, borderColor, a, b, getArea());
    }


}
