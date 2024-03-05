
package data;

public class RightTriangle extends Triangle {

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    } //new Con chính là new Cha, cắt TGV chính là cắt 1 TG
      //new Con chính là new 1 phiên bản Cha
    
    //con muốn qua mặt khi hắn có hàm trùng tên 100% với Cha
    @Override
    public void paint() {
        System.out.printf("|R.TRIANGLE|%-15s|%10s|%4.1f|%4.1f| -- |%7.2f|\n", owner, color, a, b, getArea());
    }
    
}

//LIÊN QUAN ĐẾN KẾ THỪA, CÓ 2 ĐIỀU:
//DI TRUYỀN: CHA CÓ GÌ CON XÀI NẤY, CHA THÊM, CON CÓ THÊM, CHA BỚT, CON BỊ BỚT.
//BIẾN DỊ: CON KHÁC CHA À NHEN, ĐIỀU GÌ XẢY RA? KĨ THUẬT DRIFT, RÊ BÁNH.
