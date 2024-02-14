package locnht.main;

import locnht.util.MyToys;

public class Stage {
    
    public static void main(String[] args) {
        
        System.out.println("PI: " + MyToys.PI);
        //MyToys.PI = 4.0;  cấm sửa
        System.out.println("PI again: " + MyToys.PI);
        
        int width = MyToys.getAnInteger("Please input the width: ");
        int length = MyToys.getAnInteger("Please input the length: ");
        
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
    }
}
