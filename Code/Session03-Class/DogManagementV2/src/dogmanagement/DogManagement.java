
package dogmanagement;

import data.Dog;
//Đi mượn cái Khuôn Dog ở ngăn data về đúc.
//~ #include<stdio.h> bên C

public class DogManagement {

    public static void main(String[] args) {
        int        yob          =         2021;
 
        Dog         chiHu           = new Dog("CHI HU HU", 2021, 0.5);
 
        //chiHu.bark();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);     
        //ngaoDa.bark();
        
        System.out.println("Show all of info by using toString() method.");
        String chDetails = chiHu.toString();
        System.out.println("CH Details: " + chDetails);
        System.out.println("ND Details: " + ngaoDa.toString());
        
        System.out.println("GỌI THẦM TÊN EM");
        System.out.println("ND Details: " + ngaoDa); //ĐIỀU GÌ DIỄN RA KHI TA SOUT(BIẾN OBJECT)?
        //Khi in biến con trỏ/biến object/biến tham chiếu reference,
        //thì thay vì in ra địa chỉ như bên C, Java ngầm đi tìm hàm toString() mà gọi,
        //hàm ý đi đến tọa độ đang trỏ in hết thông tin.
        
        //NẾU KO CÓ TOSTRING() MÀ NGOAN CỐ GỌI NÓ ĐỂ IN RA,
        //JAVA SẼ IN RA CON SỐ HEXA, MÃ BĂM VÙNG RAM, HASH NUMBER, GOM DATA THÀNH 1 CON SỐ
        //ĐẠI DIỆN VÙNG RAM
        //HASH NUMBER, THUẬT TOÁN MDS, SHA-1, SHA-256
        
        System.out.println("ND age: " + ngaoDa.getAge());
    }
    
}

//C
//int a = 100; //tốn 1 vùng RAM, 4 byte, ON-OFF transistor để có 100.
//             //4 byte bắt đầu từ byte thứ 6M, địa chỉ biến.
//printf("a = %d\n", a); //100 value.
//printf("a address: %u\n", &a);  //số nhà, tọa độ: 6M.
//
//int* p = &a; //p lưu số nhà a, p là danh bạ, lưu số điện thoại.
//printf("p has value of %u\n", p);   //6M
//printf("a = %d\n", *p); //100 đến nhà thằng đang trỏ, thằng 6M coi nó có gì
