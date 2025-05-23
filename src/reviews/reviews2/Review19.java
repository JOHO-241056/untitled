package reviews.reviews2;

public class Review19 {
    public static void main(String[] args) {
        int num = 10; //ここに代入される値は正の整数である。
        int i = 2;
        int factorial = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("結果: " + factorial);
    }
}
