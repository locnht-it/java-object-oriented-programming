
package studentprofile;

import java.util.Scanner;


public class StudentProfile {

    
    public static void main(String[] args) {
        inputProfile();
    }
    
    //Bài thí nghiệm về nhập xuất, làm đơn giản, ko OOP, ko Class
    public static void inputProfile() {
        //Nhập vào thông tin sinh viên, gồm tên, năm sinh, địa chỉ và in ra.
        String name, address;
        int yob;        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
        
        System.out.print("Input yob: ");
        //QUÁCH TĨNH SOLUTION
        yob = Integer.parseInt(sc.nextLine());
                      //hàm static, chấm mà xài, éo cần new, éo cần nhớ lại data đã xử lí
        
        //LỆNH TÀ CHIÊU ĐỂ XÓA BUFFER
//        yob = sc.nextInt();
//        //nextInt() để lại rác trong buffer, ít nhất là enter, cách dư enter
//        //xóa bộ đệm trước khi vào chuỗi fflush(stdin)
//        //Âu Dương Phong solution, lợi dụng lệnh nextLine() hốt sạch buffer kể cả enter.
//        sc.nextLine(); //ghi chơi vậy hoy, éo gán biến, mục tiêu hốt sạch.
        //END OF TÀ CHIÊU

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();
        
        System.out.println("Your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
        System.out.println("---end of profile---");
        
        
        
    }
    
}
