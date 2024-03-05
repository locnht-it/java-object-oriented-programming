package data;

public class Rectangle {

    protected String owner;   //___
    protected String color;   //___
    protected double width;   //___
    private double length;  //___
    //private double area;    //___ = width * length
    //area được tính toán bởi các đặc tính khác, area -> derived attribute/field
    //                                          đặc điểm/đặc tính dẫn xuất
    //số lượng * đơn giá = tổng tiền
    //age = current year(2024) - yob
    //chơi với field dẫn xuất, coi chừng tính bất đồng bộ, inconsistency
    //dữ liệu ko nhất quán: đổ qua phễu width = 5; length = 10; area = 300
    //nếu không chơi đổ từ phễu, ghi area = w * l; lúc khai báo, tự tin chưa?
    //nhưng nếu tao setWidth(cạnh mới)
    //mà quên cập nhật lại S -> toang
    
    //bản chất của S: area là liên quan tính toán, ko có sẵn
    //tức là nó là hàm xử lí data, vậy hàm phải thuộc về object phù hợp
    //việc tính S() là hàm của HCN hoàn toàn hợp lí: ai có nhiều info gã đó phải xử lí
    
    //nếu ta xem diện tích là đặc điểm của miếng đất hoặc HCN, ko sai nhưng...

    public Rectangle(String owner, String color, double width, double length) { //area
        this.owner = owner;                                                 //kiểm tra tương thích
        this.color = color;
        this.width = width;
        this.length = length;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("|RECTANGLE |%-15s|%10s|%4.1f|%4.1f|", owner, color, width, length);
    }
    
    public void paint() {                              //90  * 90  = 8100.00
        System.out.printf("|RECTANGLE |%-15s|%10s|%4.1f|%4.1f|%7.2f|\n", owner, color, width, length, getArea());
    }
    
    //hàm soái ca loại 4, re-use ở các lệnh khác
    public double getArea() {
        return width * length;
    }
    
}
