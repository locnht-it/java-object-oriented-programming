package varnfun;

import java.util.Scanner; //~~ #include <stdio.h>

public class VarNFun {

    public static void main(String[] args) {
        //playWithVariables();
        //playWithIntegers();
        //playWithDoubles();
        //playWithCharacters();
        //playWithBooleans();
        //printIntegerList();
        //printIntegerList(200); //hard-code, code cứng cái giá trị.
        //inputFromKeyboard();
        //int x = getAnInteger();
        //System.out.println("x from keyboard: " + x);
        
        ////tui sẽ in từ 1..x nè
        //printIntegerList(x); //pass by value, tham trị, tao chỉ lấy value có trong x
                               //thảy xuống hàm gốc ở dưới, đưa 79 giao cho x, x thảy cho n trong hàm
                               //n trong hàm là 79
        testMathFunctions();
    }

    //static chỉ chơi với static  
    public static void playWithVariables() {
        //Biến là một vùng RAM được đặt tên/định danh/identifier  
        //chiếm 1 số byte nhất định tùy hình thái dữ liệu mà nó sẽ chứa, dùng để chứa 1 value nào đó.
        //Hình thái dữ liệu được gọi là data type: 2 hình thái: primitive, object.
        //int, long, float, double...

        //Biến là cách đặt tên cho 1 đại lượng, 1 giá trị.
        int yob = 2001;
        int a = 79, b;
        b = 39;

        System.out.println("yob: " + yob);

        int age = 2021 - yob;
        System.out.println("age: " + age + " years old.");
        System.out.println("age: " + (2021 - yob) + " years old.");
        System.out.printf("age: %d years old.\n", age);

    }

    //Mọi giá trị/value xuất hiện trong code, số nào đó, chữ nào đó, chuỗi nào đó
    //như 3.14 xuất hiện trong code, 0.1 xuất hiện trong code, "age" xuất hiện trong code,
    //được gọi là literal value.
    //Mọi literal value của số nguyên trong code/mọi số nguyên xuất hiện trong code được xem là 4 byte int.
    public static void playWithIntegers() {
        int n = 2_100_000_000;
        System.out.println("n: " + n);

        long money = 5_000_000_00L;
        System.out.println("money: " + money);

        int status = 0xFA;
        int phone = 070;

        System.out.println("status: " + status);
        System.out.println("phone: " + phone);
    }

    //Mặc định Java ưu tiên chơi với Double hơn là chơi với Float.
    //Mọi số thực trong code được xem là Double.
    public static void playWithDoubles() {
        double pi = 3.14; //8 bytes
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi); //%lf ko hỗ trợ, xài chung %f.

        float vat = 0.1F;
        System.out.printf("vat: %.2f\n", vat);
        System.out.println("vat: " + vat);
    }

    //Java char xài 2 byte, xài '' kí hiệu 1 kí tự đơn.
    public static void playWithCharacters() {
        char unit = '$';
        System.out.println("unit: " + unit);

        //Lưu tên, lưu 1 câu văn, 1 đoạn văn, chuỗi, gồm nhiều kí tự ghép lại
        //C: char name[] = "Ahihi Do ngok";
        //Xử lí trên chuỗi là phải xài hàm, tên mảng ko phải là primitive.
        //Java cung cấp 1 kiểu data type hoàn toàn mới, dùng để lưu trữ chuỗi 
        //String chữ hoa à nhen, nó dùng để lưu trữ, tên gọi cho những thứ phức tạp,
        //1 đống các kí tự ở với nhau, kiểu object (học sau, dính OOP).
        String name = "Hoàng Ngọc Trinh";
        System.out.println("name: " + name);

        System.out.println("1st letter in my name: " + name.charAt(0));
        System.out.println("My name as in a lowercase: " + name.toLowerCase());
    }

    //Một biểu thức so sánh, một mệnh đề, câu phát biểu sẽ rơi vào 2 trạng thái: đúng - sai.
    //C: đúng quy ước là 1 > 0, sai quy ước là 0 -> int
    //Java: đúng là true, sai là false -> boolean (1 bit, 1 byte)
    public static void playWithBooleans() {
        boolean marriedStatus = false;
        if (marriedStatus == true) {
            System.out.println("Đánh đồn có địch mới vui.");
        } else {
            System.out.println("Vườn hồng có lối nhưng chưa ai vào.");
            System.out.println("Luôn có hi vọng.");
        }
    }
    
    //In ra các số nguyên từ 1..100
    public static void printIntegerList() {
        System.out.println("The list of 100 first integers:");
        System.out.println("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23...");
        
        for (int i = 1; i <= 100; i++) 
            System.out.print(i + " ");         
    }
    
    //CÁC LOẠI HÀM KHÁC BẮT ĐẦU
    //tui mún in các số tự nhiên từ 1..n
    //HIỆN TƯỢNG TRONG 1 CLASS BẤT KÌ MÀ CÓ 2 HÀM TRÙNG TÊN NHAU,
    //NHƯNG KHÁC PHẦN THAM SỐ ĐẦU VÀO, MÀ KHÁC TRÊN DATA TYPE, KO QUAN TÂM TÊN BIẾN,
    //HIỆN TƯỢNG NÀY ĐƯỢC GỌI LÀ OVERLOAD/OVERLOADING, QUÁ TẢI HÀM.
    //1 đám giống nhau ở cùng 1 chỗ - quá tải -
    public static void printIntegerList(int n) {
        //chỉ có thằng ngáo mới scanf(&n) here, coi như đã có đầu vào trái cây.
        System.out.println("The list of " + n + " first integers:");
        for (int i = 1; i <= n; i++) 
            System.out.print(i + " ");
        
        System.out.print("\n");    
    }
    
    public static void inputFromKeyboard() {
        int yob; //C gán rác, on-off hiện nay của RAM.
        
        Scanner banPhimCuaTui = new Scanner(System.in);
        
        System.out.print("Please input your year of birth: ");
        yob = banPhimCuaTui.nextInt();  //float r = sqrt(4);
        
        System.out.println("yob: " + yob);
    }
    
    public static int getAnInteger() {
        int n;
        Scanner banPhimCuaTui = new Scanner(System.in);
        
        System.out.print("Please input a positive integer: ");
        n = banPhimCuaTui.nextInt();
        
        return n;
    }
    
    public static void testMathFunctions() {
        //sqrt(4)
        double result = Math.sqrt(25);
        System.out.println("result: " + result);
        Math.sqrt(100);
        System.out.println("result: " + Math.sqrt(100));
    }
}
