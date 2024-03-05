package main;

import data.Shelf;
import data.Student;
import java.util.Scanner;

public class Stage {

    public static void main(String[] args) {
        //chơi menu: 1. Add...; 2. Print...; 3. Search...; 4... 6. Quit;
        //chờ người chơi chọn món 1 2 3 4 5 6 Ahihi - try-catch-do-while MyToys

        //if chọn 1 thì tu.add() 2 thì tu.print() 3 thì ...
        //chưa xỉn chưa về, chưa muốn dừng cuộc chơi, éo cho thoát - do-while/while
        int choice; //lưu option lựa chọn menu gõ từ bàn phím
        Shelf tuSE = new Shelf("PINK", "SE MAJOR");
        do {
            printMenu();
            choice = util.Util.getAnInteger("Input your choice (1..6): ");
            
            switch(choice) {
                case 1:
                    tuSE.inputAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.searchAStudent();
                    break;
                case 4:
                    tuSE.updateAStudent();
                    break;
                case 5:
                    tuSE.removeAStudent();
                    break;
                case 6:
                    System.out.println("Bye bye, see you next time");
                    break;
                default:
                    System.out.println("Please choose 1 to 6, please!!!");
                    break;
            }
        } while (choice != 6); //còn chưa chọn 6 còn lặp lại.
                               //còn đúng thì còn do-làm
                               //đúng là chưa == 6 thì cứ làm đi
                               //chưa bằng 6 đúng ko? đúng hả, làm tiếp đi mày

    }

    public static void testTu() {
        //inputStudentList();

        //NGON MENU VÒNG LẶP CHỌN 1 THÊM HỒ SƠ, 2 IN DANH SÁCH
        Shelf tuSE = new Shelf("PINK", "SE MAJOR");

        Shelf tuGD = new Shelf("RAINBOW", "GD MAJOR");  //2 CÁI TỦ ĐỘC LẬP
        //2 TỦ 2 GÓC PHÒNG

        tuSE.inputAStudent();   //1/300
        tuSE.inputAStudent();   //2/300

        tuGD.inputAStudent();   //1/300

        tuSE.printStudentList();    //2 bạn
        tuGD.printStudentList();    //1 bạn
    }

    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        String id, name;
        int yob, count;
        double gpa;

        //System.out.print("How many students do you want to input? ");
        //count = Integer.parseInt(sc.nextLine()); //sc.nextInt(); //MyToys.getAnInteger(????)
        count = util.Util.getAnInteger("How many students do you want to input? ");

        Student arr[] = new Student[count]; //count = 5

        //for nhập 5 hồ sơ
        for (int i = 0; i < count; i++) {
            System.out.println("Input student #" + (i + 1) + "/" + count);
            System.out.print("Input id: ");
            id = sc.nextLine();

            System.out.print("Input name: ");
            name = sc.nextLine();

            yob = util.Util.getAnInteger("Input yob: ");

            gpa = util.Util.getADouble("Input gpa: ");

            arr[i] = new Student(id, name, yob, gpa);
        }

        System.out.println("\nThe student list");
        for (Student x : arr) {
            x.showProfile();
        }

        //sort dăm ba đồ yêu
    }

    public static void printMenu() {
        System.out.println("Welcome to FAP - FPT Academic Portal");
        System.out.println("Choose the following functions to play with");
        System.out.println("1. Add a student profile");
        System.out.println("2. Print student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student");  //REMOVE HẾT SỨC CẨN THẬN
        //XÓA KO HẲN LÀ XÓA, MÀ XÓA LÀ ẨN
        //CẤT CHỖ KHÁC DÀNH CHO NHU CẦU THỐNG KÊ
        //ĐÁNH DẤU (MARKER/FLAG/STATUS) ÉO XÓA THẬT
        System.out.println("6. Quit");
    }

}
