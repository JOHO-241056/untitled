package reviews.reviews2;

public class Review17 {
    public static void main(String[] args) {
        int num = 10; //ここに代入される値は正の整数である。
        int sum = 0;
        int i = 2;
        while (i <= num) {
            if(i % 2 == 0) sum += i;
            i++;
        }
        System.out.println("結果: " + sum);
    }
}
