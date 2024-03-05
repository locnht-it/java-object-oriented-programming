
package parentchild;

public class ParentChild {

    public static void main(String[] args) {
        playWithPointer();
    }
    
    public static void playWithPointer() {
        Parent p = new Parent("BIỆT THỰ", "1000 BTC");
        p.showProfile();
        //p. //xổ tất của Cha
        
        Child c1 = new Child("CĂN HỘ", "100 BTC");
        c1.showProfile();
        //c. xổ tất cả của Con (Cha cho + @Override + thêm khác nữa!!!)
        c1.sayHello();
        
        Parent c2 = new Child("NHÀ PHỐ", "100 ETH");
        c2.showProfile(); //gọi Cha nhưng chạy Con - @Override, để Con lái xe
        //c2.sayHello();  //ko xổ ra của riêng Con dù đã new Con và có sẵn trong RAM
        //mình đang cư xử như Ba, Cha, dùng danh nghĩa Cha
        //mày biết Ba tao là ai ko, hù theo kiểu của Ba, tuân theo hành động của Ba
        //Khai báo kiểu Cha, chấm theo Cha
        //HV đang cư xử như HCN
        //Con đang dùng danh nghĩa Ba, thì phải cư xử như Ba
        //tổ lái con trỏ xuống đáy vùng new Con sẽ lấy được hàm sayHello()
        
        //Child x = cần trỏ vùng new Con
        Child x = (Child)c2;    //mày hãy ráng xuống vùng new Child, lấy cho tao
                                //cái tọa độ new Child, tao giữ lại trong x
        //        c2 trỏ vùng new Cha, super
        x.sayHello();
        //x cùng trỏ vùng new NHÀ PHỐ
        
        //Cách 2, nương theo cách 1, nhưng ko tốn 1 con trỏ Child
        //(Child)c2. //ko xổ vì dấu chấm có độ ưu tiên cao, ăn theo data type
        ((Child)c2).sayHello(); //dấu ngoặc thay đổi độ ưu tiên, ép xong đi đã
        //rồi hãy chấm, kéo sợi thun xong chưa, xong rồi đo.
        
    }
    
}
