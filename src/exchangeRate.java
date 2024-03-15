import java.util.Scanner;
public class exchangeRate {
    public static void main(String[] args) {
        final double rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị USD muốn quy đổi:");
        double usd = scanner.nextDouble();
        double vnd = usd*rate;
        System.out.println(usd+ " USD = "+vnd+" VND");
    }
}
