
package stringclass;


public class StringClass {

    
    public static void main(String[] args) {
        playWithString();
    }
    
    public static void playWithString() {
        String s1 = new String("HELLO"); //~~~ new Integer(2003)
        String s2 = new String("HELLO");
        
        String s3 = "HELLO";    //khuyến khích viết cách này, tự nhiên
        String s4 = "HELLO";    //new String ngầm
        String s5 = "HeLLO";
        
        //hỏi:
        //s1 có bằng s2 ko
        System.out.println("s1 vs. s2? " + (s1 == s2)); //FALSE
        
        //s2 có bằng s3 ko
        System.out.println("s2 vs. s3? " + (s2 == s3)); //FALSE
    
        //s3 có bằng s4 ko
        System.out.println("s3 vs. s4? " + (s3 == s4)); //TRUE
        
        //CHUỖI NEW NGẦM LÀ POOL
        
        //s4 có bằng s5 ko
        System.out.println("s4 vs. s5? " + (s4 == s5)); //FALSE
        //POOL PHÂN BIỆT HOA THƯỜNG
        
        //KHÔNG SO SÁNH 2 CHUỖI QUA TOÁN TỬ ==
        //VÌ LÚC ĐÚNG LÚC SAI DO CHUNG POOL HAY KO
        //SO SÁNH 2 BIẾN OBJECT LÀ VÔ NGHĨA
        //BẮT BUỘC PHẢI VÀO VÙNG NEW MÀ SO SÁNH, CHẤM ĐỂ MÀ SO SÁNH
        //.compareTo()  .equals()
        
        //MỌI OBJECT MÌNH TẠO RA HAY NGƯỜI TA TẠO RA SẴN THÌ LUÔN NÊN CÓ 
        //2 HÀM ỨNG VỚI 2 LOẠI CÂU HỎI: TAO BẰNG MÀY KO?; VÀ TAO SO VỚI MÀY THẾ NÀO?
        //TAO.EQUALS(MÀY)   TAO.COMPARETO(MÀY)
        //CHẤM ĐỂ SO BÊN TRONG
        //HÀM Ở CHỖ CÓ DATA THÌ TIỆN XỬ LÍ
        
        System.out.println("s4 vs. s5 (core)? " + s4.equalsIgnoreCase(s5)); //TRUE
    }
    
}
