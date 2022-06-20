package ss02_loop_in_java.bai_tap.thuc_hanh;

public class SoNguyenToNhoHon100 {
    public static boolean PrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("cac so nguyen to nho hon 100");
        for (int i = 0; i < 100; i++) {
            if (PrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
