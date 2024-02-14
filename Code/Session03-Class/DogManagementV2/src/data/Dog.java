package data;

import java.awt.Window;

public class Dog {
    public String name;   // _____
    private int yob;       // _____
    private double weight; // _____

    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    //Sủa, tức là show ra cảnh báo chính chủ của mình.
    public void bark() {
        System.out.println("|GoGo|Name      |Yob |Weight|");
        System.out.printf("|GoGo|%-10s|%4d|%6.1f|\n", name, yob, weight);
    }
    
    //Khi mua điện thoại mở hộp có sổ ghi thông số máy; mở máy vào Setting -> thông số máy.
    //Mọi object quanh ta tiềm ẩn 1 hành động cơ bản: show toàn bộ info chi tiết/mức cơ bản.
    //~~ hành động gặp chú CA, show CCCD, gặp cô ngân hàng, show CCCD,
    //Mặc định Java cung cấp 1 hàm tự sinh ra code sẵn show ra toàn bộ info mà đã được đổ, đang có.
    //Hành động này được gọi là hàm toString(), biến mọi info thành chuỗi.

    @Override   //chữ này ko nhầm với Overload/overloading - quá tải hàm.
    //Cả 2 keyword dính dáng đến tính 50 sắc thái, POLYMORPHISM, đa xạ đa hình.
    public String toString() {
        return String.format("|GoGo|%-10s|%4d|%6.1f|", name, yob, weight);
//        String tmpMsg = String.format("|GoGo|%-10s|%4d|%6.1f|", name, yob, weight);
//        return tmpMsg;
        //return "Ahihi";
        //return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
    }
    
    //toString() là 1 hàm rất rất đặc biệt.
    
    public int getAge() {
        return 2021 - yob;
    } //viết hard-code, mỗi năm cập nhật code 1 lần.
      //ngon: lấy giờ Windows - yob;
    
    
}