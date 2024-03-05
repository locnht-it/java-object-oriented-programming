
package data;

//Square kế thừa ai???
//Nếu kế thừa Shape? Mình phải làm những việc gì? extends Shape
//                                                khai báo dị biệt, edge
//                                                phễu, bản sắc, thỏa hiệp, đảo thứ tự biến
//                                                implement all abstract methods
//                                                viết code cho 3 hàm

//Nếu kế thừa HCN? Ta phải làm những việc gì? extends HCN
//                                            ko biến dị so với HCN ko cần làm đặc điểm
//                                            phễu thỏa hiệp, bản sắc, đảo thứ tự
//                                            ko làm gì thêm vì Cha HCN quá ổn
//                                            DONE MẸ NÓ RỒI
//                                            nếu muốn độ lại thì cứ làm
//Shape Ông Nội, Con HCN, Cháu Square - cây gia phả
public class Square extends Rectangle {

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    //đoạn này học rồi
    //ko cần khai báo gì thêm: Vuông là HCN có 2 cạnh == nhau
    //nếu muốn biến dị cứ làm, đã học bài ParentChild
    
    //muốn in riêng, ko muốn in chung với Cha Rectangle
    
    @Override
    public void paint() {
        System.out.printf("|SQUARE    |%-10s|%-10s|%-10s|%4.1f|%7.2f|\n", owner, color, borderColor, a, getArea()); //lấy all của Cha
    }
    
    public void sayHi() {
        System.out.println("Ko học bốc cứt ha!!!");
    }
}
