
package workshop01;

public class Workshop01 {

    public static void main(String[] args) {
        boolean result = isPrime(0);
        System.out.println("0? " + result);
        System.out.println("10? " + isPrime(10));
        System.out.println("11? " + isPrime(11));
        System.out.println("17? " + isPrime(17));
    
        printPrimeList();
    }
    
    //Kiểm tra 1 số có phải nguyên tố hay ko?
    //n là nguyên tố: 1,    2,  3,  4, ...  n - 1   n
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        //nếu CPU chạy đến lệnh phía dưới câu ghi chú này, sure n > 2.
        for (int i = 2; i < Math.sqrt(n); i++) 
            if (n % i == 0)
                return false;                
        
        return true;    //đi hết cả for mà ko chịu chia hết cho ai cả,
                        //sure mày là số nguyên tố.
    }
    
    //In các số ngto từ 1..1000 - reuse hàm checkNT()
    public static void printPrimeList() {
        System.out.println("The list of prime numbers from 1..1000: ");
        for (int i = 0; i < 1001; i++) 
            if (isPrime(i)) //viết tắt == true
                System.out.print(i + " ");
        System.out.println("");
    }
   
}
