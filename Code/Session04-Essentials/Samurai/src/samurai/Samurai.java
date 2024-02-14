package samurai;

import java.util.Scanner;

public class Samurai {

    public static void main(String[] args) {
        //inputProfile();
        inputProfileXinSo();
    }

    public static void inputProfile() {
        //Nhập vào thông tin sinh viên, gồm tên, năm sinh, địa chỉ và in ra.
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        try {
            //lệnh văng miểng nằm ở đây
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());

        } catch (Exception e) {
            //e chính là tin nhắn màu đỏ JVM gửi mình lưu ý rằng có cà chớn, ngoại lệ, bất thường nhen
            //xử lí đi, tao ko giết app đâu.
            //Ngầm phía sau JVM Exception e = new Exception("câu chửi bới, lưu ý gì đó");
            //thường ta quan tâm có cà chớn, lúc này ta tự xử lí, JVM ko giết, ko can thiệp.

            //2 cách: default, bắt vòng lên nhập lại
            yob = 69;
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
        System.out.println("---end of profile---");

    }

    //đẹp trai
    public static void inputProfileXinSo() {
        //Nhập vào thông tin sinh viên, gồm tên, năm sinh, địa chỉ và in ra.
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (true) { //lặp vô tận
            try {
                //lệnh văng miểng nằm ở đây           
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break; //đúng thì thoát lặp
            } catch (Exception e) { //sai thì văng miếng ăn chửi, chửi xong, nhập lại
                //yob = 69;
                System.out.println("Do you know how to input a positive integer?");
            }
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
        System.out.println("---end of profile---");

    }
}

//MẶC ĐỊNH DATA ĐƯA VÀO CÀ CHỚN, JAVA (JVM - MÁY ẢO JAVA) SẼ GIẾT APP NGAY TẠI CHỖ CÀ CHỚN
//KHI JAVA PHÁT HIỆN CÓ CÀ CHỚN, NÓ SẼ GỬI APP 1 TIN NHẮN/1 OBJECT THÔNG BÁO RẰNG DATA VỚ VẨN,
//DATA BỊ EXCEPTION, DATA DỊ QUÁ, BẤT THƯỜNG QUÁ, NGOẠI LỆ, SỐ LÀ AHIHI KÌ QUÁ
//GỬI TIN NHẮN CHO APP XONG (MÀU ĐỎ EXCEPTION), GIẾT APP LUÔN
//NÓI LẠI: NẾU NGƯỜI DÙNG LỠ TAY, KO LỠ TAY, CŨNG NÊN CHO CƠ HỘI SỬA SAI
//SỬA SAI THÌ TỨC LÀ ĐỪNG GIẾT APP KHI CÓ CÀ CHỚN EXCEPTION
//CHỖ NÀO CÓ THỂ CÓ CÀ CHỚN??? CHỖ ĐÓ CÓ NGUY CƠ APP BỊ GIẾT
//JAVA ĐỪNG GIẾT APP, ĐỂ EM TỰ LO, DEV TỰ LO, CODE SẼ CẦN ĐIỀU CHỈNH NẾU CÓ CÀ CHỚN
//THÌ BẮT USẺ LÀM LẠI CÁI SAI THÀNH ĐÚNG
//XIN APP ĐỪNG BỊ GIẾT ĐỂ EM TỰ XỬ - SAMURAI
//KO VIẾT TỰ DO NẾU KO BỊ GIẾT
//BÁO JVM ĐOẠN CODE NÀY CÓ NGUY CƠ CÀ CHỚN, NẾU CÓ CÀ CHỚN, BÁO APP BIẾT
//KO GIẾT APP, ĐỂ APP XỬ LÍ NỐT
//NHỐT CÂU LỆNH CÀ CHỚN VÀO TRONG 1 HỘP CÁT/SANDBOX ĐỂ XỬ LÍ BOM MÌN NỔ TRONG ĐÂY CHO AN TOÀN
//nhốt trong cụm try - catch
//try { lệnh văng miếng nằm here }
//catch (JVM báo hiệu cho biết có cà chớn này, sửa sai đi)
