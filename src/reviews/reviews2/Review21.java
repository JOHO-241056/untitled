package reviews.reviews2;

public class Review21 {
    public static void main(String[] args) {
        int num = 10; //ここに代入される値は正の整数である。
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            if(i % 2 == 0) sum += i;
        }
        System.out.println("結果: " + sum);
    }
}
