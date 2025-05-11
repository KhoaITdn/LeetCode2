package Algorithm;

public class TongSoNguyenTo {
    public static void main(String[] args) {
        int n = 10; // Hoặc nhập từ bàn phím
        int tong = 0;
        
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                tong += i;
            }
        }
        
        System.out.println("Tổng các số nguyên tố từ 1 đến " + n + " là: " + tong);
    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}

