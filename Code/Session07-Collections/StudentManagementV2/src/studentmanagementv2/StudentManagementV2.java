
package studentmanagementv2;

import data.Cabinet;


public class StudentManagementV2 {

    
//    public static void main(String[] args) {
//        Cabinet se = new Cabinet();
//        Cabinet ia = new Cabinet();
//        //RÁP MENU
//        
//        System.out.println("ADD SE");
//        se.addAStudent(); //#1
//        
//        System.out.println("ADD IA");
//        ia.addAStudent(); //#1
//        ia.addAStudent(); //#2
//        
//        System.out.println("SE Students");
//        se.printStudentList();  //1 SV
//        
//        System.out.println("IA Students");
//        ia.printStudentList();  //2 SV
//    }
    
    public static void main(String[] args) {
        Cabinet se = new Cabinet();
        //           có cái Tủ, trong cái Tủ có cái Giỏ/Túi ~~~ ngăn trống
        se.addAStudent();
        se.addAStudent();
        
        se.printStudentList();
        
        se.updateAStudent(); //giả bộ tìm ko thấy SV
        se.updateAStudent(); //gõ trùng id cần cập nhật
        
        System.out.println("IN LẠI CẢ DANH SÁCH COI ĐÚNG KO?");
        se.printStudentList();
        
        //search tìm thấy
        //String id; //Scanner...  
        //se.searchAStudent("SE123456"); //hard-code hoặc nhập từ bàn phím ở main()
        se.searchAStudent();

        //search tìm ko thấy
        se.searchAStudent();
        
        
        
    }
    
}
