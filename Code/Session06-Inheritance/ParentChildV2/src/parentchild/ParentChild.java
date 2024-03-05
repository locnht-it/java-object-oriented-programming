
package parentchild;

public class ParentChild {

    public static void main(String[] args) {
        playWithPointer();
    }
    
    public static void playWithPointer() {
        Parent p = new Parent("BIỆT THỰ", "1000 BTC");
        p.showProfile();
        //p. //xổ tất của Cha
        
        Child c1 = new Child("CĂN HỘ", "100 BTC", "NEW CAR");
        c1.showProfile();
        //c. xổ tất cả của Con (Cha cho + @Override + thêm khác nữa!!!)
        
        Parent c2 = new Child("NHÀ PHỐ", "100 ETH", "NEW MOTOR");
        c2.showProfile(); //gọi Cha nhưng chạy Con - @Override, để Con lái xe
        
        
    }
    
}
