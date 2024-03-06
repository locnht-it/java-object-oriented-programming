
package data;

//nhắc đến sinh viên, chỉ cần quan tâm mã số, tên, năm sinh, chuyên ngành, điểm trung bình
//chính là ABSTRACTION
//biểu diễn được đối tượng này như ngoài đời thực, ta cần Khuôn gồm đặc điểm và hành vi
//che giấu show ra khi cần thiết -> ENCAPSULATION, gói trọn trong 1 object
public class Student {
    private String id;
    private String name;
    private int yob;
    private double gpa;

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override   //ÔNG TỔ OBJECT BÀN SAU, ÔNG TỔ MUÔN LOÀI
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", yob=" + yob + ", gpa=" + gpa + '}';
    }
    
    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n", id, name, yob, gpa);
    }
           
}
