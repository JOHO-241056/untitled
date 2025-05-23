package reviews.reviews2;

public class Review23 {
    public static void main(String[] args) {
        int num = 10; //ここに代入される値は正の整数である。
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        System.out.println("結果: " + factorial);
    }
}
