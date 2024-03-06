package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import util.MyToys;

public class Cabinet {

    private List<Student> arr = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    public Cabinet() {
    }

    public void addAStudent() {
        String id, name;
        int yob;
        double gpa;

        System.out.println("Please input student profile #" + (arr.size() + 1));
        id = MyToys.inputAString("Please input id: ", "Please input string with length from 1 to 8", 8);
        name = MyToys.inputAString("Please input name: ", "Please input string with length from 1 to 20", 20);
        yob = MyToys.inputAnInteger("Please input yob: ", "Please input an integer");
        gpa = MyToys.inputADouble("Please input gpa: ", "Please input a real number");

        arr.add(new Student(id, name, yob, gpa));
        System.out.println("Add student successfully");

    }

    public void printStudentList() {
        if (arr.isEmpty()) {
            System.out.println("There is no student to print");
        }
        for (Student x : arr) {
            x.showProfile();
        }

    }

    public void updateAStudent(String id) {
        String name;
        int yob;
        double gpa;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id)) {
                name = MyToys.inputAString("Please input name: ", "Please input string with length from 1 to 20", 20);
                arr.get(i).setName(name);
                yob = MyToys.inputAnInteger("Please input yob: ", "Please input an integer");
                arr.get(i).setYob(yob);
                gpa = MyToys.inputADouble("Please input gpa: ", "Please input a real number");
                arr.get(i).setGpa(gpa);
                System.out.println("Update student with id: " + arr.get(i).getId() + " sucessfully");
                return;
            }

        }
        System.out.println("Not found student with id: " + id);
        
    }

    public void removeAStudent(String id) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id)) {               
                System.out.println("Remove student with id: " + arr.get(i).getId() + " successfully");
                arr.remove(i);
                return;
            }
        }
        System.out.println("Not found student with id: " + id);
    }

    public void printMenuList() {
        int choice;
        String id;
        do {
            System.out.println("Welcome to Student Management System");
            System.out.println("#1. Add a new student");
            System.out.println("#2. Print the student list");
            System.out.println("#3. Update a student");
            System.out.println("#4. Remove a student");
            System.out.println("#5. Exit");
            System.out.println("\t**********\t");
            choice = MyToys.inputAnInteger("Please choose (1...5): ", "Please recheck your choice (1...5)!!!");
            switch (choice) {
                case 1 -> addAStudent();
                case 2 -> printStudentList();
                case 3 -> {
                    id = MyToys.inputAString("Please input id to update: ", "Please input string with length from 1 to 8", 8);
                    updateAStudent(id);
                }
                case 4 -> {
                    id = MyToys.inputAString("Please input id to remove: ", "Please input string with length from 1 to 8", 8);
                    removeAStudent(id);
                }
                case 5 -> {
                    System.out.println("See you again <3");
                    return;
                }
            }
        } while (choice != 5);
    }

}
